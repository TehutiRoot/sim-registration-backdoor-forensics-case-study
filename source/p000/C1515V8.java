package p000;

import com.google.firebase.heartbeatinfo.SdkHeartBeatResult;

/* renamed from: V8 */
/* loaded from: classes4.dex */
public final class C1515V8 extends SdkHeartBeatResult {

    /* renamed from: a */
    public final String f6558a;

    /* renamed from: b */
    public final long f6559b;

    public C1515V8(String str, long j) {
        if (str != null) {
            this.f6558a = str;
            this.f6559b = j;
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
        if (this.f6558a.equals(sdkHeartBeatResult.getSdkName()) && this.f6559b == sdkHeartBeatResult.getMillis()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public long getMillis() {
        return this.f6559b;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public String getSdkName() {
        return this.f6558a;
    }

    public int hashCode() {
        long j = this.f6559b;
        return ((this.f6558a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "SdkHeartBeatResult{sdkName=" + this.f6558a + ", millis=" + this.f6559b + "}";
    }
}
