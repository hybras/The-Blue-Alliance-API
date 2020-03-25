# ./Models.EventRankingRankings
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**matchesUnderscoreplayed** | [**Integer**](integer.md) | Number of matches played by this team. | [default to null]
**qualUnderscoreaverage** | [**Integer**](integer.md) | The average match score during qualifications. Year specific. May be null if not relevant for a given year. | [optional] [default to null]
**extraUnderscorestats** | [**List**](number.md) | Additional special data on the team&#39;s performance calculated by TBA. | [optional] [default to null]
**sortUnderscoreorders** | [**List**](number.md) | Additional year-specific information, may be null. See parent &#x60;sort_order_info&#x60; for details. | [optional] [default to null]
**record** | [**WLT_Record**](WLT_Record.md) |  | [default to null]
**rank** | [**Integer**](integer.md) | The team&#39;s rank at the event as provided by FIRST. | [default to null]
**dq** | [**Integer**](integer.md) | Number of times disqualified. | [default to null]
**teamUnderscorekey** | [**String**](string.md) | The team with this rank. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

