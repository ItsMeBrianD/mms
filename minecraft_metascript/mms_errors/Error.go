package mms_errors

import (
	"fmt"
	"log"

	"github.com/antlr4-go/antlr/v4"
)

type ErrorLevel string

const (
	ErrorLevelWarning ErrorLevel = "warning"
	ErrorLevelError   ErrorLevel = "error"
)

type TokenError struct {
	Message     string
	Level       ErrorLevel
	Line        int
	StartColumn int
	// TODO: End Column, needed for annotations in LSP
	Filename string
}

func (e TokenError) String() string {
	return fmt.Sprintf("%s:%d:%d %s", e.Filename, e.Line, e.StartColumn, e.Message)
}

func NewTokenError(filename string, column, line int, msg string, level ErrorLevel) TokenError {
	return TokenError{
		StartColumn: column,
		Message:     msg,
		Level:       level,
		Line:        line,
		Filename:    filename,
	}
}

type ErrorListener struct {
	*antlr.ConsoleErrorListener
	filename string

	emitError func(TokenError)
}

func NewErrorListener(filename string, emitError func(TokenError)) *ErrorListener {
	return &ErrorListener{
		filename:  filename,
		emitError: emitError,
	}
}

func (l *ErrorListener) SyntaxError(recognizer antlr.Recognizer, symbol interface{}, line, column int, msg string, e antlr.RecognitionException) {
	switch e.(type) {
	case *antlr.NoViableAltException:
		token := symbol.(antlr.Token)

		l.emitError(NewTokenError(
			l.filename,
			token.GetColumn()+1,
			token.GetLine(),
			"Syntax Error", // TODO: Provide more specifics by looking up token or rule type?
			ErrorLevelError,
		))
	default:
		l.emitError(NewTokenError(
			l.filename,
			column,
			line,
			msg,
			ErrorLevelError,
		))
	}
}

func (l *ErrorListener) ReportAmbiguity(parser antlr.Parser, dfa *antlr.DFA, startIndex, stopIndex int, exact bool, ambigAlts *antlr.BitSet, configs *antlr.ATNConfigSet) {
	log.Println(">>>", "ReportAmbiguity")
}

func (l *ErrorListener) ReportAttemptingFullContext(parser antlr.Parser, dfa *antlr.DFA, startIndex, stopIndex int, exact *antlr.BitSet, configs *antlr.ATNConfigSet) {
	log.Println(">>>", "ReportAttemptingFullContext")
}

func (l *ErrorListener) ReportContextSensitivity(parser antlr.Parser, dfa *antlr.DFA, startIndex, stopIndex int, prediction int, configs *antlr.ATNConfigSet) {
	log.Println(">>>", "ReportContextSensitivity")
}
