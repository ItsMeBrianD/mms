package condition_factory

import (
	"encoding/json"

	surface_rule_types "github.com/itsmebriand/mms/mms/surface_rules/types"
)

type NotCondition struct {
	Invert  surface_rule_types.Condition
	comment *string
}

func (c NotCondition) Type() surface_rule_types.ConditionType {
	return surface_rule_types.NotConditionType
}

func (c NotCondition) Comment() *string { return c.comment }

func (c *NotCondition) SetComment(comment *string) { c.comment = comment }

func (c NotCondition) MarshalJSON() ([]byte, error) {
	return json.Marshal(struct {
		Type    surface_rule_types.ConditionType `json:"type"`
		Invert  surface_rule_types.Condition     `json:"invert"`
		Comment *string                          `json:"__comment,omitempty"`
	}{
		Type:    surface_rule_types.NotConditionType,
		Invert:  c.Invert,
		Comment: c.comment,
	})
}

func InvertCondition(condition surface_rule_types.Condition) surface_rule_types.Condition {
	return &NotCondition{Invert: condition}
}
