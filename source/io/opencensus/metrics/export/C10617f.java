package io.opencensus.metrics.export;

import io.opencensus.metrics.export.Summary;
import java.util.List;

/* renamed from: io.opencensus.metrics.export.f */
/* loaded from: classes5.dex */
public final class C10617f extends Summary.Snapshot {

    /* renamed from: a */
    public final Long f63563a;

    /* renamed from: b */
    public final Double f63564b;

    /* renamed from: c */
    public final List f63565c;

    public C10617f(Long l, Double d, List list) {
        this.f63563a = l;
        this.f63564b = d;
        if (list != null) {
            this.f63565c = list;
            return;
        }
        throw new NullPointerException("Null valueAtPercentiles");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Summary.Snapshot)) {
            return false;
        }
        Summary.Snapshot snapshot = (Summary.Snapshot) obj;
        Long l = this.f63563a;
        if (l != null ? l.equals(snapshot.getCount()) : snapshot.getCount() == null) {
            Double d = this.f63564b;
            if (d != null ? d.equals(snapshot.getSum()) : snapshot.getSum() == null) {
                if (this.f63565c.equals(snapshot.getValueAtPercentiles())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // io.opencensus.metrics.export.Summary.Snapshot
    public Long getCount() {
        return this.f63563a;
    }

    @Override // io.opencensus.metrics.export.Summary.Snapshot
    public Double getSum() {
        return this.f63564b;
    }

    @Override // io.opencensus.metrics.export.Summary.Snapshot
    public List getValueAtPercentiles() {
        return this.f63565c;
    }

    public int hashCode() {
        int hashCode;
        Long l = this.f63563a;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        Double d = this.f63564b;
        if (d != null) {
            i = d.hashCode();
        }
        return ((i2 ^ i) * 1000003) ^ this.f63565c.hashCode();
    }

    public String toString() {
        return "Snapshot{count=" + this.f63563a + ", sum=" + this.f63564b + ", valueAtPercentiles=" + this.f63565c + "}";
    }
}
