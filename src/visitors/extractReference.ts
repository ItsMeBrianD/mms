import type { ParserRuleContext } from "antlr4";
import * as v from "valibot";

export const extractReference = (
  ctx: ParserRuleContext & { parsedReference?: string },
  childIdx: number,
) => {
  if (!ctx.children)
    throw new Error(
      `Failed to extract reference from ${ctx.getText()} at ${ctx.start.line}:${ctx.start.column}`,
    );
  const target = ctx.children[childIdx];
  const value = target.getText();
  const result = v.parse(v.pipe(v.string(), v.regex(/\w+:\w+/)), value);
  ctx.parsedReference = result;
};
