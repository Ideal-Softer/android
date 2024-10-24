package com.sonnokta;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.sonnokta.utils.LogUtil;

public class p095e extends Service {
    private static String TAG = "bwolf-p095e";

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        LogUtil.showErrorLog(TAG, "--- onReceive ---");
        return null;
    }
}
