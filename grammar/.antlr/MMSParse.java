// Generated from /Users/brian/code/personal/mms/grammar/MMSParse.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MMSParse extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DensityFunctionStart=1, Keyword_Noise=2, Keyword_Constant=3, Keyword_XZScale=4, 
		Keyword_YScale=5, Keyword_FirstOctave=6, Keyword_Amplitudes=7, Keyword_Namespace=8, 
		Whitespace=9, Float=10, Integer=11, BlockStart=12, BlockEnd=13, NewLine=14, 
		Colon=15, SquareOpen=16, SquareClose=17, Comma=18, Comment=19, Identifier=20;
	public static final int
		RULE_statement = 0, RULE_namespaceStatement = 1, RULE_file = 2, RULE_densityStatement = 3, 
		RULE_densityNoiseDeclaration = 4, RULE_densityNoiseLine = 5, RULE_densityXZScaleLine = 6, 
		RULE_densityYScaleLine = 7, RULE_densityNoiseStatement = 8, RULE_reference = 9, 
		RULE_noiseFirstOctaveLine = 10, RULE_noiseAmplitudes = 11, RULE_noiseStatement = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"statement", "namespaceStatement", "file", "densityStatement", "densityNoiseDeclaration", 
			"densityNoiseLine", "densityXZScaleLine", "densityYScaleLine", "densityNoiseStatement", 
			"reference", "noiseFirstOctaveLine", "noiseAmplitudes", "noiseStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'density'", "'noise'", "'constant'", "'xz_scale'", "'y_scale'", 
			"'first_octave'", "'amplitudes'", "'namespace'", null, null, null, "'{'", 
			null, null, "':'", "'['", "']'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DensityFunctionStart", "Keyword_Noise", "Keyword_Constant", "Keyword_XZScale", 
			"Keyword_YScale", "Keyword_FirstOctave", "Keyword_Amplitudes", "Keyword_Namespace", 
			"Whitespace", "Float", "Integer", "BlockStart", "BlockEnd", "NewLine", 
			"Colon", "SquareOpen", "SquareClose", "Comma", "Comment", "Identifier"
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
	public String getGrammarFileName() { return "MMSParse.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MMSParse(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatementContext extends ParserRuleContext {
		public DensityStatementContext densityStatement() {
			return getRuleContext(DensityStatementContext.class,0);
		}
		public NoiseStatementContext noiseStatement() {
			return getRuleContext(NoiseStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DensityFunctionStart:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				densityStatement();
				}
				break;
			case Keyword_Noise:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				noiseStatement();
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

	public static class NamespaceStatementContext extends ParserRuleContext {
		public TerminalNode Keyword_Namespace() { return getToken(MMSParse.Keyword_Namespace, 0); }
		public TerminalNode Identifier() { return getToken(MMSParse.Identifier, 0); }
		public NamespaceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceStatement; }
	}

	public final NamespaceStatementContext namespaceStatement() throws RecognitionException {
		NamespaceStatementContext _localctx = new NamespaceStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_namespaceStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(Keyword_Namespace);
			setState(31);
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

	public static class FileContext extends ParserRuleContext {
		public NamespaceStatementContext namespaceStatement() {
			return getRuleContext(NamespaceStatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MMSParse.EOF, 0); }
		public List<TerminalNode> NewLine() { return getTokens(MMSParse.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(MMSParse.NewLine, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> Whitespace() { return getTokens(MMSParse.Whitespace); }
		public TerminalNode Whitespace(int i) {
			return getToken(MMSParse.Whitespace, i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_file);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			namespaceStatement();
			setState(35); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(34);
					match(NewLine);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(37); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DensityFunctionStart) | (1L << Keyword_Noise) | (1L << Whitespace) | (1L << NewLine))) != 0)) {
				{
				setState(42);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DensityFunctionStart:
				case Keyword_Noise:
					{
					setState(39);
					statement();
					}
					break;
				case NewLine:
					{
					setState(40);
					match(NewLine);
					}
					break;
				case Whitespace:
					{
					setState(41);
					match(Whitespace);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
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
		enterRule(_localctx, 6, RULE_densityStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
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
		public TerminalNode DensityFunctionStart() { return getToken(MMSParse.DensityFunctionStart, 0); }
		public TerminalNode Colon() { return getToken(MMSParse.Colon, 0); }
		public TerminalNode Keyword_Noise() { return getToken(MMSParse.Keyword_Noise, 0); }
		public DensityNoiseDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_densityNoiseDeclaration; }
	}

	public final DensityNoiseDeclarationContext densityNoiseDeclaration() throws RecognitionException {
		DensityNoiseDeclarationContext _localctx = new DensityNoiseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_densityNoiseDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(DensityFunctionStart);
			setState(52);
			match(Colon);
			setState(53);
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
		public TerminalNode Keyword_Noise() { return getToken(MMSParse.Keyword_Noise, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public List<TerminalNode> NewLine() { return getTokens(MMSParse.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(MMSParse.NewLine, i);
		}
		public DensityNoiseLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_densityNoiseLine; }
	}

	public final DensityNoiseLineContext densityNoiseLine() throws RecognitionException {
		DensityNoiseLineContext _localctx = new DensityNoiseLineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_densityNoiseLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(Keyword_Noise);
			setState(56);
			reference();
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
		public TerminalNode Keyword_XZScale() { return getToken(MMSParse.Keyword_XZScale, 0); }
		public TerminalNode Float() { return getToken(MMSParse.Float, 0); }
		public TerminalNode Integer() { return getToken(MMSParse.Integer, 0); }
		public List<TerminalNode> NewLine() { return getTokens(MMSParse.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(MMSParse.NewLine, i);
		}
		public DensityXZScaleLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_densityXZScaleLine; }
	}

	public final DensityXZScaleLineContext densityXZScaleLine() throws RecognitionException {
		DensityXZScaleLineContext _localctx = new DensityXZScaleLineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_densityXZScaleLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(Keyword_XZScale);
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==Float || _la==Integer) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(65);
				match(NewLine);
				}
				}
				setState(70);
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
		public TerminalNode Keyword_YScale() { return getToken(MMSParse.Keyword_YScale, 0); }
		public TerminalNode Float() { return getToken(MMSParse.Float, 0); }
		public TerminalNode Integer() { return getToken(MMSParse.Integer, 0); }
		public List<TerminalNode> NewLine() { return getTokens(MMSParse.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(MMSParse.NewLine, i);
		}
		public DensityYScaleLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_densityYScaleLine; }
	}

	public final DensityYScaleLineContext densityYScaleLine() throws RecognitionException {
		DensityYScaleLineContext _localctx = new DensityYScaleLineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_densityYScaleLine);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(Keyword_YScale);
			setState(72);
			_la = _input.LA(1);
			if ( !(_la==Float || _la==Integer) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(73);
					match(NewLine);
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		public TerminalNode Identifier() { return getToken(MMSParse.Identifier, 0); }
		public TerminalNode BlockStart() { return getToken(MMSParse.BlockStart, 0); }
		public TerminalNode BlockEnd() { return getToken(MMSParse.BlockEnd, 0); }
		public DensityNoiseLineContext densityNoiseLine() {
			return getRuleContext(DensityNoiseLineContext.class,0);
		}
		public DensityXZScaleLineContext densityXZScaleLine() {
			return getRuleContext(DensityXZScaleLineContext.class,0);
		}
		public DensityYScaleLineContext densityYScaleLine() {
			return getRuleContext(DensityYScaleLineContext.class,0);
		}
		public List<TerminalNode> NewLine() { return getTokens(MMSParse.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(MMSParse.NewLine, i);
		}
		public DensityNoiseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_densityNoiseStatement; }
	}

	public final DensityNoiseStatementContext densityNoiseStatement() throws RecognitionException {
		DensityNoiseStatementContext _localctx = new DensityNoiseStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_densityNoiseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			densityNoiseDeclaration();
			setState(80);
			match(Identifier);
			setState(81);
			match(BlockStart);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(82);
				match(NewLine);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(88);
			densityNoiseLine();
			setState(89);
			densityXZScaleLine();
			setState(90);
			densityYScaleLine();
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(92);
				match(NewLine);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
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
		public List<TerminalNode> Identifier() { return getTokens(MMSParse.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MMSParse.Identifier, i);
		}
		public TerminalNode Colon() { return getToken(MMSParse.Colon, 0); }
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
			setState(100);
			match(Identifier);
			setState(101);
			match(Colon);
			setState(102);
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

	public static class NoiseFirstOctaveLineContext extends ParserRuleContext {
		public TerminalNode Keyword_FirstOctave() { return getToken(MMSParse.Keyword_FirstOctave, 0); }
		public TerminalNode Integer() { return getToken(MMSParse.Integer, 0); }
		public NoiseFirstOctaveLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noiseFirstOctaveLine; }
	}

	public final NoiseFirstOctaveLineContext noiseFirstOctaveLine() throws RecognitionException {
		NoiseFirstOctaveLineContext _localctx = new NoiseFirstOctaveLineContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_noiseFirstOctaveLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(Keyword_FirstOctave);
			setState(105);
			match(Integer);
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

	public static class NoiseAmplitudesContext extends ParserRuleContext {
		public TerminalNode Keyword_Amplitudes() { return getToken(MMSParse.Keyword_Amplitudes, 0); }
		public TerminalNode SquareOpen() { return getToken(MMSParse.SquareOpen, 0); }
		public TerminalNode SquareClose() { return getToken(MMSParse.SquareClose, 0); }
		public List<TerminalNode> Integer() { return getTokens(MMSParse.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(MMSParse.Integer, i);
		}
		public List<TerminalNode> Float() { return getTokens(MMSParse.Float); }
		public TerminalNode Float(int i) {
			return getToken(MMSParse.Float, i);
		}
		public List<TerminalNode> Comma() { return getTokens(MMSParse.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MMSParse.Comma, i);
		}
		public NoiseAmplitudesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noiseAmplitudes; }
	}

	public final NoiseAmplitudesContext noiseAmplitudes() throws RecognitionException {
		NoiseAmplitudesContext _localctx = new NoiseAmplitudesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_noiseAmplitudes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(Keyword_Amplitudes);
			setState(108);
			match(SquareOpen);
			setState(109);
			_la = _input.LA(1);
			if ( !(_la==Float || _la==Integer) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(110);
				match(Comma);
				setState(111);
				_la = _input.LA(1);
				if ( !(_la==Float || _la==Integer) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
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

	public static class NoiseStatementContext extends ParserRuleContext {
		public TerminalNode Keyword_Noise() { return getToken(MMSParse.Keyword_Noise, 0); }
		public TerminalNode Identifier() { return getToken(MMSParse.Identifier, 0); }
		public TerminalNode BlockStart() { return getToken(MMSParse.BlockStart, 0); }
		public NoiseFirstOctaveLineContext noiseFirstOctaveLine() {
			return getRuleContext(NoiseFirstOctaveLineContext.class,0);
		}
		public NoiseAmplitudesContext noiseAmplitudes() {
			return getRuleContext(NoiseAmplitudesContext.class,0);
		}
		public TerminalNode BlockEnd() { return getToken(MMSParse.BlockEnd, 0); }
		public List<TerminalNode> NewLine() { return getTokens(MMSParse.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(MMSParse.NewLine, i);
		}
		public NoiseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noiseStatement; }
	}

	public final NoiseStatementContext noiseStatement() throws RecognitionException {
		NoiseStatementContext _localctx = new NoiseStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_noiseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(Keyword_Noise);
			setState(120);
			match(Identifier);
			setState(121);
			match(BlockStart);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(122);
				match(NewLine);
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			noiseFirstOctaveLine();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(129);
				match(NewLine);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			noiseAmplitudes();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(136);
				match(NewLine);
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u0093\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\5\2\37\n\2\3\3\3\3\3\3\3\4\3\4"+
		"\6\4&\n\4\r\4\16\4\'\3\4\3\4\3\4\7\4-\n\4\f\4\16\4\60\13\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7=\n\7\f\7\16\7@\13\7\3\b\3\b\3\b\7"+
		"\bE\n\b\f\b\16\bH\13\b\3\t\3\t\3\t\7\tM\n\t\f\t\16\tP\13\t\3\n\3\n\3\n"+
		"\3\n\7\nV\n\n\f\n\16\nY\13\n\3\n\3\n\3\n\3\n\3\n\7\n`\n\n\f\n\16\nc\13"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\rs\n"+
		"\r\f\r\16\rv\13\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16~\n\16\f\16\16\16\u0081"+
		"\13\16\3\16\3\16\7\16\u0085\n\16\f\16\16\16\u0088\13\16\3\16\3\16\7\16"+
		"\u008c\n\16\f\16\16\16\u008f\13\16\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\2\3\3\2\f\r\2\u0093\2\36\3\2\2\2\4 \3\2\2\2\6#\3\2"+
		"\2\2\b\63\3\2\2\2\n\65\3\2\2\2\f9\3\2\2\2\16A\3\2\2\2\20I\3\2\2\2\22Q"+
		"\3\2\2\2\24f\3\2\2\2\26j\3\2\2\2\30m\3\2\2\2\32y\3\2\2\2\34\37\5\b\5\2"+
		"\35\37\5\32\16\2\36\34\3\2\2\2\36\35\3\2\2\2\37\3\3\2\2\2 !\7\n\2\2!\""+
		"\7\26\2\2\"\5\3\2\2\2#%\5\4\3\2$&\7\20\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2"+
		"\2\2\'(\3\2\2\2(.\3\2\2\2)-\5\2\2\2*-\7\20\2\2+-\7\13\2\2,)\3\2\2\2,*"+
		"\3\2\2\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2"+
		"\2\2\61\62\7\2\2\3\62\7\3\2\2\2\63\64\5\22\n\2\64\t\3\2\2\2\65\66\7\3"+
		"\2\2\66\67\7\21\2\2\678\7\4\2\28\13\3\2\2\29:\7\4\2\2:>\5\24\13\2;=\7"+
		"\20\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\r\3\2\2\2@>\3\2\2\2A"+
		"B\7\6\2\2BF\t\2\2\2CE\7\20\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2"+
		"G\17\3\2\2\2HF\3\2\2\2IJ\7\7\2\2JN\t\2\2\2KM\7\20\2\2LK\3\2\2\2MP\3\2"+
		"\2\2NL\3\2\2\2NO\3\2\2\2O\21\3\2\2\2PN\3\2\2\2QR\5\n\6\2RS\7\26\2\2SW"+
		"\7\16\2\2TV\7\20\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2"+
		"YW\3\2\2\2Z[\5\f\7\2[\\\5\16\b\2\\]\5\20\t\2]a\3\2\2\2^`\7\20\2\2_^\3"+
		"\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7\17\2\2e\23"+
		"\3\2\2\2fg\7\26\2\2gh\7\21\2\2hi\7\26\2\2i\25\3\2\2\2jk\7\b\2\2kl\7\r"+
		"\2\2l\27\3\2\2\2mn\7\t\2\2no\7\22\2\2ot\t\2\2\2pq\7\24\2\2qs\t\2\2\2r"+
		"p\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\23\2\2"+
		"x\31\3\2\2\2yz\7\4\2\2z{\7\26\2\2{\177\7\16\2\2|~\7\20\2\2}|\3\2\2\2~"+
		"\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0082\u0086\5\26\f\2\u0083\u0085\7\20\2\2\u0084\u0083\3\2"+
		"\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008d\5\30\r\2\u008a\u008c\7"+
		"\20\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\17"+
		"\2\2\u0091\33\3\2\2\2\17\36\',.>FNWat\177\u0086\u008d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}