package surface_rules

import (
	"encoding/json"
	"strconv"

	"github.com/itsmebriand/mms/mms/grammars"
)

func (l *SurfaceRuleSerializer) ExitSurfaceCondition_StoneDepth(ctx *grammars.SurfaceCondition_StoneDepthContext) {
	offset, _ := strconv.Atoi(ctx.Int(0).GetText())
	secondary_depth_range, _ := strconv.Atoi(ctx.Int(1).GetText())
	l.conditionStack = append(l.conditionStack, StoneDepthCondition{
		Depth: offset,
		Add:   ctx.Keyword_Add() != nil, // if this is nil, then Keyword_Sub MUST exist per the grammar
		Range: secondary_depth_range,
	})
}

type StoneDepthCondition struct {
	Depth int
	Add   bool
	Range int
}

func (c StoneDepthCondition) Type() ConditionType { return StoneDepthConditionType }

func (c StoneDepthCondition) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type  ConditionType `json:"type"`
		Depth int           `json:"offset"`
		Add   bool          `json:"add_surface_depth"`
		Range int           `json:"secondary_depth_range"`
	}{
		Type:  StoneDepthConditionType,
		Depth: c.Depth,
		Add:   c.Add,
		Range: c.Range,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
