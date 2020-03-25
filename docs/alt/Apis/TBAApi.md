# TBAApi

All URIs are relative to *https://www.thebluealliance.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStatus**](TBAApi.md#getStatus) | **GET** /status | 


<a name="getStatus"></a>
# **getStatus**
> API_Status getStatus(ifModifiedSince)



    Returns API status, and TBA status information.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**API_Status**](/Models/API_Status.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

