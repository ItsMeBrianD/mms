const vscode = require('vscode');
const { CompletionItemFeature } = require('vscode-languageclient/lib/common/completion');
const { LanguageClient, TransportKind, RevealOutputChannelOn, CompletionRequest } = require('vscode-languageclient/node');
/**
 * @type {LanguageClient}
 */
let client;

/**
 * Activates the extension
 * @param {vscode.ExtensionContext} context
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
    /** @type {import('vscode-languageclient/node').Executable} */
    const serverOptions = {
        command: serverPath,
        args: ['lsp'],
        transport: TransportKind.stdio,
        options: {
            detached: false
        }
    };

    // Define client options - connecting to the 'mms' language
    /** @type {import('vscode-languageclient/node').LanguageClientOptions} */
    const clientOptions = {
        documentSelector: [{ scheme: 'file', language: 'mms' }],
        synchronize: {
            fileEvents: vscode.workspace.createFileSystemWatcher('**/*.mms'),

        },
        outputChannelName: "MMS Language Server",
        revealOutputChannelOn: RevealOutputChannelOn.Info,
        traceOutputChannel: vscode.window.createOutputChannel("MMS Language Server Trace")
    };

    /**
     * 
     * @returns {LanguageClient}
     */
    const mkClient = () => {
        return new LanguageClient(
            'mmsLanguageServer',
            'MMS Language Server',
            serverOptions,
            clientOptions,
        );
    }
    // Create the language client
    client = mkClient();

    client.onNotification("textDocument/completion", (params) => {
        client.info(params)
    })

    client.onNotification("textDocument/publishDiagnostics", (params) => {
        client.info(params)
    })

    context.subscriptions.push(vscode.commands.registerCommand("mms.restartLangServer", () => {
        client.info("Attempting to restart language server")
        client.restart();
    }))


    // Start the client
    client.start();
    client.info("MMS Language Server started")

}

/**
 * Deactivates the extension
 */
function deactivate() {
    if (!client) {
        return undefined;
    }
    client.info("Attempting to stop language server")
    return client.stop();
}

module.exports = { activate, deactivate };
