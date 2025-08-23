package lsp

import (
	"context"
	"encoding/json"
	"errors"
	"fmt"
	"io"
	"log"
	"strings"
	"sync"

	mms "github.com/itsmebriand/mms/mms"
)

// LanguageServer implements the Language Server Protocol
type LanguageServer struct {
	conn             *JsonRPCConnection
	ctx              context.Context
	cancel           context.CancelFunc
	mutex            sync.RWMutex
	documents        map[string]*TextDocumentItem
	workspaceFolders []WorkspaceFolder
	running          bool
	project          *mms.Project
}

// NewLanguageServer creates a new language server instance
func NewLanguageServer() *LanguageServer {
	ctx, cancel := context.WithCancel(context.Background())
	return &LanguageServer{
		ctx:       ctx,
		cancel:    cancel,
		documents: make(map[string]*TextDocumentItem),
		running:   false,
		project:   mms.NewProject(),
	}
}

// Connect establishes a connection for the language server
func (s *LanguageServer) Connect(reader io.Reader, writer io.Writer) error {
	if s.conn != nil {
		return errors.New("language server is already connected")
	}

	s.conn = NewJsonRPCConnection(reader, writer)
	s.running = true

	return nil
}

// Run starts the language server processing loop
func (s *LanguageServer) Run() error {
	if s.conn == nil {
		return errors.New("language server is not connected")
	}

	// Register handlers for LSP methods
	s.registerHandlers()

	// Process messages until shutdown
	return s.conn.Run(s.ctx)
}

// registerHandlers sets up handlers for LSP methods
func (s *LanguageServer) registerHandlers() {
	// Core protocol methods
	s.conn.RegisterHandler("initialize", s.handleInitialize)
	s.conn.RegisterHandler("initialized", s.handleInitialized)
	s.conn.RegisterHandler("shutdown", s.handleShutdown)
	s.conn.RegisterHandler("exit", s.handleExit)

	// Document synchronization methods
	s.conn.RegisterHandler("textDocument/didOpen", s.handleTextDocumentDidOpen)
	s.conn.RegisterHandler("textDocument/didChange", s.handleTextDocumentDidChange)
	s.conn.RegisterHandler("textDocument/didClose", s.handleTextDocumentDidClose)

	// Language features
	s.conn.RegisterHandler("textDocument/completion", s.handleTextDocumentCompletion)
	s.conn.RegisterHandler("textDocument/hover", s.handleTextDocumentHover)
}

// handleInitialize processes the initialize request
func (s *LanguageServer) handleInitialize(ctx context.Context, params json.RawMessage) (interface{}, error) {
	var initializeParams InitializeParams
	if err := json.Unmarshal(params, &initializeParams); err != nil {
		return nil, fmt.Errorf("failed to parse initialize params: %v", err)
	}

	s.mutex.Lock()
	defer s.mutex.Unlock()

	if initializeParams.WorkspaceFolders != nil {
		s.workspaceFolders = *initializeParams.WorkspaceFolders
	}

	log.Println("Language server initializing")

	// Return server capabilities
	result := InitializeResult{
		Capabilities: ServerCapabilities{
			TextDocumentSync: TextDocumentSyncOptions{
				OpenClose: true,
				Change:    TextDocumentSyncKindFull,
			},
			CompletionProvider: &CompletionOptions{
				TriggerCharacters: []string{"."},
			},
			HoverProvider: true,
		},
		ServerInfo: &struct {
			Name    string `json:"name"`
			Version string `json:"version,omitempty"`
		}{
			Name:    "MMS Language Server",
			Version: "0.1.0",
		},
	}

	return result, nil
}

// handleInitialized processes the initialized notification
func (s *LanguageServer) handleInitialized(ctx context.Context, params json.RawMessage) (interface{}, error) {
	log.Println("Language server initialized")
	return nil, nil
}

// handleShutdown processes the shutdown request
func (s *LanguageServer) handleShutdown(ctx context.Context, params json.RawMessage) (interface{}, error) {
	s.mutex.Lock()
	defer s.mutex.Unlock()

	log.Println("Shutting down language server")
	s.running = false
	return nil, nil
}

// handleExit processes the exit notification
func (s *LanguageServer) handleExit(ctx context.Context, params json.RawMessage) (interface{}, error) {
	s.cancel()
	return nil, nil
}

