package p000;

import com.google.android.gms.internal.measurement.AbstractC6534h;
import com.google.android.gms.internal.measurement.C6531e;
import com.google.android.gms.internal.measurement.zzjd;
import com.google.android.gms.internal.measurement.zzkl;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzko;
import com.google.android.gms.internal.measurement.zzmo;
import com.google.common.base.Ascii;

/* renamed from: qy2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21851qy2 {
    /* renamed from: a */
    public static int m23388a(byte[] bArr, int i, C20475iy2 c20475iy2) {
        int m23379j = m23379j(bArr, i, c20475iy2);
        int i2 = c20475iy2.f67133a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - m23379j) {
                if (i2 == 0) {
                    c20475iy2.f67135c = zzjd.zzb;
                    return m23379j;
                }
                c20475iy2.f67135c = zzjd.zzl(bArr, m23379j, i2);
                return m23379j + i2;
            }
            throw zzko.zzf();
        }
        throw zzko.zzd();
    }

    /* renamed from: b */
    public static int m23387b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: c */
    public static int m23386c(DF2 df2, byte[] bArr, int i, int i2, int i3, C20475iy2 c20475iy2) {
        C6531e c6531e = (C6531e) df2;
        Object zze = c6531e.zze();
        int m47364w = c6531e.m47364w(zze, bArr, i, i2, i3, c20475iy2);
        c6531e.zzf(zze);
        c20475iy2.f67135c = zze;
        return m47364w;
    }

    /* renamed from: d */
    public static int m23385d(DF2 df2, byte[] bArr, int i, int i2, C20475iy2 c20475iy2) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m23378k(i4, bArr, i3, c20475iy2);
            i4 = c20475iy2.f67133a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object zze = df2.zze();
            int i6 = i4 + i5;
            df2.mo47359b(zze, bArr, i5, i6, c20475iy2);
            df2.zzf(zze);
            c20475iy2.f67135c = zze;
            return i6;
        }
        throw zzko.zzf();
    }

    /* renamed from: e */
    public static int m23384e(DF2 df2, int i, byte[] bArr, int i2, int i3, zzkl zzklVar, C20475iy2 c20475iy2) {
        int m23385d = m23385d(df2, bArr, i2, i3, c20475iy2);
        zzklVar.add(c20475iy2.f67135c);
        while (m23385d < i3) {
            int m23379j = m23379j(bArr, m23385d, c20475iy2);
            if (i != c20475iy2.f67133a) {
                break;
            }
            m23385d = m23385d(df2, bArr, m23379j, i3, c20475iy2);
            zzklVar.add(c20475iy2.f67135c);
        }
        return m23385d;
    }

    /* renamed from: f */
    public static int m23383f(byte[] bArr, int i, zzkl zzklVar, C20475iy2 c20475iy2) {
        C21205nC2 c21205nC2 = (C21205nC2) zzklVar;
        int m23379j = m23379j(bArr, i, c20475iy2);
        int i2 = c20475iy2.f67133a + m23379j;
        while (m23379j < i2) {
            m23379j = m23379j(bArr, m23379j, c20475iy2);
            c21205nC2.zzh(c20475iy2.f67133a);
        }
        if (m23379j == i2) {
            return m23379j;
        }
        throw zzko.zzf();
    }

    /* renamed from: g */
    public static int m23382g(byte[] bArr, int i, C20475iy2 c20475iy2) {
        int m23379j = m23379j(bArr, i, c20475iy2);
        int i2 = c20475iy2.f67133a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c20475iy2.f67135c = "";
                return m23379j;
            }
            c20475iy2.f67135c = new String(bArr, m23379j, i2, zzkm.f46331b);
            return m23379j + i2;
        }
        throw zzko.zzd();
    }

    /* renamed from: h */
    public static int m23381h(byte[] bArr, int i, C20475iy2 c20475iy2) {
        int m23379j = m23379j(bArr, i, c20475iy2);
        int i2 = c20475iy2.f67133a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c20475iy2.f67135c = "";
                return m23379j;
            }
            c20475iy2.f67135c = AbstractC6534h.m47345d(bArr, m23379j, i2);
            return m23379j + i2;
        }
        throw zzko.zzd();
    }

    /* renamed from: i */
    public static int m23380i(int i, byte[] bArr, int i2, int i3, zzmo zzmoVar, C20475iy2 c20475iy2) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                zzmoVar.m47145d(i, Integer.valueOf(m23387b(bArr, i2)));
                                return i2 + 4;
                            }
                            throw zzko.zzb();
                        }
                        int i5 = (i & (-8)) | 4;
                        zzmo m47147b = zzmo.m47147b();
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int m23379j = m23379j(bArr, i2, c20475iy2);
                            int i7 = c20475iy2.f67133a;
                            if (i7 == i5) {
                                i6 = i7;
                                i2 = m23379j;
                                break;
                            }
                            i6 = i7;
                            i2 = m23380i(i7, bArr, m23379j, i3, m47147b, c20475iy2);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            zzmoVar.m47145d(i, m47147b);
                            return i2;
                        }
                        throw zzko.zze();
                    }
                    int m23379j2 = m23379j(bArr, i2, c20475iy2);
                    int i8 = c20475iy2.f67133a;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - m23379j2) {
                            if (i8 == 0) {
                                zzmoVar.m47145d(i, zzjd.zzb);
                            } else {
                                zzmoVar.m47145d(i, zzjd.zzl(bArr, m23379j2, i8));
                            }
                            return m23379j2 + i8;
                        }
                        throw zzko.zzf();
                    }
                    throw zzko.zzd();
                }
                zzmoVar.m47145d(i, Long.valueOf(m23375n(bArr, i2)));
                return i2 + 8;
            }
            int m23376m = m23376m(bArr, i2, c20475iy2);
            zzmoVar.m47145d(i, Long.valueOf(c20475iy2.f67134b));
            return m23376m;
        }
        throw zzko.zzb();
    }

    /* renamed from: j */
    public static int m23379j(byte[] bArr, int i, C20475iy2 c20475iy2) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c20475iy2.f67133a = b;
            return i2;
        }
        return m23378k(b, bArr, i2, c20475iy2);
    }

    /* renamed from: k */
    public static int m23378k(int i, byte[] bArr, int i2, C20475iy2 c20475iy2) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c20475iy2.f67133a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c20475iy2.f67133a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c20475iy2.f67133a = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c20475iy2.f67133a = i9 | (b4 << Ascii.f52686FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                c20475iy2.f67133a = i11;
                return i12;
            }
        }
    }

    /* renamed from: l */
    public static int m23377l(int i, byte[] bArr, int i2, int i3, zzkl zzklVar, C20475iy2 c20475iy2) {
        C21205nC2 c21205nC2 = (C21205nC2) zzklVar;
        int m23379j = m23379j(bArr, i2, c20475iy2);
        c21205nC2.zzh(c20475iy2.f67133a);
        while (m23379j < i3) {
            int m23379j2 = m23379j(bArr, m23379j, c20475iy2);
            if (i != c20475iy2.f67133a) {
                break;
            }
            m23379j = m23379j(bArr, m23379j2, c20475iy2);
            c21205nC2.zzh(c20475iy2.f67133a);
        }
        return m23379j;
    }

    /* renamed from: m */
    public static int m23376m(byte[] bArr, int i, C20475iy2 c20475iy2) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c20475iy2.f67134b = j;
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
        c20475iy2.f67134b = j2;
        return i3;
    }

    /* renamed from: n */
    public static long m23375n(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
