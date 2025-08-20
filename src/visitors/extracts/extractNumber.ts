import type { ParserRuleContext, ParseTree } from "antlr4";
import * as v from "valibot";

export const extractNumber = (
  ctx: ParserRuleContext & { parsedValue?: number },
  childIdx: number,
) => {
  if (!ctx.children)
    throw new Error(
      `Failed to extract number from ${ctx.getText()} at ${ctx.start.line}:${ctx.start.column}`,
    );
  const target = ctx.children[childIdx];
  const value = target.getText();
  const result = v.parse(
    v.pipe(
      v.string(),
      v.transform((input) => parseFloat(input)),
    ),
    value,
  );
  ctx.parsedValue = result;
};
