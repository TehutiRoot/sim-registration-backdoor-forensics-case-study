package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xo1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC23094xo1 {
    /* renamed from: a */
    public static /* synthetic */ boolean m479a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}