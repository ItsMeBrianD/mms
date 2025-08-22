//go:build !js && !wasm

package main

import (
	"context"
	"encoding/json"
	"fmt"
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
				Name: "build",
				Arguments: []cli.Argument{
					&cli.StringArg{
						Name:      "file",
						UsageText: "The root directory or file to build",
					},
				},

				Action: func(c context.Context, cmd *cli.Command) error {
					file := cmd.StringArg("file")
					project := mms.NewProject(file)
					t, err := project.Parse()
					if err != nil {
						return err
					}

					data, err := json.Marshal(t)
					if err != nil {
						return err
					}
					fmt.Println(string(data))

					return nil
				},
			},
		},
	}

	if err := app.Run(context.Background(), os.Args); err != nil {
		log.Fatal(err)
	}

}
