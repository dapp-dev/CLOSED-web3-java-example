package com.hshnordbank.web3j.example;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GetVersionExampleTest {

    @Test
    public void shouldRetrieveTheCorrectBlockchainVersion() {
        final String version = new GetVersionExample().run();
        assertThat(version).isEqualTo("Geth/LocalEth/v1.5.9-stable-a07539fb/linux/go1.7.3");
    }
}
