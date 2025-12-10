package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.FluentFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: com.google.common.util.concurrent.b */
/* loaded from: classes4.dex */
public abstract class AbstractRunnableC8297b extends FluentFuture.AbstractC8246a implements Runnable {

    /* renamed from: h */
    public ListenableFuture f54458h;

    /* renamed from: i */
    public Object f54459i;

    /* renamed from: com.google.common.util.concurrent.b$a */
    /* loaded from: classes4.dex */
    public static final class C8298a extends AbstractRunnableC8297b {
        public C8298a(ListenableFuture listenableFuture, AsyncFunction asyncFunction) {
            super(listenableFuture, asyncFunction);
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC8297b
        /* renamed from: D */
        public ListenableFuture mo39375B(AsyncFunction asyncFunction, Object obj) {
            ListenableFuture apply = asyncFunction.apply(obj);
            Preconditions.checkNotNull(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", asyncFunction);
            return apply;
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC8297b
        /* renamed from: E */
        public void mo39374C(ListenableFuture listenableFuture) {
            setFuture(listenableFuture);
        }
    }

    /* renamed from: com.google.common.util.concurrent.b$b */
    /* loaded from: classes4.dex */
    public static final class C8299b extends AbstractRunnableC8297b {
        public C8299b(ListenableFuture listenableFuture, Function function) {
            super(listenableFuture, function);
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC8297b
        /* renamed from: C */
        public void mo39374C(Object obj) {
            set(obj);
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC8297b
        /* renamed from: D */
        public Object mo39375B(Function function, Object obj) {
            return function.apply(obj);
        }
    }

    public AbstractRunnableC8297b(ListenableFuture listenableFuture, Object obj) {
        this.f54458h = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
        this.f54459i = Preconditions.checkNotNull(obj);
    }

    /* renamed from: A */
    public static ListenableFuture m39379A(ListenableFuture listenableFuture, AsyncFunction asyncFunction, Executor executor) {
        Preconditions.checkNotNull(executor);
        C8298a c8298a = new C8298a(listenableFuture, asyncFunction);
        listenableFuture.addListener(c8298a, MoreExecutors.m39475d(executor, c8298a));
        return c8298a;
    }

    /* renamed from: z */
    public static ListenableFuture m39378z(ListenableFuture listenableFuture, Function function, Executor executor) {
        Preconditions.checkNotNull(function);
        C8299b c8299b = new C8299b(listenableFuture, function);
        listenableFuture.addListener(c8299b, MoreExecutors.m39475d(executor, c8299b));
        return c8299b;
    }

    /* renamed from: B */
    public abstract Object mo39375B(Object obj, Object obj2);

    /* renamed from: C */
    public abstract void mo39374C(Object obj);

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
        m39670w(this.f54458h);
        this.f54458h = null;
        this.f54459i = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public String pendingToString() {
        String str;
        ListenableFuture listenableFuture = this.f54458h;
        Object obj = this.f54459i;
        String pendingToString = super.pendingToString();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (obj != null) {
            return str + "function=[" + obj + "]";
        } else if (pendingToString != null) {
            return str + pendingToString;
        } else {
            return null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ListenableFuture listenableFuture = this.f54458h;
        Object obj = this.f54459i;
        boolean isCancelled = isCancelled();
        boolean z2 = true;
        if (listenableFuture == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = isCancelled | z;
        if (obj != null) {
            z2 = false;
        }
        if (z3 | z2) {
            return;
        }
        this.f54458h = null;
        if (listenableFuture.isCancelled()) {
            setFuture(listenableFuture);
            return;
        }
        try {
            try {
                Object mo39375B = mo39375B(obj, Futures.getDone(listenableFuture));
                this.f54459i = null;
                mo39374C(mo39375B);
            } catch (Throwable th2) {
                try {
                    AbstractC17420Ck1.m68741b(th2);
                    setException(th2);
                } finally {
                    this.f54459i = null;
                }
            }
        } catch (Error e) {
            setException(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            setException(e2.getCause());
        } catch (Exception e3) {
            setException(e3);
        }
    }
}
