package p000;

/* renamed from: wx */
/* loaded from: classes.dex */
public abstract class AbstractC17009wx {

    /* renamed from: a */
    public static final int[] f108184a = new int[0];

    /* renamed from: b */
    public static final long[] f108185b = new long[0];

    /* renamed from: c */
    public static final Object[] f108186c = new Object[0];

    /* renamed from: a */
    public static int m644a(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 > i2) {
                i3 = i5 - 1;
            } else {
                return i5;
            }
        }
        return ~i4;
    }

    /* renamed from: b */
    public static int m643b(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = (jArr[i4] > j ? 1 : (jArr[i4] == j ? 0 : -1));
            if (i5 < 0) {
                i3 = i4 + 1;
            } else if (i5 > 0) {
                i2 = i4 - 1;
            } else {
                return i4;
            }
        }
        return ~i3;
    }

    /* renamed from: c */
    public static boolean m642c(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static int m641d(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    /* renamed from: e */
    public static int m640e(int i) {
        return m641d(i * 4) / 4;
    }

    /* renamed from: f */
    public static int m639f(int i) {
        return m641d(i * 8) / 8;
    }
}
