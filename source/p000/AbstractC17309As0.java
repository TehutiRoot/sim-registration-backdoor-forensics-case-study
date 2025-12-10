package p000;

import com.google.common.base.Preconditions;
import io.grpc.LongGaugeMetricInstrument;
import io.grpc.MetricRecorder;
import java.util.List;

/* renamed from: As0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC17309As0 {
    /* renamed from: a */
    public static void m69043a(MetricRecorder.BatchRecorder batchRecorder, LongGaugeMetricInstrument longGaugeMetricInstrument, long j, List list, List list2) {
        boolean z;
        boolean z2 = false;
        if (list != null && list.size() == longGaugeMetricInstrument.getRequiredLabelKeys().size()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Incorrect number of required labels provided. Expected: %s", longGaugeMetricInstrument.getRequiredLabelKeys().size());
        if (list2 != null && list2.size() == longGaugeMetricInstrument.getOptionalLabelKeys().size()) {
            z2 = true;
        }
        Preconditions.checkArgument(z2, "Incorrect number of optional labels provided. Expected: %s", longGaugeMetricInstrument.getOptionalLabelKeys().size());
    }
}
