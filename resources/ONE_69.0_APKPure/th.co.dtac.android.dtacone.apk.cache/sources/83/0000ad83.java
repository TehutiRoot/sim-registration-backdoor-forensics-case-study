package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.util.concurrent.AggregateFuture;
import com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes4.dex */
public final class CombinedFuture extends AggregateFuture {

    /* renamed from: p */
    public CombinedFutureInterruptibleTask f54321p;

    /* loaded from: classes4.dex */
    public final class AsyncCallableInterruptibleTask extends CombinedFutureInterruptibleTask<ListenableFuture<Object>> {
        private final AsyncCallable<Object> callable;

        public AsyncCallableInterruptibleTask(AsyncCallable<Object> asyncCallable, Executor executor) {
            super(executor);
            this.callable = (AsyncCallable) Preconditions.checkNotNull(asyncCallable);
        }

        public String toPendingString() {
            return this.callable.toString();
        }

        /* renamed from: runInterruptibly */
        public ListenableFuture<Object> m74235runInterruptibly() throws Exception {
            return (ListenableFuture) Preconditions.checkNotNull(this.callable.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.callable);
        }

        public void setValue(ListenableFuture<Object> listenableFuture) {
            CombinedFuture.this.setFuture(listenableFuture);
        }
    }

    /* loaded from: classes4.dex */
    public final class CallableInterruptibleTask extends CombinedFutureInterruptibleTask<Object> {
        private final Callable<Object> callable;

        public CallableInterruptibleTask(Callable<Object> callable, Executor executor) {
            super(executor);
            this.callable = (Callable) Preconditions.checkNotNull(callable);
        }

        public Object runInterruptibly() throws Exception {
            return this.callable.call();
        }

        public void setValue(Object obj) {
            CombinedFuture.this.set(obj);
        }

        public String toPendingString() {
            return this.callable.toString();
        }
    }

    /* loaded from: classes4.dex */
    public abstract class CombinedFutureInterruptibleTask<T> extends InterruptibleTask<T> {
        private final Executor listenerExecutor;

        public CombinedFutureInterruptibleTask(Executor executor) {
            this.listenerExecutor = (Executor) Preconditions.checkNotNull(executor);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void afterRanInterruptiblyFailure(Throwable th2) {
            CombinedFuture.this.f54321p = null;
            if (th2 instanceof ExecutionException) {
                CombinedFuture.this.setException(((ExecutionException) th2).getCause());
            } else if (th2 instanceof CancellationException) {
                CombinedFuture.this.cancel(false);
            } else {
                CombinedFuture.this.setException(th2);
            }
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void afterRanInterruptiblySuccess(T t) {
            CombinedFuture.this.f54321p = null;
            setValue(t);
        }

        public final void execute() {
            try {
                this.listenerExecutor.execute(this);
            } catch (RejectedExecutionException e) {
                CombinedFuture.this.setException(e);
            }
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final boolean isDone() {
            return CombinedFuture.this.isDone();
        }

        public abstract void setValue(T t);
    }

    public CombinedFuture(ImmutableCollection immutableCollection, boolean z, Executor executor, AsyncCallable asyncCallable) {
        super(immutableCollection, z, false);
        this.f54321p = new AsyncCallableInterruptibleTask(asyncCallable, executor);
        m39599O();
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    /* renamed from: J */
    public void mo39355J(int i, Object obj) {
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    /* renamed from: M */
    public void mo39354M() {
        CombinedFutureInterruptibleTask combinedFutureInterruptibleTask = this.f54321p;
        if (combinedFutureInterruptibleTask != null) {
            combinedFutureInterruptibleTask.execute();
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    /* renamed from: U */
    public void mo39353U(AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        super.mo39353U(releaseResourcesReason);
        if (releaseResourcesReason == AggregateFuture.ReleaseResourcesReason.OUTPUT_FUTURE_DONE) {
            this.f54321p = null;
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public void interruptTask() {
        CombinedFutureInterruptibleTask combinedFutureInterruptibleTask = this.f54321p;
        if (combinedFutureInterruptibleTask != null) {
            combinedFutureInterruptibleTask.interruptTask();
        }
    }

    public CombinedFuture(ImmutableCollection immutableCollection, boolean z, Executor executor, Callable callable) {
        super(immutableCollection, z, false);
        this.f54321p = new CallableInterruptibleTask(callable, executor);
        m39599O();
    }
}