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
 * An example that deploys the SSDRegistry contract and returns the new address.
 */
public class DeploymentExample implements Example<String> {

    @Override
    public String run(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger gasValue) {
        // HOMEWORK -->
        // Use one of the com.hshnordbank.ssd.wrapper.SSDRegistry.deploy() methods
        // to deploy the SSDRegistry to the blockchain.
        return null; // TODO
        // <-- HOMEWORK
    }

}
