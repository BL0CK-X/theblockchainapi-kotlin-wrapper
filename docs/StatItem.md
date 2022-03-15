
# StatItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uid** | **kotlin.String** | The anonymous ID of the user who called your endpoint  |  [optional]
**timeStamp** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The time stamp of the ten-minute interval  |  [optional]
**endpointId** | **kotlin.String** | The full path of the endpoint (e.g., &#x60;project_id&#x60;/&#x60;version&#x60;/&#x60;path&#x60;)  |  [optional]
**apiCalls** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The number of API calls by this user to this endpoint for the ten-minute interval  |  [optional]
**version** | **kotlin.String** | The version of the endpoint |  [optional]
**path** | **kotlin.String** | The path of the endpoint (not inclusive of the &#x60;version&#x60; or &#x60;project_id&#x60;) |  [optional]



