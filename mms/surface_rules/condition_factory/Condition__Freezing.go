package condition_factory

import (
	"encoding/json"

	"github.com/itsmebriand/mms/mms/grammars"
	surface_rule_types "github.com/itsmebriand/mms/mms/surface_rules/types"
)

func (f ConditionFactory) NewFreezingCondition(ctx *grammars.SurfaceCondition_FreezingContext) surface_rule_types.Condition {
	return &FreezingCondition{}
}

type FreezingCondition struct {
	comment *string
}

func (c FreezingCondition) Type() surface_rule_types.ConditionType {
	return surface_rule_types.FreezingConditionType
}

func (c FreezingCondition) Comment() *string { return c.comment }

func (c *FreezingCondition) SetComment(comment *string) { c.comment = comment }

func (c FreezingCondition) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type    surface_rule_types.ConditionType `json:"type"`
		Comment *string                          `json:"__comment,omitempty"`
	}{
		Type:    surface_rule_types.FreezingConditionType,
		Comment: c.comment,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
