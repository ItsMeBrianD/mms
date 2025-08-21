package walkers_test

import (
	"testing"

	"github.com/itsmebriand/mms/parse"
	"github.com/itsmebriand/mms/walkers"
	surface_rule_walkers "github.com/itsmebriand/mms/walkers/surface_rules"
)

func TestNoRules(t *testing.T) {
	file, err := parse.ParseFileContent("namespace demo;", "test.mms")
	if err != nil {
		t.Fatal(err)
	}
	res := walkers.SerializeSurfaceRules(file)

	keys := make([]string, 0, len(res))
	for k := range res {
		keys = append(keys, k)
	}

	if len(keys) != 0 {
		t.Errorf("Expected no rules, got %d", len(keys))
	}
}

func TestUnscopedRules(t *testing.T) {
	_, err := parse.ParseFileContent(`
namespace demo;
rule myRule block minecraft:stone
	`, "test.mms")
	if err == nil {
		t.Fatal("Expected error, got nil")
	}
}

func TestSimpleBlockRule(t *testing.T) {
	file, err := parse.ParseFileContentStrict(`
namespace demo;
surface mySurface {
	rule myRule block minecraft:stone
}
	`, "test.mms")
	if err != nil {
		t.Fatal(err)
	}
	res := walkers.SerializeSurfaceRules(file)
	keys := make([]string, 0, len(res))
	for k := range res {
		keys = append(keys, k)
	}
	if len(keys) != 1 {
		t.Errorf("Expected 1 rule, got %d", len(keys))
	}
	if res["myRule"].Type() != surface_rule_walkers.BlockRuleType {
		t.Errorf("Expected block rule, got %s", res["myRule"].Type())
	}
	if res["myRule"].(surface_rule_walkers.BlockRule).Block != "minecraft:stone" {
		t.Errorf("Expected block rule, got %s", res["myRule"].Type())
	}
}

func TestSequenceRule(t *testing.T) {
	file, err := parse.ParseFileContentStrict(`
namespace demo;
surface mySurface {
	rule seqRule sequence [
		block minecraft:stone
		block minecraft:dirt
	]
}
`, "test.mms")
	if err != nil {
		t.Fatal(err)
	}
	res := walkers.SerializeSurfaceRules(file)
	rule, ok := res["seqRule"]
	if !ok {
		t.Fatalf("Expected rule 'seqRule' present")
	}
	if rule.Type() != surface_rule_walkers.SequenceRuleType {
		t.Errorf("Expected sequence rule, got %s", rule.Type())
	}
	seq := rule.(surface_rule_walkers.SequenceRule)
	if len(seq.Sequence) != 2 {
		t.Errorf("Expected 2 children in sequence, got %d", len(seq.Sequence))
	}
	if seq.Sequence[0].(surface_rule_walkers.BlockRule).Block != "minecraft:stone" {
		t.Errorf("First child should be stone")
	}
	if seq.Sequence[1].(surface_rule_walkers.BlockRule).Block != "minecraft:dirt" {
		t.Errorf("Second child should be dirt")
	}
}

func TestReferenceRule(t *testing.T) {
	file, err := parse.ParseFileContentStrict(`
namespace demo;
surface mySurface {
	rule MyRule sequence [
		block minecraft:stone
		rule(RefMe)
	]

	rule RefMe block minecraft:dirt
}
`, "test.mms")
	if err != nil {
		t.Fatal(err)
	}
	res := walkers.SerializeSurfaceRules(file)
	rule, ok := res["MyRule"]
	if !ok {
		t.Fatalf("Expected rule 'MyRule' present")
	}
	if _, ok := rule.(surface_rule_walkers.SequenceRule); !ok {
		t.Errorf("Expected sequence rule, got %s", rule.Type())
	}
	r := rule.(surface_rule_walkers.SequenceRule)
	if r.Sequence[1].Type() != surface_rule_walkers.BlockRuleType {
		t.Errorf("Expected block rule, got %s", r.Sequence[1].Type())
	}
	if r.Sequence[1].(surface_rule_walkers.BlockRule).Block != "minecraft:dirt" {
		t.Errorf("Expected block to be dirt")
	}
}

func TestNestedSequence(t *testing.T) {
	file, err := parse.ParseFileContentStrict(`
namespace demo;
surface mySurface {
	rule MyRule sequence [
		block minecraft:stone
		block minecraft:dirt
		sequence [
			block minecraft:stone
			block minecraft:dirt
		]
	]
}
`, "test.mms")
	if err != nil {
		t.Fatal(err)
	}
	res := walkers.SerializeSurfaceRules(file)
	rule, ok := res["MyRule"]
	if !ok {
		t.Fatalf("Expected rule 'MyRule' present")
	}
	if _, ok := rule.(surface_rule_walkers.SequenceRule); !ok {
		t.Errorf("Expected sequence rule, got %s", rule.Type())
	}
	r := rule.(surface_rule_walkers.SequenceRule)
	if r.Sequence[2].Type() != surface_rule_walkers.SequenceRuleType {
		t.Errorf("Expected sequence rule, got %s", r.Sequence[2].Type())
	}
}
