package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.F */
/* loaded from: classes3.dex */
public abstract class AbstractC6621F {

    /* renamed from: a */
    public static final AbstractC22765wG2 f47506a;

    static {
        AbstractC22765wG2 c6622g;
        if (AbstractC20013gG2.m31184m() && AbstractC20013gG2.m31179r() && !AbstractC20291hu2.m30708b()) {
            c6622g = new C6623H();
        } else {
            c6622g = new C6622G();
        }
        f47506a = c6622g;
    }

    /* renamed from: d */
    public static int m46604d(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new zzmg(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(i3 + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    public static int m46603e(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f47506a.mo879b(charSequence, bArr, i, i2);
    }

    /* renamed from: f */
    public static boolean m46602f(byte[] bArr) {
        return f47506a.m878c(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public static boolean m46601g(byte[] bArr, int i, int i2) {
        return f47506a.m878c(bArr, i, i2);
    }

    /* renamed from: h */
    public static int m46600h(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: i */
    public static int m46599i(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: j */
    public static int m46598j(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: k */
    public static String m46597k(byte[] bArr, int i, int i2) {
        return f47506a.mo877d(bArr, i, i2);
    }

    /* renamed from: m */
    public static int m46595m(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return m46598j(b, bArr[i], bArr[i + 1]);
                }
                throw new AssertionError();
            }
            return m46599i(b, bArr[i]);
        }
        return m46600h(b);
    }
}
