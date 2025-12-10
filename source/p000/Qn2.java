package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: Qn2 */
/* loaded from: classes3.dex */
public final class Qn2 extends WeakReference {

    /* renamed from: a */
    public final int f5167a;

    public Qn2(Throwable th2, ReferenceQueue referenceQueue) {
        super(th2, referenceQueue);
        if (th2 != null) {
            this.f5167a = System.identityHashCode(th2);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == Qn2.class) {
            if (this == obj) {
                return true;
            }
            Qn2 qn2 = (Qn2) obj;
            if (this.f5167a == qn2.f5167a && get() == qn2.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5167a;
    }
}
