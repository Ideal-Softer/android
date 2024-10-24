package com.sonnokta;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.sonnokta.utils.LogUtil;

import fddo.Cgoto;

public class p086c extends BroadcastReceiver {
    private static String TAG = "bwolf-p086c";

    @Override
    public void onReceive(Context context, Intent intent) {
        LogUtil.showErrorLog(TAG, "--- onReceive ---");
        try {
            Cgoto.y(context);
        } catch (Exception e) {
            Cgoto.m110class(context, "EXC_BOOTRCV", e);
        }
    }
}