// handleTextDocumentDidOpen processes textDocument/didOpen notifications
func (s *LanguageServer) handleTextDocumentDidOpen(ctx context.Context, params json.RawMessage) (interface{}, error) {
	var didOpenParams DidOpenTextDocumentParams
	if err := json.Unmarshal(params, &didOpenParams); err != nil {
		return nil, fmt.Errorf("failed to parse didOpen params: %v", err)
	}

	s.mutex.Lock()
	defer s.mutex.Unlock()

	// Store document
	document := didOpenParams.TextDocument
	s.documents[string(document.URI)] = &document

	log.Printf("Document opened: %s", document.URI)

	// Analyze document and provide diagnostics
	go s.analyzeDiagnostics(document.URI, document.Text)

	return nil, nil
}

// handleTextDocumentDidChange processes textDocument/didChange notifications
func (s *LanguageServer) handleTextDocumentDidChange(ctx context.Context, params json.RawMessage) (interface{}, error) {
	var didChangeParams DidChangeTextDocumentParams
	if err := json.Unmarshal(params, &didChangeParams); err != nil {
		return nil, fmt.Errorf("failed to parse didChange params: %v", err)
	}

	s.mutex.Lock()
	defer s.mutex.Unlock()

	// Get document
	docURI := string(didChangeParams.TextDocument.URI)
	doc, exists := s.documents[docURI]
	if !exists {
		return nil, fmt.Errorf("document not found: %s", docURI)
	}

	// Update document
	if len(didChangeParams.ContentChanges) > 0 {
		// For full sync, we just take the full content
		doc.Text = didChangeParams.ContentChanges[0].Text
		doc.Version = didChangeParams.TextDocument.Version
	}

	log.Printf("Document changed: %s (version %d)", doc.URI, doc.Version)

	// Analyze document and provide diagnostics
	go s.analyzeDiagnostics(doc.URI, doc.Text)

	return nil, nil
}

// handleTextDocumentDidClose processes textDocument/didClose notifications
func (s *LanguageServer) handleTextDocumentDidClose(ctx context.Context, params json.RawMessage) (interface{}, error) {
	var didCloseParams DidCloseTextDocumentParams
	if err := json.Unmarshal(params, &didCloseParams); err != nil {
		return nil, fmt.Errorf("failed to parse didClose params: %v", err)
	}

	s.mutex.Lock()
	defer s.mutex.Unlock()

	// Remove document
	docURI := string(didCloseParams.TextDocument.URI)
	delete(s.documents, docURI)

	log.Printf("Document closed: %s", docURI)

	// Clear diagnostics for the document
	s.clearDiagnostics(DocumentURI(docURI))

	return nil, nil
}

// handleTextDocumentCompletion processes textDocument/completion requests
func (s *LanguageServer) handleTextDocumentCompletion(ctx context.Context, params json.RawMessage) (interface{}, error) {
	var completionParams CompletionParams
	if err := json.Unmarshal(params, &completionParams); err != nil {
		return nil, fmt.Errorf("failed to parse completion params: %v", err)
	}

	s.mutex.RLock()
	defer s.mutex.RUnlock()

	// Get document
	docURI := string(completionParams.TextDocument.URI)
	doc, exists := s.documents[docURI]
	if !exists {
		return nil, fmt.Errorf("document not found: %s", docURI)
	}

	// Generate completion items
	items := s.provideCompletionItems(doc, completionParams.Position)

	return CompletionList{
		IsIncomplete: false,
		Items:        items,
	}, nil
}

// handleTextDocumentHover processes textDocument/hover requests
func (s *LanguageServer) handleTextDocumentHover(ctx context.Context, params json.RawMessage) (interface{}, error) {
	var hoverParams HoverParams
	if err := json.Unmarshal(params, &hoverParams); err != nil {
		return nil, fmt.Errorf("failed to parse hover params: %v", err)
	}

	s.mutex.RLock()
	defer s.mutex.RUnlock()

	// Get document
	docURI := string(hoverParams.TextDocument.URI)
	doc, exists := s.documents[docURI]
	if !exists {
		return nil, fmt.Errorf("document not found: %s", docURI)
	}

	// Generate hover
	hover := s.provideHover(doc, hoverParams.Position)
	return hover, nil
}

