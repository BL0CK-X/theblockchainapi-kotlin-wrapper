
# NFTAnalyticsRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mintAddresses** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of mint addresses. Each address must be a valid public key. | 
**startTime** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Response will not include transactions before &#x60;start_time&#x60;. Set this to &#x60;-1&#x60; in order to get the entire history we have stored.  |  [optional]
**endTime** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Response will not include transactions after &#x60;end_time&#x60;   |  [optional]



