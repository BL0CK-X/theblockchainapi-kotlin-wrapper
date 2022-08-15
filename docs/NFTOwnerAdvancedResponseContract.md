
# NFTOwnerAdvancedResponseContract

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contractType** | [**inline**](#ContractType) | The type of the contract that it last interacted with |  [optional]
**contractId** | **kotlin.String** | The string identifier (not the public key) that we denote the contract with. |  [optional]
**contractBlockchainIdentifier** | **kotlin.String** | The public key of the contract |  [optional]
**contractName** | **kotlin.String** | The readable name of the contract (e.g., Magic Eden) |  [optional]


<a name="ContractType"></a>
## Enum: contract_type
Name | Value
---- | -----
contractType | marketplace, otc, loan, staking, burned



