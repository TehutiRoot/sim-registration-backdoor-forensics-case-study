package io.opencensus.metrics.export;

import io.opencensus.metrics.export.Value;

/* renamed from: io.opencensus.metrics.export.i */
/* loaded from: classes5.dex */
public final class C10607i extends Value.AbstractC10596b {

    /* renamed from: a */
    public final double f63632a;

    public C10607i(double d) {
        this.f63632a = d;
    }

    @Override // io.opencensus.metrics.export.Value.AbstractC10596b
    /* renamed from: b */
    public double mo30551b() {
        return this.f63632a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof Value.AbstractC10596b) && Double.doubleToLongBits(this.f63632a) == Double.doubleToLongBits(((Value.AbstractC10596b) obj).mo30551b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (int) (1000003 ^ ((Double.doubleToLongBits(this.f63632a) >>> 32) ^ Double.doubleToLongBits(this.f63632a)));
    }

    public String toString() {
        return "ValueDouble{value=" + this.f63632a + "}";
    }
}