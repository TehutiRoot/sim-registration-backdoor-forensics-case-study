package io.opencensus.trace.export;

import io.opencensus.trace.export.SampledSpanStore;

/* renamed from: io.opencensus.trace.export.e */
/* loaded from: classes5.dex */
public final class C10717e extends SampledSpanStore.LatencyFilter {

    /* renamed from: a */
    public final String f63730a;

    /* renamed from: b */
    public final long f63731b;

    /* renamed from: c */
    public final long f63732c;

    /* renamed from: d */
    public final int f63733d;

    public C10717e(String str, long j, long j2, int i) {
        if (str != null) {
            this.f63730a = str;
            this.f63731b = j;
            this.f63732c = j2;
            this.f63733d = i;
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
        if (this.f63730a.equals(latencyFilter.getSpanName()) && this.f63731b == latencyFilter.getLatencyLowerNs() && this.f63732c == latencyFilter.getLatencyUpperNs() && this.f63733d == latencyFilter.getMaxSpansToReturn()) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.trace.export.SampledSpanStore.LatencyFilter
    public long getLatencyLowerNs() {
        return this.f63731b;
    }

    @Override // io.opencensus.trace.export.SampledSpanStore.LatencyFilter
    public long getLatencyUpperNs() {
        return this.f63732c;
    }

    @Override // io.opencensus.trace.export.SampledSpanStore.LatencyFilter
    public int getMaxSpansToReturn() {
        return this.f63733d;
    }

    @Override // io.opencensus.trace.export.SampledSpanStore.LatencyFilter
    public String getSpanName() {
        return this.f63730a;
    }

    public int hashCode() {
        long j = this.f63731b;
        long j2 = this.f63732c;
        return (((int) ((((int) (((this.f63730a.hashCode() ^ 1000003) * 1000003) ^ (j ^ (j >>> 32)))) * 1000003) ^ (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f63733d;
    }

    public String toString() {
        return "LatencyFilter{spanName=" + this.f63730a + ", latencyLowerNs=" + this.f63731b + ", latencyUpperNs=" + this.f63732c + ", maxSpansToReturn=" + this.f63733d + "}";
    }
}
