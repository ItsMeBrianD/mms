import {
  DensityNoiseLineContext,
  DensityNoiseStatementContext,
  DensityXZScaleLineContext,
  DensityYScaleLineContext,
} from "../grammar/MMSParse";
import MMSParseListener from "../grammar/MMSParseListener";
import { extractNumber } from "./extracts/extractNumber";
import { extractReference } from "./extracts/extractReference";
import type { DataExportListener } from "./types";

declare module "../grammar/MMSParse" {
  interface DensityXZScaleLineContext {
    parsedValue?: number;
  }

  interface DensityYScaleLineContext {
    parsedValue?: number;
  }

  interface DensityNoiseLineContext {
    parsedReference?: string;
  }

  interface DensityNoiseStatementContext {
    name?: string;
  }
}

export class DensityFunctionListener
  extends MMSParseListener
  implements DataExportListener<Map<string, object>>
{
  readonly densityFunctions: Map<string, object> = new Map();
  readonly category = "density_functions";

  get data() {
    return this.densityFunctions;
  }

  enterDensityXZScaleLine = (ctx: DensityXZScaleLineContext) => {
    extractNumber(ctx, 1);
  };
  enterDensityYScaleLine = (ctx: DensityYScaleLineContext) => {
    extractNumber(ctx, 1);
  };
  enterDensityNoiseLine = (ctx: DensityNoiseLineContext) => {
    extractReference(ctx, 1);
  };
  enterDensityNoiseStatement = (ctx: DensityNoiseStatementContext) => {
    ctx.name = ctx.Identifier().getText();
  };
  exitDensityNoiseStatement = (ctx: DensityNoiseStatementContext) => {
    const output = {
      type: "minecraft:noise",
      xz_scale: ctx.children?.find(
        (child) => child instanceof DensityXZScaleLineContext,
      )?.parsedValue,
      y_scale: ctx.children?.find(
        (child) => child instanceof DensityYScaleLineContext,
      )?.parsedValue,
      noise: ctx.children?.find(
        (child) => child instanceof DensityNoiseLineContext,
      )?.parsedReference,
    };
    if (!ctx.name) throw new Error("No name found");
    this.densityFunctions.set(ctx.name, output);
  };
}
