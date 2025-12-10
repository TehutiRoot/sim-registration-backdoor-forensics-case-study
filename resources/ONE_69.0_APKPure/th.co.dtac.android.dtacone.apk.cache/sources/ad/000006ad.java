package p000;

import io.opencensus.trace.Sampler;
import io.opencensus.trace.SpanContext;
import io.opencensus.trace.SpanId;
import io.opencensus.trace.TraceId;
import java.util.List;

/* renamed from: H2 */
/* loaded from: classes5.dex */
public final class C0492H2 extends Sampler {
    @Override // io.opencensus.trace.Sampler
    public String getDescription() {
        return toString();
    }

    @Override // io.opencensus.trace.Sampler
    public boolean shouldSample(SpanContext spanContext, Boolean bool, TraceId traceId, SpanId spanId, String str, List list) {
        return true;
    }

    public String toString() {
        return "AlwaysSampleSampler";
    }
}