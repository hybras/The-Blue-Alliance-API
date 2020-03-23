# ListApi

All URIs are relative to *<https://www.thebluealliance.com/api/v3>*

| Method                                                                    | HTTP request                                    | Description |
| ------------------------------------------------------------------------- | ----------------------------------------------- | ----------- |
| [**getDistrictEvents**](ListApi.md#getDistrictEvents)                     | **GET** /district/{district_key}/events         |
| [**getDistrictEventsKeys**](ListApi.md#getDistrictEventsKeys)             | **GET** /district/{district_key}/events/keys    |
| [**getDistrictEventsSimple**](ListApi.md#getDistrictEventsSimple)         | **GET** /district/{district_key}/events/simple  |
| [**getDistrictRankings**](ListApi.md#getDistrictRankings)                 | **GET** /district/{district_key}/rankings       |
| [**getDistrictTeams**](ListApi.md#getDistrictTeams)                       | **GET** /district/{district_key}/teams          |
| [**getDistrictTeamsKeys**](ListApi.md#getDistrictTeamsKeys)               | **GET** /district/{district_key}/teams/keys     |
| [**getDistrictTeamsSimple**](ListApi.md#getDistrictTeamsSimple)           | **GET** /district/{district_key}/teams/simple   |
| [**getEventTeams**](ListApi.md#getEventTeams)                             | **GET** /event/{event_key}/teams                |
| [**getEventTeamsKeys**](ListApi.md#getEventTeamsKeys)                     | **GET** /event/{event_key}/teams/keys           |
| [**getEventTeamsSimple**](ListApi.md#getEventTeamsSimple)                 | **GET** /event/{event_key}/teams/simple         |
| [**getEventTeamsStatuses**](ListApi.md#getEventTeamsStatuses)             | **GET** /event/{event_key}/teams/statuses       |
| [**getEventsByYear**](ListApi.md#getEventsByYear)                         | **GET** /events/{year}                          |
| [**getEventsByYearKeys**](ListApi.md#getEventsByYearKeys)                 | **GET** /events/{year}/keys                     |
| [**getEventsByYearSimple**](ListApi.md#getEventsByYearSimple)             | **GET** /events/{year}/simple                   |
| [**getTeamEventsStatusesByYear**](ListApi.md#getTeamEventsStatusesByYear) | **GET** /team/{team_key}/events/{year}/statuses |
| [**getTeams**](ListApi.md#getTeams)                                       | **GET** /teams/{page_num}                       |
| [**getTeamsByYear**](ListApi.md#getTeamsByYear)                           | **GET** /teams/{year}/{page_num}                |
| [**getTeamsByYearKeys**](ListApi.md#getTeamsByYearKeys)                   | **GET** /teams/{year}/{page_num}/keys           |
| [**getTeamsByYearSimple**](ListApi.md#getTeamsByYearSimple)               | **GET** /teams/{year}/{page_num}/simple         |
| [**getTeamsKeys**](ListApi.md#getTeamsKeys)                               | **GET** /teams/{page_num}/keys                  |
| [**getTeamsSimple**](ListApi.md#getTeamsSimple)                           | **GET** /teams/{page_num}/simple                |

## **getDistrictEvents**

> kotlin.Array&lt;Event&gt; getDistrictEvents(districtKey, ifModifiedSince)

Gets a list of events in the given district.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = ListApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Event> = apiInstance.getDistrictEvents(districtKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListApi#getDistrictEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListApi#getDistrictEvents")
    e.printStackTrace()
}
```

### Parameters

|     |     |     |     |     |     | Name                | Type              | Description                                                                                       | Notes                        |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- | --- | --- | --- | --- | --- | --- |
|     |     |     |     |     |     | **districtKey**     | **kotlin.String** | TBA District Key, eg &#x60;2016fim&#x60;                                                          | [default to null]            |     |     |     |     |     |     |
|     |     |     |     |     |     | **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |     |     |     |     |     |     |

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

val apiInstance = ListApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getDistrictEventsKeys(districtKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListApi#getDistrictEventsKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListApi#getDistrictEventsKeys")
    e.printStackTrace()
}
```

### Parameters

|     |     |     |     |     | Name                | Type              | Description                                                                                       | Notes                        |     |     |     |     |     |
| --- | --- | --- | --- | --- | ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- | --- | --- | --- | --- | --- |
|     |     |     |     |     | **districtKey**     | **kotlin.String** | TBA District Key, eg &#x60;2016fim&#x60;                                                          | [default to null]            |     |     |     |     |     |
|     |     |     |     |     | **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |     |     |     |     |     |

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

val apiInstance = ListApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<EventSimple> = apiInstance.getDistrictEventsSimple(districtKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListApi#getDistrictEventsSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListApi#getDistrictEventsSimple")
    e.printStackTrace()
}
```

### Parameters

|     |     |     |     | Name                | Type              | Description                                                                                       | Notes                        |     |     |     |     |
| --- | --- | --- | --- | ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- | --- | --- | --- | --- |
|     |     |     |     | **districtKey**     | **kotlin.String** | TBA District Key, eg &#x60;2016fim&#x60;                                                          | [default to null]            |     |     |     |     |
|     |     |     |     | **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |     |     |     |     |

### Return type

[**kotlin.Array&lt;EventSimple&gt;**](EventSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getDistrictRankings**

> kotlin.Array&lt;DistrictRanking&gt; getDistrictRankings(districtKey, ifModifiedSince)

Gets a list of team district rankings for the given district.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = ListApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<DistrictRanking> = apiInstance.getDistrictRankings(districtKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListApi#getDistrictRankings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListApi#getDistrictRankings")
    e.printStackTrace()
}
```

### Parameters

| | | | Name                                                             | Type                                                     | Description                                                                                                                                                                                                                                                                                                                                                      | Notes                        |                        |                        |                        |
| ------| ------| ------| ------------------- | ----------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------- |- |- |- |
|||| **districtKey**                 | **kotlin.String**    | TBA District Key, eg &#x60;2016fim&#x60;                                                                                                                                                                                                                                     | [default to null]            |            |            |            |
|||| **ifModifiedSince** | **kotlin.String**    | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] | | | |

### Return type

[**kotlin.Array&lt;DistrictRanking&gt;**](DistrictRanking.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getDistrictTeams**

> kotlin.Array&lt;Team&gt; getDistrictTeams(districtKey, ifModifiedSince)

Gets a list of &#x60;Team&#x60; objects that competed in events in the given district.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = ListApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Team> = apiInstance.getDistrictTeams(districtKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListApi#getDistrictTeams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListApi#getDistrictTeams")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **districtKey** | **kotlin.String**| TBA District Key, eg &#x60;2016fim&#x60; | [default to null]
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**kotlin.Array&lt;Team&gt;**](Team.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getDistrictTeamsKeys**

> kotlin.Array&lt;kotlin.String&gt; getDistrictTeamsKeys(districtKey, ifModifiedSince)

Gets a list of &#x60;Team&#x60; objects that competed in events in the given district.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = ListApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getDistrictTeamsKeys(districtKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListApi#getDistrictTeamsKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListApi#getDistrictTeamsKeys")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **districtKey** | **kotlin.String**| TBA District Key, eg &#x60;2016fim&#x60; | [default to null]
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getDistrictTeamsSimple**

> kotlin.Array&lt;TeamSimple&gt; getDistrictTeamsSimple(districtKey, ifModifiedSince)

Gets a short-form list of &#x60;Team&#x60; objects that competed in events in the given district.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = ListApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<TeamSimple> = apiInstance.getDistrictTeamsSimple(districtKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListApi#getDistrictTeamsSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListApi#getDistrictTeamsSimple")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **districtKey** | **kotlin.String**| TBA District Key, eg &#x60;2016fim&#x60; | [default to null]
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null]

### Return type

[**kotlin.Array&lt;TeamSimple&gt;**](TeamSimple.md)

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

val apiInstance = ListApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Team> = apiInstance.getEventTeams(eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListApi#getEventTeams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListApi#getEventTeams")
    e.printStackTrace()
}
```

### Parameters

|     |     |     | Name                | Type              | Description                                                                                       | Notes                        |     |     |     |
| --- | --- | --- | ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- | --- | --- | --- |
|     |     |     | **eventKey**        | **kotlin.String** | TBA Event Key, eg &#x60;2016nytr&#x60;                                                            | [default to null]            |     |     |     |
|     |     |     | **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |     |     |     |

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

val apiInstance = ListApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getEventTeamsKeys(eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListApi#getEventTeamsKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListApi#getEventTeamsKeys")
    e.printStackTrace()
}
```

### Parameters

|     |     | Name                | Type              | Description                                                                                       | Notes                        |     |     |
| --- | --- | ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- | --- | --- |
|     |     | **eventKey**        | **kotlin.String** | TBA Event Key, eg &#x60;2016nytr&#x60;                                                            | [default to null]            |     |     |
|     |     | **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |     |     |

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

val apiInstance = ListApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<TeamSimple> = apiInstance.getEventTeamsSimple(eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListApi#getEventTeamsSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListApi#getEventTeamsSimple")
    e.printStackTrace()
}
```

### Parameters

|     | Name                | Type              | Description                                                                                       | Notes                        |     |
| --- | ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- | --- |
|     | **eventKey**        | **kotlin.String** | TBA Event Key, eg &#x60;2016nytr&#x60;                                                            | [default to null]            |     |
|     | **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |     |

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

val apiInstance = ListApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.collections.Map<kotlin.String, TeamEventStatus> = apiInstance.getEventTeamsStatuses(eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListApi#getEventTeamsStatuses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListApi#getEventTeamsStatuses")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **eventKey**        | **kotlin.String** | TBA Event Key, eg &#x60;2016nytr&#x60;                                                            | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

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

val apiInstance = ListApi()
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Event> = apiInstance.getEventsByYear(year, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListApi#getEventsByYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListApi#getEventsByYear")
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

val apiInstance = ListApi()
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getEventsByYearKeys(year, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListApi#getEventsByYearKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListApi#getEventsByYearKeys")
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

val apiInstance = ListApi()
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<EventSimple> = apiInstance.getEventsByYearSimple(year, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListApi#getEventsByYearSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListApi#getEventsByYearSimple")
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

## **getTeamEventsStatusesByYear**

> kotlin.collections.Map&lt;kotlin.String, TeamEventStatus&gt; getTeamEventsStatusesByYear(teamKey, year, ifModifiedSince)

Gets a key-value list of the event statuses for events this team has competed at in the given year.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = ListApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.collections.Map<kotlin.String, TeamEventStatus> = apiInstance.getTeamEventsStatusesByYear(teamKey, year, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListApi#getTeamEventsStatusesByYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListApi#getTeamEventsStatusesByYear")
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

## **getTeams**

> kotlin.Array&lt;Team&gt; getTeams(pageNum, ifModifiedSince)

Gets a list of &#x60;Team&#x60; objects, paginated in groups of 500.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = ListApi()
val pageNum : kotlin.Int = 56 // kotlin.Int | Page number of results to return, zero-indexed
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Team> = apiInstance.getTeams(pageNum, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListApi#getTeams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListApi#getTeams")
    e.printStackTrace()
}
```

### Parameters

|     |     | Name | Type | Description | Notes |  |  |
| --- | --- | ---- | ---- | ----------- | ----- || |
||| **pageNum**                         | **kotlin.Int**            | Page number of results to return, zero-indexed                                                                                                                                                          | [default to null]            |            |            |
||| **ifModifiedSince** | **kotlin.String**   | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] | | |

### Return type

[**kotlin.Array&lt;Team&gt;**](Team.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamsByYear**

> kotlin.Array&lt;Team&gt; getTeamsByYear(year, pageNum, ifModifiedSince)

Gets a list of &#x60;Team&#x60; objects that competed in the given year, paginated in groups of 500.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = ListApi()
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val pageNum : kotlin.Int = 56 // kotlin.Int | Page number of results to return, zero-indexed
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Team> = apiInstance.getTeamsByYear(year, pageNum, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListApi#getTeamsByYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListApi#getTeamsByYear")
    e.printStackTrace()
}
```

### Parameters

| | | Name                                              | Type                                        | Description                                                                                                                                                                                                                                                                 | Notes                        |                        |                        |
| | | ------------------------------- | ------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------- | | |
||| **year**                                  | **kotlin.Int**            | Competition Year (or Season). Must be 4 digits.                                                                                                                                                       | [default to null]            |            |            |
||| **pageNum**                         | **kotlin.Int**            | Page number of results to return, zero-indexed                                                                                                                                                          | [default to null]            |            |            |
||| **ifModifiedSince** | **kotlin.String**   | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] | | |

### Return type

[**kotlin.Array&lt;Team&gt;**](Team.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamsByYearKeys**

> kotlin.Array&lt;kotlin.String&gt; getTeamsByYearKeys(year, pageNum, ifModifiedSince)

Gets a list Team Keys that competed in the given year, paginated in groups of 500.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = ListApi()
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val pageNum : kotlin.Int = 56 // kotlin.Int | Page number of results to return, zero-indexed
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getTeamsByYearKeys(year, pageNum, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListApi#getTeamsByYearKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListApi#getTeamsByYearKeys")
    e.printStackTrace()
}
```

### Parameters

| | Name                               | Type                           | Description                                                                                                                                                                            | Notes                        |                        |
| | ------------------------- | --------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------- | |
|| **year**                       | **kotlin.Int**        | Competition Year (or Season). Must be 4 digits.                                                                                                     | [default to null]            |            |
|| **pageNum**                 | **kotlin.Int**        | Page number of results to return, zero-indexed                                                                                                       | [default to null]            |            |
|| **ifModifiedSince** | **kotlin.String**  | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] | |

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamsByYearSimple**

> kotlin.Array&lt;TeamSimple&gt; getTeamsByYearSimple(year, pageNum, ifModifiedSince)

Gets a list of short form &#x60;Team_Simple&#x60; objects that competed in the given year, paginated in groups of 500.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = ListApi()
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val pageNum : kotlin.Int = 56 // kotlin.Int | Page number of results to return, zero-indexed
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<TeamSimple> = apiInstance.getTeamsByYearSimple(year, pageNum, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListApi#getTeamsByYearSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListApi#getTeamsByYearSimple")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **year**            | **kotlin.Int**    | Competition Year (or Season). Must be 4 digits.                                                   | [default to null]            |
| **pageNum**         | **kotlin.Int**    | Page number of results to return, zero-indexed                                                    | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

### Return type

[**kotlin.Array&lt;TeamSimple&gt;**](TeamSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamsKeys**

> kotlin.Array&lt;kotlin.String&gt; getTeamsKeys(pageNum, ifModifiedSince)

Gets a list of Team keys, paginated in groups of 500. (Note, each page will not have 500 teams, but will include the teams within that range of 500.)

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = ListApi()
val pageNum : kotlin.Int = 56 // kotlin.Int | Page number of results to return, zero-indexed
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getTeamsKeys(pageNum, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListApi#getTeamsKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListApi#getTeamsKeys")
    e.printStackTrace()
}
```

### Parameters

|     | Name | Type | Description | Notes |  |
| --- | ---- | ---- | ----------- | ----- ||
|| **pageNum**                 | **kotlin.Int**        | Page number of results to return, zero-indexed                                                                                                       | [default to null]            |            |
|| **ifModifiedSince** | **kotlin.String**  | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] | |

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamsSimple**

> kotlin.Array&lt;TeamSimple&gt; getTeamsSimple(pageNum, ifModifiedSince)

Gets a list of short form &#x60;Team_Simple&#x60; objects, paginated in groups of 500.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = ListApi()
val pageNum : kotlin.Int = 56 // kotlin.Int | Page number of results to return, zero-indexed
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<TeamSimple> = apiInstance.getTeamsSimple(pageNum, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListApi#getTeamsSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListApi#getTeamsSimple")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **pageNum**         | **kotlin.Int**    | Page number of results to return, zero-indexed                                                    | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

### Return type

[**kotlin.Array&lt;TeamSimple&gt;**](TeamSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json
