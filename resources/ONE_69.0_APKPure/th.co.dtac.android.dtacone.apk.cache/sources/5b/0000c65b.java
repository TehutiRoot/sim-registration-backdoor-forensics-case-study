package p000;

import com.google.firebase.perf.metrics.validator.PerfMetricValidator;
import com.google.firebase.perf.p016v1.GaugeMetric;

/* renamed from: f20  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19848f20 extends PerfMetricValidator {

    /* renamed from: a */
    public final GaugeMetric f61757a;

    public C19848f20(GaugeMetric gaugeMetric) {
        this.f61757a = gaugeMetric;
    }

    @Override // com.google.firebase.perf.metrics.validator.PerfMetricValidator
    public boolean isValidPerfMetric() {
        if (this.f61757a.hasSessionId() && (this.f61757a.getCpuMetricReadingsCount() > 0 || this.f61757a.getAndroidMemoryReadingsCount() > 0 || (this.f61757a.hasGaugeMetadata() && this.f61757a.getGaugeMetadata().hasMaxAppJavaHeapMemoryKb()))) {
            return true;
        }
        return false;
    }
}