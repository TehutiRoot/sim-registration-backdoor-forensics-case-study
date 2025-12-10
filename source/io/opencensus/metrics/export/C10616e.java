package io.opencensus.metrics.export;

import io.opencensus.metrics.export.Summary;

/* renamed from: io.opencensus.metrics.export.e */
/* loaded from: classes5.dex */
public final class C10616e extends Summary {

    /* renamed from: a */
    public final Long f63560a;

    /* renamed from: b */
    public final Double f63561b;

    /* renamed from: c */
    public final Summary.Snapshot f63562c;

    public C10616e(Long l, Double d, Summary.Snapshot snapshot) {
        this.f63560a = l;
        this.f63561b = d;
        if (snapshot != null) {
            this.f63562c = snapshot;
            return;
        }
        throw new NullPointerException("Null snapshot");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Summary)) {
            return false;
        }
        Summary summary = (Summary) obj;
        Long l = this.f63560a;
        if (l != null ? l.equals(summary.getCount()) : summary.getCount() == null) {
            Double d = this.f63561b;
            if (d != null ? d.equals(summary.getSum()) : summary.getSum() == null) {
                if (this.f63562c.equals(summary.getSnapshot())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // io.opencensus.metrics.export.Summary
    public Long getCount() {
        return this.f63560a;
    }

    @Override // io.opencensus.metrics.export.Summary
    public Summary.Snapshot getSnapshot() {
        return this.f63562c;
    }

    @Override // io.opencensus.metrics.export.Summary
    public Double getSum() {
        return this.f63561b;
    }

    public int hashCode() {
        int hashCode;
        Long l = this.f63560a;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        Double d = this.f63561b;
        if (d != null) {
            i = d.hashCode();
        }
        return ((i2 ^ i) * 1000003) ^ this.f63562c.hashCode();
    }

    public String toString() {
        return "Summary{count=" + this.f63560a + ", sum=" + this.f63561b + ", snapshot=" + this.f63562c + "}";
    }
}
