# CCProjectApi

All URIs are relative to *https://api.blockchainapi.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCCProject**](CCProjectApi.md#createCCProject) | **POST** /checkout/v1/project | Create a project 
[**deleteCCProject**](CCProjectApi.md#deleteCCProject) | **DELETE** /checkout/v1/project/{project_id} | Delete a project 
[**getCCProject**](CCProjectApi.md#getCCProject) | **GET** /checkout/v1/project/{project_id} | Get a project 
[**listCCProjects**](CCProjectApi.md#listCCProjects) | **GET** /checkout/v1/projects | List projects 
[**updateCCProject**](CCProjectApi.md#updateCCProject) | **PUT** /checkout/v1/project/{project_id} | Update a project 


<a name="createCCProject"></a>
# **createCCProject**
> CCProject createCCProject(ccProjectCreateRequest)

Create a project 

A project represents that project or company that is accepting payments.  A project can have products, which can have multiple plans (prices) each.  To create a project, you just need to supply a name and a Solana public key to receive payments.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CCProjectApi()
val ccProjectCreateRequest : CCProjectCreateRequest =  // CCProjectCreateRequest | 
try {
    val result : CCProject = apiInstance.createCCProject(ccProjectCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CCProjectApi#createCCProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CCProjectApi#createCCProject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ccProjectCreateRequest** | [**CCProjectCreateRequest**](CCProjectCreateRequest.md)|  | [optional]

### Return type

[**CCProject**](CCProject.md)

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

<a name="deleteCCProject"></a>
# **deleteCCProject**
> deleteCCProject(projectId)

Delete a project 

Delete a project.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CCProjectApi()
val projectId : kotlin.String = project_WDQskRIfHQxj53N5mk5K // kotlin.String | The ID of the project. Created and returned when a project is created.
try {
    apiInstance.deleteCCProject(projectId)
} catch (e: ClientException) {
    println("4xx response calling CCProjectApi#deleteCCProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CCProjectApi#deleteCCProject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| The ID of the project. Created and returned when a project is created. |

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

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCCProject"></a>
# **getCCProject**
> CCProject getCCProject(projectId)

Get a project 

Retrieve a project.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CCProjectApi()
val projectId : kotlin.String = project_WDQskRIfHQxj53N5mk5K // kotlin.String | The ID of the project. Created and returned when a project is created.
try {
    val result : CCProject = apiInstance.getCCProject(projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CCProjectApi#getCCProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CCProjectApi#getCCProject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| The ID of the project. Created and returned when a project is created. |

### Return type

[**CCProject**](CCProject.md)

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

<a name="listCCProjects"></a>
# **listCCProjects**
> kotlin.collections.List&lt;CCProject&gt; listCCProjects()

List projects 

List all projects associated with an account.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CCProjectApi()
try {
    val result : kotlin.collections.List<CCProject> = apiInstance.listCCProjects()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CCProjectApi#listCCProjects")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CCProjectApi#listCCProjects")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;CCProject&gt;**](CCProject.md)

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

<a name="updateCCProject"></a>
# **updateCCProject**
> CCProject updateCCProject(projectId, ccProject)

Update a project 

Retrieve a project.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CCProjectApi()
val projectId : kotlin.String = project_WDQskRIfHQxj53N5mk5K // kotlin.String | The ID of the project. Created and returned when a project is created.
val ccProject : CCProject =  // CCProject | 
try {
    val result : CCProject = apiInstance.updateCCProject(projectId, ccProject)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CCProjectApi#updateCCProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CCProjectApi#updateCCProject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| The ID of the project. Created and returned when a project is created. |
 **ccProject** | [**CCProject**](CCProject.md)|  | [optional]

### Return type

[**CCProject**](CCProject.md)

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

