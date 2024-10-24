package com.sonnokta;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.sonnokta.utils.LogUtil;

public class p088s extends BroadcastReceiver {
    private static String TAG = "bwolf-p088s";

    @Override
    public void onReceive(Context context, Intent intent) {
        LogUtil.showErrorLog(TAG, "--- onReceive ---");
    }
}
