package io.opencensus.stats;

import io.opencensus.stats.AggregationData;

/* renamed from: io.opencensus.stats.g */
/* loaded from: classes5.dex */
public final class C10647g extends AggregationData.SumDataLong {

    /* renamed from: a */
    public final long f63617a;

    public C10647g(long j) {
        this.f63617a = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AggregationData.SumDataLong) && this.f63617a == ((AggregationData.SumDataLong) obj).getSum()) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.stats.AggregationData.SumDataLong
    public long getSum() {
        return this.f63617a;
    }

    public int hashCode() {
        long j = this.f63617a;
        return (int) (1000003 ^ (j ^ (j >>> 32)));
    }

    public String toString() {
        return "SumDataLong{sum=" + this.f63617a + "}";
    }
}
