package p000;

import java.util.concurrent.Future;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;

/* renamed from: Xg0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC18797Xg0 {
    /* renamed from: a */
    public static final void m65584a(CancellableContinuation cancellableContinuation, Future future) {
        cancellableContinuation.invokeOnCancellation(new C13935sl(future));
    }

    /* renamed from: b */
    public static final DisposableHandle m65583b(Job job, Future future) {
        return job.invokeOnCompletion(new C16783tl(future));
    }
}