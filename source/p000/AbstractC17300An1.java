package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: An1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC17300An1 {
    /* renamed from: a */
    public static /* synthetic */ boolean m69050a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
