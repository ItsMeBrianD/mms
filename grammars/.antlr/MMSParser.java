// Generated from /Users/brian/code/personal/mms/grammars/MMSParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MMSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Int=1, Float=2, Keyword_Surface=3, Keyword_Rule=4, Keyword_Condition=5, 
		Keyword_Sequence=6, Keyword_Block=7, Keyword_Bandlands=8, Keyword_AbovePreliminarySurface=9, 
		Keyword_Biome=10, Keyword_Hole=11, Keyword_Noise=12, Keyword_Steep=13, 
		Keyword_StoneDepth=14, Keyword_Freezing=15, Keyword_Temperature=16, Keyword_VerticalGradient=17, 
		Keyword_AboveWater=18, Keyword_YAbove=19, Keyword_Floor=20, Keyword_Ceiling=21, 
		Keyword_And=22, Keyword_Add=23, Keyword_Sub=24, Keyword_Absolute=25, Keyword_AboveBottom=26, 
		Keyword_BelowTop=27, Keyword_Namespace=28, Keyword_If=29, Keyword_Else=30, 
		Keyword_In=31, WS=32, NL=33, SquareOpen=34, SquareClose=35, CurlyOpen=36, 
		CurlyClose=37, RoundOpen=38, RoundClose=39, Bang=40, Comma=41, Colon=42, 
		SemiColon=43, String=44, Identifier=45, LineComment=46, BlockComment=47;
	public static final int
		RULE_namespaceDeclaration = 0, RULE_statement = 1, RULE_mmsFile = 2, RULE_surfaceDeclaration = 3, 
		RULE_surfaceDefinition = 4, RULE_surfaceRuleReference = 5, RULE_surfaceRuleDeclaration = 6, 
		RULE_surfaceRule = 7, RULE_surfaceRule_Conditional = 8, RULE_surfaceRule_Bandlands = 9, 
		RULE_surfaceRule_Block = 10, RULE_surfaceRule_Sequence = 11, RULE_surfaceConditionReference = 12, 
		RULE_surfaceConditionDeclaration = 13, RULE_surfaceCondition = 14, RULE_surfaceCondition_AboveSurface = 15, 
		RULE_surfaceCondition_Biome = 16, RULE_surfaceCondition_Hole = 17, RULE_surfaceCondition_Noise = 18, 
		RULE_surfaceCondition_Steep = 19, RULE_surfaceCondition_StoneDepth = 20, 
		RULE_surfaceCondition_Freezing = 21, RULE_surfaceCondition_VerticalGradient = 22, 
		RULE_surfaceCondition_AboveWater = 23, RULE_surfaceCondition_YAbove = 24, 
		RULE_surfaceCondition_Compound__Item = 25, RULE_surfaceCondition_Compound = 26, 
		RULE_reference = 27, RULE_resourceReference = 28, RULE_number = 29, RULE_verticalAnchor = 30, 
		RULE_verticalAnchor_Absolute = 31, RULE_verticalAnchor_AboveBottom = 32, 
		RULE_verticalAnchor_BelowTop = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"namespaceDeclaration", "statement", "mmsFile", "surfaceDeclaration", 
			"surfaceDefinition", "surfaceRuleReference", "surfaceRuleDeclaration", 
			"surfaceRule", "surfaceRule_Conditional", "surfaceRule_Bandlands", "surfaceRule_Block", 
			"surfaceRule_Sequence", "surfaceConditionReference", "surfaceConditionDeclaration", 
			"surfaceCondition", "surfaceCondition_AboveSurface", "surfaceCondition_Biome", 
			"surfaceCondition_Hole", "surfaceCondition_Noise", "surfaceCondition_Steep", 
			"surfaceCondition_StoneDepth", "surfaceCondition_Freezing", "surfaceCondition_VerticalGradient", 
			"surfaceCondition_AboveWater", "surfaceCondition_YAbove", "surfaceCondition_Compound__Item", 
			"surfaceCondition_Compound", "reference", "resourceReference", "number", 
			"verticalAnchor", "verticalAnchor_Absolute", "verticalAnchor_AboveBottom", 
			"verticalAnchor_BelowTop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'surface'", "'rule'", "'condition'", "'sequence'", 
			"'block'", "'bandlands'", "'above_preliminary_surface'", "'biome'", "'hole'", 
			"'noise'", "'steep'", "'stone_depth'", "'freezing'", "'temperature'", 
			"'vertical_gradient'", "'above_water'", "'y_above'", "'floor'", "'ceiling'", 
			"'and'", "'add'", "'sub'", "'absolute'", "'above_bottom'", "'below_top'", 
			"'namespace'", "'if'", "'else'", "'in'", null, null, "'['", "']'", "'{'", 
			"'}'", "'('", "')'", "'!'", "','", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Int", "Float", "Keyword_Surface", "Keyword_Rule", "Keyword_Condition", 
			"Keyword_Sequence", "Keyword_Block", "Keyword_Bandlands", "Keyword_AbovePreliminarySurface", 
			"Keyword_Biome", "Keyword_Hole", "Keyword_Noise", "Keyword_Steep", "Keyword_StoneDepth", 
			"Keyword_Freezing", "Keyword_Temperature", "Keyword_VerticalGradient", 
			"Keyword_AboveWater", "Keyword_YAbove", "Keyword_Floor", "Keyword_Ceiling", 
			"Keyword_And", "Keyword_Add", "Keyword_Sub", "Keyword_Absolute", "Keyword_AboveBottom", 
			"Keyword_BelowTop", "Keyword_Namespace", "Keyword_If", "Keyword_Else", 
			"Keyword_In", "WS", "NL", "SquareOpen", "SquareClose", "CurlyOpen", "CurlyClose", 
			"RoundOpen", "RoundClose", "Bang", "Comma", "Colon", "SemiColon", "String", 
			"Identifier", "LineComment", "BlockComment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MMSParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MMSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class NamespaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Keyword_Namespace() { return getToken(MMSParser.Keyword_Namespace, 0); }
		public TerminalNode Identifier() { return getToken(MMSParser.Identifier, 0); }
		public TerminalNode SemiColon() { return getToken(MMSParser.SemiColon, 0); }
		public NamespaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDeclaration; }
	}

	public final NamespaceDeclarationContext namespaceDeclaration() throws RecognitionException {
		NamespaceDeclarationContext _localctx = new NamespaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_namespaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(Keyword_Namespace);
			setState(69);
			match(Identifier);
			setState(70);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public SurfaceDeclarationContext surfaceDeclaration() {
			return getRuleContext(SurfaceDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			surfaceDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MmsFileContext extends ParserRuleContext {
		public NamespaceDeclarationContext namespaceDeclaration() {
			return getRuleContext(NamespaceDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MMSParser.EOF, 0); }
		public List<TerminalNode> NL() { return getTokens(MMSParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(MMSParser.NL, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MmsFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mmsFile; }
	}

	public final MmsFileContext mmsFile() throws RecognitionException {
		MmsFileContext _localctx = new MmsFileContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mmsFile);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(74);
				match(NL);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			namespaceDeclaration();
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(81);
					match(NL);
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87);
					statement();
					setState(89); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(88);
							match(NL);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(91); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Keyword_Surface) {
				{
				setState(98);
				statement();
				}
			}

			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(101);
				match(NL);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SurfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Keyword_Surface() { return getToken(MMSParser.Keyword_Surface, 0); }
		public SurfaceDefinitionContext surfaceDefinition() {
			return getRuleContext(SurfaceDefinitionContext.class,0);
		}
		public SurfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceDeclaration; }
	}

	public final SurfaceDeclarationContext surfaceDeclaration() throws RecognitionException {
		SurfaceDeclarationContext _localctx = new SurfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_surfaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(Keyword_Surface);
			setState(110);
			surfaceDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SurfaceDefinitionContext extends ParserRuleContext {
		public TerminalNode CurlyOpen() { return getToken(MMSParser.CurlyOpen, 0); }
		public TerminalNode CurlyClose() { return getToken(MMSParser.CurlyClose, 0); }
		public List<TerminalNode> NL() { return getTokens(MMSParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(MMSParser.NL, i);
		}
		public List<SurfaceRuleDeclarationContext> surfaceRuleDeclaration() {
			return getRuleContexts(SurfaceRuleDeclarationContext.class);
		}
		public SurfaceRuleDeclarationContext surfaceRuleDeclaration(int i) {
			return getRuleContext(SurfaceRuleDeclarationContext.class,i);
		}
		public List<SurfaceConditionDeclarationContext> surfaceConditionDeclaration() {
			return getRuleContexts(SurfaceConditionDeclarationContext.class);
		}
		public SurfaceConditionDeclarationContext surfaceConditionDeclaration(int i) {
			return getRuleContext(SurfaceConditionDeclarationContext.class,i);
		}
		public SurfaceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceDefinition; }
	}

	public final SurfaceDefinitionContext surfaceDefinition() throws RecognitionException {
		SurfaceDefinitionContext _localctx = new SurfaceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_surfaceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(CurlyOpen);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(113);
				match(NL);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Keyword_Rule || _la==Keyword_Condition) {
				{
				{
				setState(121);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Keyword_Rule:
					{
					setState(119);
					surfaceRuleDeclaration();
					}
					break;
				case Keyword_Condition:
					{
					setState(120);
					surfaceConditionDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(123);
					match(NL);
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(CurlyClose);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SurfaceRuleReferenceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MMSParser.Identifier, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public SurfaceRuleReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRuleReference; }
	}

	public final SurfaceRuleReferenceContext surfaceRuleReference() throws RecognitionException {
		SurfaceRuleReferenceContext _localctx = new SurfaceRuleReferenceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_surfaceRuleReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(136);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(137);
				reference();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SurfaceRuleDeclarationContext extends ParserRuleContext {
		public TerminalNode Keyword_Rule() { return getToken(MMSParser.Keyword_Rule, 0); }
		public TerminalNode Identifier() { return getToken(MMSParser.Identifier, 0); }
		public SurfaceRuleContext surfaceRule() {
			return getRuleContext(SurfaceRuleContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(MMSParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(MMSParser.NL, i);
		}
		public SurfaceRuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRuleDeclaration; }
	}

	public final SurfaceRuleDeclarationContext surfaceRuleDeclaration() throws RecognitionException {
		SurfaceRuleDeclarationContext _localctx = new SurfaceRuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_surfaceRuleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(Keyword_Rule);
			setState(141);
			match(Identifier);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(142);
				match(NL);
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			surfaceRule();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SurfaceRuleContext extends ParserRuleContext {
		public SurfaceRule_ConditionalContext surfaceRule_Conditional() {
			return getRuleContext(SurfaceRule_ConditionalContext.class,0);
		}
		public SurfaceRule_BlockContext surfaceRule_Block() {
			return getRuleContext(SurfaceRule_BlockContext.class,0);
		}
		public SurfaceRule_SequenceContext surfaceRule_Sequence() {
			return getRuleContext(SurfaceRule_SequenceContext.class,0);
		}
		public SurfaceRuleReferenceContext surfaceRuleReference() {
			return getRuleContext(SurfaceRuleReferenceContext.class,0);
		}
		public SurfaceRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRule; }
	}

	public final SurfaceRuleContext surfaceRule() throws RecognitionException {
		SurfaceRuleContext _localctx = new SurfaceRuleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_surfaceRule);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Keyword_If:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				surfaceRule_Conditional();
				}
				break;
			case Keyword_Block:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				surfaceRule_Block();
				}
				break;
			case Keyword_Sequence:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				surfaceRule_Sequence();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				surfaceRuleReference();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SurfaceRule_ConditionalContext extends ParserRuleContext {
		public TerminalNode Keyword_If() { return getToken(MMSParser.Keyword_If, 0); }
		public TerminalNode RoundOpen() { return getToken(MMSParser.RoundOpen, 0); }
		public SurfaceConditionContext surfaceCondition() {
			return getRuleContext(SurfaceConditionContext.class,0);
		}
		public TerminalNode RoundClose() { return getToken(MMSParser.RoundClose, 0); }
		public SurfaceRuleContext surfaceRule() {
			return getRuleContext(SurfaceRuleContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(MMSParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(MMSParser.NL, i);
		}
		public TerminalNode Bang() { return getToken(MMSParser.Bang, 0); }
		public SurfaceRule_ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRule_Conditional; }
	}

	public final SurfaceRule_ConditionalContext surfaceRule_Conditional() throws RecognitionException {
		SurfaceRule_ConditionalContext _localctx = new SurfaceRule_ConditionalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_surfaceRule_Conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(Keyword_If);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(157);
				match(NL);
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(163);
				match(Bang);
				}
			}

			setState(166);
			match(RoundOpen);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(167);
				match(NL);
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			surfaceCondition();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(174);
				match(NL);
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			match(RoundClose);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(181);
				match(NL);
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(187);
			surfaceRule();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SurfaceRule_BandlandsContext extends ParserRuleContext {
		public TerminalNode Keyword_Bandlands() { return getToken(MMSParser.Keyword_Bandlands, 0); }
		public SurfaceRule_BandlandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRule_Bandlands; }
	}

	public final SurfaceRule_BandlandsContext surfaceRule_Bandlands() throws RecognitionException {
		SurfaceRule_BandlandsContext _localctx = new SurfaceRule_BandlandsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_surfaceRule_Bandlands);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(Keyword_Bandlands);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SurfaceRule_BlockContext extends ParserRuleContext {
		public TerminalNode Keyword_Block() { return getToken(MMSParser.Keyword_Block, 0); }
		public ResourceReferenceContext resourceReference() {
			return getRuleContext(ResourceReferenceContext.class,0);
		}
		public SurfaceRule_BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRule_Block; }
	}

	public final SurfaceRule_BlockContext surfaceRule_Block() throws RecognitionException {
		SurfaceRule_BlockContext _localctx = new SurfaceRule_BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_surfaceRule_Block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(Keyword_Block);
			setState(192);
			resourceReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SurfaceRule_SequenceContext extends ParserRuleContext {
		public TerminalNode Keyword_Sequence() { return getToken(MMSParser.Keyword_Sequence, 0); }
		public TerminalNode SquareOpen() { return getToken(MMSParser.SquareOpen, 0); }
		public TerminalNode SquareClose() { return getToken(MMSParser.SquareClose, 0); }
		public List<TerminalNode> NL() { return getTokens(MMSParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(MMSParser.NL, i);
		}
		public List<SurfaceRuleContext> surfaceRule() {
			return getRuleContexts(SurfaceRuleContext.class);
		}
		public SurfaceRuleContext surfaceRule(int i) {
			return getRuleContext(SurfaceRuleContext.class,i);
		}
		public SurfaceRule_SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRule_Sequence; }
	}

	public final SurfaceRule_SequenceContext surfaceRule_Sequence() throws RecognitionException {
		SurfaceRule_SequenceContext _localctx = new SurfaceRule_SequenceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_surfaceRule_Sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(Keyword_Sequence);
			setState(195);
			match(SquareOpen);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(196);
				match(NL);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Keyword_Sequence) | (1L << Keyword_Block) | (1L << Keyword_If) | (1L << Identifier))) != 0)) {
				{
				{
				{
				setState(202);
				surfaceRule();
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(203);
					match(NL);
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			match(SquareClose);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SurfaceConditionReferenceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MMSParser.Identifier, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public SurfaceConditionReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceConditionReference; }
	}

	public final SurfaceConditionReferenceContext surfaceConditionReference() throws RecognitionException {
		SurfaceConditionReferenceContext _localctx = new SurfaceConditionReferenceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_surfaceConditionReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(216);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(217);
				reference();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SurfaceConditionDeclarationContext extends ParserRuleContext {
		public TerminalNode Keyword_Condition() { return getToken(MMSParser.Keyword_Condition, 0); }
		public TerminalNode Identifier() { return getToken(MMSParser.Identifier, 0); }
		public SurfaceConditionContext surfaceCondition() {
			return getRuleContext(SurfaceConditionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(MMSParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(MMSParser.NL, i);
		}
		public SurfaceConditionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceConditionDeclaration; }
	}

	public final SurfaceConditionDeclarationContext surfaceConditionDeclaration() throws RecognitionException {
		SurfaceConditionDeclarationContext _localctx = new SurfaceConditionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_surfaceConditionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(Keyword_Condition);
			setState(221);
			match(Identifier);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(222);
				match(NL);
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			surfaceCondition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SurfaceConditionContext extends ParserRuleContext {
		public SurfaceCondition_AboveSurfaceContext surfaceCondition_AboveSurface() {
			return getRuleContext(SurfaceCondition_AboveSurfaceContext.class,0);
		}
		public SurfaceCondition_BiomeContext surfaceCondition_Biome() {
			return getRuleContext(SurfaceCondition_BiomeContext.class,0);
		}
		public SurfaceCondition_HoleContext surfaceCondition_Hole() {
			return getRuleContext(SurfaceCondition_HoleContext.class,0);
		}
		public SurfaceCondition_NoiseContext surfaceCondition_Noise() {
			return getRuleContext(SurfaceCondition_NoiseContext.class,0);
		}
		public SurfaceCondition_SteepContext surfaceCondition_Steep() {
			return getRuleContext(SurfaceCondition_SteepContext.class,0);
		}
		public SurfaceCondition_StoneDepthContext surfaceCondition_StoneDepth() {
			return getRuleContext(SurfaceCondition_StoneDepthContext.class,0);
		}
		public SurfaceCondition_FreezingContext surfaceCondition_Freezing() {
			return getRuleContext(SurfaceCondition_FreezingContext.class,0);
		}
		public SurfaceCondition_VerticalGradientContext surfaceCondition_VerticalGradient() {
			return getRuleContext(SurfaceCondition_VerticalGradientContext.class,0);
		}
		public SurfaceCondition_AboveWaterContext surfaceCondition_AboveWater() {
			return getRuleContext(SurfaceCondition_AboveWaterContext.class,0);
		}
		public SurfaceCondition_YAboveContext surfaceCondition_YAbove() {
			return getRuleContext(SurfaceCondition_YAboveContext.class,0);
		}
		public SurfaceCondition_CompoundContext surfaceCondition_Compound() {
			return getRuleContext(SurfaceCondition_CompoundContext.class,0);
		}
		public SurfaceConditionReferenceContext surfaceConditionReference() {
			return getRuleContext(SurfaceConditionReferenceContext.class,0);
		}
		public SurfaceConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition; }
	}

	public final SurfaceConditionContext surfaceCondition() throws RecognitionException {
		SurfaceConditionContext _localctx = new SurfaceConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_surfaceCondition);
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Keyword_AbovePreliminarySurface:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				surfaceCondition_AboveSurface();
				}
				break;
			case Keyword_Biome:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				surfaceCondition_Biome();
				}
				break;
			case Keyword_Hole:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				surfaceCondition_Hole();
				}
				break;
			case Keyword_Noise:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				surfaceCondition_Noise();
				}
				break;
			case Keyword_Steep:
				enterOuterAlt(_localctx, 5);
				{
				setState(234);
				surfaceCondition_Steep();
				}
				break;
			case Keyword_StoneDepth:
				enterOuterAlt(_localctx, 6);
				{
				setState(235);
				surfaceCondition_StoneDepth();
				}
				break;
			case Keyword_Freezing:
				enterOuterAlt(_localctx, 7);
				{
				setState(236);
				surfaceCondition_Freezing();
				}
				break;
			case Keyword_VerticalGradient:
				enterOuterAlt(_localctx, 8);
				{
				setState(237);
				surfaceCondition_VerticalGradient();
				}
				break;
			case Keyword_AboveWater:
				enterOuterAlt(_localctx, 9);
				{
				setState(238);
				surfaceCondition_AboveWater();
				}
				break;
			case Keyword_YAbove:
				enterOuterAlt(_localctx, 10);
				{
				setState(239);
				surfaceCondition_YAbove();
				}
				break;
			case Keyword_And:
				enterOuterAlt(_localctx, 11);
				{
				setState(240);
				surfaceCondition_Compound();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 12);
				{
				setState(241);
				surfaceConditionReference();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SurfaceCondition_AboveSurfaceContext extends ParserRuleContext {
		public TerminalNode Keyword_AbovePreliminarySurface() { return getToken(MMSParser.Keyword_AbovePreliminarySurface, 0); }
		public SurfaceCondition_AboveSurfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition_AboveSurface; }
	}

	public final SurfaceCondition_AboveSurfaceContext surfaceCondition_AboveSurface() throws RecognitionException {
		SurfaceCondition_AboveSurfaceContext _localctx = new SurfaceCondition_AboveSurfaceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_surfaceCondition_AboveSurface);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(Keyword_AbovePreliminarySurface);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SurfaceCondition_BiomeContext extends ParserRuleContext {
		public TerminalNode Keyword_Biome() { return getToken(MMSParser.Keyword_Biome, 0); }
		public TerminalNode SquareOpen() { return getToken(MMSParser.SquareOpen, 0); }
		public TerminalNode SquareClose() { return getToken(MMSParser.SquareClose, 0); }
		public List<TerminalNode> NL() { return getTokens(MMSParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(MMSParser.NL, i);
		}
		public List<ResourceReferenceContext> resourceReference() {
			return getRuleContexts(ResourceReferenceContext.class);
		}
		public ResourceReferenceContext resourceReference(int i) {
			return getRuleContext(ResourceReferenceContext.class,i);
		}
		public SurfaceCondition_BiomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition_Biome; }
	}

	public final SurfaceCondition_BiomeContext surfaceCondition_Biome() throws RecognitionException {
		SurfaceCondition_BiomeContext _localctx = new SurfaceCondition_BiomeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_surfaceCondition_Biome);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(Keyword_Biome);
			setState(247);
			match(SquareOpen);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(248);
				match(NL);
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(254);
				resourceReference();
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(255);
					match(NL);
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			match(SquareClose);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SurfaceCondition_HoleContext extends ParserRuleContext {
		public TerminalNode Keyword_Hole() { return getToken(MMSParser.Keyword_Hole, 0); }
		public SurfaceCondition_HoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition_Hole; }
	}

	public final SurfaceCondition_HoleContext surfaceCondition_Hole() throws RecognitionException {
		SurfaceCondition_HoleContext _localctx = new SurfaceCondition_HoleContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_surfaceCondition_Hole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(Keyword_Hole);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SurfaceCondition_NoiseContext extends ParserRuleContext {
		public TerminalNode Keyword_Noise() { return getToken(MMSParser.Keyword_Noise, 0); }
		public ResourceReferenceContext resourceReference() {
			return getRuleContext(ResourceReferenceContext.class,0);
		}
		public TerminalNode SquareOpen() { return getToken(MMSParser.SquareOpen, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode Comma() { return getToken(MMSParser.Comma, 0); }
		public TerminalNode SquareClose() { return getToken(MMSParser.SquareClose, 0); }
		public SurfaceCondition_NoiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition_Noise; }
	}

	public final SurfaceCondition_NoiseContext surfaceCondition_Noise() throws RecognitionException {
		SurfaceCondition_NoiseContext _localctx = new SurfaceCondition_NoiseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_surfaceCondition_Noise);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(Keyword_Noise);
			setState(271);
			resourceReference();
			setState(272);
			match(SquareOpen);
			setState(273);
			number();
			setState(274);
			match(Comma);
			setState(275);
			number();
			setState(276);
			match(SquareClose);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SurfaceCondition_SteepContext extends ParserRuleContext {
		public TerminalNode Keyword_Steep() { return getToken(MMSParser.Keyword_Steep, 0); }
		public SurfaceCondition_SteepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition_Steep; }
	}

	public final SurfaceCondition_SteepContext surfaceCondition_Steep() throws RecognitionException {
		SurfaceCondition_SteepContext _localctx = new SurfaceCondition_SteepContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_surfaceCondition_Steep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(Keyword_Steep);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SurfaceCondition_StoneDepthContext extends ParserRuleContext {
		public TerminalNode Keyword_StoneDepth() { return getToken(MMSParser.Keyword_StoneDepth, 0); }
		public List<TerminalNode> Int() { return getTokens(MMSParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(MMSParser.Int, i);
		}
		public TerminalNode Keyword_Floor() { return getToken(MMSParser.Keyword_Floor, 0); }
		public TerminalNode Keyword_Ceiling() { return getToken(MMSParser.Keyword_Ceiling, 0); }
		public TerminalNode Keyword_Add() { return getToken(MMSParser.Keyword_Add, 0); }
		public TerminalNode Keyword_Sub() { return getToken(MMSParser.Keyword_Sub, 0); }
		public SurfaceCondition_StoneDepthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition_StoneDepth; }
	}

	public final SurfaceCondition_StoneDepthContext surfaceCondition_StoneDepth() throws RecognitionException {
		SurfaceCondition_StoneDepthContext _localctx = new SurfaceCondition_StoneDepthContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_surfaceCondition_StoneDepth);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(Keyword_StoneDepth);
			setState(281);
			_la = _input.LA(1);
			if ( !(_la==Keyword_Floor || _la==Keyword_Ceiling) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(282);
			match(Int);
			setState(283);
			_la = _input.LA(1);
			if ( !(_la==Keyword_Add || _la==Keyword_Sub) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(284);
			match(Int);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SurfaceCondition_FreezingContext extends ParserRuleContext {
		public TerminalNode Keyword_Freezing() { return getToken(MMSParser.Keyword_Freezing, 0); }
		public SurfaceCondition_FreezingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition_Freezing; }
	}

	public final SurfaceCondition_FreezingContext surfaceCondition_Freezing() throws RecognitionException {
		SurfaceCondition_FreezingContext _localctx = new SurfaceCondition_FreezingContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_surfaceCondition_Freezing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(Keyword_Freezing);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SurfaceCondition_VerticalGradientContext extends ParserRuleContext {
		public TerminalNode Keyword_VerticalGradient() { return getToken(MMSParser.Keyword_VerticalGradient, 0); }
		public TerminalNode String() { return getToken(MMSParser.String, 0); }
		public List<VerticalAnchorContext> verticalAnchor() {
			return getRuleContexts(VerticalAnchorContext.class);
		}
		public VerticalAnchorContext verticalAnchor(int i) {
			return getRuleContext(VerticalAnchorContext.class,i);
		}
		public TerminalNode Comma() { return getToken(MMSParser.Comma, 0); }
		public SurfaceCondition_VerticalGradientContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition_VerticalGradient; }
	}

	public final SurfaceCondition_VerticalGradientContext surfaceCondition_VerticalGradient() throws RecognitionException {
		SurfaceCondition_VerticalGradientContext _localctx = new SurfaceCondition_VerticalGradientContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_surfaceCondition_VerticalGradient);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(Keyword_VerticalGradient);
			setState(289);
			match(String);
			setState(290);
			verticalAnchor();
			setState(291);
			match(Comma);
			setState(292);
			verticalAnchor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SurfaceCondition_AboveWaterContext extends ParserRuleContext {
		public TerminalNode Keyword_AboveWater() { return getToken(MMSParser.Keyword_AboveWater, 0); }
		public TerminalNode Int() { return getToken(MMSParser.Int, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode Keyword_Add() { return getToken(MMSParser.Keyword_Add, 0); }
		public TerminalNode Keyword_Sub() { return getToken(MMSParser.Keyword_Sub, 0); }
		public SurfaceCondition_AboveWaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition_AboveWater; }
	}

	public final SurfaceCondition_AboveWaterContext surfaceCondition_AboveWater() throws RecognitionException {
		SurfaceCondition_AboveWaterContext _localctx = new SurfaceCondition_AboveWaterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_surfaceCondition_AboveWater);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(Keyword_AboveWater);
			setState(295);
			match(Int);
			setState(296);
			number();
			setState(297);
			_la = _input.LA(1);
			if ( !(_la==Keyword_Add || _la==Keyword_Sub) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SurfaceCondition_YAboveContext extends ParserRuleContext {
		public TerminalNode Keyword_YAbove() { return getToken(MMSParser.Keyword_YAbove, 0); }
		public VerticalAnchorContext verticalAnchor() {
			return getRuleContext(VerticalAnchorContext.class,0);
		}
		public TerminalNode Int() { return getToken(MMSParser.Int, 0); }
		public TerminalNode Keyword_Add() { return getToken(MMSParser.Keyword_Add, 0); }
		public TerminalNode Keyword_Sub() { return getToken(MMSParser.Keyword_Sub, 0); }
		public SurfaceCondition_YAboveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition_YAbove; }
	}

	public final SurfaceCondition_YAboveContext surfaceCondition_YAbove() throws RecognitionException {
		SurfaceCondition_YAboveContext _localctx = new SurfaceCondition_YAboveContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_surfaceCondition_YAbove);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(Keyword_YAbove);
			setState(300);
			verticalAnchor();
			setState(301);
			match(Int);
			setState(302);
			_la = _input.LA(1);
			if ( !(_la==Keyword_Add || _la==Keyword_Sub) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SurfaceCondition_Compound__ItemContext extends ParserRuleContext {
		public SurfaceConditionContext surfaceCondition() {
			return getRuleContext(SurfaceConditionContext.class,0);
		}
		public TerminalNode Bang() { return getToken(MMSParser.Bang, 0); }
		public SurfaceCondition_Compound__ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition_Compound__Item; }
	}

	public final SurfaceCondition_Compound__ItemContext surfaceCondition_Compound__Item() throws RecognitionException {
		SurfaceCondition_Compound__ItemContext _localctx = new SurfaceCondition_Compound__ItemContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_surfaceCondition_Compound__Item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(304);
				match(Bang);
				}
			}

			setState(307);
			surfaceCondition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SurfaceCondition_CompoundContext extends ParserRuleContext {
		public TerminalNode Keyword_And() { return getToken(MMSParser.Keyword_And, 0); }
		public TerminalNode RoundOpen() { return getToken(MMSParser.RoundOpen, 0); }
		public TerminalNode RoundClose() { return getToken(MMSParser.RoundClose, 0); }
		public List<TerminalNode> NL() { return getTokens(MMSParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(MMSParser.NL, i);
		}
		public List<SurfaceCondition_Compound__ItemContext> surfaceCondition_Compound__Item() {
			return getRuleContexts(SurfaceCondition_Compound__ItemContext.class);
		}
		public SurfaceCondition_Compound__ItemContext surfaceCondition_Compound__Item(int i) {
			return getRuleContext(SurfaceCondition_Compound__ItemContext.class,i);
		}
		public SurfaceCondition_CompoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition_Compound; }
	}

	public final SurfaceCondition_CompoundContext surfaceCondition_Compound() throws RecognitionException {
		SurfaceCondition_CompoundContext _localctx = new SurfaceCondition_CompoundContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_surfaceCondition_Compound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(Keyword_And);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(310);
				match(NL);
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
			match(RoundOpen);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(317);
				match(NL);
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Keyword_AbovePreliminarySurface) | (1L << Keyword_Biome) | (1L << Keyword_Hole) | (1L << Keyword_Noise) | (1L << Keyword_Steep) | (1L << Keyword_StoneDepth) | (1L << Keyword_Freezing) | (1L << Keyword_VerticalGradient) | (1L << Keyword_AboveWater) | (1L << Keyword_YAbove) | (1L << Keyword_And) | (1L << Bang) | (1L << Identifier))) != 0)) {
				{
				{
				setState(323);
				surfaceCondition_Compound__Item();
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(324);
					match(NL);
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335);
			match(RoundClose);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(MMSParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MMSParser.Identifier, i);
		}
		public TerminalNode Colon() { return getToken(MMSParser.Colon, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(Identifier);
			setState(338);
			match(Colon);
			setState(339);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceReferenceContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MMSParser.Identifier, 0); }
		public ResourceReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceReference; }
	}

	public final ResourceReferenceContext resourceReference() throws RecognitionException {
		ResourceReferenceContext _localctx = new ResourceReferenceContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_resourceReference);
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				reference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(MMSParser.Int, 0); }
		public TerminalNode Float() { return getToken(MMSParser.Float, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==Float) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VerticalAnchorContext extends ParserRuleContext {
		public VerticalAnchor_AbsoluteContext verticalAnchor_Absolute() {
			return getRuleContext(VerticalAnchor_AbsoluteContext.class,0);
		}
		public VerticalAnchor_AboveBottomContext verticalAnchor_AboveBottom() {
			return getRuleContext(VerticalAnchor_AboveBottomContext.class,0);
		}
		public VerticalAnchor_BelowTopContext verticalAnchor_BelowTop() {
			return getRuleContext(VerticalAnchor_BelowTopContext.class,0);
		}
		public VerticalAnchorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verticalAnchor; }
	}

	public final VerticalAnchorContext verticalAnchor() throws RecognitionException {
		VerticalAnchorContext _localctx = new VerticalAnchorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_verticalAnchor);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Keyword_Absolute:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				verticalAnchor_Absolute();
				}
				break;
			case Keyword_AboveBottom:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				verticalAnchor_AboveBottom();
				}
				break;
			case Keyword_BelowTop:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				verticalAnchor_BelowTop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VerticalAnchor_AbsoluteContext extends ParserRuleContext {
		public TerminalNode Keyword_Absolute() { return getToken(MMSParser.Keyword_Absolute, 0); }
		public TerminalNode Int() { return getToken(MMSParser.Int, 0); }
		public VerticalAnchor_AbsoluteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verticalAnchor_Absolute; }
	}

	public final VerticalAnchor_AbsoluteContext verticalAnchor_Absolute() throws RecognitionException {
		VerticalAnchor_AbsoluteContext _localctx = new VerticalAnchor_AbsoluteContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_verticalAnchor_Absolute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(Keyword_Absolute);
			setState(353);
			match(Int);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VerticalAnchor_AboveBottomContext extends ParserRuleContext {
		public TerminalNode Keyword_AboveBottom() { return getToken(MMSParser.Keyword_AboveBottom, 0); }
		public TerminalNode Int() { return getToken(MMSParser.Int, 0); }
		public VerticalAnchor_AboveBottomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verticalAnchor_AboveBottom; }
	}

	public final VerticalAnchor_AboveBottomContext verticalAnchor_AboveBottom() throws RecognitionException {
		VerticalAnchor_AboveBottomContext _localctx = new VerticalAnchor_AboveBottomContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_verticalAnchor_AboveBottom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(Keyword_AboveBottom);
			setState(356);
			match(Int);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VerticalAnchor_BelowTopContext extends ParserRuleContext {
		public TerminalNode Keyword_BelowTop() { return getToken(MMSParser.Keyword_BelowTop, 0); }
		public TerminalNode Int() { return getToken(MMSParser.Int, 0); }
		public VerticalAnchor_BelowTopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verticalAnchor_BelowTop; }
	}

	public final VerticalAnchor_BelowTopContext verticalAnchor_BelowTop() throws RecognitionException {
		VerticalAnchor_BelowTopContext _localctx = new VerticalAnchor_BelowTopContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_verticalAnchor_BelowTop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(Keyword_BelowTop);
			setState(359);
			match(Int);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u016c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\3\3\3\3\4\7\4N\n\4\f\4\16\4Q\13\4"+
		"\3\4\3\4\7\4U\n\4\f\4\16\4X\13\4\3\4\3\4\6\4\\\n\4\r\4\16\4]\7\4`\n\4"+
		"\f\4\16\4c\13\4\3\4\5\4f\n\4\3\4\7\4i\n\4\f\4\16\4l\13\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\3\6\7\6u\n\6\f\6\16\6x\13\6\3\6\3\6\5\6|\n\6\3\6\7\6\177\n"+
		"\6\f\6\16\6\u0082\13\6\7\6\u0084\n\6\f\6\16\6\u0087\13\6\3\6\3\6\3\7\3"+
		"\7\5\7\u008d\n\7\3\b\3\b\3\b\7\b\u0092\n\b\f\b\16\b\u0095\13\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\5\t\u009d\n\t\3\n\3\n\7\n\u00a1\n\n\f\n\16\n\u00a4\13"+
		"\n\3\n\5\n\u00a7\n\n\3\n\3\n\7\n\u00ab\n\n\f\n\16\n\u00ae\13\n\3\n\3\n"+
		"\7\n\u00b2\n\n\f\n\16\n\u00b5\13\n\3\n\3\n\7\n\u00b9\n\n\f\n\16\n\u00bc"+
		"\13\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u00c8\n\r\f\r\16\r"+
		"\u00cb\13\r\3\r\3\r\7\r\u00cf\n\r\f\r\16\r\u00d2\13\r\7\r\u00d4\n\r\f"+
		"\r\16\r\u00d7\13\r\3\r\3\r\3\16\3\16\5\16\u00dd\n\16\3\17\3\17\3\17\7"+
		"\17\u00e2\n\17\f\17\16\17\u00e5\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f5\n\20\3\21\3\21\3\22"+
		"\3\22\3\22\7\22\u00fc\n\22\f\22\16\22\u00ff\13\22\3\22\3\22\7\22\u0103"+
		"\n\22\f\22\16\22\u0106\13\22\7\22\u0108\n\22\f\22\16\22\u010b\13\22\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\5\33\u0134\n\33"+
		"\3\33\3\33\3\34\3\34\7\34\u013a\n\34\f\34\16\34\u013d\13\34\3\34\3\34"+
		"\7\34\u0141\n\34\f\34\16\34\u0144\13\34\3\34\3\34\7\34\u0148\n\34\f\34"+
		"\16\34\u014b\13\34\7\34\u014d\n\34\f\34\16\34\u0150\13\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\5\36\u015a\n\36\3\37\3\37\3 \3 \3 \5 \u0161"+
		"\n \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\5\3\2\26\27\3\2\31\32\3\2\3\4"+
		"\2\u0178\2F\3\2\2\2\4J\3\2\2\2\6O\3\2\2\2\bo\3\2\2\2\nr\3\2\2\2\f\u008c"+
		"\3\2\2\2\16\u008e\3\2\2\2\20\u009c\3\2\2\2\22\u009e\3\2\2\2\24\u00bf\3"+
		"\2\2\2\26\u00c1\3\2\2\2\30\u00c4\3\2\2\2\32\u00dc\3\2\2\2\34\u00de\3\2"+
		"\2\2\36\u00f4\3\2\2\2 \u00f6\3\2\2\2\"\u00f8\3\2\2\2$\u010e\3\2\2\2&\u0110"+
		"\3\2\2\2(\u0118\3\2\2\2*\u011a\3\2\2\2,\u0120\3\2\2\2.\u0122\3\2\2\2\60"+
		"\u0128\3\2\2\2\62\u012d\3\2\2\2\64\u0133\3\2\2\2\66\u0137\3\2\2\28\u0153"+
		"\3\2\2\2:\u0159\3\2\2\2<\u015b\3\2\2\2>\u0160\3\2\2\2@\u0162\3\2\2\2B"+
		"\u0165\3\2\2\2D\u0168\3\2\2\2FG\7\36\2\2GH\7/\2\2HI\7-\2\2I\3\3\2\2\2"+
		"JK\5\b\5\2K\5\3\2\2\2LN\7#\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2"+
		"PR\3\2\2\2QO\3\2\2\2RV\5\2\2\2SU\7#\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2"+
		"VW\3\2\2\2Wa\3\2\2\2XV\3\2\2\2Y[\5\4\3\2Z\\\7#\2\2[Z\3\2\2\2\\]\3\2\2"+
		"\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_Y\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2"+
		"\2be\3\2\2\2ca\3\2\2\2df\5\4\3\2ed\3\2\2\2ef\3\2\2\2fj\3\2\2\2gi\7#\2"+
		"\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\2\2"+
		"\3n\7\3\2\2\2op\7\5\2\2pq\5\n\6\2q\t\3\2\2\2rv\7&\2\2su\7#\2\2ts\3\2\2"+
		"\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\u0085\3\2\2\2xv\3\2\2\2y|\5\16\b\2z"+
		"|\5\34\17\2{y\3\2\2\2{z\3\2\2\2|\u0080\3\2\2\2}\177\7#\2\2~}\3\2\2\2\177"+
		"\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084\3\2\2\2"+
		"\u0082\u0080\3\2\2\2\u0083{\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u0089\7\'\2\2\u0089\13\3\2\2\2\u008a\u008d\7/\2\2\u008b\u008d\58\35\2"+
		"\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\r\3\2\2\2\u008e\u008f\7"+
		"\6\2\2\u008f\u0093\7/\2\2\u0090\u0092\7#\2\2\u0091\u0090\3\2\2\2\u0092"+
		"\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0096\u0097\5\20\t\2\u0097\17\3\2\2\2\u0098\u009d"+
		"\5\22\n\2\u0099\u009d\5\26\f\2\u009a\u009d\5\30\r\2\u009b\u009d\5\f\7"+
		"\2\u009c\u0098\3\2\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b"+
		"\3\2\2\2\u009d\21\3\2\2\2\u009e\u00a2\7\37\2\2\u009f\u00a1\7#\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\7*\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ac\7("+
		"\2\2\u00a9\u00ab\7#\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00af\u00b3\5\36\20\2\u00b0\u00b2\7#\2\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00ba\7)\2\2\u00b7\u00b9\7#\2\2\u00b8\u00b7"+
		"\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\5\20\t\2\u00be\23\3\2\2"+
		"\2\u00bf\u00c0\7\n\2\2\u00c0\25\3\2\2\2\u00c1\u00c2\7\t\2\2\u00c2\u00c3"+
		"\5:\36\2\u00c3\27\3\2\2\2\u00c4\u00c5\7\b\2\2\u00c5\u00c9\7$\2\2\u00c6"+
		"\u00c8\7#\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00d5\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00d0\5\20\t\2\u00cd\u00cf\7#\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00cc\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00d9\7%\2\2\u00d9\31\3\2\2\2\u00da\u00dd\7/\2\2\u00db\u00dd\58\35\2"+
		"\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\33\3\2\2\2\u00de\u00df"+
		"\7\7\2\2\u00df\u00e3\7/\2\2\u00e0\u00e2\7#\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2"+
		"\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\5\36\20\2\u00e7\35\3\2\2\2\u00e8"+
		"\u00f5\5 \21\2\u00e9\u00f5\5\"\22\2\u00ea\u00f5\5$\23\2\u00eb\u00f5\5"+
		"&\24\2\u00ec\u00f5\5(\25\2\u00ed\u00f5\5*\26\2\u00ee\u00f5\5,\27\2\u00ef"+
		"\u00f5\5.\30\2\u00f0\u00f5\5\60\31\2\u00f1\u00f5\5\62\32\2\u00f2\u00f5"+
		"\5\66\34\2\u00f3\u00f5\5\32\16\2\u00f4\u00e8\3\2\2\2\u00f4\u00e9\3\2\2"+
		"\2\u00f4\u00ea\3\2\2\2\u00f4\u00eb\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f4\u00ed"+
		"\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f4"+
		"\u00f1\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\37\3\2\2"+
		"\2\u00f6\u00f7\7\13\2\2\u00f7!\3\2\2\2\u00f8\u00f9\7\f\2\2\u00f9\u00fd"+
		"\7$\2\2\u00fa\u00fc\7#\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0109\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u0100\u0104\5:\36\2\u0101\u0103\7#\2\2\u0102\u0101\3\2\2\2\u0103"+
		"\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0108\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0107\u0100\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010c\u010d\7%\2\2\u010d#\3\2\2\2\u010e\u010f\7\r\2\2\u010f%\3\2"+
		"\2\2\u0110\u0111\7\16\2\2\u0111\u0112\5:\36\2\u0112\u0113\7$\2\2\u0113"+
		"\u0114\5<\37\2\u0114\u0115\7+\2\2\u0115\u0116\5<\37\2\u0116\u0117\7%\2"+
		"\2\u0117\'\3\2\2\2\u0118\u0119\7\17\2\2\u0119)\3\2\2\2\u011a\u011b\7\20"+
		"\2\2\u011b\u011c\t\2\2\2\u011c\u011d\7\3\2\2\u011d\u011e\t\3\2\2\u011e"+
		"\u011f\7\3\2\2\u011f+\3\2\2\2\u0120\u0121\7\21\2\2\u0121-\3\2\2\2\u0122"+
		"\u0123\7\23\2\2\u0123\u0124\7.\2\2\u0124\u0125\5> \2\u0125\u0126\7+\2"+
		"\2\u0126\u0127\5> \2\u0127/\3\2\2\2\u0128\u0129\7\24\2\2\u0129\u012a\7"+
		"\3\2\2\u012a\u012b\5<\37\2\u012b\u012c\t\3\2\2\u012c\61\3\2\2\2\u012d"+
		"\u012e\7\25\2\2\u012e\u012f\5> \2\u012f\u0130\7\3\2\2\u0130\u0131\t\3"+
		"\2\2\u0131\63\3\2\2\2\u0132\u0134\7*\2\2\u0133\u0132\3\2\2\2\u0133\u0134"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\5\36\20\2\u0136\65\3\2\2\2\u0137"+
		"\u013b\7\30\2\2\u0138\u013a\7#\2\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2"+
		"\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013e\u0142\7(\2\2\u013f\u0141\7#\2\2\u0140\u013f\3\2\2"+
		"\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u014e"+
		"\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0149\5\64\33\2\u0146\u0148\7#\2\2"+
		"\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a"+
		"\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u0145\3\2\2\2\u014d"+
		"\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2"+
		"\2\2\u0150\u014e\3\2\2\2\u0151\u0152\7)\2\2\u0152\67\3\2\2\2\u0153\u0154"+
		"\7/\2\2\u0154\u0155\7,\2\2\u0155\u0156\7/\2\2\u01569\3\2\2\2\u0157\u015a"+
		"\58\35\2\u0158\u015a\7/\2\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a"+
		";\3\2\2\2\u015b\u015c\t\4\2\2\u015c=\3\2\2\2\u015d\u0161\5@!\2\u015e\u0161"+
		"\5B\"\2\u015f\u0161\5D#\2\u0160\u015d\3\2\2\2\u0160\u015e\3\2\2\2\u0160"+
		"\u015f\3\2\2\2\u0161?\3\2\2\2\u0162\u0163\7\33\2\2\u0163\u0164\7\3\2\2"+
		"\u0164A\3\2\2\2\u0165\u0166\7\34\2\2\u0166\u0167\7\3\2\2\u0167C\3\2\2"+
		"\2\u0168\u0169\7\35\2\2\u0169\u016a\7\3\2\2\u016aE\3\2\2\2$OV]aejv{\u0080"+
		"\u0085\u008c\u0093\u009c\u00a2\u00a6\u00ac\u00b3\u00ba\u00c9\u00d0\u00d5"+
		"\u00dc\u00e3\u00f4\u00fd\u0104\u0109\u0133\u013b\u0142\u0149\u014e\u0159"+
		"\u0160";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}