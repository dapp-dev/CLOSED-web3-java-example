/*  ______ __    ______ ______ __  __ ______ __   __  _____  __ __  __
 * |  ___ |  |  |  __  |  ____|  |/ _|  ____|  |_|  |/  _  \|..|  \|  | (C)opyright 2017 HSH Nordbank
 * |  ___<|  \__|  \_| |  \___|    <_|  \___|   _   |  |_|  |  |      | The dapp-dev team.
 *  \_____|\____|\_____|\_____|__|\__|\_____|__| |__|__| |__|__|__|\__|
 */
package com.hshnordbank.web3j.example;

import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;

import java.math.BigInteger;

/**
 * Represents an example computation on the blockchain.
 *
 * @param <R> result type
 */
@FunctionalInterface
public interface Example<R> {

    /**
     * Runs the blockchain example given a blockchain connection and returns the result.
     *
     * @param web3j a blockchain connection
     * @param credentials user credentials, internally needed by web3j to unlock an account for write operations
     * @param gasPrice the current gasPrice
     * @param gasLimit the current gasLimit
     * @param gasValue the amount of Ether for the transaction. Unused Gas is returned back to the user.
     * @return computation result
     */
    R run(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger gasValue);

}
