
# NFTData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creators** | **kotlin.collections.List&lt;kotlin.String&gt;** | The creators of the NFT  |  [optional]
**name** | **kotlin.String** | The name of the NFT  |  [optional]
**share** | **kotlin.collections.List&lt;kotlin.Float&gt;** | The portion of the seller fee that each creator receives. Index 0 corresponds to creator at index 0 in the creator array, and so on. Length of share array must be the same as the length of the creator array.  |  [optional]
**symbol** | **kotlin.String** | The symbol of the NFT  |  [optional]
**uri** | **kotlin.String** | The URI of the NFT  |  [optional]
**verified** | **kotlin.collections.List&lt;kotlin.Int&gt;** | Whether or not the respective creator has signed the minting transaction of the NFT. Index 0 corresponds to creator at index 0 in the creator array, and so on. Length of verified array must be the same as the length of the creator array.  |  [optional]



