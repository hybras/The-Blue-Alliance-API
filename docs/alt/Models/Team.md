# ./Models.Team
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | [**String**](string.md) | TBA team key with the format &#x60;frcXXXX&#x60; with &#x60;XXXX&#x60; representing the team number. | [default to null]
**teamUnderscorenumber** | [**Integer**](integer.md) | Official team number issued by FIRST. | [default to null]
**nickname** | [**String**](string.md) | Team nickname provided by FIRST. | [optional] [default to null]
**name** | [**String**](string.md) | Official long name registered with FIRST. | [default to null]
**schoolUnderscorename** | [**String**](string.md) | Name of team school or affilited group registered with FIRST. | [optional] [default to null]
**city** | [**String**](string.md) | City of team derived from parsing the address registered with FIRST. | [optional] [default to null]
**stateUnderscoreprov** | [**String**](string.md) | State of team derived from parsing the address registered with FIRST. | [optional] [default to null]
**country** | [**String**](string.md) | Country of team derived from parsing the address registered with FIRST. | [optional] [default to null]
**address** | [**String**](string.md) | Will be NULL, for future development. | [optional] [default to null]
**postalUnderscorecode** | [**String**](string.md) | Postal code from the team address. | [optional] [default to null]
**gmapsUnderscoreplaceUnderscoreid** | [**String**](string.md) | Will be NULL, for future development. | [optional] [default to null]
**gmapsUnderscoreurl** | [**String**](string.md) | Will be NULL, for future development. | [optional] [default to null]
**lat** | [**Double**](double.md) | Will be NULL, for future development. | [optional] [default to null]
**lng** | [**Double**](double.md) | Will be NULL, for future development. | [optional] [default to null]
**locationUnderscorename** | [**String**](string.md) | Will be NULL, for future development. | [optional] [default to null]
**website** | [**String**](string.md) | Official website associated with the team. | [optional] [default to null]
**rookieUnderscoreyear** | [**Integer**](integer.md) | First year the team officially competed. | [optional] [default to null]
**motto** | [**String**](string.md) | Team&#39;s motto as provided by FIRST. This field is deprecated and will return null - will be removed at end-of-season in 2019. | [optional] [default to null]
**homeUnderscorechampionship** | [**Object**](.md) | Location of the team&#39;s home championship each year as a key-value pair. The year (as a string) is the key, and the city is the value. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

