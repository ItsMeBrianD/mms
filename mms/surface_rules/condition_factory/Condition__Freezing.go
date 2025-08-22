package condition_factory

import (
	"encoding/json"

	"github.com/itsmebriand/mms/mms/grammars"
)

func (f ConditionFactory) NewFreezingCondition(ctx *grammars.SurfaceCondition_FreezingContext) Condition {
	return FreezingCondition{}
}

type FreezingCondition struct {
	comment *string
}

func (c FreezingCondition) Type() ConditionType { return FreezingConditionType }

func (c FreezingCondition) Comment() *string { return c.comment }

func (c FreezingCondition) SetComment(comment *string) { c.comment = comment }

func (c FreezingCondition) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type    ConditionType `json:"type"`
		Comment *string       `json:"__comment,omitempty"`
	}{
		Type:    FreezingConditionType,
		Comment: c.comment,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
