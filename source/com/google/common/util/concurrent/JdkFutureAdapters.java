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
    public static class C8256a extends ForwardingFuture implements ListenableFuture {

        /* renamed from: e */
        public static final ThreadFactory f54354e;

        /* renamed from: f */
        public static final Executor f54355f;

        /* renamed from: a */
        public final Executor f54356a;

        /* renamed from: b */
        public final ExecutionList f54357b;

        /* renamed from: c */
        public final AtomicBoolean f54358c;

        /* renamed from: d */
        public final Future f54359d;

        static {
            ThreadFactory build = new ThreadFactoryBuilder().setDaemon(true).setNameFormat("ListenableFutureAdapter-thread-%d").build();
            f54354e = build;
            f54355f = Executors.newCachedThreadPool(build);
        }

        public C8256a(Future future) {
            this(future, f54355f);
        }

        /* renamed from: e */
        public static /* synthetic */ void m39492e(C8256a c8256a) {
            c8256a.m39491f();
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(Runnable runnable, Executor executor) {
            this.f54357b.add(runnable, executor);
            if (this.f54358c.compareAndSet(false, true)) {
                if (this.f54359d.isDone()) {
                    this.f54357b.execute();
                } else {
                    this.f54356a.execute(new Runnable() { // from class: Jg0
                        {
                            JdkFutureAdapters.C8256a.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            JdkFutureAdapters.C8256a.m39492e(JdkFutureAdapters.C8256a.this);
                        }
                    });
                }
            }
        }

        /* renamed from: f */
        public final /* synthetic */ void m39491f() {
            try {
                Uninterruptibles.getUninterruptibly(this.f54359d);
            } catch (Throwable unused) {
            }
            this.f54357b.execute();
        }

        public C8256a(Future future, Executor executor) {
            this.f54357b = new ExecutionList();
            this.f54358c = new AtomicBoolean(false);
            this.f54359d = (Future) Preconditions.checkNotNull(future);
            this.f54356a = (Executor) Preconditions.checkNotNull(executor);
        }

        @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        public Future delegate() {
            return this.f54359d;
        }
    }

    public static <V> ListenableFuture<V> listenInPoolThread(Future<V> future) {
        if (future instanceof ListenableFuture) {
            return (ListenableFuture) future;
        }
        return new C8256a(future);
    }

    public static <V> ListenableFuture<V> listenInPoolThread(Future<V> future, Executor executor) {
        Preconditions.checkNotNull(executor);
        if (future instanceof ListenableFuture) {
            return (ListenableFuture) future;
        }
        return new C8256a(future, executor);
    }
}
