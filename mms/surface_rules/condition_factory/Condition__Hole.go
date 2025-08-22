package condition_factory

import (
	"encoding/json"

	"github.com/itsmebriand/mms/mms/grammars"
)

func (f ConditionFactory) NewHoleCondition(ctx *grammars.SurfaceCondition_HoleContext) Condition {
	return HoleCondition{}
}

type HoleCondition struct {
	comment *string
}

func (c HoleCondition) Type() ConditionType { return HoleConditionType }

func (c HoleCondition) Comment() *string { return c.comment }

func (c HoleCondition) SetComment(comment *string) { c.comment = comment }

func (c HoleCondition) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type    ConditionType `json:"type"`
		Comment *string       `json:"__comment,omitempty"`
	}{
		Type:    HoleConditionType,
		Comment: c.comment,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
