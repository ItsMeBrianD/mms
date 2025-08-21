package main

import (
	"context"
	"errors"
	"fmt"
	"log"
	"os"

	"github.com/itsmebriand/mms/parse"
	"github.com/itsmebriand/mms/walkers"
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

			tree, errs := parse.ParseFileContent(string(data), file)
			if len(errs) > 0 {
				return errors.Join(errs...)
			}
			walkers.SerializeSurfaceRules(tree)
			return nil
		},
	}

	if err := app.Run(context.Background(), os.Args); err != nil {
		log.Fatal(err)
	}

}
