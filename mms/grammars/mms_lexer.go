// Code generated from grammars/MMSLexer.g4 by ANTLR 4.13.2. DO NOT EDIT.

package parser

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
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "SYMBOL",
	}
	staticData.ModeNames = []string{
		"DEFAULT_MODE",
	}
	staticData.LiteralNames = []string{
		"", "'['", "']'", "'{'", "'}'", "'('", "')'", "':'", "';'",
	}
	staticData.SymbolicNames = []string{
		"", "SquareOpen", "SquareClose", "CurlyOpen", "CurlyClose", "RoundOpen",
		"RoundClose", "Colon", "SemiColon", "Identifier",
	}
	staticData.RuleNames = []string{
		"SquareOpen", "SquareClose", "CurlyOpen", "CurlyClose", "RoundOpen",
		"RoundClose", "Colon", "SemiColon", "Identifier",
	}
	staticData.PredictionContextCache = antlr.NewPredictionContextCache()
	staticData.serializedATN = []int32{
		4, 0, 9, 44, 6, -1, 2, 0, 7, 0, 2, 1, 7, 1, 2, 2, 7, 2, 2, 3, 7, 3, 2,
		4, 7, 4, 2, 5, 7, 5, 2, 6, 7, 6, 2, 7, 7, 7, 2, 8, 7, 8, 1, 0, 1, 0, 1,
		1, 1, 1, 1, 2, 1, 2, 1, 3, 1, 3, 1, 4, 1, 4, 1, 5, 1, 5, 1, 6, 1, 6, 1,
		7, 1, 7, 1, 8, 1, 8, 5, 8, 38, 8, 8, 10, 8, 12, 8, 41, 9, 8, 1, 8, 1, 8,
		0, 0, 9, 1, 1, 3, 2, 5, 3, 7, 4, 9, 5, 11, 6, 13, 7, 15, 8, 17, 9, 1, 0,
		2, 3, 0, 65, 90, 95, 95, 97, 122, 4, 0, 48, 57, 65, 90, 95, 95, 97, 122,
		44, 0, 1, 1, 0, 0, 0, 0, 3, 1, 0, 0, 0, 0, 5, 1, 0, 0, 0, 0, 7, 1, 0, 0,
		0, 0, 9, 1, 0, 0, 0, 0, 11, 1, 0, 0, 0, 0, 13, 1, 0, 0, 0, 0, 15, 1, 0,
		0, 0, 0, 17, 1, 0, 0, 0, 1, 19, 1, 0, 0, 0, 3, 21, 1, 0, 0, 0, 5, 23, 1,
		0, 0, 0, 7, 25, 1, 0, 0, 0, 9, 27, 1, 0, 0, 0, 11, 29, 1, 0, 0, 0, 13,
		31, 1, 0, 0, 0, 15, 33, 1, 0, 0, 0, 17, 35, 1, 0, 0, 0, 19, 20, 5, 91,
		0, 0, 20, 2, 1, 0, 0, 0, 21, 22, 5, 93, 0, 0, 22, 4, 1, 0, 0, 0, 23, 24,
		5, 123, 0, 0, 24, 6, 1, 0, 0, 0, 25, 26, 5, 125, 0, 0, 26, 8, 1, 0, 0,
		0, 27, 28, 5, 40, 0, 0, 28, 10, 1, 0, 0, 0, 29, 30, 5, 41, 0, 0, 30, 12,
		1, 0, 0, 0, 31, 32, 5, 58, 0, 0, 32, 14, 1, 0, 0, 0, 33, 34, 5, 59, 0,
		0, 34, 16, 1, 0, 0, 0, 35, 39, 7, 0, 0, 0, 36, 38, 7, 1, 0, 0, 37, 36,
		1, 0, 0, 0, 38, 41, 1, 0, 0, 0, 39, 37, 1, 0, 0, 0, 39, 40, 1, 0, 0, 0,
		40, 42, 1, 0, 0, 0, 41, 39, 1, 0, 0, 0, 42, 43, 6, 8, 0, 0, 43, 18, 1,
		0, 0, 0, 2, 0, 39, 1, 0, 2, 0,
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
	MMSLexerSquareOpen  = 1
	MMSLexerSquareClose = 2
	MMSLexerCurlyOpen   = 3
	MMSLexerCurlyClose  = 4
	MMSLexerRoundOpen   = 5
	MMSLexerRoundClose  = 6
	MMSLexerColon       = 7
	MMSLexerSemiColon   = 8
	MMSLexerIdentifier  = 9
)

// MMSLexerSYMBOL is the MMSLexer channel.
const MMSLexerSYMBOL = 2
