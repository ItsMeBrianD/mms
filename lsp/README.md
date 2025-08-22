# MMS Language Server

This directory contains an implementation of a Language Server Protocol (LSP) for the MMS language. The language server provides features like code completion, hover information, and diagnostics for MMS files.

## Features

- Document synchronization (open, change, close)
- Basic code completion for common keywords
- Hover information for keywords
- Basic diagnostic reporting

## Usage

The language server is integrated with the MMS CLI tool. To start the language server:

```bash
./mms lsp
```

This will start the language server in standard I/O mode, which allows it to communicate with editor extensions.

## Editor Integration

### Visual Studio Code

1. Install the [vscode-languageserver-node](https://github.com/microsoft/vscode-languageserver-node) extension
2. Configure your `settings.json` to use the MMS language server:

```json
{
  "languageServerExample.trace.server": "verbose",
  "languageServer.mms": {
    "command": "mms",
    "args": ["lsp"],
    "filetypes": ["mms"]
  }
}
```

3. You can use the included `.vscode/launch.json` to debug the language server

### Future Improvements

The current implementation provides basic LSP functionality. Future improvements could include:

- Integration with MMS grammar for accurate parsing and validation
- More sophisticated diagnostic reporting
- Go-to-definition support
- Symbol search and workspace references
- Code formatting
- Refactoring support

## Architecture

The language server is built with the following components:

- `LanguageServer.go` - Main language server implementation with handlers for LSP methods
- `protocol.go` - LSP protocol type definitions
- `jsonrpc.go` - JSON-RPC communication handling

The server follows a standard LSP implementation pattern:
1. Connect to stdin/stdout for communication
2. Register handlers for LSP methods
3. Process incoming requests and notifications
4. Send responses and notifications back to the client
