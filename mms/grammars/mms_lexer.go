// Code generated from ./grammars/MMSLexer.g4 by ANTLR 4.13.2. DO NOT EDIT.

package grammars

import (
	"fmt"
	"github.com/antlr4-go/antlr/v4"
	"sync"
	"unicode"
)

// Suppress unused import error
var _ = fmt.Printf
var _ = sync.Once{}
var _ = unicode.IsLetter

type MMSLexer struct {
	*antlr.BaseLexer
	channelNames []string
	modeNames    []string
	// TODO: EOF string
}

var MMSLexerLexerStaticData struct {
	once                   sync.Once
	serializedATN          []int32
	ChannelNames           []string
	ModeNames              []string
	LiteralNames           []string
	SymbolicNames          []string
	RuleNames              []string
	PredictionContextCache *antlr.PredictionContextCache
	atn                    *antlr.ATN
	decisionToDFA          []*antlr.DFA
}

func mmslexerLexerInit() {
	staticData := &MMSLexerLexerStaticData
	staticData.ChannelNames = []string{
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN",
	}
	staticData.ModeNames = []string{
		"DEFAULT_MODE",
	}
	staticData.LiteralNames = []string{
		"", "'namespace'", "'if'", "'else'", "'in'", "", "", "'['", "']'", "'{'",
		"'}'", "'('", "')'", "':'", "';'",
	}
	staticData.SymbolicNames = []string{
		"", "Keyword_Namespace", "Keyword_If", "Keyword_Else", "Keyword_In",
		"Whitespace", "NewLine", "SquareOpen", "SquareClose", "CurlyOpen", "CurlyClose",
		"RoundOpen", "RoundClose", "Colon", "SemiColon", "Identifier",
	}
	staticData.RuleNames = []string{
		"Keyword_Namespace", "Keyword_If", "Keyword_Else", "Keyword_In", "Whitespace",
		"NewLine", "SquareOpen", "SquareClose", "CurlyOpen", "CurlyClose", "RoundOpen",
		"RoundClose", "Colon", "SemiColon", "Identifier",
	}
	staticData.PredictionContextCache = antlr.NewPredictionContextCache()
	staticData.serializedATN = []int32{
		4, 0, 15, 84, 6, -1, 2, 0, 7, 0, 2, 1, 7, 1, 2, 2, 7, 2, 2, 3, 7, 3, 2,
		4, 7, 4, 2, 5, 7, 5, 2, 6, 7, 6, 2, 7, 7, 7, 2, 8, 7, 8, 2, 9, 7, 9, 2,
		10, 7, 10, 2, 11, 7, 11, 2, 12, 7, 12, 2, 13, 7, 13, 2, 14, 7, 14, 1, 0,
		1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1,
		1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 3, 1, 3, 1, 3, 1, 4, 4, 4, 54, 8, 4, 11,
		4, 12, 4, 55, 1, 4, 1, 4, 1, 5, 1, 5, 1, 6, 1, 6, 1, 7, 1, 7, 1, 8, 1,
		8, 1, 9, 1, 9, 1, 10, 1, 10, 1, 11, 1, 11, 1, 12, 1, 12, 1, 13, 1, 13,
		1, 14, 1, 14, 5, 14, 80, 8, 14, 10, 14, 12, 14, 83, 9, 14, 0, 0, 15, 1,
		1, 3, 2, 5, 3, 7, 4, 9, 5, 11, 6, 13, 7, 15, 8, 17, 9, 19, 10, 21, 11,
		23, 12, 25, 13, 27, 14, 29, 15, 1, 0, 4, 2, 0, 9, 9, 32, 32, 2, 0, 10,
		10, 13, 13, 3, 0, 65, 90, 95, 95, 97, 122, 4, 0, 48, 57, 65, 90, 95, 95,
		97, 122, 85, 0, 1, 1, 0, 0, 0, 0, 3, 1, 0, 0, 0, 0, 5, 1, 0, 0, 0, 0, 7,
		1, 0, 0, 0, 0, 9, 1, 0, 0, 0, 0, 11, 1, 0, 0, 0, 0, 13, 1, 0, 0, 0, 0,
		15, 1, 0, 0, 0, 0, 17, 1, 0, 0, 0, 0, 19, 1, 0, 0, 0, 0, 21, 1, 0, 0, 0,
		0, 23, 1, 0, 0, 0, 0, 25, 1, 0, 0, 0, 0, 27, 1, 0, 0, 0, 0, 29, 1, 0, 0,
		0, 1, 31, 1, 0, 0, 0, 3, 41, 1, 0, 0, 0, 5, 44, 1, 0, 0, 0, 7, 49, 1, 0,
		0, 0, 9, 53, 1, 0, 0, 0, 11, 59, 1, 0, 0, 0, 13, 61, 1, 0, 0, 0, 15, 63,
		1, 0, 0, 0, 17, 65, 1, 0, 0, 0, 19, 67, 1, 0, 0, 0, 21, 69, 1, 0, 0, 0,
		23, 71, 1, 0, 0, 0, 25, 73, 1, 0, 0, 0, 27, 75, 1, 0, 0, 0, 29, 77, 1,
		0, 0, 0, 31, 32, 5, 110, 0, 0, 32, 33, 5, 97, 0, 0, 33, 34, 5, 109, 0,
		0, 34, 35, 5, 101, 0, 0, 35, 36, 5, 115, 0, 0, 36, 37, 5, 112, 0, 0, 37,
		38, 5, 97, 0, 0, 38, 39, 5, 99, 0, 0, 39, 40, 5, 101, 0, 0, 40, 2, 1, 0,
		0, 0, 41, 42, 5, 105, 0, 0, 42, 43, 5, 102, 0, 0, 43, 4, 1, 0, 0, 0, 44,
		45, 5, 101, 0, 0, 45, 46, 5, 108, 0, 0, 46, 47, 5, 115, 0, 0, 47, 48, 5,
		101, 0, 0, 48, 6, 1, 0, 0, 0, 49, 50, 5, 105, 0, 0, 50, 51, 5, 110, 0,
		0, 51, 8, 1, 0, 0, 0, 52, 54, 7, 0, 0, 0, 53, 52, 1, 0, 0, 0, 54, 55, 1,
		0, 0, 0, 55, 53, 1, 0, 0, 0, 55, 56, 1, 0, 0, 0, 56, 57, 1, 0, 0, 0, 57,
		58, 6, 4, 0, 0, 58, 10, 1, 0, 0, 0, 59, 60, 7, 1, 0, 0, 60, 12, 1, 0, 0,
		0, 61, 62, 5, 91, 0, 0, 62, 14, 1, 0, 0, 0, 63, 64, 5, 93, 0, 0, 64, 16,
		1, 0, 0, 0, 65, 66, 5, 123, 0, 0, 66, 18, 1, 0, 0, 0, 67, 68, 5, 125, 0,
		0, 68, 20, 1, 0, 0, 0, 69, 70, 5, 40, 0, 0, 70, 22, 1, 0, 0, 0, 71, 72,
		5, 41, 0, 0, 72, 24, 1, 0, 0, 0, 73, 74, 5, 58, 0, 0, 74, 26, 1, 0, 0,
		0, 75, 76, 5, 59, 0, 0, 76, 28, 1, 0, 0, 0, 77, 81, 7, 2, 0, 0, 78, 80,
		7, 3, 0, 0, 79, 78, 1, 0, 0, 0, 80, 83, 1, 0, 0, 0, 81, 79, 1, 0, 0, 0,
		81, 82, 1, 0, 0, 0, 82, 30, 1, 0, 0, 0, 83, 81, 1, 0, 0, 0, 3, 0, 55, 81,
		1, 6, 0, 0,
	}
	deserializer := antlr.NewATNDeserializer(nil)
	staticData.atn = deserializer.Deserialize(staticData.serializedATN)
	atn := staticData.atn
	staticData.decisionToDFA = make([]*antlr.DFA, len(atn.DecisionToState))
	decisionToDFA := staticData.decisionToDFA
	for index, state := range atn.DecisionToState {
		decisionToDFA[index] = antlr.NewDFA(state, index)
	}
}

