package com.google.android.gms.internal.firebase_ml;

/* renamed from: com.google.android.gms.internal.firebase_ml.c */
/* loaded from: classes3.dex */
public final class C6466c extends AbstractC17647Ga2 {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r13[r14] > (-65)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
        if (r13[r14] > (-65)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0082, code lost:
        if (r13[r14] > (-65)) goto L48;
     */
    @Override // p000.AbstractC17647Ga2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo47963a(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.C6466c.mo47963a(int, byte[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        return r10 + r0;
     */
    @Override // p000.AbstractC17647Ga2
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo47962b(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.C6466c.mo47962b(java.lang.CharSequence, byte[], int, int):int");
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
                byte b = bArr[i];
                m68071i3 = AbstractC17711Ha2.m68071i(b);
                if (!m68071i3) {
                    break;
                }
                i++;
                AbstractC17711Ha2.m68076d(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                m68071i = AbstractC17711Ha2.m68071i(b2);
                if (!m68071i) {
                    m68070j = AbstractC17711Ha2.m68070j(b2);
                    if (!m68070j) {
                        m68069k = AbstractC17711Ha2.m68069k(b2);
                        if (m68069k) {
                            if (i6 < i3 - 1) {
                                int i7 = i + 2;
                                i += 3;
                                AbstractC17711Ha2.m68078b(b2, bArr[i6], bArr[i7], cArr, i5);
                                i5++;
                            } else {
                                throw zzxs.zzvv();
                            }
                        } else if (i6 < i3 - 2) {
                            byte b3 = bArr[i6];
                            int i8 = i + 3;
                            i += 4;
                            AbstractC17711Ha2.m68079a(b2, b3, bArr[i + 2], bArr[i8], cArr, i5);
                            i5 += 2;
                        } else {
                            throw zzxs.zzvv();
                        }
                    } else if (i6 < i3) {
                        i += 2;
                        AbstractC17711Ha2.m68077c(b2, bArr[i6], cArr, i5);
                        i5++;
                    } else {
                        throw zzxs.zzvv();
                    }
                } else {
                    int i9 = i5 + 1;
                    AbstractC17711Ha2.m68076d(b2, cArr, i5);
                    while (i6 < i3) {
                        byte b4 = bArr[i6];
                        m68071i2 = AbstractC17711Ha2.m68071i(b4);
                        if (!m68071i2) {
                            break;
                        }
                        i6++;
                        AbstractC17711Ha2.m68076d(b4, cArr, i9);
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
