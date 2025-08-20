import {
  BlockSurfaceRuleContext,
  ConditionSurfaceRuleContext,
  ReferenceContext,
  SequenceSurfaceRuleContext,
  SurfaceRuleContext,
  SurfaceRuleInlineContext,
} from "../../grammar/MMSParse";

export type SurfaceCondition = any;

export type BlockSurfaceRule = {
  type: "minecraft:block";
  block: string;
};

export type SequenceSurfaceRule = {
  type: "minecraft:sequence";
  sequence: SurfaceRule[];
};

export type ConditionSurfaceRule = {
  type: "minecraft:condition";
  if_true: SurfaceCondition;
  then_run: SurfaceRule;
};

export type SurfaceRule =
  | BlockSurfaceRule
  | SequenceSurfaceRule
  | ConditionSurfaceRule
  | `${string}:${string}`;

const serializeBlockSurfaceRule = (
  ctx: BlockSurfaceRuleContext,
): SurfaceRule => {
  const block = ctx.blockState().block;
  if (!block) throw new Error("Block state has no block");
  return {
    type: "minecraft:block",
    block,
  };
};

const serializeSequenceSurfaceRule = (
  ctx: SequenceSurfaceRuleContext,
): SurfaceRule => {
  return {
    type: "minecraft:sequence",
    sequence: ctx.surfaceRuleReference_list().map((r) => {
      if (r.surfaceRuleInline()) {
        return serializeSurfaceRule(r.surfaceRuleInline().surfaceRule());
      }
      if (r.reference()) {
        return `${r.reference().namespace}:${r.reference().id}` as const;
      }

      throw new Error("Invalid surface rule reference");
    }),
  };
};

const serializeConditionSurfaceRule = (
  ctx: ConditionSurfaceRuleContext,
): SurfaceRule => {
  const condition = ctx.surfaceCondition();
  console.log(condition.getText());

  const [happy, sad] = ctx
    .surfaceRuleReference_list()
    .map(
      (r): SurfaceRuleInlineContext | ReferenceContext =>
        r.surfaceRuleInline() ?? r.reference(),
    );
  const happySerialized =
    happy instanceof SurfaceRuleInlineContext
      ? serializeSurfaceRule(happy.surfaceRule())
      : (`${happy.namespace}:${happy.id}` as const);

  if (sad) {
    const sadSerialized =
      sad instanceof SurfaceRuleInlineContext
        ? serializeSurfaceRule(sad.surfaceRule())
        : (`${sad.namespace}:${sad.id}` as const);

    return {
      type: "minecraft:sequence",
      sequence: [
        {
          type: "minecraft:condition",
          if_true: condition.serialized,
          then_run: happySerialized,
        },
        {
          type: "minecraft:condition",
          if_true: {
            type: "minecraft:not",
            invert: condition.serialized,
          },
          then_run: sadSerialized ?? "minecraft:empty",
        },
      ],
    };
  } else {
    return {
      type: "minecraft:condition",
      if_true: condition.serialized,
      then_run: happySerialized,
    };
  }
};

export const serializeSurfaceRule = (ctx: SurfaceRuleContext): SurfaceRule => {
  if (ctx.blockSurfaceRule()) {
    const rule = ctx.blockSurfaceRule();
    return serializeBlockSurfaceRule(rule);
  }
  if (ctx.sequenceSurfaceRule()) {
    const rule = ctx.sequenceSurfaceRule();
    return serializeSequenceSurfaceRule(rule);
  }
  if (ctx.conditionSurfaceRule()) {
    const rule = ctx.conditionSurfaceRule();
    return serializeConditionSurfaceRule(rule);
  }
  throw new Error("Invalid surface rule");
};
