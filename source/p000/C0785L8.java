package p000;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;

/* renamed from: L8 */
/* loaded from: classes3.dex */
public final class C0785L8 extends PersistedEvent {

    /* renamed from: a */
    public final long f3391a;

    /* renamed from: b */
    public final TransportContext f3392b;

    /* renamed from: c */
    public final EventInternal f3393c;

    public C0785L8(long j, TransportContext transportContext, EventInternal eventInternal) {
        this.f3391a = j;
        if (transportContext != null) {
            this.f3392b = transportContext;
            if (eventInternal != null) {
                this.f3393c = eventInternal;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedEvent)) {
            return false;
        }
        PersistedEvent persistedEvent = (PersistedEvent) obj;
        if (this.f3391a == persistedEvent.getId() && this.f3392b.equals(persistedEvent.getTransportContext()) && this.f3393c.equals(persistedEvent.getEvent())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public EventInternal getEvent() {
        return this.f3393c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public long getId() {
        return this.f3391a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public TransportContext getTransportContext() {
        return this.f3392b;
    }

    public int hashCode() {
        long j = this.f3391a;
        return this.f3393c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f3392b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f3391a + ", transportContext=" + this.f3392b + ", event=" + this.f3393c + "}";
    }
}
