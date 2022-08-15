/**
 * The Blockchain API
 *
 * # About  Our vision is to make it super easy to interact with the decentralized web. We want you to be able to do this in any coding language and do it easily and quickly.   You're a key part of our vision. We love feature requests! <a href=\"#section/Feature-Requests\">Make one!</a>  # How to Use the API  To use the API, you simply need to create an API key pair.  Doing so takes less than a minute. Simply go to <a target=\"_blank\" href=\"https://dashboard.blockchainapi.com\">the dashboard</a>, create an account, and generate a key pair. You can now use this pair to make API requests. You must create your first pair via the dashboard.  # Feature Requests  Got a feature request? Submit it as an issue on <a target=\"_blank\" href=\"https://github.com/BL0CK-X/the-blockchain-api/issues/new/choose\">our GitHub repo</a> or [email us](mailto:info@blockchainapi.com).  # Contact  <figure>     <img          width=\"40px\"         height=\"40px\"          src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/phone.svg\"     />     <figcaption style=\"textAlign:center;\">Text / Call: +1 (415) 888 4745 </figcaption> </figure> <a href=\"mailto:info@blockchainapi.com\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/email.svg\"         />         <figcaption style=\"textAlign:center;\">Email us: info@blockchainapi.com</figcaption>     </figure> </a> <a href=\"https://discord.gg/d49yzrZRAF\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/discord.svg\"         />         <figcaption style=\"textAlign:center;\">Join our Discord</figcaption>     </figure> </a> <a href=\"https://twitter.com/BlockchainAP1\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/twitter.svg\"         />          <figcaption style=\"textAlign:center;\">Follow us on Twitter</figcaption>     </figure> </a> <a href=\"https://github.com/BL0CK-X/the-blockchain-api\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/github.svg\"         />         <figcaption style=\"textAlign:center;\">Star us on Github</figcaption>     </figure> </a>  # Security  Common dogma is to never give out your seed phrase. We agree. It's a matter of security, and anyone who has your seed phrase can irreversibly empty your wallet.   <b>When using an API endpoint that requires a seed phrase, we highly recommend that users use or create a wallet that they do not use as their primary wallet.</b>   How you make this work depends on what you're doing. If you're minting an NFT for example, we recommend creating a new wallet and then transferring just enough SOL to that wallet to mint the NFT. This is possible on Solana because such transactions cost less than a penny. We will have more tutorials in the future that make it easier for you to be secure when using our API.  We have easy-to-use endpoints for <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1secret_recovery_phrase/post\">creating a new seed phrase</a> and then <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1public_key/post\">deriving a public key</a> to enable you to transfer to that new wallet.  Let's have a constructive dialog about this. Feel free to <a href=\"#section/Contact\">contact us</a>. I made a video discussing this matter <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.  Note: We have had a couple of individuals harrass and threaten us. These individuals did <b>not</b> try our API or speak to anyone who has used it. They simply saw that we require a seed phrase for certain endpoints and figured that the proper response was to attack us. (I explain why we do <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.) Such harrassment and threats are not only harmful, but they are also illegal, and we will report offenders. Do not harrass us. Rather, feel free to discuss your concerns with us and we will be more than happy to work with you to come up with a solution.  # Pricing  <b>Each user receives 50,000 free credits each month.</b> Each endpoint costs a certain amount credits. Scroll below to any endpoint (i.e., function) to see how much each endpoint costs. (Or CMD+F `Cost: 0 Credit`, for example)  You can learn more about our pricing <a href=\"https://dashboard.blockchainapi.com/billing\" target=\"_blank\">here</a>.   We frequently do custom plans. If our pricing doesn't work for you, <a href=\"#section/Contact\">contact us</a>.  If you have questions, concerns, feedback, or ideas, <a href=\"#section/Contact\">contact us</a>.  # SDKs / API Wrappers  We have examples using both our <a href=\"https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples\" target=\"_blank\">Python wrapper and our JavaScript wrapper here</a>.  We have built a custom <a href=\"https://github.com/BL0CK-X/the-blockchain-api-python-wrapper\" target=\"_blank\">Python wrapper</a>.  `pip install theblockchainapi`  We also have published a <a href=\"https://github.com/BL0CK-X/theblockchainapi-javascript-wrapper\" target=\"_blank\">JavaScript Wrapper</a>.  `npm install theblockchainapi`  We also have auto-generated wrappers for the following languages: - <a href=\"https://github.com/BL0CK-X/theblockchainapi-go-wrapper\" target = \"_blank\">Go</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-java-wrapper\" target = \"_blank\">Java</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-kotlin-wrapper\" target = \"_blank\">Kotlin</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-php-wrapper\" target = \"_blank\">PHP</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-swift-wrapper\" target = \"_blank\">Swift5</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-typescript-wrapper\" target = \"_blank\">TypeScript</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-csharp-wrapper\" target = \"_blank\">C#</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-dart-wrapper\" target = \"_blank\">Dart</a>  If you would like a different language as well, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.  If you run into any bugs with the wrappers, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.
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

import org.openapitools.client.models.GetCandyMachineIDRequest
import org.openapitools.client.models.GetCandyMachineIDResponse
import org.openapitools.client.models.NFT
import org.openapitools.client.models.NFTMintErrorResponse
import org.openapitools.client.models.NFTMintFee
import org.openapitools.client.models.NFTMintRequest
import org.openapitools.client.models.NFTOwnerAdvancedResponse
import org.openapitools.client.models.NFTOwnerResponse
import org.openapitools.client.models.NFTSearchRequest
import org.openapitools.client.models.NFTSearchResponse

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

class SolanaNFTApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://api.blockchainapi.com/v1")
        }
    }

    /**
    * Create an NFT on Solana
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-nft/create-an-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Create a Metaplex NFT on Solana.   Read more on this &lt;a href&#x3D;\&quot;https://blog.blockchainapi.com/2021/11/16/a-note-on-nfts.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Note: Please see &lt;a href&#x3D;\&quot;https://blog.blockchainapi.com/2022/01/18/how-to-format-off-chain-nft-metadata.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;this article&lt;/a&gt; to learn more about what &#x60;nft_upload_method&#x60; means and how storing the metadata of an NFT works.  If you&#39;re using &#x60;nft_upload_method &#x3D; \&quot;LINK\&quot;&#x60;, then to add attributes to the NFT or an image, add them to a JSON file and upload that to Arweave/IPFS/Filecoin. See the JSON format &lt;a href&#x3D;\&quot;https://blog.blockchainapi.com/2022/01/18/how-to-format-off-chain-nft-metadata.html\&quot;&gt;here&lt;/a&gt;.  Then supply the link to the JSON file in &#x60;nft_url&#x60;.   NOTE: Don&#39;t use &#x60;nft_metadata&#x60;. Values provided here do not do anything at the moment. We are fixing this soon.  &#x60;Cost: 5 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param nfTMintRequest  (optional)
    * @return NFT
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun solanaCreateNFT(nfTMintRequest: NFTMintRequest?) : NFT {
        val localVarResponse = solanaCreateNFTWithHttpInfo(nfTMintRequest = nfTMintRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as NFT
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
    * Create an NFT on Solana
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-nft/create-an-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Create a Metaplex NFT on Solana.   Read more on this &lt;a href&#x3D;\&quot;https://blog.blockchainapi.com/2021/11/16/a-note-on-nfts.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Note: Please see &lt;a href&#x3D;\&quot;https://blog.blockchainapi.com/2022/01/18/how-to-format-off-chain-nft-metadata.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;this article&lt;/a&gt; to learn more about what &#x60;nft_upload_method&#x60; means and how storing the metadata of an NFT works.  If you&#39;re using &#x60;nft_upload_method &#x3D; \&quot;LINK\&quot;&#x60;, then to add attributes to the NFT or an image, add them to a JSON file and upload that to Arweave/IPFS/Filecoin. See the JSON format &lt;a href&#x3D;\&quot;https://blog.blockchainapi.com/2022/01/18/how-to-format-off-chain-nft-metadata.html\&quot;&gt;here&lt;/a&gt;.  Then supply the link to the JSON file in &#x60;nft_url&#x60;.   NOTE: Don&#39;t use &#x60;nft_metadata&#x60;. Values provided here do not do anything at the moment. We are fixing this soon.  &#x60;Cost: 5 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param nfTMintRequest  (optional)
    * @return ApiResponse<NFT?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun solanaCreateNFTWithHttpInfo(nfTMintRequest: NFTMintRequest?) : ApiResponse<NFT?> {
        val localVariableConfig = solanaCreateNFTRequestConfig(nfTMintRequest = nfTMintRequest)

        return request<NFTMintRequest, NFT>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation solanaCreateNFT
    *
    * @param nfTMintRequest  (optional)
    * @return RequestConfig
    */
    fun solanaCreateNFTRequestConfig(nfTMintRequest: NFTMintRequest?) : RequestConfig<NFTMintRequest> {
        val localVariableBody = nfTMintRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/solana/nft",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter network
     */
     enum class Network_solanaGetNFT(val value: kotlin.String) {
         @Json(name = "devnet") devnet("devnet"),
         @Json(name = "mainnet-beta") mainnetMinusBeta("mainnet-beta"),
         ;
     }

    /**
    * Get an NFT&#39;s metadata
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-nft/get-nft-metadata\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.       Get the metadata of an NFT.  If you&#39;re looking for metadata such as attributes and others, you can retrieve them from the link in the URI field of the NFT metadata returned. See the example on the right. The URI is an Arweave URL. That contains the attributes and other information about the NFT. That URL is stored on the Solana blockchain.  &#x60;Cost: 0.25 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param network The network ID 
    * @param mintAddress The mint address of the NFT 
    * @return NFT
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun solanaGetNFT(network: Network_solanaGetNFT, mintAddress: kotlin.String) : NFT {
        val localVarResponse = solanaGetNFTWithHttpInfo(network = network, mintAddress = mintAddress)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as NFT
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
    * Get an NFT&#39;s metadata
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-nft/get-nft-metadata\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.       Get the metadata of an NFT.  If you&#39;re looking for metadata such as attributes and others, you can retrieve them from the link in the URI field of the NFT metadata returned. See the example on the right. The URI is an Arweave URL. That contains the attributes and other information about the NFT. That URL is stored on the Solana blockchain.  &#x60;Cost: 0.25 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param network The network ID 
    * @param mintAddress The mint address of the NFT 
    * @return ApiResponse<NFT?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun solanaGetNFTWithHttpInfo(network: Network_solanaGetNFT, mintAddress: kotlin.String) : ApiResponse<NFT?> {
        val localVariableConfig = solanaGetNFTRequestConfig(network = network, mintAddress = mintAddress)

        return request<Unit, NFT>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation solanaGetNFT
    *
    * @param network The network ID 
    * @param mintAddress The mint address of the NFT 
    * @return RequestConfig
    */
    fun solanaGetNFTRequestConfig(network: Network_solanaGetNFT, mintAddress: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/solana/nft/{network}/{mint_address}".replace("{"+"network"+"}", "$network").replace("{"+"mint_address"+"}", "$mintAddress"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Get the NFT mint fee
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-nft/get-nft-mint-fee\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Get the estimated fee for minting an NFT on the Solana blockchain using the Metaplex protocol.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @return NFTMintFee
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun solanaGetNFTMintFee() : NFTMintFee {
        val localVarResponse = solanaGetNFTMintFeeWithHttpInfo()

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as NFTMintFee
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
    * Get the NFT mint fee
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-nft/get-nft-mint-fee\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Get the estimated fee for minting an NFT on the Solana blockchain using the Metaplex protocol.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @return ApiResponse<NFTMintFee?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun solanaGetNFTMintFeeWithHttpInfo() : ApiResponse<NFTMintFee?> {
        val localVariableConfig = solanaGetNFTMintFeeRequestConfig()

        return request<Unit, NFTMintFee>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation solanaGetNFTMintFee
    *
    * @return RequestConfig
    */
    fun solanaGetNFTMintFeeRequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/solana/nft/mint/fee",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter network
     */
     enum class Network_solanaGetNFTOwner(val value: kotlin.String) {
         @Json(name = "devnet") devnet("devnet"),
         @Json(name = "mainnet-beta") mainnetMinusBeta("mainnet-beta"),
         ;
     }

    /**
    * Get owner of an NFT
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-nft/get-nft-owner\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.       Get the owner of an NFT. This returns the public key of the wallet that owns the associated token account that owns the NFT.  If you want to get the associated token account that literally owns the NFT, derive the associated token account address from the public key returned and the NFT mint address using &lt;a href&#x3D;\&quot;#operation/solanaDeriveAssociatedTokenAccountAddress\&quot;&gt;this endpoint&lt;/a&gt;.  &#x60;Cost: 0.25 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param network The network ID 
    * @param mintAddress The mint address of the NFT 
    * @return NFTOwnerResponse
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun solanaGetNFTOwner(network: Network_solanaGetNFTOwner, mintAddress: kotlin.String) : NFTOwnerResponse {
        val localVarResponse = solanaGetNFTOwnerWithHttpInfo(network = network, mintAddress = mintAddress)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as NFTOwnerResponse
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
    * Get owner of an NFT
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-nft/get-nft-owner\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.       Get the owner of an NFT. This returns the public key of the wallet that owns the associated token account that owns the NFT.  If you want to get the associated token account that literally owns the NFT, derive the associated token account address from the public key returned and the NFT mint address using &lt;a href&#x3D;\&quot;#operation/solanaDeriveAssociatedTokenAccountAddress\&quot;&gt;this endpoint&lt;/a&gt;.  &#x60;Cost: 0.25 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param network The network ID 
    * @param mintAddress The mint address of the NFT 
    * @return ApiResponse<NFTOwnerResponse?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun solanaGetNFTOwnerWithHttpInfo(network: Network_solanaGetNFTOwner, mintAddress: kotlin.String) : ApiResponse<NFTOwnerResponse?> {
        val localVariableConfig = solanaGetNFTOwnerRequestConfig(network = network, mintAddress = mintAddress)

        return request<Unit, NFTOwnerResponse>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation solanaGetNFTOwner
    *
    * @param network The network ID 
    * @param mintAddress The mint address of the NFT 
    * @return RequestConfig
    */
    fun solanaGetNFTOwnerRequestConfig(network: Network_solanaGetNFTOwner, mintAddress: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/solana/nft/{network}/{mint_address}/owner".replace("{"+"network"+"}", "$network").replace("{"+"mint_address"+"}", "$mintAddress"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter network
     */
     enum class Network_solanaGetNFTOwnerAdvanced(val value: kotlin.String) {
         @Json(name = "devnet") devnet("devnet"),
         @Json(name = "mainnet-beta") mainnetMinusBeta("mainnet-beta"),
         ;
     }

    /**
    * Get owner of an NFT (advanced)
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-nft/get-nft-owner\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.       Get the owner, state, listed price, and listed marketplace (if any) of an NFT.   Here&#39;s are a couple of example responses: &#x60;&#x60;&#x60; {     &#39;contract&#39;: {         &#39;contract_blockchain_identifier&#39;: &#39;M2mx93ekt1fmXSVkTrUL9xVFHkmME8HTUi5Cyc5aF7K&#39;,          &#39;contract_id&#39;: &#39;magic-eden-v2&#39;,          &#39;contract_name&#39;: &#39;Magic Eden v2&#39;,          &#39;contract_type&#39;: &#39;marketplace&#39;     },      &#39;owner&#39;: &#39;25UJMR3FiMM6noQtPEaCJ6eDU2YQ7myDhikVQXmMuSRW&#39;,      &#39;price&#39;: 50000000,      &#39;state&#39;: &#39;listing&#39; } &#x60;&#x60;&#x60;  &#x60;&#x60;&#x60; {     &#39;contract&#39;: null,      &#39;owner&#39;: &#39;C37PJiJU8WTgoUoFqmB1Maw8hkuENDZoGDQA1pm54Fdd&#39;,      &#39;price&#39;: null,      &#39;state&#39;: &#39;holding&#39; } &#x60;&#x60;&#x60;  This function will return whether the NFT is &#x60;listed&#x60;, &#x60;loaned&#x60; (Yawww NFT loans), &#x60;otc&#x60;, &#x60;staked&#x60;, &#x60;burned&#x60;, or &#x60;held&#x60;.  If listed, it will return the contract, the readable name of the contract (e.g., Magic Eden, OpenSea), the contract ID (if any; e.g., open-sea), the owner, and the listed price. From this, you can get the floor of a collection. We currently support Magic Eden (v1, v2), Exchange.Art (auction, singles), CoralCube, Solanart (v1, v2), Yawww Loans, Yawww OTC, OpenSea, Fractal, SolSea, and AlphaArt.   If loaned, it will return the loan requester as the owner, the loan amount, and the loan contract. We only support the Yawww loaning contract.  If listed on an OTC marketplace, it will return the same information as &#x60;listed&#x60;. OTC is used to distinguish between marketplaces that respect royalties (OTC) and those that don&#39;t (normal ones). The only &#x60;OTC&#x60; contract we track is Yawwww, at the moment. We do not yet track Solanart v3.  If staked, it will return the owner and the staking contract public key.  If burned, it will return the &#x60;burner&#x60; as the &#x60;owner&#x60;.  If held, it will simply return the owner.  If you want to get the literal owner, which may or may not be the same as the owner returned here, call the simplified [get NFT owner function](/#tag/Solana-NFT/operation/solanaGetNFTOwner). For example, Bob might own the NFT, but if it is listed on Magic Eden, then the NFT is held in escrow and \&quot;owned\&quot; by Magic Eden. The simplified function will return Magic Eden as the owner (the literal owner). This advanced function will tell you the implied owner, which would be Bob.  &#x60;Cost: 1.0 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param network The network ID 
    * @param mintAddress The mint address of the NFT 
    * @return NFTOwnerAdvancedResponse
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun solanaGetNFTOwnerAdvanced(network: Network_solanaGetNFTOwnerAdvanced, mintAddress: kotlin.String) : NFTOwnerAdvancedResponse {
        val localVarResponse = solanaGetNFTOwnerAdvancedWithHttpInfo(network = network, mintAddress = mintAddress)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as NFTOwnerAdvancedResponse
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
    * Get owner of an NFT (advanced)
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-nft/get-nft-owner\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.       Get the owner, state, listed price, and listed marketplace (if any) of an NFT.   Here&#39;s are a couple of example responses: &#x60;&#x60;&#x60; {     &#39;contract&#39;: {         &#39;contract_blockchain_identifier&#39;: &#39;M2mx93ekt1fmXSVkTrUL9xVFHkmME8HTUi5Cyc5aF7K&#39;,          &#39;contract_id&#39;: &#39;magic-eden-v2&#39;,          &#39;contract_name&#39;: &#39;Magic Eden v2&#39;,          &#39;contract_type&#39;: &#39;marketplace&#39;     },      &#39;owner&#39;: &#39;25UJMR3FiMM6noQtPEaCJ6eDU2YQ7myDhikVQXmMuSRW&#39;,      &#39;price&#39;: 50000000,      &#39;state&#39;: &#39;listing&#39; } &#x60;&#x60;&#x60;  &#x60;&#x60;&#x60; {     &#39;contract&#39;: null,      &#39;owner&#39;: &#39;C37PJiJU8WTgoUoFqmB1Maw8hkuENDZoGDQA1pm54Fdd&#39;,      &#39;price&#39;: null,      &#39;state&#39;: &#39;holding&#39; } &#x60;&#x60;&#x60;  This function will return whether the NFT is &#x60;listed&#x60;, &#x60;loaned&#x60; (Yawww NFT loans), &#x60;otc&#x60;, &#x60;staked&#x60;, &#x60;burned&#x60;, or &#x60;held&#x60;.  If listed, it will return the contract, the readable name of the contract (e.g., Magic Eden, OpenSea), the contract ID (if any; e.g., open-sea), the owner, and the listed price. From this, you can get the floor of a collection. We currently support Magic Eden (v1, v2), Exchange.Art (auction, singles), CoralCube, Solanart (v1, v2), Yawww Loans, Yawww OTC, OpenSea, Fractal, SolSea, and AlphaArt.   If loaned, it will return the loan requester as the owner, the loan amount, and the loan contract. We only support the Yawww loaning contract.  If listed on an OTC marketplace, it will return the same information as &#x60;listed&#x60;. OTC is used to distinguish between marketplaces that respect royalties (OTC) and those that don&#39;t (normal ones). The only &#x60;OTC&#x60; contract we track is Yawwww, at the moment. We do not yet track Solanart v3.  If staked, it will return the owner and the staking contract public key.  If burned, it will return the &#x60;burner&#x60; as the &#x60;owner&#x60;.  If held, it will simply return the owner.  If you want to get the literal owner, which may or may not be the same as the owner returned here, call the simplified [get NFT owner function](/#tag/Solana-NFT/operation/solanaGetNFTOwner). For example, Bob might own the NFT, but if it is listed on Magic Eden, then the NFT is held in escrow and \&quot;owned\&quot; by Magic Eden. The simplified function will return Magic Eden as the owner (the literal owner). This advanced function will tell you the implied owner, which would be Bob.  &#x60;Cost: 1.0 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param network The network ID 
    * @param mintAddress The mint address of the NFT 
    * @return ApiResponse<NFTOwnerAdvancedResponse?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun solanaGetNFTOwnerAdvancedWithHttpInfo(network: Network_solanaGetNFTOwnerAdvanced, mintAddress: kotlin.String) : ApiResponse<NFTOwnerAdvancedResponse?> {
        val localVariableConfig = solanaGetNFTOwnerAdvancedRequestConfig(network = network, mintAddress = mintAddress)

        return request<Unit, NFTOwnerAdvancedResponse>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation solanaGetNFTOwnerAdvanced
    *
    * @param network The network ID 
    * @param mintAddress The mint address of the NFT 
    * @return RequestConfig
    */
    fun solanaGetNFTOwnerAdvancedRequestConfig(network: Network_solanaGetNFTOwnerAdvanced, mintAddress: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/solana/nft/{network}/{mint_address}/owner_advanced".replace("{"+"network"+"}", "$network").replace("{"+"mint_address"+"}", "$mintAddress"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Get the ID of the candy machine of an NFT 
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-nft/get-nft-candy-machine-id\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Get the candy machine ID from where the NFT came, if any. NFTs can also be minted without a candy machine.  It&#39;s also possible that we return \&quot;Not Found\&quot; when the NFT actually did come from a version of a candy machine. We check for the most popular versions of candy machine, but it is possible that someone creates their own candy machine version and mints NFTs from it.  &#x60;Cost: 1 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param getCandyMachineIDRequest  (optional)
    * @return GetCandyMachineIDResponse
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun solanaGetNFTsCandyMachineId(getCandyMachineIDRequest: GetCandyMachineIDRequest?) : GetCandyMachineIDResponse {
        val localVarResponse = solanaGetNFTsCandyMachineIdWithHttpInfo(getCandyMachineIDRequest = getCandyMachineIDRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetCandyMachineIDResponse
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
    * Get the ID of the candy machine of an NFT 
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-nft/get-nft-candy-machine-id\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Get the candy machine ID from where the NFT came, if any. NFTs can also be minted without a candy machine.  It&#39;s also possible that we return \&quot;Not Found\&quot; when the NFT actually did come from a version of a candy machine. We check for the most popular versions of candy machine, but it is possible that someone creates their own candy machine version and mints NFTs from it.  &#x60;Cost: 1 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param getCandyMachineIDRequest  (optional)
    * @return ApiResponse<GetCandyMachineIDResponse?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun solanaGetNFTsCandyMachineIdWithHttpInfo(getCandyMachineIDRequest: GetCandyMachineIDRequest?) : ApiResponse<GetCandyMachineIDResponse?> {
        val localVariableConfig = solanaGetNFTsCandyMachineIdRequestConfig(getCandyMachineIDRequest = getCandyMachineIDRequest)

        return request<GetCandyMachineIDRequest, GetCandyMachineIDResponse>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation solanaGetNFTsCandyMachineId
    *
    * @param getCandyMachineIDRequest  (optional)
    * @return RequestConfig
    */
    fun solanaGetNFTsCandyMachineIdRequestConfig(getCandyMachineIDRequest: GetCandyMachineIDRequest?) : RequestConfig<GetCandyMachineIDRequest> {
        val localVariableBody = getCandyMachineIDRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/solana/nft/candy_machine_id",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Search NFTs on Solana
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-nft/search-nfts\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  With this endpoint, you can search for NFTs by their symbol, name of NFTs, uuid, configuration address, and update authority.  The output is a list of NFTs that match your query.  You can also provide multiple search clauses, such as the update authority (&#x60;update_authority&#x3D;\&quot;G17UmNGnMJ851x3M1JXocgpft1afcYedjPuFpo1ohhCk\&quot;&#x60;) and symbol begins with \&quot;Sol\&quot; (&#x60;symbol&#x3D;\&quot;Sol\&quot;, symbol_search_method&#x3D;&#39;begins_with&#39;&#x60;).  &#x60;Cost: 1 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param nfTSearchRequest  (optional)
    * @return kotlin.collections.List<NFTSearchResponse>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun solanaSearchNFTs(nfTSearchRequest: NFTSearchRequest?) : kotlin.collections.List<NFTSearchResponse> {
        val localVarResponse = solanaSearchNFTsWithHttpInfo(nfTSearchRequest = nfTSearchRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<NFTSearchResponse>
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
    * Search NFTs on Solana
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-nft/search-nfts\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  With this endpoint, you can search for NFTs by their symbol, name of NFTs, uuid, configuration address, and update authority.  The output is a list of NFTs that match your query.  You can also provide multiple search clauses, such as the update authority (&#x60;update_authority&#x3D;\&quot;G17UmNGnMJ851x3M1JXocgpft1afcYedjPuFpo1ohhCk\&quot;&#x60;) and symbol begins with \&quot;Sol\&quot; (&#x60;symbol&#x3D;\&quot;Sol\&quot;, symbol_search_method&#x3D;&#39;begins_with&#39;&#x60;).  &#x60;Cost: 1 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param nfTSearchRequest  (optional)
    * @return ApiResponse<kotlin.collections.List<NFTSearchResponse>?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun solanaSearchNFTsWithHttpInfo(nfTSearchRequest: NFTSearchRequest?) : ApiResponse<kotlin.collections.List<NFTSearchResponse>?> {
        val localVariableConfig = solanaSearchNFTsRequestConfig(nfTSearchRequest = nfTSearchRequest)

        return request<NFTSearchRequest, kotlin.collections.List<NFTSearchResponse>>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation solanaSearchNFTs
    *
    * @param nfTSearchRequest  (optional)
    * @return RequestConfig
    */
    fun solanaSearchNFTsRequestConfig(nfTSearchRequest: NFTSearchRequest?) : RequestConfig<NFTSearchRequest> {
        val localVariableBody = nfTSearchRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/solana/nft/search",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
