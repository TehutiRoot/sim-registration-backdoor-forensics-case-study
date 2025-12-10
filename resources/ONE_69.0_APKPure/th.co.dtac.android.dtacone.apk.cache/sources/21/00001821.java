package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: ZI2 */
/* loaded from: classes3.dex */
public final class ZI2 extends WeakReference {

    /* renamed from: a */
    public final int f8152a;

    public ZI2(Throwable th2, ReferenceQueue referenceQueue) {
        super(th2, referenceQueue);
        if (th2 != null) {
            this.f8152a = System.identityHashCode(th2);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == ZI2.class) {
            if (this == obj) {
                return true;
            }
            ZI2 zi2 = (ZI2) obj;
            if (this.f8152a == zi2.f8152a && get() == zi2.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8152a;
    }
}