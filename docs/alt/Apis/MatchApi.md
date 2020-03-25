# MatchApi

All URIs are relative to *https://www.thebluealliance.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEventMatchTimeseries**](MatchApi.md#getEventMatchTimeseries) | **GET** /event/{event_key}/matches/timeseries | 
[**getEventMatches**](MatchApi.md#getEventMatches) | **GET** /event/{event_key}/matches | 
[**getEventMatchesKeys**](MatchApi.md#getEventMatchesKeys) | **GET** /event/{event_key}/matches/keys | 
[**getEventMatchesSimple**](MatchApi.md#getEventMatchesSimple) | **GET** /event/{event_key}/matches/simple | 
[**getMatch**](MatchApi.md#getMatch) | **GET** /match/{match_key} | 
[**getMatchSimple**](MatchApi.md#getMatchSimple) | **GET** /match/{match_key}/simple | 
[**getMatchTimeseries**](MatchApi.md#getMatchTimeseries) | **GET** /match/{match_key}/timeseries | 
[**getMatchZebra**](MatchApi.md#getMatchZebra) | **GET** /match/{match_key}/zebra_motionworks | 
[**getTeamEventMatches**](MatchApi.md#getTeamEventMatches) | **GET** /team/{team_key}/event/{event_key}/matches | 
[**getTeamEventMatchesKeys**](MatchApi.md#getTeamEventMatchesKeys) | **GET** /team/{team_key}/event/{event_key}/matches/keys | 
[**getTeamEventMatchesSimple**](MatchApi.md#getTeamEventMatchesSimple) | **GET** /team/{team_key}/event/{event_key}/matches/simple | 
[**getTeamMatchesByYear**](MatchApi.md#getTeamMatchesByYear) | **GET** /team/{team_key}/matches/{year} | 
[**getTeamMatchesByYearKeys**](MatchApi.md#getTeamMatchesByYearKeys) | **GET** /team/{team_key}/matches/{year}/keys | 
[**getTeamMatchesByYearSimple**](MatchApi.md#getTeamMatchesByYearSimple) | **GET** /team/{team_key}/matches/{year}/simple | 


<a name="getEventMatchTimeseries"></a>
# **getEventMatchTimeseries**
> List getEventMatchTimeseries(eventKey, ifModifiedSince)



    Gets an array of Match Keys for the given event key that have timeseries data. Returns an empty array if no matches have timeseries data. *WARNING:* This is *not* official data, and is subject to a significant possibility of error, or missing data. Do not rely on this data for any purpose. In fact, pretend we made it up. *WARNING:* This endpoint and corresponding data models are under *active development* and may change at any time, including in breaking ways.

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

<a name="getEventMatches"></a>
# **getEventMatches**
> List getEventMatches(eventKey, ifModifiedSince)



    Gets a list of matches for the given event.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Match.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getEventMatchesKeys"></a>
# **getEventMatchesKeys**
> List getEventMatchesKeys(eventKey, ifModifiedSince)



    Gets a list of match keys for the given event.

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

<a name="getEventMatchesSimple"></a>
# **getEventMatchesSimple**
> List getEventMatchesSimple(eventKey, ifModifiedSince)



    Gets a short-form list of matches for the given event.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Match_Simple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getMatch"></a>
# **getMatch**
> Match getMatch(matchKey, ifModifiedSince)



    Gets a &#x60;Match&#x60; object for the given match key.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchKey** | **String**| TBA Match Key, eg &#x60;2016nytr_qm1&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**Match**](/Models/Match.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getMatchSimple"></a>
# **getMatchSimple**
> Match_Simple getMatchSimple(matchKey, ifModifiedSince)



    Gets a short-form &#x60;Match&#x60; object for the given match key.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchKey** | **String**| TBA Match Key, eg &#x60;2016nytr_qm1&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**Match_Simple**](/Models/Match_Simple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getMatchTimeseries"></a>
# **getMatchTimeseries**
> List getMatchTimeseries(matchKey, ifModifiedSince)



    Gets an array of game-specific Match Timeseries objects for the given match key or an empty array if not available. *WARNING:* This is *not* official data, and is subject to a significant possibility of error, or missing data. Do not rely on this data for any purpose. In fact, pretend we made it up. *WARNING:* This endpoint and corresponding data models are under *active development* and may change at any time, including in breaking ways.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchKey** | **String**| TBA Match Key, eg &#x60;2016nytr_qm1&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/object.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getMatchZebra"></a>
# **getMatchZebra**
> Zebra getMatchZebra(matchKey, ifModifiedSince)



    Gets Zebra MotionWorks data for a Match for the given match key.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchKey** | **String**| TBA Match Key, eg &#x60;2016nytr_qm1&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**Zebra**](/Models/Zebra.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeamEventMatches"></a>
# **getTeamEventMatches**
> List getTeamEventMatches(teamKey, eventKey, ifModifiedSince)



    Gets a list of matches for the given team and event.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; | [default to null]
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Match.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeamEventMatchesKeys"></a>
# **getTeamEventMatchesKeys**
> List getTeamEventMatchesKeys(teamKey, eventKey, ifModifiedSince)



    Gets a list of match keys for matches for the given team and event.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; | [default to null]
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/string.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeamEventMatchesSimple"></a>
# **getTeamEventMatchesSimple**
> List getTeamEventMatchesSimple(teamKey, eventKey, ifModifiedSince)



    Gets a short-form list of matches for the given team and event.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; | [default to null]
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Match.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeamMatchesByYear"></a>
# **getTeamMatchesByYear**
> List getTeamMatchesByYear(teamKey, year, ifModifiedSince)



    Gets a list of matches for the given team and year.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; | [default to null]
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Match.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeamMatchesByYearKeys"></a>
# **getTeamMatchesByYearKeys**
> List getTeamMatchesByYearKeys(teamKey, year, ifModifiedSince)



    Gets a list of match keys for matches for the given team and year.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; | [default to null]
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/string.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeamMatchesByYearSimple"></a>
# **getTeamMatchesByYearSimple**
> List getTeamMatchesByYearSimple(teamKey, year, ifModifiedSince)



    Gets a short-form list of matches for the given team and year.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; | [default to null]
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Match_Simple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

