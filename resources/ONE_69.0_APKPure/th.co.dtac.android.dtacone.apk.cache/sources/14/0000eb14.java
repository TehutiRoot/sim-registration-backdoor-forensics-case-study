package p000;

import io.opencensus.common.Timestamp;

/* renamed from: n9 */
/* loaded from: classes5.dex */
public final class C12331n9 extends Timestamp {

    /* renamed from: a */
    public final long f72265a;

    /* renamed from: b */
    public final int f72266b;

    public C12331n9(long j, int i) {
        this.f72265a = j;
        this.f72266b = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Timestamp)) {
            return false;
        }
        Timestamp timestamp = (Timestamp) obj;
        if (this.f72265a == timestamp.getSeconds() && this.f72266b == timestamp.getNanos()) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.common.Timestamp
    public int getNanos() {
        return this.f72266b;
    }

    @Override // io.opencensus.common.Timestamp
    public long getSeconds() {
        return this.f72265a;
    }

    public int hashCode() {
        long j = this.f72265a;
        return this.f72266b ^ (((int) (1000003 ^ (j ^ (j >>> 32)))) * 1000003);
    }

    public String toString() {
        return "Timestamp{seconds=" + this.f72265a + ", nanos=" + this.f72266b + "}";
    }
}