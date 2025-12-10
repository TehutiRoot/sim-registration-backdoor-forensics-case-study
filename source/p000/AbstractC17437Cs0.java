package p000;

import io.grpc.CallbackMetricInstrument;
import io.grpc.DoubleCounterMetricInstrument;
import io.grpc.DoubleHistogramMetricInstrument;
import io.grpc.LongCounterMetricInstrument;
import io.grpc.LongGaugeMetricInstrument;
import io.grpc.LongHistogramMetricInstrument;
import io.grpc.MetricSink;
import java.util.List;

/* renamed from: Cs0 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC17437Cs0 {
    /* renamed from: f */
    public static MetricSink.Registration m68725f(MetricSink metricSink, Runnable runnable, CallbackMetricInstrument... callbackMetricInstrumentArr) {
        return new MetricSink.Registration() { // from class: Bs0
            @Override // io.grpc.MetricRecorder.Registration, java.lang.AutoCloseable
            public final void close() {
                AbstractC17437Cs0.m68724g();
            }
        };
    }

    /* renamed from: g */
    public static /* synthetic */ void m68724g() {
    }

    /* renamed from: a */
    public static void m68730a(MetricSink metricSink, DoubleCounterMetricInstrument doubleCounterMetricInstrument, double d, List list, List list2) {
    }

    /* renamed from: b */
    public static void m68729b(MetricSink metricSink, LongCounterMetricInstrument longCounterMetricInstrument, long j, List list, List list2) {
    }

    /* renamed from: c */
    public static void m68728c(MetricSink metricSink, DoubleHistogramMetricInstrument doubleHistogramMetricInstrument, double d, List list, List list2) {
    }

    /* renamed from: d */
    public static void m68727d(MetricSink metricSink, LongGaugeMetricInstrument longGaugeMetricInstrument, long j, List list, List list2) {
    }

    /* renamed from: e */
    public static void m68726e(MetricSink metricSink, LongHistogramMetricInstrument longHistogramMetricInstrument, long j, List list, List list2) {
    }
}
