package com.google.zxing.aztec.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.common.detector.WhiteRectangleDetector;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import kotlin.text.Typography;
import org.apache.http.message.TokenParser;

/* loaded from: classes5.dex */
public final class Detector {

    /* renamed from: g */
    public static final int[] f57612g = {3808, 476, 2107, 1799};

    /* renamed from: a */
    public final BitMatrix f57613a;

    /* renamed from: b */
    public boolean f57614b;

    /* renamed from: c */
    public int f57615c;

    /* renamed from: d */
    public int f57616d;

    /* renamed from: e */
    public int f57617e;

    /* renamed from: f */
    public int f57618f;

    /* renamed from: com.google.zxing.aztec.detector.Detector$a */
    /* loaded from: classes5.dex */
    public static final class C9011a {

        /* renamed from: a */
        public final int f57619a;

        /* renamed from: b */
        public final int f57620b;

        public C9011a(int i, int i2) {
            this.f57619a = i;
            this.f57620b = i2;
        }

        /* renamed from: a */
        public int m34223a() {
            return this.f57619a;
        }

        /* renamed from: b */
        public int m34222b() {
            return this.f57620b;
        }

        /* renamed from: c */
        public ResultPoint m34221c() {
            return new ResultPoint(m34223a(), m34222b());
        }

        public String toString() {
            return "<" + this.f57619a + TokenParser.f74560SP + this.f57620b + Typography.greater;
        }
    }

    public Detector(BitMatrix bitMatrix) {
        this.f57613a = bitMatrix;
    }

    /* renamed from: a */
    public static float m34240a(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.distance(resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY());
    }

    /* renamed from: b */
    public static float m34239b(C9011a c9011a, C9011a c9011a2) {
        return MathUtils.distance(c9011a.m34223a(), c9011a.m34222b(), c9011a2.m34223a(), c9011a2.m34222b());
    }

    /* renamed from: c */
    public static ResultPoint[] m34238c(ResultPoint[] resultPointArr, float f, float f2) {
        float f3 = f2 / (f * 2.0f);
        float x = resultPointArr[0].getX() - resultPointArr[2].getX();
        float y = resultPointArr[0].getY() - resultPointArr[2].getY();
        float x2 = (resultPointArr[0].getX() + resultPointArr[2].getX()) / 2.0f;
        float y2 = (resultPointArr[0].getY() + resultPointArr[2].getY()) / 2.0f;
        float f4 = x * f3;
        float f5 = y * f3;
        ResultPoint resultPoint = new ResultPoint(x2 + f4, y2 + f5);
        ResultPoint resultPoint2 = new ResultPoint(x2 - f4, y2 - f5);
        float x3 = resultPointArr[1].getX() - resultPointArr[3].getX();
        float y3 = resultPointArr[1].getY() - resultPointArr[3].getY();
        float x4 = (resultPointArr[1].getX() + resultPointArr[3].getX()) / 2.0f;
        float y4 = (resultPointArr[1].getY() + resultPointArr[3].getY()) / 2.0f;
        float f6 = x3 * f3;
        float f7 = f3 * y3;
        return new ResultPoint[]{resultPoint, new ResultPoint(x4 + f6, y4 + f7), resultPoint2, new ResultPoint(x4 - f6, y4 - f7)};
    }

