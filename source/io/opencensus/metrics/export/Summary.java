package io.opencensus.metrics.export;

import io.opencensus.internal.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class Summary {

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class Snapshot {

        @Immutable
        /* loaded from: classes5.dex */
        public static abstract class ValueAtPercentile {
            public static ValueAtPercentile create(double d, double d2) {
                boolean z;
                boolean z2 = false;
                if (0.0d < d && d <= 100.0d) {
                    z = true;
                } else {
                    z = false;
                }
                Utils.checkArgument(z, "percentile must be in the interval (0.0, 100.0]");
                if (d2 >= 0.0d) {
                    z2 = true;
                }
                Utils.checkArgument(z2, "value must be non-negative");
                return new C10618g(d, d2);
            }

            public abstract double getPercentile();

            public abstract double getValue();
        }

        public static Snapshot create(@Nullable Long l, @Nullable Double d, List<ValueAtPercentile> list) {
            Summary.m30218b(l, d);
            Utils.checkListElementNotNull((List) Utils.checkNotNull(list, "valueAtPercentiles"), "valueAtPercentile");
            return new C10617f(l, d, Collections.unmodifiableList(new ArrayList(list)));
        }

        @Nullable
        public abstract Long getCount();

        @Nullable
        public abstract Double getSum();

        public abstract List<ValueAtPercentile> getValueAtPercentiles();
    }

    /* renamed from: b */
    public static void m30218b(Long l, Double d) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (l != null && l.longValue() < 0) {
            z = false;
        } else {
            z = true;
        }
        Utils.checkArgument(z, "count must be non-negative.");
        if (d != null && d.doubleValue() < 0.0d) {
            z2 = false;
        } else {
            z2 = true;
        }
        Utils.checkArgument(z2, "sum must be non-negative.");
        if (l != null && l.longValue() == 0) {
            if (d != null && d.doubleValue() != 0.0d) {
                z3 = false;
            }
            Utils.checkArgument(z3, "sum must be 0 if count is 0.");
        }
    }

    public static Summary create(@Nullable Long l, @Nullable Double d, Snapshot snapshot) {
        m30218b(l, d);
        Utils.checkNotNull(snapshot, "snapshot");
        return new C10616e(l, d, snapshot);
    }

    @Nullable
    public abstract Long getCount();

    public abstract Snapshot getSnapshot();

    @Nullable
    public abstract Double getSum();
}
