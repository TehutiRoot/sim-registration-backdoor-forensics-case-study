package io.opencensus.trace.export;

import java.util.Collection;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes5.dex */
public abstract class SpanExporter {

    /* renamed from: a */
    public static final SpanExporter f63785a = new C10699b();

    /* loaded from: classes5.dex */
    public static abstract class Handler {
        public abstract void export(Collection<SpanData> collection);
    }

    /* renamed from: io.opencensus.trace.export.SpanExporter$b */
    /* loaded from: classes5.dex */
    public static final class C10699b extends SpanExporter {
        public C10699b() {
        }

        @Override // io.opencensus.trace.export.SpanExporter
        public void registerHandler(String str, Handler handler) {
        }

        @Override // io.opencensus.trace.export.SpanExporter
        public void unregisterHandler(String str) {
        }
    }

    public static SpanExporter getNoopSpanExporter() {
        return f63785a;
    }

    public abstract void registerHandler(String str, Handler handler);

    public abstract void unregisterHandler(String str);
}