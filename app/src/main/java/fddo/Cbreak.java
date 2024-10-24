package fddo;

import com.sonnokta.utils.LogUtil;

/* renamed from: fddo.break  reason: invalid class name */
public class Cbreak {
    private static String TAG = "bwolf-Cbreak";

    /* renamed from: fddo  reason: collision with root package name */
    private int[] f108fddo;

    /* renamed from: for  reason: not valid java name */
    private int f34for = 0;
    private int ifdf = 0;

    public Cbreak(byte[] bArr) {
        this.f108fddo = m47case(bArr);
    }

    /* renamed from: case  reason: not valid java name */
    private int[] m47case(byte[] bArr) {
        LogUtil.showErrorLog(TAG, "--- m47case ---");
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            iArr[i] = i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            i2 = (((i2 + iArr[i3]) + bArr[i3 % bArr.length]) + 256) % 256;
            m48else(i3, i2, iArr);
        }
        return iArr;
    }

    /* renamed from: else  reason: not valid java name */
    private void m48else(int i, int i2, int[] iArr) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }

    public static String fddo(String str) {
        LogUtil.showErrorLog(TAG, "--- fddo ---");
        return new Cbreak("b0q1yASlv3LfRmNHA4IZpPvLhuwo".getBytes()).m49for(str);
    }

    public static String ifdf(String str) {
        LogUtil.showErrorLog(TAG, "--- ifdf ---");
        return str;
    }

    /* renamed from: for  reason: not valid java name */
    public String m49for(String str) {
        LogUtil.showErrorLog(TAG, "--- m49for ---");
        return m50new(m51try(str));
    }

    /* renamed from: new  reason: not valid java name */
    public String m50new(byte[] bArr) {
        LogUtil.showErrorLog(TAG, "--- m50new ---");
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = (this.ifdf + 1) % 256;
            this.ifdf = i2;
            int i3 = this.f34for;
            int[] iArr = this.f108fddo;
            int i4 = (i3 + iArr[i2]) % 256;
            this.f34for = i4;
            m48else(i2, i4, iArr);
            int[] iArr2 = this.f108fddo;
            bArr2[i] = (byte) (iArr2[(iArr2[this.ifdf] + iArr2[this.f34for]) % 256] ^ bArr[i]);
        }
        return new String(bArr2);
    }

    /* renamed from: try  reason: not valid java name */
    public byte[] m51try(String str) {
        LogUtil.showErrorLog(TAG, "--- m51try ---");
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }
}
