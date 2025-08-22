//go:build js && wasm

package main

import (
	"syscall/js"

	"github.com/itsmebriand/mms/mms"
)

func parseLiteral(this js.Value, args []js.Value) interface{} {
	content := args[0].String()
	project := mms.NewProject("-")

	_, err := project.ParseFile(content)
	return err
}

func main() {
	js.Global().Set("parseLiteral", js.FuncOf(parseLiteral))

	select {} // Keep Go WASM running
}
