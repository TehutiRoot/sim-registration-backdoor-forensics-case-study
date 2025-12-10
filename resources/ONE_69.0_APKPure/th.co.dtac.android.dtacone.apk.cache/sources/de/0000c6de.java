package p000;

import io.opencensus.internal.Utils;
import java.util.Arrays;

/* renamed from: fb */
/* loaded from: classes5.dex */
public abstract class AbstractC10232fb {

    /* renamed from: a */
    public static final char[] f61886a = m31511b();

    /* renamed from: b */
    public static final byte[] f61887b = m31512a();

    /* renamed from: a */
    public static byte[] m31512a() {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 16; i++) {
            bArr["0123456789abcdef".charAt(i)] = (byte) i;
        }
        return bArr;
    }

    /* renamed from: b */
    public static char[] m31511b() {
        char[] cArr = new char[512];
        for (int i = 0; i < 256; i++) {
            cArr[i] = "0123456789abcdef".charAt(i >>> 4);
            cArr[i | 256] = "0123456789abcdef".charAt(i & 15);
        }
        return cArr;
    }

    /* renamed from: c */
    public static byte m31510c(CharSequence charSequence, int i) {
        boolean z;
        if (charSequence.length() >= i + 2) {
            z = true;
        } else {
            z = false;
        }
        Utils.checkArgument(z, "chars too small");
        return m31507f(charSequence.charAt(i), charSequence.charAt(i + 1));
    }

    /* renamed from: d */
    public static void m31509d(byte b, char[] cArr, int i) {
        int i2 = b & 255;
        char[] cArr2 = f61886a;
        cArr[i] = cArr2[i2];
        cArr[i + 1] = cArr2[i2 | 256];
    }

    /* renamed from: e */
    public static void m31508e(byte b, char[] cArr, int i) {
        m31509d(b, cArr, i);
    }

    /* renamed from: f */
    public static byte m31507f(char c, char c2) {
        boolean z;
        boolean z2 = false;
        if (c2 < 128 && f61887b[c2] != -1) {
            z = true;
        } else {
            z = false;
        }
        Utils.checkArgument(z, "invalid character " + c2);
        if (c < 128 && f61887b[c] != -1) {
            z2 = true;
        }
        Utils.checkArgument(z2, "invalid character " + c);
        byte[] bArr = f61887b;
        return (byte) ((bArr[c] << 4) | bArr[c2]);
    }

    /* renamed from: g */
    public static long m31506g(CharSequence charSequence, int i) {
        boolean z;
        if (charSequence.length() >= i + 16) {
            z = true;
        } else {
            z = false;
        }
        Utils.checkArgument(z, "chars too small");
        return (m31507f(charSequence.charAt(i + 14), charSequence.charAt(i + 15)) & 255) | ((m31507f(charSequence.charAt(i), charSequence.charAt(i + 1)) & 255) << 56) | ((m31507f(charSequence.charAt(i + 2), charSequence.charAt(i + 3)) & 255) << 48) | ((m31507f(charSequence.charAt(i + 4), charSequence.charAt(i + 5)) & 255) << 40) | ((m31507f(charSequence.charAt(i + 6), charSequence.charAt(i + 7)) & 255) << 32) | ((m31507f(charSequence.charAt(i + 8), charSequence.charAt(i + 9)) & 255) << 24) | ((m31507f(charSequence.charAt(i + 10), charSequence.charAt(i + 11)) & 255) << 16) | ((m31507f(charSequence.charAt(i + 12), charSequence.charAt(i + 13)) & 255) << 8);
    }

    /* renamed from: h */
    public static long m31505h(byte[] bArr, int i) {
        boolean z;
        if (bArr.length >= i + 8) {
            z = true;
        } else {
            z = false;
        }
        Utils.checkArgument(z, "array too small");
        return (bArr[i + 7] & 255) | ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
    }

    /* renamed from: i */
    public static void m31504i(long j, char[] cArr, int i) {
        m31509d((byte) ((j >> 56) & 255), cArr, i);
        m31509d((byte) ((j >> 48) & 255), cArr, i + 2);
        m31509d((byte) ((j >> 40) & 255), cArr, i + 4);
        m31509d((byte) ((j >> 32) & 255), cArr, i + 6);
        m31509d((byte) ((j >> 24) & 255), cArr, i + 8);
        m31509d((byte) ((j >> 16) & 255), cArr, i + 10);
        m31509d((byte) ((j >> 8) & 255), cArr, i + 12);
        m31509d((byte) (j & 255), cArr, i + 14);
    }

    /* renamed from: j */
    public static void m31503j(long j, byte[] bArr, int i) {
        boolean z;
        if (bArr.length >= i + 8) {
            z = true;
        } else {
            z = false;
        }
        Utils.checkArgument(z, "array too small");
        bArr[i + 7] = (byte) (j & 255);
        bArr[i + 6] = (byte) ((j >> 8) & 255);
        bArr[i + 5] = (byte) ((j >> 16) & 255);
        bArr[i + 4] = (byte) ((j >> 24) & 255);
        bArr[i + 3] = (byte) ((j >> 32) & 255);
        bArr[i + 2] = (byte) ((j >> 40) & 255);
        bArr[i + 1] = (byte) ((j >> 48) & 255);
        bArr[i] = (byte) ((j >> 56) & 255);
    }
}