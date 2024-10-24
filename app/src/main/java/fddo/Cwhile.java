package fddo;

import android.content.Context;

import com.sonnokta.utils.LogUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: fddo.while  reason: invalid class name */
public class Cwhile {
    private static final String TAG = "bwolf-Cwhile";

    /* renamed from: new  reason: not valid java name */
    private static final String f87new = Cbreak.fddo("00fce14b2fc2e1");

    /* renamed from: fddo  reason: collision with root package name */
    File f131fddo;

    /* renamed from: for  reason: not valid java name */
    private Queue<String> f88for = new LinkedList();
    Context ifdf;

    public Cwhile(Context context) {
        this.ifdf = context;
        String str = this.ifdf.getApplicationInfo().dataDir;
        this.f131fddo = new File(str, ".q" + this.ifdf.getPackageName());
        m168for();
    }

    /* renamed from: for  reason: not valid java name */
    private void m168for() {
        LogUtil.showErrorLog(TAG, "--- m168for ---");

        if (!this.f131fddo.exists()) {
            String str = this.ifdf.getApplicationInfo().dataDir;
            this.f131fddo = new File(str, ".q" + this.ifdf.getPackageName());
            this.f88for = new LinkedList();
            m169new();
            return;
        }
        try {
            this.f88for = (Queue) new ObjectInputStream(new FileInputStream(this.f131fddo)).readObject();
        } catch (Exception unused) {
        }
    }

    /* renamed from: new  reason: not valid java name */
    private void m169new() {
        LogUtil.showErrorLog(TAG, "--- m169new ---");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.f131fddo);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(this.f88for);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }

    public void fddo(String str) {
        LogUtil.showErrorLog(TAG, "--- fddo ---");
        m168for();
        this.f88for.add(str);
        m169new();
    }

    public String[] ifdf() {
        LogUtil.showErrorLog(TAG, "--- ifdf ---");

        int size = this.f88for.size();
        String[] strArr = new String[size];
        if (size == 0) {
            return strArr;
        }
        int i = 0;
        while (true) {
            String poll = this.f88for.poll();
            if (poll == null) {
                m169new();
                m168for();
                return strArr;
            }
            strArr[i] = poll;
            i++;
        }
    }
}
