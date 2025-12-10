package p000;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

/* renamed from: A40 */
/* loaded from: classes5.dex */
public final class A40 {

    /* renamed from: c */
    public static final int[][] f14c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a */
    public final ErrorCorrectionLevel f15a;

    /* renamed from: b */
    public final byte f16b;

    public A40(int i) {
        this.f15a = ErrorCorrectionLevel.forBits((i >> 3) & 3);
        this.f16b = (byte) (i & 7);
    }

    /* renamed from: a */
    public static A40 m69146a(int i, int i2) {
        A40 m69145b = m69145b(i, i2);
        if (m69145b != null) {
            return m69145b;
        }
        return m69145b(i ^ 21522, i2 ^ 21522);
    }

    /* renamed from: b */
    public static A40 m69145b(int i, int i2) {
        int[][] iArr;
        int m69142e;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        for (int[] iArr2 : f14c) {
            int i5 = iArr2[0];
            if (i5 != i && i5 != i2) {
                int m69142e2 = m69142e(i, i5);
                if (m69142e2 < i3) {
                    i4 = iArr2[1];
                    i3 = m69142e2;
                }
                if (i != i2 && (m69142e = m69142e(i2, i5)) < i3) {
                    i4 = iArr2[1];
                    i3 = m69142e;
                }
            } else {
                return new A40(iArr2[1]);
            }
        }
        if (i3 <= 3) {
            return new A40(i4);
        }
        return null;
    }

    /* renamed from: e */
    public static int m69142e(int i, int i2) {
        return Integer.bitCount(i ^ i2);
    }

    /* renamed from: c */
    public byte m69144c() {
        return this.f16b;
    }

    /* renamed from: d */
    public ErrorCorrectionLevel m69143d() {
        return this.f15a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof A40)) {
            return false;
        }
        A40 a40 = (A40) obj;
        if (this.f15a != a40.f15a || this.f16b != a40.f16b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f15a.ordinal() << 3) | this.f16b;
    }
}
