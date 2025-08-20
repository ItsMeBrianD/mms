import type { FileContext } from "../grammar/MMSParse";
import { ParseTreeWalker } from "antlr4";
import { DensityFunctionListener } from "./DensityFunctionListener";
import { NoiseListener } from "./NoiseListener";
import { FileListener } from "./FileListener";

export const processFile = (file: FileContext) => {
  const walker = new ParseTreeWalker();
  const densityListener = new DensityFunctionListener();
  const noiseListener = new NoiseListener();
  const fileListener = new FileListener();
  walker.walk(densityListener, file);
  walker.walk(noiseListener, file);
  walker.walk(fileListener, file);

  return {
    [densityListener.category]: densityListener.data,
    [noiseListener.category]: noiseListener.data,
    [fileListener.category]: fileListener.data,
  };
};
