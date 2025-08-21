// Generated from /Users/brian/code/personal/mms/grammars/MMSParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MMSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Keyword_Surface=1, Keyword_Rule=2, Keyword_Condition=3, Keyword_Sequence=4, 
		Keyword_Block=5, Keyword_Bandlands=6, Keyword_AbovePreliminarySurface=7, 
		Keyword_Biome=8, Keyword_Hole=9, Keyword_Steep=10, Keyword_StoneDepth=11, 
		Keyword_Freezing=12, Keyword_Temperature=13, Keyword_VerticalGradient=14, 
		Keyword_AboveWater=15, Keyword_YAbove=16, Keyword_Namespace=17, Keyword_If=18, 
		Keyword_Else=19, Keyword_In=20, WS=21, NL=22, SquareOpen=23, SquareClose=24, 
		CurlyOpen=25, CurlyClose=26, RoundOpen=27, RoundClose=28, Bang=29, Colon=30, 
		SemiColon=31, Identifier=32;
	public static final int
		RULE_namespaceDeclaration = 0, RULE_statement = 1, RULE_mmsFile = 2, RULE_surfaceDeclaration = 3, 
		RULE_surfaceInline = 4, RULE_surfaceDefinition = 5, RULE_surfaceRuleReference = 6, 
		RULE_surfaceRuleDeclaration = 7, RULE_surfaceRule = 8, RULE_surfaceRule_Conditional = 9, 
		RULE_surfaceRule_Block = 10, RULE_surfaceRule_Sequence = 11, RULE_reference = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"namespaceDeclaration", "statement", "mmsFile", "surfaceDeclaration", 
			"surfaceInline", "surfaceDefinition", "surfaceRuleReference", "surfaceRuleDeclaration", 
			"surfaceRule", "surfaceRule_Conditional", "surfaceRule_Block", "surfaceRule_Sequence", 
			"reference"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'surface'", "'rule'", "'condition'", "'sequence'", "'block'", 
			"'bandlands'", "'above_preliminary_surface'", "'biome'", "'hole'", "'steep'", 
			"'stone_depth'", "'freezing'", "'temperature'", "'vertical_gradient'", 
			"'above_water'", "'y_above'", "'namespace'", "'if'", "'else'", "'in'", 
			null, null, "'['", "']'", "'{'", "'}'", "'('", "')'", "'!'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Keyword_Surface", "Keyword_Rule", "Keyword_Condition", "Keyword_Sequence", 
			"Keyword_Block", "Keyword_Bandlands", "Keyword_AbovePreliminarySurface", 
			"Keyword_Biome", "Keyword_Hole", "Keyword_Steep", "Keyword_StoneDepth", 
			"Keyword_Freezing", "Keyword_Temperature", "Keyword_VerticalGradient", 
			"Keyword_AboveWater", "Keyword_YAbove", "Keyword_Namespace", "Keyword_If", 
			"Keyword_Else", "Keyword_In", "WS", "NL", "SquareOpen", "SquareClose", 
			"CurlyOpen", "CurlyClose", "RoundOpen", "RoundClose", "Bang", "Colon", 
			"SemiColon", "Identifier"
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
	public String getGrammarFileName() { return "MMSParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MMSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class NamespaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Keyword_Namespace() { return getToken(MMSParser.Keyword_Namespace, 0); }
		public TerminalNode Identifier() { return getToken(MMSParser.Identifier, 0); }
		public TerminalNode SemiColon() { return getToken(MMSParser.SemiColon, 0); }
		public NamespaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDeclaration; }
	}

	public final NamespaceDeclarationContext namespaceDeclaration() throws RecognitionException {
		NamespaceDeclarationContext _localctx = new NamespaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_namespaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(Keyword_Namespace);
			setState(27);
			match(Identifier);
			setState(28);
			match(SemiColon);
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

	public static class StatementContext extends ParserRuleContext {
		public SurfaceDeclarationContext surfaceDeclaration() {
			return getRuleContext(SurfaceDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			surfaceDeclaration();
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

	public static class MmsFileContext extends ParserRuleContext {
		public NamespaceDeclarationContext namespaceDeclaration() {
			return getRuleContext(NamespaceDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MMSParser.EOF, 0); }
		public List<TerminalNode> NL() { return getTokens(MMSParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(MMSParser.NL, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MmsFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mmsFile; }
	}

	public final MmsFileContext mmsFile() throws RecognitionException {
		MmsFileContext _localctx = new MmsFileContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mmsFile);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(32);
				match(NL);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			namespaceDeclaration();
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(39);
					match(NL);
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(45);
					statement();
					setState(47); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(46);
							match(NL);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(49); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Keyword_Surface) {
				{
				setState(56);
				statement();
				}
			}

			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(59);
				match(NL);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
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

	public static class SurfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Keyword_Surface() { return getToken(MMSParser.Keyword_Surface, 0); }
		public TerminalNode Identifier() { return getToken(MMSParser.Identifier, 0); }
		public SurfaceDefinitionContext surfaceDefinition() {
			return getRuleContext(SurfaceDefinitionContext.class,0);
		}
		public SurfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceDeclaration; }
	}

	public final SurfaceDeclarationContext surfaceDeclaration() throws RecognitionException {
		SurfaceDeclarationContext _localctx = new SurfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_surfaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(Keyword_Surface);
			setState(68);
			match(Identifier);
			setState(69);
			surfaceDefinition();
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

	public static class SurfaceInlineContext extends ParserRuleContext {
		public TerminalNode Keyword_Surface() { return getToken(MMSParser.Keyword_Surface, 0); }
		public SurfaceDefinitionContext surfaceDefinition() {
			return getRuleContext(SurfaceDefinitionContext.class,0);
		}
		public SurfaceInlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceInline; }
	}

	public final SurfaceInlineContext surfaceInline() throws RecognitionException {
		SurfaceInlineContext _localctx = new SurfaceInlineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_surfaceInline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(Keyword_Surface);
			setState(72);
			surfaceDefinition();
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

	public static class SurfaceDefinitionContext extends ParserRuleContext {
		public TerminalNode CurlyOpen() { return getToken(MMSParser.CurlyOpen, 0); }
		public TerminalNode CurlyClose() { return getToken(MMSParser.CurlyClose, 0); }
		public List<TerminalNode> NL() { return getTokens(MMSParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(MMSParser.NL, i);
		}
		public List<SurfaceRuleDeclarationContext> surfaceRuleDeclaration() {
			return getRuleContexts(SurfaceRuleDeclarationContext.class);
		}
		public SurfaceRuleDeclarationContext surfaceRuleDeclaration(int i) {
			return getRuleContext(SurfaceRuleDeclarationContext.class,i);
		}
		public SurfaceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceDefinition; }
	}

	public final SurfaceDefinitionContext surfaceDefinition() throws RecognitionException {
		SurfaceDefinitionContext _localctx = new SurfaceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_surfaceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(CurlyOpen);
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75);
				match(NL);
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NL );
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Keyword_Rule) {
				{
				{
				setState(80);
				surfaceRuleDeclaration();
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(81);
					match(NL);
					}
					}
					setState(84); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL );
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(CurlyClose);
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
		public TerminalNode Keyword_Rule() { return getToken(MMSParser.Keyword_Rule, 0); }
		public TerminalNode RoundOpen() { return getToken(MMSParser.RoundOpen, 0); }
		public TerminalNode Identifier() { return getToken(MMSParser.Identifier, 0); }
		public TerminalNode RoundClose() { return getToken(MMSParser.RoundClose, 0); }
		public SurfaceRuleReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRuleReference; }
	}

	public final SurfaceRuleReferenceContext surfaceRuleReference() throws RecognitionException {
		SurfaceRuleReferenceContext _localctx = new SurfaceRuleReferenceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_surfaceRuleReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(Keyword_Rule);
			setState(94);
			match(RoundOpen);
			setState(95);
			match(Identifier);
			setState(96);
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

	public static class SurfaceRuleDeclarationContext extends ParserRuleContext {
		public TerminalNode Keyword_Rule() { return getToken(MMSParser.Keyword_Rule, 0); }
		public TerminalNode Identifier() { return getToken(MMSParser.Identifier, 0); }
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
		enterRule(_localctx, 14, RULE_surfaceRuleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(Keyword_Rule);
			setState(99);
			match(Identifier);
			setState(100);
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

	public static class SurfaceRuleContext extends ParserRuleContext {
		public SurfaceRule_ConditionalContext surfaceRule_Conditional() {
			return getRuleContext(SurfaceRule_ConditionalContext.class,0);
		}
		public SurfaceRule_BlockContext surfaceRule_Block() {
			return getRuleContext(SurfaceRule_BlockContext.class,0);
		}
		public SurfaceRule_SequenceContext surfaceRule_Sequence() {
			return getRuleContext(SurfaceRule_SequenceContext.class,0);
		}
		public SurfaceRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRule; }
	}

	public final SurfaceRuleContext surfaceRule() throws RecognitionException {
		SurfaceRuleContext _localctx = new SurfaceRuleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_surfaceRule);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Keyword_If:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				surfaceRule_Conditional();
				}
				break;
			case Keyword_Block:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				surfaceRule_Block();
				}
				break;
			case Keyword_Sequence:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				surfaceRule_Sequence();
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

	public static class SurfaceRule_ConditionalContext extends ParserRuleContext {
		public TerminalNode Keyword_If() { return getToken(MMSParser.Keyword_If, 0); }
		public TerminalNode SquareOpen() { return getToken(MMSParser.SquareOpen, 0); }
		public TerminalNode SquareClose() { return getToken(MMSParser.SquareClose, 0); }
		public SurfaceRule_ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRule_Conditional; }
	}

	public final SurfaceRule_ConditionalContext surfaceRule_Conditional() throws RecognitionException {
		SurfaceRule_ConditionalContext _localctx = new SurfaceRule_ConditionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_surfaceRule_Conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(Keyword_If);
			setState(108);
			match(SquareOpen);
			setState(109);
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

	public static class SurfaceRule_BlockContext extends ParserRuleContext {
		public TerminalNode Keyword_Block() { return getToken(MMSParser.Keyword_Block, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public SurfaceRule_BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRule_Block; }
	}

	public final SurfaceRule_BlockContext surfaceRule_Block() throws RecognitionException {
		SurfaceRule_BlockContext _localctx = new SurfaceRule_BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_surfaceRule_Block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(Keyword_Block);
			setState(112);
			reference();
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

	public static class SurfaceRule_SequenceContext extends ParserRuleContext {
		public TerminalNode Keyword_Sequence() { return getToken(MMSParser.Keyword_Sequence, 0); }
		public TerminalNode SquareOpen() { return getToken(MMSParser.SquareOpen, 0); }
		public TerminalNode SquareClose() { return getToken(MMSParser.SquareClose, 0); }
		public List<TerminalNode> NL() { return getTokens(MMSParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(MMSParser.NL, i);
		}
		public List<SurfaceRuleContext> surfaceRule() {
			return getRuleContexts(SurfaceRuleContext.class);
		}
		public SurfaceRuleContext surfaceRule(int i) {
			return getRuleContext(SurfaceRuleContext.class,i);
		}
		public List<SurfaceRuleReferenceContext> surfaceRuleReference() {
			return getRuleContexts(SurfaceRuleReferenceContext.class);
		}
		public SurfaceRuleReferenceContext surfaceRuleReference(int i) {
			return getRuleContext(SurfaceRuleReferenceContext.class,i);
		}
		public SurfaceRule_SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRule_Sequence; }
	}

	public final SurfaceRule_SequenceContext surfaceRule_Sequence() throws RecognitionException {
		SurfaceRule_SequenceContext _localctx = new SurfaceRule_SequenceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_surfaceRule_Sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(Keyword_Sequence);
			setState(115);
			match(SquareOpen);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(116);
				match(NL);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Keyword_Rule) | (1L << Keyword_Sequence) | (1L << Keyword_Block) | (1L << Keyword_If))) != 0)) {
				{
				{
				setState(124);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Keyword_Sequence:
				case Keyword_Block:
				case Keyword_If:
					{
					setState(122);
					surfaceRule();
					}
					break;
				case Keyword_Rule:
					{
					setState(123);
					surfaceRuleReference();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(126);
					match(NL);
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
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

	public static class ReferenceContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(MMSParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MMSParser.Identifier, i);
		}
		public TerminalNode Colon() { return getToken(MMSParser.Colon, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(Identifier);
			setState(140);
			match(Colon);
			setState(141);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u0092\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\3\3\3\3\4\7\4$\n\4\f\4"+
		"\16\4\'\13\4\3\4\3\4\7\4+\n\4\f\4\16\4.\13\4\3\4\3\4\6\4\62\n\4\r\4\16"+
		"\4\63\7\4\66\n\4\f\4\16\49\13\4\3\4\5\4<\n\4\3\4\7\4?\n\4\f\4\16\4B\13"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\6\7O\n\7\r\7\16\7P\3\7"+
		"\3\7\6\7U\n\7\r\7\16\7V\7\7Y\n\7\f\7\16\7\\\13\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5\nl\n\n\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\7\rx\n\r\f\r\16\r{\13\r\3\r\3\r\5\r\177\n\r\3\r\7\r"+
		"\u0082\n\r\f\r\16\r\u0085\13\r\7\r\u0087\n\r\f\r\16\r\u008a\13\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2"+
		"\2\2\u0093\2\34\3\2\2\2\4 \3\2\2\2\6%\3\2\2\2\bE\3\2\2\2\nI\3\2\2\2\f"+
		"L\3\2\2\2\16_\3\2\2\2\20d\3\2\2\2\22k\3\2\2\2\24m\3\2\2\2\26q\3\2\2\2"+
		"\30t\3\2\2\2\32\u008d\3\2\2\2\34\35\7\23\2\2\35\36\7\"\2\2\36\37\7!\2"+
		"\2\37\3\3\2\2\2 !\5\b\5\2!\5\3\2\2\2\"$\7\30\2\2#\"\3\2\2\2$\'\3\2\2\2"+
		"%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2(,\5\2\2\2)+\7\30\2\2*)\3\2\2"+
		"\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\67\3\2\2\2.,\3\2\2\2/\61\5\4\3\2\60"+
		"\62\7\30\2\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64"+
		"\66\3\2\2\2\65/\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28;\3\2\2"+
		"\29\67\3\2\2\2:<\5\4\3\2;:\3\2\2\2;<\3\2\2\2<@\3\2\2\2=?\7\30\2\2>=\3"+
		"\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7\2\2\3D\7"+
		"\3\2\2\2EF\7\3\2\2FG\7\"\2\2GH\5\f\7\2H\t\3\2\2\2IJ\7\3\2\2JK\5\f\7\2"+
		"K\13\3\2\2\2LN\7\33\2\2MO\7\30\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2"+
		"\2\2QZ\3\2\2\2RT\5\20\t\2SU\7\30\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3"+
		"\2\2\2WY\3\2\2\2XR\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\"+
		"Z\3\2\2\2]^\7\34\2\2^\r\3\2\2\2_`\7\4\2\2`a\7\35\2\2ab\7\"\2\2bc\7\36"+
		"\2\2c\17\3\2\2\2de\7\4\2\2ef\7\"\2\2fg\5\22\n\2g\21\3\2\2\2hl\5\24\13"+
		"\2il\5\26\f\2jl\5\30\r\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\23\3\2\2\2mn\7"+
		"\24\2\2no\7\31\2\2op\7\32\2\2p\25\3\2\2\2qr\7\7\2\2rs\5\32\16\2s\27\3"+
		"\2\2\2tu\7\6\2\2uy\7\31\2\2vx\7\30\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2y"+
		"z\3\2\2\2z\u0088\3\2\2\2{y\3\2\2\2|\177\5\22\n\2}\177\5\16\b\2~|\3\2\2"+
		"\2~}\3\2\2\2\177\u0083\3\2\2\2\u0080\u0082\7\30\2\2\u0081\u0080\3\2\2"+
		"\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0087"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0086~\3\2\2\2\u0087\u008a\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008b\u008c\7\32\2\2\u008c\31\3\2\2\2\u008d\u008e\7\"\2\2\u008e\u008f"+
		"\7 \2\2\u008f\u0090\7\"\2\2\u0090\33\3\2\2\2\20%,\63\67;@PVZky~\u0083"+
		"\u0088";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}