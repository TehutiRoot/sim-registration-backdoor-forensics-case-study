package io.opencensus.trace.export;

import io.opencensus.trace.export.SpanData;
import java.util.List;

/* renamed from: io.opencensus.trace.export.l */
/* loaded from: classes5.dex */
public final class C10724l extends SpanData.TimedEvents {

    /* renamed from: a */
    public final List f63756a;

    /* renamed from: b */
    public final int f63757b;

    public C10724l(List list, int i) {
        if (list != null) {
            this.f63756a = list;
            this.f63757b = i;
            return;
        }
        throw new NullPointerException("Null events");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpanData.TimedEvents)) {
            return false;
        }
        SpanData.TimedEvents timedEvents = (SpanData.TimedEvents) obj;
        if (this.f63756a.equals(timedEvents.getEvents()) && this.f63757b == timedEvents.getDroppedEventsCount()) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.trace.export.SpanData.TimedEvents
    public int getDroppedEventsCount() {
        return this.f63757b;
    }

    @Override // io.opencensus.trace.export.SpanData.TimedEvents
    public List getEvents() {
        return this.f63756a;
    }

    public int hashCode() {
        return ((this.f63756a.hashCode() ^ 1000003) * 1000003) ^ this.f63757b;
    }

    public String toString() {
        return "TimedEvents{events=" + this.f63756a + ", droppedEventsCount=" + this.f63757b + "}";
    }
}
