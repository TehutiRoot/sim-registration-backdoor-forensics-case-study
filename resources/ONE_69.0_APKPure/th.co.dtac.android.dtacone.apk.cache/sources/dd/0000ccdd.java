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
                    return new C10646s(timestamp, timestamp2);
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
                return new C10647t(timestamp);
            }

            public abstract Timestamp getEnd();

            @Override // io.opencensus.stats.ViewData.AggregationWindowData
            public final <T> T match(Function<? super CumulativeData, T> function, Function<? super IntervalData, T> function2, Function<? super AggregationWindowData, T> function3) {
                return function2.apply(this);
            }
        }

        public /* synthetic */ AggregationWindowData(C10615a c10615a) {
            this();
        }

        public abstract <T> T match(Function<? super CumulativeData, T> function, Function<? super IntervalData, T> function2, Function<? super AggregationWindowData, T> function3);

        public AggregationWindowData() {
        }
    }

    /* renamed from: io.opencensus.stats.ViewData$a */
    /* loaded from: classes5.dex */
    public class C10615a implements Function {

        /* renamed from: a */
        public final /* synthetic */ View f63647a;

        /* renamed from: b */
        public final /* synthetic */ Map f63648b;

        public C10615a(View view, Map map) {
            this.f63647a = view;
            this.f63648b = map;
        }

        @Override // io.opencensus.common.Function
        /* renamed from: a */
        public ViewData apply(AggregationWindowData.CumulativeData cumulativeData) {
            return ViewData.m30532h(this.f63647a, Collections.unmodifiableMap(this.f63648b), cumulativeData, cumulativeData.getStart(), cumulativeData.getEnd());
        }
    }

    /* renamed from: io.opencensus.stats.ViewData$b */
    /* loaded from: classes5.dex */
    public class C10616b implements Function {

        /* renamed from: a */
        public final /* synthetic */ View f63649a;

        /* renamed from: b */
        public final /* synthetic */ Map f63650b;

        public C10616b(View view, Map map) {
            this.f63649a = view;
            this.f63650b = map;
        }

        @Override // io.opencensus.common.Function
        /* renamed from: a */
        public ViewData apply(AggregationWindowData.IntervalData intervalData) {
            Duration duration = ((View.AggregationWindow.Interval) this.f63649a.getWindow()).getDuration();
            return ViewData.m30532h(this.f63649a, Collections.unmodifiableMap(this.f63650b), intervalData, intervalData.getEnd().addDuration(Duration.create(-duration.getSeconds(), -duration.getNanos())), intervalData.getEnd());
        }
    }

    /* renamed from: io.opencensus.stats.ViewData$c */
    /* loaded from: classes5.dex */
    public class C10617c implements Function {

        /* renamed from: a */
        public final /* synthetic */ AggregationWindowData f63651a;

        public C10617c(AggregationWindowData aggregationWindowData) {
            this.f63651a = aggregationWindowData;
        }

        @Override // io.opencensus.common.Function
        /* renamed from: a */
        public Void apply(View.AggregationWindow.Cumulative cumulative) {
            AggregationWindowData aggregationWindowData = this.f63651a;
            ViewData.m30530j(aggregationWindowData instanceof AggregationWindowData.CumulativeData, cumulative, aggregationWindowData);
            return null;
        }
    }

    /* renamed from: io.opencensus.stats.ViewData$d */
    /* loaded from: classes5.dex */
    public class C10618d implements Function {

        /* renamed from: a */
        public final /* synthetic */ AggregationWindowData f63652a;

        public C10618d(AggregationWindowData aggregationWindowData) {
            this.f63652a = aggregationWindowData;
        }

        @Override // io.opencensus.common.Function
        /* renamed from: a */
        public Void apply(View.AggregationWindow.Interval interval) {
            AggregationWindowData aggregationWindowData = this.f63652a;
            ViewData.m30530j(aggregationWindowData instanceof AggregationWindowData.IntervalData, interval, aggregationWindowData);
            return null;
        }
    }

    /* renamed from: io.opencensus.stats.ViewData$e */
    /* loaded from: classes5.dex */
    public class C10619e implements Function {

        /* renamed from: a */
        public final /* synthetic */ Measure f63653a;

        /* renamed from: b */
        public final /* synthetic */ AggregationData f63654b;

        /* renamed from: c */
        public final /* synthetic */ Aggregation f63655c;

        /* renamed from: io.opencensus.stats.ViewData$e$a */
        /* loaded from: classes5.dex */
        public class C10620a implements Function {
            public C10620a() {
            }

            @Override // io.opencensus.common.Function
            /* renamed from: a */
            public Void apply(Measure.MeasureDouble measureDouble) {
                C10619e c10619e = C10619e.this;
                AggregationData aggregationData = c10619e.f63654b;
                ViewData.m30531i(aggregationData instanceof AggregationData.SumDataDouble, c10619e.f63655c, aggregationData);
                return null;
            }
        }

        /* renamed from: io.opencensus.stats.ViewData$e$b */
        /* loaded from: classes5.dex */
        public class C10621b implements Function {
            public C10621b() {
            }

            @Override // io.opencensus.common.Function
            /* renamed from: a */
            public Void apply(Measure.MeasureLong measureLong) {
                C10619e c10619e = C10619e.this;
                AggregationData aggregationData = c10619e.f63654b;
                ViewData.m30531i(aggregationData instanceof AggregationData.SumDataLong, c10619e.f63655c, aggregationData);
                return null;
            }
        }

        public C10619e(Measure measure, AggregationData aggregationData, Aggregation aggregation) {
            this.f63653a = measure;
            this.f63654b = aggregationData;
            this.f63655c = aggregation;
        }

        @Override // io.opencensus.common.Function
        /* renamed from: a */
        public Void apply(Aggregation.Sum sum) {
            this.f63653a.match(new C10620a(), new C10621b(), Functions.throwAssertionError());
            return null;
        }
    }

    /* renamed from: io.opencensus.stats.ViewData$f */
    /* loaded from: classes5.dex */
    public class C10622f implements Function {

        /* renamed from: a */
        public final /* synthetic */ AggregationData f63658a;

        /* renamed from: b */
        public final /* synthetic */ Aggregation f63659b;

        public C10622f(AggregationData aggregationData, Aggregation aggregation) {
            this.f63658a = aggregationData;
            this.f63659b = aggregation;
        }

        @Override // io.opencensus.common.Function
        /* renamed from: a */
        public Void apply(Aggregation.Count count) {
            AggregationData aggregationData = this.f63658a;
            ViewData.m30531i(aggregationData instanceof AggregationData.CountData, this.f63659b, aggregationData);
            return null;
        }
    }

    /* renamed from: io.opencensus.stats.ViewData$g */
    /* loaded from: classes5.dex */
    public class C10623g implements Function {

        /* renamed from: a */
        public final /* synthetic */ AggregationData f63660a;

        /* renamed from: b */
        public final /* synthetic */ Aggregation f63661b;

        public C10623g(AggregationData aggregationData, Aggregation aggregation) {
            this.f63660a = aggregationData;
            this.f63661b = aggregation;
        }

        @Override // io.opencensus.common.Function
        /* renamed from: a */
        public Void apply(Aggregation.Distribution distribution) {
            AggregationData aggregationData = this.f63660a;
            ViewData.m30531i(aggregationData instanceof AggregationData.DistributionData, this.f63661b, aggregationData);
            return null;
        }
    }

    /* renamed from: io.opencensus.stats.ViewData$h */
    /* loaded from: classes5.dex */
    public class C10624h implements Function {

        /* renamed from: a */
        public final /* synthetic */ Measure f63662a;

        /* renamed from: b */
        public final /* synthetic */ AggregationData f63663b;

        /* renamed from: c */
        public final /* synthetic */ Aggregation f63664c;

        /* renamed from: io.opencensus.stats.ViewData$h$a */
        /* loaded from: classes5.dex */
        public class C10625a implements Function {
            public C10625a() {
            }

            @Override // io.opencensus.common.Function
            /* renamed from: a */
            public Void apply(Measure.MeasureDouble measureDouble) {
                C10624h c10624h = C10624h.this;
                AggregationData aggregationData = c10624h.f63663b;
                ViewData.m30531i(aggregationData instanceof AggregationData.LastValueDataDouble, c10624h.f63664c, aggregationData);
                return null;
            }
        }

        /* renamed from: io.opencensus.stats.ViewData$h$b */
        /* loaded from: classes5.dex */
        public class C10626b implements Function {
            public C10626b() {
            }

            @Override // io.opencensus.common.Function
            /* renamed from: a */
            public Void apply(Measure.MeasureLong measureLong) {
                C10624h c10624h = C10624h.this;
                AggregationData aggregationData = c10624h.f63663b;
                ViewData.m30531i(aggregationData instanceof AggregationData.LastValueDataLong, c10624h.f63664c, aggregationData);
                return null;
            }
        }

        public C10624h(Measure measure, AggregationData aggregationData, Aggregation aggregation) {
            this.f63662a = measure;
            this.f63663b = aggregationData;
            this.f63664c = aggregation;
        }

        @Override // io.opencensus.common.Function
        /* renamed from: a */
        public Void apply(Aggregation.LastValue lastValue) {
            this.f63662a.match(new C10625a(), new C10626b(), Functions.throwAssertionError());
            return null;
        }
    }

    /* renamed from: io.opencensus.stats.ViewData$i */
    /* loaded from: classes5.dex */
    public class C10627i implements Function {

        /* renamed from: a */
        public final /* synthetic */ AggregationData f63667a;

        /* renamed from: b */
        public final /* synthetic */ Aggregation f63668b;

        public C10627i(AggregationData aggregationData, Aggregation aggregation) {
            this.f63667a = aggregationData;
            this.f63668b = aggregation;
        }

        @Override // io.opencensus.common.Function
        /* renamed from: a */
        public Void apply(Aggregation aggregation) {
            if (aggregation instanceof Aggregation.Mean) {
                AggregationData aggregationData = this.f63667a;
                ViewData.m30531i(aggregationData instanceof AggregationData.MeanData, this.f63668b, aggregationData);
                return null;
            }
            throw new AssertionError();
        }
    }

    @Deprecated
    public static ViewData create(View view, Map<? extends List<TagValue>, ? extends AggregationData> map, AggregationWindowData aggregationWindowData) {
        m30535e(view.getWindow(), aggregationWindowData);
        HashMap hashMap = new HashMap();
        for (Map.Entry<? extends List<TagValue>, ? extends AggregationData> entry : map.entrySet()) {
            m30536d(view.getAggregation(), entry.getValue(), view.getMeasure());
            hashMap.put(Collections.unmodifiableList(new ArrayList(entry.getKey())), entry.getValue());
        }
        return (ViewData) aggregationWindowData.match(new C10615a(view, hashMap), new C10616b(view, hashMap), Functions.throwAssertionError());
    }

    /* renamed from: d */
    public static void m30536d(Aggregation aggregation, AggregationData aggregationData, Measure measure) {
        aggregation.match(new C10619e(measure, aggregationData, aggregation), new C10622f(aggregationData, aggregation), new C10623g(aggregationData, aggregation), new C10624h(measure, aggregationData, aggregation), new C10627i(aggregationData, aggregation));
    }

    /* renamed from: e */
    public static void m30535e(View.AggregationWindow aggregationWindow, AggregationWindowData aggregationWindowData) {
        aggregationWindow.match(new C10617c(aggregationWindowData), new C10618d(aggregationWindowData), Functions.throwAssertionError());
    }

    /* renamed from: f */
    public static String m30534f(Aggregation aggregation, AggregationData aggregationData) {
        return "Aggregation and AggregationData types mismatch. Aggregation: " + aggregation.getClass().getSimpleName() + " AggregationData: " + aggregationData.getClass().getSimpleName();
    }

    /* renamed from: g */
    public static String m30533g(View.AggregationWindow aggregationWindow, AggregationWindowData aggregationWindowData) {
        return "AggregationWindow and AggregationWindowData types mismatch. AggregationWindow: " + aggregationWindow.getClass().getSimpleName() + " AggregationWindowData: " + aggregationWindowData.getClass().getSimpleName();
    }

    /* renamed from: h */
    public static ViewData m30532h(View view, Map map, AggregationWindowData aggregationWindowData, Timestamp timestamp, Timestamp timestamp2) {
        return new C10645r(view, map, aggregationWindowData, timestamp, timestamp2);
    }

    /* renamed from: i */
    public static void m30531i(boolean z, Aggregation aggregation, AggregationData aggregationData) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(m30534f(aggregation, aggregationData));
    }

    /* renamed from: j */
    public static void m30530j(boolean z, View.AggregationWindow aggregationWindow, AggregationWindowData aggregationWindowData) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(m30533g(aggregationWindow, aggregationWindowData));
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
            m30536d(view.getAggregation(), entry.getValue(), view.getMeasure());
            hashMap.put(Collections.unmodifiableList(new ArrayList(entry.getKey())), entry.getValue());
        }
        return m30532h(view, Collections.unmodifiableMap(hashMap), AggregationWindowData.CumulativeData.create(timestamp, timestamp2), timestamp, timestamp2);
    }
}