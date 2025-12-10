package io.opencensus.trace;

import java.util.Arrays;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public final class SpanContext {
    public static final SpanContext INVALID;

    /* renamed from: e */
    public static final Tracestate f63675e;

    /* renamed from: a */
    public final TraceId f63676a;

    /* renamed from: b */
    public final SpanId f63677b;

    /* renamed from: c */
    public final TraceOptions f63678c;

    /* renamed from: d */
    public final Tracestate f63679d;

    static {
        Tracestate build = Tracestate.builder().build();
        f63675e = build;
        INVALID = new SpanContext(TraceId.INVALID, SpanId.INVALID, TraceOptions.DEFAULT, build);
    }

    public SpanContext(TraceId traceId, SpanId spanId, TraceOptions traceOptions, Tracestate tracestate) {
        this.f63676a = traceId;
        this.f63677b = spanId;
        this.f63678c = traceOptions;
        this.f63679d = tracestate;
    }

    @Deprecated
    public static SpanContext create(TraceId traceId, SpanId spanId, TraceOptions traceOptions) {
        return create(traceId, spanId, traceOptions, f63675e);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpanContext)) {
            return false;
        }
        SpanContext spanContext = (SpanContext) obj;
        if (this.f63676a.equals(spanContext.f63676a) && this.f63677b.equals(spanContext.f63677b) && this.f63678c.equals(spanContext.f63678c)) {
            return true;
        }
        return false;
    }

    public SpanId getSpanId() {
        return this.f63677b;
    }

    public TraceId getTraceId() {
        return this.f63676a;
    }

    public TraceOptions getTraceOptions() {
        return this.f63678c;
    }

    public Tracestate getTracestate() {
        return this.f63679d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f63676a, this.f63677b, this.f63678c});
    }

    public boolean isValid() {
        if (this.f63676a.isValid() && this.f63677b.isValid()) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "SpanContext{traceId=" + this.f63676a + ", spanId=" + this.f63677b + ", traceOptions=" + this.f63678c + "}";
    }

    public static SpanContext create(TraceId traceId, SpanId spanId, TraceOptions traceOptions, Tracestate tracestate) {
        return new SpanContext(traceId, spanId, traceOptions, tracestate);
    }
}
