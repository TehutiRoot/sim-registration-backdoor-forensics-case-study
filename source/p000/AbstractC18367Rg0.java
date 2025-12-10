package p000;

import java.util.concurrent.Future;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;

/* renamed from: Rg0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC18367Rg0 {
    /* renamed from: a */
    public static final void m66434a(CancellableContinuation cancellableContinuation, Future future) {
        cancellableContinuation.invokeOnCancellation(new C13948sl(future));
    }

    /* renamed from: b */
    public static final DisposableHandle m66433b(Job job, Future future) {
        return job.invokeOnCompletion(new C16772tl(future));
    }
}
