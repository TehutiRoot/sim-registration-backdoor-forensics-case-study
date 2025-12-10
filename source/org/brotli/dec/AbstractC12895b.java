package org.brotli.dec;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* renamed from: org.brotli.dec.b */
/* loaded from: classes6.dex */
public abstract class AbstractC12895b {

    /* renamed from: a */
    public static final int[] f75617a = {1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15};

    /* renamed from: b */
    public static final int[] f75618b = {3, 2, 1, 0, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2};

    /* renamed from: c */
    public static final int[] f75619c = {0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3};

    /* renamed from: d */
    public static final int[] f75620d = {131072, 131076, 131075, 196610, 131072, 131076, 131075, 262145, 131072, 131076, 131075, 196610, 131072, 131076, 131075, 262149};

    /* renamed from: a */
    public static void m24403a(C12896c c12896c) {
        C12894a c12894a = c12896c.f75649c;
        byte[] bArr = c12896c.f75650d;
        int i = c12896c.f75653g;
        if (i <= 0) {
            C12894a.m24404k(c12894a);
            c12896c.f75647a = 1;
            return;
        }
        int min = Math.min(c12896c.f75637Q - c12896c.f75664r, i);
        C12894a.m24412c(c12894a, bArr, c12896c.f75664r, min);
        c12896c.f75653g -= min;
        int i2 = c12896c.f75664r + min;
        c12896c.f75664r = i2;
        int i3 = c12896c.f75637Q;
        if (i2 == i3) {
            c12896c.f75648b = 5;
            c12896c.f75645Y = i3;
            c12896c.f75644X = 0;
            c12896c.f75647a = 12;
            return;
        }
        C12894a.m24404k(c12894a);
        c12896c.f75647a = 1;
    }

    /* renamed from: b */
    public static void m24402b(C12896c c12896c, int i) {
        int i2;
        C12894a c12894a = c12896c.f75649c;
        int[] iArr = c12896c.f75662p;
        int i3 = i * 2;
        C12894a.m24411d(c12894a);
        int i4 = i * 1080;
        int m24386r = m24386r(c12896c.f75651e, i4, c12894a);
        c12896c.f75660n[i] = m24391m(c12896c.f75652f, i4, c12894a);
        if (m24386r == 1) {
            i2 = iArr[i3 + 1] + 1;
        } else if (m24386r == 0) {
            i2 = iArr[i3];
        } else {
            i2 = m24386r - 2;
        }
        int i5 = c12896c.f75661o[i];
        if (i2 >= i5) {
            i2 -= i5;
        }
        int i6 = i3 + 1;
        iArr[i3] = iArr[i6];
        iArr[i6] = i2;
    }

    /* renamed from: c */
    public static void m24401c(C12896c c12896c) {
        m24402b(c12896c, 1);
        c12896c.f75626F = c12896c.f75658l.f62065c[c12896c.f75662p[3]];
    }

