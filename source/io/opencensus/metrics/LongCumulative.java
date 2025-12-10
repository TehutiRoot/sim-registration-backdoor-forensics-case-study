package io.opencensus.metrics;

import io.opencensus.internal.Utils;
import java.util.List;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes5.dex */
public abstract class LongCumulative {

    /* loaded from: classes5.dex */
    public static abstract class LongPoint {
        public abstract void add(long j);
    }

    /* renamed from: io.opencensus.metrics.LongCumulative$a */
    /* loaded from: classes5.dex */
    public static final class C10590a extends LongCumulative {

        /* renamed from: a */
        public final int f63528a;

        /* renamed from: io.opencensus.metrics.LongCumulative$a$a */
        /* loaded from: classes5.dex */
        public static final class C10591a extends LongPoint {

            /* renamed from: a */
            public static final C10591a f63529a = new C10591a();

            @Override // io.opencensus.metrics.LongCumulative.LongPoint
            public void add(long j) {
            }
        }

        public C10590a(String str, String str2, String str3, List list) {
            this.f63528a = list.size();
        }

        /* renamed from: b */
        public static C10590a m30240b(String str, String str2, String str3, List list) {
            return new C10590a(str, str2, str3, list);
        }

        @Override // io.opencensus.metrics.LongCumulative
        /* renamed from: c */
        public C10591a getDefaultTimeSeries() {
            return C10591a.f63529a;
        }

        @Override // io.opencensus.metrics.LongCumulative
        public void clear() {
        }

        @Override // io.opencensus.metrics.LongCumulative
        /* renamed from: d */
        public C10591a getOrCreateTimeSeries(List list) {
            boolean z;
            Utils.checkListElementNotNull((List) Utils.checkNotNull(list, "labelValues"), "labelValue");
            if (this.f63528a == list.size()) {
                z = true;
            } else {
                z = false;
            }
            Utils.checkArgument(z, "Label Keys and Label Values don't have same size.");
            return C10591a.f63529a;
        }

        @Override // io.opencensus.metrics.LongCumulative
        public void removeTimeSeries(List list) {
            Utils.checkNotNull(list, "labelValues");
        }
    }

    /* renamed from: a */
    public static LongCumulative m30241a(String str, String str2, String str3, List list) {
        return C10590a.m30240b(str, str2, str3, list);
    }

    public abstract void clear();

    public abstract LongPoint getDefaultTimeSeries();

    public abstract LongPoint getOrCreateTimeSeries(List<LabelValue> list);

    public abstract void removeTimeSeries(List<LabelValue> list);
}
