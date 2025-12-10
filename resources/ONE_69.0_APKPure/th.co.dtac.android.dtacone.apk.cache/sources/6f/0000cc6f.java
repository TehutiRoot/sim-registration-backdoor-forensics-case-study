package io.opencensus.metrics;

import io.opencensus.common.ToLongFunction;
import io.opencensus.internal.Utils;
import java.util.List;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes5.dex */
public abstract class DerivedLongGauge {

    /* renamed from: io.opencensus.metrics.DerivedLongGauge$a */
    /* loaded from: classes5.dex */
    public static final class C10572a extends DerivedLongGauge {

        /* renamed from: a */
        public final int f63586a;

        public C10572a(String str, String str2, String str3, List list) {
            Utils.checkNotNull(str, "name");
            Utils.checkNotNull(str2, "description");
            Utils.checkNotNull(str3, "unit");
            Utils.checkListElementNotNull((List) Utils.checkNotNull(list, "labelKeys"), "labelKey");
            this.f63586a = list.size();
        }

        /* renamed from: b */
        public static C10572a m30592b(String str, String str2, String str3, List list) {
            return new C10572a(str, str2, str3, list);
        }

        @Override // io.opencensus.metrics.DerivedLongGauge
        public void clear() {
        }

        @Override // io.opencensus.metrics.DerivedLongGauge
        public void createTimeSeries(List list, Object obj, ToLongFunction toLongFunction) {
            boolean z;
            Utils.checkListElementNotNull((List) Utils.checkNotNull(list, "labelValues"), "labelValue");
            if (this.f63586a == list.size()) {
                z = true;
            } else {
                z = false;
            }
            Utils.checkArgument(z, "Label Keys and Label Values don't have same size.");
            Utils.checkNotNull(toLongFunction, "function");
        }

        @Override // io.opencensus.metrics.DerivedLongGauge
        public void removeTimeSeries(List list) {
            Utils.checkNotNull(list, "labelValues");
        }
    }

    /* renamed from: a */
    public static DerivedLongGauge m30593a(String str, String str2, String str3, List list) {
        return C10572a.m30592b(str, str2, str3, list);
    }

    public abstract void clear();

    public abstract <T> void createTimeSeries(List<LabelValue> list, T t, ToLongFunction<T> toLongFunction);

    public abstract void removeTimeSeries(List<LabelValue> list);
}