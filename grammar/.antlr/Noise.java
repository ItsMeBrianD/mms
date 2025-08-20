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
		Whitespace=9, Float=10, Integer=11, BlockStart=12, BlockEnd=13, NewLine=14, 
		Colon=15, SquareOpen=16, SquareClose=17, Comma=18, Comment=19, Identifier=20;
	public static final int
		RULE_noiseFirstOctaveLine = 0, RULE_noiseAmplitudes = 1, RULE_noiseStatement = 2, 
		RULE_reference = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"noiseFirstOctaveLine", "noiseAmplitudes", "noiseStatement", "reference"
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
			setState(8);
			match(Keyword_FirstOctave);
			setState(9);
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
			setState(11);
			match(Keyword_Amplitudes);
			setState(12);
			match(SquareOpen);
			setState(13);
			_la = _input.LA(1);
			if ( !(_la==Float || _la==Integer) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(14);
				match(Comma);
				setState(15);
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
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(21);
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
			setState(23);
			match(Keyword_Noise);
			setState(24);
			match(Identifier);
			setState(25);
			match(BlockStart);
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
			setState(32);
			noiseFirstOctaveLine();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(33);
				match(NewLine);
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			noiseAmplitudes();
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(40);
				match(NewLine);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
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
			setState(48);
			match(Identifier);
			setState(49);
			match(Colon);
			setState(50);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\67\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3\23\n\3\f\3\16"+
		"\3\26\13\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\36\n\4\f\4\16\4!\13\4\3\4\3\4\7"+
		"\4%\n\4\f\4\16\4(\13\4\3\4\3\4\7\4,\n\4\f\4\16\4/\13\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\2\2\6\2\4\6\b\2\3\3\2\f\r\2\66\2\n\3\2\2\2\4\r\3\2\2\2\6"+
		"\31\3\2\2\2\b\62\3\2\2\2\n\13\7\b\2\2\13\f\7\r\2\2\f\3\3\2\2\2\r\16\7"+
		"\t\2\2\16\17\7\22\2\2\17\24\t\2\2\2\20\21\7\24\2\2\21\23\t\2\2\2\22\20"+
		"\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\27\3\2\2\2\26\24"+
		"\3\2\2\2\27\30\7\23\2\2\30\5\3\2\2\2\31\32\7\4\2\2\32\33\7\26\2\2\33\37"+
		"\7\16\2\2\34\36\7\20\2\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3"+
		"\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"&\5\2\2\2#%\7\20\2\2$#\3\2\2\2%(\3\2\2"+
		"\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2\2)-\5\4\3\2*,\7\20\2\2+*\3"+
		"\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\7\17"+
		"\2\2\61\7\3\2\2\2\62\63\7\26\2\2\63\64\7\21\2\2\64\65\7\26\2\2\65\t\3"+
		"\2\2\2\6\24\37&-";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}