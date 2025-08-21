package main

import (
	"context"
	"fmt"
	"log"
	"os"

	"github.com/antlr4-go/antlr/v4"
	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/serializers"
	"github.com/urfave/cli/v3"
)

func parseFileContent(content string) grammars.IMmsFileContext {
	stream := antlr.NewInputStream(content)
	lexer := grammars.NewMMSLexer(stream)
	parser := grammars.NewMMSParser(antlr.NewCommonTokenStream(lexer, 0))
	return parser.MmsFile()
}

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

			tree := parseFileContent(string(data))
			serializers.SerializeSurfaceRules(tree)
			return nil
		},
	}

	if err := app.Run(context.Background(), os.Args); err != nil {
		log.Fatal(err)
	}

}
