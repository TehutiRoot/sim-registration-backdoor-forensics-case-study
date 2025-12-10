package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC6576j;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C6570d;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzem;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz;
import com.google.common.base.Ascii;

/* renamed from: zg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC23345zg2 {
    /* renamed from: a */
    public static int m59a(byte[] bArr, int i, C22657vg2 c22657vg2) {
        int m50j = m50j(bArr, i, c22657vg2);
        int i2 = c22657vg2.f107746a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - m50j) {
                if (i2 == 0) {
                    c22657vg2.f107748c = zzdb.zzb;
                    return m50j;
                }
                c22657vg2.f107748c = zzdb.zzr(bArr, m50j, i2);
                return m50j + i2;
            }
            throw zzeo.zzg();
        }
        throw zzeo.zzd();
    }

    /* renamed from: b */
    public static int m58b(byte[] bArr, int i) {
        int i2 = (bArr[i + 1] & 255) << 8;
        return ((bArr[i + 3] & 255) << 24) | i2 | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: c */
    public static int m57c(Rq2 rq2, byte[] bArr, int i, int i2, int i3, C22657vg2 c22657vg2) {
        Object zze = rq2.zze();
        int m46n = m46n(zze, rq2, bArr, i, i2, i3, c22657vg2);
        rq2.zzf(zze);
        c22657vg2.f107748c = zze;
        return m46n;
    }

    /* renamed from: d */
    public static int m56d(Rq2 rq2, byte[] bArr, int i, int i2, C22657vg2 c22657vg2) {
        Object zze = rq2.zze();
        int m45o = m45o(zze, rq2, bArr, i, i2, c22657vg2);
        rq2.zzf(zze);
        c22657vg2.f107748c = zze;
        return m45o;
    }

    /* renamed from: e */
    public static int m55e(Rq2 rq2, int i, byte[] bArr, int i2, int i3, zzel zzelVar, C22657vg2 c22657vg2) {
        int m56d = m56d(rq2, bArr, i2, i3, c22657vg2);
        zzelVar.add(c22657vg2.f107748c);
        while (m56d < i3) {
            int m50j = m50j(bArr, m56d, c22657vg2);
            if (i != c22657vg2.f107746a) {
                break;
            }
            m56d = m56d(rq2, bArr, m50j, i3, c22657vg2);
            zzelVar.add(c22657vg2.f107748c);
        }
        return m56d;
    }

    /* renamed from: f */
    public static int m54f(byte[] bArr, int i, zzel zzelVar, C22657vg2 c22657vg2) {
        C18125Nk2 c18125Nk2 = (C18125Nk2) zzelVar;
        int m50j = m50j(bArr, i, c22657vg2);
        int i2 = c22657vg2.f107746a + m50j;
        while (m50j < i2) {
            m50j = m50j(bArr, m50j, c22657vg2);
            c18125Nk2.m67177c(c22657vg2.f107746a);
        }
        if (m50j == i2) {
            return m50j;
        }
        throw zzeo.zzg();
    }

    /* renamed from: g */
    public static int m53g(byte[] bArr, int i, C22657vg2 c22657vg2) {
        int m50j = m50j(bArr, i, c22657vg2);
        int i2 = c22657vg2.f107746a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c22657vg2.f107748c = "";
                return m50j;
            }
            c22657vg2.f107748c = new String(bArr, m50j, i2, zzem.f46970b);
            return m50j + i2;
        }
        throw zzeo.zzd();
    }

    /* renamed from: h */
    public static int m52h(byte[] bArr, int i, C22657vg2 c22657vg2) {
        int m50j = m50j(bArr, i, c22657vg2);
        int i2 = c22657vg2.f107746a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c22657vg2.f107748c = "";
                return m50j;
            }
            int length = bArr.length;
            AbstractC22355tu2 abstractC22355tu2 = AbstractC6576j.f46872a;
            if ((m50j | i2 | ((length - m50j) - i2)) >= 0) {
                int i3 = m50j + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (m50j < i3) {
                    byte b = bArr[m50j];
                    if (!AbstractC21151mu2.m26178d(b)) {
                        break;
                    }
                    m50j++;
                    cArr[i4] = (char) b;
                    i4++;
                }
                int i5 = i4;
                while (m50j < i3) {
                    int i6 = m50j + 1;
                    byte b2 = bArr[m50j];
                    if (AbstractC21151mu2.m26178d(b2)) {
                        cArr[i5] = (char) b2;
                        i5++;
                        m50j = i6;
                        while (m50j < i3) {
                            byte b3 = bArr[m50j];
                            if (AbstractC21151mu2.m26178d(b3)) {
                                m50j++;
                                cArr[i5] = (char) b3;
                                i5++;
                            }
                        }
                    } else if (b2 < -32) {
                        if (i6 < i3) {
                            m50j += 2;
                            AbstractC21151mu2.m26179c(b2, bArr[i6], cArr, i5);
                            i5++;
                        } else {
                            throw zzeo.zzc();
                        }
                    } else if (b2 < -16) {
                        if (i6 < i3 - 1) {
                            int i7 = m50j + 2;
                            m50j += 3;
                            AbstractC21151mu2.m26180b(b2, bArr[i6], bArr[i7], cArr, i5);
                            i5++;
                        } else {
                            throw zzeo.zzc();
                        }
                    } else if (i6 < i3 - 2) {
                        byte b4 = bArr[i6];
                        int i8 = m50j + 3;
                        m50j += 4;
                        AbstractC21151mu2.m26181a(b2, b4, bArr[m50j + 2], bArr[i8], cArr, i5);
                        i5 += 2;
                    } else {
                        throw zzeo.zzc();
                    }
                }
                c22657vg2.f107748c = new String(cArr, 0, i5);
                return i3;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(m50j), Integer.valueOf(i2)));
        }
        throw zzeo.zzd();
    }

    /* renamed from: i */
    public static int m51i(int i, byte[] bArr, int i2, int i3, zzgz zzgzVar, C22657vg2 c22657vg2) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                zzgzVar.m46862f(i, Integer.valueOf(m58b(bArr, i2)));
                                return i2 + 4;
                            }
                            throw zzeo.zzb();
                        }
                        int i5 = (i & (-8)) | 4;
                        zzgz m46865c = zzgz.m46865c();
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int m50j = m50j(bArr, i2, c22657vg2);
                            int i7 = c22657vg2.f107746a;
                            i6 = i7;
                            if (i7 != i5) {
                                int m51i = m51i(i6, bArr, m50j, i3, m46865c, c22657vg2);
                                i6 = i7;
                                i2 = m51i;
                            } else {
                                i2 = m50j;
                                break;
                            }
                        }
                        if (i2 <= i3 && i6 == i5) {
                            zzgzVar.m46862f(i, m46865c);
                            return i2;
                        }
                        throw zzeo.zze();
                    }
                    int m50j2 = m50j(bArr, i2, c22657vg2);
                    int i8 = c22657vg2.f107746a;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - m50j2) {
                            if (i8 == 0) {
                                zzgzVar.m46862f(i, zzdb.zzb);
                            } else {
                                zzgzVar.m46862f(i, zzdb.zzr(bArr, m50j2, i8));
                            }
                            return m50j2 + i8;
                        }
                        throw zzeo.zzg();
                    }
                    throw zzeo.zzd();
                }
                zzgzVar.m46862f(i, Long.valueOf(m43q(bArr, i2)));
                return i2 + 8;
            }
            int m47m = m47m(bArr, i2, c22657vg2);
            zzgzVar.m46862f(i, Long.valueOf(c22657vg2.f107747b));
            return m47m;
        }
        throw zzeo.zzb();
    }

    /* renamed from: j */
    public static int m50j(byte[] bArr, int i, C22657vg2 c22657vg2) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c22657vg2.f107746a = b;
            return i2;
        }
        return m49k(b, bArr, i2, c22657vg2);
    }

    /* renamed from: k */
    public static int m49k(int i, byte[] bArr, int i2, C22657vg2 c22657vg2) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            c22657vg2.f107746a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            c22657vg2.f107746a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c22657vg2.f107746a = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c22657vg2.f107746a = i9 | (b4 << Ascii.f52686FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                c22657vg2.f107746a = i11;
                return i12;
            }
        }
    }

    /* renamed from: l */
    public static int m48l(int i, byte[] bArr, int i2, int i3, zzel zzelVar, C22657vg2 c22657vg2) {
        C18125Nk2 c18125Nk2 = (C18125Nk2) zzelVar;
        int m50j = m50j(bArr, i2, c22657vg2);
        c18125Nk2.m67177c(c22657vg2.f107746a);
        while (m50j < i3) {
            int m50j2 = m50j(bArr, m50j, c22657vg2);
            if (i != c22657vg2.f107746a) {
                break;
            }
            m50j = m50j(bArr, m50j2, c22657vg2);
            c18125Nk2.m67177c(c22657vg2.f107746a);
        }
        return m50j;
    }

    /* renamed from: m */
    public static int m47m(byte[] bArr, int i, C22657vg2 c22657vg2) {
        byte b;
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            c22657vg2.f107747b = j;
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
        c22657vg2.f107747b = j2;
        return i3;
    }

    /* renamed from: n */
    public static int m46n(Object obj, Rq2 rq2, byte[] bArr, int i, int i2, int i3, C22657vg2 c22657vg2) {
        int m46924y = ((C6570d) rq2).m46924y(obj, bArr, i, i2, i3, c22657vg2);
        c22657vg2.f107748c = obj;
        return m46924y;
    }

    /* renamed from: o */
    public static int m45o(Object obj, Rq2 rq2, byte[] bArr, int i, int i2, C22657vg2 c22657vg2) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m49k(i4, bArr, i3, c22657vg2);
            i4 = c22657vg2.f107746a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            int i6 = i4 + i5;
            rq2.mo46922a(obj, bArr, i5, i6, c22657vg2);
            c22657vg2.f107748c = obj;
            return i6;
        }
        throw zzeo.zzg();
    }

    /* renamed from: p */
    public static int m44p(int i, byte[] bArr, int i2, int i3, C22657vg2 c22657vg2) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw zzeo.zzb();
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = m50j(bArr, i2, c22657vg2);
                            i6 = c22657vg2.f107746a;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = m44p(i6, bArr, i2, i3, c22657vg2);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            return i2;
                        }
                        throw zzeo.zze();
                    }
                    return m50j(bArr, i2, c22657vg2) + c22657vg2.f107746a;
                }
                return i2 + 8;
            }
            return m47m(bArr, i2, c22657vg2);
        }
        throw zzeo.zzb();
    }

    /* renamed from: q */
    public static long m43q(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}
