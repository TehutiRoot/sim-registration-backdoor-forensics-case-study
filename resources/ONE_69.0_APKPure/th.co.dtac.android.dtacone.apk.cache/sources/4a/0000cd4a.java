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
    public static final class C10675b extends TraceComponent {

        /* renamed from: a */
        public final ExportComponent f63749a;

        @Override // io.opencensus.trace.TraceComponent
        public Clock getClock() {
            return ZeroTimeClock.getInstance();
        }

        @Override // io.opencensus.trace.TraceComponent
        public ExportComponent getExportComponent() {
            return this.f63749a;
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
            return Tracer.m30491a();
        }

        public C10675b() {
            this.f63749a = ExportComponent.newNoopExportComponent();
        }
    }

    /* renamed from: a */
    public static TraceComponent m30493a() {
        return new C10675b();
    }

    public abstract Clock getClock();

    public abstract ExportComponent getExportComponent();

    public abstract PropagationComponent getPropagationComponent();

    public abstract TraceConfig getTraceConfig();

    public abstract Tracer getTracer();
}