package p000;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* renamed from: lJ */
/* loaded from: classes6.dex */
public final class ExecutorC12211lJ implements Executor {

    /* renamed from: a */
    public final CoroutineDispatcher f71587a;

    public ExecutorC12211lJ(CoroutineDispatcher coroutineDispatcher) {
        this.f71587a = coroutineDispatcher;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        CoroutineDispatcher coroutineDispatcher = this.f71587a;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        if (coroutineDispatcher.isDispatchNeeded(emptyCoroutineContext)) {
            this.f71587a.dispatch(emptyCoroutineContext, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f71587a.toString();
    }
}
