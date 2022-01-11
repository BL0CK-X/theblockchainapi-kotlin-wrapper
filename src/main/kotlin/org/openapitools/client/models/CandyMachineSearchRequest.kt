/**
 * The Blockchain API
 *
 * # About  Our vision is to make it super easy to interact with the decentralized web. We want you to be able to do this in any coding language and do it easily and quickly.   You're a key part of our vision. We love feature requests! <a href=\"#section/Feature-Requests\">Make one!</a>  # How to Use the API  To use the API, you simply need to create an API key pair.  Doing so takes less than a minute. Simply go to <a target=\"_blank\" href=\"https://dashboard.blockchainapi.com\">the dashboard</a>, create an account, and generate a key pair. You can now use this pair to make API requests. You must create your first pair via the dashboard.  # Feature Requests  Got a feature request? Submit it as an issue on <a target=\"_blank\" href=\"https://github.com/BL0CK-X/the-blockchain-api/issues/new/choose\">our GitHub repo</a> or [email us](mailto:info@blockchainapi.com).  # Contact  <figure>     <img          width=\"40px\"         height=\"40px\"          src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/phone.svg\"     />     <figcaption style=\"textAlign:center;\">Text / Call: +1 (415) 888 4745 </figcaption> </figure> <a href=\"mailto:info@blockchainapi.com\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/email.svg\"         />         <figcaption style=\"textAlign:center;\">Email us: info@theblockchainapi.com</figcaption>     </figure> </a> <a href=\"https://discord.gg/d49yzrZRAF\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/discord.svg\"         />         <figcaption style=\"textAlign:center;\">Join our Discord</figcaption>     </figure> </a> <a href=\"https://twitter.com/_BlockX_\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/twitter.svg\"         />          <figcaption style=\"textAlign:center;\">Follow us on Twitter</figcaption>     </figure> </a> <a href=\"https://github.com/BL0CK-X/the-blockchain-api\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/github.svg\"         />         <figcaption style=\"textAlign:center;\">Star us on Github</figcaption>     </figure> </a>  # Security  Common dogma is to never give out your seed phrase. We agree. It's a matter of security, and anyone who has your seed phrase can irreversibly empty your wallet.   <b>When using an API endpoint that requires a seed phrase, we highly recommend that users use or create a wallet that they do not use as their primary wallet.</b>   How you make this work depends on what you're doing. If you're minting an NFT for example, we recommend creating a new wallet and then transferring just enough SOL to that wallet to mint the NFT. This is possible on Solana because such transactions cost less than a penny. We will have more tutorials in the future that make it easier for you to be secure when using our API.  We have easy-to-use endpoints for <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1secret_recovery_phrase/post\">creating a new seed phrase</a> and then <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1public_key/post\">deriving a public key</a> to enable you to transfer to that new wallet.  Let's have a constructive dialog about this. Feel free to <a href=\"#section/Contact\">contact us</a>. I made a video discussing this matter <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.  Note: We have had a couple of individuals harrass and threaten us. These individuals did <b>not</b> try our API or speak to anyone who has used it. They simply saw that we require a seed phrase for certain endpoints and figured that the proper response was to attack us. (I explain why we do <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.) Such harrassment and threats are not only harmful, but they are also illegal, and we will report offenders. Do not harrass us. Rather, feel free to discuss your concerns with us and we will be more than happy to work with you to come up with a solution.  # Pricing  <b>Each user receives 500 free credits.</b>  You can learn more about our pricing <a href=\"https://dashboard.blockchainapi.com/billing\" target=\"_blank\">here</a>.   We frequently do custom plans. If our pricing doesn't work for you, <a href=\"#section/Contact\">contact us</a>.  If you have questions, concerns, feedback, or ideas, <a href=\"#section/Contact\">contact us</a>.  # SDKs / API Wrappers  We have examples using both our <a href=\"https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples\" target=\"_blank\">Python wrapper and our JavaScript wrapper here</a>.  We have built a custom <a href=\"https://github.com/BL0CK-X/the-blockchain-api-python-wrapper\" target=\"_blank\">Python wrapper</a>.  `pip install theblockchainapi`  We also have published a <a href=\"https://github.com/BL0CK-X/theblockchainapi-javascript-wrapper\" target=\"_blank\">JavaScript Wrapper</a>.  `npm install theblockchainapi`  We also have auto-generated wrappers for the following languages: - <a href=\"https://github.com/BL0CK-X/theblockchainapi-go-wrapper\" target = \"_blank\">Go</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-java-wrapper\" target = \"_blank\">Java</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-kotlin-wrapper\" target = \"_blank\">Kotlin</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-php-wrapper\" target = \"_blank\">PHP</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-swift-wrapper\" target = \"_blank\">Swift5</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-typescript-wrapper\" target = \"_blank\">TypeScript</a>  If you would like a different language as well, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.  If you run into any bugs with the wrappers, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.
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

package org.openapitools.client.models


import com.squareup.moshi.Json

/**
 * 
 *
 * @param updateAuthority The public key of the update authority of the candy machine
 * @param updateAuthoritySearchMethod Only `exact_match` supported at this time
 * @param configAddress The public key of the configuration of the candy machine
 * @param configAddressSearchMethod Only `exact_match` supported at this time
 * @param uuid The alphanumeric string of length six that corresponds to the candy machine. This is NOT the candy machine ID.  This is the first six letters of the configuration address and is also used to identify the candy machine. An example is `4zKV6i`. 
 * @param uuidSearchMethod Only `exact_match` supported at this time
 * @param symbol The symbol associated with the candy machine
 * @param symbolSearchMethod 
 * @param nftName The name of an NFT on the candy machine, minted or unminted. For example, to find The Solana Money Boys candy machine, you already know that each NFT is named \"Solana Money Boy #0\", \"Solana Money Boy #1\", and so on. So you could search with  nft_name=\"Solana Money Boy #0\", nft_name_index=0, nft_name_search_method='exact_match', for example, which would return the candy machine ID. This also works with candy machines that are not live but are uploaded. 
 * @param nftNameIndex The index of the NFT to check, e.g., the 2nd NFT would have an index of 1. We cannot search all NFTs on a candy machine currently, so you must search an NFT at a particular position, such as the first, second, and so on. In general, nft_name_index=0 works for most use cases. 
 * @param nftNameSearchMethod 
 * @param network 
 * @param candyMachineContractVersion The candy machine contract you want to search.  If you want to search `v1` candy machines, set this to `v1`. If you want to search `v2` candy machines. set this to `v2`. 
 */

