// Code generated from ./grammars/MMSParser.g4 by ANTLR 4.13.2. DO NOT EDIT.

package grammars // MMSParser
import (
	"fmt"
	"strconv"
	"sync"

	"github.com/antlr4-go/antlr/v4"
)

// Suppress unused import errors
var _ = fmt.Printf
var _ = strconv.Itoa
var _ = sync.Once{}

type MMSParser struct {
	*antlr.BaseParser
}

var MMSParserParserStaticData struct {
	once                   sync.Once
	serializedATN          []int32
	LiteralNames           []string
	SymbolicNames          []string
	RuleNames              []string
	PredictionContextCache *antlr.PredictionContextCache
	atn                    *antlr.ATN
	decisionToDFA          []*antlr.DFA
}

func mmsparserParserInit() {
	staticData := &MMSParserParserStaticData
	staticData.LiteralNames = []string{
		"", "'surface'", "'rule'", "'condition'", "'sequence'", "'block'", "'bandlands'",
		"'above_preliminary_surface'", "'biome'", "'hole'", "'steep'", "'stone_depth'",
		"'freezing'", "'temperature'", "'vertical_gradient'", "'water'", "'y_above'",
		"'namespace'", "'if'", "'else'", "'in'", "", "", "'['", "']'", "'{'",
		"'}'", "'('", "')'", "'!'", "':'", "';'",
	}
	staticData.SymbolicNames = []string{
		"", "Keyword_Surface", "Keyword_Rule", "Keyword_Condition", "Keyword_Sequence",
		"Keyword_Block", "Keyword_Bandlands", "Keyword_AbovePreliminarySurface",
		"Keyword_Biome", "Keyword_Hole", "Keyword_Steep", "Keyword_StoneDepth",
		"Keyword_Freezing", "Keyword_Temperature", "Keyword_VerticalGradient",
		"Keyword_Water", "Keyword_YAbove", "Keyword_Namespace", "Keyword_If",
		"Keyword_Else", "Keyword_In", "WS", "NL", "SquareOpen", "SquareClose",
		"CurlyOpen", "CurlyClose", "RoundOpen", "RoundClose", "Bang", "Colon",
		"SemiColon", "Identifier",
	}
	staticData.RuleNames = []string{
		"namespaceDeclaration", "statement", "mmsFile", "surfaceDeclaration",
		"surfaceInline", "surfaceDefinition", "surfaceRuleDeclaration", "surfaceRule",
		"surfaceRule_Conditional", "surfaceRule_Block", "surfaceRule_Sequence",
		"reference",
	}
	staticData.PredictionContextCache = antlr.NewPredictionContextCache()
	staticData.serializedATN = []int32{
		4, 1, 32, 122, 2, 0, 7, 0, 2, 1, 7, 1, 2, 2, 7, 2, 2, 3, 7, 3, 2, 4, 7,
		4, 2, 5, 7, 5, 2, 6, 7, 6, 2, 7, 7, 7, 2, 8, 7, 8, 2, 9, 7, 9, 2, 10, 7,
		10, 2, 11, 7, 11, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 2, 1, 2, 5, 2,
		33, 8, 2, 10, 2, 12, 2, 36, 9, 2, 1, 2, 1, 2, 4, 2, 40, 8, 2, 11, 2, 12,
		2, 41, 5, 2, 44, 8, 2, 10, 2, 12, 2, 47, 9, 2, 1, 2, 3, 2, 50, 8, 2, 1,
		2, 1, 2, 1, 3, 1, 3, 1, 3, 1, 3, 1, 4, 1, 4, 1, 4, 1, 5, 1, 5, 4, 5, 63,
		8, 5, 11, 5, 12, 5, 64, 1, 5, 1, 5, 4, 5, 69, 8, 5, 11, 5, 12, 5, 70, 5,
		5, 73, 8, 5, 10, 5, 12, 5, 76, 9, 5, 1, 5, 1, 5, 1, 6, 1, 6, 1, 6, 1, 6,
		1, 7, 1, 7, 1, 7, 3, 7, 87, 8, 7, 1, 8, 1, 8, 1, 8, 1, 8, 1, 9, 1, 9, 1,
		9, 1, 10, 1, 10, 1, 10, 5, 10, 99, 8, 10, 10, 10, 12, 10, 102, 9, 10, 1,
		10, 1, 10, 5, 10, 106, 8, 10, 10, 10, 12, 10, 109, 9, 10, 5, 10, 111, 8,
		10, 10, 10, 12, 10, 114, 9, 10, 1, 10, 1, 10, 1, 11, 1, 11, 1, 11, 1, 11,
		1, 11, 0, 0, 12, 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 0, 0, 121,
		0, 24, 1, 0, 0, 0, 2, 28, 1, 0, 0, 0, 4, 30, 1, 0, 0, 0, 6, 53, 1, 0, 0,
		0, 8, 57, 1, 0, 0, 0, 10, 60, 1, 0, 0, 0, 12, 79, 1, 0, 0, 0, 14, 86, 1,
		0, 0, 0, 16, 88, 1, 0, 0, 0, 18, 92, 1, 0, 0, 0, 20, 95, 1, 0, 0, 0, 22,
		117, 1, 0, 0, 0, 24, 25, 5, 17, 0, 0, 25, 26, 5, 32, 0, 0, 26, 27, 5, 31,
		0, 0, 27, 1, 1, 0, 0, 0, 28, 29, 3, 6, 3, 0, 29, 3, 1, 0, 0, 0, 30, 34,
		3, 0, 0, 0, 31, 33, 5, 22, 0, 0, 32, 31, 1, 0, 0, 0, 33, 36, 1, 0, 0, 0,
		34, 32, 1, 0, 0, 0, 34, 35, 1, 0, 0, 0, 35, 45, 1, 0, 0, 0, 36, 34, 1,
		0, 0, 0, 37, 39, 3, 2, 1, 0, 38, 40, 5, 22, 0, 0, 39, 38, 1, 0, 0, 0, 40,
		41, 1, 0, 0, 0, 41, 39, 1, 0, 0, 0, 41, 42, 1, 0, 0, 0, 42, 44, 1, 0, 0,
		0, 43, 37, 1, 0, 0, 0, 44, 47, 1, 0, 0, 0, 45, 43, 1, 0, 0, 0, 45, 46,
		1, 0, 0, 0, 46, 49, 1, 0, 0, 0, 47, 45, 1, 0, 0, 0, 48, 50, 3, 2, 1, 0,
		49, 48, 1, 0, 0, 0, 49, 50, 1, 0, 0, 0, 50, 51, 1, 0, 0, 0, 51, 52, 5,
		0, 0, 1, 52, 5, 1, 0, 0, 0, 53, 54, 5, 1, 0, 0, 54, 55, 5, 32, 0, 0, 55,
		56, 3, 10, 5, 0, 56, 7, 1, 0, 0, 0, 57, 58, 5, 1, 0, 0, 58, 59, 3, 10,
		5, 0, 59, 9, 1, 0, 0, 0, 60, 62, 5, 25, 0, 0, 61, 63, 5, 22, 0, 0, 62,
		61, 1, 0, 0, 0, 63, 64, 1, 0, 0, 0, 64, 62, 1, 0, 0, 0, 64, 65, 1, 0, 0,
		0, 65, 74, 1, 0, 0, 0, 66, 68, 3, 12, 6, 0, 67, 69, 5, 22, 0, 0, 68, 67,
		1, 0, 0, 0, 69, 70, 1, 0, 0, 0, 70, 68, 1, 0, 0, 0, 70, 71, 1, 0, 0, 0,
		71, 73, 1, 0, 0, 0, 72, 66, 1, 0, 0, 0, 73, 76, 1, 0, 0, 0, 74, 72, 1,
		0, 0, 0, 74, 75, 1, 0, 0, 0, 75, 77, 1, 0, 0, 0, 76, 74, 1, 0, 0, 0, 77,
		78, 5, 26, 0, 0, 78, 11, 1, 0, 0, 0, 79, 80, 5, 2, 0, 0, 80, 81, 5, 32,
		0, 0, 81, 82, 3, 14, 7, 0, 82, 13, 1, 0, 0, 0, 83, 87, 3, 16, 8, 0, 84,
		87, 3, 18, 9, 0, 85, 87, 3, 20, 10, 0, 86, 83, 1, 0, 0, 0, 86, 84, 1, 0,
		0, 0, 86, 85, 1, 0, 0, 0, 87, 15, 1, 0, 0, 0, 88, 89, 5, 18, 0, 0, 89,
		90, 5, 23, 0, 0, 90, 91, 5, 24, 0, 0, 91, 17, 1, 0, 0, 0, 92, 93, 5, 5,
		0, 0, 93, 94, 3, 22, 11, 0, 94, 19, 1, 0, 0, 0, 95, 96, 5, 4, 0, 0, 96,
		100, 5, 23, 0, 0, 97, 99, 5, 22, 0, 0, 98, 97, 1, 0, 0, 0, 99, 102, 1,
		0, 0, 0, 100, 98, 1, 0, 0, 0, 100, 101, 1, 0, 0, 0, 101, 112, 1, 0, 0,
		0, 102, 100, 1, 0, 0, 0, 103, 107, 3, 14, 7, 0, 104, 106, 5, 22, 0, 0,
		105, 104, 1, 0, 0, 0, 106, 109, 1, 0, 0, 0, 107, 105, 1, 0, 0, 0, 107,
		108, 1, 0, 0, 0, 108, 111, 1, 0, 0, 0, 109, 107, 1, 0, 0, 0, 110, 103,
		1, 0, 0, 0, 111, 114, 1, 0, 0, 0, 112, 110, 1, 0, 0, 0, 112, 113, 1, 0,
		0, 0, 113, 115, 1, 0, 0, 0, 114, 112, 1, 0, 0, 0, 115, 116, 5, 24, 0, 0,
		116, 21, 1, 0, 0, 0, 117, 118, 5, 32, 0, 0, 118, 119, 5, 30, 0, 0, 119,
		120, 5, 32, 0, 0, 120, 23, 1, 0, 0, 0, 11, 34, 41, 45, 49, 64, 70, 74,
		86, 100, 107, 112,
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

// MMSParserInit initializes any static state used to implement MMSParser. By default the
// static state used to implement the parser is lazily initialized during the first call to
// NewMMSParser(). You can call this function if you wish to initialize the static state ahead
// of time.
func MMSParserInit() {
	staticData := &MMSParserParserStaticData
	staticData.once.Do(mmsparserParserInit)
}

// NewMMSParser produces a new parser instance for the optional input antlr.TokenStream.
func NewMMSParser(input antlr.TokenStream) *MMSParser {
	MMSParserInit()
	this := new(MMSParser)
	this.BaseParser = antlr.NewBaseParser(input)
	staticData := &MMSParserParserStaticData
	this.Interpreter = antlr.NewParserATNSimulator(this, staticData.atn, staticData.decisionToDFA, staticData.PredictionContextCache)
	this.RuleNames = staticData.RuleNames
	this.LiteralNames = staticData.LiteralNames
	this.SymbolicNames = staticData.SymbolicNames
	this.GrammarFileName = "MMSParser.g4"

	return this
}

// MMSParser tokens.
const (
	MMSParserEOF                             = antlr.TokenEOF
	MMSParserKeyword_Surface                 = 1
	MMSParserKeyword_Rule                    = 2
	MMSParserKeyword_Condition               = 3
	MMSParserKeyword_Sequence                = 4
	MMSParserKeyword_Block                   = 5
	MMSParserKeyword_Bandlands               = 6
	MMSParserKeyword_AbovePreliminarySurface = 7
	MMSParserKeyword_Biome                   = 8
	MMSParserKeyword_Hole                    = 9
	MMSParserKeyword_Steep                   = 10
	MMSParserKeyword_StoneDepth              = 11
	MMSParserKeyword_Freezing                = 12
	MMSParserKeyword_Temperature             = 13
	MMSParserKeyword_VerticalGradient        = 14
	MMSParserKeyword_Water                   = 15
	MMSParserKeyword_YAbove                  = 16
	MMSParserKeyword_Namespace               = 17
	MMSParserKeyword_If                      = 18
	MMSParserKeyword_Else                    = 19
	MMSParserKeyword_In                      = 20
	MMSParserWS                              = 21
	MMSParserNL                              = 22
	MMSParserSquareOpen                      = 23
	MMSParserSquareClose                     = 24
	MMSParserCurlyOpen                       = 25
	MMSParserCurlyClose                      = 26
	MMSParserRoundOpen                       = 27
	MMSParserRoundClose                      = 28
	MMSParserBang                            = 29
	MMSParserColon                           = 30
	MMSParserSemiColon                       = 31
	MMSParserIdentifier                      = 32
)

// MMSParser rules.
const (
	MMSParserRULE_namespaceDeclaration    = 0
	MMSParserRULE_statement               = 1
	MMSParserRULE_mmsFile                 = 2
	MMSParserRULE_surfaceDeclaration      = 3
	MMSParserRULE_surfaceInline           = 4
	MMSParserRULE_surfaceDefinition       = 5
	MMSParserRULE_surfaceRuleDeclaration  = 6
	MMSParserRULE_surfaceRule             = 7
	MMSParserRULE_surfaceRule_Conditional = 8
	MMSParserRULE_surfaceRule_Block       = 9
	MMSParserRULE_surfaceRule_Sequence    = 10
	MMSParserRULE_reference               = 11
)

// INamespaceDeclarationContext is an interface to support dynamic dispatch.
type INamespaceDeclarationContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Getter signatures
	Keyword_Namespace() antlr.TerminalNode
	Identifier() antlr.TerminalNode
	SemiColon() antlr.TerminalNode

	// IsNamespaceDeclarationContext differentiates from other interfaces.
	IsNamespaceDeclarationContext()
}

type NamespaceDeclarationContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyNamespaceDeclarationContext() *NamespaceDeclarationContext {
	var p = new(NamespaceDeclarationContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = MMSParserRULE_namespaceDeclaration
	return p
}

func InitEmptyNamespaceDeclarationContext(p *NamespaceDeclarationContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = MMSParserRULE_namespaceDeclaration
}

func (*NamespaceDeclarationContext) IsNamespaceDeclarationContext() {}

func NewNamespaceDeclarationContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *NamespaceDeclarationContext {
	var p = new(NamespaceDeclarationContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = MMSParserRULE_namespaceDeclaration

	return p
}

func (s *NamespaceDeclarationContext) GetParser() antlr.Parser { return s.parser }

func (s *NamespaceDeclarationContext) Keyword_Namespace() antlr.TerminalNode {
	return s.GetToken(MMSParserKeyword_Namespace, 0)
}

func (s *NamespaceDeclarationContext) Identifier() antlr.TerminalNode {
	return s.GetToken(MMSParserIdentifier, 0)
}

func (s *NamespaceDeclarationContext) SemiColon() antlr.TerminalNode {
	return s.GetToken(MMSParserSemiColon, 0)
}

func (s *NamespaceDeclarationContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *NamespaceDeclarationContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *NamespaceDeclarationContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(MMSParserListener); ok {
		listenerT.EnterNamespaceDeclaration(s)
	}
}

func (s *NamespaceDeclarationContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(MMSParserListener); ok {
		listenerT.ExitNamespaceDeclaration(s)
	}
}

func (p *MMSParser) NamespaceDeclaration() (localctx INamespaceDeclarationContext) {
	localctx = NewNamespaceDeclarationContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 0, MMSParserRULE_namespaceDeclaration)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(24)
		p.Match(MMSParserKeyword_Namespace)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(25)
		p.Match(MMSParserIdentifier)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(26)
		p.Match(MMSParserSemiColon)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IStatementContext is an interface to support dynamic dispatch.
type IStatementContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Getter signatures
	SurfaceDeclaration() ISurfaceDeclarationContext

	// IsStatementContext differentiates from other interfaces.
	IsStatementContext()
}

type StatementContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyStatementContext() *StatementContext {
	var p = new(StatementContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = MMSParserRULE_statement
	return p
}

func InitEmptyStatementContext(p *StatementContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = MMSParserRULE_statement
}

func (*StatementContext) IsStatementContext() {}

func NewStatementContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *StatementContext {
	var p = new(StatementContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = MMSParserRULE_statement

	return p
}

func (s *StatementContext) GetParser() antlr.Parser { return s.parser }

func (s *StatementContext) SurfaceDeclaration() ISurfaceDeclarationContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ISurfaceDeclarationContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(ISurfaceDeclarationContext)
}

func (s *StatementContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *StatementContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *StatementContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(MMSParserListener); ok {
		listenerT.EnterStatement(s)
	}
}

func (s *StatementContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(MMSParserListener); ok {
		listenerT.ExitStatement(s)
	}
}

func (p *MMSParser) Statement() (localctx IStatementContext) {
	localctx = NewStatementContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 2, MMSParserRULE_statement)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(28)
		p.SurfaceDeclaration()
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IMmsFileContext is an interface to support dynamic dispatch.
type IMmsFileContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Getter signatures
	NamespaceDeclaration() INamespaceDeclarationContext
	EOF() antlr.TerminalNode
	AllNL() []antlr.TerminalNode
	NL(i int) antlr.TerminalNode
	AllStatement() []IStatementContext
	Statement(i int) IStatementContext

	// IsMmsFileContext differentiates from other interfaces.
	IsMmsFileContext()
}

type MmsFileContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyMmsFileContext() *MmsFileContext {
	var p = new(MmsFileContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = MMSParserRULE_mmsFile
	return p
}

func InitEmptyMmsFileContext(p *MmsFileContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = MMSParserRULE_mmsFile
}

func (*MmsFileContext) IsMmsFileContext() {}

func NewMmsFileContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *MmsFileContext {
	var p = new(MmsFileContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = MMSParserRULE_mmsFile

	return p
}

func (s *MmsFileContext) GetParser() antlr.Parser { return s.parser }

func (s *MmsFileContext) NamespaceDeclaration() INamespaceDeclarationContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(INamespaceDeclarationContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(INamespaceDeclarationContext)
}

func (s *MmsFileContext) EOF() antlr.TerminalNode {
	return s.GetToken(MMSParserEOF, 0)
}

func (s *MmsFileContext) AllNL() []antlr.TerminalNode {
	return s.GetTokens(MMSParserNL)
}

func (s *MmsFileContext) NL(i int) antlr.TerminalNode {
	return s.GetToken(MMSParserNL, i)
}

func (s *MmsFileContext) AllStatement() []IStatementContext {
	children := s.GetChildren()
	len := 0
	for _, ctx := range children {
		if _, ok := ctx.(IStatementContext); ok {
			len++
		}
	}

	tst := make([]IStatementContext, len)
	i := 0
	for _, ctx := range children {
		if t, ok := ctx.(IStatementContext); ok {
			tst[i] = t.(IStatementContext)
			i++
		}
	}

	return tst
}

func (s *MmsFileContext) Statement(i int) IStatementContext {
	var t antlr.RuleContext
	j := 0
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IStatementContext); ok {
			if j == i {
				t = ctx.(antlr.RuleContext)
				break
			}
			j++
		}
	}

	if t == nil {
		return nil
	}

	return t.(IStatementContext)
}

func (s *MmsFileContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *MmsFileContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *MmsFileContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(MMSParserListener); ok {
		listenerT.EnterMmsFile(s)
	}
}

func (s *MmsFileContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(MMSParserListener); ok {
		listenerT.ExitMmsFile(s)
	}
}

func (p *MMSParser) MmsFile() (localctx IMmsFileContext) {
	localctx = NewMmsFileContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 4, MMSParserRULE_mmsFile)
	var _la int

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(30)
		p.NamespaceDeclaration()
	}
	p.SetState(34)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_la = p.GetTokenStream().LA(1)

	for _la == MMSParserNL {
		{
			p.SetState(31)
			p.Match(MMSParserNL)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}

		p.SetState(36)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)
	}
	p.SetState(45)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_alt = p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 2, p.GetParserRuleContext())
	if p.HasError() {
		goto errorExit
	}
	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			{
				p.SetState(37)
				p.Statement()
			}
			p.SetState(39)
			p.GetErrorHandler().Sync(p)
			if p.HasError() {
				goto errorExit
			}
			_la = p.GetTokenStream().LA(1)

			for ok := true; ok; ok = _la == MMSParserNL {
				{
					p.SetState(38)
					p.Match(MMSParserNL)
					if p.HasError() {
						// Recognition error - abort rule
						goto errorExit
					}
				}

				p.SetState(41)
				p.GetErrorHandler().Sync(p)
				if p.HasError() {
					goto errorExit
				}
				_la = p.GetTokenStream().LA(1)
			}

		}
		p.SetState(47)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_alt = p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 2, p.GetParserRuleContext())
		if p.HasError() {
			goto errorExit
		}
	}
	p.SetState(49)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_la = p.GetTokenStream().LA(1)

	if _la == MMSParserKeyword_Surface {
		{
			p.SetState(48)
			p.Statement()
		}

	}
	{
		p.SetState(51)
		p.Match(MMSParserEOF)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// ISurfaceDeclarationContext is an interface to support dynamic dispatch.
type ISurfaceDeclarationContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Getter signatures
	Keyword_Surface() antlr.TerminalNode
	Identifier() antlr.TerminalNode
	SurfaceDefinition() ISurfaceDefinitionContext

	// IsSurfaceDeclarationContext differentiates from other interfaces.
	IsSurfaceDeclarationContext()
}

type SurfaceDeclarationContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptySurfaceDeclarationContext() *SurfaceDeclarationContext {
	var p = new(SurfaceDeclarationContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = MMSParserRULE_surfaceDeclaration
	return p
}

func InitEmptySurfaceDeclarationContext(p *SurfaceDeclarationContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = MMSParserRULE_surfaceDeclaration
}

func (*SurfaceDeclarationContext) IsSurfaceDeclarationContext() {}

func NewSurfaceDeclarationContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *SurfaceDeclarationContext {
	var p = new(SurfaceDeclarationContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = MMSParserRULE_surfaceDeclaration

	return p
}

func (s *SurfaceDeclarationContext) GetParser() antlr.Parser { return s.parser }

func (s *SurfaceDeclarationContext) Keyword_Surface() antlr.TerminalNode {
	return s.GetToken(MMSParserKeyword_Surface, 0)
}

func (s *SurfaceDeclarationContext) Identifier() antlr.TerminalNode {
	return s.GetToken(MMSParserIdentifier, 0)
}

func (s *SurfaceDeclarationContext) SurfaceDefinition() ISurfaceDefinitionContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ISurfaceDefinitionContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(ISurfaceDefinitionContext)
}

func (s *SurfaceDeclarationContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *SurfaceDeclarationContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *SurfaceDeclarationContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(MMSParserListener); ok {
		listenerT.EnterSurfaceDeclaration(s)
	}
}

func (s *SurfaceDeclarationContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(MMSParserListener); ok {
		listenerT.ExitSurfaceDeclaration(s)
	}
}

func (p *MMSParser) SurfaceDeclaration() (localctx ISurfaceDeclarationContext) {
	localctx = NewSurfaceDeclarationContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 6, MMSParserRULE_surfaceDeclaration)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(53)
		p.Match(MMSParserKeyword_Surface)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(54)
		p.Match(MMSParserIdentifier)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(55)
		p.SurfaceDefinition()
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// ISurfaceInlineContext is an interface to support dynamic dispatch.
type ISurfaceInlineContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Getter signatures
	Keyword_Surface() antlr.TerminalNode
	SurfaceDefinition() ISurfaceDefinitionContext

	// IsSurfaceInlineContext differentiates from other interfaces.
	IsSurfaceInlineContext()
}

type SurfaceInlineContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptySurfaceInlineContext() *SurfaceInlineContext {
	var p = new(SurfaceInlineContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = MMSParserRULE_surfaceInline
	return p
}

func InitEmptySurfaceInlineContext(p *SurfaceInlineContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = MMSParserRULE_surfaceInline
}

func (*SurfaceInlineContext) IsSurfaceInlineContext() {}

func NewSurfaceInlineContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *SurfaceInlineContext {
	var p = new(SurfaceInlineContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = MMSParserRULE_surfaceInline

	return p
}

func (s *SurfaceInlineContext) GetParser() antlr.Parser { return s.parser }

func (s *SurfaceInlineContext) Keyword_Surface() antlr.TerminalNode {
	return s.GetToken(MMSParserKeyword_Surface, 0)
}

func (s *SurfaceInlineContext) SurfaceDefinition() ISurfaceDefinitionContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ISurfaceDefinitionContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(ISurfaceDefinitionContext)
}

func (s *SurfaceInlineContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *SurfaceInlineContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *SurfaceInlineContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(MMSParserListener); ok {
		listenerT.EnterSurfaceInline(s)
	}
}

func (s *SurfaceInlineContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(MMSParserListener); ok {
		listenerT.ExitSurfaceInline(s)
	}
}

func (p *MMSParser) SurfaceInline() (localctx ISurfaceInlineContext) {
	localctx = NewSurfaceInlineContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 8, MMSParserRULE_surfaceInline)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(57)
		p.Match(MMSParserKeyword_Surface)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(58)
		p.SurfaceDefinition()
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// ISurfaceDefinitionContext is an interface to support dynamic dispatch.
type ISurfaceDefinitionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Getter signatures
	CurlyOpen() antlr.TerminalNode
	CurlyClose() antlr.TerminalNode
	AllNL() []antlr.TerminalNode
	NL(i int) antlr.TerminalNode
	AllSurfaceRuleDeclaration() []ISurfaceRuleDeclarationContext
	SurfaceRuleDeclaration(i int) ISurfaceRuleDeclarationContext

	// IsSurfaceDefinitionContext differentiates from other interfaces.
	IsSurfaceDefinitionContext()
}

type SurfaceDefinitionContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptySurfaceDefinitionContext() *SurfaceDefinitionContext {
	var p = new(SurfaceDefinitionContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = MMSParserRULE_surfaceDefinition
	return p
}

func InitEmptySurfaceDefinitionContext(p *SurfaceDefinitionContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = MMSParserRULE_surfaceDefinition
}

func (*SurfaceDefinitionContext) IsSurfaceDefinitionContext() {}

func NewSurfaceDefinitionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *SurfaceDefinitionContext {
	var p = new(SurfaceDefinitionContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = MMSParserRULE_surfaceDefinition

	return p
}

func (s *SurfaceDefinitionContext) GetParser() antlr.Parser { return s.parser }

func (s *SurfaceDefinitionContext) CurlyOpen() antlr.TerminalNode {
	return s.GetToken(MMSParserCurlyOpen, 0)
}

func (s *SurfaceDefinitionContext) CurlyClose() antlr.TerminalNode {
	return s.GetToken(MMSParserCurlyClose, 0)
}

func (s *SurfaceDefinitionContext) AllNL() []antlr.TerminalNode {
	return s.GetTokens(MMSParserNL)
}

func (s *SurfaceDefinitionContext) NL(i int) antlr.TerminalNode {
	return s.GetToken(MMSParserNL, i)
}

func (s *SurfaceDefinitionContext) AllSurfaceRuleDeclaration() []ISurfaceRuleDeclarationContext {
	children := s.GetChildren()
	len := 0
	for _, ctx := range children {
		if _, ok := ctx.(ISurfaceRuleDeclarationContext); ok {
			len++
		}
	}

	tst := make([]ISurfaceRuleDeclarationContext, len)
	i := 0
	for _, ctx := range children {
		if t, ok := ctx.(ISurfaceRuleDeclarationContext); ok {
			tst[i] = t.(ISurfaceRuleDeclarationContext)
			i++
		}
	}

	return tst
}

func (s *SurfaceDefinitionContext) SurfaceRuleDeclaration(i int) ISurfaceRuleDeclarationContext {
	var t antlr.RuleContext
	j := 0
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ISurfaceRuleDeclarationContext); ok {
			if j == i {
				t = ctx.(antlr.RuleContext)
				break
			}
			j++
		}
	}

	if t == nil {
		return nil
	}

	return t.(ISurfaceRuleDeclarationContext)
}

