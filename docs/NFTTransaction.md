
# NFTTransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blockTime** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | An epoch time stamp in UTC time that represents the time of the block where the transaction was processed  |  [optional]
**exchange** | [**inline**](#Exchange) | The NFT exchange on which the transaction occurred |  [optional]
**exchangeReadable** | [**inline**](#ExchangeReadable) | A readable version of the NFT exchange |  [optional]
**mintAddress** | **kotlin.String** | The mint address of the NFT  |  [optional]
**operation** | [**inline**](#Operation) | The operation of the transaction |  [optional]
**seller** | **kotlin.String** | The public key of the wallet that listed the NFT |  [optional]
**buyer** | **kotlin.String** | The public key of the buyer. This only exists in &#x60;buy&#x60; transactions.  |  [optional]
**transactionSignature** | **kotlin.String** | The signature of the transaction. You can look up each transaction on explorer.solana.com  |  [optional]


<a name="Exchange"></a>
## Enum: exchange
Name | Value
---- | -----
exchange | solsea, magic-eden, alpha-art, digital-eyes, solanart, exchange-art


<a name="ExchangeReadable"></a>
## Enum: exchange_readable
Name | Value
---- | -----
exchangeReadable | SolSea, Magic Eden, Alpha Art, Digital Eyes, Solanart, Exchange.art


<a name="Operation"></a>
## Enum: operation
Name | Value
---- | -----
operation | buy, list, de_list, update_listing



