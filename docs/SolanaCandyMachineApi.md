# SolanaCandyMachineApi

All URIs are relative to *https://api.blockchainapi.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**solanaGetAllNFTsFromCandyMachine**](SolanaCandyMachineApi.md#solanaGetAllNFTsFromCandyMachine) | **GET** /solana/nft/candy_machine/{network}/{candy_machine_id}/nfts | Get CM&#39;s NFTs  
[**solanaGetCandyMachineMetadata**](SolanaCandyMachineApi.md#solanaGetCandyMachineMetadata) | **POST** /solana/nft/candy_machine/metadata | Get a CM&#39;s metadata 
[**solanaListAllCandyMachines**](SolanaCandyMachineApi.md#solanaListAllCandyMachines) | **GET** /solana/nft/candy_machine/list | List all CMs
[**solanaSearchCandyMachines**](SolanaCandyMachineApi.md#solanaSearchCandyMachines) | **POST** /solana/nft/candy_machine/search | Search CMs


<a name="solanaGetAllNFTsFromCandyMachine"></a>
# **solanaGetAllNFTsFromCandyMachine**
> GetAllNFTsResponse solanaGetAllNFTsFromCandyMachine(network, candyMachineId)

Get CM&#39;s NFTs  

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-candy-machine/get-candy-machine-all-nfts\&quot; target&#x3D;\&quot;_blank\&quot;&gt; See examples (Python, JavaScript)&lt;/a&gt;.  Use this endpoint to get the list of all NFTs (minted and unminted) from a Solana Candy Machine.  This works for &#x60;v1&#x60; and &#x60;v2&#x60; candy machines.   *However*, for &#x60;v2&#x60; only the value for &#x60;all_nfts&#x60; is provided. To determine which are minted and unminted follow this example.  You do not need to specify &#x60;v1&#x60; or &#x60;v2&#x60; for this endpoint as it will automatically determine it from the candy machine ID.  See example for how to get the list of NFT hashes &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-candy-machine/get-candy-machine-hash-table\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.    &#x60;Cost: 2 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaCandyMachineApi()
val network : kotlin.String = mainnet-beta // kotlin.String | The network ID
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
 **network** | **kotlin.String**| The network ID | [enum: devnet, mainnet-beta]
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

<a name="solanaGetCandyMachineMetadata"></a>
# **solanaGetCandyMachineMetadata**
> GetCandyMetadataResponse solanaGetCandyMachineMetadata(getCandyMetadataRequest)

Get a CM&#39;s metadata 

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-candy-machine/get-candy-machine-metadata\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Use this endpoint to get metadata about a Metaplex candy machine. This includes the goLiveDate, itemsAvailable, and itemsRedeemed. To see what is included, expand the green successful response below.  NOTE: Supply exactly one of &#x60;candy_machine_id&#x60;, &#x60;config_address&#x60;, or &#x60;uuid&#x60;. If you provide more than one, you will receive a &#x60;400&#x60; error.   &#x60;Cost: 2 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaCandyMachineApi()
val getCandyMetadataRequest : GetCandyMetadataRequest =  // GetCandyMetadataRequest | 
try {
    val result : GetCandyMetadataResponse = apiInstance.solanaGetCandyMachineMetadata(getCandyMetadataRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaCandyMachineApi#solanaGetCandyMachineMetadata")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaCandyMachineApi#solanaGetCandyMachineMetadata")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getCandyMetadataRequest** | [**GetCandyMetadataRequest**](GetCandyMetadataRequest.md)|  | [optional]

### Return type

[**GetCandyMetadataResponse**](GetCandyMetadataResponse.md)

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

<a name="solanaListAllCandyMachines"></a>
# **solanaListAllCandyMachines**
> kotlin.Any solanaListAllCandyMachines()

List all CMs

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-candy-machine/list-all-candy-machines\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  With this endpoint, you can list all candy machines published to Solana mainnet.  We update this data every 15 minutes.  The output is a list of config addresses, currently about 17000 in length.  &#x60;Cost: 2 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaCandyMachineApi()
try {
    val result : kotlin.Any = apiInstance.solanaListAllCandyMachines()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaCandyMachineApi#solanaListAllCandyMachines")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaCandyMachineApi#solanaListAllCandyMachines")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Any**](kotlin.Any.md)

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

<a name="solanaSearchCandyMachines"></a>
# **solanaSearchCandyMachines**
> kotlin.collections.List&lt;kotlin.String&gt; solanaSearchCandyMachines(candyMachineSearchRequest)

Search CMs

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-candy-machine/search-candy-machines\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  With this endpoint, you can search candy machines by their symbol, name of NFTs, uuid, configuration address, and update authority.  The output is a list of config addresses.  You can also provide multiple search clauses, such as the update authority (&#x60;update_authority&#x3D;\&quot;G17UmNGnMJ851x3M1JXocgpft1afcYedjPuFpo1ohhCk\&quot;&#x60;) and symbol begins with \&quot;Sol\&quot; (&#x60;symbol&#x3D;\&quot;Sol\&quot;, symbol_search_method&#x3D;&#39;begins_with&#39;&#x60;).  &#x60;Cost: 2 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaCandyMachineApi()
val candyMachineSearchRequest : CandyMachineSearchRequest =  // CandyMachineSearchRequest | 
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.solanaSearchCandyMachines(candyMachineSearchRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaCandyMachineApi#solanaSearchCandyMachines")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaCandyMachineApi#solanaSearchCandyMachines")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **candyMachineSearchRequest** | [**CandyMachineSearchRequest**](CandyMachineSearchRequest.md)|  | [optional]

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

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

