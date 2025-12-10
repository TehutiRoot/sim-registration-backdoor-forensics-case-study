package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.FluentFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes4.dex */
public class TrustedListenableFutureTask extends FluentFuture.AbstractC8246a implements RunnableFuture {

    /* renamed from: h */
    public volatile InterruptibleTask f54452h;

    /* loaded from: classes4.dex */
    public final class TrustedFutureInterruptibleAsyncTask extends InterruptibleTask<ListenableFuture<Object>> {
        private final AsyncCallable<Object> callable;

        public TrustedFutureInterruptibleAsyncTask(AsyncCallable<Object> asyncCallable) {
            TrustedListenableFutureTask.this = r1;
            this.callable = (AsyncCallable) Preconditions.checkNotNull(asyncCallable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public void afterRanInterruptiblyFailure(Throwable th2) {
            TrustedListenableFutureTask.this.setException(th2);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final boolean isDone() {
            return TrustedListenableFutureTask.this.isDone();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public String toPendingString() {
            return this.callable.toString();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public void afterRanInterruptiblySuccess(ListenableFuture<Object> listenableFuture) {
            TrustedListenableFutureTask.this.setFuture(listenableFuture);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public ListenableFuture<Object> runInterruptibly() throws Exception {
            return (ListenableFuture) Preconditions.checkNotNull(this.callable.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.callable);
        }
    }

    /* loaded from: classes4.dex */
    public final class TrustedFutureInterruptibleTask extends InterruptibleTask<Object> {
        private final Callable<Object> callable;

        public TrustedFutureInterruptibleTask(Callable<Object> callable) {
            TrustedListenableFutureTask.this = r1;
            this.callable = (Callable) Preconditions.checkNotNull(callable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public void afterRanInterruptiblyFailure(Throwable th2) {
            TrustedListenableFutureTask.this.setException(th2);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public void afterRanInterruptiblySuccess(Object obj) {
            TrustedListenableFutureTask.this.set(obj);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final boolean isDone() {
            return TrustedListenableFutureTask.this.isDone();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public Object runInterruptibly() throws Exception {
            return this.callable.call();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public String toPendingString() {
            return this.callable.toString();
        }
    }

    public TrustedListenableFutureTask(Callable callable) {
        this.f54452h = new TrustedFutureInterruptibleTask(callable);
    }

    /* renamed from: A */
    public static TrustedListenableFutureTask m39389A(Runnable runnable, Object obj) {
        return new TrustedListenableFutureTask(Executors.callable(runnable, obj));
    }

    /* renamed from: B */
    public static TrustedListenableFutureTask m39388B(Callable callable) {
        return new TrustedListenableFutureTask(callable);
    }

    /* renamed from: z */
    public static TrustedListenableFutureTask m39387z(AsyncCallable asyncCallable) {
        return new TrustedListenableFutureTask(asyncCallable);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public void afterDone() {
        InterruptibleTask interruptibleTask;
        super.afterDone();
        if (wasInterrupted() && (interruptibleTask = this.f54452h) != null) {
            interruptibleTask.interruptTask();
        }
        this.f54452h = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public String pendingToString() {
        InterruptibleTask interruptibleTask = this.f54452h;
        if (interruptibleTask != null) {
            return "task=[" + interruptibleTask + "]";
        }
        return super.pendingToString();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        InterruptibleTask interruptibleTask = this.f54452h;
        if (interruptibleTask != null) {
            interruptibleTask.run();
        }
        this.f54452h = null;
    }

    public TrustedListenableFutureTask(AsyncCallable asyncCallable) {
        this.f54452h = new TrustedFutureInterruptibleAsyncTask(asyncCallable);
    }
}
