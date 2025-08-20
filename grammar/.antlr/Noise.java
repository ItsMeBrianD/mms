// Generated from /Users/brian/code/personal/mms/grammar/Noise.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Noise extends Parser {
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
		RULE_noiseFirstOctaveLine = 0, RULE_noiseAmplitudes = 1, RULE_noiseStatement = 2, 
		RULE_reference = 3, RULE_verticalAnchor = 4, RULE_referenceArray = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"noiseFirstOctaveLine", "noiseAmplitudes", "noiseStatement", "reference", 
			"verticalAnchor", "referenceArray"
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
	public String getGrammarFileName() { return "Noise.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Noise(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class NoiseFirstOctaveLineContext extends ParserRuleContext {
		public TerminalNode Keyword_FirstOctave() { return getToken(Noise.Keyword_FirstOctave, 0); }
		public TerminalNode Integer() { return getToken(Noise.Integer, 0); }
		public NoiseFirstOctaveLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noiseFirstOctaveLine; }
	}

	public final NoiseFirstOctaveLineContext noiseFirstOctaveLine() throws RecognitionException {
		NoiseFirstOctaveLineContext _localctx = new NoiseFirstOctaveLineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_noiseFirstOctaveLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(Keyword_FirstOctave);
			setState(13);
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
		public TerminalNode Keyword_Amplitudes() { return getToken(Noise.Keyword_Amplitudes, 0); }
		public TerminalNode SquareOpen() { return getToken(Noise.SquareOpen, 0); }
		public TerminalNode SquareClose() { return getToken(Noise.SquareClose, 0); }
		public List<TerminalNode> Integer() { return getTokens(Noise.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(Noise.Integer, i);
		}
		public List<TerminalNode> Float() { return getTokens(Noise.Float); }
		public TerminalNode Float(int i) {
			return getToken(Noise.Float, i);
		}
		public List<TerminalNode> Comma() { return getTokens(Noise.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Noise.Comma, i);
		}
		public NoiseAmplitudesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noiseAmplitudes; }
	}

	public final NoiseAmplitudesContext noiseAmplitudes() throws RecognitionException {
		NoiseAmplitudesContext _localctx = new NoiseAmplitudesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_noiseAmplitudes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(Keyword_Amplitudes);
			setState(16);
			match(SquareOpen);
			setState(17);
			_la = _input.LA(1);
			if ( !(_la==Float || _la==Integer) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(18);
				match(Comma);
				setState(19);
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
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25);
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
		public TerminalNode Keyword_Noise() { return getToken(Noise.Keyword_Noise, 0); }
		public TerminalNode Identifier() { return getToken(Noise.Identifier, 0); }
		public TerminalNode BlockStart() { return getToken(Noise.BlockStart, 0); }
		public NoiseFirstOctaveLineContext noiseFirstOctaveLine() {
			return getRuleContext(NoiseFirstOctaveLineContext.class,0);
		}
		public NoiseAmplitudesContext noiseAmplitudes() {
			return getRuleContext(NoiseAmplitudesContext.class,0);
		}
		public TerminalNode BlockEnd() { return getToken(Noise.BlockEnd, 0); }
		public List<TerminalNode> NewLine() { return getTokens(Noise.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(Noise.NewLine, i);
		}
		public NoiseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noiseStatement; }
	}

	public final NoiseStatementContext noiseStatement() throws RecognitionException {
		NoiseStatementContext _localctx = new NoiseStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_noiseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(Keyword_Noise);
			setState(28);
			match(Identifier);
			setState(29);
			match(BlockStart);
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
			setState(36);
			noiseFirstOctaveLine();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(37);
				match(NewLine);
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			noiseAmplitudes();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(44);
				match(NewLine);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
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
		public List<TerminalNode> Identifier() { return getTokens(Noise.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Noise.Identifier, i);
		}
		public TerminalNode Colon() { return getToken(Noise.Colon, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(Identifier);
			setState(53);
			match(Colon);
			setState(54);
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
		public TerminalNode Integer() { return getToken(Noise.Integer, 0); }
		public TerminalNode Keyword_Absolute() { return getToken(Noise.Keyword_Absolute, 0); }
		public TerminalNode Keyword_AboveBottom() { return getToken(Noise.Keyword_AboveBottom, 0); }
		public TerminalNode Keyword_BelowTop() { return getToken(Noise.Keyword_BelowTop, 0); }
		public VerticalAnchorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verticalAnchor; }
	}

	public final VerticalAnchorContext verticalAnchor() throws RecognitionException {
		VerticalAnchorContext _localctx = new VerticalAnchorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_verticalAnchor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Keyword_Absolute) | (1L << Keyword_AboveBottom) | (1L << Keyword_BelowTop))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(57);
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
		public TerminalNode SquareOpen() { return getToken(Noise.SquareOpen, 0); }
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public TerminalNode SquareClose() { return getToken(Noise.SquareClose, 0); }
		public List<TerminalNode> NewLine() { return getTokens(Noise.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(Noise.NewLine, i);
		}
		public List<TerminalNode> Comma() { return getTokens(Noise.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Noise.Comma, i);
		}
		public ReferenceArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceArray; }
	}

	public final ReferenceArrayContext referenceArray() throws RecognitionException {
		ReferenceArrayContext _localctx = new ReferenceArrayContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_referenceArray);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(SquareOpen);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(60);
				match(NewLine);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			reference();
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67);
					match(NewLine);
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(73);
					match(Comma);
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NewLine) {
						{
						{
						setState(74);
						match(NewLine);
						}
						}
						setState(79);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(80);
					reference();
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(92);
				match(Comma);
				}
			}

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
			setState(101);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:j\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3\27"+
		"\n\3\f\3\16\3\32\13\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\"\n\4\f\4\16\4%\13\4"+
		"\3\4\3\4\7\4)\n\4\f\4\16\4,\13\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63\13\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\7\7@\n\7\f\7\16\7C\13\7\3\7"+
		"\3\7\7\7G\n\7\f\7\16\7J\13\7\3\7\3\7\7\7N\n\7\f\7\16\7Q\13\7\3\7\7\7T"+
		"\n\7\f\7\16\7W\13\7\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\7\5\7`\n\7\3\7\7\7c"+
		"\n\7\f\7\16\7f\13\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\4\3\2-.\3\2!#\2n\2"+
		"\16\3\2\2\2\4\21\3\2\2\2\6\35\3\2\2\2\b\66\3\2\2\2\n:\3\2\2\2\f=\3\2\2"+
		"\2\16\17\7\b\2\2\17\20\7.\2\2\20\3\3\2\2\2\21\22\7\t\2\2\22\23\7\65\2"+
		"\2\23\30\t\2\2\2\24\25\7\67\2\2\25\27\t\2\2\2\26\24\3\2\2\2\27\32\3\2"+
		"\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\33\3\2\2\2\32\30\3\2\2\2\33\34\7\66"+
		"\2\2\34\5\3\2\2\2\35\36\7\4\2\2\36\37\7:\2\2\37#\7/\2\2 \"\7\61\2\2! "+
		"\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&*\5\2\2\2"+
		"\')\7\61\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2"+
		"\2\2-\61\5\4\3\2.\60\7\61\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62"+
		"\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7\60\2\2\65\7\3\2\2\2\66\67"+
		"\7:\2\2\678\7\62\2\289\7:\2\29\t\3\2\2\2:;\t\3\2\2;<\7.\2\2<\13\3\2\2"+
		"\2=A\7\65\2\2>@\7\61\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2"+
		"\2\2CA\3\2\2\2DH\5\b\5\2EG\7\61\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3"+
		"\2\2\2IU\3\2\2\2JH\3\2\2\2KO\7\67\2\2LN\7\61\2\2ML\3\2\2\2NQ\3\2\2\2O"+
		"M\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RT\5\b\5\2SK\3\2\2\2TW\3\2\2\2"+
		"US\3\2\2\2UV\3\2\2\2V[\3\2\2\2WU\3\2\2\2XZ\7\61\2\2YX\3\2\2\2Z]\3\2\2"+
		"\2[Y\3\2\2\2[\\\3\2\2\2\\_\3\2\2\2][\3\2\2\2^`\7\67\2\2_^\3\2\2\2_`\3"+
		"\2\2\2`d\3\2\2\2ac\7\61\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg"+
		"\3\2\2\2fd\3\2\2\2gh\7\66\2\2h\r\3\2\2\2\r\30#*\61AHOU[_d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}