package lsp

import (
	"errors"
	"fmt"
	"log"
	"os"

	"github.com/itsmebriand/mms/minecraft_metascript"
	"github.com/itsmebriand/mms/minecraft_metascript/surface/surface_rules"
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

type LanguageServerCtx struct {
	project *minecraft_metascript.MMSProject
}

func Start() error {
	context := &LanguageServerCtx{
		project: minecraft_metascript.NewMMSProject(),
	}
	handler = &protocol.Handler{
		Initialize:                         context.initialize,
		Initialized:                        context.initialized,
		Shutdown:                           context.shutdown,
		SetTrace:                           context.setTrace,
		CompletionItemResolve:              context.completionItemResolve,
		WorkspaceDidChangeWorkspaceFolders: context.workspaceDidChangeWorkspaceFolders,
		WorkspaceDidChangeWatchedFiles:     context.workspaceDidChangeWatchedFiles,
		TextDocumentDidChange:              context.textDocumentDidChange,
	}

	ls = server.NewServer(handler, lsName, true)

	log.Println("Server launched")

	return ls.RunStdio()
}

func (ctx *LanguageServerCtx) textDocumentDidChange(context *glsp.Context, params *protocol.DidChangeTextDocumentParams) error {
	log.Println("TextDocumentDidChange", "textDocument", params.TextDocument, "contentChanges", params.ContentChanges)
	return nil
}

func (ctx *LanguageServerCtx) workspaceDidChangeWorkspaceFolders(context *glsp.Context, params *protocol.DidChangeWorkspaceFoldersParams) error {
	log.Println("WorkspaceDidChangeWorkspaceFolders", "added", params.Event.Added, "removed", params.Event.Removed)
	return nil
}

func (ctx *LanguageServerCtx) workspaceDidChangeWatchedFiles(context *glsp.Context, params *protocol.DidChangeWatchedFilesParams) error {
	log.Println("WorkspaceDidChangeWatchedFiles", "changes", params.Changes)
	errs := make([]error, 0)
	for _, change := range params.Changes {
		filepath := change.URI[7:]
		content, err := os.ReadFile(filepath)
		if err != nil {
			errs = append(errs, err)
			continue
		}
		err = ctx.project.AddFile(filepath, string(content))
		if err != nil {
			errs = append(errs, err)
			continue
		}
	}

	log.Println("WorkspaceDidChangeWatchedFiles", "errors", errs)
	for namespace, rules := range minecraft_metascript.ProjectSymbols[surface_rules.SurfaceRule](ctx.project) {
		fmt.Println(namespace)
		for name, rule := range rules {
			fmt.Println(name, rule)
		}

	}
	return errors.Join(errs...)
}

func (ctx *LanguageServerCtx) completionItemResolve(context *glsp.Context, item *protocol.CompletionItem) (*protocol.CompletionItem, error) {
	log.Println("CompletionItemResolve", "label", item.Label, "kind", item.Kind, "command", item.Command.Title)
	return nil, nil
}

func (ctx *LanguageServerCtx) initialize(context *glsp.Context, params *protocol.InitializeParams) (any, error) {
	capabilities := handler.CreateServerCapabilities()

	return protocol.InitializeResult{
		Capabilities: capabilities,
		ServerInfo: &protocol.InitializeResultServerInfo{
			Name:    lsName,
			Version: &version,
		},
	}, nil
}

func (ctx *LanguageServerCtx) initialized(context *glsp.Context, params *protocol.InitializedParams) error {
	log.Println("Initialized 1")
	return nil
}

func (ctx *LanguageServerCtx) shutdown(context *glsp.Context) error {
	protocol.SetTraceValue(protocol.TraceValueOff)
	return nil
}

func (ctx *LanguageServerCtx) setTrace(context *glsp.Context, params *protocol.SetTraceParams) error {
	protocol.SetTraceValue(params.Value)
	return nil
}
