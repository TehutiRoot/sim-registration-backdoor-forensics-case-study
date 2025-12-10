package io.opencensus.trace;

import java.util.List;

/* renamed from: io.opencensus.trace.i */
/* loaded from: classes5.dex */
public final class C10732i extends Tracestate {

    /* renamed from: a */
    public final List f63780a;

    public C10732i(List list) {
        if (list != null) {
            this.f63780a = list;
            return;
        }
        throw new NullPointerException("Null entries");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Tracestate) {
            return this.f63780a.equals(((Tracestate) obj).getEntries());
        }
        return false;
    }

    @Override // io.opencensus.trace.Tracestate
    public List getEntries() {
        return this.f63780a;
    }

    public int hashCode() {
        return this.f63780a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Tracestate{entries=" + this.f63780a + "}";
    }
}
