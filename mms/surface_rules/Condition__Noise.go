package surface_rules

import (
	"encoding/json"
	"strconv"

	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/lib"
)

func (l *SurfaceRuleSerializer) ExitSurfaceCondition_Noise(ctx *grammars.SurfaceCondition_NoiseContext) {
	min, _ := strconv.ParseFloat(ctx.Float(0).GetText(), 64)
	max, _ := strconv.ParseFloat(ctx.Float(1).GetText(), 64)
	l.conditionStack = append(l.conditionStack, NoiseCondition{
		NoiseRef: lib.ParseReferential("minecraft", ctx.ResourceReference()),
		Min:      min,
		Max:      max,
	})
}

type NoiseCondition struct {
	NoiseRef lib.Reference
	Min      float64
	Max      float64
}

func (c NoiseCondition) Type() ConditionType { return NoiseConditionType }

func (c NoiseCondition) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type     ConditionType `json:"type"`
		NoiseRef lib.Reference `json:"noise"`
		Min      float64       `json:"min_threshold"`
		Max      float64       `json:"max_threshold"`
	}{
		Type:     NoiseConditionType,
		NoiseRef: c.NoiseRef,
		Min:      c.Min,
		Max:      c.Max,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
