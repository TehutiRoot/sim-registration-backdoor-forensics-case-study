package io.opencensus.stats;

import io.opencensus.stats.AggregationData;

/* renamed from: io.opencensus.stats.d */
/* loaded from: classes5.dex */
public final class C10644d extends AggregationData.LastValueDataLong {

    /* renamed from: a */
    public final long f63613a;

    public C10644d(long j) {
        this.f63613a = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AggregationData.LastValueDataLong) && this.f63613a == ((AggregationData.LastValueDataLong) obj).getLastValue()) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.stats.AggregationData.LastValueDataLong
    public long getLastValue() {
        return this.f63613a;
    }

    public int hashCode() {
        long j = this.f63613a;
        return (int) (1000003 ^ (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LastValueDataLong{lastValue=" + this.f63613a + "}";
    }
}
