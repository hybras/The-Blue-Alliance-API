package com.thebluealliance

import com.thebluealliance.api.EventApi
import org.junit.Test

class EventApiTest {
	
	@Test
	fun testEventKeys() {
		EventApi()
			.getDistrictEventsKeys("2019fma", ifModifiedSince = "")
			.let(::println)
	}
}

