
# BalanceResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balance** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The balance of the token in the wallet | 
**network** | [**inline**](#Network) |  | 
**integerBalance** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Not included if retreiving SOL balance |  [optional]
**decimals** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Not included if retreiving SOL balance |  [optional]
**unit** | [**inline**](#Unit) | Not included if retreiving an SPL token balance |  [optional]


<a name="Network"></a>
## Enum: network
Name | Value
---- | -----
network | devnet, mainnet-beta


<a name="Unit"></a>
## Enum: unit
Name | Value
---- | -----
unit | lamport, sol



