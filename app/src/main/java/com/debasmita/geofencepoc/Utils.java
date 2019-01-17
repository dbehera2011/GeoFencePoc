package com.debasmita.geofencepoc;

import android.content.Context;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.util.Log;

public class Utils {
    public static String getWifiName(Context context) {
        WifiManager manager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        if (manager.isWifiEnabled()) {
            WifiInfo wifiInfo = manager.getConnectionInfo();
            if (wifiInfo != null) {
                NetworkInfo.DetailedState state = WifiInfo.getDetailedStateOf(wifiInfo.getSupplicantState());
                Log.i("Debasmita:", wifiInfo.getSSID().trim());
                if (state == NetworkInfo.DetailedState.CONNECTED || state == NetworkInfo.DetailedState.OBTAINING_IPADDR) {
                    return wifiInfo.getSSID();
                }
            }
        }
        return null;
    }
}
