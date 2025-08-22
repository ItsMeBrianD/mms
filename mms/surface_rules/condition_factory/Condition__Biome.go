package condition_factory

import (
	"encoding/json"

	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/lib"
)

type BiomeCondition struct {
	Biomes  []lib.Reference
	comment *string
}

func (c BiomeCondition) Type() ConditionType { return BiomeConditionType }

func (c BiomeCondition) Comment() *string { return c.comment }

func (c BiomeCondition) SetComment(comment *string) { c.comment = comment }

func (c BiomeCondition) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type    ConditionType   `json:"type"`
		Biomes  []lib.Reference `json:"biomes"`
		Comment *string         `json:"__comment,omitempty"`
	}{
		Type:    BiomeConditionType,
		Biomes:  c.Biomes,
		Comment: c.comment,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}

func (f ConditionFactory) NewBiomeCondition(ctx *grammars.SurfaceCondition_BiomeContext) Condition {
	biomes := make([]lib.Reference, len(ctx.AllResourceReference()))
	for i, biome := range ctx.AllResourceReference() {
		biomes[i] = lib.ParseReferential("minecraft", biome)
	}
	return BiomeCondition{Biomes: biomes}
}
