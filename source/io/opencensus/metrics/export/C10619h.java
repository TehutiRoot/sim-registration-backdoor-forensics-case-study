package io.opencensus.metrics.export;

import io.opencensus.metrics.export.Value;

/* renamed from: io.opencensus.metrics.export.h */
/* loaded from: classes5.dex */
public final class C10619h extends Value.AbstractC10608a {

    /* renamed from: a */
    public final Distribution f63568a;

    public C10619h(Distribution distribution) {
        if (distribution != null) {
            this.f63568a = distribution;
            return;
        }
        throw new NullPointerException("Null value");
    }

    @Override // io.opencensus.metrics.export.Value.AbstractC10608a
    /* renamed from: b */
    public Distribution mo30212b() {
        return this.f63568a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Value.AbstractC10608a) {
            return this.f63568a.equals(((Value.AbstractC10608a) obj).mo30212b());
        }
        return false;
    }

    public int hashCode() {
        return this.f63568a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ValueDistribution{value=" + this.f63568a + "}";
    }
}
