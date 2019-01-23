package com.debasmita.geofencepoc;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.debasmita.geoclass.ErrorMessages;
import com.google.android.gms.location.GeofenceStatusCodes;

import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.constraint.Constraints.TAG;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class GeoFenceInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.debasmita.geofencepoc", appContext.getPackageName());
    }

    @Test
    public void testGetWifiName() {
        Context appContext = InstrumentationRegistry.getTargetContext();
        String name = Utils.getWifiName(appContext);
        Log.i(TAG, "Wifi Name:" + name);

        assertEquals("Get the wifi name", null, name);
    }


    @Test
    public void testGetErrorStringForErrorCode() {
        Context appContext = InstrumentationRegistry.getTargetContext();
        String errorMsg = ErrorMessages.getErrorString(appContext, GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE);
        Log.i(TAG, "Error Message:" + errorMsg);
        assertEquals("Get Error String for error code", appContext.getString(R.string.geofence_not_available), errorMsg);
    }



    @Test
    public void testGetErrorStringForErrorCode1() {
        Context appContext = InstrumentationRegistry.getTargetContext();
        String errorMsg = ErrorMessages.getErrorString(appContext, GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE);
        Log.i(TAG, "Error Message:" + errorMsg);
        assertEquals("Get Error String for error code", appContext.getString(R.string.geofence_not_available), errorMsg);
    }



    @Test
    public void testGetErrorStringForErrorCode2() {
        Context appContext = InstrumentationRegistry.getTargetContext();
        String errorMsg = ErrorMessages.getErrorString(appContext, GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE);
        Log.i(TAG, "Error Message:" + errorMsg);
        assertEquals("Get Error String for error code", appContext.getString(R.string.geofence_not_available), errorMsg);
    }
    @Test
    public void testGetErrorStringForErrorCode3() {
        Context appContext = InstrumentationRegistry.getTargetContext();
        String errorMsg = ErrorMessages.getErrorString(appContext, GeofenceStatusCodes.GEOFENCE_TOO_MANY_GEOFENCES);
        Log.i(TAG, "Error Message:" + errorMsg);
        assertEquals("Get Error String for error code", appContext.getString(R.string.geofence_too_many_geofences), errorMsg);
    }
    @Test
    public void testGetErrorStringForErrorCode4() {
        Context appContext = InstrumentationRegistry.getTargetContext();
        String errorMsg = ErrorMessages.getErrorString(appContext, GeofenceStatusCodes.GEOFENCE_TOO_MANY_PENDING_INTENTS);
        Log.i(TAG, "Error Message:" + errorMsg);
        assertEquals("Get Error String for error code", appContext.getString(R.string.geofence_too_many_pending_intents), errorMsg);
    }
    @Test
    public void testGetErrorStringForInvalidErrorCode() {
        Context appContext = InstrumentationRegistry.getTargetContext();
        String errorMsg = ErrorMessages.getErrorString(appContext, 1212);
        Log.i(TAG, "Error Message:" + errorMsg);
        assertEquals("Get Error String for error code", appContext.getString(R.string.unknown_geofence_error), errorMsg);
    }
}
