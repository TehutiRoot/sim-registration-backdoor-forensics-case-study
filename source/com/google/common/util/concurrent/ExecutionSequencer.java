package com.google.common.util.concurrent;

import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.CheckForNull;

@J2ktIncompatible
/* loaded from: classes4.dex */
public final class ExecutionSequencer {

    /* renamed from: a */
    public final AtomicReference f54324a = new AtomicReference(Futures.immediateVoidFuture());

    /* renamed from: b */
    public C8245c f54325b = new C8245c(null);

    /* loaded from: classes4.dex */
    public enum RunningState {
        NOT_RUN,
        CANCELLED,
        STARTED
    }

    /* loaded from: classes4.dex */
    public static final class TaskNonReentrantExecutor extends AtomicReference<RunningState> implements Executor, Runnable {
        @CheckForNull
        Executor delegate;
        @CheckForNull
        ExecutionSequencer sequencer;
        @CheckForNull
        @LazyInit
        Thread submitting;
        @CheckForNull
        Runnable task;

        public /* synthetic */ TaskNonReentrantExecutor(Executor executor, ExecutionSequencer executionSequencer, C8243a c8243a) {
            this(executor, executionSequencer);
        }

        public boolean trySetCancelled() {
            return compareAndSet(RunningState.NOT_RUN, RunningState.CANCELLED);
        }

