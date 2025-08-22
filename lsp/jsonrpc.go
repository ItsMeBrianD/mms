package lsp

import (
	"bufio"
	"context"
	"encoding/json"
	"fmt"
	"io"
	"log"
	"strconv"
	"strings"
	"sync"
)

// JSONRPC version
const (
	JSONRPCVersion = "2.0"
)

// MessageType represents the type of JSON-RPC message
type MessageType int

const (
	RequestMessage MessageType = iota
	ResponseMessage
	NotificationMessage
)

// Message represents a JSON-RPC message
type Message struct {
	JSONRPC string          `json:"jsonrpc"`
	ID      interface{}     `json:"id,omitempty"`
	Method  string          `json:"method,omitempty"`
	Params  json.RawMessage `json:"params,omitempty"`
	Result  json.RawMessage `json:"result,omitempty"`
	Error   *ResponseError  `json:"error,omitempty"`
}

// ResponseError represents a JSON-RPC response error
type ResponseError struct {
	Code    int         `json:"code"`
	Message string      `json:"message"`
	Data    interface{} `json:"data,omitempty"`
}

// ErrorCode defines error codes for JSON-RPC responses
type ErrorCode int

const (
	// JsonRPC error codes
	ParseError     ErrorCode = -32700
	InvalidRequest ErrorCode = -32600
	MethodNotFound ErrorCode = -32601
	InvalidParams  ErrorCode = -32602
	InternalError  ErrorCode = -32603

	// LSP error codes
	RequestCancelled ErrorCode = -32800
	ContentModified  ErrorCode = -32801
)

// HandlerFunc defines the function signature for message handlers
type HandlerFunc func(context.Context, json.RawMessage) (interface{}, error)

// JsonRPCConnection manages the connection between client and server
type JsonRPCConnection struct {
	reader    *bufio.Reader
	writer    io.Writer
	handlers  map[string]HandlerFunc
	nextID    int64
	mutex     sync.Mutex
	callbacks map[string]func(json.RawMessage, *ResponseError)
}

// NewJsonRPCConnection creates a new JSON-RPC connection
func NewJsonRPCConnection(reader io.Reader, writer io.Writer) *JsonRPCConnection {
	return &JsonRPCConnection{
		reader:    bufio.NewReader(reader),
		writer:    writer,
		handlers:  make(map[string]HandlerFunc),
		callbacks: make(map[string]func(json.RawMessage, *ResponseError)),
	}
}

// RegisterHandler registers a handler for a specific method
func (c *JsonRPCConnection) RegisterHandler(method string, handler HandlerFunc) {
	c.handlers[method] = handler
}

// Run starts the JSON-RPC message processing loop
func (c *JsonRPCConnection) Run(ctx context.Context) error {
	for {
		select {
		case <-ctx.Done():
			return ctx.Err()
		default:
			if err := c.readAndProcessMessage(ctx); err != nil {
				if err == io.EOF {
					return nil // Clean shutdown
				}
				log.Printf("Error processing message: %v", err)
				return err
			}
		}
	}
}

// readAndProcessMessage reads a single message and processes it
func (c *JsonRPCConnection) readAndProcessMessage(ctx context.Context) error {
	// Read header
	header, err := c.readHeaders()
	if err != nil {
		return err
	}

	// Get content length
	contentLengthStr, ok := header["Content-Length"]
	if !ok {
		return fmt.Errorf("missing Content-Length header")
	}

	contentLength, err := strconv.Atoi(contentLengthStr)
	if err != nil {
		return fmt.Errorf("invalid Content-Length: %v", err)
	}

	// Read content
	content := make([]byte, contentLength)
	_, err = io.ReadFull(c.reader, content)
	if err != nil {
		return err
	}

	// Parse message
	var message Message
	if err := json.Unmarshal(content, &message); err != nil {
		return c.sendResponse(nil, nil, &ResponseError{
			Code:    int(ParseError),
			Message: fmt.Sprintf("Parse error: %v", err),
		})
	}

	// Process message
	if message.Method != "" {
		if message.ID != nil {
			// Request
			return c.handleRequest(ctx, message)
		} else {
			// Notification
			return c.handleNotification(ctx, message)
		}
	} else {
		// Response
		return c.handleResponse(message)
	}
}

