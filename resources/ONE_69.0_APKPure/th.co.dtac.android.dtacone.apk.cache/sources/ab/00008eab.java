package com.google.android.gms.internal.firebase_ml;

import com.feitian.readerdk.Tool.C6139DK;

/* renamed from: com.google.android.gms.internal.firebase_ml.d */
/* loaded from: classes3.dex */
public final class C6457d extends AbstractC17484Db2 {
    /* renamed from: e */
    public static int m47969e(byte[] bArr, int i, long j, int i2) {
        int m47982e;
        int m47974m;
        int m47983d;
        if (i2 == 0) {
            m47982e = AbstractC6453b.m47982e(i);
            return m47982e;
        } else if (i2 == 1) {
            m47974m = AbstractC6453b.m47974m(i, AbstractC17289Ab2.m69251a(bArr, j));
            return m47974m;
        } else if (i2 == 2) {
            m47983d = AbstractC6453b.m47983d(i, AbstractC17289Ab2.m69251a(bArr, j), AbstractC17289Ab2.m69251a(bArr, j + 1));
            return m47983d;
        } else {
            throw new AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (p000.AbstractC17289Ab2.m69251a(r23, r9) > (-65)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
        if (p000.AbstractC17289Ab2.m69251a(r23, r9) > (-65)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00aa, code lost:
        if (p000.AbstractC17289Ab2.m69251a(r23, r9) > (-65)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f5, code lost:
        return -1;
     */
    @Override // p000.AbstractC17484Db2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo47972a(int r22, byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.C6457d.mo47972a(int, byte[], int, int):int");
    }

    @Override // p000.AbstractC17484Db2
    /* renamed from: b */
    public final int mo47971b(CharSequence charSequence, byte[] bArr, int i, int i2) {
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
                AbstractC17289Ab2.m69243i(bArr, j4, (byte) charAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char charAt2 = charSequence.charAt(i4);
                if (charAt2 < 128 && j4 < j5) {
                    AbstractC17289Ab2.m69243i(bArr, j4, (byte) charAt2);
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
                        AbstractC17289Ab2.m69243i(bArr, j4, (byte) ((charAt2 >>> 6) | 960));
                        j4 += 2;
                        AbstractC17289Ab2.m69243i(bArr, j6, (byte) ((charAt2 & '?') | 128));
                    } else {
                        str = str3;
                        str2 = str4;
                        if ((charAt2 < 55296 || 57343 < charAt2) && j4 <= j5 - 3) {
                            AbstractC17289Ab2.m69243i(bArr, j4, (byte) ((charAt2 >>> '\f') | 480));
                            long j7 = j4 + 2;
                            AbstractC17289Ab2.m69243i(bArr, j4 + 1, (byte) (((charAt2 >>> 6) & 63) | 128));
                            j4 += 3;
                            AbstractC17289Ab2.m69243i(bArr, j7, (byte) ((charAt2 & '?') | 128));
                        } else if (j4 <= j5 - 4) {
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char charAt3 = charSequence.charAt(i5);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    j2 = 1;
                                    AbstractC17289Ab2.m69243i(bArr, j4, (byte) ((codePoint >>> 18) | C6139DK.ERROR_RECEIVE_LRC));
                                    j3 = j5;
                                    AbstractC17289Ab2.m69243i(bArr, j4 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j8 = j4 + 3;
                                    AbstractC17289Ab2.m69243i(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j4 += 4;
                                    AbstractC17289Ab2.m69243i(bArr, j8, (byte) ((codePoint & 63) | 128));
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

    @Override // p000.AbstractC17484Db2
    /* renamed from: d */
    public final String mo47970d(byte[] bArr, int i, int i2) {
        boolean m68624i;
        boolean m68624i2;
        boolean m68623j;
        boolean m68622k;
        boolean m68624i3;
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte m69251a = AbstractC17289Ab2.m69251a(bArr, i);
                m68624i3 = AbstractC17549Eb2.m68624i(m69251a);
                if (!m68624i3) {
                    break;
                }
                i++;
                AbstractC17549Eb2.m68629d(m69251a, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte m69251a2 = AbstractC17289Ab2.m69251a(bArr, i);
                m68624i = AbstractC17549Eb2.m68624i(m69251a2);
                if (!m68624i) {
                    m68623j = AbstractC17549Eb2.m68623j(m69251a2);
                    if (!m68623j) {
                        m68622k = AbstractC17549Eb2.m68622k(m69251a2);
                        if (m68622k) {
                            if (i6 < i3 - 1) {
                                int i7 = i + 2;
                                i += 3;
                                AbstractC17549Eb2.m68631b(m69251a2, AbstractC17289Ab2.m69251a(bArr, i6), AbstractC17289Ab2.m69251a(bArr, i7), cArr, i5);
                                i5++;
                            } else {
                                throw zzxs.zzvv();
                            }
                        } else if (i6 < i3 - 2) {
                            int i8 = i + 3;
                            i += 4;
                            AbstractC17549Eb2.m68632a(m69251a2, AbstractC17289Ab2.m69251a(bArr, i6), AbstractC17289Ab2.m69251a(bArr, i + 2), AbstractC17289Ab2.m69251a(bArr, i8), cArr, i5);
                            i5 += 2;
                        } else {
                            throw zzxs.zzvv();
                        }
                    } else if (i6 < i3) {
                        i += 2;
                        AbstractC17549Eb2.m68630c(m69251a2, AbstractC17289Ab2.m69251a(bArr, i6), cArr, i5);
                        i5++;
                    } else {
                        throw zzxs.zzvv();
                    }
                } else {
                    int i9 = i5 + 1;
                    AbstractC17549Eb2.m68629d(m69251a2, cArr, i5);
                    while (i6 < i3) {
                        byte m69251a3 = AbstractC17289Ab2.m69251a(bArr, i6);
                        m68624i2 = AbstractC17549Eb2.m68624i(m69251a3);
                        if (!m68624i2) {
                            break;
                        }
                        i6++;
                        AbstractC17549Eb2.m68629d(m69251a3, cArr, i9);
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