package surface_rules

import (
	"encoding/json"

	"github.com/itsmebriand/mms/mms/grammars"
)

func (l *SurfaceRuleSerializer) ExitSurfaceCondition_Freezing(ctx *grammars.SurfaceCondition_FreezingContext) {
	l.conditionStack = append(l.conditionStack, FreezingCondition{})
}

type FreezingCondition struct {
}

func (c FreezingCondition) Type() ConditionType { return FreezingConditionType }

func (c FreezingCondition) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type ConditionType `json:"type"`
	}{
		Type: FreezingConditionType,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
