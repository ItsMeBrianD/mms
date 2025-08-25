package mms_file

import (
	"errors"

	"github.com/itsmebriand/mms/minecraft_metascript/block_states"
	"github.com/itsmebriand/mms/minecraft_metascript/surface/surface_conditions"
	"github.com/itsmebriand/mms/minecraft_metascript/surface/surface_rules"
)

type MMSDeclarations struct {
	surfaceRules      map[string]surface_rules.SurfaceRule
	surfaceConditions map[string]surface_conditions.SurfaceCondition
	blockStates       map[string]block_states.BlockState
	biomes            map[string]struct{}
}

func NewMMSDeclarations() *MMSDeclarations {
	return &MMSDeclarations{
		surfaceRules:      make(map[string]surface_rules.SurfaceRule),
		surfaceConditions: make(map[string]surface_conditions.SurfaceCondition),
		blockStates:       make(map[string]block_states.BlockState),
		biomes:            make(map[string]struct{}),
	}
}

func (d *MMSDeclarations) AddSurfaceRule(rule surface_rules.SurfaceRule, name string) error {
	if rule == nil {
		return errors.New("rule cannot be nil")
	}
	if _, ok := d.surfaceRules[name]; ok {
		return errors.New("rule name already exists: " + name)
	}
	d.surfaceRules[name] = rule
	return nil
}

func (d *MMSDeclarations) AddSurfaceCondition(condition surface_conditions.SurfaceCondition, name string) error {
	if condition == nil {
		return errors.New("condition cannot be nil")
	}
	if _, ok := d.surfaceConditions[name]; ok {
		return errors.New("condition name already exists: " + name)
	}
	d.surfaceConditions[name] = condition
	return nil
}

func (d *MMSDeclarations) AddBlockState(state block_states.BlockState, name string) error {
	if _, ok := d.blockStates[name]; ok {
		return errors.New("state name already exists: " + name)
	}
	d.blockStates[name] = state
	return nil
}

func (d *MMSDeclarations) AddBiome(name string) error {
	if _, ok := d.biomes[name]; ok {
		return errors.New("biome name already exists: " + name)
	}
	d.biomes[name] = struct{}{}
	return nil
}

func (d *MMSDeclarations) GetSurfaceRules() map[string]surface_rules.SurfaceRule {
	return d.surfaceRules
}

func (d *MMSDeclarations) GetSurfaceConditions() map[string]surface_conditions.SurfaceCondition {
	return d.surfaceConditions
}

func (d *MMSDeclarations) GetBlockStates() map[string]block_states.BlockState {
	return d.blockStates
}

func (d *MMSDeclarations) GetBiomes() map[string]struct{} {
	return d.biomes
}

func (d *MMSDeclarations) Merge(other MMSDeclarations) []error {
	errors := make([]error, 0)
	for name, rule := range other.surfaceRules {
		err := d.AddSurfaceRule(rule, name)
		if err != nil {
			errors = append(errors, err)
		}
	}
	for name, condition := range other.surfaceConditions {
		err := d.AddSurfaceCondition(condition, name)
		if err != nil {
			errors = append(errors, err)
		}
	}
	for name, state := range other.blockStates {
		err := d.AddBlockState(state, name)
		if err != nil {
			errors = append(errors, err)
		}
	}
	for name := range other.biomes {
		err := d.AddBiome(name)
		if err != nil {
			errors = append(errors, err)
		}
	}
	if len(errors) > 0 {
		return errors
	}
	return nil
}
