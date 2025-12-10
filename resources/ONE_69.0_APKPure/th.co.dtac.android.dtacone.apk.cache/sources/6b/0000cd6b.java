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
    public static final RunningSpanStore f63781a = new C10695b();

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
            return new C10700a(str, i);
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
            return new C10701b(i);
        }

        public abstract int getNumRunningSpans();
    }

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class Summary {
        public static Summary create(Map<String, PerSpanNameSummary> map) {
            return new C10702c(Collections.unmodifiableMap(new HashMap((Map) Utils.checkNotNull(map, "perSpanNameSummary"))));
        }

        public abstract Map<String, PerSpanNameSummary> getPerSpanNameSummary();
    }

    /* renamed from: io.opencensus.trace.export.RunningSpanStore$b */
    /* loaded from: classes5.dex */
    public static final class C10695b extends RunningSpanStore {

        /* renamed from: b */
        public static final Summary f63782b = Summary.create(Collections.emptyMap());

        public C10695b() {
        }

        @Override // io.opencensus.trace.export.RunningSpanStore
        public Collection getRunningSpans(Filter filter) {
            Utils.checkNotNull(filter, "filter");
            return Collections.emptyList();
        }

        @Override // io.opencensus.trace.export.RunningSpanStore
        public Summary getSummary() {
            return f63782b;
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
    public static RunningSpanStore m30476a() {
        return f63781a;
    }

    public abstract Collection<SpanData> getRunningSpans(Filter filter);

    public abstract Summary getSummary();

    public abstract void setMaxNumberOfSpans(int i);
}