func (s *SurfaceDefinitionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *SurfaceDefinitionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *SurfaceDefinitionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(MMSParserListener); ok {
		listenerT.EnterSurfaceDefinition(s)
	}
}

func (s *SurfaceDefinitionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(MMSParserListener); ok {
		listenerT.ExitSurfaceDefinition(s)
	}
}

func (p *MMSParser) SurfaceDefinition() (localctx ISurfaceDefinitionContext) {
	localctx = NewSurfaceDefinitionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 10, MMSParserRULE_surfaceDefinition)
	var _la int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(60)
		p.Match(MMSParserCurlyOpen)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	p.SetState(62)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_la = p.GetTokenStream().LA(1)

	for ok := true; ok; ok = _la == MMSParserNL {
		{
			p.SetState(61)
			p.Match(MMSParserNL)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}

		p.SetState(64)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)
	}
	p.SetState(74)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_la = p.GetTokenStream().LA(1)

	for _la == MMSParserKeyword_Rule {
		{
			p.SetState(66)
			p.SurfaceRuleDeclaration()
		}
		p.SetState(68)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		for ok := true; ok; ok = _la == MMSParserNL {
			{
				p.SetState(67)
				p.Match(MMSParserNL)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

			p.SetState(70)
			p.GetErrorHandler().Sync(p)
			if p.HasError() {
				goto errorExit
			}
			_la = p.GetTokenStream().LA(1)
		}

		p.SetState(76)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)
	}
	{
		p.SetState(77)
		p.Match(MMSParserCurlyClose)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// ISurfaceRuleDeclarationContext is an interface to support dynamic dispatch.
type ISurfaceRuleDeclarationContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Getter signatures
	Keyword_Rule() antlr.TerminalNode
	Identifier() antlr.TerminalNode
	SurfaceRule() ISurfaceRuleContext

	// IsSurfaceRuleDeclarationContext differentiates from other interfaces.
	IsSurfaceRuleDeclarationContext()
}

type SurfaceRuleDeclarationContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptySurfaceRuleDeclarationContext() *SurfaceRuleDeclarationContext {
	var p = new(SurfaceRuleDeclarationContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = MMSParserRULE_surfaceRuleDeclaration
	return p
}

func InitEmptySurfaceRuleDeclarationContext(p *SurfaceRuleDeclarationContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = MMSParserRULE_surfaceRuleDeclaration
}

func (*SurfaceRuleDeclarationContext) IsSurfaceRuleDeclarationContext() {}

func NewSurfaceRuleDeclarationContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *SurfaceRuleDeclarationContext {
	var p = new(SurfaceRuleDeclarationContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = MMSParserRULE_surfaceRuleDeclaration

	return p
}

func (s *SurfaceRuleDeclarationContext) GetParser() antlr.Parser { return s.parser }

func (s *SurfaceRuleDeclarationContext) Keyword_Rule() antlr.TerminalNode {
	return s.GetToken(MMSParserKeyword_Rule, 0)
}

func (s *SurfaceRuleDeclarationContext) Identifier() antlr.TerminalNode {
	return s.GetToken(MMSParserIdentifier, 0)
}

func (s *SurfaceRuleDeclarationContext) SurfaceRule() ISurfaceRuleContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ISurfaceRuleContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(ISurfaceRuleContext)
}

func (s *SurfaceRuleDeclarationContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *SurfaceRuleDeclarationContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *SurfaceRuleDeclarationContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(MMSParserListener); ok {
		listenerT.EnterSurfaceRuleDeclaration(s)
	}
}

func (s *SurfaceRuleDeclarationContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(MMSParserListener); ok {
		listenerT.ExitSurfaceRuleDeclaration(s)
	}
}

func (p *MMSParser) SurfaceRuleDeclaration() (localctx ISurfaceRuleDeclarationContext) {
	localctx = NewSurfaceRuleDeclarationContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 12, MMSParserRULE_surfaceRuleDeclaration)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(79)
		p.Match(MMSParserKeyword_Rule)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(80)
		p.Match(MMSParserIdentifier)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(81)
		p.SurfaceRule()
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// ISurfaceRuleContext is an interface to support dynamic dispatch.
type ISurfaceRuleContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Getter signatures
	SurfaceRule_Conditional() ISurfaceRule_ConditionalContext
	SurfaceRule_Block() ISurfaceRule_BlockContext
	SurfaceRule_Sequence() ISurfaceRule_SequenceContext

	// IsSurfaceRuleContext differentiates from other interfaces.
	IsSurfaceRuleContext()
}

type SurfaceRuleContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptySurfaceRuleContext() *SurfaceRuleContext {
	var p = new(SurfaceRuleContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = MMSParserRULE_surfaceRule
	return p
}

func InitEmptySurfaceRuleContext(p *SurfaceRuleContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = MMSParserRULE_surfaceRule
}

func (*SurfaceRuleContext) IsSurfaceRuleContext() {}

func NewSurfaceRuleContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *SurfaceRuleContext {
	var p = new(SurfaceRuleContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = MMSParserRULE_surfaceRule

	return p
}

func (s *SurfaceRuleContext) GetParser() antlr.Parser { return s.parser }

func (s *SurfaceRuleContext) SurfaceRule_Conditional() ISurfaceRule_ConditionalContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ISurfaceRule_ConditionalContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(ISurfaceRule_ConditionalContext)
}

func (s *SurfaceRuleContext) SurfaceRule_Block() ISurfaceRule_BlockContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ISurfaceRule_BlockContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(ISurfaceRule_BlockContext)
}

func (s *SurfaceRuleContext) SurfaceRule_Sequence() ISurfaceRule_SequenceContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ISurfaceRule_SequenceContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(ISurfaceRule_SequenceContext)
}

func (s *SurfaceRuleContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *SurfaceRuleContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *SurfaceRuleContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(MMSParserListener); ok {
		listenerT.EnterSurfaceRule(s)
	}
}

func (s *SurfaceRuleContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(MMSParserListener); ok {
		listenerT.ExitSurfaceRule(s)
	}
}

