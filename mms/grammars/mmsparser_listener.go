// Code generated from ./grammars/MMSParser.g4 by ANTLR 4.13.2. DO NOT EDIT.

package grammars // MMSParser
import "github.com/antlr4-go/antlr/v4"

// MMSParserListener is a complete listener for a parse tree produced by MMSParser.
type MMSParserListener interface {
	antlr.ParseTreeListener

	// EnterNamespaceDeclaration is called when entering the namespaceDeclaration production.
	EnterNamespaceDeclaration(c *NamespaceDeclarationContext)

	// EnterMmsFile is called when entering the mmsFile production.
	EnterMmsFile(c *MmsFileContext)

	// EnterReference is called when entering the reference production.
	EnterReference(c *ReferenceContext)

	// ExitNamespaceDeclaration is called when exiting the namespaceDeclaration production.
	ExitNamespaceDeclaration(c *NamespaceDeclarationContext)

	// ExitMmsFile is called when exiting the mmsFile production.
	ExitMmsFile(c *MmsFileContext)

	// ExitReference is called when exiting the reference production.
	ExitReference(c *ReferenceContext)
}
