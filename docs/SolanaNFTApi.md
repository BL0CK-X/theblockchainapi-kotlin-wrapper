# SolanaNFTApi

All URIs are relative to *https://api.theblockchainapi.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**solanaCreateNFT**](SolanaNFTApi.md#solanaCreateNFT) | **POST** /solana/nft | Create an NFT on Solana
[**solanaGetNFT**](SolanaNFTApi.md#solanaGetNFT) | **GET** /solana/nft/{network}/{mint_address} | Get an NFT&#39;s metadata
[**solanaGetNFTMintFee**](SolanaNFTApi.md#solanaGetNFTMintFee) | **GET** /solana/nft/mint/fee | Get the NFT mint fee
[**solanaGetNFTOwner**](SolanaNFTApi.md#solanaGetNFTOwner) | **GET** /solana/nft/{network}/{mint_address}/owner | Get owner of an NFT
[**solanaGetNFTsCandyMachineId**](SolanaNFTApi.md#solanaGetNFTsCandyMachineId) | **POST** /solana/nft/candy_machine_id | Get the ID of the candy machine of an NFT 


<a name="solanaCreateNFT"></a>
# **solanaCreateNFT**
> NFT solanaCreateNFT(nfTMintRequest)

Create an NFT on Solana

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-nft/create-an-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Create a Metaplex NFT on Solana. Read more on this &lt;a href&#x3D;\&quot;https://blog.theblockchainapi.com/2021/11/16/a-note-on-nfts.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  &#x60;Cost: 2 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaNFTApi()
val nfTMintRequest : NFTMintRequest =  // NFTMintRequest | 
try {
    val result : NFT = apiInstance.solanaCreateNFT(nfTMintRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaNFTApi#solanaCreateNFT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaNFTApi#solanaCreateNFT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nfTMintRequest** | [**NFTMintRequest**](NFTMintRequest.md)|  | [optional]

### Return type

[**NFT**](NFT.md)

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

<a name="solanaGetNFT"></a>
# **solanaGetNFT**
> NFT solanaGetNFT(network, mintAddress)

Get an NFT&#39;s metadata

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-nft/get-nft-metadata\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.       Get the metadata of an NFT.  &#x60;Cost: 1 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaNFTApi()
val network : kotlin.String = mainnet-beta // kotlin.String | The network ID (devnet, mainnet-beta)
val mintAddress : kotlin.String = EEr5yQpNXf7Bru6Rt5podx56HGW9CEehXqgRGh2wa71w // kotlin.String | The mint address of the NFT
try {
    val result : NFT = apiInstance.solanaGetNFT(network, mintAddress)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaNFTApi#solanaGetNFT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaNFTApi#solanaGetNFT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **network** | **kotlin.String**| The network ID (devnet, mainnet-beta) |
 **mintAddress** | **kotlin.String**| The mint address of the NFT |

### Return type

[**NFT**](NFT.md)

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

<a name="solanaGetNFTMintFee"></a>
# **solanaGetNFTMintFee**
> NFTMintFee solanaGetNFTMintFee()

Get the NFT mint fee

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-nft/get-nft-mint-fee\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Get the estimated fee for minting an NFT on the Solana blockchain using the Metaplex protocol.  &#x60;Cost: 1 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaNFTApi()
try {
    val result : NFTMintFee = apiInstance.solanaGetNFTMintFee()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaNFTApi#solanaGetNFTMintFee")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaNFTApi#solanaGetNFTMintFee")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NFTMintFee**](NFTMintFee.md)

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

<a name="solanaGetNFTOwner"></a>
# **solanaGetNFTOwner**
> NFTOwnerResponse solanaGetNFTOwner(network, mintAddress)

Get owner of an NFT

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-nft/get-nft-owner\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.       Get the owner of an NFT. This returns the public key of the wallet that owns the associated token account that owns the NFT.  If you want to get the associated token account that literally owns the NFT, derive the associated token account address from the public key returned and the NFT mint address using &lt;a href&#x3D;\&quot;#operation/solanaDeriveAssociatedTokenAccountAddress\&quot;&gt;this endpoint&lt;/a&gt;.  &#x60;Cost: 1 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaNFTApi()
val network : kotlin.String = mainnet-beta // kotlin.String | The network ID (devnet, mainnet-beta)
val mintAddress : kotlin.String = 4zH3Rwm1QXdfTSUqsYmeUBY4QqQmQEXJVbv4ErSK736Q // kotlin.String | The mint address of the NFT
try {
    val result : NFTOwnerResponse = apiInstance.solanaGetNFTOwner(network, mintAddress)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaNFTApi#solanaGetNFTOwner")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaNFTApi#solanaGetNFTOwner")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **network** | **kotlin.String**| The network ID (devnet, mainnet-beta) |
 **mintAddress** | **kotlin.String**| The mint address of the NFT |

### Return type

[**NFTOwnerResponse**](NFTOwnerResponse.md)

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

<a name="solanaGetNFTsCandyMachineId"></a>
# **solanaGetNFTsCandyMachineId**
> GetCandyMachineIDResponse solanaGetNFTsCandyMachineId(getCandyMachineIDRequest)

Get the ID of the candy machine of an NFT 

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-nft/get-nft-candy-machine-id\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Get the candy machine ID from where the NFT came, if any. NFTs can also be minted without a candy machine.  &#x60;Cost: 1 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaNFTApi()
val getCandyMachineIDRequest : GetCandyMachineIDRequest =  // GetCandyMachineIDRequest | 
try {
    val result : GetCandyMachineIDResponse = apiInstance.solanaGetNFTsCandyMachineId(getCandyMachineIDRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaNFTApi#solanaGetNFTsCandyMachineId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaNFTApi#solanaGetNFTsCandyMachineId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getCandyMachineIDRequest** | [**GetCandyMachineIDRequest**](GetCandyMachineIDRequest.md)|  | [optional]

### Return type

[**GetCandyMachineIDResponse**](GetCandyMachineIDResponse.md)

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

