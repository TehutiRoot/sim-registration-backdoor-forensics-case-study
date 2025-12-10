package io.opencensus.metrics;

import io.opencensus.internal.Provider;
import io.opencensus.metrics.export.ExportComponent;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class Metrics {

    /* renamed from: a */
    public static final Logger f63532a = Logger.getLogger(Metrics.class.getName());

    /* renamed from: b */
    public static final MetricsComponent f63533b = m30230a(MetricsComponent.class.getClassLoader());

    /* renamed from: a */
    public static MetricsComponent m30230a(ClassLoader classLoader) {
        try {
            return (MetricsComponent) Provider.createInstance(Class.forName("io.opencensus.impl.metrics.MetricsComponentImpl", true, classLoader), MetricsComponent.class);
        } catch (ClassNotFoundException e) {
            f63532a.log(Level.FINE, "Couldn't load full implementation for MetricsComponent, now trying to load lite implementation.", (Throwable) e);
            try {
                return (MetricsComponent) Provider.createInstance(Class.forName("io.opencensus.impllite.metrics.MetricsComponentImplLite", true, classLoader), MetricsComponent.class);
            } catch (ClassNotFoundException e2) {
                f63532a.log(Level.FINE, "Couldn't load lite implementation for MetricsComponent, now using default implementation for MetricsComponent.", (Throwable) e2);
                return MetricsComponent.m30229a();
            }
        }
    }

    public static ExportComponent getExportComponent() {
        return f63533b.getExportComponent();
    }

    public static MetricRegistry getMetricRegistry() {
        return f63533b.getMetricRegistry();
    }
}
