# ./Models.APIStatus
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currentUnderscoreseason** | [**Integer**](integer.md) | Year of the current FRC season. | [default to null]
**maxUnderscoreseason** | [**Integer**](integer.md) | Maximum FRC season year for valid queries. | [default to null]
**isUnderscoredatafeedUnderscoredown** | [**Boolean**](boolean.md) | True if the entire FMS API provided by FIRST is down. | [default to null]
**downUnderscoreevents** | [**List**](string.md) | An array of strings containing event keys of any active events that are no longer updating. | [default to null]
**ios** | [**API_Status_App_Version**](API_Status_App_Version.md) |  | [default to null]
**android** | [**API_Status_App_Version**](API_Status_App_Version.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