func (p *MMSParser) SurfaceRule() (localctx ISurfaceRuleContext) {
	localctx = NewSurfaceRuleContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 14, MMSParserRULE_surfaceRule)
	p.SetState(86)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetTokenStream().LA(1) {
	case MMSParserKeyword_If:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(83)
			p.SurfaceRule_Conditional()
		}

	case MMSParserKeyword_Block:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(84)
			p.SurfaceRule_Block()
		}

	case MMSParserKeyword_Sequence:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(85)
			p.SurfaceRule_Sequence()
		}

	default:
		p.SetError(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
		goto errorExit
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// ISurfaceRule_ConditionalContext is an interface to support dynamic dispatch.
type ISurfaceRule_ConditionalContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Getter signatures
	Keyword_If() antlr.TerminalNode
	SquareOpen() antlr.TerminalNode
	SquareClose() antlr.TerminalNode

	// IsSurfaceRule_ConditionalContext differentiates from other interfaces.
	IsSurfaceRule_ConditionalContext()
}

type SurfaceRule_ConditionalContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptySurfaceRule_ConditionalContext() *SurfaceRule_ConditionalContext {
	var p = new(SurfaceRule_ConditionalContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = MMSParserRULE_surfaceRule_Conditional
	return p
}

func InitEmptySurfaceRule_ConditionalContext(p *SurfaceRule_ConditionalContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = MMSParserRULE_surfaceRule_Conditional
}

func (*SurfaceRule_ConditionalContext) IsSurfaceRule_ConditionalContext() {}

func NewSurfaceRule_ConditionalContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *SurfaceRule_ConditionalContext {
	var p = new(SurfaceRule_ConditionalContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = MMSParserRULE_surfaceRule_Conditional

	return p
}

func (s *SurfaceRule_ConditionalContext) GetParser() antlr.Parser { return s.parser }

func (s *SurfaceRule_ConditionalContext) Keyword_If() antlr.TerminalNode {
	return s.GetToken(MMSParserKeyword_If, 0)
}

func (s *SurfaceRule_ConditionalContext) SquareOpen() antlr.TerminalNode {
	return s.GetToken(MMSParserSquareOpen, 0)
}

func (s *SurfaceRule_ConditionalContext) SquareClose() antlr.TerminalNode {
	return s.GetToken(MMSParserSquareClose, 0)
}

func (s *SurfaceRule_ConditionalContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *SurfaceRule_ConditionalContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *SurfaceRule_ConditionalContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(MMSParserListener); ok {
		listenerT.EnterSurfaceRule_Conditional(s)
	}
}

func (s *SurfaceRule_ConditionalContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(MMSParserListener); ok {
		listenerT.ExitSurfaceRule_Conditional(s)
	}
}

func (p *MMSParser) SurfaceRule_Conditional() (localctx ISurfaceRule_ConditionalContext) {
	localctx = NewSurfaceRule_ConditionalContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 16, MMSParserRULE_surfaceRule_Conditional)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(88)
		p.Match(MMSParserKeyword_If)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(89)
		p.Match(MMSParserSquareOpen)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(90)
		p.Match(MMSParserSquareClose)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// ISurfaceRule_BlockContext is an interface to support dynamic dispatch.
type ISurfaceRule_BlockContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Getter signatures
	Keyword_Block() antlr.TerminalNode
	Reference() IReferenceContext

	// IsSurfaceRule_BlockContext differentiates from other interfaces.
	IsSurfaceRule_BlockContext()
}

type SurfaceRule_BlockContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptySurfaceRule_BlockContext() *SurfaceRule_BlockContext {
	var p = new(SurfaceRule_BlockContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = MMSParserRULE_surfaceRule_Block
	return p
}

func InitEmptySurfaceRule_BlockContext(p *SurfaceRule_BlockContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = MMSParserRULE_surfaceRule_Block
}

func (*SurfaceRule_BlockContext) IsSurfaceRule_BlockContext() {}

func NewSurfaceRule_BlockContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *SurfaceRule_BlockContext {
	var p = new(SurfaceRule_BlockContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = MMSParserRULE_surfaceRule_Block

	return p
}

func (s *SurfaceRule_BlockContext) GetParser() antlr.Parser { return s.parser }

func (s *SurfaceRule_BlockContext) Keyword_Block() antlr.TerminalNode {
	return s.GetToken(MMSParserKeyword_Block, 0)
}

func (s *SurfaceRule_BlockContext) Reference() IReferenceContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IReferenceContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IReferenceContext)
}

func (s *SurfaceRule_BlockContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *SurfaceRule_BlockContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *SurfaceRule_BlockContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(MMSParserListener); ok {
		listenerT.EnterSurfaceRule_Block(s)
	}
}

func (s *SurfaceRule_BlockContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(MMSParserListener); ok {
		listenerT.ExitSurfaceRule_Block(s)
	}
}

func (p *MMSParser) SurfaceRule_Block() (localctx ISurfaceRule_BlockContext) {
	localctx = NewSurfaceRule_BlockContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 18, MMSParserRULE_surfaceRule_Block)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(92)
		p.Match(MMSParserKeyword_Block)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(93)
		p.Reference()
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// ISurfaceRule_SequenceContext is an interface to support dynamic dispatch.
type ISurfaceRule_SequenceContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Getter signatures
	Keyword_Sequence() antlr.TerminalNode
	SquareOpen() antlr.TerminalNode
	SquareClose() antlr.TerminalNode
	AllNL() []antlr.TerminalNode
	NL(i int) antlr.TerminalNode
	AllSurfaceRule() []ISurfaceRuleContext
	SurfaceRule(i int) ISurfaceRuleContext

	// IsSurfaceRule_SequenceContext differentiates from other interfaces.
	IsSurfaceRule_SequenceContext()
}

