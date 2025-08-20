import type { ParserRuleContext } from "antlr4";
import * as v from "valibot";

export const extractNumbers = (
  ctx: ParserRuleContext & { parsedValues?: number[] },
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
      v.transform((input) => {
        input.replace("[", "");
        input.replace("]", "");
        return input.split(",").map((item) => parseFloat(item));
      }),
    ),
    value,
  );
  ctx.parsedValues = result;
};
