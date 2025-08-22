package condition_factory

import (
	"encoding/json"

	"github.com/itsmebriand/mms/mms/grammars"
	surface_rule_types "github.com/itsmebriand/mms/mms/surface_rules/types"
)

func (f ConditionFactory) NewHoleCondition(ctx *grammars.SurfaceCondition_HoleContext) surface_rule_types.Condition {
	return &HoleCondition{}
}

type HoleCondition struct {
	comment *string
}

func (c HoleCondition) Type() surface_rule_types.ConditionType {
	return surface_rule_types.HoleConditionType
}

func (c HoleCondition) Comment() *string { return c.comment }

func (c *HoleCondition) SetComment(comment *string) { c.comment = comment }

func (c HoleCondition) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type    surface_rule_types.ConditionType `json:"type"`
		Comment *string                          `json:"__comment,omitempty"`
	}{
		Type:    surface_rule_types.HoleConditionType,
		Comment: c.comment,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
