// Generated from /Users/brian/code/personal/mms/grammar/DensityFunctions.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DensityFunctions extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DensityFunctionStart=1, Keyword_Noise=2, Keyword_Constant=3, Keyword_XZScale=4, 
		Keyword_YScale=5, Identifier=6, Whitespace=7, Float=8, Integer=9, BlockStart=10, 
		BlockEnd=11, NewLine=12, Colon=13;
	public static final int
		RULE_densityStatement = 0, RULE_densityNoiseDeclaration = 1, RULE_densityNoiseLine = 2, 
		RULE_densityXZScaleLine = 3, RULE_densityYScaleLine = 4, RULE_densityNoiseStatement = 5, 
		RULE_reference = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"densityStatement", "densityNoiseDeclaration", "densityNoiseLine", "densityXZScaleLine", 
			"densityYScaleLine", "densityNoiseStatement", "reference"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'density'", "'noise'", "'constant'", "'xz_scale'", "'y_scale'", 
			null, null, null, null, "'{'", null, null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DensityFunctionStart", "Keyword_Noise", "Keyword_Constant", "Keyword_XZScale", 
			"Keyword_YScale", "Identifier", "Whitespace", "Float", "Integer", "BlockStart", 
			"BlockEnd", "NewLine", "Colon"
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
	public String getGrammarFileName() { return "DensityFunctions.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DensityFunctions(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DensityStatementContext extends ParserRuleContext {
		public DensityNoiseStatementContext densityNoiseStatement() {
			return getRuleContext(DensityNoiseStatementContext.class,0);
		}
		public DensityStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_densityStatement; }
	}

	public final DensityStatementContext densityStatement() throws RecognitionException {
		DensityStatementContext _localctx = new DensityStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_densityStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			densityNoiseStatement();
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

	public static class DensityNoiseDeclarationContext extends ParserRuleContext {
		public TerminalNode DensityFunctionStart() { return getToken(DensityFunctions.DensityFunctionStart, 0); }
		public TerminalNode Colon() { return getToken(DensityFunctions.Colon, 0); }
		public TerminalNode Keyword_Noise() { return getToken(DensityFunctions.Keyword_Noise, 0); }
		public DensityNoiseDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_densityNoiseDeclaration; }
	}

	public final DensityNoiseDeclarationContext densityNoiseDeclaration() throws RecognitionException {
		DensityNoiseDeclarationContext _localctx = new DensityNoiseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_densityNoiseDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(DensityFunctionStart);
			setState(17);
			match(Colon);
			setState(18);
			match(Keyword_Noise);
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

	public static class DensityNoiseLineContext extends ParserRuleContext {
		public TerminalNode Keyword_Noise() { return getToken(DensityFunctions.Keyword_Noise, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public List<TerminalNode> NewLine() { return getTokens(DensityFunctions.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(DensityFunctions.NewLine, i);
		}
		public DensityNoiseLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_densityNoiseLine; }
	}

	public final DensityNoiseLineContext densityNoiseLine() throws RecognitionException {
		DensityNoiseLineContext _localctx = new DensityNoiseLineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_densityNoiseLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(Keyword_Noise);
			setState(21);
			reference();
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(22);
				match(NewLine);
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DensityXZScaleLineContext extends ParserRuleContext {
		public TerminalNode Keyword_XZScale() { return getToken(DensityFunctions.Keyword_XZScale, 0); }
		public TerminalNode Float() { return getToken(DensityFunctions.Float, 0); }
		public TerminalNode Integer() { return getToken(DensityFunctions.Integer, 0); }
		public List<TerminalNode> NewLine() { return getTokens(DensityFunctions.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(DensityFunctions.NewLine, i);
		}
		public DensityXZScaleLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_densityXZScaleLine; }
	}

	public final DensityXZScaleLineContext densityXZScaleLine() throws RecognitionException {
		DensityXZScaleLineContext _localctx = new DensityXZScaleLineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_densityXZScaleLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(Keyword_XZScale);
			setState(29);
			_la = _input.LA(1);
			if ( !(_la==Float || _la==Integer) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(30);
				match(NewLine);
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DensityYScaleLineContext extends ParserRuleContext {
		public TerminalNode Keyword_YScale() { return getToken(DensityFunctions.Keyword_YScale, 0); }
		public TerminalNode Float() { return getToken(DensityFunctions.Float, 0); }
		public TerminalNode Integer() { return getToken(DensityFunctions.Integer, 0); }
		public List<TerminalNode> NewLine() { return getTokens(DensityFunctions.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(DensityFunctions.NewLine, i);
		}
		public DensityYScaleLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_densityYScaleLine; }
	}

	public final DensityYScaleLineContext densityYScaleLine() throws RecognitionException {
		DensityYScaleLineContext _localctx = new DensityYScaleLineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_densityYScaleLine);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(Keyword_YScale);
			setState(37);
			_la = _input.LA(1);
			if ( !(_la==Float || _la==Integer) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(38);
					match(NewLine);
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class DensityNoiseStatementContext extends ParserRuleContext {
		public DensityNoiseDeclarationContext densityNoiseDeclaration() {
			return getRuleContext(DensityNoiseDeclarationContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(DensityFunctions.Identifier, 0); }
		public TerminalNode BlockStart() { return getToken(DensityFunctions.BlockStart, 0); }
		public TerminalNode BlockEnd() { return getToken(DensityFunctions.BlockEnd, 0); }
		public DensityNoiseLineContext densityNoiseLine() {
			return getRuleContext(DensityNoiseLineContext.class,0);
		}
		public DensityXZScaleLineContext densityXZScaleLine() {
			return getRuleContext(DensityXZScaleLineContext.class,0);
		}
		public DensityYScaleLineContext densityYScaleLine() {
			return getRuleContext(DensityYScaleLineContext.class,0);
		}
		public List<TerminalNode> NewLine() { return getTokens(DensityFunctions.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(DensityFunctions.NewLine, i);
		}
		public DensityNoiseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_densityNoiseStatement; }
	}

	public final DensityNoiseStatementContext densityNoiseStatement() throws RecognitionException {
		DensityNoiseStatementContext _localctx = new DensityNoiseStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_densityNoiseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			densityNoiseDeclaration();
			setState(45);
			match(Identifier);
			setState(46);
			match(BlockStart);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(47);
				match(NewLine);
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(53);
			densityNoiseLine();
			setState(54);
			densityXZScaleLine();
			setState(55);
			densityYScaleLine();
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(57);
				match(NewLine);
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(BlockEnd);
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
		public List<TerminalNode> Identifier() { return getTokens(DensityFunctions.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(DensityFunctions.Identifier, i);
		}
		public TerminalNode Colon() { return getToken(DensityFunctions.Colon, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(Identifier);
			setState(66);
			match(Colon);
			setState(67);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17H\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\7\4\32\n\4\f\4\16\4\35\13\4\3\5\3\5\3\5\7\5\"\n\5\f\5\16\5%\13"+
		"\5\3\6\3\6\3\6\7\6*\n\6\f\6\16\6-\13\6\3\7\3\7\3\7\3\7\7\7\63\n\7\f\7"+
		"\16\7\66\13\7\3\7\3\7\3\7\3\7\3\7\7\7=\n\7\f\7\16\7@\13\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\3\3\2\n\13\2E\2\20\3\2\2\2\4\22"+
		"\3\2\2\2\6\26\3\2\2\2\b\36\3\2\2\2\n&\3\2\2\2\f.\3\2\2\2\16C\3\2\2\2\20"+
		"\21\5\f\7\2\21\3\3\2\2\2\22\23\7\3\2\2\23\24\7\17\2\2\24\25\7\4\2\2\25"+
		"\5\3\2\2\2\26\27\7\4\2\2\27\33\5\16\b\2\30\32\7\16\2\2\31\30\3\2\2\2\32"+
		"\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\7\3\2\2\2\35\33\3\2\2\2\36"+
		"\37\7\6\2\2\37#\t\2\2\2 \"\7\16\2\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3"+
		"\2\2\2$\t\3\2\2\2%#\3\2\2\2&\'\7\7\2\2\'+\t\2\2\2(*\7\16\2\2)(\3\2\2\2"+
		"*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\13\3\2\2\2-+\3\2\2\2./\5\4\3\2/\60\7\b"+
		"\2\2\60\64\7\f\2\2\61\63\7\16\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3"+
		"\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\5\6\4\289\5\b\5\2"+
		"9:\5\n\6\2:>\3\2\2\2;=\7\16\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2"+
		"\2?A\3\2\2\2@>\3\2\2\2AB\7\r\2\2B\r\3\2\2\2CD\7\b\2\2DE\7\17\2\2EF\7\b"+
		"\2\2F\17\3\2\2\2\7\33#+\64>";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}