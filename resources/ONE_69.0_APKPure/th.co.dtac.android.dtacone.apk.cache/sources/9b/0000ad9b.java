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
    public final AtomicReference f54336a = new AtomicReference(Futures.immediateVoidFuture());

    /* renamed from: b */
    public C8234c f54337b = new C8234c(null);

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

        public /* synthetic */ TaskNonReentrantExecutor(Executor executor, ExecutionSequencer executionSequencer, C8232a c8232a) {
            this(executor, executionSequencer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean trySetCancelled() {
            return compareAndSet(RunningState.NOT_RUN, RunningState.CANCELLED);
        }

        /* JADX INFO: Access modifiers changed from: private */
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
                C8234c c8234c = executionSequencer.f54337b;
                if (c8234c.f54343a == this.submitting) {
                    this.sequencer = null;
                    if (c8234c.f54344b == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Preconditions.checkState(z);
                    c8234c.f54344b = runnable;
                    Executor executor = this.delegate;
                    Objects.requireNonNull(executor);
                    c8234c.f54345c = executor;
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
            C8234c c8234c = new C8234c(null);
            c8234c.f54343a = currentThread;
            ExecutionSequencer executionSequencer = this.sequencer;
            Objects.requireNonNull(executionSequencer);
            executionSequencer.f54337b = c8234c;
            this.sequencer = null;
            try {
                Runnable runnable2 = this.task;
                Objects.requireNonNull(runnable2);
                this.task = null;
                runnable2.run();
                while (true) {
                    Runnable runnable3 = c8234c.f54344b;
                    if (runnable3 == null || (executor = c8234c.f54345c) == null) {
                        break;
                    }
                    c8234c.f54344b = null;
                    c8234c.f54345c = null;
                    executor.execute(runnable3);
                }
            } finally {
                c8234c.f54343a = null;
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
    public class C8232a implements AsyncCallable {

        /* renamed from: a */
        public final /* synthetic */ Callable f54338a;

        /* renamed from: b */
        public final /* synthetic */ ExecutionSequencer f54339b;

        public C8232a(ExecutionSequencer executionSequencer, Callable callable) {
            this.f54338a = callable;
            this.f54339b = executionSequencer;
        }

        @Override // com.google.common.util.concurrent.AsyncCallable
        public ListenableFuture call() {
            return Futures.immediateFuture(this.f54338a.call());
        }

        public String toString() {
            return this.f54338a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ExecutionSequencer$b */
    /* loaded from: classes4.dex */
    public class C8233b implements AsyncCallable {

        /* renamed from: a */
        public final /* synthetic */ TaskNonReentrantExecutor f54340a;

        /* renamed from: b */
        public final /* synthetic */ AsyncCallable f54341b;

        /* renamed from: c */
        public final /* synthetic */ ExecutionSequencer f54342c;

        public C8233b(ExecutionSequencer executionSequencer, TaskNonReentrantExecutor taskNonReentrantExecutor, AsyncCallable asyncCallable) {
            this.f54340a = taskNonReentrantExecutor;
            this.f54341b = asyncCallable;
            this.f54342c = executionSequencer;
        }

        @Override // com.google.common.util.concurrent.AsyncCallable
        public ListenableFuture call() {
            if (!this.f54340a.trySetStarted()) {
                return Futures.immediateCancelledFuture();
            }
            return this.f54341b.call();
        }

        public String toString() {
            return this.f54341b.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ExecutionSequencer$c */
    /* loaded from: classes4.dex */
    public static final class C8234c {

        /* renamed from: a */
        public Thread f54343a;

        /* renamed from: b */
        public Runnable f54344b;

        /* renamed from: c */
        public Executor f54345c;

        public C8234c() {
        }

        public /* synthetic */ C8234c(C8232a c8232a) {
            this();
        }
    }

    public static ExecutionSequencer create() {
        return new ExecutionSequencer();
    }

    /* renamed from: d */
    public static /* synthetic */ void m39519d(TrustedListenableFutureTask trustedListenableFutureTask, SettableFuture settableFuture, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, TaskNonReentrantExecutor taskNonReentrantExecutor) {
        if (trustedListenableFutureTask.isDone()) {
            settableFuture.setFuture(listenableFuture);
        } else if (listenableFuture2.isCancelled() && taskNonReentrantExecutor.trySetCancelled()) {
            trustedListenableFutureTask.cancel(false);
        }
    }

    public <T> ListenableFuture<T> submit(Callable<T> callable, Executor executor) {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(executor);
        return submitAsync(new C8232a(this, callable), executor);
    }

    public <T> ListenableFuture<T> submitAsync(AsyncCallable<T> asyncCallable, Executor executor) {
        Preconditions.checkNotNull(asyncCallable);
        Preconditions.checkNotNull(executor);
        final TaskNonReentrantExecutor taskNonReentrantExecutor = new TaskNonReentrantExecutor(executor, this, null);
        C8233b c8233b = new C8233b(this, taskNonReentrantExecutor, asyncCallable);
        final SettableFuture create = SettableFuture.create();
        final ListenableFuture listenableFuture = (ListenableFuture) this.f54336a.getAndSet(create);
        final TrustedListenableFutureTask m39379z = TrustedListenableFutureTask.m39379z(c8233b);
        listenableFuture.addListener(m39379z, taskNonReentrantExecutor);
        final ListenableFuture<T> nonCancellationPropagating = Futures.nonCancellationPropagating(m39379z);
        Runnable runnable = new Runnable() { // from class: com.google.common.util.concurrent.e
            @Override // java.lang.Runnable
            public final void run() {
                ExecutionSequencer.m39519d(TrustedListenableFutureTask.this, create, listenableFuture, nonCancellationPropagating, taskNonReentrantExecutor);
            }
        };
        nonCancellationPropagating.addListener(runnable, MoreExecutors.directExecutor());
        m39379z.addListener(runnable, MoreExecutors.directExecutor());
        return nonCancellationPropagating;
    }
}