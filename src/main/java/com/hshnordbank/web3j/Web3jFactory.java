package com.hshnordbank.web3j;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;


/**
 * Factory Class for accessing the correct blockchain - depending on the environment.
 *
 * Created by henner on 21.03.17.
 */
public class Web3jFactory {

    private BlockchainEnvironment env;
    private String version;
    private Web3j web3j;

    private static Map<BlockchainEnvironment, Web3jFactory> factories = new HashMap<BlockchainEnvironment, Web3jFactory>(3);

    /**
     * Hardcoded Environment Options to select...
     */
    public enum BlockchainEnvironment {
        DEV(-2),
        TEST(-1),
        PROD(0),
        DEFAULT(1);

        private int i;
        private String name;
        private String url;
        private String user;
        private String pass;
        private BigInteger gas_max;

        private BlockchainEnvironment(int i) {
            this.i = i;
        }

        private void init(int i) {
            switch (i) {
                case -2: // DEV
                    this.url = "http://localhost:8545";
                    this.user = "default";
                    this.pass = "start123";
                    this.gas_max = BigInteger.valueOf(3141592L);
                    break;
                case -1: // TEST
                    this.url = "http://cloud.codexxa.com:8545";
                    this.user = "default";
                    this.pass = "start123";
                    this.gas_max = BigInteger.valueOf(3141592L);
                    break;
                case 0: // PROD
                    // TODO
                    break;
                case 1: // DEFAULT
                    // if macOS ...
                    this.url = "http://cloud.codexxa.com:8545";
                    this.user = "default";
                    this.pass = "start123";
                    this.gas_max = BigInteger.valueOf(3141592L);
                    break;
            }
        }

        public String getUrl() {
            return this.url;
        }

        public String getDefaultUser() {
            return this.user;
        }

        public String getDefaultPassword() {
            return this.pass;
        }

        public BigInteger getMaximumGasLimit() {
            return this.gas_max;
        }

        public String toString() {
            StringBuilder s = new StringBuilder();
            s.append(this.name);
            s.append("[");
            s.append(this.url);
            s.append("]");
            return s.toString();
        }
    }

    private Web3jFactory(BlockchainEnvironment env) {
        // instantiation see getInstance (singleton)
        this.env = env;
    }

    public static synchronized Web3jFactory getInstance(BlockchainEnvironment env) {
        Web3jFactory result = factories.get(env);
        if (result == null) {
            result = new Web3jFactory(env);
            factories.put(env, result);
        }
        return result;
    }

    public Web3j getWeb3j() {
        // lazy initialization:
        if (this.web3j == null) {
            synchronized (this) {
                web3j = Web3j.build(new HttpService(env.getUrl()));
                if (!isAvailable()) web3j = null;  //reset to null
            }
        }
        return web3j;
    }

    public String getVersion() {
        return version;  // TODO needs to be assigned during isAvailable test...
    }

    public static Credentials getDefaultCredentials() {
        // TODO
        return null;
        /**
        try {
            return WalletUtils.loadCredentials(env.getDefaultPassword(), getWalletFile(env.getDefaultUser()));
        } catch(Exception x) {
            throw new IllegalStateException("Error loading credentials from wallet " + WALLET_DIR, x);
        }
         **/
    }

    public boolean isAvailable() {
        // TODO
        System.out.println("Check the blockchain before first usage (availability, user, password, wallet etc.)... (TODO)");
        // we could use the getVersion function to to this and assign the version to local variable...!
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Blockchain-");
        sb.append(env);
        return sb.toString();
    }
}
