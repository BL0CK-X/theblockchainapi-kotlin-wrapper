# CCWebhookApi

All URIs are relative to *https://api.blockchainapi.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCCWebhook**](CCWebhookApi.md#getCCWebhook) | **POST** /webhook/v1/project/{project_id}/webhook/{webhook_identifier} | Get a webhook 
[**listCCProjectWebhooks**](CCWebhookApi.md#listCCProjectWebhooks) | **POST** /webhook/v1/project/{project_id}/webhooks | List project&#39;s webhooks 
[**validateCCWebhook**](CCWebhookApi.md#validateCCWebhook) | **POST** /webhook/v1/project/{project_id}/webhook/{webhook_identifier}/validate | Validate a webhook 


<a name="getCCWebhook"></a>
# **getCCWebhook**
> CCWebhook getCCWebhook(projectId, webhookIdentifier)

Get a webhook 

Retrieve the details of a webhook sent to you.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CCWebhookApi()
val projectId : kotlin.String = project_WDQskRIfHQxj53N5mk5K // kotlin.String | The ID of the project. Created and returned when a project is created.
val webhookIdentifier : kotlin.String = webhook/payment.received/payment_EyfDL6CsvFinpUnXgBXaUuqq3hCXa0 // kotlin.String | The ID of the webhook. Created and returned when a webhook is sent.
try {
    val result : CCWebhook = apiInstance.getCCWebhook(projectId, webhookIdentifier)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CCWebhookApi#getCCWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CCWebhookApi#getCCWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| The ID of the project. Created and returned when a project is created. |
 **webhookIdentifier** | **kotlin.String**| The ID of the webhook. Created and returned when a webhook is sent. |

### Return type

[**CCWebhook**](CCWebhook.md)

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

<a name="listCCProjectWebhooks"></a>
# **listCCProjectWebhooks**
> kotlin.collections.List&lt;CCWebhook&gt; listCCProjectWebhooks(projectId)

List project&#39;s webhooks 

List all webhooks sent to you and their respective responses from your server.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CCWebhookApi()
val projectId : kotlin.String = project_WDQskRIfHQxj53N5mk5K // kotlin.String | The ID of the project. Created and returned when a project is created.
try {
    val result : kotlin.collections.List<CCWebhook> = apiInstance.listCCProjectWebhooks(projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CCWebhookApi#listCCProjectWebhooks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CCWebhookApi#listCCProjectWebhooks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| The ID of the project. Created and returned when a project is created. |

### Return type

[**kotlin.collections.List&lt;CCWebhook&gt;**](CCWebhook.md)

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

<a name="validateCCWebhook"></a>
# **validateCCWebhook**
> validateCCWebhook(projectId, webhookIdentifier, ccWebhookValidateRequest)

Validate a webhook 

Validate whether a webhook you received was actually sent from us.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CCWebhookApi()
val projectId : kotlin.String = project_WDQskRIfHQxj53N5mk5K // kotlin.String | The ID of the project. Created and returned when a project is created.
val webhookIdentifier : kotlin.String = webhook/payment.received/payment_EyfDL6CsvFinpUnXgBXaUuqq3hCXa0 // kotlin.String | The ID of the webhook. Created and returned when a webhook is sent.
val ccWebhookValidateRequest : CCWebhookValidateRequest =  // CCWebhookValidateRequest | 
try {
    apiInstance.validateCCWebhook(projectId, webhookIdentifier, ccWebhookValidateRequest)
} catch (e: ClientException) {
    println("4xx response calling CCWebhookApi#validateCCWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CCWebhookApi#validateCCWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| The ID of the project. Created and returned when a project is created. |
 **webhookIdentifier** | **kotlin.String**| The ID of the webhook. Created and returned when a webhook is sent. |
 **ccWebhookValidateRequest** | [**CCWebhookValidateRequest**](CCWebhookValidateRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure APIKeyID:
    ApiClient.apiKey["APIKeyID"] = ""
    ApiClient.apiKeyPrefix["APIKeyID"] = ""
Configure APISecretKey:
    ApiClient.apiKey["APISecretKey"] = ""
    ApiClient.apiKeyPrefix["APISecretKey"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

