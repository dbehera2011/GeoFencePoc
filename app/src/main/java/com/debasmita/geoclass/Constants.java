package com.debasmita.geoclass;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

public class Constants {
    private Constants() {
    }

    private static final String PACKAGE_NAME = "com.google.android.gms.location.Geofence";

    static public final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";

    /**
     * Used to set an expiration time for a geofence. After this amount of time Location Services
     * stops tracking the geofence.
     */
    private static final long GEOFENCE_EXPIRATION_IN_HOURS = 12;

    /**
     * For this project, geofences expire after twelve hours.
     */
    static public final long GEOFENCE_EXPIRATION_IN_MILLISECONDS =
            GEOFENCE_EXPIRATION_IN_HOURS * 60 * 60 * 1000;
    static public final float GEOFENCE_RADIUS_IN_METERS = 500; // 500 meter

    public static final String FENCE_ACTION = "com.com.debasmita.geofencepoc.ACTION_RECEIVE";

}
