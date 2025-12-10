package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public class HyperSpline {

    /* renamed from: a */
    public int f32242a;

    /* renamed from: b */
    public Cubic[][] f32243b;

    /* renamed from: c */
    public int f32244c;

    /* renamed from: d */
    public double[] f32245d;

    /* renamed from: e */
    public double f32246e;

    /* renamed from: f */
    public double[][] f32247f;

    /* loaded from: classes2.dex */
    public static class Cubic {

        /* renamed from: a */
        public double f32248a;

        /* renamed from: b */
        public double f32249b;

        /* renamed from: c */
        public double f32250c;

        /* renamed from: d */
        public double f32251d;

        public Cubic(double d, double d2, double d3, double d4) {
            this.f32248a = d;
            this.f32249b = d2;
            this.f32250c = d3;
            this.f32251d = d4;
        }

        public double eval(double d) {
            return (((((this.f32251d * d) + this.f32250c) * d) + this.f32249b) * d) + this.f32248a;
        }

        public double vel(double d) {
            return (((this.f32251d * 3.0d * d) + (this.f32250c * 2.0d)) * d) + this.f32249b;
        }
    }

    public HyperSpline(double[][] dArr) {
        setup(dArr);
    }

    /* renamed from: a */
    public static Cubic[] m58675a(int i, double[] dArr) {
        double[] dArr2 = new double[i];
        double[] dArr3 = new double[i];
        double[] dArr4 = new double[i];
        int i2 = i - 1;
        int i3 = 0;
        dArr2[0] = 0.5d;
        int i4 = 1;
        for (int i5 = 1; i5 < i2; i5++) {
            dArr2[i5] = 1.0d / (4.0d - dArr2[i5 - 1]);
        }
        int i6 = i - 2;
        dArr2[i2] = 1.0d / (2.0d - dArr2[i6]);
        dArr3[0] = (dArr[1] - dArr[0]) * 3.0d * dArr2[0];
        while (i4 < i2) {
            int i7 = i4 + 1;
            int i8 = i4 - 1;
            dArr3[i4] = (((dArr[i7] - dArr[i8]) * 3.0d) - dArr3[i8]) * dArr2[i4];
            i4 = i7;
        }
        double d = (((dArr[i2] - dArr[i6]) * 3.0d) - dArr3[i6]) * dArr2[i2];
        dArr3[i2] = d;
        dArr4[i2] = d;
        while (i6 >= 0) {
            dArr4[i6] = dArr3[i6] - (dArr2[i6] * dArr4[i6 + 1]);
            i6--;
        }
        Cubic[] cubicArr = new Cubic[i2];
        while (i3 < i2) {
            double d2 = dArr[i3];
            double d3 = dArr4[i3];
            int i9 = i3 + 1;
            double d4 = dArr[i9];
            double d5 = dArr4[i9];
            cubicArr[i3] = new Cubic((float) d2, d3, (((d4 - d2) * 3.0d) - (d3 * 2.0d)) - d5, ((d2 - d4) * 2.0d) + d3 + d5);
            i3 = i9;
        }
        return cubicArr;
    }

    public double approxLength(Cubic[] cubicArr) {
        int i;
        int length = cubicArr.length;
        double[] dArr = new double[cubicArr.length];
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        while (true) {
            i = 0;
            if (d2 >= 1.0d) {
                break;
            }
            double d4 = 0.0d;
            while (i < cubicArr.length) {
                double d5 = dArr[i];
                double eval = cubicArr[i].eval(d2);
                dArr[i] = eval;
                double d6 = d5 - eval;
                d4 += d6 * d6;
                i++;
            }
            if (d2 > 0.0d) {
                d3 += Math.sqrt(d4);
            }
            d2 += 0.1d;
        }
        while (i < cubicArr.length) {
            double d7 = dArr[i];
            double eval2 = cubicArr[i].eval(1.0d);
            dArr[i] = eval2;
            double d8 = d7 - eval2;
            d += d8 * d8;
            i++;
        }
        return d3 + Math.sqrt(d);
    }

    public void getPos(double d, double[] dArr) {
        double d2 = d * this.f32246e;
        int i = 0;
        while (true) {
            double[] dArr2 = this.f32245d;
            if (i >= dArr2.length - 1) {
                break;
            }
            double d3 = dArr2[i];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i++;
        }
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr[i2] = this.f32243b[i2][i].eval(d2 / this.f32245d[i]);
        }
    }

    public void getVelocity(double d, double[] dArr) {
        double d2 = d * this.f32246e;
        int i = 0;
        while (true) {
            double[] dArr2 = this.f32245d;
            if (i >= dArr2.length - 1) {
                break;
            }
            double d3 = dArr2[i];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i++;
        }
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr[i2] = this.f32243b[i2][i].vel(d2 / this.f32245d[i]);
        }
    }

    public void setup(double[][] dArr) {
        int i;
        int length = dArr[0].length;
        this.f32244c = length;
        int length2 = dArr.length;
        this.f32242a = length2;
        this.f32247f = (double[][]) Array.newInstance(Double.TYPE, length, length2);
        this.f32243b = new Cubic[this.f32244c];
        for (int i2 = 0; i2 < this.f32244c; i2++) {
            for (int i3 = 0; i3 < this.f32242a; i3++) {
                this.f32247f[i2][i3] = dArr[i3][i2];
            }
        }
        int i4 = 0;
        while (true) {
            i = this.f32244c;
            if (i4 >= i) {
                break;
            }
            Cubic[][] cubicArr = this.f32243b;
            double[] dArr2 = this.f32247f[i4];
            cubicArr[i4] = m58675a(dArr2.length, dArr2);
            i4++;
        }
        this.f32245d = new double[this.f32242a - 1];
        this.f32246e = 0.0d;
        Cubic[] cubicArr2 = new Cubic[i];
        for (int i5 = 0; i5 < this.f32245d.length; i5++) {
            for (int i6 = 0; i6 < this.f32244c; i6++) {
                cubicArr2[i6] = this.f32243b[i6][i5];
            }
            double d = this.f32246e;
            double[] dArr3 = this.f32245d;
            double approxLength = approxLength(cubicArr2);
            dArr3[i5] = approxLength;
            this.f32246e = d + approxLength;
        }
    }

    public HyperSpline() {
    }

    public void getPos(double d, float[] fArr) {
        double d2 = d * this.f32246e;
        int i = 0;
        while (true) {
            double[] dArr = this.f32245d;
            if (i >= dArr.length - 1) {
                break;
            }
            double d3 = dArr[i];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i++;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = (float) this.f32243b[i2][i].eval(d2 / this.f32245d[i]);
        }
    }

    public double getPos(double d, int i) {
        double[] dArr;
        double d2 = d * this.f32246e;
        int i2 = 0;
        while (true) {
            dArr = this.f32245d;
            if (i2 >= dArr.length - 1) {
                break;
            }
            double d3 = dArr[i2];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i2++;
        }
        return this.f32243b[i][i2].eval(d2 / dArr[i2]);
    }
}