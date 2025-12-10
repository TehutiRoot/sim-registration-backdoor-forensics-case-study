package io.opencensus.metrics;

import io.opencensus.common.ToLongFunction;
import io.opencensus.internal.Utils;
import java.util.List;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes5.dex */
public abstract class DerivedLongCumulative {

    /* renamed from: io.opencensus.metrics.DerivedLongCumulative$a */
    /* loaded from: classes5.dex */
    public static final class C10571a extends DerivedLongCumulative {

        /* renamed from: a */
        public final int f63585a;

        public C10571a(String str, String str2, String str3, List list) {
            Utils.checkNotNull(str, "name");
            Utils.checkNotNull(str2, "description");
            Utils.checkNotNull(str3, "unit");
            Utils.checkListElementNotNull((List) Utils.checkNotNull(list, "labelKeys"), "labelKey");
            this.f63585a = list.size();
        }

        /* renamed from: b */
        public static C10571a m30594b(String str, String str2, String str3, List list) {
            return new C10571a(str, str2, str3, list);
        }

        @Override // io.opencensus.metrics.DerivedLongCumulative
        public void clear() {
        }

        @Override // io.opencensus.metrics.DerivedLongCumulative
        public void createTimeSeries(List list, Object obj, ToLongFunction toLongFunction) {
            boolean z;
            Utils.checkListElementNotNull((List) Utils.checkNotNull(list, "labelValues"), "labelValue");
            if (this.f63585a == list.size()) {
                z = true;
            } else {
                z = false;
            }
            Utils.checkArgument(z, "Label Keys and Label Values don't have same size.");
            Utils.checkNotNull(toLongFunction, "function");
        }

        @Override // io.opencensus.metrics.DerivedLongCumulative
        public void removeTimeSeries(List list) {
            Utils.checkNotNull(list, "labelValues");
        }
    }

    /* renamed from: a */
    public static DerivedLongCumulative m30595a(String str, String str2, String str3, List list) {
        return C10571a.m30594b(str, str2, str3, list);
    }

    public abstract void clear();

    public abstract <T> void createTimeSeries(List<LabelValue> list, T t, ToLongFunction<T> toLongFunction);

    public abstract void removeTimeSeries(List<LabelValue> list);
}