import {
  NoiseFirstOctaveLineContext,
  NoiseAmplitudesContext,
  type NoiseStatementContext,
  FileContext,
} from "../grammar/MMSParse";
import MMSParseListener from "../grammar/MMSParseListener";
import { extractNumber } from "./extracts/extractNumber";
import { extractNumbers } from "./extracts/extractNumbers";
import type { DataExportListener } from "./types";

declare module "../grammar/MMSParse" {}

export class FileListener
  extends MMSParseListener
  implements
    DataExportListener<{
      name: string;
    }>
{
  readonly category = "script";
  name?: string;
  get data() {
    if (!this.name) throw new Error("Cannot access data, name not set");
    return {
      name: this.name,
    };
  }
  enterFile = (ctx: FileContext) => {
    this.name = ctx.namespaceStatement().Identifier().getText()
  }
}
