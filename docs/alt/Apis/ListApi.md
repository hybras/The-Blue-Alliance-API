# ListApi

All URIs are relative to *https://www.thebluealliance.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDistrictEvents**](ListApi.md#getDistrictEvents) | **GET** /district/{district_key}/events | 
[**getDistrictEventsKeys**](ListApi.md#getDistrictEventsKeys) | **GET** /district/{district_key}/events/keys | 
[**getDistrictEventsSimple**](ListApi.md#getDistrictEventsSimple) | **GET** /district/{district_key}/events/simple | 
[**getDistrictRankings**](ListApi.md#getDistrictRankings) | **GET** /district/{district_key}/rankings | 
[**getDistrictTeams**](ListApi.md#getDistrictTeams) | **GET** /district/{district_key}/teams | 
[**getDistrictTeamsKeys**](ListApi.md#getDistrictTeamsKeys) | **GET** /district/{district_key}/teams/keys | 
[**getDistrictTeamsSimple**](ListApi.md#getDistrictTeamsSimple) | **GET** /district/{district_key}/teams/simple | 
[**getEventTeams**](ListApi.md#getEventTeams) | **GET** /event/{event_key}/teams | 
[**getEventTeamsKeys**](ListApi.md#getEventTeamsKeys) | **GET** /event/{event_key}/teams/keys | 
[**getEventTeamsSimple**](ListApi.md#getEventTeamsSimple) | **GET** /event/{event_key}/teams/simple | 
[**getEventTeamsStatuses**](ListApi.md#getEventTeamsStatuses) | **GET** /event/{event_key}/teams/statuses | 
[**getEventsByYear**](ListApi.md#getEventsByYear) | **GET** /events/{year} | 
[**getEventsByYearKeys**](ListApi.md#getEventsByYearKeys) | **GET** /events/{year}/keys | 
[**getEventsByYearSimple**](ListApi.md#getEventsByYearSimple) | **GET** /events/{year}/simple | 
[**getTeamEventsStatusesByYear**](ListApi.md#getTeamEventsStatusesByYear) | **GET** /team/{team_key}/events/{year}/statuses | 
[**getTeams**](ListApi.md#getTeams) | **GET** /teams/{page_num} | 
[**getTeamsByYear**](ListApi.md#getTeamsByYear) | **GET** /teams/{year}/{page_num} | 
[**getTeamsByYearKeys**](ListApi.md#getTeamsByYearKeys) | **GET** /teams/{year}/{page_num}/keys | 
[**getTeamsByYearSimple**](ListApi.md#getTeamsByYearSimple) | **GET** /teams/{year}/{page_num}/simple | 
[**getTeamsKeys**](ListApi.md#getTeamsKeys) | **GET** /teams/{page_num}/keys | 
[**getTeamsSimple**](ListApi.md#getTeamsSimple) | **GET** /teams/{page_num}/simple | 


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

<a name="getEventTeams"></a>
# **getEventTeams**
> List getEventTeams(eventKey, ifModifiedSince)



    Gets a list of &#x60;Team&#x60; objects that competed in the given event.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Team.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getEventTeamsKeys"></a>
# **getEventTeamsKeys**
> List getEventTeamsKeys(eventKey, ifModifiedSince)



    Gets a list of &#x60;Team&#x60; keys that competed in the given event.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/string.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getEventTeamsSimple"></a>
# **getEventTeamsSimple**
> List getEventTeamsSimple(eventKey, ifModifiedSince)



    Gets a short-form list of &#x60;Team&#x60; objects that competed in the given event.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Team_Simple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getEventTeamsStatuses"></a>
# **getEventTeamsStatuses**
> Map getEventTeamsStatuses(eventKey, ifModifiedSince)



    Gets a key-value list of the event statuses for teams competing at the given event.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**Map**](/Models/Team_Event_Status.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getEventsByYear"></a>
# **getEventsByYear**
> List getEventsByYear(year, ifModifiedSince)



    Gets a list of events in the given year.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Event.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getEventsByYearKeys"></a>
# **getEventsByYearKeys**
> List getEventsByYearKeys(year, ifModifiedSince)



    Gets a list of event keys in the given year.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/string.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getEventsByYearSimple"></a>
# **getEventsByYearSimple**
> List getEventsByYearSimple(year, ifModifiedSince)



    Gets a short-form list of events in the given year.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Event_Simple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeamEventsStatusesByYear"></a>
# **getTeamEventsStatusesByYear**
> Map getTeamEventsStatusesByYear(teamKey, year, ifModifiedSince)



    Gets a key-value list of the event statuses for events this team has competed at in the given year.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; | [default to null]
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**Map**](/Models/Team_Event_Status.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeams"></a>
# **getTeams**
> List getTeams(pageNum, ifModifiedSince)



    Gets a list of &#x60;Team&#x60; objects, paginated in groups of 500.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNum** | **Integer**| Page number of results to return, zero-indexed | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Team.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeamsByYear"></a>
# **getTeamsByYear**
> List getTeamsByYear(year, pageNum, ifModifiedSince)



    Gets a list of &#x60;Team&#x60; objects that competed in the given year, paginated in groups of 500.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. | [default to null]
 **pageNum** | **Integer**| Page number of results to return, zero-indexed | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Team.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeamsByYearKeys"></a>
# **getTeamsByYearKeys**
> List getTeamsByYearKeys(year, pageNum, ifModifiedSince)



    Gets a list Team Keys that competed in the given year, paginated in groups of 500.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. | [default to null]
 **pageNum** | **Integer**| Page number of results to return, zero-indexed | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/string.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeamsByYearSimple"></a>
# **getTeamsByYearSimple**
> List getTeamsByYearSimple(year, pageNum, ifModifiedSince)



    Gets a list of short form &#x60;Team_Simple&#x60; objects that competed in the given year, paginated in groups of 500.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. | [default to null]
 **pageNum** | **Integer**| Page number of results to return, zero-indexed | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Team_Simple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeamsKeys"></a>
# **getTeamsKeys**
> List getTeamsKeys(pageNum, ifModifiedSince)



    Gets a list of Team keys, paginated in groups of 500. (Note, each page will not have 500 teams, but will include the teams within that range of 500.)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNum** | **Integer**| Page number of results to return, zero-indexed | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/string.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeamsSimple"></a>
# **getTeamsSimple**
> List getTeamsSimple(pageNum, ifModifiedSince)



    Gets a list of short form &#x60;Team_Simple&#x60; objects, paginated in groups of 500.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNum** | **Integer**| Page number of results to return, zero-indexed | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Team_Simple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

