package org.joda.time.base;

import org.joda.convert.ToString;
import org.joda.time.Duration;
import org.joda.time.Period;
import org.joda.time.ReadableDuration;
import org.joda.time.format.FormatUtils;

/* loaded from: classes5.dex */
public abstract class AbstractDuration implements ReadableDuration {
    @Override // org.joda.time.ReadableDuration
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ReadableDuration) && getMillis() == ((ReadableDuration) obj).getMillis()) {
            return true;
        }
        return false;
    }

    @Override // org.joda.time.ReadableDuration
    public int hashCode() {
        long millis = getMillis();
        return (int) (millis ^ (millis >>> 32));
    }

    @Override // org.joda.time.ReadableDuration
    public boolean isEqual(ReadableDuration readableDuration) {
        if (readableDuration == null) {
            readableDuration = Duration.ZERO;
        }
        if (compareTo(readableDuration) == 0) {
            return true;
        }
        return false;
    }

    @Override // org.joda.time.ReadableDuration
    public boolean isLongerThan(ReadableDuration readableDuration) {
        if (readableDuration == null) {
            readableDuration = Duration.ZERO;
        }
        if (compareTo(readableDuration) > 0) {
            return true;
        }
        return false;
    }

    @Override // org.joda.time.ReadableDuration
    public boolean isShorterThan(ReadableDuration readableDuration) {
        if (readableDuration == null) {
            readableDuration = Duration.ZERO;
        }
        if (compareTo(readableDuration) < 0) {
            return true;
        }
        return false;
    }

    @Override // org.joda.time.ReadableDuration
    public Duration toDuration() {
        return new Duration(getMillis());
    }

    @Override // org.joda.time.ReadableDuration
    public Period toPeriod() {
        return new Period(getMillis());
    }

    @Override // org.joda.time.ReadableDuration
    @ToString
    public String toString() {
        boolean z;
        int i;
        long millis = getMillis();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PT");
        if (millis < 0) {
            z = true;
        } else {
            z = false;
        }
        FormatUtils.appendUnpaddedInteger(stringBuffer, millis);
        while (true) {
            int length = stringBuffer.length();
            if (z) {
                i = 7;
            } else {
                i = 6;
            }
            int i2 = 3;
            if (length >= i) {
                break;
            }
            if (!z) {
                i2 = 2;
            }
            stringBuffer.insert(i2, "0");
        }
        if ((millis / 1000) * 1000 == millis) {
            stringBuffer.setLength(stringBuffer.length() - 3);
        } else {
            stringBuffer.insert(stringBuffer.length() - 3, ".");
        }
        stringBuffer.append('S');
        return stringBuffer.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(ReadableDuration readableDuration) {
        int i = (getMillis() > readableDuration.getMillis() ? 1 : (getMillis() == readableDuration.getMillis() ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }
}
