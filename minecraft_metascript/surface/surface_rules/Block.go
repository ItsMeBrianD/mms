package surface_rules

import (
	"encoding/json"
	"fmt"

	"github.com/itsmebriand/mms/minecraft_metascript/block_states"
	"github.com/itsmebriand/mms/minecraft_metascript/primitives"
	"github.com/itsmebriand/mms/mms/grammars"
)

func NewBlockRule(state grammars.ISurfaceRule_BlockContext) (*BlockRule, error) {
	ref, err := primitives.FromResourceReference(state.ResourceReference(), "minecraft")
	if err != nil {
		return nil, err
	}

	return &BlockRule{
		state: block_states.BlockState{Name: ref.String()},
	}, nil
}

type BlockRule struct {
	SurfaceRule

	state block_states.BlockState
}

func (r BlockRule) Type() SurfaceRuleKind {
	return BlockRuleKind
}

func (r BlockRule) String() string {
	return fmt.Sprintf("surfaceRule(%s)", r.Type())
}

func (r BlockRule) MarshalJSON() ([]byte, error) {
	return json.Marshal(struct {
		Type  SurfaceRuleKind         `json:"type"`
		State block_states.BlockState `json:"result_state"`
	}{
		Type:  r.Type(),
		State: r.state,
	})
}
