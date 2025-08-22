package condition_factory

import (
	"encoding/json"

	"github.com/itsmebriand/mms/mms/grammars"
)

func (f ConditionFactory) NewAboveSurfaceCondition(ctx *grammars.SurfaceCondition_AboveSurfaceContext) Condition {
	return AboveSurfaceCondition{}
}

type AboveSurfaceCondition struct {
	comment *string
}

func (c AboveSurfaceCondition) Comment() *string { return c.comment }

func (c AboveSurfaceCondition) SetComment(comment *string) { c.comment = comment }

func (c AboveSurfaceCondition) Type() ConditionType { return AboveSurfaceConditionType }

func (c AboveSurfaceCondition) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type    ConditionType `json:"type"`
		Comment *string       `json:"__comment,omitempty"`
	}{
		Type:    AboveSurfaceConditionType,
		Comment: c.comment,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
