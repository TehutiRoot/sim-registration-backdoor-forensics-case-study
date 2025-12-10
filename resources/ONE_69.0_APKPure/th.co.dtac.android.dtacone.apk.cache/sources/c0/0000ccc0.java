package io.opencensus.stats;

import io.opencensus.common.Function;
import io.opencensus.internal.Utils;
import io.opencensus.metrics.data.Exemplar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class AggregationData {

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class CountData extends AggregationData {
        public CountData() {
            super();
        }

        public static CountData create(long j) {
            return new C10628a(j);
        }

        public abstract long getCount();

        @Override // io.opencensus.stats.AggregationData
        public final <T> T match(Function<? super SumDataDouble, T> function, Function<? super SumDataLong, T> function2, Function<? super CountData, T> function3, Function<? super DistributionData, T> function4, Function<? super LastValueDataDouble, T> function5, Function<? super LastValueDataLong, T> function6, Function<? super AggregationData, T> function7) {
            return function3.apply(this);
        }
    }

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class DistributionData extends AggregationData {
        public DistributionData() {
            super();
        }

        @Deprecated
        public static DistributionData create(double d, long j, double d2, double d3, double d4, List<Long> list, List<Exemplar> list2) {
            return create(d, j, d4, list, list2);
        }

        public abstract List<Long> getBucketCounts();

        public abstract long getCount();

        public abstract List<Exemplar> getExemplars();

        @Deprecated
        public double getMax() {
            return 0.0d;
        }

        public abstract double getMean();

        @Deprecated
        public double getMin() {
            return 0.0d;
        }

        public abstract double getSumOfSquaredDeviations();

        @Override // io.opencensus.stats.AggregationData
        public final <T> T match(Function<? super SumDataDouble, T> function, Function<? super SumDataLong, T> function2, Function<? super CountData, T> function3, Function<? super DistributionData, T> function4, Function<? super LastValueDataDouble, T> function5, Function<? super LastValueDataLong, T> function6, Function<? super AggregationData, T> function7) {
            return function4.apply(this);
        }

        public static DistributionData create(double d, long j, double d2, List<Long> list, List<Exemplar> list2) {
            List<Long> unmodifiableList = Collections.unmodifiableList(new ArrayList((Collection) Utils.checkNotNull(list, "bucketCounts")));
            for (Long l : unmodifiableList) {
                Utils.checkNotNull(l, "bucketCount");
            }
            Utils.checkNotNull(list2, "exemplars");
            for (Exemplar exemplar : list2) {
                Utils.checkNotNull(exemplar, "exemplar");
            }
            return new C10629b(d, j, d2, unmodifiableList, Collections.unmodifiableList(new ArrayList(list2)));
        }

        @Deprecated
        public static DistributionData create(double d, long j, double d2, double d3, double d4, List<Long> list) {
            return create(d, j, d4, list, Collections.emptyList());
        }

        public static DistributionData create(double d, long j, double d2, List<Long> list) {
            return create(d, j, d2, list, Collections.emptyList());
        }
    }

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class LastValueDataDouble extends AggregationData {
        public LastValueDataDouble() {
            super();
        }

        public static LastValueDataDouble create(double d) {
            return new C10630c(d);
        }

        public abstract double getLastValue();

        @Override // io.opencensus.stats.AggregationData
        public final <T> T match(Function<? super SumDataDouble, T> function, Function<? super SumDataLong, T> function2, Function<? super CountData, T> function3, Function<? super DistributionData, T> function4, Function<? super LastValueDataDouble, T> function5, Function<? super LastValueDataLong, T> function6, Function<? super AggregationData, T> function7) {
            return function5.apply(this);
        }
    }

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class LastValueDataLong extends AggregationData {
        public LastValueDataLong() {
            super();
        }

        public static LastValueDataLong create(long j) {
            return new C10631d(j);
        }

        public abstract long getLastValue();

        @Override // io.opencensus.stats.AggregationData
        public final <T> T match(Function<? super SumDataDouble, T> function, Function<? super SumDataLong, T> function2, Function<? super CountData, T> function3, Function<? super DistributionData, T> function4, Function<? super LastValueDataDouble, T> function5, Function<? super LastValueDataLong, T> function6, Function<? super AggregationData, T> function7) {
            return function6.apply(this);
        }
    }

    @Deprecated
    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class MeanData extends AggregationData {
        public MeanData() {
            super();
        }

        public static MeanData create(double d, long j) {
            return new C10632e(d, j);
        }

        public abstract long getCount();

        public abstract double getMean();

        @Override // io.opencensus.stats.AggregationData
        public final <T> T match(Function<? super SumDataDouble, T> function, Function<? super SumDataLong, T> function2, Function<? super CountData, T> function3, Function<? super DistributionData, T> function4, Function<? super LastValueDataDouble, T> function5, Function<? super LastValueDataLong, T> function6, Function<? super AggregationData, T> function7) {
            return function7.apply(this);
        }
    }

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class SumDataDouble extends AggregationData {
        public SumDataDouble() {
            super();
        }

        public static SumDataDouble create(double d) {
            return new C10633f(d);
        }

        public abstract double getSum();

        @Override // io.opencensus.stats.AggregationData
        public final <T> T match(Function<? super SumDataDouble, T> function, Function<? super SumDataLong, T> function2, Function<? super CountData, T> function3, Function<? super DistributionData, T> function4, Function<? super LastValueDataDouble, T> function5, Function<? super LastValueDataLong, T> function6, Function<? super AggregationData, T> function7) {
            return function.apply(this);
        }
    }

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class SumDataLong extends AggregationData {
        public SumDataLong() {
            super();
        }

        public static SumDataLong create(long j) {
            return new C10634g(j);
        }

        public abstract long getSum();

        @Override // io.opencensus.stats.AggregationData
        public final <T> T match(Function<? super SumDataDouble, T> function, Function<? super SumDataLong, T> function2, Function<? super CountData, T> function3, Function<? super DistributionData, T> function4, Function<? super LastValueDataDouble, T> function5, Function<? super LastValueDataLong, T> function6, Function<? super AggregationData, T> function7) {
            return function2.apply(this);
        }
    }

    public abstract <T> T match(Function<? super SumDataDouble, T> function, Function<? super SumDataLong, T> function2, Function<? super CountData, T> function3, Function<? super DistributionData, T> function4, Function<? super LastValueDataDouble, T> function5, Function<? super LastValueDataLong, T> function6, Function<? super AggregationData, T> function7);

    public AggregationData() {
    }
}