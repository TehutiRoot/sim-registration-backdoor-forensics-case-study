package p000;

import com.google.firebase.perf.metrics.validator.PerfMetricValidator;
import com.google.firebase.perf.p016v1.GaugeMetric;

/* renamed from: b20  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19109b20 extends PerfMetricValidator {

    /* renamed from: a */
    public final GaugeMetric f38922a;

    public C19109b20(GaugeMetric gaugeMetric) {
        this.f38922a = gaugeMetric;
    }

    @Override // com.google.firebase.perf.metrics.validator.PerfMetricValidator
    public boolean isValidPerfMetric() {
        if (this.f38922a.hasSessionId() && (this.f38922a.getCpuMetricReadingsCount() > 0 || this.f38922a.getAndroidMemoryReadingsCount() > 0 || (this.f38922a.hasGaugeMetadata() && this.f38922a.getGaugeMetadata().hasMaxAppJavaHeapMemoryKb()))) {
            return true;
        }
        return false;
    }
}
