package surface_rules

import (
	"encoding/json"

	"github.com/itsmebriand/mms/mms/grammars"
)

func (l *SurfaceRuleSerializer) ExitSurfaceRule_Sequence(ctx *grammars.SurfaceRule_SequenceContext) {
	childCount := len(ctx.AllSurfaceRule())
	children := make([]Rule, childCount)

	copy(children, l.ruleStack[len(l.ruleStack)-childCount:])
	l.ruleStack = l.ruleStack[:len(l.ruleStack)-childCount]

	sequence := SequenceRule{Sequence: children}
	l.ruleStack = append(l.ruleStack, sequence)
}

type SequenceRule struct {
	Sequence []Rule `json:"sequence"`
}

func (r SequenceRule) Type() RuleType { return SequenceRuleType }

func (r SequenceRule) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type     RuleType `json:"type"`
		Sequence []Rule   `json:"sequence"`
	}{
		Type:     SequenceRuleType,
		Sequence: r.Sequence,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
