package io.grpc;

import io.grpc.MetricRecorder;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Internal
/* loaded from: classes5.dex */
public interface MetricSink {

    /* loaded from: classes5.dex */
    public interface Registration extends MetricRecorder.Registration {
    }

    void addDoubleCounter(DoubleCounterMetricInstrument doubleCounterMetricInstrument, double d, List<String> list, List<String> list2);

    void addLongCounter(LongCounterMetricInstrument longCounterMetricInstrument, long j, List<String> list, List<String> list2);

    Map<String, Boolean> getEnabledMetrics();

    int getMeasuresSize();

    Set<String> getOptionalLabels();

    void recordDoubleHistogram(DoubleHistogramMetricInstrument doubleHistogramMetricInstrument, double d, List<String> list, List<String> list2);

    void recordLongGauge(LongGaugeMetricInstrument longGaugeMetricInstrument, long j, List<String> list, List<String> list2);

    void recordLongHistogram(LongHistogramMetricInstrument longHistogramMetricInstrument, long j, List<String> list, List<String> list2);

    Registration registerBatchCallback(Runnable runnable, CallbackMetricInstrument... callbackMetricInstrumentArr);

    void updateMeasures(List<MetricInstrument> list);
}
