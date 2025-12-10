package com.google.android.gms.internal.firebase_ml;

import com.feitian.readerdk.Tool.C6150DK;

/* renamed from: com.google.android.gms.internal.firebase_ml.d */
/* loaded from: classes3.dex */
public final class C6468d extends AbstractC17647Ga2 {
    /* renamed from: e */
    public static int m47960e(byte[] bArr, int i, long j, int i2) {
        int m47973e;
        int m47965m;
        int m47974d;
        if (i2 == 0) {
            m47973e = AbstractC6464b.m47973e(i);
            return m47973e;
        } else if (i2 == 1) {
            m47965m = AbstractC6464b.m47965m(i, AbstractC17455Da2.m68636a(bArr, j));
            return m47965m;
        } else if (i2 == 2) {
            m47974d = AbstractC6464b.m47974d(i, AbstractC17455Da2.m68636a(bArr, j), AbstractC17455Da2.m68636a(bArr, j + 1));
            return m47974d;
        } else {
            throw new AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (p000.AbstractC17455Da2.m68636a(r23, r9) > (-65)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
        if (p000.AbstractC17455Da2.m68636a(r23, r9) > (-65)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00aa, code lost:
        if (p000.AbstractC17455Da2.m68636a(r23, r9) > (-65)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f5, code lost:
        return -1;
     */
    @Override // p000.AbstractC17647Ga2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo47963a(int r22, byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.C6468d.mo47963a(int, byte[], int, int):int");
    }

    @Override // p000.AbstractC17647Ga2
    /* renamed from: b */
    public final int mo47962b(CharSequence charSequence, byte[] bArr, int i, int i2) {
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
                AbstractC17455Da2.m68628i(bArr, j4, (byte) charAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char charAt2 = charSequence.charAt(i4);
                if (charAt2 < 128 && j4 < j5) {
                    AbstractC17455Da2.m68628i(bArr, j4, (byte) charAt2);
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
                        AbstractC17455Da2.m68628i(bArr, j4, (byte) ((charAt2 >>> 6) | 960));
                        j4 += 2;
                        AbstractC17455Da2.m68628i(bArr, j6, (byte) ((charAt2 & '?') | 128));
                    } else {
                        str = str3;
                        str2 = str4;
                        if ((charAt2 < 55296 || 57343 < charAt2) && j4 <= j5 - 3) {
                            AbstractC17455Da2.m68628i(bArr, j4, (byte) ((charAt2 >>> '\f') | 480));
                            long j7 = j4 + 2;
                            AbstractC17455Da2.m68628i(bArr, j4 + 1, (byte) (((charAt2 >>> 6) & 63) | 128));
                            j4 += 3;
                            AbstractC17455Da2.m68628i(bArr, j7, (byte) ((charAt2 & '?') | 128));
                        } else if (j4 <= j5 - 4) {
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char charAt3 = charSequence.charAt(i5);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    j2 = 1;
                                    AbstractC17455Da2.m68628i(bArr, j4, (byte) ((codePoint >>> 18) | C6150DK.ERROR_RECEIVE_LRC));
                                    j3 = j5;
                                    AbstractC17455Da2.m68628i(bArr, j4 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j8 = j4 + 3;
                                    AbstractC17455Da2.m68628i(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j4 += 4;
                                    AbstractC17455Da2.m68628i(bArr, j8, (byte) ((codePoint & 63) | 128));
                                    i4 = i5;
                                } else {
                                    i4 = i5;
                                }
                            }
                            throw new zzaaq(i4 - 1, length);
                        } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                            throw new zzaaq(i4, length);
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

    @Override // p000.AbstractC17647Ga2
    /* renamed from: d */
    public final String mo47961d(byte[] bArr, int i, int i2) {
        boolean m68071i;
        boolean m68071i2;
        boolean m68070j;
        boolean m68069k;
        boolean m68071i3;
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte m68636a = AbstractC17455Da2.m68636a(bArr, i);
                m68071i3 = AbstractC17711Ha2.m68071i(m68636a);
                if (!m68071i3) {
                    break;
                }
                i++;
                AbstractC17711Ha2.m68076d(m68636a, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte m68636a2 = AbstractC17455Da2.m68636a(bArr, i);
                m68071i = AbstractC17711Ha2.m68071i(m68636a2);
                if (!m68071i) {
                    m68070j = AbstractC17711Ha2.m68070j(m68636a2);
                    if (!m68070j) {
                        m68069k = AbstractC17711Ha2.m68069k(m68636a2);
                        if (m68069k) {
                            if (i6 < i3 - 1) {
                                int i7 = i + 2;
                                i += 3;
                                AbstractC17711Ha2.m68078b(m68636a2, AbstractC17455Da2.m68636a(bArr, i6), AbstractC17455Da2.m68636a(bArr, i7), cArr, i5);
                                i5++;
                            } else {
                                throw zzxs.zzvv();
                            }
                        } else if (i6 < i3 - 2) {
                            int i8 = i + 3;
                            i += 4;
                            AbstractC17711Ha2.m68079a(m68636a2, AbstractC17455Da2.m68636a(bArr, i6), AbstractC17455Da2.m68636a(bArr, i + 2), AbstractC17455Da2.m68636a(bArr, i8), cArr, i5);
                            i5 += 2;
                        } else {
                            throw zzxs.zzvv();
                        }
                    } else if (i6 < i3) {
                        i += 2;
                        AbstractC17711Ha2.m68077c(m68636a2, AbstractC17455Da2.m68636a(bArr, i6), cArr, i5);
                        i5++;
                    } else {
                        throw zzxs.zzvv();
                    }
                } else {
                    int i9 = i5 + 1;
                    AbstractC17711Ha2.m68076d(m68636a2, cArr, i5);
                    while (i6 < i3) {
                        byte m68636a3 = AbstractC17455Da2.m68636a(bArr, i6);
                        m68071i2 = AbstractC17711Ha2.m68071i(m68636a3);
                        if (!m68071i2) {
                            break;
                        }
                        i6++;
                        AbstractC17711Ha2.m68076d(m68636a3, cArr, i9);
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
