package io.opencensus.stats;

import io.opencensus.common.Function;
import io.opencensus.internal.StringUtils;
import io.opencensus.internal.Utils;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class Measure {

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class MeasureDouble extends Measure {
        public MeasureDouble() {
            super();
        }

        public static MeasureDouble create(String str, String str2, String str3) {
            boolean z;
            if (StringUtils.isPrintableString(str) && str.length() <= 255) {
                z = true;
            } else {
                z = false;
            }
            Utils.checkArgument(z, "Name should be a ASCII string with a length no greater than 255 characters.");
            return new C10653m(str, str2, str3);
        }

        @Override // io.opencensus.stats.Measure
        public abstract String getDescription();

        @Override // io.opencensus.stats.Measure
        public abstract String getName();

        @Override // io.opencensus.stats.Measure
        public abstract String getUnit();

        @Override // io.opencensus.stats.Measure
        public <T> T match(Function<? super MeasureDouble, T> function, Function<? super MeasureLong, T> function2, Function<? super Measure, T> function3) {
            return function.apply(this);
        }
    }

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class MeasureLong extends Measure {
        public MeasureLong() {
            super();
        }

        public static MeasureLong create(String str, String str2, String str3) {
            boolean z;
            if (StringUtils.isPrintableString(str) && str.length() <= 255) {
                z = true;
            } else {
                z = false;
            }
            Utils.checkArgument(z, "Name should be a ASCII string with a length no greater than 255 characters.");
            return new C10654n(str, str2, str3);
        }

        @Override // io.opencensus.stats.Measure
        public abstract String getDescription();

        @Override // io.opencensus.stats.Measure
        public abstract String getName();

        @Override // io.opencensus.stats.Measure
        public abstract String getUnit();

        @Override // io.opencensus.stats.Measure
        public <T> T match(Function<? super MeasureDouble, T> function, Function<? super MeasureLong, T> function2, Function<? super Measure, T> function3) {
            return function2.apply(this);
        }
    }

    public abstract String getDescription();

    public abstract String getName();

    public abstract String getUnit();

    public abstract <T> T match(Function<? super MeasureDouble, T> function, Function<? super MeasureLong, T> function2, Function<? super Measure, T> function3);

    public Measure() {
    }
}
