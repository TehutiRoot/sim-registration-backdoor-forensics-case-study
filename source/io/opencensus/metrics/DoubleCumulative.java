package io.opencensus.metrics;

import io.opencensus.internal.Utils;
import java.util.List;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes5.dex */
public abstract class DoubleCumulative {

    /* loaded from: classes5.dex */
    public static abstract class DoublePoint {
        public abstract void add(double d);
    }

    /* renamed from: io.opencensus.metrics.DoubleCumulative$a */
    /* loaded from: classes5.dex */
    public static final class C10586a extends DoubleCumulative {

        /* renamed from: a */
        public final int f63524a;

        /* renamed from: io.opencensus.metrics.DoubleCumulative$a$a */
        /* loaded from: classes5.dex */
        public static final class C10587a extends DoublePoint {

            /* renamed from: a */
            public static final C10587a f63525a = new C10587a();

            @Override // io.opencensus.metrics.DoubleCumulative.DoublePoint
            public void add(double d) {
            }
        }

        public C10586a(String str, String str2, String str3, List list) {
            Utils.checkNotNull(str, "name");
            Utils.checkNotNull(str2, "description");
            Utils.checkNotNull(str3, "unit");
            Utils.checkListElementNotNull((List) Utils.checkNotNull(list, "labelKeys"), "labelKey");
            this.f63524a = list.size();
        }

        /* renamed from: b */
        public static C10586a m30250b(String str, String str2, String str3, List list) {
            return new C10586a(str, str2, str3, list);
        }

        @Override // io.opencensus.metrics.DoubleCumulative
        /* renamed from: c */
        public C10587a getDefaultTimeSeries() {
            return C10587a.f63525a;
        }

        @Override // io.opencensus.metrics.DoubleCumulative
        public void clear() {
        }

        @Override // io.opencensus.metrics.DoubleCumulative
        /* renamed from: d */
        public C10587a getOrCreateTimeSeries(List list) {
            boolean z;
            Utils.checkListElementNotNull((List) Utils.checkNotNull(list, "labelValues"), "labelValue");
            if (this.f63524a == list.size()) {
                z = true;
            } else {
                z = false;
            }
            Utils.checkArgument(z, "Label Keys and Label Values don't have same size.");
            return C10587a.f63525a;
        }

        @Override // io.opencensus.metrics.DoubleCumulative
        public void removeTimeSeries(List list) {
            Utils.checkNotNull(list, "labelValues");
        }
    }

    /* renamed from: a */
    public static DoubleCumulative m30251a(String str, String str2, String str3, List list) {
        return C10586a.m30250b(str, str2, str3, list);
    }

    public abstract void clear();

    public abstract DoublePoint getDefaultTimeSeries();

    public abstract DoublePoint getOrCreateTimeSeries(List<LabelValue> list);

    public abstract void removeTimeSeries(List<LabelValue> list);
}
