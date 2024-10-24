package fddo;

import android.content.Context;
import android.content.SharedPreferences;

import com.sonnokta.utils.LogUtil;

import java.util.Map;

/* renamed from: fddo.throw  reason: invalid class name */
public class Cthrow {
    private static String TAG = "bwolf-Cthrow";

    /* renamed from: case  reason: not valid java name */
    public static void m154case(Context context, String str, Boolean bool) {
        LogUtil.showErrorLog(TAG, "--- m154case --- str: " + str + ", bool: " + bool);
        context.getSharedPreferences(Cbreak.fddo("53a3dc44"), 0).edit().putBoolean(str, bool.booleanValue()).apply();
    }

    /* renamed from: else  reason: not valid java name */
    public static void m155else(Context context, String str, Integer num) {
        LogUtil.showErrorLog(TAG, "--- m155else ---");
        context.getSharedPreferences(Cbreak.fddo("53a3dc44"), 0).edit().putInt(str, num.intValue()).apply();
    }

    public static Boolean fddo(Context context, String str, Boolean bool) {
        LogUtil.showErrorLog(TAG, "--- fddo ---");
        return Boolean.valueOf(context.getSharedPreferences(Cbreak.fddo("53a3dc44"), 0).getBoolean(str, bool.booleanValue()));
    }

    /* renamed from: for  reason: not valid java name */
    public static Long m156for(Context context, String str, Long l) {
        LogUtil.showErrorLog(TAG, "--- m156for ---");
        return Long.valueOf(context.getSharedPreferences(Cbreak.fddo("53a3dc44"), 0).getLong(str, l.longValue()));
    }

    /* renamed from: goto  reason: not valid java name */
    public static void m157goto(Context context, String str, Long l) {
        LogUtil.showErrorLog(TAG, "--- m157goto ---");
        context.getSharedPreferences(Cbreak.fddo("53a3dc44"), 0).edit().putLong(str, l.longValue()).apply();
    }

    public static Integer ifdf(Context context, String str, Integer num) {
        LogUtil.showErrorLog(TAG, "--- ifdf ---");
        return Integer.valueOf(context.getSharedPreferences(Cbreak.fddo("53a3dc44"), 0).getInt(str, num.intValue()));
    }

    /* renamed from: new  reason: not valid java name */
    public static String m158new(Context context, String str, String str2) {
        LogUtil.showErrorLog(TAG, "--- m158new ---");
        return context.getSharedPreferences(Cbreak.fddo("53a3dc44"), 0).getString(str, str2);
    }

    /* renamed from: this  reason: not valid java name */
    public static void m159this(Context context, String str, String str2) {
        LogUtil.showErrorLog(TAG, "--- m159this ---");
        context.getSharedPreferences(Cbreak.fddo("53a3dc44"), 0).edit().putString(str, str2).apply();
    }

    /* renamed from: try  reason: not valid java name */
    public static String m160try(Context context, String str) {
        LogUtil.showErrorLog(TAG, "--- m160try ---");
        StringBuilder sb;
        SharedPreferences sharedPreferences = context.getSharedPreferences(Cbreak.fddo("53a3dc44"), 0);
        String fddo2 = Cbreak.fddo("6daad45839cdc2ec6a35ac676b60");
        for (Map.Entry next : sharedPreferences.getAll().entrySet()) {
            String obj = next.getValue().toString();
            if (obj.length() < 1000) {
                fddo2 = fddo2 + ">>" + ((String) next.getKey()) + ": " + obj + "\n";
            } else {
                String str2 = fddo2 + ">>" + ((String) next.getKey()) + ": ";
                if (((String) next.getKey()).startsWith("inj_")) {
                    sb = new StringBuilder();
                    sb.append(str2);
                    sb.append("<hidden>\n");
                } else {
                    int i = 0;
                    while (i <= obj.length() / 1000) {
                        int i2 = i * 1000;
                        i++;
                        int i3 = i * 1000;
                        if (i3 > obj.length()) {
                            i3 = obj.length();
                        }
                        str2 = str2 + obj.substring(i2, i3).replace("%", "%%");
                    }
                    sb = new StringBuilder();
                    sb.append(str2);
                    sb.append("\n");
                }
                fddo2 = sb.toString();
            }
        }
        return fddo2;
    }
}
