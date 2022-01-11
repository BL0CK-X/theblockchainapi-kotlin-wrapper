# SolanaAccountApi

All URIs are relative to *https://api.blockchainapi.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**solanaGetAccount**](SolanaAccountApi.md#solanaGetAccount) | **GET** /solana/account/{network}/{public_key} | Get the details of an account on Solana
[**solanaGetAccountIsCandyMachine**](SolanaAccountApi.md#solanaGetAccountIsCandyMachine) | **GET** /solana/account/{network}/{public_key}/is_candy_machine | Get if account is candy machine
[**solanaGetAccountIsNFT**](SolanaAccountApi.md#solanaGetAccountIsNFT) | **GET** /solana/account/{network}/{public_key}/is_nft | Get if account is NFT


<a name="solanaGetAccount"></a>
# **solanaGetAccount**
> Account solanaGetAccount(network, publicKey)

Get the details of an account on Solana

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-account/get-account\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Get the details of an account on Solana. Learn more about accounts &lt;a href&#x3D;\&quot;https://docs.solana.com/developing/programming-model/accounts\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  &#x60;Cost: 1 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaAccountApi()
val network : kotlin.String = mainnet-beta // kotlin.String | The network ID (devnet, mainnet-beta)
val publicKey : kotlin.String = EEr5yQpNXf7Bru6Rt5podx56HGW9CEehXqgRGh2wa71w // kotlin.String | The public key of the account
try {
    val result : Account = apiInstance.solanaGetAccount(network, publicKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaAccountApi#solanaGetAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaAccountApi#solanaGetAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **network** | **kotlin.String**| The network ID (devnet, mainnet-beta) |
 **publicKey** | **kotlin.String**| The public key of the account |

### Return type

[**Account**](Account.md)

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

<a name="solanaGetAccountIsCandyMachine"></a>
# **solanaGetAccountIsCandyMachine**
> AccountIsCandyMachine solanaGetAccountIsCandyMachine(network, publicKey)

Get if account is candy machine

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-account/get-is-candy-machine\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Determine whether or not a public key address corresponds to a candy machine ID or candy machine configuration.  &#x60;Cost: 1 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaAccountApi()
val network : kotlin.String = mainnet-beta // kotlin.String | The network ID (devnet, mainnet-beta)
val publicKey : kotlin.String = EEr5yQpNXf7Bru6Rt5podx56HGW9CEehXqgRGh2wa71w // kotlin.String | The public key of the account
try {
    val result : AccountIsCandyMachine = apiInstance.solanaGetAccountIsCandyMachine(network, publicKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaAccountApi#solanaGetAccountIsCandyMachine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaAccountApi#solanaGetAccountIsCandyMachine")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **network** | **kotlin.String**| The network ID (devnet, mainnet-beta) |
 **publicKey** | **kotlin.String**| The public key of the account |

### Return type

[**AccountIsCandyMachine**](AccountIsCandyMachine.md)

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

<a name="solanaGetAccountIsNFT"></a>
# **solanaGetAccountIsNFT**
> AccountIsNFT solanaGetAccountIsNFT(network, publicKey)

Get if account is NFT

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-account/get-is-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Determine whether or not a public key is an NFT &#x60;mint address&#x60;  &#x60;Cost: 1 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaAccountApi()
val network : kotlin.String = mainnet-beta // kotlin.String | The network ID (devnet, mainnet-beta)
val publicKey : kotlin.String = EEr5yQpNXf7Bru6Rt5podx56HGW9CEehXqgRGh2wa71w // kotlin.String | The public key of the account
try {
    val result : AccountIsNFT = apiInstance.solanaGetAccountIsNFT(network, publicKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaAccountApi#solanaGetAccountIsNFT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaAccountApi#solanaGetAccountIsNFT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **network** | **kotlin.String**| The network ID (devnet, mainnet-beta) |
 **publicKey** | **kotlin.String**| The public key of the account |

### Return type

[**AccountIsNFT**](AccountIsNFT.md)

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

