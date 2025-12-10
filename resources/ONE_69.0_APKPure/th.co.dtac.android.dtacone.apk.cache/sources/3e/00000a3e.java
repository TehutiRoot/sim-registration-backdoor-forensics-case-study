package p000;

import io.opencensus.internal.Utils;
import io.opencensus.trace.Sampler;
import io.opencensus.trace.Span;
import io.opencensus.trace.SpanContext;
import io.opencensus.trace.SpanId;
import io.opencensus.trace.TraceId;
import java.util.Iterator;
import java.util.List;

/* renamed from: Ko1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC17976Ko1 extends Sampler {
    /* renamed from: a */
    public static AbstractC17976Ko1 m67661a(double d) {
        boolean z;
        long j;
        int i = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
        if (i >= 0 && d <= 1.0d) {
            z = true;
        } else {
            z = false;
        }
        Utils.checkArgument(z, "probability must be in range [0.0, 1.0]");
        if (i == 0) {
            j = Long.MIN_VALUE;
        } else if (d == 1.0d) {
            j = Long.MAX_VALUE;
        } else {
            j = (long) (9.223372036854776E18d * d);
        }
        return new C0912N8(d, j);
    }

    /* renamed from: b */
    public abstract long mo67270b();

    /* renamed from: c */
    public abstract double mo67269c();

    @Override // io.opencensus.trace.Sampler
    public final String getDescription() {
        return String.format("ProbabilitySampler{%.6f}", Double.valueOf(mo67269c()));
    }

    @Override // io.opencensus.trace.Sampler
    public final boolean shouldSample(SpanContext spanContext, Boolean bool, TraceId traceId, SpanId spanId, String str, List list) {
        if (spanContext != null && spanContext.getTraceOptions().isSampled()) {
            return true;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Span) it.next()).getContext().getTraceOptions().isSampled()) {
                    return true;
                }
            }
        }
        if (Math.abs(traceId.getLowerLong()) < mo67270b()) {
            return true;
        }
        return false;
    }
}