        public boolean trySetStarted() {
            return compareAndSet(RunningState.NOT_RUN, RunningState.STARTED);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            boolean z;
            if (get() == RunningState.CANCELLED) {
                this.delegate = null;
                this.sequencer = null;
                return;
            }
            this.submitting = Thread.currentThread();
            try {
                ExecutionSequencer executionSequencer = this.sequencer;
                Objects.requireNonNull(executionSequencer);
                C8245c c8245c = executionSequencer.f54325b;
                if (c8245c.f54331a == this.submitting) {
                    this.sequencer = null;
                    if (c8245c.f54332b == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Preconditions.checkState(z);
                    c8245c.f54332b = runnable;
                    Executor executor = this.delegate;
                    Objects.requireNonNull(executor);
                    c8245c.f54333c = executor;
                    this.delegate = null;
                } else {
                    Executor executor2 = this.delegate;
                    Objects.requireNonNull(executor2);
                    this.delegate = null;
                    this.task = runnable;
                    executor2.execute(this);
                }
                this.submitting = null;
            } catch (Throwable th2) {
                this.submitting = null;
                throw th2;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executor;
            Thread currentThread = Thread.currentThread();
            if (currentThread != this.submitting) {
                Runnable runnable = this.task;
                Objects.requireNonNull(runnable);
                this.task = null;
                runnable.run();
                return;
            }
            C8245c c8245c = new C8245c(null);
            c8245c.f54331a = currentThread;
            ExecutionSequencer executionSequencer = this.sequencer;
            Objects.requireNonNull(executionSequencer);
            executionSequencer.f54325b = c8245c;
            this.sequencer = null;
            try {
                Runnable runnable2 = this.task;
                Objects.requireNonNull(runnable2);
                this.task = null;
                runnable2.run();
                while (true) {
                    Runnable runnable3 = c8245c.f54332b;
                    if (runnable3 == null || (executor = c8245c.f54333c) == null) {
                        break;
                    }
                    c8245c.f54332b = null;
                    c8245c.f54333c = null;
                    executor.execute(runnable3);
                }
            } finally {
                c8245c.f54331a = null;
            }
        }

        private TaskNonReentrantExecutor(Executor executor, ExecutionSequencer executionSequencer) {
            super(RunningState.NOT_RUN);
            this.delegate = executor;
            this.sequencer = executionSequencer;
        }
    }

    /* renamed from: com.google.common.util.concurrent.ExecutionSequencer$a */
    /* loaded from: classes4.dex */
    public class C8243a implements AsyncCallable {

        /* renamed from: a */
        public final /* synthetic */ Callable f54326a;

        /* renamed from: b */
        public final /* synthetic */ ExecutionSequencer f54327b;

        public C8243a(ExecutionSequencer executionSequencer, Callable callable) {
            this.f54326a = callable;
            this.f54327b = executionSequencer;
        }

        @Override // com.google.common.util.concurrent.AsyncCallable
        public ListenableFuture call() {
            return Futures.immediateFuture(this.f54326a.call());
        }

        public String toString() {
            return this.f54326a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ExecutionSequencer$b */
    /* loaded from: classes4.dex */
    public class C8244b implements AsyncCallable {

        /* renamed from: a */
        public final /* synthetic */ TaskNonReentrantExecutor f54328a;

        /* renamed from: b */
        public final /* synthetic */ AsyncCallable f54329b;

        /* renamed from: c */
        public final /* synthetic */ ExecutionSequencer f54330c;

        public C8244b(ExecutionSequencer executionSequencer, TaskNonReentrantExecutor taskNonReentrantExecutor, AsyncCallable asyncCallable) {
            this.f54328a = taskNonReentrantExecutor;
            this.f54329b = asyncCallable;
            this.f54330c = executionSequencer;
        }

        @Override // com.google.common.util.concurrent.AsyncCallable
        public ListenableFuture call() {
            if (!this.f54328a.trySetStarted()) {
                return Futures.immediateCancelledFuture();
            }
            return this.f54329b.call();
        }

        public String toString() {
            return this.f54329b.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ExecutionSequencer$c */
    /* loaded from: classes4.dex */
    public static final class C8245c {

        /* renamed from: a */
        public Thread f54331a;

        /* renamed from: b */
        public Runnable f54332b;

        /* renamed from: c */
        public Executor f54333c;

        public C8245c() {
        }

        public /* synthetic */ C8245c(C8243a c8243a) {
            this();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m39530a(TrustedListenableFutureTask trustedListenableFutureTask, SettableFuture settableFuture, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, TaskNonReentrantExecutor taskNonReentrantExecutor) {
        m39527d(trustedListenableFutureTask, settableFuture, listenableFuture, listenableFuture2, taskNonReentrantExecutor);
    }

    public static ExecutionSequencer create() {
        return new ExecutionSequencer();
    }

    /* renamed from: d */
    public static /* synthetic */ void m39527d(TrustedListenableFutureTask trustedListenableFutureTask, SettableFuture settableFuture, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, TaskNonReentrantExecutor taskNonReentrantExecutor) {
        if (trustedListenableFutureTask.isDone()) {
            settableFuture.setFuture(listenableFuture);
        } else if (listenableFuture2.isCancelled() && taskNonReentrantExecutor.trySetCancelled()) {
            trustedListenableFutureTask.cancel(false);
        }
    }

    public <T> ListenableFuture<T> submit(Callable<T> callable, Executor executor) {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(executor);
        return submitAsync(new C8243a(this, callable), executor);
    }

    public <T> ListenableFuture<T> submitAsync(AsyncCallable<T> asyncCallable, Executor executor) {
        Preconditions.checkNotNull(asyncCallable);
        Preconditions.checkNotNull(executor);
        final TaskNonReentrantExecutor taskNonReentrantExecutor = new TaskNonReentrantExecutor(executor, this, null);
        C8244b c8244b = new C8244b(this, taskNonReentrantExecutor, asyncCallable);
        final SettableFuture create = SettableFuture.create();
        final ListenableFuture listenableFuture = (ListenableFuture) this.f54324a.getAndSet(create);
        final TrustedListenableFutureTask m39387z = TrustedListenableFutureTask.m39387z(c8244b);
        listenableFuture.addListener(m39387z, taskNonReentrantExecutor);
        final ListenableFuture<T> nonCancellationPropagating = Futures.nonCancellationPropagating(m39387z);
        Runnable runnable = new Runnable() { // from class: com.google.common.util.concurrent.e
            @Override // java.lang.Runnable
            public final void run() {
                ExecutionSequencer.m39530a(TrustedListenableFutureTask.this, create, listenableFuture, nonCancellationPropagating, taskNonReentrantExecutor);
            }
        };
        nonCancellationPropagating.addListener(runnable, MoreExecutors.directExecutor());
        m39387z.addListener(runnable, MoreExecutors.directExecutor());
        return nonCancellationPropagating;
    }
}
