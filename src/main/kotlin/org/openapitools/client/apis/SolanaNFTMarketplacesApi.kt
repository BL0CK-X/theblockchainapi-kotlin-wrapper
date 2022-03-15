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

import org.openapitools.client.models.BuyRequest
import org.openapitools.client.models.BuyResponse
import org.openapitools.client.models.DelistRequest
import org.openapitools.client.models.DelistResponse
import org.openapitools.client.models.GetNFTListingResponse
import org.openapitools.client.models.ListRequest
import org.openapitools.client.models.ListResponse
import org.openapitools.client.models.NFTAnalyticsRequest
import org.openapitools.client.models.NFTAnalyticsResponse
import org.openapitools.client.models.NFTTransaction

import org.openapitools.client.infrastructure.ApiClient
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
            System.getProperties().getProperty("org.openapitools.client.baseUrl", "https://api.blockchainapi.com/v1")
        }
    }

    /**
    * Buy
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/buy-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Buy an NFT on a Solana Exchange.  Exchanges supported: SolSea, Magic Edennpm  &#x60;Cost: 25 Credits&#x60;, &#x60;Cost: 3 Credits on Devnet&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param network The network ID 
    * @param exchange The NFT exchange to interact with 
    * @param mintAddress The mint address of the NFT you want to buy 
    * @param buyRequest  (optional)
    * @return BuyResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun solanaBuyNFT(network: kotlin.String, exchange: kotlin.String, mintAddress: kotlin.String, buyRequest: BuyRequest?) : BuyResponse {
        val localVariableConfig = solanaBuyNFTRequestConfig(network = network, exchange = exchange, mintAddress = mintAddress, buyRequest = buyRequest)

        val localVarResponse = request<BuyRequest, BuyResponse>(
            localVariableConfig
        )

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
    * To obtain the request config of the operation solanaBuyNFT
    *
    * @param network The network ID 
    * @param exchange The NFT exchange to interact with 
    * @param mintAddress The mint address of the NFT you want to buy 
    * @param buyRequest  (optional)
    * @return RequestConfig
    */
    fun solanaBuyNFTRequestConfig(network: kotlin.String, exchange: kotlin.String, mintAddress: kotlin.String, buyRequest: BuyRequest?) : RequestConfig<BuyRequest> {
        val localVariableBody = buyRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/solana/nft/marketplaces/{exchange}/buy/{network}/{mint_address}".replace("{"+"network"+"}", "$network").replace("{"+"exchange"+"}", "$exchange").replace("{"+"mint_address"+"}", "$mintAddress"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Delist
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/delist-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Delist an NFT from a Solana Exchange.  Exchanges supported: SolSea, Magic Eden  &#x60;Cost: 8 Credits&#x60;, &#x60;Cost: 3 Credits on Devnet&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param network The network ID 
    * @param exchange The NFT exchange to interact with 
    * @param mintAddress The mint address of the NFT you want to buy 
    * @param delistRequest  (optional)
    * @return DelistResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun solanaDelistNFT(network: kotlin.String, exchange: kotlin.String, mintAddress: kotlin.String, delistRequest: DelistRequest?) : DelistResponse {
        val localVariableConfig = solanaDelistNFTRequestConfig(network = network, exchange = exchange, mintAddress = mintAddress, delistRequest = delistRequest)

        val localVarResponse = request<DelistRequest, DelistResponse>(
            localVariableConfig
        )

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
    * To obtain the request config of the operation solanaDelistNFT
    *
    * @param network The network ID 
    * @param exchange The NFT exchange to interact with 
    * @param mintAddress The mint address of the NFT you want to buy 
    * @param delistRequest  (optional)
    * @return RequestConfig
    */
    fun solanaDelistNFTRequestConfig(network: kotlin.String, exchange: kotlin.String, mintAddress: kotlin.String, delistRequest: DelistRequest?) : RequestConfig<DelistRequest> {
        val localVariableBody = delistRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/solana/nft/marketplaces/{exchange}/delist/{network}/{mint_address}".replace("{"+"network"+"}", "$network").replace("{"+"exchange"+"}", "$exchange").replace("{"+"mint_address"+"}", "$mintAddress"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Get NFT Listing
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/get-nft-listing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Get the Marketplace listing of a Solana NFT.  Currently checks the following Solana NFT martketplaces: SolSea, Magic Eden, Solanart, Alpha Art, Digital Eyes, Exchange.art  &#x60;Cost: 1 Credits&#x60;, (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param network The network ID 
    * @param mintAddress The mint address of the NFT you want to buy 
    * @return GetNFTListingResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun solanaGetNFTListing(network: kotlin.String, mintAddress: kotlin.String) : GetNFTListingResponse {
        val localVariableConfig = solanaGetNFTListingRequestConfig(network = network, mintAddress = mintAddress)

        val localVarResponse = request<Unit, GetNFTListingResponse>(
            localVariableConfig
        )

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
    * To obtain the request config of the operation solanaGetNFTListing
    *
    * @param network The network ID 
    * @param mintAddress The mint address of the NFT you want to buy 
    * @return RequestConfig
    */
    fun solanaGetNFTListingRequestConfig(network: kotlin.String, mintAddress: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/solana/nft/marketplaces/listing/{network}/{mint_address}".replace("{"+"network"+"}", "$network").replace("{"+"mint_address"+"}", "$mintAddress"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Get NFT Analytics
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/analytics\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  A collection is a list of NFTs.  Any collection can thus be defined as a list of mint addresses.  This endpoint takes in a list of mint addresses (effectively, a collection), a start time (optional), and an end time (optional) and outputs the floor for that period, the volume for that period, and the transaction history for each NFT in the list (buy, list, delist, update price) for that period.  We are currently compiling a dictionary of collection names to list of mint addresses for public use. Please contribute &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/solana-nft-collection-mint-addresses\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Currently scans the following Solana NFT martketplaces: SolSea, Magic Eden, Solanart, Alpha Art, Digital Eyes, Exchange.art  &#x60;Cost: 15 Credits&#x60;, (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param nfTAnalyticsRequest  (optional)
    * @return NFTAnalyticsResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun solanaGetNFTMarketplaceAnalytics(nfTAnalyticsRequest: NFTAnalyticsRequest?) : NFTAnalyticsResponse {
        val localVariableConfig = solanaGetNFTMarketplaceAnalyticsRequestConfig(nfTAnalyticsRequest = nfTAnalyticsRequest)

        val localVarResponse = request<NFTAnalyticsRequest, NFTAnalyticsResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as NFTAnalyticsResponse
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
    * To obtain the request config of the operation solanaGetNFTMarketplaceAnalytics
    *
    * @param nfTAnalyticsRequest  (optional)
    * @return RequestConfig
    */
    fun solanaGetNFTMarketplaceAnalyticsRequestConfig(nfTAnalyticsRequest: NFTAnalyticsRequest?) : RequestConfig<NFTAnalyticsRequest> {
        val localVariableBody = nfTAnalyticsRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/solana/nft/marketplaces/analytics",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Get Marketplace Market Share
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/market-share\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Get the Marketplace listing of a Solana NFT.  Currently checks for the following Solana NFT martketplaces: SolSea, Magic Eden, Solanart, Alpha Art, Digital Eyes, Exchange.art  &#x60;Cost: 3 Credits&#x60;, (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @return kotlin.Any
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun solanaGetNFTMarketplaceMarketShare() : kotlin.Any {
        val localVariableConfig = solanaGetNFTMarketplaceMarketShareRequestConfig()

        val localVarResponse = request<Unit, kotlin.Any>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Any
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
    * To obtain the request config of the operation solanaGetNFTMarketplaceMarketShare
    *
    * @return RequestConfig
    */
    fun solanaGetNFTMarketplaceMarketShareRequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/solana/nft/marketplaces/analytics/market_share",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Get Recent NFT Transactions
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/recent-transactions\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Get all NFT transactions across all major marketplaces in the last 30 minutes.  Currently checks for the following Solana NFT martketplaces: SolSea, Magic Eden, Solanart, Alpha Art, Digital Eyes, Exchange.art  &#x60;Cost: 15 Credits&#x60;, (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @return kotlin.collections.List<NFTTransaction>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun solanaGetNFTMarketplaceRecentTransactions() : kotlin.collections.List<NFTTransaction> {
        val localVariableConfig = solanaGetNFTMarketplaceRecentTransactionsRequestConfig()

        val localVarResponse = request<Unit, kotlin.collections.List<NFTTransaction>>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<NFTTransaction>
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
    * To obtain the request config of the operation solanaGetNFTMarketplaceRecentTransactions
    *
    * @return RequestConfig
    */
    fun solanaGetNFTMarketplaceRecentTransactionsRequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/solana/nft/marketplaces/analytics/recent_transactions",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * List
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/list-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  List an NFT on a Solana Exchange.  Exchanges supported: SolSea, Magic Eden  &#x60;Cost: 12 Credits&#x60;, &#x60;Cost: 3 Credits on Devnet&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param network The network ID 
    * @param exchange The NFT exchange to interact with 
    * @param mintAddress The mint address of the NFT you want to buy 
    * @param listRequest  (optional)
    * @return ListResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun solanaListNFT(network: kotlin.String, exchange: kotlin.String, mintAddress: kotlin.String, listRequest: ListRequest?) : ListResponse {
        val localVariableConfig = solanaListNFTRequestConfig(network = network, exchange = exchange, mintAddress = mintAddress, listRequest = listRequest)

        val localVarResponse = request<ListRequest, ListResponse>(
            localVariableConfig
        )

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
    * To obtain the request config of the operation solanaListNFT
    *
    * @param network The network ID 
    * @param exchange The NFT exchange to interact with 
    * @param mintAddress The mint address of the NFT you want to buy 
    * @param listRequest  (optional)
    * @return RequestConfig
    */
    fun solanaListNFTRequestConfig(network: kotlin.String, exchange: kotlin.String, mintAddress: kotlin.String, listRequest: ListRequest?) : RequestConfig<ListRequest> {
        val localVariableBody = listRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/solana/nft/marketplaces/{exchange}/list/{network}/{mint_address}".replace("{"+"network"+"}", "$network").replace("{"+"exchange"+"}", "$exchange").replace("{"+"mint_address"+"}", "$mintAddress"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
