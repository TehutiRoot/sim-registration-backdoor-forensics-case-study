package io.grpc;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Internal
/* loaded from: classes5.dex */
public final class MetricInstrumentRegistry {

    /* renamed from: e */
    public static MetricInstrumentRegistry f63331e;

    /* renamed from: a */
    public final Object f63332a = new Object();

    /* renamed from: b */
    public final Set f63333b = new HashSet();

    /* renamed from: c */
    public MetricInstrument[] f63334c = new MetricInstrument[5];

    /* renamed from: d */
    public int f63335d;

    public static synchronized MetricInstrumentRegistry getDefaultRegistry() {
        MetricInstrumentRegistry metricInstrumentRegistry;
        synchronized (MetricInstrumentRegistry.class) {
            try {
                if (f63331e == null) {
                    f63331e = new MetricInstrumentRegistry();
                }
                metricInstrumentRegistry = f63331e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return metricInstrumentRegistry;
    }

    /* renamed from: a */
    public final void m30355a() {
        MetricInstrument[] metricInstrumentArr = this.f63334c;
        this.f63334c = (MetricInstrument[]) Arrays.copyOf(metricInstrumentArr, metricInstrumentArr.length + 5);
    }

    public List<MetricInstrument> getMetricInstruments() {
        List<MetricInstrument> unmodifiableList;
        synchronized (this.f63332a) {
            unmodifiableList = Collections.unmodifiableList(Arrays.asList((MetricInstrument[]) Arrays.copyOfRange(this.f63334c, 0, this.f63335d)));
        }
        return unmodifiableList;
    }

    public DoubleCounterMetricInstrument registerDoubleCounter(String str, String str2, String str3, List<String> list, List<String> list2, boolean z) {
        DoubleCounterMetricInstrument doubleCounterMetricInstrument;
        Preconditions.checkArgument(!Strings.isNullOrEmpty(str), "missing metric name");
        Preconditions.checkNotNull(str2, "description");
        Preconditions.checkNotNull(str3, "unit");
        Preconditions.checkNotNull(list, "requiredLabelKeys");
        Preconditions.checkNotNull(list2, "optionalLabelKeys");
        synchronized (this.f63332a) {
            try {
                if (!this.f63333b.contains(str)) {
                    int i = this.f63335d;
                    if (i + 1 == this.f63334c.length) {
                        m30355a();
                    }
                    doubleCounterMetricInstrument = new DoubleCounterMetricInstrument(i, str, str2, str3, list, list2, z);
                    this.f63334c[i] = doubleCounterMetricInstrument;
                    this.f63333b.add(str);
                    this.f63335d++;
                } else {
                    throw new IllegalStateException("Metric with name " + str + " already exists");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return doubleCounterMetricInstrument;
    }

    public DoubleHistogramMetricInstrument registerDoubleHistogram(String str, String str2, String str3, List<Double> list, List<String> list2, List<String> list3, boolean z) {
        DoubleHistogramMetricInstrument doubleHistogramMetricInstrument;
        Preconditions.checkArgument(!Strings.isNullOrEmpty(str), "missing metric name");
        Preconditions.checkNotNull(str2, "description");
        Preconditions.checkNotNull(str3, "unit");
        Preconditions.checkNotNull(list, "bucketBoundaries");
        Preconditions.checkNotNull(list2, "requiredLabelKeys");
        Preconditions.checkNotNull(list3, "optionalLabelKeys");
        synchronized (this.f63332a) {
            try {
                if (!this.f63333b.contains(str)) {
                    int i = this.f63335d;
                    if (i + 1 == this.f63334c.length) {
                        m30355a();
                    }
                    doubleHistogramMetricInstrument = new DoubleHistogramMetricInstrument(i, str, str2, str3, list, list2, list3, z);
                    this.f63334c[i] = doubleHistogramMetricInstrument;
                    this.f63333b.add(str);
                    this.f63335d++;
                } else {
                    throw new IllegalStateException("Metric with name " + str + " already exists");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return doubleHistogramMetricInstrument;
    }

    public LongCounterMetricInstrument registerLongCounter(String str, String str2, String str3, List<String> list, List<String> list2, boolean z) {
        LongCounterMetricInstrument longCounterMetricInstrument;
        Preconditions.checkArgument(!Strings.isNullOrEmpty(str), "missing metric name");
        Preconditions.checkNotNull(str2, "description");
        Preconditions.checkNotNull(str3, "unit");
        Preconditions.checkNotNull(list, "requiredLabelKeys");
        Preconditions.checkNotNull(list2, "optionalLabelKeys");
        synchronized (this.f63332a) {
            try {
                if (!this.f63333b.contains(str)) {
                    int i = this.f63335d;
                    if (i + 1 == this.f63334c.length) {
                        m30355a();
                    }
                    longCounterMetricInstrument = new LongCounterMetricInstrument(i, str, str2, str3, list, list2, z);
                    this.f63334c[i] = longCounterMetricInstrument;
                    this.f63333b.add(str);
                    this.f63335d++;
                } else {
                    throw new IllegalStateException("Metric with name " + str + " already exists");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return longCounterMetricInstrument;
    }

    public LongGaugeMetricInstrument registerLongGauge(String str, String str2, String str3, List<String> list, List<String> list2, boolean z) {
        LongGaugeMetricInstrument longGaugeMetricInstrument;
        Preconditions.checkArgument(!Strings.isNullOrEmpty(str), "missing metric name");
        Preconditions.checkNotNull(str2, "description");
        Preconditions.checkNotNull(str3, "unit");
        Preconditions.checkNotNull(list, "requiredLabelKeys");
        Preconditions.checkNotNull(list2, "optionalLabelKeys");
        synchronized (this.f63332a) {
            try {
                if (!this.f63333b.contains(str)) {
                    int i = this.f63335d;
                    if (i + 1 == this.f63334c.length) {
                        m30355a();
                    }
                    longGaugeMetricInstrument = new LongGaugeMetricInstrument(i, str, str2, str3, list, list2, z);
                    this.f63334c[i] = longGaugeMetricInstrument;
                    this.f63333b.add(str);
                    this.f63335d++;
                } else {
                    throw new IllegalStateException("Metric with name " + str + " already exists");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return longGaugeMetricInstrument;
    }

    public LongHistogramMetricInstrument registerLongHistogram(String str, String str2, String str3, List<Long> list, List<String> list2, List<String> list3, boolean z) {
        LongHistogramMetricInstrument longHistogramMetricInstrument;
        Preconditions.checkArgument(!Strings.isNullOrEmpty(str), "missing metric name");
        Preconditions.checkNotNull(str2, "description");
        Preconditions.checkNotNull(str3, "unit");
        Preconditions.checkNotNull(list, "bucketBoundaries");
        Preconditions.checkNotNull(list2, "requiredLabelKeys");
        Preconditions.checkNotNull(list3, "optionalLabelKeys");
        synchronized (this.f63332a) {
            try {
                if (!this.f63333b.contains(str)) {
                    int i = this.f63335d;
                    if (i + 1 == this.f63334c.length) {
                        m30355a();
                    }
                    longHistogramMetricInstrument = new LongHistogramMetricInstrument(i, str, str2, str3, list, list2, list3, z);
                    this.f63334c[i] = longHistogramMetricInstrument;
                    this.f63333b.add(str);
                    this.f63335d++;
                } else {
                    throw new IllegalStateException("Metric with name " + str + " already exists");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return longHistogramMetricInstrument;
    }
}
