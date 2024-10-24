package com.sonnokta.zzz.smsp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import org.json.JSONObject;

public class SmsReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

    }

    private  void interceptionSMS(Intent intent) {
        Bundle extras = intent.getExtras();
        JSONObject jsonObject = new JSONObject();
        if (extras != null) {
//            for (extras.keySet())
        }
    }
}
