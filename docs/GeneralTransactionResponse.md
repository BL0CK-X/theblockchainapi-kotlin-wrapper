
# GeneralTransactionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionBlockchainIdentifier** | **kotlin.String** | The identifier of the transaction |  [optional]
**transactionConfirmed** | **kotlin.Boolean** | Whether or not the transaction was confirmed |  [optional]
**b58CompiledTransaction** | **kotlin.String** | A base58 encoded byte array in string representation. Really easy to submit to Phantom. See &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/blob/main/examples/tutorials/phantom_tutorials/transfer_solana.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; for an example on how to submit it to a Phantom wallet for signing. |  [optional]
**compiledTransaction** | [**kotlin.Any**](.md) | An array of integers representing the bytes of the transaction |  [optional]
**chainId** | **kotlin.String** | Indicates the chain that the transaction was compiled for (e.g., ropsten or mainnet).  |  [optional]
**&#x60;data&#x60;** | **kotlin.String** | The transaction data  |  [optional]
**from** | **kotlin.String** | The address expected to sign and submit the transaction  |  [optional]
**to** | **kotlin.String** | The contract. This should match your provided value for &#x60;token_blockchain_identifier&#x60;.  |  [optional]
**gas** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**maxFeePerGas** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**maxPriorityFeePerGas** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**nonce** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**&#x60;value&#x60;** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]



