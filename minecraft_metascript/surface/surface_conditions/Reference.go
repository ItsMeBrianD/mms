package surface_conditions

import (
	"errors"

	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/lib"
)

func NewSurfaceConditionReference(ctx *grammars.SurfaceConditionReferenceContext) (*ConditionReference, error) {
	return &ConditionReference{
		Reference: lib.ParseReferential("minecraft", ctx),
	}, nil
}

type ConditionReference struct {
	lib.Reference
}

func (c ConditionReference) Type() ConditionType {
	return ReferenceConditionType
}

func (c ConditionReference) MarshalJSON() ([]byte, error) {
	return nil, errors.New("ConditionReference cannot be marshaled")
}
