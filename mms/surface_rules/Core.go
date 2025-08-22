package surface_rules

import (
	"errors"
	"fmt"

	"github.com/itsmebriand/mms/mms/grammars"
)

func (l *SurfaceRuleSerializer) ExitMmsFile(ctx *grammars.MmsFileContext) {
	namespace := ctx.NamespaceDeclaration().Identifier().GetText()

	if _, ok := l.NamespaceRules[namespace]; !ok {
		l.NamespaceRules[namespace] = make(map[string]Rule)
	}

	if _, ok := l.NamespaceConditions[namespace]; !ok {
		l.NamespaceConditions[namespace] = make(map[string]Condition)
	}

	for k, v := range l.rulesByName {
		l.NamespaceRules[namespace][k] = v
		l.rulesByName = make(map[string]Rule)
	}

	for k, v := range l.conditionsByName {
		l.NamespaceConditions[namespace][k] = v
		l.conditionsByName = make(map[string]Condition)
	}
}

func (l *SurfaceRuleSerializer) ExitSurfaceConditionDeclaration(ctx *grammars.SurfaceConditionDeclarationContext) {
	if len(l.conditionStack) > 0 {
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
		l.conditionsByName[name] = l.conditionStack[len(l.conditionStack)-1]
	}
}

func (l *SurfaceRuleSerializer) ExitSurfaceRuleDeclaration(ctx *grammars.SurfaceRuleDeclarationContext) {
	if len(l.ruleStack) > 0 {
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
		l.rulesByName[name] = l.ruleStack[len(l.ruleStack)-1]

	}
}

func (l *SurfaceRuleSerializer) Finalize() {
	for _, rules := range l.NamespaceRules {
		for name, rule := range rules {
			rules[name] = l.ReplaceRefs(rule)
		}
	}
}
