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


import com.squareup.moshi.Json

/**
 * 
 * @param adjustPoints 
 * @param autoPoints 
 * @param bay1 
 * @param bay2 
 * @param bay3 
 * @param bay4 
 * @param bay5 
 * @param bay6 
 * @param bay7 
 * @param bay8 
 * @param cargoPoints 
 * @param completeRocketRankingPoint 
 * @param completedRocketFar 
 * @param completedRocketNear 
 * @param endgameRobot1 
 * @param endgameRobot2 
 * @param endgameRobot3 
 * @param foulCount 
 * @param foulPoints 
 * @param habClimbPoints 
 * @param habDockingRankingPoint 
 * @param habLineRobot1 
 * @param habLineRobot2 
 * @param habLineRobot3 
 * @param hatchPanelPoints 
 * @param lowLeftRocketFar 
 * @param lowLeftRocketNear 
 * @param lowRightRocketFar 
 * @param lowRightRocketNear 
 * @param midLeftRocketFar 
 * @param midLeftRocketNear 
 * @param midRightRocketFar 
 * @param midRightRocketNear 
 * @param preMatchBay1 
 * @param preMatchBay2 
 * @param preMatchBay3 
 * @param preMatchBay6 
 * @param preMatchBay7 
 * @param preMatchBay8 
 * @param preMatchLevelRobot1 
 * @param preMatchLevelRobot2 
 * @param preMatchLevelRobot3 
 * @param rp 
 * @param sandStormBonusPoints 
 * @param techFoulCount 
 * @param teleopPoints 
 * @param topLeftRocketFar 
 * @param topLeftRocketNear 
 * @param topRightRocketFar 
 * @param topRightRocketNear 
 * @param totalPoints 
 */

data class MatchScoreBreakdown2019Alliance (
    @Json(name = "adjustPoints")
    val adjustPoints: kotlin.Int? = null,
    @Json(name = "autoPoints")
    val autoPoints: kotlin.Int? = null,
    @Json(name = "bay1")
    val bay1: kotlin.String? = null,
    @Json(name = "bay2")
    val bay2: kotlin.String? = null,
    @Json(name = "bay3")
    val bay3: kotlin.String? = null,
    @Json(name = "bay4")
    val bay4: kotlin.String? = null,
    @Json(name = "bay5")
    val bay5: kotlin.String? = null,
    @Json(name = "bay6")
    val bay6: kotlin.String? = null,
    @Json(name = "bay7")
    val bay7: kotlin.String? = null,
    @Json(name = "bay8")
    val bay8: kotlin.String? = null,
    @Json(name = "cargoPoints")
    val cargoPoints: kotlin.Int? = null,
    @Json(name = "completeRocketRankingPoint")
    val completeRocketRankingPoint: kotlin.Boolean? = null,
    @Json(name = "completedRocketFar")
    val completedRocketFar: kotlin.Boolean? = null,
    @Json(name = "completedRocketNear")
    val completedRocketNear: kotlin.Boolean? = null,
    @Json(name = "endgameRobot1")
    val endgameRobot1: kotlin.String? = null,
    @Json(name = "endgameRobot2")
    val endgameRobot2: kotlin.String? = null,
    @Json(name = "endgameRobot3")
    val endgameRobot3: kotlin.String? = null,
    @Json(name = "foulCount")
    val foulCount: kotlin.Int? = null,
    @Json(name = "foulPoints")
    val foulPoints: kotlin.Int? = null,
    @Json(name = "habClimbPoints")
    val habClimbPoints: kotlin.Int? = null,
    @Json(name = "habDockingRankingPoint")
    val habDockingRankingPoint: kotlin.Boolean? = null,
    @Json(name = "habLineRobot1")
    val habLineRobot1: kotlin.String? = null,
    @Json(name = "habLineRobot2")
    val habLineRobot2: kotlin.String? = null,
    @Json(name = "habLineRobot3")
    val habLineRobot3: kotlin.String? = null,
    @Json(name = "hatchPanelPoints")
    val hatchPanelPoints: kotlin.Int? = null,
    @Json(name = "lowLeftRocketFar")
    val lowLeftRocketFar: kotlin.String? = null,
    @Json(name = "lowLeftRocketNear")
    val lowLeftRocketNear: kotlin.String? = null,
    @Json(name = "lowRightRocketFar")
    val lowRightRocketFar: kotlin.String? = null,
    @Json(name = "lowRightRocketNear")
    val lowRightRocketNear: kotlin.String? = null,
    @Json(name = "midLeftRocketFar")
    val midLeftRocketFar: kotlin.String? = null,
    @Json(name = "midLeftRocketNear")
    val midLeftRocketNear: kotlin.String? = null,
    @Json(name = "midRightRocketFar")
    val midRightRocketFar: kotlin.String? = null,
    @Json(name = "midRightRocketNear")
    val midRightRocketNear: kotlin.String? = null,
    @Json(name = "preMatchBay1")
    val preMatchBay1: kotlin.String? = null,
    @Json(name = "preMatchBay2")
    val preMatchBay2: kotlin.String? = null,
    @Json(name = "preMatchBay3")
    val preMatchBay3: kotlin.String? = null,
    @Json(name = "preMatchBay6")
    val preMatchBay6: kotlin.String? = null,
    @Json(name = "preMatchBay7")
    val preMatchBay7: kotlin.String? = null,
    @Json(name = "preMatchBay8")
    val preMatchBay8: kotlin.String? = null,
    @Json(name = "preMatchLevelRobot1")
    val preMatchLevelRobot1: kotlin.String? = null,
    @Json(name = "preMatchLevelRobot2")
    val preMatchLevelRobot2: kotlin.String? = null,
    @Json(name = "preMatchLevelRobot3")
    val preMatchLevelRobot3: kotlin.String? = null,
    @Json(name = "rp")
    val rp: kotlin.Int? = null,
    @Json(name = "sandStormBonusPoints")
    val sandStormBonusPoints: kotlin.Int? = null,
    @Json(name = "techFoulCount")
    val techFoulCount: kotlin.Int? = null,
    @Json(name = "teleopPoints")
    val teleopPoints: kotlin.Int? = null,
    @Json(name = "topLeftRocketFar")
    val topLeftRocketFar: kotlin.String? = null,
    @Json(name = "topLeftRocketNear")
    val topLeftRocketNear: kotlin.String? = null,
    @Json(name = "topRightRocketFar")
    val topRightRocketFar: kotlin.String? = null,
    @Json(name = "topRightRocketNear")
    val topRightRocketNear: kotlin.String? = null,
    @Json(name = "totalPoints")
    val totalPoints: kotlin.Int? = null
)
