
# CCProjectCreateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The name of the project. This is shown to your users and should identify your company or organization.  | 
**description** | **kotlin.String** | The description of your project / company.  |  [optional]
**webhook** | **kotlin.String** | A URL that identifies where we should make an API request to notify you of a new payment (e.g., api.myproject.com/crypto_payments/webhook). Learn more [here](#tag/CC-Webhook/operation/getCCWebhook).  |  [optional]
**website** | **kotlin.String** | The website of your project / company.  |  [optional]
**discordWebhook** | **kotlin.String** | A Discord webhook. We will send a message to this channel to notify of payment. Learn more [here]().  |  [optional]
**logoUrl** | **kotlin.String** | A URL of your logo.  |  [optional]
**customerIdToCollect** | [**CCProjectCreateRequestCustomerIdToCollect**](CCProjectCreateRequestCustomerIdToCollect.md) |  |  [optional]
**successUrl** | **kotlin.String** | Where to redirect customers after payment. If not supplied, customers will be redirected to checkout.blockchainapi.com/me to view their subscriptions.  |  [optional]
**payoutMethod** | [**CCProjectCreateRequestPayoutMethod**](CCProjectCreateRequestPayoutMethod.md) |  |  [optional]



