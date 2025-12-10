package io.grpc;

import java.util.List;

@Internal
/* loaded from: classes5.dex */
public interface MetricRecorder {

    /* loaded from: classes5.dex */
    public interface BatchCallback {
        void accept(BatchRecorder batchRecorder);
    }

    /* loaded from: classes5.dex */
    public interface BatchRecorder {
        void recordLongGauge(LongGaugeMetricInstrument longGaugeMetricInstrument, long j, List<String> list, List<String> list2);
    }

    /* loaded from: classes5.dex */
    public interface Registration extends AutoCloseable {
        @Override // java.lang.AutoCloseable
        void close();
    }

    void addDoubleCounter(DoubleCounterMetricInstrument doubleCounterMetricInstrument, double d, List<String> list, List<String> list2);

    void addLongCounter(LongCounterMetricInstrument longCounterMetricInstrument, long j, List<String> list, List<String> list2);

    void recordDoubleHistogram(DoubleHistogramMetricInstrument doubleHistogramMetricInstrument, double d, List<String> list, List<String> list2);

    void recordLongHistogram(LongHistogramMetricInstrument longHistogramMetricInstrument, long j, List<String> list, List<String> list2);

    Registration registerBatchCallback(BatchCallback batchCallback, CallbackMetricInstrument... callbackMetricInstrumentArr);
}
