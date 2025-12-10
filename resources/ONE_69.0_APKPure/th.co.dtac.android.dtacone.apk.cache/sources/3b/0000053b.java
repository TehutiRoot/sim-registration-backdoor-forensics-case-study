package p000;

import com.google.firebase.perf.metrics.Counter;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.p016v1.PerfSession;
import com.google.firebase.perf.p016v1.TraceMetric;
import java.util.Arrays;
import java.util.List;

/* renamed from: FV1 */
/* loaded from: classes4.dex */
public class FV1 {

    /* renamed from: a */
    public final Trace f1701a;

    public FV1(Trace trace) {
        this.f1701a = trace;
    }

    /* renamed from: a */
    public TraceMetric m68418a() {
        TraceMetric.Builder durationUs = TraceMetric.newBuilder().setName(this.f1701a.getName()).setClientStartTimeUs(this.f1701a.m38230e().getMicros()).setDurationUs(this.f1701a.m38230e().getDurationMicros(this.f1701a.m38232c()));
        for (Counter counter : this.f1701a.m38233b().values()) {
            durationUs.putCounters(counter.m38243b(), counter.m38244a());
        }
        List<Trace> m38229f = this.f1701a.m38229f();
        if (!m38229f.isEmpty()) {
            for (Trace trace : m38229f) {
                durationUs.addSubtraces(new FV1(trace).m68418a());
            }
        }
        durationUs.putAllCustomAttributes(this.f1701a.getAttributes());
        PerfSession[] buildAndSort = com.google.firebase.perf.session.PerfSession.buildAndSort(this.f1701a.m38231d());
        if (buildAndSort != null) {
            durationUs.addAllPerfSessions(Arrays.asList(buildAndSort));
        }
        return durationUs.build();
    }
}