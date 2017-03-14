package com.hshnordbank.web3j.example;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;

/**
 * An example that queries the list of SSDs of the default user.
 *
 * @author Daniel Dietrich
 */
public class QueryExample implements BlockchainHelper {

	public static void main(String[] args) throws Exception {
		new QueryExample().run();
	}

	// TODO(@daniel): specify return type
	List<?> run() throws Exception {
		// HOMEWORK -->
		// Use com.hshnordbank.ssd.wrapper.SSDRegistry to load the list of SSDs
		// 1) The method getSSDCount(Address user) returns the number of SSDs
		// for a specific user (getDefaultAccount)
		// 2) The method getSSD(Address user, Uint256 index) returns the SSD
		// with 0 <= index < ssdCount for a specfic user
		// <-- HOMEWORK

		Address defaultAccount = getDefaultAccount();

		int ssdCount = getSSDRegistry().getSSDCount(defaultAccount).get().getValue().intValue();
		
		List<List<Type>> ssds = new ArrayList<>();

		for (int i = 0; i < ssdCount; i++) {
			ssds.add(getSSDRegistry().getSSD(defaultAccount, new Uint256(BigInteger.valueOf(i))).get());
		}

		return ssds;
	}

}
