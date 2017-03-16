/*  ______ __    ______ ______ __  __ ______ __   __  _____  __ __  __
 * |  ___ |  |  |  __  |  ____|  |/ _|  ____|  |_|  |/  _  \|..|  \|  | (C)opyright 2017 HSH Nordbank
 * |  ___<|  \__|  \_| |  \___|    <_|  \___|   _   |  |_|  |  |      | The dapp-dev team.
 *  \_____|\____|\_____|\_____|__|\__|\_____|__| |__|__| |__|__|__|\__|
 */
package com.hshnordbank.web3j.example;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GetVersionExampleTest extends AbstractCodexxaTest {

    @Test
    public void shouldRetrieveTheCorrectBlockchainVersion() {
        final String version = run(new GetVersionExample());
        assertThat(version).isEqualTo("Geth/LocalEth/v1.5.9-stable-a07539fb/linux/go1.7.3");
    }

}
