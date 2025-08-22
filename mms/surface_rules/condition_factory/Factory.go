package condition_factory

import (
	"github.com/antlr4-go/antlr/v4"
	"github.com/itsmebriand/mms/mms/grammars"
)

type ConditionFactory struct {
	CurrentNamespace string
}

func NewConditionFactory() *ConditionFactory {
	return &ConditionFactory{}
}

func (f *ConditionFactory) NewCondition(ctx *grammars.SurfaceConditionContext) Condition {
	child := ctx.GetChild(0)
	switch child.(type) {
	case *grammars.SurfaceCondition_AboveSurfaceContext:
		return f.NewAboveSurfaceCondition(child.(*grammars.SurfaceCondition_AboveSurfaceContext))
	case *grammars.SurfaceCondition_AboveWaterContext:
		return f.NewAboveWaterCondition(child.(*grammars.SurfaceCondition_AboveWaterContext))
	case *grammars.SurfaceCondition_BiomeContext:
		return f.NewBiomeCondition(child.(*grammars.SurfaceCondition_BiomeContext))
	case *grammars.SurfaceCondition_CompoundContext:
		return f.NewCompoundCondition(child.(*grammars.SurfaceCondition_CompoundContext))
	case *grammars.SurfaceCondition_FreezingContext:
		return f.NewFreezingCondition(child.(*grammars.SurfaceCondition_FreezingContext))
	case *grammars.SurfaceCondition_HoleContext:
		return f.NewHoleCondition(child.(*grammars.SurfaceCondition_HoleContext))
	case *grammars.SurfaceCondition_NoiseContext:
		return f.NewNoiseCondition(child.(*grammars.SurfaceCondition_NoiseContext))
	case *grammars.SurfaceCondition_SteepContext:
		return f.NewSteepCondition(child.(*grammars.SurfaceCondition_SteepContext))
	case *grammars.SurfaceCondition_StoneDepthContext:
		return f.NewStoneDepthCondition(child.(*grammars.SurfaceCondition_StoneDepthContext))
	case *grammars.SurfaceCondition_VerticalGradientContext:
		return f.NewVerticalGradientCondition(child.(*grammars.SurfaceCondition_VerticalGradientContext))
	case *grammars.SurfaceCondition_YAboveContext:
		return f.NewYAboveCondition(child.(*grammars.SurfaceCondition_YAboveContext))
	case *grammars.SurfaceConditionReferenceContext:
		return f.NewSurfaceConditionReference(child.(*grammars.SurfaceConditionReferenceContext))
	}
	return nil
}

func (f ConditionFactory) GetConditionContext(
	conditionNode grammars.ISurfaceConditionContext,
) *grammars.SurfaceConditionContext {
	return conditionNode.GetRuleContext().(*grammars.SurfaceConditionContext)
}

func (f ConditionFactory) GetConditionRefFromNode(
	conditionNode grammars.ISurfaceConditionContext,
) *antlr.BaseParserRuleContext {
	ctx := conditionNode.GetRuleContext().(*grammars.SurfaceConditionContext)
	return &ctx.BaseParserRuleContext
}
