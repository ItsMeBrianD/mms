package main

import (
	"context"
	"fmt"
	"log"
	"os"

	"github.com/antlr4-go/antlr/v4"
	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/urfave/cli/v3"
)

func main() {
	app := &cli.Command{
		Name: "mms",
		Arguments: []cli.Argument{
			&cli.StringArg{
				Name:      "file",
				UsageText: "The file to parse",
			},
		},
		Description: "Test command to parse a Minecraft Meta Script (MMS) file.",
		Action: func(c context.Context, cmd *cli.Command) error {
			file := cmd.StringArg("file")
			fmt.Println(file)
			data, err := os.ReadFile(file)
			if err != nil {
				return err
			}

			fmt.Println(string(data))

			stream := antlr.NewInputStream(string(data))
			lexer := grammars.NewMMSLexer(stream)

			// parser := grammars.NewMMSParser(antlr.NewCommonTokenStream(lexer, 0))

			for _, token := range lexer.GetAllTokens() {
				name := lexer.SymbolicNames[token.GetTokenType()]
				fmt.Printf("[%s] %s\n", name, token.GetText())
			}

			// tree := parser.MmsFile()

			// fmt.Println(tree)

			// antlr.ParseTreeWalkerDefault.Walk(nil, tree)
			return nil
		},
	}

	if err := app.Run(context.Background(), os.Args); err != nil {
		log.Fatal(err)
	}

}
