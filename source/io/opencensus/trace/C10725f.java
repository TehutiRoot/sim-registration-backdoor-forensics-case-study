package io.opencensus.trace;

import io.opencensus.trace.Link;
import java.util.Map;

/* renamed from: io.opencensus.trace.f */
/* loaded from: classes5.dex */
public final class C10725f extends Link {

    /* renamed from: b */
    public final TraceId f63758b;

    /* renamed from: c */
    public final SpanId f63759c;

    /* renamed from: d */
    public final Link.Type f63760d;

    /* renamed from: e */
    public final Map f63761e;

    public C10725f(TraceId traceId, SpanId spanId, Link.Type type, Map map) {
        if (traceId != null) {
            this.f63758b = traceId;
            if (spanId != null) {
                this.f63759c = spanId;
                if (type != null) {
                    this.f63760d = type;
                    if (map != null) {
                        this.f63761e = map;
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
        if (this.f63758b.equals(link.getTraceId()) && this.f63759c.equals(link.getSpanId()) && this.f63760d.equals(link.getType()) && this.f63761e.equals(link.getAttributes())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.trace.Link
    public Map getAttributes() {
        return this.f63761e;
    }

    @Override // io.opencensus.trace.Link
    public SpanId getSpanId() {
        return this.f63759c;
    }

    @Override // io.opencensus.trace.Link
    public TraceId getTraceId() {
        return this.f63758b;
    }

    @Override // io.opencensus.trace.Link
    public Link.Type getType() {
        return this.f63760d;
    }

    public int hashCode() {
        return ((((((this.f63758b.hashCode() ^ 1000003) * 1000003) ^ this.f63759c.hashCode()) * 1000003) ^ this.f63760d.hashCode()) * 1000003) ^ this.f63761e.hashCode();
    }

    public String toString() {
        return "Link{traceId=" + this.f63758b + ", spanId=" + this.f63759c + ", type=" + this.f63760d + ", attributes=" + this.f63761e + "}";
    }
}
