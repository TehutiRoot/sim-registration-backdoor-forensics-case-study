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
    public static final int[] f57624g = {3808, 476, 2107, 1799};

    /* renamed from: a */
    public final BitMatrix f57625a;

    /* renamed from: b */
    public boolean f57626b;

    /* renamed from: c */
    public int f57627c;

    /* renamed from: d */
    public int f57628d;

    /* renamed from: e */
    public int f57629e;

    /* renamed from: f */
    public int f57630f;

    /* renamed from: com.google.zxing.aztec.detector.Detector$a */
    /* loaded from: classes5.dex */
    public static final class C9000a {

        /* renamed from: a */
        public final int f57631a;

        /* renamed from: b */
        public final int f57632b;

        public C9000a(int i, int i2) {
            this.f57631a = i;
            this.f57632b = i2;
        }

        /* renamed from: a */
        public int m34215a() {
            return this.f57631a;
        }

        /* renamed from: b */
        public int m34214b() {
            return this.f57632b;
        }

        /* renamed from: c */
        public ResultPoint m34213c() {
            return new ResultPoint(m34215a(), m34214b());
        }

        public String toString() {
            return "<" + this.f57631a + TokenParser.f74644SP + this.f57632b + Typography.greater;
        }
    }

    public Detector(BitMatrix bitMatrix) {
        this.f57625a = bitMatrix;
    }

    /* renamed from: a */
    public static float m34232a(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.distance(resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY());
    }

    /* renamed from: b */
    public static float m34231b(C9000a c9000a, C9000a c9000a2) {
        return MathUtils.distance(c9000a.m34215a(), c9000a.m34214b(), c9000a2.m34215a(), c9000a2.m34214b());
    }

    /* renamed from: c */
    public static ResultPoint[] m34230c(ResultPoint[] resultPointArr, float f, float f2) {
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
    public static int m34226g(long j, boolean z) {
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
    public static int m34221l(int[] iArr, int i) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(f57624g[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: d */
    public final void m34229d(ResultPoint[] resultPointArr) {
        long j;
        long j2;
        if (m34219n(resultPointArr[0]) && m34219n(resultPointArr[1]) && m34219n(resultPointArr[2]) && m34219n(resultPointArr[3])) {
            int i = this.f57629e * 2;
            int[] iArr = {m34216q(resultPointArr[0], resultPointArr[1], i), m34216q(resultPointArr[1], resultPointArr[2], i), m34216q(resultPointArr[2], resultPointArr[3], i), m34216q(resultPointArr[3], resultPointArr[0], i)};
            this.f57630f = m34221l(iArr, i);
            long j3 = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                int i3 = iArr[(this.f57630f + i2) % 4];
                if (this.f57626b) {
                    j = j3 << 7;
                    j2 = (i3 >> 1) & 127;
                } else {
                    j = j3 << 10;
                    j2 = ((i3 >> 2) & 992) + ((i3 >> 1) & 31);
                }
                j3 = j + j2;
            }
            int m34226g = m34226g(j3, this.f57626b);
            if (this.f57626b) {
                this.f57627c = (m34226g >> 6) + 1;
                this.f57628d = (m34226g & 63) + 1;
                return;
            }
            this.f57627c = (m34226g >> 11) + 1;
            this.f57628d = (m34226g & 2047) + 1;
            return;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public AztecDetectorResult detect() throws NotFoundException {
        return detect(false);
    }

    /* renamed from: e */
    public final ResultPoint[] m34228e(C9000a c9000a) {
        boolean z;
        this.f57629e = 1;
        C9000a c9000a2 = c9000a;
        C9000a c9000a3 = c9000a2;
        C9000a c9000a4 = c9000a3;
        C9000a c9000a5 = c9000a4;
        boolean z2 = true;
        while (this.f57629e < 9) {
            C9000a m34224i = m34224i(c9000a2, z2, 1, -1);
            C9000a m34224i2 = m34224i(c9000a3, z2, 1, 1);
            C9000a m34224i3 = m34224i(c9000a4, z2, -1, 1);
            C9000a m34224i4 = m34224i(c9000a5, z2, -1, -1);
            if (this.f57629e > 2) {
                double m34231b = (m34231b(m34224i4, m34224i) * this.f57629e) / (m34231b(c9000a5, c9000a2) * (this.f57629e + 2));
                if (m34231b < 0.75d || m34231b > 1.25d || !m34218o(m34224i, m34224i2, m34224i3, m34224i4)) {
                    break;
                }
            }
            z2 = !z2;
            this.f57629e++;
            c9000a5 = m34224i4;
            c9000a2 = m34224i;
            c9000a3 = m34224i2;
            c9000a4 = m34224i3;
        }
        int i = this.f57629e;
        if (i != 5 && i != 7) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (i == 5) {
            z = true;
        } else {
            z = false;
        }
        this.f57626b = z;
        ResultPoint[] resultPointArr = {new ResultPoint(c9000a2.m34215a() + 0.5f, c9000a2.m34214b() - 0.5f), new ResultPoint(c9000a3.m34215a() + 0.5f, c9000a3.m34214b() + 0.5f), new ResultPoint(c9000a4.m34215a() - 0.5f, c9000a4.m34214b() + 0.5f), new ResultPoint(c9000a5.m34215a() - 0.5f, c9000a5.m34214b() - 0.5f)};
        int i2 = this.f57629e;
        return m34230c(resultPointArr, (i2 * 2) - 3, i2 * 2);
    }

    /* renamed from: f */
    public final int m34227f(C9000a c9000a, C9000a c9000a2) {
        float m34231b = m34231b(c9000a, c9000a2);
        float m34215a = (c9000a2.m34215a() - c9000a.m34215a()) / m34231b;
        float m34214b = (c9000a2.m34214b() - c9000a.m34214b()) / m34231b;
        float m34215a2 = c9000a.m34215a();
        float m34214b2 = c9000a.m34214b();
        boolean z = this.f57625a.get(c9000a.m34215a(), c9000a.m34214b());
        int ceil = (int) Math.ceil(m34231b);
        boolean z2 = false;
        int i = 0;
        for (int i2 = 0; i2 < ceil; i2++) {
            m34215a2 += m34215a;
            m34214b2 += m34214b;
            if (this.f57625a.get(MathUtils.round(m34215a2), MathUtils.round(m34214b2)) != z) {
                i++;
            }
        }
        float f = i / m34231b;
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
    public final int m34225h() {
        if (this.f57626b) {
            return (this.f57627c * 4) + 11;
        }
        int i = this.f57627c;
        if (i <= 4) {
            return (i * 4) + 15;
        }
        return (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    /* renamed from: i */
    public final C9000a m34224i(C9000a c9000a, boolean z, int i, int i2) {
        int m34215a = c9000a.m34215a() + i;
        int m34214b = c9000a.m34214b();
        while (true) {
            m34214b += i2;
            if (!m34220m(m34215a, m34214b) || this.f57625a.get(m34215a, m34214b) != z) {
                break;
            }
            m34215a += i;
        }
        int i3 = m34215a - i;
        int i4 = m34214b - i2;
        while (m34220m(i3, i4) && this.f57625a.get(i3, i4) == z) {
            i3 += i;
        }
        int i5 = i3 - i;
        while (m34220m(i5, i4) && this.f57625a.get(i5, i4) == z) {
            i4 += i2;
        }
        return new C9000a(i5, i4 - i2);
    }

    /* renamed from: j */
    public final C9000a m34223j() {
        ResultPoint m34213c;
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        ResultPoint m34213c2;
        ResultPoint m34213c3;
        ResultPoint m34213c4;
        ResultPoint m34213c5;
        try {
            ResultPoint[] detect = new WhiteRectangleDetector(this.f57625a).detect();
            resultPoint2 = detect[0];
            resultPoint3 = detect[1];
            resultPoint = detect[2];
            m34213c = detect[3];
        } catch (NotFoundException unused) {
            int width = this.f57625a.getWidth() / 2;
            int height = this.f57625a.getHeight() / 2;
            int i = width + 7;
            int i2 = height - 7;
            ResultPoint m34213c6 = m34224i(new C9000a(i, i2), false, 1, -1).m34213c();
            int i3 = height + 7;
            ResultPoint m34213c7 = m34224i(new C9000a(i, i3), false, 1, 1).m34213c();
            int i4 = width - 7;
            ResultPoint m34213c8 = m34224i(new C9000a(i4, i3), false, -1, 1).m34213c();
            m34213c = m34224i(new C9000a(i4, i2), false, -1, -1).m34213c();
            resultPoint = m34213c8;
            resultPoint2 = m34213c6;
            resultPoint3 = m34213c7;
        }
        int round = MathUtils.round((((resultPoint2.getX() + m34213c.getX()) + resultPoint3.getX()) + resultPoint.getX()) / 4.0f);
        int round2 = MathUtils.round((((resultPoint2.getY() + m34213c.getY()) + resultPoint3.getY()) + resultPoint.getY()) / 4.0f);
        try {
            ResultPoint[] detect2 = new WhiteRectangleDetector(this.f57625a, 15, round, round2).detect();
            m34213c2 = detect2[0];
            m34213c3 = detect2[1];
            m34213c4 = detect2[2];
            m34213c5 = detect2[3];
        } catch (NotFoundException unused2) {
            int i5 = round + 7;
            int i6 = round2 - 7;
            m34213c2 = m34224i(new C9000a(i5, i6), false, 1, -1).m34213c();
            int i7 = round2 + 7;
            m34213c3 = m34224i(new C9000a(i5, i7), false, 1, 1).m34213c();
            int i8 = round - 7;
            m34213c4 = m34224i(new C9000a(i8, i7), false, -1, 1).m34213c();
            m34213c5 = m34224i(new C9000a(i8, i6), false, -1, -1).m34213c();
        }
        return new C9000a(MathUtils.round((((m34213c2.getX() + m34213c5.getX()) + m34213c3.getX()) + m34213c4.getX()) / 4.0f), MathUtils.round((((m34213c2.getY() + m34213c5.getY()) + m34213c3.getY()) + m34213c4.getY()) / 4.0f));
    }

    /* renamed from: k */
    public final ResultPoint[] m34222k(ResultPoint[] resultPointArr) {
        return m34230c(resultPointArr, this.f57629e * 2, m34225h());
    }

    /* renamed from: m */
    public final boolean m34220m(int i, int i2) {
        if (i >= 0 && i < this.f57625a.getWidth() && i2 > 0 && i2 < this.f57625a.getHeight()) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final boolean m34219n(ResultPoint resultPoint) {
        return m34220m(MathUtils.round(resultPoint.getX()), MathUtils.round(resultPoint.getY()));
    }

    /* renamed from: o */
    public final boolean m34218o(C9000a c9000a, C9000a c9000a2, C9000a c9000a3, C9000a c9000a4) {
        C9000a c9000a5 = new C9000a(c9000a.m34215a() - 3, c9000a.m34214b() + 3);
        C9000a c9000a6 = new C9000a(c9000a2.m34215a() - 3, c9000a2.m34214b() - 3);
        C9000a c9000a7 = new C9000a(c9000a3.m34215a() + 3, c9000a3.m34214b() - 3);
        C9000a c9000a8 = new C9000a(c9000a4.m34215a() + 3, c9000a4.m34214b() + 3);
        int m34227f = m34227f(c9000a8, c9000a5);
        if (m34227f == 0 || m34227f(c9000a5, c9000a6) != m34227f || m34227f(c9000a6, c9000a7) != m34227f || m34227f(c9000a7, c9000a8) != m34227f) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public final BitMatrix m34217p(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) {
        GridSampler gridSampler = GridSampler.getInstance();
        int m34225h = m34225h();
        float f = m34225h / 2.0f;
        int i = this.f57629e;
        float f2 = f - i;
        float f3 = f + i;
        return gridSampler.sampleGrid(bitMatrix, m34225h, m34225h, f2, f2, f3, f2, f3, f3, f2, f3, resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY(), resultPoint3.getX(), resultPoint3.getY(), resultPoint4.getX(), resultPoint4.getY());
    }

    /* renamed from: q */
    public final int m34216q(ResultPoint resultPoint, ResultPoint resultPoint2, int i) {
        float m34232a = m34232a(resultPoint, resultPoint2);
        float f = m34232a / i;
        float x = resultPoint.getX();
        float y = resultPoint.getY();
        float x2 = ((resultPoint2.getX() - resultPoint.getX()) * f) / m34232a;
        float y2 = (f * (resultPoint2.getY() - resultPoint.getY())) / m34232a;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = i3;
            if (this.f57625a.get(MathUtils.round((f2 * x2) + x), MathUtils.round((f2 * y2) + y))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    public AztecDetectorResult detect(boolean z) throws NotFoundException {
        ResultPoint[] m34228e = m34228e(m34223j());
        if (z) {
            ResultPoint resultPoint = m34228e[0];
            m34228e[0] = m34228e[2];
            m34228e[2] = resultPoint;
        }
        m34229d(m34228e);
        BitMatrix bitMatrix = this.f57625a;
        int i = this.f57630f;
        return new AztecDetectorResult(m34217p(bitMatrix, m34228e[i % 4], m34228e[(i + 1) % 4], m34228e[(i + 2) % 4], m34228e[(i + 3) % 4]), m34222k(m34228e), this.f57626b, this.f57628d, this.f57627c);
    }
}