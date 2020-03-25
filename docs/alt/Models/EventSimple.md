# ./Models.EventSimple
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | [**String**](string.md) | TBA event key with the format yyyy[EVENT_CODE], where yyyy is the year, and EVENT_CODE is the event code of the event. | [default to null]
**name** | [**String**](string.md) | Official name of event on record either provided by FIRST or organizers of offseason event. | [default to null]
**eventUnderscorecode** | [**String**](string.md) | Event short code, as provided by FIRST. | [default to null]
**eventUnderscoretype** | [**Integer**](integer.md) | Event Type, as defined here: https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/event_type.py#L2 | [default to null]
**district** | [**District_List**](District_List.md) |  | [optional] [default to null]
**city** | [**String**](string.md) | City, town, village, etc. the event is located in. | [optional] [default to null]
**stateUnderscoreprov** | [**String**](string.md) | State or Province the event is located in. | [optional] [default to null]
**country** | [**String**](string.md) | Country the event is located in. | [optional] [default to null]
**startUnderscoredate** | [**date**](date.md) | Event start date in &#x60;yyyy-mm-dd&#x60; format. | [default to null]
**endUnderscoredate** | [**date**](date.md) | Event end date in &#x60;yyyy-mm-dd&#x60; format. | [default to null]
**year** | [**Integer**](integer.md) | Year the event data is for. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

