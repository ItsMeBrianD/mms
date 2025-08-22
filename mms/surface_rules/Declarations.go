package surface_rules

import (
	"errors"
	"fmt"

	"github.com/itsmebriand/mms/mms/grammars"
	condition_factory "github.com/itsmebriand/mms/mms/surface_rules/condition_factory"
	"github.com/itsmebriand/mms/mms/surface_rules/rule_factory"
)

func (l *SurfaceRuleSerializer) ExitSurfaceConditionDeclaration(ctx *grammars.SurfaceConditionDeclarationContext) {
	condition := l.store.GetCondition(condition_factory.GetConditionRefFromNode(ctx.SurfaceCondition()))
	if condition == nil {
		l.Errors = append(l.Errors, errors.New("condition not found: "+ctx.SurfaceCondition().GetText()))
		return
	}

	// Extract condition name from context
	name := ctx.Identifier().GetText()
	origName := name
	suffix := 1
	for {
		if _, ok := l.conditionsByName[name]; !ok {
			break
		}
		suffix++
		name = origName + fmt.Sprintf("_duplicate_%d", suffix)
	}
	if name != origName {
		l.Errors = append(l.Errors, errors.New("duplicate condition name: "+origName))
	}
	l.conditionsByName[name] = condition
}

func (l *SurfaceRuleSerializer) ExitSurfaceRuleDeclaration(ctx *grammars.SurfaceRuleDeclarationContext) {
	rule := l.store.GetRule(rule_factory.GetRuleRefFromNode(ctx.SurfaceRule()))
	if rule == nil {
		l.Errors = append(l.Errors, errors.New("rule not found: "+ctx.SurfaceRule().GetText()))
		return
	}
	// Extract rule name from context
	name := ctx.Identifier().GetText()
	origName := name
	suffix := 1
	for {
		if _, ok := l.rulesByName[name]; !ok {
			break
		}
		suffix++
		name = origName + fmt.Sprintf("_duplicate_%d", suffix)
	}
	if name != origName {
		l.Errors = append(l.Errors, errors.New("duplicate rule name: "+origName))
	}
	l.rulesByName[name] = rule
}
