
# NFT

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**confirmed** | **kotlin.Boolean** | Whether or not the NFT mint was confirmed or simply submitted for processing. The status depends on your input for &#x60;wait_for_confirmation&#x60;. This only is returned when you are minting an NFT, not when searching or retrieving the metadata. |  [optional]
**&#x60;data&#x60;** | [**NFTData**](NFTData.md) |  |  [optional]
**isMutable** | **kotlin.Boolean** |  |  [optional]
**mint** | **kotlin.String** | The public key address of the NFT  |  [optional]
**primarySaleHappened** | **kotlin.Boolean** |  |  [optional]
**updateAuthority** | **kotlin.String** | A public key address that is usually that of the person who minted the NFT  |  [optional]
**sellerFeeBasisPoints** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**mintSecretRecoveryPhrase** | **kotlin.String** |  |  [optional]
**explorerUrl** | **kotlin.String** |  |  [optional]
**metadataAccount** | **kotlin.String** | The metadata account of the NFT  |  [optional]
**editionNonce** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**tokenStandard** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**collection** | [**NFTCollection**](NFTCollection.md) |  |  [optional]
**uses** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]



