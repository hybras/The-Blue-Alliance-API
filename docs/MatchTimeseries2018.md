
# MatchTimeseries2018

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventKey** | **kotlin.String** | TBA event key with the format yyyy[EVENT_CODE], where yyyy is the year, and EVENT_CODE is the event code of the event. |  [optional]
**matchId** | **kotlin.String** | Match ID consisting of the level, match number, and set number, eg &#x60;qm45&#x60; or &#x60;f1m1&#x60;. |  [optional]
**mode** | **kotlin.String** | Current mode of play, can be &#x60;pre_match&#x60;, &#x60;auto&#x60;, &#x60;telop&#x60;, or &#x60;post_match&#x60;. |  [optional]
**play** | **kotlin.Int** |  |  [optional]
**timeRemaining** | **kotlin.Int** | Amount of time remaining in the match, only valid during &#x60;auto&#x60; and &#x60;teleop&#x60; modes. |  [optional]
**blueAutoQuest** | **kotlin.Int** | 1 if the blue alliance is credited with the AUTO QUEST, 0 if not. |  [optional]
**blueBoostCount** | **kotlin.Int** | Number of POWER CUBES in the BOOST section of the blue alliance VAULT. |  [optional]
**blueBoostPlayed** | **kotlin.Int** | Returns 1 if the blue alliance BOOST was played, or 0 if not played. |  [optional]
**blueCurrentPowerup** | **kotlin.String** | Name of the current blue alliance POWER UP being played, or &#x60;null&#x60;. |  [optional]
**blueFaceTheBoss** | **kotlin.Int** | 1 if the blue alliance is credited with FACING THE BOSS, 0 if not. |  [optional]
**blueForceCount** | **kotlin.Int** | Number of POWER CUBES in the FORCE section of the blue alliance VAULT. |  [optional]
**blueForcePlayed** | **kotlin.Int** | Returns 1 if the blue alliance FORCE was played, or 0 if not played. |  [optional]
**blueLevitateCount** | **kotlin.Int** | Number of POWER CUBES in the LEVITATE section of the blue alliance VAULT. |  [optional]
**blueLevitatePlayed** | **kotlin.Int** | Returns 1 if the blue alliance LEVITATE was played, or 0 if not played. |  [optional]
**bluePowerupTimeRemaining** | **kotlin.String** | Number of seconds remaining in the blue alliance POWER UP time, or 0 if none is active. |  [optional]
**blueScaleOwned** | **kotlin.Int** | 1 if the blue alliance owns the SCALE, 0 if not. |  [optional]
**blueScore** | **kotlin.Int** | Current score for the blue alliance. |  [optional]
**blueSwitchOwned** | **kotlin.Int** | 1 if the blue alliance owns their SWITCH, 0 if not. |  [optional]
**redAutoQuest** | **kotlin.Int** | 1 if the red alliance is credited with the AUTO QUEST, 0 if not. |  [optional]
**redBoostCount** | **kotlin.Int** | Number of POWER CUBES in the BOOST section of the red alliance VAULT. |  [optional]
**redBoostPlayed** | **kotlin.Int** | Returns 1 if the red alliance BOOST was played, or 0 if not played. |  [optional]
**redCurrentPowerup** | **kotlin.String** | Name of the current red alliance POWER UP being played, or &#x60;null&#x60;. |  [optional]
**redFaceTheBoss** | **kotlin.Int** | 1 if the red alliance is credited with FACING THE BOSS, 0 if not. |  [optional]
**redForceCount** | **kotlin.Int** | Number of POWER CUBES in the FORCE section of the red alliance VAULT. |  [optional]
**redForcePlayed** | **kotlin.Int** | Returns 1 if the red alliance FORCE was played, or 0 if not played. |  [optional]
**redLevitateCount** | **kotlin.Int** | Number of POWER CUBES in the LEVITATE section of the red alliance VAULT. |  [optional]
**redLevitatePlayed** | **kotlin.Int** | Returns 1 if the red alliance LEVITATE was played, or 0 if not played. |  [optional]
**redPowerupTimeRemaining** | **kotlin.String** | Number of seconds remaining in the red alliance POWER UP time, or 0 if none is active. |  [optional]
**redScaleOwned** | **kotlin.Int** | 1 if the red alliance owns the SCALE, 0 if not. |  [optional]
**redScore** | **kotlin.Int** | Current score for the red alliance. |  [optional]
**redSwitchOwned** | **kotlin.Int** | 1 if the red alliance owns their SWITCH, 0 if not. |  [optional]



