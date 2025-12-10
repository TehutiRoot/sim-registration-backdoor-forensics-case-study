package io.opencensus.metrics.export;

import io.opencensus.metrics.export.Value;

/* renamed from: io.opencensus.metrics.export.j */
/* loaded from: classes5.dex */
public final class C10621j extends Value.AbstractC10610c {

    /* renamed from: a */
    public final long f63570a;

    public C10621j(long j) {
        this.f63570a = j;
    }

    @Override // io.opencensus.metrics.export.Value.AbstractC10610c
    /* renamed from: b */
    public long mo30210b() {
        return this.f63570a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof Value.AbstractC10610c) && this.f63570a == ((Value.AbstractC10610c) obj).mo30210b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f63570a;
        return (int) (1000003 ^ (j ^ (j >>> 32)));
    }

    public String toString() {
        return "ValueLong{value=" + this.f63570a + "}";
    }
}
