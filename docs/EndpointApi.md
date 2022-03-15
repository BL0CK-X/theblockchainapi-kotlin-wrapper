# EndpointApi

All URIs are relative to *https://api.blockchainapi.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteEndpoint**](EndpointApi.md#deleteEndpoint) | **POST** /endpoint/delete | Delete an endpoint 
[**getEndpoint**](EndpointApi.md#getEndpoint) | **POST** /endpoint/metadata | Get an endpoint&#39;s metadata 
[**listEndpoints**](EndpointApi.md#listEndpoints) | **GET** /endpoint/list | List all endpoints 
[**setEndpoint**](EndpointApi.md#setEndpoint) | **POST** /endpoint | Create / update an endpoint 


<a name="deleteEndpoint"></a>
# **deleteEndpoint**
> deleteEndpoint(endpointReference)

Delete an endpoint 

A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Deletes an endpoint from a project. This endpoint removes the endpoint from the project&#39;s documentation. However, this does un-deploy the endpoint. To do so, you must &lt;a href&#x3D;\&quot;#operation/deployProject\&quot;&gt;deploy the project&lt;/a&gt;.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EndpointApi()
val endpointReference : EndpointReference =  // EndpointReference | 
try {
    apiInstance.deleteEndpoint(endpointReference)
} catch (e: ClientException) {
    println("4xx response calling EndpointApi#deleteEndpoint")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointApi#deleteEndpoint")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointReference** | [**EndpointReference**](EndpointReference.md)|  | [optional]

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

<a name="getEndpoint"></a>
# **getEndpoint**
> Endpoint getEndpoint(endpointReference)

Get an endpoint&#39;s metadata 

A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Get an endpoint&#39;s metadata from a project.   &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EndpointApi()
val endpointReference : EndpointReference =  // EndpointReference | 
try {
    val result : Endpoint = apiInstance.getEndpoint(endpointReference)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EndpointApi#getEndpoint")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointApi#getEndpoint")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointReference** | [**EndpointReference**](EndpointReference.md)|  | [optional]

### Return type

[**Endpoint**](Endpoint.md)

### Authorization


Configure APIKeyID:
    ApiClient.apiKey["APIKeyID"] = ""
    ApiClient.apiKeyPrefix["APIKeyID"] = ""
Configure APISecretKey:
    ApiClient.apiKey["APISecretKey"] = ""
    ApiClient.apiKeyPrefix["APISecretKey"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listEndpoints"></a>
# **listEndpoints**
> kotlin.collections.List&lt;Endpoint&gt; listEndpoints()

List all endpoints 

A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  List all endpoints that you have added under your account.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EndpointApi()
try {
    val result : kotlin.collections.List<Endpoint> = apiInstance.listEndpoints()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EndpointApi#listEndpoints")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointApi#listEndpoints")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;Endpoint&gt;**](Endpoint.md)

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

<a name="setEndpoint"></a>
# **setEndpoint**
> Endpoint setEndpoint(endpoint)

Create / update an endpoint 

A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Create or update an &#x60;endpoint&#x60; for a &#x60;project&#x60;.   An &#x60;endpoint&#x60; is a function that is a part of a mini-API &#x60;project&#x60;.  This endpoint adds the &#x60;endpoint&#x60; to the &#x60;project&#x60;&#39;s documentation. However, this does not deploy the &#x60;endpoint&#x60;. To do so, you must &lt;a href&#x3D;\&quot;#operation/deployProject\&quot;&gt;deploy the project&lt;/a&gt;.  All attributes except &#x60;group_name&#x60; are required if **creating** an &#x60;endpoint&#x60;.  Only &#x60;path&#x60;, &#x60;project_id&#x60;, and &#x60;version&#x60; are required if **updating** an &#x60;endpoint&#x60;.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EndpointApi()
val endpoint : Endpoint =  // Endpoint | 
try {
    val result : Endpoint = apiInstance.setEndpoint(endpoint)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EndpointApi#setEndpoint")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointApi#setEndpoint")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpoint** | [**Endpoint**](Endpoint.md)|  | [optional]

### Return type

[**Endpoint**](Endpoint.md)

### Authorization


Configure APIKeyID:
    ApiClient.apiKey["APIKeyID"] = ""
    ApiClient.apiKeyPrefix["APIKeyID"] = ""
Configure APISecretKey:
    ApiClient.apiKey["APISecretKey"] = ""
    ApiClient.apiKeyPrefix["APISecretKey"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

