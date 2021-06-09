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
 * Timeseries data for the 2018 game *FIRST* POWER UP. *WARNING:* This is *not* official data, and is subject to a significant possibility of error, or missing data. Do not rely on this data for any purpose. In fact, pretend we made it up. *WARNING:* This model is currently under active development and may change at any time, including in breaking ways.
 * @param eventKey TBA event key with the format yyyy[EVENT_CODE], where yyyy is the year, and EVENT_CODE is the event code of the event.
 * @param matchId Match ID consisting of the level, match number, and set number, eg `qm45` or `f1m1`.
 * @param mode Current mode of play, can be `pre_match`, `auto`, `telop`, or `post_match`.
 * @param play 
 * @param timeRemaining Amount of time remaining in the match, only valid during `auto` and `teleop` modes.
 * @param blueAutoQuest 1 if the blue alliance is credited with the AUTO QUEST, 0 if not.
 * @param blueBoostCount Number of POWER CUBES in the BOOST section of the blue alliance VAULT.
 * @param blueBoostPlayed Returns 1 if the blue alliance BOOST was played, or 0 if not played.
 * @param blueCurrentPowerup Name of the current blue alliance POWER UP being played, or `null`.
 * @param blueFaceTheBoss 1 if the blue alliance is credited with FACING THE BOSS, 0 if not.
 * @param blueForceCount Number of POWER CUBES in the FORCE section of the blue alliance VAULT.
 * @param blueForcePlayed Returns 1 if the blue alliance FORCE was played, or 0 if not played.
 * @param blueLevitateCount Number of POWER CUBES in the LEVITATE section of the blue alliance VAULT.
 * @param blueLevitatePlayed Returns 1 if the blue alliance LEVITATE was played, or 0 if not played.
 * @param bluePowerupTimeRemaining Number of seconds remaining in the blue alliance POWER UP time, or 0 if none is active.
 * @param blueScaleOwned 1 if the blue alliance owns the SCALE, 0 if not.
 * @param blueScore Current score for the blue alliance.
 * @param blueSwitchOwned 1 if the blue alliance owns their SWITCH, 0 if not.
 * @param redAutoQuest 1 if the red alliance is credited with the AUTO QUEST, 0 if not.
 * @param redBoostCount Number of POWER CUBES in the BOOST section of the red alliance VAULT.
 * @param redBoostPlayed Returns 1 if the red alliance BOOST was played, or 0 if not played.
 * @param redCurrentPowerup Name of the current red alliance POWER UP being played, or `null`.
 * @param redFaceTheBoss 1 if the red alliance is credited with FACING THE BOSS, 0 if not.
 * @param redForceCount Number of POWER CUBES in the FORCE section of the red alliance VAULT.
 * @param redForcePlayed Returns 1 if the red alliance FORCE was played, or 0 if not played.
 * @param redLevitateCount Number of POWER CUBES in the LEVITATE section of the red alliance VAULT.
 * @param redLevitatePlayed Returns 1 if the red alliance LEVITATE was played, or 0 if not played.
 * @param redPowerupTimeRemaining Number of seconds remaining in the red alliance POWER UP time, or 0 if none is active.
 * @param redScaleOwned 1 if the red alliance owns the SCALE, 0 if not.
 * @param redScore Current score for the red alliance.
 * @param redSwitchOwned 1 if the red alliance owns their SWITCH, 0 if not.
 */

