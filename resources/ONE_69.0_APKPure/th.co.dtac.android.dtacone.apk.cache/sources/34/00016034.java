package p000;

import android.graphics.PointF;
import java.lang.reflect.Array;
import java.util.List;

/* renamed from: wS1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C22863wS1 extends AbstractC18154Ni1 {
    public C22863wS1(PointF[] pointFArr, float[][] fArr) {
        super(fArr);
        this.f4240a = m726r(pointFArr);
        this.f4242c = m732l();
        this.f4243d = m729o();
    }

    /* renamed from: l */
    private int[] m732l() {
        int[] iArr = {4, 4};
        PointF[] pointFArr = new PointF[4];
        PointF[] pointFArr2 = new PointF[4];
        for (int i = 0; i < 4; i++) {
            PointF[][] pointFArr3 = this.f4240a;
            pointFArr[i] = pointFArr3[i][0];
            pointFArr2[i] = pointFArr3[i][3];
        }
        if (m67205j(pointFArr) && m67205j(pointFArr2) && !m728p(this.f4240a[1][1]) && !m728p(this.f4240a[1][2]) && !m728p(this.f4240a[2][1]) && !m728p(this.f4240a[2][2])) {
            double m67207h = m67207h(pointFArr[0], pointFArr[3]);
            double m67207h2 = m67207h(pointFArr2[0], pointFArr2[3]);
            if (m67207h <= 800.0d && m67207h2 <= 800.0d) {
                if (m67207h <= 400.0d && m67207h2 <= 400.0d) {
                    if (m67207h <= 200.0d && m67207h2 <= 200.0d) {
                        iArr[0] = 1;
                    } else {
                        iArr[0] = 2;
                    }
                } else {
                    iArr[0] = 3;
                }
            }
        }
        if (m67205j(this.f4240a[0]) && m67205j(this.f4240a[3]) && !m727q(this.f4240a[1][1]) && !m727q(this.f4240a[1][2]) && !m727q(this.f4240a[2][1]) && !m727q(this.f4240a[2][2])) {
            PointF[] pointFArr4 = this.f4240a[0];
            double m67207h3 = m67207h(pointFArr4[0], pointFArr4[3]);
            PointF[] pointFArr5 = this.f4240a[3];
            double m67207h4 = m67207h(pointFArr5[0], pointFArr5[3]);
            if (m67207h3 <= 800.0d && m67207h4 <= 800.0d) {
                if (m67207h3 <= 400.0d && m67207h4 <= 400.0d) {
                    if (m67207h3 <= 200.0d && m67207h4 <= 200.0d) {
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
    private List m729o() {
        return m67206i(m730n());
    }

    /* renamed from: r */
    private PointF[][] m726r(PointF[] pointFArr) {
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

    @Override // p000.AbstractC18154Ni1
    /* renamed from: c */
    public PointF[] mo735c() {
        PointF[] pointFArr = new PointF[4];
        for (int i = 0; i < 4; i++) {
            pointFArr[i] = this.f4240a[i][3];
        }
        return pointFArr;
    }

    @Override // p000.AbstractC18154Ni1
    /* renamed from: e */
    public PointF[] mo734e() {
        PointF[] pointFArr = new PointF[4];
        for (int i = 0; i < 4; i++) {
            pointFArr[i] = this.f4240a[3][3 - i];
        }
        return pointFArr;
    }

    @Override // p000.AbstractC18154Ni1
    /* renamed from: g */
    public PointF[] mo733g() {
        PointF[] pointFArr = new PointF[4];
        for (int i = 0; i < 4; i++) {
            pointFArr[i] = this.f4240a[3 - i][0];
        }
        return pointFArr;
    }

    /* renamed from: m */
    public final double[][] m731m(int i) {
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
    public final C0417Fy[][] m730n() {
        PointF pointF;
        C22863wS1 c22863wS1 = this;
        int i = 0;
        int length = c22863wS1.f4241b[0].length;
        double[][] m731m = c22863wS1.m731m(c22863wS1.f4242c[0]);
        int length2 = m731m[0].length;
        double[][] m731m2 = c22863wS1.m731m(c22863wS1.f4242c[1]);
        int length3 = m731m2[0].length;
        C0417Fy[][] c0417FyArr = (C0417Fy[][]) Array.newInstance(C0417Fy.class, length3, length2);
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
                        double d11 = c22863wS1.f4240a[i3][i8].x;
                        double d12 = m731m[i3][i];
                        double d13 = m731m2[i8][i2];
                        d8 += d11 * d12 * d13;
                        d9 += pointF.y * d12 * d13;
                        i8++;
                        i6 = 4;
                        c22863wS1 = this;
                        d = d10;
                    }
                    i3++;
                    c22863wS1 = this;
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
                    float[][] fArr2 = this.f4241b;
                    fArr[i10] = (float) (((1.0d - d6) * ((fArr2[0][i10] * d15) + (fArr2[3][i10] * d5))) + (d6 * ((d15 * fArr2[1][i10]) + (fArr2[2][i10] * d5))));
                    i10++;
                    i = i;
                    i9 = i9;
                    m731m2 = m731m2;
                    m731m = m731m;
                    i2 = i2;
                }
                int i11 = i;
                c0417FyArr[i2][i11] = new C0417Fy(pointF2, fArr);
                i = i11 + 1;
                c22863wS1 = this;
                length3 = i5;
                length2 = i4;
                d2 = d7;
                d4 = d6;
                length = i9;
                d = d14;
                m731m2 = m731m2;
                m731m = m731m;
            }
            i2++;
            d3 = d4;
            length = length;
            i = 0;
        }
        return c0417FyArr;
    }

    /* renamed from: p */
    public final boolean m728p(PointF pointF) {
        PointF[][] pointFArr = this.f4240a;
        double m67211a = m67211a(pointF, pointFArr[0][0], pointFArr[3][0]);
        PointF[][] pointFArr2 = this.f4240a;
        if (m67211a * m67211a(pointF, pointFArr2[0][3], pointFArr2[3][3]) <= 0.0d) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public final boolean m727q(PointF pointF) {
        PointF[] pointFArr = this.f4240a[0];
        double m67211a = m67211a(pointF, pointFArr[0], pointFArr[3]);
        PointF[] pointFArr2 = this.f4240a[3];
        if (m67211a * m67211a(pointF, pointFArr2[0], pointFArr2[3]) <= 0.0d) {
            return false;
        }
        return true;
    }
}