package p000;

import com.google.firebase.heartbeatinfo.SdkHeartBeatResult;

/* renamed from: V8 */
/* loaded from: classes4.dex */
public final class C1495V8 extends SdkHeartBeatResult {

    /* renamed from: a */
    public final String f6831a;

    /* renamed from: b */
    public final long f6832b;

    public C1495V8(String str, long j) {
        if (str != null) {
            this.f6831a = str;
            this.f6832b = j;
            return;
        }
        throw new NullPointerException("Null sdkName");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SdkHeartBeatResult)) {
            return false;
        }
        SdkHeartBeatResult sdkHeartBeatResult = (SdkHeartBeatResult) obj;
        if (this.f6831a.equals(sdkHeartBeatResult.getSdkName()) && this.f6832b == sdkHeartBeatResult.getMillis()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public long getMillis() {
        return this.f6832b;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public String getSdkName() {
        return this.f6831a;
    }

    public int hashCode() {
        long j = this.f6832b;
        return ((this.f6831a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "SdkHeartBeatResult{sdkName=" + this.f6831a + ", millis=" + this.f6832b + "}";
    }
}