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
		Arguments: []cli.Argument{
			&cli.StringArg{
				Name:      "file",
				UsageText: "The file to parse",
			},
		},
		Description: "Test command to parse a Minecraft Meta Script (MMS) file.",
		Action: func(c context.Context, cmd *cli.Command) error {
			file := cmd.StringArg("file")
			project := mms.NewProject(file)

			return project.Parse()
		},
	}

	if err := app.Run(context.Background(), os.Args); err != nil {
		log.Fatal(err)
	}

}
