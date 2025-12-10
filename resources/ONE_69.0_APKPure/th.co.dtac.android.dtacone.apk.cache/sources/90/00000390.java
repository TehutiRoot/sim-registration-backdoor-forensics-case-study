package p000;

import com.google.firebase.concurrent.PausableExecutor;
import com.google.firebase.concurrent.PausableExecutorService;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: Dk1 */
/* loaded from: classes4.dex */
public final class C17510Dk1 implements PausableExecutorService {

    /* renamed from: a */
    public final ExecutorService f1098a;

    /* renamed from: b */
    public final PausableExecutor f1099b;

    public C17510Dk1(boolean z, ExecutorService executorService) {
        this.f1098a = executorService;
        this.f1099b = new C17315Ak1(z, executorService);
    }

    /* renamed from: a */
    public static /* synthetic */ Object m68794a(Runnable runnable) {
        return runnable.run();
    }

    /* renamed from: c */
    public static /* synthetic */ Object m68793c(Runnable runnable, Object obj) {
        return runnable.run();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f1098a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f1099b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f1098a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f1098a.invokeAny(collection);
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public boolean isPaused() {
        return this.f1099b.isPaused();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f1098a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f1098a.isTerminated();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void pause() {
        this.f1099b.pause();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void resume() {
        this.f1099b.resume();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        FutureTask futureTask = new FutureTask(callable);
        execute(futureTask);
        return futureTask;
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.f1098a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.f1098a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(final Runnable runnable, final Object obj) {
        return submit(new Callable() { // from class: Ck1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C17510Dk1.m68793c(runnable, obj);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(final Runnable runnable) {
        return submit(new Callable() { // from class: Bk1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C17510Dk1.m68794a(runnable);
            }
        });
    }
}