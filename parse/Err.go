package parse

import (
	"fmt"
	"strings"

	"github.com/antlr4-go/antlr/v4"
)

type ErrorHandler struct {
	antlr.ErrorListener

	Filename string
	Content  string
	Messages []string
}

func (eh *ErrorHandler) SyntaxError(recognizer antlr.Recognizer, offendingSymbol interface{}, line, column int, msg string, e antlr.RecognitionException) {
	splitMsg := strings.Split(msg, "\n")
	fmtMsg := ""
	for _, line := range splitMsg {
		fmtMsg += "\t| " + line + "\n"
	}

	message := fmt.Sprintf("Syntax Error found in %s:%d:%d:\n%s\t| \n\n", eh.Filename, line, column, fmtMsg)
	eh.Messages = append(eh.Messages, message)

}

func (eh ErrorHandler) ReportAmbiguity(recognizer antlr.Parser, dfa *antlr.DFA, startIndex, stopIndex int, exact bool, ambigAlts *antlr.BitSet, configs *antlr.ATNConfigSet) {
	fmt.Println("Ambiguity detected")
}

func (eh ErrorHandler) ReportAttemptingFullContext(recognizer antlr.Parser, dfa *antlr.DFA, startIndex, stopIndex int, conflictingAlts *antlr.BitSet, configs *antlr.ATNConfigSet) {
	fmt.Println("Attempting full context")
}

func (eh ErrorHandler) ReportContextSensitivity(recognizer antlr.Parser, dfa *antlr.DFA, startIndex, stopIndex, prediction int, configs *antlr.ATNConfigSet) {
	fmt.Println("Context sensitivity detected")
}
