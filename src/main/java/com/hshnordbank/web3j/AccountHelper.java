/*  ______ __    ______ ______ __  __ ______ __   __  _____  __ __  __
 * |  ___ |  |  |  __  |  ____|  |/ _|  ____|  |_|  |/  _  \|..|  \|  | (C)opyright 2017 HSH Nordbank
 * |  ___<|  \__|  \_| |  \___|    <_|  \___|   _   |  |_|  |  |      | The dapp-dev team.
 *  \_____|\____|\_____|\_____|__|\__|\_____|__| |__|__| |__|__|__|\__|
 */
package com.hshnordbank.web3j;

import org.web3j.abi.datatypes.Address;
import org.web3j.protocol.Web3j;

public final class AccountHelper {

    private AccountHelper() {
        throw new IllegalAccessError();
    }

    public static Address getDefaultAccount(Web3j web3j) {
        try {
            return new Address(web3j.ethAccounts().send().getAccounts().get(0));
        } catch (Exception x) {
            throw new IllegalStateException("Something went wrong retrieving the default account.", x);
        }
    }
}
