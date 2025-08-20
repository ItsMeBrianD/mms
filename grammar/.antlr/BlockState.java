// Generated from /Users/brian/code/personal/mms/grammar/BlockState.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BlockState extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DensityFunctionStart=1, Keyword_Noise=2, Keyword_Constant=3, Keyword_XZScale=4, 
		Keyword_YScale=5, Keyword_FirstOctave=6, Keyword_Amplitudes=7, Keyword_Namespace=8, 
		Keyword_Bandlands=9, Keyword_Surface=10, Keyword_Rule=11, Keyword_Condition=12, 
		Keyword_Block=13, Keyword_Type=14, Keyword_AbovePreliminarySurface=15, 
		Keyword_Biome=16, Keyword_BiomeIs=17, Keyword_Hole=18, Keyword_NoiseThreshold=19, 
		Keyword_MinThreshold=20, Keyword_MaxThreshold=21, Keyword_StoneDepth=22, 
		Keyword_SurfaceType=23, Keyword_Offset=24, Keyword_AddSurfaceDepth=25, 
		Keyword_SecondaryDepthRange=26, Keyword_Temperature=27, Keyword_VerticalGradient=28, 
		Keyword_RandomName=29, Keyword_TrueAtAndBelow=30, Keyword_FalseAtAndAbove=31, 
		Keyword_Absolute=32, Keyword_AboveBottom=33, Keyword_BelowTop=34, Keyword_Water=35, 
		Keyword_SurfaceDepthMulitplier=36, Keyword_AddStoneDepth=37, Keyword_Sequence=38, 
		Keyword_YAbove=39, Keyword_Anchor=40, Keyword_If=41, Keyword_Else=42, 
		Whitespace=43, Float=44, Integer=45, BlockStart=46, BlockEnd=47, NewLine=48, 
		Colon=49, RoundOpen=50, RoundClose=51, SquareOpen=52, SquareClose=53, 
		Comma=54, Comment=55, Not=56, Quote=57, Identifier=58;
	public static final int
		RULE_blockProperties = 0, RULE_blockState = 1, RULE_reference = 2, RULE_verticalAnchor = 3, 
		RULE_referenceArray = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"blockProperties", "blockState", "reference", "verticalAnchor", "referenceArray"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'density'", "'noise'", "'constant'", "'xz_scale'", "'y_scale'", 
			"'first_octave'", "'amplitudes'", "'namespace'", "'bandlands'", "'surface'", 
			"'rule'", "'condition'", "'block'", "'type'", "'above_preliminary_surface'", 
			"'biome'", "'biome_is'", "'hole'", "'noise_threshold'", "'min_threshold'", 
			"'max_threshold'", "'stone_depth'", "'surface_type'", "'offset'", "'add_surface_depth'", 
			"'secondary_depth_range'", "'temperature'", "'vertical_gradient'", "'random_name'", 
			"'true_at_and_below'", "'false_at_and_above'", "'absolute'", "'above_bottom'", 
			"'below_top'", "'water'", "'surface_depth_mulitplier'", "'add_stone_depth'", 
			"'sequence'", "'y_above'", "'anchor'", "'if'", "'else'", null, null, 
			null, "'{'", null, null, "':'", "'('", "')'", "'['", "']'", "','", null, 
			"'!'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DensityFunctionStart", "Keyword_Noise", "Keyword_Constant", "Keyword_XZScale", 
			"Keyword_YScale", "Keyword_FirstOctave", "Keyword_Amplitudes", "Keyword_Namespace", 
			"Keyword_Bandlands", "Keyword_Surface", "Keyword_Rule", "Keyword_Condition", 
			"Keyword_Block", "Keyword_Type", "Keyword_AbovePreliminarySurface", "Keyword_Biome", 
			"Keyword_BiomeIs", "Keyword_Hole", "Keyword_NoiseThreshold", "Keyword_MinThreshold", 
			"Keyword_MaxThreshold", "Keyword_StoneDepth", "Keyword_SurfaceType", 
			"Keyword_Offset", "Keyword_AddSurfaceDepth", "Keyword_SecondaryDepthRange", 
			"Keyword_Temperature", "Keyword_VerticalGradient", "Keyword_RandomName", 
			"Keyword_TrueAtAndBelow", "Keyword_FalseAtAndAbove", "Keyword_Absolute", 
			"Keyword_AboveBottom", "Keyword_BelowTop", "Keyword_Water", "Keyword_SurfaceDepthMulitplier", 
			"Keyword_AddStoneDepth", "Keyword_Sequence", "Keyword_YAbove", "Keyword_Anchor", 
			"Keyword_If", "Keyword_Else", "Whitespace", "Float", "Integer", "BlockStart", 
			"BlockEnd", "NewLine", "Colon", "RoundOpen", "RoundClose", "SquareOpen", 
			"SquareClose", "Comma", "Comment", "Not", "Quote", "Identifier"
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
	public String getGrammarFileName() { return "BlockState.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BlockState(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class BlockPropertiesContext extends ParserRuleContext {
		public TerminalNode BlockStart() { return getToken(BlockState.BlockStart, 0); }
		public TerminalNode BlockEnd() { return getToken(BlockState.BlockEnd, 0); }
		public List<TerminalNode> NewLine() { return getTokens(BlockState.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(BlockState.NewLine, i);
		}
		public BlockPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockProperties; }
	}

	public final BlockPropertiesContext blockProperties() throws RecognitionException {
		BlockPropertiesContext _localctx = new BlockPropertiesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_blockProperties);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(BlockStart);
			setState(14);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(11);
					match(NewLine);
					}
					} 
				}
				setState(16);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(17);
				match(NewLine);
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23);
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
		enterRule(_localctx, 2, RULE_blockState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			reference();
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BlockStart) {
				{
				setState(26);
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

	public static class ReferenceContext extends ParserRuleContext {
		public List<TerminalNode> Quote() { return getTokens(BlockState.Quote); }
		public TerminalNode Quote(int i) {
			return getToken(BlockState.Quote, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(BlockState.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(BlockState.Identifier, i);
		}
		public TerminalNode Colon() { return getToken(BlockState.Colon, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(Quote);
			setState(30);
			match(Identifier);
			setState(31);
			match(Colon);
			setState(32);
			match(Identifier);
			setState(33);
			match(Quote);
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
		public TerminalNode Integer() { return getToken(BlockState.Integer, 0); }
		public TerminalNode Keyword_Absolute() { return getToken(BlockState.Keyword_Absolute, 0); }
		public TerminalNode Keyword_AboveBottom() { return getToken(BlockState.Keyword_AboveBottom, 0); }
		public TerminalNode Keyword_BelowTop() { return getToken(BlockState.Keyword_BelowTop, 0); }
		public VerticalAnchorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verticalAnchor; }
	}

	public final VerticalAnchorContext verticalAnchor() throws RecognitionException {
		VerticalAnchorContext _localctx = new VerticalAnchorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_verticalAnchor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Keyword_Absolute) | (1L << Keyword_AboveBottom) | (1L << Keyword_BelowTop))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(36);
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
		public TerminalNode SquareOpen() { return getToken(BlockState.SquareOpen, 0); }
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public TerminalNode SquareClose() { return getToken(BlockState.SquareClose, 0); }
		public List<TerminalNode> NewLine() { return getTokens(BlockState.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(BlockState.NewLine, i);
		}
		public List<TerminalNode> Comma() { return getTokens(BlockState.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(BlockState.Comma, i);
		}
		public ReferenceArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceArray; }
	}

	public final ReferenceArrayContext referenceArray() throws RecognitionException {
		ReferenceArrayContext _localctx = new ReferenceArrayContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_referenceArray);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(SquareOpen);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(39);
				match(NewLine);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			reference();
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(46);
					match(NewLine);
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(52);
					match(Comma);
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NewLine) {
						{
						{
						setState(53);
						match(NewLine);
						}
						}
						setState(58);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(59);
					reference();
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(65);
					match(NewLine);
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(71);
				match(Comma);
				}
			}

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<U\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\7\2\17\n\2\f\2\16\2\22\13\2\3\2\7\2\25"+
		"\n\2\f\2\16\2\30\13\2\3\2\3\2\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\6\3\6\7\6+\n\6\f\6\16\6.\13\6\3\6\3\6\7\6\62\n\6\f\6"+
		"\16\6\65\13\6\3\6\3\6\7\69\n\6\f\6\16\6<\13\6\3\6\7\6?\n\6\f\6\16\6B\13"+
		"\6\3\6\7\6E\n\6\f\6\16\6H\13\6\3\6\5\6K\n\6\3\6\7\6N\n\6\f\6\16\6Q\13"+
		"\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\3\3\2\"$\2Y\2\f\3\2\2\2\4\33\3\2\2\2"+
		"\6\37\3\2\2\2\b%\3\2\2\2\n(\3\2\2\2\f\20\7\60\2\2\r\17\7\62\2\2\16\r\3"+
		"\2\2\2\17\22\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\26\3\2\2\2\22\20\3"+
		"\2\2\2\23\25\7\62\2\2\24\23\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27"+
		"\3\2\2\2\27\31\3\2\2\2\30\26\3\2\2\2\31\32\7\61\2\2\32\3\3\2\2\2\33\35"+
		"\5\6\4\2\34\36\5\2\2\2\35\34\3\2\2\2\35\36\3\2\2\2\36\5\3\2\2\2\37 \7"+
		";\2\2 !\7<\2\2!\"\7\63\2\2\"#\7<\2\2#$\7;\2\2$\7\3\2\2\2%&\t\2\2\2&\'"+
		"\7/\2\2\'\t\3\2\2\2(,\7\66\2\2)+\7\62\2\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2"+
		"\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\63\5\6\4\2\60\62\7\62\2\2\61\60\3\2"+
		"\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64@\3\2\2\2\65\63\3\2\2"+
		"\2\66:\78\2\2\679\7\62\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;"+
		"=\3\2\2\2<:\3\2\2\2=?\5\6\4\2>\66\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2"+
		"\2AF\3\2\2\2B@\3\2\2\2CE\7\62\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2"+
		"\2\2GJ\3\2\2\2HF\3\2\2\2IK\78\2\2JI\3\2\2\2JK\3\2\2\2KO\3\2\2\2LN\7\62"+
		"\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7\67"+
		"\2\2S\13\3\2\2\2\f\20\26\35,\63:@FJO";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}