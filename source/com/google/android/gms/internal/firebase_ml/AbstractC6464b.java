package com.google.android.gms.internal.firebase_ml;

/* renamed from: com.google.android.gms.internal.firebase_ml.b */
/* loaded from: classes3.dex */
public abstract class AbstractC6464b {

    /* renamed from: a */
    public static final AbstractC17647Ga2 f45718a;

    static {
        AbstractC17647Ga2 c6466c;
        if (AbstractC17455Da2.m68642J() && AbstractC17455Da2.m68641K() && !AbstractC21917rK2.m23335b()) {
            c6466c = new C6468d();
        } else {
            c6466c = new C6466c();
        }
        f45718a = c6466c;
    }

    /* renamed from: a */
    public static int m47977a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f45718a.mo47962b(charSequence, bArr, i, i2);
    }

    /* renamed from: b */
    public static int m47976b(int i, byte[] bArr, int i2, int i3) {
        return f45718a.mo47963a(i, bArr, i2, i3);
    }

    /* renamed from: c */
    public static int m47975c(CharSequence charSequence) {
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
                                throw new zzaaq(i2, length2);
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

    /* renamed from: d */
    public static int m47974d(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: e */
    public static int m47973e(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: h */
    public static boolean m47970h(byte[] bArr, int i, int i2) {
        return f45718a.m68226c(bArr, i, i2);
    }

    /* renamed from: i */
    public static int m47969i(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return m47974d(b, bArr[i], bArr[i + 1]);
                }
                throw new AssertionError();
            }
            return m47965m(b, bArr[i]);
        }
        return m47973e(b);
    }

    /* renamed from: j */
    public static String m47968j(byte[] bArr, int i, int i2) {
        return f45718a.mo47961d(bArr, i, i2);
    }

    /* renamed from: l */
    public static boolean m47966l(byte[] bArr) {
        return f45718a.m68226c(bArr, 0, bArr.length);
    }

    /* renamed from: m */
    public static int m47965m(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }
}
