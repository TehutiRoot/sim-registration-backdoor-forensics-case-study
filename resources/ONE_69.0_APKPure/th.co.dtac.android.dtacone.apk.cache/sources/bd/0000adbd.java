package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.JdkFutureAdapters;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes4.dex */
public final class JdkFutureAdapters {

    /* renamed from: com.google.common.util.concurrent.JdkFutureAdapters$a */
    /* loaded from: classes4.dex */
    public static class C8245a extends ForwardingFuture implements ListenableFuture {

        /* renamed from: e */
        public static final ThreadFactory f54366e;

        /* renamed from: f */
        public static final Executor f54367f;

        /* renamed from: a */
        public final Executor f54368a;

        /* renamed from: b */
        public final ExecutionList f54369b;

        /* renamed from: c */
        public final AtomicBoolean f54370c;

        /* renamed from: d */
        public final Future f54371d;

        static {
            ThreadFactory build = new ThreadFactoryBuilder().setDaemon(true).setNameFormat("ListenableFutureAdapter-thread-%d").build();
            f54366e = build;
            f54367f = Executors.newCachedThreadPool(build);
        }

        public C8245a(Future future) {
            this(future, f54367f);
        }

        /* renamed from: e */
        public static /* synthetic */ void m39484e(C8245a c8245a) {
            c8245a.m39483f();
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(Runnable runnable, Executor executor) {
            this.f54369b.add(runnable, executor);
            if (this.f54370c.compareAndSet(false, true)) {
                if (this.f54371d.isDone()) {
                    this.f54369b.execute();
                } else {
                    this.f54368a.execute(new Runnable() { // from class: Pg0
                        @Override // java.lang.Runnable
                        public final void run() {
                            JdkFutureAdapters.C8245a.m39484e(JdkFutureAdapters.C8245a.this);
                        }
                    });
                }
            }
        }

        /* renamed from: f */
        public final /* synthetic */ void m39483f() {
            try {
                Uninterruptibles.getUninterruptibly(this.f54371d);
            } catch (Throwable unused) {
            }
            this.f54369b.execute();
        }

        public C8245a(Future future, Executor executor) {
            this.f54369b = new ExecutionList();
            this.f54370c = new AtomicBoolean(false);
            this.f54371d = (Future) Preconditions.checkNotNull(future);
            this.f54368a = (Executor) Preconditions.checkNotNull(executor);
        }

        @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        public Future delegate() {
            return this.f54371d;
        }
    }

    public static <V> ListenableFuture<V> listenInPoolThread(Future<V> future) {
        if (future instanceof ListenableFuture) {
            return (ListenableFuture) future;
        }
        return new C8245a(future);
    }

    public static <V> ListenableFuture<V> listenInPoolThread(Future<V> future, Executor executor) {
        Preconditions.checkNotNull(executor);
        if (future instanceof ListenableFuture) {
            return (ListenableFuture) future;
        }
        return new C8245a(future, executor);
    }
}