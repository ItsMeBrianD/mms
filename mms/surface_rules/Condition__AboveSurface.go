package surface_rules

import (
	"encoding/json"

	"github.com/itsmebriand/mms/mms/grammars"
)

func (l *SurfaceRuleSerializer) ExitSurfaceCondition_AboveSurface(ctx *grammars.SurfaceCondition_AboveSurfaceContext) {
	l.conditionStack = append(l.conditionStack, AboveSurfaceCondition{})
}

type AboveSurfaceCondition struct {
}

func (c AboveSurfaceCondition) Type() ConditionType { return AboveSurfaceConditionType }

func (c AboveSurfaceCondition) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type ConditionType `json:"type"`
	}{
		Type: AboveSurfaceConditionType,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
