package p000;

import io.opencensus.common.Duration;

/* renamed from: q8 */
/* loaded from: classes5.dex */
public final class C13164q8 extends Duration {

    /* renamed from: a */
    public final long f77087a;

    /* renamed from: b */
    public final int f77088b;

    public C13164q8(long j, int i) {
        this.f77087a = j;
        this.f77088b = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        if (this.f77087a == duration.getSeconds() && this.f77088b == duration.getNanos()) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.common.Duration
    public int getNanos() {
        return this.f77088b;
    }

    @Override // io.opencensus.common.Duration
    public long getSeconds() {
        return this.f77087a;
    }

    public int hashCode() {
        long j = this.f77087a;
        return this.f77088b ^ (((int) (1000003 ^ (j ^ (j >>> 32)))) * 1000003);
    }

    public String toString() {
        return "Duration{seconds=" + this.f77087a + ", nanos=" + this.f77088b + "}";
    }
}