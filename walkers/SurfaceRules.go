package walkers

import (
	"github.com/antlr4-go/antlr/v4"
	"github.com/itsmebriand/mms/mms/grammars"
	surface_rule_walkers "github.com/itsmebriand/mms/walkers/surface_rules"
)

func SerializeSurfaceRules(
	file grammars.IMmsFileContext,
) map[string]surface_rule_walkers.Rule {
	listener := surface_rule_walkers.NewSurfaceRuleSerializer()
	walker := antlr.NewParseTreeWalker()
	walker.Walk(listener, file)
	return listener.GetRules()
}
