package rule_factory

import (
	antlr "github.com/antlr4-go/antlr/v4"
	"github.com/itsmebriand/mms/mms/grammars"
	surface_rules_store "github.com/itsmebriand/mms/mms/surface_rules/store"
	surface_rule_types "github.com/itsmebriand/mms/mms/surface_rules/types"
)

type RuleFactory struct {
	store            *surface_rules_store.SurfaceStore
	CurrentNamespace string
}

func NewRuleFactory(store *surface_rules_store.SurfaceStore) *RuleFactory {
	return &RuleFactory{store: store}
}

func (f *RuleFactory) NewRule(ctx *grammars.SurfaceRuleContext) surface_rule_types.Rule {
	child := ctx.GetChild(0)

	var rule surface_rule_types.Rule
	switch child.(type) {
	case *grammars.SurfaceRule_BlockContext:
		rule = f.NewBlockRule(child.(*grammars.SurfaceRule_BlockContext))
	case *grammars.SurfaceRule_ConditionalContext:
		rule = f.NewConditionalRule(child.(*grammars.SurfaceRule_ConditionalContext))
	case *grammars.SurfaceRule_SequenceContext:
		rule = f.NewSequenceRule(child.(*grammars.SurfaceRule_SequenceContext))
	case *grammars.SurfaceRule_BandlandsContext:
		rule = f.NewBandlandsRule(child.(*grammars.SurfaceRule_BandlandsContext))
	case *grammars.SurfaceRuleReferenceContext:
		rule = f.NewReferenceRule(child.(*grammars.SurfaceRuleReferenceContext))
	default:
		return nil
	}
	f.store.AddRule(GetRuleRefFromNode(ctx), rule)
	return rule
}

func GetRuleRefFromNode(
	ruleNode grammars.ISurfaceRuleContext,
) *antlr.BaseParserRuleContext {
	ctx := ruleNode.GetRuleContext().(*grammars.SurfaceRuleContext)
	return &ctx.BaseParserRuleContext
}
