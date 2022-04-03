# org.openapitools.client - Kotlin client library for The Blockchain API

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.blockchainapi.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EndpointApi* | [**deleteEndpoint**](docs/EndpointApi.md#deleteendpoint) | **POST** /endpoint/delete | Delete an endpoint 
*EndpointApi* | [**getEndpoint**](docs/EndpointApi.md#getendpoint) | **POST** /endpoint/metadata | Get an endpoint's metadata 
*EndpointApi* | [**listEndpoints**](docs/EndpointApi.md#listendpoints) | **GET** /endpoint/list | List all endpoints 
*EndpointApi* | [**setEndpoint**](docs/EndpointApi.md#setendpoint) | **POST** /endpoint | Create / update an endpoint 
*FileApi* | [**uploadFile**](docs/FileApi.md#uploadfile) | **POST** /file | Upload a file
*ProjectApi* | [**createProject**](docs/ProjectApi.md#createproject) | **POST** /project | Create a project 
*ProjectApi* | [**createProjectVersion**](docs/ProjectApi.md#createprojectversion) | **POST** /project/{project_id}/{version} | Create a new project version 
*ProjectApi* | [**deleteProject**](docs/ProjectApi.md#deleteproject) | **DELETE** /project/{project_id} | Delete a project 
*ProjectApi* | [**deleteProjectVersion**](docs/ProjectApi.md#deleteprojectversion) | **DELETE** /project/{project_id}/{version} | Delete a project version 
*ProjectApi* | [**getProject**](docs/ProjectApi.md#getproject) | **GET** /project/{project_id} | Get a project's metadata 
*ProjectApi* | [**getProjectDeploymentStatus**](docs/ProjectApi.md#getprojectdeploymentstatus) | **POST** /project/{project_id}/deploy/status | Get deployment status 
*ProjectApi* | [**getProjectDeploymentURL**](docs/ProjectApi.md#getprojectdeploymenturl) | **POST** /project/{project_id}/deploy/url | Get the deployment URL 
*ProjectApi* | [**getProjectStats**](docs/ProjectApi.md#getprojectstats) | **GET** /project/{project_id}/stats | Get a project's stats 
*ProjectApi* | [**listProjects**](docs/ProjectApi.md#listprojects) | **GET** /project/list | List projects 
*ProjectApi* | [**updateProject**](docs/ProjectApi.md#updateproject) | **POST** /project/{project_id} | Update a project 
*ProjectApi* | [**updateProjectDocumentation**](docs/ProjectApi.md#updateprojectdocumentation) | **POST** /project/{project_id}/{version}/documentation | Update the project's documentation 
*SolanaAccountApi* | [**solanaGetAccount**](docs/SolanaAccountApi.md#solanagetaccount) | **GET** /solana/account/{network}/{public_key} | Get the details of an account on Solana
*SolanaAccountApi* | [**solanaGetAccountIsCandyMachine**](docs/SolanaAccountApi.md#solanagetaccountiscandymachine) | **GET** /solana/account/{network}/{public_key}/is_candy_machine | Get if account is candy machine
*SolanaAccountApi* | [**solanaGetAccountIsNFT**](docs/SolanaAccountApi.md#solanagetaccountisnft) | **GET** /solana/account/{network}/{public_key}/is_nft | Get if account is NFT
*SolanaCandyMachineApi* | [**solanaCreateTestCandyMachine**](docs/SolanaCandyMachineApi.md#solanacreatetestcandymachine) | **POST** /solana/nft/candy_machine | Create a test CM
*SolanaCandyMachineApi* | [**solanaGetAllNFTsFromCandyMachine**](docs/SolanaCandyMachineApi.md#solanagetallnftsfromcandymachine) | **GET** /solana/nft/candy_machine/{network}/{candy_machine_id}/nfts | Get CM's NFTs  
*SolanaCandyMachineApi* | [**solanaGetCandyMachineMetadata**](docs/SolanaCandyMachineApi.md#solanagetcandymachinemetadata) | **POST** /solana/nft/candy_machine/metadata | Get a CM's metadata 
*SolanaCandyMachineApi* | [**solanaListAllCandyMachines**](docs/SolanaCandyMachineApi.md#solanalistallcandymachines) | **GET** /solana/nft/candy_machine/list | List all CMs
*SolanaCandyMachineApi* | [**solanaMintFromCandyMachine**](docs/SolanaCandyMachineApi.md#solanamintfromcandymachine) | **POST** /solana/nft/candy_machine/mint | Mint from a CM
*SolanaCandyMachineApi* | [**solanaSearchCandyMachines**](docs/SolanaCandyMachineApi.md#solanasearchcandymachines) | **POST** /solana/nft/candy_machine/search | Search CMs
*SolanaNFTApi* | [**solanaCreateNFT**](docs/SolanaNFTApi.md#solanacreatenft) | **POST** /solana/nft | Create an NFT on Solana
*SolanaNFTApi* | [**solanaGetNFT**](docs/SolanaNFTApi.md#solanagetnft) | **GET** /solana/nft/{network}/{mint_address} | Get an NFT's metadata
*SolanaNFTApi* | [**solanaGetNFTMintFee**](docs/SolanaNFTApi.md#solanagetnftmintfee) | **GET** /solana/nft/mint/fee | Get the NFT mint fee
*SolanaNFTApi* | [**solanaGetNFTOwner**](docs/SolanaNFTApi.md#solanagetnftowner) | **GET** /solana/nft/{network}/{mint_address}/owner | Get owner of an NFT
*SolanaNFTApi* | [**solanaGetNFTsCandyMachineId**](docs/SolanaNFTApi.md#solanagetnftscandymachineid) | **POST** /solana/nft/candy_machine_id | Get the ID of the candy machine of an NFT 
*SolanaNFTApi* | [**solanaSearchNFTs**](docs/SolanaNFTApi.md#solanasearchnfts) | **POST** /solana/nft/search | Search NFTs on Solana
*SolanaNFTMarketplacesApi* | [**solanaBuyNFT**](docs/SolanaNFTMarketplacesApi.md#solanabuynft) | **POST** /solana/nft/marketplaces/{exchange}/buy/{network}/{mint_address} | Buy
*SolanaNFTMarketplacesApi* | [**solanaDelistNFT**](docs/SolanaNFTMarketplacesApi.md#solanadelistnft) | **POST** /solana/nft/marketplaces/{exchange}/delist/{network}/{mint_address} | Delist
*SolanaNFTMarketplacesApi* | [**solanaGetNFTListing**](docs/SolanaNFTMarketplacesApi.md#solanagetnftlisting) | **GET** /solana/nft/marketplaces/listing/{network}/{mint_address} | Get NFT Listing
*SolanaNFTMarketplacesApi* | [**solanaGetNFTMarketplaceAnalytics**](docs/SolanaNFTMarketplacesApi.md#solanagetnftmarketplaceanalytics) | **POST** /solana/nft/marketplaces/analytics | Get NFT Analytics
*SolanaNFTMarketplacesApi* | [**solanaGetNFTMarketplaceMarketShare**](docs/SolanaNFTMarketplacesApi.md#solanagetnftmarketplacemarketshare) | **GET** /solana/nft/marketplaces/analytics/market_share | Get Marketplace Market Share
*SolanaNFTMarketplacesApi* | [**solanaGetNFTMarketplaceRecentTransactions**](docs/SolanaNFTMarketplacesApi.md#solanagetnftmarketplacerecenttransactions) | **GET** /solana/nft/marketplaces/analytics/recent_transactions | Get Recent NFT Transactions
*SolanaNFTMarketplacesApi* | [**solanaListNFT**](docs/SolanaNFTMarketplacesApi.md#solanalistnft) | **POST** /solana/nft/marketplaces/{exchange}/list/{network}/{mint_address} | List
*SolanaSPLTokenApi* | [**solanaGetSPLToken**](docs/SolanaSPLTokenApi.md#solanagetspltoken) | **GET** /solana/spl-token/{network}/{public_key} | Get SPL token metadata
*SolanaTransactionApi* | [**solanaGetTransaction**](docs/SolanaTransactionApi.md#solanagettransaction) | **GET** /solana/transaction/{network}/{tx_signature} | Get the details of a transaction made on Solana
*SolanaWalletApi* | [**solanaDeriveAssociatedTokenAccountAddress**](docs/SolanaWalletApi.md#solanaderiveassociatedtokenaccountaddress) | **GET** /solana/wallet/{public_key}/associated_token_account/{mint_address} | Derive an associated token account address
*SolanaWalletApi* | [**solanaDerivePrivateKey**](docs/SolanaWalletApi.md#solanaderiveprivatekey) | **POST** /solana/wallet/private_key | Derive private key
*SolanaWalletApi* | [**solanaDerivePublicKey**](docs/SolanaWalletApi.md#solanaderivepublickey) | **POST** /solana/wallet/public_key | Derive public key
*SolanaWalletApi* | [**solanaGeneratePrivateKey**](docs/SolanaWalletApi.md#solanagenerateprivatekey) | **POST** /solana/wallet/generate/private_key | Generate private key
*SolanaWalletApi* | [**solanaGenerateSecretRecoveryPhrase**](docs/SolanaWalletApi.md#solanageneratesecretrecoveryphrase) | **POST** /solana/wallet/generate/secret_recovery_phrase | Generate secret phrase
*SolanaWalletApi* | [**solanaGetAirdrop**](docs/SolanaWalletApi.md#solanagetairdrop) | **POST** /solana/wallet/airdrop | Get an airdrop on devnet
*SolanaWalletApi* | [**solanaGetBalance**](docs/SolanaWalletApi.md#solanagetbalance) | **POST** /solana/wallet/balance | Get wallet's balance in SOL or any SPL
*SolanaWalletApi* | [**solanaGetNFTsBelongingToWallet**](docs/SolanaWalletApi.md#solanagetnftsbelongingtowallet) | **GET** /solana/wallet/{network}/{public_key}/nfts | Get address's NFTs
*SolanaWalletApi* | [**solanaGetTokensBelongingToWallet**](docs/SolanaWalletApi.md#solanagettokensbelongingtowallet) | **GET** /solana/wallet/{network}/{public_key}/tokens | Get address's tokens and respective balances
*SolanaWalletApi* | [**solanaGetWalletTransactions**](docs/SolanaWalletApi.md#solanagetwallettransactions) | **GET** /solana/wallet/{network}/{public_key}/transactions | Get address's associated transaction signatures
*SolanaWalletApi* | [**solanaTransfer**](docs/SolanaWalletApi.md#solanatransfer) | **POST** /solana/wallet/transfer | Transfer SOL, a token, or an NFT to another address


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.ATAResponse](docs/ATAResponse.md)
 - [org.openapitools.client.models.Account](docs/Account.md)
 - [org.openapitools.client.models.AccountContext](docs/AccountContext.md)
 - [org.openapitools.client.models.AccountIsCandyMachine](docs/AccountIsCandyMachine.md)
 - [org.openapitools.client.models.AccountIsNFT](docs/AccountIsNFT.md)
 - [org.openapitools.client.models.AccountValue](docs/AccountValue.md)
 - [org.openapitools.client.models.AirdropRequest](docs/AirdropRequest.md)
 - [org.openapitools.client.models.B58PrivateKey](docs/B58PrivateKey.md)
 - [org.openapitools.client.models.BalanceRequest](docs/BalanceRequest.md)
 - [org.openapitools.client.models.BalanceResponse](docs/BalanceResponse.md)
 - [org.openapitools.client.models.BuyRequest](docs/BuyRequest.md)
 - [org.openapitools.client.models.BuyResponse](docs/BuyResponse.md)
 - [org.openapitools.client.models.CandyMachineSearchRequest](docs/CandyMachineSearchRequest.md)
 - [org.openapitools.client.models.CreateTestCandyMachineRequest](docs/CreateTestCandyMachineRequest.md)
 - [org.openapitools.client.models.CreateTestCandyMachineResponse](docs/CreateTestCandyMachineResponse.md)
 - [org.openapitools.client.models.DelistRequest](docs/DelistRequest.md)
 - [org.openapitools.client.models.DelistResponse](docs/DelistResponse.md)
 - [org.openapitools.client.models.DoubleTransferResponse](docs/DoubleTransferResponse.md)
 - [org.openapitools.client.models.Endpoint](docs/Endpoint.md)
 - [org.openapitools.client.models.EndpointReference](docs/EndpointReference.md)
 - [org.openapitools.client.models.FeePayerWallet](docs/FeePayerWallet.md)
 - [org.openapitools.client.models.GeneratePrivateKey](docs/GeneratePrivateKey.md)
 - [org.openapitools.client.models.GetAllNFTsResponse](docs/GetAllNFTsResponse.md)
 - [org.openapitools.client.models.GetAllNFTsResponseMintedNfts](docs/GetAllNFTsResponseMintedNfts.md)
 - [org.openapitools.client.models.GetAllNFTsResponseUnmintedNfts](docs/GetAllNFTsResponseUnmintedNfts.md)
 - [org.openapitools.client.models.GetCandyMachineIDRequest](docs/GetCandyMachineIDRequest.md)
 - [org.openapitools.client.models.GetCandyMachineIDResponse](docs/GetCandyMachineIDResponse.md)
 - [org.openapitools.client.models.GetCandyMetadataErrorResponse](docs/GetCandyMetadataErrorResponse.md)
 - [org.openapitools.client.models.GetCandyMetadataRequest](docs/GetCandyMetadataRequest.md)
 - [org.openapitools.client.models.GetCandyMetadataResponse](docs/GetCandyMetadataResponse.md)
 - [org.openapitools.client.models.GetCandyMetadataResponseCreators](docs/GetCandyMetadataResponseCreators.md)
 - [org.openapitools.client.models.GetFileResponse](docs/GetFileResponse.md)
 - [org.openapitools.client.models.GetNFTListingResponse](docs/GetNFTListingResponse.md)
 - [org.openapitools.client.models.GetPublicKeyRequest](docs/GetPublicKeyRequest.md)
 - [org.openapitools.client.models.GetSPLTokenResponse](docs/GetSPLTokenResponse.md)
 - [org.openapitools.client.models.Group](docs/Group.md)
 - [org.openapitools.client.models.InlineObject](docs/InlineObject.md)
 - [org.openapitools.client.models.ListNFTsResponse](docs/ListNFTsResponse.md)
 - [org.openapitools.client.models.ListRequest](docs/ListRequest.md)
 - [org.openapitools.client.models.ListResponse](docs/ListResponse.md)
 - [org.openapitools.client.models.MintNFTErrorResponse](docs/MintNFTErrorResponse.md)
 - [org.openapitools.client.models.MintNFTRequest](docs/MintNFTRequest.md)
 - [org.openapitools.client.models.MintNFTResponse](docs/MintNFTResponse.md)
 - [org.openapitools.client.models.NFT](docs/NFT.md)
 - [org.openapitools.client.models.NFTAnalyticsRequest](docs/NFTAnalyticsRequest.md)
 - [org.openapitools.client.models.NFTAnalyticsResponse](docs/NFTAnalyticsResponse.md)
 - [org.openapitools.client.models.NFTAnalyticsResponseTransactionHistory](docs/NFTAnalyticsResponseTransactionHistory.md)
 - [org.openapitools.client.models.NFTData](docs/NFTData.md)
 - [org.openapitools.client.models.NFTMintErrorResponse](docs/NFTMintErrorResponse.md)
 - [org.openapitools.client.models.NFTMintFee](docs/NFTMintFee.md)
 - [org.openapitools.client.models.NFTMintRequest](docs/NFTMintRequest.md)
 - [org.openapitools.client.models.NFTOwnerResponse](docs/NFTOwnerResponse.md)
 - [org.openapitools.client.models.NFTSearchRequest](docs/NFTSearchRequest.md)
 - [org.openapitools.client.models.NFTSearchResponse](docs/NFTSearchResponse.md)
 - [org.openapitools.client.models.NFTTransaction](docs/NFTTransaction.md)
 - [org.openapitools.client.models.ParameterSpecification](docs/ParameterSpecification.md)
 - [org.openapitools.client.models.PrivateKey](docs/PrivateKey.md)
 - [org.openapitools.client.models.Project](docs/Project.md)
 - [org.openapitools.client.models.ProjectCreateRequest](docs/ProjectCreateRequest.md)
 - [org.openapitools.client.models.ProjectDeploymentURL](docs/ProjectDeploymentURL.md)
 - [org.openapitools.client.models.PublicKey](docs/PublicKey.md)
 - [org.openapitools.client.models.SecretPhrase](docs/SecretPhrase.md)
 - [org.openapitools.client.models.SecretRecoveryPhrase](docs/SecretRecoveryPhrase.md)
 - [org.openapitools.client.models.StatItem](docs/StatItem.md)
 - [org.openapitools.client.models.Transaction](docs/Transaction.md)
 - [org.openapitools.client.models.TransactionResult](docs/TransactionResult.md)
 - [org.openapitools.client.models.TransferRequest](docs/TransferRequest.md)
 - [org.openapitools.client.models.TransferResponse](docs/TransferResponse.md)
 - [org.openapitools.client.models.TransferResponseCompiled](docs/TransferResponseCompiled.md)
 - [org.openapitools.client.models.UploadFileRequest](docs/UploadFileRequest.md)
 - [org.openapitools.client.models.Wallet](docs/Wallet.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="APIKeyID"></a>
### APIKeyID

- **Type**: API key
- **API key parameter name**: APIKeyID
- **Location**: HTTP header

<a name="APISecretKey"></a>
### APISecretKey

- **Type**: API key
- **API key parameter name**: APISecretKey
- **Location**: HTTP header

