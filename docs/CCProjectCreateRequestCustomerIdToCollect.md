
# CCProjectCreateRequestCustomerIdToCollect

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idType** | [**inline**](#IdType) | What type of identifier you are collecting, either an \&quot;email\&quot; or \&quot;misc\&quot;ellanous. Miscellanous simply means you are collecting something other than an email.   | 
**name** | **kotlin.String** | The name of the customer ID input presented to the user  | 
**description** | **kotlin.String** | The description / stated purpose of the customer ID input presented to the user  |  [optional]
**required** | **kotlin.Boolean** | Whether to require the customer ID  |  [optional]


<a name="IdType"></a>
## Enum: id_type
Name | Value
---- | -----
idType | misc, email



