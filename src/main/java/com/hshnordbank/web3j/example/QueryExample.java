package com.hshnordbank.web3j.example;

import java.util.List;

/**
 * An example that queries the list of SSDs of the default user.
 *
 * @author Daniel Dietrich
 */
public class QueryExample implements BlockchainHelper {

    public static void main(String[] args) {
        new QueryExample().run();
    }

    // TODO(@daniel): specify return type
    List<?> run() {
        // HOMEWORK -->
        // Use com.hshnordbank.ssd.wrapper.SSDRegistry to load the list of SSDs
        // 1) The method getSSDCount(Address user) returns the number of SSDs for a specific user (getDefaultAccount)
        // 2) The method getSSD(Address user, Uint256 index) returns the SSD with 0 <= index < ssdCount for a specfic user
        // <-- HOMEWORK
        return null; // TODO
    }

}
