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
		Keyword_Surface=1, Keyword_Rule=2, Keyword_Condition=3, Keyword_Sequence=4, 
		Keyword_Block=5, Keyword_Bandlands=6, Keyword_AbovePreliminarySurface=7, 
		Keyword_Biome=8, Keyword_Hole=9, Keyword_Steep=10, Keyword_StoneDepth=11, 
		Keyword_Freezing=12, Keyword_Temperature=13, Keyword_VerticalGradient=14, 
		Keyword_AboveWater=15, Keyword_YAbove=16, Keyword_Namespace=17, Keyword_If=18, 
		Keyword_Else=19, Keyword_In=20, WS=21, NL=22, SquareOpen=23, SquareClose=24, 
		CurlyOpen=25, CurlyClose=26, RoundOpen=27, RoundClose=28, Bang=29, Colon=30, 
		SemiColon=31, Identifier=32;
	public static final int
		RULE_surfaceDeclaration = 0, RULE_surfaceDefinition = 1, RULE_surfaceRuleReference = 2, 
		RULE_surfaceRuleDeclaration = 3, RULE_surfaceRule = 4, RULE_surfaceRule_Conditional = 5, 
		RULE_surfaceRule_Block = 6, RULE_surfaceRule_Sequence = 7, RULE_reference = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"surfaceDeclaration", "surfaceDefinition", "surfaceRuleReference", "surfaceRuleDeclaration", 
			"surfaceRule", "surfaceRule_Conditional", "surfaceRule_Block", "surfaceRule_Sequence", 
			"reference"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'surface'", "'rule'", "'condition'", "'sequence'", "'block'", 
			"'bandlands'", "'above_preliminary_surface'", "'biome'", "'hole'", "'steep'", 
			"'stone_depth'", "'freezing'", "'temperature'", "'vertical_gradient'", 
			"'above_water'", "'y_above'", "'namespace'", "'if'", "'else'", "'in'", 
			null, null, "'['", "']'", "'{'", "'}'", "'('", "')'", "'!'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Keyword_Surface", "Keyword_Rule", "Keyword_Condition", "Keyword_Sequence", 
			"Keyword_Block", "Keyword_Bandlands", "Keyword_AbovePreliminarySurface", 
			"Keyword_Biome", "Keyword_Hole", "Keyword_Steep", "Keyword_StoneDepth", 
			"Keyword_Freezing", "Keyword_Temperature", "Keyword_VerticalGradient", 
			"Keyword_AboveWater", "Keyword_YAbove", "Keyword_Namespace", "Keyword_If", 
			"Keyword_Else", "Keyword_In", "WS", "NL", "SquareOpen", "SquareClose", 
			"CurlyOpen", "CurlyClose", "RoundOpen", "RoundClose", "Bang", "Colon", 
			"SemiColon", "Identifier"
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
			setState(18);
			match(Keyword_Surface);
			setState(19);
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
			setState(21);
			match(CurlyOpen);
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				match(NL);
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NL );
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Keyword_Rule) {
				{
				{
				setState(27);
				surfaceRuleDeclaration();
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(28);
					match(NL);
					}
					}
					setState(31); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL );
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
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
		public TerminalNode Keyword_Rule() { return getToken(MMS_SurfaceRules.Keyword_Rule, 0); }
		public TerminalNode RoundOpen() { return getToken(MMS_SurfaceRules.RoundOpen, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode RoundClose() { return getToken(MMS_SurfaceRules.RoundClose, 0); }
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
			setState(40);
			match(Keyword_Rule);
			setState(41);
			match(RoundOpen);
			setState(42);
			reference();
			setState(43);
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

	public static class SurfaceRuleDeclarationContext extends ParserRuleContext {
		public TerminalNode Keyword_Rule() { return getToken(MMS_SurfaceRules.Keyword_Rule, 0); }
		public TerminalNode Identifier() { return getToken(MMS_SurfaceRules.Identifier, 0); }
		public SurfaceRuleContext surfaceRule() {
			return getRuleContext(SurfaceRuleContext.class,0);
		}
		public SurfaceRuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRuleDeclaration; }
	}

	public final SurfaceRuleDeclarationContext surfaceRuleDeclaration() throws RecognitionException {
		SurfaceRuleDeclarationContext _localctx = new SurfaceRuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_surfaceRuleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(Keyword_Rule);
			setState(46);
			match(Identifier);
			setState(47);
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
		public SurfaceRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRule; }
	}

	public final SurfaceRuleContext surfaceRule() throws RecognitionException {
		SurfaceRuleContext _localctx = new SurfaceRuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_surfaceRule);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Keyword_If:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				surfaceRule_Conditional();
				}
				break;
			case Keyword_Block:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				surfaceRule_Block();
				}
				break;
			case Keyword_Sequence:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				surfaceRule_Sequence();
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
		public TerminalNode SquareOpen() { return getToken(MMS_SurfaceRules.SquareOpen, 0); }
		public TerminalNode SquareClose() { return getToken(MMS_SurfaceRules.SquareClose, 0); }
		public SurfaceRule_ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRule_Conditional; }
	}

	public final SurfaceRule_ConditionalContext surfaceRule_Conditional() throws RecognitionException {
		SurfaceRule_ConditionalContext _localctx = new SurfaceRule_ConditionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_surfaceRule_Conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(Keyword_If);
			setState(55);
			match(SquareOpen);
			setState(56);
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

	public static class SurfaceRule_BlockContext extends ParserRuleContext {
		public TerminalNode Keyword_Block() { return getToken(MMS_SurfaceRules.Keyword_Block, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
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
			setState(58);
			match(Keyword_Block);
			setState(59);
			reference();
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
		public List<SurfaceRuleReferenceContext> surfaceRuleReference() {
			return getRuleContexts(SurfaceRuleReferenceContext.class);
		}
		public SurfaceRuleReferenceContext surfaceRuleReference(int i) {
			return getRuleContext(SurfaceRuleReferenceContext.class,i);
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
			setState(61);
			match(Keyword_Sequence);
			setState(62);
			match(SquareOpen);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(63);
				match(NL);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Keyword_Rule) | (1L << Keyword_Sequence) | (1L << Keyword_Block) | (1L << Keyword_If))) != 0)) {
				{
				{
				setState(71);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Keyword_Sequence:
				case Keyword_Block:
				case Keyword_If:
					{
					setState(69);
					surfaceRule();
					}
					break;
				case Keyword_Rule:
					{
					setState(70);
					surfaceRuleReference();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(73);
					match(NL);
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
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
		enterRule(_localctx, 16, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(Identifier);
			setState(87);
			match(Colon);
			setState(88);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"]\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\3\3\3\6\3\32\n\3\r\3\16\3\33\3\3\3\3\6\3 \n\3\r\3\16\3!\7\3$\n\3\f"+
		"\3\16\3\'\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\5\6\67\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\7\tC\n\t\f\t\16\t"+
		"F\13\t\3\t\3\t\5\tJ\n\t\3\t\7\tM\n\t\f\t\16\tP\13\t\7\tR\n\t\f\t\16\t"+
		"U\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2\2\\"+
		"\2\24\3\2\2\2\4\27\3\2\2\2\6*\3\2\2\2\b/\3\2\2\2\n\66\3\2\2\2\f8\3\2\2"+
		"\2\16<\3\2\2\2\20?\3\2\2\2\22X\3\2\2\2\24\25\7\3\2\2\25\26\5\4\3\2\26"+
		"\3\3\2\2\2\27\31\7\33\2\2\30\32\7\30\2\2\31\30\3\2\2\2\32\33\3\2\2\2\33"+
		"\31\3\2\2\2\33\34\3\2\2\2\34%\3\2\2\2\35\37\5\b\5\2\36 \7\30\2\2\37\36"+
		"\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#\35\3\2\2\2$\'\3"+
		"\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\34\2\2)\5\3\2\2\2"+
		"*+\7\4\2\2+,\7\35\2\2,-\5\22\n\2-.\7\36\2\2.\7\3\2\2\2/\60\7\4\2\2\60"+
		"\61\7\"\2\2\61\62\5\n\6\2\62\t\3\2\2\2\63\67\5\f\7\2\64\67\5\16\b\2\65"+
		"\67\5\20\t\2\66\63\3\2\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67\13\3\2\2\28"+
		"9\7\24\2\29:\7\31\2\2:;\7\32\2\2;\r\3\2\2\2<=\7\7\2\2=>\5\22\n\2>\17\3"+
		"\2\2\2?@\7\6\2\2@D\7\31\2\2AC\7\30\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2D"+
		"E\3\2\2\2ES\3\2\2\2FD\3\2\2\2GJ\5\n\6\2HJ\5\6\4\2IG\3\2\2\2IH\3\2\2\2"+
		"JN\3\2\2\2KM\7\30\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OR\3\2\2"+
		"\2PN\3\2\2\2QI\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2"+
		"\2VW\7\32\2\2W\21\3\2\2\2XY\7\"\2\2YZ\7 \2\2Z[\7\"\2\2[\23\3\2\2\2\n\33"+
		"!%\66DINS";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}