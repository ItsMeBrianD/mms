// Generated from ./grammar/MMSParse.g4 by ANTLR 4.13.2

import {ParseTreeListener} from "antlr4";


import { StatementContext } from "./MMSParse.js";
import { NamespaceStatementContext } from "./MMSParse.js";
import { FileContext } from "./MMSParse.js";
import { DensityStatementContext } from "./MMSParse.js";
import { DensityNoiseDeclarationContext } from "./MMSParse.js";
import { DensityNoiseLineContext } from "./MMSParse.js";
import { DensityXZScaleLineContext } from "./MMSParse.js";
import { DensityYScaleLineContext } from "./MMSParse.js";
import { DensityNoiseStatementContext } from "./MMSParse.js";
import { ReferenceContext } from "./MMSParse.js";
import { VerticalAnchorContext } from "./MMSParse.js";
import { ReferenceArrayContext } from "./MMSParse.js";
import { NoiseFirstOctaveLineContext } from "./MMSParse.js";
import { NoiseAmplitudesContext } from "./MMSParse.js";
import { NoiseStatementContext } from "./MMSParse.js";
import { SurfaceStatementContext } from "./MMSParse.js";
import { SurfaceRuleDeclarationContext } from "./MMSParse.js";
import { SurfaceRuleInlineContext } from "./MMSParse.js";
import { SurfaceRuleContext } from "./MMSParse.js";
import { SurfaceRuleReferenceContext } from "./MMSParse.js";
import { BlockSurfaceRuleContext } from "./MMSParse.js";
import { SequenceSurfaceRuleContext } from "./MMSParse.js";
import { BandlandsSurfaceRuleContext } from "./MMSParse.js";
import { ConditionSurfaceRuleContext } from "./MMSParse.js";
import { SurfaceConditionDeclarationContext } from "./MMSParse.js";
import { SurfaceConditionInlineContext } from "./MMSParse.js";
import { SurfaceConditionContext } from "./MMSParse.js";
import { BiomeSurfaceConditionContext } from "./MMSParse.js";
import { AbovePreliminarySurfaceConditionContext } from "./MMSParse.js";
import { BlockPropertiesContext } from "./MMSParse.js";
import { BlockStateContext } from "./MMSParse.js";


/**
 * This interface defines a complete listener for a parse tree produced by
 * `MMSParse`.
 */
