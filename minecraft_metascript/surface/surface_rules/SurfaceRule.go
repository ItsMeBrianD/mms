package surface_rules

import (
	"encoding/json"
	"fmt"

	"github.com/itsmebriand/mms/mms/grammars"
)

type SurfaceRuleKind string

const (
	BandlandsRuleKind   SurfaceRuleKind = "minecraft:bandlands"
	BlockRuleKind       SurfaceRuleKind = "minecraft:block"
	SequenceRuleKind    SurfaceRuleKind = "minecraft:sequence"
	ConditionalRuleKind SurfaceRuleKind = "minecraft:condition"
	ReferenceRuleKind   SurfaceRuleKind = "__mms:reference"
)

type SurfaceRule interface {
	json.Marshaler
	fmt.Stringer

	Type() SurfaceRuleKind
}

type RuleFactory interface {
	ConstructSurfaceRule(*grammars.SurfaceRuleContext) (SurfaceRule, error)
}
