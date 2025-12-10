package com.google.android.gms.internal.vision;

import com.feitian.readerdk.Tool.C6150DK;

/* renamed from: com.google.android.gms.internal.vision.H */
/* loaded from: classes3.dex */
public final class C6623H extends AbstractC22765wG2 {
    /* renamed from: e */
    public static int m46594e(byte[] bArr, int i, long j, int i2) {
        int m46600h;
        int m46599i;
        int m46598j;
        if (i2 == 0) {
            m46600h = AbstractC6621F.m46600h(i);
            return m46600h;
        } else if (i2 == 1) {
            m46599i = AbstractC6621F.m46599i(i, AbstractC20013gG2.m31196a(bArr, j));
            return m46599i;
        } else if (i2 == 2) {
            m46598j = AbstractC6621F.m46598j(i, AbstractC20013gG2.m31196a(bArr, j), AbstractC20013gG2.m31196a(bArr, j + 1));
            return m46598j;
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
    @Override // p000.AbstractC22765wG2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo880a(int r18, byte[] r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C6623H.mo880a(int, byte[], int, int):int");
    }

    @Override // p000.AbstractC22765wG2
    /* renamed from: b */
    public final int mo879b(CharSequence charSequence, byte[] bArr, int i, int i2) {
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
                AbstractC20013gG2.m31185l(bArr, j4, (byte) charAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char charAt2 = charSequence.charAt(i4);
                if (charAt2 < 128 && j4 < j5) {
                    AbstractC20013gG2.m31185l(bArr, j4, (byte) charAt2);
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
                        AbstractC20013gG2.m31185l(bArr, j4, (byte) ((charAt2 >>> 6) | 960));
                        j4 += 2;
                        AbstractC20013gG2.m31185l(bArr, j6, (byte) ((charAt2 & '?') | 128));
                    } else {
                        str = str3;
                        str2 = str4;
                        if ((charAt2 < 55296 || 57343 < charAt2) && j4 <= j5 - 3) {
                            AbstractC20013gG2.m31185l(bArr, j4, (byte) ((charAt2 >>> '\f') | 480));
                            long j7 = j4 + 2;
                            AbstractC20013gG2.m31185l(bArr, j4 + 1, (byte) (((charAt2 >>> 6) & 63) | 128));
                            j4 += 3;
                            AbstractC20013gG2.m31185l(bArr, j7, (byte) ((charAt2 & '?') | 128));
                        } else if (j4 <= j5 - 4) {
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char charAt3 = charSequence.charAt(i5);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    j2 = 1;
                                    AbstractC20013gG2.m31185l(bArr, j4, (byte) ((codePoint >>> 18) | C6150DK.ERROR_RECEIVE_LRC));
                                    j3 = j5;
                                    AbstractC20013gG2.m31185l(bArr, j4 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j8 = j4 + 3;
                                    AbstractC20013gG2.m31185l(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j4 += 4;
                                    AbstractC20013gG2.m31185l(bArr, j8, (byte) ((codePoint & 63) | 128));
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

    @Override // p000.AbstractC22765wG2
    /* renamed from: d */
    public final String mo877d(byte[] bArr, int i, int i2) {
        boolean m69110l;
        boolean m69110l2;
        boolean m69109m;
        boolean m69108n;
        boolean m69110l3;
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte m31196a = AbstractC20013gG2.m31196a(bArr, i);
                m69110l3 = AG2.m69110l(m31196a);
                if (!m69110l3) {
                    break;
                }
                i++;
                AG2.m69113i(m31196a, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte m31196a2 = AbstractC20013gG2.m31196a(bArr, i);
                m69110l = AG2.m69110l(m31196a2);
                if (!m69110l) {
                    m69109m = AG2.m69109m(m31196a2);
                    if (!m69109m) {
                        m69108n = AG2.m69108n(m31196a2);
                        if (m69108n) {
                            if (i6 < i3 - 1) {
                                int i7 = i + 2;
                                i += 3;
                                AG2.m69115g(m31196a2, AbstractC20013gG2.m31196a(bArr, i6), AbstractC20013gG2.m31196a(bArr, i7), cArr, i5);
                                i5++;
                            } else {
                                throw zzjk.zzh();
                            }
                        } else if (i6 < i3 - 2) {
                            int i8 = i + 3;
                            i += 4;
                            AG2.m69116f(m31196a2, AbstractC20013gG2.m31196a(bArr, i6), AbstractC20013gG2.m31196a(bArr, i + 2), AbstractC20013gG2.m31196a(bArr, i8), cArr, i5);
                            i5 += 2;
                        } else {
                            throw zzjk.zzh();
                        }
                    } else if (i6 < i3) {
                        i += 2;
                        AG2.m69114h(m31196a2, AbstractC20013gG2.m31196a(bArr, i6), cArr, i5);
                        i5++;
                    } else {
                        throw zzjk.zzh();
                    }
                } else {
                    int i9 = i5 + 1;
                    AG2.m69113i(m31196a2, cArr, i5);
                    while (i6 < i3) {
                        byte m31196a3 = AbstractC20013gG2.m31196a(bArr, i6);
                        m69110l2 = AG2.m69110l(m31196a3);
                        if (!m69110l2) {
                            break;
                        }
                        i6++;
                        AG2.m69113i(m31196a3, cArr, i9);
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
