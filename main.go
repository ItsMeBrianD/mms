//go:build !js && !wasm

package main

import (
	"context"
	"log"
	"os"

	"github.com/itsmebriand/mms/mms"
	"github.com/urfave/cli/v3"
)

func main() {
	app := &cli.Command{
		Name: "mms",

		Commands: []*cli.Command{
			{
				Name: "version",
				Action: func(c context.Context, cmd *cli.Command) error {
					log.Println("mms version 0.1.0")
					return nil
				},
			},
			{
				Name: "parse",
				Arguments: []cli.Argument{
					&cli.StringArg{
						Name:      "file",
						UsageText: "The file to parse",
					},
				},

				Action: func(c context.Context, cmd *cli.Command) error {
					file := cmd.StringArg("file")
					project := mms.NewProject(file)

					return project.Parse()
				},
			},
		},
	}

	if err := app.Run(context.Background(), os.Args); err != nil {
		log.Fatal(err)
	}

}
