package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class Cam16 {

    /* renamed from: k */
    public static final double[][] f49604k = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};

    /* renamed from: l */
    public static final double[][] f49605l = {new double[]{1.8620678d, -1.0112547d, 0.14918678d}, new double[]{0.38752654d, 0.62144744d, -0.00897398d}, new double[]{-0.0158415d, -0.03412294d, 1.0499644d}};

    /* renamed from: a */
    public final double f49606a;

    /* renamed from: b */
    public final double f49607b;

    /* renamed from: c */
    public final double f49608c;

    /* renamed from: d */
    public final double f49609d;

    /* renamed from: e */
    public final double f49610e;

    /* renamed from: f */
    public final double f49611f;

    /* renamed from: g */
    public final double f49612g;

    /* renamed from: h */
    public final double f49613h;

    /* renamed from: i */
    public final double f49614i;

    /* renamed from: j */
    public final double[] f49615j = {0.0d, 0.0d, 0.0d};

    public Cam16(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f49606a = d;
        this.f49607b = d2;
        this.f49608c = d3;
        this.f49609d = d4;
        this.f49610e = d5;
        this.f49611f = d6;
        this.f49612g = d7;
        this.f49613h = d8;
        this.f49614i = d9;
    }

    /* renamed from: a */
    public static Cam16 m45343a(int i, ViewingConditions viewingConditions) {
        double linearized = ColorUtils.linearized((16711680 & i) >> 16);
        double linearized2 = ColorUtils.linearized((65280 & i) >> 8);
        double linearized3 = ColorUtils.linearized(i & 255);
        return m45341c((0.41233895d * linearized) + (0.35762064d * linearized2) + (0.18051042d * linearized3), (0.2126d * linearized) + (0.7152d * linearized2) + (0.0722d * linearized3), (linearized * 0.01932141d) + (linearized2 * 0.11916382d) + (linearized3 * 0.95034478d), viewingConditions);
    }

    /* renamed from: b */
    public static Cam16 m45342b(double d, double d2, double d3, ViewingConditions viewingConditions) {
        double d4 = d / 100.0d;
        double m44944a = (4.0d / viewingConditions.m44944a()) * Math.sqrt(d4) * (viewingConditions.getAw() + 4.0d) * viewingConditions.getFlRoot();
        double flRoot = d2 * viewingConditions.getFlRoot();
        double radians = Math.toRadians(d3);
        double d5 = (1.7000000000000002d * d) / ((0.007d * d) + 1.0d);
        double log1p = 43.859649122807014d * Math.log1p(flRoot * 0.0228d);
        return new Cam16(d3, d2, d, m44944a, flRoot, Math.sqrt(((d2 / Math.sqrt(d4)) * viewingConditions.m44944a()) / (viewingConditions.getAw() + 4.0d)) * 50.0d, d5, Math.cos(radians) * log1p, Math.sin(radians) * log1p);
    }

    /* renamed from: c */
    public static Cam16 m45341c(double d, double d2, double d3, ViewingConditions viewingConditions) {
        double[][] dArr = f49604k;
        double[] dArr2 = dArr[0];
        double d4 = (dArr2[0] * d) + (dArr2[1] * d2) + (dArr2[2] * d3);
        double[] dArr3 = dArr[1];
        double d5 = (dArr3[0] * d) + (dArr3[1] * d2) + (dArr3[2] * d3);
        double[] dArr4 = dArr[2];
        double d6 = viewingConditions.getRgbD()[0] * d4;
        double d7 = viewingConditions.getRgbD()[1] * d5;
        double d8 = viewingConditions.getRgbD()[2] * ((dArr4[0] * d) + (dArr4[1] * d2) + (dArr4[2] * d3));
        double pow = Math.pow((viewingConditions.m44943b() * Math.abs(d6)) / 100.0d, 0.42d);
        double pow2 = Math.pow((viewingConditions.m44943b() * Math.abs(d7)) / 100.0d, 0.42d);
        double pow3 = Math.pow((viewingConditions.m44943b() * Math.abs(d8)) / 100.0d, 0.42d);
        double signum = ((Math.signum(d6) * 400.0d) * pow) / (pow + 27.13d);
        double signum2 = ((Math.signum(d7) * 400.0d) * pow2) / (pow2 + 27.13d);
        double signum3 = ((Math.signum(d8) * 400.0d) * pow3) / (pow3 + 27.13d);
        double d9 = (((signum * 11.0d) + ((-12.0d) * signum2)) + signum3) / 11.0d;
        double d10 = ((signum + signum2) - (signum3 * 2.0d)) / 9.0d;
        double d11 = signum2 * 20.0d;
        double d12 = (((signum * 20.0d) + d11) + (21.0d * signum3)) / 20.0d;
        double d13 = (((signum * 40.0d) + d11) + signum3) / 20.0d;
        double degrees = Math.toDegrees(Math.atan2(d10, d9));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d14 = degrees;
        double radians = Math.toRadians(d14);
        double pow4 = Math.pow((d13 * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.m44944a() * viewingConditions.m44940e()) * 100.0d;
        double d15 = pow4 / 100.0d;
        double m44944a = (4.0d / viewingConditions.m44944a()) * Math.sqrt(d15) * (viewingConditions.getAw() + 4.0d) * viewingConditions.getFlRoot();
        double pow5 = Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d) * Math.pow(((((((Math.cos(Math.toRadians(d14 < 20.14d ? d14 + 360.0d : d14) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * viewingConditions.m44942c()) * viewingConditions.m44941d()) * Math.hypot(d9, d10)) / (d12 + 0.305d), 0.9d);
        double sqrt = Math.sqrt(d15) * pow5;
        double flRoot = sqrt * viewingConditions.getFlRoot();
        double log1p = Math.log1p(flRoot * 0.0228d) * 43.859649122807014d;
        return new Cam16(d14, sqrt, pow4, m44944a, flRoot, Math.sqrt((pow5 * viewingConditions.m44944a()) / (viewingConditions.getAw() + 4.0d)) * 50.0d, (1.7000000000000002d * pow4) / ((0.007d * pow4) + 1.0d), log1p * Math.cos(radians), log1p * Math.sin(radians));
    }

    public static Cam16 fromInt(int i) {
        return m45343a(i, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromUcs(double d, double d2, double d3) {
        return fromUcsInViewingConditions(d, d2, d3, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromUcsInViewingConditions(double d, double d2, double d3, ViewingConditions viewingConditions) {
        double expm1 = (Math.expm1(Math.hypot(d2, d3) * 0.0228d) / 0.0228d) / viewingConditions.getFlRoot();
        double atan2 = Math.atan2(d3, d2) * 57.29577951308232d;
        if (atan2 < 0.0d) {
            atan2 += 360.0d;
        }
        return m45342b(d / (1.0d - ((d - 100.0d) * 0.007d)), expm1, atan2, viewingConditions);
    }

    /* renamed from: d */
    public int m45340d(ViewingConditions viewingConditions) {
        double[] m45339e = m45339e(viewingConditions, this.f49615j);
        return ColorUtils.argbFromXyz(m45339e[0], m45339e[1], m45339e[2]);
    }

    /* renamed from: e */
    public double[] m45339e(ViewingConditions viewingConditions, double[] dArr) {
        double d;
        if (getChroma() != 0.0d && getJ() != 0.0d) {
            d = getChroma() / Math.sqrt(getJ() / 100.0d);
        } else {
            d = 0.0d;
        }
        double pow = Math.pow(d / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double radians = Math.toRadians(getHue());
        double aw = viewingConditions.getAw() * Math.pow(getJ() / 100.0d, (1.0d / viewingConditions.m44944a()) / viewingConditions.m44940e());
        double cos = (Math.cos(2.0d + radians) + 3.8d) * 0.25d * 3846.153846153846d * viewingConditions.m44942c() * viewingConditions.m44941d();
        double nbb = aw / viewingConditions.getNbb();
        double sin = Math.sin(radians);
        double cos2 = Math.cos(radians);
        double d2 = (((0.305d + nbb) * 23.0d) * pow) / (((cos * 23.0d) + ((11.0d * pow) * cos2)) + ((pow * 108.0d) * sin));
        double d3 = cos2 * d2;
        double d4 = d2 * sin;
        double d5 = nbb * 460.0d;
        double d6 = (((451.0d * d3) + d5) + (288.0d * d4)) / 1403.0d;
        double d7 = ((d5 - (891.0d * d3)) - (261.0d * d4)) / 1403.0d;
        double d8 = ((d5 - (d3 * 220.0d)) - (d4 * 6300.0d)) / 1403.0d;
        double signum = Math.signum(d6) * (100.0d / viewingConditions.m44943b()) * Math.pow(Math.max(0.0d, (Math.abs(d6) * 27.13d) / (400.0d - Math.abs(d6))), 2.380952380952381d);
        double signum2 = Math.signum(d7) * (100.0d / viewingConditions.m44943b()) * Math.pow(Math.max(0.0d, (Math.abs(d7) * 27.13d) / (400.0d - Math.abs(d7))), 2.380952380952381d);
        double signum3 = Math.signum(d8) * (100.0d / viewingConditions.m44943b()) * Math.pow(Math.max(0.0d, (Math.abs(d8) * 27.13d) / (400.0d - Math.abs(d8))), 2.380952380952381d);
        double d9 = signum / viewingConditions.getRgbD()[0];
        double d10 = signum2 / viewingConditions.getRgbD()[1];
        double d11 = signum3 / viewingConditions.getRgbD()[2];
        double[][] dArr2 = f49605l;
        double[] dArr3 = dArr2[0];
        double d12 = (dArr3[0] * d9) + (dArr3[1] * d10) + (dArr3[2] * d11);
        double[] dArr4 = dArr2[1];
        double d13 = (dArr4[0] * d9) + (dArr4[1] * d10) + (dArr4[2] * d11);
        double[] dArr5 = dArr2[2];
        double d14 = (d9 * dArr5[0]) + (d10 * dArr5[1]) + (d11 * dArr5[2]);
        if (dArr != null) {
            dArr[0] = d12;
            dArr[1] = d13;
            dArr[2] = d14;
            return dArr;
        }
        return new double[]{d12, d13, d14};
    }

    public double getAstar() {
        return this.f49613h;
    }

    public double getBstar() {
        return this.f49614i;
    }

    public double getChroma() {
        return this.f49607b;
    }

    public double getHue() {
        return this.f49606a;
    }

    public double getJ() {
        return this.f49608c;
    }

    public double getJstar() {
        return this.f49612g;
    }

    public double getM() {
        return this.f49610e;
    }

    public double getQ() {
        return this.f49609d;
    }

    public double getS() {
        return this.f49611f;
    }

    public int toInt() {
        return m45340d(ViewingConditions.DEFAULT);
    }
}
