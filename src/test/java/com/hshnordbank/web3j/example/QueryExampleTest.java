/*  ______ __    ______ ______ __  __ ______ __   __  _____  __ __  __
 * |  ___ |  |  |  __  |  ____|  |/ _|  ____|  |_|  |/  _  \|..|  \|  | (C)opyright 2017 HSH Nordbank
 * |  ___<|  \__|  \_| |  \___|    <_|  \___|   _   |  |_|  |  |      | The dapp-dev team.
 *  \_____|\____|\_____|\_____|__|\__|\_____|__| |__|__| |__|__|__|\__|
 */
package com.hshnordbank.web3j.example;

import org.junit.Test;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class QueryExampleTest extends AbstractCodexxaTest {

    @Test
    public void shouldGetSSDListOfCounterparty() {
        final List<String> ssds = run(new QueryExample());
        assertThat(ssds).isNotNull();
        // TEST -->
        for (String ssd : ssds) {
            System.out.println(ssd);
        }
        // <-- TEST
    }

}
