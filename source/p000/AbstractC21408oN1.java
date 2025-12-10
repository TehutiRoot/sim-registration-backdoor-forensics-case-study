package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: oN1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC21408oN1 {
    /* renamed from: a */
    public static /* synthetic */ boolean m25928a(AtomicReferenceArray atomicReferenceArray, int i, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i, obj, obj2)) {
            if (atomicReferenceArray.get(i) != obj) {
                return false;
            }
        }
        return true;
    }
}
