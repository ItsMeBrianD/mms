package lsp

// LSP Protocol types based on https://microsoft.github.io/language-server-protocol/specifications/lsp/3.17/specification/

// DocumentURI represents a document URI
type DocumentURI string

// Position in a text document expressed as zero-based line and character offset
type Position struct {
	Line      int `json:"line"`
	Character int `json:"character"`
}

// Range in a text document expressed as start and end positions
type Range struct {
	Start Position `json:"start"`
	End   Position `json:"end"`
}

// Location represents a location inside a resource, such as a line inside a text file
type Location struct {
	URI   DocumentURI `json:"uri"`
	Range Range       `json:"range"`
}

// DiagnosticSeverity represents severity of diagnostics
type DiagnosticSeverity int

const (
	DiagnosticSeverityError       DiagnosticSeverity = 1
	DiagnosticSeverityWarning     DiagnosticSeverity = 2
	DiagnosticSeverityInformation DiagnosticSeverity = 3
	DiagnosticSeverityHint        DiagnosticSeverity = 4
)

// Diagnostic represents a diagnostic, such as a compiler error or warning
type Diagnostic struct {
	Range    Range              `json:"range"`
	Severity DiagnosticSeverity `json:"severity,omitempty"`
	Code     string             `json:"code,omitempty"`
	Source   string             `json:"source,omitempty"`
	Message  string             `json:"message"`
}

// TextDocumentItem represents an item in a text document
type TextDocumentItem struct {
	URI        DocumentURI `json:"uri"`
	LanguageID string      `json:"languageId"`
	Version    int         `json:"version"`
	Text       string      `json:"text"`
}

// TextDocumentIdentifier identifies a text document
type TextDocumentIdentifier struct {
	URI DocumentURI `json:"uri"`
}

// VersionedTextDocumentIdentifier identifies a specific version of a text document
type VersionedTextDocumentIdentifier struct {
	TextDocumentIdentifier
	Version int `json:"version"`
}

// TextDocumentPositionParams is a parameter literal used in requests to pass a text document and position
type TextDocumentPositionParams struct {
	TextDocument TextDocumentIdentifier `json:"textDocument"`
	Position     Position               `json:"position"`
}

// TextDocumentSyncKind defines how the host (editor) should sync document changes to the language server
type TextDocumentSyncKind int

const (
	TextDocumentSyncKindNone        TextDocumentSyncKind = 0
	TextDocumentSyncKindFull        TextDocumentSyncKind = 1
	TextDocumentSyncKindIncremental TextDocumentSyncKind = 2
)

// TextDocumentSyncOptions defines options to control text document sync
type TextDocumentSyncOptions struct {
	OpenClose         bool                 `json:"openClose,omitempty"`
	Change            TextDocumentSyncKind `json:"change,omitempty"`
	WillSave          bool                 `json:"willSave,omitempty"`
	WillSaveWaitUntil bool                 `json:"willSaveWaitUntil,omitempty"`
	Save              bool                 `json:"save,omitempty"`
}

// CompletionOptions defines options for completion support
type CompletionOptions struct {
	ResolveProvider   bool     `json:"resolveProvider,omitempty"`
	TriggerCharacters []string `json:"triggerCharacters,omitempty"`
}

// ServerCapabilities represents the capabilities provided by the language server
type ServerCapabilities struct {
	TextDocumentSync           TextDocumentSyncOptions `json:"textDocumentSync,omitempty"`
	CompletionProvider         *CompletionOptions      `json:"completionProvider,omitempty"`
	HoverProvider              bool                    `json:"hoverProvider,omitempty"`
	DefinitionProvider         bool                    `json:"definitionProvider,omitempty"`
	ReferencesProvider         bool                    `json:"referencesProvider,omitempty"`
	DocumentSymbolProvider     bool                    `json:"documentSymbolProvider,omitempty"`
	WorkspaceSymbolProvider    bool                    `json:"workspaceSymbolProvider,omitempty"`
	CodeActionProvider         bool                    `json:"codeActionProvider,omitempty"`
	DocumentFormattingProvider bool                    `json:"documentFormattingProvider,omitempty"`
}

