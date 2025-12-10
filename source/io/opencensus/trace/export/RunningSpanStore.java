package io.opencensus.trace.export;

import io.opencensus.internal.Utils;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes5.dex */
public abstract class RunningSpanStore {

    /* renamed from: a */
    public static final RunningSpanStore f63718a = new C10708b();

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class Filter {
        public static Filter create(String str, int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            Utils.checkArgument(z, "Negative maxSpansToReturn.");
            return new C10713a(str, i);
        }

        public abstract int getMaxSpansToReturn();

        public abstract String getSpanName();
    }

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class PerSpanNameSummary {
        public static PerSpanNameSummary create(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            Utils.checkArgument(z, "Negative numRunningSpans.");
            return new C10714b(i);
        }

        public abstract int getNumRunningSpans();
    }

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class Summary {
        public static Summary create(Map<String, PerSpanNameSummary> map) {
            return new C10715c(Collections.unmodifiableMap(new HashMap((Map) Utils.checkNotNull(map, "perSpanNameSummary"))));
        }

        public abstract Map<String, PerSpanNameSummary> getPerSpanNameSummary();
    }

    /* renamed from: io.opencensus.trace.export.RunningSpanStore$b */
    /* loaded from: classes5.dex */
    public static final class C10708b extends RunningSpanStore {

        /* renamed from: b */
        public static final Summary f63719b = Summary.create(Collections.emptyMap());

        public C10708b() {
        }

        @Override // io.opencensus.trace.export.RunningSpanStore
        public Collection getRunningSpans(Filter filter) {
            Utils.checkNotNull(filter, "filter");
            return Collections.emptyList();
        }

        @Override // io.opencensus.trace.export.RunningSpanStore
        public Summary getSummary() {
            return f63719b;
        }

        @Override // io.opencensus.trace.export.RunningSpanStore
        public void setMaxNumberOfSpans(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            Utils.checkArgument(z, "Invalid negative maxNumberOfElements");
        }
    }

    /* renamed from: a */
    public static RunningSpanStore m30136a() {
        return f63718a;
    }

    public abstract Collection<SpanData> getRunningSpans(Filter filter);

    public abstract Summary getSummary();

    public abstract void setMaxNumberOfSpans(int i);
}
