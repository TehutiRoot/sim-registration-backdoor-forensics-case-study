package p000;

import com.google.common.base.Preconditions;
import io.grpc.CallbackMetricInstrument;
import io.grpc.DoubleCounterMetricInstrument;
import io.grpc.DoubleHistogramMetricInstrument;
import io.grpc.LongCounterMetricInstrument;
import io.grpc.LongHistogramMetricInstrument;
import io.grpc.MetricRecorder;
import java.util.List;

/* renamed from: Fs0 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC17658Fs0 {
    /* renamed from: a */
    public static void m68384a(MetricRecorder metricRecorder, DoubleCounterMetricInstrument doubleCounterMetricInstrument, double d, List list, List list2) {
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
    public static void m68383b(MetricRecorder metricRecorder, LongCounterMetricInstrument longCounterMetricInstrument, long j, List list, List list2) {
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
    public static void m68382c(MetricRecorder metricRecorder, DoubleHistogramMetricInstrument doubleHistogramMetricInstrument, double d, List list, List list2) {
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
    public static void m68381d(MetricRecorder metricRecorder, LongHistogramMetricInstrument longHistogramMetricInstrument, long j, List list, List list2) {
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
    public static MetricRecorder.Registration m68380e(MetricRecorder metricRecorder, MetricRecorder.BatchCallback batchCallback, CallbackMetricInstrument... callbackMetricInstrumentArr) {
        return new MetricRecorder.Registration() { // from class: Es0
            @Override // io.grpc.MetricRecorder.Registration, java.lang.AutoCloseable
            public final void close() {
                AbstractC17658Fs0.m68379f();
            }
        };
    }

    /* renamed from: f */
    public static /* synthetic */ void m68379f() {
    }
}