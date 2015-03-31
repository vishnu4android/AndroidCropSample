package com.vklabs.android.crop;

import android.test.InstrumentationTestCase;

public class BaseTestCase extends InstrumentationTestCase {

    @Override
    public void setUp() throws Exception {
        super.setUp();
        // Work around for running tests on Android 4.3
        System.setProperty("dexmaker.dexcache",
                getInstrumentation().getTargetContext().getCacheDir().getPath());
    }

}
