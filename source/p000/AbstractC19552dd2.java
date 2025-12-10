package p000;

import com.google.android.gms.internal.clearcut.AbstractC6403k;
import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzci;
import com.google.android.gms.internal.clearcut.zzcn;
import com.google.android.gms.internal.clearcut.zzco;
import com.google.android.gms.internal.clearcut.zzey;
import com.google.common.base.Ascii;

/* renamed from: dd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC19552dd2 {
    /* renamed from: a */
    public static int m31839a(int i, byte[] bArr, int i2, int i3, zzcn zzcnVar, C20412id2 c20412id2) {
        C19561dg2 c19561dg2 = (C19561dg2) zzcnVar;
        int m31834f = m31834f(bArr, i2, c20412id2);
        while (true) {
            c19561dg2.m31800a(c20412id2.f62846a);
            if (m31834f >= i3) {
                break;
            }
            int m31834f2 = m31834f(bArr, m31834f, c20412id2);
            if (i != c20412id2.f62846a) {
                break;
            }
            m31834f = m31834f(bArr, m31834f2, c20412id2);
        }
        return m31834f;
    }

    /* renamed from: b */
    public static int m31838b(int i, byte[] bArr, int i2, int i3, zzey zzeyVar, C20412id2 c20412id2) {
        Object zzb;
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                zzeyVar.m48148d(i, Integer.valueOf(m31832h(bArr, i2)));
                                return i2 + 4;
                            }
                            throw zzco.zzbm();
                        }
                        zzey m48146f = zzey.m48146f();
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int m31834f = m31834f(bArr, i2, c20412id2);
                            int i7 = c20412id2.f62846a;
                            i6 = i7;
                            if (i7 != i5) {
                                int m31838b = m31838b(i6, bArr, m31834f, i3, m48146f, c20412id2);
                                i6 = i7;
                                i2 = m31838b;
                            } else {
                                i2 = m31834f;
                                break;
                            }
                        }
                        if (i2 <= i3 && i6 == i5) {
                            zzeyVar.m48148d(i, m48146f);
                            return i2;
                        }
                        throw zzco.zzbo();
                    }
                    int m31834f2 = m31834f(bArr, i2, c20412id2);
                    int i8 = c20412id2.f62846a;
                    if (i8 == 0) {
                        zzb = zzbb.zzfi;
                    } else {
                        zzb = zzbb.zzb(bArr, m31834f2, i8);
                    }
                    zzeyVar.m48148d(i, zzb);
                    return m31834f2 + i8;
                }
                zzeyVar.m48148d(i, Long.valueOf(m31829k(bArr, i2)));
                return i2 + 8;
            }
            int m31833g = m31833g(bArr, i2, c20412id2);
            zzeyVar.m48148d(i, Long.valueOf(c20412id2.f62847b));
            return m31833g;
        }
        throw zzco.zzbm();
    }

    /* renamed from: c */
    public static int m31837c(int i, byte[] bArr, int i2, int i3, C20412id2 c20412id2) {
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
                            i2 = m31834f(bArr, i2, c20412id2);
                            i6 = c20412id2.f62846a;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = m31837c(i6, bArr, i2, i3, c20412id2);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            return i2;
                        }
                        throw zzco.zzbo();
                    }
                    return m31834f(bArr, i2, c20412id2) + c20412id2.f62846a;
                }
                return i2 + 8;
            }
            return m31833g(bArr, i2, c20412id2);
        }
        throw zzco.zzbm();
    }

    /* renamed from: d */
    public static int m31836d(int i, byte[] bArr, int i2, C20412id2 c20412id2) {
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
                c20412id2.f62846a = i6 | (b2 << 14);
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
                    c20412id2.f62846a = i8 | (b4 << Ascii.f52686FS);
                    return i9;
                }
                int i10 = i8 | ((b4 & Byte.MAX_VALUE) << 28);
                while (true) {
                    int i11 = i9 + 1;
                    if (bArr[i9] >= 0) {
                        c20412id2.f62846a = i10;
                        return i11;
                    }
                    i9 = i11;
                }
            }
        }
        c20412id2.f62846a = i4 | i3;
        return i5;
    }

    /* renamed from: e */
    public static int m31835e(byte[] bArr, int i, zzcn zzcnVar, C20412id2 c20412id2) {
        C19561dg2 c19561dg2 = (C19561dg2) zzcnVar;
        int m31834f = m31834f(bArr, i, c20412id2);
        int i2 = c20412id2.f62846a + m31834f;
        while (m31834f < i2) {
            m31834f = m31834f(bArr, m31834f, c20412id2);
            c19561dg2.m31800a(c20412id2.f62846a);
        }
        if (m31834f == i2) {
            return m31834f;
        }
        throw zzco.zzbl();
    }

    /* renamed from: f */
    public static int m31834f(byte[] bArr, int i, C20412id2 c20412id2) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c20412id2.f62846a = b;
            return i2;
        }
        return m31836d(b, bArr, i2, c20412id2);
    }

    /* renamed from: g */
    public static int m31833g(byte[] bArr, int i, C20412id2 c20412id2) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c20412id2.f62847b = j;
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
        c20412id2.f62847b = j2;
        return i3;
    }

    /* renamed from: h */
    public static int m31832h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: i */
    public static int m31831i(byte[] bArr, int i, C20412id2 c20412id2) {
        int m31834f = m31834f(bArr, i, c20412id2);
        int i2 = c20412id2.f62846a;
        if (i2 == 0) {
            c20412id2.f62848c = "";
            return m31834f;
        }
        c20412id2.f62848c = new String(bArr, m31834f, i2, zzci.f45573a);
        return m31834f + i2;
    }

    /* renamed from: j */
    public static int m31830j(byte[] bArr, int i, C20412id2 c20412id2) {
        int m31834f = m31834f(bArr, i, c20412id2);
        int i2 = c20412id2.f62846a;
        if (i2 == 0) {
            c20412id2.f62848c = "";
            return m31834f;
        }
        int i3 = m31834f + i2;
        if (AbstractC6403k.m48222i(bArr, m31834f, i3)) {
            c20412id2.f62848c = new String(bArr, m31834f, i2, zzci.f45573a);
            return i3;
        }
        throw zzco.zzbp();
    }

    /* renamed from: k */
    public static long m31829k(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: l */
    public static double m31828l(byte[] bArr, int i) {
        return Double.longBitsToDouble(m31829k(bArr, i));
    }

    /* renamed from: m */
    public static int m31827m(byte[] bArr, int i, C20412id2 c20412id2) {
        int m31834f = m31834f(bArr, i, c20412id2);
        int i2 = c20412id2.f62846a;
        if (i2 == 0) {
            c20412id2.f62848c = zzbb.zzfi;
            return m31834f;
        }
        c20412id2.f62848c = zzbb.zzb(bArr, m31834f, i2);
        return m31834f + i2;
    }

    /* renamed from: n */
    public static float m31826n(byte[] bArr, int i) {
        return Float.intBitsToFloat(m31832h(bArr, i));
    }
}
