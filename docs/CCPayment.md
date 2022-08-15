
# CCPayment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**projectId** | **kotlin.String** | The ID of the project  |  [optional]
**productId** | **kotlin.String** | The ID of the associated product  |  [optional]
**planId** | **kotlin.String** | The ID of the respective plan  |  [optional]
**paymentId** | **kotlin.String** | The unique ID of the payment  |  [optional]
**blockchainIdentifier** | **kotlin.String** | The unique identifier of the wallet from which the payment was made.  |  [optional]
**blockchainPaymentDetails** | [**CCPaymentBlockchainPaymentDetails**](CCPaymentBlockchainPaymentDetails.md) |  |  [optional]
**customerId** | **kotlin.String** | The ID of the customer  |  [optional]
**paymentValidationCode** | **kotlin.String** | The validation code shown to the customer. This is only visible to the customer who paid. They can use this code to redeem their subscription to their product.  |  [optional]
**periodEnd** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | A UNIX time stamp, in seconds, that identifies the end of the period of the subscription  |  [optional]
**periodStart** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | A UNIX time stamp, in seconds, that identifies the start of the period of the subscription  |  [optional]
**transactionBlockchainIdentifier** | **kotlin.String** | The string that uniquely identifies the blockchain transaction  |  [optional]



