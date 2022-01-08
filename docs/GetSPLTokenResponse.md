
# GetSPLTokenResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**decimals** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The number of decimals of the token. For example, if the USDC token has 6 decimals, then you need 1 * 10e6 &#x3D; 1,000,000 tokens to have 1 USDC. The purpose of this is that everything must be stored as  an integer. Thus, if there are $100 USDC in total, there must be $100 * 10e6 tokens in order for the $100 to be divisible into lower denominations than $1.  |  [optional]
**freezeAuthority** | **kotlin.String** | Public key address |  [optional]
**mintAuthority** | **kotlin.String** | Public key address |  [optional]
**isInitialized** | **kotlin.Boolean** |  |  [optional]
**supply** | **kotlin.String** | The supply of the token |  [optional]



