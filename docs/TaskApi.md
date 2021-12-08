# TaskApi

All URIs are relative to *https://api.theblockchainapi.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTask**](TaskApi.md#getTask) | **GET** /task/{task_id} | Get the result of a task


<a name="getTask"></a>
# **getTask**
> Task getTask(taskId)

Get the result of a task

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-candy-machine/mint-from-candy-machine\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Get the result of a task. Replace &#x60;task_id&#x60; with the ID of your task.  &#x60;Cost: 1 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaskApi()
val taskId : kotlin.String = taskId_example // kotlin.String | The ID of the task
try {
    val result : Task = apiInstance.getTask(taskId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskApi#getTask")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskApi#getTask")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **kotlin.String**| The ID of the task |

### Return type

[**Task**](Task.md)

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

