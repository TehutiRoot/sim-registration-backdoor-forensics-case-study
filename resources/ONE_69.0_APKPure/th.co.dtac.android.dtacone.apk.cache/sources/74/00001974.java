package p000;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: aj0 */
/* loaded from: classes4.dex */
public final class ExecutorServiceC19094aj0 extends ExecutorC18803Xi0 implements ExecutorService {

    /* renamed from: d */
    public final ExecutorService f8493d;

    public ExecutorServiceC19094aj0(ExecutorService executorService, int i) {
        super(executorService, i);
        this.f8493d = executorService;
    }

    /* renamed from: f */
    public static /* synthetic */ Object m65070f(Runnable runnable, Object obj) {
        return runnable.run();
    }

    /* renamed from: h */
    public static /* synthetic */ Object m65069h(Runnable runnable) {
        return runnable.run();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f8493d.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f8493d.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f8493d.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f8493d.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f8493d.isTerminated();
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
        return this.f8493d.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.f8493d.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(final Runnable runnable, final Object obj) {
        return submit(new Callable() { // from class: Zi0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ExecutorServiceC19094aj0.m65070f(runnable, obj);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(final Runnable runnable) {
        return submit(new Callable() { // from class: Yi0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ExecutorServiceC19094aj0.m65069h(runnable);
            }
        });
    }
}