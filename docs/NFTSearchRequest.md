
# NFTSearchRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**updateAuthority** | **kotlin.String** | The public key of the update authority of the NFT |  [optional]
**updateAuthoritySearchMethod** | [**inline**](#UpdateAuthoritySearchMethod) | Only &#x60;exact_match&#x60; supported at this time |  [optional]
**mintAddress** | **kotlin.String** | The mint address of the NFT |  [optional]
**mintAddressSearchMethod** | [**inline**](#MintAddressSearchMethod) | Only &#x60;exact_match&#x60; supported at this time |  [optional]
**name** | **kotlin.String** | The name of the NFT |  [optional]
**nameSearchMethod** | [**inline**](#NameSearchMethod) |  |  [optional]
**uri** | **kotlin.String** | The NFT&#39;s uri |  [optional]
**uriSearchMethod** | [**inline**](#UriSearchMethod) |  |  [optional]
**symbol** | **kotlin.String** | The symbol associated with the candy machine |  [optional]
**symbolSearchMethod** | [**inline**](#SymbolSearchMethod) |  |  [optional]
**network** | [**inline**](#Network) |  |  [optional]


<a name="UpdateAuthoritySearchMethod"></a>
## Enum: update_authority_search_method
Name | Value
---- | -----
updateAuthoritySearchMethod | exact_match


<a name="MintAddressSearchMethod"></a>
## Enum: mint_address_search_method
Name | Value
---- | -----
mintAddressSearchMethod | exact_match


<a name="NameSearchMethod"></a>
## Enum: name_search_method
Name | Value
---- | -----
nameSearchMethod | begins_with, exact_match


<a name="UriSearchMethod"></a>
## Enum: uri_search_method
Name | Value
---- | -----
uriSearchMethod | begins_with, exact_match


<a name="SymbolSearchMethod"></a>
## Enum: symbol_search_method
Name | Value
---- | -----
symbolSearchMethod | begins_with, exact_match


<a name="Network"></a>
## Enum: network
Name | Value
---- | -----
network | devnet, mainnet-beta



