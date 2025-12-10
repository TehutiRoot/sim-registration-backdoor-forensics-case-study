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
    public static final ErrorCorrection f57950a = new ErrorCorrection();

    /* renamed from: a */
    public static C13266rc m33969a(C16967wG c16967wG) {
        int[] m769j;
        if (c16967wG == null || (m769j = c16967wG.m769j()) == null) {
            return null;
        }
        int m33955o = m33955o(m769j);
        int i = 0;
        int i2 = 0;
        for (int i3 : m769j) {
            i2 += m33955o - i3;
            if (i3 > 0) {
                break;
            }
        }
        C13142pq[] m940d = c16967wG.m940d();
        for (int i4 = 0; i2 > 0 && m940d[i4] == null; i4++) {
            i2--;
        }
        for (int length = m769j.length - 1; length >= 0; length--) {
            int i5 = m769j[length];
            i += m33955o - i5;
            if (i5 > 0) {
                break;
            }
        }
        for (int length2 = m940d.length - 1; i > 0 && m940d[length2] == null; length2--) {
            i--;
        }
        return c16967wG.m943a().m23489a(i2, i, c16967wG.m768k());
    }

    /* renamed from: b */
    public static void m33968b(C16822uG c16822uG, C11529ja[][] c11529jaArr) {
        int[] m29518b = c11529jaArr[0][1].m29518b();
        int m1233j = (c16822uG.m1233j() * c16822uG.m1231l()) - m33953q(c16822uG.m1232k());
        if (m29518b.length == 0) {
            if (m1233j > 0 && m1233j <= 928) {
                c11529jaArr[0][1].m29517c(m1233j);
                return;
            }
            throw NotFoundException.getNotFoundInstance();
        } else if (m29518b[0] != m1233j) {
            c11529jaArr[0][1].m29517c(m1233j);
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
    public static int m33967c(com.google.zxing.common.BitMatrix r5, int r6, int r7, boolean r8, int r9, int r10) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.PDF417ScanningDecoder.m33967c(com.google.zxing.common.BitMatrix, int, int, boolean, int, int):int");
    }

    /* renamed from: d */
    public static boolean m33966d(int i, int i2, int i3) {
        return i2 + (-2) <= i && i <= i3 + 2;
    }

    public static DecoderResult decode(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i, int i2) throws NotFoundException, FormatException, ChecksumException {
        boolean z;
        int i3;
        C16897vG c16967wG;
        boolean z2;
        int i4;
        int i5;
        int i6;
        C16967wG c16967wG2 = null;
        C16967wG c16967wG3 = null;
        C16822uG c16822uG = null;
        C13266rc c13266rc = new C13266rc(bitMatrix, resultPoint, resultPoint2, resultPoint3, resultPoint4);
        for (int i7 = 0; i7 < 2; i7++) {
            if (resultPoint != null) {
                c16967wG2 = m33952r(bitMatrix, c13266rc, resultPoint, true, i, i2);
            }
            if (resultPoint3 != null) {
                c16967wG3 = m33952r(bitMatrix, c13266rc, resultPoint3, false, i, i2);
            }
            c16822uG = m33949u(c16967wG2, c16967wG3);
            if (c16822uG != null) {
                if (i7 == 0 && c16822uG.m1230m() != null && (c16822uG.m1230m().m23482h() < c13266rc.m23482h() || c16822uG.m1230m().m23484f() > c13266rc.m23484f())) {
                    c13266rc = c16822uG.m1230m();
                } else {
                    c16822uG.m1227p(c13266rc);
                    break;
                }
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
        int m1233j = c16822uG.m1233j() + 1;
        c16822uG.m1226q(0, c16967wG2);
        c16822uG.m1226q(m1233j, c16967wG3);
        if (c16967wG2 != null) {
            z = true;
        } else {
            z = false;
        }
        int i8 = i;
        int i9 = i2;
        for (int i10 = 1; i10 <= m1233j; i10++) {
            if (z) {
                i3 = i10;
            } else {
                i3 = m1233j - i10;
            }
            if (c16822uG.m1229n(i3) == null) {
                if (i3 != 0 && i3 != m1233j) {
                    c16967wG = new C16897vG(c13266rc);
                } else {
                    if (i3 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c16967wG = new C16967wG(c13266rc, z2);
                }
                c16822uG.m1226q(i3, c16967wG);
                int i11 = -1;
                int m23482h = c13266rc.m23482h();
                int i12 = -1;
                while (m23482h <= c13266rc.m23484f()) {
                    int m33951s = m33951s(c16822uG, i3, m23482h, z);
                    if (m33951s >= 0 && m33951s <= c13266rc.m23485e()) {
                        i6 = m33951s;
                    } else if (i12 != i11) {
                        i6 = i12;
                    } else {
                        i4 = i12;
                        i5 = m23482h;
                        i12 = i4;
                        m23482h = i5 + 1;
                        i11 = -1;
                    }
                    i4 = i12;
                    int i13 = m23482h;
                    C13142pq m33960j = m33960j(bitMatrix, c13266rc.m23483g(), c13266rc.m23485e(), z, i6, i13, i8, i9);
                    i5 = i13;
                    if (m33960j != null) {
                        c16967wG.m938f(i5, m33960j);
                        i8 = Math.min(i8, m33960j.m23747f());
                        i9 = Math.max(i9, m33960j.m23747f());
                        i12 = i6;
                        m23482h = i5 + 1;
                        i11 = -1;
                    }
                    i12 = i4;
                    m23482h = i5 + 1;
                    i11 = -1;
                }
            }
        }
        return m33963g(c16822uG);
    }

    /* renamed from: e */
    public static int m33965e(int[] iArr, int[] iArr2, int i) {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return f57950a.decode(iArr, i, iArr2);
        }
        throw ChecksumException.getChecksumInstance();
    }

    /* renamed from: f */
    public static C11529ja[][] m33964f(C16822uG c16822uG) {
        C16897vG[] m1228o;
        C13142pq[] m940d;
        int m23750c;
        C11529ja[][] c11529jaArr = (C11529ja[][]) Array.newInstance(C11529ja.class, c16822uG.m1231l(), c16822uG.m1233j() + 2);
        for (C11529ja[] c11529jaArr2 : c11529jaArr) {
            int i = 0;
            while (true) {
                if (i < c11529jaArr2.length) {
                    c11529jaArr2[i] = new C11529ja();
                    i++;
                }
            }
        }
        int i2 = 0;
        for (C16897vG c16897vG : c16822uG.m1228o()) {
            if (c16897vG != null) {
                for (C13142pq c13142pq : c16897vG.m940d()) {
                    if (c13142pq != null && (m23750c = c13142pq.m23750c()) >= 0 && m23750c < c11529jaArr.length) {
                        c11529jaArr[m23750c][i2].m29517c(c13142pq.m23748e());
                    }
                }
            }
            i2++;
        }
        return c11529jaArr;
    }

    /* renamed from: g */
    public static DecoderResult m33963g(C16822uG c16822uG) {
        C11529ja[][] m33964f = m33964f(c16822uG);
        m33968b(c16822uG, m33964f);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[c16822uG.m1231l() * c16822uG.m1233j()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < c16822uG.m1231l(); i++) {
            int i2 = 0;
            while (i2 < c16822uG.m1233j()) {
                int i3 = i2 + 1;
                int[] m29518b = m33964f[i][i3].m29518b();
                int m1233j = (c16822uG.m1233j() * i) + i2;
                if (m29518b.length == 0) {
                    arrayList.add(Integer.valueOf(m1233j));
                } else if (m29518b.length == 1) {
                    iArr[m1233j] = m29518b[0];
                } else {
                    arrayList3.add(Integer.valueOf(m1233j));
                    arrayList2.add(m29518b);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return m33962h(c16822uG.m1232k(), iArr, PDF417Common.toIntArray(arrayList), PDF417Common.toIntArray(arrayList3), iArr2);
    }

    /* renamed from: h */
    public static DecoderResult m33962h(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) {
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
                    return m33961i(iArr, i, iArr2);
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
    public static DecoderResult m33961i(int[] iArr, int i, int[] iArr2) {
        if (iArr.length != 0) {
            int i2 = 1 << (i + 1);
            int m33965e = m33965e(iArr, iArr2, i2);
            m33948v(iArr, i2);
            DecoderResult m33975b = DecodedBitStreamParser.m33975b(iArr, String.valueOf(i));
            m33975b.setErrorsCorrected(Integer.valueOf(m33965e));
            m33975b.setErasures(Integer.valueOf(iArr2.length));
            return m33975b;
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: j */
    public static C13142pq m33960j(BitMatrix bitMatrix, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        int m31487d;
        int codeword;
        int m33967c = m33967c(bitMatrix, i, i2, z, i3, i4);
        int[] m33954p = m33954p(bitMatrix, i, i2, z, m33967c, i4);
        if (m33954p == null) {
            return null;
        }
        int sum = MathUtils.sum(m33954p);
        if (z) {
            i7 = m33967c + sum;
        } else {
            for (int i8 = 0; i8 < m33954p.length / 2; i8++) {
                int i9 = m33954p[i8];
                m33954p[i8] = m33954p[(m33954p.length - 1) - i8];
                m33954p[(m33954p.length - 1) - i8] = i9;
            }
            m33967c -= sum;
            i7 = m33967c;
        }
        if (!m33966d(sum, i5, i6) || (codeword = PDF417Common.getCodeword((m31487d = AbstractC19962fi1.m31487d(m33954p)))) == -1) {
            return null;
        }
        return new C13142pq(m33967c, i7, m33957m(m31487d), codeword);
    }

    /* renamed from: k */
    public static C10373ha m33959k(C16967wG c16967wG, C16967wG c16967wG2) {
        C10373ha m770i;
        C10373ha m770i2;
        if (c16967wG != null && (m770i = c16967wG.m770i()) != null) {
            if (c16967wG2 != null && (m770i2 = c16967wG2.m770i()) != null && m770i.m31222a() != m770i2.m31222a() && m770i.m31221b() != m770i2.m31221b() && m770i.m31220c() != m770i2.m31220c()) {
                return null;
            }
            return m770i;
        } else if (c16967wG2 == null) {
            return null;
        } else {
            return c16967wG2.m770i();
        }
    }

    /* renamed from: l */
    public static int[] m33958l(int i) {
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
    public static int m33957m(int i) {
        return m33956n(m33958l(i));
    }

    /* renamed from: n */
    public static int m33956n(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* renamed from: o */
    public static int m33955o(int[] iArr) {
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
    public static int[] m33954p(com.google.zxing.common.BitMatrix r7, int r8, int r9, boolean r10, int r11, int r12) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.PDF417ScanningDecoder.m33954p(com.google.zxing.common.BitMatrix, int, int, boolean, int, int):int[]");
    }

    /* renamed from: q */
    public static int m33953q(int i) {
        return 2 << i;
    }

    /* renamed from: r */
    public static C16967wG m33952r(BitMatrix bitMatrix, C13266rc c13266rc, ResultPoint resultPoint, boolean z, int i, int i2) {
        int i3;
        int m23751b;
        C16967wG c16967wG = new C16967wG(c13266rc, z);
        for (int i4 = 0; i4 < 2; i4++) {
            if (i4 == 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            int x = (int) resultPoint.getX();
            for (int y = (int) resultPoint.getY(); y <= c13266rc.m23484f() && y >= c13266rc.m23482h(); y += i3) {
                C13142pq m33960j = m33960j(bitMatrix, 0, bitMatrix.getWidth(), z, x, y, i, i2);
                if (m33960j != null) {
                    c16967wG.m938f(y, m33960j);
                    if (z) {
                        m23751b = m33960j.m23749d();
                    } else {
                        m23751b = m33960j.m23751b();
                    }
                    x = m23751b;
                }
            }
        }
        return c16967wG;
    }

    /* renamed from: s */
    public static int m33951s(C16822uG c16822uG, int i, int i2, boolean z) {
        int i3;
        C13142pq c13142pq;
        C13142pq[] m940d;
        int m23749d;
        if (z) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        int i4 = i - i3;
        if (m33950t(c16822uG, i4)) {
            c13142pq = c16822uG.m1229n(i4).m942b(i2);
        } else {
            c13142pq = null;
        }
        if (c13142pq != null) {
            if (z) {
                return c13142pq.m23751b();
            }
            return c13142pq.m23749d();
        }
        C13142pq m941c = c16822uG.m1229n(i).m941c(i2);
        if (m941c != null) {
            if (z) {
                return m941c.m23749d();
            }
            return m941c.m23751b();
        }
        if (m33950t(c16822uG, i4)) {
            m941c = c16822uG.m1229n(i4).m941c(i2);
        }
        if (m941c != null) {
            if (z) {
                return m941c.m23751b();
            }
            return m941c.m23749d();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (m33950t(c16822uG, i)) {
                for (C13142pq c13142pq2 : c16822uG.m1229n(i).m940d()) {
                    if (c13142pq2 != null) {
                        if (z) {
                            m23749d = c13142pq2.m23751b();
                        } else {
                            m23749d = c13142pq2.m23749d();
                        }
                        return m23749d + (i3 * i5 * (c13142pq2.m23751b() - c13142pq2.m23749d()));
                    }
                }
                i5++;
            } else {
                C13266rc m1230m = c16822uG.m1230m();
                if (z) {
                    return m1230m.m23483g();
                }
                return m1230m.m23485e();
            }
        }
    }

    /* renamed from: t */
    public static boolean m33950t(C16822uG c16822uG, int i) {
        if (i >= 0 && i <= c16822uG.m1233j() + 1) {
            return true;
        }
        return false;
    }

    public static String toString(C11529ja[][] c11529jaArr) {
        Formatter formatter = new Formatter();
        for (int i = 0; i < c11529jaArr.length; i++) {
            formatter.format("Row %2d: ", Integer.valueOf(i));
            int i2 = 0;
            while (true) {
                C11529ja[] c11529jaArr2 = c11529jaArr[i];
                if (i2 < c11529jaArr2.length) {
                    C11529ja c11529ja = c11529jaArr2[i2];
                    if (c11529ja.m29518b().length == 0) {
                        formatter.format("        ", null);
                    } else {
                        formatter.format("%4d(%2d)", Integer.valueOf(c11529ja.m29518b()[0]), c11529ja.m29519a(c11529ja.m29518b()[0]));
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
    public static C16822uG m33949u(C16967wG c16967wG, C16967wG c16967wG2) {
        C10373ha m33959k;
        if ((c16967wG == null && c16967wG2 == null) || (m33959k = m33959k(c16967wG, c16967wG2)) == null) {
            return null;
        }
        return new C16822uG(m33959k, C13266rc.m23478l(m33969a(c16967wG), m33969a(c16967wG2)));
    }

    /* renamed from: v */
    public static void m33948v(int[] iArr, int i) {
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