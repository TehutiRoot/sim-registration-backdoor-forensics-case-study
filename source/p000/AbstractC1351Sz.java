package p000;

import io.opencensus.common.Scope;
import io.opencensus.trace.ContextHandle;
import io.opencensus.trace.Span;
import io.opencensus.trace.Status;
import io.opencensus.trace.unsafe.ContextHandleUtils;
import java.util.concurrent.Callable;

/* renamed from: Sz */
/* loaded from: classes5.dex */
public abstract class AbstractC1351Sz {

    /* renamed from: Sz$b */
    /* loaded from: classes5.dex */
    public static final class CallableC1353b implements Callable {

        /* renamed from: a */
        public final Span f5885a;

        /* renamed from: b */
        public final Callable f5886b;

        /* renamed from: c */
        public final boolean f5887c;

        @Override // java.util.concurrent.Callable
        public Object call() {
            ContextHandle attach = ContextHandleUtils.withValue(ContextHandleUtils.currentContext(), this.f5885a).attach();
            try {
                try {
                    Object call = this.f5886b.call();
                    ContextHandleUtils.currentContext().detach(attach);
                    if (this.f5887c) {
                        this.f5885a.end();
                    }
                    return call;
                }
            } catch (Exception e) {
                AbstractC1351Sz.m66250c(this.f5885a, e);
                throw e;
            }
        }

        public CallableC1353b(Span span, Callable callable, boolean z) {
            this.f5885a = span;
            this.f5886b = callable;
            this.f5887c = z;
        }
    }

    /* renamed from: Sz$c */
    /* loaded from: classes5.dex */
    public static final class RunnableC1354c implements Runnable {

        /* renamed from: a */
        public final Span f5888a;

        /* renamed from: b */
        public final Runnable f5889b;

        /* renamed from: c */
        public final boolean f5890c;

        @Override // java.lang.Runnable
        public void run() {
            ContextHandle attach = ContextHandleUtils.withValue(ContextHandleUtils.currentContext(), this.f5888a).attach();
            try {
                this.f5889b.run();
                ContextHandleUtils.currentContext().detach(attach);
                if (this.f5890c) {
                    this.f5888a.end();
                }
            } catch (Throwable th2) {
                try {
                    AbstractC1351Sz.m66250c(this.f5888a, th2);
                    if (!(th2 instanceof RuntimeException)) {
                        if (th2 instanceof Error) {
                            throw th2;
                        }
                        throw new RuntimeException("unexpected", th2);
                    }
                    throw ((RuntimeException) th2);
                } catch (Throwable th3) {
                    ContextHandleUtils.currentContext().detach(attach);
                    if (this.f5890c) {
                        this.f5888a.end();
                    }
                    throw th3;
                }
            }
        }

        public RunnableC1354c(Span span, Runnable runnable, boolean z) {
            this.f5888a = span;
            this.f5889b = runnable;
            this.f5890c = z;
        }
    }

    /* renamed from: Sz$d */
    /* loaded from: classes5.dex */
    public static final class C1355d implements Scope {

        /* renamed from: a */
        public final ContextHandle f5891a;

        /* renamed from: b */
        public final Span f5892b;

        /* renamed from: c */
        public final boolean f5893c;

        @Override // io.opencensus.common.Scope, io.opencensus.common.NonThrowingCloseable, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ContextHandleUtils.currentContext().detach(this.f5891a);
            if (this.f5893c) {
                this.f5892b.end();
            }
        }

        public C1355d(Span span, boolean z) {
            this.f5892b = span;
            this.f5893c = z;
            this.f5891a = ContextHandleUtils.withValue(ContextHandleUtils.currentContext(), span).attach();
        }
    }

    /* renamed from: b */
    public static Span m66251b() {
        return ContextHandleUtils.getValue(ContextHandleUtils.currentContext());
    }

    /* renamed from: c */
    public static void m66250c(Span span, Throwable th2) {
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
    public static Scope m66249d(Span span, boolean z) {
        return new C1355d(span, z);
    }

    /* renamed from: e */
    public static Runnable m66248e(Span span, boolean z, Runnable runnable) {
        return new RunnableC1354c(span, runnable, z);
    }

    /* renamed from: f */
    public static Callable m66247f(Span span, boolean z, Callable callable) {
        return new CallableC1353b(span, callable, z);
    }
}
