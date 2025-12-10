package io.opencensus.metrics;

import io.opencensus.internal.Utils;
import java.util.List;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes5.dex */
public abstract class LongGauge {

    /* loaded from: classes5.dex */
    public static abstract class LongPoint {
        public abstract void add(long j);

        public abstract void set(long j);
    }

    /* renamed from: io.opencensus.metrics.LongGauge$a */
    /* loaded from: classes5.dex */
    public static final class C10592a extends LongGauge {

        /* renamed from: a */
        public final int f63530a;

        /* renamed from: io.opencensus.metrics.LongGauge$a$a */
        /* loaded from: classes5.dex */
        public static final class C10593a extends LongPoint {

            /* renamed from: a */
            public static final C10593a f63531a = new C10593a();

            @Override // io.opencensus.metrics.LongGauge.LongPoint
            public void add(long j) {
            }

            @Override // io.opencensus.metrics.LongGauge.LongPoint
            public void set(long j) {
            }
        }

        public C10592a(String str, String str2, String str3, List list) {
            this.f63530a = list.size();
        }

        /* renamed from: b */
        public static C10592a m30235b(String str, String str2, String str3, List list) {
            return new C10592a(str, str2, str3, list);
        }

        @Override // io.opencensus.metrics.LongGauge
        /* renamed from: c */
        public C10593a getDefaultTimeSeries() {
            return C10593a.f63531a;
        }

        @Override // io.opencensus.metrics.LongGauge
        public void clear() {
        }

        @Override // io.opencensus.metrics.LongGauge
        /* renamed from: d */
        public C10593a getOrCreateTimeSeries(List list) {
            boolean z;
            Utils.checkListElementNotNull((List) Utils.checkNotNull(list, "labelValues"), "labelValue");
            if (this.f63530a == list.size()) {
                z = true;
            } else {
                z = false;
            }
            Utils.checkArgument(z, "Label Keys and Label Values don't have same size.");
            return C10593a.f63531a;
        }

        @Override // io.opencensus.metrics.LongGauge
        public void removeTimeSeries(List list) {
            Utils.checkNotNull(list, "labelValues");
        }
    }

    /* renamed from: a */
    public static LongGauge m30236a(String str, String str2, String str3, List list) {
        return C10592a.m30235b(str, str2, str3, list);
    }

    public abstract void clear();

    public abstract LongPoint getDefaultTimeSeries();

    public abstract LongPoint getOrCreateTimeSeries(List<LabelValue> list);

    public abstract void removeTimeSeries(List<LabelValue> list);
}
