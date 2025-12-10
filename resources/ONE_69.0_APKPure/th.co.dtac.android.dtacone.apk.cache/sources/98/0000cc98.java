package io.opencensus.metrics.export;

/* loaded from: classes5.dex */
public abstract class ExportComponent {

    /* renamed from: io.opencensus.metrics.export.ExportComponent$b */
    /* loaded from: classes5.dex */
    public static final class C10591b extends ExportComponent {

        /* renamed from: a */
        public static final MetricProducerManager f63608a = MetricProducerManager.m30560a();

        public C10591b() {
        }

        @Override // io.opencensus.metrics.export.ExportComponent
        public MetricProducerManager getMetricProducerManager() {
            return f63608a;
        }
    }

    public static ExportComponent newNoopExportComponent() {
        return new C10591b();
    }

    public abstract MetricProducerManager getMetricProducerManager();
}