package io.opencensus.stats;

import io.opencensus.common.Duration;
import io.opencensus.common.Function;
import io.opencensus.common.Functions;
import io.opencensus.common.Timestamp;
import io.opencensus.stats.Aggregation;
import io.opencensus.stats.AggregationData;
import io.opencensus.stats.Measure;
import io.opencensus.stats.View;
import io.opencensus.tags.TagValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class ViewData {

    @Deprecated
    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class AggregationWindowData {

        @Deprecated
        @Immutable
        /* loaded from: classes5.dex */
        public static abstract class CumulativeData extends AggregationWindowData {
            public CumulativeData() {
                super(null);
            }

            public static CumulativeData create(Timestamp timestamp, Timestamp timestamp2) {
                if (timestamp.compareTo(timestamp2) <= 0) {
                    return new C10659s(timestamp, timestamp2);
                }
                throw new IllegalArgumentException("Start time is later than end time.");
            }

            public abstract Timestamp getEnd();

            public abstract Timestamp getStart();

            @Override // io.opencensus.stats.ViewData.AggregationWindowData
            public final <T> T match(Function<? super CumulativeData, T> function, Function<? super IntervalData, T> function2, Function<? super AggregationWindowData, T> function3) {
                return function.apply(this);
            }
        }

        @Deprecated
        @Immutable
        /* loaded from: classes5.dex */
        public static abstract class IntervalData extends AggregationWindowData {
            public IntervalData() {
                super(null);
            }

            public static IntervalData create(Timestamp timestamp) {
                return new C10660t(timestamp);
            }

            public abstract Timestamp getEnd();

            @Override // io.opencensus.stats.ViewData.AggregationWindowData
            public final <T> T match(Function<? super CumulativeData, T> function, Function<? super IntervalData, T> function2, Function<? super AggregationWindowData, T> function3) {
                return function2.apply(this);
            }
        }

        public /* synthetic */ AggregationWindowData(C10628a c10628a) {
            this();
        }

        public abstract <T> T match(Function<? super CumulativeData, T> function, Function<? super IntervalData, T> function2, Function<? super AggregationWindowData, T> function3);

        public AggregationWindowData() {
        }
    }

    /* renamed from: io.opencensus.stats.ViewData$a */
    /* loaded from: classes5.dex */
    public class C10628a implements Function {

        /* renamed from: a */
        public final /* synthetic */ View f63584a;

        /* renamed from: b */
        public final /* synthetic */ Map f63585b;

        public C10628a(View view, Map map) {
            this.f63584a = view;
            this.f63585b = map;
        }

        @Override // io.opencensus.common.Function
        /* renamed from: a */
        public ViewData apply(AggregationWindowData.CumulativeData cumulativeData) {
            return ViewData.m30192h(this.f63584a, Collections.unmodifiableMap(this.f63585b), cumulativeData, cumulativeData.getStart(), cumulativeData.getEnd());
        }
    }

    /* renamed from: io.opencensus.stats.ViewData$b */
    /* loaded from: classes5.dex */
    public class C10629b implements Function {

        /* renamed from: a */
        public final /* synthetic */ View f63586a;

        /* renamed from: b */
        public final /* synthetic */ Map f63587b;

        public C10629b(View view, Map map) {
            this.f63586a = view;
            this.f63587b = map;
        }

        @Override // io.opencensus.common.Function
        /* renamed from: a */
        public ViewData apply(AggregationWindowData.IntervalData intervalData) {
            Duration duration = ((View.AggregationWindow.Interval) this.f63586a.getWindow()).getDuration();
            return ViewData.m30192h(this.f63586a, Collections.unmodifiableMap(this.f63587b), intervalData, intervalData.getEnd().addDuration(Duration.create(-duration.getSeconds(), -duration.getNanos())), intervalData.getEnd());
        }
    }

    /* renamed from: io.opencensus.stats.ViewData$c */
    /* loaded from: classes5.dex */
    public class C10630c implements Function {

        /* renamed from: a */
        public final /* synthetic */ AggregationWindowData f63588a;

        public C10630c(AggregationWindowData aggregationWindowData) {
            this.f63588a = aggregationWindowData;
        }

        @Override // io.opencensus.common.Function
        /* renamed from: a */
        public Void apply(View.AggregationWindow.Cumulative cumulative) {
            AggregationWindowData aggregationWindowData = this.f63588a;
            ViewData.m30190j(aggregationWindowData instanceof AggregationWindowData.CumulativeData, cumulative, aggregationWindowData);
            return null;
        }
    }

    /* renamed from: io.opencensus.stats.ViewData$d */
    /* loaded from: classes5.dex */
    public class C10631d implements Function {

        /* renamed from: a */
        public final /* synthetic */ AggregationWindowData f63589a;

        public C10631d(AggregationWindowData aggregationWindowData) {
            this.f63589a = aggregationWindowData;
        }

        @Override // io.opencensus.common.Function
        /* renamed from: a */
        public Void apply(View.AggregationWindow.Interval interval) {
            AggregationWindowData aggregationWindowData = this.f63589a;
            ViewData.m30190j(aggregationWindowData instanceof AggregationWindowData.IntervalData, interval, aggregationWindowData);
            return null;
        }
    }

    /* renamed from: io.opencensus.stats.ViewData$e */
    /* loaded from: classes5.dex */
    public class C10632e implements Function {

        /* renamed from: a */
        public final /* synthetic */ Measure f63590a;

        /* renamed from: b */
        public final /* synthetic */ AggregationData f63591b;

        /* renamed from: c */
        public final /* synthetic */ Aggregation f63592c;

        /* renamed from: io.opencensus.stats.ViewData$e$a */
        /* loaded from: classes5.dex */
        public class C10633a implements Function {
            public C10633a() {
                C10632e.this = r1;
            }

            @Override // io.opencensus.common.Function
            /* renamed from: a */
            public Void apply(Measure.MeasureDouble measureDouble) {
                C10632e c10632e = C10632e.this;
                AggregationData aggregationData = c10632e.f63591b;
                ViewData.m30191i(aggregationData instanceof AggregationData.SumDataDouble, c10632e.f63592c, aggregationData);
                return null;
            }
        }

        /* renamed from: io.opencensus.stats.ViewData$e$b */
        /* loaded from: classes5.dex */
        public class C10634b implements Function {
            public C10634b() {
                C10632e.this = r1;
            }

            @Override // io.opencensus.common.Function
            /* renamed from: a */
            public Void apply(Measure.MeasureLong measureLong) {
                C10632e c10632e = C10632e.this;
                AggregationData aggregationData = c10632e.f63591b;
                ViewData.m30191i(aggregationData instanceof AggregationData.SumDataLong, c10632e.f63592c, aggregationData);
                return null;
            }
        }

        public C10632e(Measure measure, AggregationData aggregationData, Aggregation aggregation) {
            this.f63590a = measure;
            this.f63591b = aggregationData;
            this.f63592c = aggregation;
        }

        @Override // io.opencensus.common.Function
        /* renamed from: a */
        public Void apply(Aggregation.Sum sum) {
            this.f63590a.match(new C10633a(), new C10634b(), Functions.throwAssertionError());
            return null;
        }
    }

    /* renamed from: io.opencensus.stats.ViewData$f */
    /* loaded from: classes5.dex */
    public class C10635f implements Function {

        /* renamed from: a */
        public final /* synthetic */ AggregationData f63595a;

        /* renamed from: b */
        public final /* synthetic */ Aggregation f63596b;

        public C10635f(AggregationData aggregationData, Aggregation aggregation) {
            this.f63595a = aggregationData;
            this.f63596b = aggregation;
        }

        @Override // io.opencensus.common.Function
        /* renamed from: a */
        public Void apply(Aggregation.Count count) {
            AggregationData aggregationData = this.f63595a;
            ViewData.m30191i(aggregationData instanceof AggregationData.CountData, this.f63596b, aggregationData);
            return null;
        }
    }

    /* renamed from: io.opencensus.stats.ViewData$g */
    /* loaded from: classes5.dex */
    public class C10636g implements Function {

        /* renamed from: a */
        public final /* synthetic */ AggregationData f63597a;

        /* renamed from: b */
        public final /* synthetic */ Aggregation f63598b;

        public C10636g(AggregationData aggregationData, Aggregation aggregation) {
            this.f63597a = aggregationData;
            this.f63598b = aggregation;
        }

        @Override // io.opencensus.common.Function
        /* renamed from: a */
        public Void apply(Aggregation.Distribution distribution) {
            AggregationData aggregationData = this.f63597a;
            ViewData.m30191i(aggregationData instanceof AggregationData.DistributionData, this.f63598b, aggregationData);
            return null;
        }
    }

    /* renamed from: io.opencensus.stats.ViewData$h */
    /* loaded from: classes5.dex */
    public class C10637h implements Function {

        /* renamed from: a */
        public final /* synthetic */ Measure f63599a;

        /* renamed from: b */
        public final /* synthetic */ AggregationData f63600b;

        /* renamed from: c */
        public final /* synthetic */ Aggregation f63601c;

        /* renamed from: io.opencensus.stats.ViewData$h$a */
        /* loaded from: classes5.dex */
        public class C10638a implements Function {
            public C10638a() {
                C10637h.this = r1;
            }

            @Override // io.opencensus.common.Function
            /* renamed from: a */
            public Void apply(Measure.MeasureDouble measureDouble) {
                C10637h c10637h = C10637h.this;
                AggregationData aggregationData = c10637h.f63600b;
                ViewData.m30191i(aggregationData instanceof AggregationData.LastValueDataDouble, c10637h.f63601c, aggregationData);
                return null;
            }
        }

        /* renamed from: io.opencensus.stats.ViewData$h$b */
        /* loaded from: classes5.dex */
        public class C10639b implements Function {
            public C10639b() {
                C10637h.this = r1;
            }

            @Override // io.opencensus.common.Function
            /* renamed from: a */
            public Void apply(Measure.MeasureLong measureLong) {
                C10637h c10637h = C10637h.this;
                AggregationData aggregationData = c10637h.f63600b;
                ViewData.m30191i(aggregationData instanceof AggregationData.LastValueDataLong, c10637h.f63601c, aggregationData);
                return null;
            }
        }

        public C10637h(Measure measure, AggregationData aggregationData, Aggregation aggregation) {
            this.f63599a = measure;
            this.f63600b = aggregationData;
            this.f63601c = aggregation;
        }

        @Override // io.opencensus.common.Function
        /* renamed from: a */
        public Void apply(Aggregation.LastValue lastValue) {
            this.f63599a.match(new C10638a(), new C10639b(), Functions.throwAssertionError());
            return null;
        }
    }

    /* renamed from: io.opencensus.stats.ViewData$i */
    /* loaded from: classes5.dex */
    public class C10640i implements Function {

        /* renamed from: a */
        public final /* synthetic */ AggregationData f63604a;

        /* renamed from: b */
        public final /* synthetic */ Aggregation f63605b;

        public C10640i(AggregationData aggregationData, Aggregation aggregation) {
            this.f63604a = aggregationData;
            this.f63605b = aggregation;
        }

        @Override // io.opencensus.common.Function
        /* renamed from: a */
        public Void apply(Aggregation aggregation) {
            if (aggregation instanceof Aggregation.Mean) {
                AggregationData aggregationData = this.f63604a;
                ViewData.m30191i(aggregationData instanceof AggregationData.MeanData, this.f63605b, aggregationData);
                return null;
            }
            throw new AssertionError();
        }
    }

    @Deprecated
    public static ViewData create(View view, Map<? extends List<TagValue>, ? extends AggregationData> map, AggregationWindowData aggregationWindowData) {
        m30195e(view.getWindow(), aggregationWindowData);
        HashMap hashMap = new HashMap();
        for (Map.Entry<? extends List<TagValue>, ? extends AggregationData> entry : map.entrySet()) {
            m30196d(view.getAggregation(), entry.getValue(), view.getMeasure());
            hashMap.put(Collections.unmodifiableList(new ArrayList(entry.getKey())), entry.getValue());
        }
        return (ViewData) aggregationWindowData.match(new C10628a(view, hashMap), new C10629b(view, hashMap), Functions.throwAssertionError());
    }

    /* renamed from: d */
    public static void m30196d(Aggregation aggregation, AggregationData aggregationData, Measure measure) {
        aggregation.match(new C10632e(measure, aggregationData, aggregation), new C10635f(aggregationData, aggregation), new C10636g(aggregationData, aggregation), new C10637h(measure, aggregationData, aggregation), new C10640i(aggregationData, aggregation));
    }

    /* renamed from: e */
    public static void m30195e(View.AggregationWindow aggregationWindow, AggregationWindowData aggregationWindowData) {
        aggregationWindow.match(new C10630c(aggregationWindowData), new C10631d(aggregationWindowData), Functions.throwAssertionError());
    }

    /* renamed from: f */
    public static String m30194f(Aggregation aggregation, AggregationData aggregationData) {
        return "Aggregation and AggregationData types mismatch. Aggregation: " + aggregation.getClass().getSimpleName() + " AggregationData: " + aggregationData.getClass().getSimpleName();
    }

    /* renamed from: g */
    public static String m30193g(View.AggregationWindow aggregationWindow, AggregationWindowData aggregationWindowData) {
        return "AggregationWindow and AggregationWindowData types mismatch. AggregationWindow: " + aggregationWindow.getClass().getSimpleName() + " AggregationWindowData: " + aggregationWindowData.getClass().getSimpleName();
    }

    /* renamed from: h */
    public static ViewData m30192h(View view, Map map, AggregationWindowData aggregationWindowData, Timestamp timestamp, Timestamp timestamp2) {
        return new C10658r(view, map, aggregationWindowData, timestamp, timestamp2);
    }

    /* renamed from: i */
    public static void m30191i(boolean z, Aggregation aggregation, AggregationData aggregationData) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(m30194f(aggregation, aggregationData));
    }

    /* renamed from: j */
    public static void m30190j(boolean z, View.AggregationWindow aggregationWindow, AggregationWindowData aggregationWindowData) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(m30193g(aggregationWindow, aggregationWindowData));
    }

    public abstract Map<List<TagValue>, AggregationData> getAggregationMap();

    public abstract Timestamp getEnd();

    public abstract Timestamp getStart();

    public abstract View getView();

    @Deprecated
    public abstract AggregationWindowData getWindowData();

    public static ViewData create(View view, Map<? extends List<TagValue>, ? extends AggregationData> map, Timestamp timestamp, Timestamp timestamp2) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<? extends List<TagValue>, ? extends AggregationData> entry : map.entrySet()) {
            m30196d(view.getAggregation(), entry.getValue(), view.getMeasure());
            hashMap.put(Collections.unmodifiableList(new ArrayList(entry.getKey())), entry.getValue());
        }
        return m30192h(view, Collections.unmodifiableMap(hashMap), AggregationWindowData.CumulativeData.create(timestamp, timestamp2), timestamp, timestamp2);
    }
}
