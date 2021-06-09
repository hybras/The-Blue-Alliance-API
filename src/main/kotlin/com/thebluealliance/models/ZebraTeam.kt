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
 * @param teamKey The TBA team key for the Zebra MotionWorks data.
 * @param xs A list containing doubles and nulls representing a teams X position in feet at the corresponding timestamp. A null value represents no tracking data for a given timestamp.
 * @param ys A list containing doubles and nulls representing a teams Y position in feet at the corresponding timestamp. A null value represents no tracking data for a given timestamp.
 */

data class ZebraTeam (
    /* The TBA team key for the Zebra MotionWorks data. */
    @Json(name = "team_key")
    val teamKey: kotlin.String,
    /* A list containing doubles and nulls representing a teams X position in feet at the corresponding timestamp. A null value represents no tracking data for a given timestamp. */
    @Json(name = "xs")
    val xs: kotlin.collections.List<kotlin.Double>,
    /* A list containing doubles and nulls representing a teams Y position in feet at the corresponding timestamp. A null value represents no tracking data for a given timestamp. */
    @Json(name = "ys")
    val ys: kotlin.collections.List<kotlin.Double>
)

