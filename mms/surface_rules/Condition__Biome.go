package surface_rules

import (
	"encoding/json"

	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/lib"
)

type BiomeCondition struct {
	Biomes []lib.Reference
}

func (c BiomeCondition) Type() ConditionType { return BiomeConditionType }

func (c BiomeCondition) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type   ConditionType   `json:"type"`
		Biomes []lib.Reference `json:"biomes"`
	}{
		Type:   BiomeConditionType,
		Biomes: c.Biomes,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}

func (l *SurfaceRuleSerializer) ExitSurfaceCondition_Biome(ctx *grammars.SurfaceCondition_BiomeContext) {
	biomes := make([]lib.Reference, len(ctx.AllResourceReference()))
	for i, biome := range ctx.AllResourceReference() {
		biomes[i] = lib.ParseReferential("minecraft", biome)
	}

	l.conditionStack = append(l.conditionStack, BiomeCondition{Biomes: biomes})
}
