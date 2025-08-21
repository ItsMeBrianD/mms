// Code generated from grammars/MMSParser.g4 by ANTLR 4.13.2. DO NOT EDIT.

package parser // MMSParser

import "github.com/antlr4-go/antlr/v4"

// MMSParserListener is a complete listener for a parse tree produced by MMSParser.
type MMSParserListener interface {
	antlr.ParseTreeListener

	// EnterMmsFile is called when entering the mmsFile production.
	EnterMmsFile(c *MmsFileContext)

	// ExitMmsFile is called when exiting the mmsFile production.
	ExitMmsFile(c *MmsFileContext)
}
