package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: cI2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19331cI2 extends WeakReference {

    /* renamed from: a */
    public final int f39391a;

    public C19331cI2(Throwable th2, ReferenceQueue referenceQueue) {
        super(th2, referenceQueue);
        if (th2 != null) {
            this.f39391a = System.identityHashCode(th2);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C19331cI2.class) {
            if (this == obj) {
                return true;
            }
            C19331cI2 c19331cI2 = (C19331cI2) obj;
            if (this.f39391a == c19331cI2.f39391a && get() == c19331cI2.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f39391a;
    }
}
