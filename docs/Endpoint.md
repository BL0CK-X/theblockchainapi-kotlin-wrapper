
# Endpoint

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**projectId** | **kotlin.String** | The ID of the project. This is auto-generated upon project creation and cannot currently be changed.  | 
**version** | **kotlin.String** | The project version under which the endpoint exists  | 
**path** | **kotlin.String** | The path of the endpoint  | 
**operationId** | **kotlin.String** | The operation ID of the endpoint.  | 
**readableName** | **kotlin.String** | The name of the endpoint formatted in a readable way (e.g., Get Endpoint Metadata).  | 
**credits** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The price of the endpoint. Valid values are integers from 1 to 100.  | 
**inputSpecification** | [**kotlin.collections.List&lt;ParameterSpecification&gt;**](ParameterSpecification.md) | A list of dictionaries. Each dictionary describes one parameter for the input, including the name, type, required boolean, and description values of that parameter. | 
**inputExamples** | [**kotlin.Any**](.md) | An example of the JSON input that a user might send. Limited to one example currently.  | 
**outputSpecification** | [**kotlin.collections.List&lt;ParameterSpecification&gt;**](ParameterSpecification.md) | A list of dictionaries. Each dictionary describes one parameter for the input, including the name, type, required boolean, and description values of that parameter. | 
**outputExamples** | [**kotlin.Any**](.md) | An example of the JSON output that a user might send. Limited to one example currently.  | 
**summary** | **kotlin.String** | The summary of the endpoint to be displayed in the sidebar on the left of the mini-API&#39;s documentation  |  [optional]
**description** | **kotlin.String** | A description of what the endpoint does. This will be shown in the mini-API documentation.  |  [optional]
**groupName** | **kotlin.String** | The name of the group of endpoints that the endpoint comes from  |  [optional]



