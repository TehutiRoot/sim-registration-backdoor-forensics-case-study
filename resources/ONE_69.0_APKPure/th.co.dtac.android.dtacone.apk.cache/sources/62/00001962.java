package p000;

import com.google.android.gms.internal.clearcut.AbstractC6392k;
import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzci;
import com.google.android.gms.internal.clearcut.zzcn;
import com.google.android.gms.internal.clearcut.zzco;
import com.google.android.gms.internal.clearcut.zzey;
import com.google.common.base.Ascii;

/* renamed from: ae2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC19081ae2 {
    /* renamed from: a */
    public static int m65107a(int i, byte[] bArr, int i2, int i3, zzcn zzcnVar, C19951fe2 c19951fe2) {
        C19090ah2 c19090ah2 = (C19090ah2) zzcnVar;
        int m65102f = m65102f(bArr, i2, c19951fe2);
        while (true) {
            c19090ah2.m65075a(c19951fe2.f61917a);
            if (m65102f >= i3) {
                break;
            }
            int m65102f2 = m65102f(bArr, m65102f, c19951fe2);
            if (i != c19951fe2.f61917a) {
                break;
            }
            m65102f = m65102f(bArr, m65102f2, c19951fe2);
        }
        return m65102f;
    }

    /* renamed from: b */
    public static int m65106b(int i, byte[] bArr, int i2, int i3, zzey zzeyVar, C19951fe2 c19951fe2) {
        Object zzb;
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                zzeyVar.m48145d(i, Integer.valueOf(m65100h(bArr, i2)));
                                return i2 + 4;
                            }
                            throw zzco.zzbm();
                        }
                        zzey m48143f = zzey.m48143f();
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int m65102f = m65102f(bArr, i2, c19951fe2);
                            int i7 = c19951fe2.f61917a;
                            i6 = i7;
                            if (i7 != i5) {
                                int m65106b = m65106b(i6, bArr, m65102f, i3, m48143f, c19951fe2);
                                i6 = i7;
                                i2 = m65106b;
                            } else {
                                i2 = m65102f;
                                break;
                            }
                        }
                        if (i2 <= i3 && i6 == i5) {
                            zzeyVar.m48145d(i, m48143f);
                            return i2;
                        }
                        throw zzco.zzbo();
                    }
                    int m65102f2 = m65102f(bArr, i2, c19951fe2);
                    int i8 = c19951fe2.f61917a;
                    if (i8 == 0) {
                        zzb = zzbb.zzfi;
                    } else {
                        zzb = zzbb.zzb(bArr, m65102f2, i8);
                    }
                    zzeyVar.m48145d(i, zzb);
                    return m65102f2 + i8;
                }
                zzeyVar.m48145d(i, Long.valueOf(m65097k(bArr, i2)));
                return i2 + 8;
            }
            int m65101g = m65101g(bArr, i2, c19951fe2);
            zzeyVar.m48145d(i, Long.valueOf(c19951fe2.f61918b));
            return m65101g;
        }
        throw zzco.zzbm();
    }

    /* renamed from: c */
    public static int m65105c(int i, byte[] bArr, int i2, int i3, C19951fe2 c19951fe2) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw zzco.zzbm();
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = m65102f(bArr, i2, c19951fe2);
                            i6 = c19951fe2.f61917a;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = m65105c(i6, bArr, i2, i3, c19951fe2);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            return i2;
                        }
                        throw zzco.zzbo();
                    }
                    return m65102f(bArr, i2, c19951fe2) + c19951fe2.f61917a;
                }
                return i2 + 8;
            }
            return m65101g(bArr, i2, c19951fe2);
        }
        throw zzco.zzbm();
    }

    /* renamed from: d */
    public static int m65104d(int i, byte[] bArr, int i2, C19951fe2 c19951fe2) {
        int i3;
        int i4 = i & 127;
        int i5 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i3 = b << 7;
        } else {
            int i6 = i4 | ((b & Byte.MAX_VALUE) << 7);
            int i7 = i2 + 2;
            byte b2 = bArr[i5];
            if (b2 >= 0) {
                c19951fe2.f61917a = i6 | (b2 << 14);
                return i7;
            }
            i4 = i6 | ((b2 & Byte.MAX_VALUE) << 14);
            i5 = i2 + 3;
            byte b3 = bArr[i7];
            if (b3 >= 0) {
                i3 = b3 << Ascii.NAK;
            } else {
                int i8 = i4 | ((b3 & Byte.MAX_VALUE) << 21);
                int i9 = i2 + 4;
                byte b4 = bArr[i5];
                if (b4 >= 0) {
                    c19951fe2.f61917a = i8 | (b4 << Ascii.f52698FS);
                    return i9;
                }
                int i10 = i8 | ((b4 & Byte.MAX_VALUE) << 28);
                while (true) {
                    int i11 = i9 + 1;
                    if (bArr[i9] >= 0) {
                        c19951fe2.f61917a = i10;
                        return i11;
                    }
                    i9 = i11;
                }
            }
        }
        c19951fe2.f61917a = i4 | i3;
        return i5;
    }

    /* renamed from: e */
    public static int m65103e(byte[] bArr, int i, zzcn zzcnVar, C19951fe2 c19951fe2) {
        C19090ah2 c19090ah2 = (C19090ah2) zzcnVar;
        int m65102f = m65102f(bArr, i, c19951fe2);
        int i2 = c19951fe2.f61917a + m65102f;
        while (m65102f < i2) {
            m65102f = m65102f(bArr, m65102f, c19951fe2);
            c19090ah2.m65075a(c19951fe2.f61917a);
        }
        if (m65102f == i2) {
            return m65102f;
        }
        throw zzco.zzbl();
    }

    /* renamed from: f */
    public static int m65102f(byte[] bArr, int i, C19951fe2 c19951fe2) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c19951fe2.f61917a = b;
            return i2;
        }
        return m65104d(b, bArr, i2, c19951fe2);
    }

    /* renamed from: g */
    public static int m65101g(byte[] bArr, int i, C19951fe2 c19951fe2) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c19951fe2.f61918b = j;
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
        c19951fe2.f61918b = j2;
        return i3;
    }

    /* renamed from: h */
    public static int m65100h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: i */
    public static int m65099i(byte[] bArr, int i, C19951fe2 c19951fe2) {
        int m65102f = m65102f(bArr, i, c19951fe2);
        int i2 = c19951fe2.f61917a;
        if (i2 == 0) {
            c19951fe2.f61919c = "";
            return m65102f;
        }
        c19951fe2.f61919c = new String(bArr, m65102f, i2, zzci.f45585a);
        return m65102f + i2;
    }

    /* renamed from: j */
    public static int m65098j(byte[] bArr, int i, C19951fe2 c19951fe2) {
        int m65102f = m65102f(bArr, i, c19951fe2);
        int i2 = c19951fe2.f61917a;
        if (i2 == 0) {
            c19951fe2.f61919c = "";
            return m65102f;
        }
        int i3 = m65102f + i2;
        if (AbstractC6392k.m48219i(bArr, m65102f, i3)) {
            c19951fe2.f61919c = new String(bArr, m65102f, i2, zzci.f45585a);
            return i3;
        }
        throw zzco.zzbp();
    }

    /* renamed from: k */
    public static long m65097k(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: l */
    public static double m65096l(byte[] bArr, int i) {
        return Double.longBitsToDouble(m65097k(bArr, i));
    }

    /* renamed from: m */
    public static int m65095m(byte[] bArr, int i, C19951fe2 c19951fe2) {
        int m65102f = m65102f(bArr, i, c19951fe2);
        int i2 = c19951fe2.f61917a;
        if (i2 == 0) {
            c19951fe2.f61919c = zzbb.zzfi;
            return m65102f;
        }
        c19951fe2.f61919c = zzbb.zzb(bArr, m65102f, i2);
        return m65102f + i2;
    }

    /* renamed from: n */
    public static float m65094n(byte[] bArr, int i) {
        return Float.intBitsToFloat(m65100h(bArr, i));
    }
}