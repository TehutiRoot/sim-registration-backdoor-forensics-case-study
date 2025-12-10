package io.opencensus.metrics.export;

import io.opencensus.common.Function;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class Value {

    /* renamed from: io.opencensus.metrics.export.Value$a */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC10608a extends Value {
        /* renamed from: a */
        public static AbstractC10608a m30216a(Distribution distribution) {
            return new C10619h(distribution);
        }

        /* renamed from: b */
        public abstract Distribution mo30212b();

        @Override // io.opencensus.metrics.export.Value
        public final Object match(Function function, Function function2, Function function3, Function function4, Function function5) {
            return function3.apply(mo30212b());
        }
    }

    /* renamed from: io.opencensus.metrics.export.Value$b */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC10609b extends Value {
        /* renamed from: a */
        public static AbstractC10609b m30215a(double d) {
            return new C10620i(d);
        }

        /* renamed from: b */
        public abstract double mo30211b();

        @Override // io.opencensus.metrics.export.Value
        public final Object match(Function function, Function function2, Function function3, Function function4, Function function5) {
            return function.apply(Double.valueOf(mo30211b()));
        }
    }

    /* renamed from: io.opencensus.metrics.export.Value$c */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC10610c extends Value {
        /* renamed from: a */
        public static AbstractC10610c m30214a(long j) {
            return new C10621j(j);
        }

        /* renamed from: b */
        public abstract long mo30210b();

        @Override // io.opencensus.metrics.export.Value
        public final Object match(Function function, Function function2, Function function3, Function function4, Function function5) {
            return function2.apply(Long.valueOf(mo30210b()));
        }
    }

    /* renamed from: io.opencensus.metrics.export.Value$d */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC10611d extends Value {
        /* renamed from: a */
        public static AbstractC10611d m30213a(Summary summary) {
            return new C10622k(summary);
        }

        /* renamed from: b */
        public abstract Summary mo30209b();

        @Override // io.opencensus.metrics.export.Value
        public final Object match(Function function, Function function2, Function function3, Function function4, Function function5) {
            return function4.apply(mo30209b());
        }
    }

    public static Value distributionValue(Distribution distribution) {
        return AbstractC10608a.m30216a(distribution);
    }

    public static Value doubleValue(double d) {
        return AbstractC10609b.m30215a(d);
    }

    public static Value longValue(long j) {
        return AbstractC10610c.m30214a(j);
    }

    public static Value summaryValue(Summary summary) {
        return AbstractC10611d.m30213a(summary);
    }

    public abstract <T> T match(Function<? super Double, T> function, Function<? super Long, T> function2, Function<? super Distribution, T> function3, Function<? super Summary, T> function4, Function<? super Value, T> function5);
}
