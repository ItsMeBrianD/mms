import type { BlockStateContext } from "../grammar/MMSParse";
import MMSParseListener from "../grammar/MMSParseListener";
import type { DataExportListener } from "./types";

declare module "../grammar/MMSParse" {
    interface BlockStateContext {
        block?: string;   
    }
}

export class BlockStateListener
  extends MMSParseListener
  implements DataExportListener<{}>
{
  readonly category = "block_state";
  get data() {
    return {};
  }

  enterBlockState = (ctx: BlockStateContext) => {
    ctx.block = ctx.reference().namespace + ":" + ctx.reference().id;
    // TODO: Properties
  }
}
