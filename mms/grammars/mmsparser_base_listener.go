// Code generated from grammars/MMSParser.g4 by ANTLR 4.13.2. DO NOT EDIT.

package parser // MMSParser

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

// EnterMmsFile is called when production mmsFile is entered.
func (s *BaseMMSParserListener) EnterMmsFile(ctx *MmsFileContext) {}

// ExitMmsFile is called when production mmsFile is exited.
func (s *BaseMMSParserListener) ExitMmsFile(ctx *MmsFileContext) {}
