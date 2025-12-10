package io.opencensus.trace;

import io.opencensus.trace.Link;
import java.util.Map;

/* renamed from: io.opencensus.trace.f */
/* loaded from: classes5.dex */
public final class C10712f extends Link {

    /* renamed from: b */
    public final TraceId f63821b;

    /* renamed from: c */
    public final SpanId f63822c;

    /* renamed from: d */
    public final Link.Type f63823d;

    /* renamed from: e */
    public final Map f63824e;

    public C10712f(TraceId traceId, SpanId spanId, Link.Type type, Map map) {
        if (traceId != null) {
            this.f63821b = traceId;
            if (spanId != null) {
                this.f63822c = spanId;
                if (type != null) {
                    this.f63823d = type;
                    if (map != null) {
                        this.f63824e = map;
                        return;
                    }
                    throw new NullPointerException("Null attributes");
                }
                throw new NullPointerException("Null type");
            }
            throw new NullPointerException("Null spanId");
        }
        throw new NullPointerException("Null traceId");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Link)) {
            return false;
        }
        Link link = (Link) obj;
        if (this.f63821b.equals(link.getTraceId()) && this.f63822c.equals(link.getSpanId()) && this.f63823d.equals(link.getType()) && this.f63824e.equals(link.getAttributes())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.trace.Link
    public Map getAttributes() {
        return this.f63824e;
    }

    @Override // io.opencensus.trace.Link
    public SpanId getSpanId() {
        return this.f63822c;
    }

    @Override // io.opencensus.trace.Link
    public TraceId getTraceId() {
        return this.f63821b;
    }

    @Override // io.opencensus.trace.Link
    public Link.Type getType() {
        return this.f63823d;
    }

    public int hashCode() {
        return ((((((this.f63821b.hashCode() ^ 1000003) * 1000003) ^ this.f63822c.hashCode()) * 1000003) ^ this.f63823d.hashCode()) * 1000003) ^ this.f63824e.hashCode();
    }

    public String toString() {
        return "Link{traceId=" + this.f63821b + ", spanId=" + this.f63822c + ", type=" + this.f63823d + ", attributes=" + this.f63824e + "}";
    }
}