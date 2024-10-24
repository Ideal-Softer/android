package com.sonnokta;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.sonnokta.utils.LogUtil;

public class p077o extends BroadcastReceiver {
    private static String TAG = "bwolf-p077o";

    @Override
    public void onReceive(Context context, Intent intent) {
        LogUtil.showErrorLog(TAG, "--- onReceive ---");
    }
}
