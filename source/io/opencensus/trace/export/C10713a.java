package io.opencensus.trace.export;

import io.opencensus.trace.export.RunningSpanStore;

/* renamed from: io.opencensus.trace.export.a */
/* loaded from: classes5.dex */
public final class C10713a extends RunningSpanStore.Filter {

    /* renamed from: a */
    public final String f63723a;

    /* renamed from: b */
    public final int f63724b;

    public C10713a(String str, int i) {
        if (str != null) {
            this.f63723a = str;
            this.f63724b = i;
            return;
        }
        throw new NullPointerException("Null spanName");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RunningSpanStore.Filter)) {
            return false;
        }
        RunningSpanStore.Filter filter = (RunningSpanStore.Filter) obj;
        if (this.f63723a.equals(filter.getSpanName()) && this.f63724b == filter.getMaxSpansToReturn()) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.trace.export.RunningSpanStore.Filter
    public int getMaxSpansToReturn() {
        return this.f63724b;
    }

    @Override // io.opencensus.trace.export.RunningSpanStore.Filter
    public String getSpanName() {
        return this.f63723a;
    }

    public int hashCode() {
        return ((this.f63723a.hashCode() ^ 1000003) * 1000003) ^ this.f63724b;
    }

    public String toString() {
        return "Filter{spanName=" + this.f63723a + ", maxSpansToReturn=" + this.f63724b + "}";
    }
}
