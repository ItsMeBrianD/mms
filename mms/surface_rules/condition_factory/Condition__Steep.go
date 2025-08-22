package condition_factory

import (
	"encoding/json"

	"github.com/itsmebriand/mms/mms/grammars"
)

func (f ConditionFactory) NewSteepCondition(ctx *grammars.SurfaceCondition_SteepContext) Condition {
	return SteepCondition{}
}

type SteepCondition struct {
	comment *string
}

func (c SteepCondition) Type() ConditionType { return SteepConditionType }

func (c SteepCondition) Comment() *string { return c.comment }

func (c SteepCondition) SetComment(comment *string) { c.comment = comment }

func (c SteepCondition) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type    ConditionType `json:"type"`
		Comment *string       `json:"__comment,omitempty"`
	}{
		Type:    SteepConditionType,
		Comment: c.comment,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
