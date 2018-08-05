package com.deepaksharma.webaddicted.leftrightswipe;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.deepaksharma.webaddicted.leftrightswipe", appContext.getPackageName());
    }
}
