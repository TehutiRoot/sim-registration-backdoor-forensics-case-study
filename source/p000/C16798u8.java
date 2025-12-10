package p000;

import com.google.firebase.heartbeatinfo.HeartBeatResult;
import java.util.List;

/* renamed from: u8 */
/* loaded from: classes4.dex */
public final class C16798u8 extends HeartBeatResult {

    /* renamed from: a */
    public final String f107287a;

    /* renamed from: b */
    public final List f107288b;

    public C16798u8(String str, List list) {
        if (str != null) {
            this.f107287a = str;
            if (list != null) {
                this.f107288b = list;
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
        if (this.f107287a.equals(heartBeatResult.getUserAgent()) && this.f107288b.equals(heartBeatResult.getUsedDates())) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public List getUsedDates() {
        return this.f107288b;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public String getUserAgent() {
        return this.f107287a;
    }

    public int hashCode() {
        return ((this.f107287a.hashCode() ^ 1000003) * 1000003) ^ this.f107288b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f107287a + ", usedDates=" + this.f107288b + "}";
    }
}
