package org.apache.commons.p028io.file.attribute;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: org.apache.commons.io.file.attribute.FileTimes */
/* loaded from: classes6.dex */
public final class FileTimes {
    public static final FileTime EPOCH;

    /* renamed from: a */
    public static final long f73307a;

    /* renamed from: b */
    public static final long f73308b;

    static {
        Instant instant;
        FileTime from;
        instant = Instant.EPOCH;
        from = FileTime.from(instant);
        EPOCH = from;
        f73307a = TimeUnit.SECONDS.toNanos(1L) / 100;
        f73308b = TimeUnit.MILLISECONDS.toNanos(1L) / 100;
    }

    public static FileTime fromUnixTime(long j) {
        FileTime from;
        from = FileTime.from(j, TimeUnit.SECONDS);
        return from;
    }

    public static boolean isUnixTime(long j) {
        return -2147483648L <= j && j <= 2147483647L;
    }

    public static FileTime minusMillis(FileTime fileTime, long j) {
        Instant instant;
        Instant minusMillis;
        FileTime from;
        instant = fileTime.toInstant();
        minusMillis = instant.minusMillis(j);
        from = FileTime.from(minusMillis);
        return from;
    }

    public static FileTime minusNanos(FileTime fileTime, long j) {
        Instant instant;
        Instant minusNanos;
        FileTime from;
        instant = fileTime.toInstant();
        minusNanos = instant.minusNanos(j);
        from = FileTime.from(minusNanos);
        return from;
    }

    public static FileTime minusSeconds(FileTime fileTime, long j) {
        Instant instant;
        Instant minusSeconds;
        FileTime from;
        instant = fileTime.toInstant();
        minusSeconds = instant.minusSeconds(j);
        from = FileTime.from(minusSeconds);
        return from;
    }

    public static FileTime now() {
        Instant now;
        FileTime from;
        now = Instant.now();
        from = FileTime.from(now);
        return from;
    }

    public static Date ntfsTimeToDate(long j) {
        return new Date(AbstractC0745KX.m67609a(AbstractC0677JX.m67743a(j, -116444736000000000L), f73308b));
    }

    public static FileTime ntfsTimeToFileTime(long j) {
        Instant ofEpochSecond;
        FileTime from;
        long m67743a = AbstractC0677JX.m67743a(j, -116444736000000000L);
        long j2 = f73307a;
        ofEpochSecond = Instant.ofEpochSecond(AbstractC0745KX.m67609a(m67743a, j2), AbstractC0809LX.m67510a(m67743a, j2) * 100);
        from = FileTime.from(ofEpochSecond);
        return from;
    }

    public static FileTime plusMillis(FileTime fileTime, long j) {
        Instant instant;
        Instant plusMillis;
        FileTime from;
        instant = fileTime.toInstant();
        plusMillis = instant.plusMillis(j);
        from = FileTime.from(plusMillis);
        return from;
    }

    public static FileTime plusNanos(FileTime fileTime, long j) {
        Instant instant;
        Instant plusNanos;
        FileTime from;
        instant = fileTime.toInstant();
        plusNanos = instant.plusNanos(j);
        from = FileTime.from(plusNanos);
        return from;
    }

    public static FileTime plusSeconds(FileTime fileTime, long j) {
        Instant instant;
        Instant plusSeconds;
        FileTime from;
        instant = fileTime.toInstant();
        plusSeconds = instant.plusSeconds(j);
        from = FileTime.from(plusSeconds);
        return from;
    }

    public static void setLastModifiedTime(Path path) throws IOException {
        Files.setLastModifiedTime(path, now());
    }

    public static Date toDate(FileTime fileTime) {
        long millis;
        if (fileTime != null) {
            millis = fileTime.toMillis();
            return new Date(millis);
        }
        return null;
    }

    public static FileTime toFileTime(Date date) {
        FileTime fromMillis;
        if (date != null) {
            fromMillis = FileTime.fromMillis(date.getTime());
            return fromMillis;
        }
        return null;
    }

    public static long toNtfsTime(Date date) {
        return AbstractC0876MX.m67367a(date.getTime() * f73308b, -116444736000000000L);
    }

    public static long toUnixTime(FileTime fileTime) {
        long j;
        if (fileTime != null) {
            j = fileTime.to(TimeUnit.SECONDS);
            return j;
        }
        return 0L;
    }

    public static boolean isUnixTime(FileTime fileTime) {
        return isUnixTime(toUnixTime(fileTime));
    }

    public static long toNtfsTime(FileTime fileTime) {
        Instant instant;
        long epochSecond;
        int nano;
        instant = fileTime.toInstant();
        epochSecond = instant.getEpochSecond();
        nano = instant.getNano();
        return AbstractC0876MX.m67367a((epochSecond * f73307a) + (nano / 100), -116444736000000000L);
    }

    public static long toNtfsTime(long j) {
        return AbstractC0876MX.m67367a(j * f73308b, -116444736000000000L);
    }
}
