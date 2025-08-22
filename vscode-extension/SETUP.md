# MMS Language Server - VSCode Setup Guide

This guide will help you set up and test the MMS Language Server with Visual Studio Code.

## Prerequisites

- Visual Studio Code installed
- Go installed (to build the MMS binary)
- Node.js and npm installed (for extension dependencies)

## Setup Steps

### 1. Build the MMS binary

First, make sure the MMS binary is built and available in your PATH:

```bash
# From the root of the MMS project
go build -o mms
# Optional: Move to a directory in your PATH
# sudo cp mms /usr/local/bin/
```

### 2. Install the VSCode Extension

There are two ways to install the extension:

#### Option 1: Using the provided script

```bash
# From the vscode-extension directory
./install_extension.sh
```

This will:
- Copy the extension files to your VSCode extensions directory
- Install the required npm dependencies
- Ask you to restart VSCode

#### Option 2: Manual installation

1. Create a directory for the extension:
```bash
mkdir -p ~/.vscode/extensions/mms-language
```

2. Copy the extension files:
```bash
cp -r /path/to/mms/vscode-extension/* ~/.vscode/extensions/mms-language/
```

3. Install dependencies:
```bash
cd ~/.vscode/extensions/mms-language
npm install
```

4. Restart VSCode

### 3. Configure VSCode

Once the extension is installed, you may need to:

1. Make sure the MMS binary is in your PATH or configure the path in settings:
```json
{
  "mms.languageServer.path": "/path/to/mms"
}
```

2. If VSCode doesn't automatically recognize .mms files, you can force the file type by:
   - Opening a .mms file
   - Clicking on the language indicator in the bottom-right corner
   - Selecting "MMS" from the language list

## Testing the Language Server

1. Open the sample MMS file:
```bash
code /path/to/mms/examples/sample.mms
```

2. Test the language server features:
   - Type keywords like `rule`, `condition`, or `block` to see code completion
   - Hover over keywords to see hover information
   - Make syntax errors to see diagnostics (if implemented)

3. Check the Output panel in VSCode:
   - Select "MMS Language Server" from the dropdown
   - Look for log messages indicating the server is running

### Debugging

If you encounter issues:

1. Enable verbose logging in VSCode settings:
```json
{
  "mms.languageServer.trace.server": "verbose"
}
```

2. Check the Developer Tools console (Help > Toggle Developer Tools)

3. Look at the extension logs in the Output panel

4. You can also run the language server manually for testing:
```bash
./mms lsp
```

And in a separate terminal, send JSON-RPC messages to test it.
