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

import org.openapitools.client.models.CandyMachineSearchRequest
import org.openapitools.client.models.GetAllNFTsResponse
import org.openapitools.client.models.GetCandyMetadataErrorResponse
import org.openapitools.client.models.GetCandyMetadataRequest
import org.openapitools.client.models.GetCandyMetadataResponse

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

class SolanaCandyMachineApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://api.blockchainapi.com/v1")
        }
    }

    /**
     * enum for parameter network
     */
     enum class Network_solanaGetAllNFTsFromCandyMachine(val value: kotlin.String) {
         @Json(name = "devnet") devnet("devnet"),
         @Json(name = "mainnet-beta") mainnetMinusBeta("mainnet-beta"),
         ;
     }

    /**
    * Get CM&#39;s NFTs  
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-candy-machine/get-candy-machine-all-nfts\&quot; target&#x3D;\&quot;_blank\&quot;&gt; See examples (Python, JavaScript)&lt;/a&gt;.  Use this endpoint to get the list of all NFTs (minted and unminted) from a Solana Candy Machine.  This works for &#x60;v1&#x60; and &#x60;v2&#x60; candy machines.   *However*, for &#x60;v2&#x60; only the value for &#x60;all_nfts&#x60; is provided. To determine which are minted and unminted follow this example.  You do not need to specify &#x60;v1&#x60; or &#x60;v2&#x60; for this endpoint as it will automatically determine it from the candy machine ID.  See example for how to get the list of NFT hashes &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-candy-machine/get-candy-machine-hash-table\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.    &#x60;Cost: 2 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param network The network ID 
    * @param candyMachineId The ID of the candy machine 
    * @return GetAllNFTsResponse
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun solanaGetAllNFTsFromCandyMachine(network: Network_solanaGetAllNFTsFromCandyMachine, candyMachineId: kotlin.String) : GetAllNFTsResponse {
        val localVarResponse = solanaGetAllNFTsFromCandyMachineWithHttpInfo(network = network, candyMachineId = candyMachineId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetAllNFTsResponse
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
    * Get CM&#39;s NFTs  
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-candy-machine/get-candy-machine-all-nfts\&quot; target&#x3D;\&quot;_blank\&quot;&gt; See examples (Python, JavaScript)&lt;/a&gt;.  Use this endpoint to get the list of all NFTs (minted and unminted) from a Solana Candy Machine.  This works for &#x60;v1&#x60; and &#x60;v2&#x60; candy machines.   *However*, for &#x60;v2&#x60; only the value for &#x60;all_nfts&#x60; is provided. To determine which are minted and unminted follow this example.  You do not need to specify &#x60;v1&#x60; or &#x60;v2&#x60; for this endpoint as it will automatically determine it from the candy machine ID.  See example for how to get the list of NFT hashes &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-candy-machine/get-candy-machine-hash-table\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.    &#x60;Cost: 2 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param network The network ID 
    * @param candyMachineId The ID of the candy machine 
    * @return ApiResponse<GetAllNFTsResponse?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun solanaGetAllNFTsFromCandyMachineWithHttpInfo(network: Network_solanaGetAllNFTsFromCandyMachine, candyMachineId: kotlin.String) : ApiResponse<GetAllNFTsResponse?> {
        val localVariableConfig = solanaGetAllNFTsFromCandyMachineRequestConfig(network = network, candyMachineId = candyMachineId)

        return request<Unit, GetAllNFTsResponse>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation solanaGetAllNFTsFromCandyMachine
    *
    * @param network The network ID 
    * @param candyMachineId The ID of the candy machine 
    * @return RequestConfig
    */
    fun solanaGetAllNFTsFromCandyMachineRequestConfig(network: Network_solanaGetAllNFTsFromCandyMachine, candyMachineId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/solana/nft/candy_machine/{network}/{candy_machine_id}/nfts".replace("{"+"network"+"}", "$network").replace("{"+"candy_machine_id"+"}", "$candyMachineId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Get a CM&#39;s metadata 
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-candy-machine/get-candy-machine-metadata\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Use this endpoint to get metadata about a Metaplex candy machine. This includes the goLiveDate, itemsAvailable, and itemsRedeemed. To see what is included, expand the green successful response below.  NOTE: Supply exactly one of &#x60;candy_machine_id&#x60;, &#x60;config_address&#x60;, or &#x60;uuid&#x60;. If you provide more than one, you will receive a &#x60;400&#x60; error.   &#x60;Cost: 2 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param getCandyMetadataRequest  (optional)
    * @return GetCandyMetadataResponse
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun solanaGetCandyMachineMetadata(getCandyMetadataRequest: GetCandyMetadataRequest?) : GetCandyMetadataResponse {
        val localVarResponse = solanaGetCandyMachineMetadataWithHttpInfo(getCandyMetadataRequest = getCandyMetadataRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetCandyMetadataResponse
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
    * Get a CM&#39;s metadata 
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-candy-machine/get-candy-machine-metadata\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Use this endpoint to get metadata about a Metaplex candy machine. This includes the goLiveDate, itemsAvailable, and itemsRedeemed. To see what is included, expand the green successful response below.  NOTE: Supply exactly one of &#x60;candy_machine_id&#x60;, &#x60;config_address&#x60;, or &#x60;uuid&#x60;. If you provide more than one, you will receive a &#x60;400&#x60; error.   &#x60;Cost: 2 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param getCandyMetadataRequest  (optional)
    * @return ApiResponse<GetCandyMetadataResponse?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun solanaGetCandyMachineMetadataWithHttpInfo(getCandyMetadataRequest: GetCandyMetadataRequest?) : ApiResponse<GetCandyMetadataResponse?> {
        val localVariableConfig = solanaGetCandyMachineMetadataRequestConfig(getCandyMetadataRequest = getCandyMetadataRequest)

        return request<GetCandyMetadataRequest, GetCandyMetadataResponse>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation solanaGetCandyMachineMetadata
    *
    * @param getCandyMetadataRequest  (optional)
    * @return RequestConfig
    */
    fun solanaGetCandyMachineMetadataRequestConfig(getCandyMetadataRequest: GetCandyMetadataRequest?) : RequestConfig<GetCandyMetadataRequest> {
        val localVariableBody = getCandyMetadataRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/solana/nft/candy_machine/metadata",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * List all CMs
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-candy-machine/list-all-candy-machines\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  With this endpoint, you can list all candy machines published to Solana mainnet.  We update this data every 15 minutes.  The output is a list of config addresses, currently about 17000 in length.  &#x60;Cost: 2 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @return kotlin.Any
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun solanaListAllCandyMachines() : kotlin.Any {
        val localVarResponse = solanaListAllCandyMachinesWithHttpInfo()

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
    * List all CMs
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-candy-machine/list-all-candy-machines\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  With this endpoint, you can list all candy machines published to Solana mainnet.  We update this data every 15 minutes.  The output is a list of config addresses, currently about 17000 in length.  &#x60;Cost: 2 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @return ApiResponse<kotlin.Any?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun solanaListAllCandyMachinesWithHttpInfo() : ApiResponse<kotlin.Any?> {
        val localVariableConfig = solanaListAllCandyMachinesRequestConfig()

        return request<Unit, kotlin.Any>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation solanaListAllCandyMachines
    *
    * @return RequestConfig
    */
    fun solanaListAllCandyMachinesRequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/solana/nft/candy_machine/list",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Search CMs
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-candy-machine/search-candy-machines\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  With this endpoint, you can search candy machines by their symbol, name of NFTs, uuid, configuration address, and update authority.  The output is a list of config addresses.  You can also provide multiple search clauses, such as the update authority (&#x60;update_authority&#x3D;\&quot;G17UmNGnMJ851x3M1JXocgpft1afcYedjPuFpo1ohhCk\&quot;&#x60;) and symbol begins with \&quot;Sol\&quot; (&#x60;symbol&#x3D;\&quot;Sol\&quot;, symbol_search_method&#x3D;&#39;begins_with&#39;&#x60;).  &#x60;Cost: 2 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param candyMachineSearchRequest  (optional)
    * @return kotlin.collections.List<kotlin.String>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun solanaSearchCandyMachines(candyMachineSearchRequest: CandyMachineSearchRequest?) : kotlin.collections.List<kotlin.String> {
        val localVarResponse = solanaSearchCandyMachinesWithHttpInfo(candyMachineSearchRequest = candyMachineSearchRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<kotlin.String>
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
    * Search CMs
    * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-candy-machine/search-candy-machines\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  With this endpoint, you can search candy machines by their symbol, name of NFTs, uuid, configuration address, and update authority.  The output is a list of config addresses.  You can also provide multiple search clauses, such as the update authority (&#x60;update_authority&#x3D;\&quot;G17UmNGnMJ851x3M1JXocgpft1afcYedjPuFpo1ohhCk\&quot;&#x60;) and symbol begins with \&quot;Sol\&quot; (&#x60;symbol&#x3D;\&quot;Sol\&quot;, symbol_search_method&#x3D;&#39;begins_with&#39;&#x60;).  &#x60;Cost: 2 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
    * @param candyMachineSearchRequest  (optional)
    * @return ApiResponse<kotlin.collections.List<kotlin.String>?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun solanaSearchCandyMachinesWithHttpInfo(candyMachineSearchRequest: CandyMachineSearchRequest?) : ApiResponse<kotlin.collections.List<kotlin.String>?> {
        val localVariableConfig = solanaSearchCandyMachinesRequestConfig(candyMachineSearchRequest = candyMachineSearchRequest)

        return request<CandyMachineSearchRequest, kotlin.collections.List<kotlin.String>>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation solanaSearchCandyMachines
    *
    * @param candyMachineSearchRequest  (optional)
    * @return RequestConfig
    */
    fun solanaSearchCandyMachinesRequestConfig(candyMachineSearchRequest: CandyMachineSearchRequest?) : RequestConfig<CandyMachineSearchRequest> {
        val localVariableBody = candyMachineSearchRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/solana/nft/candy_machine/search",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
