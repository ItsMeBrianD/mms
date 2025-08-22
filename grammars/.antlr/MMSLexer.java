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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u01b1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\6\2c\n\2\r\2\16\2d\3\3\6\3h\n"+
		"\3\r\3\16\3i\3\3\3\3\6\3n\n\3\r\3\16\3o\3\3\5\3s\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3!\6!\u016d\n!\r!\16!\u016e\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\7-\u018b\n-\f-\16-\u018e"+
		"\13-\3-\3-\3.\3.\7.\u0194\n.\f.\16.\u0197\13.\3/\3/\3/\3/\7/\u019d\n/"+
		"\f/\16/\u01a0\13/\3/\3/\3\60\3\60\3\60\3\60\7\60\u01a8\n\60\f\60\16\60"+
		"\u01ab\13\60\3\60\3\60\3\60\3\60\3\60\3\u01a9\2\61\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61\3\2\7\3\2\62;\4\2\13\13\"\"\4\2\f\f\17\17\5\2"+
		"C\\aac|\6\2\62;C\\aac|\2\u01b9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\3b\3\2\2\2\5r\3\2\2\2\7t\3\2\2\2\t|\3\2\2\2\13"+
		"\u0081\3\2\2\2\r\u008b\3\2\2\2\17\u0094\3\2\2\2\21\u009a\3\2\2\2\23\u00a4"+
		"\3\2\2\2\25\u00be\3\2\2\2\27\u00c4\3\2\2\2\31\u00c9\3\2\2\2\33\u00cf\3"+
		"\2\2\2\35\u00d5\3\2\2\2\37\u00e1\3\2\2\2!\u00ea\3\2\2\2#\u00f6\3\2\2\2"+
		"%\u0108\3\2\2\2\'\u0114\3\2\2\2)\u011c\3\2\2\2+\u0122\3\2\2\2-\u012a\3"+
		"\2\2\2/\u012e\3\2\2\2\61\u0132\3\2\2\2\63\u0136\3\2\2\2\65\u013f\3\2\2"+
		"\2\67\u014c\3\2\2\29\u0156\3\2\2\2;\u0160\3\2\2\2=\u0163\3\2\2\2?\u0168"+
		"\3\2\2\2A\u016c\3\2\2\2C\u0172\3\2\2\2E\u0174\3\2\2\2G\u0176\3\2\2\2I"+
		"\u0178\3\2\2\2K\u017a\3\2\2\2M\u017c\3\2\2\2O\u017e\3\2\2\2Q\u0180\3\2"+
		"\2\2S\u0182\3\2\2\2U\u0184\3\2\2\2W\u0186\3\2\2\2Y\u0188\3\2\2\2[\u0191"+
		"\3\2\2\2]\u0198\3\2\2\2_\u01a3\3\2\2\2ac\t\2\2\2ba\3\2\2\2cd\3\2\2\2d"+
		"b\3\2\2\2de\3\2\2\2e\4\3\2\2\2fh\t\2\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2"+
		"ij\3\2\2\2jk\3\2\2\2km\7\60\2\2ln\t\2\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2"+
		"\2op\3\2\2\2ps\3\2\2\2qs\5\3\2\2rg\3\2\2\2rq\3\2\2\2s\6\3\2\2\2tu\7u\2"+
		"\2uv\7w\2\2vw\7t\2\2wx\7h\2\2xy\7c\2\2yz\7e\2\2z{\7g\2\2{\b\3\2\2\2|}"+
		"\7t\2\2}~\7w\2\2~\177\7n\2\2\177\u0080\7g\2\2\u0080\n\3\2\2\2\u0081\u0082"+
		"\7e\2\2\u0082\u0083\7q\2\2\u0083\u0084\7p\2\2\u0084\u0085\7f\2\2\u0085"+
		"\u0086\7k\2\2\u0086\u0087\7v\2\2\u0087\u0088\7k\2\2\u0088\u0089\7q\2\2"+
		"\u0089\u008a\7p\2\2\u008a\f\3\2\2\2\u008b\u008c\7u\2\2\u008c\u008d\7g"+
		"\2\2\u008d\u008e\7s\2\2\u008e\u008f\7w\2\2\u008f\u0090\7g\2\2\u0090\u0091"+
		"\7p\2\2\u0091\u0092\7e\2\2\u0092\u0093\7g\2\2\u0093\16\3\2\2\2\u0094\u0095"+
		"\7d\2\2\u0095\u0096\7n\2\2\u0096\u0097\7q\2\2\u0097\u0098\7e\2\2\u0098"+
		"\u0099\7m\2\2\u0099\20\3\2\2\2\u009a\u009b\7d\2\2\u009b\u009c\7c\2\2\u009c"+
		"\u009d\7p\2\2\u009d\u009e\7f\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7c\2\2"+
		"\u00a0\u00a1\7p\2\2\u00a1\u00a2\7f\2\2\u00a2\u00a3\7u\2\2\u00a3\22\3\2"+
		"\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7d\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8"+
		"\7x\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7a\2\2\u00aa\u00ab\7r\2\2\u00ab"+
		"\u00ac\7t\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7k\2\2"+
		"\u00af\u00b0\7o\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3"+
		"\7c\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7{\2\2\u00b5\u00b6\7a\2\2\u00b6"+
		"\u00b7\7u\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7h\2\2"+
		"\u00ba\u00bb\7c\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7g\2\2\u00bd\24\3\2"+
		"\2\2\u00be\u00bf\7d\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2"+
		"\7o\2\2\u00c2\u00c3\7g\2\2\u00c3\26\3\2\2\2\u00c4\u00c5\7j\2\2\u00c5\u00c6"+
		"\7q\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7g\2\2\u00c8\30\3\2\2\2\u00c9\u00ca"+
		"\7p\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7u\2\2\u00cd"+
		"\u00ce\7g\2\2\u00ce\32\3\2\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7v\2\2\u00d1"+
		"\u00d2\7g\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7r\2\2\u00d4\34\3\2\2\2\u00d5"+
		"\u00d6\7u\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7p\2\2"+
		"\u00d9\u00da\7g\2\2\u00da\u00db\7a\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd"+
		"\7g\2\2\u00dd\u00de\7r\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7j\2\2\u00e0"+
		"\36\3\2\2\2\u00e1\u00e2\7h\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7g\2\2\u00e4"+
		"\u00e5\7g\2\2\u00e5\u00e6\7|\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7p\2\2"+
		"\u00e8\u00e9\7i\2\2\u00e9 \3\2\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7g\2"+
		"\2\u00ec\u00ed\7o\2\2\u00ed\u00ee\7r\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0"+
		"\7t\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7w\2\2\u00f3"+
		"\u00f4\7t\2\2\u00f4\u00f5\7g\2\2\u00f5\"\3\2\2\2\u00f6\u00f7\7x\2\2\u00f7"+
		"\u00f8\7g\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7k\2\2"+
		"\u00fb\u00fc\7e\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7n\2\2\u00fe\u00ff"+
		"\7a\2\2\u00ff\u0100\7i\2\2\u0100\u0101\7t\2\2\u0101\u0102\7c\2\2\u0102"+
		"\u0103\7f\2\2\u0103\u0104\7k\2\2\u0104\u0105\7g\2\2\u0105\u0106\7p\2\2"+
		"\u0106\u0107\7v\2\2\u0107$\3\2\2\2\u0108\u0109\7c\2\2\u0109\u010a\7d\2"+
		"\2\u010a\u010b\7q\2\2\u010b\u010c\7x\2\2\u010c\u010d\7g\2\2\u010d\u010e"+
		"\7a\2\2\u010e\u010f\7y\2\2\u010f\u0110\7c\2\2\u0110\u0111\7v\2\2\u0111"+
		"\u0112\7g\2\2\u0112\u0113\7t\2\2\u0113&\3\2\2\2\u0114\u0115\7{\2\2\u0115"+
		"\u0116\7a\2\2\u0116\u0117\7c\2\2\u0117\u0118\7d\2\2\u0118\u0119\7q\2\2"+
		"\u0119\u011a\7x\2\2\u011a\u011b\7g\2\2\u011b(\3\2\2\2\u011c\u011d\7h\2"+
		"\2\u011d\u011e\7n\2\2\u011e\u011f\7q\2\2\u011f\u0120\7q\2\2\u0120\u0121"+
		"\7t\2\2\u0121*\3\2\2\2\u0122\u0123\7e\2\2\u0123\u0124\7g\2\2\u0124\u0125"+
		"\7k\2\2\u0125\u0126\7n\2\2\u0126\u0127\7k\2\2\u0127\u0128\7p\2\2\u0128"+
		"\u0129\7i\2\2\u0129,\3\2\2\2\u012a\u012b\7c\2\2\u012b\u012c\7p\2\2\u012c"+
		"\u012d\7f\2\2\u012d.\3\2\2\2\u012e\u012f\7c\2\2\u012f\u0130\7f\2\2\u0130"+
		"\u0131\7f\2\2\u0131\60\3\2\2\2\u0132\u0133\7u\2\2\u0133\u0134\7w\2\2\u0134"+
		"\u0135\7d\2\2\u0135\62\3\2\2\2\u0136\u0137\7c\2\2\u0137\u0138\7d\2\2\u0138"+
		"\u0139\7u\2\2\u0139\u013a\7q\2\2\u013a\u013b\7n\2\2\u013b\u013c\7w\2\2"+
		"\u013c\u013d\7v\2\2\u013d\u013e\7g\2\2\u013e\64\3\2\2\2\u013f\u0140\7"+
		"c\2\2\u0140\u0141\7d\2\2\u0141\u0142\7q\2\2\u0142\u0143\7x\2\2\u0143\u0144"+
		"\7g\2\2\u0144\u0145\7a\2\2\u0145\u0146\7d\2\2\u0146\u0147\7q\2\2\u0147"+
		"\u0148\7v\2\2\u0148\u0149\7v\2\2\u0149\u014a\7q\2\2\u014a\u014b\7o\2\2"+
		"\u014b\66\3\2\2\2\u014c\u014d\7d\2\2\u014d\u014e\7g\2\2\u014e\u014f\7"+
		"n\2\2\u014f\u0150\7q\2\2\u0150\u0151\7y\2\2\u0151\u0152\7a\2\2\u0152\u0153"+
		"\7v\2\2\u0153\u0154\7q\2\2\u0154\u0155\7r\2\2\u01558\3\2\2\2\u0156\u0157"+
		"\7p\2\2\u0157\u0158\7c\2\2\u0158\u0159\7o\2\2\u0159\u015a\7g\2\2\u015a"+
		"\u015b\7u\2\2\u015b\u015c\7r\2\2\u015c\u015d\7c\2\2\u015d\u015e\7e\2\2"+
		"\u015e\u015f\7g\2\2\u015f:\3\2\2\2\u0160\u0161\7k\2\2\u0161\u0162\7h\2"+
		"\2\u0162<\3\2\2\2\u0163\u0164\7g\2\2\u0164\u0165\7n\2\2\u0165\u0166\7"+
		"u\2\2\u0166\u0167\7g\2\2\u0167>\3\2\2\2\u0168\u0169\7k\2\2\u0169\u016a"+
		"\7p\2\2\u016a@\3\2\2\2\u016b\u016d\t\3\2\2\u016c\u016b\3\2\2\2\u016d\u016e"+
		"\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0171\b!\2\2\u0171B\3\2\2\2\u0172\u0173\t\4\2\2\u0173D\3\2\2\2\u0174"+
		"\u0175\7]\2\2\u0175F\3\2\2\2\u0176\u0177\7_\2\2\u0177H\3\2\2\2\u0178\u0179"+
		"\7}\2\2\u0179J\3\2\2\2\u017a\u017b\7\177\2\2\u017bL\3\2\2\2\u017c\u017d"+
		"\7*\2\2\u017dN\3\2\2\2\u017e\u017f\7+\2\2\u017fP\3\2\2\2\u0180\u0181\7"+
		"#\2\2\u0181R\3\2\2\2\u0182\u0183\7.\2\2\u0183T\3\2\2\2\u0184\u0185\7<"+
		"\2\2\u0185V\3\2\2\2\u0186\u0187\7=\2\2\u0187X\3\2\2\2\u0188\u018c\7$\2"+
		"\2\u0189\u018b\n\4\2\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a"+
		"\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u018c\3\2\2\2\u018f"+
		"\u0190\7$\2\2\u0190Z\3\2\2\2\u0191\u0195\t\5\2\2\u0192\u0194\t\6\2\2\u0193"+
		"\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\\\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7\61\2\2\u0199\u019a"+
		"\7\61\2\2\u019a\u019e\3\2\2\2\u019b\u019d\n\4\2\2\u019c\u019b\3\2\2\2"+
		"\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1"+
		"\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a2\b/\2\2\u01a2^\3\2\2\2\u01a3\u01a4"+
		"\7\61\2\2\u01a4\u01a5\7,\2\2\u01a5\u01a9\3\2\2\2\u01a6\u01a8\13\2\2\2"+
		"\u01a7\u01a6\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01aa\3\2\2\2\u01a9\u01a7"+
		"\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\7,\2\2\u01ad"+
		"\u01ae\7\61\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\b\60\2\2\u01b0`\3\2\2"+
		"\2\f\2dior\u016e\u018c\u0195\u019e\u01a9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}