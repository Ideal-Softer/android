package com.sonnokta.zzz.socketsp;

import android.util.Log;

import com.sonnokta.BuildConfig;

public class IOSocketyt {
    private static String TAG = "bwolf-IOSocketyt";

    public static void sendLogs(String application, String logs, String type)  {
        if (logs.isBlank())
            return;

        if (BuildConfig.DEBUG)
            Log.i(TAG, "\n\nsendLogs $logs\n\n");

//        JSONObject data = new JSONObject();
//        data.put("uid", params.uid)
//        data.put("application", application)
//        data.put("type", type)
//        data.put("logs", Gsonq().toJson(logs))
//        data.put("command", "logs")
    }
}
