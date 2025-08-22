package rule_factory

import (
	"encoding/json"

	"github.com/itsmebriand/mms/mms/grammars"
	surface_rule_types "github.com/itsmebriand/mms/mms/surface_rules/types"
)

func (f RuleFactory) NewSequenceRule(ctx *grammars.SurfaceRule_SequenceContext) surface_rule_types.Rule {
	children := make([]surface_rule_types.Rule, len(ctx.AllSurfaceRule()))
	for i, child := range ctx.AllSurfaceRule() {
		children[i] = f.NewRule(child.GetRuleContext().(*grammars.SurfaceRuleContext))
	}
	return SequenceRule{Sequence: children}
}

type SequenceRule struct {
	Sequence []surface_rule_types.Rule `json:"sequence"`
}

func (r SequenceRule) Type() surface_rule_types.RuleType { return surface_rule_types.SequenceRuleType }

func (r SequenceRule) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type     surface_rule_types.RuleType `json:"type"`
		Sequence []surface_rule_types.Rule   `json:"sequence"`
	}{
		Type:     surface_rule_types.SequenceRuleType,
		Sequence: r.Sequence,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
