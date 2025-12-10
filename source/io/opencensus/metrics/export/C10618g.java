package io.opencensus.metrics.export;

import io.opencensus.metrics.export.Summary;

/* renamed from: io.opencensus.metrics.export.g */
/* loaded from: classes5.dex */
public final class C10618g extends Summary.Snapshot.ValueAtPercentile {

    /* renamed from: a */
    public final double f63566a;

    /* renamed from: b */
    public final double f63567b;

    public C10618g(double d, double d2) {
        this.f63566a = d;
        this.f63567b = d2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Summary.Snapshot.ValueAtPercentile)) {
            return false;
        }
        Summary.Snapshot.ValueAtPercentile valueAtPercentile = (Summary.Snapshot.ValueAtPercentile) obj;
        if (Double.doubleToLongBits(this.f63566a) == Double.doubleToLongBits(valueAtPercentile.getPercentile()) && Double.doubleToLongBits(this.f63567b) == Double.doubleToLongBits(valueAtPercentile.getValue())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.metrics.export.Summary.Snapshot.ValueAtPercentile
    public double getPercentile() {
        return this.f63566a;
    }

    @Override // io.opencensus.metrics.export.Summary.Snapshot.ValueAtPercentile
    public double getValue() {
        return this.f63567b;
    }

    public int hashCode() {
        return (int) ((((int) (1000003 ^ ((Double.doubleToLongBits(this.f63566a) >>> 32) ^ Double.doubleToLongBits(this.f63566a)))) * 1000003) ^ ((Double.doubleToLongBits(this.f63567b) >>> 32) ^ Double.doubleToLongBits(this.f63567b)));
    }

    public String toString() {
        return "ValueAtPercentile{percentile=" + this.f63566a + ", value=" + this.f63567b + "}";
    }
}
