package com.zz.backend.contract;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.5.16.
 */
@SuppressWarnings("rawtypes")
public class DecVoting extends Contract {
    public static final String BINARY = "60806040526000805461ff0019169055606f60015534801561002057600080fd5b506000805460ff19168155610dd190819061003b90396000f3fe608060405234801561001057600080fd5b50600436106101375760003560e01c80639cc2d993116100b8578063b767eb981161007c578063b767eb9814610235578063c0eb180b14610248578063c19d93fb14610250578063cbff75cb14610265578063d299346b14610278578063dff7d2c71461028057610137565b80639cc2d993146101ea578063a300e224146101fd578063a9ff6df114610212578063b21a64da14610225578063b43d5f151461022d57610137565b806364f62cc0116100ff57806364f62cc0146101b757806381929bac146101bf57806386f5114e146101d257806398f0b34c146101da5780639af5c09d146101e257610137565b80631ea736e01461013c5780632019a6081461015a5780633477ee2e1461016257806338db6dd3146101825780635d55f2de14610197575b600080fd5b610144610288565b6040516101519190610d4b565b60405180910390f35b61014461028e565b610175610170366004610c13565b610294565b6040516101519190610cce565b610195610190366004610aaa565b61033a565b005b6101aa6101a5366004610c13565b6103d3565b6040516101519190610c9b565b6101446103fa565b6101446101cd366004610acc565b610401565b61017561041e565b610144610476565b61014461047c565b6101956101f8366004610acc565b610482565b610205610572565b6040516101519190610caf565b610205610220366004610aaa565b6105bb565b6102056105d0565b61020561061f565b610195610243366004610b07565b610705565b6102056107a8565b6102586107b6565b6040516101519190610cba565b610205610273366004610aaa565b6107bf565b6101446107d4565b6101446107da565b60065481565b60055481565b600881815481106102a157fe5b600091825260209182902001805460408051601f60026000196101006001871615020190941693909304928301859004850281018501909152818152935090918301828280156103325780601f1061030757610100808354040283529160200191610332565b820191906000526020600020905b81548152906001019060200180831161031557829003601f168201915b505050505081565b60018060005460ff16600481111561034e57fe5b146103745760405162461bcd60e51b815260040161036b90610d21565b60405180910390fd5b6001600160a01b03821660009081526009602052604090205460ff16156103a1576000805461ff00191690555b506001600160a01b03166000908152600960205260408120805460ff19166001179055805461ff001916610100179055565b600781815481106103e057fe5b6000918252602090912001546001600160a01b0316905081565b6008545b90565b8051602081830181018051600c8252928201919093012091525481565b6002805460408051602060018416156101000260001901909316849004601f810184900484028201840190925281815292918301828280156103325780601f1061030757610100808354040283529160200191610332565b60075490565b60035481565b60028060005460ff16600481111561049657fe5b146104b35760405162461bcd60e51b815260040161036b90610d21565b3360009081526009602052604090205460ff166104da57600180556000805461ff00191690555b336000908152600b602052604090205460ff16156105035760026001556000805461ff00191690555b600a80546001810182556000919091528251610546917fc65a7bb8d6351c1cf70c95a316cc6a92839c986682d98bc35f958f4883f9d2a8019060208501906107e0565b5050336000908152600b60205260408120805460ff19166001179055805461ff00191661010017905550565b600060028060005460ff16600481111561058857fe5b146105a55760405162461bcd60e51b815260040161036b90610d21565b6000805460ff19166003179055600191505b5090565b60096020526000908152604090205460ff1681565b600060018060005460ff1660048111156105e657fe5b146106035760405162461bcd60e51b815260040161036b90610d21565b5060008054600260ff199091161761ff00191661010017905590565b600060038060005460ff16600481111561063557fe5b146106525760405162461bcd60e51b815260040161036b90610d21565b60005b60085481101561069f576000600c6008838154811061067057fe5b906000526020600020016040516106879190610c2b565b90815260405190819003602001902055600101610655565b5060005b600a548110156106f3576001600c600a83815481106106be57fe5b906000526020600020016040516106d59190610c2b565b908152604051908190036020019020805490910190556001016106a3565b50506000805460ff1916600417905590565b60008060005460ff16600481111561071957fe5b146107365760405162461bcd60e51b815260040161036b90610d21565b87516107499060029060208b01906107e0565b506003879055600486905560058590556006849055825161077190600790602086019061085a565b5081516107859060089060208501906108bb565b505060008054600160ff199091161761ff00191661010017905550505050505050565b600054610100900460ff1681565b60005460ff1681565b600b6020526000908152604090205460ff1681565b60015481565b60045481565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061082157805160ff191683800117855561084e565b8280016001018555821561084e579182015b8281111561084e578251825591602001919060010190610833565b506105b7929150610914565b8280548282559060005260206000209081019282156108af579160200282015b828111156108af57825182546001600160a01b0319166001600160a01b0390911617825560209092019160019091019061087a565b506105b792915061092e565b828054828255906000526020600020908101928215610908579160200282015b8281111561090857825180516108f89184916020909101906107e0565b50916020019190600101906108db565b506105b7929150610952565b6103fe91905b808211156105b7576000815560010161091a565b6103fe91905b808211156105b75780546001600160a01b0319168155600101610934565b6103fe91905b808211156105b757600061096c8282610975565b50600101610958565b50805460018160011615610100020316600290046000825580601f1061099b57506109b9565b601f0160209004906000526020600020908101906109b99190610914565b50565b80356001600160a01b03811681146109d357600080fd5b92915050565b600082601f8301126109e9578081fd5b81356109fc6109f782610d7b565b610d54565b818152915060208083019084810160005b84811015610a3657610a24888484358a0101610a41565b84529282019290820190600101610a0d565b505050505092915050565b600082601f830112610a51578081fd5b813567ffffffffffffffff811115610a67578182fd5b610a7a601f8201601f1916602001610d54565b9150808252836020828501011115610a9157600080fd5b8060208401602084013760009082016020015292915050565b600060208284031215610abb578081fd5b610ac583836109bc565b9392505050565b600060208284031215610add578081fd5b813567ffffffffffffffff811115610af3578182fd5b610aff84828501610a41565b949350505050565b600080600080600080600060e0888a031215610b21578283fd5b67ffffffffffffffff8089351115610b37578384fd5b610b448a8a358b01610a41565b97506020890135965060408901359550606089013594506080890135935060a089013581811115610b73578384fd5b808a018b601f820112610b84578485fd5b80359150610b946109f783610d7b565b80838252602082019150602083018e60208087028601011115610bb5578788fd5b8793505b84841015610be057610bcb8f826109bc565b83526001939093019260209283019201610bb9565b50955050505060c089013581811115610bf7578283fd5b610c038b828c016109d9565b9250505092959891949750929550565b600060208284031215610c24578081fd5b5035919050565b6000808354600180821660008114610c4a5760018114610c6157610c90565b60ff198316865260028304607f1686019350610c90565b600283048786526020808720875b83811015610c885781548a820152908501908201610c6f565b505050860193505b509195945050505050565b6001600160a01b0391909116815260200190565b901515815260200190565b6020810160058310610cc857fe5b91905290565b6000602080835283518082850152825b81811015610cfa57858101830151858201604001528201610cde565b81811115610d0b5783604083870101525b50601f01601f1916929092016040019392505050565b60208082526010908201526f766f74652073746167652077726f6e6760801b604082015260600190565b90815260200190565b60405181810167ffffffffffffffff81118282101715610d7357600080fd5b604052919050565b600067ffffffffffffffff821115610d91578081fd5b506020908102019056fea2646970667358221220ace38fe0453122ef69fa31a6e901f7430bd69a27163e54d1b2d652e30198d68b64736f6c63430006020033";

