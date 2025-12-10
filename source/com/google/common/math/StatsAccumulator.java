package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;
import java.util.Iterator;

@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes4.dex */
public final class StatsAccumulator {

    /* renamed from: a */
    public long f54022a = 0;

    /* renamed from: b */
    public double f54023b = 0.0d;

    /* renamed from: c */
    public double f54024c = 0.0d;

    /* renamed from: d */
    public double f54025d = Double.NaN;

    /* renamed from: e */
    public double f54026e = Double.NaN;

    /* renamed from: a */
    public static double m39925a(double d, double d2) {
        if (Doubles.isFinite(d)) {
            return d2;
        }
        if (!Doubles.isFinite(d2) && d != d2) {
            return Double.NaN;
        }
        return d;
    }

    public void add(double d) {
        long j = this.f54022a;
        if (j == 0) {
            this.f54022a = 1L;
            this.f54023b = d;
            this.f54025d = d;
            this.f54026e = d;
            if (!Doubles.isFinite(d)) {
                this.f54024c = Double.NaN;
                return;
            }
            return;
        }
        this.f54022a = j + 1;
        if (Doubles.isFinite(d) && Doubles.isFinite(this.f54023b)) {
            double d2 = this.f54023b;
            double d3 = d - d2;
            double d4 = d2 + (d3 / this.f54022a);
            this.f54023b = d4;
            this.f54024c += d3 * (d - d4);
        } else {
            this.f54023b = m39925a(this.f54023b, d);
            this.f54024c = Double.NaN;
        }
        this.f54025d = Math.min(this.f54025d, d);
        this.f54026e = Math.max(this.f54026e, d);
    }

    public void addAll(Iterable<? extends Number> iterable) {
        for (Number number : iterable) {
            add(number.doubleValue());
        }
    }

    /* renamed from: b */
    public final void m39924b(long j, double d, double d2, double d3, double d4) {
        long j2 = this.f54022a;
        if (j2 == 0) {
            this.f54022a = j;
            this.f54023b = d;
            this.f54024c = d2;
            this.f54025d = d3;
            this.f54026e = d4;
            return;
        }
        this.f54022a = j2 + j;
        if (Doubles.isFinite(this.f54023b) && Doubles.isFinite(d)) {
            double d5 = this.f54023b;
            double d6 = d - d5;
            double d7 = j;
            double d8 = d5 + ((d6 * d7) / this.f54022a);
            this.f54023b = d8;
            this.f54024c += d2 + (d6 * (d - d8) * d7);
        } else {
            this.f54023b = m39925a(this.f54023b, d);
            this.f54024c = Double.NaN;
        }
        this.f54025d = Math.min(this.f54025d, d3);
        this.f54026e = Math.max(this.f54026e, d4);
    }

    /* renamed from: c */
    public double m39923c() {
        return this.f54024c;
    }

    public long count() {
        return this.f54022a;
    }

    public double max() {
        boolean z;
        if (this.f54022a != 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        return this.f54026e;
    }

    public double mean() {
        boolean z;
        if (this.f54022a != 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        return this.f54023b;
    }

    public double min() {
        boolean z;
        if (this.f54022a != 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        return this.f54025d;
    }

    public final double populationStandardDeviation() {
        return Math.sqrt(populationVariance());
    }

    public final double populationVariance() {
        boolean z;
        if (this.f54022a != 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        if (Double.isNaN(this.f54024c)) {
            return Double.NaN;
        }
        if (this.f54022a == 1) {
            return 0.0d;
        }
        return AbstractC1671XJ.m65523b(this.f54024c) / this.f54022a;
    }

    public final double sampleStandardDeviation() {
        return Math.sqrt(sampleVariance());
    }

    public final double sampleVariance() {
        boolean z;
        if (this.f54022a > 1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        if (Double.isNaN(this.f54024c)) {
            return Double.NaN;
        }
        return AbstractC1671XJ.m65523b(this.f54024c) / (this.f54022a - 1);
    }

    public Stats snapshot() {
        return new Stats(this.f54022a, this.f54023b, this.f54024c, this.f54025d, this.f54026e);
    }

    public final double sum() {
        return this.f54023b * this.f54022a;
    }

    public void addAll(Iterator<? extends Number> it) {
        while (it.hasNext()) {
            add(it.next().doubleValue());
        }
    }

    public void addAll(double... dArr) {
        for (double d : dArr) {
            add(d);
        }
    }

    public void addAll(int... iArr) {
        for (int i : iArr) {
            add(i);
        }
    }

    public void addAll(long... jArr) {
        for (long j : jArr) {
            add(j);
        }
    }

    public void addAll(Stats stats) {
        if (stats.count() == 0) {
            return;
        }
        m39924b(stats.count(), stats.mean(), stats.sumOfSquaresOfDeltas(), stats.min(), stats.max());
    }

    public void addAll(StatsAccumulator statsAccumulator) {
        if (statsAccumulator.count() == 0) {
            return;
        }
        m39924b(statsAccumulator.count(), statsAccumulator.mean(), statsAccumulator.m39923c(), statsAccumulator.min(), statsAccumulator.max());
    }
}