// WorkspaceFolder represents a workspace folder
type WorkspaceFolder struct {
	URI  string `json:"uri"`
	Name string `json:"name"`
}

// ClientCapabilities represents the capabilities provided by the client (editor)
type ClientCapabilities struct {
	Workspace    WorkspaceClientCapabilities    `json:"workspace,omitempty"`
	TextDocument TextDocumentClientCapabilities `json:"textDocument,omitempty"`
	Window       WindowClientCapabilities       `json:"window,omitempty"`
}

// WorkspaceClientCapabilities represents client capabilities specific to workspace features
type WorkspaceClientCapabilities struct {
	ApplyEdit           bool `json:"applyEdit,omitempty"`
	WorkspaceFolders    bool `json:"workspaceFolders,omitempty"`
	DidChangeWatchedFiles struct {
		DynamicRegistration bool `json:"dynamicRegistration,omitempty"`
	} `json:"didChangeWatchedFiles,omitempty"`
}

// TextDocumentClientCapabilities represents client capabilities specific to text documents
type TextDocumentClientCapabilities struct {
	Synchronization struct {
		DynamicRegistration bool `json:"dynamicRegistration,omitempty"`
		WillSave           bool `json:"willSave,omitempty"`
		WillSaveWaitUntil  bool `json:"willSaveWaitUntil,omitempty"`
		DidSave            bool `json:"didSave,omitempty"`
	} `json:"synchronization,omitempty"`
	Completion struct {
		DynamicRegistration bool `json:"dynamicRegistration,omitempty"`
		CompletionItem struct {
			SnippetSupport          bool `json:"snippetSupport,omitempty"`
			CommitCharactersSupport bool `json:"commitCharactersSupport,omitempty"`
		} `json:"completionItem,omitempty"`
	} `json:"completion,omitempty"`
	Hover struct {
		DynamicRegistration bool `json:"dynamicRegistration,omitempty"`
	} `json:"hover,omitempty"`
}

// WindowClientCapabilities represents client capabilities specific to window features
type WindowClientCapabilities struct {
	WorkDoneProgress bool `json:"workDoneProgress,omitempty"`
}

// InitializeParams represents parameters sent in an initialize request
type InitializeParams struct {
	ProcessID         *int               `json:"processId,omitempty"`
	ClientInfo        *struct {
		Name    string `json:"name"`
		Version string `json:"version,omitempty"`
	} `json:"clientInfo,omitempty"`
	RootURI           *string            `json:"rootUri,omitempty"`
	RootPath          *string            `json:"rootPath,omitempty"`
	Capabilities      ClientCapabilities `json:"capabilities"`
	WorkspaceFolders  *[]WorkspaceFolder `json:"workspaceFolders,omitempty"`
	Trace             string             `json:"trace,omitempty"`
}

// InitializeResult represents the response to an initialize request
type InitializeResult struct {
	Capabilities ServerCapabilities `json:"capabilities"`
	ServerInfo   *struct {
		Name    string `json:"name"`
		Version string `json:"version,omitempty"`
	} `json:"serverInfo,omitempty"`
}

// InitializedParams represents parameters sent in an initialized notification
type InitializedParams struct{}

// DidOpenTextDocumentParams represents parameters sent in a textDocument/didOpen notification
type DidOpenTextDocumentParams struct {
	TextDocument TextDocumentItem `json:"textDocument"`
}

// TextDocumentContentChangeEvent represents a content change event for a text document
type TextDocumentContentChangeEvent struct {
	Range       *Range `json:"range,omitempty"`
	RangeLength *int   `json:"rangeLength,omitempty"`
	Text        string `json:"text"`
}

// DidChangeTextDocumentParams represents parameters sent in a textDocument/didChange notification
type DidChangeTextDocumentParams struct {
	TextDocument   VersionedTextDocumentIdentifier    `json:"textDocument"`
	ContentChanges []TextDocumentContentChangeEvent `json:"contentChanges"`
}

