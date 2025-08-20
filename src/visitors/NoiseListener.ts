import {
  NoiseFirstOctaveLineContext,
  NoiseAmplitudesContext,
  type NoiseStatementContext,
} from "../grammar/MMSParse";
import MMSParseListener from "../grammar/MMSParseListener";
import { extractNumber } from "./extracts/extractNumber";
import { extractNumbers } from "./extracts/extractNumbers";
import type { DataExportListener } from "./types";

declare module "../grammar/MMSParse" {
  interface NoiseFirstOctaveLineContext {
    parsedValue?: number;
  }

  interface NoiseAmplitudesContext {
    parsedValues?: number[];
  }

  interface NoiseStatementContext {
    name?: string;
  }
}

export class NoiseListener
  extends MMSParseListener
  implements DataExportListener<Map<string, object>>
{
  readonly noiseFunctions: Map<string, object> = new Map();
  readonly category = "noise";

  get data() {
    return this.noiseFunctions;
  }
  enterNoiseFirstOctaveLine = (ctx: NoiseFirstOctaveLineContext) => {
    extractNumber(ctx, 1);
  };
  enterNoiseAmplitudes = (ctx: NoiseAmplitudesContext) => {
    extractNumbers(ctx, 1);
  };

  enterNoiseStatement = (ctx: NoiseStatementContext) => {
    ctx.name = ctx.Identifier().getText();
  };

  exitNoiseStatement = (ctx: NoiseStatementContext) => {
    const output = {
      type: "minecraft:noise",
      first_octave: ctx.children?.find(
        (child) => child instanceof NoiseFirstOctaveLineContext,
      )?.parsedValue,
      amplitudes: ctx.children?.find(
        (child) => child instanceof NoiseAmplitudesContext,
      )?.parsedValues,
    };
    if (!ctx.name) throw new Error("No name found");
    this.noiseFunctions.set(ctx.name, output);
  };
}
