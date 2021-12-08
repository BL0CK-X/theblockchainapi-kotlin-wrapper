# SolanaCandyMachineApi

All URIs are relative to *https://api.theblockchainapi.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**solanaCreateTestCandyMachine**](SolanaCandyMachineApi.md#solanaCreateTestCandyMachine) | **POST** /solana/nft/candy_machine | Create a test candy machine 
[**solanaGetAllNFTsFromCandyMachine**](SolanaCandyMachineApi.md#solanaGetAllNFTsFromCandyMachine) | **GET** /solana/nft/candy_machine/{network}/{candy_machine_id}/nfts | Get the list of all NFTs (minted and unminted) from a Solana Candy Machine 
[**solanaGetCandyMachineConfigurationDetails**](SolanaCandyMachineApi.md#solanaGetCandyMachineConfigurationDetails) | **POST** /solana/nft/candy_machine/config/info | Get the details of a Solana Candy Machine configuration 
[**solanaGetCandyMachineDetails**](SolanaCandyMachineApi.md#solanaGetCandyMachineDetails) | **POST** /solana/nft/candy_machine/info | Get a Metaplex candy machine&#39;s details 
[**solanaGetNFTsMintedFromCandyMachine**](SolanaCandyMachineApi.md#solanaGetNFTsMintedFromCandyMachine) | **POST** /solana/nft/candy_machine/nfts | Get the list of NFTs minted from a Solana Candy Machine 
[**solanaMintFromCandyMachine**](SolanaCandyMachineApi.md#solanaMintFromCandyMachine) | **POST** /solana/nft/candy_machine/mint | Mint an NFT from a Metaplex candy machine


<a name="solanaCreateTestCandyMachine"></a>
# **solanaCreateTestCandyMachine**
> CreateTestCandyMachineResponse solanaCreateTestCandyMachine(createTestCandyMachineRequest)

Create a test candy machine 

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-candy-machine/create-test-candy-machine\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.   Use this endpoint to create a test candy machine so that you can test your minting bot.  &#x60;Cost: 1 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaCandyMachineApi()
val createTestCandyMachineRequest : CreateTestCandyMachineRequest =  // CreateTestCandyMachineRequest | 
try {
    val result : CreateTestCandyMachineResponse = apiInstance.solanaCreateTestCandyMachine(createTestCandyMachineRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaCandyMachineApi#solanaCreateTestCandyMachine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaCandyMachineApi#solanaCreateTestCandyMachine")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createTestCandyMachineRequest** | [**CreateTestCandyMachineRequest**](CreateTestCandyMachineRequest.md)|  | [optional]

### Return type

[**CreateTestCandyMachineResponse**](CreateTestCandyMachineResponse.md)

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

<a name="solanaGetAllNFTsFromCandyMachine"></a>
# **solanaGetAllNFTsFromCandyMachine**
> GetAllNFTsResponse solanaGetAllNFTsFromCandyMachine(network, candyMachineId)

Get the list of all NFTs (minted and unminted) from a Solana Candy Machine 

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-candy-machine/get-candy-machine-all-nfts\&quot; target&#x3D;\&quot;_blank\&quot;&gt; See examples (Python, JavaScript)&lt;/a&gt;.  Use this endpoint to get the list of all NFTs (minted and unminted) from a Solana Candy Machine.  &#x60;Cost: 3 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaCandyMachineApi()
val network : kotlin.String = mainnet-beta // kotlin.String | The network ID (devnet, mainnet-beta)
val candyMachineId : kotlin.String = FmkrvXRenCGtwBHw3VtBcExp8eTdnau97upaewF4GUEX // kotlin.String | The ID of the candy machine
try {
    val result : GetAllNFTsResponse = apiInstance.solanaGetAllNFTsFromCandyMachine(network, candyMachineId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaCandyMachineApi#solanaGetAllNFTsFromCandyMachine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaCandyMachineApi#solanaGetAllNFTsFromCandyMachine")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **network** | **kotlin.String**| The network ID (devnet, mainnet-beta) |
 **candyMachineId** | **kotlin.String**| The ID of the candy machine |

### Return type

[**GetAllNFTsResponse**](GetAllNFTsResponse.md)

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

<a name="solanaGetCandyMachineConfigurationDetails"></a>
# **solanaGetCandyMachineConfigurationDetails**
> GetConfigInfoResponse solanaGetCandyMachineConfigurationDetails(getConfigInfoRequest)

Get the details of a Solana Candy Machine configuration 

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-candy-machine/get-candy-machine-config-info\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Use this endpoint to get the details of a Solana Candy Machine configuration.  &#x60;Cost: 1 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaCandyMachineApi()
val getConfigInfoRequest : GetConfigInfoRequest =  // GetConfigInfoRequest | 
try {
    val result : GetConfigInfoResponse = apiInstance.solanaGetCandyMachineConfigurationDetails(getConfigInfoRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaCandyMachineApi#solanaGetCandyMachineConfigurationDetails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaCandyMachineApi#solanaGetCandyMachineConfigurationDetails")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getConfigInfoRequest** | [**GetConfigInfoRequest**](GetConfigInfoRequest.md)|  | [optional]

### Return type

[**GetConfigInfoResponse**](GetConfigInfoResponse.md)

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

<a name="solanaGetCandyMachineDetails"></a>
# **solanaGetCandyMachineDetails**
> GetCandyDetailsResponse solanaGetCandyMachineDetails(getCandyDetailsRequest)

Get a Metaplex candy machine&#39;s details 

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-candy-machine/get-candy-machine-info\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Use this endpoint to get the following details about a Metaplex candy machine: uuid, go live date, items in the collection, and the cost to mint.  &#x60;Cost: 2 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaCandyMachineApi()
val getCandyDetailsRequest : GetCandyDetailsRequest =  // GetCandyDetailsRequest | 
try {
    val result : GetCandyDetailsResponse = apiInstance.solanaGetCandyMachineDetails(getCandyDetailsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaCandyMachineApi#solanaGetCandyMachineDetails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaCandyMachineApi#solanaGetCandyMachineDetails")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getCandyDetailsRequest** | [**GetCandyDetailsRequest**](GetCandyDetailsRequest.md)|  | [optional]

### Return type

[**GetCandyDetailsResponse**](GetCandyDetailsResponse.md)

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

<a name="solanaGetNFTsMintedFromCandyMachine"></a>
# **solanaGetNFTsMintedFromCandyMachine**
> kotlin.collections.List&lt;GetMintedNFTsResponse&gt; solanaGetNFTsMintedFromCandyMachine(getMintedNFTsRequest)

Get the list of NFTs minted from a Solana Candy Machine 

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-candy-machine/get-candy-machine-minted-nfts\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Use this endpoint to get the list of NFTs minted from a Solana Candy Machine.  See example for how to get the list of NFT hashes &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-candy-machine/get-candy-machine-hash-table\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  &#x60;Cost: 2 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaCandyMachineApi()
val getMintedNFTsRequest : GetMintedNFTsRequest =  // GetMintedNFTsRequest | 
try {
    val result : kotlin.collections.List<GetMintedNFTsResponse> = apiInstance.solanaGetNFTsMintedFromCandyMachine(getMintedNFTsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaCandyMachineApi#solanaGetNFTsMintedFromCandyMachine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaCandyMachineApi#solanaGetNFTsMintedFromCandyMachine")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getMintedNFTsRequest** | [**GetMintedNFTsRequest**](GetMintedNFTsRequest.md)|  | [optional]

### Return type

[**kotlin.collections.List&lt;GetMintedNFTsResponse&gt;**](GetMintedNFTsResponse.md)

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

<a name="solanaMintFromCandyMachine"></a>
# **solanaMintFromCandyMachine**
> MintNFTResponse solanaMintFromCandyMachine(mintNFTRequest)

Mint an NFT from a Metaplex candy machine

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-candy-machine/mint-from-candy-machine\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Use this endpoint to mint an NFT from a metaplex candy machine as soon as it drops.  &#x60;Cost: 10 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaCandyMachineApi()
val mintNFTRequest : MintNFTRequest =  // MintNFTRequest | 
try {
    val result : MintNFTResponse = apiInstance.solanaMintFromCandyMachine(mintNFTRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaCandyMachineApi#solanaMintFromCandyMachine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaCandyMachineApi#solanaMintFromCandyMachine")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mintNFTRequest** | [**MintNFTRequest**](MintNFTRequest.md)|  | [optional]

### Return type

[**MintNFTResponse**](MintNFTResponse.md)

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

