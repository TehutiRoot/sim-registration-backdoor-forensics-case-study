package com.google.android.gms.internal.vision;

import com.google.common.base.Ascii;

/* renamed from: com.google.android.gms.internal.vision.G */
/* loaded from: classes3.dex */
public final class C6611G extends AbstractC22317tH2 {
    @Override // p000.AbstractC22317tH2
    /* renamed from: a */
    public final int mo22712a(int i, byte[] bArr, int i2, int i3) {
        int m46581m;
        int m46581m2;
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b < 0) {
                if (b < -32) {
                    if (i4 >= i3) {
                        return b;
                    }
                    if (b >= -62) {
                        i2 += 2;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                } else if (b < -16) {
                    if (i4 >= i3 - 1) {
                        m46581m = AbstractC6610F.m46581m(bArr, i4, i3);
                        return m46581m;
                    }
                    int i5 = i2 + 2;
                    byte b2 = bArr[i4];
                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                        i2 += 3;
                        if (bArr[i5] > -65) {
                        }
                    }
                    return -1;
                } else if (i4 >= i3 - 2) {
                    m46581m2 = AbstractC6610F.m46581m(bArr, i4, i3);
                    return m46581m2;
                } else {
                    int i6 = i2 + 2;
                    byte b3 = bArr[i4];
                    if (b3 <= -65 && (((b << Ascii.f52698FS) + (b3 + 112)) >> 30) == 0) {
                        int i7 = i2 + 3;
                        if (bArr[i6] <= -65) {
                            i2 += 4;
                            if (bArr[i7] > -65) {
                            }
                        }
                    }
                    return -1;
                }
            }
            i2 = i4;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        return r10 + r0;
     */
    @Override // p000.AbstractC22317tH2
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo22711b(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C6611G.mo22711b(java.lang.CharSequence, byte[], int, int):int");
    }

    @Override // p000.AbstractC22317tH2
    /* renamed from: d */
    public final String mo22709d(byte[] bArr, int i, int i2) {
        boolean m572l;
        boolean m572l2;
        boolean m571m;
        boolean m570n;
        boolean m572l3;
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                m572l3 = AbstractC23009xH2.m572l(b);
                if (!m572l3) {
                    break;
                }
                i++;
                AbstractC23009xH2.m575i(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                m572l = AbstractC23009xH2.m572l(b2);
                if (!m572l) {
                    m571m = AbstractC23009xH2.m571m(b2);
                    if (!m571m) {
                        m570n = AbstractC23009xH2.m570n(b2);
                        if (m570n) {
                            if (i6 < i3 - 1) {
                                int i7 = i + 2;
                                i += 3;
                                AbstractC23009xH2.m577g(b2, bArr[i6], bArr[i7], cArr, i5);
                                i5++;
                            } else {
                                throw zzjk.zzh();
                            }
                        } else if (i6 < i3 - 2) {
                            byte b3 = bArr[i6];
                            int i8 = i + 3;
                            i += 4;
                            AbstractC23009xH2.m578f(b2, b3, bArr[i + 2], bArr[i8], cArr, i5);
                            i5 += 2;
                        } else {
                            throw zzjk.zzh();
                        }
                    } else if (i6 < i3) {
                        i += 2;
                        AbstractC23009xH2.m576h(b2, bArr[i6], cArr, i5);
                        i5++;
                    } else {
                        throw zzjk.zzh();
                    }
                } else {
                    int i9 = i5 + 1;
                    AbstractC23009xH2.m575i(b2, cArr, i5);
                    while (i6 < i3) {
                        byte b4 = bArr[i6];
                        m572l2 = AbstractC23009xH2.m572l(b4);
                        if (!m572l2) {
                            break;
                        }
                        i6++;
                        AbstractC23009xH2.m575i(b4, cArr, i9);
                        i9++;
                    }
                    i5 = i9;
                    i = i6;
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
    }
}