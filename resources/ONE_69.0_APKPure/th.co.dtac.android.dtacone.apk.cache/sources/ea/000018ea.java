package p000;

import io.opencensus.common.ServerStats;

/* renamed from: a9 */
/* loaded from: classes5.dex */
public final class C1852a9 extends ServerStats {

    /* renamed from: a */
    public final long f8358a;

    /* renamed from: b */
    public final long f8359b;

    /* renamed from: c */
    public final byte f8360c;

    public C1852a9(long j, long j2, byte b) {
        this.f8358a = j;
        this.f8359b = j2;
        this.f8360c = b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ServerStats)) {
            return false;
        }
        ServerStats serverStats = (ServerStats) obj;
        if (this.f8358a == serverStats.getLbLatencyNs() && this.f8359b == serverStats.getServiceLatencyNs() && this.f8360c == serverStats.getTraceOption()) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.common.ServerStats
    public long getLbLatencyNs() {
        return this.f8358a;
    }

    @Override // io.opencensus.common.ServerStats
    public long getServiceLatencyNs() {
        return this.f8359b;
    }

    @Override // io.opencensus.common.ServerStats
    public byte getTraceOption() {
        return this.f8360c;
    }

    public int hashCode() {
        long j = this.f8358a;
        long j2 = this.f8359b;
        return this.f8360c ^ (((int) ((((int) (1000003 ^ (j ^ (j >>> 32)))) * 1000003) ^ (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "ServerStats{lbLatencyNs=" + this.f8358a + ", serviceLatencyNs=" + this.f8359b + ", traceOption=" + ((int) this.f8360c) + "}";
    }
}