export default class MMSParseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by `MMSParse.statement`.
	 * @param ctx the parse tree
	 */
	enterStatement?: (ctx: StatementContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.statement`.
	 * @param ctx the parse tree
	 */
	exitStatement?: (ctx: StatementContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.namespaceStatement`.
	 * @param ctx the parse tree
	 */
	enterNamespaceStatement?: (ctx: NamespaceStatementContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.namespaceStatement`.
	 * @param ctx the parse tree
	 */
	exitNamespaceStatement?: (ctx: NamespaceStatementContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.file`.
	 * @param ctx the parse tree
	 */
	enterFile?: (ctx: FileContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.file`.
	 * @param ctx the parse tree
	 */
	exitFile?: (ctx: FileContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.densityStatement`.
	 * @param ctx the parse tree
	 */
	enterDensityStatement?: (ctx: DensityStatementContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.densityStatement`.
	 * @param ctx the parse tree
	 */
	exitDensityStatement?: (ctx: DensityStatementContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.densityNoiseDeclaration`.
	 * @param ctx the parse tree
	 */
	enterDensityNoiseDeclaration?: (ctx: DensityNoiseDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.densityNoiseDeclaration`.
	 * @param ctx the parse tree
	 */
	exitDensityNoiseDeclaration?: (ctx: DensityNoiseDeclarationContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.densityNoiseLine`.
	 * @param ctx the parse tree
	 */
	enterDensityNoiseLine?: (ctx: DensityNoiseLineContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.densityNoiseLine`.
	 * @param ctx the parse tree
	 */
	exitDensityNoiseLine?: (ctx: DensityNoiseLineContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.densityXZScaleLine`.
	 * @param ctx the parse tree
	 */
	enterDensityXZScaleLine?: (ctx: DensityXZScaleLineContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.densityXZScaleLine`.
	 * @param ctx the parse tree
	 */
	exitDensityXZScaleLine?: (ctx: DensityXZScaleLineContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.densityYScaleLine`.
	 * @param ctx the parse tree
	 */
	enterDensityYScaleLine?: (ctx: DensityYScaleLineContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.densityYScaleLine`.
	 * @param ctx the parse tree
	 */
	exitDensityYScaleLine?: (ctx: DensityYScaleLineContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.densityNoiseStatement`.
	 * @param ctx the parse tree
	 */
	enterDensityNoiseStatement?: (ctx: DensityNoiseStatementContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.densityNoiseStatement`.
	 * @param ctx the parse tree
	 */
	exitDensityNoiseStatement?: (ctx: DensityNoiseStatementContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.reference`.
	 * @param ctx the parse tree
	 */
	enterReference?: (ctx: ReferenceContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.reference`.
	 * @param ctx the parse tree
	 */
	exitReference?: (ctx: ReferenceContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.verticalAnchor`.
	 * @param ctx the parse tree
	 */
	enterVerticalAnchor?: (ctx: VerticalAnchorContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.verticalAnchor`.
	 * @param ctx the parse tree
	 */
	exitVerticalAnchor?: (ctx: VerticalAnchorContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.referenceArray`.
	 * @param ctx the parse tree
	 */
	enterReferenceArray?: (ctx: ReferenceArrayContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.referenceArray`.
	 * @param ctx the parse tree
	 */
	exitReferenceArray?: (ctx: ReferenceArrayContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.noiseFirstOctaveLine`.
	 * @param ctx the parse tree
	 */
	enterNoiseFirstOctaveLine?: (ctx: NoiseFirstOctaveLineContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.noiseFirstOctaveLine`.
	 * @param ctx the parse tree
	 */
	exitNoiseFirstOctaveLine?: (ctx: NoiseFirstOctaveLineContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.noiseAmplitudes`.
	 * @param ctx the parse tree
	 */
	enterNoiseAmplitudes?: (ctx: NoiseAmplitudesContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.noiseAmplitudes`.
	 * @param ctx the parse tree
	 */
	exitNoiseAmplitudes?: (ctx: NoiseAmplitudesContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.noiseStatement`.
	 * @param ctx the parse tree
	 */
	enterNoiseStatement?: (ctx: NoiseStatementContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.noiseStatement`.
	 * @param ctx the parse tree
	 */
	exitNoiseStatement?: (ctx: NoiseStatementContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.surfaceStatement`.
	 * @param ctx the parse tree
	 */
	enterSurfaceStatement?: (ctx: SurfaceStatementContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.surfaceStatement`.
	 * @param ctx the parse tree
	 */
	exitSurfaceStatement?: (ctx: SurfaceStatementContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.surfaceRuleDeclaration`.
	 * @param ctx the parse tree
	 */
	enterSurfaceRuleDeclaration?: (ctx: SurfaceRuleDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.surfaceRuleDeclaration`.
	 * @param ctx the parse tree
	 */
	exitSurfaceRuleDeclaration?: (ctx: SurfaceRuleDeclarationContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.surfaceRuleInline`.
	 * @param ctx the parse tree
	 */
	enterSurfaceRuleInline?: (ctx: SurfaceRuleInlineContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.surfaceRuleInline`.
	 * @param ctx the parse tree
	 */
	exitSurfaceRuleInline?: (ctx: SurfaceRuleInlineContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.surfaceRule`.
	 * @param ctx the parse tree
	 */
	enterSurfaceRule?: (ctx: SurfaceRuleContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.surfaceRule`.
	 * @param ctx the parse tree
	 */
	exitSurfaceRule?: (ctx: SurfaceRuleContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.surfaceRuleReference`.
	 * @param ctx the parse tree
	 */
	enterSurfaceRuleReference?: (ctx: SurfaceRuleReferenceContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.surfaceRuleReference`.
	 * @param ctx the parse tree
	 */
	exitSurfaceRuleReference?: (ctx: SurfaceRuleReferenceContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.blockSurfaceRule`.
	 * @param ctx the parse tree
	 */
	enterBlockSurfaceRule?: (ctx: BlockSurfaceRuleContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.blockSurfaceRule`.
	 * @param ctx the parse tree
	 */
	exitBlockSurfaceRule?: (ctx: BlockSurfaceRuleContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.sequenceSurfaceRule`.
	 * @param ctx the parse tree
	 */
	enterSequenceSurfaceRule?: (ctx: SequenceSurfaceRuleContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.sequenceSurfaceRule`.
	 * @param ctx the parse tree
	 */
	exitSequenceSurfaceRule?: (ctx: SequenceSurfaceRuleContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.bandlandsSurfaceRule`.
	 * @param ctx the parse tree
	 */
	enterBandlandsSurfaceRule?: (ctx: BandlandsSurfaceRuleContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.bandlandsSurfaceRule`.
	 * @param ctx the parse tree
	 */
	exitBandlandsSurfaceRule?: (ctx: BandlandsSurfaceRuleContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.conditionSurfaceRule`.
	 * @param ctx the parse tree
	 */
	enterConditionSurfaceRule?: (ctx: ConditionSurfaceRuleContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.conditionSurfaceRule`.
	 * @param ctx the parse tree
	 */
	exitConditionSurfaceRule?: (ctx: ConditionSurfaceRuleContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.surfaceConditionDeclaration`.
	 * @param ctx the parse tree
	 */
	enterSurfaceConditionDeclaration?: (ctx: SurfaceConditionDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.surfaceConditionDeclaration`.
	 * @param ctx the parse tree
	 */
	exitSurfaceConditionDeclaration?: (ctx: SurfaceConditionDeclarationContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.surfaceConditionInline`.
	 * @param ctx the parse tree
	 */
	enterSurfaceConditionInline?: (ctx: SurfaceConditionInlineContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.surfaceConditionInline`.
	 * @param ctx the parse tree
	 */
	exitSurfaceConditionInline?: (ctx: SurfaceConditionInlineContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.surfaceCondition`.
	 * @param ctx the parse tree
	 */
	enterSurfaceCondition?: (ctx: SurfaceConditionContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.surfaceCondition`.
	 * @param ctx the parse tree
	 */
	exitSurfaceCondition?: (ctx: SurfaceConditionContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.biomeSurfaceCondition`.
	 * @param ctx the parse tree
	 */
	enterBiomeSurfaceCondition?: (ctx: BiomeSurfaceConditionContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.biomeSurfaceCondition`.
	 * @param ctx the parse tree
	 */
	exitBiomeSurfaceCondition?: (ctx: BiomeSurfaceConditionContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.abovePreliminarySurfaceCondition`.
	 * @param ctx the parse tree
	 */
	enterAbovePreliminarySurfaceCondition?: (ctx: AbovePreliminarySurfaceConditionContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.abovePreliminarySurfaceCondition`.
	 * @param ctx the parse tree
	 */
	exitAbovePreliminarySurfaceCondition?: (ctx: AbovePreliminarySurfaceConditionContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.blockProperties`.
	 * @param ctx the parse tree
	 */
	enterBlockProperties?: (ctx: BlockPropertiesContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.blockProperties`.
	 * @param ctx the parse tree
	 */
	exitBlockProperties?: (ctx: BlockPropertiesContext) => void;
	/**
	 * Enter a parse tree produced by `MMSParse.blockState`.
	 * @param ctx the parse tree
	 */
	enterBlockState?: (ctx: BlockStateContext) => void;
	/**
	 * Exit a parse tree produced by `MMSParse.blockState`.
	 * @param ctx the parse tree
	 */
	exitBlockState?: (ctx: BlockStateContext) => void;
}