// MMSLexerInit initializes any static state used to implement MMSLexer. By default the
// static state used to implement the lexer is lazily initialized during the first call to
// NewMMSLexer(). You can call this function if you wish to initialize the static state ahead
// of time.
func MMSLexerInit() {
	staticData := &MMSLexerLexerStaticData
	staticData.once.Do(mmslexerLexerInit)
}

// NewMMSLexer produces a new lexer instance for the optional input antlr.CharStream.
func NewMMSLexer(input antlr.CharStream) *MMSLexer {
	MMSLexerInit()
	l := new(MMSLexer)
	l.BaseLexer = antlr.NewBaseLexer(input)
	staticData := &MMSLexerLexerStaticData
	l.Interpreter = antlr.NewLexerATNSimulator(l, staticData.atn, staticData.decisionToDFA, staticData.PredictionContextCache)
	l.channelNames = staticData.ChannelNames
	l.modeNames = staticData.ModeNames
	l.RuleNames = staticData.RuleNames
	l.LiteralNames = staticData.LiteralNames
	l.SymbolicNames = staticData.SymbolicNames
	l.GrammarFileName = "MMSLexer.g4"
	// TODO: l.EOF = antlr.TokenEOF

	return l
}

// MMSLexer tokens.
const (
	MMSLexerKeyword_Namespace = 1
	MMSLexerKeyword_If        = 2
	MMSLexerKeyword_Else      = 3
	MMSLexerKeyword_In        = 4
	MMSLexerWhitespace        = 5
	MMSLexerNewLine           = 6
	MMSLexerSquareOpen        = 7
	MMSLexerSquareClose       = 8
	MMSLexerCurlyOpen         = 9
	MMSLexerCurlyClose        = 10
	MMSLexerRoundOpen         = 11
	MMSLexerRoundClose        = 12
	MMSLexerColon             = 13
	MMSLexerSemiColon         = 14
	MMSLexerIdentifier        = 15
)
