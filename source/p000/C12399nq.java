package p000;

import android.graphics.PointF;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.pdmodel.PDAppearanceContentStream;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import java.util.ArrayList;

/* renamed from: nq */
/* loaded from: classes5.dex */
public class C12399nq {

    /* renamed from: k */
    public static final double f72471k = Math.toRadians(34.0d);

    /* renamed from: l */
    public static final double f72472l = Math.toRadians(30.0d);

    /* renamed from: m */
    public static final double f72473m = Math.toRadians(12.0d);

    /* renamed from: a */
    public final PDAppearanceContentStream f72474a;

    /* renamed from: b */
    public final PDRectangle f72475b;

    /* renamed from: c */
    public final double f72476c;

    /* renamed from: d */
    public final double f72477d;

    /* renamed from: e */
    public PDRectangle f72478e;

    /* renamed from: f */
    public boolean f72479f = false;

    /* renamed from: g */
    public double f72480g;

    /* renamed from: h */
    public double f72481h;

    /* renamed from: i */
    public double f72482i;

    /* renamed from: j */
    public double f72483j;

    public C12399nq(PDAppearanceContentStream pDAppearanceContentStream, double d, double d2, PDRectangle pDRectangle) {
        this.f72474a = pDAppearanceContentStream;
        this.f72476c = d;
        this.f72477d = d2;
        this.f72475b = pDRectangle;
    }

    /* renamed from: J */
    public static double m26036J(double d, double d2) {
        if (Double.compare(d2, 0.0d) == 0) {
            return 0.0d;
        }
        return d / d2;
    }

    /* renamed from: j */
    public static double m26025j(double d, double d2) {
        if (Double.compare(d2, 0.0d) == 0) {
            return 0.0d;
        }
        return d / d2;
    }

    /* renamed from: q */
    public static PointF[] m26018q(double d, double d2, double d3, double d4) {
        return new PointF[0];
    }

    /* renamed from: A */
    public PDRectangle m26045A() {
        PDRectangle pDRectangle = this.f72475b;
        if (pDRectangle == null) {
            float f = ((float) this.f72477d) / 2.0f;
            double d = this.f72477d;
            return new PDRectangle(f, f, (float) d, (float) d);
        }
        PDRectangle pDRectangle2 = this.f72478e;
        if (pDRectangle2 != null) {
            pDRectangle = pDRectangle2;
        }
        float lowerLeftX = pDRectangle.getLowerLeftX() - ((float) this.f72480g);
        float lowerLeftY = pDRectangle.getLowerLeftY() - ((float) this.f72481h);
        return new PDRectangle(lowerLeftX, lowerLeftY, (((float) this.f72482i) - pDRectangle.getUpperRightX()) - lowerLeftX, (((float) this.f72483j) - pDRectangle.getUpperRightY()) - lowerLeftY);
    }

    /* renamed from: B */
    public PDRectangle m26044B() {
        double d = this.f72480g;
        double d2 = this.f72481h;
        return new PDRectangle((float) d, (float) d2, (float) (this.f72482i - d), (float) (this.f72483j - d2));
    }

    /* renamed from: C */
    public final void m26043C(double d, double d2) {
        if (this.f72479f) {
            m26035K(d, d2);
        } else {
            m26031d(d, d2);
        }
        this.f72474a.lineTo((float) d, (float) d2);
    }

    /* renamed from: D */
    public final void m26042D(PointF pointF) {
        m26043C(pointF.x, pointF.y);
    }

    /* renamed from: E */
    public final void m26041E(double d, double d2) {
        if (this.f72479f) {
            m26035K(d, d2);
        } else {
            m26031d(d, d2);
        }
        this.f72474a.moveTo((float) d, (float) d2);
    }

