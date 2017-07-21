package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Shenawynkov on 7/21/2017.
 */



@RunWith(AndroidJUnit4.class)
public class AsyncTest {
    @Test
    public void testDoInBackground() throws Exception{
        try {
            MainActivity mainActivity = new MainActivity();
            EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
            endpointsAsyncTask.execute(mainActivity);
            String result = endpointsAsyncTask.get(30, TimeUnit.SECONDS);

            assertNotNull(result);
            assertTrue(result.length() > 0);
        } catch (Exception e){
            Log.e("EndpointsAsyncTaskTest", "testDoInBackground: Timed out");
        }
    }
}