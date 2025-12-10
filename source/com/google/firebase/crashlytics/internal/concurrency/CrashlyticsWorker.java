package com.google.firebase.crashlytics.internal.concurrency;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public class CrashlyticsWorker implements Executor {

    /* renamed from: a */
    public final ExecutorService f54885a;

    /* renamed from: b */
    public final Object f54886b = new Object();

    /* renamed from: c */
    public Task f54887c = Tasks.forResult(null);

    public CrashlyticsWorker(ExecutorService executorService) {
        this.f54885a = executorService;
    }

    /* renamed from: a */
    public static /* synthetic */ Task m38967a(Callable callable, Task task) {
        return m38956n(callable, task);
    }

    /* renamed from: c */
    public static /* synthetic */ Task m38966c(Callable callable, Task task) {
        return m38959k(callable, task);
    }

    /* renamed from: d */
    public static /* synthetic */ void m38965d() {
        m38960j();
    }

    /* renamed from: e */
    public static /* synthetic */ Task m38964e(Runnable runnable, Task task) {
        return m38958l(runnable, task);
    }

    /* renamed from: f */
    public static /* synthetic */ Task m38963f(SuccessContinuation successContinuation, Task task) {
        return m38954p(successContinuation, task);
    }

    /* renamed from: h */
    public static /* synthetic */ Task m38962h(Callable callable, Task task) {
        return m38955o(callable, task);
    }

    /* renamed from: i */
    public static /* synthetic */ Task m38961i(Callable callable, Task task) {
        return m38957m(callable, task);
    }

    /* renamed from: j */
    public static /* synthetic */ void m38960j() {
    }

    /* renamed from: k */
    public static /* synthetic */ Task m38959k(Callable callable, Task task) {
        return Tasks.forResult(callable.call());
    }

    /* renamed from: l */
    public static /* synthetic */ Task m38958l(Runnable runnable, Task task) {
        runnable.run();
        return Tasks.forResult(null);
    }

    /* renamed from: m */
    public static /* synthetic */ Task m38957m(Callable callable, Task task) {
        return (Task) callable.call();
    }

    /* renamed from: n */
    public static /* synthetic */ Task m38956n(Callable callable, Task task) {
        return (Task) callable.call();
    }

    /* renamed from: o */
    public static /* synthetic */ Task m38955o(Callable callable, Task task) {
        return (Task) callable.call();
    }

    /* renamed from: p */
    public static /* synthetic */ Task m38954p(SuccessContinuation successContinuation, Task task) {
        if (task.isSuccessful()) {
            return successContinuation.then(task.getResult());
        }
        if (task.getException() != null) {
            return Tasks.forException(task.getException());
        }
        return Tasks.forCanceled();
    }

    @VisibleForTesting
    public void await() throws ExecutionException, InterruptedException, TimeoutException {
        Tasks.await(submit(new Runnable() { // from class: Ez
            @Override // java.lang.Runnable
            public final void run() {
                CrashlyticsWorker.m38965d();
            }
        }), 30L, TimeUnit.SECONDS);
        Thread.sleep(1L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f54885a.execute(runnable);
    }

    public ExecutorService getExecutor() {
        return this.f54885a;
    }

    @CanIgnoreReturnValue
    public <T> Task<T> submit(final Callable<T> callable) {
        Task<T> continueWithTask;
        synchronized (this.f54886b) {
            continueWithTask = this.f54887c.continueWithTask(this.f54885a, new Continuation() { // from class: Dz
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return CrashlyticsWorker.m38966c(callable, task);
                }
            });
            this.f54887c = continueWithTask;
        }
        return continueWithTask;
    }

    @CanIgnoreReturnValue
    public <T> Task<T> submitTask(final Callable<Task<T>> callable) {
        Task<T> continueWithTask;
        synchronized (this.f54886b) {
            continueWithTask = this.f54887c.continueWithTask(this.f54885a, new Continuation() { // from class: Fz
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return CrashlyticsWorker.m38961i(callable, task);
                }
            });
            this.f54887c = continueWithTask;
        }
        return continueWithTask;
    }

    @CanIgnoreReturnValue
    public <T, R> Task<R> submitTaskOnSuccess(final Callable<Task<T>> callable, final SuccessContinuation<T, R> successContinuation) {
        Task<R> continueWithTask;
        synchronized (this.f54886b) {
            continueWithTask = this.f54887c.continueWithTask(this.f54885a, new Continuation() { // from class: Hz
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return CrashlyticsWorker.m38962h(callable, task);
                }
            }).continueWithTask(this.f54885a, new Continuation() { // from class: Iz
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return CrashlyticsWorker.m38963f(SuccessContinuation.this, task);
                }
            });
            this.f54887c = continueWithTask;
        }
        return continueWithTask;
    }

    @CanIgnoreReturnValue
    public Task<Void> submit(final Runnable runnable) {
        Task<Void> continueWithTask;
        synchronized (this.f54886b) {
            continueWithTask = this.f54887c.continueWithTask(this.f54885a, new Continuation() { // from class: Cz
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return CrashlyticsWorker.m38964e(runnable, task);
                }
            });
            this.f54887c = continueWithTask;
        }
        return continueWithTask;
    }

    @CanIgnoreReturnValue
    public <T, R> Task<R> submitTask(final Callable<Task<T>> callable, Continuation<T, Task<R>> continuation) {
        Task<R> continueWithTask;
        synchronized (this.f54886b) {
            continueWithTask = this.f54887c.continueWithTask(this.f54885a, new Continuation() { // from class: Gz
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return CrashlyticsWorker.m38967a(callable, task);
                }
            }).continueWithTask(this.f54885a, continuation);
            this.f54887c = continueWithTask;
        }
        return continueWithTask;
    }
}
