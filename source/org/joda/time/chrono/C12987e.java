package org.joda.time.chrono;

import ch.qos.logback.core.CoreConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;

/* renamed from: org.joda.time.chrono.e */
/* loaded from: classes5.dex */
public final class C12987e extends ImpreciseDateTimeField {

    /* renamed from: d */
    public final BasicChronology f76128d;

    public C12987e(BasicChronology basicChronology) {
        super(DateTimeFieldType.weekyear(), basicChronology.getAverageMillisPerYear());
        this.f76128d = basicChronology;
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j, int i) {
        return i == 0 ? j : set(j, get(j) + i);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j, int i) {
        return add(j, i);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j) {
        return this.f76128d.getWeekyear(j);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j, long j2) {
        if (j < j2) {
            return -getDifference(j2, j);
        }
        int i = get(j);
        int i2 = get(j2);
        long remainder = remainder(j);
        long remainder2 = remainder(j2);
        if (remainder2 >= 31449600000L && this.f76128d.getWeeksInYear(i) <= 52) {
            remainder2 -= CoreConstants.MILLIS_IN_ONE_WEEK;
        }
        int i3 = i - i2;
        if (remainder < remainder2) {
            i3--;
        }
        return i3;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getLeapAmount(long j) {
        BasicChronology basicChronology = this.f76128d;
        return basicChronology.getWeeksInYear(basicChronology.getWeekyear(j)) - 52;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return this.f76128d.weeks();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.f76128d.getMaxYear();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.f76128d.getMinYear();
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return null;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j) {
        BasicChronology basicChronology = this.f76128d;
        if (basicChronology.getWeeksInYear(basicChronology.getWeekyear(j)) > 52) {
            return true;
        }
        return false;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j) {
        return j - roundFloor(j);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j) {
        long roundFloor = this.f76128d.weekOfWeekyear().roundFloor(j);
        int weekOfWeekyear = this.f76128d.getWeekOfWeekyear(roundFloor);
        if (weekOfWeekyear > 1) {
            return roundFloor - ((weekOfWeekyear - 1) * CoreConstants.MILLIS_IN_ONE_WEEK);
        }
        return roundFloor;
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j, int i) {
        FieldUtils.verifyValueBounds(this, Math.abs(i), this.f76128d.getMinYear(), this.f76128d.getMaxYear());
        int i2 = get(j);
        if (i2 == i) {
            return j;
        }
        int dayOfWeek = this.f76128d.getDayOfWeek(j);
        int weeksInYear = this.f76128d.getWeeksInYear(i2);
        int weeksInYear2 = this.f76128d.getWeeksInYear(i);
        if (weeksInYear2 < weeksInYear) {
            weeksInYear = weeksInYear2;
        }
        int weekOfWeekyear = this.f76128d.getWeekOfWeekyear(j);
        if (weekOfWeekyear <= weeksInYear) {
            weeksInYear = weekOfWeekyear;
        }
        long year = this.f76128d.setYear(j, i);
        int i3 = get(year);
        if (i3 < i) {
            year += CoreConstants.MILLIS_IN_ONE_WEEK;
        } else if (i3 > i) {
            year -= CoreConstants.MILLIS_IN_ONE_WEEK;
        }
        return this.f76128d.dayOfWeek().set(year + ((weeksInYear - this.f76128d.getWeekOfWeekyear(year)) * CoreConstants.MILLIS_IN_ONE_WEEK), dayOfWeek);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j, long j2) {
        return add(j, FieldUtils.safeToInt(j2));
    }
}
