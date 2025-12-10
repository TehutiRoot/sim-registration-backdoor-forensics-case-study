package p000;

import io.opencensus.common.Scope;
import io.opencensus.trace.ContextHandle;
import io.opencensus.trace.Span;
import io.opencensus.trace.Status;
import io.opencensus.trace.unsafe.ContextHandleUtils;
import java.util.concurrent.Callable;

/* renamed from: Sz */
/* loaded from: classes5.dex */
public abstract class AbstractC1334Sz {

    /* renamed from: Sz$b */
    /* loaded from: classes5.dex */
    public static final class CallableC1336b implements Callable {

        /* renamed from: a */
        public final Span f6213a;

        /* renamed from: b */
        public final Callable f6214b;

        /* renamed from: c */
        public final boolean f6215c;

        @Override // java.util.concurrent.Callable
        public Object call() {
            ContextHandle attach = ContextHandleUtils.withValue(ContextHandleUtils.currentContext(), this.f6213a).attach();
            try {
                try {
                    Object call = this.f6214b.call();
                    ContextHandleUtils.currentContext().detach(attach);
                    if (this.f6215c) {
                        this.f6213a.end();
                    }
                    return call;
                }
            } catch (Exception e) {
                AbstractC1334Sz.m66425c(this.f6213a, e);
                throw e;
            }
        }

        public CallableC1336b(Span span, Callable callable, boolean z) {
            this.f6213a = span;
            this.f6214b = callable;
            this.f6215c = z;
        }
    }

    /* renamed from: Sz$c */
    /* loaded from: classes5.dex */
    public static final class RunnableC1337c implements Runnable {

        /* renamed from: a */
        public final Span f6216a;

        /* renamed from: b */
        public final Runnable f6217b;

        /* renamed from: c */
        public final boolean f6218c;

        @Override // java.lang.Runnable
        public void run() {
            ContextHandle attach = ContextHandleUtils.withValue(ContextHandleUtils.currentContext(), this.f6216a).attach();
            try {
                this.f6217b.run();
                ContextHandleUtils.currentContext().detach(attach);
                if (this.f6218c) {
                    this.f6216a.end();
                }
            } catch (Throwable th2) {
                try {
                    AbstractC1334Sz.m66425c(this.f6216a, th2);
                    if (!(th2 instanceof RuntimeException)) {
                        if (th2 instanceof Error) {
                            throw th2;
                        }
                        throw new RuntimeException("unexpected", th2);
                    }
                    throw ((RuntimeException) th2);
                } catch (Throwable th3) {
                    ContextHandleUtils.currentContext().detach(attach);
                    if (this.f6218c) {
                        this.f6216a.end();
                    }
                    throw th3;
                }
            }
        }

        public RunnableC1337c(Span span, Runnable runnable, boolean z) {
            this.f6216a = span;
            this.f6217b = runnable;
            this.f6218c = z;
        }
    }

    /* renamed from: Sz$d */
    /* loaded from: classes5.dex */
    public static final class C1338d implements Scope {

        /* renamed from: a */
        public final ContextHandle f6219a;

        /* renamed from: b */
        public final Span f6220b;

        /* renamed from: c */
        public final boolean f6221c;

        @Override // io.opencensus.common.Scope, io.opencensus.common.NonThrowingCloseable, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ContextHandleUtils.currentContext().detach(this.f6219a);
            if (this.f6221c) {
                this.f6220b.end();
            }
        }

        public C1338d(Span span, boolean z) {
            this.f6220b = span;
            this.f6221c = z;
            this.f6219a = ContextHandleUtils.withValue(ContextHandleUtils.currentContext(), span).attach();
        }
    }

    /* renamed from: b */
    public static Span m66426b() {
        return ContextHandleUtils.getValue(ContextHandleUtils.currentContext());
    }

    /* renamed from: c */
    public static void m66425c(Span span, Throwable th2) {
        String message;
        Status status = Status.UNKNOWN;
        if (th2.getMessage() == null) {
            message = th2.getClass().getSimpleName();
        } else {
            message = th2.getMessage();
        }
        span.setStatus(status.withDescription(message));
    }

    /* renamed from: d */
    public static Scope m66424d(Span span, boolean z) {
        return new C1338d(span, z);
    }

    /* renamed from: e */
    public static Runnable m66423e(Span span, boolean z, Runnable runnable) {
        return new RunnableC1337c(span, runnable, z);
    }

    /* renamed from: f */
    public static Callable m66422f(Span span, boolean z, Callable callable) {
        return new CallableC1336b(span, callable, z);
    }
}