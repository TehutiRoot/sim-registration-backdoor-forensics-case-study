package p000;

import com.google.common.base.Preconditions;
import io.grpc.CallbackMetricInstrument;
import io.grpc.DoubleCounterMetricInstrument;
import io.grpc.DoubleHistogramMetricInstrument;
import io.grpc.LongCounterMetricInstrument;
import io.grpc.LongHistogramMetricInstrument;
import io.grpc.MetricRecorder;
import java.util.List;

/* renamed from: zs0 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC23379zs0 {
    /* renamed from: a */
    public static void m28a(MetricRecorder metricRecorder, DoubleCounterMetricInstrument doubleCounterMetricInstrument, double d, List list, List list2) {
        boolean z;
        boolean z2 = false;
        if (list != null && list.size() == doubleCounterMetricInstrument.getRequiredLabelKeys().size()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Incorrect number of required labels provided. Expected: %s", doubleCounterMetricInstrument.getRequiredLabelKeys().size());
        if (list2 != null && list2.size() == doubleCounterMetricInstrument.getOptionalLabelKeys().size()) {
            z2 = true;
        }
        Preconditions.checkArgument(z2, "Incorrect number of optional labels provided. Expected: %s", doubleCounterMetricInstrument.getOptionalLabelKeys().size());
    }

    /* renamed from: b */
    public static void m27b(MetricRecorder metricRecorder, LongCounterMetricInstrument longCounterMetricInstrument, long j, List list, List list2) {
        boolean z;
        boolean z2 = false;
        if (list != null && list.size() == longCounterMetricInstrument.getRequiredLabelKeys().size()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Incorrect number of required labels provided. Expected: %s", longCounterMetricInstrument.getRequiredLabelKeys().size());
        if (list2 != null && list2.size() == longCounterMetricInstrument.getOptionalLabelKeys().size()) {
            z2 = true;
        }
        Preconditions.checkArgument(z2, "Incorrect number of optional labels provided. Expected: %s", longCounterMetricInstrument.getOptionalLabelKeys().size());
    }

    /* renamed from: c */
    public static void m26c(MetricRecorder metricRecorder, DoubleHistogramMetricInstrument doubleHistogramMetricInstrument, double d, List list, List list2) {
        boolean z;
        boolean z2 = false;
        if (list != null && list.size() == doubleHistogramMetricInstrument.getRequiredLabelKeys().size()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Incorrect number of required labels provided. Expected: %s", doubleHistogramMetricInstrument.getRequiredLabelKeys().size());
        if (list2 != null && list2.size() == doubleHistogramMetricInstrument.getOptionalLabelKeys().size()) {
            z2 = true;
        }
        Preconditions.checkArgument(z2, "Incorrect number of optional labels provided. Expected: %s", doubleHistogramMetricInstrument.getOptionalLabelKeys().size());
    }

    /* renamed from: d */
    public static void m25d(MetricRecorder metricRecorder, LongHistogramMetricInstrument longHistogramMetricInstrument, long j, List list, List list2) {
        boolean z;
        boolean z2 = false;
        if (list != null && list.size() == longHistogramMetricInstrument.getRequiredLabelKeys().size()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Incorrect number of required labels provided. Expected: %s", longHistogramMetricInstrument.getRequiredLabelKeys().size());
        if (list2 != null && list2.size() == longHistogramMetricInstrument.getOptionalLabelKeys().size()) {
            z2 = true;
        }
        Preconditions.checkArgument(z2, "Incorrect number of optional labels provided. Expected: %s", longHistogramMetricInstrument.getOptionalLabelKeys().size());
    }

    /* renamed from: e */
    public static MetricRecorder.Registration m24e(MetricRecorder metricRecorder, MetricRecorder.BatchCallback batchCallback, CallbackMetricInstrument... callbackMetricInstrumentArr) {
        return new MetricRecorder.Registration() { // from class: ys0
            @Override // io.grpc.MetricRecorder.Registration, java.lang.AutoCloseable
            public final void close() {
                AbstractC23379zs0.m23f();
            }
        };
    }

    /* renamed from: f */
    public static /* synthetic */ void m23f() {
    }
}
