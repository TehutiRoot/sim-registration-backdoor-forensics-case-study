package io.opencensus.metrics;

import io.opencensus.internal.Utils;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class MetricRegistry {

    /* renamed from: io.opencensus.metrics.MetricRegistry$b */
    /* loaded from: classes5.dex */
    public static final class C10582b extends MetricRegistry {
        public C10582b() {
        }

        @Override // io.opencensus.metrics.MetricRegistry
        public DerivedDoubleCumulative addDerivedDoubleCumulative(String str, MetricOptions metricOptions) {
            return DerivedDoubleCumulative.m30599a((String) Utils.checkNotNull(str, "name"), metricOptions.getDescription(), metricOptions.getUnit(), metricOptions.getLabelKeys());
        }

        @Override // io.opencensus.metrics.MetricRegistry
        public DerivedDoubleGauge addDerivedDoubleGauge(String str, MetricOptions metricOptions) {
            return DerivedDoubleGauge.m30597a((String) Utils.checkNotNull(str, "name"), metricOptions.getDescription(), metricOptions.getUnit(), metricOptions.getLabelKeys());
        }

        @Override // io.opencensus.metrics.MetricRegistry
        public DerivedLongCumulative addDerivedLongCumulative(String str, MetricOptions metricOptions) {
            return DerivedLongCumulative.m30595a((String) Utils.checkNotNull(str, "name"), metricOptions.getDescription(), metricOptions.getUnit(), metricOptions.getLabelKeys());
        }

        @Override // io.opencensus.metrics.MetricRegistry
        public DerivedLongGauge addDerivedLongGauge(String str, MetricOptions metricOptions) {
            return DerivedLongGauge.m30593a((String) Utils.checkNotNull(str, "name"), metricOptions.getDescription(), metricOptions.getUnit(), metricOptions.getLabelKeys());
        }

        @Override // io.opencensus.metrics.MetricRegistry
        public DoubleCumulative addDoubleCumulative(String str, MetricOptions metricOptions) {
            return DoubleCumulative.m30591a((String) Utils.checkNotNull(str, "name"), metricOptions.getDescription(), metricOptions.getUnit(), metricOptions.getLabelKeys());
        }

        @Override // io.opencensus.metrics.MetricRegistry
        public DoubleGauge addDoubleGauge(String str, MetricOptions metricOptions) {
            return DoubleGauge.m30586a((String) Utils.checkNotNull(str, "name"), metricOptions.getDescription(), metricOptions.getUnit(), metricOptions.getLabelKeys());
        }

        @Override // io.opencensus.metrics.MetricRegistry
        public LongCumulative addLongCumulative(String str, MetricOptions metricOptions) {
            return LongCumulative.m30581a((String) Utils.checkNotNull(str, "name"), metricOptions.getDescription(), metricOptions.getUnit(), metricOptions.getLabelKeys());
        }

        @Override // io.opencensus.metrics.MetricRegistry
        public LongGauge addLongGauge(String str, MetricOptions metricOptions) {
            return LongGauge.m30576a((String) Utils.checkNotNull(str, "name"), metricOptions.getDescription(), metricOptions.getUnit(), metricOptions.getLabelKeys());
        }
    }

    /* renamed from: a */
    public static MetricRegistry m30571a() {
        return new C10582b();
    }

    public abstract DerivedDoubleCumulative addDerivedDoubleCumulative(String str, MetricOptions metricOptions);

    public abstract DerivedDoubleGauge addDerivedDoubleGauge(String str, MetricOptions metricOptions);

    @Deprecated
    public DerivedDoubleGauge addDerivedDoubleGauge(String str, String str2, String str3, List<LabelKey> list) {
        return addDerivedDoubleGauge(str, MetricOptions.builder().setDescription(str2).setUnit(str3).setLabelKeys(list).build());
    }

    public abstract DerivedLongCumulative addDerivedLongCumulative(String str, MetricOptions metricOptions);

    public abstract DerivedLongGauge addDerivedLongGauge(String str, MetricOptions metricOptions);

    @Deprecated
    public DerivedLongGauge addDerivedLongGauge(String str, String str2, String str3, List<LabelKey> list) {
        return addDerivedLongGauge(str, MetricOptions.builder().setDescription(str2).setUnit(str3).setLabelKeys(list).build());
    }

    public abstract DoubleCumulative addDoubleCumulative(String str, MetricOptions metricOptions);

    public abstract DoubleGauge addDoubleGauge(String str, MetricOptions metricOptions);

    @Deprecated
    public DoubleGauge addDoubleGauge(String str, String str2, String str3, List<LabelKey> list) {
        return addDoubleGauge(str, MetricOptions.builder().setDescription(str2).setUnit(str3).setLabelKeys(list).build());
    }

    public abstract LongCumulative addLongCumulative(String str, MetricOptions metricOptions);

    public abstract LongGauge addLongGauge(String str, MetricOptions metricOptions);

    @Deprecated
    public LongGauge addLongGauge(String str, String str2, String str3, List<LabelKey> list) {
        return addLongGauge(str, MetricOptions.builder().setDescription(str2).setUnit(str3).setLabelKeys(list).build());
    }
}