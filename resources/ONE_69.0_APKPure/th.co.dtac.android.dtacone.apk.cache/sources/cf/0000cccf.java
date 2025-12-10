package io.opencensus.stats;

import io.opencensus.common.Function;
import io.opencensus.stats.Measure;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class Measurement {

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class MeasurementDouble extends Measurement {
        public MeasurementDouble() {
            super();
        }

        public static MeasurementDouble create(Measure.MeasureDouble measureDouble, double d) {
            return new C10642o(measureDouble, d);
        }

        @Override // io.opencensus.stats.Measurement
        public abstract Measure.MeasureDouble getMeasure();

        public abstract double getValue();

        @Override // io.opencensus.stats.Measurement
        public <T> T match(Function<? super MeasurementDouble, T> function, Function<? super MeasurementLong, T> function2, Function<? super Measurement, T> function3) {
            return function.apply(this);
        }
    }

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class MeasurementLong extends Measurement {
        public MeasurementLong() {
            super();
        }

        public static MeasurementLong create(Measure.MeasureLong measureLong, long j) {
            return new C10643p(measureLong, j);
        }

        @Override // io.opencensus.stats.Measurement
        public abstract Measure.MeasureLong getMeasure();

        public abstract long getValue();

        @Override // io.opencensus.stats.Measurement
        public <T> T match(Function<? super MeasurementDouble, T> function, Function<? super MeasurementLong, T> function2, Function<? super Measurement, T> function3) {
            return function2.apply(this);
        }
    }

    public abstract Measure getMeasure();

    public abstract <T> T match(Function<? super MeasurementDouble, T> function, Function<? super MeasurementLong, T> function2, Function<? super Measurement, T> function3);

    public Measurement() {
    }
}