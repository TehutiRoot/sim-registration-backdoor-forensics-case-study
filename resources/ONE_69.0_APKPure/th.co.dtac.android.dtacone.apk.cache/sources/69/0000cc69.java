package io.opencensus.metrics;

import io.opencensus.common.ToDoubleFunction;
import io.opencensus.internal.Utils;
import java.util.List;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes5.dex */
public abstract class DerivedDoubleCumulative {

    /* renamed from: io.opencensus.metrics.DerivedDoubleCumulative$a */
    /* loaded from: classes5.dex */
    public static final class C10569a extends DerivedDoubleCumulative {

        /* renamed from: a */
        public final int f63583a;

        public C10569a(String str, String str2, String str3, List list) {
            Utils.checkNotNull(str, "name");
            Utils.checkNotNull(str2, "description");
            Utils.checkNotNull(str3, "unit");
            Utils.checkListElementNotNull((List) Utils.checkNotNull(list, "labelKeys"), "labelKey");
            this.f63583a = list.size();
        }

        /* renamed from: b */
        public static C10569a m30598b(String str, String str2, String str3, List list) {
            return new C10569a(str, str2, str3, list);
        }

        @Override // io.opencensus.metrics.DerivedDoubleCumulative
        public void clear() {
        }

        @Override // io.opencensus.metrics.DerivedDoubleCumulative
        public void createTimeSeries(List list, Object obj, ToDoubleFunction toDoubleFunction) {
            boolean z;
            Utils.checkListElementNotNull((List) Utils.checkNotNull(list, "labelValues"), "labelValue");
            if (this.f63583a == list.size()) {
                z = true;
            } else {
                z = false;
            }
            Utils.checkArgument(z, "Label Keys and Label Values don't have same size.");
            Utils.checkNotNull(toDoubleFunction, "function");
        }

        @Override // io.opencensus.metrics.DerivedDoubleCumulative
        public void removeTimeSeries(List list) {
            Utils.checkNotNull(list, "labelValues");
        }
    }

    /* renamed from: a */
    public static DerivedDoubleCumulative m30599a(String str, String str2, String str3, List list) {
        return C10569a.m30598b(str, str2, str3, list);
    }

    public abstract void clear();

    public abstract <T> void createTimeSeries(List<LabelValue> list, T t, ToDoubleFunction<T> toDoubleFunction);

    public abstract void removeTimeSeries(List<LabelValue> list);
}