
# Project

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**projectId** | **kotlin.String** | The ID of the project. This is auto-generated upon project creation and cannot currently be changed.  |  [optional]
**projectName** | **kotlin.String** | The name of the mini-API. This will be shown at the top of the mini-API&#39;s documentation.  |  [optional]
**projectDescription** | **kotlin.String** | The description of the mini-API. This will be shown at the top of the mini-API&#39;s documentation, below the title.  |  [optional]
**contactEmail** | **kotlin.String** | The email where users of your mini-API can contact you. This will be shown at the top of the mini-API&#39;s documentation.  |  [optional]
**currentDocumentationVersion** | **kotlin.String** | The version of the API that the documentation is updated for. You can set the documentation version to any valid version. To see how to format the version string, see the description for &#x60;versions&#x60;.  |  [optional]
**versions** | **kotlin.collections.List&lt;kotlin.String&gt;** | The live versions of the project. An array of strings. We use Python&#39;s &#x60;version&#x60; package to see if it&#39;s a valid version and to compare versions (to see which is higher).  Read more about this Python package &lt;a href&#x3D;\&quot;https://packaging.pypa.io/en/latest/version.html#packaging.version.parse\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. |  [optional]
**groups** | [**kotlin.collections.List&lt;Group&gt;**](Group.md) | A list of groups. A section contains groups, and groups contain API endpoints.   |  [optional]
**endpoints** | [**kotlin.collections.List&lt;Endpoint&gt;**](Endpoint.md) | A list of groups. A section contains groups, and groups contain API endpoints.   |  [optional]