data class CandyMachineSearchRequest (

    /* The public key of the update authority of the candy machine */
    @Json(name = "update_authority")
    val updateAuthority: kotlin.String? = null,

    /* Only `exact_match` supported at this time */
    @Json(name = "update_authority_search_method")
    val updateAuthoritySearchMethod: CandyMachineSearchRequest.UpdateAuthoritySearchMethod? = UpdateAuthoritySearchMethod.exactMatch,

    /* The public key of the configuration of the candy machine */
    @Json(name = "config_address")
    val configAddress: kotlin.String? = null,

    /* Only `exact_match` supported at this time */
    @Json(name = "config_address_search_method")
    val configAddressSearchMethod: CandyMachineSearchRequest.ConfigAddressSearchMethod? = ConfigAddressSearchMethod.exactMatch,

    /* The alphanumeric string of length six that corresponds to the candy machine. This is NOT the candy machine ID.  This is the first six letters of the configuration address and is also used to identify the candy machine. An example is `4zKV6i`.  */
    @Json(name = "uuid")
    val uuid: kotlin.String? = null,

    /* Only `exact_match` supported at this time */
    @Json(name = "uuid_search_method")
    val uuidSearchMethod: CandyMachineSearchRequest.UuidSearchMethod? = UuidSearchMethod.exactMatch,

    /* The symbol associated with the candy machine */
    @Json(name = "symbol")
    val symbol: kotlin.String? = null,

    @Json(name = "symbol_search_method")
    val symbolSearchMethod: CandyMachineSearchRequest.SymbolSearchMethod? = SymbolSearchMethod.exactMatch,

    /* The name of an NFT on the candy machine, minted or unminted. For example, to find The Solana Money Boys candy machine, you already know that each NFT is named \"Solana Money Boy #0\", \"Solana Money Boy #1\", and so on. So you could search with  nft_name=\"Solana Money Boy #0\", nft_name_index=0, nft_name_search_method='exact_match', for example, which would return the candy machine ID. This also works with candy machines that are not live but are uploaded.  */
    @Json(name = "nft_name")
    val nftName: kotlin.String? = null,

    /* The index of the NFT to check, e.g., the 2nd NFT would have an index of 1. We cannot search all NFTs on a candy machine currently, so you must search an NFT at a particular position, such as the first, second, and so on. In general, nft_name_index=0 works for most use cases.  */
    @Json(name = "nft_name_index")
    val nftNameIndex: kotlin.String? = "0",

    @Json(name = "nft_name_search_method")
    val nftNameSearchMethod: CandyMachineSearchRequest.NftNameSearchMethod? = NftNameSearchMethod.exactMatch,

    @Json(name = "network")
    val network: CandyMachineSearchRequest.Network? = Network.devnet,

    /* The candy machine contract you want to search.  If you want to search `v1` candy machines, set this to `v1`. If you want to search `v2` candy machines. set this to `v2`.  */
    @Json(name = "candy_machine_contract_version")
    val candyMachineContractVersion: CandyMachineSearchRequest.CandyMachineContractVersion? = CandyMachineContractVersion.v1

) {

    /**
     * Only `exact_match` supported at this time
     *
     * Values: exactMatch
     */
    enum class UpdateAuthoritySearchMethod(val value: kotlin.String) {
        @Json(name = "exact_match") exactMatch("exact_match");
    }
    /**
     * Only `exact_match` supported at this time
     *
     * Values: exactMatch
     */
    enum class ConfigAddressSearchMethod(val value: kotlin.String) {
        @Json(name = "exact_match") exactMatch("exact_match");
    }
    /**
     * Only `exact_match` supported at this time
     *
     * Values: exactMatch
     */
    enum class UuidSearchMethod(val value: kotlin.String) {
        @Json(name = "exact_match") exactMatch("exact_match");
    }
    /**
     * 
     *
     * Values: beginsWith,exactMatch
     */
    enum class SymbolSearchMethod(val value: kotlin.String) {
        @Json(name = "begins_with") beginsWith("begins_with"),
        @Json(name = "exact_match") exactMatch("exact_match");
    }
    /**
     * 
     *
     * Values: beginsWith,exactMatch
     */
    enum class NftNameSearchMethod(val value: kotlin.String) {
        @Json(name = "begins_with") beginsWith("begins_with"),
        @Json(name = "exact_match") exactMatch("exact_match");
    }
    /**
     * 
     *
     * Values: devnet,mainnetMinusBeta
     */
    enum class Network(val value: kotlin.String) {
        @Json(name = "devnet") devnet("devnet"),
        @Json(name = "mainnet-beta") mainnetMinusBeta("mainnet-beta");
    }
    /**
     * The candy machine contract you want to search.  If you want to search `v1` candy machines, set this to `v1`. If you want to search `v2` candy machines. set this to `v2`. 
     *
     * Values: v1,v2
     */
    enum class CandyMachineContractVersion(val value: kotlin.String) {
        @Json(name = "v1") v1("v1"),
        @Json(name = "v2") v2("v2");
    }
}

