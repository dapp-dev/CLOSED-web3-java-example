package com.hshnordbank.web3j.example;

import org.web3j.protocol.core.Request;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;

/**
 * An example that returns the version of the underlying Ethereum Blockchain node.
 *
 * @author Daniel Dietrich
 */
public class GetVersionExample implements BlockchainHelper {

    public static void main(String[] args) {
        new GetVersionExample().run();
    }

    String run() {
        final Request<?, Web3ClientVersion> asyncRequest = getWeb3j().web3ClientVersion();
        final Web3ClientVersion result = waitForResult(asyncRequest);
        return result.getWeb3ClientVersion();
    }

}
