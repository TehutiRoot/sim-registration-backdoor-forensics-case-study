package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class Hct {

    /* renamed from: a */
    public double f49626a;

    /* renamed from: b */
    public double f49627b;

    /* renamed from: c */
    public double f49628c;

    /* renamed from: d */
    public int f49629d;

    public Hct(int i) {
        m45296a(i);
    }

    public static Hct from(double d, double d2, double d3) {
        return new Hct(HctSolver.solveToInt(d, d2, d3));
    }

    public static Hct fromInt(int i) {
        return new Hct(i);
    }

    /* renamed from: a */
    public final void m45296a(int i) {
        this.f49629d = i;
        Cam16 fromInt = Cam16.fromInt(i);
        this.f49626a = fromInt.getHue();
        this.f49627b = fromInt.getChroma();
        this.f49628c = ColorUtils.lstarFromArgb(i);
    }

    public double getChroma() {
        return this.f49627b;
    }

    public double getHue() {
        return this.f49626a;
    }

    public double getTone() {
        return this.f49628c;
    }

    public Hct inViewingConditions(ViewingConditions viewingConditions) {
        double[] m45339e = Cam16.fromInt(toInt()).m45339e(viewingConditions, null);
        Cam16 m45341c = Cam16.m45341c(m45339e[0], m45339e[1], m45339e[2], ViewingConditions.DEFAULT);
        return from(m45341c.getHue(), m45341c.getChroma(), ColorUtils.lstarFromY(m45339e[1]));
    }

    public void setChroma(double d) {
        m45296a(HctSolver.solveToInt(this.f49626a, d, this.f49628c));
    }

    public void setHue(double d) {
        m45296a(HctSolver.solveToInt(d, this.f49627b, this.f49628c));
    }

    public void setTone(double d) {
        m45296a(HctSolver.solveToInt(this.f49626a, this.f49627b, d));
    }

    public int toInt() {
        return this.f49629d;
    }
}
