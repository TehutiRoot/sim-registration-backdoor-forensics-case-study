package org.apache.commons.p028io;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalAmount;
import kotlin.time.DurationKt;

/* renamed from: org.apache.commons.io.ThreadUtils */
/* loaded from: classes6.dex */
public final class ThreadUtils {
    /* renamed from: a */
    public static int m25312a(Duration duration) {
        int nano;
        nano = duration.getNano();
        return nano % DurationKt.NANOS_IN_MILLIS;
    }

    public static void sleep(Duration duration) throws InterruptedException {
        Instant now;
        Instant plus;
        long millis;
        Instant now2;
        boolean isNegative;
        now = Instant.now();
        plus = now.plus((TemporalAmount) duration);
        do {
            millis = duration.toMillis();
            Thread.sleep(millis, m25312a(duration));
            now2 = Instant.now();
            duration = Duration.between(now2, plus);
            isNegative = duration.isNegative();
        } while (!isNegative);
    }
}