    public static final String FUNC_BEGINTALLYPHASE = "beginTallyPhase";

    public static final String FUNC_CANDIDATES = "candidates";

    public static final String FUNC_CASTVOTE = "castVote";

    public static final String FUNC_ELECTIONRESULTS = "electionResults";

    public static final String FUNC_ENDREGISTRATIONPHASE = "endRegistrationPhase";

    public static final String FUNC_ENDVOTINGPHASE = "endVotingPhase";

    public static final String FUNC_FINISHSETUP = "finishSetUp";

    public static final String FUNC_ISVOTED = "isVoted";

    public static final String FUNC_NUMOFCANDIDATES = "numOfCandidates";

    public static final String FUNC_NUMOFVOTERS = "numOfVoters";

    public static final String FUNC_REGISTERVOTER = "registerVoter";

    public static final String FUNC_REGISTEREDVOTERS = "registeredVoters";

    public static final String FUNC_REGISTRATIONENDTIME = "registrationEndTime";

    public static final String FUNC_REGISTRATIONSTARTTIME = "registrationStartTime";

    public static final String FUNC_RETURNBOOL = "returnbool";

    public static final String FUNC_STATE = "state";

    public static final String FUNC_VOTENAME = "voteName";

    public static final String FUNC_VOTESC = "voteSC";

