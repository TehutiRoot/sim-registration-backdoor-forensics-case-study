package p000;

import com.google.firebase.heartbeatinfo.HeartBeatResult;
import java.util.List;

/* renamed from: u8 */
/* loaded from: classes4.dex */
public final class C16814u8 extends HeartBeatResult {

    /* renamed from: a */
    public final String f107626a;

    /* renamed from: b */
    public final List f107627b;

    public C16814u8(String str, List list) {
        if (str != null) {
            this.f107626a = str;
            if (list != null) {
                this.f107627b = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeartBeatResult)) {
            return false;
        }
        HeartBeatResult heartBeatResult = (HeartBeatResult) obj;
        if (this.f107626a.equals(heartBeatResult.getUserAgent()) && this.f107627b.equals(heartBeatResult.getUsedDates())) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public List getUsedDates() {
        return this.f107627b;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public String getUserAgent() {
        return this.f107626a;
    }

    public int hashCode() {
        return ((this.f107626a.hashCode() ^ 1000003) * 1000003) ^ this.f107627b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f107626a + ", usedDates=" + this.f107627b + "}";
    }
}