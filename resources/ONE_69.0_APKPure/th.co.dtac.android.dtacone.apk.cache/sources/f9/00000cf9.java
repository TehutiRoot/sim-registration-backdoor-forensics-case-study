package p000;

import android.graphics.PointF;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Ni1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC18154Ni1 {

    /* renamed from: a */
    public PointF[][] f4240a;

    /* renamed from: b */
    public float[][] f4241b;

    /* renamed from: c */
    public int[] f4242c;

    /* renamed from: d */
    public List f4243d;

    public AbstractC18154Ni1(float[][] fArr) {
        this.f4241b = (float[][]) fArr.clone();
    }

    /* renamed from: a */
    public double m67211a(PointF pointF, PointF pointF2, PointF pointF3) {
        float f = pointF3.y;
        float f2 = pointF2.y;
        float f3 = pointF.x;
        float f4 = pointF2.x;
        return ((f - f2) * (f3 - f4)) - ((pointF3.x - f4) * (pointF.y - f2));
    }

    /* renamed from: b */
    public float[][] m67210b() {
        int length = this.f4241b[0].length;
        float[][] fArr = (float[][]) Array.newInstance(Float.TYPE, 2, length);
        for (int i = 0; i < length; i++) {
            float[] fArr2 = fArr[0];
            float[][] fArr3 = this.f4241b;
            fArr2[i] = fArr3[1][i];
            fArr[1][i] = fArr3[2][i];
        }
        return fArr;
    }

    /* renamed from: c */
    public abstract PointF[] mo735c();

    /* renamed from: d */
    public float[][] m67209d() {
        int length = this.f4241b[0].length;
        float[][] fArr = (float[][]) Array.newInstance(Float.TYPE, 2, length);
        for (int i = 0; i < length; i++) {
            float[] fArr2 = fArr[0];
            float[][] fArr3 = this.f4241b;
            fArr2[i] = fArr3[2][i];
            fArr[1][i] = fArr3[3][i];
        }
        return fArr;
    }

    /* renamed from: e */
    public abstract PointF[] mo734e();

    /* renamed from: f */
    public float[][] m67208f() {
        int length = this.f4241b[0].length;
        float[][] fArr = (float[][]) Array.newInstance(Float.TYPE, 2, length);
        for (int i = 0; i < length; i++) {
            float[] fArr2 = fArr[0];
            float[][] fArr3 = this.f4241b;
            fArr2[i] = fArr3[3][i];
            fArr[1][i] = fArr3[0][i];
        }
        return fArr;
    }

    /* renamed from: g */
    public abstract PointF[] mo733g();

    /* renamed from: h */
    public double m67207h(PointF pointF, PointF pointF2) {
        double d = pointF2.x - pointF.x;
        double d2 = pointF2.y - pointF.y;
        return Math.sqrt((d * d) + (d2 * d2));
    }

    /* renamed from: i */
    public List m67206i(C0417Fy[][] c0417FyArr) {
        int i;
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        int length = c0417FyArr.length;
        char c = 0;
        int length2 = c0417FyArr[0].length;
        char c2 = 1;
        int i4 = 1;
        while (i4 < length) {
            int i5 = 1;
            while (i5 < length2) {
                int i6 = i4 - 1;
                C0417Fy[] c0417FyArr2 = c0417FyArr[i6];
                int i7 = i5 - 1;
                PointF pointF = c0417FyArr2[i7].f1820a;
                PointF pointF2 = c0417FyArr2[i5].f1820a;
                C0417Fy[] c0417FyArr3 = c0417FyArr[i4];
                PointF pointF3 = c0417FyArr3[i5].f1820a;
                PointF pointF4 = c0417FyArr3[i7].f1820a;
                if (m67204k(pointF, pointF2) || m67204k(pointF, pointF4)) {
                    i = length;
                    i2 = length2;
                } else {
                    i = length;
                    PointF[] pointFArr = new PointF[3];
                    pointFArr[c] = pointF;
                    pointFArr[c2] = pointF2;
                    pointFArr[2] = pointF4;
                    C0417Fy[] c0417FyArr4 = c0417FyArr[i6];
                    i2 = length2;
                    arrayList.add(new GH1(pointFArr, new float[][]{c0417FyArr4[i7].f1821b, c0417FyArr4[i5].f1821b, c0417FyArr[i4][i7].f1821b}));
                    if (m67204k(pointF3, pointF2) || m67204k(pointF3, pointF4)) {
                        i3 = 1;
                        i5 += i3;
                        length = i;
                        length2 = i2;
                        c = 0;
                        c2 = 1;
                    }
                }
                PointF[] pointFArr2 = {pointF4, pointF2, pointF3};
                C0417Fy[] c0417FyArr5 = c0417FyArr[i4];
                i3 = 1;
                arrayList.add(new GH1(pointFArr2, new float[][]{c0417FyArr5[i7].f1821b, c0417FyArr[i6][i5].f1821b, c0417FyArr5[i5].f1821b}));
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
    public boolean m67205j(PointF[] pointFArr) {
        double abs = Math.abs(m67211a(pointFArr[1], pointFArr[0], pointFArr[3]));
        double abs2 = Math.abs(m67211a(pointFArr[2], pointFArr[0], pointFArr[3]));
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
    public final boolean m67204k(PointF pointF, PointF pointF2) {
        if (Math.abs(pointF.x - pointF2.x) < 0.001d && Math.abs(pointF.y - pointF2.y) < 0.001d) {
            return true;
        }
        return false;
    }
}