    public static final String FUNC_VOTERADDRESS = "voterAddress";

    public static final String FUNC_VOTINGENDTIME = "votingEndTime";

    public static final String FUNC_VOTINGSTARTTIME = "votingStartTime";

    @Deprecated
    protected DecVoting(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected DecVoting(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected DecVoting(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected DecVoting(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<TransactionReceipt> beginTallyPhase() {
        final Function function = new Function(
                FUNC_BEGINTALLYPHASE, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> candidates(BigInteger param0) {
        final Function function = new Function(FUNC_CANDIDATES, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> castVote(String _hashedVotes) {
        final Function function = new Function(
                FUNC_CASTVOTE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_hashedVotes)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> electionResults(String param0) {
        final Function function = new Function(FUNC_ELECTIONRESULTS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> endRegistrationPhase() {
        final Function function = new Function(
                FUNC_ENDREGISTRATIONPHASE, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> endVotingPhase() {
        final Function function = new Function(
                FUNC_ENDVOTINGPHASE, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> finishSetUp(String _voteName, BigInteger _registrationStartTime, BigInteger _registrationEndTime, BigInteger _votingStartTime, BigInteger _votingEndTime, List<String> _voterAddress, List<String> _candidates) {
        final Function function = new Function(
                FUNC_FINISHSETUP, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_voteName), 
                new org.web3j.abi.datatypes.generated.Uint256(_registrationStartTime), 
                new org.web3j.abi.datatypes.generated.Uint256(_registrationEndTime), 
                new org.web3j.abi.datatypes.generated.Uint256(_votingStartTime), 
                new org.web3j.abi.datatypes.generated.Uint256(_votingEndTime), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                        org.web3j.abi.datatypes.Address.class,
                        org.web3j.abi.Utils.typeMap(_voterAddress, org.web3j.abi.datatypes.Address.class)), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Utf8String>(
                        org.web3j.abi.datatypes.Utf8String.class,
                        org.web3j.abi.Utils.typeMap(_candidates, org.web3j.abi.datatypes.Utf8String.class))), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Boolean> isVoted(String param0) {
        final Function function = new Function(FUNC_ISVOTED, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<BigInteger> numOfCandidates() {
        final Function function = new Function(FUNC_NUMOFCANDIDATES, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> numOfVoters() {
        final Function function = new Function(FUNC_NUMOFVOTERS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> registerVoter(String publickey) {
        final Function function = new Function(
                FUNC_REGISTERVOTER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, publickey)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Boolean> registeredVoters(String param0) {
        final Function function = new Function(FUNC_REGISTEREDVOTERS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<BigInteger> registrationEndTime() {
        final Function function = new Function(FUNC_REGISTRATIONENDTIME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> registrationStartTime() {
        final Function function = new Function(FUNC_REGISTRATIONSTARTTIME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<Boolean> returnbool() {
        final Function function = new Function(FUNC_RETURNBOOL, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<BigInteger> state() {
        final Function function = new Function(FUNC_STATE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<String> voteName() {
        final Function function = new Function(FUNC_VOTENAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<BigInteger> voteSC() {
        final Function function = new Function(FUNC_VOTESC, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<String> voterAddress(BigInteger param0) {
        final Function function = new Function(FUNC_VOTERADDRESS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<BigInteger> votingEndTime() {
        final Function function = new Function(FUNC_VOTINGENDTIME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> votingStartTime() {
        final Function function = new Function(FUNC_VOTINGSTARTTIME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    @Deprecated
    public static DecVoting load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new DecVoting(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static DecVoting load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new DecVoting(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static DecVoting load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new DecVoting(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static DecVoting load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new DecVoting(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<DecVoting> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(DecVoting.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<DecVoting> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(DecVoting.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<DecVoting> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(DecVoting.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<DecVoting> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(DecVoting.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
