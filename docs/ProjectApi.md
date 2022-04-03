# ProjectApi

All URIs are relative to *https://api.blockchainapi.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProject**](ProjectApi.md#createProject) | **POST** /project | Create a project 
[**createProjectVersion**](ProjectApi.md#createProjectVersion) | **POST** /project/{project_id}/{version} | Create a new project version 
[**deleteProject**](ProjectApi.md#deleteProject) | **DELETE** /project/{project_id} | Delete a project 
[**deleteProjectVersion**](ProjectApi.md#deleteProjectVersion) | **DELETE** /project/{project_id}/{version} | Delete a project version 
[**getProject**](ProjectApi.md#getProject) | **GET** /project/{project_id} | Get a project&#39;s metadata 
[**getProjectDeploymentStatus**](ProjectApi.md#getProjectDeploymentStatus) | **POST** /project/{project_id}/deploy/status | Get deployment status 
[**getProjectDeploymentURL**](ProjectApi.md#getProjectDeploymentURL) | **POST** /project/{project_id}/deploy/url | Get the deployment URL 
[**getProjectStats**](ProjectApi.md#getProjectStats) | **GET** /project/{project_id}/stats | Get a project&#39;s stats 
[**listProjects**](ProjectApi.md#listProjects) | **GET** /project/list | List projects 
[**updateProject**](ProjectApi.md#updateProject) | **POST** /project/{project_id} | Update a project 
[**updateProjectDocumentation**](ProjectApi.md#updateProjectDocumentation) | **POST** /project/{project_id}/{version}/documentation | Update the project&#39;s documentation 


<a name="createProject"></a>
# **createProject**
> Project createProject(projectCreateRequest)

Create a project 

A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  A project is an entire mini-API.  When you create a project, this initializes the project in our database and the API documentation for the project.  After initialization, you can &lt;a href&#x3D;\&quot;#operation/createEndpoint\&quot;&gt;add endpoints&lt;/a&gt; to the documentation and deploy the project&#39;s mini-API to our servers. Learn more &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectApi()
val projectCreateRequest : ProjectCreateRequest =  // ProjectCreateRequest | 
try {
    val result : Project = apiInstance.createProject(projectCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#createProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#createProject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectCreateRequest** | [**ProjectCreateRequest**](ProjectCreateRequest.md)|  | [optional]

### Return type

[**Project**](Project.md)

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

<a name="createProjectVersion"></a>
# **createProjectVersion**
> Project createProjectVersion(projectId, version)

Create a new project version 

A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Create a new version for the project. The version must be higher than all existing versions. This will duplicate the existing project&#39;s latest version and auto-deploy it. To update these endpoints, simply redeploy on this project&#39;s versions.  When a project is first created, it uses the default \&quot;0.0.1\&quot; version.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectApi()
val projectId : kotlin.String = L3cPm0cJlf5MeDXzGLQJJ4vlzndJCC // kotlin.String | The ID of the project. Created and returned when a project is created.
val version : kotlin.String = 2 // kotlin.String | The version of the project.
try {
    val result : Project = apiInstance.createProjectVersion(projectId, version)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#createProjectVersion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#createProjectVersion")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| The ID of the project. Created and returned when a project is created. |
 **version** | **kotlin.String**| The version of the project. |

### Return type

[**Project**](Project.md)

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

<a name="deleteProject"></a>
# **deleteProject**
> deleteProject(projectId)

Delete a project 

A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Deletes a project. This will remove the mini-API entirely from our system.   &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectApi()
val projectId : kotlin.String = L3cPm0cJlf5MeDXzGLQJJ4vlzndJCC // kotlin.String | The ID of the project. Created and returned when a project is created.
try {
    apiInstance.deleteProject(projectId)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#deleteProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#deleteProject")
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

<a name="deleteProjectVersion"></a>
# **deleteProjectVersion**
> Project deleteProjectVersion(projectId, version)

Delete a project version 

A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Delete a version for the project. There must always be at least one version deployed, so you cannot delete the last remaining version of the project. This will auto-deploy the project and update its documentation, if necessary.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectApi()
val projectId : kotlin.String = L3cPm0cJlf5MeDXzGLQJJ4vlzndJCC // kotlin.String | The ID of the project. Created and returned when a project is created.
val version : kotlin.String = 2 // kotlin.String | The version of the project.
try {
    val result : Project = apiInstance.deleteProjectVersion(projectId, version)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#deleteProjectVersion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#deleteProjectVersion")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| The ID of the project. Created and returned when a project is created. |
 **version** | **kotlin.String**| The version of the project. |

### Return type

[**Project**](Project.md)

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

<a name="getProject"></a>
# **getProject**
> Project getProject(projectId)

Get a project&#39;s metadata 

A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Update your project&#39;s metadata. None of these parameters are required. Just provide the parameters that you would like to update.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectApi()
val projectId : kotlin.String = L3cPm0cJlf5MeDXzGLQJJ4vlzndJCC // kotlin.String | The ID of the project. Created and returned when a project is created.
try {
    val result : Project = apiInstance.getProject(projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#getProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#getProject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| The ID of the project. Created and returned when a project is created. |

### Return type

[**Project**](Project.md)

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

<a name="getProjectDeploymentStatus"></a>
# **getProjectDeploymentStatus**
> kotlin.Any getProjectDeploymentStatus(projectId)

Get deployment status 

A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Get the deployment status for the project after uploading the binary. Will be: &#x60;DEPLOYED&#x60; or NOT &#x60;DEPLOYED&#x60;.  After it is &#x60;DEPLOYED&#x60;, you can then make requests to your API.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectApi()
val projectId : kotlin.String = L3cPm0cJlf5MeDXzGLQJJ4vlzndJCC // kotlin.String | The ID of the project. Created and returned when a project is created.
try {
    val result : kotlin.Any = apiInstance.getProjectDeploymentStatus(projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#getProjectDeploymentStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#getProjectDeploymentStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| The ID of the project. Created and returned when a project is created. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

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

<a name="getProjectDeploymentURL"></a>
# **getProjectDeploymentURL**
> ProjectDeploymentURL getProjectDeploymentURL(projectId, inlineObject)

Get the deployment URL 

A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Get the deployment URL for the project.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectApi()
val projectId : kotlin.String = L3cPm0cJlf5MeDXzGLQJJ4vlzndJCC // kotlin.String | The ID of the project. Created and returned when a project is created.
val inlineObject : InlineObject =  // InlineObject | 
try {
    val result : ProjectDeploymentURL = apiInstance.getProjectDeploymentURL(projectId, inlineObject)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#getProjectDeploymentURL")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#getProjectDeploymentURL")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| The ID of the project. Created and returned when a project is created. |
 **inlineObject** | [**InlineObject**](InlineObject.md)|  | [optional]

### Return type

[**ProjectDeploymentURL**](ProjectDeploymentURL.md)

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

<a name="getProjectStats"></a>
# **getProjectStats**
> kotlin.collections.List&lt;StatItem&gt; getProjectStats(projectId)

Get a project&#39;s stats 

A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Get the usage stats for your mini-API.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectApi()
val projectId : kotlin.String = L3cPm0cJlf5MeDXzGLQJJ4vlzndJCC // kotlin.String | The ID of the project. Created and returned when a project is created.
try {
    val result : kotlin.collections.List<StatItem> = apiInstance.getProjectStats(projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#getProjectStats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#getProjectStats")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| The ID of the project. Created and returned when a project is created. |

### Return type

[**kotlin.collections.List&lt;StatItem&gt;**](StatItem.md)

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

<a name="listProjects"></a>
# **listProjects**
> kotlin.collections.List&lt;Project&gt; listProjects()

List projects 

A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  List all projects associated with your account.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectApi()
try {
    val result : kotlin.collections.List<Project> = apiInstance.listProjects()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#listProjects")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#listProjects")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;Project&gt;**](Project.md)

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

<a name="updateProject"></a>
# **updateProject**
> Project updateProject(projectId, projectCreateRequest)

Update a project 

A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Update your project&#39;s metadata. None of these parameters are required. Just provide the parameters that you would like to update.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectApi()
val projectId : kotlin.String = L3cPm0cJlf5MeDXzGLQJJ4vlzndJCC // kotlin.String | The ID of the project. Created and returned when a project is created.
val projectCreateRequest : ProjectCreateRequest =  // ProjectCreateRequest | 
try {
    val result : Project = apiInstance.updateProject(projectId, projectCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#updateProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#updateProject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| The ID of the project. Created and returned when a project is created. |
 **projectCreateRequest** | [**ProjectCreateRequest**](ProjectCreateRequest.md)|  | [optional]

### Return type

[**Project**](Project.md)

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

<a name="updateProjectDocumentation"></a>
# **updateProjectDocumentation**
> Project updateProjectDocumentation(projectId, version)

Update the project&#39;s documentation 

A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Update your project&#39;s documentation.   Your project&#39;s documentation can only represent *one* version of your API.  Thus, when you call this, the &#x60;current_documentation_version&#x60; attribute of your project is set to the version supplied in the call.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectApi()
val projectId : kotlin.String = L3cPm0cJlf5MeDXzGLQJJ4vlzndJCC // kotlin.String | The ID of the project. Created and returned when a project is created.
val version : kotlin.String = 2 // kotlin.String | The version of the project.
try {
    val result : Project = apiInstance.updateProjectDocumentation(projectId, version)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#updateProjectDocumentation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#updateProjectDocumentation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.String**| The ID of the project. Created and returned when a project is created. |
 **version** | **kotlin.String**| The version of the project. |

### Return type

[**Project**](Project.md)

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

