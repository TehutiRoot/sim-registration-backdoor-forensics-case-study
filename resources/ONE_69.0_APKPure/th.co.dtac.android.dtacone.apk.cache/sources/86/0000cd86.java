package io.opencensus.trace.export;

import io.opencensus.trace.export.SampledSpanStore;

/* renamed from: io.opencensus.trace.export.e */
/* loaded from: classes5.dex */
public final class C10704e extends SampledSpanStore.LatencyFilter {

    /* renamed from: a */
    public final String f63793a;

    /* renamed from: b */
    public final long f63794b;

    /* renamed from: c */
    public final long f63795c;

    /* renamed from: d */
    public final int f63796d;

    public C10704e(String str, long j, long j2, int i) {
        if (str != null) {
            this.f63793a = str;
            this.f63794b = j;
            this.f63795c = j2;
            this.f63796d = i;
            return;
        }
        throw new NullPointerException("Null spanName");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SampledSpanStore.LatencyFilter)) {
            return false;
        }
        SampledSpanStore.LatencyFilter latencyFilter = (SampledSpanStore.LatencyFilter) obj;
        if (this.f63793a.equals(latencyFilter.getSpanName()) && this.f63794b == latencyFilter.getLatencyLowerNs() && this.f63795c == latencyFilter.getLatencyUpperNs() && this.f63796d == latencyFilter.getMaxSpansToReturn()) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.trace.export.SampledSpanStore.LatencyFilter
    public long getLatencyLowerNs() {
        return this.f63794b;
    }

    @Override // io.opencensus.trace.export.SampledSpanStore.LatencyFilter
    public long getLatencyUpperNs() {
        return this.f63795c;
    }

    @Override // io.opencensus.trace.export.SampledSpanStore.LatencyFilter
    public int getMaxSpansToReturn() {
        return this.f63796d;
    }

    @Override // io.opencensus.trace.export.SampledSpanStore.LatencyFilter
    public String getSpanName() {
        return this.f63793a;
    }

    public int hashCode() {
        long j = this.f63794b;
        long j2 = this.f63795c;
        return (((int) ((((int) (((this.f63793a.hashCode() ^ 1000003) * 1000003) ^ (j ^ (j >>> 32)))) * 1000003) ^ (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f63796d;
    }

    public String toString() {
        return "LatencyFilter{spanName=" + this.f63793a + ", latencyLowerNs=" + this.f63794b + ", latencyUpperNs=" + this.f63795c + ", maxSpansToReturn=" + this.f63796d + "}";
    }
}