package p000;

import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;

/* renamed from: Ny1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC18191Ny1 implements Runnable {

    /* renamed from: a */
    public final CoroutineDispatcher f4319a;

    /* renamed from: b */
    public final CancellableContinuation f4320b;

    public RunnableC18191Ny1(CoroutineDispatcher coroutineDispatcher, CancellableContinuation cancellableContinuation) {
        this.f4319a = coroutineDispatcher;
        this.f4320b = cancellableContinuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4320b.resumeUndispatched(this.f4319a, Unit.INSTANCE);
    }
}