package io.opencensus.common;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class Timestamp implements Comparable<Timestamp> {
    /* renamed from: a */
    public static long m30610a(long j, long j2) {
        return BigDecimal.valueOf(j).divide(BigDecimal.valueOf(j2), 0, RoundingMode.FLOOR).longValue();
    }

    /* renamed from: b */
    public static long m30609b(long j, long j2) {
        return j - (m30610a(j, j2) * j2);
    }

    /* renamed from: c */
    public static Timestamp m30608c(long j, long j2) {
        return create(AbstractC20964lU1.m26807a(j, m30610a(j2, 1000000000L)), (int) m30609b(j2, 1000000000L));
    }

    public static Timestamp create(long j, int i) {
        if (j >= -315576000000L) {
            if (j <= 315576000000L) {
                if (i >= 0) {
                    if (i <= 999999999) {
                        return new C12331n9(j, i);
                    }
                    throw new IllegalArgumentException("'nanos' is greater than maximum (999999999): " + i);
                }
                throw new IllegalArgumentException("'nanos' is less than zero: " + i);
            }
            throw new IllegalArgumentException("'seconds' is greater than maximum (315576000000): " + j);
        }
        throw new IllegalArgumentException("'seconds' is less than minimum (-315576000000): " + j);
    }

    public static Timestamp fromMillis(long j) {
        return create(m30610a(j, 1000L), (int) (((int) m30609b(j, 1000L)) * 1000000));
    }

    public Timestamp addDuration(Duration duration) {
        return m30607d(duration.getSeconds(), duration.getNanos());
    }

    public Timestamp addNanos(long j) {
        return m30607d(0L, j);
    }

    /* renamed from: d */
    public final Timestamp m30607d(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return m30608c(AbstractC20964lU1.m26807a(AbstractC20964lU1.m26807a(getSeconds(), j), j2 / 1000000000), getNanos() + (j2 % 1000000000));
    }

    public abstract int getNanos();

    public abstract long getSeconds();

    public Duration subtractTimestamp(Timestamp timestamp) {
        long j;
        long seconds = getSeconds() - timestamp.getSeconds();
        int nanos = getNanos() - timestamp.getNanos();
        int i = (seconds > 0L ? 1 : (seconds == 0L ? 0 : -1));
        if (i < 0 && nanos > 0) {
            seconds++;
            j = nanos - 1000000000;
        } else {
            if (i > 0 && nanos < 0) {
                seconds--;
                j = nanos + 1000000000;
            }
            return Duration.create(seconds, nanos);
        }
        nanos = (int) j;
        return Duration.create(seconds, nanos);
    }

    @Override // java.lang.Comparable
    public int compareTo(Timestamp timestamp) {
        int m26806b = AbstractC20964lU1.m26806b(getSeconds(), timestamp.getSeconds());
        return m26806b != 0 ? m26806b : AbstractC20964lU1.m26806b(getNanos(), timestamp.getNanos());
    }
}