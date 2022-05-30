
# GeneralBalanceResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balance** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The balance of the token in the wallet  | 
**network** | **kotlin.String** | The network of the blockchain you selected  - Solana: &#x60;devnet&#x60;, &#x60;mainnet-beta&#x60; - Ethereum: &#x60;ropsten&#x60;, &#x60;mainnet&#x60;  Defaults when not provided (not applicable to path parameters): - Solana: &#x60;devnet&#x60; - Ethereum: &#x60;ropsten&#x60; | 
**integerBalance** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Not included if retreiving native token (e.g., SOL, ETH, BNB, etc.) balance  |  [optional]
**decimals** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Not included if retreiving native token (e.g., SOL, ETH, BNB, etc.) balance.  |  [optional]
**unit** | **kotlin.String** | Not included if retreiving a token / NFT balance  |  [optional]