    /* renamed from: F */
    public final void m26040F(PointF pointF) {
        m26041E(pointF.x, pointF.y);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:5:0x001c -> B:6:0x001e). Please submit an issue!!! */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m26039G(android.graphics.PointF[] r21, double r22, double r24) {
        /*
            r20 = this;
            r0 = r21
            int r1 = r0.length
            int r2 = r1 % 3
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L1c
            r2 = r0[r3]
            float r3 = r2.x
            double r5 = (double) r3
            double r5 = r5 + r22
            float r2 = r2.y
            double r2 = (double) r2
            double r2 = r2 + r24
            r14 = r20
            r14.m26041E(r5, r2)
            r3 = 1
            goto L1e
        L1c:
            r14 = r20
        L1e:
            int r2 = r3 + 2
            if (r2 >= r1) goto L51
            r4 = r0[r3]
            int r5 = r3 + 1
            r5 = r0[r5]
            r2 = r0[r2]
            float r6 = r4.x
            double r6 = (double) r6
            double r8 = r6 + r22
            float r4 = r4.y
            double r6 = (double) r4
            double r10 = r6 + r24
            float r4 = r5.x
            double r6 = (double) r4
            double r12 = r6 + r22
            float r4 = r5.y
            double r4 = (double) r4
            double r4 = r4 + r24
            float r6 = r2.x
            double r6 = (double) r6
            double r16 = r6 + r22
            float r2 = r2.y
            double r6 = (double) r2
            double r18 = r6 + r24
            r7 = r20
            r14 = r4
            r7.m26021n(r8, r10, r12, r14, r16, r18)
            int r3 = r3 + 3
            goto L1c
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C12399nq.m26039G(android.graphics.PointF[], double, double):void");
    }

    /* renamed from: H */
    public final PointF[] m26038H(PointF[] pointFArr) {
        int length = pointFArr.length;
        if (length <= 2) {
            return pointFArr;
        }
        PointF pointF = pointFArr[0];
        int i = 1;
        int i2 = length;
        while (i < length) {
            PointF pointF2 = pointFArr[i];
            if (Math.abs(pointF2.x - pointF.x) < 0.5d && Math.abs(pointF2.y - pointF.y) < 0.5d) {
                pointFArr[i] = null;
                i2--;
            }
            i++;
            pointF = pointF2;
        }
        if (i2 == length) {
            return pointFArr;
        }
        PointF[] pointFArr2 = new PointF[i2];
        int i3 = 0;
        for (PointF pointF3 : pointFArr) {
            if (pointF3 != null) {
                pointFArr2[i3] = pointF3;
                i3++;
            }
        }
        return pointFArr2;
    }

    /* renamed from: I */
    public final void m26037I(PointF[] pointFArr) {
        int length = pointFArr.length;
        int i = length / 2;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = (length - i2) - 1;
            PointF pointF = pointFArr[i2];
            pointFArr[i2] = pointFArr[i3];
            pointFArr[i3] = pointF;
        }
    }

    /* renamed from: K */
    public final void m26035K(double d, double d2) {
        this.f72480g = Math.min(this.f72480g, d);
        this.f72481h = Math.min(this.f72481h, d2);
        this.f72482i = Math.max(this.f72482i, d);
        this.f72483j = Math.max(this.f72483j, d2);
    }

    /* renamed from: a */
    public final void m26034a(double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z) {
        double d8 = d + 3.141592653589793d + d7;
        double radians = d8 - Math.toRadians(22.0d);
        m26016s(d8, radians, d4, d5, d3, d3, null, z);
        m26017r(radians, d2 - d6, d3, d3, d4, d5, null, false);
    }

    /* renamed from: b */
    public final void m26033b(double d, double d2, double d3, double d4, double d5) {
        double d6 = d + 3.141592653589793d;
        double d7 = d6 + d3;
        double d8 = f72472l;
        m26016s(d7, d7 - d8, d4, d5, d2, d2, null, false);
        double d9 = d6 + 1.5707963267948966d;
        m26016s(d7 - d8, d9, d4, d5, d2, d2, null, false);
        m26016s(d9, (d6 + 3.141592653589793d) - f72471k, d4, d5, d2, d2, null, false);
    }

