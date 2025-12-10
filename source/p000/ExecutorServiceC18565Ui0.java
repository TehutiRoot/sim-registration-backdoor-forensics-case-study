package p000;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: Ui0 */
/* loaded from: classes4.dex */
public final class ExecutorServiceC18565Ui0 extends ExecutorC18373Ri0 implements ExecutorService {

    /* renamed from: d */
    public final ExecutorService f6415d;

    public ExecutorServiceC18565Ui0(ExecutorService executorService, int i) {
        super(executorService, i);
        this.f6415d = executorService;
    }

    /* renamed from: f */
    public static /* synthetic */ Object m65987f(Runnable runnable, Object obj) {
        return runnable.run();
    }

    /* renamed from: h */
    public static /* synthetic */ Object m65986h(Runnable runnable) {
        return runnable.run();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f6415d.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f6415d.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f6415d.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f6415d.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f6415d.isTerminated();
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
        return this.f6415d.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.f6415d.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(final Runnable runnable, final Object obj) {
        return submit(new Callable() { // from class: Ti0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ExecutorServiceC18565Ui0.m65987f(runnable, obj);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(final Runnable runnable) {
        return submit(new Callable() { // from class: Si0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ExecutorServiceC18565Ui0.m65986h(runnable);
            }
        });
    }
}
