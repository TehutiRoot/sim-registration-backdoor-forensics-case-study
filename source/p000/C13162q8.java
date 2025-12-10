package p000;

import io.opencensus.common.Duration;

/* renamed from: q8 */
/* loaded from: classes5.dex */
public final class C13162q8 extends Duration {

    /* renamed from: a */
    public final long f76876a;

    /* renamed from: b */
    public final int f76877b;

    public C13162q8(long j, int i) {
        this.f76876a = j;
        this.f76877b = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        if (this.f76876a == duration.getSeconds() && this.f76877b == duration.getNanos()) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.common.Duration
    public int getNanos() {
        return this.f76877b;
    }

    @Override // io.opencensus.common.Duration
    public long getSeconds() {
        return this.f76876a;
    }

    public int hashCode() {
        long j = this.f76876a;
        return this.f76877b ^ (((int) (1000003 ^ (j ^ (j >>> 32)))) * 1000003);
    }

    public String toString() {
        return "Duration{seconds=" + this.f76876a + ", nanos=" + this.f76877b + "}";
    }
}
