
# Webcast

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#TypeEnum) | Type of webcast, typically descriptive of the streaming provider. | 
**channel** | **kotlin.String** | Type specific channel information. May be the YouTube stream, or Twitch channel name. In the case of iframe types, contains HTML to embed the stream in an HTML iframe. | 
**file** | **kotlin.String** | File identification as may be required for some types. May be null. |  [optional]


<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | youtube, twitch, ustream, iframe, html5, rtmp, livestream, direct_link, mms, justin, stemtv, dacast



