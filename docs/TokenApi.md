# TokenApi

All URIs are relative to *https://api.blockchainapi.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTokenMetadata**](TokenApi.md#getTokenMetadata) | **GET** /{blockchain}/{network}/token/{token_blockchain_identifier} | Get a token&#39;s metadata
[**listAllTokens**](TokenApi.md#listAllTokens) | **GET** /{blockchain}/{network}/all_tokens | List all tokens


<a name="getTokenMetadata"></a>
# **getTokenMetadata**
> TokenMetadataResponse getTokenMetadata(blockchain, network, tokenBlockchainIdentifier)

Get a token&#39;s metadata

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/tokens/get-token-metadata\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript) [Coming Soon]&lt;/a&gt;.      Get the metadata of a token.  &#x60;Cost: 0.25 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TokenApi()
val blockchain : kotlin.String = blockchain_example // kotlin.String | The blockchain you want to use 
val network : kotlin.String = ropsten // kotlin.String | The network of the blockchain you selected  - Solana: `devnet`, `mainnet-beta` - Ethereum: `ropsten`, `mainnet`  Defaults when not provided (not applicable to path parameters): - Solana: `devnet` - Ethereum: `ropsten`
val tokenBlockchainIdentifier : kotlin.String = tokenBlockchainIdentifier_example // kotlin.String | The identifier of the token (e.g., `mint_address` on `Solana` or `token_address` on `Ethereum`) 
try {
    val result : TokenMetadataResponse = apiInstance.getTokenMetadata(blockchain, network, tokenBlockchainIdentifier)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TokenApi#getTokenMetadata")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TokenApi#getTokenMetadata")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockchain** | **kotlin.String**| The blockchain you want to use  | [enum: ethereum, solana]
 **network** | **kotlin.String**| The network of the blockchain you selected  - Solana: &#x60;devnet&#x60;, &#x60;mainnet-beta&#x60; - Ethereum: &#x60;ropsten&#x60;, &#x60;mainnet&#x60;  Defaults when not provided (not applicable to path parameters): - Solana: &#x60;devnet&#x60; - Ethereum: &#x60;ropsten&#x60; |
 **tokenBlockchainIdentifier** | **kotlin.String**| The identifier of the token (e.g., &#x60;mint_address&#x60; on &#x60;Solana&#x60; or &#x60;token_address&#x60; on &#x60;Ethereum&#x60;)  | [enum: ethereum, solana]

### Return type

[**TokenMetadataResponse**](TokenMetadataResponse.md)

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

<a name="listAllTokens"></a>
# **listAllTokens**
> kotlin.collections.List&lt;TokenMetadataResponse&gt; listAllTokens(blockchain, network)

List all tokens

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/tokens/get-all-tokens\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript) [Coming Soon]&lt;/a&gt;.      List all tokens.  &#x60;Cost: 1 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TokenApi()
val blockchain : kotlin.String = blockchain_example // kotlin.String | The blockchain you want to use 
val network : kotlin.String = ropsten // kotlin.String | The network of the blockchain you selected  - Solana: `devnet`, `mainnet-beta` - Ethereum: `ropsten`, `mainnet`  Defaults when not provided (not applicable to path parameters): - Solana: `devnet` - Ethereum: `ropsten`
try {
    val result : kotlin.collections.List<TokenMetadataResponse> = apiInstance.listAllTokens(blockchain, network)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TokenApi#listAllTokens")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TokenApi#listAllTokens")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockchain** | **kotlin.String**| The blockchain you want to use  | [enum: solana]
 **network** | **kotlin.String**| The network of the blockchain you selected  - Solana: &#x60;devnet&#x60;, &#x60;mainnet-beta&#x60; - Ethereum: &#x60;ropsten&#x60;, &#x60;mainnet&#x60;  Defaults when not provided (not applicable to path parameters): - Solana: &#x60;devnet&#x60; - Ethereum: &#x60;ropsten&#x60; |

### Return type

[**kotlin.collections.List&lt;TokenMetadataResponse&gt;**](TokenMetadataResponse.md)

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

