package io.opencensus.stats;

import io.opencensus.common.Duration;
import io.opencensus.common.Function;
import io.opencensus.internal.StringUtils;
import io.opencensus.internal.Utils;
import io.opencensus.tags.TagKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class View {

    /* renamed from: a */
    public static final Comparator f63581a = new C10627a();

    @Deprecated
    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class AggregationWindow {

        @Deprecated
        @Immutable
        /* loaded from: classes5.dex */
        public static abstract class Cumulative extends AggregationWindow {

            /* renamed from: a */
            public static final Cumulative f63582a = new C10661u();

            public Cumulative() {
                super(null);
            }

            public static Cumulative create() {
                return f63582a;
            }

            @Override // io.opencensus.stats.View.AggregationWindow
            public final <T> T match(Function<? super Cumulative, T> function, Function<? super Interval, T> function2, Function<? super AggregationWindow, T> function3) {
                return function.apply(this);
            }
        }

        @Deprecated
        @Immutable
        /* loaded from: classes5.dex */
        public static abstract class Interval extends AggregationWindow {

            /* renamed from: a */
            public static final Duration f63583a = Duration.create(0, 0);

            public Interval() {
                super(null);
            }

            public static Interval create(Duration duration) {
                boolean z;
                if (duration.compareTo(f63583a) > 0) {
                    z = true;
                } else {
                    z = false;
                }
                Utils.checkArgument(z, "Duration must be positive");
                return new C10662v(duration);
            }

            public abstract Duration getDuration();

            @Override // io.opencensus.stats.View.AggregationWindow
            public final <T> T match(Function<? super Cumulative, T> function, Function<? super Interval, T> function2, Function<? super AggregationWindow, T> function3) {
                return function2.apply(this);
            }
        }

        public /* synthetic */ AggregationWindow(C10627a c10627a) {
            this();
        }

        public abstract <T> T match(Function<? super Cumulative, T> function, Function<? super Interval, T> function2, Function<? super AggregationWindow, T> function3);

        public AggregationWindow() {
        }
    }

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class Name {
        public static Name create(String str) {
            boolean z;
            if (StringUtils.isPrintableString(str) && str.length() <= 255) {
                z = true;
            } else {
                z = false;
            }
            Utils.checkArgument(z, "Name should be a ASCII string with a length no greater than 255 characters.");
            return new C10663w(str);
        }

        public abstract String asString();
    }

    /* renamed from: io.opencensus.stats.View$a */
    /* loaded from: classes5.dex */
    public class C10627a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(TagKey tagKey, TagKey tagKey2) {
            return tagKey.getName().compareToIgnoreCase(tagKey2.getName());
        }
    }

    @Deprecated
    public static View create(Name name, String str, Measure measure, Aggregation aggregation, List<TagKey> list, AggregationWindow aggregationWindow) {
        Utils.checkArgument(new HashSet(list).size() == list.size(), "Columns have duplicate.");
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, f63581a);
        return new C10657q(name, str, measure, aggregation, Collections.unmodifiableList(arrayList), aggregationWindow);
    }

    public abstract Aggregation getAggregation();

    public abstract List<TagKey> getColumns();

    public abstract String getDescription();

    public abstract Measure getMeasure();

    public abstract Name getName();

    @Deprecated
    public abstract AggregationWindow getWindow();

    public static View create(Name name, String str, Measure measure, Aggregation aggregation, List<TagKey> list) {
        Utils.checkArgument(new HashSet(list).size() == list.size(), "Columns have duplicate.");
        return create(name, str, measure, aggregation, list, AggregationWindow.Cumulative.create());
    }
}
