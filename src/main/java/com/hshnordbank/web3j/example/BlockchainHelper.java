package com.hshnordbank.web3j.example;

import com.hshnordbank.ssd.wrapper.SSDRegistry;
import org.web3j.abi.datatypes.Address;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.Request;
import org.web3j.protocol.core.Response;
import org.web3j.protocol.http.HttpService;

import java.io.File;
import java.math.BigInteger;
import java.util.concurrent.Future;

/**
 * Provides Ethereum helper methods for our examples.
 */
interface BlockchainHelper {

    BigInteger MAX_GAS_PER_TX = BigInteger.valueOf(3141592L);

    Web3j DEFAULT_WEB3J = Web3j.build(new HttpService("http://cloud.codexxa.com:8545"));
    String SSD_REGISTRY_ADDRESS = "0x3b8d7b5c06241f033528608f3a4d2a885138c7c5";

    String WALLET_PATH = "wallet/UTC--2017-03-09T17-33-49.673298850Z--d16336a9f47074ca5fb539b972f7e4451f25a997";
    String WALLET_PASS = "start123";

    /**
     * Returns the singleton Web3j facade to the blockchain.
     *
     * @return A Web3j instance
     */
    default Web3j getWeb3j() {
        return DEFAULT_WEB3J;
    }

    /**
     * Returns the first Ethereum account of the connected node.
     * 
     * @return the Address of the default account
     * @throws IllegalStateException if something unexpected happens (like an IOException)
     */
    default Address getDefaultAccount() {
        try {
            return new Address(getWeb3j().ethAccounts().send().getAccounts().get(0));
        } catch (Exception x) {
            throw new IllegalStateException("Something went wrong retrieving the default account.", x);
        }
    }

    /**
     * Returns the credentials for accessing the blockchain node.
     * 
     * @return A new Credentials instance
     */
    // GENERATE A NEW WALLET: WalletUtils.generateFullNewWalletFile("start123", new File("wallet"));
    default Credentials getCredentials() {
        try {
            return WalletUtils.loadCredentials(WALLET_PASS, new File(WALLET_PATH));
        } catch(Exception x) {
            throw new IllegalStateException("Error loading credentials from wallet " + WALLET_PATH, x);
        }
    }
    
    /**
     * Returns a web3j wrapper instance of the singleton blockchain contract 'SSDRegistry'.
     *
     * @return A new instance of SSDRegistry
     */
    default SSDRegistry getSSDRegistry() {
        return SSDRegistry.load(
                SSD_REGISTRY_ADDRESS,
                getWeb3j(),
                (Credentials) null,
                SSDRegistry.GAS_PRICE,
                SSDRegistry.GAS_LIMIT);
    }

    /**
     * Waits for the result of an asynchronous blockchain request.
     *
     * @param request an asynchronous blockchain request
     * @param <T> response type
     * @return A new Response instance
     * @throws IllegalStateException if something unexpected happens (like an IOException)
     */
    default <T extends Response> T waitForResult(Request<?, T> request) {
        try {
            return request.send();
        } catch (Exception x) {
            throw new IllegalStateException("Error retrieving the async result from the blockchain.", x);
        }
    }

    /**
     * Waits for the result of an asynchronous Future computation.
     *
     * @param future a Future instance
     * @param <T> result type
     * @return The resulting value of the Future computation
     * @throws IllegalStateException if something unexpected happens (like an IOException)
     */
    default <T> T waitForResult(Future<? extends T> future) {
        try {
            return future.get();
        } catch (Exception x) {
            throw new IllegalStateException("Error retrieving the async result from the blockchain.", x);
        }
    }

}
