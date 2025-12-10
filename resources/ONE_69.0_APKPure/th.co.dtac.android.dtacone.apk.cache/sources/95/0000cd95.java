package io.opencensus.trace;

import java.util.List;

/* renamed from: io.opencensus.trace.i */
/* loaded from: classes5.dex */
public final class C10719i extends Tracestate {

    /* renamed from: a */
    public final List f63843a;

    public C10719i(List list) {
        if (list != null) {
            this.f63843a = list;
            return;
        }
        throw new NullPointerException("Null entries");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Tracestate) {
            return this.f63843a.equals(((Tracestate) obj).getEntries());
        }
        return false;
    }

    @Override // io.opencensus.trace.Tracestate
    public List getEntries() {
        return this.f63843a;
    }

    public int hashCode() {
        return this.f63843a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Tracestate{entries=" + this.f63843a + "}";
    }
}