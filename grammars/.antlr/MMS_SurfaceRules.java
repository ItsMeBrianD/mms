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
		RULE_surfaceRule_Block = 6, RULE_surfaceRule_Sequence = 7, RULE_surfaceConditionReference = 8, 
		RULE_surfaceConditionDeclaration = 9, RULE_surfaceCondition = 10, RULE_surfaceCondition_AboveSurface = 11, 
		RULE_surfaceCondition_Biome = 12, RULE_surfaceCondition_Hole = 13, RULE_surfaceCondition_Noise = 14, 
		RULE_surfaceCondition_Steep = 15, RULE_surfaceCondition_StoneDepth = 16, 
		RULE_surfaceCondition_Freezing = 17, RULE_surfaceCondition_VerticalGradient = 18, 
		RULE_surfaceCondition_AboveWater = 19, RULE_surfaceCondition_YAbove = 20, 
		RULE_surfaceCondition_Compound__Item = 21, RULE_surfaceCondition_Compound = 22, 
		RULE_reference = 23, RULE_resourceReference = 24, RULE_verticalAnchor = 25, 
		RULE_verticalAnchor_Absolute = 26, RULE_verticalAnchor_AboveBottom = 27, 
		RULE_verticalAnchor_BelowTop = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"surfaceDeclaration", "surfaceDefinition", "surfaceRuleReference", "surfaceRuleDeclaration", 
			"surfaceRule", "surfaceRule_Conditional", "surfaceRule_Block", "surfaceRule_Sequence", 
			"surfaceConditionReference", "surfaceConditionDeclaration", "surfaceCondition", 
			"surfaceCondition_AboveSurface", "surfaceCondition_Biome", "surfaceCondition_Hole", 
			"surfaceCondition_Noise", "surfaceCondition_Steep", "surfaceCondition_StoneDepth", 
			"surfaceCondition_Freezing", "surfaceCondition_VerticalGradient", "surfaceCondition_AboveWater", 
			"surfaceCondition_YAbove", "surfaceCondition_Compound__Item", "surfaceCondition_Compound", 
			"reference", "resourceReference", "verticalAnchor", "verticalAnchor_Absolute", 
			"verticalAnchor_AboveBottom", "verticalAnchor_BelowTop"
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
			setState(58);
			match(Keyword_Surface);
			setState(59);
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
			setState(61);
			match(CurlyOpen);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(62);
				match(NL);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Keyword_Rule || _la==Keyword_Condition) {
				{
				{
				setState(70);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Keyword_Rule:
					{
					setState(68);
					surfaceRuleDeclaration();
					}
					break;
				case Keyword_Condition:
					{
					setState(69);
					surfaceConditionDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(72);
					match(NL);
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
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
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(85);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(86);
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
			setState(89);
			match(Keyword_Rule);
			setState(90);
			match(Identifier);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(91);
				match(NL);
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
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
		enterRule(_localctx, 8, RULE_surfaceRule);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Keyword_If:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				surfaceRule_Conditional();
				}
				break;
			case Keyword_Block:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				surfaceRule_Block();
				}
				break;
			case Keyword_Sequence:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				surfaceRule_Sequence();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
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
			setState(105);
			match(Keyword_If);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(106);
				match(NL);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(112);
				match(Bang);
				}
			}

			setState(115);
			match(RoundOpen);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(116);
				match(NL);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			surfaceCondition();
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
			match(RoundClose);
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
			{
			setState(136);
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
		enterRule(_localctx, 12, RULE_surfaceRule_Block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(Keyword_Block);
			setState(139);
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
		enterRule(_localctx, 14, RULE_surfaceRule_Sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(Keyword_Sequence);
			setState(142);
			match(SquareOpen);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(143);
				match(NL);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Keyword_Sequence) | (1L << Keyword_Block) | (1L << Keyword_If) | (1L << Identifier))) != 0)) {
				{
				{
				{
				setState(149);
				surfaceRule();
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(150);
					match(NL);
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
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
		enterRule(_localctx, 16, RULE_surfaceConditionReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(163);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(164);
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
		public SurfaceConditionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceConditionDeclaration; }
	}

	public final SurfaceConditionDeclarationContext surfaceConditionDeclaration() throws RecognitionException {
		SurfaceConditionDeclarationContext _localctx = new SurfaceConditionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_surfaceConditionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(Keyword_Condition);
			setState(168);
			match(Identifier);
			setState(169);
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
		enterRule(_localctx, 20, RULE_surfaceCondition);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Keyword_AbovePreliminarySurface:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				surfaceCondition_AboveSurface();
				}
				break;
			case Keyword_Biome:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				surfaceCondition_Biome();
				}
				break;
			case Keyword_Hole:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				surfaceCondition_Hole();
				}
				break;
			case Keyword_Noise:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				surfaceCondition_Noise();
				}
				break;
			case Keyword_Steep:
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				surfaceCondition_Steep();
				}
				break;
			case Keyword_StoneDepth:
				enterOuterAlt(_localctx, 6);
				{
				setState(176);
				surfaceCondition_StoneDepth();
				}
				break;
			case Keyword_Freezing:
				enterOuterAlt(_localctx, 7);
				{
				setState(177);
				surfaceCondition_Freezing();
				}
				break;
			case Keyword_VerticalGradient:
				enterOuterAlt(_localctx, 8);
				{
				setState(178);
				surfaceCondition_VerticalGradient();
				}
				break;
			case Keyword_AboveWater:
				enterOuterAlt(_localctx, 9);
				{
				setState(179);
				surfaceCondition_AboveWater();
				}
				break;
			case Keyword_YAbove:
				enterOuterAlt(_localctx, 10);
				{
				setState(180);
				surfaceCondition_YAbove();
				}
				break;
			case Keyword_And:
				enterOuterAlt(_localctx, 11);
				{
				setState(181);
				surfaceCondition_Compound();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 12);
				{
				setState(182);
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
		public TerminalNode Keyword_AbovePreliminarySurface() { return getToken(MMS_SurfaceRules.Keyword_AbovePreliminarySurface, 0); }
		public SurfaceCondition_AboveSurfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition_AboveSurface; }
	}

	public final SurfaceCondition_AboveSurfaceContext surfaceCondition_AboveSurface() throws RecognitionException {
		SurfaceCondition_AboveSurfaceContext _localctx = new SurfaceCondition_AboveSurfaceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_surfaceCondition_AboveSurface);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
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
		enterRule(_localctx, 24, RULE_surfaceCondition_Biome);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(Keyword_Biome);
			setState(188);
			match(SquareOpen);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(189);
				match(NL);
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(195);
				resourceReference();
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
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
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
		enterRule(_localctx, 26, RULE_surfaceCondition_Hole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
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
		public List<TerminalNode> Float() { return getTokens(MMS_SurfaceRules.Float); }
		public TerminalNode Float(int i) {
			return getToken(MMS_SurfaceRules.Float, i);
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
		enterRule(_localctx, 28, RULE_surfaceCondition_Noise);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(Keyword_Noise);
			setState(212);
			resourceReference();
			setState(213);
			match(SquareOpen);
			setState(214);
			match(Float);
			setState(215);
			match(Comma);
			setState(216);
			match(Float);
			setState(217);
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
		enterRule(_localctx, 30, RULE_surfaceCondition_Steep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
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
		enterRule(_localctx, 32, RULE_surfaceCondition_StoneDepth);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(Keyword_StoneDepth);
			setState(222);
			_la = _input.LA(1);
			if ( !(_la==Keyword_Floor || _la==Keyword_Ceiling) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(223);
			match(Int);
			setState(224);
			_la = _input.LA(1);
			if ( !(_la==Keyword_Add || _la==Keyword_Sub) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(225);
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
		enterRule(_localctx, 34, RULE_surfaceCondition_Freezing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
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
		enterRule(_localctx, 36, RULE_surfaceCondition_VerticalGradient);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(Keyword_VerticalGradient);
			setState(230);
			match(String);
			setState(231);
			verticalAnchor();
			setState(232);
			match(Comma);
			setState(233);
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
		public TerminalNode Float() { return getToken(MMS_SurfaceRules.Float, 0); }
		public TerminalNode Keyword_Add() { return getToken(MMS_SurfaceRules.Keyword_Add, 0); }
		public TerminalNode Keyword_Sub() { return getToken(MMS_SurfaceRules.Keyword_Sub, 0); }
		public SurfaceCondition_AboveWaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition_AboveWater; }
	}

	public final SurfaceCondition_AboveWaterContext surfaceCondition_AboveWater() throws RecognitionException {
		SurfaceCondition_AboveWaterContext _localctx = new SurfaceCondition_AboveWaterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_surfaceCondition_AboveWater);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(Keyword_AboveWater);
			setState(236);
			match(Int);
			setState(237);
			match(Float);
			setState(238);
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
		enterRule(_localctx, 40, RULE_surfaceCondition_YAbove);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(Keyword_YAbove);
			setState(241);
			verticalAnchor();
			setState(242);
			match(Int);
			setState(243);
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
		enterRule(_localctx, 42, RULE_surfaceCondition_Compound__Item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(245);
				match(Bang);
				}
			}

			setState(248);
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
		enterRule(_localctx, 44, RULE_surfaceCondition_Compound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(Keyword_And);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(251);
				match(NL);
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			match(RoundOpen);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(258);
				match(NL);
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Keyword_AbovePreliminarySurface) | (1L << Keyword_Biome) | (1L << Keyword_Hole) | (1L << Keyword_Noise) | (1L << Keyword_Steep) | (1L << Keyword_StoneDepth) | (1L << Keyword_Freezing) | (1L << Keyword_VerticalGradient) | (1L << Keyword_AboveWater) | (1L << Keyword_YAbove) | (1L << Keyword_And) | (1L << Bang) | (1L << Identifier))) != 0)) {
				{
				{
				setState(264);
				surfaceCondition_Compound__Item();
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(265);
					match(NL);
					}
					}
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
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
		public List<TerminalNode> Identifier() { return getTokens(MMS_SurfaceRules.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MMS_SurfaceRules.Identifier, i);
		}
		public TerminalNode Colon() { return getToken(MMS_SurfaceRules.Colon, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(Identifier);
			setState(279);
			match(Colon);
			setState(280);
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
		public TerminalNode Identifier() { return getToken(MMS_SurfaceRules.Identifier, 0); }
		public ResourceReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceReference; }
	}

	public final ResourceReferenceContext resourceReference() throws RecognitionException {
		ResourceReferenceContext _localctx = new ResourceReferenceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_resourceReference);
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				reference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
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
		enterRule(_localctx, 50, RULE_verticalAnchor);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Keyword_Absolute:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				verticalAnchor_Absolute();
				}
				break;
			case Keyword_AboveBottom:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				verticalAnchor_AboveBottom();
				}
				break;
			case Keyword_BelowTop:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
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
		enterRule(_localctx, 52, RULE_verticalAnchor_Absolute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(Keyword_Absolute);
			setState(292);
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
		enterRule(_localctx, 54, RULE_verticalAnchor_AboveBottom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(Keyword_AboveBottom);
			setState(295);
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
		enterRule(_localctx, 56, RULE_verticalAnchor_BelowTop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(Keyword_BelowTop);
			setState(298);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u012f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\3\3\3"+
		"\7\3B\n\3\f\3\16\3E\13\3\3\3\3\3\5\3I\n\3\3\3\7\3L\n\3\f\3\16\3O\13\3"+
		"\7\3Q\n\3\f\3\16\3T\13\3\3\3\3\3\3\4\3\4\5\4Z\n\4\3\5\3\5\3\5\7\5_\n\5"+
		"\f\5\16\5b\13\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6j\n\6\3\7\3\7\7\7n\n\7\f\7"+
		"\16\7q\13\7\3\7\5\7t\n\7\3\7\3\7\7\7x\n\7\f\7\16\7{\13\7\3\7\3\7\7\7\177"+
		"\n\7\f\7\16\7\u0082\13\7\3\7\3\7\7\7\u0086\n\7\f\7\16\7\u0089\13\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u0093\n\t\f\t\16\t\u0096\13\t\3\t\3\t"+
		"\7\t\u009a\n\t\f\t\16\t\u009d\13\t\7\t\u009f\n\t\f\t\16\t\u00a2\13\t\3"+
		"\t\3\t\3\n\3\n\5\n\u00a8\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ba\n\f\3\r\3\r\3\16\3\16\3\16\7\16\u00c1"+
		"\n\16\f\16\16\16\u00c4\13\16\3\16\3\16\7\16\u00c8\n\16\f\16\16\16\u00cb"+
		"\13\16\7\16\u00cd\n\16\f\16\16\16\u00d0\13\16\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\5\27\u00f9\n\27\3\27\3\27\3\30\3\30\7\30"+
		"\u00ff\n\30\f\30\16\30\u0102\13\30\3\30\3\30\7\30\u0106\n\30\f\30\16\30"+
		"\u0109\13\30\3\30\3\30\7\30\u010d\n\30\f\30\16\30\u0110\13\30\7\30\u0112"+
		"\n\30\f\30\16\30\u0115\13\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\5"+
		"\32\u011f\n\32\3\33\3\33\3\33\5\33\u0124\n\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:\2\4\3\2\26\27\3\2\31\32\2\u0139\2<\3\2\2\2\4?"+
		"\3\2\2\2\6Y\3\2\2\2\b[\3\2\2\2\ni\3\2\2\2\fk\3\2\2\2\16\u008c\3\2\2\2"+
		"\20\u008f\3\2\2\2\22\u00a7\3\2\2\2\24\u00a9\3\2\2\2\26\u00b9\3\2\2\2\30"+
		"\u00bb\3\2\2\2\32\u00bd\3\2\2\2\34\u00d3\3\2\2\2\36\u00d5\3\2\2\2 \u00dd"+
		"\3\2\2\2\"\u00df\3\2\2\2$\u00e5\3\2\2\2&\u00e7\3\2\2\2(\u00ed\3\2\2\2"+
		"*\u00f2\3\2\2\2,\u00f8\3\2\2\2.\u00fc\3\2\2\2\60\u0118\3\2\2\2\62\u011e"+
		"\3\2\2\2\64\u0123\3\2\2\2\66\u0125\3\2\2\28\u0128\3\2\2\2:\u012b\3\2\2"+
		"\2<=\7\5\2\2=>\5\4\3\2>\3\3\2\2\2?C\7&\2\2@B\7#\2\2A@\3\2\2\2BE\3\2\2"+
		"\2CA\3\2\2\2CD\3\2\2\2DR\3\2\2\2EC\3\2\2\2FI\5\b\5\2GI\5\24\13\2HF\3\2"+
		"\2\2HG\3\2\2\2IM\3\2\2\2JL\7#\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2"+
		"\2\2NQ\3\2\2\2OM\3\2\2\2PH\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2"+
		"\2\2TR\3\2\2\2UV\7\'\2\2V\5\3\2\2\2WZ\7/\2\2XZ\5\60\31\2YW\3\2\2\2YX\3"+
		"\2\2\2Z\7\3\2\2\2[\\\7\6\2\2\\`\7/\2\2]_\7#\2\2^]\3\2\2\2_b\3\2\2\2`^"+
		"\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\5\n\6\2d\t\3\2\2\2ej\5\f\7\2"+
		"fj\5\16\b\2gj\5\20\t\2hj\5\6\4\2ie\3\2\2\2if\3\2\2\2ig\3\2\2\2ih\3\2\2"+
		"\2j\13\3\2\2\2ko\7\37\2\2ln\7#\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2"+
		"\2\2ps\3\2\2\2qo\3\2\2\2rt\7*\2\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uy\7(\2"+
		"\2vx\7#\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2"+
		"\2|\u0080\5\26\f\2}\177\7#\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2"+
		"\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0087\7)\2\2\u0084\u0086\7#\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2"+
		"\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u008a\u008b\5\n\6\2\u008b\r\3\2\2\2\u008c\u008d\7\t\2\2\u008d"+
		"\u008e\5\62\32\2\u008e\17\3\2\2\2\u008f\u0090\7\b\2\2\u0090\u0094\7$\2"+
		"\2\u0091\u0093\7#\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u00a0\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u009b\5\n\6\2\u0098\u009a\7#\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009f\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\u0097\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3"+
		"\u00a4\7%\2\2\u00a4\21\3\2\2\2\u00a5\u00a8\7/\2\2\u00a6\u00a8\5\60\31"+
		"\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\23\3\2\2\2\u00a9\u00aa"+
		"\7\7\2\2\u00aa\u00ab\7/\2\2\u00ab\u00ac\5\26\f\2\u00ac\25\3\2\2\2\u00ad"+
		"\u00ba\5\30\r\2\u00ae\u00ba\5\32\16\2\u00af\u00ba\5\34\17\2\u00b0\u00ba"+
		"\5\36\20\2\u00b1\u00ba\5 \21\2\u00b2\u00ba\5\"\22\2\u00b3\u00ba\5$\23"+
		"\2\u00b4\u00ba\5&\24\2\u00b5\u00ba\5(\25\2\u00b6\u00ba\5*\26\2\u00b7\u00ba"+
		"\5.\30\2\u00b8\u00ba\5\22\n\2\u00b9\u00ad\3\2\2\2\u00b9\u00ae\3\2\2\2"+
		"\u00b9\u00af\3\2\2\2\u00b9\u00b0\3\2\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00b2"+
		"\3\2\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b4\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9"+
		"\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\27\3\2\2"+
		"\2\u00bb\u00bc\7\13\2\2\u00bc\31\3\2\2\2\u00bd\u00be\7\f\2\2\u00be\u00c2"+
		"\7$\2\2\u00bf\u00c1\7#\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00ce\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c5\u00c9\5\62\32\2\u00c6\u00c8\7#\2\2\u00c7\u00c6\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cd\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00c5\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d1\u00d2\7%\2\2\u00d2\33\3\2\2\2\u00d3\u00d4\7\r\2\2\u00d4\35"+
		"\3\2\2\2\u00d5\u00d6\7\16\2\2\u00d6\u00d7\5\62\32\2\u00d7\u00d8\7$\2\2"+
		"\u00d8\u00d9\7\4\2\2\u00d9\u00da\7+\2\2\u00da\u00db\7\4\2\2\u00db\u00dc"+
		"\7%\2\2\u00dc\37\3\2\2\2\u00dd\u00de\7\17\2\2\u00de!\3\2\2\2\u00df\u00e0"+
		"\7\20\2\2\u00e0\u00e1\t\2\2\2\u00e1\u00e2\7\3\2\2\u00e2\u00e3\t\3\2\2"+
		"\u00e3\u00e4\7\3\2\2\u00e4#\3\2\2\2\u00e5\u00e6\7\21\2\2\u00e6%\3\2\2"+
		"\2\u00e7\u00e8\7\23\2\2\u00e8\u00e9\7.\2\2\u00e9\u00ea\5\64\33\2\u00ea"+
		"\u00eb\7+\2\2\u00eb\u00ec\5\64\33\2\u00ec\'\3\2\2\2\u00ed\u00ee\7\24\2"+
		"\2\u00ee\u00ef\7\3\2\2\u00ef\u00f0\7\4\2\2\u00f0\u00f1\t\3\2\2\u00f1)"+
		"\3\2\2\2\u00f2\u00f3\7\25\2\2\u00f3\u00f4\5\64\33\2\u00f4\u00f5\7\3\2"+
		"\2\u00f5\u00f6\t\3\2\2\u00f6+\3\2\2\2\u00f7\u00f9\7*\2\2\u00f8\u00f7\3"+
		"\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\5\26\f\2\u00fb"+
		"-\3\2\2\2\u00fc\u0100\7\30\2\2\u00fd\u00ff\7#\2\2\u00fe\u00fd\3\2\2\2"+
		"\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0107\7(\2\2\u0104\u0106\7#\2\2\u0105"+
		"\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\u0113\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010e\5,\27\2\u010b"+
		"\u010d\7#\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0111"+
		"\u010a\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7)\2\2\u0117"+
		"/\3\2\2\2\u0118\u0119\7/\2\2\u0119\u011a\7,\2\2\u011a\u011b\7/\2\2\u011b"+
		"\61\3\2\2\2\u011c\u011f\5\60\31\2\u011d\u011f\7/\2\2\u011e\u011c\3\2\2"+
		"\2\u011e\u011d\3\2\2\2\u011f\63\3\2\2\2\u0120\u0124\5\66\34\2\u0121\u0124"+
		"\58\35\2\u0122\u0124\5:\36\2\u0123\u0120\3\2\2\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0122\3\2\2\2\u0124\65\3\2\2\2\u0125\u0126\7\33\2\2\u0126\u0127\7\3\2"+
		"\2\u0127\67\3\2\2\2\u0128\u0129\7\34\2\2\u0129\u012a\7\3\2\2\u012a9\3"+
		"\2\2\2\u012b\u012c\7\35\2\2\u012c\u012d\7\3\2\2\u012d;\3\2\2\2\35CHMR"+
		"Y`iosy\u0080\u0087\u0094\u009b\u00a0\u00a7\u00b9\u00c2\u00c9\u00ce\u00f8"+
		"\u0100\u0107\u010e\u0113\u011e\u0123";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}