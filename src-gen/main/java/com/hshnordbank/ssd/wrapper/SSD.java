package com.hshnordbank.ssd.wrapper;

import java.lang.String;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Future;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Bytes3;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Int256;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint32;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modify!</strong><br>
 * Please use {@link org.web3j.codegen.SolidityFunctionWrapperGenerator} to update.
 *
 * <p>Generated with web3j version 2.1.0.
 */
public final class SSD extends Contract {
    private static final String BINARY = "6060604052341561000c57fe5b6040516101408061099e833981016040528080519060200190919080519060200190919080519060200190919080519060200190919080519060200190919080519060200190919080519060200190919080519060200190919080519060200190919080519060200190919050505b898073ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff1614156100b557610000565b600460019054906101000a900463ffffffff16600460059054906101000a900463ffffffff168063ffffffff168263ffffffff1611156100f457610000565b6001600060006101000a81548160ff0219169083600381111561011357fe5b021790555033600060016101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055508c600160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055508b600160146101000a81548162ffffff02191690837d010000000000000000000000000000000000000000000000000000000000900402179055508a6002819055508960038190555088600460006101000a81548160ff021916908360ff16021790555087600460016101000a81548163ffffffff021916908363ffffffff16021790555086600460056101000a81548163ffffffff021916908363ffffffff16021790555085600460096101000a81548160ff021916908360ff1602179055508460058190555083600681600019169055505b5b50505b50505050505050505050505b6107118061028d6000396000f300606060405236156100d9576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff1680630deae51a146100ee57806312424e3f146101145780631d143848146101265780633b39e5ae1461017857806342f889b2146101aa5780634dc415de146101d65780637022b58e146101e85780637c3a00fd146101fa578063904c609414610220578063bd7097e11461024e578063c19d93fb1461027a578063c3df6546146102ae578063d59624b414610300578063e235ad2f14610332578063e5a6b10f14610358575b34156100e157fe5b6100ec5b610000565b565b005b34156100f657fe5b6100fe6103be565b6040518082815260200191505060405180910390f35b341561011c57fe5b6101246103c4565b005b341561012e57fe5b61013661047e565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b341561018057fe5b6101886104a4565b604051808263ffffffff1663ffffffff16815260200191505060405180910390f35b34156101b257fe5b6101ba6104ba565b604051808260ff1660ff16815260200191505060405180910390f35b34156101de57fe5b6101e66104cd565b005b34156101f057fe5b6101f8610587565b005b341561020257fe5b61020a610641565b6040518082815260200191505060405180910390f35b341561022857fe5b610230610647565b60405180826000191660001916815260200191505060405180910390f35b341561025657fe5b61025e61064d565b604051808260ff1660ff16815260200191505060405180910390f35b341561028257fe5b61028a610660565b6040518082600381111561029a57fe5b60ff16815260200191505060405180910390f35b34156102b657fe5b6102be610673565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b341561030857fe5b610310610699565b604051808263ffffffff1663ffffffff16815260200191505060405180910390f35b341561033a57fe5b6103426106af565b6040518082815260200191505060405180910390f35b341561036057fe5b6103686106b5565b60405180827cffffffffffffffffffffffffffffffffffffffffffffffffffffffffff19167cffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916815260200191505060405180910390f35b60025481565b600060009054906101000a900460ff16600060038111156103e157fe5b8160038111156103ed57fe5b1415156103f957610000565b600060019054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff1614151561045557610000565b6001600060006101000a81548160ff0219169083600381111561047457fe5b02179055505b5b50565b600060019054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b600460019054906101000a900463ffffffff1681565b600460099054906101000a900460ff1681565b600060009054906101000a900460ff16600160038111156104ea57fe5b8160038111156104f657fe5b14151561050257610000565b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff1614151561055e57610000565b6003600060006101000a81548160ff0219169083600381111561057d57fe5b02179055505b5b50565b600060009054906101000a900460ff16600160038111156105a457fe5b8160038111156105b057fe5b1415156105bc57610000565b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff1614151561061857610000565b6002600060006101000a81548160ff0219169083600381111561063757fe5b02179055505b5b50565b60035481565b60065481565b600460009054906101000a900460ff1681565b600060009054906101000a900460ff1681565b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b600460059054906101000a900463ffffffff1681565b60055481565b600160149054906101000a90047d01000000000000000000000000000000000000000000000000000000000002815600a165627a7a723058207f0f1fa43412e32d38d4ed33a58b0bef6360111d4efdf7b8fd9ab4b61db5d56a0029";

    private SSD(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private SSD(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public Future<Uint256> nominal() {
        Function function = new Function("nominal", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> approve() {
        Function function = new Function("approve", Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Address> issuer() {
        Function function = new Function("issuer", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Uint32> valueDate() {
        Function function = new Function("valueDate", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint32>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Uint8> structured() {
        Function function = new Function("structured", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> reject() {
        Function function = new Function("reject", Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<TransactionReceipt> confirm() {
        Function function = new Function("confirm", Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Int256> interestRate() {
        Function function = new Function("interestRate", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Int256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Bytes32> contractHash() {
        Function function = new Function("contractHash", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Uint8> interestRateDecimalUnits() {
        Function function = new Function("interestRateDecimalUnits", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Uint8> state() {
        Function function = new Function("state", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Address> counterparty() {
        Function function = new Function("counterparty", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Uint32> maturityDate() {
        Function function = new Function("maturityDate", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint32>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Uint256> denominationSize() {
        Function function = new Function("denominationSize", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Bytes3> currency() {
        Function function = new Function("currency", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes3>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public static Future<SSD> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialValue, Address _counterparty, Bytes3 _currency, Uint256 _nominal, Int256 _interestRate, Uint8 _interestRateDecimalUnits, Uint32 _valueDate, Uint32 _maturityDate, Uint8 _structured, Uint256 _denominationSize, Bytes32 _contractHash) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(_counterparty, _currency, _nominal, _interestRate, _interestRateDecimalUnits, _valueDate, _maturityDate, _structured, _denominationSize, _contractHash));
        return deployAsync(SSD.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor, initialValue);
    }

    public static Future<SSD> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialValue, Address _counterparty, Bytes3 _currency, Uint256 _nominal, Int256 _interestRate, Uint8 _interestRateDecimalUnits, Uint32 _valueDate, Uint32 _maturityDate, Uint8 _structured, Uint256 _denominationSize, Bytes32 _contractHash) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(_counterparty, _currency, _nominal, _interestRate, _interestRateDecimalUnits, _valueDate, _maturityDate, _structured, _denominationSize, _contractHash));
        return deployAsync(SSD.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor, initialValue);
    }

    public static SSD load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new SSD(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static SSD load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new SSD(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
