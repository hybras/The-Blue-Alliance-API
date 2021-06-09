
# Media

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#TypeEnum) | String type of the media element. | 
**foreignKey** | **kotlin.String** | The key used to identify this media on the media site. | 
**details** | [**kotlin.Any**](.md) | If required, a JSON dict of additional media information. |  [optional]
**preferred** | **kotlin.Boolean** | True if the media is of high quality. |  [optional]
**directUrl** | **kotlin.String** | Direct URL to the media. |  [optional]
**viewUrl** | **kotlin.String** | The URL that leads to the full web page for the media, if one exists. |  [optional]


<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | youtube, cdphotothread, imgur, facebook-profile, youtube-channel, twitter-profile, github-profile, instagram-profile, periscope-profile, grabcad, instagram-image, external-link, avatar



