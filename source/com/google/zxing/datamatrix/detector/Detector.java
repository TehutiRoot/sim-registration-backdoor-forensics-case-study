package com.google.zxing.datamatrix.detector;

import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.common.detector.WhiteRectangleDetector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Detector {

    /* renamed from: a */
    public final BitMatrix f57815a;

    /* renamed from: b */
    public final WhiteRectangleDetector f57816b;

    /* loaded from: classes5.dex */
    public static final class ResultPointsAndTransitionsComparator implements Serializable, Comparator<C9019b> {
        private ResultPointsAndTransitionsComparator() {
        }

        @Override // java.util.Comparator
        public int compare(C9019b c9019b, C9019b c9019b2) {
            return c9019b.m34103c() - c9019b2.m34103c();
        }
    }

    /* renamed from: com.google.zxing.datamatrix.detector.Detector$b */
    /* loaded from: classes5.dex */
    public static final class C9019b {

        /* renamed from: a */
        public final ResultPoint f57817a;

        /* renamed from: b */
        public final ResultPoint f57818b;

        /* renamed from: c */
        public final int f57819c;

        /* renamed from: a */
        public ResultPoint m34105a() {
            return this.f57817a;
        }

        /* renamed from: b */
        public ResultPoint m34104b() {
            return this.f57818b;
        }

        /* renamed from: c */
        public int m34103c() {
            return this.f57819c;
        }

        public String toString() {
            return this.f57817a + RemoteSettings.FORWARD_SLASH_STRING + this.f57818b + '/' + this.f57819c;
        }

        public C9019b(ResultPoint resultPoint, ResultPoint resultPoint2, int i) {
            this.f57817a = resultPoint;
            this.f57818b = resultPoint2;
            this.f57819c = i;
        }
    }

    public Detector(BitMatrix bitMatrix) throws NotFoundException {
        this.f57815a = bitMatrix;
        this.f57816b = new WhiteRectangleDetector(bitMatrix);
    }

    /* renamed from: c */
    public static int m34110c(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.round(ResultPoint.distance(resultPoint, resultPoint2));
    }

    /* renamed from: d */
    public static void m34109d(Map map, ResultPoint resultPoint) {
        Integer num = (Integer) map.get(resultPoint);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        map.put(resultPoint, Integer.valueOf(i));
    }

    /* renamed from: f */
    public static BitMatrix m34107f(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i, int i2) {
        float f = i - 0.5f;
        float f2 = i2 - 0.5f;
        return GridSampler.getInstance().sampleGrid(bitMatrix, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, resultPoint.getX(), resultPoint.getY(), resultPoint4.getX(), resultPoint4.getY(), resultPoint3.getX(), resultPoint3.getY(), resultPoint2.getX(), resultPoint2.getY());
    }

    /* renamed from: a */
    public final ResultPoint m34112a(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i) {
        float f = i;
        float m34110c = m34110c(resultPoint, resultPoint2) / f;
        float m34110c2 = m34110c(resultPoint3, resultPoint4);
        ResultPoint resultPoint5 = new ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint3.getX()) / m34110c2) * m34110c), resultPoint4.getY() + (m34110c * ((resultPoint4.getY() - resultPoint3.getY()) / m34110c2)));
        float m34110c3 = m34110c(resultPoint, resultPoint3) / f;
        float m34110c4 = m34110c(resultPoint2, resultPoint4);
        ResultPoint resultPoint6 = new ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint2.getX()) / m34110c4) * m34110c3), resultPoint4.getY() + (m34110c3 * ((resultPoint4.getY() - resultPoint2.getY()) / m34110c4)));
        if (!m34108e(resultPoint5)) {
            if (m34108e(resultPoint6)) {
                return resultPoint6;
            }
            return null;
        } else if (!m34108e(resultPoint6)) {
            return resultPoint5;
        } else {
            if (Math.abs(m34106g(resultPoint3, resultPoint5).m34103c() - m34106g(resultPoint2, resultPoint5).m34103c()) <= Math.abs(m34106g(resultPoint3, resultPoint6).m34103c() - m34106g(resultPoint2, resultPoint6).m34103c())) {
                return resultPoint5;
            }
            return resultPoint6;
        }
    }

    /* renamed from: b */
    public final ResultPoint m34111b(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i, int i2) {
        float m34110c = m34110c(resultPoint, resultPoint2) / i;
        float m34110c2 = m34110c(resultPoint3, resultPoint4);
        ResultPoint resultPoint5 = new ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint3.getX()) / m34110c2) * m34110c), resultPoint4.getY() + (m34110c * ((resultPoint4.getY() - resultPoint3.getY()) / m34110c2)));
        float m34110c3 = m34110c(resultPoint, resultPoint3) / i2;
        float m34110c4 = m34110c(resultPoint2, resultPoint4);
        ResultPoint resultPoint6 = new ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint2.getX()) / m34110c4) * m34110c3), resultPoint4.getY() + (m34110c3 * ((resultPoint4.getY() - resultPoint2.getY()) / m34110c4)));
        if (!m34108e(resultPoint5)) {
            if (m34108e(resultPoint6)) {
                return resultPoint6;
            }
            return null;
        } else if (!m34108e(resultPoint6)) {
            return resultPoint5;
        } else {
            if (Math.abs(i - m34106g(resultPoint3, resultPoint5).m34103c()) + Math.abs(i2 - m34106g(resultPoint2, resultPoint5).m34103c()) <= Math.abs(i - m34106g(resultPoint3, resultPoint6).m34103c()) + Math.abs(i2 - m34106g(resultPoint2, resultPoint6).m34103c())) {
                return resultPoint5;
            }
            return resultPoint6;
        }
    }

    public DetectorResult detect() throws NotFoundException {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        BitMatrix m34107f;
        int i;
        ResultPoint[] detect = this.f57816b.detect();
        ResultPoint resultPoint3 = detect[0];
        ResultPoint resultPoint4 = detect[1];
        ResultPoint resultPoint5 = detect[2];
        ResultPoint resultPoint6 = detect[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(m34106g(resultPoint3, resultPoint4));
        arrayList.add(m34106g(resultPoint3, resultPoint5));
        arrayList.add(m34106g(resultPoint4, resultPoint6));
        arrayList.add(m34106g(resultPoint5, resultPoint6));
        ResultPoint resultPoint7 = null;
        Collections.sort(arrayList, new ResultPointsAndTransitionsComparator());
        C9019b c9019b = (C9019b) arrayList.get(0);
        C9019b c9019b2 = (C9019b) arrayList.get(1);
        HashMap hashMap = new HashMap();
        m34109d(hashMap, c9019b.m34105a());
        m34109d(hashMap, c9019b.m34104b());
        m34109d(hashMap, c9019b2.m34105a());
        m34109d(hashMap, c9019b2.m34104b());
        ResultPoint resultPoint8 = null;
        ResultPoint resultPoint9 = null;
        for (Map.Entry entry : hashMap.entrySet()) {
            ResultPoint resultPoint10 = (ResultPoint) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                resultPoint8 = resultPoint10;
            } else if (resultPoint7 == null) {
                resultPoint7 = resultPoint10;
            } else {
                resultPoint9 = resultPoint10;
            }
        }
        if (resultPoint7 != null && resultPoint8 != null && resultPoint9 != null) {
            ResultPoint[] resultPointArr = {resultPoint7, resultPoint8, resultPoint9};
            ResultPoint.orderBestPatterns(resultPointArr);
            ResultPoint resultPoint11 = resultPointArr[0];
            ResultPoint resultPoint12 = resultPointArr[1];
            ResultPoint resultPoint13 = resultPointArr[2];
            if (!hashMap.containsKey(resultPoint3)) {
                resultPoint = resultPoint3;
            } else if (!hashMap.containsKey(resultPoint4)) {
                resultPoint = resultPoint4;
            } else if (!hashMap.containsKey(resultPoint5)) {
                resultPoint = resultPoint5;
            } else {
                resultPoint = resultPoint6;
            }
            int m34103c = m34106g(resultPoint13, resultPoint).m34103c();
            int m34103c2 = m34106g(resultPoint11, resultPoint).m34103c();
            if ((m34103c & 1) == 1) {
                m34103c++;
            }
            int i2 = m34103c + 2;
            if ((m34103c2 & 1) == 1) {
                m34103c2++;
            }
            int i3 = m34103c2 + 2;
            if (i2 * 4 < i3 * 7 && i3 * 4 < i2 * 7) {
                ResultPoint m34112a = m34112a(resultPoint12, resultPoint11, resultPoint13, resultPoint, Math.min(i3, i2));
                if (m34112a != null) {
                    resultPoint = m34112a;
                }
                int max = Math.max(m34106g(resultPoint13, resultPoint).m34103c(), m34106g(resultPoint11, resultPoint).m34103c());
                int i4 = max + 1;
                if ((i4 & 1) == 1) {
                    i = max + 2;
                } else {
                    i = i4;
                }
                m34107f = m34107f(this.f57815a, resultPoint13, resultPoint12, resultPoint11, resultPoint, i, i);
                resultPoint2 = resultPoint13;
            } else {
                resultPoint2 = resultPoint13;
                ResultPoint m34111b = m34111b(resultPoint12, resultPoint11, resultPoint13, resultPoint, i2, i3);
                if (m34111b != null) {
                    resultPoint = m34111b;
                }
                int m34103c3 = m34106g(resultPoint2, resultPoint).m34103c();
                int m34103c4 = m34106g(resultPoint11, resultPoint).m34103c();
                if ((m34103c3 & 1) == 1) {
                    m34103c3++;
                }
                int i5 = m34103c3;
                if ((m34103c4 & 1) == 1) {
                    m34103c4++;
                }
                m34107f = m34107f(this.f57815a, resultPoint2, resultPoint12, resultPoint11, resultPoint, i5, m34103c4);
            }
            return new DetectorResult(m34107f, new ResultPoint[]{resultPoint2, resultPoint12, resultPoint11, resultPoint});
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: e */
    public final boolean m34108e(ResultPoint resultPoint) {
        if (resultPoint.getX() >= 0.0f && resultPoint.getX() < this.f57815a.getWidth() && resultPoint.getY() > 0.0f && resultPoint.getY() < this.f57815a.getHeight()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final C9019b m34106g(ResultPoint resultPoint, ResultPoint resultPoint2) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int x = (int) resultPoint.getX();
        int y = (int) resultPoint.getY();
        int x2 = (int) resultPoint2.getX();
        int y2 = (int) resultPoint2.getY();
        int i6 = 0;
        int i7 = 1;
        if (Math.abs(y2 - y) > Math.abs(x2 - x)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            y = x;
            x = y;
            y2 = x2;
            x2 = y2;
        }
        int abs = Math.abs(x2 - x);
        int abs2 = Math.abs(y2 - y);
        int i8 = (-abs) / 2;
        if (y < y2) {
            i = 1;
        } else {
            i = -1;
        }
        if (x >= x2) {
            i7 = -1;
        }
        BitMatrix bitMatrix = this.f57815a;
        if (z) {
            i2 = y;
        } else {
            i2 = x;
        }
        if (z) {
            i3 = x;
        } else {
            i3 = y;
        }
        boolean z2 = bitMatrix.get(i2, i3);
        while (x != x2) {
            BitMatrix bitMatrix2 = this.f57815a;
            if (z) {
                i4 = y;
            } else {
                i4 = x;
            }
            if (z) {
                i5 = x;
            } else {
                i5 = y;
            }
            boolean z3 = bitMatrix2.get(i4, i5);
            if (z3 != z2) {
                i6++;
                z2 = z3;
            }
            i8 += abs2;
            if (i8 > 0) {
                if (y == y2) {
                    break;
                }
                y += i;
                i8 -= abs;
            }
            x += i7;
        }
        return new C9019b(resultPoint, resultPoint2, i6);
    }
}
