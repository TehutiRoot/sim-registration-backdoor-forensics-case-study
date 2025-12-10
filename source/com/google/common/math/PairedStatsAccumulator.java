package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;

@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes4.dex */
public final class PairedStatsAccumulator {

    /* renamed from: a */
    public final StatsAccumulator f54014a = new StatsAccumulator();

    /* renamed from: b */
    public final StatsAccumulator f54015b = new StatsAccumulator();

    /* renamed from: c */
    public double f54016c = 0.0d;

    /* renamed from: a */
    public static double m39950a(double d) {
        return Doubles.constrainToRange(d, -1.0d, 1.0d);
    }

    public void add(double d, double d2) {
        this.f54014a.add(d);
        if (Doubles.isFinite(d) && Doubles.isFinite(d2)) {
            if (this.f54014a.count() > 1) {
                this.f54016c += (d - this.f54014a.mean()) * (d2 - this.f54015b.mean());
            }
        } else {
            this.f54016c = Double.NaN;
        }
        this.f54015b.add(d2);
    }

    public void addAll(PairedStats pairedStats) {
        if (pairedStats.count() == 0) {
            return;
        }
        this.f54014a.addAll(pairedStats.xStats());
        if (this.f54015b.count() == 0) {
            this.f54016c = pairedStats.sumOfProductsOfDeltas();
        } else {
            this.f54016c += pairedStats.sumOfProductsOfDeltas() + ((pairedStats.xStats().mean() - this.f54014a.mean()) * (pairedStats.yStats().mean() - this.f54015b.mean()) * pairedStats.count());
        }
        this.f54015b.addAll(pairedStats.yStats());
    }

    /* renamed from: b */
    public final double m39949b(double d) {
        if (d > 0.0d) {
            return d;
        }
        return Double.MIN_VALUE;
    }

    public long count() {
        return this.f54014a.count();
    }

    public final LinearTransformation leastSquaresFit() {
        boolean z;
        boolean z2 = false;
        if (count() > 1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        if (Double.isNaN(this.f54016c)) {
            return LinearTransformation.forNaN();
        }
        double m39923c = this.f54014a.m39923c();
        if (m39923c > 0.0d) {
            if (this.f54015b.m39923c() > 0.0d) {
                return LinearTransformation.mapping(this.f54014a.mean(), this.f54015b.mean()).withSlope(this.f54016c / m39923c);
            }
            return LinearTransformation.horizontal(this.f54015b.mean());
        }
        if (this.f54015b.m39923c() > 0.0d) {
            z2 = true;
        }
        Preconditions.checkState(z2);
        return LinearTransformation.vertical(this.f54014a.mean());
    }

    public final double pearsonsCorrelationCoefficient() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (count() > 1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        if (Double.isNaN(this.f54016c)) {
            return Double.NaN;
        }
        double m39923c = this.f54014a.m39923c();
        double m39923c2 = this.f54015b.m39923c();
        if (m39923c > 0.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkState(z2);
        if (m39923c2 > 0.0d) {
            z3 = true;
        }
        Preconditions.checkState(z3);
        return m39950a(this.f54016c / Math.sqrt(m39949b(m39923c * m39923c2)));
    }

    public double populationCovariance() {
        boolean z;
        if (count() != 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        return this.f54016c / count();
    }

    public final double sampleCovariance() {
        boolean z;
        if (count() > 1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        return this.f54016c / (count() - 1);
    }

    public PairedStats snapshot() {
        return new PairedStats(this.f54014a.snapshot(), this.f54015b.snapshot(), this.f54016c);
    }

    public Stats xStats() {
        return this.f54014a.snapshot();
    }

    public Stats yStats() {
        return this.f54015b.snapshot();
    }
}
