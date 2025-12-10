package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC6565j;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C6559d;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzem;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz;
import com.google.common.base.Ascii;

/* renamed from: wh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC22901wh2 {
    /* renamed from: a */
    public static int m681a(byte[] bArr, int i, C22209sh2 c22209sh2) {
        int m672j = m672j(bArr, i, c22209sh2);
        int i2 = c22209sh2.f79957a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - m672j) {
                if (i2 == 0) {
                    c22209sh2.f79959c = zzdb.zzb;
                    return m672j;
                }
                c22209sh2.f79959c = zzdb.zzr(bArr, m672j, i2);
                return m672j + i2;
            }
            throw zzeo.zzg();
        }
        throw zzeo.zzd();
    }

    /* renamed from: b */
    public static int m680b(byte[] bArr, int i) {
        int i2 = (bArr[i + 1] & 255) << 8;
        return ((bArr[i + 3] & 255) << 24) | i2 | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: c */
    public static int m679c(Or2 or2, byte[] bArr, int i, int i2, int i3, C22209sh2 c22209sh2) {
        Object zze = or2.zze();
        int m668n = m668n(zze, or2, bArr, i, i2, i3, c22209sh2);
        or2.zzf(zze);
        c22209sh2.f79959c = zze;
        return m668n;
    }

    /* renamed from: d */
    public static int m678d(Or2 or2, byte[] bArr, int i, int i2, C22209sh2 c22209sh2) {
        Object zze = or2.zze();
        int m667o = m667o(zze, or2, bArr, i, i2, c22209sh2);
        or2.zzf(zze);
        c22209sh2.f79959c = zze;
        return m667o;
    }

    /* renamed from: e */
    public static int m677e(Or2 or2, int i, byte[] bArr, int i2, int i3, zzel zzelVar, C22209sh2 c22209sh2) {
        int m678d = m678d(or2, bArr, i2, i3, c22209sh2);
        zzelVar.add(c22209sh2.f79959c);
        while (m678d < i3) {
            int m672j = m672j(bArr, m678d, c22209sh2);
            if (i != c22209sh2.f79957a) {
                break;
            }
            m678d = m678d(or2, bArr, m672j, i3, c22209sh2);
            zzelVar.add(c22209sh2.f79959c);
        }
        return m678d;
    }

    /* renamed from: f */
    public static int m676f(byte[] bArr, int i, zzel zzelVar, C22209sh2 c22209sh2) {
        C17969Kl2 c17969Kl2 = (C17969Kl2) zzelVar;
        int m672j = m672j(bArr, i, c22209sh2);
        int i2 = c22209sh2.f79957a + m672j;
        while (m672j < i2) {
            m672j = m672j(bArr, m672j, c22209sh2);
            c17969Kl2.m67671c(c22209sh2.f79957a);
        }
        if (m672j == i2) {
            return m672j;
        }
        throw zzeo.zzg();
    }

    /* renamed from: g */
    public static int m675g(byte[] bArr, int i, C22209sh2 c22209sh2) {
        int m672j = m672j(bArr, i, c22209sh2);
        int i2 = c22209sh2.f79957a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c22209sh2.f79959c = "";
                return m672j;
            }
            c22209sh2.f79959c = new String(bArr, m672j, i2, zzem.f46982b);
            return m672j + i2;
        }
        throw zzeo.zzd();
    }

    /* renamed from: h */
    public static int m674h(byte[] bArr, int i, C22209sh2 c22209sh2) {
        int m672j = m672j(bArr, i, c22209sh2);
        int i2 = c22209sh2.f79957a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c22209sh2.f79959c = "";
                return m672j;
            }
            int length = bArr.length;
            AbstractC21905qv2 abstractC21905qv2 = AbstractC6565j.f46884a;
            if ((m672j | i2 | ((length - m672j) - i2)) >= 0) {
                int i3 = m672j + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (m672j < i3) {
                    byte b = bArr[m672j];
                    if (!AbstractC20694jv2.m29292d(b)) {
                        break;
                    }
                    m672j++;
                    cArr[i4] = (char) b;
                    i4++;
                }
                int i5 = i4;
                while (m672j < i3) {
                    int i6 = m672j + 1;
                    byte b2 = bArr[m672j];
                    if (AbstractC20694jv2.m29292d(b2)) {
                        cArr[i5] = (char) b2;
                        i5++;
                        m672j = i6;
                        while (m672j < i3) {
                            byte b3 = bArr[m672j];
                            if (AbstractC20694jv2.m29292d(b3)) {
                                m672j++;
                                cArr[i5] = (char) b3;
                                i5++;
                            }
                        }
                    } else if (b2 < -32) {
                        if (i6 < i3) {
                            m672j += 2;
                            AbstractC20694jv2.m29293c(b2, bArr[i6], cArr, i5);
                            i5++;
                        } else {
                            throw zzeo.zzc();
                        }
                    } else if (b2 < -16) {
                        if (i6 < i3 - 1) {
                            int i7 = m672j + 2;
                            m672j += 3;
                            AbstractC20694jv2.m29294b(b2, bArr[i6], bArr[i7], cArr, i5);
                            i5++;
                        } else {
                            throw zzeo.zzc();
                        }
                    } else if (i6 < i3 - 2) {
                        byte b4 = bArr[i6];
                        int i8 = m672j + 3;
                        m672j += 4;
                        AbstractC20694jv2.m29295a(b2, b4, bArr[m672j + 2], bArr[i8], cArr, i5);
                        i5 += 2;
                    } else {
                        throw zzeo.zzc();
                    }
                }
                c22209sh2.f79959c = new String(cArr, 0, i5);
                return i3;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(m672j), Integer.valueOf(i2)));
        }
        throw zzeo.zzd();
    }

    /* renamed from: i */
    public static int m673i(int i, byte[] bArr, int i2, int i3, zzgz zzgzVar, C22209sh2 c22209sh2) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                zzgzVar.m46854f(i, Integer.valueOf(m680b(bArr, i2)));
                                return i2 + 4;
                            }
                            throw zzeo.zzb();
                        }
                        int i5 = (i & (-8)) | 4;
                        zzgz m46857c = zzgz.m46857c();
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int m672j = m672j(bArr, i2, c22209sh2);
                            int i7 = c22209sh2.f79957a;
                            i6 = i7;
                            if (i7 != i5) {
                                int m673i = m673i(i6, bArr, m672j, i3, m46857c, c22209sh2);
                                i6 = i7;
                                i2 = m673i;
                            } else {
                                i2 = m672j;
                                break;
                            }
                        }
                        if (i2 <= i3 && i6 == i5) {
                            zzgzVar.m46854f(i, m46857c);
                            return i2;
                        }
                        throw zzeo.zze();
                    }
                    int m672j2 = m672j(bArr, i2, c22209sh2);
                    int i8 = c22209sh2.f79957a;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - m672j2) {
                            if (i8 == 0) {
                                zzgzVar.m46854f(i, zzdb.zzb);
                            } else {
                                zzgzVar.m46854f(i, zzdb.zzr(bArr, m672j2, i8));
                            }
                            return m672j2 + i8;
                        }
                        throw zzeo.zzg();
                    }
                    throw zzeo.zzd();
                }
                zzgzVar.m46854f(i, Long.valueOf(m665q(bArr, i2)));
                return i2 + 8;
            }
            int m669m = m669m(bArr, i2, c22209sh2);
            zzgzVar.m46854f(i, Long.valueOf(c22209sh2.f79958b));
            return m669m;
        }
        throw zzeo.zzb();
    }

    /* renamed from: j */
    public static int m672j(byte[] bArr, int i, C22209sh2 c22209sh2) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c22209sh2.f79957a = b;
            return i2;
        }
        return m671k(b, bArr, i2, c22209sh2);
    }

    /* renamed from: k */
    public static int m671k(int i, byte[] bArr, int i2, C22209sh2 c22209sh2) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            c22209sh2.f79957a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            c22209sh2.f79957a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c22209sh2.f79957a = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c22209sh2.f79957a = i9 | (b4 << Ascii.f52698FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                c22209sh2.f79957a = i11;
                return i12;
            }
        }
    }

    /* renamed from: l */
    public static int m670l(int i, byte[] bArr, int i2, int i3, zzel zzelVar, C22209sh2 c22209sh2) {
        C17969Kl2 c17969Kl2 = (C17969Kl2) zzelVar;
        int m672j = m672j(bArr, i2, c22209sh2);
        c17969Kl2.m67671c(c22209sh2.f79957a);
        while (m672j < i3) {
            int m672j2 = m672j(bArr, m672j, c22209sh2);
            if (i != c22209sh2.f79957a) {
                break;
            }
            m672j = m672j(bArr, m672j2, c22209sh2);
            c17969Kl2.m67671c(c22209sh2.f79957a);
        }
        return m672j;
    }

    /* renamed from: m */
    public static int m669m(byte[] bArr, int i, C22209sh2 c22209sh2) {
        byte b;
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            c22209sh2.f79958b = j;
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
        c22209sh2.f79958b = j2;
        return i3;
    }

    /* renamed from: n */
    public static int m668n(Object obj, Or2 or2, byte[] bArr, int i, int i2, int i3, C22209sh2 c22209sh2) {
        int m46916y = ((C6559d) or2).m46916y(obj, bArr, i, i2, i3, c22209sh2);
        c22209sh2.f79959c = obj;
        return m46916y;
    }

    /* renamed from: o */
    public static int m667o(Object obj, Or2 or2, byte[] bArr, int i, int i2, C22209sh2 c22209sh2) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m671k(i4, bArr, i3, c22209sh2);
            i4 = c22209sh2.f79957a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            int i6 = i4 + i5;
            or2.mo46914a(obj, bArr, i5, i6, c22209sh2);
            c22209sh2.f79959c = obj;
            return i6;
        }
        throw zzeo.zzg();
    }

    /* renamed from: p */
    public static int m666p(int i, byte[] bArr, int i2, int i3, C22209sh2 c22209sh2) {
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
                            i2 = m672j(bArr, i2, c22209sh2);
                            i6 = c22209sh2.f79957a;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = m666p(i6, bArr, i2, i3, c22209sh2);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            return i2;
                        }
                        throw zzeo.zze();
                    }
                    return m672j(bArr, i2, c22209sh2) + c22209sh2.f79957a;
                }
                return i2 + 8;
            }
            return m669m(bArr, i2, c22209sh2);
        }
        throw zzeo.zzb();
    }

    /* renamed from: q */
    public static long m665q(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}