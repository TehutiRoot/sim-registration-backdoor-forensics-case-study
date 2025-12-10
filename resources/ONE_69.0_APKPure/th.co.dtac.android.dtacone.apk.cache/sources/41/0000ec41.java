package p000;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.CreationContext;
import com.google.android.datatransport.runtime.time.Clock;

/* renamed from: o8 */
/* loaded from: classes3.dex */
public final class C12417o8 extends CreationContext {

    /* renamed from: a */
    public final Context f72682a;

    /* renamed from: b */
    public final Clock f72683b;

    /* renamed from: c */
    public final Clock f72684c;

    /* renamed from: d */
    public final String f72685d;

    public C12417o8(Context context, Clock clock, Clock clock2, String str) {
        if (context != null) {
            this.f72682a = context;
            if (clock != null) {
                this.f72683b = clock;
                if (clock2 != null) {
                    this.f72684c = clock2;
                    if (str != null) {
                        this.f72685d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreationContext)) {
            return false;
        }
        CreationContext creationContext = (CreationContext) obj;
        if (this.f72682a.equals(creationContext.getApplicationContext()) && this.f72683b.equals(creationContext.getWallClock()) && this.f72684c.equals(creationContext.getMonotonicClock()) && this.f72685d.equals(creationContext.getBackendName())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Context getApplicationContext() {
        return this.f72682a;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public String getBackendName() {
        return this.f72685d;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Clock getMonotonicClock() {
        return this.f72684c;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Clock getWallClock() {
        return this.f72683b;
    }

    public int hashCode() {
        return ((((((this.f72682a.hashCode() ^ 1000003) * 1000003) ^ this.f72683b.hashCode()) * 1000003) ^ this.f72684c.hashCode()) * 1000003) ^ this.f72685d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f72682a + ", wallClock=" + this.f72683b + ", monotonicClock=" + this.f72684c + ", backendName=" + this.f72685d + "}";
    }
}