package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.j */
/* loaded from: classes3.dex */
public abstract class AbstractC6565j {

    /* renamed from: a */
    public static final AbstractC21905qv2 f46884a;

    static {
        if (AbstractC19310bv2.m51821C() && AbstractC19310bv2.m51820D()) {
            int i = AbstractC21344nh2.f72547a;
        }
        f46884a = new C23116xv2();
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ int m46893c(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte b = bArr[i - 1];
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return m46886j(b, bArr[i], bArr[i + 1]);
                }
                throw new AssertionError();
            }
            return m46887i(b, bArr[i]);
        } else if (b > -12) {
            return -1;
        } else {
            return b;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ff, code lost:
        return r9 + r0;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m46892d(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC6565j.m46892d(java.lang.CharSequence, byte[], int, int):int");
    }

    /* renamed from: e */
    public static int m46891e(CharSequence charSequence) {
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
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new zzhm(i2, length2);
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
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    /* renamed from: f */
    public static int m46890f(int i, byte[] bArr, int i2, int i3) {
        return f46884a.mo457a(i, bArr, i2, i3);
    }

    /* renamed from: g */
    public static boolean m46889g(byte[] bArr) {
        return f46884a.m23559b(bArr, 0, bArr.length);
    }

    /* renamed from: h */
    public static boolean m46888h(byte[] bArr, int i, int i2) {
        return f46884a.m23559b(bArr, i, i2);
    }

    /* renamed from: i */
    public static int m46887i(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: j */
    public static int m46886j(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}