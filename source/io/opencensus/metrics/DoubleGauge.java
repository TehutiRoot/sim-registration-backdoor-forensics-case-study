package io.opencensus.metrics;

import io.opencensus.internal.Utils;
import java.util.List;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes5.dex */
public abstract class DoubleGauge {

    /* loaded from: classes5.dex */
    public static abstract class DoublePoint {
        public abstract void add(double d);

        public abstract void set(double d);
    }

    /* renamed from: io.opencensus.metrics.DoubleGauge$a */
    /* loaded from: classes5.dex */
    public static final class C10588a extends DoubleGauge {

        /* renamed from: a */
        public final int f63526a;

        /* renamed from: io.opencensus.metrics.DoubleGauge$a$a */
        /* loaded from: classes5.dex */
        public static final class C10589a extends DoublePoint {

            /* renamed from: a */
            public static final C10589a f63527a = new C10589a();

            @Override // io.opencensus.metrics.DoubleGauge.DoublePoint
            public void add(double d) {
            }

            @Override // io.opencensus.metrics.DoubleGauge.DoublePoint
            public void set(double d) {
            }
        }

        public C10588a(String str, String str2, String str3, List list) {
            Utils.checkNotNull(str, "name");
            Utils.checkNotNull(str2, "description");
            Utils.checkNotNull(str3, "unit");
            Utils.checkListElementNotNull((List) Utils.checkNotNull(list, "labelKeys"), "labelKey");
            this.f63526a = list.size();
        }

        /* renamed from: b */
        public static C10588a m30245b(String str, String str2, String str3, List list) {
            return new C10588a(str, str2, str3, list);
        }

        @Override // io.opencensus.metrics.DoubleGauge
        /* renamed from: c */
        public C10589a getDefaultTimeSeries() {
            return C10589a.f63527a;
        }

        @Override // io.opencensus.metrics.DoubleGauge
        public void clear() {
        }

        @Override // io.opencensus.metrics.DoubleGauge
        /* renamed from: d */
        public C10589a getOrCreateTimeSeries(List list) {
            boolean z;
            Utils.checkListElementNotNull((List) Utils.checkNotNull(list, "labelValues"), "labelValue");
            if (this.f63526a == list.size()) {
                z = true;
            } else {
                z = false;
            }
            Utils.checkArgument(z, "Label Keys and Label Values don't have same size.");
            return C10589a.f63527a;
        }

        @Override // io.opencensus.metrics.DoubleGauge
        public void removeTimeSeries(List list) {
            Utils.checkNotNull(list, "labelValues");
        }
    }

    /* renamed from: a */
    public static DoubleGauge m30246a(String str, String str2, String str3, List list) {
        return C10588a.m30245b(str, str2, str3, list);
    }

    public abstract void clear();

    public abstract DoublePoint getDefaultTimeSeries();

    public abstract DoublePoint getOrCreateTimeSeries(List<LabelValue> list);

    public abstract void removeTimeSeries(List<LabelValue> list);
}
