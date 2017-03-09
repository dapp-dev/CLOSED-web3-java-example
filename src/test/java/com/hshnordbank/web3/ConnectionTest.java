package com.hshnordbank.web3;

import org.junit.Test;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

public class ConnectionTest {

    @Test
    public void shouldBeConnected() {
        final Web3j web3j = Web3j.build(new HttpService("http://localhost:8545"));
        web3j.web3ClientVersion().observable().subscribe(x -> {
            String clientVersion = x.getWeb3ClientVersion();
            // TODO: assert something
            System.out.println("Client version: " + clientVersion);
        });
    }

}
