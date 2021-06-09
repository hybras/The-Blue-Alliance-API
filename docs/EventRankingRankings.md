
# EventRankingRankings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**matchesPlayed** | **kotlin.Int** | Number of matches played by this team. | 
**record** | [**WLTRecord**](WLTRecord.md) |  | 
**rank** | **kotlin.Int** | The team&#39;s rank at the event as provided by FIRST. | 
**dq** | **kotlin.Int** | Number of times disqualified. | 
**teamKey** | **kotlin.String** | The team with this rank. | 
**qualAverage** | **kotlin.Int** | The average match score during qualifications. Year specific. May be null if not relevant for a given year. |  [optional]
**extraStats** | [**kotlin.collections.List&lt;java.math.BigDecimal&gt;**](java.math.BigDecimal.md) | Additional special data on the team&#39;s performance calculated by TBA. |  [optional]
**sortOrders** | [**kotlin.collections.List&lt;java.math.BigDecimal&gt;**](java.math.BigDecimal.md) | Additional year-specific information, may be null. See parent &#x60;sort_order_info&#x60; for details. |  [optional]



