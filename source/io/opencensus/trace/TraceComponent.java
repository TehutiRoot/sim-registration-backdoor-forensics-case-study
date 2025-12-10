package io.opencensus.trace;

import io.opencensus.common.Clock;
import io.opencensus.internal.ZeroTimeClock;
import io.opencensus.trace.config.TraceConfig;
import io.opencensus.trace.export.ExportComponent;
import io.opencensus.trace.propagation.PropagationComponent;

/* loaded from: classes5.dex */
public abstract class TraceComponent {

    /* renamed from: io.opencensus.trace.TraceComponent$b */
    /* loaded from: classes5.dex */
    public static final class C10688b extends TraceComponent {

        /* renamed from: a */
        public final ExportComponent f63686a;

        @Override // io.opencensus.trace.TraceComponent
        public Clock getClock() {
            return ZeroTimeClock.getInstance();
        }

        @Override // io.opencensus.trace.TraceComponent
        public ExportComponent getExportComponent() {
            return this.f63686a;
        }

        @Override // io.opencensus.trace.TraceComponent
        public PropagationComponent getPropagationComponent() {
            return PropagationComponent.getNoopPropagationComponent();
        }

        @Override // io.opencensus.trace.TraceComponent
        public TraceConfig getTraceConfig() {
            return TraceConfig.getNoopTraceConfig();
        }

        @Override // io.opencensus.trace.TraceComponent
        public Tracer getTracer() {
            return Tracer.m30151a();
        }

        public C10688b() {
            this.f63686a = ExportComponent.newNoopExportComponent();
        }
    }

    /* renamed from: a */
    public static TraceComponent m30153a() {
        return new C10688b();
    }

    public abstract Clock getClock();

    public abstract ExportComponent getExportComponent();

    public abstract PropagationComponent getPropagationComponent();

    public abstract TraceConfig getTraceConfig();

    public abstract Tracer getTracer();
}
