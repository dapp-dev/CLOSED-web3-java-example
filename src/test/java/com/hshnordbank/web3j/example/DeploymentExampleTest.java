/*  ______ __    ______ ______ __  __ ______ __   __  _____  __ __  __
 * |  ___ |  |  |  __  |  ____|  |/ _|  ____|  |_|  |/  _  \|..|  \|  | (C)opyright 2017 HSH Nordbank
 * |  ___<|  \__|  \_| |  \___|    <_|  \___|   _   |  |_|  |  |      | The dapp-dev team.
 *  \_____|\____|\_____|\_____|__|\__|\_____|__| |__|__| |__|__|__|\__|
 */
package com.hshnordbank.web3j.example;

import com.hshnordbank.ssd.wrapper.SSDRegistry;
import com.hshnordbank.web3j.AsyncHelper;
import com.hshnordbank.web3j.SSDRegistryHelper;
import org.junit.Test;
import org.web3j.abi.datatypes.Bool;

import java.util.concurrent.Future;

import static org.assertj.core.api.Assertions.assertThat;

public class DeploymentExampleTest extends AbstractCodexxaTest {

    @Test
    public void shouldReturnAllSSDsOfTheDefaultUser() {
        final String ssdRegistryAddress = run(new DeploymentExample());
        final SSDRegistry ssdRegistry = SSDRegistryHelper.getSSDRegistry(getWeb3j(), ssdRegistryAddress);
        final Future<Bool> asyncResult = ssdRegistry.isDeployed();
        final boolean isDeployed = AsyncHelper.waitForResult(asyncResult).getValue();
        assertThat(isDeployed).isTrue();
    }
}
