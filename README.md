# Web3j Java Example

Es hat geklappt :)
Bei mir auch :-)

## Installation

1. Install the latest version of Git: https://git-scm.com
2. Clone our Github project: `git clone https://github.com/dapp-dev/web3-java-example.git` 
3. Import `web3-java-example` as Maven project in the Java IDE of your choice.

## Start the Examples

Open and start the main classes in `src/main/java/...`

## Homework

Fix the TODOs and make the Unit tests green.

Starting point:
 
* [Web3j Docs](https://docs.web3j.io)
* [Solidity Docs](https://solidity.readthedocs.io/en/develop/introduction-to-smart-contracts.html])

## The Details

### Structure of the project

```
contracts                → Ethereum contract source code (solidity language) + compile script
 └ compiled              → Compiled contracts (binary + abi).
src                      → Home of Java sources (Maven style directory layout)
src-gen                  → Home of generated sources (produced by mvn clean package)
wallet                   → The cryptographic wallet containing the user credentials (public/private key)
```

The compiled contracts and the generated files (see above) are checked in into Github, so you don't have to cope with contract development for now.

### Main classes

* `com.hshnordbank.util.DeploymentExample` deploys a contract to the blockchain
* `com.hshnordbank.util.ListSSDs` prints the contracts of a specific user to the console