// readHeaders reads the headers of a message
func (c *JsonRPCConnection) readHeaders() (map[string]string, error) {
	headers := make(map[string]string)
	for {
		line, err := c.reader.ReadString('\n')
		if err != nil {
			return nil, err
		}
		line = strings.TrimRight(line, "\r\n")
		if line == "" {
			break
		}
		parts := strings.SplitN(line, ":", 2)
		if len(parts) != 2 {
			continue
		}
		headers[strings.TrimSpace(parts[0])] = strings.TrimSpace(parts[1])
	}
	return headers, nil
}

// handleRequest processes a request message
func (c *JsonRPCConnection) handleRequest(ctx context.Context, message Message) error {
	handler, ok := c.handlers[message.Method]
	if !ok {
		return c.sendResponse(message.ID, nil, &ResponseError{
			Code:    int(MethodNotFound),
			Message: fmt.Sprintf("Method not found: %s", message.Method),
		})
	}

	go func() {
		result, err := handler(ctx, message.Params)
		if err != nil {
			c.sendResponse(message.ID, nil, &ResponseError{
				Code:    int(InternalError),
				Message: err.Error(),
			})
			return
		}
		c.sendResponse(message.ID, result, nil)
	}()

	return nil
}

// handleNotification processes a notification message
func (c *JsonRPCConnection) handleNotification(ctx context.Context, message Message) error {
	handler, ok := c.handlers[message.Method]
	if !ok {
		log.Printf("No handler for notification method: %s", message.Method)
		return nil
	}

	go func() {
		if _, err := handler(ctx, message.Params); err != nil {
			log.Printf("Error handling notification %s: %v", message.Method, err)
		}
	}()

	return nil
}

// handleResponse processes a response message
func (c *JsonRPCConnection) handleResponse(message Message) error {
	if message.ID == nil {
		return fmt.Errorf("response without ID")
	}

	idStr := fmt.Sprintf("%v", message.ID)

	c.mutex.Lock()
	callback, ok := c.callbacks[idStr]
	if ok {
		delete(c.callbacks, idStr)
	}
	c.mutex.Unlock()

	if !ok {
		return nil
	}

	callback(message.Result, message.Error)
	return nil
}

// SendRequest sends a request message
func (c *JsonRPCConnection) SendRequest(method string, params interface{}, callback func(json.RawMessage, *ResponseError)) error {
	c.mutex.Lock()
	id := c.nextID
	c.nextID++
	idStr := fmt.Sprintf("%d", id)
	c.mutex.Unlock()

	if callback != nil {
		c.mutex.Lock()
		c.callbacks[idStr] = callback
		c.mutex.Unlock()
	}

	message := Message{
		JSONRPC: JSONRPCVersion,
		ID:      id,
		Method:  method,
	}

	if params != nil {
		var err error
		message.Params, err = json.Marshal(params)
		if err != nil {
			return fmt.Errorf("failed to marshal params: %v", err)
		}
	}

	return c.sendMessage(message)
}

// SendNotification sends a notification message
func (c *JsonRPCConnection) SendNotification(method string, params interface{}) error {
	message := Message{
		JSONRPC: JSONRPCVersion,
		Method:  method,
	}

	if params != nil {
		var err error
		message.Params, err = json.Marshal(params)
		if err != nil {
			return fmt.Errorf("failed to marshal params: %v", err)
		}
	}

	return c.sendMessage(message)
}

// sendResponse sends a response message
func (c *JsonRPCConnection) sendResponse(id interface{}, result interface{}, err *ResponseError) error {
	message := Message{
		JSONRPC: JSONRPCVersion,
		ID:      id,
		Error:   err,
	}

	if result != nil && err == nil {
		var marshalErr error
		message.Result, marshalErr = json.Marshal(result)
		if marshalErr != nil {
			return fmt.Errorf("failed to marshal result: %v", marshalErr)
		}
	}

	return c.sendMessage(message)
}

// sendMessage serializes and sends a message
func (c *JsonRPCConnection) sendMessage(message Message) error {
	data, err := json.Marshal(message)
	if err != nil {
		return fmt.Errorf("failed to marshal message: %v", err)
	}

	c.mutex.Lock()
	defer c.mutex.Unlock()

	// Write header
	header := fmt.Sprintf("Content-Length: %d\r\n\r\n", len(data))
	if _, err := c.writer.Write([]byte(header)); err != nil {
		return fmt.Errorf("failed to write header: %v", err)
	}

	// Write body
	if _, err := c.writer.Write(data); err != nil {
		return fmt.Errorf("failed to write body: %v", err)
	}

	return nil
}
