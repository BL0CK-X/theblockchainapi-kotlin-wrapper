
# GetCandyMetadataResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authority** | **kotlin.String** | The update authority of the candy machine |  [optional]
**bump** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**candyMachineId** | **kotlin.String** | The ID of the candy machine  |  [optional]
**configAddress** | **kotlin.String** | The configuration public key address of the candy machine  |  [optional]
**creators** | [**kotlin.collections.List&lt;GetCandyMetadataResponseCreators&gt;**](GetCandyMetadataResponseCreators.md) |  |  [optional]
**goLiveDate** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The unix timestamp of the start date of the candy machine  |  [optional]
**isMutable** | **kotlin.Boolean** |  |  [optional]
**itemsAvailable** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The number of NFTs available for mint from the candy machine  |  [optional]
**itemsRedeemed** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The number of NFTs minted already from the candy machine  |  [optional]
**maxNumberOfLines** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**maxSupply** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**price** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The price in Lamports for minting an NFT from the candy machine. 1e9 Lamport  &#x3D; 1 SOL  |  [optional]
**retainAuthority** | **kotlin.Boolean** |  |  [optional]
**sellerFeeBasisPoints** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The royalty the creators receive on each sale after the primary sale (the initial minting) (denominated in basis points (e.g., 75 basis points &#x3D; 0.75%))  |  [optional]
**symbol** | **kotlin.String** |  |  [optional]
**tokenMint** | **kotlin.String** |  |  [optional]
**uuid** | **kotlin.String** | The uuid of the candy machine |  [optional]
**wallet** | **kotlin.String** | The public key address of the wallet that recevies the proceeds from NFT mints  |  [optional]



