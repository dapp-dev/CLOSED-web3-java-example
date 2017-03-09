package com.hshnordbank.util;

import org.web3j.codegen.SolidityFunctionWrapperGenerator;

// see https://docs.web3j.io/smart_contracts.html#smart-contract-wrappers
public class GenerateWrappers {

    public static void main(String[] args) {
        generateWrapper("contracts/compiled/SSD.bin", "contracts/compiled/SSD.abi", "src-gen/main/java", "com.hshnordbank.ssd.wrapper");
        generateWrapper("contracts/compiled/SSDRegistry.bin", "contracts/compiled/SSDRegistry.abi", "src-gen/main/java", "com.hshnordbank.ssd.wrapper");
    }

    private static void generateWrapper(String pathToBin, String pathToAbi, String pathToSrcGen, String packageName) {
        try {
            SolidityFunctionWrapperGenerator.main(new String[] {
                    pathToBin,
                    pathToAbi,
                    "-o",
                    pathToSrcGen,
                    "-p",
                    packageName
            });
        } catch (Exception e) {
            throw new IllegalStateException("Error generating wrapper for " + pathToAbi, e);
        }
    }
}
