import type { FileContext } from "../grammar/MMSParse";
import { ParseTreeWalker } from "antlr4";
import { DensityFunctionListener } from "./DensityFunctionListener";
import { NoiseListener } from "./NoiseListener";
import { FileListener } from "./FileListener";
import { SurfaceRuleListener } from "./SurfaceRuleListener";
import { BlockStateListener } from "./BlockStateListener";
import { BaseListener } from "./BaseListener";

export const processFile = (file: FileContext) => {
  const walker = new ParseTreeWalker();
  const baseListener = new BaseListener();
  const densityListener = new DensityFunctionListener();
  const noiseListener = new NoiseListener();
  const fileListener = new FileListener();
  const surfaceRuleListener = new SurfaceRuleListener();
  const blockStateListener = new BlockStateListener();
  walker.walk(baseListener, file);
  walker.walk(densityListener, file);
  walker.walk(noiseListener, file);
  walker.walk(fileListener, file);
  walker.walk(blockStateListener, file);
  walker.walk(surfaceRuleListener, file);

  return {
    [densityListener.category]: densityListener.data,
    [noiseListener.category]: noiseListener.data,
    [fileListener.category]: fileListener.data,
    [surfaceRuleListener.category]: surfaceRuleListener.data,
    [blockStateListener.category]: blockStateListener.data,
  };
};
