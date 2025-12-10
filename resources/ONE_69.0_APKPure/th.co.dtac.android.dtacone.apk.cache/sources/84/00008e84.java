package com.google.android.gms.internal.firebase_ml;

import com.google.common.base.Ascii;

/* renamed from: com.google.android.gms.internal.firebase_ml.C0 */
/* loaded from: classes3.dex */
public abstract class AbstractC6418C0 {
    /* renamed from: a */
    public static int m48070a(int i, byte[] bArr, int i2, int i3, zzaah zzaahVar, C21810qL2 c21810qL2) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                zzaahVar.m47966c(i, Integer.valueOf(m48063h(bArr, i2)));
                                return i2 + 4;
                            }
                            throw zzxs.zzvs();
                        }
                        zzaah m47963f = zzaah.m47963f();
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int m48061j = m48061j(bArr, i2, c21810qL2);
                            int i7 = c21810qL2.f77172a;
                            i6 = i7;
                            if (i7 != i5) {
                                int m48070a = m48070a(i6, bArr, m48061j, i3, m47963f, c21810qL2);
                                i6 = i7;
                                i2 = m48070a;
                            } else {
                                i2 = m48061j;
                                break;
                            }
                        }
                        if (i2 <= i3 && i6 == i5) {
                            zzaahVar.m47966c(i, m47963f);
                            return i2;
                        }
                        throw zzxs.zzvu();
                    }
                    int m48061j2 = m48061j(bArr, i2, c21810qL2);
                    int i8 = c21810qL2.f77172a;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - m48061j2) {
                            if (i8 == 0) {
                                zzaahVar.m47966c(i, zzwd.zzcks);
                            } else {
                                zzaahVar.m47966c(i, zzwd.zzc(bArr, m48061j2, i8));
                            }
                            return m48061j2 + i8;
                        }
                        throw zzxs.zzvq();
                    }
                    throw zzxs.zzvr();
                }
                zzaahVar.m47966c(i, Long.valueOf(m48059l(bArr, i2)));
                return i2 + 8;
            }
            int m48060k = m48060k(bArr, i2, c21810qL2);
            zzaahVar.m47966c(i, Long.valueOf(c21810qL2.f77173b));
            return m48060k;
        }
        throw zzxs.zzvs();
    }

    /* renamed from: b */
    public static int m48069b(int i, byte[] bArr, int i2, int i3, zzxt zzxtVar, C21810qL2 c21810qL2) {
        WL2 wl2 = (WL2) zzxtVar;
        int m48061j = m48061j(bArr, i2, c21810qL2);
        wl2.zzdx(c21810qL2.f77172a);
        while (m48061j < i3) {
            int m48061j2 = m48061j(bArr, m48061j, c21810qL2);
            if (i != c21810qL2.f77172a) {
                break;
            }
            m48061j = m48061j(bArr, m48061j2, c21810qL2);
            wl2.zzdx(c21810qL2.f77172a);
        }
        return m48061j;
    }

    /* renamed from: c */
    public static int m48068c(int i, byte[] bArr, int i2, int i3, C21810qL2 c21810qL2) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw zzxs.zzvs();
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = m48061j(bArr, i2, c21810qL2);
                            i6 = c21810qL2.f77172a;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = m48068c(i6, bArr, i2, i3, c21810qL2);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            return i2;
                        }
                        throw zzxs.zzvu();
                    }
                    return m48061j(bArr, i2, c21810qL2) + c21810qL2.f77172a;
                }
                return i2 + 8;
            }
            return m48060k(bArr, i2, c21810qL2);
        }
        throw zzxs.zzvs();
    }

    /* renamed from: d */
    public static int m48067d(int i, byte[] bArr, int i2, C21810qL2 c21810qL2) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c21810qL2.f77172a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c21810qL2.f77172a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c21810qL2.f77172a = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c21810qL2.f77172a = i9 | (b4 << Ascii.f52698FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c21810qL2.f77172a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* renamed from: e */
    public static int m48066e(LM2 lm2, int i, byte[] bArr, int i2, int i3, zzxt zzxtVar, C21810qL2 c21810qL2) {
        int m48064g = m48064g(lm2, bArr, i2, i3, c21810qL2);
        zzxtVar.add(c21810qL2.f77174c);
        while (m48064g < i3) {
            int m48061j = m48061j(bArr, m48064g, c21810qL2);
            if (i != c21810qL2.f77172a) {
                break;
            }
            m48064g = m48064g(lm2, bArr, m48061j, i3, c21810qL2);
            zzxtVar.add(c21810qL2.f77174c);
        }
        return m48064g;
    }

    /* renamed from: f */
    public static int m48065f(LM2 lm2, byte[] bArr, int i, int i2, int i3, C21810qL2 c21810qL2) {
        C6426G0 c6426g0 = (C6426G0) lm2;
        Object newInstance = c6426g0.newInstance();
        int m48022l = c6426g0.m48022l(newInstance, bArr, i, i2, i3, c21810qL2);
        c6426g0.mo47997g(newInstance);
        c21810qL2.f77174c = newInstance;
        return m48022l;
    }

    /* renamed from: g */
    public static int m48064g(LM2 lm2, byte[] bArr, int i, int i2, C21810qL2 c21810qL2) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m48067d(i4, bArr, i3, c21810qL2);
            i4 = c21810qL2.f77172a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object newInstance = lm2.newInstance();
            int i6 = i4 + i5;
            lm2.mo47999e(newInstance, bArr, i5, i6, c21810qL2);
            lm2.mo47997g(newInstance);
            c21810qL2.f77174c = newInstance;
            return i6;
        }
        throw zzxs.zzvq();
    }

    /* renamed from: h */
    public static int m48063h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: i */
    public static int m48062i(byte[] bArr, int i, zzxt zzxtVar, C21810qL2 c21810qL2) {
        WL2 wl2 = (WL2) zzxtVar;
        int m48061j = m48061j(bArr, i, c21810qL2);
        int i2 = c21810qL2.f77172a + m48061j;
        while (m48061j < i2) {
            m48061j = m48061j(bArr, m48061j, c21810qL2);
            wl2.zzdx(c21810qL2.f77172a);
        }
        if (m48061j == i2) {
            return m48061j;
        }
        throw zzxs.zzvq();
    }

    /* renamed from: j */
    public static int m48061j(byte[] bArr, int i, C21810qL2 c21810qL2) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c21810qL2.f77172a = b;
            return i2;
        }
        return m48067d(b, bArr, i2, c21810qL2);
    }

    /* renamed from: k */
    public static int m48060k(byte[] bArr, int i, C21810qL2 c21810qL2) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c21810qL2.f77173b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        c21810qL2.f77173b = j2;
        return i3;
    }

    /* renamed from: l */
    public static long m48059l(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: m */
    public static double m48058m(byte[] bArr, int i) {
        return Double.longBitsToDouble(m48059l(bArr, i));
    }

    /* renamed from: n */
    public static int m48057n(byte[] bArr, int i, C21810qL2 c21810qL2) {
        int m48061j = m48061j(bArr, i, c21810qL2);
        int i2 = c21810qL2.f77172a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c21810qL2.f77174c = "";
                return m48061j;
            }
            c21810qL2.f77174c = new String(bArr, m48061j, i2, zzxl.f46124a);
            return m48061j + i2;
        }
        throw zzxs.zzvr();
    }

    /* renamed from: o */
    public static float m48056o(byte[] bArr, int i) {
        return Float.intBitsToFloat(m48063h(bArr, i));
    }

    /* renamed from: p */
    public static int m48055p(byte[] bArr, int i, C21810qL2 c21810qL2) {
        int m48061j = m48061j(bArr, i, c21810qL2);
        int i2 = c21810qL2.f77172a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c21810qL2.f77174c = "";
                return m48061j;
            }
            c21810qL2.f77174c = AbstractC6453b.m47977j(bArr, m48061j, i2);
            return m48061j + i2;
        }
        throw zzxs.zzvr();
    }

    /* renamed from: q */
    public static int m48054q(byte[] bArr, int i, C21810qL2 c21810qL2) {
        int m48061j = m48061j(bArr, i, c21810qL2);
        int i2 = c21810qL2.f77172a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - m48061j) {
                if (i2 == 0) {
                    c21810qL2.f77174c = zzwd.zzcks;
                    return m48061j;
                }
                c21810qL2.f77174c = zzwd.zzc(bArr, m48061j, i2);
                return m48061j + i2;
            }
            throw zzxs.zzvq();
        }
        throw zzxs.zzvr();
    }
}