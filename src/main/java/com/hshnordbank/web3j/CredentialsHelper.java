/*  ______ __    ______ ______ __  __ ______ __   __  _____  __ __  __
 * |  ___ |  |  |  __  |  ____|  |/ _|  ____|  |_|  |/  _  \|..|  \|  | (C)opyright 2017 HSH Nordbank
 * |  ___<|  \__|  \_| |  \___|    <_|  \___|   _   |  |_|  |  |      | The dapp-dev team.
 *  \_____|\____|\_____|\_____|__|\__|\_____|__| |__|__| |__|__|__|\__|
 */
package com.hshnordbank.web3j;

import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;

import java.io.File;

public final class CredentialsHelper {

    private static final String WALLET_DIR = "wallet/";
    private static final String DEFAULT_USER = "default";
    private static final String DEFAULT_PASS = "start123";

    private CredentialsHelper() {
        throw new IllegalAccessError();
    }

    /**
     * Loads the credentials of the default user 0xd16336a9f47074ca5fb539b972f7e4451f25a997
     *
     * @return a new Credentials instance
     */
    public static Credentials getDefaultCredentials() {
        return getCredentials(DEFAULT_USER, DEFAULT_PASS);
    }

    /**
     * Returns the credentials for accessing the blockchain node by accessing the user wallet.
     * 
     * @param user the blockchain address of a user associated with a wallet
     * @param pass the wallet pass
     * @return A new Credentials instance
     */
    public static Credentials getCredentials(String user, String pass) {
        try {
            return WalletUtils.loadCredentials(pass, getWalletFile(user));
        } catch(Exception x) {
            throw new IllegalStateException("Error loading credentials from wallet " + WALLET_DIR, x);
        }
    }

    private static File getWalletFile(String user) {
        return new File(WALLET_DIR + (WALLET_DIR.endsWith(File.separator) ? "" : File.separator) + user);
    }

}
