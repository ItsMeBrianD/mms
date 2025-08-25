package surface

import (
	"encoding/json"
	"errors"

	"github.com/itsmebriand/mms/minecraft_metascript/surface/surface_conditions"
	"github.com/itsmebriand/mms/minecraft_metascript/surface/surface_rules"
	"github.com/itsmebriand/mms/mms/lib"
)

func exportRules(ns *lib.Namespace, rootDir *lib.FileTreeLike) error {
	rules := make(map[string]surface_rules.SurfaceRule)
	for name, rule := range lib.AllOf[surface_rules.SurfaceRule](ns) {
		rules[name] = rule.Value
	}
	rulesString, err := json.Marshal(rules)
	if err != nil {
		return err
	}
	rootDir.MkFile("surface_rules.json", string(rulesString))

	return nil
}

func exportConditions(ns *lib.Namespace, rootDir *lib.FileTreeLike) error {
	rules := make(map[string]surface_conditions.SurfaceCondition)
	for name, rule := range lib.AllOf[surface_conditions.SurfaceCondition](ns) {
		rules[name] = rule.Value
	}
	rulesString, err := json.Marshal(rules)
	if err != nil {
		return err
	}
	rootDir.MkFile("surface_conditions.json", string(rulesString))

	return nil
}

func Export(ns *lib.Namespace, rootDir *lib.FileTreeLike) error {
	if !rootDir.IsDir {
		return errors.New("root must be a directory")
	}

	debugDir := rootDir.MkDir("_debug")
	exportRules(ns, debugDir)
	exportConditions(ns, debugDir)

	return nil

}
