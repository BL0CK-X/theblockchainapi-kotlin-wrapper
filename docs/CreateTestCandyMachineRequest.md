
# CreateTestCandyMachineRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**wallet** | [**Wallet**](Wallet.md) |  | 
**network** | [**inline**](#Network) |  |  [optional]
**candyMachineContractVersion** | [**inline**](#CandyMachineContractVersion) | The contract you want to use to create the candy machine. Note: Metaplex disabled the creation of &#x60;v1&#x60; candy machines on their smart contract, and so we no longer support the creation of &#x60;v1&#x60; test candy machines.  |  [optional]
**includeGatekeeper** | **kotlin.Boolean** | Whether or not to include a gatekeeper for testing purposes. Only applies to v2 candy machines. |  [optional]


<a name="Network"></a>
## Enum: network
Name | Value
---- | -----
network | devnet, mainnet-beta


<a name="CandyMachineContractVersion"></a>
## Enum: candy_machine_contract_version
Name | Value
---- | -----
candyMachineContractVersion | v2



