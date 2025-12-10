package io.opencensus.metrics.export;

import io.opencensus.metrics.export.Value;

/* renamed from: io.opencensus.metrics.export.h */
/* loaded from: classes5.dex */
public final class C10606h extends Value.AbstractC10595a {

    /* renamed from: a */
    public final Distribution f63631a;

    public C10606h(Distribution distribution) {
        if (distribution != null) {
            this.f63631a = distribution;
            return;
        }
        throw new NullPointerException("Null value");
    }

    @Override // io.opencensus.metrics.export.Value.AbstractC10595a
    /* renamed from: b */
    public Distribution mo30552b() {
        return this.f63631a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Value.AbstractC10595a) {
            return this.f63631a.equals(((Value.AbstractC10595a) obj).mo30552b());
        }
        return false;
    }

    public int hashCode() {
        return this.f63631a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ValueDistribution{value=" + this.f63631a + "}";
    }
}