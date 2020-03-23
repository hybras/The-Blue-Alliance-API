# EventApi

All URIs are relative to *<https://www.thebluealliance.com/api/v3>*

| Method                                                                     | HTTP request                                              | Description |
| -------------------------------------------------------------------------- | --------------------------------------------------------- | ----------- |
| [**getDistrictEvents**](EventApi.md#getDistrictEvents)                     | **GET** /district/{district_key}/events                   |
| [**getDistrictEventsKeys**](EventApi.md#getDistrictEventsKeys)             | **GET** /district/{district_key}/events/keys              |
| [**getDistrictEventsSimple**](EventApi.md#getDistrictEventsSimple)         | **GET** /district/{district_key}/events/simple            |
| [**getEvent**](EventApi.md#getEvent)                                       | **GET** /event/{event_key}                                |
| [**getEventAlliances**](EventApi.md#getEventAlliances)                     | **GET** /event/{event_key}/alliances                      |
| [**getEventAwards**](EventApi.md#getEventAwards)                           | **GET** /event/{event_key}/awards                         |
| [**getEventDistrictPoints**](EventApi.md#getEventDistrictPoints)           | **GET** /event/{event_key}/district_points                |
| [**getEventInsights**](EventApi.md#getEventInsights)                       | **GET** /event/{event_key}/insights                       |
| [**getEventMatchTimeseries**](EventApi.md#getEventMatchTimeseries)         | **GET** /event/{event_key}/matches/timeseries             |
| [**getEventMatches**](EventApi.md#getEventMatches)                         | **GET** /event/{event_key}/matches                        |
| [**getEventMatchesKeys**](EventApi.md#getEventMatchesKeys)                 | **GET** /event/{event_key}/matches/keys                   |
| [**getEventMatchesSimple**](EventApi.md#getEventMatchesSimple)             | **GET** /event/{event_key}/matches/simple                 |
| [**getEventOPRs**](EventApi.md#getEventOPRs)                               | **GET** /event/{event_key}/oprs                           |
| [**getEventPredictions**](EventApi.md#getEventPredictions)                 | **GET** /event/{event_key}/predictions                    |
| [**getEventRankings**](EventApi.md#getEventRankings)                       | **GET** /event/{event_key}/rankings                       |
| [**getEventSimple**](EventApi.md#getEventSimple)                           | **GET** /event/{event_key}/simple                         |
| [**getEventTeams**](EventApi.md#getEventTeams)                             | **GET** /event/{event_key}/teams                          |
| [**getEventTeamsKeys**](EventApi.md#getEventTeamsKeys)                     | **GET** /event/{event_key}/teams/keys                     |
| [**getEventTeamsSimple**](EventApi.md#getEventTeamsSimple)                 | **GET** /event/{event_key}/teams/simple                   |
| [**getEventTeamsStatuses**](EventApi.md#getEventTeamsStatuses)             | **GET** /event/{event_key}/teams/statuses                 |
| [**getEventsByYear**](EventApi.md#getEventsByYear)                         | **GET** /events/{year}                                    |
| [**getEventsByYearKeys**](EventApi.md#getEventsByYearKeys)                 | **GET** /events/{year}/keys                               |
| [**getEventsByYearSimple**](EventApi.md#getEventsByYearSimple)             | **GET** /events/{year}/simple                             |
| [**getTeamEventAwards**](EventApi.md#getTeamEventAwards)                   | **GET** /team/{team_key}/event/{event_key}/awards         |
| [**getTeamEventMatches**](EventApi.md#getTeamEventMatches)                 | **GET** /team/{team_key}/event/{event_key}/matches        |
| [**getTeamEventMatchesKeys**](EventApi.md#getTeamEventMatchesKeys)         | **GET** /team/{team_key}/event/{event_key}/matches/keys   |
| [**getTeamEventMatchesSimple**](EventApi.md#getTeamEventMatchesSimple)     | **GET** /team/{team_key}/event/{event_key}/matches/simple |
| [**getTeamEventStatus**](EventApi.md#getTeamEventStatus)                   | **GET** /team/{team_key}/event/{event_key}/status         |
| [**getTeamEvents**](EventApi.md#getTeamEvents)                             | **GET** /team/{team_key}/events                           |
| [**getTeamEventsByYear**](EventApi.md#getTeamEventsByYear)                 | **GET** /team/{team_key}/events/{year}                    |
| [**getTeamEventsByYearKeys**](EventApi.md#getTeamEventsByYearKeys)         | **GET** /team/{team_key}/events/{year}/keys               |
| [**getTeamEventsByYearSimple**](EventApi.md#getTeamEventsByYearSimple)     | **GET** /team/{team_key}/events/{year}/simple             |
| [**getTeamEventsKeys**](EventApi.md#getTeamEventsKeys)                     | **GET** /team/{team_key}/events/keys                      |
| [**getTeamEventsSimple**](EventApi.md#getTeamEventsSimple)                 | **GET** /team/{team_key}/events/simple                    |
| [**getTeamEventsStatusesByYear**](EventApi.md#getTeamEventsStatusesByYear) | **GET** /team/{team_key}/events/{year}/statuses           |

## **getDistrictEvents**

> kotlin.Array&lt;Event&gt; getDistrictEvents(districtKey, ifModifiedSince)

Gets a list of events in the given district.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Event> = apiInstance.getDistrictEvents(districtKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getDistrictEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getDistrictEvents")
    e.printStackTrace()
}
```

### Parameters

|     |     | Name                | Type              | Description                                                                                       | Notes                        |     |     |
| --- | --- | ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- | --- | --- |
|     |     | **districtKey**     | **kotlin.String** | TBA District Key, eg &#x60;2016fim&#x60;                                                          | [default to null]            |     |     |
|     |     | **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |     |     |

### Return type

[**kotlin.Array&lt;Event&gt;**](Event.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getDistrictEventsKeys**

> kotlin.Array&lt;kotlin.String&gt; getDistrictEventsKeys(districtKey, ifModifiedSince)

Gets a list of event keys for events in the given district.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getDistrictEventsKeys(districtKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getDistrictEventsKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getDistrictEventsKeys")
    e.printStackTrace()
}
```

### Parameters

|     | Name                | Type              | Description                                                                                       | Notes                        |     |
| --- | ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- | --- |
|     | **districtKey**     | **kotlin.String** | TBA District Key, eg &#x60;2016fim&#x60;                                                          | [default to null]            |     |
|     | **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |     |

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getDistrictEventsSimple**

> kotlin.Array&lt;EventSimple&gt; getDistrictEventsSimple(districtKey, ifModifiedSince)

Gets a short-form list of events in the given district.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<EventSimple> = apiInstance.getDistrictEventsSimple(districtKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getDistrictEventsSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getDistrictEventsSimple")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **districtKey**     | **kotlin.String** | TBA District Key, eg &#x60;2016fim&#x60;                                                          | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

### Return type

[**kotlin.Array&lt;EventSimple&gt;**](EventSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getEvent**

> Event getEvent(eventKey, ifModifiedSince)

Gets an Event.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : Event = apiInstance.getEvent(eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEvent")
    e.printStackTrace()
}
```

### Parameters

|     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     | Name                | Type              | Description                                                                                       | Notes                        |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     | **eventKey**        | **kotlin.String** | TBA Event Key, eg &#x60;2016nytr&#x60;                                                            | [default to null]            |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |
|     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     | **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |

### Return type

[**Event**](Event.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getEventAlliances**

> kotlin.Array&lt;EliminationAlliance&gt; getEventAlliances(eventKey, ifModifiedSince)

Gets a list of Elimination Alliances for the given Event.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<EliminationAlliance> = apiInstance.getEventAlliances(eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventAlliances")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventAlliances")
    e.printStackTrace()
}
```

### Parameters

|     |     |     |     |     |     |     |     |     |     |     |     |     |     |     | Name                | Type              | Description                                                                                       | Notes                        |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     |     |     |     |     |     |     |     |     |     |     |     |     | **eventKey**        | **kotlin.String** | TBA Event Key, eg &#x60;2016nytr&#x60;                                                            | [default to null]            |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |
|     |     |     |     |     |     |     |     |     |     |     |     |     |     |     | **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |

### Return type

[**kotlin.Array&lt;EliminationAlliance&gt;**](EliminationAlliance.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getEventAwards**

> kotlin.Array&lt;Award&gt; getEventAwards(eventKey, ifModifiedSince)

Gets a list of awards from the given event.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Award> = apiInstance.getEventAwards(eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventAwards")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventAwards")
    e.printStackTrace()
}
```

### Parameters

|     |     |     |     |     |     |     |     |     |     |     |     |     |     | Name                | Type              | Description                                                                                       | Notes                        |     |     |     |     |     |     |     |     |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     |     |     |     |     |     |     |     |     |     |     |     | **eventKey**        | **kotlin.String** | TBA Event Key, eg &#x60;2016nytr&#x60;                                                            | [default to null]            |     |     |     |     |     |     |     |     |     |     |     |     |     |     |
|     |     |     |     |     |     |     |     |     |     |     |     |     |     | **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |     |     |     |     |     |     |     |     |     |     |     |     |     |     |

### Return type

[**kotlin.Array&lt;Award&gt;**](Award.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getEventDistrictPoints**

> EventDistrictPoints getEventDistrictPoints(eventKey, ifModifiedSince)

Gets a list of team rankings for the Event.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : EventDistrictPoints = apiInstance.getEventDistrictPoints(eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventDistrictPoints")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventDistrictPoints")
    e.printStackTrace()
}
```

### Parameters

| | | | | | | | | | | | | | Name                                                                                                                                                                                                                   | Type                                                                                                                                                                                       | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        | Notes                        |                        |                        |                        |                        |                        |                        |                        |                        |                        |                        |                        |                        |                        |
| ------| ------| ------| ------| ------| ------| ------| ------| ------| ------| ------| ------| ------| ------------------- | --------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------- |--------------- |--------------- |--------------- |--------------- |--------------- |--------------- |--------------- |--------------- |--------------- |--------------- |--------------- |--------------- |--------------- |
|||||||||||||| **eventKey**                                                                                                   | **kotlin.String**              | TBA Event Key, eg &#x60;2016nytr&#x60;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | [default to null]            |            |            |            |            |            |            |            |            |            |            |            |            |            |
|||||||||||||| **ifModifiedSince** | **kotlin.String**              | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] | | | | | | | | | | | | | |

### Return type

[**EventDistrictPoints**](EventDistrictPoints.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getEventInsights**

> EventInsights getEventInsights(eventKey, ifModifiedSince)

Gets a set of Event-specific insights for the given Event.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : EventInsights = apiInstance.getEventInsights(eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventInsights")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventInsights")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **kotlin.String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**EventInsights**](EventInsights.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getEventMatchTimeseries**

> kotlin.Array&lt;kotlin.String&gt; getEventMatchTimeseries(eventKey, ifModifiedSince)

Gets an array of Match Keys for the given event key that have timeseries data. Returns an empty array if no matches have timeseries data. *WARNING:* This is *not* official data, and is subject to a significant possibility of error, or missing data. Do not rely on this data for any purpose. In fact, pretend we made it up. *WARNING:* This endpoint and corresponding data models are under *active development* and may change at any time, including in breaking ways.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getEventMatchTimeseries(eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventMatchTimeseries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventMatchTimeseries")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **kotlin.String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getEventMatches**

> kotlin.Array&lt;Match&gt; getEventMatches(eventKey, ifModifiedSince)

Gets a list of matches for the given event.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Match> = apiInstance.getEventMatches(eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventMatches")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventMatches")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **kotlin.String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**kotlin.Array&lt;Match&gt;**](Match.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getEventMatchesKeys**

> kotlin.Array&lt;kotlin.String&gt; getEventMatchesKeys(eventKey, ifModifiedSince)

Gets a list of match keys for the given event.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getEventMatchesKeys(eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventMatchesKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventMatchesKeys")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **kotlin.String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getEventMatchesSimple**

> kotlin.Array&lt;MatchSimple&gt; getEventMatchesSimple(eventKey, ifModifiedSince)

Gets a short-form list of matches for the given event.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<MatchSimple> = apiInstance.getEventMatchesSimple(eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventMatchesSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventMatchesSimple")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **kotlin.String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**kotlin.Array&lt;MatchSimple&gt;**](MatchSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getEventOPRs**

> EventOPRs getEventOPRs(eventKey, ifModifiedSince)

Gets a set of Event OPRs (including OPR, DPR, and CCWM) for the given Event.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : EventOPRs = apiInstance.getEventOPRs(eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventOPRs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventOPRs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **kotlin.String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**EventOPRs**](EventOPRs.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getEventPredictions**

> EventPredictions getEventPredictions(eventKey, ifModifiedSince)

Gets information on TBA-generated predictions for the given Event. Contains year-specific information. *WARNING* This endpoint is currently under development and may change at any time.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : EventPredictions = apiInstance.getEventPredictions(eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventPredictions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventPredictions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **kotlin.String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**EventPredictions**](EventPredictions.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getEventRankings**

> EventRanking getEventRankings(eventKey, ifModifiedSince)

Gets a list of team rankings for the Event.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : EventRanking = apiInstance.getEventRankings(eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventRankings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventRankings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **kotlin.String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**EventRanking**](EventRanking.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getEventSimple**

> EventSimple getEventSimple(eventKey, ifModifiedSince)

Gets a short-form Event.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : EventSimple = apiInstance.getEventSimple(eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventSimple")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **kotlin.String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**EventSimple**](EventSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getEventTeams**

> kotlin.Array&lt;Team&gt; getEventTeams(eventKey, ifModifiedSince)

Gets a list of &#x60;Team&#x60; objects that competed in the given event.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Team> = apiInstance.getEventTeams(eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventTeams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventTeams")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **kotlin.String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**kotlin.Array&lt;Team&gt;**](Team.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getEventTeamsKeys**

> kotlin.Array&lt;kotlin.String&gt; getEventTeamsKeys(eventKey, ifModifiedSince)

Gets a list of &#x60;Team&#x60; keys that competed in the given event.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getEventTeamsKeys(eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventTeamsKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventTeamsKeys")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **kotlin.String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getEventTeamsSimple**

> kotlin.Array&lt;TeamSimple&gt; getEventTeamsSimple(eventKey, ifModifiedSince)

Gets a short-form list of &#x60;Team&#x60; objects that competed in the given event.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<TeamSimple> = apiInstance.getEventTeamsSimple(eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventTeamsSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventTeamsSimple")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **kotlin.String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**kotlin.Array&lt;TeamSimple&gt;**](TeamSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getEventTeamsStatuses**

> kotlin.collections.Map&lt;kotlin.String, TeamEventStatus&gt; getEventTeamsStatuses(eventKey, ifModifiedSince)

Gets a key-value list of the event statuses for teams competing at the given event.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.collections.Map<kotlin.String, TeamEventStatus> = apiInstance.getEventTeamsStatuses(eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventTeamsStatuses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventTeamsStatuses")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **kotlin.String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**kotlin.collections.Map&lt;kotlin.String, TeamEventStatus&gt;**](TeamEventStatus.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getEventsByYear**

> kotlin.Array&lt;Event&gt; getEventsByYear(year, ifModifiedSince)

Gets a list of events in the given year.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Event> = apiInstance.getEventsByYear(year, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventsByYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventsByYear")
    e.printStackTrace()
}
```

### Parameters

|     |     | Name                | Type              | Description                                                                                       | Notes                        |     |     |
| --- | --- | ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- | --- | --- |
|     |     | **year**            | **kotlin.Int**    | Competition Year (or Season). Must be 4 digits.                                                   | [default to null]            |     |     |
|     |     | **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |     |     |

### Return type

[**kotlin.Array&lt;Event&gt;**](Event.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getEventsByYearKeys**

> kotlin.Array&lt;kotlin.String&gt; getEventsByYearKeys(year, ifModifiedSince)

Gets a list of event keys in the given year.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getEventsByYearKeys(year, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventsByYearKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventsByYearKeys")
    e.printStackTrace()
}
```

### Parameters

|     | Name                | Type              | Description                                                                                       | Notes                        |     |
| --- | ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- | --- |
|     | **year**            | **kotlin.Int**    | Competition Year (or Season). Must be 4 digits.                                                   | [default to null]            |     |
|     | **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |     |

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getEventsByYearSimple**

> kotlin.Array&lt;EventSimple&gt; getEventsByYearSimple(year, ifModifiedSince)

Gets a short-form list of events in the given year.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<EventSimple> = apiInstance.getEventsByYearSimple(year, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventsByYearSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventsByYearSimple")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **year**            | **kotlin.Int**    | Competition Year (or Season). Must be 4 digits.                                                   | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

### Return type

[**kotlin.Array&lt;EventSimple&gt;**](EventSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamEventAwards**

> kotlin.Array&lt;Award&gt; getTeamEventAwards(teamKey, eventKey, ifModifiedSince)

Gets a list of awards the given team won at the given event.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Award> = apiInstance.getTeamEventAwards(teamKey, eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getTeamEventAwards")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getTeamEventAwards")
    e.printStackTrace()
}
```

### Parameters

| | | | | Name                                                                            | Type                                                                  | Description                                                                                                                                                                                                                                                                                                                                                                                                                                           | Notes                        |                        |                        |                        |                        |
| | | | | ------------------------------------------- | --------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------- |--------------- |--------------- |--------------- |--------------- |
||||| **teamKey**                                         | **kotlin.String**     | TBA Team Key, eg &#x60;frc254&#x60;                                                                                                                                                                                                                                                                                                                       | [default to null]            |            |            |            |            |
||||| **eventKey**                                    | **kotlin.String**     | TBA Event Key, eg &#x60;2016nytr&#x60;                                                                                                                                                                                                                                                                                                        | [default to null]            |            |            |            |            |
||||| **ifModifiedSince** | **kotlin.String**     | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] | | | | |

### Return type

[**kotlin.Array&lt;Award&gt;**](Award.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamEventMatches**

> kotlin.Array&lt;Match&gt; getTeamEventMatches(teamKey, eventKey, ifModifiedSince)

Gets a list of matches for the given team and event.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Match> = apiInstance.getTeamEventMatches(teamKey, eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getTeamEventMatches")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getTeamEventMatches")
    e.printStackTrace()
}
```

### Parameters

| | | | Name                                                             | Type                                                     | Description                                                                                                                                                                                                                                                                                                                                                      | Notes                        |                        |                        |                        |
| | | | ------------------------------------- | ----------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------- |--------------- |--------------- |--------------- |
|||| **teamKey**                                 | **kotlin.String**    | TBA Team Key, eg &#x60;frc254&#x60;                                                                                                                                                                                                                                                         | [default to null]            |            |            |            |
|||| **eventKey**                             | **kotlin.String**    | TBA Event Key, eg &#x60;2016nytr&#x60;                                                                                                                                                                                                                                             | [default to null]            |            |            |            |
|||| **ifModifiedSince** | **kotlin.String**    | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] | | | |

### Return type

[**kotlin.Array&lt;Match&gt;**](Match.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamEventMatchesKeys**

> kotlin.Array&lt;kotlin.String&gt; getTeamEventMatchesKeys(teamKey, eventKey, ifModifiedSince)

Gets a list of match keys for matches for the given team and event.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getTeamEventMatchesKeys(teamKey, eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getTeamEventMatchesKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getTeamEventMatchesKeys")
    e.printStackTrace()
}
```

### Parameters

| | | Name                                              | Type                                        | Description                                                                                                                                                                                                                                                                 | Notes                        |                        |                        |
| | | ------------------------------- | ------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------- |--------------- |--------------- |
||| **teamKey**                         | **kotlin.String**   | TBA Team Key, eg &#x60;frc254&#x60;                                                                                                                                                                                           | [default to null]            |            |            |
||| **eventKey**                      | **kotlin.String**   | TBA Event Key, eg &#x60;2016nytr&#x60;                                                                                                                                                                                  | [default to null]            |            |            |
||| **ifModifiedSince** | **kotlin.String**   | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] | | |

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamEventMatchesSimple**

> kotlin.Array&lt;Match&gt; getTeamEventMatchesSimple(teamKey, eventKey, ifModifiedSince)

Gets a short-form list of matches for the given team and event.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Match> = apiInstance.getTeamEventMatchesSimple(teamKey, eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getTeamEventMatchesSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getTeamEventMatchesSimple")
    e.printStackTrace()
}
```

### Parameters

| | Name                               | Type                           | Description                                                                                                                                                                            | Notes                        |                        |
| | ------------------------- | --------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------- |--------------- |
|| **teamKey**                 | **kotlin.String**  | TBA Team Key, eg &#x60;frc254&#x60;                                                                                                                             | [default to null]            |            |
|| **eventKey**               | **kotlin.String**  | TBA Event Key, eg &#x60;2016nytr&#x60;                                                                                                                       | [default to null]            |            |
|| **ifModifiedSince** | **kotlin.String**  | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] | |

### Return type

[**kotlin.Array&lt;Match&gt;**](Match.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamEventStatus**

> TeamEventStatus getTeamEventStatus(teamKey, eventKey, ifModifiedSince)

Gets the competition rank and status of the team at the given event.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : TeamEventStatus = apiInstance.getTeamEventStatus(teamKey, eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getTeamEventStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getTeamEventStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **kotlin.String**| TBA Team Key, eg &#x60;frc254&#x60; | [default to null]
 **eventKey** | **kotlin.String**| TBA Event Key, eg &#x60;2016nytr&#x60; | [default to null]
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**TeamEventStatus**](TeamEventStatus.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamEvents**

> kotlin.Array&lt;Event&gt; getTeamEvents(teamKey, ifModifiedSince)

Gets a list of all events this team has competed at.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Event> = apiInstance.getTeamEvents(teamKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getTeamEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getTeamEvents")
    e.printStackTrace()
}
```

### Parameters

|     |     | Name | Type | Description | Notes |  |  |
| --- | --- | ---- | ---- | ----------- | ----- || |
||| **teamKey**                         | **kotlin.String**   | TBA Team Key, eg &#x60;frc254&#x60;                                                                                                                                                                                           | [default to null]            |            |            |
||| **ifModifiedSince** | **kotlin.String**   | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] | | |

### Return type

[**kotlin.Array&lt;Event&gt;**](Event.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamEventsByYear**

> kotlin.Array&lt;Event&gt; getTeamEventsByYear(teamKey, year, ifModifiedSince)

Gets a list of events this team has competed at in the given year.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Event> = apiInstance.getTeamEventsByYear(teamKey, year, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getTeamEventsByYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getTeamEventsByYear")
    e.printStackTrace()
}
```

### Parameters

| | | | Name                                                             | Type                                                     | Description                                                                                                                                                                                                                                                                                                                                                      | Notes                        |                        |                        |                        |
| | | | ------------------------------------- | ----------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------- |--------------- |--------------- |--------------- |
|||| **teamKey**                                 | **kotlin.String**    | TBA Team Key, eg &#x60;frc254&#x60;                                                                                                                                                                                                                                                         | [default to null]            |            |            |            |
|||| **year**                                             | **kotlin.Int**                | Competition Year (or Season). Must be 4 digits.                                                                                                                                                                                                         | [default to null]            |            |            |            |
|||| **ifModifiedSince** | **kotlin.String**    | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] | | | |

### Return type

[**kotlin.Array&lt;Event&gt;**](Event.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamEventsByYearKeys**

> kotlin.Array&lt;kotlin.String&gt; getTeamEventsByYearKeys(teamKey, year, ifModifiedSince)

Gets a list of the event keys for events this team has competed at in the given year.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getTeamEventsByYearKeys(teamKey, year, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getTeamEventsByYearKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getTeamEventsByYearKeys")
    e.printStackTrace()
}
```

### Parameters

| | | Name                                              | Type                                        | Description                                                                                                                                                                                                                                                                 | Notes                        |                        |                        |
| | | ------------------------------- | ------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------- |--------------- |--------------- |
||| **teamKey**                         | **kotlin.String**   | TBA Team Key, eg &#x60;frc254&#x60;                                                                                                                                                                                           | [default to null]            |            |            |
||| **year**                                  | **kotlin.Int**            | Competition Year (or Season). Must be 4 digits.                                                                                                                                                       | [default to null]            |            |            |
||| **ifModifiedSince** | **kotlin.String**   | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] | | |

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamEventsByYearSimple**

> kotlin.Array&lt;EventSimple&gt; getTeamEventsByYearSimple(teamKey, year, ifModifiedSince)

Gets a short-form list of events this team has competed at in the given year.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<EventSimple> = apiInstance.getTeamEventsByYearSimple(teamKey, year, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getTeamEventsByYearSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getTeamEventsByYearSimple")
    e.printStackTrace()
}
```

### Parameters

| | Name                               | Type                           | Description                                                                                                                                                                            | Notes                        |                        |
| | ------------------------- | --------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------- |--------------- |
|| **teamKey**                 | **kotlin.String**  | TBA Team Key, eg &#x60;frc254&#x60;                                                                                                                             | [default to null]            |            |
|| **year**                       | **kotlin.Int**        | Competition Year (or Season). Must be 4 digits.                                                                                                     | [default to null]            |            |
|| **ifModifiedSince** | **kotlin.String**  | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] | |

### Return type

[**kotlin.Array&lt;EventSimple&gt;**](EventSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamEventsKeys**

> kotlin.Array&lt;kotlin.String&gt; getTeamEventsKeys(teamKey, ifModifiedSince)

Gets a list of the event keys for all events this team has competed at.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getTeamEventsKeys(teamKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getTeamEventsKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getTeamEventsKeys")
    e.printStackTrace()
}
```

### Parameters

|     | Name | Type | Description | Notes |  |
| --- | ---- | ---- | ----------- | ----- ||
|| **teamKey**                 | **kotlin.String**  | TBA Team Key, eg &#x60;frc254&#x60;                                                                                                                             | [default to null]            |            |
|| **ifModifiedSince** | **kotlin.String**  | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] | |

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamEventsSimple**

> kotlin.Array&lt;EventSimple&gt; getTeamEventsSimple(teamKey, ifModifiedSince)

Gets a short-form list of all events this team has competed at.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<EventSimple> = apiInstance.getTeamEventsSimple(teamKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getTeamEventsSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getTeamEventsSimple")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **teamKey**         | **kotlin.String** | TBA Team Key, eg &#x60;frc254&#x60;                                                               | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

### Return type

[**kotlin.Array&lt;EventSimple&gt;**](EventSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamEventsStatusesByYear**

> kotlin.collections.Map&lt;kotlin.String, TeamEventStatus&gt; getTeamEventsStatusesByYear(teamKey, year, ifModifiedSince)

Gets a key-value list of the event statuses for events this team has competed at in the given year.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = EventApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.collections.Map<kotlin.String, TeamEventStatus> = apiInstance.getTeamEventsStatusesByYear(teamKey, year, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getTeamEventsStatusesByYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getTeamEventsStatusesByYear")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **teamKey**         | **kotlin.String** | TBA Team Key, eg &#x60;frc254&#x60;                                                               | [default to null]            |
| **year**            | **kotlin.Int**    | Competition Year (or Season). Must be 4 digits.                                                   | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

### Return type

[**kotlin.collections.Map&lt;kotlin.String, TeamEventStatus&gt;**](TeamEventStatus.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json
