package p000;

import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;

/* renamed from: Qx1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC18344Qx1 implements Runnable {

    /* renamed from: a */
    public final CoroutineDispatcher f5226a;

    /* renamed from: b */
    public final CancellableContinuation f5227b;

    public RunnableC18344Qx1(CoroutineDispatcher coroutineDispatcher, CancellableContinuation cancellableContinuation) {
        this.f5226a = coroutineDispatcher;
        this.f5227b = cancellableContinuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5227b.resumeUndispatched(this.f5226a, Unit.INSTANCE);
    }
}
