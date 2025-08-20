import {
  ConditionSurfaceRuleContext,
  SurfaceConditionContext,
  SurfaceRuleContext,
  SurfaceRuleDeclarationContext,
  type BlockSurfaceRuleContext,
  BiomeSurfaceConditionContext,
} from "../grammar/MMSParse";
import MMSParseListener from "../grammar/MMSParseListener";
import { serializeSurfaceRule, type SurfaceRule } from "./serializers/surfacesRules";
import type { DataExportListener } from "./types";

declare module "../grammar/MMSParse" {
  interface SurfaceConditionContext {
    serialized: SurfaceCondition;
  }
  interface SurfaceRuleContext {
    serialized: SurfaceRule;
  }
  interface SurfaceRuleDeclarationContext {
    name?: string;
  }
}

type BiomeSurfaceCondition = {
  type: "minecraft:biome";
  biome_is: `${string}:${string}`[];
};

type SurfaceCondition = BiomeSurfaceCondition | InvertedSurfaceCondition;

type InvertedSurfaceCondition = {
  type: "minecraft:not";
  invert: SurfaceCondition;
};

export class SurfaceRuleListener
  extends MMSParseListener
  implements
    DataExportListener<{
      rules: Map<string, SurfaceRule>;
    }>
{
  readonly category = "surface_rules";

  private readonly rules = new Map<string, SurfaceRule>();
  get data() {
    return {
      rules: this.rules,
    };
  }
  enterSurfaceRuleDeclaration = (ctx: SurfaceRuleDeclarationContext) => {
    ctx.name = ctx.Identifier().getText();
  };
  exitSurfaceRule = (ctx: SurfaceRuleContext) => {
    ctx.serialized = serializeSurfaceRule(ctx);
  };

  exitSurfaceRuleDeclaration = (ctx: SurfaceRuleDeclarationContext) => {
    if (ctx.name) {
      this.rules.set(ctx.name, ctx.surfaceRule().serialized);
    }
  };

  enterBiomeSurfaceCondition = (ctx: BiomeSurfaceConditionContext) => {
    const biomes = ctx.referenceArray().reference_list();
    const output: BiomeSurfaceCondition = {
      type: "minecraft:biome",
      biome_is: biomes.map((b) => `${b.namespace}:${b.id}` as const),
    };
    const parent = ctx.parentCtx;
    if (parent instanceof SurfaceConditionContext) {
      parent.serialized = output;
    } else {
      throw new Error("Biome surface condition has no parent");
    }
  };
}
