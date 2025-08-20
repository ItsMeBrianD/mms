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
		Reference=1, Identifier=2, Whitespace=3, Float=4, BlockStart=5, BlockEnd=6, 
		NewLine=7, Colon=8, DensityFunctionStart=9, Keyword_Noise=10, Keyword_Constant=11, 
		Keyword_XZScale=12, Keyword_YScale=13;
	public static final int
		RULE_statement = 0, RULE_file = 1, RULE_densityStatement = 2, RULE_densitySignature = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"statement", "file", "densityStatement", "densitySignature"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'{'", null, null, "':'", "'density:'", 
			"'noise'", "'constant'", "'xz_scale'", "'y_scale'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Reference", "Identifier", "Whitespace", "Float", "BlockStart", 
			"BlockEnd", "NewLine", "Colon", "DensityFunctionStart", "Keyword_Noise", 
			"Keyword_Constant", "Keyword_XZScale", "Keyword_YScale"
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			densityStatement();
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
		enterRule(_localctx, 2, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Whitespace) | (1L << NewLine) | (1L << DensityFunctionStart))) != 0)) {
				{
				setState(13);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DensityFunctionStart:
					{
					setState(10);
					statement();
					}
					break;
				case NewLine:
					{
					setState(11);
					match(NewLine);
					}
					break;
				case Whitespace:
					{
					setState(12);
					match(Whitespace);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
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
		public DensitySignatureContext densitySignature() {
			return getRuleContext(DensitySignatureContext.class,0);
		}
		public DensityStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_densityStatement; }
	}

	public final DensityStatementContext densityStatement() throws RecognitionException {
		DensityStatementContext _localctx = new DensityStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_densityStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			densitySignature();
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

	public static class DensitySignatureContext extends ParserRuleContext {
		public TerminalNode DensityFunctionStart() { return getToken(MMSParse.DensityFunctionStart, 0); }
		public TerminalNode Identifier() { return getToken(MMSParse.Identifier, 0); }
		public TerminalNode BlockStart() { return getToken(MMSParse.BlockStart, 0); }
		public List<TerminalNode> Whitespace() { return getTokens(MMSParse.Whitespace); }
		public TerminalNode Whitespace(int i) {
			return getToken(MMSParse.Whitespace, i);
		}
		public DensitySignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_densitySignature; }
	}

	public final DensitySignatureContext densitySignature() throws RecognitionException {
		DensitySignatureContext _localctx = new DensitySignatureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_densitySignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(DensityFunctionStart);
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(23);
				match(Whitespace);
				}
				}
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Whitespace );
			setState(28);
			match(Identifier);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(29);
				match(Whitespace);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			match(BlockStart);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17(\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\3\3\3\3\3\7\3\20\n\3\f\3\16\3\23\13\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\6\5\33\n\5\r\5\16\5\34\3\5\3\5\7\5!\n\5\f\5\16\5"+
		"$\13\5\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2\2(\2\n\3\2\2\2\4\21\3\2\2\2\6\26"+
		"\3\2\2\2\b\30\3\2\2\2\n\13\5\6\4\2\13\3\3\2\2\2\f\20\5\2\2\2\r\20\7\t"+
		"\2\2\16\20\7\5\2\2\17\f\3\2\2\2\17\r\3\2\2\2\17\16\3\2\2\2\20\23\3\2\2"+
		"\2\21\17\3\2\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\21\3\2\2\2\24\25\7\2\2"+
		"\3\25\5\3\2\2\2\26\27\5\b\5\2\27\7\3\2\2\2\30\32\7\13\2\2\31\33\7\5\2"+
		"\2\32\31\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\36\3\2\2"+
		"\2\36\"\7\4\2\2\37!\7\5\2\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2"+
		"\2#%\3\2\2\2$\"\3\2\2\2%&\7\7\2\2&\t\3\2\2\2\6\17\21\34\"";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}