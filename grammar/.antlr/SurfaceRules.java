// Generated from /Users/brian/code/personal/mms/grammar/SurfaceRules.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SurfaceRules extends Parser {
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
		RULE_surfaceStatement = 0, RULE_surfaceRuleDeclaration = 1, RULE_surfaceRuleInline = 2, 
		RULE_surfaceRule = 3, RULE_surfaceRuleReference = 4, RULE_blockSurfaceRule = 5, 
		RULE_sequenceSurfaceRule = 6, RULE_bandlandsSurfaceRule = 7, RULE_conditionSurfaceRule = 8, 
		RULE_surfaceConditionDeclaration = 9, RULE_surfaceConditionInline = 10, 
		RULE_surfaceCondition = 11, RULE_biomeSurfaceCondition = 12, RULE_abovePreliminarySurfaceCondition = 13, 
		RULE_reference = 14, RULE_verticalAnchor = 15, RULE_referenceArray = 16, 
		RULE_blockProperties = 17, RULE_blockState = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"surfaceStatement", "surfaceRuleDeclaration", "surfaceRuleInline", "surfaceRule", 
			"surfaceRuleReference", "blockSurfaceRule", "sequenceSurfaceRule", "bandlandsSurfaceRule", 
			"conditionSurfaceRule", "surfaceConditionDeclaration", "surfaceConditionInline", 
			"surfaceCondition", "biomeSurfaceCondition", "abovePreliminarySurfaceCondition", 
			"reference", "verticalAnchor", "referenceArray", "blockProperties", "blockState"
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
	public String getGrammarFileName() { return "SurfaceRules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SurfaceRules(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SurfaceStatementContext extends ParserRuleContext {
		public TerminalNode Keyword_Surface() { return getToken(SurfaceRules.Keyword_Surface, 0); }
		public TerminalNode BlockStart() { return getToken(SurfaceRules.BlockStart, 0); }
		public TerminalNode BlockEnd() { return getToken(SurfaceRules.BlockEnd, 0); }
		public List<TerminalNode> NewLine() { return getTokens(SurfaceRules.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(SurfaceRules.NewLine, i);
		}
		public List<SurfaceRuleDeclarationContext> surfaceRuleDeclaration() {
			return getRuleContexts(SurfaceRuleDeclarationContext.class);
		}
		public SurfaceRuleDeclarationContext surfaceRuleDeclaration(int i) {
			return getRuleContext(SurfaceRuleDeclarationContext.class,i);
		}
		public List<SurfaceConditionDeclarationContext> surfaceConditionDeclaration() {
			return getRuleContexts(SurfaceConditionDeclarationContext.class);
		}
		public SurfaceConditionDeclarationContext surfaceConditionDeclaration(int i) {
			return getRuleContext(SurfaceConditionDeclarationContext.class,i);
		}
		public SurfaceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceStatement; }
	}

	public final SurfaceStatementContext surfaceStatement() throws RecognitionException {
		SurfaceStatementContext _localctx = new SurfaceStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_surfaceStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(Keyword_Surface);
			setState(39);
			match(BlockStart);
			setState(43);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(40);
					match(NewLine);
					}
					} 
				}
				setState(45);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Keyword_Rule || _la==Keyword_Condition) {
				{
				{
				setState(48);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Keyword_Rule:
					{
					setState(46);
					surfaceRuleDeclaration();
					}
					break;
				case Keyword_Condition:
					{
					setState(47);
					surfaceConditionDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(50);
						match(NewLine);
						}
						} 
					}
					setState(55);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SurfaceRuleDeclarationContext extends ParserRuleContext {
		public TerminalNode Keyword_Rule() { return getToken(SurfaceRules.Keyword_Rule, 0); }
		public TerminalNode Identifier() { return getToken(SurfaceRules.Identifier, 0); }
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
		enterRule(_localctx, 2, RULE_surfaceRuleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(Keyword_Rule);
			setState(70);
			match(Identifier);
			setState(71);
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

	public static class SurfaceRuleInlineContext extends ParserRuleContext {
		public TerminalNode BlockStart() { return getToken(SurfaceRules.BlockStart, 0); }
		public SurfaceRuleContext surfaceRule() {
			return getRuleContext(SurfaceRuleContext.class,0);
		}
		public TerminalNode BlockEnd() { return getToken(SurfaceRules.BlockEnd, 0); }
		public List<TerminalNode> NewLine() { return getTokens(SurfaceRules.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(SurfaceRules.NewLine, i);
		}
		public SurfaceRuleInlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRuleInline; }
	}

	public final SurfaceRuleInlineContext surfaceRuleInline() throws RecognitionException {
		SurfaceRuleInlineContext _localctx = new SurfaceRuleInlineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_surfaceRuleInline);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(BlockStart);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(74);
					match(NewLine);
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(80);
			surfaceRule();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(81);
				match(NewLine);
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
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

	public static class SurfaceRuleContext extends ParserRuleContext {
		public BlockSurfaceRuleContext blockSurfaceRule() {
			return getRuleContext(BlockSurfaceRuleContext.class,0);
		}
		public SequenceSurfaceRuleContext sequenceSurfaceRule() {
			return getRuleContext(SequenceSurfaceRuleContext.class,0);
		}
		public ConditionSurfaceRuleContext conditionSurfaceRule() {
			return getRuleContext(ConditionSurfaceRuleContext.class,0);
		}
		public SurfaceRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRule; }
	}

	public final SurfaceRuleContext surfaceRule() throws RecognitionException {
		SurfaceRuleContext _localctx = new SurfaceRuleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_surfaceRule);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Keyword_Block:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				blockSurfaceRule();
				}
				break;
			case Keyword_Sequence:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				sequenceSurfaceRule();
				}
				break;
			case Keyword_If:
			case NewLine:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				conditionSurfaceRule();
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

	public static class SurfaceRuleReferenceContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public SurfaceRuleInlineContext surfaceRuleInline() {
			return getRuleContext(SurfaceRuleInlineContext.class,0);
		}
		public SurfaceRuleReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRuleReference; }
	}

	public final SurfaceRuleReferenceContext surfaceRuleReference() throws RecognitionException {
		SurfaceRuleReferenceContext _localctx = new SurfaceRuleReferenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_surfaceRuleReference);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Quote:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				reference();
				}
				break;
			case BlockStart:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				surfaceRuleInline();
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

	public static class BlockSurfaceRuleContext extends ParserRuleContext {
		public TerminalNode Keyword_Block() { return getToken(SurfaceRules.Keyword_Block, 0); }
		public BlockStateContext blockState() {
			return getRuleContext(BlockStateContext.class,0);
		}
		public BlockSurfaceRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockSurfaceRule; }
	}

	public final BlockSurfaceRuleContext blockSurfaceRule() throws RecognitionException {
		BlockSurfaceRuleContext _localctx = new BlockSurfaceRuleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_blockSurfaceRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(Keyword_Block);
			setState(99);
			blockState();
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

	public static class SequenceSurfaceRuleContext extends ParserRuleContext {
		public TerminalNode Keyword_Sequence() { return getToken(SurfaceRules.Keyword_Sequence, 0); }
		public TerminalNode SquareOpen() { return getToken(SurfaceRules.SquareOpen, 0); }
		public List<SurfaceRuleReferenceContext> surfaceRuleReference() {
			return getRuleContexts(SurfaceRuleReferenceContext.class);
		}
		public SurfaceRuleReferenceContext surfaceRuleReference(int i) {
			return getRuleContext(SurfaceRuleReferenceContext.class,i);
		}
		public TerminalNode SquareClose() { return getToken(SurfaceRules.SquareClose, 0); }
		public List<TerminalNode> NewLine() { return getTokens(SurfaceRules.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(SurfaceRules.NewLine, i);
		}
		public List<TerminalNode> Comma() { return getTokens(SurfaceRules.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SurfaceRules.Comma, i);
		}
		public SequenceSurfaceRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceSurfaceRule; }
	}

	public final SequenceSurfaceRuleContext sequenceSurfaceRule() throws RecognitionException {
		SequenceSurfaceRuleContext _localctx = new SequenceSurfaceRuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sequenceSurfaceRule);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(Keyword_Sequence);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(102);
				match(NewLine);
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(SquareOpen);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(109);
				match(NewLine);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(115);
					surfaceRuleReference();
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NewLine) {
						{
						{
						setState(116);
						match(NewLine);
						}
						}
						setState(121);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(122);
					match(Comma);
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NewLine) {
						{
						{
						setState(123);
						match(NewLine);
						}
						}
						setState(128);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(134);
			surfaceRuleReference();
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
			match(SquareClose);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(142);
					match(NewLine);
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class BandlandsSurfaceRuleContext extends ParserRuleContext {
		public TerminalNode Keyword_Bandlands() { return getToken(SurfaceRules.Keyword_Bandlands, 0); }
		public BandlandsSurfaceRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bandlandsSurfaceRule; }
	}

	public final BandlandsSurfaceRuleContext bandlandsSurfaceRule() throws RecognitionException {
		BandlandsSurfaceRuleContext _localctx = new BandlandsSurfaceRuleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bandlandsSurfaceRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(Keyword_Bandlands);
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

	public static class ConditionSurfaceRuleContext extends ParserRuleContext {
		public TerminalNode Keyword_If() { return getToken(SurfaceRules.Keyword_If, 0); }
		public TerminalNode RoundOpen() { return getToken(SurfaceRules.RoundOpen, 0); }
		public SurfaceConditionContext surfaceCondition() {
			return getRuleContext(SurfaceConditionContext.class,0);
		}
		public TerminalNode RoundClose() { return getToken(SurfaceRules.RoundClose, 0); }
		public List<SurfaceRuleReferenceContext> surfaceRuleReference() {
			return getRuleContexts(SurfaceRuleReferenceContext.class);
		}
		public SurfaceRuleReferenceContext surfaceRuleReference(int i) {
			return getRuleContext(SurfaceRuleReferenceContext.class,i);
		}
		public List<TerminalNode> NewLine() { return getTokens(SurfaceRules.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(SurfaceRules.NewLine, i);
		}
		public TerminalNode Keyword_Else() { return getToken(SurfaceRules.Keyword_Else, 0); }
		public ConditionSurfaceRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionSurfaceRule; }
	}

	public final ConditionSurfaceRuleContext conditionSurfaceRule() throws RecognitionException {
		ConditionSurfaceRuleContext _localctx = new ConditionSurfaceRuleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditionSurfaceRule);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NewLine) {
				{
				setState(150);
				match(NewLine);
				}
			}

			setState(153);
			match(Keyword_If);
			setState(154);
			match(RoundOpen);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(155);
				match(NewLine);
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			surfaceCondition();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(162);
				match(NewLine);
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(RoundClose);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(169);
				match(NewLine);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(175);
			surfaceRuleReference();
			}
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(176);
					match(NewLine);
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Keyword_Else) {
				{
				setState(182);
				match(Keyword_Else);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NewLine) {
					{
					{
					setState(183);
					match(NewLine);
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(189);
				surfaceRuleReference();
				}
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

	public static class SurfaceConditionDeclarationContext extends ParserRuleContext {
		public TerminalNode Keyword_Condition() { return getToken(SurfaceRules.Keyword_Condition, 0); }
		public SurfaceConditionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceConditionDeclaration; }
	}

	public final SurfaceConditionDeclarationContext surfaceConditionDeclaration() throws RecognitionException {
		SurfaceConditionDeclarationContext _localctx = new SurfaceConditionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_surfaceConditionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(Keyword_Condition);
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

	public static class SurfaceConditionInlineContext extends ParserRuleContext {
		public TerminalNode RoundOpen() { return getToken(SurfaceRules.RoundOpen, 0); }
		public SurfaceConditionContext surfaceCondition() {
			return getRuleContext(SurfaceConditionContext.class,0);
		}
		public TerminalNode RoundClose() { return getToken(SurfaceRules.RoundClose, 0); }
		public SurfaceConditionInlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceConditionInline; }
	}

	public final SurfaceConditionInlineContext surfaceConditionInline() throws RecognitionException {
		SurfaceConditionInlineContext _localctx = new SurfaceConditionInlineContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_surfaceConditionInline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(RoundOpen);
			setState(195);
			surfaceCondition();
			setState(196);
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

	public static class SurfaceConditionContext extends ParserRuleContext {
		public BiomeSurfaceConditionContext biomeSurfaceCondition() {
			return getRuleContext(BiomeSurfaceConditionContext.class,0);
		}
		public AbovePreliminarySurfaceConditionContext abovePreliminarySurfaceCondition() {
			return getRuleContext(AbovePreliminarySurfaceConditionContext.class,0);
		}
		public SurfaceConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition; }
	}

	public final SurfaceConditionContext surfaceCondition() throws RecognitionException {
		SurfaceConditionContext _localctx = new SurfaceConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_surfaceCondition);
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Keyword_Biome:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				biomeSurfaceCondition();
				}
				break;
			case Keyword_AbovePreliminarySurface:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				abovePreliminarySurfaceCondition();
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

	public static class BiomeSurfaceConditionContext extends ParserRuleContext {
		public TerminalNode Keyword_Biome() { return getToken(SurfaceRules.Keyword_Biome, 0); }
		public ReferenceArrayContext referenceArray() {
			return getRuleContext(ReferenceArrayContext.class,0);
		}
		public BiomeSurfaceConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_biomeSurfaceCondition; }
	}

	public final BiomeSurfaceConditionContext biomeSurfaceCondition() throws RecognitionException {
		BiomeSurfaceConditionContext _localctx = new BiomeSurfaceConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_biomeSurfaceCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(Keyword_Biome);
			setState(203);
			referenceArray();
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

	public static class AbovePreliminarySurfaceConditionContext extends ParserRuleContext {
		public TerminalNode Keyword_AbovePreliminarySurface() { return getToken(SurfaceRules.Keyword_AbovePreliminarySurface, 0); }
		public VerticalAnchorContext verticalAnchor() {
			return getRuleContext(VerticalAnchorContext.class,0);
		}
		public AbovePreliminarySurfaceConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abovePreliminarySurfaceCondition; }
	}

	public final AbovePreliminarySurfaceConditionContext abovePreliminarySurfaceCondition() throws RecognitionException {
		AbovePreliminarySurfaceConditionContext _localctx = new AbovePreliminarySurfaceConditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_abovePreliminarySurfaceCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(Keyword_AbovePreliminarySurface);
			setState(206);
			verticalAnchor();
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
		public List<TerminalNode> Quote() { return getTokens(SurfaceRules.Quote); }
		public TerminalNode Quote(int i) {
			return getToken(SurfaceRules.Quote, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(SurfaceRules.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SurfaceRules.Identifier, i);
		}
		public TerminalNode Colon() { return getToken(SurfaceRules.Colon, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(Quote);
			setState(209);
			match(Identifier);
			setState(210);
			match(Colon);
			setState(211);
			match(Identifier);
			setState(212);
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
		public TerminalNode Integer() { return getToken(SurfaceRules.Integer, 0); }
		public TerminalNode Keyword_Absolute() { return getToken(SurfaceRules.Keyword_Absolute, 0); }
		public TerminalNode Keyword_AboveBottom() { return getToken(SurfaceRules.Keyword_AboveBottom, 0); }
		public TerminalNode Keyword_BelowTop() { return getToken(SurfaceRules.Keyword_BelowTop, 0); }
		public VerticalAnchorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verticalAnchor; }
	}

	public final VerticalAnchorContext verticalAnchor() throws RecognitionException {
		VerticalAnchorContext _localctx = new VerticalAnchorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_verticalAnchor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Keyword_Absolute) | (1L << Keyword_AboveBottom) | (1L << Keyword_BelowTop))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(215);
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
		public TerminalNode SquareOpen() { return getToken(SurfaceRules.SquareOpen, 0); }
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public TerminalNode SquareClose() { return getToken(SurfaceRules.SquareClose, 0); }
		public List<TerminalNode> NewLine() { return getTokens(SurfaceRules.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(SurfaceRules.NewLine, i);
		}
		public List<TerminalNode> Comma() { return getTokens(SurfaceRules.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SurfaceRules.Comma, i);
		}
		public ReferenceArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceArray; }
	}

	public final ReferenceArrayContext referenceArray() throws RecognitionException {
		ReferenceArrayContext _localctx = new ReferenceArrayContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_referenceArray);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(SquareOpen);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(218);
				match(NewLine);
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
			reference();
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(225);
					match(NewLine);
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					match(Comma);
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NewLine) {
						{
						{
						setState(232);
						match(NewLine);
						}
						}
						setState(237);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(238);
					reference();
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(244);
					match(NewLine);
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(250);
				match(Comma);
				}
			}

			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(253);
				match(NewLine);
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
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

	public static class BlockPropertiesContext extends ParserRuleContext {
		public TerminalNode BlockStart() { return getToken(SurfaceRules.BlockStart, 0); }
		public TerminalNode BlockEnd() { return getToken(SurfaceRules.BlockEnd, 0); }
		public List<TerminalNode> NewLine() { return getTokens(SurfaceRules.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(SurfaceRules.NewLine, i);
		}
		public BlockPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockProperties; }
	}

	public final BlockPropertiesContext blockProperties() throws RecognitionException {
		BlockPropertiesContext _localctx = new BlockPropertiesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_blockProperties);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(BlockStart);
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(262);
					match(NewLine);
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(268);
				match(NewLine);
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
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
		enterRule(_localctx, 36, RULE_blockState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			reference();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BlockStart) {
				{
				setState(277);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u011b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\5\2\63"+
		"\n\2\3\2\7\2\66\n\2\f\2\16\29\13\2\7\2;\n\2\f\2\16\2>\13\2\3\2\7\2A\n"+
		"\2\f\2\16\2D\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\7\4N\n\4\f\4\16\4Q\13"+
		"\4\3\4\3\4\7\4U\n\4\f\4\16\4X\13\4\3\4\3\4\3\5\3\5\3\5\5\5_\n\5\3\6\3"+
		"\6\5\6c\n\6\3\7\3\7\3\7\3\b\3\b\7\bj\n\b\f\b\16\bm\13\b\3\b\3\b\7\bq\n"+
		"\b\f\b\16\bt\13\b\3\b\3\b\7\bx\n\b\f\b\16\b{\13\b\3\b\3\b\7\b\177\n\b"+
		"\f\b\16\b\u0082\13\b\7\b\u0084\n\b\f\b\16\b\u0087\13\b\3\b\3\b\7\b\u008b"+
		"\n\b\f\b\16\b\u008e\13\b\3\b\3\b\7\b\u0092\n\b\f\b\16\b\u0095\13\b\3\t"+
		"\3\t\3\n\5\n\u009a\n\n\3\n\3\n\3\n\7\n\u009f\n\n\f\n\16\n\u00a2\13\n\3"+
		"\n\3\n\7\n\u00a6\n\n\f\n\16\n\u00a9\13\n\3\n\3\n\7\n\u00ad\n\n\f\n\16"+
		"\n\u00b0\13\n\3\n\3\n\7\n\u00b4\n\n\f\n\16\n\u00b7\13\n\3\n\3\n\7\n\u00bb"+
		"\n\n\f\n\16\n\u00be\13\n\3\n\5\n\u00c1\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\5\r\u00cb\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\7\22\u00de\n\22\f\22\16\22\u00e1\13"+
		"\22\3\22\3\22\7\22\u00e5\n\22\f\22\16\22\u00e8\13\22\3\22\3\22\7\22\u00ec"+
		"\n\22\f\22\16\22\u00ef\13\22\3\22\7\22\u00f2\n\22\f\22\16\22\u00f5\13"+
		"\22\3\22\7\22\u00f8\n\22\f\22\16\22\u00fb\13\22\3\22\5\22\u00fe\n\22\3"+
		"\22\7\22\u0101\n\22\f\22\16\22\u0104\13\22\3\22\3\22\3\23\3\23\7\23\u010a"+
		"\n\23\f\23\16\23\u010d\13\23\3\23\7\23\u0110\n\23\f\23\16\23\u0113\13"+
		"\23\3\23\3\23\3\24\3\24\5\24\u0119\n\24\3\24\2\2\25\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&\2\3\3\2\"$\2\u012a\2(\3\2\2\2\4G\3\2\2\2\6"+
		"K\3\2\2\2\b^\3\2\2\2\nb\3\2\2\2\fd\3\2\2\2\16g\3\2\2\2\20\u0096\3\2\2"+
		"\2\22\u0099\3\2\2\2\24\u00c2\3\2\2\2\26\u00c4\3\2\2\2\30\u00ca\3\2\2\2"+
		"\32\u00cc\3\2\2\2\34\u00cf\3\2\2\2\36\u00d2\3\2\2\2 \u00d8\3\2\2\2\"\u00db"+
		"\3\2\2\2$\u0107\3\2\2\2&\u0116\3\2\2\2()\7\f\2\2)-\7\60\2\2*,\7\62\2\2"+
		"+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.<\3\2\2\2/-\3\2\2\2\60\63\5\4"+
		"\3\2\61\63\5\24\13\2\62\60\3\2\2\2\62\61\3\2\2\2\63\67\3\2\2\2\64\66\7"+
		"\62\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28;\3\2\2\2"+
		"9\67\3\2\2\2:\62\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=B\3\2\2\2><\3\2"+
		"\2\2?A\7\62\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3"+
		"\2\2\2EF\7\61\2\2F\3\3\2\2\2GH\7\r\2\2HI\7<\2\2IJ\5\b\5\2J\5\3\2\2\2K"+
		"O\7\60\2\2LN\7\62\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2"+
		"\2QO\3\2\2\2RV\5\b\5\2SU\7\62\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2"+
		"\2\2WY\3\2\2\2XV\3\2\2\2YZ\7\61\2\2Z\7\3\2\2\2[_\5\f\7\2\\_\5\16\b\2]"+
		"_\5\22\n\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\t\3\2\2\2`c\5\36\20\2ac\5\6"+
		"\4\2b`\3\2\2\2ba\3\2\2\2c\13\3\2\2\2de\7\17\2\2ef\5&\24\2f\r\3\2\2\2g"+
		"k\7(\2\2hj\7\62\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2"+
		"mk\3\2\2\2nr\7\66\2\2oq\7\62\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2"+
		"\2s\u0085\3\2\2\2tr\3\2\2\2uy\5\n\6\2vx\7\62\2\2wv\3\2\2\2x{\3\2\2\2y"+
		"w\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|\u0080\78\2\2}\177\7\62\2\2~}"+
		"\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0083u\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0088\u008c\5\n\6\2\u0089\u008b\7\62\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008f\u0093\7\67\2\2\u0090\u0092\7\62\2\2\u0091"+
		"\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\17\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7\13\2\2\u0097\21"+
		"\3\2\2\2\u0098\u009a\7\62\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2"+
		"\u009a\u009b\3\2\2\2\u009b\u009c\7+\2\2\u009c\u00a0\7\64\2\2\u009d\u009f"+
		"\7\62\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2"+
		"\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a7"+
		"\5\30\r\2\u00a4\u00a6\7\62\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2"+
		"\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00aa\u00ae\7\65\2\2\u00ab\u00ad\7\62\2\2\u00ac\u00ab\3\2\2\2"+
		"\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b5\5\n\6\2\u00b2\u00b4\7\62\2\2"+
		"\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6\u00c0\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bc\7,\2\2\u00b9"+
		"\u00bb\7\62\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3"+
		"\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c1\5\n\6\2\u00c0\u00b8\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\23\3\2\2"+
		"\2\u00c2\u00c3\7\16\2\2\u00c3\25\3\2\2\2\u00c4\u00c5\7\64\2\2\u00c5\u00c6"+
		"\5\30\r\2\u00c6\u00c7\7\65\2\2\u00c7\27\3\2\2\2\u00c8\u00cb\5\32\16\2"+
		"\u00c9\u00cb\5\34\17\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\31"+
		"\3\2\2\2\u00cc\u00cd\7\22\2\2\u00cd\u00ce\5\"\22\2\u00ce\33\3\2\2\2\u00cf"+
		"\u00d0\7\21\2\2\u00d0\u00d1\5 \21\2\u00d1\35\3\2\2\2\u00d2\u00d3\7;\2"+
		"\2\u00d3\u00d4\7<\2\2\u00d4\u00d5\7\63\2\2\u00d5\u00d6\7<\2\2\u00d6\u00d7"+
		"\7;\2\2\u00d7\37\3\2\2\2\u00d8\u00d9\t\2\2\2\u00d9\u00da\7/\2\2\u00da"+
		"!\3\2\2\2\u00db\u00df\7\66\2\2\u00dc\u00de\7\62\2\2\u00dd\u00dc\3\2\2"+
		"\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e6\5\36\20\2\u00e3\u00e5\7\62\2"+
		"\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00f3\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ed\78\2\2\u00ea"+
		"\u00ec\7\62\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3"+
		"\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00f2\5\36\20\2\u00f1\u00e9\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3"+
		"\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f9\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6"+
		"\u00f8\7\62\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3"+
		"\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00fe\78\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0102\3\2"+
		"\2\2\u00ff\u0101\7\62\2\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0105\u0106\7\67\2\2\u0106#\3\2\2\2\u0107\u010b\7\60\2\2\u0108\u010a"+
		"\7\62\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2"+
		"\u010b\u010c\3\2\2\2\u010c\u0111\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0110"+
		"\7\62\2\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2"+
		"\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115"+
		"\7\61\2\2\u0115%\3\2\2\2\u0116\u0118\5\36\20\2\u0117\u0119\5$\23\2\u0118"+
		"\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\'\3\2\2\2$-\62\67<BOV^bkry\u0080"+
		"\u0085\u008c\u0093\u0099\u00a0\u00a7\u00ae\u00b5\u00bc\u00c0\u00ca\u00df"+
		"\u00e6\u00ed\u00f3\u00f9\u00fd\u0102\u010b\u0111\u0118";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}