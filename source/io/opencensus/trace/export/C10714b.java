package io.opencensus.trace.export;

import io.opencensus.trace.export.RunningSpanStore;

/* renamed from: io.opencensus.trace.export.b */
/* loaded from: classes5.dex */
public final class C10714b extends RunningSpanStore.PerSpanNameSummary {

    /* renamed from: a */
    public final int f63725a;

    public C10714b(int i) {
        this.f63725a = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof RunningSpanStore.PerSpanNameSummary) && this.f63725a == ((RunningSpanStore.PerSpanNameSummary) obj).getNumRunningSpans()) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.trace.export.RunningSpanStore.PerSpanNameSummary
    public int getNumRunningSpans() {
        return this.f63725a;
    }

    public int hashCode() {
        return 1000003 ^ this.f63725a;
    }

    public String toString() {
        return "PerSpanNameSummary{numRunningSpans=" + this.f63725a + "}";
    }
}
