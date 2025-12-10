package com.google.android.gms.internal.vision;

import com.feitian.readerdk.Tool.C6139DK;

/* renamed from: com.google.android.gms.internal.vision.H */
/* loaded from: classes3.dex */
public final class C6612H extends AbstractC22317tH2 {
    /* renamed from: e */
    public static int m46580e(byte[] bArr, int i, long j, int i2) {
        int m46586h;
        int m46585i;
        int m46584j;
        if (i2 == 0) {
            m46586h = AbstractC6610F.m46586h(i);
            return m46586h;
        } else if (i2 == 1) {
            m46585i = AbstractC6610F.m46585i(i, AbstractC19549dH2.m31891a(bArr, j));
            return m46585i;
        } else if (i2 == 2) {
            m46584j = AbstractC6610F.m46584j(i, AbstractC19549dH2.m31891a(bArr, j), AbstractC19549dH2.m31891a(bArr, j + 1));
            return m46584j;
        } else {
            throw new AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bb, code lost:
        return -1;
     */
    @Override // p000.AbstractC22317tH2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo22712a(int r18, byte[] r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C6612H.mo22712a(int, byte[], int, int):int");
    }

    @Override // p000.AbstractC22317tH2
    /* renamed from: b */
    public final int mo22711b(CharSequence charSequence, byte[] bArr, int i, int i2) {
        long j;
        String str;
        String str2;
        int i3;
        long j2;
        long j3;
        char charAt;
        long j4 = i;
        long j5 = i2 + j4;
        int length = charSequence.length();
        String str3 = " at index ";
        String str4 = "Failed writing ";
        if (length <= i2 && bArr.length - i2 >= i) {
            int i4 = 0;
            while (true) {
                j = 1;
                if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                AbstractC19549dH2.m31880l(bArr, j4, (byte) charAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char charAt2 = charSequence.charAt(i4);
                if (charAt2 < 128 && j4 < j5) {
                    AbstractC19549dH2.m31880l(bArr, j4, (byte) charAt2);
                    j3 = j5;
                    str2 = str4;
                    j2 = j;
                    j4 += j;
                    str = str3;
                } else {
                    if (charAt2 < 2048 && j4 <= j5 - 2) {
                        str = str3;
                        str2 = str4;
                        long j6 = j4 + j;
                        AbstractC19549dH2.m31880l(bArr, j4, (byte) ((charAt2 >>> 6) | 960));
                        j4 += 2;
                        AbstractC19549dH2.m31880l(bArr, j6, (byte) ((charAt2 & '?') | 128));
                    } else {
                        str = str3;
                        str2 = str4;
                        if ((charAt2 < 55296 || 57343 < charAt2) && j4 <= j5 - 3) {
                            AbstractC19549dH2.m31880l(bArr, j4, (byte) ((charAt2 >>> '\f') | 480));
                            long j7 = j4 + 2;
                            AbstractC19549dH2.m31880l(bArr, j4 + 1, (byte) (((charAt2 >>> 6) & 63) | 128));
                            j4 += 3;
                            AbstractC19549dH2.m31880l(bArr, j7, (byte) ((charAt2 & '?') | 128));
                        } else if (j4 <= j5 - 4) {
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char charAt3 = charSequence.charAt(i5);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    j2 = 1;
                                    AbstractC19549dH2.m31880l(bArr, j4, (byte) ((codePoint >>> 18) | C6139DK.ERROR_RECEIVE_LRC));
                                    j3 = j5;
                                    AbstractC19549dH2.m31880l(bArr, j4 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j8 = j4 + 3;
                                    AbstractC19549dH2.m31880l(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j4 += 4;
                                    AbstractC19549dH2.m31880l(bArr, j8, (byte) ((codePoint & 63) | 128));
                                    i4 = i5;
                                } else {
                                    i4 = i5;
                                }
                            }
                            throw new zzmg(i4 - 1, length);
                        } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                            throw new zzmg(i4, length);
                        } else {
                            StringBuilder sb = new StringBuilder(46);
                            sb.append(str2);
                            sb.append(charAt2);
                            sb.append(str);
                            sb.append(j4);
                            throw new ArrayIndexOutOfBoundsException(sb.toString());
                        }
                    }
                    j3 = j5;
                    j2 = 1;
                }
                i4++;
                str3 = str;
                str4 = str2;
                j = j2;
                j5 = j3;
            }
            return (int) j4;
        }
        char charAt4 = charSequence.charAt(length - 1);
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("Failed writing ");
        sb2.append(charAt4);
        sb2.append(" at index ");
        sb2.append(i + i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
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
                byte m31891a = AbstractC19549dH2.m31891a(bArr, i);
                m572l3 = AbstractC23009xH2.m572l(m31891a);
                if (!m572l3) {
                    break;
                }
                i++;
                AbstractC23009xH2.m575i(m31891a, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte m31891a2 = AbstractC19549dH2.m31891a(bArr, i);
                m572l = AbstractC23009xH2.m572l(m31891a2);
                if (!m572l) {
                    m571m = AbstractC23009xH2.m571m(m31891a2);
                    if (!m571m) {
                        m570n = AbstractC23009xH2.m570n(m31891a2);
                        if (m570n) {
                            if (i6 < i3 - 1) {
                                int i7 = i + 2;
                                i += 3;
                                AbstractC23009xH2.m577g(m31891a2, AbstractC19549dH2.m31891a(bArr, i6), AbstractC19549dH2.m31891a(bArr, i7), cArr, i5);
                                i5++;
                            } else {
                                throw zzjk.zzh();
                            }
                        } else if (i6 < i3 - 2) {
                            int i8 = i + 3;
                            i += 4;
                            AbstractC23009xH2.m578f(m31891a2, AbstractC19549dH2.m31891a(bArr, i6), AbstractC19549dH2.m31891a(bArr, i + 2), AbstractC19549dH2.m31891a(bArr, i8), cArr, i5);
                            i5 += 2;
                        } else {
                            throw zzjk.zzh();
                        }
                    } else if (i6 < i3) {
                        i += 2;
                        AbstractC23009xH2.m576h(m31891a2, AbstractC19549dH2.m31891a(bArr, i6), cArr, i5);
                        i5++;
                    } else {
                        throw zzjk.zzh();
                    }
                } else {
                    int i9 = i5 + 1;
                    AbstractC23009xH2.m575i(m31891a2, cArr, i5);
                    while (i6 < i3) {
                        byte m31891a3 = AbstractC19549dH2.m31891a(bArr, i6);
                        m572l2 = AbstractC23009xH2.m572l(m31891a3);
                        if (!m572l2) {
                            break;
                        }
                        i6++;
                        AbstractC23009xH2.m575i(m31891a3, cArr, i9);
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