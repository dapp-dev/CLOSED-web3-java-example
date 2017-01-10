/*     / \____  _    _  ____   ______  / \ ____  __    _______
 *    /  /    \/ \  / \/    \ /  /\__\/  //    \/  \  //  /\__\   JΛVΛSLΛNG
 *  _/  /  /\  \  \/  /  /\  \\__\\  \  //  /\  \ /\\/ \ /__\ \   Copyright 2014-2017 Javaslang, http://javaslang.io
 * /___/\_/  \_/\____/\_/  \_/\__\/__/\__\_/  \_//  \__/\_____/   Licensed under the Apache License, Version 2.0
 */
package com.hshnordbank.web3;

import org.junit.Test;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

public class ConnectionTest {

    @Test
    public void shouldBeConnected() {
        final Web3j web3 = Web3j.build(new HttpService("http://localhost:8545"));
        web3.web3ClientVersion().observable().subscribe(x -> {
            String clientVersion = x.getWeb3ClientVersion();
            // TODO: assert something
            System.out.println("Client version: " + clientVersion);
        });
    }

}
