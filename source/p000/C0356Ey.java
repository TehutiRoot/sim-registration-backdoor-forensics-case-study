package p000;

import android.graphics.PointF;
import java.lang.reflect.Array;
import java.util.List;

/* renamed from: Ey */
/* loaded from: classes5.dex */
public class C0356Ey extends AbstractC18307Qh1 {
    public C0356Ey(PointF[] pointFArr, float[][] fArr) {
        super(fArr);
        this.f5131a = m68436n(pointFArr);
        this.f5133c = m68438l();
        this.f5134d = m68437m();
    }

    @Override // p000.AbstractC18307Qh1
    /* renamed from: c */
    public PointF[] mo91c() {
        return (PointF[]) this.f5131a[1].clone();
    }

    @Override // p000.AbstractC18307Qh1
    /* renamed from: e */
    public PointF[] mo90e() {
        PointF[] pointFArr = this.f5131a[3];
        return new PointF[]{pointFArr[3], pointFArr[2], pointFArr[1], pointFArr[0]};
    }

    @Override // p000.AbstractC18307Qh1
    /* renamed from: g */
    public PointF[] mo89g() {
        PointF[] pointFArr = this.f5131a[0];
        return new PointF[]{pointFArr[3], pointFArr[2], pointFArr[1], pointFArr[0]};
    }

    /* renamed from: l */
    public final int[] m68438l() {
        int[] iArr = {4, 4};
        if (m66530j(this.f5131a[0]) && m66530j(this.f5131a[1])) {
            PointF[] pointFArr = this.f5131a[0];
            double m66532h = m66532h(pointFArr[0], pointFArr[3]);
            PointF[] pointFArr2 = this.f5131a[1];
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
        if (m66530j(this.f5131a[2]) && m66530j(this.f5131a[3])) {
            PointF[] pointFArr3 = this.f5131a[2];
            double m66532h3 = m66532h(pointFArr3[0], pointFArr3[3]);
            PointF[] pointFArr4 = this.f5131a[3];
            double m66532h4 = m66532h(pointFArr4[0], pointFArr4[3]);
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

    /* renamed from: m */
    public final List m68437m() {
        return m66531i(new C0421Fy[0]);
    }

    /* renamed from: n */
    public final PointF[][] m68436n(PointF[] pointFArr) {
        PointF[][] pointFArr2 = (PointF[][]) Array.newInstance(PointF.class, 4, 4);
        PointF pointF = pointFArr[0];
        PointF pointF2 = pointFArr[1];
        PointF pointF3 = pointFArr[2];
        PointF pointF4 = pointFArr[3];
        PointF[] pointFArr3 = new PointF[4];
        pointFArr3[0] = pointF;
        pointFArr3[1] = pointF2;
        pointFArr3[2] = pointF3;
        pointFArr3[3] = pointF4;
        pointFArr2[2] = pointFArr3;
        PointF pointF5 = pointFArr[4];
        PointF pointF6 = pointFArr[5];
        PointF pointF7 = pointFArr[6];
        PointF[] pointFArr4 = new PointF[4];
        pointFArr4[0] = pointF4;
        pointFArr4[1] = pointF5;
        pointFArr4[2] = pointF6;
        pointFArr4[3] = pointF7;
        pointFArr2[1] = pointFArr4;
        PointF pointF8 = pointFArr[9];
        PointF pointF9 = pointFArr[8];
        PointF pointF10 = pointFArr[7];
        PointF[] pointFArr5 = new PointF[4];
        pointFArr5[0] = pointF8;
        pointFArr5[1] = pointF9;
        pointFArr5[2] = pointF10;
        pointFArr5[3] = pointF7;
        pointFArr2[3] = pointFArr5;
        PointF pointF11 = pointFArr[11];
        PointF pointF12 = pointFArr[10];
        PointF[] pointFArr6 = new PointF[4];
        pointFArr6[0] = pointF;
        pointFArr6[1] = pointF11;
        pointFArr6[2] = pointF12;
        pointFArr6[3] = pointF8;
        pointFArr2[0] = pointFArr6;
        return pointFArr2;
    }
}
