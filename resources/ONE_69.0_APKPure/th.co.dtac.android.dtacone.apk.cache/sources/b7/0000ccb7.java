package io.opencensus.metrics.export;

import io.opencensus.metrics.export.Value;

/* renamed from: io.opencensus.metrics.export.k */
/* loaded from: classes5.dex */
public final class C10609k extends Value.AbstractC10598d {

    /* renamed from: a */
    public final Summary f63634a;

    public C10609k(Summary summary) {
        if (summary != null) {
            this.f63634a = summary;
            return;
        }
        throw new NullPointerException("Null value");
    }

    @Override // io.opencensus.metrics.export.Value.AbstractC10598d
    /* renamed from: b */
    public Summary mo30549b() {
        return this.f63634a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Value.AbstractC10598d) {
            return this.f63634a.equals(((Value.AbstractC10598d) obj).mo30549b());
        }
        return false;
    }

    public int hashCode() {
        return this.f63634a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ValueSummary{value=" + this.f63634a + "}";
    }
}