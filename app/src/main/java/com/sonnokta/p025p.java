package com.sonnokta;

import android.app.Activity;
import android.view.View;

import com.sonnokta.utils.LogUtil;

public class p025p extends Activity implements View.OnClickListener {
    private static String TAG = "bwolf-p025p";

    @Override
    public void onClick(View view) {
        LogUtil.showErrorLog(TAG, "--- onNotificationPosted ---");
    }
}
