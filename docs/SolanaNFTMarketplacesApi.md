# SolanaNFTMarketplacesApi

All URIs are relative to *https://api.blockchainapi.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**solanaBuyNFT**](SolanaNFTMarketplacesApi.md#solanaBuyNFT) | **POST** /solana/nft/marketplaces/{exchange}/buy/{network}/{mint_address} | Buy
[**solanaDelistNFT**](SolanaNFTMarketplacesApi.md#solanaDelistNFT) | **POST** /solana/nft/marketplaces/{exchange}/delist/{network}/{mint_address} | Delist
[**solanaGetNFTListing**](SolanaNFTMarketplacesApi.md#solanaGetNFTListing) | **GET** /solana/nft/marketplaces/listing/{network}/{mint_address} | Get NFT Listing
[**solanaListNFT**](SolanaNFTMarketplacesApi.md#solanaListNFT) | **POST** /solana/nft/marketplaces/{exchange}/list/{network}/{mint_address} | List


<a name="solanaBuyNFT"></a>
# **solanaBuyNFT**
> BuyResponse solanaBuyNFT(network, exchange, mintAddress, buyRequest)

Buy

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/buy-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Buy an NFT on a Solana Exchange.  Exchanges supported: SolSea, Magic Eden  &#x60;Cost: 25 Credits&#x60;, &#x60;Cost: 3 Credits on Devnet&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaNFTMarketplacesApi()
val network : kotlin.String = devnet // kotlin.String | The network ID
val exchange : kotlin.String = magic-eden // kotlin.String | The NFT exchange to interact with
val mintAddress : kotlin.String = 7GA16mQup7ESJbaD6n49VCwVG9kRkyQDzWKhBSLjbYqr // kotlin.String | The mint address of the NFT you want to buy
val buyRequest : BuyRequest =  // BuyRequest | 
try {
    val result : BuyResponse = apiInstance.solanaBuyNFT(network, exchange, mintAddress, buyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaNFTMarketplacesApi#solanaBuyNFT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaNFTMarketplacesApi#solanaBuyNFT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **network** | **kotlin.String**| The network ID | [enum: devnet, mainnet-beta]
 **exchange** | **kotlin.String**| The NFT exchange to interact with | [enum: magic-eden]
 **mintAddress** | **kotlin.String**| The mint address of the NFT you want to buy |
 **buyRequest** | [**BuyRequest**](BuyRequest.md)|  | [optional]

### Return type

[**BuyResponse**](BuyResponse.md)

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

<a name="solanaDelistNFT"></a>
# **solanaDelistNFT**
> DelistResponse solanaDelistNFT(network, exchange, mintAddress, delistRequest)

Delist

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/delist-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Delist an NFT from a Solana Exchange.  Exchanges supported: SolSea, Magic Eden  &#x60;Cost: 8 Credits&#x60;, &#x60;Cost: 3 Credits on Devnet&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaNFTMarketplacesApi()
val network : kotlin.String = devnet // kotlin.String | The network ID
val exchange : kotlin.String = magic-eden // kotlin.String | The NFT exchange to interact with
val mintAddress : kotlin.String = 7GA16mQup7ESJbaD6n49VCwVG9kRkyQDzWKhBSLjbYqr // kotlin.String | The mint address of the NFT you want to buy
val delistRequest : DelistRequest =  // DelistRequest | 
try {
    val result : DelistResponse = apiInstance.solanaDelistNFT(network, exchange, mintAddress, delistRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaNFTMarketplacesApi#solanaDelistNFT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaNFTMarketplacesApi#solanaDelistNFT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **network** | **kotlin.String**| The network ID | [enum: devnet, mainnet-beta]
 **exchange** | **kotlin.String**| The NFT exchange to interact with | [enum: magic-eden]
 **mintAddress** | **kotlin.String**| The mint address of the NFT you want to buy |
 **delistRequest** | [**DelistRequest**](DelistRequest.md)|  | [optional]

### Return type

[**DelistResponse**](DelistResponse.md)

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

<a name="solanaGetNFTListing"></a>
# **solanaGetNFTListing**
> GetNFTListingResponse solanaGetNFTListing(network, mintAddress)

Get NFT Listing

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/get-nft-listing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Get the Marketplace listing of a Solana NFT.  Currently checks the following Solana NFT martketplaces: SolSea, Magic Eden, Solanart, Alpha Art, Digital Eyes, Exchange.art  &#x60;Cost: 1 Credits&#x60;, (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaNFTMarketplacesApi()
val network : kotlin.String = devnet // kotlin.String | The network ID
val mintAddress : kotlin.String = 7GA16mQup7ESJbaD6n49VCwVG9kRkyQDzWKhBSLjbYqr // kotlin.String | The mint address of the NFT you want to buy
try {
    val result : GetNFTListingResponse = apiInstance.solanaGetNFTListing(network, mintAddress)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaNFTMarketplacesApi#solanaGetNFTListing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaNFTMarketplacesApi#solanaGetNFTListing")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **network** | **kotlin.String**| The network ID | [enum: devnet, mainnet-beta]
 **mintAddress** | **kotlin.String**| The mint address of the NFT you want to buy |

### Return type

[**GetNFTListingResponse**](GetNFTListingResponse.md)

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

<a name="solanaListNFT"></a>
# **solanaListNFT**
> ListResponse solanaListNFT(network, exchange, mintAddress, listRequest)

List

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/list-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  List an NFT on a Solana Exchange.  Exchanges supported: SolSea, Magic Eden  &#x60;Cost: 12 Credits&#x60;, &#x60;Cost: 3 Credits on Devnet&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaNFTMarketplacesApi()
val network : kotlin.String = devnet // kotlin.String | The network ID
val exchange : kotlin.String = magic-eden // kotlin.String | The NFT exchange to interact with
val mintAddress : kotlin.String = 7GA16mQup7ESJbaD6n49VCwVG9kRkyQDzWKhBSLjbYqr // kotlin.String | The mint address of the NFT you want to buy
val listRequest : ListRequest =  // ListRequest | 
try {
    val result : ListResponse = apiInstance.solanaListNFT(network, exchange, mintAddress, listRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaNFTMarketplacesApi#solanaListNFT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaNFTMarketplacesApi#solanaListNFT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **network** | **kotlin.String**| The network ID | [enum: devnet, mainnet-beta]
 **exchange** | **kotlin.String**| The NFT exchange to interact with | [enum: magic-eden]
 **mintAddress** | **kotlin.String**| The mint address of the NFT you want to buy |
 **listRequest** | [**ListRequest**](ListRequest.md)|  | [optional]

### Return type

[**ListResponse**](ListResponse.md)

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

