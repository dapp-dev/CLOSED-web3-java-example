/*  ______ __    ______ ______ __  __ ______ __   __  _____  __ __  __
 * |  ___ |  |  |  __  |  ____|  |/ _|  ____|  |_|  |/  _  \|..|  \|  | (C)opyright 2017 HSH Nordbank
 * |  ___<|  \__|  \_| |  \___|    <_|  \___|   _   |  |_|  |  |      | The dapp-dev team.
 *  \_____|\____|\_____|\_____|__|\__|\_____|__| |__|__| |__|__|__|\__|
 */
package com.hshnordbank.web3j.example;

import com.hshnordbank.ssd.wrapper.SSDRegistry;
import com.hshnordbank.web3j.AccountHelper;
import com.hshnordbank.web3j.SSDRegistryHelper;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;

/**
 * An example that queries the list of SSDs of the default user.
 */
public class QueryExample implements Example<List<String>> {

    @Override
    public List<String> run(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger gasValue) {
        // HOMEWORK -->
        // Use com.hshnordbank.ssd.wrapper.SSDRegistry to load the list of SSDs
        // 1) The method getSSDCount(Address user) returns the number of SSDs for a specific user (getDefaultAccount)
        // 2) The method getSSD(Address user, Uint256 index) returns the SSD with 0 <= index < ssdCount for a specfic user
		try {
			final Address counterparty = AccountHelper.getDefaultAccount(web3j);
			final SSDRegistry ssdRegistry = SSDRegistryHelper.getSSDRegistry(web3j, "0xd452ec5dcc346411cd3ac16806c8a479354cf794");
			final int ssdCount = ssdRegistry.getSSDCount(counterparty).get().getValue().intValue();
			final List<String> ssds = new ArrayList<>();
			for (int i = 0; i < ssdCount; i++) {
				final List<Type> types = ssdRegistry.getSSD(counterparty, new Uint256(BigInteger.valueOf(i))).get();
                final String ssd = types.stream().map(type -> String.valueOf(type.getValue())).collect(Collectors.joining(", "));
				ssds.add(ssd);
			}
			return ssds;
		} catch(Exception x) {
			throw new IllegalStateException("Error loading SSD List", x);
		}
        // <-- HOMEWORK
    }

}
