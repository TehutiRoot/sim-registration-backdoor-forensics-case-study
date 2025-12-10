package org.bson.internal;

import com.facebook.stetho.dumpapp.Framer;

/* loaded from: classes6.dex */
public final class Base64 {

    /* renamed from: a */
    public static final byte[] f76014a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b */
    public static final int[] f76015b = new int[128];

    static {
        int i = 0;
        while (true) {
            byte[] bArr = f76014a;
            if (i < bArr.length) {
                f76015b[bArr[i]] = i;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static String m24384a(byte[] bArr) {
        return new String(bArr, 0, 0, bArr.length);
    }

    public static byte[] decode(String str) {
        int i;
        if (str.endsWith("==")) {
            i = 2;
        } else if (str.endsWith("=")) {
            i = 1;
        } else {
            i = 0;
        }
        int length = ((str.length() * 3) / 4) - i;
        byte[] bArr = new byte[length];
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3 += 4) {
            int[] iArr = f76015b;
            int i4 = iArr[str.charAt(i3)];
            int i5 = iArr[str.charAt(i3 + 1)];
            int i6 = i2 + 1;
            bArr[i2] = (byte) (((i4 << 2) | (i5 >> 4)) & 255);
            if (i6 >= length) {
                return bArr;
            }
            int i7 = iArr[str.charAt(i3 + 2)];
            int i8 = i2 + 2;
            bArr[i6] = (byte) (((i5 << 4) | (i7 >> 2)) & 255);
            if (i8 >= length) {
                return bArr;
            }
            i2 += 3;
            bArr[i8] = (byte) ((iArr[str.charAt(i3 + 3)] | (i7 << 6)) & 255);
        }
        return bArr;
    }

    public static String encode(byte[] bArr) {
        int i;
        int length = (bArr.length / 3) * 4;
        if (bArr.length % 3 == 0) {
            i = 0;
        } else {
            i = 4;
        }
        byte[] bArr2 = new byte[length + i];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 : bArr) {
            i2 = (i2 + 1) % 3;
            if (i5 < 0) {
                i5 += 256;
            }
            i4 = (i4 << 8) + i5;
            if (i2 == 0) {
                byte[] bArr3 = f76014a;
                bArr2[i3] = bArr3[(i4 >> 18) & 63];
                bArr2[i3 + 1] = bArr3[(i4 >> 12) & 63];
                int i6 = i3 + 3;
                bArr2[i3 + 2] = bArr3[(i4 >> 6) & 63];
                i3 += 4;
                bArr2[i6] = bArr3[i4 & 63];
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                byte[] bArr4 = f76014a;
                bArr2[i3] = bArr4[(i4 >> 10) & 63];
                bArr2[i3 + 1] = bArr4[(i4 >> 4) & 63];
                bArr2[i3 + 2] = bArr4[(i4 << 2) & 63];
                bArr2[i3 + 3] = kotlin.p023io.encoding.Base64.padSymbol;
            }
        } else {
            byte[] bArr5 = f76014a;
            bArr2[i3] = bArr5[(i4 >> 2) & 63];
            bArr2[i3 + 1] = bArr5[(i4 << 4) & 63];
            bArr2[i3 + 2] = kotlin.p023io.encoding.Base64.padSymbol;
            bArr2[i3 + 3] = kotlin.p023io.encoding.Base64.padSymbol;
        }
        return m24384a(bArr2);
    }
}