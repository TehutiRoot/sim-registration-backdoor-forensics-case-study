package p000;

import io.opencensus.common.Timestamp;

/* renamed from: n9 */
/* loaded from: classes5.dex */
public final class C12339n9 extends Timestamp {

    /* renamed from: a */
    public final long f72138a;

    /* renamed from: b */
    public final int f72139b;

    public C12339n9(long j, int i) {
        this.f72138a = j;
        this.f72139b = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Timestamp)) {
            return false;
        }
        Timestamp timestamp = (Timestamp) obj;
        if (this.f72138a == timestamp.getSeconds() && this.f72139b == timestamp.getNanos()) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.common.Timestamp
    public int getNanos() {
        return this.f72139b;
    }

    @Override // io.opencensus.common.Timestamp
    public long getSeconds() {
        return this.f72138a;
    }

    public int hashCode() {
        long j = this.f72138a;
        return this.f72139b ^ (((int) (1000003 ^ (j ^ (j >>> 32)))) * 1000003);
    }

    public String toString() {
        return "Timestamp{seconds=" + this.f72138a + ", nanos=" + this.f72139b + "}";
    }
}
