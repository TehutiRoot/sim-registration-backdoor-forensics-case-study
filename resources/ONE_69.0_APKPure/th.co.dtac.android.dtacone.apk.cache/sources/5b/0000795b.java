package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzx;

/* renamed from: cf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC19435cf2 {
    /* renamed from: a */
    public static int m51676a(int i) {
        int i2;
        if (i < 32) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        return i2 * (i + 1);
    }

    /* renamed from: b */
    public static int m51675b(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int m31493a = AbstractC19954ff2.m31493a(obj);
        int i4 = m31493a & i;
        int m51674c = m51674c(obj3, i4);
        if (m51674c != 0) {
            int i5 = ~i;
            int i6 = m31493a & i5;
            int i7 = -1;
            while (true) {
                i2 = m51674c - 1;
                i3 = iArr[i2];
                if ((i3 & i5) != i6 || !zzx.zza(obj, objArr[i2]) || (objArr2 != null && !zzx.zza(obj2, objArr2[i2]))) {
                    int i8 = i3 & i;
                    if (i8 == 0) {
                        break;
                    }
                    i7 = i2;
                    m51674c = i8;
                }
            }
            int i9 = i3 & i;
            if (i7 == -1) {
                m51672e(obj3, i4, i9);
            } else {
                iArr[i7] = (i9 & i) | (iArr[i7] & i5);
            }
            return i2;
        }
        return -1;
    }

    /* renamed from: c */
    public static int m51674c(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    /* renamed from: d */
    public static Object m51673d(int i) {
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
    public static void m51672e(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}