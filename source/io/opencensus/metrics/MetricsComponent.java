package io.opencensus.metrics;

import io.opencensus.metrics.export.ExportComponent;

/* loaded from: classes5.dex */
public abstract class MetricsComponent {

    /* renamed from: io.opencensus.metrics.MetricsComponent$b */
    /* loaded from: classes5.dex */
    public static final class C10597b extends MetricsComponent {

        /* renamed from: a */
        public static final ExportComponent f63534a = ExportComponent.newNoopExportComponent();

        /* renamed from: b */
        public static final MetricRegistry f63535b = MetricRegistry.m30231a();

        public C10597b() {
        }

        @Override // io.opencensus.metrics.MetricsComponent
        public ExportComponent getExportComponent() {
            return f63534a;
        }

        @Override // io.opencensus.metrics.MetricsComponent
        public MetricRegistry getMetricRegistry() {
            return f63535b;
        }
    }

    /* renamed from: a */
    public static MetricsComponent m30229a() {
        return new C10597b();
    }

    public abstract ExportComponent getExportComponent();

    public abstract MetricRegistry getMetricRegistry();
}
