package io.opencensus.stats;

import io.opencensus.common.Function;
import io.opencensus.internal.Utils;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class Aggregation {

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class Count extends Aggregation {

        /* renamed from: a */
        public static final Count f63574a = new C10648h();

        public Count() {
            super();
        }

        public static Count create() {
            return f63574a;
        }

        @Override // io.opencensus.stats.Aggregation
        public final <T> T match(Function<? super Sum, T> function, Function<? super Count, T> function2, Function<? super Distribution, T> function3, Function<? super LastValue, T> function4, Function<? super Aggregation, T> function5) {
            return function2.apply(this);
        }
    }

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class Distribution extends Aggregation {
        public Distribution() {
            super();
        }

        public static Distribution create(BucketBoundaries bucketBoundaries) {
            Utils.checkNotNull(bucketBoundaries, "bucketBoundaries");
            return new C10649i(bucketBoundaries);
        }

        public abstract BucketBoundaries getBucketBoundaries();

        @Override // io.opencensus.stats.Aggregation
        public final <T> T match(Function<? super Sum, T> function, Function<? super Count, T> function2, Function<? super Distribution, T> function3, Function<? super LastValue, T> function4, Function<? super Aggregation, T> function5) {
            return function3.apply(this);
        }
    }

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class LastValue extends Aggregation {

        /* renamed from: a */
        public static final LastValue f63575a = new C10650j();

        public LastValue() {
            super();
        }

        public static LastValue create() {
            return f63575a;
        }

        @Override // io.opencensus.stats.Aggregation
        public final <T> T match(Function<? super Sum, T> function, Function<? super Count, T> function2, Function<? super Distribution, T> function3, Function<? super LastValue, T> function4, Function<? super Aggregation, T> function5) {
            return function4.apply(this);
        }
    }

    @Deprecated
    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class Mean extends Aggregation {

        /* renamed from: a */
        public static final Mean f63576a = new C10651k();

        public Mean() {
            super();
        }

        public static Mean create() {
            return f63576a;
        }

        @Override // io.opencensus.stats.Aggregation
        public final <T> T match(Function<? super Sum, T> function, Function<? super Count, T> function2, Function<? super Distribution, T> function3, Function<? super LastValue, T> function4, Function<? super Aggregation, T> function5) {
            return function5.apply(this);
        }
    }

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class Sum extends Aggregation {

        /* renamed from: a */
        public static final Sum f63577a = new C10652l();

        public Sum() {
            super();
        }

        public static Sum create() {
            return f63577a;
        }

        @Override // io.opencensus.stats.Aggregation
        public final <T> T match(Function<? super Sum, T> function, Function<? super Count, T> function2, Function<? super Distribution, T> function3, Function<? super LastValue, T> function4, Function<? super Aggregation, T> function5) {
            return function.apply(this);
        }
    }

    public abstract <T> T match(Function<? super Sum, T> function, Function<? super Count, T> function2, Function<? super Distribution, T> function3, Function<? super LastValue, T> function4, Function<? super Aggregation, T> function5);

    public Aggregation() {
    }
}
