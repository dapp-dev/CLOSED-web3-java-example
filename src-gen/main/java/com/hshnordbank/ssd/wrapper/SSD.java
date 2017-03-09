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
    private static final String BINARY = "6060604052341561000c57fe5b604051610140806106de83398101604090815281516020830151918301516060840151608085015160a086015160c087015160e0880151610100890151610120909901519698959694959394929391929091905b8980600160a060020a031633600160a060020a0316141561008057610000565b60045463ffffffff610100820481169165010000000000900416808211156100a757610000565b600080546001919060ff191682805b021790555033600060016101000a815481600160a060020a030219169083600160a060020a031602179055508c600160006101000a815481600160a060020a030219169083600160a060020a031602179055508b600160146101000a81548162ffffff02191690837d010000000000000000000000000000000000000000000000000000000000900402179055508a6002819055508960038190555088600460006101000a81548160ff021916908360ff16021790555087600460016101000a81548163ffffffff021916908363ffffffff16021790555086600460056101000a81548163ffffffff021916908363ffffffff16021790555085600460096101000a81548160ff021916908360ff1602179055508460058190555083600681600019169055505b5b50505b50505050505050505050505b6104e2806101fc6000396000f300606060405236156100bf5763ffffffff60e060020a6000350416630deae51a81146100d457806312424e3f146100f65780631d143848146101085780633b39e5ae1461013457806342f889b21461015d5780634dc415de146101835780637022b58e146101955780637c3a00fd146101a7578063904c6094146101c9578063bd7097e1146101eb578063c19d93fb14610211578063c3df654614610245578063d59624b414610271578063e235ad2f1461029a578063e5a6b10f146102bc575b34156100c757fe5b6100d25b610000565b565b005b34156100dc57fe5b6100e4610301565b60408051918252519081900360200190f35b34156100fe57fe5b6100d2610307565b005b341561011057fe5b61011861035f565b60408051600160a060020a039092168252519081900360200190f35b341561013c57fe5b610144610373565b6040805163ffffffff9092168252519081900360200190f35b341561016557fe5b61016d610384565b6040805160ff9092168252519081900360200190f35b341561018b57fe5b6100d261039a565b005b341561019d57fe5b6100d26103f2565b005b34156101af57fe5b6100e461044a565b60408051918252519081900360200190f35b34156101d157fe5b6100e4610450565b60408051918252519081900360200190f35b34156101f357fe5b61016d610456565b6040805160ff9092168252519081900360200190f35b341561021957fe5b61022161045f565b6040518082600381111561023157fe5b60ff16815260200191505060405180910390f35b341561024d57fe5b610118610468565b60408051600160a060020a039092168252519081900360200190f35b341561027957fe5b610144610477565b6040805163ffffffff9092168252519081900360200190f35b34156102a257fe5b6100e461048c565b60408051918252519081900360200190f35b34156102c457fe5b6102cc610492565b604080517fffffff00000000000000000000000000000000000000000000000000000000009092168252519081900360200190f35b60025481565b6000805460ff16905b81600381111561031c57fe5b1461032657610000565b60005433600160a060020a03908116610100909204161461034657610000565b600080546001919060ff191682805b02179055505b5b50565b6000546101009004600160a060020a031681565b600454610100900463ffffffff1681565b6004546901000000000000000000900460ff1681565b60005460ff1660015b8160038111156103af57fe5b146103b957610000565b60015433600160a060020a039081169116146103d457610000565b600080546003919060ff1916600183610355565b02179055505b5b50565b60005460ff1660015b81600381111561040757fe5b1461041157610000565b60015433600160a060020a0390811691161461042c57610000565b600080546002919060ff1916600183610355565b02179055505b5b50565b60035481565b60065481565b60045460ff1681565b60005460ff1681565b600154600160a060020a031681565b60045465010000000000900463ffffffff1681565b60055481565b60015474010000000000000000000000000000000000000000900460e860020a02815600a165627a7a72305820479e2e7993fcb390504d2bed7bc7af50d5028415c50ebfb5dbf101854aa13d910029";

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
