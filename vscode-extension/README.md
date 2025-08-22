# MMS Language Extension for Visual Studio Code

This extension provides language support for MMS (Minecraft Mapping Script) files in Visual Studio Code.

## Features

- Syntax highlighting for MMS files
- Code completion for MMS keywords
- Hover information for MMS elements
- Basic diagnostic reporting

## Requirements

- Visual Studio Code v1.60.0 or higher
- The `mms` executable must be in your PATH or configured in settings

## Installation

### Local Development Installation

1. Copy this extension folder to `~/.vscode/extensions/` (macOS/Linux) or `%USERPROFILE%\.vscode\extensions` (Windows)
2. Restart VS Code
3. MMS files (with `.mms` extension) should now be recognized

### From VSIX Package

1. Run `npm install` in this directory to install dependencies
2. Run `vscode:package` command to build a VSIX package
3. In VS Code, go to Extensions view and click "..." menu
4. Choose "Install from VSIX..." and select the generated file
5. Restart VS Code

## Extension Settings

This extension contributes the following settings:

* `mms.languageServer.enabled`: Enable/disable the MMS language server
* `mms.languageServer.path`: Path to the MMS executable

## Known Issues

- The language server implementation is basic and will be improved over time

## Release Notes

### 0.0.1

Initial release with basic language support
