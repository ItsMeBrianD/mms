package condition_factory

import (
	"encoding/json"
	"strconv"

	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/lib"
	surface_rule_types "github.com/itsmebriand/mms/mms/surface_rules/types"
)

func (f ConditionFactory) NewNoiseCondition(ctx *grammars.SurfaceCondition_NoiseContext) surface_rule_types.Condition {
	min, _ := strconv.ParseFloat(ctx.Number(0).GetText(), 64)
	max, _ := strconv.ParseFloat(ctx.Number(1).GetText(), 64)
	return &NoiseCondition{
		NoiseRef: lib.ParseReferential("minecraft", ctx.ResourceReference()),
		Min:      min,
		Max:      max,
	}
}

type NoiseCondition struct {
	NoiseRef lib.Reference
	Min      float64
	Max      float64
	comment  *string
}

func (c NoiseCondition) Type() surface_rule_types.ConditionType {
	return surface_rule_types.NoiseConditionType
}

func (c NoiseCondition) Comment() *string { return c.comment }

func (c *NoiseCondition) SetComment(comment *string) { c.comment = comment }

func (c NoiseCondition) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type     surface_rule_types.ConditionType `json:"type"`
		NoiseRef lib.Reference                    `json:"noise_threshold"`
		Min      float64                          `json:"min_threshold"`
		Max      float64                          `json:"max_threshold"`
		Comment  *string                          `json:"__comment,omitempty"`
	}{
		Type:     surface_rule_types.NoiseConditionType,
		NoiseRef: c.NoiseRef,
		Min:      c.Min,
		Max:      c.Max,
		Comment:  c.comment,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
