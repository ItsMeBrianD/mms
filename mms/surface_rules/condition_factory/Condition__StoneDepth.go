package condition_factory

import (
	"encoding/json"
	"strconv"

	"github.com/itsmebriand/mms/mms/grammars"
)

func (f ConditionFactory) NewStoneDepthCondition(ctx *grammars.SurfaceCondition_StoneDepthContext) Condition {
	offset, _ := strconv.Atoi(ctx.Int(0).GetText())
	secondary_depth_range, _ := strconv.Atoi(ctx.Int(1).GetText())
	return StoneDepthCondition{
		Depth: offset,
		Add:   ctx.Keyword_Add() != nil, // if this is nil, then Keyword_Sub MUST exist per the grammar
		Range: secondary_depth_range,
	}
}

type StoneDepthCondition struct {
	Depth   int
	Add     bool
	Range   int
	comment *string
}

func (c StoneDepthCondition) Type() ConditionType { return StoneDepthConditionType }

func (c StoneDepthCondition) Comment() *string { return c.comment }

func (c StoneDepthCondition) SetComment(comment *string) { c.comment = comment }

func (c StoneDepthCondition) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type    ConditionType `json:"type"`
		Depth   int           `json:"offset"`
		Add     bool          `json:"add_surface_depth"`
		Range   int           `json:"secondary_depth_range"`
		Comment *string       `json:"__comment,omitempty"`
	}{
		Type:    StoneDepthConditionType,
		Depth:   c.Depth,
		Add:     c.Add,
		Range:   c.Range,
		Comment: c.comment,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
