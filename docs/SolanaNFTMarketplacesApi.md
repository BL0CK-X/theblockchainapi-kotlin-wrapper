# SolanaNFTMarketplacesApi

All URIs are relative to *https://api.blockchainapi.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**solanaBuyNFT**](SolanaNFTMarketplacesApi.md#solanaBuyNFT) | **POST** /solana/nft/marketplaces/{exchange}/buy/{network}/{mint_address} | Buy
[**solanaDelistNFT**](SolanaNFTMarketplacesApi.md#solanaDelistNFT) | **POST** /solana/nft/marketplaces/{exchange}/delist/{network}/{mint_address} | Delist
[**solanaGetNFTListing**](SolanaNFTMarketplacesApi.md#solanaGetNFTListing) | **GET** /solana/nft/marketplaces/listing/{network}/{mint_address} | Get NFT Listing
[**solanaGetNFTMarketplaceAnalytics**](SolanaNFTMarketplacesApi.md#solanaGetNFTMarketplaceAnalytics) | **POST** /solana/nft/marketplaces/analytics | Get NFT Analytics
[**solanaGetNFTMarketplaceMarketShare**](SolanaNFTMarketplacesApi.md#solanaGetNFTMarketplaceMarketShare) | **GET** /solana/nft/marketplaces/analytics/market_share | Get Marketplace Market Share
[**solanaGetNFTMarketplaceRecentTransactions**](SolanaNFTMarketplacesApi.md#solanaGetNFTMarketplaceRecentTransactions) | **GET** /solana/nft/marketplaces/analytics/recent_transactions | Get Recent NFT Transactions
[**solanaListNFT**](SolanaNFTMarketplacesApi.md#solanaListNFT) | **POST** /solana/nft/marketplaces/{exchange}/list/{network}/{mint_address} | List


<a name="solanaBuyNFT"></a>
# **solanaBuyNFT**
> BuyResponse solanaBuyNFT(network, exchange, mintAddress, buyRequest)

Buy

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/buy-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Buy an NFT on a Solana Exchange.  Exchanges supported: SolSea, Magic Edennpm  &#x60;Cost: 25 Credits&#x60;, &#x60;Cost: 3 Credits on Devnet&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaNFTMarketplacesApi()
val network : kotlin.String = devnet // kotlin.String | The network ID
val exchange : kotlin.String = solsea // kotlin.String | The NFT exchange to interact with
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
 **exchange** | **kotlin.String**| The NFT exchange to interact with | [enum: solsea, magic-eden]
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
val exchange : kotlin.String = solsea // kotlin.String | The NFT exchange to interact with
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
 **exchange** | **kotlin.String**| The NFT exchange to interact with | [enum: solsea, magic-eden]
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

<a name="solanaGetNFTMarketplaceAnalytics"></a>
# **solanaGetNFTMarketplaceAnalytics**
> NFTAnalyticsResponse solanaGetNFTMarketplaceAnalytics(nfTAnalyticsRequest)

Get NFT Analytics

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/analytics\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  A collection is a list of NFTs.  Any collection can thus be defined as a list of mint addresses.  This endpoint takes in a list of mint addresses (effectively, a collection), a start time (optional), and an end time (optional) and outputs the floor for that period, the volume for that period, and the transaction history for each NFT in the list (buy, list, delist, update price) for that period.  We are currently compiling a dictionary of collection names to list of mint addresses for public use. Please contribute &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/solana-nft-collection-mint-addresses\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Currently scans the following Solana NFT martketplaces: SolSea, Magic Eden, Solanart, Alpha Art, Digital Eyes, Exchange.art  &#x60;Cost: 15 Credits&#x60;, (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaNFTMarketplacesApi()
val nfTAnalyticsRequest : NFTAnalyticsRequest =  // NFTAnalyticsRequest | 
try {
    val result : NFTAnalyticsResponse = apiInstance.solanaGetNFTMarketplaceAnalytics(nfTAnalyticsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaNFTMarketplacesApi#solanaGetNFTMarketplaceAnalytics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaNFTMarketplacesApi#solanaGetNFTMarketplaceAnalytics")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nfTAnalyticsRequest** | [**NFTAnalyticsRequest**](NFTAnalyticsRequest.md)|  | [optional]

### Return type

[**NFTAnalyticsResponse**](NFTAnalyticsResponse.md)

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

<a name="solanaGetNFTMarketplaceMarketShare"></a>
# **solanaGetNFTMarketplaceMarketShare**
> kotlin.Any solanaGetNFTMarketplaceMarketShare()

Get Marketplace Market Share

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/market-share\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Get the Marketplace listing of a Solana NFT.  Currently checks for the following Solana NFT martketplaces: SolSea, Magic Eden, Solanart, Alpha Art, Digital Eyes, Exchange.art  &#x60;Cost: 3 Credits&#x60;, (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaNFTMarketplacesApi()
try {
    val result : kotlin.Any = apiInstance.solanaGetNFTMarketplaceMarketShare()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaNFTMarketplacesApi#solanaGetNFTMarketplaceMarketShare")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaNFTMarketplacesApi#solanaGetNFTMarketplaceMarketShare")
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

<a name="solanaGetNFTMarketplaceRecentTransactions"></a>
# **solanaGetNFTMarketplaceRecentTransactions**
> kotlin.collections.List&lt;NFTTransaction&gt; solanaGetNFTMarketplaceRecentTransactions()

Get Recent NFT Transactions

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/recent-transactions\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Get all NFT transactions across all major marketplaces in the last 30 minutes.  Currently checks for the following Solana NFT martketplaces: SolSea, Magic Eden, Solanart, Alpha Art, Digital Eyes, Exchange.art  &#x60;Cost: 15 Credits&#x60;, (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaNFTMarketplacesApi()
try {
    val result : kotlin.collections.List<NFTTransaction> = apiInstance.solanaGetNFTMarketplaceRecentTransactions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaNFTMarketplacesApi#solanaGetNFTMarketplaceRecentTransactions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaNFTMarketplacesApi#solanaGetNFTMarketplaceRecentTransactions")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;NFTTransaction&gt;**](NFTTransaction.md)

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
val exchange : kotlin.String = solsea // kotlin.String | The NFT exchange to interact with
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
 **exchange** | **kotlin.String**| The NFT exchange to interact with | [enum: solsea, magic-eden]
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

