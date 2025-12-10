package io.opencensus.stats;

import io.opencensus.stats.AggregationData;

/* renamed from: io.opencensus.stats.a */
/* loaded from: classes5.dex */
public final class C10641a extends AggregationData.CountData {

    /* renamed from: a */
    public final long f63606a;

    public C10641a(long j) {
        this.f63606a = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AggregationData.CountData) && this.f63606a == ((AggregationData.CountData) obj).getCount()) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.stats.AggregationData.CountData
    public long getCount() {
        return this.f63606a;
    }

    public int hashCode() {
        long j = this.f63606a;
        return (int) (1000003 ^ (j ^ (j >>> 32)));
    }

    public String toString() {
        return "CountData{count=" + this.f63606a + "}";
    }
}
