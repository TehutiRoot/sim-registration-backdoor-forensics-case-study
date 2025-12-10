package io.opencensus.metrics.export;

import io.opencensus.internal.Utils;
import io.opencensus.metrics.export.MetricDescriptor;
import io.opencensus.metrics.export.Value;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class Metric {

    /* renamed from: io.opencensus.metrics.export.Metric$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C10605a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63546a;

        static {
            int[] iArr = new int[MetricDescriptor.Type.values().length];
            f63546a = iArr;
            try {
                iArr[MetricDescriptor.Type.GAUGE_INT64.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63546a[MetricDescriptor.Type.CUMULATIVE_INT64.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63546a[MetricDescriptor.Type.CUMULATIVE_DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63546a[MetricDescriptor.Type.GAUGE_DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f63546a[MetricDescriptor.Type.GAUGE_DISTRIBUTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f63546a[MetricDescriptor.Type.CUMULATIVE_DISTRIBUTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f63546a[MetricDescriptor.Type.SUMMARY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: a */
    public static void m30222a(MetricDescriptor.Type type, List list) {
        String str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (Point point : ((TimeSeries) it.next()).getPoints()) {
                Value value = point.getValue();
                if (value.getClass().getSuperclass() != null) {
                    str = value.getClass().getSuperclass().getSimpleName();
                } else {
                    str = "";
                }
                switch (C10605a.f63546a[type.ordinal()]) {
                    case 1:
                    case 2:
                        Utils.checkArgument(value instanceof Value.AbstractC10610c, "Type mismatch: %s, %s.", type, str);
                        break;
                    case 3:
                    case 4:
                        Utils.checkArgument(value instanceof Value.AbstractC10609b, "Type mismatch: %s, %s.", type, str);
                        break;
                    case 5:
                    case 6:
                        Utils.checkArgument(value instanceof Value.AbstractC10608a, "Type mismatch: %s, %s.", type, str);
                        break;
                    case 7:
                        Utils.checkArgument(value instanceof Value.AbstractC10611d, "Type mismatch: %s, %s.", type, str);
                        break;
                }
            }
        }
    }

    /* renamed from: b */
    public static Metric m30221b(MetricDescriptor metricDescriptor, List list) {
        Utils.checkNotNull(metricDescriptor, "metricDescriptor");
        m30222a(metricDescriptor.getType(), list);
        return new C0433G8(metricDescriptor, list);
    }

    public static Metric create(MetricDescriptor metricDescriptor, List<TimeSeries> list) {
        Utils.checkListElementNotNull((List) Utils.checkNotNull(list, "timeSeriesList"), "timeSeries");
        return m30221b(metricDescriptor, Collections.unmodifiableList(new ArrayList(list)));
    }

    public static Metric createWithOneTimeSeries(MetricDescriptor metricDescriptor, TimeSeries timeSeries) {
        return m30221b(metricDescriptor, Collections.singletonList(Utils.checkNotNull(timeSeries, "timeSeries")));
    }

    public abstract MetricDescriptor getMetricDescriptor();

    public abstract List<TimeSeries> getTimeSeriesList();
}
