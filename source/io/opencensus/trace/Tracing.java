package io.opencensus.trace;

import io.opencensus.common.Clock;
import io.opencensus.internal.Provider;
import io.opencensus.trace.config.TraceConfig;
import io.opencensus.trace.export.ExportComponent;
import io.opencensus.trace.propagation.PropagationComponent;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class Tracing {

    /* renamed from: a */
    public static final Logger f63695a = Logger.getLogger(Tracing.class.getName());

    /* renamed from: b */
    public static final TraceComponent f63696b = m30143a(TraceComponent.class.getClassLoader());

    /* renamed from: a */
    public static TraceComponent m30143a(ClassLoader classLoader) {
        try {
            return (TraceComponent) Provider.createInstance(Class.forName("io.opentelemetry.opencensusshim.OpenTelemetryTraceComponentImpl", true, classLoader), TraceComponent.class);
        } catch (ClassNotFoundException e) {
            f63695a.log(Level.FINE, "Couldn't load full implementation for OpenTelemetry TraceComponent, now trying to load original implementation.", (Throwable) e);
            try {
                return (TraceComponent) Provider.createInstance(Class.forName("io.opencensus.impl.trace.TraceComponentImpl", true, classLoader), TraceComponent.class);
            } catch (ClassNotFoundException e2) {
                f63695a.log(Level.FINE, "Couldn't load full implementation for TraceComponent, now trying to load lite implementation.", (Throwable) e2);
                try {
                    return (TraceComponent) Provider.createInstance(Class.forName("io.opencensus.impllite.trace.TraceComponentImplLite", true, classLoader), TraceComponent.class);
                } catch (ClassNotFoundException e3) {
                    f63695a.log(Level.FINE, "Couldn't load lite implementation for TraceComponent, now using default implementation for TraceComponent.", (Throwable) e3);
                    return TraceComponent.m30153a();
                }
            }
        }
    }

    public static Clock getClock() {
        return f63696b.getClock();
    }

    public static ExportComponent getExportComponent() {
        return f63696b.getExportComponent();
    }

    public static PropagationComponent getPropagationComponent() {
        return f63696b.getPropagationComponent();
    }

    public static TraceConfig getTraceConfig() {
        return f63696b.getTraceConfig();
    }

    public static Tracer getTracer() {
        return f63696b.getTracer();
    }
}
