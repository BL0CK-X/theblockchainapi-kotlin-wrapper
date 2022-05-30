# NameServiceApi

All URIs are relative to *https://api.blockchainapi.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBlockchainIdentifierFromName**](NameServiceApi.md#getBlockchainIdentifierFromName) | **POST** /{blockchain}/{network}/name_service/name_to_blockchain_identifier | Get the identifier
[**getNameForBlockchainIdentifier**](NameServiceApi.md#getNameForBlockchainIdentifier) | **POST** /{blockchain}/{network}/name_service/blockchain_identifier_to_name | Get the name


<a name="getBlockchainIdentifierFromName"></a>
# **getBlockchainIdentifierFromName**
> InputBlockchainIdentifier getBlockchainIdentifierFromName(blockchain, network, inputName)

Get the identifier

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript) [Coming Soon]&lt;/a&gt;.      Get the blockchain identifier from a name.  e.g., Input &#x60;vitalik.eth&#x60; and output &#x60;0xd8dA6BF26964aF9D7eEd9e03E53415D37aA96045&#x60;  &#x60;Cost: 0.25 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NameServiceApi()
val blockchain : kotlin.String = blockchain_example // kotlin.String | The blockchain you want to use 
val network : kotlin.String = ropsten // kotlin.String | The network of the blockchain you selected  - Solana: `devnet`, `mainnet-beta` - Ethereum: `ropsten`, `mainnet`  Defaults when not provided (not applicable to path parameters): - Solana: `devnet` - Ethereum: `ropsten`
val inputName : InputName =  // InputName | 
try {
    val result : InputBlockchainIdentifier = apiInstance.getBlockchainIdentifierFromName(blockchain, network, inputName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NameServiceApi#getBlockchainIdentifierFromName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NameServiceApi#getBlockchainIdentifierFromName")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockchain** | **kotlin.String**| The blockchain you want to use  | [enum: ethereum, solana]
 **network** | **kotlin.String**| The network of the blockchain you selected  - Solana: &#x60;devnet&#x60;, &#x60;mainnet-beta&#x60; - Ethereum: &#x60;ropsten&#x60;, &#x60;mainnet&#x60;  Defaults when not provided (not applicable to path parameters): - Solana: &#x60;devnet&#x60; - Ethereum: &#x60;ropsten&#x60; |
 **inputName** | [**InputName**](InputName.md)|  | [optional]

### Return type

[**InputBlockchainIdentifier**](InputBlockchainIdentifier.md)

### Authorization


Configure APIKeyID:
    ApiClient.apiKey["APIKeyID"] = ""
    ApiClient.apiKeyPrefix["APIKeyID"] = ""
Configure APISecretKey:
    ApiClient.apiKey["APISecretKey"] = ""
    ApiClient.apiKeyPrefix["APISecretKey"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNameForBlockchainIdentifier"></a>
# **getNameForBlockchainIdentifier**
> InputName getNameForBlockchainIdentifier(blockchain, network, inputBlockchainIdentifier)

Get the name

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript) [Coming Soon]&lt;/a&gt;.      Get the name from a blockchain identifier.  e.g., Input &#x60;0xd8dA6BF26964aF9D7eEd9e03E53415D37aA96045&#x60; and output &#x60;vitalik.eth&#x60;  &#x60;Cost: 0.25 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NameServiceApi()
val blockchain : kotlin.String = blockchain_example // kotlin.String | The blockchain you want to use 
val network : kotlin.String = ropsten // kotlin.String | The network of the blockchain you selected  - Solana: `devnet`, `mainnet-beta` - Ethereum: `ropsten`, `mainnet`  Defaults when not provided (not applicable to path parameters): - Solana: `devnet` - Ethereum: `ropsten`
val inputBlockchainIdentifier : InputBlockchainIdentifier =  // InputBlockchainIdentifier | 
try {
    val result : InputName = apiInstance.getNameForBlockchainIdentifier(blockchain, network, inputBlockchainIdentifier)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NameServiceApi#getNameForBlockchainIdentifier")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NameServiceApi#getNameForBlockchainIdentifier")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockchain** | **kotlin.String**| The blockchain you want to use  | [enum: ethereum, solana]
 **network** | **kotlin.String**| The network of the blockchain you selected  - Solana: &#x60;devnet&#x60;, &#x60;mainnet-beta&#x60; - Ethereum: &#x60;ropsten&#x60;, &#x60;mainnet&#x60;  Defaults when not provided (not applicable to path parameters): - Solana: &#x60;devnet&#x60; - Ethereum: &#x60;ropsten&#x60; |
 **inputBlockchainIdentifier** | [**InputBlockchainIdentifier**](InputBlockchainIdentifier.md)|  | [optional]

### Return type

[**InputName**](InputName.md)

### Authorization


Configure APIKeyID:
    ApiClient.apiKey["APIKeyID"] = ""
    ApiClient.apiKeyPrefix["APIKeyID"] = ""
Configure APISecretKey:
    ApiClient.apiKey["APISecretKey"] = ""
    ApiClient.apiKeyPrefix["APISecretKey"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

