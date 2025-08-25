package lsp

import (
	"log"

	"github.com/itsmebriand/mms/mms"
	"github.com/tliron/glsp"
	protocol "github.com/tliron/glsp/protocol_3_16"
	"github.com/tliron/glsp/server"
)

var lsName = "MMS Language Server"
var version = "0.1.0"
var handler *protocol.Handler
var project *mms.Project
var ls *server.Server

type MMSLanguageServer struct {
	protocol.Handler
	project *mms.Project
	ls      *server.Server
}

func Start() error {
	project = mms.NewProject()
	handler = &protocol.Handler{
		Initialize:                         initialize,
		Initialized:                        initialized,
		Shutdown:                           shutdown,
		SetTrace:                           setTrace,
		CompletionItemResolve:              completionItemResolve,
		WorkspaceDidChangeWorkspaceFolders: workspaceDidChangeWorkspaceFolders,
		WorkspaceDidChangeWatchedFiles:     workspaceDidChangeWatchedFiles,
		TextDocumentDidChange:              textDocumentDidChange,
	}

	ls = server.NewServer(handler, lsName, true)

	log.Println("Server launched")

	return ls.RunStdio()
}

func textDocumentDidChange(context *glsp.Context, params *protocol.DidChangeTextDocumentParams) error {
	log.Println("TextDocumentDidChange", "textDocument", params.TextDocument, "contentChanges", params.ContentChanges)
	return nil
}

func workspaceDidChangeWorkspaceFolders(context *glsp.Context, params *protocol.DidChangeWorkspaceFoldersParams) error {
	log.Println("WorkspaceDidChangeWorkspaceFolders", "added", params.Event.Added, "removed", params.Event.Removed)
	return nil
}

func workspaceDidChangeWatchedFiles(context *glsp.Context, params *protocol.DidChangeWatchedFilesParams) error {
	log.Println("WorkspaceDidChangeWatchedFiles", "changes", params.Changes)
	return nil
}

func completionItemResolve(context *glsp.Context, item *protocol.CompletionItem) (*protocol.CompletionItem, error) {
	log.Println("CompletionItemResolve", "label", item.Label, "kind", item.Kind, "command", item.Command.Title)
	return nil, nil
}

func initialize(context *glsp.Context, params *protocol.InitializeParams) (any, error) {
	capabilities := handler.CreateServerCapabilities()

	return protocol.InitializeResult{
		Capabilities: capabilities,
		ServerInfo: &protocol.InitializeResultServerInfo{
			Name:    lsName,
			Version: &version,
		},
	}, nil
}

func initialized(context *glsp.Context, params *protocol.InitializedParams) error {
	return nil
}

func shutdown(context *glsp.Context) error {
	protocol.SetTraceValue(protocol.TraceValueOff)
	return nil
}

func setTrace(context *glsp.Context, params *protocol.SetTraceParams) error {
	protocol.SetTraceValue(params.Value)
	return nil
}
