package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzrr;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk
/* loaded from: classes4.dex */
public abstract class ModelResource {

    /* renamed from: a */
    public final AtomicInteger f56926a;

    /* renamed from: b */
    public final AtomicBoolean f56927b;
    @NonNull
    @KeepForSdk
    protected final TaskQueue taskQueue;

    public ModelResource() {
        this.f56926a = new AtomicInteger(0);
        this.f56927b = new AtomicBoolean(false);
        this.taskQueue = new TaskQueue();
    }

    /* renamed from: a */
    public final /* synthetic */ void m37235a(CancellationToken cancellationToken, CancellationTokenSource cancellationTokenSource, Callable callable, TaskCompletionSource taskCompletionSource) {
        try {
            if (cancellationToken.isCancellationRequested()) {
                cancellationTokenSource.cancel();
                return;
            }
            try {
                if (!this.f56927b.get()) {
                    load();
                    this.f56927b.set(true);
                }
                if (cancellationToken.isCancellationRequested()) {
                    cancellationTokenSource.cancel();
                    return;
                }
                Object call = callable.call();
                if (cancellationToken.isCancellationRequested()) {
                    cancellationTokenSource.cancel();
                } else {
                    taskCompletionSource.setResult(call);
                }
            } catch (RuntimeException e) {
                throw new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e);
            }
        } catch (Exception e2) {
            if (cancellationToken.isCancellationRequested()) {
                cancellationTokenSource.cancel();
            } else {
                taskCompletionSource.setException(e2);
            }
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void m37234b(TaskCompletionSource taskCompletionSource) {
        boolean z;
        int decrementAndGet = this.f56926a.decrementAndGet();
        if (decrementAndGet >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        if (decrementAndGet == 0) {
            release();
            this.f56927b.set(false);
        }
        zzrr.zza();
        taskCompletionSource.setResult(null);
    }

    @NonNull
    @KeepForSdk
    public <T> Task<T> callAfterLoad(@NonNull final Executor executor, @NonNull final Callable<T> callable, @NonNull final CancellationToken cancellationToken) {
        boolean z;
        if (this.f56926a.get() > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        if (cancellationToken.isCancellationRequested()) {
            return Tasks.forCanceled();
        }
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.taskQueue.submit(new Executor() { // from class: com.google.mlkit.common.sdkinternal.zzm
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e) {
                    if (cancellationToken.isCancellationRequested()) {
                        cancellationTokenSource.cancel();
                    } else {
                        taskCompletionSource.setException(e);
                    }
                    throw e;
                }
            }
        }, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzn
            @Override // java.lang.Runnable
            public final void run() {
                ModelResource.this.m37235a(cancellationToken, cancellationTokenSource, callable, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @KeepForSdk
    public boolean isLoaded() {
        return this.f56927b.get();
    }

    @KeepForSdk
    @VisibleForTesting
    @WorkerThread
    public abstract void load() throws MlKitException;

    @KeepForSdk
    public void pin() {
        this.f56926a.incrementAndGet();
    }

    @KeepForSdk
    @WorkerThread
    public abstract void release();

    @KeepForSdk
    public void unpin(@NonNull Executor executor) {
        unpinWithTask(executor);
    }

    @NonNull
    @KeepForSdk
    public Task<Void> unpinWithTask(@NonNull Executor executor) {
        boolean z;
        if (this.f56926a.get() > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.taskQueue.submit(executor, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzl
            {
                ModelResource.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ModelResource.this.m37234b(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @KeepForSdk
    public ModelResource(@NonNull TaskQueue taskQueue) {
        this.f56926a = new AtomicInteger(0);
        this.f56927b = new AtomicBoolean(false);
        this.taskQueue = taskQueue;
    }
}
