/*  ______ __    ______ ______ __  __ ______ __   __  _____  __ __  __
 * |  ___ |  |  |  __  |  ____|  |/ _|  ____|  |_|  |/  _  \|..|  \|  | (C)opyright 2017 HSH Nordbank
 * |  ___<|  \__|  \_| |  \___|    <_|  \___|   _   |  |_|  |  |      | The dapp-dev team.
 *  \_____|\____|\_____|\_____|__|\__|\_____|__| |__|__| |__|__|__|\__|
 */
package com.hshnordbank.web3j;

import com.hshnordbank.ssd.wrapper.*;
import org.web3j.protocol.Web3j;

public final class SSDRegistryHelper {

    private SSDRegistryHelper() {
        throw new IllegalAccessError();
    }

    /**
     * Returns a web3j wrapper instance of the singleton blockchain contract 'SSDRegistry'.
     *
     * @param web3j a web3j connection
     * @param ssdRegistryAddress an optional address
     * @return A new instance of SSDRegistry
     */
    public static SSDRegistry getSSDRegistry(Web3j web3j, String ssdRegistryAddress) {
        final SSDRegistry ssdRegistry = SSDRegistry.load(
                ssdRegistryAddress,
                web3j,
                CredentialsHelper.getDefaultCredentials(),
                SSDRegistry.GAS_PRICE,
                SSDRegistry.GAS_LIMIT);
        if (ssdRegistry == null) {
            throw new IllegalStateException("SSDRegistry not found at " + ssdRegistryAddress);
        }
        return ssdRegistry;
    }

}
