package p000;

import io.opencensus.common.ServerStats;

/* renamed from: a9 */
/* loaded from: classes5.dex */
public final class C1874a9 extends ServerStats {

    /* renamed from: a */
    public final long f8246a;

    /* renamed from: b */
    public final long f8247b;

    /* renamed from: c */
    public final byte f8248c;

    public C1874a9(long j, long j2, byte b) {
        this.f8246a = j;
        this.f8247b = j2;
        this.f8248c = b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ServerStats)) {
            return false;
        }
        ServerStats serverStats = (ServerStats) obj;
        if (this.f8246a == serverStats.getLbLatencyNs() && this.f8247b == serverStats.getServiceLatencyNs() && this.f8248c == serverStats.getTraceOption()) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.common.ServerStats
    public long getLbLatencyNs() {
        return this.f8246a;
    }

    @Override // io.opencensus.common.ServerStats
    public long getServiceLatencyNs() {
        return this.f8247b;
    }

    @Override // io.opencensus.common.ServerStats
    public byte getTraceOption() {
        return this.f8248c;
    }

    public int hashCode() {
        long j = this.f8246a;
        long j2 = this.f8247b;
        return this.f8248c ^ (((int) ((((int) (1000003 ^ (j ^ (j >>> 32)))) * 1000003) ^ (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "ServerStats{lbLatencyNs=" + this.f8246a + ", serviceLatencyNs=" + this.f8247b + ", traceOption=" + ((int) this.f8248c) + "}";
    }
}
