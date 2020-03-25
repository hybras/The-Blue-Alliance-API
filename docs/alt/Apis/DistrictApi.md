# DistrictApi

All URIs are relative to *https://www.thebluealliance.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDistrictEvents**](DistrictApi.md#getDistrictEvents) | **GET** /district/{district_key}/events | 
[**getDistrictEventsKeys**](DistrictApi.md#getDistrictEventsKeys) | **GET** /district/{district_key}/events/keys | 
[**getDistrictEventsSimple**](DistrictApi.md#getDistrictEventsSimple) | **GET** /district/{district_key}/events/simple | 
[**getDistrictRankings**](DistrictApi.md#getDistrictRankings) | **GET** /district/{district_key}/rankings | 
[**getDistrictTeams**](DistrictApi.md#getDistrictTeams) | **GET** /district/{district_key}/teams | 
[**getDistrictTeamsKeys**](DistrictApi.md#getDistrictTeamsKeys) | **GET** /district/{district_key}/teams/keys | 
[**getDistrictTeamsSimple**](DistrictApi.md#getDistrictTeamsSimple) | **GET** /district/{district_key}/teams/simple | 
[**getDistrictsByYear**](DistrictApi.md#getDistrictsByYear) | **GET** /districts/{year} | 
[**getEventDistrictPoints**](DistrictApi.md#getEventDistrictPoints) | **GET** /event/{event_key}/district_points | 
[**getTeamDistricts**](DistrictApi.md#getTeamDistricts) | **GET** /team/{team_key}/districts | 


<a name="getDistrictEvents"></a>
# **getDistrictEvents**
> List getDistrictEvents(districtKey, ifModifiedSince)



    Gets a list of events in the given district.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **districtKey** | **String**| TBA District Key, eg &#x60;2016fim&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Event.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getDistrictEventsKeys"></a>
# **getDistrictEventsKeys**
> List getDistrictEventsKeys(districtKey, ifModifiedSince)



    Gets a list of event keys for events in the given district.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **districtKey** | **String**| TBA District Key, eg &#x60;2016fim&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/string.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getDistrictEventsSimple"></a>
# **getDistrictEventsSimple**
> List getDistrictEventsSimple(districtKey, ifModifiedSince)



    Gets a short-form list of events in the given district.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **districtKey** | **String**| TBA District Key, eg &#x60;2016fim&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Event_Simple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getDistrictRankings"></a>
# **getDistrictRankings**
> List getDistrictRankings(districtKey, ifModifiedSince)



    Gets a list of team district rankings for the given district.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **districtKey** | **String**| TBA District Key, eg &#x60;2016fim&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/District_Ranking.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getDistrictTeams"></a>
# **getDistrictTeams**
> List getDistrictTeams(districtKey, ifModifiedSince)



    Gets a list of &#x60;Team&#x60; objects that competed in events in the given district.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **districtKey** | **String**| TBA District Key, eg &#x60;2016fim&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Team.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getDistrictTeamsKeys"></a>
# **getDistrictTeamsKeys**
> List getDistrictTeamsKeys(districtKey, ifModifiedSince)



    Gets a list of &#x60;Team&#x60; objects that competed in events in the given district.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **districtKey** | **String**| TBA District Key, eg &#x60;2016fim&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/string.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getDistrictTeamsSimple"></a>
# **getDistrictTeamsSimple**
> List getDistrictTeamsSimple(districtKey, ifModifiedSince)



    Gets a short-form list of &#x60;Team&#x60; objects that competed in events in the given district.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **districtKey** | **String**| TBA District Key, eg &#x60;2016fim&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Team_Simple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getDistrictsByYear"></a>
# **getDistrictsByYear**
> List getDistrictsByYear(year, ifModifiedSince)



    Gets a list of districts and their corresponding district key, for the given year.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/District_List.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getEventDistrictPoints"></a>
# **getEventDistrictPoints**
> Event_District_Points getEventDistrictPoints(eventKey, ifModifiedSince)



    Gets a list of team rankings for the Event.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**Event_District_Points**](/Models/Event_District_Points.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeamDistricts"></a>
# **getTeamDistricts**
> List getTeamDistricts(teamKey, ifModifiedSince)



    Gets an array of districts representing each year the team was in a district. Will return an empty array if the team was never in a district.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/District_List.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

