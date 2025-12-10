package io.opencensus.metrics.export;

import io.opencensus.common.Function;
import io.opencensus.internal.Utils;
import io.opencensus.metrics.data.Exemplar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class Distribution {

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class BucketOptions {

        @Immutable
        /* loaded from: classes5.dex */
        public static abstract class ExplicitOptions extends BucketOptions {
            public ExplicitOptions() {
                super();
            }

            /* renamed from: b */
            public static void m30224b(List list) {
                boolean z;
                boolean z2;
                if (list.size() >= 1) {
                    double doubleValue = ((Double) Utils.checkNotNull(list.get(0), "bucketBoundary")).doubleValue();
                    if (doubleValue > 0.0d) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Utils.checkArgument(z, "bucket boundary should be > 0");
                    int i = 1;
                    while (i < list.size()) {
                        double doubleValue2 = ((Double) Utils.checkNotNull(list.get(i), "bucketBoundary")).doubleValue();
                        if (doubleValue < doubleValue2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        Utils.checkArgument(z2, "bucket boundaries not sorted.");
                        i++;
                        doubleValue = doubleValue2;
                    }
                }
            }

            /* renamed from: c */
            public static ExplicitOptions m30223c(List list) {
                Utils.checkNotNull(list, "bucketBoundaries");
                List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
                m30224b(unmodifiableList);
                return new C10614c(unmodifiableList);
            }

            public abstract List<Double> getBucketBoundaries();

            @Override // io.opencensus.metrics.export.Distribution.BucketOptions
            public final <T> T match(Function<? super ExplicitOptions, T> function, Function<? super BucketOptions, T> function2) {
                return function.apply(this);
            }
        }

        public static BucketOptions explicitOptions(List<Double> list) {
            return ExplicitOptions.m30223c(list);
        }

        public abstract <T> T match(Function<? super ExplicitOptions, T> function, Function<? super BucketOptions, T> function2);

        public BucketOptions() {
        }
    }

    public static Distribution create(long j, double d, double d2, BucketOptions bucketOptions, List<Bucket> list) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Utils.checkArgument(z, "count should be non-negative.");
        int i2 = (d2 > 0.0d ? 1 : (d2 == 0.0d ? 0 : -1));
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Utils.checkArgument(z2, "sum of squared deviations should be non-negative.");
        if (i == 0) {
            if (d == 0.0d) {
                z3 = true;
            } else {
                z3 = false;
            }
            Utils.checkArgument(z3, "sum should be 0 if count is 0.");
            if (i2 == 0) {
                z4 = true;
            }
            Utils.checkArgument(z4, "sum of squared deviations should be 0 if count is 0.");
        }
        Utils.checkNotNull(bucketOptions, "bucketOptions");
        List unmodifiableList = Collections.unmodifiableList(new ArrayList((Collection) Utils.checkNotNull(list, "buckets")));
        Utils.checkListElementNotNull(unmodifiableList, "bucket");
        return new C10612a(j, d, d2, bucketOptions, unmodifiableList);
    }

    @Nullable
    public abstract BucketOptions getBucketOptions();

    public abstract List<Bucket> getBuckets();

    public abstract long getCount();

    public abstract double getSum();

    public abstract double getSumOfSquaredDeviations();

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class Bucket {
        public static Bucket create(long j) {
            Utils.checkArgument(j >= 0, "bucket count should be non-negative.");
            return new C10613b(j, null);
        }

        public abstract long getCount();

        @Nullable
        public abstract Exemplar getExemplar();

        public static Bucket create(long j, Exemplar exemplar) {
            Utils.checkArgument(j >= 0, "bucket count should be non-negative.");
            Utils.checkNotNull(exemplar, "exemplar");
            return new C10613b(j, exemplar);
        }
    }
}
