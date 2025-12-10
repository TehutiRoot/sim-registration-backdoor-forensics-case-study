package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class ViewingConditions {
    public static final ViewingConditions DEFAULT = defaultWithBackgroundLstar(50.0d);

    /* renamed from: a */
    public final double f49697a;

    /* renamed from: b */
    public final double f49698b;

    /* renamed from: c */
    public final double f49699c;

    /* renamed from: d */
    public final double f49700d;

    /* renamed from: e */
    public final double f49701e;

    /* renamed from: f */
    public final double f49702f;

    /* renamed from: g */
    public final double[] f49703g;

    /* renamed from: h */
    public final double f49704h;

    /* renamed from: i */
    public final double f49705i;

    /* renamed from: j */
    public final double f49706j;

    public ViewingConditions(double d, double d2, double d3, double d4, double d5, double d6, double[] dArr, double d7, double d8, double d9) {
        this.f49702f = d;
        this.f49697a = d2;
        this.f49698b = d3;
        this.f49699c = d4;
        this.f49700d = d5;
        this.f49701e = d6;
        this.f49703g = dArr;
        this.f49704h = d7;
        this.f49705i = d8;
        this.f49706j = d9;
    }

    public static ViewingConditions defaultWithBackgroundLstar(double d) {
        return make(ColorUtils.whitePointD65(), (ColorUtils.yFromLstar(50.0d) * 63.66197723675813d) / 100.0d, d, 2.0d, false);
    }

    public static ViewingConditions make(double[] dArr, double d, double d2, double d3, boolean z) {
        double lerp;
        double exp;
        double max = Math.max(0.1d, d2);
        double[][] dArr2 = Cam16.f49604k;
        double d4 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d5 = dArr[1];
        double d6 = dArr[2];
        double d7 = (dArr3[0] * d4) + (dArr3[1] * d5) + (dArr3[2] * d6);
        double[] dArr4 = dArr2[1];
        double d8 = (dArr4[0] * d4) + (dArr4[1] * d5) + (dArr4[2] * d6);
        double[] dArr5 = dArr2[2];
        double d9 = (d4 * dArr5[0]) + (d5 * dArr5[1]) + (d6 * dArr5[2]);
        double d10 = (d3 / 10.0d) + 0.8d;
        if (d10 >= 0.9d) {
            lerp = MathUtils.lerp(0.59d, 0.69d, (d10 - 0.9d) * 10.0d);
        } else {
            lerp = MathUtils.lerp(0.525d, 0.59d, (d10 - 0.8d) * 10.0d);
        }
        double d11 = lerp;
        if (z) {
            exp = 1.0d;
        } else {
            exp = (1.0d - (Math.exp(((-d) - 42.0d) / 92.0d) * 0.2777777777777778d)) * d10;
        }
        double clampDouble = MathUtils.clampDouble(0.0d, 1.0d, exp);
        double[] dArr6 = {(((100.0d / d7) * clampDouble) + 1.0d) - clampDouble, (((100.0d / d8) * clampDouble) + 1.0d) - clampDouble, (((100.0d / d9) * clampDouble) + 1.0d) - clampDouble};
        double d12 = 5.0d * d;
        double d13 = 1.0d / (d12 + 1.0d);
        double d14 = d13 * d13 * d13 * d13;
        double d15 = 1.0d - d14;
        double cbrt = (d14 * d) + (0.1d * d15 * d15 * Math.cbrt(d12));
        double yFromLstar = ColorUtils.yFromLstar(max) / dArr[1];
        double sqrt = Math.sqrt(yFromLstar) + 1.48d;
        double pow = 0.725d / Math.pow(yFromLstar, 0.2d);
        double[] dArr7 = {Math.pow(((dArr6[0] * cbrt) * d7) / 100.0d, 0.42d), Math.pow(((dArr6[1] * cbrt) * d8) / 100.0d, 0.42d), Math.pow(((dArr6[2] * cbrt) * d9) / 100.0d, 0.42d)};
        double d16 = dArr7[0];
        double d17 = (d16 * 400.0d) / (d16 + 27.13d);
        double d18 = dArr7[1];
        double d19 = (d18 * 400.0d) / (d18 + 27.13d);
        double d20 = dArr7[2];
        double[] dArr8 = {d17, d19, (400.0d * d20) / (d20 + 27.13d)};
        return new ViewingConditions(yFromLstar, ((dArr8[0] * 2.0d) + dArr8[1] + (dArr8[2] * 0.05d)) * pow, pow, pow, d11, d10, dArr6, cbrt, Math.pow(cbrt, 0.25d), sqrt);
    }

    /* renamed from: a */
    public double m44944a() {
        return this.f49700d;
    }

    /* renamed from: b */
    public double m44943b() {
        return this.f49704h;
    }

    /* renamed from: c */
    public double m44942c() {
        return this.f49701e;
    }

    /* renamed from: d */
    public double m44941d() {
        return this.f49699c;
    }

    /* renamed from: e */
    public double m44940e() {
        return this.f49706j;
    }

    public double getAw() {
        return this.f49697a;
    }

    public double getFlRoot() {
        return this.f49705i;
    }

    public double getN() {
        return this.f49702f;
    }

    public double getNbb() {
        return this.f49698b;
    }

    public double[] getRgbD() {
        return this.f49703g;
    }
}
