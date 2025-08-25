package lsp

import (
	"log"

	"github.com/tliron/glsp"
	protocol "github.com/tliron/glsp/protocol_3_16"
)

func (ctx *LanguageServerCtx) textDocumentCompletion(context *glsp.Context, params *protocol.CompletionParams) (any, error) {
	log.Println(params)

	return nil, nil
}
