/*  ______ __    ______ ______ __  __ ______  _____  __ __  __
 * |  ___ |  |  |  __  |  ____|  |/ _|  ____|/  _  \|..|  \|  | (C)opyright 2017 HSH Nordbank
 * |  ___<|  \__|  \_| |  \___|    <_|  \___|  |_|  |  |      | The dapp-dev team.
 *  \_____|\____|\_____|\_____|__|\__|\_____|__| |__|__|__|\__|
 */
package com.hshnordbank.web3j.example;

import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;

import java.math.BigInteger;
import java.util.List;

import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;

/**
 * An example that queries the list of SSDs of the default user.
 */
public class QueryExample implements Example<List<?>> {

    @Override
    public List<?> run(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger gasValue) {
        // HOMEWORK -->
        // Use com.hshnordbank.ssd.wrapper.SSDRegistry to load the list of SSDs
        // 1) The method getSSDCount(Address user) returns the number of SSDs for a specific user (getDefaultAccount)
        // 2) The method getSSD(Address user, Uint256 index) returns the SSD with 0 <= index < ssdCount for a specfic user
		final Address defaultAccount = getDefaultAccount();
		int ssdCount = getSSDRegistry().getSSDCount(defaultAccount).get().getValue().intValue();
		final List<List<Type>> ssds = new ArrayList<>();
		for (int i = 0; i < ssdCount; i++) {
			ssds.add(getSSDRegistry().getSSD(defaultAccount, new Uint256(BigInteger.valueOf(i))).get());
		}
		return ssds;
        // <-- HOMEWORK
    }

}
