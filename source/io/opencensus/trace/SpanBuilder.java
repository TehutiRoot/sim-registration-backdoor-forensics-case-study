package io.opencensus.trace;

import com.google.errorprone.annotations.MustBeClosed;
import io.opencensus.common.Scope;
import io.opencensus.internal.Utils;
import io.opencensus.trace.Span;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public abstract class SpanBuilder {

    /* renamed from: io.opencensus.trace.SpanBuilder$a */
    /* loaded from: classes5.dex */
    public static final class C10686a extends SpanBuilder {
        public C10686a(String str) {
            Utils.checkNotNull(str, "name");
        }

        /* renamed from: a */
        public static C10686a m30157a(String str, Span span) {
            return new C10686a(str);
        }

        /* renamed from: b */
        public static C10686a m30156b(String str, SpanContext spanContext) {
            return new C10686a(str);
        }

        @Override // io.opencensus.trace.SpanBuilder
        public SpanBuilder setParentLinks(List list) {
            return this;
        }

        @Override // io.opencensus.trace.SpanBuilder
        public SpanBuilder setRecordEvents(boolean z) {
            return this;
        }

        @Override // io.opencensus.trace.SpanBuilder
        public SpanBuilder setSampler(Sampler sampler) {
            return this;
        }

        @Override // io.opencensus.trace.SpanBuilder
        public SpanBuilder setSpanKind(Span.Kind kind) {
            return this;
        }

        @Override // io.opencensus.trace.SpanBuilder
        public Span startSpan() {
            return BlankSpan.INSTANCE;
        }
    }

    public abstract SpanBuilder setParentLinks(List<Span> list);

    public abstract SpanBuilder setRecordEvents(boolean z);

    public abstract SpanBuilder setSampler(Sampler sampler);

    public SpanBuilder setSpanKind(@Nullable Span.Kind kind) {
        return this;
    }

    @MustBeClosed
    public final Scope startScopedSpan() {
        return AbstractC1351Sz.m66249d(startSpan(), true);
    }

    public abstract Span startSpan();

    public final <V> V startSpanAndCall(Callable<V> callable) throws Exception {
        return (V) AbstractC1351Sz.m66247f(startSpan(), true, callable).call();
    }

    public final void startSpanAndRun(Runnable runnable) {
        AbstractC1351Sz.m66248e(startSpan(), true, runnable).run();
    }
}
