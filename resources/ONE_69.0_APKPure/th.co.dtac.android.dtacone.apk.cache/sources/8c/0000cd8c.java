package io.opencensus.trace.export;

import io.opencensus.common.Timestamp;
import io.opencensus.trace.export.SpanData;

/* renamed from: io.opencensus.trace.export.k */
/* loaded from: classes5.dex */
public final class C10710k extends SpanData.TimedEvent {

    /* renamed from: a */
    public final Timestamp f63817a;

    /* renamed from: b */
    public final Object f63818b;

    public C10710k(Timestamp timestamp, Object obj) {
        if (timestamp != null) {
            this.f63817a = timestamp;
            if (obj != null) {
                this.f63818b = obj;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null timestamp");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpanData.TimedEvent)) {
            return false;
        }
        SpanData.TimedEvent timedEvent = (SpanData.TimedEvent) obj;
        if (this.f63817a.equals(timedEvent.getTimestamp()) && this.f63818b.equals(timedEvent.getEvent())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.trace.export.SpanData.TimedEvent
    public Object getEvent() {
        return this.f63818b;
    }

    @Override // io.opencensus.trace.export.SpanData.TimedEvent
    public Timestamp getTimestamp() {
        return this.f63817a;
    }

    public int hashCode() {
        return ((this.f63817a.hashCode() ^ 1000003) * 1000003) ^ this.f63818b.hashCode();
    }

    public String toString() {
        return "TimedEvent{timestamp=" + this.f63817a + ", event=" + this.f63818b + "}";
    }
}