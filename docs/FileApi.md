# FileApi

All URIs are relative to *https://api.blockchainapi.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**uploadFile**](FileApi.md#uploadFile) | **POST** /file | Upload a file


<a name="uploadFile"></a>
# **uploadFile**
> GetFileResponse uploadFile()

Upload a file

Easily upload a file to any of IPFS, Arweave, and Filecoin. Not publicly available. Please sign up for &lt;a href&#x3D;\&quot;https://forms.gle/N4KSqcptpSrHQ1427\&quot; target&#x3D;\&quot;_blank\&quot;&gt;the waitlist&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FileApi()
try {
    val result : GetFileResponse = apiInstance.uploadFile()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileApi#uploadFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileApi#uploadFile")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetFileResponse**](GetFileResponse.md)

### Authorization


Configure APIKeyID:
    ApiClient.apiKey["APIKeyID"] = ""
    ApiClient.apiKeyPrefix["APIKeyID"] = ""
Configure APISecretKey:
    ApiClient.apiKey["APISecretKey"] = ""
    ApiClient.apiKeyPrefix["APISecretKey"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data, application/json
 - **Accept**: application/json