    /* renamed from: c */
    public final PDRectangle m26032c(PDRectangle pDRectangle, double d) {
        double d2;
        double d3;
        double d4;
        double d5 = d;
        float lowerLeftX = this.f72475b.getLowerLeftX();
        float lowerLeftY = this.f72475b.getLowerLeftY();
        float upperRightX = this.f72475b.getUpperRightX();
        float upperRightY = this.f72475b.getUpperRightY();
        float min = Math.min(lowerLeftX, upperRightX);
        float min2 = Math.min(lowerLeftY, upperRightY);
        float max = Math.max(min, upperRightX);
        float max2 = Math.max(min2, upperRightY);
        if (pDRectangle != null) {
            double max3 = Math.max(pDRectangle.getLowerLeftX(), d5);
            d3 = Math.max(pDRectangle.getLowerLeftY(), d5);
            d4 = Math.max(pDRectangle.getUpperRightX(), d5);
            double max4 = Math.max(pDRectangle.getUpperRightY(), d5);
            d5 = max3;
            d2 = max4;
        } else {
            d2 = d5;
            d3 = d2;
            d4 = d3;
        }
        float f = (float) (min + d5);
        float f2 = (float) (min2 + d3);
        return new PDRectangle(f, f2, ((float) (max - d4)) - f, ((float) (max2 - d2)) - f2);
    }

    /* renamed from: d */
    public final void m26031d(double d, double d2) {
        this.f72480g = d;
        this.f72481h = d2;
        this.f72482i = d;
        this.f72483j = d2;
        this.f72479f = true;
        this.f72474a.setLineJoinStyle(2);
    }

