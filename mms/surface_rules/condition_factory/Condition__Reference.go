package condition_factory

import (
	"errors"

	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/lib"
)

func (f *ConditionFactory) NewSurfaceConditionReference(ctx *grammars.SurfaceConditionReferenceContext) Condition {
	return ConditionReference{
		Reference: lib.ParseReferential(f.CurrentNamespace, ctx),
	}
}

type ConditionReference struct {
	lib.Reference
	Namespace string
	Name      string
	comment   *string
}

func (c ConditionReference) Type() ConditionType { return ReferenceConditionType }

func (c ConditionReference) MarshalJSON() ([]byte, error) {
	return nil, errors.New("ConditionReference cannot be marshaled")
}

func (c ConditionReference) Comment() *string { return c.comment }

func (c ConditionReference) SetComment(comment *string) { c.comment = comment }
