// Generated from /Users/brian/code/personal/mms/grammars/MMS_VerticalAnchor.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MMS_VerticalAnchor extends Parser {
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
		RULE_verticalAnchor = 0, RULE_verticalAnchor_Absolute = 1, RULE_verticalAnchor_AboveBottom = 2, 
		RULE_verticalAnchor_BelowTop = 3, RULE_reference = 4, RULE_resourceReference = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"verticalAnchor", "verticalAnchor_Absolute", "verticalAnchor_AboveBottom", 
			"verticalAnchor_BelowTop", "reference", "resourceReference"
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
	public String getGrammarFileName() { return "MMS_VerticalAnchor.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MMS_VerticalAnchor(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
		enterRule(_localctx, 0, RULE_verticalAnchor);
		try {
			setState(15);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Keyword_Absolute:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				verticalAnchor_Absolute();
				}
				break;
			case Keyword_AboveBottom:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				verticalAnchor_AboveBottom();
				}
				break;
			case Keyword_BelowTop:
				enterOuterAlt(_localctx, 3);
				{
				setState(14);
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
		public TerminalNode Keyword_Absolute() { return getToken(MMS_VerticalAnchor.Keyword_Absolute, 0); }
		public TerminalNode Int() { return getToken(MMS_VerticalAnchor.Int, 0); }
		public VerticalAnchor_AbsoluteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verticalAnchor_Absolute; }
	}

	public final VerticalAnchor_AbsoluteContext verticalAnchor_Absolute() throws RecognitionException {
		VerticalAnchor_AbsoluteContext _localctx = new VerticalAnchor_AbsoluteContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_verticalAnchor_Absolute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(Keyword_Absolute);
			setState(18);
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
		public TerminalNode Keyword_AboveBottom() { return getToken(MMS_VerticalAnchor.Keyword_AboveBottom, 0); }
		public TerminalNode Int() { return getToken(MMS_VerticalAnchor.Int, 0); }
		public VerticalAnchor_AboveBottomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verticalAnchor_AboveBottom; }
	}

	public final VerticalAnchor_AboveBottomContext verticalAnchor_AboveBottom() throws RecognitionException {
		VerticalAnchor_AboveBottomContext _localctx = new VerticalAnchor_AboveBottomContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_verticalAnchor_AboveBottom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(Keyword_AboveBottom);
			setState(21);
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
		public TerminalNode Keyword_BelowTop() { return getToken(MMS_VerticalAnchor.Keyword_BelowTop, 0); }
		public TerminalNode Int() { return getToken(MMS_VerticalAnchor.Int, 0); }
		public VerticalAnchor_BelowTopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verticalAnchor_BelowTop; }
	}

	public final VerticalAnchor_BelowTopContext verticalAnchor_BelowTop() throws RecognitionException {
		VerticalAnchor_BelowTopContext _localctx = new VerticalAnchor_BelowTopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_verticalAnchor_BelowTop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(Keyword_BelowTop);
			setState(24);
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

	public static class ReferenceContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(MMS_VerticalAnchor.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MMS_VerticalAnchor.Identifier, i);
		}
		public TerminalNode Colon() { return getToken(MMS_VerticalAnchor.Colon, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(Identifier);
			setState(27);
			match(Colon);
			setState(28);
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
		public TerminalNode Identifier() { return getToken(MMS_VerticalAnchor.Identifier, 0); }
		public ResourceReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceReference; }
	}

	public final ResourceReferenceContext resourceReference() throws RecognitionException {
		ResourceReferenceContext _localctx = new ResourceReferenceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_resourceReference);
		try {
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				reference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61%\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\5\2\22\n\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\5\7#\n\7\3\7\2\2\b\2"+
		"\4\6\b\n\f\2\2\2!\2\21\3\2\2\2\4\23\3\2\2\2\6\26\3\2\2\2\b\31\3\2\2\2"+
		"\n\34\3\2\2\2\f\"\3\2\2\2\16\22\5\4\3\2\17\22\5\6\4\2\20\22\5\b\5\2\21"+
		"\16\3\2\2\2\21\17\3\2\2\2\21\20\3\2\2\2\22\3\3\2\2\2\23\24\7\33\2\2\24"+
		"\25\7\3\2\2\25\5\3\2\2\2\26\27\7\34\2\2\27\30\7\3\2\2\30\7\3\2\2\2\31"+
		"\32\7\35\2\2\32\33\7\3\2\2\33\t\3\2\2\2\34\35\7/\2\2\35\36\7,\2\2\36\37"+
		"\7/\2\2\37\13\3\2\2\2 #\5\n\6\2!#\7/\2\2\" \3\2\2\2\"!\3\2\2\2#\r\3\2"+
		"\2\2\4\21\"";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}