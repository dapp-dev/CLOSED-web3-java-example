package com.hshnordbank.web3j.example;

import com.hshnordbank.ssd.wrapper.SSDRegistry;
import org.junit.Test;
import org.web3j.abi.datatypes.Bool;

import java.util.concurrent.Future;

import static com.hshnordbank.ssd.wrapper.SSDRegistry.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.web3j.tx.Contract.GAS_LIMIT;

public class DeploymentExampleTest implements BlockchainHelper {

    @Test
    public void shouldReturnAllSSDsOfTheDefaultUser() {
        final String address = new DeploymentExample().run();
        final SSDRegistry ssdRegistry = SSDRegistry.load(
                address,
                getWeb3j(),
                getCredentials(),
                GAS_PRICE,
                GAS_LIMIT);
        final Future<Bool> asyncResult = ssdRegistry.isDeployed();
        final boolean isDeployed = waitForResult(asyncResult).getValue();
        assertThat(isDeployed).isTrue();
    }
}
