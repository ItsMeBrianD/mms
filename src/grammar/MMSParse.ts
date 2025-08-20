// Generated from ./grammar/MMSParse.g4 by ANTLR 4.13.2
// noinspection ES6UnusedImports,JSUnusedGlobalSymbols,JSUnusedLocalSymbols

import {
	ATN,
	ATNDeserializer, DecisionState, DFA, FailedPredicateException,
	RecognitionException, NoViableAltException, BailErrorStrategy,
	Parser, ParserATNSimulator,
	RuleContext, ParserRuleContext, PredictionMode, PredictionContextCache,
	TerminalNode, RuleNode,
	Token, TokenStream,
	Interval, IntervalSet
} from 'antlr4';
import MMSParseListener from "./MMSParseListener.js";
// for running tests with parameters, TODO: discuss strategy for typed parameters in CI
// eslint-disable-next-line no-unused-vars
type int = number;

export default class MMSParse extends Parser {
	public static readonly DensityFunctionStart = 1;
	public static readonly Keyword_Noise = 2;
	public static readonly Keyword_Constant = 3;
	public static readonly Keyword_XZScale = 4;
	public static readonly Keyword_YScale = 5;
	public static readonly Keyword_FirstOctave = 6;
	public static readonly Keyword_Amplitudes = 7;
	public static readonly Keyword_Namespace = 8;
	public static readonly Whitespace = 9;
	public static readonly Float = 10;
	public static readonly Integer = 11;
	public static readonly BlockStart = 12;
	public static readonly BlockEnd = 13;
	public static readonly NewLine = 14;
	public static readonly Colon = 15;
	public static readonly SquareOpen = 16;
	public static readonly SquareClose = 17;
	public static readonly Comma = 18;
	public static readonly Comment = 19;
	public static readonly Identifier = 20;
	public static override readonly EOF = Token.EOF;
	public static readonly RULE_statement = 0;
	public static readonly RULE_namespaceStatement = 1;
	public static readonly RULE_file = 2;
	public static readonly RULE_densityStatement = 3;
	public static readonly RULE_densityNoiseDeclaration = 4;
	public static readonly RULE_densityNoiseLine = 5;
	public static readonly RULE_densityXZScaleLine = 6;
	public static readonly RULE_densityYScaleLine = 7;
	public static readonly RULE_densityNoiseStatement = 8;
	public static readonly RULE_reference = 9;
	public static readonly RULE_noiseFirstOctaveLine = 10;
	public static readonly RULE_noiseAmplitudes = 11;
	public static readonly RULE_noiseStatement = 12;
	public static readonly literalNames: (string | null)[] = [ null, "'density'", 
                                                            "'noise'", "'constant'", 
                                                            "'xz_scale'", 
                                                            "'y_scale'", 
                                                            "'first_octave'", 
                                                            "'amplitudes'", 
                                                            "'namespace'", 
                                                            null, null, 
                                                            null, "'{'", 
                                                            null, null, 
                                                            "':'", "'['", 
                                                            "']'", "','" ];
	public static readonly symbolicNames: (string | null)[] = [ null, "DensityFunctionStart", 
                                                             "Keyword_Noise", 
                                                             "Keyword_Constant", 
                                                             "Keyword_XZScale", 
                                                             "Keyword_YScale", 
                                                             "Keyword_FirstOctave", 
                                                             "Keyword_Amplitudes", 
                                                             "Keyword_Namespace", 
                                                             "Whitespace", 
                                                             "Float", "Integer", 
                                                             "BlockStart", 
                                                             "BlockEnd", 
                                                             "NewLine", 
                                                             "Colon", "SquareOpen", 
                                                             "SquareClose", 
                                                             "Comma", "Comment", 
                                                             "Identifier" ];
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"statement", "namespaceStatement", "file", "densityStatement", "densityNoiseDeclaration", 
		"densityNoiseLine", "densityXZScaleLine", "densityYScaleLine", "densityNoiseStatement", 
		"reference", "noiseFirstOctaveLine", "noiseAmplitudes", "noiseStatement",
	];
	public get grammarFileName(): string { return "MMSParse.g4"; }
	public get literalNames(): (string | null)[] { return MMSParse.literalNames; }
	public get symbolicNames(): (string | null)[] { return MMSParse.symbolicNames; }
	public get ruleNames(): string[] { return MMSParse.ruleNames; }
	public get serializedATN(): number[] { return MMSParse._serializedATN; }

	protected createFailedPredicateException(predicate?: string, message?: string): FailedPredicateException {
		return new FailedPredicateException(this, predicate, message);
	}

	constructor(input: TokenStream) {
		super(input);
		this._interp = new ParserATNSimulator(this, MMSParse._ATN, MMSParse.DecisionsToDFA, new PredictionContextCache());
	}
	// @RuleVersion(0)
	public statement(): StatementContext {
		let localctx: StatementContext = new StatementContext(this, this._ctx, this.state);
		this.enterRule(localctx, 0, MMSParse.RULE_statement);
		try {
			this.state = 28;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 1:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 26;
				this.densityStatement();
				}
				break;
			case 2:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 27;
				this.noiseStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public namespaceStatement(): NamespaceStatementContext {
		let localctx: NamespaceStatementContext = new NamespaceStatementContext(this, this._ctx, this.state);
		this.enterRule(localctx, 2, MMSParse.RULE_namespaceStatement);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 30;
			this.match(MMSParse.Keyword_Namespace);
			this.state = 31;
			this.match(MMSParse.Identifier);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public file(): FileContext {
		let localctx: FileContext = new FileContext(this, this._ctx, this.state);
		this.enterRule(localctx, 4, MMSParse.RULE_file);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 33;
			this.namespaceStatement();
			this.state = 35;
			this._errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					this.state = 34;
					this.match(MMSParse.NewLine);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 37;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 1, this._ctx);
			} while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER);
			this.state = 44;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 16902) !== 0)) {
				{
				this.state = 42;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case 1:
				case 2:
					{
					this.state = 39;
					this.statement();
					}
					break;
				case 14:
					{
					this.state = 40;
					this.match(MMSParse.NewLine);
					}
					break;
				case 9:
					{
					this.state = 41;
					this.match(MMSParse.Whitespace);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				this.state = 46;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 47;
			this.match(MMSParse.EOF);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public densityStatement(): DensityStatementContext {
		let localctx: DensityStatementContext = new DensityStatementContext(this, this._ctx, this.state);
		this.enterRule(localctx, 6, MMSParse.RULE_densityStatement);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 49;
			this.densityNoiseStatement();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public densityNoiseDeclaration(): DensityNoiseDeclarationContext {
		let localctx: DensityNoiseDeclarationContext = new DensityNoiseDeclarationContext(this, this._ctx, this.state);
		this.enterRule(localctx, 8, MMSParse.RULE_densityNoiseDeclaration);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 51;
			this.match(MMSParse.DensityFunctionStart);
			this.state = 52;
			this.match(MMSParse.Colon);
			this.state = 53;
			this.match(MMSParse.Keyword_Noise);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public densityNoiseLine(): DensityNoiseLineContext {
		let localctx: DensityNoiseLineContext = new DensityNoiseLineContext(this, this._ctx, this.state);
		this.enterRule(localctx, 10, MMSParse.RULE_densityNoiseLine);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 55;
			this.match(MMSParse.Keyword_Noise);
			this.state = 56;
			this.reference();
			this.state = 60;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===14) {
				{
				{
				this.state = 57;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 62;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public densityXZScaleLine(): DensityXZScaleLineContext {
		let localctx: DensityXZScaleLineContext = new DensityXZScaleLineContext(this, this._ctx, this.state);
		this.enterRule(localctx, 12, MMSParse.RULE_densityXZScaleLine);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 63;
			this.match(MMSParse.Keyword_XZScale);
			this.state = 64;
			_la = this._input.LA(1);
			if(!(_la===10 || _la===11)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 68;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===14) {
				{
				{
				this.state = 65;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 70;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public densityYScaleLine(): DensityYScaleLineContext {
		let localctx: DensityYScaleLineContext = new DensityYScaleLineContext(this, this._ctx, this.state);
		this.enterRule(localctx, 14, MMSParse.RULE_densityYScaleLine);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 71;
			this.match(MMSParse.Keyword_YScale);
			this.state = 72;
			_la = this._input.LA(1);
			if(!(_la===10 || _la===11)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 76;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 6, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 73;
					this.match(MMSParse.NewLine);
					}
					}
				}
				this.state = 78;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 6, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public densityNoiseStatement(): DensityNoiseStatementContext {
		let localctx: DensityNoiseStatementContext = new DensityNoiseStatementContext(this, this._ctx, this.state);
		this.enterRule(localctx, 16, MMSParse.RULE_densityNoiseStatement);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 79;
			this.densityNoiseDeclaration();
			this.state = 80;
			this.match(MMSParse.Identifier);
			this.state = 81;
			this.match(MMSParse.BlockStart);
			this.state = 85;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===14) {
				{
				{
				this.state = 82;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 87;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			{
			this.state = 88;
			this.densityNoiseLine();
			this.state = 89;
			this.densityXZScaleLine();
			this.state = 90;
			this.densityYScaleLine();
			}
			this.state = 95;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===14) {
				{
				{
				this.state = 92;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 97;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 98;
			this.match(MMSParse.BlockEnd);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public reference(): ReferenceContext {
		let localctx: ReferenceContext = new ReferenceContext(this, this._ctx, this.state);
		this.enterRule(localctx, 18, MMSParse.RULE_reference);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 100;
			this.match(MMSParse.Identifier);
			this.state = 101;
			this.match(MMSParse.Colon);
			this.state = 102;
			this.match(MMSParse.Identifier);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public noiseFirstOctaveLine(): NoiseFirstOctaveLineContext {
		let localctx: NoiseFirstOctaveLineContext = new NoiseFirstOctaveLineContext(this, this._ctx, this.state);
		this.enterRule(localctx, 20, MMSParse.RULE_noiseFirstOctaveLine);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 104;
			this.match(MMSParse.Keyword_FirstOctave);
			this.state = 105;
			this.match(MMSParse.Integer);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public noiseAmplitudes(): NoiseAmplitudesContext {
		let localctx: NoiseAmplitudesContext = new NoiseAmplitudesContext(this, this._ctx, this.state);
		this.enterRule(localctx, 22, MMSParse.RULE_noiseAmplitudes);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 107;
			this.match(MMSParse.Keyword_Amplitudes);
			this.state = 108;
			this.match(MMSParse.SquareOpen);
			this.state = 109;
			_la = this._input.LA(1);
			if(!(_la===10 || _la===11)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 114;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===18) {
				{
				{
				this.state = 110;
				this.match(MMSParse.Comma);
				this.state = 111;
				_la = this._input.LA(1);
				if(!(_la===10 || _la===11)) {
				this._errHandler.recoverInline(this);
				}
				else {
					this._errHandler.reportMatch(this);
				    this.consume();
				}
				}
				}
				this.state = 116;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 117;
			this.match(MMSParse.SquareClose);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public noiseStatement(): NoiseStatementContext {
		let localctx: NoiseStatementContext = new NoiseStatementContext(this, this._ctx, this.state);
		this.enterRule(localctx, 24, MMSParse.RULE_noiseStatement);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 119;
			this.match(MMSParse.Keyword_Noise);
			this.state = 120;
			this.match(MMSParse.Identifier);
			this.state = 121;
			this.match(MMSParse.BlockStart);
			this.state = 125;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===14) {
				{
				{
				this.state = 122;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 127;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 128;
			this.noiseFirstOctaveLine();
			this.state = 132;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===14) {
				{
				{
				this.state = 129;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 134;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 135;
			this.noiseAmplitudes();
			this.state = 139;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===14) {
				{
				{
				this.state = 136;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 141;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 142;
			this.match(MMSParse.BlockEnd);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}

	public static readonly _serializedATN: number[] = [4,1,20,145,2,0,7,0,2,
	1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,
	10,7,10,2,11,7,11,2,12,7,12,1,0,1,0,3,0,29,8,0,1,1,1,1,1,1,1,2,1,2,4,2,
	36,8,2,11,2,12,2,37,1,2,1,2,1,2,5,2,43,8,2,10,2,12,2,46,9,2,1,2,1,2,1,3,
	1,3,1,4,1,4,1,4,1,4,1,5,1,5,1,5,5,5,59,8,5,10,5,12,5,62,9,5,1,6,1,6,1,6,
	5,6,67,8,6,10,6,12,6,70,9,6,1,7,1,7,1,7,5,7,75,8,7,10,7,12,7,78,9,7,1,8,
	1,8,1,8,1,8,5,8,84,8,8,10,8,12,8,87,9,8,1,8,1,8,1,8,1,8,1,8,5,8,94,8,8,
	10,8,12,8,97,9,8,1,8,1,8,1,9,1,9,1,9,1,9,1,10,1,10,1,10,1,11,1,11,1,11,
	1,11,1,11,5,11,113,8,11,10,11,12,11,116,9,11,1,11,1,11,1,12,1,12,1,12,1,
	12,5,12,124,8,12,10,12,12,12,127,9,12,1,12,1,12,5,12,131,8,12,10,12,12,
	12,134,9,12,1,12,1,12,5,12,138,8,12,10,12,12,12,141,9,12,1,12,1,12,1,12,
	0,0,13,0,2,4,6,8,10,12,14,16,18,20,22,24,0,1,1,0,10,11,145,0,28,1,0,0,0,
	2,30,1,0,0,0,4,33,1,0,0,0,6,49,1,0,0,0,8,51,1,0,0,0,10,55,1,0,0,0,12,63,
	1,0,0,0,14,71,1,0,0,0,16,79,1,0,0,0,18,100,1,0,0,0,20,104,1,0,0,0,22,107,
	1,0,0,0,24,119,1,0,0,0,26,29,3,6,3,0,27,29,3,24,12,0,28,26,1,0,0,0,28,27,
	1,0,0,0,29,1,1,0,0,0,30,31,5,8,0,0,31,32,5,20,0,0,32,3,1,0,0,0,33,35,3,
	2,1,0,34,36,5,14,0,0,35,34,1,0,0,0,36,37,1,0,0,0,37,35,1,0,0,0,37,38,1,
	0,0,0,38,44,1,0,0,0,39,43,3,0,0,0,40,43,5,14,0,0,41,43,5,9,0,0,42,39,1,
	0,0,0,42,40,1,0,0,0,42,41,1,0,0,0,43,46,1,0,0,0,44,42,1,0,0,0,44,45,1,0,
	0,0,45,47,1,0,0,0,46,44,1,0,0,0,47,48,5,0,0,1,48,5,1,0,0,0,49,50,3,16,8,
	0,50,7,1,0,0,0,51,52,5,1,0,0,52,53,5,15,0,0,53,54,5,2,0,0,54,9,1,0,0,0,
	55,56,5,2,0,0,56,60,3,18,9,0,57,59,5,14,0,0,58,57,1,0,0,0,59,62,1,0,0,0,
	60,58,1,0,0,0,60,61,1,0,0,0,61,11,1,0,0,0,62,60,1,0,0,0,63,64,5,4,0,0,64,
	68,7,0,0,0,65,67,5,14,0,0,66,65,1,0,0,0,67,70,1,0,0,0,68,66,1,0,0,0,68,
	69,1,0,0,0,69,13,1,0,0,0,70,68,1,0,0,0,71,72,5,5,0,0,72,76,7,0,0,0,73,75,
	5,14,0,0,74,73,1,0,0,0,75,78,1,0,0,0,76,74,1,0,0,0,76,77,1,0,0,0,77,15,
	1,0,0,0,78,76,1,0,0,0,79,80,3,8,4,0,80,81,5,20,0,0,81,85,5,12,0,0,82,84,
	5,14,0,0,83,82,1,0,0,0,84,87,1,0,0,0,85,83,1,0,0,0,85,86,1,0,0,0,86,88,
	1,0,0,0,87,85,1,0,0,0,88,89,3,10,5,0,89,90,3,12,6,0,90,91,3,14,7,0,91,95,
	1,0,0,0,92,94,5,14,0,0,93,92,1,0,0,0,94,97,1,0,0,0,95,93,1,0,0,0,95,96,
	1,0,0,0,96,98,1,0,0,0,97,95,1,0,0,0,98,99,5,13,0,0,99,17,1,0,0,0,100,101,
	5,20,0,0,101,102,5,15,0,0,102,103,5,20,0,0,103,19,1,0,0,0,104,105,5,6,0,
	0,105,106,5,11,0,0,106,21,1,0,0,0,107,108,5,7,0,0,108,109,5,16,0,0,109,
	114,7,0,0,0,110,111,5,18,0,0,111,113,7,0,0,0,112,110,1,0,0,0,113,116,1,
	0,0,0,114,112,1,0,0,0,114,115,1,0,0,0,115,117,1,0,0,0,116,114,1,0,0,0,117,
	118,5,17,0,0,118,23,1,0,0,0,119,120,5,2,0,0,120,121,5,20,0,0,121,125,5,
	12,0,0,122,124,5,14,0,0,123,122,1,0,0,0,124,127,1,0,0,0,125,123,1,0,0,0,
	125,126,1,0,0,0,126,128,1,0,0,0,127,125,1,0,0,0,128,132,3,20,10,0,129,131,
	5,14,0,0,130,129,1,0,0,0,131,134,1,0,0,0,132,130,1,0,0,0,132,133,1,0,0,
	0,133,135,1,0,0,0,134,132,1,0,0,0,135,139,3,22,11,0,136,138,5,14,0,0,137,
	136,1,0,0,0,138,141,1,0,0,0,139,137,1,0,0,0,139,140,1,0,0,0,140,142,1,0,
	0,0,141,139,1,0,0,0,142,143,5,13,0,0,143,25,1,0,0,0,13,28,37,42,44,60,68,
	76,85,95,114,125,132,139];

	private static __ATN: ATN;
	public static get _ATN(): ATN {
		if (!MMSParse.__ATN) {
			MMSParse.__ATN = new ATNDeserializer().deserialize(MMSParse._serializedATN);
		}

		return MMSParse.__ATN;
	}


	static DecisionsToDFA = MMSParse._ATN.decisionToState.map( (ds: DecisionState, index: number) => new DFA(ds, index) );

}

export class StatementContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public densityStatement(): DensityStatementContext {
		return this.getTypedRuleContext(DensityStatementContext, 0) as DensityStatementContext;
	}
	public noiseStatement(): NoiseStatementContext {
		return this.getTypedRuleContext(NoiseStatementContext, 0) as NoiseStatementContext;
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_statement;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterStatement) {
	 		listener.enterStatement(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitStatement) {
	 		listener.exitStatement(this);
		}
	}
}


export class NamespaceStatementContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public Keyword_Namespace(): TerminalNode {
		return this.getToken(MMSParse.Keyword_Namespace, 0);
	}
	public Identifier(): TerminalNode {
		return this.getToken(MMSParse.Identifier, 0);
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_namespaceStatement;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterNamespaceStatement) {
	 		listener.enterNamespaceStatement(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitNamespaceStatement) {
	 		listener.exitNamespaceStatement(this);
		}
	}
}


export class FileContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public namespaceStatement(): NamespaceStatementContext {
		return this.getTypedRuleContext(NamespaceStatementContext, 0) as NamespaceStatementContext;
	}
	public EOF(): TerminalNode {
		return this.getToken(MMSParse.EOF, 0);
	}
	public NewLine_list(): TerminalNode[] {
	    	return this.getTokens(MMSParse.NewLine);
	}
	public NewLine(i: number): TerminalNode {
		return this.getToken(MMSParse.NewLine, i);
	}
	public statement_list(): StatementContext[] {
		return this.getTypedRuleContexts(StatementContext) as StatementContext[];
	}
	public statement(i: number): StatementContext {
		return this.getTypedRuleContext(StatementContext, i) as StatementContext;
	}
	public Whitespace_list(): TerminalNode[] {
	    	return this.getTokens(MMSParse.Whitespace);
	}
	public Whitespace(i: number): TerminalNode {
		return this.getToken(MMSParse.Whitespace, i);
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_file;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterFile) {
	 		listener.enterFile(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitFile) {
	 		listener.exitFile(this);
		}
	}
}


export class DensityStatementContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public densityNoiseStatement(): DensityNoiseStatementContext {
		return this.getTypedRuleContext(DensityNoiseStatementContext, 0) as DensityNoiseStatementContext;
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_densityStatement;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterDensityStatement) {
	 		listener.enterDensityStatement(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitDensityStatement) {
	 		listener.exitDensityStatement(this);
		}
	}
}


export class DensityNoiseDeclarationContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public DensityFunctionStart(): TerminalNode {
		return this.getToken(MMSParse.DensityFunctionStart, 0);
	}
	public Colon(): TerminalNode {
		return this.getToken(MMSParse.Colon, 0);
	}
	public Keyword_Noise(): TerminalNode {
		return this.getToken(MMSParse.Keyword_Noise, 0);
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_densityNoiseDeclaration;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterDensityNoiseDeclaration) {
	 		listener.enterDensityNoiseDeclaration(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitDensityNoiseDeclaration) {
	 		listener.exitDensityNoiseDeclaration(this);
		}
	}
}


export class DensityNoiseLineContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public Keyword_Noise(): TerminalNode {
		return this.getToken(MMSParse.Keyword_Noise, 0);
	}
	public reference(): ReferenceContext {
		return this.getTypedRuleContext(ReferenceContext, 0) as ReferenceContext;
	}
	public NewLine_list(): TerminalNode[] {
	    	return this.getTokens(MMSParse.NewLine);
	}
	public NewLine(i: number): TerminalNode {
		return this.getToken(MMSParse.NewLine, i);
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_densityNoiseLine;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterDensityNoiseLine) {
	 		listener.enterDensityNoiseLine(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitDensityNoiseLine) {
	 		listener.exitDensityNoiseLine(this);
		}
	}
}


export class DensityXZScaleLineContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public Keyword_XZScale(): TerminalNode {
		return this.getToken(MMSParse.Keyword_XZScale, 0);
	}
	public Float(): TerminalNode {
		return this.getToken(MMSParse.Float, 0);
	}
	public Integer(): TerminalNode {
		return this.getToken(MMSParse.Integer, 0);
	}
	public NewLine_list(): TerminalNode[] {
	    	return this.getTokens(MMSParse.NewLine);
	}
	public NewLine(i: number): TerminalNode {
		return this.getToken(MMSParse.NewLine, i);
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_densityXZScaleLine;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterDensityXZScaleLine) {
	 		listener.enterDensityXZScaleLine(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitDensityXZScaleLine) {
	 		listener.exitDensityXZScaleLine(this);
		}
	}
}


export class DensityYScaleLineContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public Keyword_YScale(): TerminalNode {
		return this.getToken(MMSParse.Keyword_YScale, 0);
	}
	public Float(): TerminalNode {
		return this.getToken(MMSParse.Float, 0);
	}
	public Integer(): TerminalNode {
		return this.getToken(MMSParse.Integer, 0);
	}
	public NewLine_list(): TerminalNode[] {
	    	return this.getTokens(MMSParse.NewLine);
	}
	public NewLine(i: number): TerminalNode {
		return this.getToken(MMSParse.NewLine, i);
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_densityYScaleLine;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterDensityYScaleLine) {
	 		listener.enterDensityYScaleLine(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitDensityYScaleLine) {
	 		listener.exitDensityYScaleLine(this);
		}
	}
}


export class DensityNoiseStatementContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public densityNoiseDeclaration(): DensityNoiseDeclarationContext {
		return this.getTypedRuleContext(DensityNoiseDeclarationContext, 0) as DensityNoiseDeclarationContext;
	}
	public Identifier(): TerminalNode {
		return this.getToken(MMSParse.Identifier, 0);
	}
	public BlockStart(): TerminalNode {
		return this.getToken(MMSParse.BlockStart, 0);
	}
	public BlockEnd(): TerminalNode {
		return this.getToken(MMSParse.BlockEnd, 0);
	}
	public densityNoiseLine(): DensityNoiseLineContext {
		return this.getTypedRuleContext(DensityNoiseLineContext, 0) as DensityNoiseLineContext;
	}
	public densityXZScaleLine(): DensityXZScaleLineContext {
		return this.getTypedRuleContext(DensityXZScaleLineContext, 0) as DensityXZScaleLineContext;
	}
	public densityYScaleLine(): DensityYScaleLineContext {
		return this.getTypedRuleContext(DensityYScaleLineContext, 0) as DensityYScaleLineContext;
	}
	public NewLine_list(): TerminalNode[] {
	    	return this.getTokens(MMSParse.NewLine);
	}
	public NewLine(i: number): TerminalNode {
		return this.getToken(MMSParse.NewLine, i);
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_densityNoiseStatement;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterDensityNoiseStatement) {
	 		listener.enterDensityNoiseStatement(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitDensityNoiseStatement) {
	 		listener.exitDensityNoiseStatement(this);
		}
	}
}


export class ReferenceContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public Identifier_list(): TerminalNode[] {
	    	return this.getTokens(MMSParse.Identifier);
	}
	public Identifier(i: number): TerminalNode {
		return this.getToken(MMSParse.Identifier, i);
	}
	public Colon(): TerminalNode {
		return this.getToken(MMSParse.Colon, 0);
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_reference;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterReference) {
	 		listener.enterReference(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitReference) {
	 		listener.exitReference(this);
		}
	}
}


export class NoiseFirstOctaveLineContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public Keyword_FirstOctave(): TerminalNode {
		return this.getToken(MMSParse.Keyword_FirstOctave, 0);
	}
	public Integer(): TerminalNode {
		return this.getToken(MMSParse.Integer, 0);
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_noiseFirstOctaveLine;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterNoiseFirstOctaveLine) {
	 		listener.enterNoiseFirstOctaveLine(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitNoiseFirstOctaveLine) {
	 		listener.exitNoiseFirstOctaveLine(this);
		}
	}
}


export class NoiseAmplitudesContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public Keyword_Amplitudes(): TerminalNode {
		return this.getToken(MMSParse.Keyword_Amplitudes, 0);
	}
	public SquareOpen(): TerminalNode {
		return this.getToken(MMSParse.SquareOpen, 0);
	}
	public SquareClose(): TerminalNode {
		return this.getToken(MMSParse.SquareClose, 0);
	}
	public Integer_list(): TerminalNode[] {
	    	return this.getTokens(MMSParse.Integer);
	}
	public Integer(i: number): TerminalNode {
		return this.getToken(MMSParse.Integer, i);
	}
	public Float_list(): TerminalNode[] {
	    	return this.getTokens(MMSParse.Float);
	}
	public Float(i: number): TerminalNode {
		return this.getToken(MMSParse.Float, i);
	}
	public Comma_list(): TerminalNode[] {
	    	return this.getTokens(MMSParse.Comma);
	}
	public Comma(i: number): TerminalNode {
		return this.getToken(MMSParse.Comma, i);
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_noiseAmplitudes;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterNoiseAmplitudes) {
	 		listener.enterNoiseAmplitudes(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitNoiseAmplitudes) {
	 		listener.exitNoiseAmplitudes(this);
		}
	}
}


export class NoiseStatementContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public Keyword_Noise(): TerminalNode {
		return this.getToken(MMSParse.Keyword_Noise, 0);
	}
	public Identifier(): TerminalNode {
		return this.getToken(MMSParse.Identifier, 0);
	}
	public BlockStart(): TerminalNode {
		return this.getToken(MMSParse.BlockStart, 0);
	}
	public noiseFirstOctaveLine(): NoiseFirstOctaveLineContext {
		return this.getTypedRuleContext(NoiseFirstOctaveLineContext, 0) as NoiseFirstOctaveLineContext;
	}
	public noiseAmplitudes(): NoiseAmplitudesContext {
		return this.getTypedRuleContext(NoiseAmplitudesContext, 0) as NoiseAmplitudesContext;
	}
	public BlockEnd(): TerminalNode {
		return this.getToken(MMSParse.BlockEnd, 0);
	}
	public NewLine_list(): TerminalNode[] {
	    	return this.getTokens(MMSParse.NewLine);
	}
	public NewLine(i: number): TerminalNode {
		return this.getToken(MMSParse.NewLine, i);
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_noiseStatement;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterNoiseStatement) {
	 		listener.enterNoiseStatement(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitNoiseStatement) {
	 		listener.exitNoiseStatement(this);
		}
	}
}
