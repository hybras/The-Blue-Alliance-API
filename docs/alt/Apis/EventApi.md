# EventApi

All URIs are relative to *https://www.thebluealliance.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDistrictEvents**](EventApi.md#getDistrictEvents) | **GET** /district/{district_key}/events | 
[**getDistrictEventsKeys**](EventApi.md#getDistrictEventsKeys) | **GET** /district/{district_key}/events/keys | 
[**getDistrictEventsSimple**](EventApi.md#getDistrictEventsSimple) | **GET** /district/{district_key}/events/simple | 
[**getEvent**](EventApi.md#getEvent) | **GET** /event/{event_key} | 
[**getEventAlliances**](EventApi.md#getEventAlliances) | **GET** /event/{event_key}/alliances | 
[**getEventAwards**](EventApi.md#getEventAwards) | **GET** /event/{event_key}/awards | 
[**getEventDistrictPoints**](EventApi.md#getEventDistrictPoints) | **GET** /event/{event_key}/district_points | 
[**getEventInsights**](EventApi.md#getEventInsights) | **GET** /event/{event_key}/insights | 
[**getEventMatchTimeseries**](EventApi.md#getEventMatchTimeseries) | **GET** /event/{event_key}/matches/timeseries | 
[**getEventMatches**](EventApi.md#getEventMatches) | **GET** /event/{event_key}/matches | 
[**getEventMatchesKeys**](EventApi.md#getEventMatchesKeys) | **GET** /event/{event_key}/matches/keys | 
[**getEventMatchesSimple**](EventApi.md#getEventMatchesSimple) | **GET** /event/{event_key}/matches/simple | 
[**getEventOPRs**](EventApi.md#getEventOPRs) | **GET** /event/{event_key}/oprs | 
[**getEventPredictions**](EventApi.md#getEventPredictions) | **GET** /event/{event_key}/predictions | 
[**getEventRankings**](EventApi.md#getEventRankings) | **GET** /event/{event_key}/rankings | 
[**getEventSimple**](EventApi.md#getEventSimple) | **GET** /event/{event_key}/simple | 
[**getEventTeams**](EventApi.md#getEventTeams) | **GET** /event/{event_key}/teams | 
[**getEventTeamsKeys**](EventApi.md#getEventTeamsKeys) | **GET** /event/{event_key}/teams/keys | 
[**getEventTeamsSimple**](EventApi.md#getEventTeamsSimple) | **GET** /event/{event_key}/teams/simple | 
[**getEventTeamsStatuses**](EventApi.md#getEventTeamsStatuses) | **GET** /event/{event_key}/teams/statuses | 
[**getEventsByYear**](EventApi.md#getEventsByYear) | **GET** /events/{year} | 
[**getEventsByYearKeys**](EventApi.md#getEventsByYearKeys) | **GET** /events/{year}/keys | 
[**getEventsByYearSimple**](EventApi.md#getEventsByYearSimple) | **GET** /events/{year}/simple | 
[**getTeamEventAwards**](EventApi.md#getTeamEventAwards) | **GET** /team/{team_key}/event/{event_key}/awards | 
[**getTeamEventMatches**](EventApi.md#getTeamEventMatches) | **GET** /team/{team_key}/event/{event_key}/matches | 
[**getTeamEventMatchesKeys**](EventApi.md#getTeamEventMatchesKeys) | **GET** /team/{team_key}/event/{event_key}/matches/keys | 
[**getTeamEventMatchesSimple**](EventApi.md#getTeamEventMatchesSimple) | **GET** /team/{team_key}/event/{event_key}/matches/simple | 
[**getTeamEventStatus**](EventApi.md#getTeamEventStatus) | **GET** /team/{team_key}/event/{event_key}/status | 
[**getTeamEvents**](EventApi.md#getTeamEvents) | **GET** /team/{team_key}/events | 
[**getTeamEventsByYear**](EventApi.md#getTeamEventsByYear) | **GET** /team/{team_key}/events/{year} | 
[**getTeamEventsByYearKeys**](EventApi.md#getTeamEventsByYearKeys) | **GET** /team/{team_key}/events/{year}/keys | 
[**getTeamEventsByYearSimple**](EventApi.md#getTeamEventsByYearSimple) | **GET** /team/{team_key}/events/{year}/simple | 
[**getTeamEventsKeys**](EventApi.md#getTeamEventsKeys) | **GET** /team/{team_key}/events/keys | 
[**getTeamEventsSimple**](EventApi.md#getTeamEventsSimple) | **GET** /team/{team_key}/events/simple | 
[**getTeamEventsStatusesByYear**](EventApi.md#getTeamEventsStatusesByYear) | **GET** /team/{team_key}/events/{year}/statuses | 


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

<a name="getEvent"></a>
# **getEvent**
> Event getEvent(eventKey, ifModifiedSince)



    Gets an Event.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**Event**](/Models/Event.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getEventAlliances"></a>
# **getEventAlliances**
> List getEventAlliances(eventKey, ifModifiedSince)



    Gets a list of Elimination Alliances for the given Event.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Elimination_Alliance.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getEventAwards"></a>
# **getEventAwards**
> List getEventAwards(eventKey, ifModifiedSince)



    Gets a list of awards from the given event.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Award.md)

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

<a name="getEventInsights"></a>
# **getEventInsights**
> Event_Insights getEventInsights(eventKey, ifModifiedSince)



    Gets a set of Event-specific insights for the given Event.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**Event_Insights**](/Models/Event_Insights.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

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

<a name="getEventOPRs"></a>
# **getEventOPRs**
> Event_OPRs getEventOPRs(eventKey, ifModifiedSince)



    Gets a set of Event OPRs (including OPR, DPR, and CCWM) for the given Event.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**Event_OPRs**](/Models/Event_OPRs.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getEventPredictions"></a>
# **getEventPredictions**
> Object getEventPredictions(eventKey, ifModifiedSince)



    Gets information on TBA-generated predictions for the given Event. Contains year-specific information. *WARNING* This endpoint is currently under development and may change at any time.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**Object**](/Models/object.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getEventRankings"></a>
# **getEventRankings**
> Event_Ranking getEventRankings(eventKey, ifModifiedSince)



    Gets a list of team rankings for the Event.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**Event_Ranking**](/Models/Event_Ranking.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getEventSimple"></a>
# **getEventSimple**
> Event_Simple getEventSimple(eventKey, ifModifiedSince)



    Gets a short-form Event.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**Event_Simple**](/Models/Event_Simple.md)

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

<a name="getTeamEventAwards"></a>
# **getTeamEventAwards**
> List getTeamEventAwards(teamKey, eventKey, ifModifiedSince)



    Gets a list of awards the given team won at the given event.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; | [default to null]
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Award.md)

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

<a name="getTeamEventStatus"></a>
# **getTeamEventStatus**
> Team_Event_Status getTeamEventStatus(teamKey, eventKey, ifModifiedSince)



    Gets the competition rank and status of the team at the given event.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; | [default to null]
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**Team_Event_Status**](/Models/Team_Event_Status.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeamEvents"></a>
# **getTeamEvents**
> List getTeamEvents(teamKey, ifModifiedSince)



    Gets a list of all events this team has competed at.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Event.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeamEventsByYear"></a>
# **getTeamEventsByYear**
> List getTeamEventsByYear(teamKey, year, ifModifiedSince)



    Gets a list of events this team has competed at in the given year.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; | [default to null]
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Event.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeamEventsByYearKeys"></a>
# **getTeamEventsByYearKeys**
> List getTeamEventsByYearKeys(teamKey, year, ifModifiedSince)



    Gets a list of the event keys for events this team has competed at in the given year.

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

<a name="getTeamEventsByYearSimple"></a>
# **getTeamEventsByYearSimple**
> List getTeamEventsByYearSimple(teamKey, year, ifModifiedSince)



    Gets a short-form list of events this team has competed at in the given year.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; | [default to null]
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Event_Simple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeamEventsKeys"></a>
# **getTeamEventsKeys**
> List getTeamEventsKeys(teamKey, ifModifiedSince)



    Gets a list of the event keys for all events this team has competed at.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/string.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeamEventsSimple"></a>
# **getTeamEventsSimple**
> List getTeamEventsSimple(teamKey, ifModifiedSince)



    Gets a short-form list of all events this team has competed at.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; | [default to null]
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

