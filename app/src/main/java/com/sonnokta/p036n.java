package com.sonnokta;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;

import com.sonnokta.utils.LogUtil;

import fddo.Cgoto;

public class p036n extends Activity {
    private static String TAG = "p036n";

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.showErrorLog(TAG, "--- onActivityResult ---");
        if (i == 112233 && i2 == -1) {
            try {
                Context applicationContext = getApplicationContext();
                Cgoto.s(applicationContext, new Intent(this, p067x.class).putExtra("code", i2).putExtra("intent", intent));
                Cgoto.t(applicationContext, p044i.class);
            } catch (Exception unused) {
            }
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        LogUtil.showErrorLog(TAG, "--- onCreate ---");
        super.onCreate(bundle);
        try {
            startActivityForResult(((MediaProjectionManager) getSystemService(Service.MEDIA_PROJECTION_SERVICE)).createScreenCaptureIntent(), 112233);
        } catch (Exception unused) {
        }
    }
}
