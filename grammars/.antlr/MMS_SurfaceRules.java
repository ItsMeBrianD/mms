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
		RULE_surfaceDeclaration = 0, RULE_surfaceInline = 1, RULE_surfaceDefinition = 2, 
		RULE_surfaceRuleReference = 3, RULE_surfaceRuleDeclaration = 4, RULE_surfaceRule = 5, 
		RULE_surfaceRule_Conditional = 6, RULE_surfaceRule_Block = 7, RULE_surfaceRule_Sequence = 8, 
		RULE_reference = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"surfaceDeclaration", "surfaceInline", "surfaceDefinition", "surfaceRuleReference", 
			"surfaceRuleDeclaration", "surfaceRule", "surfaceRule_Conditional", "surfaceRule_Block", 
			"surfaceRule_Sequence", "reference"
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
		public TerminalNode Identifier() { return getToken(MMS_SurfaceRules.Identifier, 0); }
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
			setState(20);
			match(Keyword_Surface);
			setState(21);
			match(Identifier);
			setState(22);
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

	public static class SurfaceInlineContext extends ParserRuleContext {
		public TerminalNode Keyword_Surface() { return getToken(MMS_SurfaceRules.Keyword_Surface, 0); }
		public SurfaceDefinitionContext surfaceDefinition() {
			return getRuleContext(SurfaceDefinitionContext.class,0);
		}
		public SurfaceInlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceInline; }
	}

	public final SurfaceInlineContext surfaceInline() throws RecognitionException {
		SurfaceInlineContext _localctx = new SurfaceInlineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_surfaceInline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(Keyword_Surface);
			setState(25);
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
		enterRule(_localctx, 4, RULE_surfaceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(CurlyOpen);
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
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Keyword_Rule) {
				{
				{
				setState(33);
				surfaceRuleDeclaration();
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(34);
					match(NL);
					}
					}
					setState(37); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL );
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
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
		public TerminalNode Identifier() { return getToken(MMS_SurfaceRules.Identifier, 0); }
		public TerminalNode RoundClose() { return getToken(MMS_SurfaceRules.RoundClose, 0); }
		public SurfaceRuleReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRuleReference; }
	}

	public final SurfaceRuleReferenceContext surfaceRuleReference() throws RecognitionException {
		SurfaceRuleReferenceContext _localctx = new SurfaceRuleReferenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_surfaceRuleReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(Keyword_Rule);
			setState(47);
			match(RoundOpen);
			setState(48);
			match(Identifier);
			setState(49);
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
		enterRule(_localctx, 8, RULE_surfaceRuleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(Keyword_Rule);
			setState(52);
			match(Identifier);
			setState(53);
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
		enterRule(_localctx, 10, RULE_surfaceRule);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Keyword_If:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				surfaceRule_Conditional();
				}
				break;
			case Keyword_Block:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				surfaceRule_Block();
				}
				break;
			case Keyword_Sequence:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
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
		enterRule(_localctx, 12, RULE_surfaceRule_Conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(Keyword_If);
			setState(61);
			match(SquareOpen);
			setState(62);
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
		enterRule(_localctx, 14, RULE_surfaceRule_Block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(Keyword_Block);
			setState(65);
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
		enterRule(_localctx, 16, RULE_surfaceRule_Sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(Keyword_Sequence);
			setState(68);
			match(SquareOpen);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(69);
				match(NL);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Keyword_Rule) | (1L << Keyword_Sequence) | (1L << Keyword_Block) | (1L << Keyword_If))) != 0)) {
				{
				{
				setState(77);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Keyword_Sequence:
				case Keyword_Block:
				case Keyword_If:
					{
					setState(75);
					surfaceRule();
					}
					break;
				case Keyword_Rule:
					{
					setState(76);
					surfaceRuleReference();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(79);
					match(NL);
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
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
		enterRule(_localctx, 18, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(Identifier);
			setState(93);
			match(Colon);
			setState(94);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"c\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\6\4 \n\4\r\4\16\4!\3\4\3\4\6\4&\n\4"+
		"\r\4\16\4\'\7\4*\n\4\f\4\16\4-\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\5\7=\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\7\nI\n\n\f\n\16\nL\13\n\3\n\3\n\5\nP\n\n\3\n\7\nS\n\n\f\n\16\nV\13"+
		"\n\7\nX\n\n\f\n\16\n[\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\2\2\f\2\4"+
		"\6\b\n\f\16\20\22\24\2\2\2a\2\26\3\2\2\2\4\32\3\2\2\2\6\35\3\2\2\2\b\60"+
		"\3\2\2\2\n\65\3\2\2\2\f<\3\2\2\2\16>\3\2\2\2\20B\3\2\2\2\22E\3\2\2\2\24"+
		"^\3\2\2\2\26\27\7\3\2\2\27\30\7\"\2\2\30\31\5\6\4\2\31\3\3\2\2\2\32\33"+
		"\7\3\2\2\33\34\5\6\4\2\34\5\3\2\2\2\35\37\7\33\2\2\36 \7\30\2\2\37\36"+
		"\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"+\3\2\2\2#%\5\n\6\2$&\7\30"+
		"\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)#\3\2\2\2*-"+
		"\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7\34\2\2/\7\3\2\2\2"+
		"\60\61\7\4\2\2\61\62\7\35\2\2\62\63\7\"\2\2\63\64\7\36\2\2\64\t\3\2\2"+
		"\2\65\66\7\4\2\2\66\67\7\"\2\2\678\5\f\7\28\13\3\2\2\29=\5\16\b\2:=\5"+
		"\20\t\2;=\5\22\n\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\r\3\2\2\2>?\7\24\2\2"+
		"?@\7\31\2\2@A\7\32\2\2A\17\3\2\2\2BC\7\7\2\2CD\5\24\13\2D\21\3\2\2\2E"+
		"F\7\6\2\2FJ\7\31\2\2GI\7\30\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2"+
		"\2KY\3\2\2\2LJ\3\2\2\2MP\5\f\7\2NP\5\b\5\2OM\3\2\2\2ON\3\2\2\2PT\3\2\2"+
		"\2QS\7\30\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UX\3\2\2\2VT\3\2"+
		"\2\2WO\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7"+
		"\32\2\2]\23\3\2\2\2^_\7\"\2\2_`\7 \2\2`a\7\"\2\2a\25\3\2\2\2\n!\'+<JO"+
		"TY";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}