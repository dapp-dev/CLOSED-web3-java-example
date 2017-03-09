/*     / \____  _    _  ____   ______  / \ ____  __    _______
 *    /  /    \/ \  / \/    \ /  /\__\/  //    \/  \  //  /\__\   JΛVΛSLΛNG
 *  _/  /  /\  \  \/  /  /\  \\__\\  \  //  /\  \ /\\/ \ /__\ \   Copyright 2014-2017 Javaslang, http://javaslang.io
 * /___/\_/  \_/\____/\_/  \_/\__\/__/\__\_/  \_//  \__/\_____/   Licensed under the Apache License, Version 2.0
 */
package com.hshnordbank.util;

import com.hshnordbank.ssd.wrapper.SSDRegistry;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Contract;
import org.web3j.tx.ManagedTransaction;

import java.util.List;

public class ListSSDs {

    public static void main(String[] args) {

        final Web3j web3j = Web3j.build(new HttpService(/*"http://localhost:8545"*/));

        final SSDRegistry ssdRegistry = SSDRegistry.load(
                "0x05f790d4cbd0c295878eb45745c3df8a0b65fa20",
                web3j,
                (Credentials) null,
                ManagedTransaction.GAS_PRICE, Contract.GAS_LIMIT);

        web3j.ethAccounts().observable().subscribe(ethAccounts -> {
            List<String> accounts = ethAccounts.getAccounts();
            Address address = new Address(accounts.get(0));
            try {

                // TEST (do be deleted) -->
                Bool isDeployed = ssdRegistry.isDeployed().get();
                System.out.println("SSDCount: " + isDeployed.getValue());
                // <-- TEST

                // !!!!!!!!!!!!!!!!!!!!!!!!!!!
                // TODO: LIST SSDs
                // !!!!!!!!!!!!!!!!!!!!!!!!!!!

            } catch(Throwable x) {
                x.printStackTrace();
            }
        });

        System.out.println("Waiting...");



    }
}
