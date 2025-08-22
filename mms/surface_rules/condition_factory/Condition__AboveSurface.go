package condition_factory

import (
	"encoding/json"

	"github.com/itsmebriand/mms/mms/grammars"
	surface_rule_types "github.com/itsmebriand/mms/mms/surface_rules/types"
)

func (f ConditionFactory) NewAboveSurfaceCondition(ctx *grammars.SurfaceCondition_AboveSurfaceContext) surface_rule_types.Condition {
	return &AboveSurfaceCondition{}
}

type AboveSurfaceCondition struct {
	comment *string
}

func (c AboveSurfaceCondition) Comment() *string { return c.comment }

func (c *AboveSurfaceCondition) SetComment(comment *string) { c.comment = comment }

func (c AboveSurfaceCondition) Type() surface_rule_types.ConditionType {
	return surface_rule_types.AboveSurfaceConditionType
}

func (c AboveSurfaceCondition) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type    surface_rule_types.ConditionType `json:"type"`
		Comment *string                          `json:"__comment,omitempty"`
	}{
		Type:    surface_rule_types.AboveSurfaceConditionType,
		Comment: c.comment,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
