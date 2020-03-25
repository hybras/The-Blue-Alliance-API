# ./Models.MatchTimeseries2018
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventUnderscorekey** | [**String**](string.md) | TBA event key with the format yyyy[EVENT_CODE], where yyyy is the year, and EVENT_CODE is the event code of the event. | [optional] [default to null]
**matchUnderscoreid** | [**String**](string.md) | Match ID consisting of the level, match number, and set number, eg &#x60;qm45&#x60; or &#x60;f1m1&#x60;. | [optional] [default to null]
**mode** | [**String**](string.md) | Current mode of play, can be &#x60;pre_match&#x60;, &#x60;auto&#x60;, &#x60;telop&#x60;, or &#x60;post_match&#x60;. | [optional] [default to null]
**play** | [**Integer**](integer.md) |  | [optional] [default to null]
**timeUnderscoreremaining** | [**Integer**](integer.md) | Amount of time remaining in the match, only valid during &#x60;auto&#x60; and &#x60;teleop&#x60; modes. | [optional] [default to null]
**blueUnderscoreautoUnderscorequest** | [**Integer**](integer.md) | 1 if the blue alliance is credited with the AUTO QUEST, 0 if not. | [optional] [default to null]
**blueUnderscoreboostUnderscorecount** | [**Integer**](integer.md) | Number of POWER CUBES in the BOOST section of the blue alliance VAULT. | [optional] [default to null]
**blueUnderscoreboostUnderscoreplayed** | [**Integer**](integer.md) | Returns 1 if the blue alliance BOOST was played, or 0 if not played. | [optional] [default to null]
**blueUnderscorecurrentUnderscorepowerup** | [**String**](string.md) | Name of the current blue alliance POWER UP being played, or &#x60;null&#x60;. | [optional] [default to null]
**blueUnderscorefaceUnderscoretheUnderscoreboss** | [**Integer**](integer.md) | 1 if the blue alliance is credited with FACING THE BOSS, 0 if not. | [optional] [default to null]
**blueUnderscoreforceUnderscorecount** | [**Integer**](integer.md) | Number of POWER CUBES in the FORCE section of the blue alliance VAULT. | [optional] [default to null]
**blueUnderscoreforceUnderscoreplayed** | [**Integer**](integer.md) | Returns 1 if the blue alliance FORCE was played, or 0 if not played. | [optional] [default to null]
**blueUnderscorelevitateUnderscorecount** | [**Integer**](integer.md) | Number of POWER CUBES in the LEVITATE section of the blue alliance VAULT. | [optional] [default to null]
**blueUnderscorelevitateUnderscoreplayed** | [**Integer**](integer.md) | Returns 1 if the blue alliance LEVITATE was played, or 0 if not played. | [optional] [default to null]
**blueUnderscorepowerupUnderscoretimeUnderscoreremaining** | [**String**](string.md) | Number of seconds remaining in the blue alliance POWER UP time, or 0 if none is active. | [optional] [default to null]
**blueUnderscorescaleUnderscoreowned** | [**Integer**](integer.md) | 1 if the blue alliance owns the SCALE, 0 if not. | [optional] [default to null]
**blueUnderscorescore** | [**Integer**](integer.md) | Current score for the blue alliance. | [optional] [default to null]
**blueUnderscoreswitchUnderscoreowned** | [**Integer**](integer.md) | 1 if the blue alliance owns their SWITCH, 0 if not. | [optional] [default to null]
**redUnderscoreautoUnderscorequest** | [**Integer**](integer.md) | 1 if the red alliance is credited with the AUTO QUEST, 0 if not. | [optional] [default to null]
**redUnderscoreboostUnderscorecount** | [**Integer**](integer.md) | Number of POWER CUBES in the BOOST section of the red alliance VAULT. | [optional] [default to null]
**redUnderscoreboostUnderscoreplayed** | [**Integer**](integer.md) | Returns 1 if the red alliance BOOST was played, or 0 if not played. | [optional] [default to null]
**redUnderscorecurrentUnderscorepowerup** | [**String**](string.md) | Name of the current red alliance POWER UP being played, or &#x60;null&#x60;. | [optional] [default to null]
**redUnderscorefaceUnderscoretheUnderscoreboss** | [**Integer**](integer.md) | 1 if the red alliance is credited with FACING THE BOSS, 0 if not. | [optional] [default to null]
**redUnderscoreforceUnderscorecount** | [**Integer**](integer.md) | Number of POWER CUBES in the FORCE section of the red alliance VAULT. | [optional] [default to null]
**redUnderscoreforceUnderscoreplayed** | [**Integer**](integer.md) | Returns 1 if the red alliance FORCE was played, or 0 if not played. | [optional] [default to null]
**redUnderscorelevitateUnderscorecount** | [**Integer**](integer.md) | Number of POWER CUBES in the LEVITATE section of the red alliance VAULT. | [optional] [default to null]
**redUnderscorelevitateUnderscoreplayed** | [**Integer**](integer.md) | Returns 1 if the red alliance LEVITATE was played, or 0 if not played. | [optional] [default to null]
**redUnderscorepowerupUnderscoretimeUnderscoreremaining** | [**String**](string.md) | Number of seconds remaining in the red alliance POWER UP time, or 0 if none is active. | [optional] [default to null]
**redUnderscorescaleUnderscoreowned** | [**Integer**](integer.md) | 1 if the red alliance owns the SCALE, 0 if not. | [optional] [default to null]
**redUnderscorescore** | [**Integer**](integer.md) | Current score for the red alliance. | [optional] [default to null]
**redUnderscoreswitchUnderscoreowned** | [**Integer**](integer.md) | 1 if the red alliance owns their SWITCH, 0 if not. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

