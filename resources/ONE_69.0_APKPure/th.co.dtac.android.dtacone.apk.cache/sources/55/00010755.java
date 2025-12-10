package p000;

import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;

/* renamed from: qt1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C21898qt1 implements Waiter {

    /* renamed from: a */
    public final CancellableContinuationImpl f77341a;

    public C21898qt1(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f77341a = cancellableContinuationImpl;
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(Segment segment, int i) {
        this.f77341a.invokeOnCancellation(segment, i);
    }
}