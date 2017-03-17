#!/usr/bin/env bash
rm -fr temp/
# --optimize
solc SSDRegistry.sol --bin --abi -o compiled/
mv compiled/SSD.sol:SSD.abi compiled/SSD.abi
mv compiled/SSDRegistry.sol:SSDRegistry.abi compiled/SSDRegistry.abi
