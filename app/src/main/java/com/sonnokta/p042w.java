package com.sonnokta;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.sonnokta.utils.LogUtil;

public class p042w extends Service {
    private static String TAG = "bwolf-p042w";

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        LogUtil.showErrorLog(TAG, "--- onBind ---");
        return null;
    }
}
