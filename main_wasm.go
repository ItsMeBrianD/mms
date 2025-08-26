//go:build js && wasm

package main

import (
	"encoding/json"
	"errors"
	"log"
	"syscall/js"

	"github.com/itsmebriand/mms/minecraft_metascript"
	"github.com/itsmebriand/mms/minecraft_metascript/worldgen/noise"
	"github.com/itsmebriand/mms/minecraft_metascript/worldgen/surface/surface_conditions"
	"github.com/itsmebriand/mms/minecraft_metascript/worldgen/surface/surface_rules"
)

func parseLiteral(this js.Value, args []js.Value) interface{} {
	if len(args) != 1 {
		return errors.New("expected 1 argument")
	}
	content := args[0].String()
	project := minecraft_metascript.NewMMSProject()

	err := project.AddFile("wasm_content", content)
	if err != nil {
		return err
	}

	filetree := project.Export()

	tree, err := json.MarshalIndent(filetree, "", "  ")
	if err != nil {
		return err
	}

	symbols := map[string]any{}

	symbols["surface_rules"] = minecraft_metascript.ProjectSymbols[surface_rules.SurfaceRule](project)
	symbols["surface_conditions"] = minecraft_metascript.ProjectSymbols[surface_conditions.SurfaceCondition](project)
	symbols["noise"] = minecraft_metascript.ProjectSymbols[noise.Noise](project)

	symbolsStr, err := json.Marshal(symbols)
	if err != nil {
		return err
	}

	js.Global().Call("parseLiteralCallback", string(tree), string(symbolsStr))

	return nil
}

func main() {
	log.Default().Println("MMS WASM loading")
	js.Global().Set("parseLiteral", js.FuncOf(parseLiteral))
	log.Default().Println("parseLiteral function registered")

	log.Default().Println("MMS WASM loaded")
	select {} // Keep Go WASM running
}
