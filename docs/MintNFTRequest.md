
# MintNFTRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configAddress** | **kotlin.String** | The config address of the candy machine. You can retrieve this if you have the candy machine ID using &lt;a href&#x3D;\&quot;#operation/solanaGetCandyMachineDetails\&quot;&gt;this endpoint&lt;/a&gt; and retrieving the &#x60;config_address&#x60; from the response..  | 
**secretRecoveryPhrase** | **kotlin.String** | The twelve word phrase that can be used to derive many public key addresses. To derive a public key, you need a secret recovery phrase, a derivation path, and an optional passphrase. See our Security section &lt;a href&#x3D;\&quot;#section/Security\&quot;&gt;here&lt;/a&gt;. | 
**derivationPath** | **kotlin.String** | Derivation paths are used to derive the public key from the secret recovery phrase. Only certain paths are accepted.  We use \&quot;m/44/501/0/0\&quot; by default, if it is not provided. This is the path that the Phantom and Sollet wallets use. If you provide the empty string \&quot;\&quot; as the value for the derivation path, then we will use the Solana CLI default value. The SolFlare recommended path is \&quot;m/44/501/0\&quot;.  You can also arbitrarily increment the default path (\&quot;m/44/501/0/0\&quot;) to generate more wallets (e.g., \&quot;m/44/501/0/1\&quot;, \&quot;m/44/501/0/2\&quot;, ...). This is how Phantom generates more wallets.  To learn more about derivation paths, check out &lt;a href&#x3D;\&quot;https://learnmeabitcoin.com/technical/derivation-paths\&quot; target&#x3D;\&quot;_blank\&quot;&gt;this tutorial&lt;/a&gt;. |  [optional]
**passphrase** | **kotlin.String** | PASSPHRASE !&#x3D; PASSWORD. This is NOT your Phantom password or any other password. It is an optional string you use when creating a wallet. This provides an additional layer of security because a hacker would need both the secret recovery phrase and the passphrase to access the output public key. By default, most wallet UI extensions do not use a passphrase. (You probably did not use a passphrase.) Limited to 500 characters.  |  [optional]
**network** | [**inline**](#Network) |  |  [optional]
**candyMachineContractVersion** | [**inline**](#CandyMachineContractVersion) | The candy machine contract of the candy machine from which you&#39;re minting. If you are minting from a &#x60;v1&#x60; candy machine ID, set this to &#x60;v1&#x60;. If you are minting from a &#x60;v2&#x60; candy machine ID, set this to &#x60;v2&#x60;. If you don&#39;t know which the version of your candy machine, check out &lt;a href&#x3D;\&quot;#operation/solanaGetAccountIsCandyMachine\&quot;&gt;this endpoint&lt;/a&gt;.  |  [optional]


<a name="Network"></a>
## Enum: network
Name | Value
---- | -----
network | devnet, mainnet-beta


<a name="CandyMachineContractVersion"></a>
## Enum: candy_machine_contract_version
Name | Value
---- | -----
candyMachineContractVersion | v1, v2


