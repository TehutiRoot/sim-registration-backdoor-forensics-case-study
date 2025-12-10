package io.opencensus.metrics;

import io.opencensus.common.ToDoubleFunction;
import io.opencensus.internal.Utils;
import java.util.List;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes5.dex */
public abstract class DerivedDoubleGauge {

    /* renamed from: io.opencensus.metrics.DerivedDoubleGauge$a */
    /* loaded from: classes5.dex */
    public static final class C10583a extends DerivedDoubleGauge {

        /* renamed from: a */
        public final int f63521a;

        public C10583a(String str, String str2, String str3, List list) {
            Utils.checkNotNull(str, "name");
            Utils.checkNotNull(str2, "description");
            Utils.checkNotNull(str3, "unit");
            Utils.checkListElementNotNull((List) Utils.checkNotNull(list, "labelKeys"), "labelKey");
            this.f63521a = list.size();
        }

        /* renamed from: b */
        public static C10583a m30256b(String str, String str2, String str3, List list) {
            return new C10583a(str, str2, str3, list);
        }

        @Override // io.opencensus.metrics.DerivedDoubleGauge
        public void clear() {
        }

        @Override // io.opencensus.metrics.DerivedDoubleGauge
        public void createTimeSeries(List list, Object obj, ToDoubleFunction toDoubleFunction) {
            boolean z;
            Utils.checkListElementNotNull((List) Utils.checkNotNull(list, "labelValues"), "labelValue");
            if (this.f63521a == list.size()) {
                z = true;
            } else {
                z = false;
            }
            Utils.checkArgument(z, "Label Keys and Label Values don't have same size.");
            Utils.checkNotNull(toDoubleFunction, "function");
        }

        @Override // io.opencensus.metrics.DerivedDoubleGauge
        public void removeTimeSeries(List list) {
            Utils.checkNotNull(list, "labelValues");
        }
    }

    /* renamed from: a */
    public static DerivedDoubleGauge m30257a(String str, String str2, String str3, List list) {
        return C10583a.m30256b(str, str2, str3, list);
    }

    public abstract void clear();

    public abstract <T> void createTimeSeries(List<LabelValue> list, T t, ToDoubleFunction<T> toDoubleFunction);

    public abstract void removeTimeSeries(List<LabelValue> list);
}
