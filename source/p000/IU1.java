package p000;

import com.google.firebase.perf.metrics.Counter;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.p016v1.PerfSession;
import com.google.firebase.perf.p016v1.TraceMetric;
import java.util.Arrays;
import java.util.List;

/* renamed from: IU1 */
/* loaded from: classes4.dex */
public class IU1 {

    /* renamed from: a */
    public final Trace f2522a;

    public IU1(Trace trace) {
        this.f2522a = trace;
    }

    /* renamed from: a */
    public TraceMetric m67906a() {
        TraceMetric.Builder durationUs = TraceMetric.newBuilder().setName(this.f2522a.getName()).setClientStartTimeUs(this.f2522a.m38238e().getMicros()).setDurationUs(this.f2522a.m38238e().getDurationMicros(this.f2522a.m38240c()));
        for (Counter counter : this.f2522a.m38241b().values()) {
            durationUs.putCounters(counter.m38251b(), counter.m38252a());
        }
        List<Trace> m38237f = this.f2522a.m38237f();
        if (!m38237f.isEmpty()) {
            for (Trace trace : m38237f) {
                durationUs.addSubtraces(new IU1(trace).m67906a());
            }
        }
        durationUs.putAllCustomAttributes(this.f2522a.getAttributes());
        PerfSession[] buildAndSort = com.google.firebase.perf.session.PerfSession.buildAndSort(this.f2522a.m38239d());
        if (buildAndSort != null) {
            durationUs.addAllPerfSessions(Arrays.asList(buildAndSort));
        }
        return durationUs.build();
    }
}
