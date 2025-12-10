package io.opencensus.metrics.export;

/* loaded from: classes5.dex */
public abstract class ExportComponent {

    /* renamed from: io.opencensus.metrics.export.ExportComponent$b */
    /* loaded from: classes5.dex */
    public static final class C10604b extends ExportComponent {

        /* renamed from: a */
        public static final MetricProducerManager f63545a = MetricProducerManager.m30220a();

        public C10604b() {
        }

        @Override // io.opencensus.metrics.export.ExportComponent
        public MetricProducerManager getMetricProducerManager() {
            return f63545a;
        }
    }

    public static ExportComponent newNoopExportComponent() {
        return new C10604b();
    }

    public abstract MetricProducerManager getMetricProducerManager();
}
