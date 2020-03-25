# Documentation for The Blue Alliance API v3

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://www.thebluealliance.com/api/v3*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DistrictApi* | [**getDistrictEvents**](Apis/DistrictApi.md#getdistrictevents) | **GET** /district/{district_key}/events | 
*DistrictApi* | [**getDistrictEventsKeys**](Apis/DistrictApi.md#getdistricteventskeys) | **GET** /district/{district_key}/events/keys | 
*DistrictApi* | [**getDistrictEventsSimple**](Apis/DistrictApi.md#getdistricteventssimple) | **GET** /district/{district_key}/events/simple | 
*DistrictApi* | [**getDistrictRankings**](Apis/DistrictApi.md#getdistrictrankings) | **GET** /district/{district_key}/rankings | 
*DistrictApi* | [**getDistrictTeams**](Apis/DistrictApi.md#getdistrictteams) | **GET** /district/{district_key}/teams | 
*DistrictApi* | [**getDistrictTeamsKeys**](Apis/DistrictApi.md#getdistrictteamskeys) | **GET** /district/{district_key}/teams/keys | 
*DistrictApi* | [**getDistrictTeamsSimple**](Apis/DistrictApi.md#getdistrictteamssimple) | **GET** /district/{district_key}/teams/simple | 
*DistrictApi* | [**getDistrictsByYear**](Apis/DistrictApi.md#getdistrictsbyyear) | **GET** /districts/{year} | 
*DistrictApi* | [**getEventDistrictPoints**](Apis/DistrictApi.md#geteventdistrictpoints) | **GET** /event/{event_key}/district_points | 
*DistrictApi* | [**getTeamDistricts**](Apis/DistrictApi.md#getteamdistricts) | **GET** /team/{team_key}/districts | 
*EventApi* | [**getDistrictEvents**](Apis/EventApi.md#getdistrictevents) | **GET** /district/{district_key}/events | 
*EventApi* | [**getDistrictEventsKeys**](Apis/EventApi.md#getdistricteventskeys) | **GET** /district/{district_key}/events/keys | 
*EventApi* | [**getDistrictEventsSimple**](Apis/EventApi.md#getdistricteventssimple) | **GET** /district/{district_key}/events/simple | 
*EventApi* | [**getEvent**](Apis/EventApi.md#getevent) | **GET** /event/{event_key} | 
*EventApi* | [**getEventAlliances**](Apis/EventApi.md#geteventalliances) | **GET** /event/{event_key}/alliances | 
*EventApi* | [**getEventAwards**](Apis/EventApi.md#geteventawards) | **GET** /event/{event_key}/awards | 
*EventApi* | [**getEventDistrictPoints**](Apis/EventApi.md#geteventdistrictpoints) | **GET** /event/{event_key}/district_points | 
*EventApi* | [**getEventInsights**](Apis/EventApi.md#geteventinsights) | **GET** /event/{event_key}/insights | 
*EventApi* | [**getEventMatchTimeseries**](Apis/EventApi.md#geteventmatchtimeseries) | **GET** /event/{event_key}/matches/timeseries | 
*EventApi* | [**getEventMatches**](Apis/EventApi.md#geteventmatches) | **GET** /event/{event_key}/matches | 
*EventApi* | [**getEventMatchesKeys**](Apis/EventApi.md#geteventmatcheskeys) | **GET** /event/{event_key}/matches/keys | 
*EventApi* | [**getEventMatchesSimple**](Apis/EventApi.md#geteventmatchessimple) | **GET** /event/{event_key}/matches/simple | 
*EventApi* | [**getEventOPRs**](Apis/EventApi.md#geteventoprs) | **GET** /event/{event_key}/oprs | 
*EventApi* | [**getEventPredictions**](Apis/EventApi.md#geteventpredictions) | **GET** /event/{event_key}/predictions | 
*EventApi* | [**getEventRankings**](Apis/EventApi.md#geteventrankings) | **GET** /event/{event_key}/rankings | 
*EventApi* | [**getEventSimple**](Apis/EventApi.md#geteventsimple) | **GET** /event/{event_key}/simple | 
*EventApi* | [**getEventTeams**](Apis/EventApi.md#geteventteams) | **GET** /event/{event_key}/teams | 
*EventApi* | [**getEventTeamsKeys**](Apis/EventApi.md#geteventteamskeys) | **GET** /event/{event_key}/teams/keys | 
*EventApi* | [**getEventTeamsSimple**](Apis/EventApi.md#geteventteamssimple) | **GET** /event/{event_key}/teams/simple | 
*EventApi* | [**getEventTeamsStatuses**](Apis/EventApi.md#geteventteamsstatuses) | **GET** /event/{event_key}/teams/statuses | 
*EventApi* | [**getEventsByYear**](Apis/EventApi.md#geteventsbyyear) | **GET** /events/{year} | 
*EventApi* | [**getEventsByYearKeys**](Apis/EventApi.md#geteventsbyyearkeys) | **GET** /events/{year}/keys | 
*EventApi* | [**getEventsByYearSimple**](Apis/EventApi.md#geteventsbyyearsimple) | **GET** /events/{year}/simple | 
*EventApi* | [**getTeamEventAwards**](Apis/EventApi.md#getteameventawards) | **GET** /team/{team_key}/event/{event_key}/awards | 
*EventApi* | [**getTeamEventMatches**](Apis/EventApi.md#getteameventmatches) | **GET** /team/{team_key}/event/{event_key}/matches | 
*EventApi* | [**getTeamEventMatchesKeys**](Apis/EventApi.md#getteameventmatcheskeys) | **GET** /team/{team_key}/event/{event_key}/matches/keys | 
*EventApi* | [**getTeamEventMatchesSimple**](Apis/EventApi.md#getteameventmatchessimple) | **GET** /team/{team_key}/event/{event_key}/matches/simple | 
*EventApi* | [**getTeamEventStatus**](Apis/EventApi.md#getteameventstatus) | **GET** /team/{team_key}/event/{event_key}/status | 
*EventApi* | [**getTeamEvents**](Apis/EventApi.md#getteamevents) | **GET** /team/{team_key}/events | 
*EventApi* | [**getTeamEventsByYear**](Apis/EventApi.md#getteameventsbyyear) | **GET** /team/{team_key}/events/{year} | 
*EventApi* | [**getTeamEventsByYearKeys**](Apis/EventApi.md#getteameventsbyyearkeys) | **GET** /team/{team_key}/events/{year}/keys | 
*EventApi* | [**getTeamEventsByYearSimple**](Apis/EventApi.md#getteameventsbyyearsimple) | **GET** /team/{team_key}/events/{year}/simple | 
*EventApi* | [**getTeamEventsKeys**](Apis/EventApi.md#getteameventskeys) | **GET** /team/{team_key}/events/keys | 
*EventApi* | [**getTeamEventsSimple**](Apis/EventApi.md#getteameventssimple) | **GET** /team/{team_key}/events/simple | 
*EventApi* | [**getTeamEventsStatusesByYear**](Apis/EventApi.md#getteameventsstatusesbyyear) | **GET** /team/{team_key}/events/{year}/statuses | 
*ListApi* | [**getDistrictEvents**](Apis/ListApi.md#getdistrictevents) | **GET** /district/{district_key}/events | 
*ListApi* | [**getDistrictEventsKeys**](Apis/ListApi.md#getdistricteventskeys) | **GET** /district/{district_key}/events/keys | 
*ListApi* | [**getDistrictEventsSimple**](Apis/ListApi.md#getdistricteventssimple) | **GET** /district/{district_key}/events/simple | 
*ListApi* | [**getDistrictRankings**](Apis/ListApi.md#getdistrictrankings) | **GET** /district/{district_key}/rankings | 
*ListApi* | [**getDistrictTeams**](Apis/ListApi.md#getdistrictteams) | **GET** /district/{district_key}/teams | 
*ListApi* | [**getDistrictTeamsKeys**](Apis/ListApi.md#getdistrictteamskeys) | **GET** /district/{district_key}/teams/keys | 
*ListApi* | [**getDistrictTeamsSimple**](Apis/ListApi.md#getdistrictteamssimple) | **GET** /district/{district_key}/teams/simple | 
*ListApi* | [**getEventTeams**](Apis/ListApi.md#geteventteams) | **GET** /event/{event_key}/teams | 
*ListApi* | [**getEventTeamsKeys**](Apis/ListApi.md#geteventteamskeys) | **GET** /event/{event_key}/teams/keys | 
*ListApi* | [**getEventTeamsSimple**](Apis/ListApi.md#geteventteamssimple) | **GET** /event/{event_key}/teams/simple | 
*ListApi* | [**getEventTeamsStatuses**](Apis/ListApi.md#geteventteamsstatuses) | **GET** /event/{event_key}/teams/statuses | 
*ListApi* | [**getEventsByYear**](Apis/ListApi.md#geteventsbyyear) | **GET** /events/{year} | 
*ListApi* | [**getEventsByYearKeys**](Apis/ListApi.md#geteventsbyyearkeys) | **GET** /events/{year}/keys | 
*ListApi* | [**getEventsByYearSimple**](Apis/ListApi.md#geteventsbyyearsimple) | **GET** /events/{year}/simple | 
*ListApi* | [**getTeamEventsStatusesByYear**](Apis/ListApi.md#getteameventsstatusesbyyear) | **GET** /team/{team_key}/events/{year}/statuses | 
*ListApi* | [**getTeams**](Apis/ListApi.md#getteams) | **GET** /teams/{page_num} | 
*ListApi* | [**getTeamsByYear**](Apis/ListApi.md#getteamsbyyear) | **GET** /teams/{year}/{page_num} | 
*ListApi* | [**getTeamsByYearKeys**](Apis/ListApi.md#getteamsbyyearkeys) | **GET** /teams/{year}/{page_num}/keys | 
*ListApi* | [**getTeamsByYearSimple**](Apis/ListApi.md#getteamsbyyearsimple) | **GET** /teams/{year}/{page_num}/simple | 
*ListApi* | [**getTeamsKeys**](Apis/ListApi.md#getteamskeys) | **GET** /teams/{page_num}/keys | 
*ListApi* | [**getTeamsSimple**](Apis/ListApi.md#getteamssimple) | **GET** /teams/{page_num}/simple | 
*MatchApi* | [**getEventMatchTimeseries**](Apis/MatchApi.md#geteventmatchtimeseries) | **GET** /event/{event_key}/matches/timeseries | 
*MatchApi* | [**getEventMatches**](Apis/MatchApi.md#geteventmatches) | **GET** /event/{event_key}/matches | 
*MatchApi* | [**getEventMatchesKeys**](Apis/MatchApi.md#geteventmatcheskeys) | **GET** /event/{event_key}/matches/keys | 
*MatchApi* | [**getEventMatchesSimple**](Apis/MatchApi.md#geteventmatchessimple) | **GET** /event/{event_key}/matches/simple | 
*MatchApi* | [**getMatch**](Apis/MatchApi.md#getmatch) | **GET** /match/{match_key} | 
*MatchApi* | [**getMatchSimple**](Apis/MatchApi.md#getmatchsimple) | **GET** /match/{match_key}/simple | 
*MatchApi* | [**getMatchTimeseries**](Apis/MatchApi.md#getmatchtimeseries) | **GET** /match/{match_key}/timeseries | 
*MatchApi* | [**getMatchZebra**](Apis/MatchApi.md#getmatchzebra) | **GET** /match/{match_key}/zebra_motionworks | 
*MatchApi* | [**getTeamEventMatches**](Apis/MatchApi.md#getteameventmatches) | **GET** /team/{team_key}/event/{event_key}/matches | 
*MatchApi* | [**getTeamEventMatchesKeys**](Apis/MatchApi.md#getteameventmatcheskeys) | **GET** /team/{team_key}/event/{event_key}/matches/keys | 
*MatchApi* | [**getTeamEventMatchesSimple**](Apis/MatchApi.md#getteameventmatchessimple) | **GET** /team/{team_key}/event/{event_key}/matches/simple | 
*MatchApi* | [**getTeamMatchesByYear**](Apis/MatchApi.md#getteammatchesbyyear) | **GET** /team/{team_key}/matches/{year} | 
*MatchApi* | [**getTeamMatchesByYearKeys**](Apis/MatchApi.md#getteammatchesbyyearkeys) | **GET** /team/{team_key}/matches/{year}/keys | 
*MatchApi* | [**getTeamMatchesByYearSimple**](Apis/MatchApi.md#getteammatchesbyyearsimple) | **GET** /team/{team_key}/matches/{year}/simple | 
*TBAApi* | [**getStatus**](Apis/TBAApi.md#getstatus) | **GET** /status | 
*TeamApi* | [**getDistrictRankings**](Apis/TeamApi.md#getdistrictrankings) | **GET** /district/{district_key}/rankings | 
*TeamApi* | [**getDistrictTeams**](Apis/TeamApi.md#getdistrictteams) | **GET** /district/{district_key}/teams | 
*TeamApi* | [**getDistrictTeamsKeys**](Apis/TeamApi.md#getdistrictteamskeys) | **GET** /district/{district_key}/teams/keys | 
*TeamApi* | [**getDistrictTeamsSimple**](Apis/TeamApi.md#getdistrictteamssimple) | **GET** /district/{district_key}/teams/simple | 
*TeamApi* | [**getEventTeams**](Apis/TeamApi.md#geteventteams) | **GET** /event/{event_key}/teams | 
*TeamApi* | [**getEventTeamsKeys**](Apis/TeamApi.md#geteventteamskeys) | **GET** /event/{event_key}/teams/keys | 
*TeamApi* | [**getEventTeamsSimple**](Apis/TeamApi.md#geteventteamssimple) | **GET** /event/{event_key}/teams/simple | 
*TeamApi* | [**getEventTeamsStatuses**](Apis/TeamApi.md#geteventteamsstatuses) | **GET** /event/{event_key}/teams/statuses | 
*TeamApi* | [**getTeam**](Apis/TeamApi.md#getteam) | **GET** /team/{team_key} | 
*TeamApi* | [**getTeamAwards**](Apis/TeamApi.md#getteamawards) | **GET** /team/{team_key}/awards | 
*TeamApi* | [**getTeamAwardsByYear**](Apis/TeamApi.md#getteamawardsbyyear) | **GET** /team/{team_key}/awards/{year} | 
*TeamApi* | [**getTeamDistricts**](Apis/TeamApi.md#getteamdistricts) | **GET** /team/{team_key}/districts | 
*TeamApi* | [**getTeamEventAwards**](Apis/TeamApi.md#getteameventawards) | **GET** /team/{team_key}/event/{event_key}/awards | 
*TeamApi* | [**getTeamEventMatches**](Apis/TeamApi.md#getteameventmatches) | **GET** /team/{team_key}/event/{event_key}/matches | 
*TeamApi* | [**getTeamEventMatchesKeys**](Apis/TeamApi.md#getteameventmatcheskeys) | **GET** /team/{team_key}/event/{event_key}/matches/keys | 
*TeamApi* | [**getTeamEventMatchesSimple**](Apis/TeamApi.md#getteameventmatchessimple) | **GET** /team/{team_key}/event/{event_key}/matches/simple | 
*TeamApi* | [**getTeamEventStatus**](Apis/TeamApi.md#getteameventstatus) | **GET** /team/{team_key}/event/{event_key}/status | 
*TeamApi* | [**getTeamEvents**](Apis/TeamApi.md#getteamevents) | **GET** /team/{team_key}/events | 
*TeamApi* | [**getTeamEventsByYear**](Apis/TeamApi.md#getteameventsbyyear) | **GET** /team/{team_key}/events/{year} | 
*TeamApi* | [**getTeamEventsByYearKeys**](Apis/TeamApi.md#getteameventsbyyearkeys) | **GET** /team/{team_key}/events/{year}/keys | 
*TeamApi* | [**getTeamEventsByYearSimple**](Apis/TeamApi.md#getteameventsbyyearsimple) | **GET** /team/{team_key}/events/{year}/simple | 
*TeamApi* | [**getTeamEventsKeys**](Apis/TeamApi.md#getteameventskeys) | **GET** /team/{team_key}/events/keys | 
*TeamApi* | [**getTeamEventsSimple**](Apis/TeamApi.md#getteameventssimple) | **GET** /team/{team_key}/events/simple | 
*TeamApi* | [**getTeamEventsStatusesByYear**](Apis/TeamApi.md#getteameventsstatusesbyyear) | **GET** /team/{team_key}/events/{year}/statuses | 
*TeamApi* | [**getTeamMatchesByYear**](Apis/TeamApi.md#getteammatchesbyyear) | **GET** /team/{team_key}/matches/{year} | 
*TeamApi* | [**getTeamMatchesByYearKeys**](Apis/TeamApi.md#getteammatchesbyyearkeys) | **GET** /team/{team_key}/matches/{year}/keys | 
*TeamApi* | [**getTeamMatchesByYearSimple**](Apis/TeamApi.md#getteammatchesbyyearsimple) | **GET** /team/{team_key}/matches/{year}/simple | 
*TeamApi* | [**getTeamMediaByTag**](Apis/TeamApi.md#getteammediabytag) | **GET** /team/{team_key}/media/tag/{media_tag} | 
*TeamApi* | [**getTeamMediaByTagYear**](Apis/TeamApi.md#getteammediabytagyear) | **GET** /team/{team_key}/media/tag/{media_tag}/{year} | 
*TeamApi* | [**getTeamMediaByYear**](Apis/TeamApi.md#getteammediabyyear) | **GET** /team/{team_key}/media/{year} | 
*TeamApi* | [**getTeamRobots**](Apis/TeamApi.md#getteamrobots) | **GET** /team/{team_key}/robots | 
*TeamApi* | [**getTeamSimple**](Apis/TeamApi.md#getteamsimple) | **GET** /team/{team_key}/simple | 
*TeamApi* | [**getTeamSocialMedia**](Apis/TeamApi.md#getteamsocialmedia) | **GET** /team/{team_key}/social_media | 
*TeamApi* | [**getTeamYearsParticipated**](Apis/TeamApi.md#getteamyearsparticipated) | **GET** /team/{team_key}/years_participated | 
*TeamApi* | [**getTeams**](Apis/TeamApi.md#getteams) | **GET** /teams/{page_num} | 
*TeamApi* | [**getTeamsByYear**](Apis/TeamApi.md#getteamsbyyear) | **GET** /teams/{year}/{page_num} | 
*TeamApi* | [**getTeamsByYearKeys**](Apis/TeamApi.md#getteamsbyyearkeys) | **GET** /teams/{year}/{page_num}/keys | 
*TeamApi* | [**getTeamsByYearSimple**](Apis/TeamApi.md#getteamsbyyearsimple) | **GET** /teams/{year}/{page_num}/simple | 
*TeamApi* | [**getTeamsKeys**](Apis/TeamApi.md#getteamskeys) | **GET** /teams/{page_num}/keys | 
*TeamApi* | [**getTeamsSimple**](Apis/TeamApi.md#getteamssimple) | **GET** /teams/{page_num}/simple | 


<a name="documentation-for-models"></a>
## Documentation for Models

 - [/Models.APIStatus](Models/APIStatus.md)
 - [/Models.APIStatusAppVersion](Models/APIStatusAppVersion.md)
 - [/Models.Award](Models/Award.md)
 - [/Models.AwardRecipient](Models/AwardRecipient.md)
 - [/Models.DistrictList](Models/DistrictList.md)
 - [/Models.DistrictRanking](Models/DistrictRanking.md)
 - [/Models.DistrictRankingEventPoints](Models/DistrictRankingEventPoints.md)
 - [/Models.EliminationAlliance](Models/EliminationAlliance.md)
 - [/Models.EliminationAllianceBackup](Models/EliminationAllianceBackup.md)
 - [/Models.EliminationAllianceStatus](Models/EliminationAllianceStatus.md)
 - [/Models.Event](Models/Event.md)
 - [/Models.EventDistrictPoints](Models/EventDistrictPoints.md)
 - [/Models.EventDistrictPointsPoints](Models/EventDistrictPointsPoints.md)
 - [/Models.EventDistrictPointsTiebreakers](Models/EventDistrictPointsTiebreakers.md)
 - [/Models.EventInsights](Models/EventInsights.md)
 - [/Models.EventInsights2016](Models/EventInsights2016.md)
 - [/Models.EventInsights2017](Models/EventInsights2017.md)
 - [/Models.EventInsights2018](Models/EventInsights2018.md)
 - [/Models.EventOPRs](Models/EventOPRs.md)
 - [/Models.EventRanking](Models/EventRanking.md)
 - [/Models.EventRankingExtraStatsInfo](Models/EventRankingExtraStatsInfo.md)
 - [/Models.EventRankingRankings](Models/EventRankingRankings.md)
 - [/Models.EventRankingSortOrderInfo](Models/EventRankingSortOrderInfo.md)
 - [/Models.EventSimple](Models/EventSimple.md)
 - [/Models.Match](Models/Match.md)
 - [/Models.MatchAlliance](Models/MatchAlliance.md)
 - [/Models.MatchScoreBreakdown2015](Models/MatchScoreBreakdown2015.md)
 - [/Models.MatchScoreBreakdown2015Alliance](Models/MatchScoreBreakdown2015Alliance.md)
 - [/Models.MatchScoreBreakdown2016](Models/MatchScoreBreakdown2016.md)
 - [/Models.MatchScoreBreakdown2016Alliance](Models/MatchScoreBreakdown2016Alliance.md)
 - [/Models.MatchScoreBreakdown2017](Models/MatchScoreBreakdown2017.md)
 - [/Models.MatchScoreBreakdown2017Alliance](Models/MatchScoreBreakdown2017Alliance.md)
 - [/Models.MatchScoreBreakdown2018](Models/MatchScoreBreakdown2018.md)
 - [/Models.MatchScoreBreakdown2018Alliance](Models/MatchScoreBreakdown2018Alliance.md)
 - [/Models.MatchScoreBreakdown2019](Models/MatchScoreBreakdown2019.md)
 - [/Models.MatchScoreBreakdown2019Alliance](Models/MatchScoreBreakdown2019Alliance.md)
 - [/Models.MatchScoreBreakdown2020](Models/MatchScoreBreakdown2020.md)
 - [/Models.MatchScoreBreakdown2020Alliance](Models/MatchScoreBreakdown2020Alliance.md)
 - [/Models.MatchSimple](Models/MatchSimple.md)
 - [/Models.MatchSimpleAlliances](Models/MatchSimpleAlliances.md)
 - [/Models.MatchTimeseries2018](Models/MatchTimeseries2018.md)
 - [/Models.MatchVideos](Models/MatchVideos.md)
 - [/Models.Media](Models/Media.md)
 - [/Models.Team](Models/Team.md)
 - [/Models.TeamEventStatus](Models/TeamEventStatus.md)
 - [/Models.TeamEventStatusAlliance](Models/TeamEventStatusAlliance.md)
 - [/Models.TeamEventStatusAllianceBackup](Models/TeamEventStatusAllianceBackup.md)
 - [/Models.TeamEventStatusPlayoff](Models/TeamEventStatusPlayoff.md)
 - [/Models.TeamEventStatusRank](Models/TeamEventStatusRank.md)
 - [/Models.TeamEventStatusRankRanking](Models/TeamEventStatusRankRanking.md)
 - [/Models.TeamEventStatusRankSortOrderInfo](Models/TeamEventStatusRankSortOrderInfo.md)
 - [/Models.TeamRobot](Models/TeamRobot.md)
 - [/Models.TeamSimple](Models/TeamSimple.md)
 - [/Models.WLTRecord](Models/WLTRecord.md)
 - [/Models.Webcast](Models/Webcast.md)
 - [/Models.Zebra](Models/Zebra.md)
 - [/Models.ZebraAlliances](Models/ZebraAlliances.md)
 - [/Models.ZebraTeam](Models/ZebraTeam.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="apiKey"></a>
### apiKey

- **Type**: API key
- **API key parameter name**: X-TBA-Auth-Key
- **Location**: HTTP header

