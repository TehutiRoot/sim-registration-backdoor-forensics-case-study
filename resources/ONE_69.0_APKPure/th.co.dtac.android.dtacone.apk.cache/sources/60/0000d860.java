package p000;

import com.google.common.base.Objects;
import java.util.Arrays;
import kotlin.UShort;

/* renamed from: ju */
/* loaded from: classes4.dex */
public abstract class AbstractC11594ju {
    /* renamed from: a */
    public static Object m29323a(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i);
    }

    /* renamed from: b */
    public static int m29322b(int i, int i2) {
        return i & (~i2);
    }

    /* renamed from: c */
    public static int m29321c(int i, int i2) {
        return i & i2;
    }

    /* renamed from: d */
    public static int m29320d(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    /* renamed from: e */
    public static int m29319e(int i) {
        int i2;
        if (i < 32) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        return i2 * (i + 1);
    }

    /* renamed from: f */
    public static int m29318f(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int m68994d = C70.m68994d(obj);
        int i4 = m68994d & i;
        int m29316h = m29316h(obj3, i4);
        if (m29316h == 0) {
            return -1;
        }
        int m29322b = m29322b(m68994d, i);
        int i5 = -1;
        while (true) {
            i2 = m29316h - 1;
            i3 = iArr[i2];
            if (m29322b(i3, i) != m29322b || !Objects.equal(obj, objArr[i2]) || (objArr2 != null && !Objects.equal(obj2, objArr2[i2]))) {
                int m29321c = m29321c(i3, i);
                if (m29321c == 0) {
                    return -1;
                }
                i5 = i2;
                m29316h = m29321c;
            }
        }
        int m29321c2 = m29321c(i3, i);
        if (i5 == -1) {
            m29315i(obj3, i4, m29321c2);
        } else {
            iArr[i5] = m29320d(iArr[i5], m29321c2, i);
        }
        return i2;
    }

    /* renamed from: g */
    public static void m29317g(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    /* renamed from: h */
    public static int m29316h(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i] & UShort.MAX_VALUE;
        }
        return ((int[]) obj)[i];
    }

    /* renamed from: i */
    public static void m29315i(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    /* renamed from: j */
    public static int m29314j(int i) {
        return Math.max(4, C70.m68997a(i + 1, 1.0d));
    }
}