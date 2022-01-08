# SolanaSPLTokenApi

All URIs are relative to *https://api.theblockchainapi.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**solanaGetSPLToken**](SolanaSPLTokenApi.md#solanaGetSPLToken) | **GET** /solana/spl-token/{network}/{public_key} | Get SPL token metadata


<a name="solanaGetSPLToken"></a>
# **solanaGetSPLToken**
> GetSPLTokenResponse solanaGetSPLToken(publicKey, network)

Get SPL token metadata

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-spl-token/get-spl-token\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Retrieves basic information about an SPL token given its &#x60;mint_address&#x60;.  You can see the mint addresses of popular SPL tokens &lt;a href&#x3D;\&quot;https://raw.githubusercontent.com/solana-labs/token-list/main/src/tokens/solana.tokenlist.json\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Some example mint addresses of SPL tokens: - USDC: EPjFWdd5AufqSSqeM2qN1xzybapC8G4wEGGkZwyTDt1v - Mango: MangoCzJ36AjZyKwVj3VnYU4GTonjfVEnJmvvWaxLac - Serum: SRMuApVNdxXokk5GT7XD5cUUgXMBCoAz2LHeuAoKWRt - Raydium: 4k3Dyjzvzp8eMZWUXbBCjEvwSkkk59S5iCNLY3QrkX6R - wSOL: So11111111111111111111111111111111111111112 - ATLAS: ATLASXmbPQxBUYbxPsV97usA3fPQYEqzQBUHgiFCUsXx  &#x60;Cost: 1 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaSPLTokenApi()
val publicKey : kotlin.String = MangoCzJ36AjZyKwVj3VnYU4GTonjfVEnJmvvWaxLac // kotlin.String | The public key of the token
val network : kotlin.String = mainnet-beta // kotlin.String | The network ID (devnet, mainnet-beta)
try {
    val result : GetSPLTokenResponse = apiInstance.solanaGetSPLToken(publicKey, network)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaSPLTokenApi#solanaGetSPLToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaSPLTokenApi#solanaGetSPLToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **publicKey** | **kotlin.String**| The public key of the token |
 **network** | **kotlin.String**| The network ID (devnet, mainnet-beta) |

### Return type

[**GetSPLTokenResponse**](GetSPLTokenResponse.md)

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

