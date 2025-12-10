package p000;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.CreationContext;
import com.google.android.datatransport.runtime.time.Clock;

/* renamed from: o8 */
/* loaded from: classes3.dex */
public final class C12420o8 extends CreationContext {

    /* renamed from: a */
    public final Context f72570a;

    /* renamed from: b */
    public final Clock f72571b;

    /* renamed from: c */
    public final Clock f72572c;

    /* renamed from: d */
    public final String f72573d;

    public C12420o8(Context context, Clock clock, Clock clock2, String str) {
        if (context != null) {
            this.f72570a = context;
            if (clock != null) {
                this.f72571b = clock;
                if (clock2 != null) {
                    this.f72572c = clock2;
                    if (str != null) {
                        this.f72573d = str;
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
        if (this.f72570a.equals(creationContext.getApplicationContext()) && this.f72571b.equals(creationContext.getWallClock()) && this.f72572c.equals(creationContext.getMonotonicClock()) && this.f72573d.equals(creationContext.getBackendName())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Context getApplicationContext() {
        return this.f72570a;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public String getBackendName() {
        return this.f72573d;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Clock getMonotonicClock() {
        return this.f72572c;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Clock getWallClock() {
        return this.f72571b;
    }

    public int hashCode() {
        return ((((((this.f72570a.hashCode() ^ 1000003) * 1000003) ^ this.f72571b.hashCode()) * 1000003) ^ this.f72572c.hashCode()) * 1000003) ^ this.f72573d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f72570a + ", wallClock=" + this.f72571b + ", monotonicClock=" + this.f72572c + ", backendName=" + this.f72573d + "}";
    }
}
