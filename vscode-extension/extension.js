const vscode = require('vscode');
const { LanguageClient, TransportKind } = require('vscode-languageclient/node');
let client;

/**
 * Activates the extension
 */
function activate(context) {
    // Get the mms executable path from settings
    const config = vscode.workspace.getConfiguration('mms');
    const serverPath = config.get('languageServer.path') || 'mms';

    // If the language server is disabled, don't start it
    if (config.get('languageServer.enabled') === false) {
        return;
    }

    // Define server options - we're using a stdio connection with the 'lsp' command
    const serverOptions = {
        command: serverPath,
        args: ['lsp'],
        transport: TransportKind.stdio
    };

    // Define client options - connecting to the 'mms' language
    const clientOptions = {
        documentSelector: [{ scheme: 'file', language: 'mms' }],
        synchronize: {
            fileEvents: vscode.workspace.createFileSystemWatcher('**/*.mms')
        }
    };

    // Create the language client
    client = new LanguageClient(
        'mmsLanguageServer',
        'MMS Language Server',
        serverOptions,
        clientOptions
    );

    // Start the client
    client.start();
    console.log('MMS Language Server started');
}

/**
 * Deactivates the extension
 */
function deactivate() {
    if (!client) {
        return undefined;
    }
    return client.stop();
}

module.exports = { activate, deactivate };
