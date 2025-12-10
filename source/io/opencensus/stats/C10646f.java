package io.opencensus.stats;

import io.opencensus.stats.AggregationData;

/* renamed from: io.opencensus.stats.f */
/* loaded from: classes5.dex */
public final class C10646f extends AggregationData.SumDataDouble {

    /* renamed from: a */
    public final double f63616a;

    public C10646f(double d) {
        this.f63616a = d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AggregationData.SumDataDouble) && Double.doubleToLongBits(this.f63616a) == Double.doubleToLongBits(((AggregationData.SumDataDouble) obj).getSum())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.stats.AggregationData.SumDataDouble
    public double getSum() {
        return this.f63616a;
    }

    public int hashCode() {
        return (int) (1000003 ^ ((Double.doubleToLongBits(this.f63616a) >>> 32) ^ Double.doubleToLongBits(this.f63616a)));
    }

    public String toString() {
        return "SumDataDouble{sum=" + this.f63616a + "}";
    }
}
