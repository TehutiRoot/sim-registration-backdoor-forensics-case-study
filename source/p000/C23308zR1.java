package p000;

import android.graphics.PointF;
import java.lang.reflect.Array;
import java.util.List;

/* renamed from: zR1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C23308zR1 extends AbstractC18307Qh1 {
    public C23308zR1(PointF[] pointFArr, float[][] fArr) {
        super(fArr);
        this.f5131a = m82r(pointFArr);
        this.f5133c = m88l();
        this.f5134d = m85o();
    }

    /* renamed from: l */
    private int[] m88l() {
        int[] iArr = {4, 4};
        PointF[] pointFArr = new PointF[4];
        PointF[] pointFArr2 = new PointF[4];
        for (int i = 0; i < 4; i++) {
            PointF[][] pointFArr3 = this.f5131a;
            pointFArr[i] = pointFArr3[i][0];
            pointFArr2[i] = pointFArr3[i][3];
        }
        if (m66530j(pointFArr) && m66530j(pointFArr2) && !m84p(this.f5131a[1][1]) && !m84p(this.f5131a[1][2]) && !m84p(this.f5131a[2][1]) && !m84p(this.f5131a[2][2])) {
            double m66532h = m66532h(pointFArr[0], pointFArr[3]);
            double m66532h2 = m66532h(pointFArr2[0], pointFArr2[3]);
            if (m66532h <= 800.0d && m66532h2 <= 800.0d) {
                if (m66532h <= 400.0d && m66532h2 <= 400.0d) {
                    if (m66532h <= 200.0d && m66532h2 <= 200.0d) {
                        iArr[0] = 1;
                    } else {
                        iArr[0] = 2;
                    }
                } else {
                    iArr[0] = 3;
                }
            }
        }
        if (m66530j(this.f5131a[0]) && m66530j(this.f5131a[3]) && !m83q(this.f5131a[1][1]) && !m83q(this.f5131a[1][2]) && !m83q(this.f5131a[2][1]) && !m83q(this.f5131a[2][2])) {
            PointF[] pointFArr4 = this.f5131a[0];
            double m66532h3 = m66532h(pointFArr4[0], pointFArr4[3]);
            PointF[] pointFArr5 = this.f5131a[3];
            double m66532h4 = m66532h(pointFArr5[0], pointFArr5[3]);
            if (m66532h3 <= 800.0d && m66532h4 <= 800.0d) {
                if (m66532h3 <= 400.0d && m66532h4 <= 400.0d) {
                    if (m66532h3 <= 200.0d && m66532h4 <= 200.0d) {
                        iArr[1] = 1;
                    } else {
                        iArr[1] = 2;
                    }
                } else {
                    iArr[1] = 3;
                }
            }
        }
        return iArr;
    }

    /* renamed from: o */
    private List m85o() {
        return m66531i(m86n());
    }

    /* renamed from: r */
    private PointF[][] m82r(PointF[] pointFArr) {
        PointF[][] pointFArr2 = (PointF[][]) Array.newInstance(PointF.class, 4, 4);
        for (int i = 0; i <= 3; i++) {
            pointFArr2[0][i] = pointFArr[i];
            pointFArr2[3][i] = pointFArr[9 - i];
        }
        for (int i2 = 1; i2 <= 2; i2++) {
            pointFArr2[i2][0] = pointFArr[12 - i2];
            pointFArr2[i2][2] = pointFArr[i2 + 12];
            pointFArr2[i2][3] = pointFArr[i2 + 3];
        }
        pointFArr2[1][1] = pointFArr[12];
        pointFArr2[2][1] = pointFArr[15];
        return pointFArr2;
    }

    @Override // p000.AbstractC18307Qh1
    /* renamed from: c */
    public PointF[] mo91c() {
        PointF[] pointFArr = new PointF[4];
        for (int i = 0; i < 4; i++) {
            pointFArr[i] = this.f5131a[i][3];
        }
        return pointFArr;
    }

    @Override // p000.AbstractC18307Qh1
    /* renamed from: e */
    public PointF[] mo90e() {
        PointF[] pointFArr = new PointF[4];
        for (int i = 0; i < 4; i++) {
            pointFArr[i] = this.f5131a[3][3 - i];
        }
        return pointFArr;
    }

    @Override // p000.AbstractC18307Qh1
    /* renamed from: g */
    public PointF[] mo89g() {
        PointF[] pointFArr = new PointF[4];
        for (int i = 0; i < 4; i++) {
            pointFArr[i] = this.f5131a[3 - i][0];
        }
        return pointFArr;
    }

    /* renamed from: m */
    public final double[][] m87m(int i) {
        int i2 = 1 << i;
        int i3 = i2 + 1;
        double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, 4, i3);
        double d = 1.0d / i2;
        double d2 = -d;
        for (int i4 = 0; i4 < i3; i4++) {
            d2 += d;
            double d3 = 1.0d - d2;
            dArr[0][i4] = d3 * d3 * d3;
            double d4 = 3.0d * d2;
            dArr[1][i4] = d4 * d3 * d3;
            dArr[2][i4] = d4 * d2 * d3;
            dArr[3][i4] = d2 * d2 * d2;
        }
        return dArr;
    }

    /* renamed from: n */
    public final C0421Fy[][] m86n() {
        PointF pointF;
        C23308zR1 c23308zR1 = this;
        int i = 0;
        int length = c23308zR1.f5132b[0].length;
        double[][] m87m = c23308zR1.m87m(c23308zR1.f5133c[0]);
        int length2 = m87m[0].length;
        double[][] m87m2 = c23308zR1.m87m(c23308zR1.f5133c[1]);
        int length3 = m87m2[0].length;
        C0421Fy[][] c0421FyArr = (C0421Fy[][]) Array.newInstance(C0421Fy.class, length3, length2);
        double d = 1.0d / (length2 - 1);
        double d2 = 1.0d / (length3 - 1);
        double d3 = -d2;
        int i2 = 0;
        while (i2 < length3) {
            double d4 = d3 + d2;
            double d5 = -d;
            while (i < length2) {
                double d6 = d4;
                double d7 = d2;
                double d8 = 0.0d;
                int i3 = 0;
                int i4 = length2;
                int i5 = length3;
                double d9 = 0.0d;
                while (true) {
                    int i6 = 4;
                    if (i3 >= 4) {
                        break;
                    }
                    int i7 = length;
                    int i8 = 0;
                    while (i8 < i6) {
                        double d10 = d;
                        double d11 = c23308zR1.f5131a[i3][i8].x;
                        double d12 = m87m[i3][i];
                        double d13 = m87m2[i8][i2];
                        d8 += d11 * d12 * d13;
                        d9 += pointF.y * d12 * d13;
                        i8++;
                        i6 = 4;
                        c23308zR1 = this;
                        d = d10;
                    }
                    i3++;
                    c23308zR1 = this;
                    length = i7;
                }
                double d14 = d;
                PointF pointF2 = new PointF((float) d8, (float) d9);
                d5 += d14;
                int i9 = length;
                float[] fArr = new float[i9];
                int i10 = 0;
                while (i10 < i9) {
                    double d15 = 1.0d - d5;
                    float[][] fArr2 = this.f5132b;
                    fArr[i10] = (float) (((1.0d - d6) * ((fArr2[0][i10] * d15) + (fArr2[3][i10] * d5))) + (d6 * ((d15 * fArr2[1][i10]) + (fArr2[2][i10] * d5))));
                    i10++;
                    i = i;
                    i9 = i9;
                    m87m2 = m87m2;
                    m87m = m87m;
                    i2 = i2;
                }
                int i11 = i;
                c0421FyArr[i2][i11] = new C0421Fy(pointF2, fArr);
                i = i11 + 1;
                c23308zR1 = this;
                length3 = i5;
                length2 = i4;
                d2 = d7;
                d4 = d6;
                length = i9;
                d = d14;
                m87m2 = m87m2;
                m87m = m87m;
            }
            i2++;
            d3 = d4;
            length = length;
            i = 0;
        }
        return c0421FyArr;
    }

    /* renamed from: p */
    public final boolean m84p(PointF pointF) {
        PointF[][] pointFArr = this.f5131a;
        double m66536a = m66536a(pointF, pointFArr[0][0], pointFArr[3][0]);
        PointF[][] pointFArr2 = this.f5131a;
        if (m66536a * m66536a(pointF, pointFArr2[0][3], pointFArr2[3][3]) <= 0.0d) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public final boolean m83q(PointF pointF) {
        PointF[] pointFArr = this.f5131a[0];
        double m66536a = m66536a(pointF, pointFArr[0], pointFArr[3]);
        PointF[] pointFArr2 = this.f5131a[3];
        if (m66536a * m66536a(pointF, pointFArr2[0], pointFArr2[3]) <= 0.0d) {
            return false;
        }
        return true;
    }
}
