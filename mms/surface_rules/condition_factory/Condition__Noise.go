package condition_factory

import (
	"encoding/json"
	"strconv"

	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/lib"
)

func (f ConditionFactory) NewNoiseCondition(ctx *grammars.SurfaceCondition_NoiseContext) Condition {
	min, _ := strconv.ParseFloat(ctx.Float(0).GetText(), 64)
	max, _ := strconv.ParseFloat(ctx.Float(1).GetText(), 64)
	return NoiseCondition{
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

func (c NoiseCondition) Type() ConditionType { return NoiseConditionType }

func (c NoiseCondition) Comment() *string { return c.comment }

func (c NoiseCondition) SetComment(comment *string) { c.comment = comment }

func (c NoiseCondition) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type     ConditionType `json:"type"`
		NoiseRef lib.Reference `json:"noise"`
		Min      float64       `json:"min_threshold"`
		Max      float64       `json:"max_threshold"`
		Comment  *string       `json:"__comment,omitempty"`
	}{
		Type:     NoiseConditionType,
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