    /* renamed from: e */
    public final void m26030e(double d, double d2, double d3, double d4) {
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        int i;
        double d10;
        double d11;
        float f;
        float f2;
        float f3;
        float f4;
        int i2;
        double d12;
        double d13;
        PointF pointF;
        if (this.f72476c <= 0.0d) {
            m26020o(d, d2, d3, d4);
            return;
        }
        double d14 = d3 - d;
        double d15 = d4 - d2;
        double m26014u = m26014u();
        double d16 = m26014u * 0.5d;
        if (d14 < d16 && d15 < d16) {
            m26020o(d, d2, d3, d4);
        } else if ((d14 < 5.0d && d15 > 20.0d) || (d14 > 20.0d && d15 < 5.0d)) {
            m26028g(d, d2, d3, d4, true);
        } else {
            double sin = (Math.sin(f72473m) * m26014u) - 1.5d;
            double d17 = sin * 2.0d;
            if (d14 > d17) {
                d6 = d + sin;
                d5 = d3 - sin;
            } else {
                double d18 = (d + d3) / 2.0d;
                d5 = d18 + 0.1d;
                d6 = d18 - 0.1d;
            }
            if (d15 > d17) {
                d8 = d4 - sin;
                d7 = d2 + sin;
            } else {
                double d19 = (d4 + d2) / 2.0d;
                d7 = d19 - 0.1d;
                d8 = d19 + 0.1d;
            }
            PointF[] m26018q = m26018q(d6, d7, d5, d8);
            int length = m26018q.length;
            if (length < 2) {
                return;
            }
            double d20 = 0.0d;
            for (int i3 = 1; i3 < length; i3++) {
                float f5 = m26018q[i3].x;
                PointF pointF2 = m26018q[i3 - 1];
                d20 += Math.hypot(f5 - pointF2.x, pointF.y - pointF2.y);
            }
            double cos = Math.cos(f72471k) * 2.0d;
            int ceil = (int) Math.ceil(d20 / (m26014u * cos));
            if (ceil < 2) {
                m26020o(d, d2, d3, d4);
                return;
            }
            double d21 = d20 / ceil;
            double d22 = d21 / cos;
            if (d22 < 0.5d) {
                d21 = cos * 0.5d;
                d9 = 0.5d;
            } else if (d22 < 3.0d) {
                m26020o(d, d2, d3, d4);
                return;
            } else {
                d9 = d22;
            }
            double d23 = d21;
            PointF[] pointFArr = new PointF[ceil];
            double d24 = this.f72477d * 0.1d;
            int i4 = 0;
            double d25 = 0.0d;
            int i5 = 0;
            while (true) {
                int i6 = i4 + 1;
                if (i6 >= length) {
                    break;
                }
                PointF pointF3 = m26018q[i4];
                PointF pointF4 = m26018q[i6];
                PointF[] pointFArr2 = m26018q;
                int i7 = i5;
                double d26 = pointF4.x - pointF3.x;
                double d27 = pointF4.y - pointF3.y;
                double hypot = Math.hypot(f - f2, f3 - f4);
                if (Double.compare(hypot, 0.0d) == 0) {
                    i2 = length;
                    d12 = d24;
                } else {
                    double d28 = hypot + d25;
                    double d29 = d23 - d24;
                    if (d28 < d29 && i4 != length - 2) {
                        i2 = length;
                        d12 = d24;
                        d25 = d28;
                    } else {
                        double m26025j = m26025j(d26, hypot);
                        i2 = length;
                        double m26036J = m26036J(d27, hypot);
                        double d30 = d23 - d25;
                        int i8 = i7;
                        while (true) {
                            d12 = d24;
                            double d31 = pointF3.x + (d30 * m26025j);
                            double d32 = m26025j;
                            double d33 = pointF3.y + (d30 * m26036J);
                            if (i8 < ceil) {
                                d13 = m26036J;
                                pointFArr[i8] = new PointF((float) d31, (float) d33);
                                i8++;
                            } else {
                                d13 = m26036J;
                            }
                            d28 -= d23;
                            d30 += d23;
                            if (d28 < d29) {
                                break;
                            }
                            d24 = d12;
                            m26025j = d32;
                            m26036J = d13;
                        }
                        if (d28 < 0.0d) {
                            d25 = 0.0d;
                        } else {
                            d25 = d28;
                        }
                        i5 = i8;
                        d24 = d12;
                        length = i2;
                        m26018q = pointFArr2;
                        i4 = i6;
                    }
                }
                i5 = i7;
                d24 = d12;
                length = i2;
                m26018q = pointFArr2;
                i4 = i6;
            }
            double d34 = 0.0d;
            double d35 = 0.0d;
            int i9 = 0;
            while (i9 < i5) {
                int i10 = i9 + 1;
                if (i10 >= i5) {
                    i = 0;
                } else {
                    i = i10;
                }
                PointF pointF5 = pointFArr[i9];
                PointF pointF6 = pointFArr[i];
                if (i9 == 0) {
                    PointF pointF7 = pointFArr[i5 - 1];
                    d11 = Math.atan2(pointF5.y - pointF7.y, pointF5.x - pointF7.x);
                    d10 = m26027h(pointF7, pointF5, d9, d23);
                } else {
                    d10 = d34;
                    d11 = d35;
                }
                double atan2 = Math.atan2(pointF6.y - pointF5.y, pointF6.x - pointF5.x);
                double m26027h = m26027h(pointF5, pointF6, d9, d23);
                m26034a(d11, atan2, d9, pointF5.x, pointF5.y, m26027h, d10, !this.f72479f);
                i9 = i10;
                d35 = atan2;
                d34 = m26027h;
                pointFArr = pointFArr;
                i5 = i5;
            }
        }
    }

