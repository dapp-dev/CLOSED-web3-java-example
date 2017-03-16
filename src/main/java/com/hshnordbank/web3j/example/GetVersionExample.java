/*  ______ __    ______ ______ __  __ ______ __   __  _____  __ __  __
 * |  ___ |  |  |  __  |  ____|  |/ _|  ____|  |_|  |/  _  \|..|  \|  | (C)opyright 2017 HSH Nordbank
 * |  ___<|  \__|  \_| |  \___|    <_|  \___|   _   |  |_|  |  |      | The dapp-dev team.
 *  \_____|\____|\_____|\_____|__|\__|\_____|__| |__|__| |__|__|__|\__|
 */
package com.hshnordbank.web3j.example;

import com.hshnordbank.web3j.AsyncHelper;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.Request;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;

import java.math.BigInteger;

/**
 * An example that returns the version of the underlying Ethereum Blockchain node.
 */
public class GetVersionExample implements Example<String> {

    @Override
    public String run(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger gasValue) {
        final Request<?, Web3ClientVersion> asyncRequest = web3j.web3ClientVersion();
        final Web3ClientVersion result = AsyncHelper.waitForResult(asyncRequest);
        return result.getWeb3ClientVersion();
    }

}
