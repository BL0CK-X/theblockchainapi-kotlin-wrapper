
# DoubleTransferResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionSignature** | **kotlin.String** | The signature of the transaction |  [optional]
**confirmed** | **kotlin.Boolean** | Whether or not the transaction was confirmed or simply submitted for processing. The status depends on your input for &#x60;wait_for_confirmation&#x60;. This only is returned when you are submitting a transaction, not when retrieving signatures for a public key, for example. |  [optional]
**b58CompiledTransaction** | **kotlin.String** | A base58 encoded byte array in string representation. Really easy to submit to Phantom. See &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/blob/main/examples/tutorials/phantom_tutorials/transfer_solana.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; for an example on how to submit it to a Phantom wallet for signing. |  [optional]
**compiledTransaction** | [**kotlin.Any**](.md) | An array of integers representing the bytes of the transaction |  [optional]



