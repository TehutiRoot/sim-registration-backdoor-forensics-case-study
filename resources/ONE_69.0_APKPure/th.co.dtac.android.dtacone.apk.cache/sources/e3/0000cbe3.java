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
    public static MetricInstrumentRegistry f63394e;

    /* renamed from: a */
    public final Object f63395a = new Object();

    /* renamed from: b */
    public final Set f63396b = new HashSet();

    /* renamed from: c */
    public MetricInstrument[] f63397c = new MetricInstrument[5];

    /* renamed from: d */
    public int f63398d;

    public static synchronized MetricInstrumentRegistry getDefaultRegistry() {
        MetricInstrumentRegistry metricInstrumentRegistry;
        synchronized (MetricInstrumentRegistry.class) {
            try {
                if (f63394e == null) {
                    f63394e = new MetricInstrumentRegistry();
                }
                metricInstrumentRegistry = f63394e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return metricInstrumentRegistry;
    }

    /* renamed from: a */
    public final void m30695a() {
        MetricInstrument[] metricInstrumentArr = this.f63397c;
        this.f63397c = (MetricInstrument[]) Arrays.copyOf(metricInstrumentArr, metricInstrumentArr.length + 5);
    }

    public List<MetricInstrument> getMetricInstruments() {
        List<MetricInstrument> unmodifiableList;
        synchronized (this.f63395a) {
            unmodifiableList = Collections.unmodifiableList(Arrays.asList((MetricInstrument[]) Arrays.copyOfRange(this.f63397c, 0, this.f63398d)));
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
        synchronized (this.f63395a) {
            try {
                if (!this.f63396b.contains(str)) {
                    int i = this.f63398d;
                    if (i + 1 == this.f63397c.length) {
                        m30695a();
                    }
                    doubleCounterMetricInstrument = new DoubleCounterMetricInstrument(i, str, str2, str3, list, list2, z);
                    this.f63397c[i] = doubleCounterMetricInstrument;
                    this.f63396b.add(str);
                    this.f63398d++;
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
        synchronized (this.f63395a) {
            try {
                if (!this.f63396b.contains(str)) {
                    int i = this.f63398d;
                    if (i + 1 == this.f63397c.length) {
                        m30695a();
                    }
                    doubleHistogramMetricInstrument = new DoubleHistogramMetricInstrument(i, str, str2, str3, list, list2, list3, z);
                    this.f63397c[i] = doubleHistogramMetricInstrument;
                    this.f63396b.add(str);
                    this.f63398d++;
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
        synchronized (this.f63395a) {
            try {
                if (!this.f63396b.contains(str)) {
                    int i = this.f63398d;
                    if (i + 1 == this.f63397c.length) {
                        m30695a();
                    }
                    longCounterMetricInstrument = new LongCounterMetricInstrument(i, str, str2, str3, list, list2, z);
                    this.f63397c[i] = longCounterMetricInstrument;
                    this.f63396b.add(str);
                    this.f63398d++;
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
        synchronized (this.f63395a) {
            try {
                if (!this.f63396b.contains(str)) {
                    int i = this.f63398d;
                    if (i + 1 == this.f63397c.length) {
                        m30695a();
                    }
                    longGaugeMetricInstrument = new LongGaugeMetricInstrument(i, str, str2, str3, list, list2, z);
                    this.f63397c[i] = longGaugeMetricInstrument;
                    this.f63396b.add(str);
                    this.f63398d++;
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
        synchronized (this.f63395a) {
            try {
                if (!this.f63396b.contains(str)) {
                    int i = this.f63398d;
                    if (i + 1 == this.f63397c.length) {
                        m30695a();
                    }
                    longHistogramMetricInstrument = new LongHistogramMetricInstrument(i, str, str2, str3, list, list2, list3, z);
                    this.f63397c[i] = longHistogramMetricInstrument;
                    this.f63396b.add(str);
                    this.f63398d++;
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