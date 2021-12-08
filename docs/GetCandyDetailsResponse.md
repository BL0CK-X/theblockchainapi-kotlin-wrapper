
# GetCandyDetailsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **kotlin.String** | The uuid of the candy machine |  [optional]
**goLiveDate** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The unix timestamp of the start date of the candy machine  |  [optional]
**price** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The price in Lamports for minting an NFT from the candy machine. 1e9 Lamport  &#x3D; 1 SOL  |  [optional]
**itemsAvailable** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The number of NFTs available for mint from the candy machine  |  [optional]
**itemsRedeemed** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The number of NFTs minted already from the candy machine  |  [optional]
**tokenMint** | **kotlin.String** |  |  [optional]
**configAddress** | **kotlin.String** | The configuration public key address of the candy machine  |  [optional]
**wallet** | **kotlin.String** | The public key address of the wallet that recevies the proceeds from NFT mints  |  [optional]
**bump** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]



