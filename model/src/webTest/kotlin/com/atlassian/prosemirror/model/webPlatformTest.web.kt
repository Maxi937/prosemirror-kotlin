package com.atlassian.prosemirror.model

import kotlin.test.Test
import kotlin.test.assertTrue

class WebPlatformTest {
    @Test
    fun testExample() {
        assertTrue(getPlatform().name.contains("Web"), "Check Web is mentioned")
    }
}
