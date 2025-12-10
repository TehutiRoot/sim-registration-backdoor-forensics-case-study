package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: No2 */
/* loaded from: classes3.dex */
public final class No2 extends WeakReference {

    /* renamed from: a */
    public final int f4273a;

    public No2(Throwable th2, ReferenceQueue referenceQueue) {
        super(th2, referenceQueue);
        if (th2 != null) {
            this.f4273a = System.identityHashCode(th2);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == No2.class) {
            if (this == obj) {
                return true;
            }
            No2 no2 = (No2) obj;
            if (this.f4273a == no2.f4273a && get() == no2.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4273a;
    }
}