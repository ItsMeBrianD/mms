package surface_rules

import (
	"encoding/json"
	"errors"

	"github.com/itsmebriand/mms/mms/lib"
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
	CompoundConditionType         ConditionType = "mms:__compound"
	ReferenceConditionType        ConditionType = "mms:__reference"
)

type Condition interface {
	json.Marshaler
	Type() ConditionType
}

type ConditionReference struct {
	lib.Reference
	Condition
	Namespace string
	Name      string
}

func (c ConditionReference) Type() ConditionType { return ReferenceConditionType }

func (c ConditionReference) MarshalJSON() ([]byte, error) {
	return nil, errors.New("ConditionReference cannot be marshaled")
}
