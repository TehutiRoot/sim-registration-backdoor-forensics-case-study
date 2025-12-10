package com.google.android.gms.internal.vision;

import com.google.common.base.Ascii;

/* renamed from: com.google.android.gms.internal.vision.w */
/* loaded from: classes3.dex */
public abstract class AbstractC6646w {
    /* renamed from: a */
    public static int m46590a(int i, byte[] bArr, int i2, int i3, zzjl zzjlVar, Nu2 nu2) {
        Oz2 oz2 = (Oz2) zzjlVar;
        int m46581j = m46581j(bArr, i2, nu2);
        oz2.m66936b(nu2.f4235a);
        while (m46581j < i3) {
            int m46581j2 = m46581j(bArr, m46581j, nu2);
            if (i != nu2.f4235a) {
                break;
            }
            m46581j = m46581j(bArr, m46581j2, nu2);
            oz2.m66936b(nu2.f4235a);
        }
        return m46581j;
    }

    /* renamed from: b */
    public static int m46589b(int i, byte[] bArr, int i2, int i3, zzlx zzlxVar, Nu2 nu2) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                zzlxVar.m46412b(i, Integer.valueOf(m46583h(bArr, i2)));
                                return i2 + 4;
                            }
                            throw zzjk.zzd();
                        }
                        zzlx m46408f = zzlx.m46408f();
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int m46581j = m46581j(bArr, i2, nu2);
                            int i7 = nu2.f4235a;
                            i6 = i7;
                            if (i7 != i5) {
                                int m46589b = m46589b(i6, bArr, m46581j, i3, m46408f, nu2);
                                i6 = i7;
                                i2 = m46589b;
                            } else {
                                i2 = m46581j;
                                break;
                            }
                        }
                        if (i2 <= i3 && i6 == i5) {
                            zzlxVar.m46412b(i, m46408f);
                            return i2;
                        }
                        throw zzjk.zzg();
                    }
                    int m46581j2 = m46581j(bArr, i2, nu2);
                    int i8 = nu2.f4235a;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - m46581j2) {
                            if (i8 == 0) {
                                zzlxVar.m46412b(i, zzht.zza);
                            } else {
                                zzlxVar.m46412b(i, zzht.zza(bArr, m46581j2, i8));
                            }
                            return m46581j2 + i8;
                        }
                        throw zzjk.zza();
                    }
                    throw zzjk.zzb();
                }
                zzlxVar.m46412b(i, Long.valueOf(m46579l(bArr, i2)));
                return i2 + 8;
            }
            int m46580k = m46580k(bArr, i2, nu2);
            zzlxVar.m46412b(i, Long.valueOf(nu2.f4236b));
            return m46580k;
        }
        throw zzjk.zzd();
    }

    /* renamed from: c */
    public static int m46588c(int i, byte[] bArr, int i2, int i3, Nu2 nu2) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw zzjk.zzd();
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = m46581j(bArr, i2, nu2);
                            i6 = nu2.f4235a;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = m46588c(i6, bArr, i2, i3, nu2);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            return i2;
                        }
                        throw zzjk.zzg();
                    }
                    return m46581j(bArr, i2, nu2) + nu2.f4235a;
                }
                return i2 + 8;
            }
            return m46580k(bArr, i2, nu2);
        }
        throw zzjk.zzd();
    }

    /* renamed from: d */
    public static int m46587d(int i, byte[] bArr, int i2, Nu2 nu2) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            nu2.f4235a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            nu2.f4235a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            nu2.f4235a = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            nu2.f4235a = i9 | (b4 << Ascii.f52686FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                nu2.f4235a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* renamed from: e */
    public static int m46586e(InterfaceC19835fE2 interfaceC19835fE2, int i, byte[] bArr, int i2, int i3, zzjl zzjlVar, Nu2 nu2) {
        int m46584g = m46584g(interfaceC19835fE2, bArr, i2, i3, nu2);
        zzjlVar.add(nu2.f4237c);
        while (m46584g < i3) {
            int m46581j = m46581j(bArr, m46584g, nu2);
            if (i != nu2.f4235a) {
                break;
            }
            m46584g = m46584g(interfaceC19835fE2, bArr, m46581j, i3, nu2);
            zzjlVar.add(nu2.f4237c);
        }
        return m46584g;
    }

    /* renamed from: f */
    public static int m46585f(InterfaceC19835fE2 interfaceC19835fE2, byte[] bArr, int i, int i2, int i3, Nu2 nu2) {
        C6616A c6616a = (C6616A) interfaceC19835fE2;
        Object zza = c6616a.zza();
        int m46630j = c6616a.m46630j(zza, bArr, i, i2, i3, nu2);
        c6616a.zzc(zza);
        nu2.f4237c = zza;
        return m46630j;
    }

    /* renamed from: g */
    public static int m46584g(InterfaceC19835fE2 interfaceC19835fE2, byte[] bArr, int i, int i2, Nu2 nu2) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m46587d(i4, bArr, i3, nu2);
            i4 = nu2.f4235a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object zza = interfaceC19835fE2.zza();
            int i6 = i4 + i5;
            interfaceC19835fE2.mo31331e(zza, bArr, i5, i6, nu2);
            interfaceC19835fE2.zzc(zza);
            nu2.f4237c = zza;
            return i6;
        }
        throw zzjk.zza();
    }

    /* renamed from: h */
    public static int m46583h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: i */
    public static int m46582i(byte[] bArr, int i, zzjl zzjlVar, Nu2 nu2) {
        Oz2 oz2 = (Oz2) zzjlVar;
        int m46581j = m46581j(bArr, i, nu2);
        int i2 = nu2.f4235a + m46581j;
        while (m46581j < i2) {
            m46581j = m46581j(bArr, m46581j, nu2);
            oz2.m66936b(nu2.f4235a);
        }
        if (m46581j == i2) {
            return m46581j;
        }
        throw zzjk.zza();
    }

    /* renamed from: j */
    public static int m46581j(byte[] bArr, int i, Nu2 nu2) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            nu2.f4235a = b;
            return i2;
        }
        return m46587d(b, bArr, i2, nu2);
    }

    /* renamed from: k */
    public static int m46580k(byte[] bArr, int i, Nu2 nu2) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            nu2.f4236b = j;
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
        nu2.f4236b = j2;
        return i3;
    }

    /* renamed from: l */
    public static long m46579l(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: m */
    public static double m46578m(byte[] bArr, int i) {
        return Double.longBitsToDouble(m46579l(bArr, i));
    }

    /* renamed from: n */
    public static int m46577n(byte[] bArr, int i, Nu2 nu2) {
        int m46581j = m46581j(bArr, i, nu2);
        int i2 = nu2.f4235a;
        if (i2 >= 0) {
            if (i2 == 0) {
                nu2.f4237c = "";
                return m46581j;
            }
            nu2.f4237c = new String(bArr, m46581j, i2, zzjf.f47644a);
            return m46581j + i2;
        }
        throw zzjk.zzb();
    }

    /* renamed from: o */
    public static float m46576o(byte[] bArr, int i) {
        return Float.intBitsToFloat(m46583h(bArr, i));
    }

    /* renamed from: p */
    public static int m46575p(byte[] bArr, int i, Nu2 nu2) {
        int m46581j = m46581j(bArr, i, nu2);
        int i2 = nu2.f4235a;
        if (i2 >= 0) {
            if (i2 == 0) {
                nu2.f4237c = "";
                return m46581j;
            }
            nu2.f4237c = AbstractC6621F.m46597k(bArr, m46581j, i2);
            return m46581j + i2;
        }
        throw zzjk.zzb();
    }

    /* renamed from: q */
    public static int m46574q(byte[] bArr, int i, Nu2 nu2) {
        int m46581j = m46581j(bArr, i, nu2);
        int i2 = nu2.f4235a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - m46581j) {
                if (i2 == 0) {
                    nu2.f4237c = zzht.zza;
                    return m46581j;
                }
                nu2.f4237c = zzht.zza(bArr, m46581j, i2);
                return m46581j + i2;
            }
            throw zzjk.zza();
        }
        throw zzjk.zzb();
    }
}
