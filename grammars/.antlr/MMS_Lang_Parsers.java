// Generated from /Users/brian/code/personal/mms/grammars/MMS_Lang_Parsers.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MMS_Lang_Parsers extends Parser {
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
		RULE_reference = 0, RULE_resourceReference = 1, RULE_number = 2, RULE_keyword = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"reference", "resourceReference", "number", "keyword"
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
	public String getGrammarFileName() { return "MMS_Lang_Parsers.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MMS_Lang_Parsers(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(MMS_Lang_Parsers.Colon, 0); }
		public List<KeywordContext> keyword() {
			return getRuleContexts(KeywordContext.class);
		}
		public KeywordContext keyword(int i) {
			return getRuleContext(KeywordContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(MMS_Lang_Parsers.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MMS_Lang_Parsers.Identifier, i);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
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
				setState(8);
				keyword();
				}
				break;
			case Identifier:
				{
				setState(9);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(12);
			match(Colon);
			setState(15);
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
				setState(13);
				keyword();
				}
				break;
			case Identifier:
				{
				setState(14);
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
		public TerminalNode Identifier() { return getToken(MMS_Lang_Parsers.Identifier, 0); }
		public ResourceReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceReference; }
	}

	public final ResourceReferenceContext resourceReference() throws RecognitionException {
		ResourceReferenceContext _localctx = new ResourceReferenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_resourceReference);
		try {
			setState(22);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				reference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
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
					setState(18);
					keyword();
					}
					break;
				case Identifier:
					{
					setState(19);
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
		public TerminalNode Int() { return getToken(MMS_Lang_Parsers.Int, 0); }
		public TerminalNode Float() { return getToken(MMS_Lang_Parsers.Float, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
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
		public TerminalNode Keyword_Surface() { return getToken(MMS_Lang_Parsers.Keyword_Surface, 0); }
		public TerminalNode Keyword_Rule() { return getToken(MMS_Lang_Parsers.Keyword_Rule, 0); }
		public TerminalNode Keyword_Condition() { return getToken(MMS_Lang_Parsers.Keyword_Condition, 0); }
		public TerminalNode Keyword_Sequence() { return getToken(MMS_Lang_Parsers.Keyword_Sequence, 0); }
		public TerminalNode Keyword_Block() { return getToken(MMS_Lang_Parsers.Keyword_Block, 0); }
		public TerminalNode Keyword_Bandlands() { return getToken(MMS_Lang_Parsers.Keyword_Bandlands, 0); }
		public TerminalNode Keyword_AbovePreliminarySurface() { return getToken(MMS_Lang_Parsers.Keyword_AbovePreliminarySurface, 0); }
		public TerminalNode Keyword_Biome() { return getToken(MMS_Lang_Parsers.Keyword_Biome, 0); }
		public TerminalNode Keyword_Hole() { return getToken(MMS_Lang_Parsers.Keyword_Hole, 0); }
		public TerminalNode Keyword_Noise() { return getToken(MMS_Lang_Parsers.Keyword_Noise, 0); }
		public TerminalNode Keyword_Steep() { return getToken(MMS_Lang_Parsers.Keyword_Steep, 0); }
		public TerminalNode Keyword_StoneDepth() { return getToken(MMS_Lang_Parsers.Keyword_StoneDepth, 0); }
		public TerminalNode Keyword_Freezing() { return getToken(MMS_Lang_Parsers.Keyword_Freezing, 0); }
		public TerminalNode Keyword_Temperature() { return getToken(MMS_Lang_Parsers.Keyword_Temperature, 0); }
		public TerminalNode Keyword_VerticalGradient() { return getToken(MMS_Lang_Parsers.Keyword_VerticalGradient, 0); }
		public TerminalNode Keyword_AboveWater() { return getToken(MMS_Lang_Parsers.Keyword_AboveWater, 0); }
		public TerminalNode Keyword_YAbove() { return getToken(MMS_Lang_Parsers.Keyword_YAbove, 0); }
		public TerminalNode Keyword_Floor() { return getToken(MMS_Lang_Parsers.Keyword_Floor, 0); }
		public TerminalNode Keyword_Ceiling() { return getToken(MMS_Lang_Parsers.Keyword_Ceiling, 0); }
		public TerminalNode Keyword_And() { return getToken(MMS_Lang_Parsers.Keyword_And, 0); }
		public TerminalNode Keyword_Add() { return getToken(MMS_Lang_Parsers.Keyword_Add, 0); }
		public TerminalNode Keyword_Sub() { return getToken(MMS_Lang_Parsers.Keyword_Sub, 0); }
		public TerminalNode Keyword_Absolute() { return getToken(MMS_Lang_Parsers.Keyword_Absolute, 0); }
		public TerminalNode Keyword_AboveBottom() { return getToken(MMS_Lang_Parsers.Keyword_AboveBottom, 0); }
		public TerminalNode Keyword_BelowTop() { return getToken(MMS_Lang_Parsers.Keyword_BelowTop, 0); }
		public TerminalNode Keyword_Namespace() { return getToken(MMS_Lang_Parsers.Keyword_Namespace, 0); }
		public TerminalNode Keyword_If() { return getToken(MMS_Lang_Parsers.Keyword_If, 0); }
		public TerminalNode Keyword_Else() { return getToken(MMS_Lang_Parsers.Keyword_Else, 0); }
		public TerminalNode Keyword_In() { return getToken(MMS_Lang_Parsers.Keyword_In, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\37\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\5\2\r\n\2\3\2\3\2\3\2\5\2\22\n\2\3\3\3\3"+
		"\3\3\5\3\27\n\3\5\3\31\n\3\3\4\3\4\3\5\3\5\3\5\2\2\6\2\4\6\b\2\4\3\2\3"+
		"\4\3\2\5!\2\36\2\f\3\2\2\2\4\30\3\2\2\2\6\32\3\2\2\2\b\34\3\2\2\2\n\r"+
		"\5\b\5\2\13\r\7/\2\2\f\n\3\2\2\2\f\13\3\2\2\2\r\16\3\2\2\2\16\21\7,\2"+
		"\2\17\22\5\b\5\2\20\22\7/\2\2\21\17\3\2\2\2\21\20\3\2\2\2\22\3\3\2\2\2"+
		"\23\31\5\2\2\2\24\27\5\b\5\2\25\27\7/\2\2\26\24\3\2\2\2\26\25\3\2\2\2"+
		"\27\31\3\2\2\2\30\23\3\2\2\2\30\26\3\2\2\2\31\5\3\2\2\2\32\33\t\2\2\2"+
		"\33\7\3\2\2\2\34\35\t\3\2\2\35\t\3\2\2\2\6\f\21\26\30";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}