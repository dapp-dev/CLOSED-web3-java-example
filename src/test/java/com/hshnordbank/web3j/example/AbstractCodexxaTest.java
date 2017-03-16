/*  ______ __    ______ ______ __  __ ______ __   __  _____  __ __  __
 * |  ___ |  |  |  __  |  ____|  |/ _|  ____|  |_|  |/  _  \|..|  \|  | (C)opyright 2017 HSH Nordbank
 * |  ___<|  \__|  \_| |  \___|    <_|  \___|   _   |  |_|  |  |      | The dapp-dev team.
 *  \_____|\____|\_____|\_____|__|\__|\_____|__| |__|__| |__|__|__|\__|
 */
package com.hshnordbank.web3j.example;

import com.hshnordbank.web3j.CredentialsHelper;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

import java.math.BigInteger;

import static org.web3j.tx.Contract.GAS_LIMIT;
import static org.web3j.tx.ManagedTransaction.GAS_PRICE;

abstract class AbstractCodexxaTest {
    
    private static final BigInteger MAX_GAS_PER_TX = BigInteger.valueOf(3141592L);

    // every test has its own web3j instance
    private final Web3j web3j = Web3j.build(new HttpService("http://cloud.codexxa.com:8545"));

    protected <T> T run(Example<T> example) {
        final Credentials credentials = CredentialsHelper.getDefaultCredentials();
        return example.run(web3j, credentials, GAS_PRICE, GAS_LIMIT, MAX_GAS_PER_TX);
    }

    protected Web3j getWeb3j() {
        return web3j;
    }

}
