package io.opencensus.metrics.export;

import io.opencensus.metrics.export.Value;

/* renamed from: io.opencensus.metrics.export.j */
/* loaded from: classes5.dex */
public final class C10608j extends Value.AbstractC10597c {

    /* renamed from: a */
    public final long f63633a;

    public C10608j(long j) {
        this.f63633a = j;
    }

    @Override // io.opencensus.metrics.export.Value.AbstractC10597c
    /* renamed from: b */
    public long mo30550b() {
        return this.f63633a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof Value.AbstractC10597c) && this.f63633a == ((Value.AbstractC10597c) obj).mo30550b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f63633a;
        return (int) (1000003 ^ (j ^ (j >>> 32)));
    }

    public String toString() {
        return "ValueLong{value=" + this.f63633a + "}";
    }
}