    /* renamed from: f */
    public final void m26029f(PointF[] pointFArr, boolean z) {
        double m26011x;
        double d;
        PointF pointF;
        int i;
        int i2;
        double d2;
        PointF[] pointFArr2;
        int i3;
        C12399nq c12399nq;
        double d3;
        int i4;
        C12399nq c12399nq2 = this;
        PointF[] m26038H = m26038H(pointFArr);
        c12399nq2.m26009z(m26038H);
        int length = m26038H.length;
        if (length < 2) {
            return;
        }
        if (c12399nq2.f72476c <= 0.0d) {
            c12399nq2.m26040F(m26038H[0]);
            for (int i5 = 1; i5 < length; i5++) {
                c12399nq2.m26042D(m26038H[i5]);
            }
            return;
        }
        if (z) {
            m26011x = m26014u();
        } else {
            m26011x = m26011x();
        }
        if (m26011x < 0.5d) {
            d = 0.5d;
        } else {
            d = m26011x;
        }
        double d4 = f72471k;
        double cos = Math.cos(d4);
        double d5 = cos * 2.0d * d;
        double d6 = cos * d;
        double[] dArr = new double[2];
        float f = m26038H[0].x;
        int i6 = length - 2;
        PointF pointF2 = m26038H[i6];
        double d7 = d;
        if (m26026i(d5, d6, cos, d, Math.hypot(f - pointF2.x, pointF.y - pointF2.y), dArr) == 0) {
            d4 = dArr[0];
        }
        double d8 = d4;
        double d9 = 0.0d;
        int i7 = 0;
        while (true) {
            int i8 = i7 + 1;
            if (i8 < length) {
                PointF pointF3 = m26038H[i7];
                PointF pointF4 = m26038H[i8];
                double hypot = Math.hypot(pointF4.x - pointF3.x, pointF4.y - pointF3.y);
                if (Double.compare(hypot, 0.0d) == 0) {
                    d8 = f72471k;
                    d3 = d7;
                    i2 = i8;
                    pointFArr2 = m26038H;
                    i = length;
                } else {
                    i = length;
                    i2 = i8;
                    int m26026i = m26026i(d5, d6, cos, d7, hypot, dArr);
                    if (m26026i < 0) {
                        if (!c12399nq2.f72479f) {
                            c12399nq2.m26040F(pointF3);
                        }
                        d3 = d7;
                        pointFArr2 = m26038H;
                    } else {
                        double d10 = dArr[0];
                        double d11 = dArr[1];
                        double atan2 = Math.atan2(pointF4.y - pointF3.y, pointF4.x - pointF3.x);
                        if (i7 == 0) {
                            PointF pointF5 = m26038H[i6];
                            d2 = Math.atan2(pointF3.y - pointF5.y, pointF3.x - pointF5.x);
                        } else {
                            d2 = d9;
                        }
                        double m26025j = m26025j(pointF4.x - pointF3.x, hypot);
                        double m26036J = m26036J(pointF4.y - pointF3.y, hypot);
                        float f2 = pointF3.x;
                        float f3 = pointF3.y;
                        pointFArr2 = m26038H;
                        m26034a(d2, atan2, d7, f2, f3, d10, d8, !c12399nq2.f72479f);
                        double d12 = d5 + (d11 * 2.0d);
                        double d13 = f2 + (d12 * m26025j);
                        double d14 = f3 + (d12 * m26036J);
                        if (m26026i >= 1) {
                            i3 = m26026i;
                            m26033b(atan2, d7, d10, d13, d14);
                            d13 += d5 * m26025j;
                            d14 += d5 * m26036J;
                            c12399nq = this;
                            d3 = d7;
                            i4 = i3 - 1;
                        } else {
                            i3 = m26026i;
                            c12399nq = this;
                            d3 = d7;
                            i4 = i3;
                        }
                        double d15 = atan2;
                        PointF[] m26013v = c12399nq.m26013v(d15, d3);
                        int i9 = 0;
                        while (i9 < i4) {
                            m26039G(m26013v, d13, d14);
                            d13 += d5 * m26025j;
                            d14 += d5 * m26036J;
                            i9++;
                            d15 = d15;
                        }
                        double d16 = d15;
                        if (i3 == 0) {
                            d8 = d10;
                        } else {
                            d8 = f72471k;
                        }
                        d9 = d16;
                        c12399nq2 = c12399nq;
                        d7 = d3;
                        m26038H = pointFArr2;
                        length = i;
                        i7 = i2;
                    }
                }
                c12399nq = c12399nq2;
                c12399nq2 = c12399nq;
                d7 = d3;
                m26038H = pointFArr2;
                length = i;
                i7 = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public final void m26028g(double d, double d2, double d3, double d4, boolean z) {
        boolean z2;
        PointF[] pointFArr;
        double d5 = d3 - d;
        double d6 = d4 - d2;
        if (this.f72476c <= 0.0d) {
            this.f72474a.addRect((float) d, (float) d2, (float) d5, (float) d6);
            this.f72480g = d;
            this.f72481h = d2;
            this.f72482i = d3;
            this.f72483j = d4;
            return;
        }
        if (d5 < 1.0d) {
            float f = (float) d;
            float f2 = (float) d2;
            pointFArr = new PointF[]{new PointF(f, f2), new PointF(f, (float) d4), new PointF(f, f2)};
            z2 = z;
        } else if (d6 < 1.0d) {
            float f3 = (float) d;
            float f4 = (float) d2;
            PointF[] pointFArr2 = {new PointF(f3, f4), new PointF((float) d3, f4), new PointF(f3, f4)};
            z2 = z;
            pointFArr = pointFArr2;
        } else {
            float f5 = (float) d;
            float f6 = (float) d2;
            float f7 = (float) d3;
            float f8 = (float) d4;
            PointF[] pointFArr3 = {new PointF(f5, f6), new PointF(f7, f6), new PointF(f7, f8), new PointF(f5, f8), new PointF(f5, f6)};
            z2 = z;
            pointFArr = pointFArr3;
        }
        m26029f(pointFArr, z2);
    }

    /* renamed from: h */
    public final double m26027h(PointF pointF, PointF pointF2, double d, double d2) {
        double hypot = Math.hypot(pointF2.x - pointF.x, pointF2.y - pointF.y);
        if (Double.compare(hypot, 0.0d) == 0) {
            return f72471k;
        }
        double d3 = ((d2 / 2.0d) + ((hypot - d2) / 2.0d)) / d;
        if (d3 < -1.0d || d3 > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d3);
    }

    /* renamed from: i */
    public final int m26026i(double d, double d2, double d3, double d4, double d5, double[] dArr) {
        double d6 = 0.0d;
        if (Double.compare(d5, 0.0d) == 0) {
            dArr[0] = f72471k;
            dArr[1] = 0.0d;
            return -1;
        }
        double d7 = d2 * 2.0d;
        int ceil = (int) Math.ceil((d5 - d7) / d);
        double d8 = (d5 - (d7 + (ceil * d))) / 2.0d;
        double d9 = ((d3 * d4) + d8) / d4;
        if (d9 >= -1.0d && d9 <= 1.0d) {
            d6 = Math.acos(d9);
        }
        dArr[0] = d6;
        dArr[1] = d8;
        return ceil;
    }

    /* renamed from: k */
    public void m26024k(PDRectangle pDRectangle) {
        PDRectangle m26032c = m26032c(pDRectangle, 0.0d);
        this.f72478e = m26032c;
        m26030e(m26032c.getLowerLeftX(), this.f72478e.getLowerLeftY(), this.f72478e.getUpperRightX(), this.f72478e.getUpperRightY());
        m26019p();
    }

    /* renamed from: l */
    public void m26023l(float[][] fArr) {
        int length = fArr.length;
        PointF[] pointFArr = new PointF[length];
        for (int i = 0; i < length; i++) {
            float[] fArr2 = fArr[i];
            if (fArr2.length == 2) {
                pointFArr[i] = new PointF(fArr2[0], fArr2[1]);
            } else if (fArr2.length == 6) {
                pointFArr[i] = new PointF(fArr2[4], fArr2[5]);
            }
        }
        m26029f(pointFArr, false);
        m26019p();
    }

    /* renamed from: m */
    public void m26022m(PDRectangle pDRectangle) {
        PDRectangle m26032c = m26032c(pDRectangle, this.f72477d / 2.0d);
        this.f72478e = m26032c;
        m26028g(m26032c.getLowerLeftX(), this.f72478e.getLowerLeftY(), this.f72478e.getUpperRightX(), this.f72478e.getUpperRightY(), false);
        m26019p();
    }

    /* renamed from: n */
    public final void m26021n(double d, double d2, double d3, double d4, double d5, double d6) {
        m26035K(d, d2);
        m26035K(d3, d4);
        m26035K(d5, d6);
        this.f72474a.curveTo((float) d, (float) d2, (float) d3, (float) d4, (float) d5, (float) d6);
    }

    /* renamed from: o */
    public final void m26020o(double d, double d2, double d3, double d4) {
        m26017r(0.0d, 6.283185307179586d, Math.abs(d3 - d) / 2.0d, Math.abs(d4 - d2) / 2.0d, (d + d3) / 2.0d, (d2 + d4) / 2.0d, null, true);
    }

    /* renamed from: p */
    public final void m26019p() {
        if (this.f72479f) {
            this.f72474a.closePath();
        }
        double d = this.f72477d;
        if (d > 0.0d) {
            double d2 = d / 2.0d;
            this.f72480g -= d2;
            this.f72481h -= d2;
            this.f72482i += d2;
            this.f72483j += d2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[LOOP:1: B:12:0x003e->B:14:0x0047, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m26017r(double r28, double r30, double r32, double r34, double r36, double r38, java.util.ArrayList r40, boolean r41) {
        /*
            r27 = this;
            r15 = r40
            double r0 = java.lang.Math.cos(r28)
            double r0 = r0 * r32
            double r0 = r0 + r36
            double r2 = java.lang.Math.sin(r28)
            double r2 = r2 * r34
            double r2 = r2 + r38
            double r4 = r30 - r28
            r16 = r4
        L16:
            r18 = 0
            int r4 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r4 >= 0) goto L24
            r4 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r16 = r16 + r4
            goto L16
        L24:
            if (r41 == 0) goto L32
            if (r15 == 0) goto L35
            android.graphics.PointF r4 = new android.graphics.PointF
            float r0 = (float) r0
            float r1 = (float) r2
            r4.<init>(r0, r1)
            r15.add(r4)
        L32:
            r14 = r27
            goto L3a
        L35:
            r14 = r27
            r14.m26041E(r0, r2)
        L3a:
            r20 = r16
            r22 = r18
        L3e:
            r24 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            int r0 = (r20 > r24 ? 1 : (r20 == r24 ? 0 : -1))
            if (r0 <= 0) goto L65
            double r1 = r28 + r22
            double r3 = r1 + r24
            r26 = 0
            r0 = r27
            r5 = r36
            r7 = r38
            r9 = r32
            r11 = r34
            r13 = r40
            r14 = r26
            r0.m26016s(r1, r3, r5, r7, r9, r11, r13, r14)
            double r22 = r22 + r24
            double r20 = r20 - r24
            r14 = r27
            goto L3e
        L65:
            int r0 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r0 <= 0) goto L7d
            double r1 = r28 + r22
            double r3 = r28 + r16
            r14 = 0
            r0 = r27
            r5 = r36
            r7 = r38
            r9 = r32
            r11 = r34
            r13 = r40
            r0.m26016s(r1, r3, r5, r7, r9, r11, r13, r14)
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C12399nq.m26017r(double, double, double, double, double, double, java.util.ArrayList, boolean):void");
    }

    /* renamed from: s */
    public final void m26016s(double d, double d2, double d3, double d4, double d5, double d6, ArrayList arrayList, boolean z) {
        double d7;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        double cos2 = Math.cos(d2);
        double sin2 = Math.sin(d2);
        double d8 = (d2 - d) / 2.0d;
        double sin3 = Math.sin(d8);
        if (Double.compare(sin3, 0.0d) == 0) {
            if (z) {
                double d9 = d3 + (cos * d5);
                double d10 = d4 + (sin * d6);
                if (arrayList != null) {
                    arrayList.add(new PointF((float) d9, (float) d10));
                    return;
                } else {
                    m26041E(d9, d10);
                    return;
                }
            }
            return;
        }
        double cos3 = ((1.0d - Math.cos(d8)) * 1.333333333d) / sin3;
        double d11 = d3 + ((cos - (cos3 * sin)) * d5);
        double d12 = d4 + (((cos3 * cos) + sin) * d6);
        double d13 = d3 + ((cos2 + (cos3 * sin2)) * d5);
        double d14 = d4 + ((sin2 - (cos3 * cos2)) * d6);
        double d15 = d3 + (cos2 * d5);
        double d16 = d4 + (sin2 * d6);
        if (z) {
            double d17 = d3 + (cos * d5);
            double d18 = d4 + (sin * d6);
            if (arrayList != null) {
                d7 = d16;
                arrayList.add(new PointF((float) d17, (float) d18));
            } else {
                d7 = d16;
                m26041E(d17, d18);
            }
        } else {
            d7 = d16;
        }
        if (arrayList != null) {
            arrayList.add(new PointF((float) d11, (float) d12));
            arrayList.add(new PointF((float) d13, (float) d14));
            arrayList.add(new PointF((float) d15, (float) d7));
            return;
        }
        m26021n(d11, d12, d13, d14, d15, d7);
    }

    /* renamed from: t */
    public PDRectangle m26015t() {
        return m26044B();
    }

    /* renamed from: u */
    public final double m26014u() {
        return (this.f72476c * 4.75d) + (this.f72477d * 0.5d);
    }

    /* renamed from: v */
    public final PointF[] m26013v(double d, double d2) {
        ArrayList arrayList = new ArrayList();
        double d3 = d + 3.141592653589793d;
        double d4 = f72471k;
        double d5 = f72473m;
        m26016s(d3 + d4, d3 + d5, 0.0d, 0.0d, d2, d2, arrayList, false);
        double d6 = d3 + d5;
        double d7 = d3 + 1.5707963267948966d;
        m26016s(d6, d7, 0.0d, 0.0d, d2, d2, arrayList, false);
        m26016s(d7, (d3 + 3.141592653589793d) - d4, 0.0d, 0.0d, d2, d2, arrayList, false);
        return (PointF[]) arrayList.toArray(new PointF[arrayList.size()]);
    }

    /* renamed from: w */
    public AffineTransform m26012w() {
        return AffineTransform.getTranslateInstance(-this.f72480g, -this.f72481h);
    }

    /* renamed from: x */
    public final double m26011x() {
        return (this.f72476c * 4.0d) + (this.f72477d * 0.5d);
    }

    /* renamed from: y */
    public final double m26010y(PointF[] pointFArr) {
        int length = pointFArr.length;
        double d = 0.0d;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            PointF pointF = pointFArr[i];
            float f = pointF.x;
            PointF pointF2 = pointFArr[i2 % length];
            d += (f * pointF2.y) - (pointF.y * pointF2.x);
            i = i2;
        }
        return d;
    }

    /* renamed from: z */
    public final void m26009z(PointF[] pointFArr) {
        if (m26010y(pointFArr) < 0.0d) {
            m26037I(pointFArr);
        }
    }
}
