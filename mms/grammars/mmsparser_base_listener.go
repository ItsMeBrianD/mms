// Code generated from ./grammars/MMSParser.g4 by ANTLR 4.13.2. DO NOT EDIT.

package grammars // MMSParser
import "github.com/antlr4-go/antlr/v4"

// BaseMMSParserListener is a complete listener for a parse tree produced by MMSParser.
type BaseMMSParserListener struct{}

var _ MMSParserListener = &BaseMMSParserListener{}

// VisitTerminal is called when a terminal node is visited.
func (s *BaseMMSParserListener) VisitTerminal(node antlr.TerminalNode) {}

// VisitErrorNode is called when an error node is visited.
func (s *BaseMMSParserListener) VisitErrorNode(node antlr.ErrorNode) {}

// EnterEveryRule is called when any rule is entered.
func (s *BaseMMSParserListener) EnterEveryRule(ctx antlr.ParserRuleContext) {}

// ExitEveryRule is called when any rule is exited.
func (s *BaseMMSParserListener) ExitEveryRule(ctx antlr.ParserRuleContext) {}

// EnterNamespaceDeclaration is called when production namespaceDeclaration is entered.
func (s *BaseMMSParserListener) EnterNamespaceDeclaration(ctx *NamespaceDeclarationContext) {}

// ExitNamespaceDeclaration is called when production namespaceDeclaration is exited.
func (s *BaseMMSParserListener) ExitNamespaceDeclaration(ctx *NamespaceDeclarationContext) {}

// EnterStatement is called when production statement is entered.
func (s *BaseMMSParserListener) EnterStatement(ctx *StatementContext) {}

// ExitStatement is called when production statement is exited.
func (s *BaseMMSParserListener) ExitStatement(ctx *StatementContext) {}

// EnterMmsFile is called when production mmsFile is entered.
func (s *BaseMMSParserListener) EnterMmsFile(ctx *MmsFileContext) {}

// ExitMmsFile is called when production mmsFile is exited.
func (s *BaseMMSParserListener) ExitMmsFile(ctx *MmsFileContext) {}

// EnterSurfaceDeclaration is called when production surfaceDeclaration is entered.
func (s *BaseMMSParserListener) EnterSurfaceDeclaration(ctx *SurfaceDeclarationContext) {}

// ExitSurfaceDeclaration is called when production surfaceDeclaration is exited.
func (s *BaseMMSParserListener) ExitSurfaceDeclaration(ctx *SurfaceDeclarationContext) {}

// EnterSurfaceDefinition is called when production surfaceDefinition is entered.
func (s *BaseMMSParserListener) EnterSurfaceDefinition(ctx *SurfaceDefinitionContext) {}

// ExitSurfaceDefinition is called when production surfaceDefinition is exited.
func (s *BaseMMSParserListener) ExitSurfaceDefinition(ctx *SurfaceDefinitionContext) {}

// EnterSurfaceRuleReference is called when production surfaceRuleReference is entered.
func (s *BaseMMSParserListener) EnterSurfaceRuleReference(ctx *SurfaceRuleReferenceContext) {}

// ExitSurfaceRuleReference is called when production surfaceRuleReference is exited.
func (s *BaseMMSParserListener) ExitSurfaceRuleReference(ctx *SurfaceRuleReferenceContext) {}

// EnterSurfaceRuleDeclaration is called when production surfaceRuleDeclaration is entered.
func (s *BaseMMSParserListener) EnterSurfaceRuleDeclaration(ctx *SurfaceRuleDeclarationContext) {}

// ExitSurfaceRuleDeclaration is called when production surfaceRuleDeclaration is exited.
func (s *BaseMMSParserListener) ExitSurfaceRuleDeclaration(ctx *SurfaceRuleDeclarationContext) {}

// EnterSurfaceRule is called when production surfaceRule is entered.
func (s *BaseMMSParserListener) EnterSurfaceRule(ctx *SurfaceRuleContext) {}

// ExitSurfaceRule is called when production surfaceRule is exited.
func (s *BaseMMSParserListener) ExitSurfaceRule(ctx *SurfaceRuleContext) {}

// EnterSurfaceRule_Conditional is called when production surfaceRule_Conditional is entered.
func (s *BaseMMSParserListener) EnterSurfaceRule_Conditional(ctx *SurfaceRule_ConditionalContext) {}

// ExitSurfaceRule_Conditional is called when production surfaceRule_Conditional is exited.
func (s *BaseMMSParserListener) ExitSurfaceRule_Conditional(ctx *SurfaceRule_ConditionalContext) {}

// EnterSurfaceRule_Block is called when production surfaceRule_Block is entered.
func (s *BaseMMSParserListener) EnterSurfaceRule_Block(ctx *SurfaceRule_BlockContext) {}

// ExitSurfaceRule_Block is called when production surfaceRule_Block is exited.
func (s *BaseMMSParserListener) ExitSurfaceRule_Block(ctx *SurfaceRule_BlockContext) {}

// EnterSurfaceRule_Sequence is called when production surfaceRule_Sequence is entered.
func (s *BaseMMSParserListener) EnterSurfaceRule_Sequence(ctx *SurfaceRule_SequenceContext) {}

// ExitSurfaceRule_Sequence is called when production surfaceRule_Sequence is exited.
func (s *BaseMMSParserListener) ExitSurfaceRule_Sequence(ctx *SurfaceRule_SequenceContext) {}

// EnterReference is called when production reference is entered.
func (s *BaseMMSParserListener) EnterReference(ctx *ReferenceContext) {}

// ExitReference is called when production reference is exited.
func (s *BaseMMSParserListener) ExitReference(ctx *ReferenceContext) {}
