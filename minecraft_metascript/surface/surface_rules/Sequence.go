package surface_rules

import (
	"encoding/json"
	"fmt"

	"github.com/itsmebriand/mms/mms/grammars"
)

func NewSequenceRule(
	ctx *grammars.SurfaceRule_SequenceContext,
) (*SequenceRule, error) {
	return &SequenceRule{}, nil
}

type SequenceRule struct {
	SurfaceRule
}

func (r SequenceRule) Type() SurfaceRuleKind {
	return SequenceRuleKind
}

func (r SequenceRule) String() string {
	return fmt.Sprintf("surfaceRule(%s)", r.Type())
}

func (r SequenceRule) MarshalJSON() ([]byte, error) {
	return json.Marshal(struct {
		Type SurfaceRuleKind `json:"type"`
	}{
		Type: r.Type(),
	})
}