// analyzeDiagnostics analyzes the document and publishes diagnostics
func (s *LanguageServer) analyzeDiagnostics(uri DocumentURI, text string) {
	// Attempt to parse document using the MMS ANTLR grammar via Project.
	// For now, if parsing returns an error, emit a generic diagnostic at the top of the file.
	// TODO: Wire in a proper ANTLR error listener to collect precise positions.
	diagnostics := []Diagnostic{}

	if s.project == nil {
		s.project = mms.NewProject()
	}

	if _, err := s.project.ParseLiteral(text); err != nil {
		// Generic file-level diagnostic
		firstLineLen := 0
		if idx := strings.IndexRune(text, '\n'); idx >= 0 {
			firstLineLen = idx
		} else {
			firstLineLen = len(text)
		}
		diagnostics = append(diagnostics, Diagnostic{
			Range: Range{
				Start: Position{Line: 0, Character: 0},
				End:   Position{Line: 0, Character: firstLineLen},
			},
			Severity: DiagnosticSeverityError,
			Source:   "mms-language-server",
			Message:  fmt.Sprintf("Parse error: %v", err),
		})
	}

	s.publishDiagnostics(uri, diagnostics)
}

// publishDiagnostics publishes diagnostics for a document
func (s *LanguageServer) publishDiagnostics(uri DocumentURI, diagnostics []Diagnostic) {
	// Send textDocument/publishDiagnostics notification
	s.conn.SendNotification("textDocument/publishDiagnostics", map[string]interface{}{
		"uri":         uri,
		"diagnostics": diagnostics,
	})
}

// clearDiagnostics clears diagnostics for a document
func (s *LanguageServer) clearDiagnostics(uri DocumentURI) {
	// Send empty diagnostics to clear
	s.publishDiagnostics(uri, []Diagnostic{})
}

// provideCompletionItems generates completion items for a document at a specific position
func (s *LanguageServer) provideCompletionItems(document *TextDocumentItem, position Position) []CompletionItem {
	// This is a simplified implementation
	// In a real implementation, you would analyze the document and context
	// to provide context-aware completions based on position and document content
	_ = document // Explicitly acknowledging unused parameter for now
	_ = position // Explicitly acknowledging unused parameter for now

	// Sample completion items for demonstration
	basicKeywords := []struct {
		label  string
		kind   CompletionItemKind
		detail string
	}{
		{"rule", CompletionItemKindKeyword, "Surface rule definition"},
		{"condition", CompletionItemKindKeyword, "Condition for a rule"},
		{"noise", CompletionItemKindFunction, "Noise function"},
		{"block", CompletionItemKindClass, "Block reference"},
		{"biome", CompletionItemKindClass, "Biome reference"},
	}

	completionItems := []CompletionItem{}
	for _, keyword := range basicKeywords {
		completionItems = append(completionItems, CompletionItem{
			Label:  keyword.label,
			Kind:   keyword.kind,
			Detail: keyword.detail,
		})
	}

	return completionItems
}

// provideHover generates hover information for a document at a specific position
func (s *LanguageServer) provideHover(document *TextDocumentItem, position Position) *Hover {
	// This is a simplified implementation
	// In a real implementation, you would analyze the document and find the symbol at position

	// Get the current line
	lines := strings.Split(document.Text, "\n")
	if position.Line < 0 || position.Line >= len(lines) {
		return nil
	}

	line := lines[position.Line]
	if position.Character < 0 || position.Character >= len(line) {
		return nil
	}

	// Extract the word at position
	start := position.Character
	for start > 0 && isIdentifierChar(rune(line[start-1])) {
		start--
	}

	end := position.Character
	for end < len(line) && isIdentifierChar(rune(line[end])) {
		end++
	}

	word := ""
	if start < end {
		word = line[start:end]
	}

	// If we found a word, provide hover information
	if word != "" {
		// Example hover information based on keywords
		switch word {
		case "rule":
			return &Hover{
				Contents: MarkupContent{
					Kind:  MarkupKindMarkdown,
					Value: "**rule** - Defines a surface rule for terrain generation.",
				},
			}
		case "condition":
			return &Hover{
				Contents: MarkupContent{
					Kind:  MarkupKindMarkdown,
					Value: "**condition** - Specifies when a rule should be applied.",
				},
			}
		case "noise":
			return &Hover{
				Contents: MarkupContent{
					Kind:  MarkupKindMarkdown,
					Value: "**noise** - Creates a noise function for terrain variation.",
				},
			}
		case "block":
			return &Hover{
				Contents: MarkupContent{
					Kind:  MarkupKindMarkdown,
					Value: "**block** - References a block type in the game.",
				},
			}
		case "biome":
			return &Hover{
				Contents: MarkupContent{
					Kind:  MarkupKindMarkdown,
					Value: "**biome** - References a biome type in the game.",
				},
			}
		default:
			return nil
		}
	}

	return nil
}

// isIdentifierChar checks if the rune is a valid identifier character
func isIdentifierChar(r rune) bool {
	return (r >= 'a' && r <= 'z') || (r >= 'A' && r <= 'Z') || (r >= '0' && r <= '9') || r == '_'
}
