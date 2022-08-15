# CCPaymentApi

All URIs are relative to *https://api.blockchainapi.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCCPayment**](CCPaymentApi.md#getCCPayment) | **GET** /checkout/v1/project/{project_id}/payment/{payment_identifier} | Get a payment 
[**listAllCCPayments**](CCPaymentApi.md#listAllCCPayments) | **GET** /checkout/v1/payments | List all payments  
[**listCCProjectPayments**](CCPaymentApi.md#listCCProjectPayments) | **GET** /checkout/v1/project/{project_id}/payments | List a project&#39;s payments 


<a name="getCCPayment"></a>
# **getCCPayment**
> CCPayment getCCPayment(projectId, paymentIdentifier)

Get a payment 

Retrieve a specific payment, either by its &#x60;payment_id&#x60; or &#x60;payment_validation_code&#x60;.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CCPaymentApi()
val projectId : kotlin.String = project_WDQskRIfHQxj53N5mk5K // kotlin.String | The ID of the project. Created and returned when a project is created.
val paymentIdentifier : kotlin.String = ["payment_97jA1szpVjrSI5EvOb5zxNQFq5CfrC"] // kotlin.String | You can supply either `payment_id` or `payment_validation_code`.  The `payment_id` is only visible by you and uniquely identifies a payment.  The `payment_validation_code` is shown exclusively to the customer and the owner of the project. It can be used to redeem a payment. You can verify a payment by pulling the payment with the `payment_validation_code`.
try {
    val result : CCPayment = apiInstance.getCCPayment(projectId, paymentIdentifier)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CCPaymentApi#getCCPayment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CCPaymentApi#getCCPayment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| The ID of the project. Created and returned when a project is created. |
 **paymentIdentifier** | **kotlin.String**| You can supply either &#x60;payment_id&#x60; or &#x60;payment_validation_code&#x60;.  The &#x60;payment_id&#x60; is only visible by you and uniquely identifies a payment.  The &#x60;payment_validation_code&#x60; is shown exclusively to the customer and the owner of the project. It can be used to redeem a payment. You can verify a payment by pulling the payment with the &#x60;payment_validation_code&#x60;. |

### Return type

[**CCPayment**](CCPayment.md)

### Authorization


Configure APIKeyID:
    ApiClient.apiKey["APIKeyID"] = ""
    ApiClient.apiKeyPrefix["APIKeyID"] = ""
Configure APISecretKey:
    ApiClient.apiKey["APISecretKey"] = ""
    ApiClient.apiKeyPrefix["APISecretKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAllCCPayments"></a>
# **listAllCCPayments**
> kotlin.collections.List&lt;CCPayment&gt; listAllCCPayments()

List all payments  

List all payments associated with your account (across all projects).  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CCPaymentApi()
try {
    val result : kotlin.collections.List<CCPayment> = apiInstance.listAllCCPayments()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CCPaymentApi#listAllCCPayments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CCPaymentApi#listAllCCPayments")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;CCPayment&gt;**](CCPayment.md)

### Authorization


Configure APIKeyID:
    ApiClient.apiKey["APIKeyID"] = ""
    ApiClient.apiKeyPrefix["APIKeyID"] = ""
Configure APISecretKey:
    ApiClient.apiKey["APISecretKey"] = ""
    ApiClient.apiKeyPrefix["APISecretKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCCProjectPayments"></a>
# **listCCProjectPayments**
> kotlin.collections.List&lt;CCPayment&gt; listCCProjectPayments(projectId, UNKNOWN_PARAMETER_NAME)

List a project&#39;s payments 

List all payments associated with a project.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CCPaymentApi()
val projectId : kotlin.String = project_WDQskRIfHQxj53N5mk5K // kotlin.String | The ID of the project. Created and returned when a project is created.
val UNKNOWN_PARAMETER_NAME :  =  //  | Filter payments by a user's wallet identifier (i.e., Solana public key) 
try {
    val result : kotlin.collections.List<CCPayment> = apiInstance.listCCProjectPayments(projectId, UNKNOWN_PARAMETER_NAME)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CCPaymentApi#listCCProjectPayments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CCPaymentApi#listCCProjectPayments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| The ID of the project. Created and returned when a project is created. |
 **UNKNOWN_PARAMETER_NAME** | [****](.md)| Filter payments by a user&#39;s wallet identifier (i.e., Solana public key)  | [optional]

### Return type

[**kotlin.collections.List&lt;CCPayment&gt;**](CCPayment.md)

### Authorization


Configure APIKeyID:
    ApiClient.apiKey["APIKeyID"] = ""
    ApiClient.apiKeyPrefix["APIKeyID"] = ""
Configure APISecretKey:
    ApiClient.apiKey["APISecretKey"] = ""
    ApiClient.apiKeyPrefix["APISecretKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

