// Generated from /Users/brian/code/personal/mms/grammar/MMSLex.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MMSLex extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DensityFunctionStart", "Keyword_Noise", "Keyword_Constant", "Keyword_XZScale", 
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
			"BlockEnd", "NewLine", "OptionalWhitespace", "Colon", "RoundOpen", "RoundClose", 
			"SquareOpen", "SquareClose", "Comma", "Comment", "Not", "Quote", "Identifier"
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


	public MMSLex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MMSLex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u029e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3,\6,\u0251\n,\r"+
		",\16,\u0252\3,\3,\3-\5-\u0258\n-\3-\6-\u025b\n-\r-\16-\u025c\3-\3-\6-"+
		"\u0261\n-\r-\16-\u0262\3.\5.\u0266\n.\3.\6.\u0269\n.\r.\16.\u026a\3/\3"+
		"/\3\60\7\60\u0270\n\60\f\60\16\60\u0273\13\60\3\60\3\60\3\61\3\61\3\62"+
		"\7\62\u027a\n\62\f\62\16\62\u027d\13\62\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\38\38\39\39\39\39\79\u028f\n9\f9\169\u0292\139\3"+
		"9\39\3:\3:\3;\3;\3<\6<\u029b\n<\r<\16<\u029c\2\2=\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\2e\63g\64i\65k\66m\67o8q9s:u;w<\3\2\7\4\2\13"+
		"\13\"\"\3\2\62;\5\2\13\f\17\17\"\"\4\2\f\f\17\17\6\2\62;C\\aac|\2\u02a6"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2\2\5\u0081\3\2"+
		"\2\2\7\u0087\3\2\2\2\t\u0090\3\2\2\2\13\u0099\3\2\2\2\r\u00a1\3\2\2\2"+
		"\17\u00ae\3\2\2\2\21\u00b9\3\2\2\2\23\u00c3\3\2\2\2\25\u00cd\3\2\2\2\27"+
		"\u00d5\3\2\2\2\31\u00da\3\2\2\2\33\u00e4\3\2\2\2\35\u00ea\3\2\2\2\37\u00ef"+
		"\3\2\2\2!\u0109\3\2\2\2#\u010f\3\2\2\2%\u0118\3\2\2\2\'\u011d\3\2\2\2"+
		")\u012d\3\2\2\2+\u013b\3\2\2\2-\u0149\3\2\2\2/\u0155\3\2\2\2\61\u0162"+
		"\3\2\2\2\63\u0169\3\2\2\2\65\u017b\3\2\2\2\67\u0191\3\2\2\29\u019d\3\2"+
		"\2\2;\u01af\3\2\2\2=\u01bb\3\2\2\2?\u01cd\3\2\2\2A\u01e0\3\2\2\2C\u01e9"+
		"\3\2\2\2E\u01f6\3\2\2\2G\u0200\3\2\2\2I\u0206\3\2\2\2K\u021f\3\2\2\2M"+
		"\u022f\3\2\2\2O\u0238\3\2\2\2Q\u0240\3\2\2\2S\u0247\3\2\2\2U\u024a\3\2"+
		"\2\2W\u0250\3\2\2\2Y\u0257\3\2\2\2[\u0265\3\2\2\2]\u026c\3\2\2\2_\u0271"+
		"\3\2\2\2a\u0276\3\2\2\2c\u027b\3\2\2\2e\u027e\3\2\2\2g\u0280\3\2\2\2i"+
		"\u0282\3\2\2\2k\u0284\3\2\2\2m\u0286\3\2\2\2o\u0288\3\2\2\2q\u028a\3\2"+
		"\2\2s\u0295\3\2\2\2u\u0297\3\2\2\2w\u029a\3\2\2\2yz\7f\2\2z{\7g\2\2{|"+
		"\7p\2\2|}\7u\2\2}~\7k\2\2~\177\7v\2\2\177\u0080\7{\2\2\u0080\4\3\2\2\2"+
		"\u0081\u0082\7p\2\2\u0082\u0083\7q\2\2\u0083\u0084\7k\2\2\u0084\u0085"+
		"\7u\2\2\u0085\u0086\7g\2\2\u0086\6\3\2\2\2\u0087\u0088\7e\2\2\u0088\u0089"+
		"\7q\2\2\u0089\u008a\7p\2\2\u008a\u008b\7u\2\2\u008b\u008c\7v\2\2\u008c"+
		"\u008d\7c\2\2\u008d\u008e\7p\2\2\u008e\u008f\7v\2\2\u008f\b\3\2\2\2\u0090"+
		"\u0091\7z\2\2\u0091\u0092\7|\2\2\u0092\u0093\7a\2\2\u0093\u0094\7u\2\2"+
		"\u0094\u0095\7e\2\2\u0095\u0096\7c\2\2\u0096\u0097\7n\2\2\u0097\u0098"+
		"\7g\2\2\u0098\n\3\2\2\2\u0099\u009a\7{\2\2\u009a\u009b\7a\2\2\u009b\u009c"+
		"\7u\2\2\u009c\u009d\7e\2\2\u009d\u009e\7c\2\2\u009e\u009f\7n\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0\f\3\2\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3\7k\2\2\u00a3"+
		"\u00a4\7t\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7a\2\2"+
		"\u00a7\u00a8\7q\2\2\u00a8\u00a9\7e\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab"+
		"\7c\2\2\u00ab\u00ac\7x\2\2\u00ac\u00ad\7g\2\2\u00ad\16\3\2\2\2\u00ae\u00af"+
		"\7c\2\2\u00af\u00b0\7o\2\2\u00b0\u00b1\7r\2\2\u00b1\u00b2\7n\2\2\u00b2"+
		"\u00b3\7k\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7w\2\2\u00b5\u00b6\7f\2\2"+
		"\u00b6\u00b7\7g\2\2\u00b7\u00b8\7u\2\2\u00b8\20\3\2\2\2\u00b9\u00ba\7"+
		"p\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7o\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be"+
		"\7u\2\2\u00be\u00bf\7r\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7e\2\2\u00c1"+
		"\u00c2\7g\2\2\u00c2\22\3\2\2\2\u00c3\u00c4\7d\2\2\u00c4\u00c5\7c\2\2\u00c5"+
		"\u00c6\7p\2\2\u00c6\u00c7\7f\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7c\2\2"+
		"\u00c9\u00ca\7p\2\2\u00ca\u00cb\7f\2\2\u00cb\u00cc\7u\2\2\u00cc\24\3\2"+
		"\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1"+
		"\7h\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7e\2\2\u00d3\u00d4\7g\2\2\u00d4"+
		"\26\3\2\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7w\2\2\u00d7\u00d8\7n\2\2\u00d8"+
		"\u00d9\7g\2\2\u00d9\30\3\2\2\2\u00da\u00db\7e\2\2\u00db\u00dc\7q\2\2\u00dc"+
		"\u00dd\7p\2\2\u00dd\u00de\7f\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7v\2\2"+
		"\u00e0\u00e1\7k\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7p\2\2\u00e3\32\3\2"+
		"\2\2\u00e4\u00e5\7d\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8"+
		"\7e\2\2\u00e8\u00e9\7m\2\2\u00e9\34\3\2\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec"+
		"\7{\2\2\u00ec\u00ed\7r\2\2\u00ed\u00ee\7g\2\2\u00ee\36\3\2\2\2\u00ef\u00f0"+
		"\7c\2\2\u00f0\u00f1\7d\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7x\2\2\u00f3"+
		"\u00f4\7g\2\2\u00f4\u00f5\7a\2\2\u00f5\u00f6\7r\2\2\u00f6\u00f7\7t\2\2"+
		"\u00f7\u00f8\7g\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb"+
		"\7o\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7c\2\2\u00fe"+
		"\u00ff\7t\2\2\u00ff\u0100\7{\2\2\u0100\u0101\7a\2\2\u0101\u0102\7u\2\2"+
		"\u0102\u0103\7w\2\2\u0103\u0104\7t\2\2\u0104\u0105\7h\2\2\u0105\u0106"+
		"\7c\2\2\u0106\u0107\7e\2\2\u0107\u0108\7g\2\2\u0108 \3\2\2\2\u0109\u010a"+
		"\7d\2\2\u010a\u010b\7k\2\2\u010b\u010c\7q\2\2\u010c\u010d\7o\2\2\u010d"+
		"\u010e\7g\2\2\u010e\"\3\2\2\2\u010f\u0110\7d\2\2\u0110\u0111\7k\2\2\u0111"+
		"\u0112\7q\2\2\u0112\u0113\7o\2\2\u0113\u0114\7g\2\2\u0114\u0115\7a\2\2"+
		"\u0115\u0116\7k\2\2\u0116\u0117\7u\2\2\u0117$\3\2\2\2\u0118\u0119\7j\2"+
		"\2\u0119\u011a\7q\2\2\u011a\u011b\7n\2\2\u011b\u011c\7g\2\2\u011c&\3\2"+
		"\2\2\u011d\u011e\7p\2\2\u011e\u011f\7q\2\2\u011f\u0120\7k\2\2\u0120\u0121"+
		"\7u\2\2\u0121\u0122\7g\2\2\u0122\u0123\7a\2\2\u0123\u0124\7v\2\2\u0124"+
		"\u0125\7j\2\2\u0125\u0126\7t\2\2\u0126\u0127\7g\2\2\u0127\u0128\7u\2\2"+
		"\u0128\u0129\7j\2\2\u0129\u012a\7q\2\2\u012a\u012b\7n\2\2\u012b\u012c"+
		"\7f\2\2\u012c(\3\2\2\2\u012d\u012e\7o\2\2\u012e\u012f\7k\2\2\u012f\u0130"+
		"\7p\2\2\u0130\u0131\7a\2\2\u0131\u0132\7v\2\2\u0132\u0133\7j\2\2\u0133"+
		"\u0134\7t\2\2\u0134\u0135\7g\2\2\u0135\u0136\7u\2\2\u0136\u0137\7j\2\2"+
		"\u0137\u0138\7q\2\2\u0138\u0139\7n\2\2\u0139\u013a\7f\2\2\u013a*\3\2\2"+
		"\2\u013b\u013c\7o\2\2\u013c\u013d\7c\2\2\u013d\u013e\7z\2\2\u013e\u013f"+
		"\7a\2\2\u013f\u0140\7v\2\2\u0140\u0141\7j\2\2\u0141\u0142\7t\2\2\u0142"+
		"\u0143\7g\2\2\u0143\u0144\7u\2\2\u0144\u0145\7j\2\2\u0145\u0146\7q\2\2"+
		"\u0146\u0147\7n\2\2\u0147\u0148\7f\2\2\u0148,\3\2\2\2\u0149\u014a\7u\2"+
		"\2\u014a\u014b\7v\2\2\u014b\u014c\7q\2\2\u014c\u014d\7p\2\2\u014d\u014e"+
		"\7g\2\2\u014e\u014f\7a\2\2\u014f\u0150\7f\2\2\u0150\u0151\7g\2\2\u0151"+
		"\u0152\7r\2\2\u0152\u0153\7v\2\2\u0153\u0154\7j\2\2\u0154.\3\2\2\2\u0155"+
		"\u0156\7u\2\2\u0156\u0157\7w\2\2\u0157\u0158\7t\2\2\u0158\u0159\7h\2\2"+
		"\u0159\u015a\7c\2\2\u015a\u015b\7e\2\2\u015b\u015c\7g\2\2\u015c\u015d"+
		"\7a\2\2\u015d\u015e\7v\2\2\u015e\u015f\7{\2\2\u015f\u0160\7r\2\2\u0160"+
		"\u0161\7g\2\2\u0161\60\3\2\2\2\u0162\u0163\7q\2\2\u0163\u0164\7h\2\2\u0164"+
		"\u0165\7h\2\2\u0165\u0166\7u\2\2\u0166\u0167\7g\2\2\u0167\u0168\7v\2\2"+
		"\u0168\62\3\2\2\2\u0169\u016a\7c\2\2\u016a\u016b\7f\2\2\u016b\u016c\7"+
		"f\2\2\u016c\u016d\7a\2\2\u016d\u016e\7u\2\2\u016e\u016f\7w\2\2\u016f\u0170"+
		"\7t\2\2\u0170\u0171\7h\2\2\u0171\u0172\7c\2\2\u0172\u0173\7e\2\2\u0173"+
		"\u0174\7g\2\2\u0174\u0175\7a\2\2\u0175\u0176\7f\2\2\u0176\u0177\7g\2\2"+
		"\u0177\u0178\7r\2\2\u0178\u0179\7v\2\2\u0179\u017a\7j\2\2\u017a\64\3\2"+
		"\2\2\u017b\u017c\7u\2\2\u017c\u017d\7g\2\2\u017d\u017e\7e\2\2\u017e\u017f"+
		"\7q\2\2\u017f\u0180\7p\2\2\u0180\u0181\7f\2\2\u0181\u0182\7c\2\2\u0182"+
		"\u0183\7t\2\2\u0183\u0184\7{\2\2\u0184\u0185\7a\2\2\u0185\u0186\7f\2\2"+
		"\u0186\u0187\7g\2\2\u0187\u0188\7r\2\2\u0188\u0189\7v\2\2\u0189\u018a"+
		"\7j\2\2\u018a\u018b\7a\2\2\u018b\u018c\7t\2\2\u018c\u018d\7c\2\2\u018d"+
		"\u018e\7p\2\2\u018e\u018f\7i\2\2\u018f\u0190\7g\2\2\u0190\66\3\2\2\2\u0191"+
		"\u0192\7v\2\2\u0192\u0193\7g\2\2\u0193\u0194\7o\2\2\u0194\u0195\7r\2\2"+
		"\u0195\u0196\7g\2\2\u0196\u0197\7t\2\2\u0197\u0198\7c\2\2\u0198\u0199"+
		"\7v\2\2\u0199\u019a\7w\2\2\u019a\u019b\7t\2\2\u019b\u019c\7g\2\2\u019c"+
		"8\3\2\2\2\u019d\u019e\7x\2\2\u019e\u019f\7g\2\2\u019f\u01a0\7t\2\2\u01a0"+
		"\u01a1\7v\2\2\u01a1\u01a2\7k\2\2\u01a2\u01a3\7e\2\2\u01a3\u01a4\7c\2\2"+
		"\u01a4\u01a5\7n\2\2\u01a5\u01a6\7a\2\2\u01a6\u01a7\7i\2\2\u01a7\u01a8"+
		"\7t\2\2\u01a8\u01a9\7c\2\2\u01a9\u01aa\7f\2\2\u01aa\u01ab\7k\2\2\u01ab"+
		"\u01ac\7g\2\2\u01ac\u01ad\7p\2\2\u01ad\u01ae\7v\2\2\u01ae:\3\2\2\2\u01af"+
		"\u01b0\7t\2\2\u01b0\u01b1\7c\2\2\u01b1\u01b2\7p\2\2\u01b2\u01b3\7f\2\2"+
		"\u01b3\u01b4\7q\2\2\u01b4\u01b5\7o\2\2\u01b5\u01b6\7a\2\2\u01b6\u01b7"+
		"\7p\2\2\u01b7\u01b8\7c\2\2\u01b8\u01b9\7o\2\2\u01b9\u01ba\7g\2\2\u01ba"+
		"<\3\2\2\2\u01bb\u01bc\7v\2\2\u01bc\u01bd\7t\2\2\u01bd\u01be\7w\2\2\u01be"+
		"\u01bf\7g\2\2\u01bf\u01c0\7a\2\2\u01c0\u01c1\7c\2\2\u01c1\u01c2\7v\2\2"+
		"\u01c2\u01c3\7a\2\2\u01c3\u01c4\7c\2\2\u01c4\u01c5\7p\2\2\u01c5\u01c6"+
		"\7f\2\2\u01c6\u01c7\7a\2\2\u01c7\u01c8\7d\2\2\u01c8\u01c9\7g\2\2\u01c9"+
		"\u01ca\7n\2\2\u01ca\u01cb\7q\2\2\u01cb\u01cc\7y\2\2\u01cc>\3\2\2\2\u01cd"+
		"\u01ce\7h\2\2\u01ce\u01cf\7c\2\2\u01cf\u01d0\7n\2\2\u01d0\u01d1\7u\2\2"+
		"\u01d1\u01d2\7g\2\2\u01d2\u01d3\7a\2\2\u01d3\u01d4\7c\2\2\u01d4\u01d5"+
		"\7v\2\2\u01d5\u01d6\7a\2\2\u01d6\u01d7\7c\2\2\u01d7\u01d8\7p\2\2\u01d8"+
		"\u01d9\7f\2\2\u01d9\u01da\7a\2\2\u01da\u01db\7c\2\2\u01db\u01dc\7d\2\2"+
		"\u01dc\u01dd\7q\2\2\u01dd\u01de\7x\2\2\u01de\u01df\7g\2\2\u01df@\3\2\2"+
		"\2\u01e0\u01e1\7c\2\2\u01e1\u01e2\7d\2\2\u01e2\u01e3\7u\2\2\u01e3\u01e4"+
		"\7q\2\2\u01e4\u01e5\7n\2\2\u01e5\u01e6\7w\2\2\u01e6\u01e7\7v\2\2\u01e7"+
		"\u01e8\7g\2\2\u01e8B\3\2\2\2\u01e9\u01ea\7c\2\2\u01ea\u01eb\7d\2\2\u01eb"+
		"\u01ec\7q\2\2\u01ec\u01ed\7x\2\2\u01ed\u01ee\7g\2\2\u01ee\u01ef\7a\2\2"+
		"\u01ef\u01f0\7d\2\2\u01f0\u01f1\7q\2\2\u01f1\u01f2\7v\2\2\u01f2\u01f3"+
		"\7v\2\2\u01f3\u01f4\7q\2\2\u01f4\u01f5\7o\2\2\u01f5D\3\2\2\2\u01f6\u01f7"+
		"\7d\2\2\u01f7\u01f8\7g\2\2\u01f8\u01f9\7n\2\2\u01f9\u01fa\7q\2\2\u01fa"+
		"\u01fb\7y\2\2\u01fb\u01fc\7a\2\2\u01fc\u01fd\7v\2\2\u01fd\u01fe\7q\2\2"+
		"\u01fe\u01ff\7r\2\2\u01ffF\3\2\2\2\u0200\u0201\7y\2\2\u0201\u0202\7c\2"+
		"\2\u0202\u0203\7v\2\2\u0203\u0204\7g\2\2\u0204\u0205\7t\2\2\u0205H\3\2"+
		"\2\2\u0206\u0207\7u\2\2\u0207\u0208\7w\2\2\u0208\u0209\7t\2\2\u0209\u020a"+
		"\7h\2\2\u020a\u020b\7c\2\2\u020b\u020c\7e\2\2\u020c\u020d\7g\2\2\u020d"+
		"\u020e\7a\2\2\u020e\u020f\7f\2\2\u020f\u0210\7g\2\2\u0210\u0211\7r\2\2"+
		"\u0211\u0212\7v\2\2\u0212\u0213\7j\2\2\u0213\u0214\7a\2\2\u0214\u0215"+
		"\7o\2\2\u0215\u0216\7w\2\2\u0216\u0217\7n\2\2\u0217\u0218\7k\2\2\u0218"+
		"\u0219\7v\2\2\u0219\u021a\7r\2\2\u021a\u021b\7n\2\2\u021b\u021c\7k\2\2"+
		"\u021c\u021d\7g\2\2\u021d\u021e\7t\2\2\u021eJ\3\2\2\2\u021f\u0220\7c\2"+
		"\2\u0220\u0221\7f\2\2\u0221\u0222\7f\2\2\u0222\u0223\7a\2\2\u0223\u0224"+
		"\7u\2\2\u0224\u0225\7v\2\2\u0225\u0226\7q\2\2\u0226\u0227\7p\2\2\u0227"+
		"\u0228\7g\2\2\u0228\u0229\7a\2\2\u0229\u022a\7f\2\2\u022a\u022b\7g\2\2"+
		"\u022b\u022c\7r\2\2\u022c\u022d\7v\2\2\u022d\u022e\7j\2\2\u022eL\3\2\2"+
		"\2\u022f\u0230\7u\2\2\u0230\u0231\7g\2\2\u0231\u0232\7s\2\2\u0232\u0233"+
		"\7w\2\2\u0233\u0234\7g\2\2\u0234\u0235\7p\2\2\u0235\u0236\7e\2\2\u0236"+
		"\u0237\7g\2\2\u0237N\3\2\2\2\u0238\u0239\7{\2\2\u0239\u023a\7a\2\2\u023a"+
		"\u023b\7c\2\2\u023b\u023c\7d\2\2\u023c\u023d\7q\2\2\u023d\u023e\7x\2\2"+
		"\u023e\u023f\7g\2\2\u023fP\3\2\2\2\u0240\u0241\7c\2\2\u0241\u0242\7p\2"+
		"\2\u0242\u0243\7e\2\2\u0243\u0244\7j\2\2\u0244\u0245\7q\2\2\u0245\u0246"+
		"\7t\2\2\u0246R\3\2\2\2\u0247\u0248\7k\2\2\u0248\u0249\7h\2\2\u0249T\3"+
		"\2\2\2\u024a\u024b\7g\2\2\u024b\u024c\7n\2\2\u024c\u024d\7u\2\2\u024d"+
		"\u024e\7g\2\2\u024eV\3\2\2\2\u024f\u0251\t\2\2\2\u0250\u024f\3\2\2\2\u0251"+
		"\u0252\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\3\2"+
		"\2\2\u0254\u0255\b,\2\2\u0255X\3\2\2\2\u0256\u0258\7/\2\2\u0257\u0256"+
		"\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025a\3\2\2\2\u0259\u025b\t\3\2\2\u025a"+
		"\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2"+
		"\2\2\u025d\u025e\3\2\2\2\u025e\u0260\7\60\2\2\u025f\u0261\t\3\2\2\u0260"+
		"\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2"+
		"\2\2\u0263Z\3\2\2\2\u0264\u0266\7/\2\2\u0265\u0264\3\2\2\2\u0265\u0266"+
		"\3\2\2\2\u0266\u0268\3\2\2\2\u0267\u0269\t\3\2\2\u0268\u0267\3\2\2\2\u0269"+
		"\u026a\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b\\\3\2\2\2"+
		"\u026c\u026d\7}\2\2\u026d^\3\2\2\2\u026e\u0270\t\4\2\2\u026f\u026e\3\2"+
		"\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272"+
		"\u0274\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u0275\7\177\2\2\u0275`\3\2\2"+
		"\2\u0276\u0277\t\5\2\2\u0277b\3\2\2\2\u0278\u027a\t\2\2\2\u0279\u0278"+
		"\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c"+
		"d\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u027f\7<\2\2\u027ff\3\2\2\2\u0280"+
		"\u0281\7*\2\2\u0281h\3\2\2\2\u0282\u0283\7+\2\2\u0283j\3\2\2\2\u0284\u0285"+
		"\7]\2\2\u0285l\3\2\2\2\u0286\u0287\7_\2\2\u0287n\3\2\2\2\u0288\u0289\7"+
		".\2\2\u0289p\3\2\2\2\u028a\u028b\7\61\2\2\u028b\u028c\7\61\2\2\u028c\u0290"+
		"\3\2\2\2\u028d\u028f\n\5\2\2\u028e\u028d\3\2\2\2\u028f\u0292\3\2\2\2\u0290"+
		"\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0293\3\2\2\2\u0292\u0290\3\2"+
		"\2\2\u0293\u0294\b9\2\2\u0294r\3\2\2\2\u0295\u0296\7#\2\2\u0296t\3\2\2"+
		"\2\u0297\u0298\7$\2\2\u0298v\3\2\2\2\u0299\u029b\t\6\2\2\u029a\u0299\3"+
		"\2\2\2\u029b\u029c\3\2\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d"+
		"x\3\2\2\2\r\2\u0252\u0257\u025c\u0262\u0265\u026a\u0271\u027b\u0290\u029c"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}