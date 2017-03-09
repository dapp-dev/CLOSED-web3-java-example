#!/usr/bin/env bash
rm -fr temp/
solc SSDRegistry.sol --bin --abi --optimize -o compiled/
mv compiled/SSD.sol:SSD.abi compiled/SSD.abi
mv compiled/SSDRegistry.sol:SSDRegistry.abi compiled/SSDRegistry.abi