    /* renamed from: d */
    public static int m24400d(int i, byte[] bArr, C12894a c12894a) {
        boolean z;
        int i2;
        C12894a.m24405j(c12894a);
        int m24396h = m24396h(c12894a) + 1;
        if (m24396h == 1) {
            G02.m68319a(bArr, 0, i);
            return m24396h;
        }
        if (C12894a.m24406i(c12894a, 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = C12894a.m24406i(c12894a, 4) + 1;
        } else {
            i2 = 0;
        }
        int[] iArr = new int[1080];
        m24390n(m24396h + i2, iArr, 0, c12894a);
        int i3 = 0;
        while (i3 < i) {
            C12894a.m24405j(c12894a);
            C12894a.m24411d(c12894a);
            int m24386r = m24386r(iArr, 0, c12894a);
            if (m24386r == 0) {
                bArr[i3] = 0;
            } else if (m24386r <= i2) {
                for (int m24406i = (1 << m24386r) + C12894a.m24406i(c12894a, m24386r); m24406i != 0; m24406i--) {
                    if (i3 < i) {
                        bArr[i3] = 0;
                        i3++;
                    } else {
                        throw new BrotliRuntimeException("Corrupted context map");
                    }
                }
                continue;
            } else {
                bArr[i3] = (byte) (m24386r - i2);
            }
            i3++;
        }
        if (C12894a.m24406i(c12894a, 1) == 1) {
            m24394j(bArr, i);
        }
        return m24396h;
    }

    /* renamed from: e */
    public static void m24399e(C12896c c12896c) {
        m24402b(c12896c, 2);
        c12896c.f75623C = c12896c.f75662p[5] << 2;
    }

    /* renamed from: f */
    public static void m24398f(C12896c c12896c) {
        m24402b(c12896c, 0);
        int i = c12896c.f75662p[1];
        int i2 = i << 6;
        c12896c.f75622B = i2;
        int i3 = c12896c.f75621A[i2] & 255;
        c12896c.f75668v = i3;
        c12896c.f75669w = c12896c.f75657k.f62065c[i3];
        byte b = c12896c.f75672z[i];
        int[] iArr = AbstractC10037cy.f61020b;
        c12896c.f75624D = iArr[b];
        c12896c.f75625E = iArr[b + 1];
    }

    /* renamed from: g */
    public static void m24397g(C12894a c12894a, C12896c c12896c) {
        boolean z;
        boolean z2 = true;
        if (C12894a.m24406i(c12894a, 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        c12896c.f75654h = z;
        c12896c.f75653g = 0;
        c12896c.f75655i = false;
        c12896c.f75656j = false;
        if (z && C12894a.m24406i(c12894a, 1) != 0) {
            return;
        }
        int m24406i = C12894a.m24406i(c12894a, 2) + 4;
        if (m24406i == 7) {
            c12896c.f75656j = true;
            if (C12894a.m24406i(c12894a, 1) == 0) {
                int m24406i2 = C12894a.m24406i(c12894a, 2);
                if (m24406i2 == 0) {
                    return;
                }
                for (int i = 0; i < m24406i2; i++) {
                    int m24406i3 = C12894a.m24406i(c12894a, 8);
                    if (m24406i3 == 0 && i + 1 == m24406i2 && m24406i2 > 1) {
                        throw new BrotliRuntimeException("Exuberant nibble");
                    }
                    c12896c.f75653g = (m24406i3 << (i * 8)) | c12896c.f75653g;
                }
            } else {
                throw new BrotliRuntimeException("Corrupted reserved bit");
            }
        } else {
            for (int i2 = 0; i2 < m24406i; i2++) {
                int m24406i4 = C12894a.m24406i(c12894a, 4);
                if (m24406i4 == 0 && i2 + 1 == m24406i && m24406i > 4) {
                    throw new BrotliRuntimeException("Exuberant nibble");
                }
                c12896c.f75653g = (m24406i4 << (i2 * 4)) | c12896c.f75653g;
            }
        }
        c12896c.f75653g++;
        if (!c12896c.f75654h) {
            if (C12894a.m24406i(c12894a, 1) != 1) {
                z2 = false;
            }
            c12896c.f75655i = z2;
        }
    }

    /* renamed from: h */
    public static int m24396h(C12894a c12894a) {
        if (C12894a.m24406i(c12894a, 1) != 0) {
            int m24406i = C12894a.m24406i(c12894a, 3);
            if (m24406i == 0) {
                return 1;
            }
            return C12894a.m24406i(c12894a, m24406i) + (1 << m24406i);
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a7, code lost:
        throw new org.brotli.dec.BrotliRuntimeException("Invalid backward reference");
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0013 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0013 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013c A[LOOP:2: B:48:0x013c->B:54:0x0172, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017f  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m24395i(org.brotli.dec.C12896c r19) {
        /*
            Method dump skipped, instructions count: 898
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.brotli.dec.AbstractC12895b.m24395i(org.brotli.dec.c):void");
    }

    /* renamed from: j */
    public static void m24394j(byte[] bArr, int i) {
        int[] iArr = new int[256];
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = bArr[i3] & 255;
            bArr[i3] = (byte) iArr[i4];
            if (i4 != 0) {
                m24392l(iArr, i4);
            }
        }
    }

    /* renamed from: k */
    public static void m24393k(C12896c c12896c) {
        int i;
        int i2 = c12896c.f75636P;
        long j = c12896c.f75638R;
        if (i2 > j) {
            while (true) {
                int i3 = i2 >> 1;
                if (i3 <= ((int) j) + c12896c.f75639S.length) {
                    break;
                }
                i2 = i3;
            }
            if (!c12896c.f75654h && i2 < 16384 && c12896c.f75636P >= 16384) {
                i2 = 16384;
            }
        }
        int i4 = c12896c.f75637Q;
        if (i2 <= i4) {
            return;
        }
        byte[] bArr = new byte[i2 + 37];
        byte[] bArr2 = c12896c.f75650d;
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, 0, i4);
        } else {
            byte[] bArr3 = c12896c.f75639S;
            if (bArr3.length != 0) {
                int length = bArr3.length;
                int i5 = c12896c.f75635O;
                if (length > i5) {
                    i = length - i5;
                } else {
                    i5 = length;
                    i = 0;
                }
                System.arraycopy(bArr3, i, bArr, 0, i5);
                c12896c.f75664r = i5;
                c12896c.f75640T = i5;
            }
        }
        c12896c.f75650d = bArr;
        c12896c.f75637Q = i2;
    }

    /* renamed from: l */
    public static void m24392l(int[] iArr, int i) {
        int i2 = iArr[i];
        while (i > 0) {
            iArr[i] = iArr[i - 1];
            i--;
        }
        iArr[0] = i2;
    }

    /* renamed from: m */
    public static int m24391m(int[] iArr, int i, C12894a c12894a) {
        C12894a.m24411d(c12894a);
        int m24386r = m24386r(iArr, i, c12894a);
        return AbstractC20782km1.f68016a[m24386r] + C12894a.m24406i(c12894a, AbstractC20782km1.f68017b[m24386r]);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cb  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m24390n(int r15, int[] r16, int r17, org.brotli.dec.C12894a r18) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.brotli.dec.AbstractC12895b.m24390n(int, int[], int, org.brotli.dec.a):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
        if (r4 != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
        p000.G02.m68318b(r12, r2, r11 - r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
        throw new org.brotli.dec.BrotliRuntimeException("Unused space");
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m24389o(int[] r10, int r11, int[] r12, org.brotli.dec.C12894a r13) {
        /*
            r0 = 32
            int[] r0 = new int[r0]
            r1 = 5
            r2 = 18
            r3 = 0
            p000.AbstractC19818f90.m31351a(r0, r3, r1, r10, r2)
            r10 = 8
            r1 = 32768(0x8000, float:4.5918E-41)
            r2 = 0
            r4 = 32768(0x8000, float:4.5918E-41)
            r5 = 0
        L15:
            r6 = 0
        L16:
            if (r2 >= r11) goto L7f
            if (r4 <= 0) goto L7f
            org.brotli.dec.C12894a.m24405j(r13)
            org.brotli.dec.C12894a.m24411d(r13)
            long r7 = r13.f75613f
            int r9 = r13.f75614g
            long r7 = r7 >>> r9
            int r8 = (int) r7
            r7 = r8 & 31
            r7 = r0[r7]
            int r8 = r7 >> 16
            int r9 = r9 + r8
            r13.f75614g = r9
            r8 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r8
            r8 = 16
            if (r7 >= r8) goto L45
            int r6 = r2 + 1
            r12[r2] = r7
            if (r7 == 0) goto L43
            int r10 = r1 >> r7
            int r4 = r4 - r10
            r2 = r6
            r10 = r7
            goto L15
        L43:
            r2 = r6
            goto L15
        L45:
            int r9 = r7 + (-14)
            if (r7 != r8) goto L4b
            r7 = r10
            goto L4c
        L4b:
            r7 = 0
        L4c:
            if (r5 == r7) goto L50
            r5 = r7
            r6 = 0
        L50:
            if (r6 <= 0) goto L56
            int r7 = r6 + (-2)
            int r7 = r7 << r9
            goto L57
        L56:
            r7 = r6
        L57:
            int r8 = org.brotli.dec.C12894a.m24406i(r13, r9)
            int r8 = r8 + 3
            int r7 = r7 + r8
            int r6 = r7 - r6
            int r8 = r2 + r6
            if (r8 > r11) goto L77
            r8 = 0
        L65:
            if (r8 >= r6) goto L6f
            int r9 = r2 + 1
            r12[r2] = r5
            int r8 = r8 + 1
            r2 = r9
            goto L65
        L6f:
            if (r5 == 0) goto L75
            int r8 = 15 - r5
            int r6 = r6 << r8
            int r4 = r4 - r6
        L75:
            r6 = r7
            goto L16
        L77:
            org.brotli.dec.BrotliRuntimeException r10 = new org.brotli.dec.BrotliRuntimeException
            java.lang.String r11 = "symbol + repeatDelta > numSymbols"
            r10.<init>(r11)
            throw r10
        L7f:
            if (r4 != 0) goto L86
            int r11 = r11 - r2
            p000.G02.m68318b(r12, r2, r11)
            return
        L86:
            org.brotli.dec.BrotliRuntimeException r10 = new org.brotli.dec.BrotliRuntimeException
            java.lang.String r11 = "Unused space"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.brotli.dec.AbstractC12895b.m24389o(int[], int, int[], org.brotli.dec.a):void");
    }

    /* renamed from: p */
    public static void m24388p(C12896c c12896c) {
        int i;
        int[] iArr;
        C12894a c12894a = c12896c.f75649c;
        for (int i2 = 0; i2 < 3; i2++) {
            c12896c.f75661o[i2] = m24396h(c12894a) + 1;
            c12896c.f75660n[i2] = 268435456;
            int i3 = c12896c.f75661o[i2];
            if (i3 > 1) {
                int i4 = i2 * 1080;
                m24390n(i3 + 2, c12896c.f75651e, i4, c12894a);
                m24390n(26, c12896c.f75652f, i4, c12894a);
                c12896c.f75660n[i2] = m24391m(c12896c.f75652f, i4, c12894a);
            }
        }
        C12894a.m24405j(c12894a);
        c12896c.f75631K = C12894a.m24406i(c12894a, 2);
        int m24406i = C12894a.m24406i(c12894a, 4);
        int i5 = c12896c.f75631K;
        int i6 = (m24406i << i5) + 16;
        c12896c.f75629I = i6;
        c12896c.f75630J = (1 << i5) - 1;
        int i7 = i6 + (48 << i5);
        c12896c.f75672z = new byte[c12896c.f75661o[0]];
        int i8 = 0;
        while (true) {
            i = c12896c.f75661o[0];
            if (i8 >= i) {
                break;
            }
            int min = Math.min(i8 + 96, i);
            while (i8 < min) {
                c12896c.f75672z[i8] = (byte) (C12894a.m24406i(c12894a, 2) << 1);
                i8++;
            }
            C12894a.m24405j(c12894a);
        }
        byte[] bArr = new byte[i << 6];
        c12896c.f75621A = bArr;
        int m24400d = m24400d(i << 6, bArr, c12894a);
        c12896c.f75667u = true;
        int i9 = 0;
        while (true) {
            iArr = c12896c.f75661o;
            if (i9 >= (iArr[0] << 6)) {
                break;
            } else if (c12896c.f75621A[i9] != (i9 >> 6)) {
                c12896c.f75667u = false;
                break;
            } else {
                i9++;
            }
        }
        int i10 = iArr[2];
        byte[] bArr2 = new byte[i10 << 2];
        c12896c.f75628H = bArr2;
        int m24400d2 = m24400d(i10 << 2, bArr2, c12894a);
        C19990g90.m31222b(c12896c.f75657k, 256, m24400d);
        C19990g90.m31222b(c12896c.f75658l, TypedValues.TransitionType.TYPE_AUTO_TRANSITION, c12896c.f75661o[1]);
        C19990g90.m31222b(c12896c.f75659m, i7, m24400d2);
        C19990g90.m31223a(c12896c.f75657k, c12894a);
        C19990g90.m31223a(c12896c.f75658l, c12894a);
        C19990g90.m31223a(c12896c.f75659m, c12894a);
        c12896c.f75622B = 0;
        c12896c.f75623C = 0;
        int[] iArr2 = AbstractC10037cy.f61020b;
        byte b = c12896c.f75672z[0];
        c12896c.f75624D = iArr2[b];
        c12896c.f75625E = iArr2[b + 1];
        c12896c.f75668v = 0;
        c12896c.f75669w = c12896c.f75657k.f62065c[0];
        c12896c.f75626F = c12896c.f75658l.f62065c[0];
        int[] iArr3 = c12896c.f75662p;
        iArr3[4] = 1;
        iArr3[2] = 1;
        iArr3[0] = 1;
        iArr3[5] = 0;
        iArr3[3] = 0;
        iArr3[1] = 0;
    }

    /* renamed from: q */
    public static void m24387q(C12896c c12896c) {
        int i;
        C12894a c12894a = c12896c.f75649c;
        if (c12896c.f75654h) {
            c12896c.f75648b = 10;
            c12896c.f75645Y = c12896c.f75664r;
            c12896c.f75644X = 0;
            c12896c.f75647a = 12;
            return;
        }
        C19990g90 c19990g90 = c12896c.f75657k;
        c19990g90.f62064b = null;
        c19990g90.f62065c = null;
        C19990g90 c19990g902 = c12896c.f75658l;
        c19990g902.f62064b = null;
        c19990g902.f62065c = null;
        C19990g90 c19990g903 = c12896c.f75659m;
        c19990g903.f62064b = null;
        c19990g903.f62065c = null;
        C12894a.m24405j(c12894a);
        m24397g(c12894a, c12896c);
        if (c12896c.f75653g == 0 && !c12896c.f75656j) {
            return;
        }
        if (!c12896c.f75655i && !c12896c.f75656j) {
            c12896c.f75647a = 2;
        } else {
            C12894a.m24408g(c12894a);
            if (c12896c.f75656j) {
                i = 4;
            } else {
                i = 5;
            }
            c12896c.f75647a = i;
        }
        if (c12896c.f75656j) {
            return;
        }
        c12896c.f75638R += c12896c.f75653g;
        if (c12896c.f75637Q < c12896c.f75636P) {
            m24393k(c12896c);
        }
    }

    /* renamed from: r */
    public static int m24386r(int[] iArr, int i, C12894a c12894a) {
        long j = c12894a.f75613f;
        int i2 = c12894a.f75614g;
        int i3 = (int) (j >>> i2);
        int i4 = i + (i3 & 255);
        int i5 = iArr[i4];
        int i6 = i5 >> 16;
        int i7 = i5 & 65535;
        if (i6 <= 8) {
            c12894a.f75614g = i2 + i6;
            return i7;
        }
        int i8 = iArr[i4 + i7 + ((i3 & ((1 << i6) - 1)) >>> 8)];
        c12894a.f75614g = i2 + (i8 >> 16) + 8;
        return i8 & 65535;
    }

    /* renamed from: s */
    public static void m24385s(C12896c c12896c, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        c12896c.f75639S = bArr;
    }

    /* renamed from: t */
    public static int m24384t(int i, int[] iArr, int i2) {
        if (i < 16) {
            return iArr[(i2 + f75618b[i]) & 3] + f75619c[i];
        }
        return i - 15;
    }

    /* renamed from: u */
    public static boolean m24383u(C12896c c12896c) {
        int i = c12896c.f75640T;
        if (i != 0) {
            c12896c.f75644X += i;
            c12896c.f75640T = 0;
        }
        int min = Math.min(c12896c.f75642V - c12896c.f75643W, c12896c.f75645Y - c12896c.f75644X);
        if (min != 0) {
            System.arraycopy(c12896c.f75650d, c12896c.f75644X, c12896c.f75646Z, c12896c.f75641U + c12896c.f75643W, min);
            c12896c.f75643W += min;
            c12896c.f75644X += min;
        }
        if (c12896c.f75643W >= c12896c.f75642V) {
            return false;
        }
        return true;
    }
}
