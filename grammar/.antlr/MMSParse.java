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
		Keyword_Surface=9, Keyword_Rule=10, Keyword_Condition=11, Keyword_Block=12, 
		Keyword_Type=13, Keyword_AbovePreliminarySurface=14, Keyword_Biome=15, 
		Keyword_BiomeIs=16, Keyword_Hole=17, Keyword_NoiseThreshold=18, Keyword_MinThreshold=19, 
		Keyword_MaxThreshold=20, Keyword_StoneDepth=21, Keyword_SurfaceType=22, 
		Keyword_Offset=23, Keyword_AddSurfaceDepth=24, Keyword_SecondaryDepthRange=25, 
		Keyword_Temperature=26, Keyword_VerticalGradient=27, Keyword_RandomName=28, 
		Keyword_TrueAtAndBelow=29, Keyword_FalseAtAndAbove=30, Keyword_Absolute=31, 
		Keyword_AboveBottom=32, Keyword_BelowTop=33, Keyword_Water=34, Keyword_SurfaceDepthMulitplier=35, 
		Keyword_AddStoneDepth=36, Keyword_Sequence=37, Keyword_YAbove=38, Keyword_Anchor=39, 
		Keyword_If=40, Keyword_Else=41, Whitespace=42, Float=43, Integer=44, BlockStart=45, 
		BlockEnd=46, NewLine=47, Colon=48, RoundOpen=49, RoundClose=50, SquareOpen=51, 
		SquareClose=52, Comma=53, Comment=54, Not=55, Identifier=56;
	public static final int
		RULE_statement = 0, RULE_namespaceStatement = 1, RULE_file = 2, RULE_densityStatement = 3, 
		RULE_densityNoiseDeclaration = 4, RULE_densityNoiseLine = 5, RULE_densityXZScaleLine = 6, 
		RULE_densityYScaleLine = 7, RULE_densityNoiseStatement = 8, RULE_reference = 9, 
		RULE_verticalAnchor = 10, RULE_referenceArray = 11, RULE_noiseFirstOctaveLine = 12, 
		RULE_noiseAmplitudes = 13, RULE_noiseStatement = 14, RULE_surfaceStatement = 15, 
		RULE_blockProperties = 16, RULE_blockState = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"statement", "namespaceStatement", "file", "densityStatement", "densityNoiseDeclaration", 
			"densityNoiseLine", "densityXZScaleLine", "densityYScaleLine", "densityNoiseStatement", 
			"reference", "verticalAnchor", "referenceArray", "noiseFirstOctaveLine", 
			"noiseAmplitudes", "noiseStatement", "surfaceStatement", "blockProperties", 
			"blockState"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'density'", "'noise'", "'constant'", "'xz_scale'", "'y_scale'", 
			"'first_octave'", "'amplitudes'", "'namespace'", "'surface'", "'rule'", 
			"'condition'", "'block'", "'type'", "'above_preliminary_surface'", "'biome'", 
			"'biome_is'", "'hole'", "'noise_threshold'", "'min_threshold'", "'max_threshold'", 
			"'stone_depth'", "'surface_type'", "'offset'", "'add_surface_depth'", 
			"'secondary_depth_range'", "'temperature'", "'vertical_gradient'", "'random_name'", 
			"'true_at_and_below'", "'false_at_and_above'", "'absolute'", "'above_bottom'", 
			"'below_top'", "'water'", "'surface_depth_mulitplier'", "'add_stone_depth'", 
			"'sequence'", "'y_above'", "'anchor'", "'if'", "'else'", null, null, 
			null, "'{'", null, null, "':'", "'('", "')'", "'['", "']'", "','", null, 
			"'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DensityFunctionStart", "Keyword_Noise", "Keyword_Constant", "Keyword_XZScale", 
			"Keyword_YScale", "Keyword_FirstOctave", "Keyword_Amplitudes", "Keyword_Namespace", 
			"Keyword_Surface", "Keyword_Rule", "Keyword_Condition", "Keyword_Block", 
			"Keyword_Type", "Keyword_AbovePreliminarySurface", "Keyword_Biome", "Keyword_BiomeIs", 
			"Keyword_Hole", "Keyword_NoiseThreshold", "Keyword_MinThreshold", "Keyword_MaxThreshold", 
			"Keyword_StoneDepth", "Keyword_SurfaceType", "Keyword_Offset", "Keyword_AddSurfaceDepth", 
			"Keyword_SecondaryDepthRange", "Keyword_Temperature", "Keyword_VerticalGradient", 
			"Keyword_RandomName", "Keyword_TrueAtAndBelow", "Keyword_FalseAtAndAbove", 
			"Keyword_Absolute", "Keyword_AboveBottom", "Keyword_BelowTop", "Keyword_Water", 
			"Keyword_SurfaceDepthMulitplier", "Keyword_AddStoneDepth", "Keyword_Sequence", 
			"Keyword_YAbove", "Keyword_Anchor", "Keyword_If", "Keyword_Else", "Whitespace", 
			"Float", "Integer", "BlockStart", "BlockEnd", "NewLine", "Colon", "RoundOpen", 
			"RoundClose", "SquareOpen", "SquareClose", "Comma", "Comment", "Not", 
			"Identifier"
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
		public SurfaceStatementContext surfaceStatement() {
			return getRuleContext(SurfaceStatementContext.class,0);
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
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DensityFunctionStart:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				densityStatement();
				}
				break;
			case Keyword_Noise:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				noiseStatement();
				}
				break;
			case Keyword_Surface:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				surfaceStatement();
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
			setState(41);
			match(Keyword_Namespace);
			setState(42);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NewLine() { return getTokens(MMSParse.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(MMSParse.NewLine, i);
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
			setState(44);
			namespaceStatement();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(46); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(45);
						match(NewLine);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(48); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(53);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DensityFunctionStart:
				case Keyword_Noise:
				case Keyword_Surface:
					{
					setState(50);
					statement();
					}
					break;
				case NewLine:
					{
					setState(51);
					match(NewLine);
					}
					break;
				case Whitespace:
					{
					setState(52);
					match(Whitespace);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
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
			setState(62);
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
			setState(64);
			match(DensityFunctionStart);
			setState(65);
			match(Colon);
			setState(66);
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
			setState(68);
			match(Keyword_Noise);
			setState(69);
			reference();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(70);
				match(NewLine);
				}
				}
				setState(75);
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
			setState(76);
			match(Keyword_XZScale);
			setState(77);
			_la = _input.LA(1);
			if ( !(_la==Float || _la==Integer) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(78);
				match(NewLine);
				}
				}
				setState(83);
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
			setState(84);
			match(Keyword_YScale);
			setState(85);
			_la = _input.LA(1);
			if ( !(_la==Float || _la==Integer) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86);
					match(NewLine);
					}
					} 
				}
				setState(91);
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
			setState(92);
			densityNoiseDeclaration();
			setState(93);
			match(Identifier);
			setState(94);
			match(BlockStart);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(95);
				match(NewLine);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(101);
			densityNoiseLine();
			setState(102);
			densityXZScaleLine();
			setState(103);
			densityYScaleLine();
			}
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(105);
				match(NewLine);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
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
			setState(113);
			match(Identifier);
			setState(114);
			match(Colon);
			setState(115);
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

	public static class VerticalAnchorContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(MMSParse.Integer, 0); }
		public TerminalNode Keyword_Absolute() { return getToken(MMSParse.Keyword_Absolute, 0); }
		public TerminalNode Keyword_AboveBottom() { return getToken(MMSParse.Keyword_AboveBottom, 0); }
		public TerminalNode Keyword_BelowTop() { return getToken(MMSParse.Keyword_BelowTop, 0); }
		public VerticalAnchorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verticalAnchor; }
	}

	public final VerticalAnchorContext verticalAnchor() throws RecognitionException {
		VerticalAnchorContext _localctx = new VerticalAnchorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_verticalAnchor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Keyword_Absolute) | (1L << Keyword_AboveBottom) | (1L << Keyword_BelowTop))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(118);
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

	public static class ReferenceArrayContext extends ParserRuleContext {
		public TerminalNode SquareOpen() { return getToken(MMSParse.SquareOpen, 0); }
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public TerminalNode SquareClose() { return getToken(MMSParse.SquareClose, 0); }
		public List<TerminalNode> NewLine() { return getTokens(MMSParse.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(MMSParse.NewLine, i);
		}
		public List<TerminalNode> Comma() { return getTokens(MMSParse.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MMSParse.Comma, i);
		}
		public ReferenceArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceArray; }
	}

	public final ReferenceArrayContext referenceArray() throws RecognitionException {
		ReferenceArrayContext _localctx = new ReferenceArrayContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_referenceArray);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(SquareOpen);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(121);
				match(NewLine);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			reference();
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(128);
					match(NewLine);
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134);
					match(Comma);
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NewLine) {
						{
						{
						setState(135);
						match(NewLine);
						}
						}
						setState(140);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(141);
					reference();
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(147);
					match(NewLine);
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(153);
				match(Comma);
				}
			}

			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(156);
				match(NewLine);
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
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
		enterRule(_localctx, 24, RULE_noiseFirstOctaveLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(Keyword_FirstOctave);
			setState(165);
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
		enterRule(_localctx, 26, RULE_noiseAmplitudes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(Keyword_Amplitudes);
			setState(168);
			match(SquareOpen);
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==Float || _la==Integer) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(170);
				match(Comma);
				setState(171);
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
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
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
		enterRule(_localctx, 28, RULE_noiseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(Keyword_Noise);
			setState(180);
			match(Identifier);
			setState(181);
			match(BlockStart);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(182);
				match(NewLine);
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			noiseFirstOctaveLine();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(189);
				match(NewLine);
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			noiseAmplitudes();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(196);
				match(NewLine);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
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

	public static class SurfaceStatementContext extends ParserRuleContext {
		public TerminalNode Keyword_Surface() { return getToken(MMSParse.Keyword_Surface, 0); }
		public TerminalNode BlockStart() { return getToken(MMSParse.BlockStart, 0); }
		public TerminalNode BlockEnd() { return getToken(MMSParse.BlockEnd, 0); }
		public List<TerminalNode> NewLine() { return getTokens(MMSParse.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(MMSParse.NewLine, i);
		}
		public SurfaceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceStatement; }
	}

	public final SurfaceStatementContext surfaceStatement() throws RecognitionException {
		SurfaceStatementContext _localctx = new SurfaceStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_surfaceStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(Keyword_Surface);
			setState(205);
			match(BlockStart);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(206);
					match(NewLine);
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(212);
				match(NewLine);
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
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

	public static class BlockPropertiesContext extends ParserRuleContext {
		public TerminalNode BlockStart() { return getToken(MMSParse.BlockStart, 0); }
		public TerminalNode BlockEnd() { return getToken(MMSParse.BlockEnd, 0); }
		public List<TerminalNode> NewLine() { return getTokens(MMSParse.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(MMSParse.NewLine, i);
		}
		public BlockPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockProperties; }
	}

	public final BlockPropertiesContext blockProperties() throws RecognitionException {
		BlockPropertiesContext _localctx = new BlockPropertiesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_blockProperties);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(BlockStart);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(221);
					match(NewLine);
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(227);
				match(NewLine);
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
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

	public static class BlockStateContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public BlockPropertiesContext blockProperties() {
			return getRuleContext(BlockPropertiesContext.class,0);
		}
		public BlockStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockState; }
	}

	public final BlockStateContext blockState() throws RecognitionException {
		BlockStateContext _localctx = new BlockStateContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_blockState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			reference();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BlockStart) {
				{
				setState(236);
				blockProperties();
				}
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u00f2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\5\2*\n\2\3\3\3\3\3\3\3\4\3\4\6\4\61\n\4\r\4\16"+
		"\4\62\3\4\3\4\3\4\5\48\n\4\7\4:\n\4\f\4\16\4=\13\4\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\7\7J\n\7\f\7\16\7M\13\7\3\b\3\b\3\b\7\bR\n\b"+
		"\f\b\16\bU\13\b\3\t\3\t\3\t\7\tZ\n\t\f\t\16\t]\13\t\3\n\3\n\3\n\3\n\7"+
		"\nc\n\n\f\n\16\nf\13\n\3\n\3\n\3\n\3\n\3\n\7\nm\n\n\f\n\16\np\13\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\7\r}\n\r\f\r\16\r\u0080\13"+
		"\r\3\r\3\r\7\r\u0084\n\r\f\r\16\r\u0087\13\r\3\r\3\r\7\r\u008b\n\r\f\r"+
		"\16\r\u008e\13\r\3\r\7\r\u0091\n\r\f\r\16\r\u0094\13\r\3\r\7\r\u0097\n"+
		"\r\f\r\16\r\u009a\13\r\3\r\5\r\u009d\n\r\3\r\7\r\u00a0\n\r\f\r\16\r\u00a3"+
		"\13\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u00af\n\17"+
		"\f\17\16\17\u00b2\13\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00ba\n\20"+
		"\f\20\16\20\u00bd\13\20\3\20\3\20\7\20\u00c1\n\20\f\20\16\20\u00c4\13"+
		"\20\3\20\3\20\7\20\u00c8\n\20\f\20\16\20\u00cb\13\20\3\20\3\20\3\21\3"+
		"\21\3\21\7\21\u00d2\n\21\f\21\16\21\u00d5\13\21\3\21\7\21\u00d8\n\21\f"+
		"\21\16\21\u00db\13\21\3\21\3\21\3\22\3\22\7\22\u00e1\n\22\f\22\16\22\u00e4"+
		"\13\22\3\22\7\22\u00e7\n\22\f\22\16\22\u00ea\13\22\3\22\3\22\3\23\3\23"+
		"\5\23\u00f0\n\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$\2\4\3\2-.\3\2!#\2\u00fa\2)\3\2\2\2\4+\3\2\2\2\6.\3\2\2\2\b@\3\2\2\2"+
		"\nB\3\2\2\2\fF\3\2\2\2\16N\3\2\2\2\20V\3\2\2\2\22^\3\2\2\2\24s\3\2\2\2"+
		"\26w\3\2\2\2\30z\3\2\2\2\32\u00a6\3\2\2\2\34\u00a9\3\2\2\2\36\u00b5\3"+
		"\2\2\2 \u00ce\3\2\2\2\"\u00de\3\2\2\2$\u00ed\3\2\2\2&*\5\b\5\2\'*\5\36"+
		"\20\2(*\5 \21\2)&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*\3\3\2\2\2+,\7\n\2\2,-"+
		"\7:\2\2-\5\3\2\2\2.;\5\4\3\2/\61\7\61\2\2\60/\3\2\2\2\61\62\3\2\2\2\62"+
		"\60\3\2\2\2\62\63\3\2\2\2\63\67\3\2\2\2\648\5\2\2\2\658\7\61\2\2\668\7"+
		",\2\2\67\64\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\28:\3\2\2\29\60\3\2\2\2"+
		":=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7\2\2\3?\7\3\2\2"+
		"\2@A\5\22\n\2A\t\3\2\2\2BC\7\3\2\2CD\7\62\2\2DE\7\4\2\2E\13\3\2\2\2FG"+
		"\7\4\2\2GK\5\24\13\2HJ\7\61\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2"+
		"\2L\r\3\2\2\2MK\3\2\2\2NO\7\6\2\2OS\t\2\2\2PR\7\61\2\2QP\3\2\2\2RU\3\2"+
		"\2\2SQ\3\2\2\2ST\3\2\2\2T\17\3\2\2\2US\3\2\2\2VW\7\7\2\2W[\t\2\2\2XZ\7"+
		"\61\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\21\3\2\2\2][\3\2\2"+
		"\2^_\5\n\6\2_`\7:\2\2`d\7/\2\2ac\7\61\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2"+
		"\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\5\f\7\2hi\5\16\b\2ij\5\20\t\2jn\3\2"+
		"\2\2km\7\61\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3"+
		"\2\2\2qr\7\60\2\2r\23\3\2\2\2st\7:\2\2tu\7\62\2\2uv\7:\2\2v\25\3\2\2\2"+
		"wx\t\3\2\2xy\7.\2\2y\27\3\2\2\2z~\7\65\2\2{}\7\61\2\2|{\3\2\2\2}\u0080"+
		"\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081"+
		"\u0085\5\24\13\2\u0082\u0084\7\61\2\2\u0083\u0082\3\2\2\2\u0084\u0087"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0092\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\u008c\7\67\2\2\u0089\u008b\7\61\2\2\u008a\u0089\3"+
		"\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0091\5\24\13\2\u0090\u0088\3"+
		"\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0098\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0097\7\61\2\2\u0096\u0095\3"+
		"\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\7\67\2\2\u009c\u009b\3"+
		"\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a1\3\2\2\2\u009e\u00a0\7\61\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\66\2\2\u00a5"+
		"\31\3\2\2\2\u00a6\u00a7\7\b\2\2\u00a7\u00a8\7.\2\2\u00a8\33\3\2\2\2\u00a9"+
		"\u00aa\7\t\2\2\u00aa\u00ab\7\65\2\2\u00ab\u00b0\t\2\2\2\u00ac\u00ad\7"+
		"\67\2\2\u00ad\u00af\t\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b3\u00b4\7\66\2\2\u00b4\35\3\2\2\2\u00b5\u00b6\7\4\2\2\u00b6\u00b7"+
		"\7:\2\2\u00b7\u00bb\7/\2\2\u00b8\u00ba\7\61\2\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c2\5\32\16\2\u00bf\u00c1\7\61\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c9\5\34\17\2\u00c6"+
		"\u00c8\7\61\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3"+
		"\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00cd\7\60\2\2\u00cd\37\3\2\2\2\u00ce\u00cf\7\13\2\2\u00cf\u00d3\7/\2"+
		"\2\u00d0\u00d2\7\61\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d9\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d6\u00d8\7\61\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00dc\u00dd\7\60\2\2\u00dd!\3\2\2\2\u00de\u00e2\7/\2\2\u00df\u00e1"+
		"\7\61\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2"+
		"\u00e2\u00e3\3\2\2\2\u00e3\u00e8\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e7"+
		"\7\61\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2"+
		"\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec"+
		"\7\60\2\2\u00ec#\3\2\2\2\u00ed\u00ef\5\24\13\2\u00ee\u00f0\5\"\22\2\u00ef"+
		"\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0%\3\2\2\2\33)\62\67;KS[dn~\u0085"+
		"\u008c\u0092\u0098\u009c\u00a1\u00b0\u00bb\u00c2\u00c9\u00d3\u00d9\u00e2"+
		"\u00e8\u00ef";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}