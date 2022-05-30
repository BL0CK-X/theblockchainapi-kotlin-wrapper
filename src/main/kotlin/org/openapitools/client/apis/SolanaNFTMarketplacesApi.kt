/**
 * The Blockchain API
 *
 * # About  Our vision is to make it super easy to interact with the decentralized web. We want you to be able to do this in any coding language and do it easily and quickly.   You're a key part of our vision. We love feature requests! <a href=\"#section/Feature-Requests\">Make one!</a>  # How to Use the API  To use the API, you simply need to create an API key pair.  Doing so takes less than a minute. Simply go to <a target=\"_blank\" href=\"https://dashboard.blockchainapi.com\">the dashboard</a>, create an account, and generate a key pair. You can now use this pair to make API requests. You must create your first pair via the dashboard.  # Feature Requests  Got a feature request? Submit it as an issue on <a target=\"_blank\" href=\"https://github.com/BL0CK-X/the-blockchain-api/issues/new/choose\">our GitHub repo</a> or [email us](mailto:info@blockchainapi.com).  # Contact  <figure>     <img          width=\"40px\"         height=\"40px\"          src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/phone.svg\"     />     <figcaption style=\"textAlign:center;\">Text / Call: +1 (415) 888 4745 </figcaption> </figure> <a href=\"mailto:info@blockchainapi.com\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/email.svg\"         />         <figcaption style=\"textAlign:center;\">Email us: info@blockchainapi.com</figcaption>     </figure> </a> <a href=\"https://discord.gg/d49yzrZRAF\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/discord.svg\"         />         <figcaption style=\"textAlign:center;\">Join our Discord</figcaption>     </figure> </a> <a href=\"https://twitter.com/_BlockX_\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/twitter.svg\"         />          <figcaption style=\"textAlign:center;\">Follow us on Twitter</figcaption>     </figure> </a> <a href=\"https://github.com/BL0CK-X/the-blockchain-api\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/github.svg\"         />         <figcaption style=\"textAlign:center;\">Star us on Github</figcaption>     </figure> </a>  # Security  Common dogma is to never give out your seed phrase. We agree. It's a matter of security, and anyone who has your seed phrase can irreversibly empty your wallet.   <b>When using an API endpoint that requires a seed phrase, we highly recommend that users use or create a wallet that they do not use as their primary wallet.</b>   How you make this work depends on what you're doing. If you're minting an NFT for example, we recommend creating a new wallet and then transferring just enough SOL to that wallet to mint the NFT. This is possible on Solana because such transactions cost less than a penny. We will have more tutorials in the future that make it easier for you to be secure when using our API.  We have easy-to-use endpoints for <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1secret_recovery_phrase/post\">creating a new seed phrase</a> and then <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1public_key/post\">deriving a public key</a> to enable you to transfer to that new wallet.  Let's have a constructive dialog about this. Feel free to <a href=\"#section/Contact\">contact us</a>. I made a video discussing this matter <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.  Note: We have had a couple of individuals harrass and threaten us. These individuals did <b>not</b> try our API or speak to anyone who has used it. They simply saw that we require a seed phrase for certain endpoints and figured that the proper response was to attack us. (I explain why we do <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.) Such harrassment and threats are not only harmful, but they are also illegal, and we will report offenders. Do not harrass us. Rather, feel free to discuss your concerns with us and we will be more than happy to work with you to come up with a solution.  # Pricing  <b>Each user receives 100 free credits. Each user can call endpoints that cost 0 credits up to 50 requests/min before being rate-limited.</b> Thereafter, they can upgrade to have a higher rate limit. The purpose of this is to act like a free trial -- not to function like a freemium model where one can stay on the free tier indefinitely.  You can learn more about our pricing <a href=\"https://dashboard.blockchainapi.com/billing\" target=\"_blank\">here</a>.   We frequently do custom plans. If our pricing doesn't work for you, <a href=\"#section/Contact\">contact us</a>.  If you have questions, concerns, feedback, or ideas, <a href=\"#section/Contact\">contact us</a>.  # SDKs / API Wrappers  We have examples using both our <a href=\"https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples\" target=\"_blank\">Python wrapper and our JavaScript wrapper here</a>.  We have built a custom <a href=\"https://github.com/BL0CK-X/the-blockchain-api-python-wrapper\" target=\"_blank\">Python wrapper</a>.  `pip install theblockchainapi`  We also have published a <a href=\"https://github.com/BL0CK-X/theblockchainapi-javascript-wrapper\" target=\"_blank\">JavaScript Wrapper</a>.  `npm install theblockchainapi`  We also have auto-generated wrappers for the following languages: - <a href=\"https://github.com/BL0CK-X/theblockchainapi-go-wrapper\" target = \"_blank\">Go</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-java-wrapper\" target = \"_blank\">Java</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-kotlin-wrapper\" target = \"_blank\">Kotlin</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-php-wrapper\" target = \"_blank\">PHP</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-swift-wrapper\" target = \"_blank\">Swift5</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-typescript-wrapper\" target = \"_blank\">TypeScript</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-csharp-wrapper\" target = \"_blank\">C#</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-dart-wrapper\" target = \"_blank\">Dart</a>  If you would like a different language as well, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.  If you run into any bugs with the wrappers, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.
 *
 * The version of the OpenAPI document: null
 * Contact: info@blockchainapi.com
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.apis

import java.io.IOException

import org.openapitools.client.models.BuyRequest
import org.openapitools.client.models.BuyResponse
import org.openapitools.client.models.DelistRequest
import org.openapitools.client.models.DelistResponse
import org.openapitools.client.models.GetNFTListingResponse
import org.openapitools.client.models.ListRequest
import org.openapitools.client.models.ListResponse

import com.squareup.moshi.Json

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ApiResponse
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class SolanaNFTMarketplacesApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://api.blockchainapi.com/v1")
        }
    }

    /**
     * enum for parameter network
     */
     enum class Network_solanaBuyNFT(val value: kotlin.String) {
         @Json(name = "devnet") devnet("devnet"),
         @Json(name = "mainnet-beta") mainnetMinusBeta("mainnet-beta"),
         ;
     }

    /**
     * enum for parameter exchange
     */
     enum class Exchange_solanaBuyNFT(val value: kotlin.String) {
         @Json(name = "magic-eden") magicMinusEden("magic-eden"),
         ;
     }

    /**
    * Buy
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/buy-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Buy an NFT on a Solana Exchange.  Exchanges supported: SolSea, Magic Eden  &#x60;Cost: 25 Credits&#x60;, &#x60;Cost: 3 Credits on Devnet&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param network The network ID 
    * @param exchange The NFT exchange to interact with 
    * @param mintAddress The mint address of the NFT you want to buy 
    * @param buyRequest  (optional)
    * @return BuyResponse
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun solanaBuyNFT(network: Network_solanaBuyNFT, exchange: Exchange_solanaBuyNFT, mintAddress: kotlin.String, buyRequest: BuyRequest?) : BuyResponse {
        val localVarResponse = solanaBuyNFTWithHttpInfo(network = network, exchange = exchange, mintAddress = mintAddress, buyRequest = buyRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as BuyResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Buy
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/buy-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Buy an NFT on a Solana Exchange.  Exchanges supported: SolSea, Magic Eden  &#x60;Cost: 25 Credits&#x60;, &#x60;Cost: 3 Credits on Devnet&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param network The network ID 
    * @param exchange The NFT exchange to interact with 
    * @param mintAddress The mint address of the NFT you want to buy 
    * @param buyRequest  (optional)
    * @return ApiResponse<BuyResponse?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun solanaBuyNFTWithHttpInfo(network: Network_solanaBuyNFT, exchange: Exchange_solanaBuyNFT, mintAddress: kotlin.String, buyRequest: BuyRequest?) : ApiResponse<BuyResponse?> {
        val localVariableConfig = solanaBuyNFTRequestConfig(network = network, exchange = exchange, mintAddress = mintAddress, buyRequest = buyRequest)

        return request<BuyRequest, BuyResponse>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation solanaBuyNFT
    *
    * @param network The network ID 
    * @param exchange The NFT exchange to interact with 
    * @param mintAddress The mint address of the NFT you want to buy 
    * @param buyRequest  (optional)
    * @return RequestConfig
    */
    fun solanaBuyNFTRequestConfig(network: Network_solanaBuyNFT, exchange: Exchange_solanaBuyNFT, mintAddress: kotlin.String, buyRequest: BuyRequest?) : RequestConfig<BuyRequest> {
        val localVariableBody = buyRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/solana/nft/marketplaces/{exchange}/buy/{network}/{mint_address}".replace("{"+"network"+"}", "$network").replace("{"+"exchange"+"}", "$exchange").replace("{"+"mint_address"+"}", "$mintAddress"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter network
     */
     enum class Network_solanaDelistNFT(val value: kotlin.String) {
         @Json(name = "devnet") devnet("devnet"),
         @Json(name = "mainnet-beta") mainnetMinusBeta("mainnet-beta"),
         ;
     }

    /**
     * enum for parameter exchange
     */
     enum class Exchange_solanaDelistNFT(val value: kotlin.String) {
         @Json(name = "magic-eden") magicMinusEden("magic-eden"),
         ;
     }

    /**
    * Delist
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/delist-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Delist an NFT from a Solana Exchange.  Exchanges supported: SolSea, Magic Eden  &#x60;Cost: 8 Credits&#x60;, &#x60;Cost: 3 Credits on Devnet&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param network The network ID 
    * @param exchange The NFT exchange to interact with 
    * @param mintAddress The mint address of the NFT you want to buy 
    * @param delistRequest  (optional)
    * @return DelistResponse
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun solanaDelistNFT(network: Network_solanaDelistNFT, exchange: Exchange_solanaDelistNFT, mintAddress: kotlin.String, delistRequest: DelistRequest?) : DelistResponse {
        val localVarResponse = solanaDelistNFTWithHttpInfo(network = network, exchange = exchange, mintAddress = mintAddress, delistRequest = delistRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as DelistResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Delist
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/delist-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Delist an NFT from a Solana Exchange.  Exchanges supported: SolSea, Magic Eden  &#x60;Cost: 8 Credits&#x60;, &#x60;Cost: 3 Credits on Devnet&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param network The network ID 
    * @param exchange The NFT exchange to interact with 
    * @param mintAddress The mint address of the NFT you want to buy 
    * @param delistRequest  (optional)
    * @return ApiResponse<DelistResponse?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun solanaDelistNFTWithHttpInfo(network: Network_solanaDelistNFT, exchange: Exchange_solanaDelistNFT, mintAddress: kotlin.String, delistRequest: DelistRequest?) : ApiResponse<DelistResponse?> {
        val localVariableConfig = solanaDelistNFTRequestConfig(network = network, exchange = exchange, mintAddress = mintAddress, delistRequest = delistRequest)

        return request<DelistRequest, DelistResponse>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation solanaDelistNFT
    *
    * @param network The network ID 
    * @param exchange The NFT exchange to interact with 
    * @param mintAddress The mint address of the NFT you want to buy 
    * @param delistRequest  (optional)
    * @return RequestConfig
    */
    fun solanaDelistNFTRequestConfig(network: Network_solanaDelistNFT, exchange: Exchange_solanaDelistNFT, mintAddress: kotlin.String, delistRequest: DelistRequest?) : RequestConfig<DelistRequest> {
        val localVariableBody = delistRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/solana/nft/marketplaces/{exchange}/delist/{network}/{mint_address}".replace("{"+"network"+"}", "$network").replace("{"+"exchange"+"}", "$exchange").replace("{"+"mint_address"+"}", "$mintAddress"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter network
     */
     enum class Network_solanaGetNFTListing(val value: kotlin.String) {
         @Json(name = "devnet") devnet("devnet"),
         @Json(name = "mainnet-beta") mainnetMinusBeta("mainnet-beta"),
         ;
     }

    /**
    * Get NFT Listing
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/get-nft-listing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Get the Marketplace listing of a Solana NFT.  Currently checks the following Solana NFT martketplaces: SolSea, Magic Eden, Solanart, Alpha Art, Digital Eyes, Exchange.art  &#x60;Cost: 1 Credits&#x60;, (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param network The network ID 
    * @param mintAddress The mint address of the NFT you want to buy 
    * @return GetNFTListingResponse
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun solanaGetNFTListing(network: Network_solanaGetNFTListing, mintAddress: kotlin.String) : GetNFTListingResponse {
        val localVarResponse = solanaGetNFTListingWithHttpInfo(network = network, mintAddress = mintAddress)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetNFTListingResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Get NFT Listing
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/get-nft-listing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Get the Marketplace listing of a Solana NFT.  Currently checks the following Solana NFT martketplaces: SolSea, Magic Eden, Solanart, Alpha Art, Digital Eyes, Exchange.art  &#x60;Cost: 1 Credits&#x60;, (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param network The network ID 
    * @param mintAddress The mint address of the NFT you want to buy 
    * @return ApiResponse<GetNFTListingResponse?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun solanaGetNFTListingWithHttpInfo(network: Network_solanaGetNFTListing, mintAddress: kotlin.String) : ApiResponse<GetNFTListingResponse?> {
        val localVariableConfig = solanaGetNFTListingRequestConfig(network = network, mintAddress = mintAddress)

        return request<Unit, GetNFTListingResponse>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation solanaGetNFTListing
    *
    * @param network The network ID 
    * @param mintAddress The mint address of the NFT you want to buy 
    * @return RequestConfig
    */
    fun solanaGetNFTListingRequestConfig(network: Network_solanaGetNFTListing, mintAddress: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/solana/nft/marketplaces/listing/{network}/{mint_address}".replace("{"+"network"+"}", "$network").replace("{"+"mint_address"+"}", "$mintAddress"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter network
     */
     enum class Network_solanaListNFT(val value: kotlin.String) {
         @Json(name = "devnet") devnet("devnet"),
         @Json(name = "mainnet-beta") mainnetMinusBeta("mainnet-beta"),
         ;
     }

    /**
     * enum for parameter exchange
     */
     enum class Exchange_solanaListNFT(val value: kotlin.String) {
         @Json(name = "magic-eden") magicMinusEden("magic-eden"),
         ;
     }

    /**
    * List
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/list-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  List an NFT on a Solana Exchange.  Exchanges supported: SolSea, Magic Eden  &#x60;Cost: 12 Credits&#x60;, &#x60;Cost: 3 Credits on Devnet&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param network The network ID 
    * @param exchange The NFT exchange to interact with 
    * @param mintAddress The mint address of the NFT you want to buy 
    * @param listRequest  (optional)
    * @return ListResponse
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun solanaListNFT(network: Network_solanaListNFT, exchange: Exchange_solanaListNFT, mintAddress: kotlin.String, listRequest: ListRequest?) : ListResponse {
        val localVarResponse = solanaListNFTWithHttpInfo(network = network, exchange = exchange, mintAddress = mintAddress, listRequest = listRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ListResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * List
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/list-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  List an NFT on a Solana Exchange.  Exchanges supported: SolSea, Magic Eden  &#x60;Cost: 12 Credits&#x60;, &#x60;Cost: 3 Credits on Devnet&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param network The network ID 
    * @param exchange The NFT exchange to interact with 
    * @param mintAddress The mint address of the NFT you want to buy 
    * @param listRequest  (optional)
    * @return ApiResponse<ListResponse?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun solanaListNFTWithHttpInfo(network: Network_solanaListNFT, exchange: Exchange_solanaListNFT, mintAddress: kotlin.String, listRequest: ListRequest?) : ApiResponse<ListResponse?> {
        val localVariableConfig = solanaListNFTRequestConfig(network = network, exchange = exchange, mintAddress = mintAddress, listRequest = listRequest)

        return request<ListRequest, ListResponse>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation solanaListNFT
    *
    * @param network The network ID 
    * @param exchange The NFT exchange to interact with 
    * @param mintAddress The mint address of the NFT you want to buy 
    * @param listRequest  (optional)
    * @return RequestConfig
    */
    fun solanaListNFTRequestConfig(network: Network_solanaListNFT, exchange: Exchange_solanaListNFT, mintAddress: kotlin.String, listRequest: ListRequest?) : RequestConfig<ListRequest> {
        val localVariableBody = listRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/solana/nft/marketplaces/{exchange}/list/{network}/{mint_address}".replace("{"+"network"+"}", "$network").replace("{"+"exchange"+"}", "$exchange").replace("{"+"mint_address"+"}", "$mintAddress"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
