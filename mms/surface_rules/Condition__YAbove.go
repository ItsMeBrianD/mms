package surface_rules

import (
	"encoding/json"
	"strconv"

	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/lib"
)

type YAboveCondition struct {
	Anchor     lib.VerticalAnchor
	Multiplier int
	Add        bool
}

func (l *SurfaceRuleSerializer) ExitSurfaceCondition_YAbove(ctx *grammars.SurfaceCondition_YAboveContext) {
	anchor, err := lib.ParseVerticalAnchor(ctx.VerticalAnchor())
	if err != nil {
		l.Errors = append(l.Errors, err)
		return
	}
	multiplier, _ := strconv.Atoi(ctx.Int().GetText())
	l.conditionStack = append(l.conditionStack, YAboveCondition{
		Anchor:     *anchor,
		Multiplier: multiplier,
		Add:        ctx.Keyword_Add() != nil,
	})
}

func (c YAboveCondition) Type() ConditionType { return YAboveConditionType }

func (c YAboveCondition) MarshalJSON() ([]byte, error) {
	return json.Marshal(struct {
		Type       ConditionType      `json:"type"`
		Anchor     lib.VerticalAnchor `json:"anchor"`
		Multiplier int                `json:"surface_depth_multiplier"`
		Add        bool               `json:"add_stone_depth"`
	}{
		Type:       YAboveConditionType,
		Anchor:     c.Anchor,
		Multiplier: c.Multiplier,
		Add:        c.Add,
	})
}
