# SolanaWalletApi

All URIs are relative to *https://api.blockchainapi.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**solanaDeriveAssociatedTokenAccountAddress**](SolanaWalletApi.md#solanaDeriveAssociatedTokenAccountAddress) | **GET** /solana/wallet/{public_key}/associated_token_account/{mint_address} | Derive an associated token account address
[**solanaDerivePrivateKey**](SolanaWalletApi.md#solanaDerivePrivateKey) | **POST** /solana/wallet/private_key | Derive private key
[**solanaDerivePublicKey**](SolanaWalletApi.md#solanaDerivePublicKey) | **POST** /solana/wallet/public_key | Derive public key
[**solanaGeneratePrivateKey**](SolanaWalletApi.md#solanaGeneratePrivateKey) | **POST** /solana/wallet/generate/private_key | Generate private key
[**solanaGenerateSecretRecoveryPhrase**](SolanaWalletApi.md#solanaGenerateSecretRecoveryPhrase) | **POST** /solana/wallet/generate/secret_recovery_phrase | Generate secret phrase
[**solanaGetAirdrop**](SolanaWalletApi.md#solanaGetAirdrop) | **POST** /solana/wallet/airdrop | Get an airdrop on devnet
[**solanaGetBalance**](SolanaWalletApi.md#solanaGetBalance) | **POST** /solana/wallet/balance | Get wallet&#39;s balance in SOL or any SPL
[**solanaGetNFTsBelongingToWallet**](SolanaWalletApi.md#solanaGetNFTsBelongingToWallet) | **GET** /solana/wallet/{network}/{public_key}/nfts | Get address&#39;s NFTs
[**solanaGetTokensBelongingToWallet**](SolanaWalletApi.md#solanaGetTokensBelongingToWallet) | **GET** /solana/wallet/{network}/{public_key}/tokens | Get address&#39;s tokens and respective balances
[**solanaGetWalletTransactions**](SolanaWalletApi.md#solanaGetWalletTransactions) | **GET** /solana/wallet/{network}/{public_key}/transactions | Get address&#39;s associated transaction signatures
[**solanaTransfer**](SolanaWalletApi.md#solanaTransfer) | **POST** /solana/wallet/transfer | Transfer SOL, a token, or an NFT to another address


<a name="solanaDeriveAssociatedTokenAccountAddress"></a>
# **solanaDeriveAssociatedTokenAccountAddress**
> ATAResponse solanaDeriveAssociatedTokenAccountAddress(publicKey, mintAddress)

Derive an associated token account address

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-wallet/derive-associated-token-account-address\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See example (Python, JavaScript)&lt;/a&gt;.      *Each wallet can own tokens, but in Solana, each token is actually held by an &lt;a href&#x3D;\&quot;https://spl.solana.com/associated-token-account\&quot; target&#x3D;\&quot;_blank\&quot;&gt;associated token account&lt;/a&gt; (ATA), which is an account specific for a token owned by the wallet. When you transfer an SPL token, such as Serum, or transfer an NFT, you&#39;re transfering from an ATA you own to another person&#39;s ATA for that specific token. With this endpoint, you can derive an associated token address given a wallet and a token address.*  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaWalletApi()
val publicKey : kotlin.String = 31LKs39pjT5oj6fWjC3F76dHWf9489asCthmgj8wu7pj // kotlin.String | The public key of the wallet
val mintAddress : kotlin.String = 7EWJNaNYfPYMaqzdAAa4ps5kpqW95B7VHsjhW1kr18sj // kotlin.String | The mint address of the token (either SPL or NFT)
try {
    val result : ATAResponse = apiInstance.solanaDeriveAssociatedTokenAccountAddress(publicKey, mintAddress)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaWalletApi#solanaDeriveAssociatedTokenAccountAddress")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaWalletApi#solanaDeriveAssociatedTokenAccountAddress")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **publicKey** | **kotlin.String**| The public key of the wallet |
 **mintAddress** | **kotlin.String**| The mint address of the token (either SPL or NFT) |

### Return type

[**ATAResponse**](ATAResponse.md)

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

<a name="solanaDerivePrivateKey"></a>
# **solanaDerivePrivateKey**
> GeneratePrivateKey solanaDerivePrivateKey(getPublicKeyRequest)

Derive private key

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-wallet/derive-private-key\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Returns a private key array and a base58-encoded private key given wallet authentication.  A wallet is defined by a public key. A public key is derived from a combination of seed phrase, derivation path, and passphrase. Changing any *one* of these three will change the public key output.  *You can generate a unique public key with each combination of secret recovery phrase, passphrase, and derivation path. Thus, with a single secret recovery phrase, you can generate many public keys. If you are just starting, just supply the secret recovery phrase you generated with the Solana Wallet Secret Recovery Phrase endpoint.*  *If you are trying to get a public key that already exists (e.g., created in the Phantom wallet), make sure you use the correct derivation path and passphrase. To read more about that, see the descriptions of those parameters below.*  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaWalletApi()
val getPublicKeyRequest : GetPublicKeyRequest =  // GetPublicKeyRequest | 
try {
    val result : GeneratePrivateKey = apiInstance.solanaDerivePrivateKey(getPublicKeyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaWalletApi#solanaDerivePrivateKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaWalletApi#solanaDerivePrivateKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getPublicKeyRequest** | [**GetPublicKeyRequest**](GetPublicKeyRequest.md)|  |

### Return type

[**GeneratePrivateKey**](GeneratePrivateKey.md)

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

<a name="solanaDerivePublicKey"></a>
# **solanaDerivePublicKey**
> PublicKey solanaDerivePublicKey(getPublicKeyRequest)

Derive public key

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-wallet/derive-public-key\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Returns a public key given wallet authentication.  A wallet is identified by a public key. A public key is derived from a combination of seed phrase, derivation path, and passphrase. Changing any *one* of these three will change the public key output.   It can also be derived from a private key.  *You can generate a unique public key with each combination of secret recovery phrase, passphrase, and derivation path; or from a private key. Thus, with a single secret recovery phrase, you can generate many public keys; however, with a private key, you can only generate one public key. If you are just starting, generate a &lt;a href&#x3D;\&quot;#operation/solanaGenerateSecretRecoveryPhrase\&quot;&gt;secret recovery phrase&lt;/a&gt; or &lt;a href&#x3D;\&quot;#operation/solanaGeneratePrivateKey\&quot;&gt;private key&lt;/a&gt;.  *If you are trying to get a public key that already exists (e.g., created in the Phantom wallet), make sure you use the correct derivation path and passphrase; or just use the private key. To read more about that, see the descriptions of those parameters below.*  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaWalletApi()
val getPublicKeyRequest : GetPublicKeyRequest =  // GetPublicKeyRequest | 
try {
    val result : PublicKey = apiInstance.solanaDerivePublicKey(getPublicKeyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaWalletApi#solanaDerivePublicKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaWalletApi#solanaDerivePublicKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getPublicKeyRequest** | [**GetPublicKeyRequest**](GetPublicKeyRequest.md)|  |

### Return type

[**PublicKey**](PublicKey.md)

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

<a name="solanaGeneratePrivateKey"></a>
# **solanaGeneratePrivateKey**
> GeneratePrivateKey solanaGeneratePrivateKey()

Generate private key

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-wallet/generate-private-key\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Use this endpoint to securely and randomly generate a private key for a Solana wallet.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaWalletApi()
try {
    val result : GeneratePrivateKey = apiInstance.solanaGeneratePrivateKey()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaWalletApi#solanaGeneratePrivateKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaWalletApi#solanaGeneratePrivateKey")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GeneratePrivateKey**](GeneratePrivateKey.md)

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

<a name="solanaGenerateSecretRecoveryPhrase"></a>
# **solanaGenerateSecretRecoveryPhrase**
> SecretPhrase solanaGenerateSecretRecoveryPhrase()

Generate secret phrase

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-wallet/generate-secret-phrase\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Use this endpoint to securely and randomly generate a secret recovery phrase for a Solana wallet.   &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaWalletApi()
try {
    val result : SecretPhrase = apiInstance.solanaGenerateSecretRecoveryPhrase()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaWalletApi#solanaGenerateSecretRecoveryPhrase")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaWalletApi#solanaGenerateSecretRecoveryPhrase")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SecretPhrase**](SecretPhrase.md)

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

<a name="solanaGetAirdrop"></a>
# **solanaGetAirdrop**
> TransferResponse solanaGetAirdrop(airdropRequest)

Get an airdrop on devnet

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-wallet/get-airdrop\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Use this endpoint to get an airdrop of SOL on the devnet (not real SOL). Amount of 0.015,  which is the minimum amount of SOL you need to mint a Metaplex NFT and then transfer it to another wallet.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaWalletApi()
val airdropRequest : AirdropRequest =  // AirdropRequest | 
try {
    val result : TransferResponse = apiInstance.solanaGetAirdrop(airdropRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaWalletApi#solanaGetAirdrop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaWalletApi#solanaGetAirdrop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **airdropRequest** | [**AirdropRequest**](AirdropRequest.md)|  | [optional]

### Return type

[**TransferResponse**](TransferResponse.md)

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

<a name="solanaGetBalance"></a>
# **solanaGetBalance**
> BalanceResponse solanaGetBalance(balanceRequest)

Get wallet&#39;s balance in SOL or any SPL

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-wallet/get-wallet-balance\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      See the balance of a wallet in SOL or any SPL token.  To get the balance of an SPL token, supply the &#x60;mint_address&#x60; of the SPL token. The list of SPL tokens can be viewed &lt;a href&#x3D;\&quot;https://raw.githubusercontent.com/solana-labs/token-list/main/src/tokens/solana.tokenlist.json\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  You can also use this endpoint to see whether or not a person owns an NFT. Just supply the &#x60;mint_address&#x60; of the NFT. A balance of \&quot;1\&quot; means the person owns the NFT, and a balance of \&quot;0\&quot; means the person does not own the NFT. This works in most cases, but we are aware of one edge case where a balance of \&quot;0\&quot; will show up for a person who is actually the owner of the NFT. We just recommend using the &lt;a href&#x3D;\&quot;#operation/solanaGetNFTOwner\&quot;&gt;getNFTOwner&lt;/a&gt; endpoint and comparing that output to the expected address.  &#x60;Cost: 0.25 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaWalletApi()
val balanceRequest : BalanceRequest =  // BalanceRequest | 
try {
    val result : BalanceResponse = apiInstance.solanaGetBalance(balanceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaWalletApi#solanaGetBalance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaWalletApi#solanaGetBalance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **balanceRequest** | [**BalanceRequest**](BalanceRequest.md)|  | [optional]

### Return type

[**BalanceResponse**](BalanceResponse.md)

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

<a name="solanaGetNFTsBelongingToWallet"></a>
# **solanaGetNFTsBelongingToWallet**
> ListNFTsResponse solanaGetNFTsBelongingToWallet(network, publicKey)

Get address&#39;s NFTs

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-wallet/get-wallet-nfts\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      See the NFTs that belong to a given public key address  &#x60;Cost: 3 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaWalletApi()
val network : kotlin.String = mainnet-beta // kotlin.String | The network ID (devnet, mainnet-beta)
val publicKey : kotlin.String = HE3ZYk4aWfKD7R9EmFQbxjj75JdgHuDztNAsseKVan82 // kotlin.String | The public key of the account whose list of owned NFTs you want to get
try {
    val result : ListNFTsResponse = apiInstance.solanaGetNFTsBelongingToWallet(network, publicKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaWalletApi#solanaGetNFTsBelongingToWallet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaWalletApi#solanaGetNFTsBelongingToWallet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **network** | **kotlin.String**| The network ID (devnet, mainnet-beta) |
 **publicKey** | **kotlin.String**| The public key of the account whose list of owned NFTs you want to get |

### Return type

[**ListNFTsResponse**](ListNFTsResponse.md)

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

<a name="solanaGetTokensBelongingToWallet"></a>
# **solanaGetTokensBelongingToWallet**
> kotlin.collections.List&lt;kotlin.Any&gt; solanaGetTokensBelongingToWallet(network, publicKey, includeNfts, includeZeroBalanceHoldings)

Get address&#39;s tokens and respective balances

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-wallet/get-wallet-token-holdings\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      See the token holdings of a given public key address  &#x60;Cost: 2 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaWalletApi()
val network : kotlin.String = mainnet-beta // kotlin.String | The network ID (devnet, mainnet-beta)
val publicKey : kotlin.String = GKNcUmNacSJo4S2Kq3DuYRYRGw3sNUfJ4tyqd198t6vQ // kotlin.String | The public key of the account whose list of owned NFTs you want to get
val includeNfts : kotlin.Boolean = false // kotlin.Boolean | Whether or not to include NFTs in the response
val includeZeroBalanceHoldings : kotlin.Boolean = false // kotlin.Boolean | Whether or not to include holdings that have zero balance. This indicates that the wallet held this token or NFT in the past, but no longer holds it.
try {
    val result : kotlin.collections.List<kotlin.Any> = apiInstance.solanaGetTokensBelongingToWallet(network, publicKey, includeNfts, includeZeroBalanceHoldings)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaWalletApi#solanaGetTokensBelongingToWallet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaWalletApi#solanaGetTokensBelongingToWallet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **network** | **kotlin.String**| The network ID (devnet, mainnet-beta) |
 **publicKey** | **kotlin.String**| The public key of the account whose list of owned NFTs you want to get |
 **includeNfts** | **kotlin.Boolean**| Whether or not to include NFTs in the response | [optional] [default to false]
 **includeZeroBalanceHoldings** | **kotlin.Boolean**| Whether or not to include holdings that have zero balance. This indicates that the wallet held this token or NFT in the past, but no longer holds it. | [optional] [default to false]

### Return type

[**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md)

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

<a name="solanaGetWalletTransactions"></a>
# **solanaGetWalletTransactions**
> kotlin.collections.List&lt;kotlin.String&gt; solanaGetWalletTransactions(network, publicKey)

Get address&#39;s associated transaction signatures

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-wallet/get-wallet-transactions\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      See the transaction signatures of a given public key address  &#x60;Cost: 1 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaWalletApi()
val network : kotlin.String = mainnet-beta // kotlin.String | The network ID (devnet, mainnet-beta)
val publicKey : kotlin.String = GKNcUmNacSJo4S2Kq3DuYRYRGw3sNUfJ4tyqd198t6vQ // kotlin.String | The public key of the account whose list of signatures you want to get
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.solanaGetWalletTransactions(network, publicKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaWalletApi#solanaGetWalletTransactions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaWalletApi#solanaGetWalletTransactions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **network** | **kotlin.String**| The network ID (devnet, mainnet-beta) |
 **publicKey** | **kotlin.String**| The public key of the account whose list of signatures you want to get |

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

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="solanaTransfer"></a>
# **solanaTransfer**
> DoubleTransferResponse solanaTransfer(transferRequest)

Transfer SOL, a token, or an NFT to another address

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-wallet/transfer-sol\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See transfer SOL example (Python, JavaScript)&lt;/a&gt;.  &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-wallet/transfer-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See transfer NFT example (can also be used for SPL token) (Python, JavaScript)&lt;/a&gt;.  This is a powerful function. It might be slightly confusing because there are several optional parameters, so take some time to review it. This function can send SOL, send an SPL token, or send an NFT. You can set the fee payer of the transaction; you can sign and submit the transaction for confirmation; and you can select to simply return the compiled transaction so that you can submit it to the user for signing (e.g., via Phantom; no private keys required in this case).  Transfer SOL, a token or an NFT to another address. If you&#39;re transferring an NFT, supply the &#x60;mint&#x60; (the address of the mint) for the &#x60;token_address&#x60;.  SENDER: Note that the wallet information is used to authorize the sending of the tokens and identifies the source of the tokens. If &#x60;return_compiled_transaction &#x3D; false&#x60;, we sign and submit the transaction (&#x60;wallet&#x60; is required in this case; do not provide a value for &#x60;sender_public_key&#x60;). If &#x60;return_compiled_transaction &#x3D; true&#x60;, we compile the transaction (one of &#x60;wallet&#x60; or &#x60;sender_public_key&#x60; is required in this case; do not provide both).  RECIPIENT: &#x60;recipient_address&#x60; identifies the receiver. This is entirely separate from the information used for the SENDER above. So, in this API call, there are two wallets involved, but only one (namely, the SENDER) is needed to authorize the transaction.  FEE_PAYER: The fee payer of the transaction defaults to &#x60;wallet&#x60; (or &#x60;sender_public_key&#x60;). To set a different fee payer, provide a value for &#x60;fee_payer_wallet&#x60;.  If you&#39;re transfering a token, supply the token address found on the explorer (e.g., see &#x60;SRMuApVNdxXokk5GT7XD5cUUgXMBCoAz2LHeuAoKWRt&#x60; for &lt;a href&#x3D;\&quot;https://explorer.solana.com/address/SRMuApVNdxXokk5GT7XD5cUUgXMBCoAz2LHeuAoKWRt\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Serum Token&lt;/a&gt;) for the &#x60;token_address&#x60;. If you&#39;re transferring SOL, do not supply a value for &#x60;token_address&#x60;.  &#x60;Cost: 2 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SolanaWalletApi()
val transferRequest : TransferRequest =  // TransferRequest | 
try {
    val result : DoubleTransferResponse = apiInstance.solanaTransfer(transferRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaWalletApi#solanaTransfer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaWalletApi#solanaTransfer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferRequest** | [**TransferRequest**](TransferRequest.md)|  | [optional]

### Return type

[**DoubleTransferResponse**](DoubleTransferResponse.md)

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

