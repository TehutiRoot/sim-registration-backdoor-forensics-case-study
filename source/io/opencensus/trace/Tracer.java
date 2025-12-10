package io.opencensus.trace;

import com.google.errorprone.annotations.MustBeClosed;
import io.opencensus.common.Scope;
import io.opencensus.internal.Utils;
import io.opencensus.trace.SpanBuilder;
import java.util.concurrent.Callable;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public abstract class Tracer {

    /* renamed from: a */
    public static final C10691b f63691a = new C10691b();

    /* renamed from: io.opencensus.trace.Tracer$b */
    /* loaded from: classes5.dex */
    public static final class C10691b extends Tracer {
        @Override // io.opencensus.trace.Tracer
        public SpanBuilder spanBuilderWithExplicitParent(String str, Span span) {
            return SpanBuilder.C10686a.m30157a(str, span);
        }

        @Override // io.opencensus.trace.Tracer
        public SpanBuilder spanBuilderWithRemoteParent(String str, SpanContext spanContext) {
            return SpanBuilder.C10686a.m30156b(str, spanContext);
        }

        public C10691b() {
        }
    }

    /* renamed from: a */
    public static Tracer m30151a() {
        return f63691a;
    }

    public final Span getCurrentSpan() {
        Span m66251b = AbstractC1351Sz.m66251b();
        if (m66251b == null) {
            return BlankSpan.INSTANCE;
        }
        return m66251b;
    }

    public final SpanBuilder spanBuilder(String str) {
        return spanBuilderWithExplicitParent(str, AbstractC1351Sz.m66251b());
    }

    public abstract SpanBuilder spanBuilderWithExplicitParent(String str, @Nullable Span span);

    public abstract SpanBuilder spanBuilderWithRemoteParent(String str, @Nullable SpanContext spanContext);

    @MustBeClosed
    public final Scope withSpan(Span span) {
        return AbstractC1351Sz.m66249d((Span) Utils.checkNotNull(span, "span"), false);
    }

    public final Runnable withSpan(Span span, Runnable runnable) {
        return AbstractC1351Sz.m66248e(span, false, runnable);
    }

    public final <C> Callable<C> withSpan(Span span, Callable<C> callable) {
        return AbstractC1351Sz.m66247f(span, false, callable);
    }
}
