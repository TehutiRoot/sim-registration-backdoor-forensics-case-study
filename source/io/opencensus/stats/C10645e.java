package io.opencensus.stats;

import io.opencensus.stats.AggregationData;

/* renamed from: io.opencensus.stats.e */
/* loaded from: classes5.dex */
public final class C10645e extends AggregationData.MeanData {

    /* renamed from: a */
    public final double f63614a;

    /* renamed from: b */
    public final long f63615b;

    public C10645e(double d, long j) {
        this.f63614a = d;
        this.f63615b = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AggregationData.MeanData)) {
            return false;
        }
        AggregationData.MeanData meanData = (AggregationData.MeanData) obj;
        if (Double.doubleToLongBits(this.f63614a) == Double.doubleToLongBits(meanData.getMean()) && this.f63615b == meanData.getCount()) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.stats.AggregationData.MeanData
    public long getCount() {
        return this.f63615b;
    }

    @Override // io.opencensus.stats.AggregationData.MeanData
    public double getMean() {
        return this.f63614a;
    }

    public int hashCode() {
        long doubleToLongBits = ((int) (1000003 ^ ((Double.doubleToLongBits(this.f63614a) >>> 32) ^ Double.doubleToLongBits(this.f63614a)))) * 1000003;
        long j = this.f63615b;
        return (int) (doubleToLongBits ^ (j ^ (j >>> 32)));
    }

    public String toString() {
        return "MeanData{mean=" + this.f63614a + ", count=" + this.f63615b + "}";
    }
}
