# TeamApi

All URIs are relative to *<https://www.thebluealliance.com/api/v3>*

| Method                                                                    | HTTP request                                              | Description |
| ------------------------------------------------------------------------- | --------------------------------------------------------- | ----------- |
| [**getDistrictRankings**](TeamApi.md#getDistrictRankings)                 | **GET** /district/{district_key}/rankings                 |
| [**getDistrictTeams**](TeamApi.md#getDistrictTeams)                       | **GET** /district/{district_key}/teams                    |
| [**getDistrictTeamsKeys**](TeamApi.md#getDistrictTeamsKeys)               | **GET** /district/{district_key}/teams/keys               |
| [**getDistrictTeamsSimple**](TeamApi.md#getDistrictTeamsSimple)           | **GET** /district/{district_key}/teams/simple             |
| [**getEventTeams**](TeamApi.md#getEventTeams)                             | **GET** /event/{event_key}/teams                          |
| [**getEventTeamsKeys**](TeamApi.md#getEventTeamsKeys)                     | **GET** /event/{event_key}/teams/keys                     |
| [**getEventTeamsSimple**](TeamApi.md#getEventTeamsSimple)                 | **GET** /event/{event_key}/teams/simple                   |
| [**getEventTeamsStatuses**](TeamApi.md#getEventTeamsStatuses)             | **GET** /event/{event_key}/teams/statuses                 |
| [**getTeam**](TeamApi.md#getTeam)                                         | **GET** /team/{team_key}                                  |
| [**getTeamAwards**](TeamApi.md#getTeamAwards)                             | **GET** /team/{team_key}/awards                           |
| [**getTeamAwardsByYear**](TeamApi.md#getTeamAwardsByYear)                 | **GET** /team/{team_key}/awards/{year}                    |
| [**getTeamDistricts**](TeamApi.md#getTeamDistricts)                       | **GET** /team/{team_key}/districts                        |
| [**getTeamEventAwards**](TeamApi.md#getTeamEventAwards)                   | **GET** /team/{team_key}/event/{event_key}/awards         |
| [**getTeamEventMatches**](TeamApi.md#getTeamEventMatches)                 | **GET** /team/{team_key}/event/{event_key}/matches        |
| [**getTeamEventMatchesKeys**](TeamApi.md#getTeamEventMatchesKeys)         | **GET** /team/{team_key}/event/{event_key}/matches/keys   |
| [**getTeamEventMatchesSimple**](TeamApi.md#getTeamEventMatchesSimple)     | **GET** /team/{team_key}/event/{event_key}/matches/simple |
| [**getTeamEventStatus**](TeamApi.md#getTeamEventStatus)                   | **GET** /team/{team_key}/event/{event_key}/status         |
| [**getTeamEvents**](TeamApi.md#getTeamEvents)                             | **GET** /team/{team_key}/events                           |
| [**getTeamEventsByYear**](TeamApi.md#getTeamEventsByYear)                 | **GET** /team/{team_key}/events/{year}                    |
| [**getTeamEventsByYearKeys**](TeamApi.md#getTeamEventsByYearKeys)         | **GET** /team/{team_key}/events/{year}/keys               |
| [**getTeamEventsByYearSimple**](TeamApi.md#getTeamEventsByYearSimple)     | **GET** /team/{team_key}/events/{year}/simple             |
| [**getTeamEventsKeys**](TeamApi.md#getTeamEventsKeys)                     | **GET** /team/{team_key}/events/keys                      |
| [**getTeamEventsSimple**](TeamApi.md#getTeamEventsSimple)                 | **GET** /team/{team_key}/events/simple                    |
| [**getTeamEventsStatusesByYear**](TeamApi.md#getTeamEventsStatusesByYear) | **GET** /team/{team_key}/events/{year}/statuses           |
| [**getTeamMatchesByYear**](TeamApi.md#getTeamMatchesByYear)               | **GET** /team/{team_key}/matches/{year}                   |
| [**getTeamMatchesByYearKeys**](TeamApi.md#getTeamMatchesByYearKeys)       | **GET** /team/{team_key}/matches/{year}/keys              |
| [**getTeamMatchesByYearSimple**](TeamApi.md#getTeamMatchesByYearSimple)   | **GET** /team/{team_key}/matches/{year}/simple            |
| [**getTeamMediaByTag**](TeamApi.md#getTeamMediaByTag)                     | **GET** /team/{team_key}/media/tag/{media_tag}            |
| [**getTeamMediaByTagYear**](TeamApi.md#getTeamMediaByTagYear)             | **GET** /team/{team_key}/media/tag/{media_tag}/{year}     |
| [**getTeamMediaByYear**](TeamApi.md#getTeamMediaByYear)                   | **GET** /team/{team_key}/media/{year}                     |
| [**getTeamRobots**](TeamApi.md#getTeamRobots)                             | **GET** /team/{team_key}/robots                           |
| [**getTeamSimple**](TeamApi.md#getTeamSimple)                             | **GET** /team/{team_key}/simple                           |
| [**getTeamSocialMedia**](TeamApi.md#getTeamSocialMedia)                   | **GET** /team/{team_key}/social_media                     |
| [**getTeamYearsParticipated**](TeamApi.md#getTeamYearsParticipated)       | **GET** /team/{team_key}/years_participated               |
| [**getTeams**](TeamApi.md#getTeams)                                       | **GET** /teams/{page_num}                                 |
| [**getTeamsByYear**](TeamApi.md#getTeamsByYear)                           | **GET** /teams/{year}/{page_num}                          |
| [**getTeamsByYearKeys**](TeamApi.md#getTeamsByYearKeys)                   | **GET** /teams/{year}/{page_num}/keys                     |
| [**getTeamsByYearSimple**](TeamApi.md#getTeamsByYearSimple)               | **GET** /teams/{year}/{page_num}/simple                   |
| [**getTeamsKeys**](TeamApi.md#getTeamsKeys)                               | **GET** /teams/{page_num}/keys                            |
| [**getTeamsSimple**](TeamApi.md#getTeamsSimple)                           | **GET** /teams/{page_num}/simple                          |

## **getDistrictRankings**

> kotlin.Array&lt;DistrictRanking&gt; getDistrictRankings(districtKey, ifModifiedSince)

Gets a list of team district rankings for the given district.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = TeamApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<DistrictRanking> = apiInstance.getDistrictRankings(districtKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getDistrictRankings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getDistrictRankings")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **districtKey**     | **kotlin.String** | TBA District Key, eg &#x60;2016fim&#x60;                                                          | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

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

val apiInstance = TeamApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Team> = apiInstance.getDistrictTeams(districtKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getDistrictTeams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getDistrictTeams")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **districtKey**     | **kotlin.String** | TBA District Key, eg &#x60;2016fim&#x60;                                                          | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

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

val apiInstance = TeamApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getDistrictTeamsKeys(districtKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getDistrictTeamsKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getDistrictTeamsKeys")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **districtKey**     | **kotlin.String** | TBA District Key, eg &#x60;2016fim&#x60;                                                          | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

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

val apiInstance = TeamApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<TeamSimple> = apiInstance.getDistrictTeamsSimple(districtKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getDistrictTeamsSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getDistrictTeamsSimple")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **districtKey**     | **kotlin.String** | TBA District Key, eg &#x60;2016fim&#x60;                                                          | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

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

val apiInstance = TeamApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Team> = apiInstance.getEventTeams(eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getEventTeams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getEventTeams")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **eventKey**        | **kotlin.String** | TBA Event Key, eg &#x60;2016nytr&#x60;                                                            | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

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

val apiInstance = TeamApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getEventTeamsKeys(eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getEventTeamsKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getEventTeamsKeys")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **eventKey**        | **kotlin.String** | TBA Event Key, eg &#x60;2016nytr&#x60;                                                            | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

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

val apiInstance = TeamApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<TeamSimple> = apiInstance.getEventTeamsSimple(eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getEventTeamsSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getEventTeamsSimple")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **eventKey**        | **kotlin.String** | TBA Event Key, eg &#x60;2016nytr&#x60;                                                            | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

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

val apiInstance = TeamApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.collections.Map<kotlin.String, TeamEventStatus> = apiInstance.getEventTeamsStatuses(eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getEventTeamsStatuses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getEventTeamsStatuses")
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

## **getTeam**

> Team getTeam(teamKey, ifModifiedSince)

Gets a &#x60;Team&#x60; object for the team referenced by the given key.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = TeamApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : Team = apiInstance.getTeam(teamKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeam")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeam")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **teamKey**         | **kotlin.String** | TBA Team Key, eg &#x60;frc254&#x60;                                                               | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

### Return type

[**Team**](Team.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamAwards**

> kotlin.Array&lt;Award&gt; getTeamAwards(teamKey, ifModifiedSince)

Gets a list of awards the given team has won.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = TeamApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Award> = apiInstance.getTeamAwards(teamKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamAwards")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamAwards")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **teamKey**         | **kotlin.String** | TBA Team Key, eg &#x60;frc254&#x60;                                                               | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

### Return type

[**kotlin.Array&lt;Award&gt;**](Award.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamAwardsByYear**

> kotlin.Array&lt;Award&gt; getTeamAwardsByYear(teamKey, year, ifModifiedSince)

Gets a list of awards the given team has won in a given year.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = TeamApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Award> = apiInstance.getTeamAwardsByYear(teamKey, year, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamAwardsByYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamAwardsByYear")
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

[**kotlin.Array&lt;Award&gt;**](Award.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamDistricts**

> kotlin.Array&lt;DistrictList&gt; getTeamDistricts(teamKey, ifModifiedSince)

Gets an array of districts representing each year the team was in a district. Will return an empty array if the team was never in a district.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = TeamApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<DistrictList> = apiInstance.getTeamDistricts(teamKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamDistricts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamDistricts")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **teamKey**         | **kotlin.String** | TBA Team Key, eg &#x60;frc254&#x60;                                                               | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

### Return type

[**kotlin.Array&lt;DistrictList&gt;**](DistrictList.md)

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

val apiInstance = TeamApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Award> = apiInstance.getTeamEventAwards(teamKey, eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamEventAwards")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamEventAwards")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **teamKey**         | **kotlin.String** | TBA Team Key, eg &#x60;frc254&#x60;                                                               | [default to null]            |
| **eventKey**        | **kotlin.String** | TBA Event Key, eg &#x60;2016nytr&#x60;                                                            | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

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

val apiInstance = TeamApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Match> = apiInstance.getTeamEventMatches(teamKey, eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamEventMatches")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamEventMatches")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **teamKey**         | **kotlin.String** | TBA Team Key, eg &#x60;frc254&#x60;                                                               | [default to null]            |
| **eventKey**        | **kotlin.String** | TBA Event Key, eg &#x60;2016nytr&#x60;                                                            | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

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

val apiInstance = TeamApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getTeamEventMatchesKeys(teamKey, eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamEventMatchesKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamEventMatchesKeys")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **teamKey**         | **kotlin.String** | TBA Team Key, eg &#x60;frc254&#x60;                                                               | [default to null]            |
| **eventKey**        | **kotlin.String** | TBA Event Key, eg &#x60;2016nytr&#x60;                                                            | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

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

val apiInstance = TeamApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Match> = apiInstance.getTeamEventMatchesSimple(teamKey, eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamEventMatchesSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamEventMatchesSimple")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **teamKey**         | **kotlin.String** | TBA Team Key, eg &#x60;frc254&#x60;                                                               | [default to null]            |
| **eventKey**        | **kotlin.String** | TBA Event Key, eg &#x60;2016nytr&#x60;                                                            | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

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

val apiInstance = TeamApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : TeamEventStatus = apiInstance.getTeamEventStatus(teamKey, eventKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamEventStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamEventStatus")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **teamKey**         | **kotlin.String** | TBA Team Key, eg &#x60;frc254&#x60;                                                               | [default to null]            |
| **eventKey**        | **kotlin.String** | TBA Event Key, eg &#x60;2016nytr&#x60;                                                            | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

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

val apiInstance = TeamApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Event> = apiInstance.getTeamEvents(teamKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamEvents")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **teamKey**         | **kotlin.String** | TBA Team Key, eg &#x60;frc254&#x60;                                                               | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

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

val apiInstance = TeamApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Event> = apiInstance.getTeamEventsByYear(teamKey, year, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamEventsByYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamEventsByYear")
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

val apiInstance = TeamApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getTeamEventsByYearKeys(teamKey, year, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamEventsByYearKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamEventsByYearKeys")
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

val apiInstance = TeamApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<EventSimple> = apiInstance.getTeamEventsByYearSimple(teamKey, year, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamEventsByYearSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamEventsByYearSimple")
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

val apiInstance = TeamApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getTeamEventsKeys(teamKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamEventsKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamEventsKeys")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **teamKey**         | **kotlin.String** | TBA Team Key, eg &#x60;frc254&#x60;                                                               | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

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

val apiInstance = TeamApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<EventSimple> = apiInstance.getTeamEventsSimple(teamKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamEventsSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamEventsSimple")
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

val apiInstance = TeamApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.collections.Map<kotlin.String, TeamEventStatus> = apiInstance.getTeamEventsStatusesByYear(teamKey, year, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamEventsStatusesByYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamEventsStatusesByYear")
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

## **getTeamMatchesByYear**

> kotlin.Array&lt;Match&gt; getTeamMatchesByYear(teamKey, year, ifModifiedSince)

Gets a list of matches for the given team and year.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = TeamApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Match> = apiInstance.getTeamMatchesByYear(teamKey, year, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamMatchesByYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamMatchesByYear")
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

[**kotlin.Array&lt;Match&gt;**](Match.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamMatchesByYearKeys**

> kotlin.Array&lt;kotlin.String&gt; getTeamMatchesByYearKeys(teamKey, year, ifModifiedSince)

Gets a list of match keys for matches for the given team and year.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = TeamApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getTeamMatchesByYearKeys(teamKey, year, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamMatchesByYearKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamMatchesByYearKeys")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |     |     |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- | --- | --- |
| **teamKey**         | **kotlin.String** | TBA Team Key, eg &#x60;frc254&#x60;                                                               | [default to null]            |     |     |
| **year**            | **kotlin.Int**    | Competition Year (or Season). Must be 4 digits.                                                   | [default to null]            |     |     |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamMatchesByYearSimple**

> kotlin.Array&lt;MatchSimple&gt; getTeamMatchesByYearSimple(teamKey, year, ifModifiedSince)

Gets a short-form list of matches for the given team and year.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = TeamApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<MatchSimple> = apiInstance.getTeamMatchesByYearSimple(teamKey, year, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamMatchesByYearSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamMatchesByYearSimple")
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

[**kotlin.Array&lt;MatchSimple&gt;**](MatchSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamMediaByTag**

> kotlin.Array&lt;Media&gt; getTeamMediaByTag(teamKey, mediaTag, ifModifiedSince)

Gets a list of Media (videos / pictures) for the given team and tag.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = TeamApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val mediaTag : kotlin.String = mediaTag_example // kotlin.String | Media Tag which describes the Media.
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Media> = apiInstance.getTeamMediaByTag(teamKey, mediaTag, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamMediaByTag")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamMediaByTag")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **teamKey**         | **kotlin.String** | TBA Team Key, eg &#x60;frc254&#x60;                                                               | [default to null]            |
| **mediaTag**        | **kotlin.String** | Media Tag which describes the Media.                                                              | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

### Return type

[**kotlin.Array&lt;Media&gt;**](Media.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamMediaByTagYear**

> kotlin.Array&lt;Media&gt; getTeamMediaByTagYear(teamKey, mediaTag, year, ifModifiedSince)

Gets a list of Media (videos / pictures) for the given team, tag and year.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = TeamApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val mediaTag : kotlin.String = mediaTag_example // kotlin.String | Media Tag which describes the Media.
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Media> = apiInstance.getTeamMediaByTagYear(teamKey, mediaTag, year, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamMediaByTagYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamMediaByTagYear")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **teamKey**         | **kotlin.String** | TBA Team Key, eg &#x60;frc254&#x60;                                                               | [default to null]            |
| **mediaTag**        | **kotlin.String** | Media Tag which describes the Media.                                                              | [default to null]            |
| **year**            | **kotlin.Int**    | Competition Year (or Season). Must be 4 digits.                                                   | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

### Return type

[**kotlin.Array&lt;Media&gt;**](Media.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamMediaByYear**

> kotlin.Array&lt;Media&gt; getTeamMediaByYear(teamKey, year, ifModifiedSince)

Gets a list of Media (videos / pictures) for the given team and year.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = TeamApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Media> = apiInstance.getTeamMediaByYear(teamKey, year, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamMediaByYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamMediaByYear")
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

[**kotlin.Array&lt;Media&gt;**](Media.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamRobots**

> kotlin.Array&lt;TeamRobot&gt; getTeamRobots(teamKey, ifModifiedSince)

Gets a list of year and robot name pairs for each year that a robot name was provided. Will return an empty array if the team has never named a robot.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = TeamApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<TeamRobot> = apiInstance.getTeamRobots(teamKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamRobots")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamRobots")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **teamKey**         | **kotlin.String** | TBA Team Key, eg &#x60;frc254&#x60;                                                               | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

### Return type

[**kotlin.Array&lt;TeamRobot&gt;**](TeamRobot.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamSimple**

> TeamSimple getTeamSimple(teamKey, ifModifiedSince)

Gets a &#x60;Team_Simple&#x60; object for the team referenced by the given key.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = TeamApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : TeamSimple = apiInstance.getTeamSimple(teamKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamSimple")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **teamKey**         | **kotlin.String** | TBA Team Key, eg &#x60;frc254&#x60;                                                               | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

### Return type

[**TeamSimple**](TeamSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamSocialMedia**

> kotlin.Array&lt;Media&gt; getTeamSocialMedia(teamKey, ifModifiedSince)

Gets a list of Media (social media) for the given team.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = TeamApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Media> = apiInstance.getTeamSocialMedia(teamKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamSocialMedia")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamSocialMedia")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **teamKey**         | **kotlin.String** | TBA Team Key, eg &#x60;frc254&#x60;                                                               | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

### Return type

[**kotlin.Array&lt;Media&gt;**](Media.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

## **getTeamYearsParticipated**

> kotlin.Array&lt;kotlin.Int&gt; getTeamYearsParticipated(teamKey, ifModifiedSince)

Gets a list of years in which the team participated in at least one competition.

### Example

```kotlin
// Import classes:
//import com.thebluealliance.infrastructure.*
//import com.thebluealliance.model.*

val apiInstance = TeamApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.Int> = apiInstance.getTeamYearsParticipated(teamKey, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamYearsParticipated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamYearsParticipated")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **teamKey**         | **kotlin.String** | TBA Team Key, eg &#x60;frc254&#x60;                                                               | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

### Return type

**kotlin.Array&lt;kotlin.Int&gt;**

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

val apiInstance = TeamApi()
val pageNum : kotlin.Int = 56 // kotlin.Int | Page number of results to return, zero-indexed
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Team> = apiInstance.getTeams(pageNum, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeams")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **pageNum**         | **kotlin.Int**    | Page number of results to return, zero-indexed                                                    | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

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

val apiInstance = TeamApi()
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val pageNum : kotlin.Int = 56 // kotlin.Int | Page number of results to return, zero-indexed
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Team> = apiInstance.getTeamsByYear(year, pageNum, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamsByYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamsByYear")
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

val apiInstance = TeamApi()
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val pageNum : kotlin.Int = 56 // kotlin.Int | Page number of results to return, zero-indexed
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getTeamsByYearKeys(year, pageNum, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamsByYearKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamsByYearKeys")
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

val apiInstance = TeamApi()
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val pageNum : kotlin.Int = 56 // kotlin.Int | Page number of results to return, zero-indexed
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<TeamSimple> = apiInstance.getTeamsByYearSimple(year, pageNum, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamsByYearSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamsByYearSimple")
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

val apiInstance = TeamApi()
val pageNum : kotlin.Int = 56 // kotlin.Int | Page number of results to return, zero-indexed
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getTeamsKeys(pageNum, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamsKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamsKeys")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type              | Description                                                                                       | Notes                        |
| ------------------- | ----------------- | ------------------------------------------------------------------------------------------------- | ---------------------------- |
| **pageNum**         | **kotlin.Int**    | Page number of results to return, zero-indexed                                                    | [default to null]            |
| **ifModifiedSince** | **kotlin.String** | Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional] [default to null] |

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

val apiInstance = TeamApi()
val pageNum : kotlin.Int = 56 // kotlin.Int | Page number of results to return, zero-indexed
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<TeamSimple> = apiInstance.getTeamsSimple(pageNum, ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamsSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamsSimple")
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
