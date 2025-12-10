package ch.qos.logback.core.util;

import ch.qos.logback.core.CoreConstants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class Duration {

    /* renamed from: b */
    public static final Pattern f40168b = Pattern.compile("([0-9]*(.[0-9]+)?)\\s*(|milli(second)?|second(e)?|minute|hour|day)s?", 2);

    /* renamed from: a */
    public final long f40169a;

    public Duration(long j) {
        this.f40169a = j;
    }

    public static Duration buildByDays(double d) {
        return new Duration((long) (d * 8.64E7d));
    }

    public static Duration buildByHours(double d) {
        return new Duration((long) (d * 3600000.0d));
    }

    public static Duration buildByMilliseconds(double d) {
        return new Duration((long) d);
    }

    public static Duration buildByMinutes(double d) {
        return new Duration((long) (d * 60000.0d));
    }

    public static Duration buildBySeconds(double d) {
        return new Duration((long) (d * 1000.0d));
    }

    public static Duration buildUnbounded() {
        return new Duration(Long.MAX_VALUE);
    }

    public static Duration valueOf(String str) {
        Matcher matcher = f40168b.matcher(str);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("String value [" + str + "] is not in the expected format.");
        }
        String group = matcher.group(1);
        String group2 = matcher.group(3);
        double doubleValue = Double.valueOf(group).doubleValue();
        if (group2.equalsIgnoreCase("milli") || group2.equalsIgnoreCase("millisecond") || group2.length() == 0) {
            return buildByMilliseconds(doubleValue);
        }
        if (group2.equalsIgnoreCase("second") || group2.equalsIgnoreCase("seconde")) {
            return buildBySeconds(doubleValue);
        }
        if (group2.equalsIgnoreCase("minute")) {
            return buildByMinutes(doubleValue);
        }
        if (group2.equalsIgnoreCase("hour")) {
            return buildByHours(doubleValue);
        }
        if (group2.equalsIgnoreCase("day")) {
            return buildByDays(doubleValue);
        }
        throw new IllegalStateException("Unexpected " + group2);
    }

    public long getMilliseconds() {
        return this.f40169a;
    }

    public String toString() {
        StringBuilder sb;
        String str;
        long j = this.f40169a;
        if (j < 1000) {
            sb = new StringBuilder();
            sb.append(this.f40169a);
            str = " milliseconds";
        } else if (j < 60000) {
            sb = new StringBuilder();
            sb.append(this.f40169a / 1000);
            str = " seconds";
        } else if (j < CoreConstants.MILLIS_IN_ONE_HOUR) {
            sb = new StringBuilder();
            sb.append(this.f40169a / 60000);
            str = " minutes";
        } else {
            sb = new StringBuilder();
            sb.append(this.f40169a / CoreConstants.MILLIS_IN_ONE_HOUR);
            str = " hours";
        }
        sb.append(str);
        return sb.toString();
    }
}