package p000;

import io.opencensus.trace.Sampler;
import io.opencensus.trace.SpanContext;
import io.opencensus.trace.SpanId;
import io.opencensus.trace.TraceId;
import java.util.List;

/* renamed from: jH0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C20585jH0 extends Sampler {
    @Override // io.opencensus.trace.Sampler
    public String getDescription() {
        return toString();
    }

    @Override // io.opencensus.trace.Sampler
    public boolean shouldSample(SpanContext spanContext, Boolean bool, TraceId traceId, SpanId spanId, String str, List list) {
        return false;
    }

    public String toString() {
        return "NeverSampleSampler";
    }
}