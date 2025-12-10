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
    public final StatsAccumulator f54026a = new StatsAccumulator();

    /* renamed from: b */
    public final StatsAccumulator f54027b = new StatsAccumulator();

    /* renamed from: c */
    public double f54028c = 0.0d;

    /* renamed from: a */
    public static double m39942a(double d) {
        return Doubles.constrainToRange(d, -1.0d, 1.0d);
    }

    public void add(double d, double d2) {
        this.f54026a.add(d);
        if (Doubles.isFinite(d) && Doubles.isFinite(d2)) {
            if (this.f54026a.count() > 1) {
                this.f54028c += (d - this.f54026a.mean()) * (d2 - this.f54027b.mean());
            }
        } else {
            this.f54028c = Double.NaN;
        }
        this.f54027b.add(d2);
    }

    public void addAll(PairedStats pairedStats) {
        if (pairedStats.count() == 0) {
            return;
        }
        this.f54026a.addAll(pairedStats.xStats());
        if (this.f54027b.count() == 0) {
            this.f54028c = pairedStats.sumOfProductsOfDeltas();
        } else {
            this.f54028c += pairedStats.sumOfProductsOfDeltas() + ((pairedStats.xStats().mean() - this.f54026a.mean()) * (pairedStats.yStats().mean() - this.f54027b.mean()) * pairedStats.count());
        }
        this.f54027b.addAll(pairedStats.yStats());
    }

    /* renamed from: b */
    public final double m39941b(double d) {
        if (d > 0.0d) {
            return d;
        }
        return Double.MIN_VALUE;
    }

    public long count() {
        return this.f54026a.count();
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
        if (Double.isNaN(this.f54028c)) {
            return LinearTransformation.forNaN();
        }
        double m39915c = this.f54026a.m39915c();
        if (m39915c > 0.0d) {
            if (this.f54027b.m39915c() > 0.0d) {
                return LinearTransformation.mapping(this.f54026a.mean(), this.f54027b.mean()).withSlope(this.f54028c / m39915c);
            }
            return LinearTransformation.horizontal(this.f54027b.mean());
        }
        if (this.f54027b.m39915c() > 0.0d) {
            z2 = true;
        }
        Preconditions.checkState(z2);
        return LinearTransformation.vertical(this.f54026a.mean());
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
        if (Double.isNaN(this.f54028c)) {
            return Double.NaN;
        }
        double m39915c = this.f54026a.m39915c();
        double m39915c2 = this.f54027b.m39915c();
        if (m39915c > 0.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkState(z2);
        if (m39915c2 > 0.0d) {
            z3 = true;
        }
        Preconditions.checkState(z3);
        return m39942a(this.f54028c / Math.sqrt(m39941b(m39915c * m39915c2)));
    }

    public double populationCovariance() {
        boolean z;
        if (count() != 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        return this.f54028c / count();
    }

    public final double sampleCovariance() {
        boolean z;
        if (count() > 1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        return this.f54028c / (count() - 1);
    }

    public PairedStats snapshot() {
        return new PairedStats(this.f54026a.snapshot(), this.f54027b.snapshot(), this.f54028c);
    }

    public Stats xStats() {
        return this.f54026a.snapshot();
    }

    public Stats yStats() {
        return this.f54027b.snapshot();
    }
}