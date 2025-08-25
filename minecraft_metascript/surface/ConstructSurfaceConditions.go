package surface

import (
	"github.com/itsmebriand/mms/minecraft_metascript/surface/surface_conditions"
	"github.com/itsmebriand/mms/mms/grammars"
)

func (s *SurfaceVisitor) ConstructSurfaceCondition(ctx *grammars.SurfaceConditionContext) (surface_conditions.SurfaceCondition, error) {
	switch ctx := ctx.GetChild(0).(type) {
	case *grammars.SurfaceCondition_AboveWaterContext:
		return surface_conditions.NewAboveWaterCondition(ctx)
	case *grammars.SurfaceCondition_AboveSurfaceContext:
		return surface_conditions.NewAboveSurfaceCondition(ctx)
	case *grammars.SurfaceCondition_BiomeContext:
		return surface_conditions.NewBiomeCondition(ctx)
	case *grammars.SurfaceCondition_FreezingContext:
		return surface_conditions.NewFreezingCondition(ctx)
	case *grammars.SurfaceCondition_HoleContext:
		return surface_conditions.NewHoleCondition(ctx)
	case *grammars.SurfaceCondition_NoiseContext:
		return surface_conditions.NewNoiseCondition(ctx)
	case *grammars.SurfaceConditionReferenceContext:
		return surface_conditions.NewSurfaceConditionReference(ctx)
	case *grammars.SurfaceCondition_SteepContext:
		return surface_conditions.NewSteepCondition(ctx)
	case *grammars.SurfaceCondition_StoneDepthContext:
		return surface_conditions.NewStoneDepthCondition(ctx)
	case *grammars.SurfaceCondition_VerticalGradientContext:
		return surface_conditions.NewVerticalGradientCondition(ctx)
	case *grammars.SurfaceCondition_YAboveContext:
		return surface_conditions.NewYAboveCondition(ctx)
	}
	return nil, nil
}
