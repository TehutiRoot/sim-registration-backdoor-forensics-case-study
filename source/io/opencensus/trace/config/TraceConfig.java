package io.opencensus.trace.config;

/* loaded from: classes5.dex */
public abstract class TraceConfig {

    /* renamed from: a */
    public static final C10697b f63700a = new C10697b();

    /* renamed from: io.opencensus.trace.config.TraceConfig$b */
    /* loaded from: classes5.dex */
    public static final class C10697b extends TraceConfig {
        public C10697b() {
        }

        @Override // io.opencensus.trace.config.TraceConfig
        public TraceParams getActiveTraceParams() {
            return TraceParams.DEFAULT;
        }

        @Override // io.opencensus.trace.config.TraceConfig
        public void updateActiveTraceParams(TraceParams traceParams) {
        }
    }

    public static TraceConfig getNoopTraceConfig() {
        return f63700a;
    }

    public abstract TraceParams getActiveTraceParams();

    public abstract void updateActiveTraceParams(TraceParams traceParams);
}
