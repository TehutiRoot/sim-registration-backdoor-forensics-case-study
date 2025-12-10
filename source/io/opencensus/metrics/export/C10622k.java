package io.opencensus.metrics.export;

import io.opencensus.metrics.export.Value;

/* renamed from: io.opencensus.metrics.export.k */
/* loaded from: classes5.dex */
public final class C10622k extends Value.AbstractC10611d {

    /* renamed from: a */
    public final Summary f63571a;

    public C10622k(Summary summary) {
        if (summary != null) {
            this.f63571a = summary;
            return;
        }
        throw new NullPointerException("Null value");
    }

    @Override // io.opencensus.metrics.export.Value.AbstractC10611d
    /* renamed from: b */
    public Summary mo30209b() {
        return this.f63571a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Value.AbstractC10611d) {
            return this.f63571a.equals(((Value.AbstractC10611d) obj).mo30209b());
        }
        return false;
    }

    public int hashCode() {
        return this.f63571a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ValueSummary{value=" + this.f63571a + "}";
    }
}
