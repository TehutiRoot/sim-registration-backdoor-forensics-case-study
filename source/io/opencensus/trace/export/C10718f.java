package io.opencensus.trace.export;

import io.opencensus.trace.export.SampledSpanStore;
import java.util.Map;

/* renamed from: io.opencensus.trace.export.f */
/* loaded from: classes5.dex */
public final class C10718f extends SampledSpanStore.PerSpanNameSummary {

    /* renamed from: a */
    public final Map f63734a;

    /* renamed from: b */
    public final Map f63735b;

    public C10718f(Map map, Map map2) {
        if (map != null) {
            this.f63734a = map;
            if (map2 != null) {
                this.f63735b = map2;
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
        if (this.f63734a.equals(perSpanNameSummary.getNumbersOfLatencySampledSpans()) && this.f63735b.equals(perSpanNameSummary.getNumbersOfErrorSampledSpans())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.trace.export.SampledSpanStore.PerSpanNameSummary
    public Map getNumbersOfErrorSampledSpans() {
        return this.f63735b;
    }

    @Override // io.opencensus.trace.export.SampledSpanStore.PerSpanNameSummary
    public Map getNumbersOfLatencySampledSpans() {
        return this.f63734a;
    }

    public int hashCode() {
        return ((this.f63734a.hashCode() ^ 1000003) * 1000003) ^ this.f63735b.hashCode();
    }

    public String toString() {
        return "PerSpanNameSummary{numbersOfLatencySampledSpans=" + this.f63734a + ", numbersOfErrorSampledSpans=" + this.f63735b + "}";
    }
}
