package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.FluentFuture;
import java.util.concurrent.Executor;

/* renamed from: com.google.common.util.concurrent.a */
/* loaded from: classes4.dex */
public abstract class AbstractRunnableC8294a extends FluentFuture.AbstractC8246a implements Runnable {

    /* renamed from: h */
    public ListenableFuture f54455h;

    /* renamed from: i */
    public Class f54456i;

    /* renamed from: j */
    public Object f54457j;

    /* renamed from: com.google.common.util.concurrent.a$a */
    /* loaded from: classes4.dex */
    public static final class C8295a extends AbstractRunnableC8294a {
        public C8295a(ListenableFuture listenableFuture, Class cls, AsyncFunction asyncFunction) {
            super(listenableFuture, cls, asyncFunction);
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC8294a
        /* renamed from: D */
        public ListenableFuture mo39382B(AsyncFunction asyncFunction, Throwable th2) {
            ListenableFuture apply = asyncFunction.apply(th2);
            Preconditions.checkNotNull(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", asyncFunction);
            return apply;
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC8294a
        /* renamed from: E */
        public void mo39381C(ListenableFuture listenableFuture) {
            setFuture(listenableFuture);
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$b */
    /* loaded from: classes4.dex */
    public static final class C8296b extends AbstractRunnableC8294a {
        public C8296b(ListenableFuture listenableFuture, Class cls, Function function) {
            super(listenableFuture, cls, function);
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC8294a
        /* renamed from: C */
        public void mo39381C(Object obj) {
            set(obj);
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC8294a
        /* renamed from: D */
        public Object mo39382B(Function function, Throwable th2) {
            return function.apply(th2);
        }
    }

    public AbstractRunnableC8294a(ListenableFuture listenableFuture, Class cls, Object obj) {
        this.f54455h = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
        this.f54456i = (Class) Preconditions.checkNotNull(cls);
        this.f54457j = Preconditions.checkNotNull(obj);
    }

    /* renamed from: A */
    public static ListenableFuture m39386A(ListenableFuture listenableFuture, Class cls, AsyncFunction asyncFunction, Executor executor) {
        C8295a c8295a = new C8295a(listenableFuture, cls, asyncFunction);
        listenableFuture.addListener(c8295a, MoreExecutors.m39475d(executor, c8295a));
        return c8295a;
    }

    /* renamed from: z */
    public static ListenableFuture m39385z(ListenableFuture listenableFuture, Class cls, Function function, Executor executor) {
        C8296b c8296b = new C8296b(listenableFuture, cls, function);
        listenableFuture.addListener(c8296b, MoreExecutors.m39475d(executor, c8296b));
        return c8296b;
    }

    /* renamed from: B */
    public abstract Object mo39382B(Object obj, Throwable th2);

    /* renamed from: C */
    public abstract void mo39381C(Object obj);

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
        m39670w(this.f54455h);
        this.f54455h = null;
        this.f54456i = null;
        this.f54457j = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public String pendingToString() {
        String str;
        ListenableFuture listenableFuture = this.f54455h;
        Class cls = this.f54456i;
        Object obj = this.f54457j;
        String pendingToString = super.pendingToString();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (cls != null && obj != null) {
            return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
        } else if (pendingToString != null) {
            return str + pendingToString;
        } else {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r8 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r8.f54455h
            java.lang.Class r1 = r8.f54456i
            java.lang.Object r2 = r8.f54457j
            r3 = 0
            r4 = 1
            if (r0 != 0) goto Lc
            r5 = 1
            goto Ld
        Lc:
            r5 = 0
        Ld:
            if (r1 != 0) goto L11
            r6 = 1
            goto L12
        L11:
            r6 = 0
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            r3 = 1
        L16:
            r3 = r3 | r5
            if (r3 != 0) goto La3
            boolean r3 = r8.isCancelled()
            if (r3 == 0) goto L21
            goto La3
        L21:
            r3 = 0
            r8.f54455h = r3
            boolean r4 = r0 instanceof com.google.common.util.concurrent.internal.InternalFutureFailureAccess     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            if (r4 == 0) goto L34
            r4 = r0
            com.google.common.util.concurrent.internal.InternalFutureFailureAccess r4 = (com.google.common.util.concurrent.internal.InternalFutureFailureAccess) r4     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            java.lang.Throwable r4 = com.google.common.util.concurrent.internal.InternalFutures.tryInternalFastPathGetFailure(r4)     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            goto L35
        L30:
            r4 = move-exception
            goto L3c
        L32:
            r4 = move-exception
            goto L3e
        L34:
            r4 = r3
        L35:
            if (r4 != 0) goto L3c
            java.lang.Object r5 = com.google.common.util.concurrent.Futures.getDone(r0)     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            goto L71
        L3c:
            r5 = r3
            goto L71
        L3e:
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L6f
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Future type "
            r6.append(r7)
            java.lang.Class r7 = r0.getClass()
            r6.append(r7)
            java.lang.String r7 = " threw "
            r6.append(r7)
            java.lang.Class r4 = r4.getClass()
            r6.append(r4)
            java.lang.String r4 = " without a cause"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
        L6f:
            r4 = r5
            goto L3c
        L71:
            if (r4 != 0) goto L7b
            java.lang.Object r0 = p000.AbstractC21568pJ0.m23709a(r5)
            r8.set(r0)
            return
        L7b:
            boolean r1 = p000.AbstractC17420Ck1.m68742a(r4, r1)
            if (r1 != 0) goto L85
            r8.setFuture(r0)
            return
        L85:
            java.lang.Object r0 = r8.mo39382B(r2, r4)     // Catch: java.lang.Throwable -> L91
            r8.f54456i = r3
            r8.f54457j = r3
            r8.mo39381C(r0)
            return
        L91:
            r0 = move-exception
            p000.AbstractC17420Ck1.m68741b(r0)     // Catch: java.lang.Throwable -> L9d
            r8.setException(r0)     // Catch: java.lang.Throwable -> L9d
            r8.f54456i = r3
            r8.f54457j = r3
            return
        L9d:
            r0 = move-exception
            r8.f54456i = r3
            r8.f54457j = r3
            throw r0
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractRunnableC8294a.run():void");
    }
}
