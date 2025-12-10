package com.google.android.gms.tasks;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.tasks.zza;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public final class Tasks {
    /* renamed from: a */
    public static Object m46049a(Task task) {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    public static <TResult> TResult await(@NonNull Task<TResult> task) throws ExecutionException, InterruptedException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotGoogleApiHandlerThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        if (task.isComplete()) {
            return (TResult) m46049a(task);
        }
        C21266nb2 c21266nb2 = new C21266nb2(null);
        m46048b(task, c21266nb2);
        c21266nb2.m26119a();
        return (TResult) m46049a(task);
    }

    /* renamed from: b */
    public static void m46048b(Task task, InterfaceC22470ub2 interfaceC22470ub2) {
        Executor executor = TaskExecutors.f48591a;
        task.addOnSuccessListener(executor, interfaceC22470ub2);
        task.addOnFailureListener(executor, interfaceC22470ub2);
        task.addOnCanceledListener(executor, interfaceC22470ub2);
    }

    @NonNull
    @Deprecated
    public static <TResult> Task<TResult> call(@NonNull Callable<TResult> callable) {
        return call(TaskExecutors.MAIN_THREAD, callable);
    }

    @NonNull
    public static <TResult> Task<TResult> forCanceled() {
        C23121yK2 c23121yK2 = new C23121yK2();
        c23121yK2.m285c();
        return c23121yK2;
    }

    @NonNull
    public static <TResult> Task<TResult> forException(@NonNull Exception exc) {
        C23121yK2 c23121yK2 = new C23121yK2();
        c23121yK2.m287a(exc);
        return c23121yK2;
    }

    @NonNull
    public static <TResult> Task<TResult> forResult(TResult tresult) {
        C23121yK2 c23121yK2 = new C23121yK2();
        c23121yK2.m286b(tresult);
        return c23121yK2;
    }

    @NonNull
    public static Task<Void> whenAll(@Nullable Collection<? extends Task<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            for (Task<?> task : collection) {
                if (task == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            C23121yK2 c23121yK2 = new C23121yK2();
            C17330Bb2 c17330Bb2 = new C17330Bb2(collection.size(), c23121yK2);
            for (Task<?> task2 : collection) {
                m46048b(task2, c17330Bb2);
            }
            return c23121yK2;
        }
        return forResult(null);
    }

    @NonNull
    public static Task<List<Task<?>>> whenAllComplete(@Nullable Collection<? extends Task<?>> collection) {
        return whenAllComplete(TaskExecutors.MAIN_THREAD, collection);
    }

    @NonNull
    public static <TResult> Task<List<TResult>> whenAllSuccess(@Nullable Collection<? extends Task> collection) {
        return whenAllSuccess(TaskExecutors.MAIN_THREAD, collection);
    }

    @NonNull
    public static <T> Task<T> withTimeout(@NonNull Task<T> task, long j, @NonNull TimeUnit timeUnit) {
        boolean z;
        Preconditions.checkNotNull(task, "Task must not be null");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Timeout must be positive");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        final C17720Hd2 c17720Hd2 = new C17720Hd2();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(c17720Hd2);
        final zza zzaVar = new zza(Looper.getMainLooper());
        zzaVar.postDelayed(new Runnable() { // from class: com.google.android.gms.tasks.zzx
            @Override // java.lang.Runnable
            public final void run() {
                taskCompletionSource.trySetException(new TimeoutException());
            }
        }, timeUnit.toMillis(j));
        task.addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.tasks.zzy
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zza.this.removeCallbacksAndMessages(null);
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (task2.isSuccessful()) {
                    taskCompletionSource2.trySetResult(task2.getResult());
                } else if (task2.isCanceled()) {
                    c17720Hd2.m68062a();
                } else {
                    Exception exception = task2.getException();
                    exception.getClass();
                    taskCompletionSource2.trySetException(exception);
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    @NonNull
    @Deprecated
    public static <TResult> Task<TResult> call(@NonNull Executor executor, @NonNull Callable<TResult> callable) {
        Preconditions.checkNotNull(executor, "Executor must not be null");
        Preconditions.checkNotNull(callable, "Callback must not be null");
        C23121yK2 c23121yK2 = new C23121yK2();
        executor.execute(new FL2(c23121yK2, callable));
        return c23121yK2;
    }

    @NonNull
    public static Task<List<Task<?>>> whenAllComplete(@NonNull Executor executor, @Nullable Collection<? extends Task<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            return whenAll(collection).continueWithTask(executor, new C17903Ka2(collection));
        }
        return forResult(Collections.emptyList());
    }

    @NonNull
    public static <TResult> Task<List<TResult>> whenAllSuccess(@NonNull Executor executor, @Nullable Collection<? extends Task> collection) {
        if (collection != null && !collection.isEmpty()) {
            return (Task<List<TResult>>) whenAll(collection).continueWith(executor, new C22639va2(collection));
        }
        return forResult(Collections.emptyList());
    }

    @NonNull
    public static Task<List<Task<?>>> whenAllComplete(@NonNull Executor executor, @Nullable Task<?>... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllComplete(executor, Arrays.asList(taskArr));
        }
        return forResult(Collections.emptyList());
    }

    @NonNull
    public static <TResult> Task<List<TResult>> whenAllSuccess(@NonNull Executor executor, @Nullable Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllSuccess(executor, Arrays.asList(taskArr));
        }
        return forResult(Collections.emptyList());
    }

    @NonNull
    public static Task<List<Task<?>>> whenAllComplete(@Nullable Task<?>... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllComplete(Arrays.asList(taskArr));
        }
        return forResult(Collections.emptyList());
    }

    @NonNull
    public static <TResult> Task<List<TResult>> whenAllSuccess(@Nullable Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllSuccess(Arrays.asList(taskArr));
        }
        return forResult(Collections.emptyList());
    }

    @NonNull
    public static Task<Void> whenAll(@Nullable Task<?>... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAll(Arrays.asList(taskArr));
        }
        return forResult(null);
    }

    public static <TResult> TResult await(@NonNull Task<TResult> task, long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotGoogleApiHandlerThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        if (task.isComplete()) {
            return (TResult) m46049a(task);
        }
        C21266nb2 c21266nb2 = new C21266nb2(null);
        m46048b(task, c21266nb2);
        if (c21266nb2.m26118b(j, timeUnit)) {
            return (TResult) m46049a(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }
}
