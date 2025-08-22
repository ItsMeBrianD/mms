package rule_factory

import (
	"encoding/json"

	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/lib"
	surface_rule_types "github.com/itsmebriand/mms/mms/surface_rules/types"
)

func (f *RuleFactory) NewReferenceRule(ctx *grammars.SurfaceRuleReferenceContext) surface_rule_types.Rule {
	return &SurfaceReferenceRule{
		Reference: lib.ParseReferential(f.CurrentNamespace, ctx),
	}
}

type SurfaceReferenceRule struct {
	lib.Reference
	surface_rule_types.Rule
	Namespace string
	Name      string
}

func (r SurfaceReferenceRule) Type() surface_rule_types.RuleType {
	return surface_rule_types.ReferenceRuleType
}

func (r SurfaceReferenceRule) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type      surface_rule_types.RuleType `json:"type"`
		Namespace string                      `json:"namespace"`
		Name      string                      `json:"name"`
	}{
		Type:      surface_rule_types.ReferenceRuleType,
		Namespace: r.Namespace,
		Name:      r.Name,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
