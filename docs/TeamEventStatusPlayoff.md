
# TeamEventStatusPlayoff

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**level** | [**inline**](#LevelEnum) | The highest playoff level the team reached. |  [optional]
**currentLevelRecord** | [**WLTRecord**](WLTRecord.md) |  |  [optional]
**record** | [**WLTRecord**](WLTRecord.md) |  |  [optional]
**status** | [**inline**](#StatusEnum) | Current competition status for the playoffs. |  [optional]
**playoffAverage** | **kotlin.Int** | The average match score during playoffs. Year specific. May be null if not relevant for a given year. |  [optional]


<a name="LevelEnum"></a>
## Enum: level
Name | Value
---- | -----
level | qm, ef, qf, sf, f


<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | won, eliminated, playing



