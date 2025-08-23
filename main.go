//go:build !js && !wasm

package main

import (
	"context"
	"encoding/json"
	"fmt"
	"log"
	"os"

	two "github.com/itsmebriand/mms/lsp/2"
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
				Name: "lsp",
				Flags: []cli.Flag{
					&cli.BoolFlag{
						Name: "stdio",
					},
				},
				Description: "Start the MMS language server",
				Action: func(c context.Context, cmd *cli.Command) error {
					log.Println("Starting MMS language server...")
					two.Start()
					return nil

					// Create and initialize the language server
					// server := lsp.NewLanguageServer()

					// // Connect standard input and output
					// if err := server.Connect(os.Stdin, os.Stdout); err != nil {
					// 	return fmt.Errorf("failed to connect server: %v", err)
					// }

					// log.Println("MMS language server connected to stdin/stdout")

					// // Run the server
					// return server.Run()
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
					project := mms.NewProject()
					t, err := project.ParseFiles(file)
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
