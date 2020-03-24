package com.thebluealliance.infrastructure

import org.thebluealliance.TBA_v_.BuildConfig

/**
 * Defines a config object for a given request.
 * NOTE: This object doesn't include 'body' because it
 *       allows for caching of the constructed object
 *       for many request definitions.
 * NOTE: Headers is a Map<String,String> because rfc2616 defines
 *       multi-valued headers as csv-only.
 */
class RequestConfig(
    val method: RequestMethod,
    val path: String,
    headers: Map<String, String> = mapOf(),
    val query: Map<String, List<String>> = mapOf()
) {
    val headers = headers
        .toMutableMap()
        .apply {
	        // we are not using putIfAbsent because the high level api doesn't permit arbitrary headers. Therefore, there is no way to add the header programmatically, and therefore it doesn't already exist.
            this["X-TBA-Auth-Key"] = BuildConfig.TBA_Auth_Key
        }.toMap()
}
