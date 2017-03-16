/*  ______ __    ______ ______ __  __ ______ __   __  _____  __ __  __
 * |  ___ |  |  |  __  |  ____|  |/ _|  ____|  |_|  |/  _  \|..|  \|  | (C)opyright 2017 HSH Nordbank
 * |  ___<|  \__|  \_| |  \___|    <_|  \___|   _   |  |_|  |  |      | The dapp-dev team.
 *  \_____|\____|\_____|\_____|__|\__|\_____|__| |__|__| |__|__|__|\__|
 */
package com.hshnordbank.web3j;

import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;

import java.util.stream.Collectors;

public final class TransactionHelper {

    private TransactionHelper() {
        throw new IllegalAccessError();
    }

    public static String stringify(TransactionReceipt transactionReceipt) {
        return "{\n" +
                "  response: {\n" +
                "    contract-address: " + transactionReceipt.getContractAddress() + "\n" +
                "  },\n" +
                "  transaction: {\n" +
                "    from: " + transactionReceipt.getFrom() + ",\n" +
                "    root: " + transactionReceipt.getRoot() + ",\n" +
                "    to: " + transactionReceipt.getTo() + ",\n" +
                "    hash: " + transactionReceipt.getTransactionHash() + ",\n" +
                "    index: " + transactionReceipt.getTransactionIndex() + ",\n" +
                "    index-raw: " + transactionReceipt.getTransactionIndexRaw() + ",\n" +
                "    cost: {\n" +
                "      cumulative-gas-used: " + transactionReceipt.getCumulativeGasUsed() + ",\n" +
                "      cumulative-gas-used-raw: " + transactionReceipt.getCumulativeGasUsedRaw() + ",\n" +
                "      gas-used: " + transactionReceipt.getGasUsed() + ",\n" +
                "      gas-used-raw: " + transactionReceipt.getGasUsedRaw() + "\n" +
                "    },\n" +
                "  },\n" +
                "  block: {\n" +
                "    hash: " + transactionReceipt.getBlockHash() + ",\n" +
                "    number: " + transactionReceipt.getBlockNumber() + ",\n" +
                "    number-raw: " + transactionReceipt.getBlockNumberRaw() + "\n" +
                "  },\n" +
                "  logs: {\n" +
                "    bloom: " + transactionReceipt.getLogsBloom() + ",\n" +
                "    lines: '" + transactionReceipt.getLogs().stream().map(Log::toString).collect(Collectors.joining("\n")) + "'\n" +
                "  }\n" +
                "}";
    }
}
