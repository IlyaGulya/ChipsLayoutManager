package com.beloo.widget.chipslayoutmanager.util;

import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;

public class InstrumentalUtil {
    public static void waitForIdle() throws Exception {
        getInstrumentation().waitForIdleSync();
    }
}
