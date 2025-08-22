package condition_factory

import (
	"encoding/json"

	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/lib"
	surface_rule_types "github.com/itsmebriand/mms/mms/surface_rules/types"
)

type BiomeCondition struct {
	Biomes  []lib.Reference
	comment *string
}

func (c BiomeCondition) Type() surface_rule_types.ConditionType {
	return surface_rule_types.BiomeConditionType
}

func (c BiomeCondition) Comment() *string { return c.comment }

func (c *BiomeCondition) SetComment(comment *string) { c.comment = comment }

func (c BiomeCondition) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type    surface_rule_types.ConditionType `json:"type"`
		Biomes  []lib.Reference                  `json:"biomes"`
		Comment *string                          `json:"__comment,omitempty"`
	}{
		Type:    surface_rule_types.BiomeConditionType,
		Biomes:  c.Biomes,
		Comment: c.comment,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}

func (f ConditionFactory) NewBiomeCondition(ctx *grammars.SurfaceCondition_BiomeContext) surface_rule_types.Condition {
	biomes := make([]lib.Reference, len(ctx.AllResourceReference()))
	for i, biome := range ctx.AllResourceReference() {
		biomes[i] = lib.ParseReferential("minecraft", biome)
	}
	return &BiomeCondition{Biomes: biomes}
}
