// Code generated from ./grammars/MMSParser.g4 by ANTLR 4.13.2. DO NOT EDIT.

package grammars // MMSParser
import "github.com/antlr4-go/antlr/v4"

// MMSParserListener is a complete listener for a parse tree produced by MMSParser.
type MMSParserListener interface {
	antlr.ParseTreeListener

	// EnterNamespaceDeclaration is called when entering the namespaceDeclaration production.
	EnterNamespaceDeclaration(c *NamespaceDeclarationContext)

	// EnterStatement is called when entering the statement production.
	EnterStatement(c *StatementContext)

	// EnterMmsFile is called when entering the mmsFile production.
	EnterMmsFile(c *MmsFileContext)

	// EnterSurfaceDeclaration is called when entering the surfaceDeclaration production.
	EnterSurfaceDeclaration(c *SurfaceDeclarationContext)

	// EnterSurfaceInline is called when entering the surfaceInline production.
	EnterSurfaceInline(c *SurfaceInlineContext)

	// EnterSurfaceDefinition is called when entering the surfaceDefinition production.
	EnterSurfaceDefinition(c *SurfaceDefinitionContext)

	// EnterSurfaceRuleReference is called when entering the surfaceRuleReference production.
	EnterSurfaceRuleReference(c *SurfaceRuleReferenceContext)

	// EnterSurfaceRuleDeclaration is called when entering the surfaceRuleDeclaration production.
	EnterSurfaceRuleDeclaration(c *SurfaceRuleDeclarationContext)

	// EnterSurfaceRule is called when entering the surfaceRule production.
	EnterSurfaceRule(c *SurfaceRuleContext)

	// EnterSurfaceRule_Conditional is called when entering the surfaceRule_Conditional production.
	EnterSurfaceRule_Conditional(c *SurfaceRule_ConditionalContext)

	// EnterSurfaceRule_Block is called when entering the surfaceRule_Block production.
	EnterSurfaceRule_Block(c *SurfaceRule_BlockContext)

	// EnterSurfaceRule_Sequence is called when entering the surfaceRule_Sequence production.
	EnterSurfaceRule_Sequence(c *SurfaceRule_SequenceContext)

	// EnterReference is called when entering the reference production.
	EnterReference(c *ReferenceContext)

	// ExitNamespaceDeclaration is called when exiting the namespaceDeclaration production.
	ExitNamespaceDeclaration(c *NamespaceDeclarationContext)

	// ExitStatement is called when exiting the statement production.
	ExitStatement(c *StatementContext)

	// ExitMmsFile is called when exiting the mmsFile production.
	ExitMmsFile(c *MmsFileContext)

	// ExitSurfaceDeclaration is called when exiting the surfaceDeclaration production.
	ExitSurfaceDeclaration(c *SurfaceDeclarationContext)

	// ExitSurfaceInline is called when exiting the surfaceInline production.
	ExitSurfaceInline(c *SurfaceInlineContext)

	// ExitSurfaceDefinition is called when exiting the surfaceDefinition production.
	ExitSurfaceDefinition(c *SurfaceDefinitionContext)

	// ExitSurfaceRuleReference is called when exiting the surfaceRuleReference production.
	ExitSurfaceRuleReference(c *SurfaceRuleReferenceContext)

	// ExitSurfaceRuleDeclaration is called when exiting the surfaceRuleDeclaration production.
	ExitSurfaceRuleDeclaration(c *SurfaceRuleDeclarationContext)

	// ExitSurfaceRule is called when exiting the surfaceRule production.
	ExitSurfaceRule(c *SurfaceRuleContext)

	// ExitSurfaceRule_Conditional is called when exiting the surfaceRule_Conditional production.
	ExitSurfaceRule_Conditional(c *SurfaceRule_ConditionalContext)

	// ExitSurfaceRule_Block is called when exiting the surfaceRule_Block production.
	ExitSurfaceRule_Block(c *SurfaceRule_BlockContext)

	// ExitSurfaceRule_Sequence is called when exiting the surfaceRule_Sequence production.
	ExitSurfaceRule_Sequence(c *SurfaceRule_SequenceContext)

	// ExitReference is called when exiting the reference production.
	ExitReference(c *ReferenceContext)
}
