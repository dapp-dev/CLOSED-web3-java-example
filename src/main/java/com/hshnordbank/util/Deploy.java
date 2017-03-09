package com.hshnordbank.util;

import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

// see https://docs.web3j.io/smart_contracts.html#smart-contract-wrappers
public class Deploy {

    public static void main(String[] args) {

        final Web3j web3j = Web3j.build(new HttpService(/*"http://localhost:8545"*/));

        // !!!!!!!!!!!!!!!!!!!!!!!!!!!
        // TODO: deploy smart contract
        // SSDRegistry.deploy(web3j, (Credentials) null, null, null, null);
        // !!!!!!!!!!!!!!!!!!!!!!!!!!!

    }
}
                           x