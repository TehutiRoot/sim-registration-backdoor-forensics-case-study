package io.opencensus.trace.export;

import io.opencensus.trace.export.SampledSpanStore;
import java.util.Map;

/* renamed from: io.opencensus.trace.export.f */
/* loaded from: classes5.dex */
public final class C10705f extends SampledSpanStore.PerSpanNameSummary {

    /* renamed from: a */
    public final Map f63797a;

    /* renamed from: b */
    public final Map f63798b;

    public C10705f(Map map, Map map2) {
        if (map != null) {
            this.f63797a = map;
            if (map2 != null) {
                this.f63798b = map2;
                return;
            }
            throw new NullPointerException("Null numbersOfErrorSampledSpans");
        }
        throw new NullPointerException("Null numbersOfLatencySampledSpans");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SampledSpanStore.PerSpanNameSummary)) {
            return false;
        }
        SampledSpanStore.PerSpanNameSummary perSpanNameSummary = (SampledSpanStore.PerSpanNameSummary) obj;
        if (this.f63797a.equals(perSpanNameSummary.getNumbersOfLatencySampledSpans()) && this.f63798b.equals(perSpanNameSummary.getNumbersOfErrorSampledSpans())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.trace.export.SampledSpanStore.PerSpanNameSummary
    public Map getNumbersOfErrorSampledSpans() {
        return this.f63798b;
    }

    @Override // io.opencensus.trace.export.SampledSpanStore.PerSpanNameSummary
    public Map getNumbersOfLatencySampledSpans() {
        return this.f63797a;
    }

    public int hashCode() {
        return ((this.f63797a.hashCode() ^ 1000003) * 1000003) ^ this.f63798b.hashCode();
    }

    public String toString() {
        return "PerSpanNameSummary{numbersOfLatencySampledSpans=" + this.f63797a + ", numbersOfErrorSampledSpans=" + this.f63798b + "}";
    }
}