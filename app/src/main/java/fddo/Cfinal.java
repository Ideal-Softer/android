package fddo;

import com.sonnokta.p016j;
import com.sonnokta.utils.LogUtil;

/* renamed from: fddo.final  reason: invalid class name */
public final /* synthetic */ class Cfinal implements Runnable {
    private static String TAG = "bwolf-Cfinal";

    /* renamed from: fddo  reason: collision with root package name */
    public final /* synthetic */ p016j f119fddo;

    public /* synthetic */ Cfinal(p016j p016j) {
        this.f119fddo = p016j;
    }

    public final void run() {
        LogUtil.showErrorLog(TAG, "--- run ---");
        this.f119fddo.m0case();
    }
}
