# ./Models.Event
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
**shortUnderscorename** | [**String**](string.md) | Same as &#x60;name&#x60; but doesn&#39;t include event specifiers, such as &#39;Regional&#39; or &#39;District&#39;. May be null. | [optional] [default to null]
**eventUnderscoretypeUnderscorestring** | [**String**](string.md) | Event Type, eg Regional, District, or Offseason. | [default to null]
**week** | [**Integer**](integer.md) | Week of the event relative to the first official season event, zero-indexed. Only valid for Regionals, Districts, and District Championships. Null otherwise. (Eg. A season with a week 0 &#39;preseason&#39; event does not count, and week 1 events will show 0 here. Seasons with a week 0.5 regional event will show week 0 for those event(s) and week 1 for week 1 events and so on.) | [optional] [default to null]
**address** | [**String**](string.md) | Address of the event&#39;s venue, if available. | [optional] [default to null]
**postalUnderscorecode** | [**String**](string.md) | Postal code from the event address. | [optional] [default to null]
**gmapsUnderscoreplaceUnderscoreid** | [**String**](string.md) | Google Maps Place ID for the event address. | [optional] [default to null]
**gmapsUnderscoreurl** | [**String**](string.md) | Link to address location on Google Maps. | [optional] [default to null]
**lat** | [**Double**](double.md) | Latitude for the event address. | [optional] [default to null]
**lng** | [**Double**](double.md) | Longitude for the event address. | [optional] [default to null]
**locationUnderscorename** | [**String**](string.md) | Name of the location at the address for the event, eg. Blue Alliance High School. | [optional] [default to null]
**timezone** | [**String**](string.md) | Timezone name. | [optional] [default to null]
**website** | [**String**](string.md) | The event&#39;s website, if any. | [optional] [default to null]
**firstUnderscoreeventUnderscoreid** | [**String**](string.md) | The FIRST internal Event ID, used to link to the event on the FRC webpage. | [optional] [default to null]
**firstUnderscoreeventUnderscorecode** | [**String**](string.md) | Public facing event code used by FIRST (on frc-events.firstinspires.org, for example) | [optional] [default to null]
**webcasts** | [**List**](Webcast.md) |  | [optional] [default to null]
**divisionUnderscorekeys** | [**List**](string.md) | An array of event keys for the divisions at this event. | [optional] [default to null]
**parentUnderscoreeventUnderscorekey** | [**String**](string.md) | The TBA Event key that represents the event&#39;s parent. Used to link back to the event from a division event. It is also the inverse relation of &#x60;divison_keys&#x60;. | [optional] [default to null]
**playoffUnderscoretype** | [**Integer**](integer.md) | Playoff Type, as defined here: https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/playoff_type.py#L4, or null. | [optional] [default to null]
**playoffUnderscoretypeUnderscorestring** | [**String**](string.md) | String representation of the &#x60;playoff_type&#x60;, or null. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