data class MatchTimeseries2018 (
    /* TBA event key with the format yyyy[EVENT_CODE], where yyyy is the year, and EVENT_CODE is the event code of the event. */
    @Json(name = "event_key")
    val eventKey: kotlin.String? = null,
    /* Match ID consisting of the level, match number, and set number, eg `qm45` or `f1m1`. */
    @Json(name = "match_id")
    val matchId: kotlin.String? = null,
    /* Current mode of play, can be `pre_match`, `auto`, `telop`, or `post_match`. */
    @Json(name = "mode")
    val mode: kotlin.String? = null,
    @Json(name = "play")
    val play: kotlin.Int? = null,
    /* Amount of time remaining in the match, only valid during `auto` and `teleop` modes. */
    @Json(name = "time_remaining")
    val timeRemaining: kotlin.Int? = null,
    /* 1 if the blue alliance is credited with the AUTO QUEST, 0 if not. */
    @Json(name = "blue_auto_quest")
    val blueAutoQuest: kotlin.Int? = null,
    /* Number of POWER CUBES in the BOOST section of the blue alliance VAULT. */
    @Json(name = "blue_boost_count")
    val blueBoostCount: kotlin.Int? = null,
    /* Returns 1 if the blue alliance BOOST was played, or 0 if not played. */
    @Json(name = "blue_boost_played")
    val blueBoostPlayed: kotlin.Int? = null,
    /* Name of the current blue alliance POWER UP being played, or `null`. */
    @Json(name = "blue_current_powerup")
    val blueCurrentPowerup: kotlin.String? = null,
    /* 1 if the blue alliance is credited with FACING THE BOSS, 0 if not. */
    @Json(name = "blue_face_the_boss")
    val blueFaceTheBoss: kotlin.Int? = null,
    /* Number of POWER CUBES in the FORCE section of the blue alliance VAULT. */
    @Json(name = "blue_force_count")
    val blueForceCount: kotlin.Int? = null,
    /* Returns 1 if the blue alliance FORCE was played, or 0 if not played. */
    @Json(name = "blue_force_played")
    val blueForcePlayed: kotlin.Int? = null,
    /* Number of POWER CUBES in the LEVITATE section of the blue alliance VAULT. */
    @Json(name = "blue_levitate_count")
    val blueLevitateCount: kotlin.Int? = null,
    /* Returns 1 if the blue alliance LEVITATE was played, or 0 if not played. */
    @Json(name = "blue_levitate_played")
    val blueLevitatePlayed: kotlin.Int? = null,
    /* Number of seconds remaining in the blue alliance POWER UP time, or 0 if none is active. */
    @Json(name = "blue_powerup_time_remaining")
    val bluePowerupTimeRemaining: kotlin.String? = null,
    /* 1 if the blue alliance owns the SCALE, 0 if not. */
    @Json(name = "blue_scale_owned")
    val blueScaleOwned: kotlin.Int? = null,
    /* Current score for the blue alliance. */
    @Json(name = "blue_score")
    val blueScore: kotlin.Int? = null,
    /* 1 if the blue alliance owns their SWITCH, 0 if not. */
    @Json(name = "blue_switch_owned")
    val blueSwitchOwned: kotlin.Int? = null,
    /* 1 if the red alliance is credited with the AUTO QUEST, 0 if not. */
    @Json(name = "red_auto_quest")
    val redAutoQuest: kotlin.Int? = null,
    /* Number of POWER CUBES in the BOOST section of the red alliance VAULT. */
    @Json(name = "red_boost_count")
    val redBoostCount: kotlin.Int? = null,
    /* Returns 1 if the red alliance BOOST was played, or 0 if not played. */
    @Json(name = "red_boost_played")
    val redBoostPlayed: kotlin.Int? = null,
    /* Name of the current red alliance POWER UP being played, or `null`. */
    @Json(name = "red_current_powerup")
    val redCurrentPowerup: kotlin.String? = null,
    /* 1 if the red alliance is credited with FACING THE BOSS, 0 if not. */
    @Json(name = "red_face_the_boss")
    val redFaceTheBoss: kotlin.Int? = null,
    /* Number of POWER CUBES in the FORCE section of the red alliance VAULT. */
    @Json(name = "red_force_count")
    val redForceCount: kotlin.Int? = null,
    /* Returns 1 if the red alliance FORCE was played, or 0 if not played. */
    @Json(name = "red_force_played")
    val redForcePlayed: kotlin.Int? = null,
    /* Number of POWER CUBES in the LEVITATE section of the red alliance VAULT. */
    @Json(name = "red_levitate_count")
    val redLevitateCount: kotlin.Int? = null,
    /* Returns 1 if the red alliance LEVITATE was played, or 0 if not played. */
    @Json(name = "red_levitate_played")
    val redLevitatePlayed: kotlin.Int? = null,
    /* Number of seconds remaining in the red alliance POWER UP time, or 0 if none is active. */
    @Json(name = "red_powerup_time_remaining")
    val redPowerupTimeRemaining: kotlin.String? = null,
    /* 1 if the red alliance owns the SCALE, 0 if not. */
    @Json(name = "red_scale_owned")
    val redScaleOwned: kotlin.Int? = null,
    /* Current score for the red alliance. */
    @Json(name = "red_score")
    val redScore: kotlin.Int? = null,
    /* 1 if the red alliance owns their SWITCH, 0 if not. */
    @Json(name = "red_switch_owned")
    val redSwitchOwned: kotlin.Int? = null
)

