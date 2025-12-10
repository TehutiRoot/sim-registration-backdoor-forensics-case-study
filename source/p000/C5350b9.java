package p000;

import com.google.firebase.StartupTime;

/* renamed from: b9 */
/* loaded from: classes4.dex */
public final class C5350b9 extends StartupTime {

    /* renamed from: a */
    public final long f38948a;

    /* renamed from: b */
    public final long f38949b;

    /* renamed from: c */
    public final long f38950c;

    public C5350b9(long j, long j2, long j3) {
        this.f38948a = j;
        this.f38949b = j2;
        this.f38950c = j3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartupTime)) {
            return false;
        }
        StartupTime startupTime = (StartupTime) obj;
        if (this.f38948a == startupTime.getEpochMillis() && this.f38949b == startupTime.getElapsedRealtime() && this.f38950c == startupTime.getUptimeMillis()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.StartupTime
    public long getElapsedRealtime() {
        return this.f38949b;
    }

    @Override // com.google.firebase.StartupTime
    public long getEpochMillis() {
        return this.f38948a;
    }

    @Override // com.google.firebase.StartupTime
    public long getUptimeMillis() {
        return this.f38950c;
    }

    public int hashCode() {
        long j = this.f38948a;
        long j2 = this.f38949b;
        long j3 = this.f38950c;
        return ((int) ((j3 >>> 32) ^ j3)) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f38948a + ", elapsedRealtime=" + this.f38949b + ", uptimeMillis=" + this.f38950c + "}";
    }
}
