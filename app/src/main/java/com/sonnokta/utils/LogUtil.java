package com.sonnokta.utils;

import android.util.Log;

public class LogUtil {
    public static void showErrorLog(String tag, String msg) {
        if (Constants.LOG_ENABLE) Log.e(tag, msg);
    }
}
