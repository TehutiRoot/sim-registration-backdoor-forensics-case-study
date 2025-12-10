package io.opencensus.common;

import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class Duration implements Comparable<Duration> {
    public static Duration create(long j, int i) {
        if (j >= -315576000000L) {
            if (j <= 315576000000L) {
                if (i >= -999999999) {
                    if (i <= 999999999) {
                        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                        if ((i2 < 0 && i > 0) || (i2 > 0 && i < 0)) {
                            throw new IllegalArgumentException("'seconds' and 'nanos' have inconsistent sign: seconds=" + j + ", nanos=" + i);
                        }
                        return new C13162q8(j, i);
                    }
                    throw new IllegalArgumentException("'nanos' is greater than maximum (999999999): " + i);
                }
                throw new IllegalArgumentException("'nanos' is less than minimum (-999999999): " + i);
            }
            throw new IllegalArgumentException("'seconds' is greater than maximum (315576000000): " + j);
        }
        throw new IllegalArgumentException("'seconds' is less than minimum (-315576000000): " + j);
    }

    public static Duration fromMillis(long j) {
        return create(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public abstract int getNanos();

    public abstract long getSeconds();

    public long toMillis() {
        return TimeUnit.SECONDS.toMillis(getSeconds()) + TimeUnit.NANOSECONDS.toMillis(getNanos());
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int m25918b = AbstractC21420oT1.m25918b(getSeconds(), duration.getSeconds());
        return m25918b != 0 ? m25918b : AbstractC21420oT1.m25918b(getNanos(), duration.getNanos());
    }
}
