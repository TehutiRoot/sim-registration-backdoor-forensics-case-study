package p000;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* renamed from: mJ */
/* loaded from: classes6.dex */
public final class ExecutorC12263mJ implements Executor {

    /* renamed from: a */
    public final CoroutineDispatcher f71955a;

    public ExecutorC12263mJ(CoroutineDispatcher coroutineDispatcher) {
        this.f71955a = coroutineDispatcher;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        CoroutineDispatcher coroutineDispatcher = this.f71955a;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        if (coroutineDispatcher.isDispatchNeeded(emptyCoroutineContext)) {
            this.f71955a.dispatch(emptyCoroutineContext, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f71955a.toString();
    }
}