
# APIStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currentSeason** | **kotlin.Int** | Year of the current FRC season. | 
**maxSeason** | **kotlin.Int** | Maximum FRC season year for valid queries. | 
**isDatafeedDown** | **kotlin.Boolean** | True if the entire FMS API provided by FIRST is down. | 
**downEvents** | **kotlin.collections.List&lt;kotlin.String&gt;** | An array of strings containing event keys of any active events that are no longer updating. | 
**ios** | [**APIStatusAppVersion**](APIStatusAppVersion.md) |  | 
**android** | [**APIStatusAppVersion**](APIStatusAppVersion.md) |  | 



