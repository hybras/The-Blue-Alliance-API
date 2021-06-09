
# Team

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **kotlin.String** | TBA team key with the format &#x60;frcXXXX&#x60; with &#x60;XXXX&#x60; representing the team number. | 
**teamNumber** | **kotlin.Int** | Official team number issued by FIRST. | 
**name** | **kotlin.String** | Official long name registered with FIRST. | 
**nickname** | **kotlin.String** | Team nickname provided by FIRST. |  [optional]
**schoolName** | **kotlin.String** | Name of team school or affilited group registered with FIRST. |  [optional]
**city** | **kotlin.String** | City of team derived from parsing the address registered with FIRST. |  [optional]
**stateProv** | **kotlin.String** | State of team derived from parsing the address registered with FIRST. |  [optional]
**country** | **kotlin.String** | Country of team derived from parsing the address registered with FIRST. |  [optional]
**address** | **kotlin.String** | Will be NULL, for future development. |  [optional]
**postalCode** | **kotlin.String** | Postal code from the team address. |  [optional]
**gmapsPlaceId** | **kotlin.String** | Will be NULL, for future development. |  [optional]
**gmapsUrl** | **kotlin.String** | Will be NULL, for future development. |  [optional]
**lat** | **kotlin.Double** | Will be NULL, for future development. |  [optional]
**lng** | **kotlin.Double** | Will be NULL, for future development. |  [optional]
**locationName** | **kotlin.String** | Will be NULL, for future development. |  [optional]
**website** | **kotlin.String** | Official website associated with the team. |  [optional]
**rookieYear** | **kotlin.Int** | First year the team officially competed. |  [optional]
**motto** | **kotlin.String** | Team&#39;s motto as provided by FIRST. This field is deprecated and will return null - will be removed at end-of-season in 2019. |  [optional]
**homeChampionship** | [**kotlin.Any**](.md) | Location of the team&#39;s home championship each year as a key-value pair. The year (as a string) is the key, and the city is the value. |  [optional]



