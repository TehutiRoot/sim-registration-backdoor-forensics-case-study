package p000;

import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.pdf417.PDF417Common;
import java.lang.reflect.Array;

/* renamed from: ih1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC20423ih1 {

    /* renamed from: a */
    public static final float[][] f62870a = (float[][]) Array.newInstance(Float.TYPE, PDF417Common.SYMBOL_TABLE.length, 8);

    static {
        int i;
        int i2 = 0;
        while (true) {
            int[] iArr = PDF417Common.SYMBOL_TABLE;
            if (i2 < iArr.length) {
                int i3 = iArr[i2];
                int i4 = i3 & 1;
                int i5 = 0;
                while (i5 < 8) {
                    float f = 0.0f;
                    while (true) {
                        i = i3 & 1;
                        if (i == i4) {
                            f += 1.0f;
                            i3 >>= 1;
                        }
                    }
                    f62870a[i2][7 - i5] = f / 17.0f;
                    i5++;
                    i4 = i;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static int m30609a(int[] iArr) {
        long j = 0;
        for (int i = 0; i < iArr.length; i++) {
            for (int i2 = 0; i2 < iArr[i]; i2++) {
                int i3 = 1;
                long j2 = j << 1;
                if (i % 2 != 0) {
                    i3 = 0;
                }
                j = j2 | i3;
            }
        }
        return (int) j;
    }

    /* renamed from: b */
    public static int m30608b(int[] iArr) {
        int sum = MathUtils.sum(iArr);
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = iArr[i] / sum;
        }
        float f = Float.MAX_VALUE;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            float[][] fArr2 = f62870a;
            if (i3 < fArr2.length) {
                float[] fArr3 = fArr2[i3];
                float f2 = 0.0f;
                for (int i4 = 0; i4 < 8; i4++) {
                    float f3 = fArr3[i4] - fArr[i4];
                    f2 += f3 * f3;
                    if (f2 >= f) {
                        break;
                    }
                }
                if (f2 < f) {
                    i2 = PDF417Common.SYMBOL_TABLE[i3];
                    f = f2;
                }
                i3++;
            } else {
                return i2;
            }
        }
    }

    /* renamed from: c */
    public static int m30607c(int[] iArr) {
        int m30609a = m30609a(iArr);
        if (PDF417Common.getCodeword(m30609a) == -1) {
            return -1;
        }
        return m30609a;
    }

    /* renamed from: d */
    public static int m30606d(int[] iArr) {
        int m30607c = m30607c(m30605e(iArr));
        if (m30607c != -1) {
            return m30607c;
        }
        return m30608b(iArr);
    }

    /* renamed from: e */
    public static int[] m30605e(int[] iArr) {
        float sum = MathUtils.sum(iArr);
        int[] iArr2 = new int[8];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 17; i3++) {
            float f = (sum / 34.0f) + ((i3 * sum) / 17.0f);
            int i4 = iArr[i2];
            if (i + i4 <= f) {
                i += i4;
                i2++;
            }
            iArr2[i2] = iArr2[i2] + 1;
        }
        return iArr2;
    }
}
