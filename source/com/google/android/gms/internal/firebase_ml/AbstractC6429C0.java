package com.google.android.gms.internal.firebase_ml;

import com.google.common.base.Ascii;

/* renamed from: com.google.android.gms.internal.firebase_ml.C0 */
/* loaded from: classes3.dex */
public abstract class AbstractC6429C0 {
    /* renamed from: a */
    public static int m48073a(int i, byte[] bArr, int i2, int i3, zzaah zzaahVar, C22261tK2 c22261tK2) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                zzaahVar.m47957c(i, Integer.valueOf(m48066h(bArr, i2)));
                                return i2 + 4;
                            }
                            throw zzxs.zzvs();
                        }
                        zzaah m47954f = zzaah.m47954f();
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int m48064j = m48064j(bArr, i2, c22261tK2);
                            int i7 = c22261tK2.f80075a;
                            i6 = i7;
                            if (i7 != i5) {
                                int m48073a = m48073a(i6, bArr, m48064j, i3, m47954f, c22261tK2);
                                i6 = i7;
                                i2 = m48073a;
                            } else {
                                i2 = m48064j;
                                break;
                            }
                        }
                        if (i2 <= i3 && i6 == i5) {
                            zzaahVar.m47957c(i, m47954f);
                            return i2;
                        }
                        throw zzxs.zzvu();
                    }
                    int m48064j2 = m48064j(bArr, i2, c22261tK2);
                    int i8 = c22261tK2.f80075a;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - m48064j2) {
                            if (i8 == 0) {
                                zzaahVar.m47957c(i, zzwd.zzcks);
                            } else {
                                zzaahVar.m47957c(i, zzwd.zzc(bArr, m48064j2, i8));
                            }
                            return m48064j2 + i8;
                        }
                        throw zzxs.zzvq();
                    }
                    throw zzxs.zzvr();
                }
                zzaahVar.m47957c(i, Long.valueOf(m48062l(bArr, i2)));
                return i2 + 8;
            }
            int m48063k = m48063k(bArr, i2, c22261tK2);
            zzaahVar.m47957c(i, Long.valueOf(c22261tK2.f80076b));
            return m48063k;
        }
        throw zzxs.zzvs();
    }

    /* renamed from: b */
    public static int m48072b(int i, byte[] bArr, int i2, int i3, zzxt zzxtVar, C22261tK2 c22261tK2) {
        ZK2 zk2 = (ZK2) zzxtVar;
        int m48064j = m48064j(bArr, i2, c22261tK2);
        zk2.zzdx(c22261tK2.f80075a);
        while (m48064j < i3) {
            int m48064j2 = m48064j(bArr, m48064j, c22261tK2);
            if (i != c22261tK2.f80075a) {
                break;
            }
            m48064j = m48064j(bArr, m48064j2, c22261tK2);
            zk2.zzdx(c22261tK2.f80075a);
        }
        return m48064j;
    }

    /* renamed from: c */
    public static int m48071c(int i, byte[] bArr, int i2, int i3, C22261tK2 c22261tK2) {
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
                            i2 = m48064j(bArr, i2, c22261tK2);
                            i6 = c22261tK2.f80075a;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = m48071c(i6, bArr, i2, i3, c22261tK2);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            return i2;
                        }
                        throw zzxs.zzvu();
                    }
                    return m48064j(bArr, i2, c22261tK2) + c22261tK2.f80075a;
                }
                return i2 + 8;
            }
            return m48063k(bArr, i2, c22261tK2);
        }
        throw zzxs.zzvs();
    }

    /* renamed from: d */
    public static int m48070d(int i, byte[] bArr, int i2, C22261tK2 c22261tK2) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c22261tK2.f80075a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c22261tK2.f80075a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c22261tK2.f80075a = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c22261tK2.f80075a = i9 | (b4 << Ascii.f52686FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c22261tK2.f80075a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* renamed from: e */
    public static int m48069e(OL2 ol2, int i, byte[] bArr, int i2, int i3, zzxt zzxtVar, C22261tK2 c22261tK2) {
        int m48067g = m48067g(ol2, bArr, i2, i3, c22261tK2);
        zzxtVar.add(c22261tK2.f80077c);
        while (m48067g < i3) {
            int m48064j = m48064j(bArr, m48067g, c22261tK2);
            if (i != c22261tK2.f80075a) {
                break;
            }
            m48067g = m48067g(ol2, bArr, m48064j, i3, c22261tK2);
            zzxtVar.add(c22261tK2.f80077c);
        }
        return m48067g;
    }

    /* renamed from: f */
    public static int m48068f(OL2 ol2, byte[] bArr, int i, int i2, int i3, C22261tK2 c22261tK2) {
        C6437G0 c6437g0 = (C6437G0) ol2;
        Object newInstance = c6437g0.newInstance();
        int m48025l = c6437g0.m48025l(newInstance, bArr, i, i2, i3, c22261tK2);
        c6437g0.mo48000g(newInstance);
        c22261tK2.f80077c = newInstance;
        return m48025l;
    }

    /* renamed from: g */
    public static int m48067g(OL2 ol2, byte[] bArr, int i, int i2, C22261tK2 c22261tK2) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m48070d(i4, bArr, i3, c22261tK2);
            i4 = c22261tK2.f80075a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object newInstance = ol2.newInstance();
            int i6 = i4 + i5;
            ol2.mo48002e(newInstance, bArr, i5, i6, c22261tK2);
            ol2.mo48000g(newInstance);
            c22261tK2.f80077c = newInstance;
            return i6;
        }
        throw zzxs.zzvq();
    }

    /* renamed from: h */
    public static int m48066h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: i */
    public static int m48065i(byte[] bArr, int i, zzxt zzxtVar, C22261tK2 c22261tK2) {
        ZK2 zk2 = (ZK2) zzxtVar;
        int m48064j = m48064j(bArr, i, c22261tK2);
        int i2 = c22261tK2.f80075a + m48064j;
        while (m48064j < i2) {
            m48064j = m48064j(bArr, m48064j, c22261tK2);
            zk2.zzdx(c22261tK2.f80075a);
        }
        if (m48064j == i2) {
            return m48064j;
        }
        throw zzxs.zzvq();
    }

    /* renamed from: j */
    public static int m48064j(byte[] bArr, int i, C22261tK2 c22261tK2) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c22261tK2.f80075a = b;
            return i2;
        }
        return m48070d(b, bArr, i2, c22261tK2);
    }

    /* renamed from: k */
    public static int m48063k(byte[] bArr, int i, C22261tK2 c22261tK2) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c22261tK2.f80076b = j;
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
        c22261tK2.f80076b = j2;
        return i3;
    }

    /* renamed from: l */
    public static long m48062l(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: m */
    public static double m48061m(byte[] bArr, int i) {
        return Double.longBitsToDouble(m48062l(bArr, i));
    }

    /* renamed from: n */
    public static int m48060n(byte[] bArr, int i, C22261tK2 c22261tK2) {
        int m48064j = m48064j(bArr, i, c22261tK2);
        int i2 = c22261tK2.f80075a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c22261tK2.f80077c = "";
                return m48064j;
            }
            c22261tK2.f80077c = new String(bArr, m48064j, i2, zzxl.f46112a);
            return m48064j + i2;
        }
        throw zzxs.zzvr();
    }

    /* renamed from: o */
    public static float m48059o(byte[] bArr, int i) {
        return Float.intBitsToFloat(m48066h(bArr, i));
    }

    /* renamed from: p */
    public static int m48058p(byte[] bArr, int i, C22261tK2 c22261tK2) {
        int m48064j = m48064j(bArr, i, c22261tK2);
        int i2 = c22261tK2.f80075a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c22261tK2.f80077c = "";
                return m48064j;
            }
            c22261tK2.f80077c = AbstractC6464b.m47968j(bArr, m48064j, i2);
            return m48064j + i2;
        }
        throw zzxs.zzvr();
    }

    /* renamed from: q */
    public static int m48057q(byte[] bArr, int i, C22261tK2 c22261tK2) {
        int m48064j = m48064j(bArr, i, c22261tK2);
        int i2 = c22261tK2.f80075a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - m48064j) {
                if (i2 == 0) {
                    c22261tK2.f80077c = zzwd.zzcks;
                    return m48064j;
                }
                c22261tK2.f80077c = zzwd.zzc(bArr, m48064j, i2);
                return m48064j + i2;
            }
            throw zzxs.zzvq();
        }
        throw zzxs.zzvr();
    }
}
