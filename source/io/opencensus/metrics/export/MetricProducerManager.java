package io.opencensus.metrics.export;

import io.opencensus.internal.Utils;
import java.util.Collections;
import java.util.Set;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes5.dex */
public abstract class MetricProducerManager {

    /* renamed from: io.opencensus.metrics.export.MetricProducerManager$b */
    /* loaded from: classes5.dex */
    public static final class C10607b extends MetricProducerManager {
        public C10607b() {
        }

        @Override // io.opencensus.metrics.export.MetricProducerManager
        public void add(MetricProducer metricProducer) {
            Utils.checkNotNull(metricProducer, "metricProducer");
        }

        @Override // io.opencensus.metrics.export.MetricProducerManager
        public Set getAllMetricProducer() {
            return Collections.emptySet();
        }

        @Override // io.opencensus.metrics.export.MetricProducerManager
        public void remove(MetricProducer metricProducer) {
            Utils.checkNotNull(metricProducer, "metricProducer");
        }
    }

    /* renamed from: a */
    public static MetricProducerManager m30220a() {
        return new C10607b();
    }

    public abstract void add(MetricProducer metricProducer);

    public abstract Set<MetricProducer> getAllMetricProducer();

    public abstract void remove(MetricProducer metricProducer);
}
