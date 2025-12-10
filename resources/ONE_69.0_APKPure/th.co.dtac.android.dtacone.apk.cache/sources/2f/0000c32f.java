package com.tom_roush.pdfbox.util;

import com.facebook.stetho.dumpapp.Framer;

/* loaded from: classes5.dex */
public class NumberFormatUtil {

    /* renamed from: a */
    public static final long[] f60868a;

    /* renamed from: b */
    public static final int[] f60869b;

    static {
        long[] jArr = new long[19];
        f60868a = jArr;
        jArr[0] = 1;
        int i = 1;
        int i2 = 1;
        while (true) {
            long[] jArr2 = f60868a;
            if (i2 >= jArr2.length) {
                break;
            }
            jArr2[i2] = jArr2[i2 - 1] * 10;
            i2++;
        }
        int[] iArr = new int[10];
        f60869b = iArr;
        iArr[0] = 1;
        while (true) {
            int[] iArr2 = f60869b;
            if (i < iArr2.length) {
                iArr2[i] = iArr2[i - 1] * 10;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static int m32070a(long j, int i, boolean z, byte[] bArr, int i2) {
        long j2;
        while (j > 2147483647L && (!z || j > 0)) {
            long j3 = f60868a[i];
            j -= j3 * (j / j3);
            bArr[i2] = (byte) (j2 + 48);
            i--;
            i2++;
        }
        int i3 = (int) j;
        while (i >= 0 && (!z || i3 > 0)) {
            int i4 = f60869b[i];
            int i5 = i3 / i4;
            i3 -= i4 * i5;
            bArr[i2] = (byte) (i5 + 48);
            i--;
            i2++;
        }
        return i2;
    }

    /* renamed from: b */
    public static int m32069b(long j) {
        int i = 0;
        while (true) {
            long[] jArr = f60868a;
            if (i < jArr.length - 1) {
                int i2 = i + 1;
                if (j < jArr[i2]) {
                    return i;
                }
                i = i2;
            } else {
                return jArr.length - 1;
            }
        }
    }

    public static int formatFloatFast(float f, int i, byte[] bArr) {
        int i2;
        if (!Float.isNaN(f) && !Float.isInfinite(f) && f <= 9.223372E18f && f > -9.223372E18f && i <= 5) {
            long j = f;
            if (f < 0.0f) {
                bArr[0] = Framer.STDIN_FRAME_PREFIX;
                j = -j;
                i2 = 1;
            } else {
                i2 = 0;
            }
            double abs = Math.abs(f) - j;
            long j2 = f60868a[i];
            long j3 = (long) ((abs * j2) + 0.5d);
            if (j3 >= j2) {
                j++;
                j3 -= j2;
            }
            long j4 = j3;
            int m32070a = m32070a(j, m32069b(j), false, bArr, i2);
            if (j4 > 0 && i > 0) {
                bArr[m32070a] = 46;
                return m32070a(j4, i - 1, true, bArr, m32070a + 1);
            }
            return m32070a;
        }
        return -1;
    }
}