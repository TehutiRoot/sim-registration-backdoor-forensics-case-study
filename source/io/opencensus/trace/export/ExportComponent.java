package io.opencensus.trace.export;

/* loaded from: classes5.dex */
public abstract class ExportComponent {

    /* renamed from: io.opencensus.trace.export.ExportComponent$b */
    /* loaded from: classes5.dex */
    public static final class C10706b extends ExportComponent {

        /* renamed from: a */
        public final SampledSpanStore f63717a;

        public C10706b() {
            this.f63717a = SampledSpanStore.m30135a();
        }

        @Override // io.opencensus.trace.export.ExportComponent
        public RunningSpanStore getRunningSpanStore() {
            return RunningSpanStore.m30136a();
        }

        @Override // io.opencensus.trace.export.ExportComponent
        public SampledSpanStore getSampledSpanStore() {
            return this.f63717a;
        }

        @Override // io.opencensus.trace.export.ExportComponent
        public SpanExporter getSpanExporter() {
            return SpanExporter.getNoopSpanExporter();
        }
    }

    public static ExportComponent newNoopExportComponent() {
        return new C10706b();
    }

    public abstract RunningSpanStore getRunningSpanStore();

    public abstract SampledSpanStore getSampledSpanStore();

    public abstract SpanExporter getSpanExporter();

    public void shutdown() {
    }
}
