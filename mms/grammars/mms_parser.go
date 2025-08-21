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
		"", "'namespace'", "'if'", "'else'", "'in'", "", "", "'['", "']'", "'{'",
		"'}'", "'('", "')'", "':'", "';'",
	}
	staticData.SymbolicNames = []string{
		"", "Keyword_Namespace", "Keyword_If", "Keyword_Else", "Keyword_In",
		"Whitespace", "NewLine", "SquareOpen", "SquareClose", "CurlyOpen", "CurlyClose",
		"RoundOpen", "RoundClose", "Colon", "SemiColon", "Identifier",
	}
	staticData.RuleNames = []string{
		"namespaceDeclaration", "mmsFile", "reference",
	}
	staticData.PredictionContextCache = antlr.NewPredictionContextCache()
	staticData.serializedATN = []int32{
		4, 1, 15, 24, 2, 0, 7, 0, 2, 1, 7, 1, 2, 2, 7, 2, 1, 0, 1, 0, 1, 0, 1,
		0, 1, 1, 1, 1, 5, 1, 13, 8, 1, 10, 1, 12, 1, 16, 9, 1, 1, 1, 1, 1, 1, 2,
		1, 2, 1, 2, 1, 2, 1, 2, 0, 0, 3, 0, 2, 4, 0, 0, 21, 0, 6, 1, 0, 0, 0, 2,
		10, 1, 0, 0, 0, 4, 19, 1, 0, 0, 0, 6, 7, 5, 1, 0, 0, 7, 8, 5, 15, 0, 0,
		8, 9, 5, 14, 0, 0, 9, 1, 1, 0, 0, 0, 10, 14, 3, 0, 0, 0, 11, 13, 5, 6,
		0, 0, 12, 11, 1, 0, 0, 0, 13, 16, 1, 0, 0, 0, 14, 12, 1, 0, 0, 0, 14, 15,
		1, 0, 0, 0, 15, 17, 1, 0, 0, 0, 16, 14, 1, 0, 0, 0, 17, 18, 5, 0, 0, 1,
		18, 3, 1, 0, 0, 0, 19, 20, 5, 15, 0, 0, 20, 21, 5, 13, 0, 0, 21, 22, 5,
		15, 0, 0, 22, 5, 1, 0, 0, 0, 1, 14,
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
	MMSParserEOF               = antlr.TokenEOF
	MMSParserKeyword_Namespace = 1
	MMSParserKeyword_If        = 2
	MMSParserKeyword_Else      = 3
	MMSParserKeyword_In        = 4
	MMSParserWhitespace        = 5
	MMSParserNewLine           = 6
	MMSParserSquareOpen        = 7
	MMSParserSquareClose       = 8
	MMSParserCurlyOpen         = 9
	MMSParserCurlyClose        = 10
	MMSParserRoundOpen         = 11
	MMSParserRoundClose        = 12
	MMSParserColon             = 13
	MMSParserSemiColon         = 14
	MMSParserIdentifier        = 15
)

// MMSParser rules.
const (
	MMSParserRULE_namespaceDeclaration = 0
	MMSParserRULE_mmsFile              = 1
	MMSParserRULE_reference            = 2
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
		p.SetState(6)
		p.Match(MMSParserKeyword_Namespace)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(7)
		p.Match(MMSParserIdentifier)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(8)
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

// IMmsFileContext is an interface to support dynamic dispatch.
type IMmsFileContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Getter signatures
	NamespaceDeclaration() INamespaceDeclarationContext
	EOF() antlr.TerminalNode
	AllNewLine() []antlr.TerminalNode
	NewLine(i int) antlr.TerminalNode

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

func (s *MmsFileContext) AllNewLine() []antlr.TerminalNode {
	return s.GetTokens(MMSParserNewLine)
}

func (s *MmsFileContext) NewLine(i int) antlr.TerminalNode {
	return s.GetToken(MMSParserNewLine, i)
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
	p.EnterRule(localctx, 2, MMSParserRULE_mmsFile)
	var _la int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(10)
		p.NamespaceDeclaration()
	}
	p.SetState(14)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_la = p.GetTokenStream().LA(1)

	for _la == MMSParserNewLine {
		{
			p.SetState(11)
			p.Match(MMSParserNewLine)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}

		p.SetState(16)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)
	}
	{
		p.SetState(17)
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
	p.EnterRule(localctx, 4, MMSParserRULE_reference)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(19)
		p.Match(MMSParserIdentifier)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(20)
		p.Match(MMSParserColon)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(21)
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
