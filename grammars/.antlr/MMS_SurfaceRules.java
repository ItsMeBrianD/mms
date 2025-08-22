// Generated from /Users/brian/code/personal/mms/grammars/MMS_SurfaceRules.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MMS_SurfaceRules extends Parser {
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
		RULE_surfaceDeclaration = 0, RULE_surfaceDefinition = 1, RULE_surfaceRuleReference = 2, 
		RULE_surfaceRuleDeclaration = 3, RULE_surfaceRule = 4, RULE_surfaceRule_Conditional = 5, 
		RULE_surfaceRule_Bandlands = 6, RULE_surfaceRule_Block = 7, RULE_surfaceRule_Sequence = 8, 
		RULE_surfaceConditionReference = 9, RULE_surfaceConditionDeclaration = 10, 
		RULE_surfaceCondition = 11, RULE_surfaceCondition_AboveSurface = 12, RULE_surfaceCondition_Biome = 13, 
		RULE_surfaceCondition_Hole = 14, RULE_surfaceCondition_Noise = 15, RULE_surfaceCondition_Steep = 16, 
		RULE_surfaceCondition_StoneDepth = 17, RULE_surfaceCondition_Freezing = 18, 
		RULE_surfaceCondition_VerticalGradient = 19, RULE_surfaceCondition_AboveWater = 20, 
		RULE_surfaceCondition_YAbove = 21, RULE_surfaceCondition_Compound__Item = 22, 
		RULE_surfaceCondition_Compound = 23, RULE_reference = 24, RULE_resourceReference = 25, 
		RULE_number = 26, RULE_keyword = 27, RULE_verticalAnchor = 28, RULE_verticalAnchor_Absolute = 29, 
		RULE_verticalAnchor_AboveBottom = 30, RULE_verticalAnchor_BelowTop = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"surfaceDeclaration", "surfaceDefinition", "surfaceRuleReference", "surfaceRuleDeclaration", 
			"surfaceRule", "surfaceRule_Conditional", "surfaceRule_Bandlands", "surfaceRule_Block", 
			"surfaceRule_Sequence", "surfaceConditionReference", "surfaceConditionDeclaration", 
			"surfaceCondition", "surfaceCondition_AboveSurface", "surfaceCondition_Biome", 
			"surfaceCondition_Hole", "surfaceCondition_Noise", "surfaceCondition_Steep", 
			"surfaceCondition_StoneDepth", "surfaceCondition_Freezing", "surfaceCondition_VerticalGradient", 
			"surfaceCondition_AboveWater", "surfaceCondition_YAbove", "surfaceCondition_Compound__Item", 
			"surfaceCondition_Compound", "reference", "resourceReference", "number", 
			"keyword", "verticalAnchor", "verticalAnchor_Absolute", "verticalAnchor_AboveBottom", 
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
	public String getGrammarFileName() { return "MMS_SurfaceRules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MMS_SurfaceRules(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SurfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Keyword_Surface() { return getToken(MMS_SurfaceRules.Keyword_Surface, 0); }
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
		enterRule(_localctx, 0, RULE_surfaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(Keyword_Surface);
			setState(65);
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
		public TerminalNode CurlyOpen() { return getToken(MMS_SurfaceRules.CurlyOpen, 0); }
		public TerminalNode CurlyClose() { return getToken(MMS_SurfaceRules.CurlyClose, 0); }
		public List<TerminalNode> NL() { return getTokens(MMS_SurfaceRules.NL); }
		public TerminalNode NL(int i) {
			return getToken(MMS_SurfaceRules.NL, i);
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
		enterRule(_localctx, 2, RULE_surfaceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(CurlyOpen);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(68);
				match(NL);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Keyword_Rule || _la==Keyword_Condition) {
				{
				{
				setState(76);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Keyword_Rule:
					{
					setState(74);
					surfaceRuleDeclaration();
					}
					break;
				case Keyword_Condition:
					{
					setState(75);
					surfaceConditionDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(78);
					match(NL);
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
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
		public TerminalNode Identifier() { return getToken(MMS_SurfaceRules.Identifier, 0); }
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
		enterRule(_localctx, 4, RULE_surfaceRuleReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(91);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(92);
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
		public TerminalNode Keyword_Rule() { return getToken(MMS_SurfaceRules.Keyword_Rule, 0); }
		public TerminalNode Identifier() { return getToken(MMS_SurfaceRules.Identifier, 0); }
		public SurfaceRuleContext surfaceRule() {
			return getRuleContext(SurfaceRuleContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(MMS_SurfaceRules.NL); }
		public TerminalNode NL(int i) {
			return getToken(MMS_SurfaceRules.NL, i);
		}
		public SurfaceRuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRuleDeclaration; }
	}

	public final SurfaceRuleDeclarationContext surfaceRuleDeclaration() throws RecognitionException {
		SurfaceRuleDeclarationContext _localctx = new SurfaceRuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_surfaceRuleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(Keyword_Rule);
			setState(96);
			match(Identifier);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(97);
				match(NL);
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
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
		public SurfaceRule_BandlandsContext surfaceRule_Bandlands() {
			return getRuleContext(SurfaceRule_BandlandsContext.class,0);
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
		enterRule(_localctx, 8, RULE_surfaceRule);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				surfaceRule_Conditional();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				surfaceRule_Bandlands();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				surfaceRule_Block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				surfaceRule_Sequence();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				surfaceRuleReference();
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

	public static class SurfaceRule_ConditionalContext extends ParserRuleContext {
		public TerminalNode Keyword_If() { return getToken(MMS_SurfaceRules.Keyword_If, 0); }
		public TerminalNode RoundOpen() { return getToken(MMS_SurfaceRules.RoundOpen, 0); }
		public SurfaceConditionContext surfaceCondition() {
			return getRuleContext(SurfaceConditionContext.class,0);
		}
		public TerminalNode RoundClose() { return getToken(MMS_SurfaceRules.RoundClose, 0); }
		public SurfaceRuleContext surfaceRule() {
			return getRuleContext(SurfaceRuleContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(MMS_SurfaceRules.NL); }
		public TerminalNode NL(int i) {
			return getToken(MMS_SurfaceRules.NL, i);
		}
		public TerminalNode Bang() { return getToken(MMS_SurfaceRules.Bang, 0); }
		public SurfaceRule_ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRule_Conditional; }
	}

	public final SurfaceRule_ConditionalContext surfaceRule_Conditional() throws RecognitionException {
		SurfaceRule_ConditionalContext _localctx = new SurfaceRule_ConditionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_surfaceRule_Conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(Keyword_If);
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
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(119);
				match(Bang);
				}
			}

			setState(122);
			match(RoundOpen);
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
			setState(129);
			surfaceCondition();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(130);
				match(NL);
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(RoundClose);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(137);
				match(NL);
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(143);
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
		public TerminalNode Keyword_Bandlands() { return getToken(MMS_SurfaceRules.Keyword_Bandlands, 0); }
		public SurfaceRule_BandlandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRule_Bandlands; }
	}

	public final SurfaceRule_BandlandsContext surfaceRule_Bandlands() throws RecognitionException {
		SurfaceRule_BandlandsContext _localctx = new SurfaceRule_BandlandsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_surfaceRule_Bandlands);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
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
		public TerminalNode Keyword_Block() { return getToken(MMS_SurfaceRules.Keyword_Block, 0); }
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
		enterRule(_localctx, 14, RULE_surfaceRule_Block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(Keyword_Block);
			setState(148);
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
		public TerminalNode Keyword_Sequence() { return getToken(MMS_SurfaceRules.Keyword_Sequence, 0); }
		public TerminalNode SquareOpen() { return getToken(MMS_SurfaceRules.SquareOpen, 0); }
		public TerminalNode SquareClose() { return getToken(MMS_SurfaceRules.SquareClose, 0); }
		public List<TerminalNode> NL() { return getTokens(MMS_SurfaceRules.NL); }
		public TerminalNode NL(int i) {
			return getToken(MMS_SurfaceRules.NL, i);
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
		enterRule(_localctx, 16, RULE_surfaceRule_Sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(Keyword_Sequence);
			setState(151);
			match(SquareOpen);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(152);
				match(NL);
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Keyword_Surface) | (1L << Keyword_Rule) | (1L << Keyword_Condition) | (1L << Keyword_Sequence) | (1L << Keyword_Block) | (1L << Keyword_Bandlands) | (1L << Keyword_AbovePreliminarySurface) | (1L << Keyword_Biome) | (1L << Keyword_Hole) | (1L << Keyword_Noise) | (1L << Keyword_Steep) | (1L << Keyword_StoneDepth) | (1L << Keyword_Freezing) | (1L << Keyword_Temperature) | (1L << Keyword_VerticalGradient) | (1L << Keyword_AboveWater) | (1L << Keyword_YAbove) | (1L << Keyword_Floor) | (1L << Keyword_Ceiling) | (1L << Keyword_And) | (1L << Keyword_Add) | (1L << Keyword_Sub) | (1L << Keyword_Absolute) | (1L << Keyword_AboveBottom) | (1L << Keyword_BelowTop) | (1L << Keyword_Namespace) | (1L << Keyword_If) | (1L << Keyword_Else) | (1L << Keyword_In) | (1L << Identifier))) != 0)) {
				{
				{
				{
				setState(158);
				surfaceRule();
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(159);
					match(NL);
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
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
		public TerminalNode Identifier() { return getToken(MMS_SurfaceRules.Identifier, 0); }
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
		enterRule(_localctx, 18, RULE_surfaceConditionReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(172);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(173);
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
		public TerminalNode Keyword_Condition() { return getToken(MMS_SurfaceRules.Keyword_Condition, 0); }
		public TerminalNode Identifier() { return getToken(MMS_SurfaceRules.Identifier, 0); }
		public SurfaceConditionContext surfaceCondition() {
			return getRuleContext(SurfaceConditionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(MMS_SurfaceRules.NL); }
		public TerminalNode NL(int i) {
			return getToken(MMS_SurfaceRules.NL, i);
		}
		public SurfaceConditionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceConditionDeclaration; }
	}

	public final SurfaceConditionDeclarationContext surfaceConditionDeclaration() throws RecognitionException {
		SurfaceConditionDeclarationContext _localctx = new SurfaceConditionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_surfaceConditionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(Keyword_Condition);
			setState(177);
			match(Identifier);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(178);
				match(NL);
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
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
		enterRule(_localctx, 22, RULE_surfaceCondition);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				surfaceCondition_AboveSurface();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				surfaceCondition_Biome();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				surfaceCondition_Hole();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				surfaceCondition_Noise();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
				surfaceCondition_Steep();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(191);
				surfaceCondition_StoneDepth();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(192);
				surfaceCondition_Freezing();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(193);
				surfaceCondition_VerticalGradient();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(194);
				surfaceCondition_AboveWater();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(195);
				surfaceCondition_YAbove();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(196);
				surfaceCondition_Compound();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(197);
				surfaceConditionReference();
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

	public static class SurfaceCondition_AboveSurfaceContext extends ParserRuleContext {
		public TerminalNode Keyword_AbovePreliminarySurface() { return getToken(MMS_SurfaceRules.Keyword_AbovePreliminarySurface, 0); }
		public SurfaceCondition_AboveSurfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition_AboveSurface; }
	}

	public final SurfaceCondition_AboveSurfaceContext surfaceCondition_AboveSurface() throws RecognitionException {
		SurfaceCondition_AboveSurfaceContext _localctx = new SurfaceCondition_AboveSurfaceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_surfaceCondition_AboveSurface);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
		public TerminalNode Keyword_Biome() { return getToken(MMS_SurfaceRules.Keyword_Biome, 0); }
		public TerminalNode SquareOpen() { return getToken(MMS_SurfaceRules.SquareOpen, 0); }
		public TerminalNode SquareClose() { return getToken(MMS_SurfaceRules.SquareClose, 0); }
		public List<TerminalNode> NL() { return getTokens(MMS_SurfaceRules.NL); }
		public TerminalNode NL(int i) {
			return getToken(MMS_SurfaceRules.NL, i);
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
		enterRule(_localctx, 26, RULE_surfaceCondition_Biome);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(Keyword_Biome);
			setState(203);
			match(SquareOpen);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(204);
				match(NL);
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Keyword_Surface) | (1L << Keyword_Rule) | (1L << Keyword_Condition) | (1L << Keyword_Sequence) | (1L << Keyword_Block) | (1L << Keyword_Bandlands) | (1L << Keyword_AbovePreliminarySurface) | (1L << Keyword_Biome) | (1L << Keyword_Hole) | (1L << Keyword_Noise) | (1L << Keyword_Steep) | (1L << Keyword_StoneDepth) | (1L << Keyword_Freezing) | (1L << Keyword_Temperature) | (1L << Keyword_VerticalGradient) | (1L << Keyword_AboveWater) | (1L << Keyword_YAbove) | (1L << Keyword_Floor) | (1L << Keyword_Ceiling) | (1L << Keyword_And) | (1L << Keyword_Add) | (1L << Keyword_Sub) | (1L << Keyword_Absolute) | (1L << Keyword_AboveBottom) | (1L << Keyword_BelowTop) | (1L << Keyword_Namespace) | (1L << Keyword_If) | (1L << Keyword_Else) | (1L << Keyword_In) | (1L << Identifier))) != 0)) {
				{
				{
				setState(210);
				resourceReference();
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(211);
					match(NL);
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
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
		public TerminalNode Keyword_Hole() { return getToken(MMS_SurfaceRules.Keyword_Hole, 0); }
		public SurfaceCondition_HoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition_Hole; }
	}

	public final SurfaceCondition_HoleContext surfaceCondition_Hole() throws RecognitionException {
		SurfaceCondition_HoleContext _localctx = new SurfaceCondition_HoleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_surfaceCondition_Hole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
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
		public TerminalNode Keyword_Noise() { return getToken(MMS_SurfaceRules.Keyword_Noise, 0); }
		public ResourceReferenceContext resourceReference() {
			return getRuleContext(ResourceReferenceContext.class,0);
		}
		public TerminalNode SquareOpen() { return getToken(MMS_SurfaceRules.SquareOpen, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode Comma() { return getToken(MMS_SurfaceRules.Comma, 0); }
		public TerminalNode SquareClose() { return getToken(MMS_SurfaceRules.SquareClose, 0); }
		public SurfaceCondition_NoiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition_Noise; }
	}

	public final SurfaceCondition_NoiseContext surfaceCondition_Noise() throws RecognitionException {
		SurfaceCondition_NoiseContext _localctx = new SurfaceCondition_NoiseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_surfaceCondition_Noise);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(Keyword_Noise);
			setState(227);
			resourceReference();
			setState(228);
			match(SquareOpen);
			setState(229);
			number();
			setState(230);
			match(Comma);
			setState(231);
			number();
			setState(232);
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
		public TerminalNode Keyword_Steep() { return getToken(MMS_SurfaceRules.Keyword_Steep, 0); }
		public SurfaceCondition_SteepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition_Steep; }
	}

	public final SurfaceCondition_SteepContext surfaceCondition_Steep() throws RecognitionException {
		SurfaceCondition_SteepContext _localctx = new SurfaceCondition_SteepContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_surfaceCondition_Steep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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
		public TerminalNode Keyword_StoneDepth() { return getToken(MMS_SurfaceRules.Keyword_StoneDepth, 0); }
		public List<TerminalNode> Int() { return getTokens(MMS_SurfaceRules.Int); }
		public TerminalNode Int(int i) {
			return getToken(MMS_SurfaceRules.Int, i);
		}
		public TerminalNode Keyword_Floor() { return getToken(MMS_SurfaceRules.Keyword_Floor, 0); }
		public TerminalNode Keyword_Ceiling() { return getToken(MMS_SurfaceRules.Keyword_Ceiling, 0); }
		public TerminalNode Keyword_Add() { return getToken(MMS_SurfaceRules.Keyword_Add, 0); }
		public TerminalNode Keyword_Sub() { return getToken(MMS_SurfaceRules.Keyword_Sub, 0); }
		public SurfaceCondition_StoneDepthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition_StoneDepth; }
	}

	public final SurfaceCondition_StoneDepthContext surfaceCondition_StoneDepth() throws RecognitionException {
		SurfaceCondition_StoneDepthContext _localctx = new SurfaceCondition_StoneDepthContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_surfaceCondition_StoneDepth);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(Keyword_StoneDepth);
			setState(237);
			_la = _input.LA(1);
			if ( !(_la==Keyword_Floor || _la==Keyword_Ceiling) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(238);
			match(Int);
			setState(239);
			_la = _input.LA(1);
			if ( !(_la==Keyword_Add || _la==Keyword_Sub) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(240);
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
		public TerminalNode Keyword_Freezing() { return getToken(MMS_SurfaceRules.Keyword_Freezing, 0); }
		public SurfaceCondition_FreezingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition_Freezing; }
	}

	public final SurfaceCondition_FreezingContext surfaceCondition_Freezing() throws RecognitionException {
		SurfaceCondition_FreezingContext _localctx = new SurfaceCondition_FreezingContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_surfaceCondition_Freezing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
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
		public TerminalNode Keyword_VerticalGradient() { return getToken(MMS_SurfaceRules.Keyword_VerticalGradient, 0); }
		public TerminalNode String() { return getToken(MMS_SurfaceRules.String, 0); }
		public List<VerticalAnchorContext> verticalAnchor() {
			return getRuleContexts(VerticalAnchorContext.class);
		}
		public VerticalAnchorContext verticalAnchor(int i) {
			return getRuleContext(VerticalAnchorContext.class,i);
		}
		public TerminalNode Comma() { return getToken(MMS_SurfaceRules.Comma, 0); }
		public SurfaceCondition_VerticalGradientContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition_VerticalGradient; }
	}

	public final SurfaceCondition_VerticalGradientContext surfaceCondition_VerticalGradient() throws RecognitionException {
		SurfaceCondition_VerticalGradientContext _localctx = new SurfaceCondition_VerticalGradientContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_surfaceCondition_VerticalGradient);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(Keyword_VerticalGradient);
			setState(245);
			match(String);
			setState(246);
			verticalAnchor();
			setState(247);
			match(Comma);
			setState(248);
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
		public TerminalNode Keyword_AboveWater() { return getToken(MMS_SurfaceRules.Keyword_AboveWater, 0); }
		public TerminalNode Int() { return getToken(MMS_SurfaceRules.Int, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode Keyword_Add() { return getToken(MMS_SurfaceRules.Keyword_Add, 0); }
		public TerminalNode Keyword_Sub() { return getToken(MMS_SurfaceRules.Keyword_Sub, 0); }
		public SurfaceCondition_AboveWaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition_AboveWater; }
	}

	public final SurfaceCondition_AboveWaterContext surfaceCondition_AboveWater() throws RecognitionException {
		SurfaceCondition_AboveWaterContext _localctx = new SurfaceCondition_AboveWaterContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_surfaceCondition_AboveWater);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(Keyword_AboveWater);
			setState(251);
			match(Int);
			setState(252);
			number();
			setState(253);
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
		public TerminalNode Keyword_YAbove() { return getToken(MMS_SurfaceRules.Keyword_YAbove, 0); }
		public VerticalAnchorContext verticalAnchor() {
			return getRuleContext(VerticalAnchorContext.class,0);
		}
		public TerminalNode Int() { return getToken(MMS_SurfaceRules.Int, 0); }
		public TerminalNode Keyword_Add() { return getToken(MMS_SurfaceRules.Keyword_Add, 0); }
		public TerminalNode Keyword_Sub() { return getToken(MMS_SurfaceRules.Keyword_Sub, 0); }
		public SurfaceCondition_YAboveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition_YAbove; }
	}

	public final SurfaceCondition_YAboveContext surfaceCondition_YAbove() throws RecognitionException {
		SurfaceCondition_YAboveContext _localctx = new SurfaceCondition_YAboveContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_surfaceCondition_YAbove);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(Keyword_YAbove);
			setState(256);
			verticalAnchor();
			setState(257);
			match(Int);
			setState(258);
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
		public TerminalNode Bang() { return getToken(MMS_SurfaceRules.Bang, 0); }
		public SurfaceCondition_Compound__ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition_Compound__Item; }
	}

	public final SurfaceCondition_Compound__ItemContext surfaceCondition_Compound__Item() throws RecognitionException {
		SurfaceCondition_Compound__ItemContext _localctx = new SurfaceCondition_Compound__ItemContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_surfaceCondition_Compound__Item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(260);
				match(Bang);
				}
			}

			setState(263);
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
		public TerminalNode Keyword_And() { return getToken(MMS_SurfaceRules.Keyword_And, 0); }
		public TerminalNode RoundOpen() { return getToken(MMS_SurfaceRules.RoundOpen, 0); }
		public TerminalNode RoundClose() { return getToken(MMS_SurfaceRules.RoundClose, 0); }
		public List<TerminalNode> NL() { return getTokens(MMS_SurfaceRules.NL); }
		public TerminalNode NL(int i) {
			return getToken(MMS_SurfaceRules.NL, i);
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
		enterRule(_localctx, 46, RULE_surfaceCondition_Compound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(Keyword_And);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(266);
				match(NL);
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272);
			match(RoundOpen);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(273);
				match(NL);
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Keyword_Surface) | (1L << Keyword_Rule) | (1L << Keyword_Condition) | (1L << Keyword_Sequence) | (1L << Keyword_Block) | (1L << Keyword_Bandlands) | (1L << Keyword_AbovePreliminarySurface) | (1L << Keyword_Biome) | (1L << Keyword_Hole) | (1L << Keyword_Noise) | (1L << Keyword_Steep) | (1L << Keyword_StoneDepth) | (1L << Keyword_Freezing) | (1L << Keyword_Temperature) | (1L << Keyword_VerticalGradient) | (1L << Keyword_AboveWater) | (1L << Keyword_YAbove) | (1L << Keyword_Floor) | (1L << Keyword_Ceiling) | (1L << Keyword_And) | (1L << Keyword_Add) | (1L << Keyword_Sub) | (1L << Keyword_Absolute) | (1L << Keyword_AboveBottom) | (1L << Keyword_BelowTop) | (1L << Keyword_Namespace) | (1L << Keyword_If) | (1L << Keyword_Else) | (1L << Keyword_In) | (1L << Bang) | (1L << Identifier))) != 0)) {
				{
				{
				setState(279);
				surfaceCondition_Compound__Item();
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(280);
					match(NL);
					}
					}
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
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
		public TerminalNode Colon() { return getToken(MMS_SurfaceRules.Colon, 0); }
		public List<KeywordContext> keyword() {
			return getRuleContexts(KeywordContext.class);
		}
		public KeywordContext keyword(int i) {
			return getRuleContext(KeywordContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(MMS_SurfaceRules.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MMS_SurfaceRules.Identifier, i);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Keyword_Surface:
			case Keyword_Rule:
			case Keyword_Condition:
			case Keyword_Sequence:
			case Keyword_Block:
			case Keyword_Bandlands:
			case Keyword_AbovePreliminarySurface:
			case Keyword_Biome:
			case Keyword_Hole:
			case Keyword_Noise:
			case Keyword_Steep:
			case Keyword_StoneDepth:
			case Keyword_Freezing:
			case Keyword_Temperature:
			case Keyword_VerticalGradient:
			case Keyword_AboveWater:
			case Keyword_YAbove:
			case Keyword_Floor:
			case Keyword_Ceiling:
			case Keyword_And:
			case Keyword_Add:
			case Keyword_Sub:
			case Keyword_Absolute:
			case Keyword_AboveBottom:
			case Keyword_BelowTop:
			case Keyword_Namespace:
			case Keyword_If:
			case Keyword_Else:
			case Keyword_In:
				{
				setState(293);
				keyword();
				}
				break;
			case Identifier:
				{
				setState(294);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(297);
			match(Colon);
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Keyword_Surface:
			case Keyword_Rule:
			case Keyword_Condition:
			case Keyword_Sequence:
			case Keyword_Block:
			case Keyword_Bandlands:
			case Keyword_AbovePreliminarySurface:
			case Keyword_Biome:
			case Keyword_Hole:
			case Keyword_Noise:
			case Keyword_Steep:
			case Keyword_StoneDepth:
			case Keyword_Freezing:
			case Keyword_Temperature:
			case Keyword_VerticalGradient:
			case Keyword_AboveWater:
			case Keyword_YAbove:
			case Keyword_Floor:
			case Keyword_Ceiling:
			case Keyword_And:
			case Keyword_Add:
			case Keyword_Sub:
			case Keyword_Absolute:
			case Keyword_AboveBottom:
			case Keyword_BelowTop:
			case Keyword_Namespace:
			case Keyword_If:
			case Keyword_Else:
			case Keyword_In:
				{
				setState(298);
				keyword();
				}
				break;
			case Identifier:
				{
				setState(299);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ResourceReferenceContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MMS_SurfaceRules.Identifier, 0); }
		public ResourceReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceReference; }
	}

	public final ResourceReferenceContext resourceReference() throws RecognitionException {
		ResourceReferenceContext _localctx = new ResourceReferenceContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_resourceReference);
		try {
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				reference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Keyword_Surface:
				case Keyword_Rule:
				case Keyword_Condition:
				case Keyword_Sequence:
				case Keyword_Block:
				case Keyword_Bandlands:
				case Keyword_AbovePreliminarySurface:
				case Keyword_Biome:
				case Keyword_Hole:
				case Keyword_Noise:
				case Keyword_Steep:
				case Keyword_StoneDepth:
				case Keyword_Freezing:
				case Keyword_Temperature:
				case Keyword_VerticalGradient:
				case Keyword_AboveWater:
				case Keyword_YAbove:
				case Keyword_Floor:
				case Keyword_Ceiling:
				case Keyword_And:
				case Keyword_Add:
				case Keyword_Sub:
				case Keyword_Absolute:
				case Keyword_AboveBottom:
				case Keyword_BelowTop:
				case Keyword_Namespace:
				case Keyword_If:
				case Keyword_Else:
				case Keyword_In:
					{
					setState(303);
					keyword();
					}
					break;
				case Identifier:
					{
					setState(304);
					match(Identifier);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
		public TerminalNode Int() { return getToken(MMS_SurfaceRules.Int, 0); }
		public TerminalNode Float() { return getToken(MMS_SurfaceRules.Float, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode Keyword_Surface() { return getToken(MMS_SurfaceRules.Keyword_Surface, 0); }
		public TerminalNode Keyword_Rule() { return getToken(MMS_SurfaceRules.Keyword_Rule, 0); }
		public TerminalNode Keyword_Condition() { return getToken(MMS_SurfaceRules.Keyword_Condition, 0); }
		public TerminalNode Keyword_Sequence() { return getToken(MMS_SurfaceRules.Keyword_Sequence, 0); }
		public TerminalNode Keyword_Block() { return getToken(MMS_SurfaceRules.Keyword_Block, 0); }
		public TerminalNode Keyword_Bandlands() { return getToken(MMS_SurfaceRules.Keyword_Bandlands, 0); }
		public TerminalNode Keyword_AbovePreliminarySurface() { return getToken(MMS_SurfaceRules.Keyword_AbovePreliminarySurface, 0); }
		public TerminalNode Keyword_Biome() { return getToken(MMS_SurfaceRules.Keyword_Biome, 0); }
		public TerminalNode Keyword_Hole() { return getToken(MMS_SurfaceRules.Keyword_Hole, 0); }
		public TerminalNode Keyword_Noise() { return getToken(MMS_SurfaceRules.Keyword_Noise, 0); }
		public TerminalNode Keyword_Steep() { return getToken(MMS_SurfaceRules.Keyword_Steep, 0); }
		public TerminalNode Keyword_StoneDepth() { return getToken(MMS_SurfaceRules.Keyword_StoneDepth, 0); }
		public TerminalNode Keyword_Freezing() { return getToken(MMS_SurfaceRules.Keyword_Freezing, 0); }
		public TerminalNode Keyword_Temperature() { return getToken(MMS_SurfaceRules.Keyword_Temperature, 0); }
		public TerminalNode Keyword_VerticalGradient() { return getToken(MMS_SurfaceRules.Keyword_VerticalGradient, 0); }
		public TerminalNode Keyword_AboveWater() { return getToken(MMS_SurfaceRules.Keyword_AboveWater, 0); }
		public TerminalNode Keyword_YAbove() { return getToken(MMS_SurfaceRules.Keyword_YAbove, 0); }
		public TerminalNode Keyword_Floor() { return getToken(MMS_SurfaceRules.Keyword_Floor, 0); }
		public TerminalNode Keyword_Ceiling() { return getToken(MMS_SurfaceRules.Keyword_Ceiling, 0); }
		public TerminalNode Keyword_And() { return getToken(MMS_SurfaceRules.Keyword_And, 0); }
		public TerminalNode Keyword_Add() { return getToken(MMS_SurfaceRules.Keyword_Add, 0); }
		public TerminalNode Keyword_Sub() { return getToken(MMS_SurfaceRules.Keyword_Sub, 0); }
		public TerminalNode Keyword_Absolute() { return getToken(MMS_SurfaceRules.Keyword_Absolute, 0); }
		public TerminalNode Keyword_AboveBottom() { return getToken(MMS_SurfaceRules.Keyword_AboveBottom, 0); }
		public TerminalNode Keyword_BelowTop() { return getToken(MMS_SurfaceRules.Keyword_BelowTop, 0); }
		public TerminalNode Keyword_Namespace() { return getToken(MMS_SurfaceRules.Keyword_Namespace, 0); }
		public TerminalNode Keyword_If() { return getToken(MMS_SurfaceRules.Keyword_If, 0); }
		public TerminalNode Keyword_Else() { return getToken(MMS_SurfaceRules.Keyword_Else, 0); }
		public TerminalNode Keyword_In() { return getToken(MMS_SurfaceRules.Keyword_In, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Keyword_Surface) | (1L << Keyword_Rule) | (1L << Keyword_Condition) | (1L << Keyword_Sequence) | (1L << Keyword_Block) | (1L << Keyword_Bandlands) | (1L << Keyword_AbovePreliminarySurface) | (1L << Keyword_Biome) | (1L << Keyword_Hole) | (1L << Keyword_Noise) | (1L << Keyword_Steep) | (1L << Keyword_StoneDepth) | (1L << Keyword_Freezing) | (1L << Keyword_Temperature) | (1L << Keyword_VerticalGradient) | (1L << Keyword_AboveWater) | (1L << Keyword_YAbove) | (1L << Keyword_Floor) | (1L << Keyword_Ceiling) | (1L << Keyword_And) | (1L << Keyword_Add) | (1L << Keyword_Sub) | (1L << Keyword_Absolute) | (1L << Keyword_AboveBottom) | (1L << Keyword_BelowTop) | (1L << Keyword_Namespace) | (1L << Keyword_If) | (1L << Keyword_Else) | (1L << Keyword_In))) != 0)) ) {
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
		enterRule(_localctx, 56, RULE_verticalAnchor);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Keyword_Absolute:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				verticalAnchor_Absolute();
				}
				break;
			case Keyword_AboveBottom:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				verticalAnchor_AboveBottom();
				}
				break;
			case Keyword_BelowTop:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
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
		public TerminalNode Keyword_Absolute() { return getToken(MMS_SurfaceRules.Keyword_Absolute, 0); }
		public TerminalNode Int() { return getToken(MMS_SurfaceRules.Int, 0); }
		public VerticalAnchor_AbsoluteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verticalAnchor_Absolute; }
	}

	public final VerticalAnchor_AbsoluteContext verticalAnchor_Absolute() throws RecognitionException {
		VerticalAnchor_AbsoluteContext _localctx = new VerticalAnchor_AbsoluteContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_verticalAnchor_Absolute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(Keyword_Absolute);
			setState(319);
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
		public TerminalNode Keyword_AboveBottom() { return getToken(MMS_SurfaceRules.Keyword_AboveBottom, 0); }
		public TerminalNode Int() { return getToken(MMS_SurfaceRules.Int, 0); }
		public VerticalAnchor_AboveBottomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verticalAnchor_AboveBottom; }
	}

	public final VerticalAnchor_AboveBottomContext verticalAnchor_AboveBottom() throws RecognitionException {
		VerticalAnchor_AboveBottomContext _localctx = new VerticalAnchor_AboveBottomContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_verticalAnchor_AboveBottom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(Keyword_AboveBottom);
			setState(322);
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
		public TerminalNode Keyword_BelowTop() { return getToken(MMS_SurfaceRules.Keyword_BelowTop, 0); }
		public TerminalNode Int() { return getToken(MMS_SurfaceRules.Int, 0); }
		public VerticalAnchor_BelowTopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verticalAnchor_BelowTop; }
	}

	public final VerticalAnchor_BelowTopContext verticalAnchor_BelowTop() throws RecognitionException {
		VerticalAnchor_BelowTopContext _localctx = new VerticalAnchor_BelowTopContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_verticalAnchor_BelowTop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(Keyword_BelowTop);
			setState(325);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u014a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\3\3\3\7\3H\n\3\f\3\16\3K\13\3\3\3\3\3\5\3O\n\3\3\3\7"+
		"\3R\n\3\f\3\16\3U\13\3\7\3W\n\3\f\3\16\3Z\13\3\3\3\3\3\3\4\3\4\5\4`\n"+
		"\4\3\5\3\5\3\5\7\5e\n\5\f\5\16\5h\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6"+
		"q\n\6\3\7\3\7\7\7u\n\7\f\7\16\7x\13\7\3\7\5\7{\n\7\3\7\3\7\7\7\177\n\7"+
		"\f\7\16\7\u0082\13\7\3\7\3\7\7\7\u0086\n\7\f\7\16\7\u0089\13\7\3\7\3\7"+
		"\7\7\u008d\n\7\f\7\16\7\u0090\13\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\7\n\u009c\n\n\f\n\16\n\u009f\13\n\3\n\3\n\7\n\u00a3\n\n\f\n\16\n"+
		"\u00a6\13\n\7\n\u00a8\n\n\f\n\16\n\u00ab\13\n\3\n\3\n\3\13\3\13\5\13\u00b1"+
		"\n\13\3\f\3\f\3\f\7\f\u00b6\n\f\f\f\16\f\u00b9\13\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c9\n\r\3\16\3\16\3\17\3"+
		"\17\3\17\7\17\u00d0\n\17\f\17\16\17\u00d3\13\17\3\17\3\17\7\17\u00d7\n"+
		"\17\f\17\16\17\u00da\13\17\7\17\u00dc\n\17\f\17\16\17\u00df\13\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\5\30\u0108\n\30\3\30"+
		"\3\30\3\31\3\31\7\31\u010e\n\31\f\31\16\31\u0111\13\31\3\31\3\31\7\31"+
		"\u0115\n\31\f\31\16\31\u0118\13\31\3\31\3\31\7\31\u011c\n\31\f\31\16\31"+
		"\u011f\13\31\7\31\u0121\n\31\f\31\16\31\u0124\13\31\3\31\3\31\3\32\3\32"+
		"\5\32\u012a\n\32\3\32\3\32\3\32\5\32\u012f\n\32\3\33\3\33\3\33\5\33\u0134"+
		"\n\33\5\33\u0136\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\5\36\u013f\n"+
		"\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\2\2\"\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\6\3\2\26\27\3\2\31\32\3\2"+
		"\3\4\3\2\5!\2\u0156\2B\3\2\2\2\4E\3\2\2\2\6_\3\2\2\2\ba\3\2\2\2\np\3\2"+
		"\2\2\fr\3\2\2\2\16\u0093\3\2\2\2\20\u0095\3\2\2\2\22\u0098\3\2\2\2\24"+
		"\u00b0\3\2\2\2\26\u00b2\3\2\2\2\30\u00c8\3\2\2\2\32\u00ca\3\2\2\2\34\u00cc"+
		"\3\2\2\2\36\u00e2\3\2\2\2 \u00e4\3\2\2\2\"\u00ec\3\2\2\2$\u00ee\3\2\2"+
		"\2&\u00f4\3\2\2\2(\u00f6\3\2\2\2*\u00fc\3\2\2\2,\u0101\3\2\2\2.\u0107"+
		"\3\2\2\2\60\u010b\3\2\2\2\62\u0129\3\2\2\2\64\u0135\3\2\2\2\66\u0137\3"+
		"\2\2\28\u0139\3\2\2\2:\u013e\3\2\2\2<\u0140\3\2\2\2>\u0143\3\2\2\2@\u0146"+
		"\3\2\2\2BC\7\5\2\2CD\5\4\3\2D\3\3\2\2\2EI\7&\2\2FH\7#\2\2GF\3\2\2\2HK"+
		"\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JX\3\2\2\2KI\3\2\2\2LO\5\b\5\2MO\5\26\f\2"+
		"NL\3\2\2\2NM\3\2\2\2OS\3\2\2\2PR\7#\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2"+
		"ST\3\2\2\2TW\3\2\2\2US\3\2\2\2VN\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2"+
		"Y[\3\2\2\2ZX\3\2\2\2[\\\7\'\2\2\\\5\3\2\2\2]`\7/\2\2^`\5\62\32\2_]\3\2"+
		"\2\2_^\3\2\2\2`\7\3\2\2\2ab\7\6\2\2bf\7/\2\2ce\7#\2\2dc\3\2\2\2eh\3\2"+
		"\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\5\n\6\2j\t\3\2\2\2kq\5"+
		"\f\7\2lq\5\16\b\2mq\5\20\t\2nq\5\22\n\2oq\5\6\4\2pk\3\2\2\2pl\3\2\2\2"+
		"pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q\13\3\2\2\2rv\7\37\2\2su\7#\2\2ts\3\2\2"+
		"\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wz\3\2\2\2xv\3\2\2\2y{\7*\2\2zy\3\2\2"+
		"\2z{\3\2\2\2{|\3\2\2\2|\u0080\7(\2\2}\177\7#\2\2~}\3\2\2\2\177\u0082\3"+
		"\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0083\u0087\5\30\r\2\u0084\u0086\7#\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u008a\u008e\7)\2\2\u008b\u008d\7#\2\2\u008c\u008b"+
		"\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\5\n\6\2\u0092\r\3\2\2\2"+
		"\u0093\u0094\7\n\2\2\u0094\17\3\2\2\2\u0095\u0096\7\t\2\2\u0096\u0097"+
		"\5\64\33\2\u0097\21\3\2\2\2\u0098\u0099\7\b\2\2\u0099\u009d\7$\2\2\u009a"+
		"\u009c\7#\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u00a9\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u00a4\5\n\6\2\u00a1\u00a3\7#\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\u00a0\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00ad\7%\2\2\u00ad\23\3\2\2\2\u00ae\u00b1\7/\2\2\u00af\u00b1\5\62\32"+
		"\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\25\3\2\2\2\u00b2\u00b3"+
		"\7\7\2\2\u00b3\u00b7\7/\2\2\u00b4\u00b6\7#\2\2\u00b5\u00b4\3\2\2\2\u00b6"+
		"\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\5\30\r\2\u00bb\27\3\2\2\2\u00bc\u00c9"+
		"\5\32\16\2\u00bd\u00c9\5\34\17\2\u00be\u00c9\5\36\20\2\u00bf\u00c9\5 "+
		"\21\2\u00c0\u00c9\5\"\22\2\u00c1\u00c9\5$\23\2\u00c2\u00c9\5&\24\2\u00c3"+
		"\u00c9\5(\25\2\u00c4\u00c9\5*\26\2\u00c5\u00c9\5,\27\2\u00c6\u00c9\5\60"+
		"\31\2\u00c7\u00c9\5\24\13\2\u00c8\u00bc\3\2\2\2\u00c8\u00bd\3\2\2\2\u00c8"+
		"\u00be\3\2\2\2\u00c8\u00bf\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c8\u00c1\3\2"+
		"\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c8"+
		"\u00c5\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\31\3\2\2"+
		"\2\u00ca\u00cb\7\13\2\2\u00cb\33\3\2\2\2\u00cc\u00cd\7\f\2\2\u00cd\u00d1"+
		"\7$\2\2\u00ce\u00d0\7#\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00dd\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d4\u00d8\5\64\33\2\u00d5\u00d7\7#\2\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00dc\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00db\u00d4\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2"+
		"\2\2\u00e0\u00e1\7%\2\2\u00e1\35\3\2\2\2\u00e2\u00e3\7\r\2\2\u00e3\37"+
		"\3\2\2\2\u00e4\u00e5\7\16\2\2\u00e5\u00e6\5\64\33\2\u00e6\u00e7\7$\2\2"+
		"\u00e7\u00e8\5\66\34\2\u00e8\u00e9\7+\2\2\u00e9\u00ea\5\66\34\2\u00ea"+
		"\u00eb\7%\2\2\u00eb!\3\2\2\2\u00ec\u00ed\7\17\2\2\u00ed#\3\2\2\2\u00ee"+
		"\u00ef\7\20\2\2\u00ef\u00f0\t\2\2\2\u00f0\u00f1\7\3\2\2\u00f1\u00f2\t"+
		"\3\2\2\u00f2\u00f3\7\3\2\2\u00f3%\3\2\2\2\u00f4\u00f5\7\21\2\2\u00f5\'"+
		"\3\2\2\2\u00f6\u00f7\7\23\2\2\u00f7\u00f8\7.\2\2\u00f8\u00f9\5:\36\2\u00f9"+
		"\u00fa\7+\2\2\u00fa\u00fb\5:\36\2\u00fb)\3\2\2\2\u00fc\u00fd\7\24\2\2"+
		"\u00fd\u00fe\7\3\2\2\u00fe\u00ff\5\66\34\2\u00ff\u0100\t\3\2\2\u0100+"+
		"\3\2\2\2\u0101\u0102\7\25\2\2\u0102\u0103\5:\36\2\u0103\u0104\7\3\2\2"+
		"\u0104\u0105\t\3\2\2\u0105-\3\2\2\2\u0106\u0108\7*\2\2\u0107\u0106\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\5\30\r\2\u010a"+
		"/\3\2\2\2\u010b\u010f\7\30\2\2\u010c\u010e\7#\2\2\u010d\u010c\3\2\2\2"+
		"\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112"+
		"\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0116\7(\2\2\u0113\u0115\7#\2\2\u0114"+
		"\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u0122\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011d\5.\30\2\u011a"+
		"\u011c\7#\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u0120"+
		"\u0119\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7)\2\2\u0126"+
		"\61\3\2\2\2\u0127\u012a\58\35\2\u0128\u012a\7/\2\2\u0129\u0127\3\2\2\2"+
		"\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012e\7,\2\2\u012c\u012f"+
		"\58\35\2\u012d\u012f\7/\2\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012f"+
		"\63\3\2\2\2\u0130\u0136\5\62\32\2\u0131\u0134\58\35\2\u0132\u0134\7/\2"+
		"\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0130"+
		"\3\2\2\2\u0135\u0133\3\2\2\2\u0136\65\3\2\2\2\u0137\u0138\t\4\2\2\u0138"+
		"\67\3\2\2\2\u0139\u013a\t\5\2\2\u013a9\3\2\2\2\u013b\u013f\5<\37\2\u013c"+
		"\u013f\5> \2\u013d\u013f\5@!\2\u013e\u013b\3\2\2\2\u013e\u013c\3\2\2\2"+
		"\u013e\u013d\3\2\2\2\u013f;\3\2\2\2\u0140\u0141\7\33\2\2\u0141\u0142\7"+
		"\3\2\2\u0142=\3\2\2\2\u0143\u0144\7\34\2\2\u0144\u0145\7\3\2\2\u0145?"+
		"\3\2\2\2\u0146\u0147\7\35\2\2\u0147\u0148\7\3\2\2\u0148A\3\2\2\2!INSX"+
		"_fpvz\u0080\u0087\u008e\u009d\u00a4\u00a9\u00b0\u00b7\u00c8\u00d1\u00d8"+
		"\u00dd\u0107\u010f\u0116\u011d\u0122\u0129\u012e\u0133\u0135\u013e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}