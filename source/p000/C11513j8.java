package p000;

import com.google.android.datatransport.cct.internal.BatchedLogRequest;
import java.util.List;

/* renamed from: j8 */
/* loaded from: classes3.dex */
public final class C11513j8 extends BatchedLogRequest {

    /* renamed from: a */
    public final List f67177a;

    public C11513j8(List list) {
        if (list != null) {
            this.f67177a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BatchedLogRequest) {
            return this.f67177a.equals(((BatchedLogRequest) obj).getLogRequests());
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.BatchedLogRequest
    public List getLogRequests() {
        return this.f67177a;
    }

    public int hashCode() {
        return this.f67177a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f67177a + "}";
    }
}
