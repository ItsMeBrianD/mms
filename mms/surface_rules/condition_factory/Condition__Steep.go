package condition_factory

import (
	"encoding/json"

	"github.com/itsmebriand/mms/mms/grammars"
	surface_rule_types "github.com/itsmebriand/mms/mms/surface_rules/types"
)

func (f ConditionFactory) NewSteepCondition(ctx *grammars.SurfaceCondition_SteepContext) surface_rule_types.Condition {
	return &SteepCondition{}
}

type SteepCondition struct {
	comment *string
}

func (c SteepCondition) Type() surface_rule_types.ConditionType {
	return surface_rule_types.SteepConditionType
}

func (c SteepCondition) Comment() *string { return c.comment }

func (c *SteepCondition) SetComment(comment *string) { c.comment = comment }

func (c SteepCondition) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type    surface_rule_types.ConditionType `json:"type"`
		Comment *string                          `json:"__comment,omitempty"`
	}{
		Type:    surface_rule_types.SteepConditionType,
		Comment: c.comment,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
