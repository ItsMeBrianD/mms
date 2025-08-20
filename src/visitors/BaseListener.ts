import type { ReferenceContext } from "../grammar/MMSParse";
import MMSParse from "../grammar/MMSParse";
import MMSParseListener from "../grammar/MMSParseListener";

declare module "../grammar/MMSParse" {
    interface ReferenceContext {
        namespace: string;
        id: string;
    }
}

export class BaseListener extends MMSParseListener {
    enterReference = (ctx: ReferenceContext) => {
        ctx.namespace = ctx.getToken(MMSParse.Identifier, 0).getText();
        ctx.id = ctx.getToken(MMSParse.Identifier, 1).getText();
    }
}