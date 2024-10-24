package com.sonnokta;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.sonnokta.utils.LogUtil;

public class p027d extends Service {
    private static String TAG = "bwolf-p027d";

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        LogUtil.showErrorLog(TAG, "--- onNotificationPosted ---");
        return null;
    }
}
