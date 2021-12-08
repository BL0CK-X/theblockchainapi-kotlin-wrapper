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

All URIs are relative to *https://api.theblockchainapi.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FileApi* | [**uploadFile**](docs/FileApi.md#uploadfile) | **POST** /file | Upload a file
*SolanaAccountApi* | [**solanaGetAccount**](docs/SolanaAccountApi.md#solanagetaccount) | **GET** /solana/account/{network}/{public_key} | Get the details of an account on Solana
*SolanaAccountApi* | [**solanaGetAccountIsCandyMachine**](docs/SolanaAccountApi.md#solanagetaccountiscandymachine) | **GET** /solana/account/{network}/{public_key}/is_candy_machine | Get if account is candy machine
*SolanaAccountApi* | [**solanaGetAccountIsNFT**](docs/SolanaAccountApi.md#solanagetaccountisnft) | **GET** /solana/account/{network}/{public_key}/is_nft | Get if account is NFT
*SolanaCandyMachineApi* | [**solanaCreateTestCandyMachine**](docs/SolanaCandyMachineApi.md#solanacreatetestcandymachine) | **POST** /solana/nft/candy_machine | Create a test candy machine 
*SolanaCandyMachineApi* | [**solanaGetAllNFTsFromCandyMachine**](docs/SolanaCandyMachineApi.md#solanagetallnftsfromcandymachine) | **GET** /solana/nft/candy_machine/{network}/{candy_machine_id}/nfts | Get the list of all NFTs (minted and unminted) from a Solana Candy Machine 
*SolanaCandyMachineApi* | [**solanaGetCandyMachineConfigurationDetails**](docs/SolanaCandyMachineApi.md#solanagetcandymachineconfigurationdetails) | **POST** /solana/nft/candy_machine/config/info | Get the details of a Solana Candy Machine configuration 
*SolanaCandyMachineApi* | [**solanaGetCandyMachineDetails**](docs/SolanaCandyMachineApi.md#solanagetcandymachinedetails) | **POST** /solana/nft/candy_machine/info | Get a Metaplex candy machine's details 
*SolanaCandyMachineApi* | [**solanaGetNFTsMintedFromCandyMachine**](docs/SolanaCandyMachineApi.md#solanagetnftsmintedfromcandymachine) | **POST** /solana/nft/candy_machine/nfts | Get the list of NFTs minted from a Solana Candy Machine 
*SolanaCandyMachineApi* | [**solanaMintFromCandyMachine**](docs/SolanaCandyMachineApi.md#solanamintfromcandymachine) | **POST** /solana/nft/candy_machine/mint | Mint an NFT from a Metaplex candy machine
*SolanaNFTApi* | [**solanaCreateNFT**](docs/SolanaNFTApi.md#solanacreatenft) | **POST** /solana/nft | Create an NFT on Solana
*SolanaNFTApi* | [**solanaGetNFT**](docs/SolanaNFTApi.md#solanagetnft) | **GET** /solana/nft/{network}/{mint_address} | Get an NFT's metadata
*SolanaNFTApi* | [**solanaGetNFTMintFee**](docs/SolanaNFTApi.md#solanagetnftmintfee) | **GET** /solana/nft/mint/fee | Get the NFT mint fee
*SolanaNFTApi* | [**solanaGetNFTOwner**](docs/SolanaNFTApi.md#solanagetnftowner) | **GET** /solana/nft/{network}/{mint_address}/owner | Get owner of an NFT
*SolanaNFTApi* | [**solanaGetNFTsCandyMachineId**](docs/SolanaNFTApi.md#solanagetnftscandymachineid) | **POST** /solana/nft/candy_machine_id | Get the ID of the candy machine of an NFT 
*SolanaTransactionApi* | [**solanaGetTransaction**](docs/SolanaTransactionApi.md#solanagettransaction) | **GET** /solana/transaction/{network}/{tx_signature} | Get the details of a transaction made on Solana
*SolanaWalletApi* | [**solanaDeriveAssociatedTokenAccountAddress**](docs/SolanaWalletApi.md#solanaderiveassociatedtokenaccountaddress) | **GET** /solana/wallet/{public_key}/associated_token_account/{mint_address} | Derive an associated token account address
*SolanaWalletApi* | [**solanaDerivePublicKey**](docs/SolanaWalletApi.md#solanaderivepublickey) | **POST** /solana/wallet/public_key | Derive public key
*SolanaWalletApi* | [**solanaGenerateSecretRecoveryPhrase**](docs/SolanaWalletApi.md#solanageneratesecretrecoveryphrase) | **POST** /solana/wallet/secret_recovery_phrase | Generate secret phrase
*SolanaWalletApi* | [**solanaGetAirdrop**](docs/SolanaWalletApi.md#solanagetairdrop) | **POST** /solana/wallet/airdrop | Get an airdrop on devnet
*SolanaWalletApi* | [**solanaGetBalance**](docs/SolanaWalletApi.md#solanagetbalance) | **POST** /solana/wallet/balance | Get wallet's balance in SOL or any SPL
*SolanaWalletApi* | [**solanaGetNFTsBelongingToWallet**](docs/SolanaWalletApi.md#solanagetnftsbelongingtowallet) | **GET** /solana/wallet/{network}/{public_key}/nfts | Get address's NFTs
*SolanaWalletApi* | [**solanaGetTokensBelongingToWallet**](docs/SolanaWalletApi.md#solanagettokensbelongingtowallet) | **GET** /solana/wallet/{network}/{public_key}/tokens | Get address's tokens and respective balances
*SolanaWalletApi* | [**solanaTransfer**](docs/SolanaWalletApi.md#solanatransfer) | **POST** /solana/wallet/transfer | Transfer SOL, a token, or an NFT to another address
*TaskApi* | [**getTask**](docs/TaskApi.md#gettask) | **GET** /task/{task_id} | Get the result of a task


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.ATAResponse](docs/ATAResponse.md)
 - [org.openapitools.client.models.Account](docs/Account.md)
 - [org.openapitools.client.models.AccountContext](docs/AccountContext.md)
 - [org.openapitools.client.models.AccountIsCandyMachine](docs/AccountIsCandyMachine.md)
 - [org.openapitools.client.models.AccountIsNFT](docs/AccountIsNFT.md)
 - [org.openapitools.client.models.AccountValue](docs/AccountValue.md)
 - [org.openapitools.client.models.AirdropRequest](docs/AirdropRequest.md)
 - [org.openapitools.client.models.BalanceRequest](docs/BalanceRequest.md)
 - [org.openapitools.client.models.BalanceResponse](docs/BalanceResponse.md)
 - [org.openapitools.client.models.CreateTestCandyMachineRequest](docs/CreateTestCandyMachineRequest.md)
 - [org.openapitools.client.models.CreateTestCandyMachineResponse](docs/CreateTestCandyMachineResponse.md)
 - [org.openapitools.client.models.GetAllNFTsResponse](docs/GetAllNFTsResponse.md)
 - [org.openapitools.client.models.GetAllNFTsResponseMintedNfts](docs/GetAllNFTsResponseMintedNfts.md)
 - [org.openapitools.client.models.GetAllNFTsResponseUnmintedNfts](docs/GetAllNFTsResponseUnmintedNfts.md)
 - [org.openapitools.client.models.GetCandyDetailsErrorResponse](docs/GetCandyDetailsErrorResponse.md)
 - [org.openapitools.client.models.GetCandyDetailsRequest](docs/GetCandyDetailsRequest.md)
 - [org.openapitools.client.models.GetCandyDetailsResponse](docs/GetCandyDetailsResponse.md)
 - [org.openapitools.client.models.GetCandyMachineIDRequest](docs/GetCandyMachineIDRequest.md)
 - [org.openapitools.client.models.GetCandyMachineIDResponse](docs/GetCandyMachineIDResponse.md)
 - [org.openapitools.client.models.GetConfigInfoRequest](docs/GetConfigInfoRequest.md)
 - [org.openapitools.client.models.GetConfigInfoResponse](docs/GetConfigInfoResponse.md)
 - [org.openapitools.client.models.GetConfigInfoResponseCreators](docs/GetConfigInfoResponseCreators.md)
 - [org.openapitools.client.models.GetFileResponse](docs/GetFileResponse.md)
 - [org.openapitools.client.models.GetMintedNFTsRequest](docs/GetMintedNFTsRequest.md)
 - [org.openapitools.client.models.GetMintedNFTsResponse](docs/GetMintedNFTsResponse.md)
 - [org.openapitools.client.models.GetPublicKeyRequest](docs/GetPublicKeyRequest.md)
 - [org.openapitools.client.models.ListNFTsResponse](docs/ListNFTsResponse.md)
 - [org.openapitools.client.models.MintNFTErrorResponse](docs/MintNFTErrorResponse.md)
 - [org.openapitools.client.models.MintNFTRequest](docs/MintNFTRequest.md)
 - [org.openapitools.client.models.MintNFTResponse](docs/MintNFTResponse.md)
 - [org.openapitools.client.models.NFT](docs/NFT.md)
 - [org.openapitools.client.models.NFTData](docs/NFTData.md)
 - [org.openapitools.client.models.NFTMintErrorResponse](docs/NFTMintErrorResponse.md)
 - [org.openapitools.client.models.NFTMintFee](docs/NFTMintFee.md)
 - [org.openapitools.client.models.NFTMintRequest](docs/NFTMintRequest.md)
 - [org.openapitools.client.models.NFTOwnerResponse](docs/NFTOwnerResponse.md)
 - [org.openapitools.client.models.PublicKey](docs/PublicKey.md)
 - [org.openapitools.client.models.SecretPhrase](docs/SecretPhrase.md)
 - [org.openapitools.client.models.Task](docs/Task.md)
 - [org.openapitools.client.models.Transaction](docs/Transaction.md)
 - [org.openapitools.client.models.TransferRequest](docs/TransferRequest.md)
 - [org.openapitools.client.models.TransferResponse](docs/TransferResponse.md)
 - [org.openapitools.client.models.UploadFileRequest](docs/UploadFileRequest.md)


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

