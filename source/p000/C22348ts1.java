package p000;

import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;

/* renamed from: ts1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C22348ts1 implements Waiter {

    /* renamed from: a */
    public final CancellableContinuationImpl f107229a;

    public C22348ts1(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f107229a = cancellableContinuationImpl;
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(Segment segment, int i) {
        this.f107229a.invokeOnCancellation(segment, i);
    }
}
