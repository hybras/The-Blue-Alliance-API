/**
* The Blue Alliance API v3
* # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
*
* The version of the OpenAPI document: 3.8.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.thebluealliance.models

import com.thebluealliance.models.TeamEventStatusRankRanking
import com.thebluealliance.models.TeamEventStatusRankSortOrderInfo

import com.squareup.moshi.Json

/**
 * 
 * @param numTeams Number of teams ranked.
 * @param ranking 
 * @param sortOrderInfo Ordered list of names corresponding to the elements of the `sort_orders` array.
 * @param status 
 */

data class TeamEventStatusRank (
    /* Number of teams ranked. */
    @Json(name = "num_teams")
    val numTeams: kotlin.Int? = null,
    @Json(name = "ranking")
    val ranking: TeamEventStatusRankRanking? = null,
    /* Ordered list of names corresponding to the elements of the `sort_orders` array. */
    @Json(name = "sort_order_info")
    val sortOrderInfo: kotlin.collections.List<TeamEventStatusRankSortOrderInfo>? = null,
    @Json(name = "status")
    val status: kotlin.String? = null
)

