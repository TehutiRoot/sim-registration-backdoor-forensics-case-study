package io.opencensus.trace.export;

import io.opencensus.trace.export.SampledSpanStore;
import java.util.Map;

/* renamed from: io.opencensus.trace.export.g */
/* loaded from: classes5.dex */
public final class C10706g extends SampledSpanStore.Summary {

    /* renamed from: a */
    public final Map f63799a;

    public C10706g(Map map) {
        if (map != null) {
            this.f63799a = map;
            return;
        }
        throw new NullPointerException("Null perSpanNameSummary");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SampledSpanStore.Summary) {
            return this.f63799a.equals(((SampledSpanStore.Summary) obj).getPerSpanNameSummary());
        }
        return false;
    }

    @Override // io.opencensus.trace.export.SampledSpanStore.Summary
    public Map getPerSpanNameSummary() {
        return this.f63799a;
    }

    public int hashCode() {
        return this.f63799a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Summary{perSpanNameSummary=" + this.f63799a + "}";
    }
}