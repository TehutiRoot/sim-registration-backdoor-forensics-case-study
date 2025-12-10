package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzay;

/* renamed from: og2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21453og2 {
    /* renamed from: a */
    public static int m25891a(int i) {
        int i2;
        if (i < 32) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        return i2 * (i + 1);
    }

    /* renamed from: b */
    public static int m25890b(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int m23636a = AbstractC21625pg2.m23636a(obj);
        int i4 = m23636a & i;
        int m25889c = m25889c(obj3, i4);
        if (m25889c != 0) {
            int i5 = ~i;
            int i6 = m23636a & i5;
            int i7 = -1;
            while (true) {
                i2 = m25889c - 1;
                i3 = iArr[i2];
                if ((i3 & i5) != i6 || !zzay.zza(obj, objArr[i2]) || (objArr2 != null && !zzay.zza(obj2, objArr2[i2]))) {
                    int i8 = i3 & i;
                    if (i8 == 0) {
                        break;
                    }
                    i7 = i2;
                    m25889c = i8;
                }
            }
            int i9 = i3 & i;
            if (i7 == -1) {
                m25887e(obj3, i4, i9);
            } else {
                iArr[i7] = (i9 & i) | (iArr[i7] & i5);
            }
            return i2;
        }
        return -1;
    }

    /* renamed from: c */
    public static int m25889c(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    /* renamed from: d */
    public static Object m25888d(int i) {
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

    /* renamed from: e */
    public static void m25887e(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
