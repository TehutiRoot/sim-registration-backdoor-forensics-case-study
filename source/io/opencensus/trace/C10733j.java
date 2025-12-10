package io.opencensus.trace;

import io.opencensus.trace.Tracestate;

/* renamed from: io.opencensus.trace.j */
/* loaded from: classes5.dex */
public final class C10733j extends Tracestate.Entry {

    /* renamed from: a */
    public final String f63781a;

    /* renamed from: b */
    public final String f63782b;

    public C10733j(String str, String str2) {
        if (str != null) {
            this.f63781a = str;
            if (str2 != null) {
                this.f63782b = str2;
                return;
            }
            throw new NullPointerException("Null value");
        }
        throw new NullPointerException("Null key");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Tracestate.Entry)) {
            return false;
        }
        Tracestate.Entry entry = (Tracestate.Entry) obj;
        if (this.f63781a.equals(entry.getKey()) && this.f63782b.equals(entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.trace.Tracestate.Entry
    public String getKey() {
        return this.f63781a;
    }

    @Override // io.opencensus.trace.Tracestate.Entry
    public String getValue() {
        return this.f63782b;
    }

    public int hashCode() {
        return ((this.f63781a.hashCode() ^ 1000003) * 1000003) ^ this.f63782b.hashCode();
    }

    public String toString() {
        return "Entry{key=" + this.f63781a + ", value=" + this.f63782b + "}";
    }
}
