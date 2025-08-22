package surface_rules

import (
	"encoding/json"
	"fmt"

	"github.com/itsmebriand/mms/mms/grammars"
)

func (l *SurfaceRuleSerializer) ExitSurfaceCondition_Compound(ctx *grammars.SurfaceCondition_CompoundContext) {
	childCount := len(ctx.AllSurfaceCondition_Compound__Item())

	if childCount == 1 {
		return // No-Op?
	}

	conditions := make([]CompoundConditionItem, childCount)
	for i := range conditions {
		conditions[i].Condition = l.conditionStack[len(l.conditionStack)-childCount+i]
		conditions[i].Negate = ctx.AllSurfaceCondition_Compound__Item()[i].Bang() != nil
	}
	l.conditionStack = l.conditionStack[:len(l.conditionStack)-childCount]

	compound := CompoundCondition{Conditions: conditions}
	l.conditionStack = append(l.conditionStack, compound)

	fmt.Printf("Discovered Compound Condition with %d children\n", childCount)
}

type CompoundCondition struct {
	Conditions []CompoundConditionItem
}

func (c CompoundCondition) Type() ConditionType { return CompoundConditionType }

func (c CompoundCondition) MarshalJSON() ([]byte, error) {
	if len(c.Conditions) == 1 {
		return json.Marshal(c.Conditions[0])
	}
	return json.Marshal(struct {
		Type       ConditionType           `json:"type"`
		Conditions []CompoundConditionItem `json:"conditions"`
	}{
		Type:       CompoundConditionType,
		Conditions: c.Conditions,
	})
}

type CompoundConditionItem struct {
	json.Marshaler
	Condition Condition
	Negate    bool
}

func (c CompoundConditionItem) MarshalJSON() ([]byte, error) {
	return json.Marshal(struct {
		Type      ConditionType `json:"type"`
		Condition Condition     `json:"condition"`
		Negate    bool          `json:"negate"`
	}{
		Type:      CompoundConditionType,
		Condition: c.Condition,
		Negate:    c.Negate,
	})
}
