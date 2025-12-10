package com.google.zxing.pdf417.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.pdf417.PDF417Common;
import com.google.zxing.pdf417.decoder.p017ec.ErrorCorrection;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Formatter;

/* loaded from: classes5.dex */
public final class PDF417ScanningDecoder {

    /* renamed from: a */
    public static final ErrorCorrection f57938a = new ErrorCorrection();

    /* renamed from: a */
    public static C13267rc m33977a(C16884vG c16884vG) {
        int[] m1069j;
        if (c16884vG == null || (m1069j = c16884vG.m1069j()) == null) {
            return null;
        }
        int m33963o = m33963o(m1069j);
        int i = 0;
        int i2 = 0;
        for (int i3 : m1069j) {
            i2 += m33963o - i3;
            if (i3 > 0) {
                break;
            }
        }
        C13140pq[] m1303d = c16884vG.m1303d();
        for (int i4 = 0; i2 > 0 && m1303d[i4] == null; i4++) {
            i2--;
        }
        for (int length = m1069j.length - 1; length >= 0; length--) {
            int i5 = m1069j[length];
            i += m33963o - i5;
            if (i5 > 0) {
                break;
            }
        }
        for (int length2 = m1303d.length - 1; i > 0 && m1303d[length2] == null; length2--) {
            i--;
        }
        return c16884vG.m1306a().m23318a(i2, i, c16884vG.m1068k());
    }

