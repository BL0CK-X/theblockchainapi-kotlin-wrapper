# SolanaTransactionApi

All URIs are relative to *https://api.blockchainapi.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**solanaGetTransaction**](SolanaTransactionApi.md#solanaGetTransaction) | **GET** /solana/transaction/{network}/{tx_signature} | Get the details of a transaction made on Solana


<a name="solanaGetTransaction"></a>
# **solanaGetTransaction**
> Transaction solanaGetTransaction(network, txSignature)

Get the details of a transaction made on Solana

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-transaction/get-transaction\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Get the details of a transaction made on Solana.  &#x60;Cost: 1 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaTransactionApi()
val network : kotlin.String = mainnet-beta // kotlin.String | The network ID (devnet, mainnet-beta)
val txSignature : kotlin.String = 5wHu1qwD7q5ifaN5nwdcDqNFo53GJqa7nLp2BeeEpcHCusb4GzARz4GjgzsEHMkBMgCJMGa6GSQ1VG96Exv8kt2W // kotlin.String | The transaction signature of the transaction
try {
    val result : Transaction = apiInstance.solanaGetTransaction(network, txSignature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaTransactionApi#solanaGetTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaTransactionApi#solanaGetTransaction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **network** | **kotlin.String**| The network ID (devnet, mainnet-beta) |
 **txSignature** | **kotlin.String**| The transaction signature of the transaction |

### Return type

[**Transaction**](Transaction.md)

### Authorization


Configure APIKeyID:
    ApiClient.apiKey["APIKeyID"] = ""
    ApiClient.apiKeyPrefix["APIKeyID"] = ""
Configure APISecretKey:
    ApiClient.apiKey["APISecretKey"] = ""
    ApiClient.apiKeyPrefix["APISecretKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