// DidCloseTextDocumentParams represents parameters sent in a textDocument/didClose notification
type DidCloseTextDocumentParams struct {
	TextDocument TextDocumentIdentifier `json:"textDocument"`
}

// CompletionParams represents parameters sent in a textDocument/completion request
type CompletionParams struct {
	TextDocumentPositionParams
	Context *CompletionContext `json:"context,omitempty"`
}

// CompletionTriggerKind represents how a completion was triggered
type CompletionTriggerKind int

const (
	CompletionTriggerKindInvoked          CompletionTriggerKind = 1
	CompletionTriggerKindTriggerCharacter CompletionTriggerKind = 2
	CompletionTriggerKindTriggerForIncompleteCompletions CompletionTriggerKind = 3
)

// CompletionContext represents the context of a completion request
type CompletionContext struct {
	TriggerKind      CompletionTriggerKind `json:"triggerKind"`
	TriggerCharacter *string               `json:"triggerCharacter,omitempty"`
}

// CompletionItemKind represents the kind of a completion item
type CompletionItemKind int

const (
	CompletionItemKindText          CompletionItemKind = 1
	CompletionItemKindMethod        CompletionItemKind = 2
	CompletionItemKindFunction      CompletionItemKind = 3
	CompletionItemKindConstructor   CompletionItemKind = 4
	CompletionItemKindField         CompletionItemKind = 5
	CompletionItemKindVariable      CompletionItemKind = 6
	CompletionItemKindClass         CompletionItemKind = 7
	CompletionItemKindInterface     CompletionItemKind = 8
	CompletionItemKindModule        CompletionItemKind = 9
	CompletionItemKindProperty      CompletionItemKind = 10
	CompletionItemKindUnit          CompletionItemKind = 11
	CompletionItemKindValue         CompletionItemKind = 12
	CompletionItemKindEnum          CompletionItemKind = 13
	CompletionItemKindKeyword       CompletionItemKind = 14
	CompletionItemKindSnippet       CompletionItemKind = 15
	CompletionItemKindColor         CompletionItemKind = 16
	CompletionItemKindFile          CompletionItemKind = 17
	CompletionItemKindReference     CompletionItemKind = 18
	CompletionItemKindFolder        CompletionItemKind = 19
	CompletionItemKindEnumMember    CompletionItemKind = 20
	CompletionItemKindConstant      CompletionItemKind = 21
	CompletionItemKindStruct        CompletionItemKind = 22
	CompletionItemKindEvent         CompletionItemKind = 23
	CompletionItemKindOperator      CompletionItemKind = 24
	CompletionItemKindTypeParameter CompletionItemKind = 25
)

// CompletionItem represents a completion item
type CompletionItem struct {
	Label         string               `json:"label"`
	Kind          CompletionItemKind   `json:"kind,omitempty"`
	Detail        string               `json:"detail,omitempty"`
	Documentation string               `json:"documentation,omitempty"`
	InsertText    string               `json:"insertText,omitempty"`
	TextEdit      *TextEdit            `json:"textEdit,omitempty"`
}

// CompletionList represents a list of completion items
type CompletionList struct {
	IsIncomplete bool             `json:"isIncomplete"`
	Items        []CompletionItem `json:"items"`
}

// TextEdit represents a change to a text document
type TextEdit struct {
	Range   Range  `json:"range"`
	NewText string `json:"newText"`
}

// HoverParams represents parameters sent in a textDocument/hover request
type HoverParams struct {
	TextDocumentPositionParams
}

// MarkupKind represents the kind of markup content
type MarkupKind string

const (
	MarkupKindPlainText MarkupKind = "plaintext"
	MarkupKindMarkdown  MarkupKind = "markdown"
)

// MarkupContent represents a markup content
type MarkupContent struct {
	Kind  MarkupKind `json:"kind"`
	Value string     `json:"value"`
}

// Hover represents the result of a hover request
type Hover struct {
	Contents MarkupContent `json:"contents"`
	Range    *Range        `json:"range,omitempty"`
}
