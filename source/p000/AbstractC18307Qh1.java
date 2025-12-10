package p000;

import android.graphics.PointF;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Qh1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC18307Qh1 {

    /* renamed from: a */
    public PointF[][] f5131a;

    /* renamed from: b */
    public float[][] f5132b;

    /* renamed from: c */
    public int[] f5133c;

    /* renamed from: d */
    public List f5134d;

    public AbstractC18307Qh1(float[][] fArr) {
        this.f5132b = (float[][]) fArr.clone();
    }

    /* renamed from: a */
    public double m66536a(PointF pointF, PointF pointF2, PointF pointF3) {
        float f = pointF3.y;
        float f2 = pointF2.y;
        float f3 = pointF.x;
        float f4 = pointF2.x;
        return ((f - f2) * (f3 - f4)) - ((pointF3.x - f4) * (pointF.y - f2));
    }

    /* renamed from: b */
    public float[][] m66535b() {
        int length = this.f5132b[0].length;
        float[][] fArr = (float[][]) Array.newInstance(Float.TYPE, 2, length);
        for (int i = 0; i < length; i++) {
            float[] fArr2 = fArr[0];
            float[][] fArr3 = this.f5132b;
            fArr2[i] = fArr3[1][i];
            fArr[1][i] = fArr3[2][i];
        }
        return fArr;
    }

    /* renamed from: c */
    public abstract PointF[] mo91c();

    /* renamed from: d */
    public float[][] m66534d() {
        int length = this.f5132b[0].length;
        float[][] fArr = (float[][]) Array.newInstance(Float.TYPE, 2, length);
        for (int i = 0; i < length; i++) {
            float[] fArr2 = fArr[0];
            float[][] fArr3 = this.f5132b;
            fArr2[i] = fArr3[2][i];
            fArr[1][i] = fArr3[3][i];
        }
        return fArr;
    }

    /* renamed from: e */
    public abstract PointF[] mo90e();

    /* renamed from: f */
    public float[][] m66533f() {
        int length = this.f5132b[0].length;
        float[][] fArr = (float[][]) Array.newInstance(Float.TYPE, 2, length);
        for (int i = 0; i < length; i++) {
            float[] fArr2 = fArr[0];
            float[][] fArr3 = this.f5132b;
            fArr2[i] = fArr3[3][i];
            fArr[1][i] = fArr3[0][i];
        }
        return fArr;
    }

    /* renamed from: g */
    public abstract PointF[] mo89g();

    /* renamed from: h */
    public double m66532h(PointF pointF, PointF pointF2) {
        double d = pointF2.x - pointF.x;
        double d2 = pointF2.y - pointF.y;
        return Math.sqrt((d * d) + (d2 * d2));
    }

    /* renamed from: i */
    public List m66531i(C0421Fy[][] c0421FyArr) {
        int i;
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        int length = c0421FyArr.length;
        char c = 0;
        int length2 = c0421FyArr[0].length;
        char c2 = 1;
        int i4 = 1;
        while (i4 < length) {
            int i5 = 1;
            while (i5 < length2) {
                int i6 = i4 - 1;
                C0421Fy[] c0421FyArr2 = c0421FyArr[i6];
                int i7 = i5 - 1;
                PointF pointF = c0421FyArr2[i7].f1767a;
                PointF pointF2 = c0421FyArr2[i5].f1767a;
                C0421Fy[] c0421FyArr3 = c0421FyArr[i4];
                PointF pointF3 = c0421FyArr3[i5].f1767a;
                PointF pointF4 = c0421FyArr3[i7].f1767a;
                if (m66529k(pointF, pointF2) || m66529k(pointF, pointF4)) {
                    i = length;
                    i2 = length2;
                } else {
                    i = length;
                    PointF[] pointFArr = new PointF[3];
                    pointFArr[c] = pointF;
                    pointFArr[c2] = pointF2;
                    pointFArr[2] = pointF4;
                    C0421Fy[] c0421FyArr4 = c0421FyArr[i6];
                    i2 = length2;
                    arrayList.add(new JG1(pointFArr, new float[][]{c0421FyArr4[i7].f1768b, c0421FyArr4[i5].f1768b, c0421FyArr[i4][i7].f1768b}));
                    if (m66529k(pointF3, pointF2) || m66529k(pointF3, pointF4)) {
                        i3 = 1;
                        i5 += i3;
                        length = i;
                        length2 = i2;
                        c = 0;
                        c2 = 1;
                    }
                }
                PointF[] pointFArr2 = {pointF4, pointF2, pointF3};
                C0421Fy[] c0421FyArr5 = c0421FyArr[i4];
                i3 = 1;
                arrayList.add(new JG1(pointFArr2, new float[][]{c0421FyArr5[i7].f1768b, c0421FyArr[i6][i5].f1768b, c0421FyArr5[i5].f1768b}));
                i5 += i3;
                length = i;
                length2 = i2;
                c = 0;
                c2 = 1;
            }
            i4++;
            length2 = length2;
            c = 0;
            c2 = 1;
        }
        return arrayList;
    }

    /* renamed from: j */
    public boolean m66530j(PointF[] pointFArr) {
        double abs = Math.abs(m66536a(pointFArr[1], pointFArr[0], pointFArr[3]));
        double abs2 = Math.abs(m66536a(pointFArr[2], pointFArr[0], pointFArr[3]));
        double abs3 = Math.abs(pointFArr[0].x - pointFArr[3].x);
        double abs4 = Math.abs(pointFArr[0].y - pointFArr[3].y);
        if (abs <= abs3 && abs2 <= abs3) {
            return true;
        }
        if (abs <= abs4 && abs2 <= abs4) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m66529k(PointF pointF, PointF pointF2) {
        if (Math.abs(pointF.x - pointF2.x) < 0.001d && Math.abs(pointF.y - pointF2.y) < 0.001d) {
            return true;
        }
        return false;
    }
}
