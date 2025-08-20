import { describe, expect, it } from "bun:test";
import { parseExpression } from "./noise";
import { DensityFunctionListener } from "./visitors/DensityFunctionListener";
import { ParseTreeWalker } from "antlr4";

describe("Density Functions", () => {
  describe("noise", () => {
    it("Should process a basic, valid noise function", () => {
      const tree = parseExpression(`density:noise MyNoise {
        noise minecraft:noodle
        xz_scale 1
        y_scale 1
    }`);
      if (tree.exception) {
        console.log(tree.exception?.message);
        console.log(
          `Test@${tree.exception?.offendingToken?.line}:${tree.exception?.offendingToken?.column}-${tree.exception?.offendingToken?.stop}`,
        );
      } else {
        const listener = new DensityFunctionListener();
        new ParseTreeWalker().walk(listener, tree);
        expect(listener.densityFunctions.size).toBe(1);
        expect(listener.densityFunctions.get("MyNoise")).toEqual({
          type: "minecraft:noise",
          xz_scale: 1,
          y_scale: 1,
          noise: "minecraft:noodle",
        });
      }
    });
    it("Should extract multiple noise functions", () => {
        const tree = parseExpression(`density:noise MyNoise {
            noise minecraft:noodle
            xz_scale 1
            y_scale 1
        }
        density:noise MyNoise2 {
            noise minecraft:cave_layer
            xz_scale 2
            y_scale 1.0
        }`);
        if (tree.exception) {
            console.log(tree.exception?.message);
            console.log(
              `Test@${tree.exception?.offendingToken?.line}:${tree.exception?.offendingToken?.column}-${tree.exception?.offendingToken?.stop}`,
            );
          } else {
            const listener = new DensityFunctionListener();
            new ParseTreeWalker().walk(listener, tree);
            expect(listener.densityFunctions.size).toBe(2);
            expect(listener.densityFunctions.get("MyNoise")).toEqual({
              type: "minecraft:noise",
              xz_scale: 1,
              y_scale: 1,
              noise: "minecraft:noodle",
            });
            expect(listener.densityFunctions.get("MyNoise2")).toEqual({
              type: "minecraft:noise",
              xz_scale: 2,
              y_scale: 1,
              noise: "minecraft:cave_layer",
            });
          }
    })
  });
});
