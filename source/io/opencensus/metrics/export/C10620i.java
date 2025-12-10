package io.opencensus.metrics.export;

import io.opencensus.metrics.export.Value;

/* renamed from: io.opencensus.metrics.export.i */
/* loaded from: classes5.dex */
public final class C10620i extends Value.AbstractC10609b {

    /* renamed from: a */
    public final double f63569a;

    public C10620i(double d) {
        this.f63569a = d;
    }

    @Override // io.opencensus.metrics.export.Value.AbstractC10609b
    /* renamed from: b */
    public double mo30211b() {
        return this.f63569a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof Value.AbstractC10609b) && Double.doubleToLongBits(this.f63569a) == Double.doubleToLongBits(((Value.AbstractC10609b) obj).mo30211b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (int) (1000003 ^ ((Double.doubleToLongBits(this.f63569a) >>> 32) ^ Double.doubleToLongBits(this.f63569a)));
    }

    public String toString() {
        return "ValueDouble{value=" + this.f63569a + "}";
    }
}