    /* renamed from: g */
    public static int m34234g(long j, boolean z) {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i3 = i - i2;
        int[] iArr = new int[i];
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iArr[i4] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new ReedSolomonDecoder(GenericGF.AZTEC_PARAM).decode(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (ReedSolomonException unused) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    /* renamed from: l */
    public static int m34229l(int[] iArr, int i) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(f57612g[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: d */
    public final void m34237d(ResultPoint[] resultPointArr) {
        long j;
        long j2;
        if (m34227n(resultPointArr[0]) && m34227n(resultPointArr[1]) && m34227n(resultPointArr[2]) && m34227n(resultPointArr[3])) {
            int i = this.f57617e * 2;
            int[] iArr = {m34224q(resultPointArr[0], resultPointArr[1], i), m34224q(resultPointArr[1], resultPointArr[2], i), m34224q(resultPointArr[2], resultPointArr[3], i), m34224q(resultPointArr[3], resultPointArr[0], i)};
            this.f57618f = m34229l(iArr, i);
            long j3 = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                int i3 = iArr[(this.f57618f + i2) % 4];
                if (this.f57614b) {
                    j = j3 << 7;
                    j2 = (i3 >> 1) & 127;
                } else {
                    j = j3 << 10;
                    j2 = ((i3 >> 2) & 992) + ((i3 >> 1) & 31);
                }
                j3 = j + j2;
            }
            int m34234g = m34234g(j3, this.f57614b);
            if (this.f57614b) {
                this.f57615c = (m34234g >> 6) + 1;
                this.f57616d = (m34234g & 63) + 1;
                return;
            }
            this.f57615c = (m34234g >> 11) + 1;
            this.f57616d = (m34234g & 2047) + 1;
            return;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public AztecDetectorResult detect() throws NotFoundException {
        return detect(false);
    }

    /* renamed from: e */
    public final ResultPoint[] m34236e(C9011a c9011a) {
        boolean z;
        this.f57617e = 1;
        C9011a c9011a2 = c9011a;
        C9011a c9011a3 = c9011a2;
        C9011a c9011a4 = c9011a3;
        C9011a c9011a5 = c9011a4;
        boolean z2 = true;
        while (this.f57617e < 9) {
            C9011a m34232i = m34232i(c9011a2, z2, 1, -1);
            C9011a m34232i2 = m34232i(c9011a3, z2, 1, 1);
            C9011a m34232i3 = m34232i(c9011a4, z2, -1, 1);
            C9011a m34232i4 = m34232i(c9011a5, z2, -1, -1);
            if (this.f57617e > 2) {
                double m34239b = (m34239b(m34232i4, m34232i) * this.f57617e) / (m34239b(c9011a5, c9011a2) * (this.f57617e + 2));
                if (m34239b < 0.75d || m34239b > 1.25d || !m34226o(m34232i, m34232i2, m34232i3, m34232i4)) {
                    break;
                }
            }
            z2 = !z2;
            this.f57617e++;
            c9011a5 = m34232i4;
            c9011a2 = m34232i;
            c9011a3 = m34232i2;
            c9011a4 = m34232i3;
        }
        int i = this.f57617e;
        if (i != 5 && i != 7) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (i == 5) {
            z = true;
        } else {
            z = false;
        }
        this.f57614b = z;
        ResultPoint[] resultPointArr = {new ResultPoint(c9011a2.m34223a() + 0.5f, c9011a2.m34222b() - 0.5f), new ResultPoint(c9011a3.m34223a() + 0.5f, c9011a3.m34222b() + 0.5f), new ResultPoint(c9011a4.m34223a() - 0.5f, c9011a4.m34222b() + 0.5f), new ResultPoint(c9011a5.m34223a() - 0.5f, c9011a5.m34222b() - 0.5f)};
        int i2 = this.f57617e;
        return m34238c(resultPointArr, (i2 * 2) - 3, i2 * 2);
    }

    /* renamed from: f */
    public final int m34235f(C9011a c9011a, C9011a c9011a2) {
        float m34239b = m34239b(c9011a, c9011a2);
        float m34223a = (c9011a2.m34223a() - c9011a.m34223a()) / m34239b;
        float m34222b = (c9011a2.m34222b() - c9011a.m34222b()) / m34239b;
        float m34223a2 = c9011a.m34223a();
        float m34222b2 = c9011a.m34222b();
        boolean z = this.f57613a.get(c9011a.m34223a(), c9011a.m34222b());
        int ceil = (int) Math.ceil(m34239b);
        boolean z2 = false;
        int i = 0;
        for (int i2 = 0; i2 < ceil; i2++) {
            m34223a2 += m34223a;
            m34222b2 += m34222b;
            if (this.f57613a.get(MathUtils.round(m34223a2), MathUtils.round(m34222b2)) != z) {
                i++;
            }
        }
        float f = i / m34239b;
        if (f > 0.1f && f < 0.9f) {
            return 0;
        }
        if (f <= 0.1f) {
            z2 = true;
        }
        if (z2 == z) {
            return 1;
        }
        return -1;
    }

    /* renamed from: h */
    public final int m34233h() {
        if (this.f57614b) {
            return (this.f57615c * 4) + 11;
        }
        int i = this.f57615c;
        if (i <= 4) {
            return (i * 4) + 15;
        }
        return (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    /* renamed from: i */
    public final C9011a m34232i(C9011a c9011a, boolean z, int i, int i2) {
        int m34223a = c9011a.m34223a() + i;
        int m34222b = c9011a.m34222b();
        while (true) {
            m34222b += i2;
            if (!m34228m(m34223a, m34222b) || this.f57613a.get(m34223a, m34222b) != z) {
                break;
            }
            m34223a += i;
        }
        int i3 = m34223a - i;
        int i4 = m34222b - i2;
        while (m34228m(i3, i4) && this.f57613a.get(i3, i4) == z) {
            i3 += i;
        }
        int i5 = i3 - i;
        while (m34228m(i5, i4) && this.f57613a.get(i5, i4) == z) {
            i4 += i2;
        }
        return new C9011a(i5, i4 - i2);
    }

    /* renamed from: j */
    public final C9011a m34231j() {
        ResultPoint m34221c;
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        ResultPoint m34221c2;
        ResultPoint m34221c3;
        ResultPoint m34221c4;
        ResultPoint m34221c5;
        try {
            ResultPoint[] detect = new WhiteRectangleDetector(this.f57613a).detect();
            resultPoint2 = detect[0];
            resultPoint3 = detect[1];
            resultPoint = detect[2];
            m34221c = detect[3];
        } catch (NotFoundException unused) {
            int width = this.f57613a.getWidth() / 2;
            int height = this.f57613a.getHeight() / 2;
            int i = width + 7;
            int i2 = height - 7;
            ResultPoint m34221c6 = m34232i(new C9011a(i, i2), false, 1, -1).m34221c();
            int i3 = height + 7;
            ResultPoint m34221c7 = m34232i(new C9011a(i, i3), false, 1, 1).m34221c();
            int i4 = width - 7;
            ResultPoint m34221c8 = m34232i(new C9011a(i4, i3), false, -1, 1).m34221c();
            m34221c = m34232i(new C9011a(i4, i2), false, -1, -1).m34221c();
            resultPoint = m34221c8;
            resultPoint2 = m34221c6;
            resultPoint3 = m34221c7;
        }
        int round = MathUtils.round((((resultPoint2.getX() + m34221c.getX()) + resultPoint3.getX()) + resultPoint.getX()) / 4.0f);
        int round2 = MathUtils.round((((resultPoint2.getY() + m34221c.getY()) + resultPoint3.getY()) + resultPoint.getY()) / 4.0f);
        try {
            ResultPoint[] detect2 = new WhiteRectangleDetector(this.f57613a, 15, round, round2).detect();
            m34221c2 = detect2[0];
            m34221c3 = detect2[1];
            m34221c4 = detect2[2];
            m34221c5 = detect2[3];
        } catch (NotFoundException unused2) {
            int i5 = round + 7;
            int i6 = round2 - 7;
            m34221c2 = m34232i(new C9011a(i5, i6), false, 1, -1).m34221c();
            int i7 = round2 + 7;
            m34221c3 = m34232i(new C9011a(i5, i7), false, 1, 1).m34221c();
            int i8 = round - 7;
            m34221c4 = m34232i(new C9011a(i8, i7), false, -1, 1).m34221c();
            m34221c5 = m34232i(new C9011a(i8, i6), false, -1, -1).m34221c();
        }
        return new C9011a(MathUtils.round((((m34221c2.getX() + m34221c5.getX()) + m34221c3.getX()) + m34221c4.getX()) / 4.0f), MathUtils.round((((m34221c2.getY() + m34221c5.getY()) + m34221c3.getY()) + m34221c4.getY()) / 4.0f));
    }

    /* renamed from: k */
    public final ResultPoint[] m34230k(ResultPoint[] resultPointArr) {
        return m34238c(resultPointArr, this.f57617e * 2, m34233h());
    }

    /* renamed from: m */
    public final boolean m34228m(int i, int i2) {
        if (i >= 0 && i < this.f57613a.getWidth() && i2 > 0 && i2 < this.f57613a.getHeight()) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final boolean m34227n(ResultPoint resultPoint) {
        return m34228m(MathUtils.round(resultPoint.getX()), MathUtils.round(resultPoint.getY()));
    }

    /* renamed from: o */
    public final boolean m34226o(C9011a c9011a, C9011a c9011a2, C9011a c9011a3, C9011a c9011a4) {
        C9011a c9011a5 = new C9011a(c9011a.m34223a() - 3, c9011a.m34222b() + 3);
        C9011a c9011a6 = new C9011a(c9011a2.m34223a() - 3, c9011a2.m34222b() - 3);
        C9011a c9011a7 = new C9011a(c9011a3.m34223a() + 3, c9011a3.m34222b() - 3);
        C9011a c9011a8 = new C9011a(c9011a4.m34223a() + 3, c9011a4.m34222b() + 3);
        int m34235f = m34235f(c9011a8, c9011a5);
        if (m34235f == 0 || m34235f(c9011a5, c9011a6) != m34235f || m34235f(c9011a6, c9011a7) != m34235f || m34235f(c9011a7, c9011a8) != m34235f) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public final BitMatrix m34225p(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) {
        GridSampler gridSampler = GridSampler.getInstance();
        int m34233h = m34233h();
        float f = m34233h / 2.0f;
        int i = this.f57617e;
        float f2 = f - i;
        float f3 = f + i;
        return gridSampler.sampleGrid(bitMatrix, m34233h, m34233h, f2, f2, f3, f2, f3, f3, f2, f3, resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY(), resultPoint3.getX(), resultPoint3.getY(), resultPoint4.getX(), resultPoint4.getY());
    }

    /* renamed from: q */
    public final int m34224q(ResultPoint resultPoint, ResultPoint resultPoint2, int i) {
        float m34240a = m34240a(resultPoint, resultPoint2);
        float f = m34240a / i;
        float x = resultPoint.getX();
        float y = resultPoint.getY();
        float x2 = ((resultPoint2.getX() - resultPoint.getX()) * f) / m34240a;
        float y2 = (f * (resultPoint2.getY() - resultPoint.getY())) / m34240a;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = i3;
            if (this.f57613a.get(MathUtils.round((f2 * x2) + x), MathUtils.round((f2 * y2) + y))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    public AztecDetectorResult detect(boolean z) throws NotFoundException {
        ResultPoint[] m34236e = m34236e(m34231j());
        if (z) {
            ResultPoint resultPoint = m34236e[0];
            m34236e[0] = m34236e[2];
            m34236e[2] = resultPoint;
        }
        m34237d(m34236e);
        BitMatrix bitMatrix = this.f57613a;
        int i = this.f57618f;
        return new AztecDetectorResult(m34225p(bitMatrix, m34236e[i % 4], m34236e[(i + 1) % 4], m34236e[(i + 2) % 4], m34236e[(i + 3) % 4]), m34230k(m34236e), this.f57614b, this.f57616d, this.f57615c);
    }
}
