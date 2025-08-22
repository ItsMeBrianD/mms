// Generated from /Users/brian/code/personal/mms/grammars/MMSLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MMSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Int=1, Float=2, Keyword_Surface=3, Keyword_Rule=4, Keyword_Condition=5, 
		Keyword_Sequence=6, Keyword_Block=7, Keyword_Bandlands=8, Keyword_AbovePreliminarySurface=9, 
		Keyword_Biome=10, Keyword_Hole=11, Keyword_Noise=12, Keyword_Steep=13, 
		Keyword_StoneDepth=14, Keyword_Freezing=15, Keyword_Temperature=16, Keyword_VerticalGradient=17, 
		Keyword_AboveWater=18, Keyword_YAbove=19, Keyword_Floor=20, Keyword_Ceiling=21, 
		Keyword_And=22, Keyword_Add=23, Keyword_Sub=24, Keyword_Absolute=25, Keyword_AboveBottom=26, 
		Keyword_BelowTop=27, Keyword_Namespace=28, Keyword_If=29, Keyword_Else=30, 
		Keyword_In=31, WS=32, NL=33, SquareOpen=34, SquareClose=35, CurlyOpen=36, 
		CurlyClose=37, RoundOpen=38, RoundClose=39, Bang=40, Comma=41, Colon=42, 
		SemiColon=43, String=44, Identifier=45, LineComment=46, BlockComment=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Int", "Float", "Keyword_Surface", "Keyword_Rule", "Keyword_Condition", 
			"Keyword_Sequence", "Keyword_Block", "Keyword_Bandlands", "Keyword_AbovePreliminarySurface", 
			"Keyword_Biome", "Keyword_Hole", "Keyword_Noise", "Keyword_Steep", "Keyword_StoneDepth", 
			"Keyword_Freezing", "Keyword_Temperature", "Keyword_VerticalGradient", 
			"Keyword_AboveWater", "Keyword_YAbove", "Keyword_Floor", "Keyword_Ceiling", 
			"Keyword_And", "Keyword_Add", "Keyword_Sub", "Keyword_Absolute", "Keyword_AboveBottom", 
			"Keyword_BelowTop", "Keyword_Namespace", "Keyword_If", "Keyword_Else", 
			"Keyword_In", "WS", "NL", "SquareOpen", "SquareClose", "CurlyOpen", "CurlyClose", 
			"RoundOpen", "RoundClose", "Bang", "Comma", "Colon", "SemiColon", "String", 
			"Identifier", "LineComment", "BlockComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'surface'", "'rule'", "'condition'", "'sequence'", 
			"'block'", "'bandlands'", "'above_preliminary_surface'", "'biome'", "'hole'", 
			"'noise'", "'steep'", "'stone_depth'", "'freezing'", "'temperature'", 
			"'vertical_gradient'", "'above_water'", "'y_above'", "'floor'", "'ceiling'", 
			"'and'", "'add'", "'sub'", "'absolute'", "'above_bottom'", "'below_top'", 
			"'namespace'", "'if'", "'else'", "'in'", null, null, "'['", "']'", "'{'", 
			"'}'", "'('", "')'", "'!'", "','", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Int", "Float", "Keyword_Surface", "Keyword_Rule", "Keyword_Condition", 
			"Keyword_Sequence", "Keyword_Block", "Keyword_Bandlands", "Keyword_AbovePreliminarySurface", 
			"Keyword_Biome", "Keyword_Hole", "Keyword_Noise", "Keyword_Steep", "Keyword_StoneDepth", 
			"Keyword_Freezing", "Keyword_Temperature", "Keyword_VerticalGradient", 
			"Keyword_AboveWater", "Keyword_YAbove", "Keyword_Floor", "Keyword_Ceiling", 
			"Keyword_And", "Keyword_Add", "Keyword_Sub", "Keyword_Absolute", "Keyword_AboveBottom", 
			"Keyword_BelowTop", "Keyword_Namespace", "Keyword_If", "Keyword_Else", 
			"Keyword_In", "WS", "NL", "SquareOpen", "SquareClose", "CurlyOpen", "CurlyClose", 
			"RoundOpen", "RoundClose", "Bang", "Comma", "Colon", "SemiColon", "String", 
			"Identifier", "LineComment", "BlockComment"
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


	public MMSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MMSLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u01b7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\5\2c\n\2\3\2\6\2f\n\2\r\2\16\2"+
		"g\3\3\5\3k\n\3\3\3\6\3n\n\3\r\3\16\3o\3\3\3\3\6\3t\n\3\r\3\16\3u\3\3\5"+
		"\3y\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\6!\u0173\n!\r!\16!\u0174\3!\3!\3\""+
		"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-"+
		"\3-\7-\u0191\n-\f-\16-\u0194\13-\3-\3-\3.\3.\7.\u019a\n.\f.\16.\u019d"+
		"\13.\3/\3/\3/\3/\7/\u01a3\n/\f/\16/\u01a6\13/\3/\3/\3\60\3\60\3\60\3\60"+
		"\7\60\u01ae\n\60\f\60\16\60\u01b1\13\60\3\60\3\60\3\60\3\60\3\60\3\u01af"+
		"\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\7\3\2\62;\4\2\13\13"+
		"\"\"\4\2\f\f\17\17\5\2C\\aac|\6\2\62;C\\aac|\2\u01c1\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3b\3\2\2\2\5x\3\2\2\2\7"+
		"z\3\2\2\2\t\u0082\3\2\2\2\13\u0087\3\2\2\2\r\u0091\3\2\2\2\17\u009a\3"+
		"\2\2\2\21\u00a0\3\2\2\2\23\u00aa\3\2\2\2\25\u00c4\3\2\2\2\27\u00ca\3\2"+
		"\2\2\31\u00cf\3\2\2\2\33\u00d5\3\2\2\2\35\u00db\3\2\2\2\37\u00e7\3\2\2"+
		"\2!\u00f0\3\2\2\2#\u00fc\3\2\2\2%\u010e\3\2\2\2\'\u011a\3\2\2\2)\u0122"+
		"\3\2\2\2+\u0128\3\2\2\2-\u0130\3\2\2\2/\u0134\3\2\2\2\61\u0138\3\2\2\2"+
		"\63\u013c\3\2\2\2\65\u0145\3\2\2\2\67\u0152\3\2\2\29\u015c\3\2\2\2;\u0166"+
		"\3\2\2\2=\u0169\3\2\2\2?\u016e\3\2\2\2A\u0172\3\2\2\2C\u0178\3\2\2\2E"+
		"\u017a\3\2\2\2G\u017c\3\2\2\2I\u017e\3\2\2\2K\u0180\3\2\2\2M\u0182\3\2"+
		"\2\2O\u0184\3\2\2\2Q\u0186\3\2\2\2S\u0188\3\2\2\2U\u018a\3\2\2\2W\u018c"+
		"\3\2\2\2Y\u018e\3\2\2\2[\u0197\3\2\2\2]\u019e\3\2\2\2_\u01a9\3\2\2\2a"+
		"c\7/\2\2ba\3\2\2\2bc\3\2\2\2ce\3\2\2\2df\t\2\2\2ed\3\2\2\2fg\3\2\2\2g"+
		"e\3\2\2\2gh\3\2\2\2h\4\3\2\2\2ik\7/\2\2ji\3\2\2\2jk\3\2\2\2km\3\2\2\2"+
		"ln\t\2\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qs\7\60\2"+
		"\2rt\t\2\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vy\3\2\2\2wy\5\3\2"+
		"\2xj\3\2\2\2xw\3\2\2\2y\6\3\2\2\2z{\7u\2\2{|\7w\2\2|}\7t\2\2}~\7h\2\2"+
		"~\177\7c\2\2\177\u0080\7e\2\2\u0080\u0081\7g\2\2\u0081\b\3\2\2\2\u0082"+
		"\u0083\7t\2\2\u0083\u0084\7w\2\2\u0084\u0085\7n\2\2\u0085\u0086\7g\2\2"+
		"\u0086\n\3\2\2\2\u0087\u0088\7e\2\2\u0088\u0089\7q\2\2\u0089\u008a\7p"+
		"\2\2\u008a\u008b\7f\2\2\u008b\u008c\7k\2\2\u008c\u008d\7v\2\2\u008d\u008e"+
		"\7k\2\2\u008e\u008f\7q\2\2\u008f\u0090\7p\2\2\u0090\f\3\2\2\2\u0091\u0092"+
		"\7u\2\2\u0092\u0093\7g\2\2\u0093\u0094\7s\2\2\u0094\u0095\7w\2\2\u0095"+
		"\u0096\7g\2\2\u0096\u0097\7p\2\2\u0097\u0098\7e\2\2\u0098\u0099\7g\2\2"+
		"\u0099\16\3\2\2\2\u009a\u009b\7d\2\2\u009b\u009c\7n\2\2\u009c\u009d\7"+
		"q\2\2\u009d\u009e\7e\2\2\u009e\u009f\7m\2\2\u009f\20\3\2\2\2\u00a0\u00a1"+
		"\7d\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7f\2\2\u00a4"+
		"\u00a5\7n\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7f\2\2"+
		"\u00a8\u00a9\7u\2\2\u00a9\22\3\2\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7"+
		"d\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7x\2\2\u00ae\u00af\7g\2\2\u00af\u00b0"+
		"\7a\2\2\u00b0\u00b1\7r\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7g\2\2\u00b3"+
		"\u00b4\7n\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7o\2\2\u00b6\u00b7\7k\2\2"+
		"\u00b7\u00b8\7p\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb"+
		"\7{\2\2\u00bb\u00bc\7a\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7w\2\2\u00be"+
		"\u00bf\7t\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7e\2\2"+
		"\u00c2\u00c3\7g\2\2\u00c3\24\3\2\2\2\u00c4\u00c5\7d\2\2\u00c5\u00c6\7"+
		"k\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7o\2\2\u00c8\u00c9\7g\2\2\u00c9\26"+
		"\3\2\2\2\u00ca\u00cb\7j\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7n\2\2\u00cd"+
		"\u00ce\7g\2\2\u00ce\30\3\2\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7q\2\2\u00d1"+
		"\u00d2\7k\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7g\2\2\u00d4\32\3\2\2\2\u00d5"+
		"\u00d6\7u\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7g\2\2"+
		"\u00d9\u00da\7r\2\2\u00da\34\3\2\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7"+
		"v\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1"+
		"\7a\2\2\u00e1\u00e2\7f\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7r\2\2\u00e4"+
		"\u00e5\7v\2\2\u00e5\u00e6\7j\2\2\u00e6\36\3\2\2\2\u00e7\u00e8\7h\2\2\u00e8"+
		"\u00e9\7t\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7|\2\2"+
		"\u00ec\u00ed\7k\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7i\2\2\u00ef \3\2\2"+
		"\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7o\2\2\u00f3\u00f4"+
		"\7r\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7c\2\2\u00f7"+
		"\u00f8\7v\2\2\u00f8\u00f9\7w\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7g\2\2"+
		"\u00fb\"\3\2\2\2\u00fc\u00fd\7x\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7t"+
		"\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7k\2\2\u0101\u0102\7e\2\2\u0102\u0103"+
		"\7c\2\2\u0103\u0104\7n\2\2\u0104\u0105\7a\2\2\u0105\u0106\7i\2\2\u0106"+
		"\u0107\7t\2\2\u0107\u0108\7c\2\2\u0108\u0109\7f\2\2\u0109\u010a\7k\2\2"+
		"\u010a\u010b\7g\2\2\u010b\u010c\7p\2\2\u010c\u010d\7v\2\2\u010d$\3\2\2"+
		"\2\u010e\u010f\7c\2\2\u010f\u0110\7d\2\2\u0110\u0111\7q\2\2\u0111\u0112"+
		"\7x\2\2\u0112\u0113\7g\2\2\u0113\u0114\7a\2\2\u0114\u0115\7y\2\2\u0115"+
		"\u0116\7c\2\2\u0116\u0117\7v\2\2\u0117\u0118\7g\2\2\u0118\u0119\7t\2\2"+
		"\u0119&\3\2\2\2\u011a\u011b\7{\2\2\u011b\u011c\7a\2\2\u011c\u011d\7c\2"+
		"\2\u011d\u011e\7d\2\2\u011e\u011f\7q\2\2\u011f\u0120\7x\2\2\u0120\u0121"+
		"\7g\2\2\u0121(\3\2\2\2\u0122\u0123\7h\2\2\u0123\u0124\7n\2\2\u0124\u0125"+
		"\7q\2\2\u0125\u0126\7q\2\2\u0126\u0127\7t\2\2\u0127*\3\2\2\2\u0128\u0129"+
		"\7e\2\2\u0129\u012a\7g\2\2\u012a\u012b\7k\2\2\u012b\u012c\7n\2\2\u012c"+
		"\u012d\7k\2\2\u012d\u012e\7p\2\2\u012e\u012f\7i\2\2\u012f,\3\2\2\2\u0130"+
		"\u0131\7c\2\2\u0131\u0132\7p\2\2\u0132\u0133\7f\2\2\u0133.\3\2\2\2\u0134"+
		"\u0135\7c\2\2\u0135\u0136\7f\2\2\u0136\u0137\7f\2\2\u0137\60\3\2\2\2\u0138"+
		"\u0139\7u\2\2\u0139\u013a\7w\2\2\u013a\u013b\7d\2\2\u013b\62\3\2\2\2\u013c"+
		"\u013d\7c\2\2\u013d\u013e\7d\2\2\u013e\u013f\7u\2\2\u013f\u0140\7q\2\2"+
		"\u0140\u0141\7n\2\2\u0141\u0142\7w\2\2\u0142\u0143\7v\2\2\u0143\u0144"+
		"\7g\2\2\u0144\64\3\2\2\2\u0145\u0146\7c\2\2\u0146\u0147\7d\2\2\u0147\u0148"+
		"\7q\2\2\u0148\u0149\7x\2\2\u0149\u014a\7g\2\2\u014a\u014b\7a\2\2\u014b"+
		"\u014c\7d\2\2\u014c\u014d\7q\2\2\u014d\u014e\7v\2\2\u014e\u014f\7v\2\2"+
		"\u014f\u0150\7q\2\2\u0150\u0151\7o\2\2\u0151\66\3\2\2\2\u0152\u0153\7"+
		"d\2\2\u0153\u0154\7g\2\2\u0154\u0155\7n\2\2\u0155\u0156\7q\2\2\u0156\u0157"+
		"\7y\2\2\u0157\u0158\7a\2\2\u0158\u0159\7v\2\2\u0159\u015a\7q\2\2\u015a"+
		"\u015b\7r\2\2\u015b8\3\2\2\2\u015c\u015d\7p\2\2\u015d\u015e\7c\2\2\u015e"+
		"\u015f\7o\2\2\u015f\u0160\7g\2\2\u0160\u0161\7u\2\2\u0161\u0162\7r\2\2"+
		"\u0162\u0163\7c\2\2\u0163\u0164\7e\2\2\u0164\u0165\7g\2\2\u0165:\3\2\2"+
		"\2\u0166\u0167\7k\2\2\u0167\u0168\7h\2\2\u0168<\3\2\2\2\u0169\u016a\7"+
		"g\2\2\u016a\u016b\7n\2\2\u016b\u016c\7u\2\2\u016c\u016d\7g\2\2\u016d>"+
		"\3\2\2\2\u016e\u016f\7k\2\2\u016f\u0170\7p\2\2\u0170@\3\2\2\2\u0171\u0173"+
		"\t\3\2\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0172\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\b!\2\2\u0177B\3\2\2\2\u0178"+
		"\u0179\t\4\2\2\u0179D\3\2\2\2\u017a\u017b\7]\2\2\u017bF\3\2\2\2\u017c"+
		"\u017d\7_\2\2\u017dH\3\2\2\2\u017e\u017f\7}\2\2\u017fJ\3\2\2\2\u0180\u0181"+
		"\7\177\2\2\u0181L\3\2\2\2\u0182\u0183\7*\2\2\u0183N\3\2\2\2\u0184\u0185"+
		"\7+\2\2\u0185P\3\2\2\2\u0186\u0187\7#\2\2\u0187R\3\2\2\2\u0188\u0189\7"+
		".\2\2\u0189T\3\2\2\2\u018a\u018b\7<\2\2\u018bV\3\2\2\2\u018c\u018d\7="+
		"\2\2\u018dX\3\2\2\2\u018e\u0192\7$\2\2\u018f\u0191\n\4\2\2\u0190\u018f"+
		"\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0196\7$\2\2\u0196Z\3\2\2\2\u0197"+
		"\u019b\t\5\2\2\u0198\u019a\t\6\2\2\u0199\u0198\3\2\2\2\u019a\u019d\3\2"+
		"\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\\\3\2\2\2\u019d\u019b"+
		"\3\2\2\2\u019e\u019f\7\61\2\2\u019f\u01a0\7\61\2\2\u01a0\u01a4\3\2\2\2"+
		"\u01a1\u01a3\n\4\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2"+
		"\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7"+
		"\u01a8\b/\2\2\u01a8^\3\2\2\2\u01a9\u01aa\7\61\2\2\u01aa\u01ab\7,\2\2\u01ab"+
		"\u01af\3\2\2\2\u01ac\u01ae\13\2\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01b1\3"+
		"\2\2\2\u01af\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1"+
		"\u01af\3\2\2\2\u01b2\u01b3\7,\2\2\u01b3\u01b4\7\61\2\2\u01b4\u01b5\3\2"+
		"\2\2\u01b5\u01b6\b\60\2\2\u01b6`\3\2\2\2\16\2bgjoux\u0174\u0192\u019b"+
		"\u01a4\u01af\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}