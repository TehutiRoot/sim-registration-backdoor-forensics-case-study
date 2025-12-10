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
    public final BitMatrix f57827a;

    /* renamed from: b */
    public final WhiteRectangleDetector f57828b;

    /* loaded from: classes5.dex */
    public static final class ResultPointsAndTransitionsComparator implements Serializable, Comparator<C9008b> {
        private ResultPointsAndTransitionsComparator() {
        }

        @Override // java.util.Comparator
        public int compare(C9008b c9008b, C9008b c9008b2) {
            return c9008b.m34095c() - c9008b2.m34095c();
        }
    }

    /* renamed from: com.google.zxing.datamatrix.detector.Detector$b */
    /* loaded from: classes5.dex */
    public static final class C9008b {

        /* renamed from: a */
        public final ResultPoint f57829a;

        /* renamed from: b */
        public final ResultPoint f57830b;

        /* renamed from: c */
        public final int f57831c;

        /* renamed from: a */
        public ResultPoint m34097a() {
            return this.f57829a;
        }

        /* renamed from: b */
        public ResultPoint m34096b() {
            return this.f57830b;
        }

        /* renamed from: c */
        public int m34095c() {
            return this.f57831c;
        }

        public String toString() {
            return this.f57829a + RemoteSettings.FORWARD_SLASH_STRING + this.f57830b + '/' + this.f57831c;
        }

        public C9008b(ResultPoint resultPoint, ResultPoint resultPoint2, int i) {
            this.f57829a = resultPoint;
            this.f57830b = resultPoint2;
            this.f57831c = i;
        }
    }

    public Detector(BitMatrix bitMatrix) throws NotFoundException {
        this.f57827a = bitMatrix;
        this.f57828b = new WhiteRectangleDetector(bitMatrix);
    }

    /* renamed from: c */
    public static int m34102c(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.round(ResultPoint.distance(resultPoint, resultPoint2));
    }

    /* renamed from: d */
    public static void m34101d(Map map, ResultPoint resultPoint) {
        Integer num = (Integer) map.get(resultPoint);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        map.put(resultPoint, Integer.valueOf(i));
    }

    /* renamed from: f */
    public static BitMatrix m34099f(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i, int i2) {
        float f = i - 0.5f;
        float f2 = i2 - 0.5f;
        return GridSampler.getInstance().sampleGrid(bitMatrix, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, resultPoint.getX(), resultPoint.getY(), resultPoint4.getX(), resultPoint4.getY(), resultPoint3.getX(), resultPoint3.getY(), resultPoint2.getX(), resultPoint2.getY());
    }

    /* renamed from: a */
    public final ResultPoint m34104a(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i) {
        float f = i;
        float m34102c = m34102c(resultPoint, resultPoint2) / f;
        float m34102c2 = m34102c(resultPoint3, resultPoint4);
        ResultPoint resultPoint5 = new ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint3.getX()) / m34102c2) * m34102c), resultPoint4.getY() + (m34102c * ((resultPoint4.getY() - resultPoint3.getY()) / m34102c2)));
        float m34102c3 = m34102c(resultPoint, resultPoint3) / f;
        float m34102c4 = m34102c(resultPoint2, resultPoint4);
        ResultPoint resultPoint6 = new ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint2.getX()) / m34102c4) * m34102c3), resultPoint4.getY() + (m34102c3 * ((resultPoint4.getY() - resultPoint2.getY()) / m34102c4)));
        if (!m34100e(resultPoint5)) {
            if (m34100e(resultPoint6)) {
                return resultPoint6;
            }
            return null;
        } else if (!m34100e(resultPoint6)) {
            return resultPoint5;
        } else {
            if (Math.abs(m34098g(resultPoint3, resultPoint5).m34095c() - m34098g(resultPoint2, resultPoint5).m34095c()) <= Math.abs(m34098g(resultPoint3, resultPoint6).m34095c() - m34098g(resultPoint2, resultPoint6).m34095c())) {
                return resultPoint5;
            }
            return resultPoint6;
        }
    }

    /* renamed from: b */
    public final ResultPoint m34103b(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i, int i2) {
        float m34102c = m34102c(resultPoint, resultPoint2) / i;
        float m34102c2 = m34102c(resultPoint3, resultPoint4);
        ResultPoint resultPoint5 = new ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint3.getX()) / m34102c2) * m34102c), resultPoint4.getY() + (m34102c * ((resultPoint4.getY() - resultPoint3.getY()) / m34102c2)));
        float m34102c3 = m34102c(resultPoint, resultPoint3) / i2;
        float m34102c4 = m34102c(resultPoint2, resultPoint4);
        ResultPoint resultPoint6 = new ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint2.getX()) / m34102c4) * m34102c3), resultPoint4.getY() + (m34102c3 * ((resultPoint4.getY() - resultPoint2.getY()) / m34102c4)));
        if (!m34100e(resultPoint5)) {
            if (m34100e(resultPoint6)) {
                return resultPoint6;
            }
            return null;
        } else if (!m34100e(resultPoint6)) {
            return resultPoint5;
        } else {
            if (Math.abs(i - m34098g(resultPoint3, resultPoint5).m34095c()) + Math.abs(i2 - m34098g(resultPoint2, resultPoint5).m34095c()) <= Math.abs(i - m34098g(resultPoint3, resultPoint6).m34095c()) + Math.abs(i2 - m34098g(resultPoint2, resultPoint6).m34095c())) {
                return resultPoint5;
            }
            return resultPoint6;
        }
    }

    public DetectorResult detect() throws NotFoundException {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        BitMatrix m34099f;
        int i;
        ResultPoint[] detect = this.f57828b.detect();
        ResultPoint resultPoint3 = detect[0];
        ResultPoint resultPoint4 = detect[1];
        ResultPoint resultPoint5 = detect[2];
        ResultPoint resultPoint6 = detect[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(m34098g(resultPoint3, resultPoint4));
        arrayList.add(m34098g(resultPoint3, resultPoint5));
        arrayList.add(m34098g(resultPoint4, resultPoint6));
        arrayList.add(m34098g(resultPoint5, resultPoint6));
        ResultPoint resultPoint7 = null;
        Collections.sort(arrayList, new ResultPointsAndTransitionsComparator());
        C9008b c9008b = (C9008b) arrayList.get(0);
        C9008b c9008b2 = (C9008b) arrayList.get(1);
        HashMap hashMap = new HashMap();
        m34101d(hashMap, c9008b.m34097a());
        m34101d(hashMap, c9008b.m34096b());
        m34101d(hashMap, c9008b2.m34097a());
        m34101d(hashMap, c9008b2.m34096b());
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
            int m34095c = m34098g(resultPoint13, resultPoint).m34095c();
            int m34095c2 = m34098g(resultPoint11, resultPoint).m34095c();
            if ((m34095c & 1) == 1) {
                m34095c++;
            }
            int i2 = m34095c + 2;
            if ((m34095c2 & 1) == 1) {
                m34095c2++;
            }
            int i3 = m34095c2 + 2;
            if (i2 * 4 < i3 * 7 && i3 * 4 < i2 * 7) {
                ResultPoint m34104a = m34104a(resultPoint12, resultPoint11, resultPoint13, resultPoint, Math.min(i3, i2));
                if (m34104a != null) {
                    resultPoint = m34104a;
                }
                int max = Math.max(m34098g(resultPoint13, resultPoint).m34095c(), m34098g(resultPoint11, resultPoint).m34095c());
                int i4 = max + 1;
                if ((i4 & 1) == 1) {
                    i = max + 2;
                } else {
                    i = i4;
                }
                m34099f = m34099f(this.f57827a, resultPoint13, resultPoint12, resultPoint11, resultPoint, i, i);
                resultPoint2 = resultPoint13;
            } else {
                resultPoint2 = resultPoint13;
                ResultPoint m34103b = m34103b(resultPoint12, resultPoint11, resultPoint13, resultPoint, i2, i3);
                if (m34103b != null) {
                    resultPoint = m34103b;
                }
                int m34095c3 = m34098g(resultPoint2, resultPoint).m34095c();
                int m34095c4 = m34098g(resultPoint11, resultPoint).m34095c();
                if ((m34095c3 & 1) == 1) {
                    m34095c3++;
                }
                int i5 = m34095c3;
                if ((m34095c4 & 1) == 1) {
                    m34095c4++;
                }
                m34099f = m34099f(this.f57827a, resultPoint2, resultPoint12, resultPoint11, resultPoint, i5, m34095c4);
            }
            return new DetectorResult(m34099f, new ResultPoint[]{resultPoint2, resultPoint12, resultPoint11, resultPoint});
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: e */
    public final boolean m34100e(ResultPoint resultPoint) {
        if (resultPoint.getX() >= 0.0f && resultPoint.getX() < this.f57827a.getWidth() && resultPoint.getY() > 0.0f && resultPoint.getY() < this.f57827a.getHeight()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final C9008b m34098g(ResultPoint resultPoint, ResultPoint resultPoint2) {
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
        BitMatrix bitMatrix = this.f57827a;
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
            BitMatrix bitMatrix2 = this.f57827a;
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
        return new C9008b(resultPoint, resultPoint2, i6);
    }
}