type SurfaceRule_SequenceContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptySurfaceRule_SequenceContext() *SurfaceRule_SequenceContext {
	var p = new(SurfaceRule_SequenceContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = MMSParserRULE_surfaceRule_Sequence
	return p
}

func InitEmptySurfaceRule_SequenceContext(p *SurfaceRule_SequenceContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = MMSParserRULE_surfaceRule_Sequence
}

func (*SurfaceRule_SequenceContext) IsSurfaceRule_SequenceContext() {}

func NewSurfaceRule_SequenceContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *SurfaceRule_SequenceContext {
	var p = new(SurfaceRule_SequenceContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = MMSParserRULE_surfaceRule_Sequence

	return p
}

func (s *SurfaceRule_SequenceContext) GetParser() antlr.Parser { return s.parser }

func (s *SurfaceRule_SequenceContext) Keyword_Sequence() antlr.TerminalNode {
	return s.GetToken(MMSParserKeyword_Sequence, 0)
}

func (s *SurfaceRule_SequenceContext) SquareOpen() antlr.TerminalNode {
	return s.GetToken(MMSParserSquareOpen, 0)
}

func (s *SurfaceRule_SequenceContext) SquareClose() antlr.TerminalNode {
	return s.GetToken(MMSParserSquareClose, 0)
}

func (s *SurfaceRule_SequenceContext) AllNL() []antlr.TerminalNode {
	return s.GetTokens(MMSParserNL)
}

func (s *SurfaceRule_SequenceContext) NL(i int) antlr.TerminalNode {
	return s.GetToken(MMSParserNL, i)
}

func (s *SurfaceRule_SequenceContext) AllSurfaceRule() []ISurfaceRuleContext {
	children := s.GetChildren()
	len := 0
	for _, ctx := range children {
		if _, ok := ctx.(ISurfaceRuleContext); ok {
			len++
		}
	}

	tst := make([]ISurfaceRuleContext, len)
	i := 0
	for _, ctx := range children {
		if t, ok := ctx.(ISurfaceRuleContext); ok {
			tst[i] = t.(ISurfaceRuleContext)
			i++
		}
	}

	return tst
}

func (s *SurfaceRule_SequenceContext) SurfaceRule(i int) ISurfaceRuleContext {
	var t antlr.RuleContext
	j := 0
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ISurfaceRuleContext); ok {
			if j == i {
				t = ctx.(antlr.RuleContext)
				break
			}
			j++
		}
	}

	if t == nil {
		return nil
	}

	return t.(ISurfaceRuleContext)
}

func (s *SurfaceRule_SequenceContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *SurfaceRule_SequenceContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *SurfaceRule_SequenceContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(MMSParserListener); ok {
		listenerT.EnterSurfaceRule_Sequence(s)
	}
}

func (s *SurfaceRule_SequenceContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(MMSParserListener); ok {
		listenerT.ExitSurfaceRule_Sequence(s)
	}
}

func (p *MMSParser) SurfaceRule_Sequence() (localctx ISurfaceRule_SequenceContext) {
	localctx = NewSurfaceRule_SequenceContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 20, MMSParserRULE_surfaceRule_Sequence)
	var _la int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(95)
		p.Match(MMSParserKeyword_Sequence)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(96)
		p.Match(MMSParserSquareOpen)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	p.SetState(100)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_la = p.GetTokenStream().LA(1)

	for _la == MMSParserNL {
		{
			p.SetState(97)
			p.Match(MMSParserNL)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}

		p.SetState(102)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)
	}
	p.SetState(112)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_la = p.GetTokenStream().LA(1)

	for (int64(_la) & ^0x3f) == 0 && ((int64(1)<<_la)&262192) != 0 {
		{
			p.SetState(103)
			p.SurfaceRule()
		}
		p.SetState(107)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		for _la == MMSParserNL {
			{
				p.SetState(104)
				p.Match(MMSParserNL)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

			p.SetState(109)
			p.GetErrorHandler().Sync(p)
			if p.HasError() {
				goto errorExit
			}
			_la = p.GetTokenStream().LA(1)
		}

		p.SetState(114)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)
	}
	{
		p.SetState(115)
		p.Match(MMSParserSquareClose)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IReferenceContext is an interface to support dynamic dispatch.
type IReferenceContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Getter signatures
	AllIdentifier() []antlr.TerminalNode
	Identifier(i int) antlr.TerminalNode
	Colon() antlr.TerminalNode

	// IsReferenceContext differentiates from other interfaces.
	IsReferenceContext()
}

type ReferenceContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyReferenceContext() *ReferenceContext {
	var p = new(ReferenceContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = MMSParserRULE_reference
	return p
}

func InitEmptyReferenceContext(p *ReferenceContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = MMSParserRULE_reference
}

func (*ReferenceContext) IsReferenceContext() {}

func NewReferenceContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ReferenceContext {
	var p = new(ReferenceContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = MMSParserRULE_reference

	return p
}

func (s *ReferenceContext) GetParser() antlr.Parser { return s.parser }

func (s *ReferenceContext) AllIdentifier() []antlr.TerminalNode {
	return s.GetTokens(MMSParserIdentifier)
}

func (s *ReferenceContext) Identifier(i int) antlr.TerminalNode {
	return s.GetToken(MMSParserIdentifier, i)
}

func (s *ReferenceContext) Colon() antlr.TerminalNode {
	return s.GetToken(MMSParserColon, 0)
}

func (s *ReferenceContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ReferenceContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ReferenceContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(MMSParserListener); ok {
		listenerT.EnterReference(s)
	}
}

func (s *ReferenceContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(MMSParserListener); ok {
		listenerT.ExitReference(s)
	}
}

func (p *MMSParser) Reference() (localctx IReferenceContext) {
	localctx = NewReferenceContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 22, MMSParserRULE_reference)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(117)
		p.Match(MMSParserIdentifier)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(118)
		p.Match(MMSParserColon)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(119)
		p.Match(MMSParserIdentifier)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}
