# TeamApi

All URIs are relative to *https://www.thebluealliance.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDistrictRankings**](TeamApi.md#getDistrictRankings) | **GET** /district/{district_key}/rankings | 
[**getDistrictTeams**](TeamApi.md#getDistrictTeams) | **GET** /district/{district_key}/teams | 
[**getDistrictTeamsKeys**](TeamApi.md#getDistrictTeamsKeys) | **GET** /district/{district_key}/teams/keys | 
[**getDistrictTeamsSimple**](TeamApi.md#getDistrictTeamsSimple) | **GET** /district/{district_key}/teams/simple | 
[**getEventTeams**](TeamApi.md#getEventTeams) | **GET** /event/{event_key}/teams | 
[**getEventTeamsKeys**](TeamApi.md#getEventTeamsKeys) | **GET** /event/{event_key}/teams/keys | 
[**getEventTeamsSimple**](TeamApi.md#getEventTeamsSimple) | **GET** /event/{event_key}/teams/simple | 
[**getEventTeamsStatuses**](TeamApi.md#getEventTeamsStatuses) | **GET** /event/{event_key}/teams/statuses | 
[**getTeam**](TeamApi.md#getTeam) | **GET** /team/{team_key} | 
[**getTeamAwards**](TeamApi.md#getTeamAwards) | **GET** /team/{team_key}/awards | 
[**getTeamAwardsByYear**](TeamApi.md#getTeamAwardsByYear) | **GET** /team/{team_key}/awards/{year} | 
[**getTeamDistricts**](TeamApi.md#getTeamDistricts) | **GET** /team/{team_key}/districts | 
[**getTeamEventAwards**](TeamApi.md#getTeamEventAwards) | **GET** /team/{team_key}/event/{event_key}/awards | 
[**getTeamEventMatches**](TeamApi.md#getTeamEventMatches) | **GET** /team/{team_key}/event/{event_key}/matches | 
[**getTeamEventMatchesKeys**](TeamApi.md#getTeamEventMatchesKeys) | **GET** /team/{team_key}/event/{event_key}/matches/keys | 
[**getTeamEventMatchesSimple**](TeamApi.md#getTeamEventMatchesSimple) | **GET** /team/{team_key}/event/{event_key}/matches/simple | 
[**getTeamEventStatus**](TeamApi.md#getTeamEventStatus) | **GET** /team/{team_key}/event/{event_key}/status | 
[**getTeamEvents**](TeamApi.md#getTeamEvents) | **GET** /team/{team_key}/events | 
[**getTeamEventsByYear**](TeamApi.md#getTeamEventsByYear) | **GET** /team/{team_key}/events/{year} | 
[**getTeamEventsByYearKeys**](TeamApi.md#getTeamEventsByYearKeys) | **GET** /team/{team_key}/events/{year}/keys | 
[**getTeamEventsByYearSimple**](TeamApi.md#getTeamEventsByYearSimple) | **GET** /team/{team_key}/events/{year}/simple | 
[**getTeamEventsKeys**](TeamApi.md#getTeamEventsKeys) | **GET** /team/{team_key}/events/keys | 
[**getTeamEventsSimple**](TeamApi.md#getTeamEventsSimple) | **GET** /team/{team_key}/events/simple | 
[**getTeamEventsStatusesByYear**](TeamApi.md#getTeamEventsStatusesByYear) | **GET** /team/{team_key}/events/{year}/statuses | 
[**getTeamMatchesByYear**](TeamApi.md#getTeamMatchesByYear) | **GET** /team/{team_key}/matches/{year} | 
[**getTeamMatchesByYearKeys**](TeamApi.md#getTeamMatchesByYearKeys) | **GET** /team/{team_key}/matches/{year}/keys | 
[**getTeamMatchesByYearSimple**](TeamApi.md#getTeamMatchesByYearSimple) | **GET** /team/{team_key}/matches/{year}/simple | 
[**getTeamMediaByTag**](TeamApi.md#getTeamMediaByTag) | **GET** /team/{team_key}/media/tag/{media_tag} | 
[**getTeamMediaByTagYear**](TeamApi.md#getTeamMediaByTagYear) | **GET** /team/{team_key}/media/tag/{media_tag}/{year} | 
[**getTeamMediaByYear**](TeamApi.md#getTeamMediaByYear) | **GET** /team/{team_key}/media/{year} | 
[**getTeamRobots**](TeamApi.md#getTeamRobots) | **GET** /team/{team_key}/robots | 
[**getTeamSimple**](TeamApi.md#getTeamSimple) | **GET** /team/{team_key}/simple | 
[**getTeamSocialMedia**](TeamApi.md#getTeamSocialMedia) | **GET** /team/{team_key}/social_media | 
[**getTeamYearsParticipated**](TeamApi.md#getTeamYearsParticipated) | **GET** /team/{team_key}/years_participated | 
[**getTeams**](TeamApi.md#getTeams) | **GET** /teams/{page_num} | 
[**getTeamsByYear**](TeamApi.md#getTeamsByYear) | **GET** /teams/{year}/{page_num} | 
[**getTeamsByYearKeys**](TeamApi.md#getTeamsByYearKeys) | **GET** /teams/{year}/{page_num}/keys | 
[**getTeamsByYearSimple**](TeamApi.md#getTeamsByYearSimple) | **GET** /teams/{year}/{page_num}/simple | 
[**getTeamsKeys**](TeamApi.md#getTeamsKeys) | **GET** /teams/{page_num}/keys | 
[**getTeamsSimple**](TeamApi.md#getTeamsSimple) | **GET** /teams/{page_num}/simple | 


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

<a name="getTeam"></a>
# **getTeam**
> Team getTeam(teamKey, ifModifiedSince)



    Gets a &#x60;Team&#x60; object for the team referenced by the given key.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**Team**](/Models/Team.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeamAwards"></a>
# **getTeamAwards**
> List getTeamAwards(teamKey, ifModifiedSince)



    Gets a list of awards the given team has won.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Award.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeamAwardsByYear"></a>
# **getTeamAwardsByYear**
> List getTeamAwardsByYear(teamKey, year, ifModifiedSince)



    Gets a list of awards the given team has won in a given year.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; | [default to null]
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Award.md)

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

<a name="getTeamMediaByTag"></a>
# **getTeamMediaByTag**
> List getTeamMediaByTag(teamKey, mediaTag, ifModifiedSince)



    Gets a list of Media (videos / pictures) for the given team and tag.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; | [default to null]
 **mediaTag** | **String**| Media Tag which describes the Media. | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Media.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeamMediaByTagYear"></a>
# **getTeamMediaByTagYear**
> List getTeamMediaByTagYear(teamKey, mediaTag, year, ifModifiedSince)



    Gets a list of Media (videos / pictures) for the given team, tag and year.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; | [default to null]
 **mediaTag** | **String**| Media Tag which describes the Media. | [default to null]
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Media.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeamMediaByYear"></a>
# **getTeamMediaByYear**
> List getTeamMediaByYear(teamKey, year, ifModifiedSince)



    Gets a list of Media (videos / pictures) for the given team and year.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; | [default to null]
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Media.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeamRobots"></a>
# **getTeamRobots**
> List getTeamRobots(teamKey, ifModifiedSince)



    Gets a list of year and robot name pairs for each year that a robot name was provided. Will return an empty array if the team has never named a robot.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Team_Robot.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeamSimple"></a>
# **getTeamSimple**
> Team_Simple getTeamSimple(teamKey, ifModifiedSince)



    Gets a &#x60;Team_Simple&#x60; object for the team referenced by the given key.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**Team_Simple**](/Models/Team_Simple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeamSocialMedia"></a>
# **getTeamSocialMedia**
> List getTeamSocialMedia(teamKey, ifModifiedSince)



    Gets a list of Media (social media) for the given team.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/Media.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTeamYearsParticipated"></a>
# **getTeamYearsParticipated**
> List getTeamYearsParticipated(teamKey, ifModifiedSince)



    Gets a list of years in which the team participated in at least one competition.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; | [default to null]
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**List**](/Models/integer.md)

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

