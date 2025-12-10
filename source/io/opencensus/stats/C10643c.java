package io.opencensus.stats;

import io.opencensus.stats.AggregationData;

/* renamed from: io.opencensus.stats.c */
/* loaded from: classes5.dex */
public final class C10643c extends AggregationData.LastValueDataDouble {

    /* renamed from: a */
    public final double f63612a;

    public C10643c(double d) {
        this.f63612a = d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AggregationData.LastValueDataDouble) && Double.doubleToLongBits(this.f63612a) == Double.doubleToLongBits(((AggregationData.LastValueDataDouble) obj).getLastValue())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.stats.AggregationData.LastValueDataDouble
    public double getLastValue() {
        return this.f63612a;
    }

    public int hashCode() {
        return (int) (1000003 ^ ((Double.doubleToLongBits(this.f63612a) >>> 32) ^ Double.doubleToLongBits(this.f63612a)));
    }

    public String toString() {
        return "LastValueDataDouble{lastValue=" + this.f63612a + "}";
    }
}
