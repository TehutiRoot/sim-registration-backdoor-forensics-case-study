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
    public static final class C10573a extends DoubleCumulative {

        /* renamed from: a */
        public final int f63587a;

        /* renamed from: io.opencensus.metrics.DoubleCumulative$a$a */
        /* loaded from: classes5.dex */
        public static final class C10574a extends DoublePoint {

            /* renamed from: a */
            public static final C10574a f63588a = new C10574a();

            @Override // io.opencensus.metrics.DoubleCumulative.DoublePoint
            public void add(double d) {
            }
        }

        public C10573a(String str, String str2, String str3, List list) {
            Utils.checkNotNull(str, "name");
            Utils.checkNotNull(str2, "description");
            Utils.checkNotNull(str3, "unit");
            Utils.checkListElementNotNull((List) Utils.checkNotNull(list, "labelKeys"), "labelKey");
            this.f63587a = list.size();
        }

        /* renamed from: b */
        public static C10573a m30590b(String str, String str2, String str3, List list) {
            return new C10573a(str, str2, str3, list);
        }

        @Override // io.opencensus.metrics.DoubleCumulative
        /* renamed from: c */
        public C10574a getDefaultTimeSeries() {
            return C10574a.f63588a;
        }

        @Override // io.opencensus.metrics.DoubleCumulative
        public void clear() {
        }

        @Override // io.opencensus.metrics.DoubleCumulative
        /* renamed from: d */
        public C10574a getOrCreateTimeSeries(List list) {
            boolean z;
            Utils.checkListElementNotNull((List) Utils.checkNotNull(list, "labelValues"), "labelValue");
            if (this.f63587a == list.size()) {
                z = true;
            } else {
                z = false;
            }
            Utils.checkArgument(z, "Label Keys and Label Values don't have same size.");
            return C10574a.f63588a;
        }

        @Override // io.opencensus.metrics.DoubleCumulative
        public void removeTimeSeries(List list) {
            Utils.checkNotNull(list, "labelValues");
        }
    }

    /* renamed from: a */
    public static DoubleCumulative m30591a(String str, String str2, String str3, List list) {
        return C10573a.m30590b(str, str2, str3, list);
    }

    public abstract void clear();

    public abstract DoublePoint getDefaultTimeSeries();

    public abstract DoublePoint getOrCreateTimeSeries(List<LabelValue> list);

    public abstract void removeTimeSeries(List<LabelValue> list);
}