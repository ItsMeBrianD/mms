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
import { NoiseFirstOctaveLineContext } from "./MMSParse.js";
import { NoiseAmplitudesContext } from "./MMSParse.js";
import { NoiseStatementContext } from "./MMSParse.js";


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
}

