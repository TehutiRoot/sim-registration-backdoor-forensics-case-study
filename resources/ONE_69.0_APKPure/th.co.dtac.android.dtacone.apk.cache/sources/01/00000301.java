package p000;

import com.google.android.datatransport.cct.internal.LogResponse;

/* renamed from: D8 */
/* loaded from: classes3.dex */
public final class C0226D8 extends LogResponse {

    /* renamed from: a */
    public final long f942a;

    public C0226D8(long j) {
        this.f942a = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof LogResponse) && this.f942a == ((LogResponse) obj).getNextRequestWaitMillis()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.LogResponse
    public long getNextRequestWaitMillis() {
        return this.f942a;
    }

    public int hashCode() {
        long j = this.f942a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f942a + "}";
    }
}