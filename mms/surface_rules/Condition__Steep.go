package surface_rules

import (
	"encoding/json"

	"github.com/itsmebriand/mms/mms/grammars"
)

func (l *SurfaceRuleSerializer) ExitSurfaceCondition_Steep(ctx *grammars.SurfaceCondition_SteepContext) {
	l.conditionStack = append(l.conditionStack, SteepCondition{})
}

type SteepCondition struct {
}

func (c SteepCondition) Type() ConditionType { return SteepConditionType }

func (c SteepCondition) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type ConditionType `json:"type"`
	}{
		Type: SteepConditionType,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
