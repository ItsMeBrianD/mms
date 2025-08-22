package surface_rules

import (
	"encoding/json"

	"github.com/itsmebriand/mms/mms/grammars"
)

func (l *SurfaceRuleSerializer) ExitSurfaceCondition_Hole(ctx *grammars.SurfaceCondition_HoleContext) {
	l.conditionStack = append(l.conditionStack, HoleCondition{})
}

type HoleCondition struct {
}

func (c HoleCondition) Type() ConditionType { return HoleConditionType }

func (c HoleCondition) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type ConditionType `json:"type"`
	}{
		Type: HoleConditionType,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
