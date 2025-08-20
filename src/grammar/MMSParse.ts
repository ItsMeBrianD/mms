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
	public static readonly Keyword_Bandlands = 9;
	public static readonly Keyword_Surface = 10;
	public static readonly Keyword_Rule = 11;
	public static readonly Keyword_Condition = 12;
	public static readonly Keyword_Block = 13;
	public static readonly Keyword_Type = 14;
	public static readonly Keyword_AbovePreliminarySurface = 15;
	public static readonly Keyword_Biome = 16;
	public static readonly Keyword_BiomeIs = 17;
	public static readonly Keyword_Hole = 18;
	public static readonly Keyword_NoiseThreshold = 19;
	public static readonly Keyword_MinThreshold = 20;
	public static readonly Keyword_MaxThreshold = 21;
	public static readonly Keyword_StoneDepth = 22;
	public static readonly Keyword_SurfaceType = 23;
	public static readonly Keyword_Offset = 24;
	public static readonly Keyword_AddSurfaceDepth = 25;
	public static readonly Keyword_SecondaryDepthRange = 26;
	public static readonly Keyword_Temperature = 27;
	public static readonly Keyword_VerticalGradient = 28;
	public static readonly Keyword_RandomName = 29;
	public static readonly Keyword_TrueAtAndBelow = 30;
	public static readonly Keyword_FalseAtAndAbove = 31;
	public static readonly Keyword_Absolute = 32;
	public static readonly Keyword_AboveBottom = 33;
	public static readonly Keyword_BelowTop = 34;
	public static readonly Keyword_Water = 35;
	public static readonly Keyword_SurfaceDepthMulitplier = 36;
	public static readonly Keyword_AddStoneDepth = 37;
	public static readonly Keyword_Sequence = 38;
	public static readonly Keyword_YAbove = 39;
	public static readonly Keyword_Anchor = 40;
	public static readonly Keyword_If = 41;
	public static readonly Keyword_Else = 42;
	public static readonly Whitespace = 43;
	public static readonly Float = 44;
	public static readonly Integer = 45;
	public static readonly BlockStart = 46;
	public static readonly BlockEnd = 47;
	public static readonly NewLine = 48;
	public static readonly Colon = 49;
	public static readonly RoundOpen = 50;
	public static readonly RoundClose = 51;
	public static readonly SquareOpen = 52;
	public static readonly SquareClose = 53;
	public static readonly Comma = 54;
	public static readonly Comment = 55;
	public static readonly Not = 56;
	public static readonly Quote = 57;
	public static readonly Identifier = 58;
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
	public static readonly RULE_verticalAnchor = 10;
	public static readonly RULE_referenceArray = 11;
	public static readonly RULE_noiseFirstOctaveLine = 12;
	public static readonly RULE_noiseAmplitudes = 13;
	public static readonly RULE_noiseStatement = 14;
	public static readonly RULE_surfaceStatement = 15;
	public static readonly RULE_surfaceRuleDeclaration = 16;
	public static readonly RULE_surfaceRuleInline = 17;
	public static readonly RULE_surfaceRule = 18;
	public static readonly RULE_surfaceRuleReference = 19;
	public static readonly RULE_blockSurfaceRule = 20;
	public static readonly RULE_sequenceSurfaceRule = 21;
	public static readonly RULE_bandlandsSurfaceRule = 22;
	public static readonly RULE_conditionSurfaceRule = 23;
	public static readonly RULE_surfaceConditionDeclaration = 24;
	public static readonly RULE_surfaceConditionInline = 25;
	public static readonly RULE_surfaceCondition = 26;
	public static readonly RULE_biomeSurfaceCondition = 27;
	public static readonly RULE_abovePreliminarySurfaceCondition = 28;
	public static readonly RULE_blockProperties = 29;
	public static readonly RULE_blockState = 30;
	public static readonly literalNames: (string | null)[] = [ null, "'density'", 
                                                            "'noise'", "'constant'", 
                                                            "'xz_scale'", 
                                                            "'y_scale'", 
                                                            "'first_octave'", 
                                                            "'amplitudes'", 
                                                            "'namespace'", 
                                                            "'bandlands'", 
                                                            "'surface'", 
                                                            "'rule'", "'condition'", 
                                                            "'block'", "'type'", 
                                                            "'above_preliminary_surface'", 
                                                            "'biome'", "'biome_is'", 
                                                            "'hole'", "'noise_threshold'", 
                                                            "'min_threshold'", 
                                                            "'max_threshold'", 
                                                            "'stone_depth'", 
                                                            "'surface_type'", 
                                                            "'offset'", 
                                                            "'add_surface_depth'", 
                                                            "'secondary_depth_range'", 
                                                            "'temperature'", 
                                                            "'vertical_gradient'", 
                                                            "'random_name'", 
                                                            "'true_at_and_below'", 
                                                            "'false_at_and_above'", 
                                                            "'absolute'", 
                                                            "'above_bottom'", 
                                                            "'below_top'", 
                                                            "'water'", "'surface_depth_mulitplier'", 
                                                            "'add_stone_depth'", 
                                                            "'sequence'", 
                                                            "'y_above'", 
                                                            "'anchor'", 
                                                            "'if'", "'else'", 
                                                            null, null, 
                                                            null, "'{'", 
                                                            null, null, 
                                                            "':'", "'('", 
                                                            "')'", "'['", 
                                                            "']'", "','", 
                                                            null, "'!'", 
                                                            "'\"'" ];
	public static readonly symbolicNames: (string | null)[] = [ null, "DensityFunctionStart", 
                                                             "Keyword_Noise", 
                                                             "Keyword_Constant", 
                                                             "Keyword_XZScale", 
                                                             "Keyword_YScale", 
                                                             "Keyword_FirstOctave", 
                                                             "Keyword_Amplitudes", 
                                                             "Keyword_Namespace", 
                                                             "Keyword_Bandlands", 
                                                             "Keyword_Surface", 
                                                             "Keyword_Rule", 
                                                             "Keyword_Condition", 
                                                             "Keyword_Block", 
                                                             "Keyword_Type", 
                                                             "Keyword_AbovePreliminarySurface", 
                                                             "Keyword_Biome", 
                                                             "Keyword_BiomeIs", 
                                                             "Keyword_Hole", 
                                                             "Keyword_NoiseThreshold", 
                                                             "Keyword_MinThreshold", 
                                                             "Keyword_MaxThreshold", 
                                                             "Keyword_StoneDepth", 
                                                             "Keyword_SurfaceType", 
                                                             "Keyword_Offset", 
                                                             "Keyword_AddSurfaceDepth", 
                                                             "Keyword_SecondaryDepthRange", 
                                                             "Keyword_Temperature", 
                                                             "Keyword_VerticalGradient", 
                                                             "Keyword_RandomName", 
                                                             "Keyword_TrueAtAndBelow", 
                                                             "Keyword_FalseAtAndAbove", 
                                                             "Keyword_Absolute", 
                                                             "Keyword_AboveBottom", 
                                                             "Keyword_BelowTop", 
                                                             "Keyword_Water", 
                                                             "Keyword_SurfaceDepthMulitplier", 
                                                             "Keyword_AddStoneDepth", 
                                                             "Keyword_Sequence", 
                                                             "Keyword_YAbove", 
                                                             "Keyword_Anchor", 
                                                             "Keyword_If", 
                                                             "Keyword_Else", 
                                                             "Whitespace", 
                                                             "Float", "Integer", 
                                                             "BlockStart", 
                                                             "BlockEnd", 
                                                             "NewLine", 
                                                             "Colon", "RoundOpen", 
                                                             "RoundClose", 
                                                             "SquareOpen", 
                                                             "SquareClose", 
                                                             "Comma", "Comment", 
                                                             "Not", "Quote", 
                                                             "Identifier" ];
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"statement", "namespaceStatement", "file", "densityStatement", "densityNoiseDeclaration", 
		"densityNoiseLine", "densityXZScaleLine", "densityYScaleLine", "densityNoiseStatement", 
		"reference", "verticalAnchor", "referenceArray", "noiseFirstOctaveLine", 
		"noiseAmplitudes", "noiseStatement", "surfaceStatement", "surfaceRuleDeclaration", 
		"surfaceRuleInline", "surfaceRule", "surfaceRuleReference", "blockSurfaceRule", 
		"sequenceSurfaceRule", "bandlandsSurfaceRule", "conditionSurfaceRule", 
		"surfaceConditionDeclaration", "surfaceConditionInline", "surfaceCondition", 
		"biomeSurfaceCondition", "abovePreliminarySurfaceCondition", "blockProperties", 
		"blockState",
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
			this.state = 65;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 1:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 62;
				this.densityStatement();
				}
				break;
			case 2:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 63;
				this.noiseStatement();
				}
				break;
			case 10:
				this.enterOuterAlt(localctx, 3);
				{
				this.state = 64;
				this.surfaceStatement();
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
			this.state = 67;
			this.match(MMSParse.Keyword_Namespace);
			this.state = 68;
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
			this.state = 70;
			this.namespaceStatement();
			this.state = 83;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===48) {
				{
				{
				this.state = 72;
				this._errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						this.state = 71;
						this.match(MMSParse.NewLine);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					this.state = 74;
					this._errHandler.sync(this);
					_alt = this._interp.adaptivePredict(this._input, 1, this._ctx);
				} while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER);
				this.state = 79;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case 1:
				case 2:
				case 10:
					{
					this.state = 76;
					this.statement();
					}
					break;
				case 48:
					{
					this.state = 77;
					this.match(MMSParse.NewLine);
					}
					break;
				case 43:
					{
					this.state = 78;
					this.match(MMSParse.Whitespace);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				this.state = 85;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 86;
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
			this.state = 88;
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
			this.state = 90;
			this.match(MMSParse.DensityFunctionStart);
			this.state = 91;
			this.match(MMSParse.Colon);
			this.state = 92;
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
			this.state = 94;
			this.match(MMSParse.Keyword_Noise);
			this.state = 95;
			this.reference();
			this.state = 99;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===48) {
				{
				{
				this.state = 96;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 101;
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
			this.state = 102;
			this.match(MMSParse.Keyword_XZScale);
			this.state = 103;
			_la = this._input.LA(1);
			if(!(_la===44 || _la===45)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 107;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===48) {
				{
				{
				this.state = 104;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 109;
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
			this.state = 110;
			this.match(MMSParse.Keyword_YScale);
			this.state = 111;
			_la = this._input.LA(1);
			if(!(_la===44 || _la===45)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 115;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 6, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 112;
					this.match(MMSParse.NewLine);
					}
					}
				}
				this.state = 117;
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
			this.state = 118;
			this.densityNoiseDeclaration();
			this.state = 119;
			this.match(MMSParse.Identifier);
			this.state = 120;
			this.match(MMSParse.BlockStart);
			this.state = 124;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===48) {
				{
				{
				this.state = 121;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 126;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			{
			this.state = 127;
			this.densityNoiseLine();
			this.state = 128;
			this.densityXZScaleLine();
			this.state = 129;
			this.densityYScaleLine();
			}
			this.state = 134;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===48) {
				{
				{
				this.state = 131;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 136;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 137;
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
			this.state = 139;
			this.match(MMSParse.Quote);
			this.state = 140;
			this.match(MMSParse.Identifier);
			this.state = 141;
			this.match(MMSParse.Colon);
			this.state = 142;
			this.match(MMSParse.Identifier);
			this.state = 143;
			this.match(MMSParse.Quote);
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
	public verticalAnchor(): VerticalAnchorContext {
		let localctx: VerticalAnchorContext = new VerticalAnchorContext(this, this._ctx, this.state);
		this.enterRule(localctx, 20, MMSParse.RULE_verticalAnchor);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 145;
			_la = this._input.LA(1);
			if(!(((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & 7) !== 0))) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 146;
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
	public referenceArray(): ReferenceArrayContext {
		let localctx: ReferenceArrayContext = new ReferenceArrayContext(this, this._ctx, this.state);
		this.enterRule(localctx, 22, MMSParse.RULE_referenceArray);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 148;
			this.match(MMSParse.SquareOpen);
			this.state = 152;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===48) {
				{
				{
				this.state = 149;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 154;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 155;
			this.reference();
			this.state = 159;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 10, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 156;
					this.match(MMSParse.NewLine);
					}
					}
				}
				this.state = 161;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 10, this._ctx);
			}
			this.state = 172;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 12, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 162;
					this.match(MMSParse.Comma);
					this.state = 166;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la===48) {
						{
						{
						this.state = 163;
						this.match(MMSParse.NewLine);
						}
						}
						this.state = 168;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					this.state = 169;
					this.reference();
					}
					}
				}
				this.state = 174;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 12, this._ctx);
			}
			this.state = 178;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 13, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 175;
					this.match(MMSParse.NewLine);
					}
					}
				}
				this.state = 180;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 13, this._ctx);
			}
			this.state = 182;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la===54) {
				{
				this.state = 181;
				this.match(MMSParse.Comma);
				}
			}

			this.state = 187;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===48) {
				{
				{
				this.state = 184;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 189;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 190;
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
	public noiseFirstOctaveLine(): NoiseFirstOctaveLineContext {
		let localctx: NoiseFirstOctaveLineContext = new NoiseFirstOctaveLineContext(this, this._ctx, this.state);
		this.enterRule(localctx, 24, MMSParse.RULE_noiseFirstOctaveLine);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 192;
			this.match(MMSParse.Keyword_FirstOctave);
			this.state = 193;
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
		this.enterRule(localctx, 26, MMSParse.RULE_noiseAmplitudes);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 195;
			this.match(MMSParse.Keyword_Amplitudes);
			this.state = 196;
			this.match(MMSParse.SquareOpen);
			this.state = 197;
			_la = this._input.LA(1);
			if(!(_la===44 || _la===45)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 202;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===54) {
				{
				{
				this.state = 198;
				this.match(MMSParse.Comma);
				this.state = 199;
				_la = this._input.LA(1);
				if(!(_la===44 || _la===45)) {
				this._errHandler.recoverInline(this);
				}
				else {
					this._errHandler.reportMatch(this);
				    this.consume();
				}
				}
				}
				this.state = 204;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 205;
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
		this.enterRule(localctx, 28, MMSParse.RULE_noiseStatement);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 207;
			this.match(MMSParse.Keyword_Noise);
			this.state = 208;
			this.match(MMSParse.Identifier);
			this.state = 209;
			this.match(MMSParse.BlockStart);
			this.state = 213;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===48) {
				{
				{
				this.state = 210;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 215;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 216;
			this.noiseFirstOctaveLine();
			this.state = 220;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===48) {
				{
				{
				this.state = 217;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 222;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 223;
			this.noiseAmplitudes();
			this.state = 227;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===48) {
				{
				{
				this.state = 224;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 229;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 230;
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
	public surfaceStatement(): SurfaceStatementContext {
		let localctx: SurfaceStatementContext = new SurfaceStatementContext(this, this._ctx, this.state);
		this.enterRule(localctx, 30, MMSParse.RULE_surfaceStatement);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 232;
			this.match(MMSParse.Keyword_Surface);
			this.state = 233;
			this.match(MMSParse.BlockStart);
			this.state = 237;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 20, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 234;
					this.match(MMSParse.NewLine);
					}
					}
				}
				this.state = 239;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 20, this._ctx);
			}
			this.state = 252;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===11 || _la===12) {
				{
				{
				this.state = 242;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case 11:
					{
					this.state = 240;
					this.surfaceRuleDeclaration();
					}
					break;
				case 12:
					{
					this.state = 241;
					this.surfaceConditionDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 247;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 22, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 244;
						this.match(MMSParse.NewLine);
						}
						}
					}
					this.state = 249;
					this._errHandler.sync(this);
					_alt = this._interp.adaptivePredict(this._input, 22, this._ctx);
				}
				}
				}
				this.state = 254;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 258;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===48) {
				{
				{
				this.state = 255;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 260;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 261;
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
	public surfaceRuleDeclaration(): SurfaceRuleDeclarationContext {
		let localctx: SurfaceRuleDeclarationContext = new SurfaceRuleDeclarationContext(this, this._ctx, this.state);
		this.enterRule(localctx, 32, MMSParse.RULE_surfaceRuleDeclaration);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 263;
			this.match(MMSParse.Keyword_Rule);
			this.state = 264;
			this.match(MMSParse.Identifier);
			this.state = 265;
			this.surfaceRule();
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
	public surfaceRuleInline(): SurfaceRuleInlineContext {
		let localctx: SurfaceRuleInlineContext = new SurfaceRuleInlineContext(this, this._ctx, this.state);
		this.enterRule(localctx, 34, MMSParse.RULE_surfaceRuleInline);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 267;
			this.match(MMSParse.BlockStart);
			this.state = 271;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 25, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 268;
					this.match(MMSParse.NewLine);
					}
					}
				}
				this.state = 273;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 25, this._ctx);
			}
			this.state = 274;
			this.surfaceRule();
			this.state = 278;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===48) {
				{
				{
				this.state = 275;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 280;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 281;
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
	public surfaceRule(): SurfaceRuleContext {
		let localctx: SurfaceRuleContext = new SurfaceRuleContext(this, this._ctx, this.state);
		this.enterRule(localctx, 36, MMSParse.RULE_surfaceRule);
		try {
			this.state = 286;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 13:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 283;
				this.blockSurfaceRule();
				}
				break;
			case 38:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 284;
				this.sequenceSurfaceRule();
				}
				break;
			case 41:
			case 48:
				this.enterOuterAlt(localctx, 3);
				{
				this.state = 285;
				this.conditionSurfaceRule();
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
	public surfaceRuleReference(): SurfaceRuleReferenceContext {
		let localctx: SurfaceRuleReferenceContext = new SurfaceRuleReferenceContext(this, this._ctx, this.state);
		this.enterRule(localctx, 38, MMSParse.RULE_surfaceRuleReference);
		try {
			this.state = 290;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 57:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 288;
				this.reference();
				}
				break;
			case 46:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 289;
				this.surfaceRuleInline();
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
	public blockSurfaceRule(): BlockSurfaceRuleContext {
		let localctx: BlockSurfaceRuleContext = new BlockSurfaceRuleContext(this, this._ctx, this.state);
		this.enterRule(localctx, 40, MMSParse.RULE_blockSurfaceRule);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 292;
			this.match(MMSParse.Keyword_Block);
			this.state = 293;
			this.blockState();
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
	public sequenceSurfaceRule(): SequenceSurfaceRuleContext {
		let localctx: SequenceSurfaceRuleContext = new SequenceSurfaceRuleContext(this, this._ctx, this.state);
		this.enterRule(localctx, 42, MMSParse.RULE_sequenceSurfaceRule);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 295;
			this.match(MMSParse.Keyword_Sequence);
			this.state = 299;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===48) {
				{
				{
				this.state = 296;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 301;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 302;
			this.match(MMSParse.SquareOpen);
			this.state = 306;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===48) {
				{
				{
				this.state = 303;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 308;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 325;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 33, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 309;
					this.surfaceRuleReference();
					this.state = 313;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la===48) {
						{
						{
						this.state = 310;
						this.match(MMSParse.NewLine);
						}
						}
						this.state = 315;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					this.state = 316;
					this.match(MMSParse.Comma);
					this.state = 320;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la===48) {
						{
						{
						this.state = 317;
						this.match(MMSParse.NewLine);
						}
						}
						this.state = 322;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					}
					}
				}
				this.state = 327;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 33, this._ctx);
			}
			this.state = 328;
			this.surfaceRuleReference();
			this.state = 332;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===48) {
				{
				{
				this.state = 329;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 334;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 335;
			this.match(MMSParse.SquareClose);
			this.state = 339;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 35, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 336;
					this.match(MMSParse.NewLine);
					}
					}
				}
				this.state = 341;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 35, this._ctx);
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
	public bandlandsSurfaceRule(): BandlandsSurfaceRuleContext {
		let localctx: BandlandsSurfaceRuleContext = new BandlandsSurfaceRuleContext(this, this._ctx, this.state);
		this.enterRule(localctx, 44, MMSParse.RULE_bandlandsSurfaceRule);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 342;
			this.match(MMSParse.Keyword_Bandlands);
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
	public conditionSurfaceRule(): ConditionSurfaceRuleContext {
		let localctx: ConditionSurfaceRuleContext = new ConditionSurfaceRuleContext(this, this._ctx, this.state);
		this.enterRule(localctx, 46, MMSParse.RULE_conditionSurfaceRule);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 345;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la===48) {
				{
				this.state = 344;
				this.match(MMSParse.NewLine);
				}
			}

			this.state = 347;
			this.match(MMSParse.Keyword_If);
			this.state = 348;
			this.match(MMSParse.RoundOpen);
			this.state = 352;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===48) {
				{
				{
				this.state = 349;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 354;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 355;
			this.surfaceCondition();
			this.state = 359;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===48) {
				{
				{
				this.state = 356;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 361;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 362;
			this.match(MMSParse.RoundClose);
			this.state = 366;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===48) {
				{
				{
				this.state = 363;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 368;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			{
			this.state = 369;
			this.surfaceRuleReference();
			}
			this.state = 373;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 40, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 370;
					this.match(MMSParse.NewLine);
					}
					}
				}
				this.state = 375;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 40, this._ctx);
			}
			this.state = 384;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la===42) {
				{
				this.state = 376;
				this.match(MMSParse.Keyword_Else);
				this.state = 380;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la===48) {
					{
					{
					this.state = 377;
					this.match(MMSParse.NewLine);
					}
					}
					this.state = 382;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				{
				this.state = 383;
				this.surfaceRuleReference();
				}
				}
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
	public surfaceConditionDeclaration(): SurfaceConditionDeclarationContext {
		let localctx: SurfaceConditionDeclarationContext = new SurfaceConditionDeclarationContext(this, this._ctx, this.state);
		this.enterRule(localctx, 48, MMSParse.RULE_surfaceConditionDeclaration);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 386;
			this.match(MMSParse.Keyword_Condition);
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
	public surfaceConditionInline(): SurfaceConditionInlineContext {
		let localctx: SurfaceConditionInlineContext = new SurfaceConditionInlineContext(this, this._ctx, this.state);
		this.enterRule(localctx, 50, MMSParse.RULE_surfaceConditionInline);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 388;
			this.match(MMSParse.RoundOpen);
			this.state = 389;
			this.surfaceCondition();
			this.state = 390;
			this.match(MMSParse.RoundClose);
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
	public surfaceCondition(): SurfaceConditionContext {
		let localctx: SurfaceConditionContext = new SurfaceConditionContext(this, this._ctx, this.state);
		this.enterRule(localctx, 52, MMSParse.RULE_surfaceCondition);
		try {
			this.state = 394;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 16:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 392;
				this.biomeSurfaceCondition();
				}
				break;
			case 15:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 393;
				this.abovePreliminarySurfaceCondition();
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
	public biomeSurfaceCondition(): BiomeSurfaceConditionContext {
		let localctx: BiomeSurfaceConditionContext = new BiomeSurfaceConditionContext(this, this._ctx, this.state);
		this.enterRule(localctx, 54, MMSParse.RULE_biomeSurfaceCondition);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 396;
			this.match(MMSParse.Keyword_Biome);
			this.state = 397;
			this.referenceArray();
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
	public abovePreliminarySurfaceCondition(): AbovePreliminarySurfaceConditionContext {
		let localctx: AbovePreliminarySurfaceConditionContext = new AbovePreliminarySurfaceConditionContext(this, this._ctx, this.state);
		this.enterRule(localctx, 56, MMSParse.RULE_abovePreliminarySurfaceCondition);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 399;
			this.match(MMSParse.Keyword_AbovePreliminarySurface);
			this.state = 400;
			this.verticalAnchor();
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
	public blockProperties(): BlockPropertiesContext {
		let localctx: BlockPropertiesContext = new BlockPropertiesContext(this, this._ctx, this.state);
		this.enterRule(localctx, 58, MMSParse.RULE_blockProperties);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 402;
			this.match(MMSParse.BlockStart);
			this.state = 406;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 44, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 403;
					this.match(MMSParse.NewLine);
					}
					}
				}
				this.state = 408;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 44, this._ctx);
			}
			this.state = 412;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===48) {
				{
				{
				this.state = 409;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 414;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 415;
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
	public blockState(): BlockStateContext {
		let localctx: BlockStateContext = new BlockStateContext(this, this._ctx, this.state);
		this.enterRule(localctx, 60, MMSParse.RULE_blockState);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 417;
			this.reference();
			this.state = 419;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la===46) {
				{
				this.state = 418;
				this.blockProperties();
				}
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

	public static readonly _serializedATN: number[] = [4,1,58,422,2,0,7,0,2,
	1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,
	10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,
	7,17,2,18,7,18,2,19,7,19,2,20,7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,
	24,2,25,7,25,2,26,7,26,2,27,7,27,2,28,7,28,2,29,7,29,2,30,7,30,1,0,1,0,
	1,0,3,0,66,8,0,1,1,1,1,1,1,1,2,1,2,4,2,73,8,2,11,2,12,2,74,1,2,1,2,1,2,
	3,2,80,8,2,5,2,82,8,2,10,2,12,2,85,9,2,1,2,1,2,1,3,1,3,1,4,1,4,1,4,1,4,
	1,5,1,5,1,5,5,5,98,8,5,10,5,12,5,101,9,5,1,6,1,6,1,6,5,6,106,8,6,10,6,12,
	6,109,9,6,1,7,1,7,1,7,5,7,114,8,7,10,7,12,7,117,9,7,1,8,1,8,1,8,1,8,5,8,
	123,8,8,10,8,12,8,126,9,8,1,8,1,8,1,8,1,8,1,8,5,8,133,8,8,10,8,12,8,136,
	9,8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,1,9,1,10,1,10,1,10,1,11,1,11,5,11,151,8,
	11,10,11,12,11,154,9,11,1,11,1,11,5,11,158,8,11,10,11,12,11,161,9,11,1,
	11,1,11,5,11,165,8,11,10,11,12,11,168,9,11,1,11,5,11,171,8,11,10,11,12,
	11,174,9,11,1,11,5,11,177,8,11,10,11,12,11,180,9,11,1,11,3,11,183,8,11,
	1,11,5,11,186,8,11,10,11,12,11,189,9,11,1,11,1,11,1,12,1,12,1,12,1,13,1,
	13,1,13,1,13,1,13,5,13,201,8,13,10,13,12,13,204,9,13,1,13,1,13,1,14,1,14,
	1,14,1,14,5,14,212,8,14,10,14,12,14,215,9,14,1,14,1,14,5,14,219,8,14,10,
	14,12,14,222,9,14,1,14,1,14,5,14,226,8,14,10,14,12,14,229,9,14,1,14,1,14,
	1,15,1,15,1,15,5,15,236,8,15,10,15,12,15,239,9,15,1,15,1,15,3,15,243,8,
	15,1,15,5,15,246,8,15,10,15,12,15,249,9,15,5,15,251,8,15,10,15,12,15,254,
	9,15,1,15,5,15,257,8,15,10,15,12,15,260,9,15,1,15,1,15,1,16,1,16,1,16,1,
	16,1,17,1,17,5,17,270,8,17,10,17,12,17,273,9,17,1,17,1,17,5,17,277,8,17,
	10,17,12,17,280,9,17,1,17,1,17,1,18,1,18,1,18,3,18,287,8,18,1,19,1,19,3,
	19,291,8,19,1,20,1,20,1,20,1,21,1,21,5,21,298,8,21,10,21,12,21,301,9,21,
	1,21,1,21,5,21,305,8,21,10,21,12,21,308,9,21,1,21,1,21,5,21,312,8,21,10,
	21,12,21,315,9,21,1,21,1,21,5,21,319,8,21,10,21,12,21,322,9,21,5,21,324,
	8,21,10,21,12,21,327,9,21,1,21,1,21,5,21,331,8,21,10,21,12,21,334,9,21,
	1,21,1,21,5,21,338,8,21,10,21,12,21,341,9,21,1,22,1,22,1,23,3,23,346,8,
	23,1,23,1,23,1,23,5,23,351,8,23,10,23,12,23,354,9,23,1,23,1,23,5,23,358,
	8,23,10,23,12,23,361,9,23,1,23,1,23,5,23,365,8,23,10,23,12,23,368,9,23,
	1,23,1,23,5,23,372,8,23,10,23,12,23,375,9,23,1,23,1,23,5,23,379,8,23,10,
	23,12,23,382,9,23,1,23,3,23,385,8,23,1,24,1,24,1,25,1,25,1,25,1,25,1,26,
	1,26,3,26,395,8,26,1,27,1,27,1,27,1,28,1,28,1,28,1,29,1,29,5,29,405,8,29,
	10,29,12,29,408,9,29,1,29,5,29,411,8,29,10,29,12,29,414,9,29,1,29,1,29,
	1,30,1,30,3,30,420,8,30,1,30,0,0,31,0,2,4,6,8,10,12,14,16,18,20,22,24,26,
	28,30,32,34,36,38,40,42,44,46,48,50,52,54,56,58,60,0,2,1,0,44,45,1,0,32,
	34,440,0,65,1,0,0,0,2,67,1,0,0,0,4,70,1,0,0,0,6,88,1,0,0,0,8,90,1,0,0,0,
	10,94,1,0,0,0,12,102,1,0,0,0,14,110,1,0,0,0,16,118,1,0,0,0,18,139,1,0,0,
	0,20,145,1,0,0,0,22,148,1,0,0,0,24,192,1,0,0,0,26,195,1,0,0,0,28,207,1,
	0,0,0,30,232,1,0,0,0,32,263,1,0,0,0,34,267,1,0,0,0,36,286,1,0,0,0,38,290,
	1,0,0,0,40,292,1,0,0,0,42,295,1,0,0,0,44,342,1,0,0,0,46,345,1,0,0,0,48,
	386,1,0,0,0,50,388,1,0,0,0,52,394,1,0,0,0,54,396,1,0,0,0,56,399,1,0,0,0,
	58,402,1,0,0,0,60,417,1,0,0,0,62,66,3,6,3,0,63,66,3,28,14,0,64,66,3,30,
	15,0,65,62,1,0,0,0,65,63,1,0,0,0,65,64,1,0,0,0,66,1,1,0,0,0,67,68,5,8,0,
	0,68,69,5,58,0,0,69,3,1,0,0,0,70,83,3,2,1,0,71,73,5,48,0,0,72,71,1,0,0,
	0,73,74,1,0,0,0,74,72,1,0,0,0,74,75,1,0,0,0,75,79,1,0,0,0,76,80,3,0,0,0,
	77,80,5,48,0,0,78,80,5,43,0,0,79,76,1,0,0,0,79,77,1,0,0,0,79,78,1,0,0,0,
	80,82,1,0,0,0,81,72,1,0,0,0,82,85,1,0,0,0,83,81,1,0,0,0,83,84,1,0,0,0,84,
	86,1,0,0,0,85,83,1,0,0,0,86,87,5,0,0,1,87,5,1,0,0,0,88,89,3,16,8,0,89,7,
	1,0,0,0,90,91,5,1,0,0,91,92,5,49,0,0,92,93,5,2,0,0,93,9,1,0,0,0,94,95,5,
	2,0,0,95,99,3,18,9,0,96,98,5,48,0,0,97,96,1,0,0,0,98,101,1,0,0,0,99,97,
	1,0,0,0,99,100,1,0,0,0,100,11,1,0,0,0,101,99,1,0,0,0,102,103,5,4,0,0,103,
	107,7,0,0,0,104,106,5,48,0,0,105,104,1,0,0,0,106,109,1,0,0,0,107,105,1,
	0,0,0,107,108,1,0,0,0,108,13,1,0,0,0,109,107,1,0,0,0,110,111,5,5,0,0,111,
	115,7,0,0,0,112,114,5,48,0,0,113,112,1,0,0,0,114,117,1,0,0,0,115,113,1,
	0,0,0,115,116,1,0,0,0,116,15,1,0,0,0,117,115,1,0,0,0,118,119,3,8,4,0,119,
	120,5,58,0,0,120,124,5,46,0,0,121,123,5,48,0,0,122,121,1,0,0,0,123,126,
	1,0,0,0,124,122,1,0,0,0,124,125,1,0,0,0,125,127,1,0,0,0,126,124,1,0,0,0,
	127,128,3,10,5,0,128,129,3,12,6,0,129,130,3,14,7,0,130,134,1,0,0,0,131,
	133,5,48,0,0,132,131,1,0,0,0,133,136,1,0,0,0,134,132,1,0,0,0,134,135,1,
	0,0,0,135,137,1,0,0,0,136,134,1,0,0,0,137,138,5,47,0,0,138,17,1,0,0,0,139,
	140,5,57,0,0,140,141,5,58,0,0,141,142,5,49,0,0,142,143,5,58,0,0,143,144,
	5,57,0,0,144,19,1,0,0,0,145,146,7,1,0,0,146,147,5,45,0,0,147,21,1,0,0,0,
	148,152,5,52,0,0,149,151,5,48,0,0,150,149,1,0,0,0,151,154,1,0,0,0,152,150,
	1,0,0,0,152,153,1,0,0,0,153,155,1,0,0,0,154,152,1,0,0,0,155,159,3,18,9,
	0,156,158,5,48,0,0,157,156,1,0,0,0,158,161,1,0,0,0,159,157,1,0,0,0,159,
	160,1,0,0,0,160,172,1,0,0,0,161,159,1,0,0,0,162,166,5,54,0,0,163,165,5,
	48,0,0,164,163,1,0,0,0,165,168,1,0,0,0,166,164,1,0,0,0,166,167,1,0,0,0,
	167,169,1,0,0,0,168,166,1,0,0,0,169,171,3,18,9,0,170,162,1,0,0,0,171,174,
	1,0,0,0,172,170,1,0,0,0,172,173,1,0,0,0,173,178,1,0,0,0,174,172,1,0,0,0,
	175,177,5,48,0,0,176,175,1,0,0,0,177,180,1,0,0,0,178,176,1,0,0,0,178,179,
	1,0,0,0,179,182,1,0,0,0,180,178,1,0,0,0,181,183,5,54,0,0,182,181,1,0,0,
	0,182,183,1,0,0,0,183,187,1,0,0,0,184,186,5,48,0,0,185,184,1,0,0,0,186,
	189,1,0,0,0,187,185,1,0,0,0,187,188,1,0,0,0,188,190,1,0,0,0,189,187,1,0,
	0,0,190,191,5,53,0,0,191,23,1,0,0,0,192,193,5,6,0,0,193,194,5,45,0,0,194,
	25,1,0,0,0,195,196,5,7,0,0,196,197,5,52,0,0,197,202,7,0,0,0,198,199,5,54,
	0,0,199,201,7,0,0,0,200,198,1,0,0,0,201,204,1,0,0,0,202,200,1,0,0,0,202,
	203,1,0,0,0,203,205,1,0,0,0,204,202,1,0,0,0,205,206,5,53,0,0,206,27,1,0,
	0,0,207,208,5,2,0,0,208,209,5,58,0,0,209,213,5,46,0,0,210,212,5,48,0,0,
	211,210,1,0,0,0,212,215,1,0,0,0,213,211,1,0,0,0,213,214,1,0,0,0,214,216,
	1,0,0,0,215,213,1,0,0,0,216,220,3,24,12,0,217,219,5,48,0,0,218,217,1,0,
	0,0,219,222,1,0,0,0,220,218,1,0,0,0,220,221,1,0,0,0,221,223,1,0,0,0,222,
	220,1,0,0,0,223,227,3,26,13,0,224,226,5,48,0,0,225,224,1,0,0,0,226,229,
	1,0,0,0,227,225,1,0,0,0,227,228,1,0,0,0,228,230,1,0,0,0,229,227,1,0,0,0,
	230,231,5,47,0,0,231,29,1,0,0,0,232,233,5,10,0,0,233,237,5,46,0,0,234,236,
	5,48,0,0,235,234,1,0,0,0,236,239,1,0,0,0,237,235,1,0,0,0,237,238,1,0,0,
	0,238,252,1,0,0,0,239,237,1,0,0,0,240,243,3,32,16,0,241,243,3,48,24,0,242,
	240,1,0,0,0,242,241,1,0,0,0,243,247,1,0,0,0,244,246,5,48,0,0,245,244,1,
	0,0,0,246,249,1,0,0,0,247,245,1,0,0,0,247,248,1,0,0,0,248,251,1,0,0,0,249,
	247,1,0,0,0,250,242,1,0,0,0,251,254,1,0,0,0,252,250,1,0,0,0,252,253,1,0,
	0,0,253,258,1,0,0,0,254,252,1,0,0,0,255,257,5,48,0,0,256,255,1,0,0,0,257,
	260,1,0,0,0,258,256,1,0,0,0,258,259,1,0,0,0,259,261,1,0,0,0,260,258,1,0,
	0,0,261,262,5,47,0,0,262,31,1,0,0,0,263,264,5,11,0,0,264,265,5,58,0,0,265,
	266,3,36,18,0,266,33,1,0,0,0,267,271,5,46,0,0,268,270,5,48,0,0,269,268,
	1,0,0,0,270,273,1,0,0,0,271,269,1,0,0,0,271,272,1,0,0,0,272,274,1,0,0,0,
	273,271,1,0,0,0,274,278,3,36,18,0,275,277,5,48,0,0,276,275,1,0,0,0,277,
	280,1,0,0,0,278,276,1,0,0,0,278,279,1,0,0,0,279,281,1,0,0,0,280,278,1,0,
	0,0,281,282,5,47,0,0,282,35,1,0,0,0,283,287,3,40,20,0,284,287,3,42,21,0,
	285,287,3,46,23,0,286,283,1,0,0,0,286,284,1,0,0,0,286,285,1,0,0,0,287,37,
	1,0,0,0,288,291,3,18,9,0,289,291,3,34,17,0,290,288,1,0,0,0,290,289,1,0,
	0,0,291,39,1,0,0,0,292,293,5,13,0,0,293,294,3,60,30,0,294,41,1,0,0,0,295,
	299,5,38,0,0,296,298,5,48,0,0,297,296,1,0,0,0,298,301,1,0,0,0,299,297,1,
	0,0,0,299,300,1,0,0,0,300,302,1,0,0,0,301,299,1,0,0,0,302,306,5,52,0,0,
	303,305,5,48,0,0,304,303,1,0,0,0,305,308,1,0,0,0,306,304,1,0,0,0,306,307,
	1,0,0,0,307,325,1,0,0,0,308,306,1,0,0,0,309,313,3,38,19,0,310,312,5,48,
	0,0,311,310,1,0,0,0,312,315,1,0,0,0,313,311,1,0,0,0,313,314,1,0,0,0,314,
	316,1,0,0,0,315,313,1,0,0,0,316,320,5,54,0,0,317,319,5,48,0,0,318,317,1,
	0,0,0,319,322,1,0,0,0,320,318,1,0,0,0,320,321,1,0,0,0,321,324,1,0,0,0,322,
	320,1,0,0,0,323,309,1,0,0,0,324,327,1,0,0,0,325,323,1,0,0,0,325,326,1,0,
	0,0,326,328,1,0,0,0,327,325,1,0,0,0,328,332,3,38,19,0,329,331,5,48,0,0,
	330,329,1,0,0,0,331,334,1,0,0,0,332,330,1,0,0,0,332,333,1,0,0,0,333,335,
	1,0,0,0,334,332,1,0,0,0,335,339,5,53,0,0,336,338,5,48,0,0,337,336,1,0,0,
	0,338,341,1,0,0,0,339,337,1,0,0,0,339,340,1,0,0,0,340,43,1,0,0,0,341,339,
	1,0,0,0,342,343,5,9,0,0,343,45,1,0,0,0,344,346,5,48,0,0,345,344,1,0,0,0,
	345,346,1,0,0,0,346,347,1,0,0,0,347,348,5,41,0,0,348,352,5,50,0,0,349,351,
	5,48,0,0,350,349,1,0,0,0,351,354,1,0,0,0,352,350,1,0,0,0,352,353,1,0,0,
	0,353,355,1,0,0,0,354,352,1,0,0,0,355,359,3,52,26,0,356,358,5,48,0,0,357,
	356,1,0,0,0,358,361,1,0,0,0,359,357,1,0,0,0,359,360,1,0,0,0,360,362,1,0,
	0,0,361,359,1,0,0,0,362,366,5,51,0,0,363,365,5,48,0,0,364,363,1,0,0,0,365,
	368,1,0,0,0,366,364,1,0,0,0,366,367,1,0,0,0,367,369,1,0,0,0,368,366,1,0,
	0,0,369,373,3,38,19,0,370,372,5,48,0,0,371,370,1,0,0,0,372,375,1,0,0,0,
	373,371,1,0,0,0,373,374,1,0,0,0,374,384,1,0,0,0,375,373,1,0,0,0,376,380,
	5,42,0,0,377,379,5,48,0,0,378,377,1,0,0,0,379,382,1,0,0,0,380,378,1,0,0,
	0,380,381,1,0,0,0,381,383,1,0,0,0,382,380,1,0,0,0,383,385,3,38,19,0,384,
	376,1,0,0,0,384,385,1,0,0,0,385,47,1,0,0,0,386,387,5,12,0,0,387,49,1,0,
	0,0,388,389,5,50,0,0,389,390,3,52,26,0,390,391,5,51,0,0,391,51,1,0,0,0,
	392,395,3,54,27,0,393,395,3,56,28,0,394,392,1,0,0,0,394,393,1,0,0,0,395,
	53,1,0,0,0,396,397,5,16,0,0,397,398,3,22,11,0,398,55,1,0,0,0,399,400,5,
	15,0,0,400,401,3,20,10,0,401,57,1,0,0,0,402,406,5,46,0,0,403,405,5,48,0,
	0,404,403,1,0,0,0,405,408,1,0,0,0,406,404,1,0,0,0,406,407,1,0,0,0,407,412,
	1,0,0,0,408,406,1,0,0,0,409,411,5,48,0,0,410,409,1,0,0,0,411,414,1,0,0,
	0,412,410,1,0,0,0,412,413,1,0,0,0,413,415,1,0,0,0,414,412,1,0,0,0,415,416,
	5,47,0,0,416,59,1,0,0,0,417,419,3,18,9,0,418,420,3,58,29,0,419,418,1,0,
	0,0,419,420,1,0,0,0,420,61,1,0,0,0,47,65,74,79,83,99,107,115,124,134,152,
	159,166,172,178,182,187,202,213,220,227,237,242,247,252,258,271,278,286,
	290,299,306,313,320,325,332,339,345,352,359,366,373,380,384,394,406,412,
	419];

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
	public surfaceStatement(): SurfaceStatementContext {
		return this.getTypedRuleContext(SurfaceStatementContext, 0) as SurfaceStatementContext;
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
	public statement_list(): StatementContext[] {
		return this.getTypedRuleContexts(StatementContext) as StatementContext[];
	}
	public statement(i: number): StatementContext {
		return this.getTypedRuleContext(StatementContext, i) as StatementContext;
	}
	public NewLine_list(): TerminalNode[] {
	    	return this.getTokens(MMSParse.NewLine);
	}
	public NewLine(i: number): TerminalNode {
		return this.getToken(MMSParse.NewLine, i);
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
	public Quote_list(): TerminalNode[] {
	    	return this.getTokens(MMSParse.Quote);
	}
	public Quote(i: number): TerminalNode {
		return this.getToken(MMSParse.Quote, i);
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


export class VerticalAnchorContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public Integer(): TerminalNode {
		return this.getToken(MMSParse.Integer, 0);
	}
	public Keyword_Absolute(): TerminalNode {
		return this.getToken(MMSParse.Keyword_Absolute, 0);
	}
	public Keyword_AboveBottom(): TerminalNode {
		return this.getToken(MMSParse.Keyword_AboveBottom, 0);
	}
	public Keyword_BelowTop(): TerminalNode {
		return this.getToken(MMSParse.Keyword_BelowTop, 0);
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_verticalAnchor;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterVerticalAnchor) {
	 		listener.enterVerticalAnchor(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitVerticalAnchor) {
	 		listener.exitVerticalAnchor(this);
		}
	}
}


export class ReferenceArrayContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public SquareOpen(): TerminalNode {
		return this.getToken(MMSParse.SquareOpen, 0);
	}
	public reference_list(): ReferenceContext[] {
		return this.getTypedRuleContexts(ReferenceContext) as ReferenceContext[];
	}
	public reference(i: number): ReferenceContext {
		return this.getTypedRuleContext(ReferenceContext, i) as ReferenceContext;
	}
	public SquareClose(): TerminalNode {
		return this.getToken(MMSParse.SquareClose, 0);
	}
	public NewLine_list(): TerminalNode[] {
	    	return this.getTokens(MMSParse.NewLine);
	}
	public NewLine(i: number): TerminalNode {
		return this.getToken(MMSParse.NewLine, i);
	}
	public Comma_list(): TerminalNode[] {
	    	return this.getTokens(MMSParse.Comma);
	}
	public Comma(i: number): TerminalNode {
		return this.getToken(MMSParse.Comma, i);
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_referenceArray;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterReferenceArray) {
	 		listener.enterReferenceArray(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitReferenceArray) {
	 		listener.exitReferenceArray(this);
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


export class SurfaceStatementContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public Keyword_Surface(): TerminalNode {
		return this.getToken(MMSParse.Keyword_Surface, 0);
	}
	public BlockStart(): TerminalNode {
		return this.getToken(MMSParse.BlockStart, 0);
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
	public surfaceRuleDeclaration_list(): SurfaceRuleDeclarationContext[] {
		return this.getTypedRuleContexts(SurfaceRuleDeclarationContext) as SurfaceRuleDeclarationContext[];
	}
	public surfaceRuleDeclaration(i: number): SurfaceRuleDeclarationContext {
		return this.getTypedRuleContext(SurfaceRuleDeclarationContext, i) as SurfaceRuleDeclarationContext;
	}
	public surfaceConditionDeclaration_list(): SurfaceConditionDeclarationContext[] {
		return this.getTypedRuleContexts(SurfaceConditionDeclarationContext) as SurfaceConditionDeclarationContext[];
	}
	public surfaceConditionDeclaration(i: number): SurfaceConditionDeclarationContext {
		return this.getTypedRuleContext(SurfaceConditionDeclarationContext, i) as SurfaceConditionDeclarationContext;
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_surfaceStatement;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterSurfaceStatement) {
	 		listener.enterSurfaceStatement(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitSurfaceStatement) {
	 		listener.exitSurfaceStatement(this);
		}
	}
}


export class SurfaceRuleDeclarationContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public Keyword_Rule(): TerminalNode {
		return this.getToken(MMSParse.Keyword_Rule, 0);
	}
	public Identifier(): TerminalNode {
		return this.getToken(MMSParse.Identifier, 0);
	}
	public surfaceRule(): SurfaceRuleContext {
		return this.getTypedRuleContext(SurfaceRuleContext, 0) as SurfaceRuleContext;
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_surfaceRuleDeclaration;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterSurfaceRuleDeclaration) {
	 		listener.enterSurfaceRuleDeclaration(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitSurfaceRuleDeclaration) {
	 		listener.exitSurfaceRuleDeclaration(this);
		}
	}
}


export class SurfaceRuleInlineContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public BlockStart(): TerminalNode {
		return this.getToken(MMSParse.BlockStart, 0);
	}
	public surfaceRule(): SurfaceRuleContext {
		return this.getTypedRuleContext(SurfaceRuleContext, 0) as SurfaceRuleContext;
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
    	return MMSParse.RULE_surfaceRuleInline;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterSurfaceRuleInline) {
	 		listener.enterSurfaceRuleInline(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitSurfaceRuleInline) {
	 		listener.exitSurfaceRuleInline(this);
		}
	}
}


export class SurfaceRuleContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public blockSurfaceRule(): BlockSurfaceRuleContext {
		return this.getTypedRuleContext(BlockSurfaceRuleContext, 0) as BlockSurfaceRuleContext;
	}
	public sequenceSurfaceRule(): SequenceSurfaceRuleContext {
		return this.getTypedRuleContext(SequenceSurfaceRuleContext, 0) as SequenceSurfaceRuleContext;
	}
	public conditionSurfaceRule(): ConditionSurfaceRuleContext {
		return this.getTypedRuleContext(ConditionSurfaceRuleContext, 0) as ConditionSurfaceRuleContext;
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_surfaceRule;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterSurfaceRule) {
	 		listener.enterSurfaceRule(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitSurfaceRule) {
	 		listener.exitSurfaceRule(this);
		}
	}
}


export class SurfaceRuleReferenceContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public reference(): ReferenceContext {
		return this.getTypedRuleContext(ReferenceContext, 0) as ReferenceContext;
	}
	public surfaceRuleInline(): SurfaceRuleInlineContext {
		return this.getTypedRuleContext(SurfaceRuleInlineContext, 0) as SurfaceRuleInlineContext;
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_surfaceRuleReference;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterSurfaceRuleReference) {
	 		listener.enterSurfaceRuleReference(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitSurfaceRuleReference) {
	 		listener.exitSurfaceRuleReference(this);
		}
	}
}


export class BlockSurfaceRuleContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public Keyword_Block(): TerminalNode {
		return this.getToken(MMSParse.Keyword_Block, 0);
	}
	public blockState(): BlockStateContext {
		return this.getTypedRuleContext(BlockStateContext, 0) as BlockStateContext;
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_blockSurfaceRule;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterBlockSurfaceRule) {
	 		listener.enterBlockSurfaceRule(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitBlockSurfaceRule) {
	 		listener.exitBlockSurfaceRule(this);
		}
	}
}


export class SequenceSurfaceRuleContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public Keyword_Sequence(): TerminalNode {
		return this.getToken(MMSParse.Keyword_Sequence, 0);
	}
	public SquareOpen(): TerminalNode {
		return this.getToken(MMSParse.SquareOpen, 0);
	}
	public surfaceRuleReference_list(): SurfaceRuleReferenceContext[] {
		return this.getTypedRuleContexts(SurfaceRuleReferenceContext) as SurfaceRuleReferenceContext[];
	}
	public surfaceRuleReference(i: number): SurfaceRuleReferenceContext {
		return this.getTypedRuleContext(SurfaceRuleReferenceContext, i) as SurfaceRuleReferenceContext;
	}
	public SquareClose(): TerminalNode {
		return this.getToken(MMSParse.SquareClose, 0);
	}
	public NewLine_list(): TerminalNode[] {
	    	return this.getTokens(MMSParse.NewLine);
	}
	public NewLine(i: number): TerminalNode {
		return this.getToken(MMSParse.NewLine, i);
	}
	public Comma_list(): TerminalNode[] {
	    	return this.getTokens(MMSParse.Comma);
	}
	public Comma(i: number): TerminalNode {
		return this.getToken(MMSParse.Comma, i);
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_sequenceSurfaceRule;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterSequenceSurfaceRule) {
	 		listener.enterSequenceSurfaceRule(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitSequenceSurfaceRule) {
	 		listener.exitSequenceSurfaceRule(this);
		}
	}
}


export class BandlandsSurfaceRuleContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public Keyword_Bandlands(): TerminalNode {
		return this.getToken(MMSParse.Keyword_Bandlands, 0);
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_bandlandsSurfaceRule;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterBandlandsSurfaceRule) {
	 		listener.enterBandlandsSurfaceRule(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitBandlandsSurfaceRule) {
	 		listener.exitBandlandsSurfaceRule(this);
		}
	}
}


export class ConditionSurfaceRuleContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public Keyword_If(): TerminalNode {
		return this.getToken(MMSParse.Keyword_If, 0);
	}
	public RoundOpen(): TerminalNode {
		return this.getToken(MMSParse.RoundOpen, 0);
	}
	public surfaceCondition(): SurfaceConditionContext {
		return this.getTypedRuleContext(SurfaceConditionContext, 0) as SurfaceConditionContext;
	}
	public RoundClose(): TerminalNode {
		return this.getToken(MMSParse.RoundClose, 0);
	}
	public surfaceRuleReference_list(): SurfaceRuleReferenceContext[] {
		return this.getTypedRuleContexts(SurfaceRuleReferenceContext) as SurfaceRuleReferenceContext[];
	}
	public surfaceRuleReference(i: number): SurfaceRuleReferenceContext {
		return this.getTypedRuleContext(SurfaceRuleReferenceContext, i) as SurfaceRuleReferenceContext;
	}
	public NewLine_list(): TerminalNode[] {
	    	return this.getTokens(MMSParse.NewLine);
	}
	public NewLine(i: number): TerminalNode {
		return this.getToken(MMSParse.NewLine, i);
	}
	public Keyword_Else(): TerminalNode {
		return this.getToken(MMSParse.Keyword_Else, 0);
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_conditionSurfaceRule;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterConditionSurfaceRule) {
	 		listener.enterConditionSurfaceRule(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitConditionSurfaceRule) {
	 		listener.exitConditionSurfaceRule(this);
		}
	}
}


export class SurfaceConditionDeclarationContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public Keyword_Condition(): TerminalNode {
		return this.getToken(MMSParse.Keyword_Condition, 0);
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_surfaceConditionDeclaration;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterSurfaceConditionDeclaration) {
	 		listener.enterSurfaceConditionDeclaration(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitSurfaceConditionDeclaration) {
	 		listener.exitSurfaceConditionDeclaration(this);
		}
	}
}


export class SurfaceConditionInlineContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public RoundOpen(): TerminalNode {
		return this.getToken(MMSParse.RoundOpen, 0);
	}
	public surfaceCondition(): SurfaceConditionContext {
		return this.getTypedRuleContext(SurfaceConditionContext, 0) as SurfaceConditionContext;
	}
	public RoundClose(): TerminalNode {
		return this.getToken(MMSParse.RoundClose, 0);
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_surfaceConditionInline;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterSurfaceConditionInline) {
	 		listener.enterSurfaceConditionInline(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitSurfaceConditionInline) {
	 		listener.exitSurfaceConditionInline(this);
		}
	}
}


export class SurfaceConditionContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public biomeSurfaceCondition(): BiomeSurfaceConditionContext {
		return this.getTypedRuleContext(BiomeSurfaceConditionContext, 0) as BiomeSurfaceConditionContext;
	}
	public abovePreliminarySurfaceCondition(): AbovePreliminarySurfaceConditionContext {
		return this.getTypedRuleContext(AbovePreliminarySurfaceConditionContext, 0) as AbovePreliminarySurfaceConditionContext;
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_surfaceCondition;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterSurfaceCondition) {
	 		listener.enterSurfaceCondition(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitSurfaceCondition) {
	 		listener.exitSurfaceCondition(this);
		}
	}
}


export class BiomeSurfaceConditionContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public Keyword_Biome(): TerminalNode {
		return this.getToken(MMSParse.Keyword_Biome, 0);
	}
	public referenceArray(): ReferenceArrayContext {
		return this.getTypedRuleContext(ReferenceArrayContext, 0) as ReferenceArrayContext;
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_biomeSurfaceCondition;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterBiomeSurfaceCondition) {
	 		listener.enterBiomeSurfaceCondition(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitBiomeSurfaceCondition) {
	 		listener.exitBiomeSurfaceCondition(this);
		}
	}
}


export class AbovePreliminarySurfaceConditionContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public Keyword_AbovePreliminarySurface(): TerminalNode {
		return this.getToken(MMSParse.Keyword_AbovePreliminarySurface, 0);
	}
	public verticalAnchor(): VerticalAnchorContext {
		return this.getTypedRuleContext(VerticalAnchorContext, 0) as VerticalAnchorContext;
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_abovePreliminarySurfaceCondition;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterAbovePreliminarySurfaceCondition) {
	 		listener.enterAbovePreliminarySurfaceCondition(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitAbovePreliminarySurfaceCondition) {
	 		listener.exitAbovePreliminarySurfaceCondition(this);
		}
	}
}


export class BlockPropertiesContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public BlockStart(): TerminalNode {
		return this.getToken(MMSParse.BlockStart, 0);
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
    	return MMSParse.RULE_blockProperties;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterBlockProperties) {
	 		listener.enterBlockProperties(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitBlockProperties) {
	 		listener.exitBlockProperties(this);
		}
	}
}


export class BlockStateContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public reference(): ReferenceContext {
		return this.getTypedRuleContext(ReferenceContext, 0) as ReferenceContext;
	}
	public blockProperties(): BlockPropertiesContext {
		return this.getTypedRuleContext(BlockPropertiesContext, 0) as BlockPropertiesContext;
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_blockState;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterBlockState) {
	 		listener.enterBlockState(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitBlockState) {
	 		listener.exitBlockState(this);
		}
	}
}