    /* renamed from: b */
    public static void m33976b(C13987tG c13987tG, C11544ja[][] c11544jaArr) {
        int[] m29197b = c11544jaArr[0][1].m29197b();
        int m22478j = (c13987tG.m22478j() * c13987tG.m22476l()) - m33961q(c13987tG.m22477k());
        if (m29197b.length == 0) {
            if (m22478j > 0 && m22478j <= 928) {
                c11544jaArr[0][1].m29196c(m22478j);
                return;
            }
            throw NotFoundException.getNotFoundInstance();
        } else if (m29197b[0] != m22478j) {
            c11544jaArr[0][1].m29196c(m22478j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0022, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0022, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0017  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m33975c(com.google.zxing.common.BitMatrix r5, int r6, int r7, boolean r8, int r9, int r10) {
        /*
            if (r8 == 0) goto L4
            r0 = -1
            goto L5
        L4:
            r0 = 1
        L5:
            r1 = 0
            r2 = r9
        L7:
            r3 = 2
            if (r1 >= r3) goto L28
        La:
            if (r8 == 0) goto Lf
            if (r2 < r6) goto L22
            goto L11
        Lf:
            if (r2 >= r7) goto L22
        L11:
            boolean r4 = r5.get(r2, r10)
            if (r8 != r4) goto L22
            int r4 = r9 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r4 <= r3) goto L20
            return r9
        L20:
            int r2 = r2 + r0
            goto La
        L22:
            int r0 = -r0
            r8 = r8 ^ 1
            int r1 = r1 + 1
            goto L7
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.PDF417ScanningDecoder.m33975c(com.google.zxing.common.BitMatrix, int, int, boolean, int, int):int");
    }

    /* renamed from: d */
    public static boolean m33974d(int i, int i2, int i3) {
        return i2 + (-2) <= i && i <= i3 + 2;
    }

    public static DecoderResult decode(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i, int i2) throws NotFoundException, FormatException, ChecksumException {
        boolean z;
        int i3;
        C16806uG c16884vG;
        boolean z2;
        int i4;
        int i5;
        int i6;
        C16884vG c16884vG2 = null;
        C16884vG c16884vG3 = null;
        C13987tG c13987tG = null;
        C13267rc c13267rc = new C13267rc(bitMatrix, resultPoint, resultPoint2, resultPoint3, resultPoint4);
        for (int i7 = 0; i7 < 2; i7++) {
            if (resultPoint != null) {
                c16884vG2 = m33960r(bitMatrix, c13267rc, resultPoint, true, i, i2);
            }
            if (resultPoint3 != null) {
                c16884vG3 = m33960r(bitMatrix, c13267rc, resultPoint3, false, i, i2);
            }
            c13987tG = m33957u(c16884vG2, c16884vG3);
            if (c13987tG != null) {
                if (i7 == 0 && c13987tG.m22475m() != null && (c13987tG.m22475m().m23311h() < c13267rc.m23311h() || c13987tG.m22475m().m23313f() > c13267rc.m23313f())) {
                    c13267rc = c13987tG.m22475m();
                } else {
                    c13987tG.m22472p(c13267rc);
                    break;
                }
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
        int m22478j = c13987tG.m22478j() + 1;
        c13987tG.m22471q(0, c16884vG2);
        c13987tG.m22471q(m22478j, c16884vG3);
        if (c16884vG2 != null) {
            z = true;
        } else {
            z = false;
        }
        int i8 = i;
        int i9 = i2;
        for (int i10 = 1; i10 <= m22478j; i10++) {
            if (z) {
                i3 = i10;
            } else {
                i3 = m22478j - i10;
            }
            if (c13987tG.m22474n(i3) == null) {
                if (i3 != 0 && i3 != m22478j) {
                    c16884vG = new C16806uG(c13267rc);
                } else {
                    if (i3 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c16884vG = new C16884vG(c13267rc, z2);
                }
                c13987tG.m22471q(i3, c16884vG);
                int i11 = -1;
                int m23311h = c13267rc.m23311h();
                int i12 = -1;
                while (m23311h <= c13267rc.m23313f()) {
                    int m33959s = m33959s(c13987tG, i3, m23311h, z);
                    if (m33959s >= 0 && m33959s <= c13267rc.m23314e()) {
                        i6 = m33959s;
                    } else if (i12 != i11) {
                        i6 = i12;
                    } else {
                        i4 = i12;
                        i5 = m23311h;
                        i12 = i4;
                        m23311h = i5 + 1;
                        i11 = -1;
                    }
                    i4 = i12;
                    int i13 = m23311h;
                    C13140pq m33968j = m33968j(bitMatrix, c13267rc.m23312g(), c13267rc.m23314e(), z, i6, i13, i8, i9);
                    i5 = i13;
                    if (m33968j != null) {
                        c16884vG.m1301f(i5, m33968j);
                        i8 = Math.min(i8, m33968j.m23590f());
                        i9 = Math.max(i9, m33968j.m23590f());
                        i12 = i6;
                        m23311h = i5 + 1;
                        i11 = -1;
                    }
                    i12 = i4;
                    m23311h = i5 + 1;
                    i11 = -1;
                }
            }
        }
        return m33971g(c13987tG);
    }

    /* renamed from: e */
    public static int m33973e(int[] iArr, int[] iArr2, int i) {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return f57938a.decode(iArr, i, iArr2);
        }
        throw ChecksumException.getChecksumInstance();
    }

    /* renamed from: f */
    public static C11544ja[][] m33972f(C13987tG c13987tG) {
        C16806uG[] m22473o;
        C13140pq[] m1303d;
        int m23593c;
        C11544ja[][] c11544jaArr = (C11544ja[][]) Array.newInstance(C11544ja.class, c13987tG.m22476l(), c13987tG.m22478j() + 2);
        for (C11544ja[] c11544jaArr2 : c11544jaArr) {
            int i = 0;
            while (true) {
                if (i < c11544jaArr2.length) {
                    c11544jaArr2[i] = new C11544ja();
                    i++;
                }
            }
        }
        int i2 = 0;
        for (C16806uG c16806uG : c13987tG.m22473o()) {
            if (c16806uG != null) {
                for (C13140pq c13140pq : c16806uG.m1303d()) {
                    if (c13140pq != null && (m23593c = c13140pq.m23593c()) >= 0 && m23593c < c11544jaArr.length) {
                        c11544jaArr[m23593c][i2].m29196c(c13140pq.m23591e());
                    }
                }
            }
            i2++;
        }
        return c11544jaArr;
    }

    /* renamed from: g */
    public static DecoderResult m33971g(C13987tG c13987tG) {
        C11544ja[][] m33972f = m33972f(c13987tG);
        m33976b(c13987tG, m33972f);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[c13987tG.m22476l() * c13987tG.m22478j()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < c13987tG.m22476l(); i++) {
            int i2 = 0;
            while (i2 < c13987tG.m22478j()) {
                int i3 = i2 + 1;
                int[] m29197b = m33972f[i][i3].m29197b();
                int m22478j = (c13987tG.m22478j() * i) + i2;
                if (m29197b.length == 0) {
                    arrayList.add(Integer.valueOf(m22478j));
                } else if (m29197b.length == 1) {
                    iArr[m22478j] = m29197b[0];
                } else {
                    arrayList3.add(Integer.valueOf(m22478j));
                    arrayList2.add(m29197b);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return m33970h(c13987tG.m22477k(), iArr, PDF417Common.toIntArray(arrayList), PDF417Common.toIntArray(arrayList3), iArr2);
    }

    /* renamed from: h */
    public static DecoderResult m33970h(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[iArr3[i4]] = iArr4[i4][iArr5[i4]];
                }
                try {
                    return m33969i(iArr, i, iArr2);
                } catch (ChecksumException unused) {
                    if (length != 0) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                break;
                            }
                            int i6 = iArr5[i5];
                            if (i6 < iArr4[i5].length - 1) {
                                iArr5[i5] = i6 + 1;
                                break;
                            }
                            iArr5[i5] = 0;
                            if (i5 != length - 1) {
                                i5++;
                            } else {
                                throw ChecksumException.getChecksumInstance();
                            }
                        }
                        i2 = i3;
                    } else {
                        throw ChecksumException.getChecksumInstance();
                    }
                }
            } else {
                throw ChecksumException.getChecksumInstance();
            }
        }
    }

    /* renamed from: i */
    public static DecoderResult m33969i(int[] iArr, int i, int[] iArr2) {
        if (iArr.length != 0) {
            int i2 = 1 << (i + 1);
            int m33973e = m33973e(iArr, iArr2, i2);
            m33956v(iArr, i2);
            DecoderResult m33983b = DecodedBitStreamParser.m33983b(iArr, String.valueOf(i));
            m33983b.setErrorsCorrected(Integer.valueOf(m33973e));
            m33983b.setErasures(Integer.valueOf(iArr2.length));
            return m33983b;
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: j */
    public static C13140pq m33968j(BitMatrix bitMatrix, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        int m30606d;
        int codeword;
        int m33975c = m33975c(bitMatrix, i, i2, z, i3, i4);
        int[] m33962p = m33962p(bitMatrix, i, i2, z, m33975c, i4);
        if (m33962p == null) {
            return null;
        }
        int sum = MathUtils.sum(m33962p);
        if (z) {
            i7 = m33975c + sum;
        } else {
            for (int i8 = 0; i8 < m33962p.length / 2; i8++) {
                int i9 = m33962p[i8];
                m33962p[i8] = m33962p[(m33962p.length - 1) - i8];
                m33962p[(m33962p.length - 1) - i8] = i9;
            }
            m33975c -= sum;
            i7 = m33975c;
        }
        if (!m33974d(sum, i5, i6) || (codeword = PDF417Common.getCodeword((m30606d = AbstractC20423ih1.m30606d(m33962p)))) == -1) {
            return null;
        }
        return new C13140pq(m33975c, i7, m33965m(m30606d), codeword);
    }

    /* renamed from: k */
    public static C10392ha m33967k(C16884vG c16884vG, C16884vG c16884vG2) {
        C10392ha m1070i;
        C10392ha m1070i2;
        if (c16884vG != null && (m1070i = c16884vG.m1070i()) != null) {
            if (c16884vG2 != null && (m1070i2 = c16884vG2.m1070i()) != null && m1070i.m30858a() != m1070i2.m30858a() && m1070i.m30857b() != m1070i2.m30857b() && m1070i.m30856c() != m1070i2.m30856c()) {
                return null;
            }
            return m1070i;
        } else if (c16884vG2 == null) {
            return null;
        } else {
            return c16884vG2.m1070i();
        }
    }

    /* renamed from: l */
    public static int[] m33966l(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 >= 0) {
                    i2 = i4;
                } else {
                    return iArr;
                }
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }

    /* renamed from: m */
    public static int m33965m(int i) {
        return m33964n(m33966l(i));
    }

    /* renamed from: n */
    public static int m33964n(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* renamed from: o */
    public static int m33963o(int[] iArr) {
        int i = -1;
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0027 A[EDGE_INSN: B:27:0x0027->B:16:0x0027 ?: BREAK  , SYNTHETIC] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] m33962p(com.google.zxing.common.BitMatrix r7, int r8, int r9, boolean r10, int r11, int r12) {
        /*
            r0 = 8
            int[] r1 = new int[r0]
            r2 = 1
            if (r10 == 0) goto L9
            r3 = 1
            goto La
        L9:
            r3 = -1
        La:
            r4 = 0
            r5 = r10
        Lc:
            if (r10 == 0) goto L11
            if (r11 >= r9) goto L27
            goto L13
        L11:
            if (r11 < r8) goto L27
        L13:
            if (r4 >= r0) goto L27
            boolean r6 = r7.get(r11, r12)
            if (r6 != r5) goto L22
            r6 = r1[r4]
            int r6 = r6 + r2
            r1[r4] = r6
            int r11 = r11 + r3
            goto Lc
        L22:
            int r4 = r4 + 1
            r5 = r5 ^ 1
            goto Lc
        L27:
            if (r4 == r0) goto L34
            if (r10 == 0) goto L2c
            r8 = r9
        L2c:
            if (r11 != r8) goto L32
            r7 = 7
            if (r4 != r7) goto L32
            goto L34
        L32:
            r7 = 0
            return r7
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.PDF417ScanningDecoder.m33962p(com.google.zxing.common.BitMatrix, int, int, boolean, int, int):int[]");
    }

    /* renamed from: q */
    public static int m33961q(int i) {
        return 2 << i;
    }

    /* renamed from: r */
    public static C16884vG m33960r(BitMatrix bitMatrix, C13267rc c13267rc, ResultPoint resultPoint, boolean z, int i, int i2) {
        int i3;
        int m23594b;
        C16884vG c16884vG = new C16884vG(c13267rc, z);
        for (int i4 = 0; i4 < 2; i4++) {
            if (i4 == 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            int x = (int) resultPoint.getX();
            for (int y = (int) resultPoint.getY(); y <= c13267rc.m23313f() && y >= c13267rc.m23311h(); y += i3) {
                C13140pq m33968j = m33968j(bitMatrix, 0, bitMatrix.getWidth(), z, x, y, i, i2);
                if (m33968j != null) {
                    c16884vG.m1301f(y, m33968j);
                    if (z) {
                        m23594b = m33968j.m23592d();
                    } else {
                        m23594b = m33968j.m23594b();
                    }
                    x = m23594b;
                }
            }
        }
        return c16884vG;
    }

    /* renamed from: s */
    public static int m33959s(C13987tG c13987tG, int i, int i2, boolean z) {
        int i3;
        C13140pq c13140pq;
        C13140pq[] m1303d;
        int m23592d;
        if (z) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        int i4 = i - i3;
        if (m33958t(c13987tG, i4)) {
            c13140pq = c13987tG.m22474n(i4).m1305b(i2);
        } else {
            c13140pq = null;
        }
        if (c13140pq != null) {
            if (z) {
                return c13140pq.m23594b();
            }
            return c13140pq.m23592d();
        }
        C13140pq m1304c = c13987tG.m22474n(i).m1304c(i2);
        if (m1304c != null) {
            if (z) {
                return m1304c.m23592d();
            }
            return m1304c.m23594b();
        }
        if (m33958t(c13987tG, i4)) {
            m1304c = c13987tG.m22474n(i4).m1304c(i2);
        }
        if (m1304c != null) {
            if (z) {
                return m1304c.m23594b();
            }
            return m1304c.m23592d();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (m33958t(c13987tG, i)) {
                for (C13140pq c13140pq2 : c13987tG.m22474n(i).m1303d()) {
                    if (c13140pq2 != null) {
                        if (z) {
                            m23592d = c13140pq2.m23594b();
                        } else {
                            m23592d = c13140pq2.m23592d();
                        }
                        return m23592d + (i3 * i5 * (c13140pq2.m23594b() - c13140pq2.m23592d()));
                    }
                }
                i5++;
            } else {
                C13267rc m22475m = c13987tG.m22475m();
                if (z) {
                    return m22475m.m23312g();
                }
                return m22475m.m23314e();
            }
        }
    }

    /* renamed from: t */
    public static boolean m33958t(C13987tG c13987tG, int i) {
        if (i >= 0 && i <= c13987tG.m22478j() + 1) {
            return true;
        }
        return false;
    }

    public static String toString(C11544ja[][] c11544jaArr) {
        Formatter formatter = new Formatter();
        for (int i = 0; i < c11544jaArr.length; i++) {
            formatter.format("Row %2d: ", Integer.valueOf(i));
            int i2 = 0;
            while (true) {
                C11544ja[] c11544jaArr2 = c11544jaArr[i];
                if (i2 < c11544jaArr2.length) {
                    C11544ja c11544ja = c11544jaArr2[i2];
                    if (c11544ja.m29197b().length == 0) {
                        formatter.format("        ", null);
                    } else {
                        formatter.format("%4d(%2d)", Integer.valueOf(c11544ja.m29197b()[0]), c11544ja.m29198a(c11544ja.m29197b()[0]));
                    }
                    i2++;
                }
            }
            formatter.format("%n", new Object[0]);
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }

    /* renamed from: u */
    public static C13987tG m33957u(C16884vG c16884vG, C16884vG c16884vG2) {
        C10392ha m33967k;
        if ((c16884vG == null && c16884vG2 == null) || (m33967k = m33967k(c16884vG, c16884vG2)) == null) {
            return null;
        }
        return new C13987tG(m33967k, C13267rc.m23307l(m33977a(c16884vG), m33977a(c16884vG2)));
    }

    /* renamed from: v */
    public static void m33956v(int[] iArr, int i) {
        if (iArr.length >= 4) {
            int i2 = iArr[0];
            if (i2 <= iArr.length) {
                if (i2 == 0) {
                    if (i < iArr.length) {
                        iArr[0] = iArr.length - i;
                        return;
                    }
                    throw FormatException.getFormatInstance();
                }
                return;
            }
            throw FormatException.getFormatInstance();
        }
        throw FormatException.getFormatInstance();
    }
}
