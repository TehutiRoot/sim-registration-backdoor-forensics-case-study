package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: p0 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC13055p0 {
    /* renamed from: a */
    public static /* synthetic */ boolean m23740a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
