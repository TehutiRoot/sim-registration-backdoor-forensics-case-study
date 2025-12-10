package io.opencensus.trace;

import io.opencensus.trace.Tracestate;

/* renamed from: io.opencensus.trace.j */
/* loaded from: classes5.dex */
public final class C10720j extends Tracestate.Entry {

    /* renamed from: a */
    public final String f63844a;

    /* renamed from: b */
    public final String f63845b;

    public C10720j(String str, String str2) {
        if (str != null) {
            this.f63844a = str;
            if (str2 != null) {
                this.f63845b = str2;
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
        if (this.f63844a.equals(entry.getKey()) && this.f63845b.equals(entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.trace.Tracestate.Entry
    public String getKey() {
        return this.f63844a;
    }

    @Override // io.opencensus.trace.Tracestate.Entry
    public String getValue() {
        return this.f63845b;
    }

    public int hashCode() {
        return ((this.f63844a.hashCode() ^ 1000003) * 1000003) ^ this.f63845b.hashCode();
    }

    public String toString() {
        return "Entry{key=" + this.f63844a + ", value=" + this.f63845b + "}";
    }
}