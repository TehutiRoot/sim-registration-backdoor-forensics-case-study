package io.opencensus.trace.propagation;

import io.opencensus.internal.Utils;
import io.opencensus.trace.SpanContext;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public abstract class TextFormat {

    /* renamed from: a */
    public static final C10739b f63785a = new C10739b();

    /* loaded from: classes5.dex */
    public static abstract class Getter<C> {
        @Nullable
        public abstract String get(C c, String str);
    }

    /* loaded from: classes5.dex */
    public static abstract class Setter<C> {
        public abstract void put(C c, String str, String str2);
    }

    /* renamed from: io.opencensus.trace.propagation.TextFormat$b */
    /* loaded from: classes5.dex */
    public static final class C10739b extends TextFormat {
        @Override // io.opencensus.trace.propagation.TextFormat
        public SpanContext extract(Object obj, Getter getter) {
            Utils.checkNotNull(obj, "carrier");
            Utils.checkNotNull(getter, "getter");
            return SpanContext.INVALID;
        }

        @Override // io.opencensus.trace.propagation.TextFormat
        public List fields() {
            return Collections.emptyList();
        }

        @Override // io.opencensus.trace.propagation.TextFormat
        public void inject(SpanContext spanContext, Object obj, Setter setter) {
            Utils.checkNotNull(spanContext, "spanContext");
            Utils.checkNotNull(obj, "carrier");
            Utils.checkNotNull(setter, "setter");
        }

        public C10739b() {
        }
    }

    /* renamed from: a */
    public static TextFormat m30129a() {
        return f63785a;
    }

    public abstract <C> SpanContext extract(C c, Getter<C> getter) throws SpanContextParseException;

    public abstract List<String> fields();

    public abstract <C> void inject(SpanContext spanContext, C c, Setter<C> setter);
}
