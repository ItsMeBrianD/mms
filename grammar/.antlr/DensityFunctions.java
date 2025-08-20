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
		RULE_densityStatement = 0, RULE_densityNoiseDeclaration = 1, RULE_densityNoiseLine = 2, 
		RULE_densityXZScaleLine = 3, RULE_densityYScaleLine = 4, RULE_densityNoiseStatement = 5, 
		RULE_reference = 6, RULE_verticalAnchor = 7, RULE_referenceArray = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"densityStatement", "densityNoiseDeclaration", "densityNoiseLine", "densityXZScaleLine", 
			"densityYScaleLine", "densityNoiseStatement", "reference", "verticalAnchor", 
			"referenceArray"
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
			setState(18);
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
			setState(20);
			match(DensityFunctionStart);
			setState(21);
			match(Colon);
			setState(22);
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
			setState(24);
			match(Keyword_Noise);
			setState(25);
			reference();
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(26);
				match(NewLine);
				}
				}
				setState(31);
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
			setState(32);
			match(Keyword_XZScale);
			setState(33);
			_la = _input.LA(1);
			if ( !(_la==Float || _la==Integer) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(34);
				match(NewLine);
				}
				}
				setState(39);
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
			setState(40);
			match(Keyword_YScale);
			setState(41);
			_la = _input.LA(1);
			if ( !(_la==Float || _la==Integer) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(42);
					match(NewLine);
					}
					} 
				}
				setState(47);
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
			setState(48);
			densityNoiseDeclaration();
			setState(49);
			match(Identifier);
			setState(50);
			match(BlockStart);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(51);
				match(NewLine);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(57);
			densityNoiseLine();
			setState(58);
			densityXZScaleLine();
			setState(59);
			densityYScaleLine();
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(61);
				match(NewLine);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
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
			setState(69);
			match(Identifier);
			setState(70);
			match(Colon);
			setState(71);
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
		public TerminalNode Integer() { return getToken(DensityFunctions.Integer, 0); }
		public TerminalNode Keyword_Absolute() { return getToken(DensityFunctions.Keyword_Absolute, 0); }
		public TerminalNode Keyword_AboveBottom() { return getToken(DensityFunctions.Keyword_AboveBottom, 0); }
		public TerminalNode Keyword_BelowTop() { return getToken(DensityFunctions.Keyword_BelowTop, 0); }
		public VerticalAnchorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verticalAnchor; }
	}

	public final VerticalAnchorContext verticalAnchor() throws RecognitionException {
		VerticalAnchorContext _localctx = new VerticalAnchorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_verticalAnchor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Keyword_Absolute) | (1L << Keyword_AboveBottom) | (1L << Keyword_BelowTop))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(74);
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
		public TerminalNode SquareOpen() { return getToken(DensityFunctions.SquareOpen, 0); }
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public TerminalNode SquareClose() { return getToken(DensityFunctions.SquareClose, 0); }
		public List<TerminalNode> NewLine() { return getTokens(DensityFunctions.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(DensityFunctions.NewLine, i);
		}
		public List<TerminalNode> Comma() { return getTokens(DensityFunctions.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(DensityFunctions.Comma, i);
		}
		public ReferenceArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceArray; }
	}

	public final ReferenceArrayContext referenceArray() throws RecognitionException {
		ReferenceArrayContext _localctx = new ReferenceArrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_referenceArray);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(SquareOpen);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(77);
				match(NewLine);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			reference();
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84);
					match(NewLine);
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					match(Comma);
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NewLine) {
						{
						{
						setState(91);
						match(NewLine);
						}
						}
						setState(96);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(97);
					reference();
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					match(NewLine);
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(109);
				match(Comma);
				}
			}

			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(112);
				match(NewLine);
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:{\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\7\4\36\n\4\f\4\16\4!\13\4\3\5\3\5\3\5\7\5&\n\5"+
		"\f\5\16\5)\13\5\3\6\3\6\3\6\7\6.\n\6\f\6\16\6\61\13\6\3\7\3\7\3\7\3\7"+
		"\7\7\67\n\7\f\7\16\7:\13\7\3\7\3\7\3\7\3\7\3\7\7\7A\n\7\f\7\16\7D\13\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\7\nQ\n\n\f\n\16\nT\13\n\3"+
		"\n\3\n\7\nX\n\n\f\n\16\n[\13\n\3\n\3\n\7\n_\n\n\f\n\16\nb\13\n\3\n\7\n"+
		"e\n\n\f\n\16\nh\13\n\3\n\7\nk\n\n\f\n\16\nn\13\n\3\n\5\nq\n\n\3\n\7\n"+
		"t\n\n\f\n\16\nw\13\n\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\4\3\2-"+
		".\3\2!#\2}\2\24\3\2\2\2\4\26\3\2\2\2\6\32\3\2\2\2\b\"\3\2\2\2\n*\3\2\2"+
		"\2\f\62\3\2\2\2\16G\3\2\2\2\20K\3\2\2\2\22N\3\2\2\2\24\25\5\f\7\2\25\3"+
		"\3\2\2\2\26\27\7\3\2\2\27\30\7\62\2\2\30\31\7\4\2\2\31\5\3\2\2\2\32\33"+
		"\7\4\2\2\33\37\5\16\b\2\34\36\7\61\2\2\35\34\3\2\2\2\36!\3\2\2\2\37\35"+
		"\3\2\2\2\37 \3\2\2\2 \7\3\2\2\2!\37\3\2\2\2\"#\7\6\2\2#\'\t\2\2\2$&\7"+
		"\61\2\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\t\3\2\2\2)\'\3\2\2"+
		"\2*+\7\7\2\2+/\t\2\2\2,.\7\61\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60"+
		"\3\2\2\2\60\13\3\2\2\2\61/\3\2\2\2\62\63\5\4\3\2\63\64\7:\2\2\648\7/\2"+
		"\2\65\67\7\61\2\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3"+
		"\2\2\2:8\3\2\2\2;<\5\6\4\2<=\5\b\5\2=>\5\n\6\2>B\3\2\2\2?A\7\61\2\2@?"+
		"\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\60\2\2"+
		"F\r\3\2\2\2GH\7:\2\2HI\7\62\2\2IJ\7:\2\2J\17\3\2\2\2KL\t\3\2\2LM\7.\2"+
		"\2M\21\3\2\2\2NR\7\65\2\2OQ\7\61\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3"+
		"\2\2\2SU\3\2\2\2TR\3\2\2\2UY\5\16\b\2VX\7\61\2\2WV\3\2\2\2X[\3\2\2\2Y"+
		"W\3\2\2\2YZ\3\2\2\2Zf\3\2\2\2[Y\3\2\2\2\\`\7\67\2\2]_\7\61\2\2^]\3\2\2"+
		"\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2ce\5\16\b\2d\\\3\2"+
		"\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gl\3\2\2\2hf\3\2\2\2ik\7\61\2\2ji\3"+
		"\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mp\3\2\2\2nl\3\2\2\2oq\7\67\2\2po"+
		"\3\2\2\2pq\3\2\2\2qu\3\2\2\2rt\7\61\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2"+
		"uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7\66\2\2y\23\3\2\2\2\16\37\'/8BRY`fl"+
		"pu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}