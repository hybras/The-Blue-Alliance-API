# ./Models.Award
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**String**](string.md) | The name of the award as provided by FIRST. May vary for the same award type. | [default to null]
**awardUnderscoretype** | [**Integer**](integer.md) | Type of award given. See https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/award_type.py#L6 | [default to null]
**eventUnderscorekey** | [**String**](string.md) | The event_key of the event the award was won at. | [default to null]
**recipientUnderscorelist** | [**List**](Award_Recipient.md) | A list of recipients of the award at the event. May have either a team_key or an awardee, both, or neither (in the case the award wasn&#39;t awarded at the event). | [default to null]
**year** | [**Integer**](integer.md) | The year this award was won. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

