package p000;

import com.google.firebase.StartupTime;

/* renamed from: b9 */
/* loaded from: classes4.dex */
public final class C5334b9 extends StartupTime {

    /* renamed from: a */
    public final long f39007a;

    /* renamed from: b */
    public final long f39008b;

    /* renamed from: c */
    public final long f39009c;

    public C5334b9(long j, long j2, long j3) {
        this.f39007a = j;
        this.f39008b = j2;
        this.f39009c = j3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartupTime)) {
            return false;
        }
        StartupTime startupTime = (StartupTime) obj;
        if (this.f39007a == startupTime.getEpochMillis() && this.f39008b == startupTime.getElapsedRealtime() && this.f39009c == startupTime.getUptimeMillis()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.StartupTime
    public long getElapsedRealtime() {
        return this.f39008b;
    }

    @Override // com.google.firebase.StartupTime
    public long getEpochMillis() {
        return this.f39007a;
    }

    @Override // com.google.firebase.StartupTime
    public long getUptimeMillis() {
        return this.f39009c;
    }

    public int hashCode() {
        long j = this.f39007a;
        long j2 = this.f39008b;
        long j3 = this.f39009c;
        return ((int) ((j3 >>> 32) ^ j3)) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f39007a + ", elapsedRealtime=" + this.f39008b + ", uptimeMillis=" + this.f39009c + "}";
    }
}