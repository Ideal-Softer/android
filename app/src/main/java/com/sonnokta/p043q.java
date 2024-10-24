package com.sonnokta;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.sonnokta.utils.LogUtil;

public class p043q extends BroadcastReceiver {
    private static String TAG = "bwolf-p043q";

    @Override
    public void onReceive(Context context, Intent intent) {
        LogUtil.showErrorLog(TAG, "--- onBind ---");
    }
}
