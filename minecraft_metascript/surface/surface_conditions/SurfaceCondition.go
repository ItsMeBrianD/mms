package surface_conditions

import (
	"encoding/json"

	"github.com/itsmebriand/mms/mms/grammars"
)

type ConditionType string

const (
	AboveSurfaceConditionType     ConditionType = "minecraft:above_preliminary_surface"
	BiomeConditionType            ConditionType = "minecraft:biome"
	HoleConditionType             ConditionType = "minecraft:hole"
	NoiseConditionType            ConditionType = "minecraft:noise"
	SteepConditionType            ConditionType = "minecraft:steep"
	StoneDepthConditionType       ConditionType = "minecraft:stone_depth"
	FreezingConditionType         ConditionType = "minecraft:temperature"
	VerticalGradientConditionType ConditionType = "minecraft:vertical_gradient"
	AboveWaterConditionType       ConditionType = "minecraft:water"
	YAboveConditionType           ConditionType = "minecraft:y_above"
	NotConditionType              ConditionType = "minecraft:not"
	CompoundConditionType         ConditionType = "mms:__compound"
	ReferenceConditionType        ConditionType = "mms:__reference"
)

type SurfaceCondition interface {
	Type() ConditionType
}

type ConditionFactory interface {
	ConstructSurfaceCondition(*grammars.SurfaceConditionContext) (SurfaceCondition, error)
}

type NotCondition struct {
	SurfaceCondition
	Invert SurfaceCondition
}

func (nc NotCondition) Type() ConditionType {
	return NotConditionType
}
func (nc NotCondition) MarshalJSON() ([]byte, error) {
	return json.Marshal(struct {
		Type   ConditionType    `json:"type"`
		Invert SurfaceCondition `json:"invert"`
	}{
		Type:   nc.Type(),
		Invert: nc.Invert,
	})
}

func InvertCondition(condition SurfaceCondition) SurfaceCondition {
	return &NotCondition{Invert: condition}
}
