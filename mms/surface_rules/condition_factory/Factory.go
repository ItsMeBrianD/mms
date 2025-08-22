package condition_factory

import (
	"github.com/antlr4-go/antlr/v4"
	"github.com/itsmebriand/mms/mms/grammars"
	surface_rule_store "github.com/itsmebriand/mms/mms/surface_rules/store"
	surface_rule_types "github.com/itsmebriand/mms/mms/surface_rules/types"
)

type ConditionFactory struct {
	CurrentNamespace string
	store            *surface_rule_store.SurfaceStore
}

func NewConditionFactory(store *surface_rule_store.SurfaceStore) *ConditionFactory {
	return &ConditionFactory{store: store}
}

func (f *ConditionFactory) NewCondition(ctx *grammars.SurfaceConditionContext) surface_rule_types.Condition {
	child := ctx.GetChild(0)
	var condition surface_rule_types.Condition
	switch child.(type) {
	case *grammars.SurfaceCondition_AboveSurfaceContext:
		condition = f.NewAboveSurfaceCondition(child.(*grammars.SurfaceCondition_AboveSurfaceContext))
	case *grammars.SurfaceCondition_AboveWaterContext:
		condition = f.NewAboveWaterCondition(child.(*grammars.SurfaceCondition_AboveWaterContext))
	case *grammars.SurfaceCondition_BiomeContext:
		condition = f.NewBiomeCondition(child.(*grammars.SurfaceCondition_BiomeContext))
	case *grammars.SurfaceCondition_CompoundContext:
		condition = f.NewCompoundCondition(child.(*grammars.SurfaceCondition_CompoundContext))
	case *grammars.SurfaceCondition_FreezingContext:
		condition = f.NewFreezingCondition(child.(*grammars.SurfaceCondition_FreezingContext))
	case *grammars.SurfaceCondition_HoleContext:
		condition = f.NewHoleCondition(child.(*grammars.SurfaceCondition_HoleContext))
	case *grammars.SurfaceCondition_NoiseContext:
		condition = f.NewNoiseCondition(child.(*grammars.SurfaceCondition_NoiseContext))
	case *grammars.SurfaceCondition_SteepContext:
		condition = f.NewSteepCondition(child.(*grammars.SurfaceCondition_SteepContext))
	case *grammars.SurfaceCondition_StoneDepthContext:
		condition = f.NewStoneDepthCondition(child.(*grammars.SurfaceCondition_StoneDepthContext))
	case *grammars.SurfaceCondition_VerticalGradientContext:
		condition = f.NewVerticalGradientCondition(child.(*grammars.SurfaceCondition_VerticalGradientContext))
	case *grammars.SurfaceCondition_YAboveContext:
		condition = f.NewYAboveCondition(child.(*grammars.SurfaceCondition_YAboveContext))
	case *grammars.SurfaceConditionReferenceContext:
		condition = f.NewSurfaceConditionReference(child.(*grammars.SurfaceConditionReferenceContext))
	default:
		return nil
	}
	f.store.AddCondition(&ctx.BaseParserRuleContext, condition)
	return condition
}

func (f ConditionFactory) GetConditionContext(
	conditionNode grammars.ISurfaceConditionContext,
) *grammars.SurfaceConditionContext {
	return conditionNode.GetRuleContext().(*grammars.SurfaceConditionContext)
}

func GetConditionRefFromNode(
	conditionNode grammars.ISurfaceConditionContext,
) *antlr.BaseParserRuleContext {
	ctx := conditionNode.GetRuleContext().(*grammars.SurfaceConditionContext)
	return &ctx.BaseParserRuleContext
}
