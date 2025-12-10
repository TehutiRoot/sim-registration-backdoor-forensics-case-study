package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.FluentFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: com.google.common.util.concurrent.b */
/* loaded from: classes4.dex */
public abstract class AbstractRunnableC8286b extends FluentFuture.AbstractC8235a implements Runnable {

    /* renamed from: h */
    public ListenableFuture f54470h;

    /* renamed from: i */
    public Object f54471i;

    /* renamed from: com.google.common.util.concurrent.b$a */
    /* loaded from: classes4.dex */
    public static final class C8287a extends AbstractRunnableC8286b {
        public C8287a(ListenableFuture listenableFuture, AsyncFunction asyncFunction) {
            super(listenableFuture, asyncFunction);
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC8286b
        /* renamed from: D */
        public ListenableFuture mo39367B(AsyncFunction asyncFunction, Object obj) {
            ListenableFuture apply = asyncFunction.apply(obj);
            Preconditions.checkNotNull(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", asyncFunction);
            return apply;
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC8286b
        /* renamed from: E */
        public void mo39366C(ListenableFuture listenableFuture) {
            setFuture(listenableFuture);
        }
    }

    /* renamed from: com.google.common.util.concurrent.b$b */
    /* loaded from: classes4.dex */
    public static final class C8288b extends AbstractRunnableC8286b {
        public C8288b(ListenableFuture listenableFuture, Function function) {
            super(listenableFuture, function);
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC8286b
        /* renamed from: C */
        public void mo39366C(Object obj) {
            set(obj);
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC8286b
        /* renamed from: D */
        public Object mo39367B(Function function, Object obj) {
            return function.apply(obj);
        }
    }

    public AbstractRunnableC8286b(ListenableFuture listenableFuture, Object obj) {
        this.f54470h = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
        this.f54471i = Preconditions.checkNotNull(obj);
    }

    /* renamed from: A */
    public static ListenableFuture m39371A(ListenableFuture listenableFuture, AsyncFunction asyncFunction, Executor executor) {
        Preconditions.checkNotNull(executor);
        C8287a c8287a = new C8287a(listenableFuture, asyncFunction);
        listenableFuture.addListener(c8287a, MoreExecutors.m39467d(executor, c8287a));
        return c8287a;
    }

    /* renamed from: z */
    public static ListenableFuture m39370z(ListenableFuture listenableFuture, Function function, Executor executor) {
        Preconditions.checkNotNull(function);
        C8288b c8288b = new C8288b(listenableFuture, function);
        listenableFuture.addListener(c8288b, MoreExecutors.m39467d(executor, c8288b));
        return c8288b;
    }

    /* renamed from: B */
    public abstract Object mo39367B(Object obj, Object obj2);

    /* renamed from: C */
    public abstract void mo39366C(Object obj);

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
        m39662w(this.f54470h);
        this.f54470h = null;
        this.f54471i = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public String pendingToString() {
        String str;
        ListenableFuture listenableFuture = this.f54470h;
        Object obj = this.f54471i;
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
        ListenableFuture listenableFuture = this.f54470h;
        Object obj = this.f54471i;
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
        this.f54470h = null;
        if (listenableFuture.isCancelled()) {
            setFuture(listenableFuture);
            return;
        }
        try {
            try {
                Object mo39367B = mo39367B(obj, Futures.getDone(listenableFuture));
                this.f54471i = null;
                mo39366C(mo39367B);
            } catch (Throwable th2) {
                try {
                    AbstractC23431zl1.m74b(th2);
                    setException(th2);
                } finally {
                    this.f54471i = null;
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