package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;

/* renamed from: org.joda.time.chrono.c */
/* loaded from: classes5.dex */
public class C12985c extends ImpreciseDateTimeField {

    /* renamed from: d */
    public final BasicChronology f76124d;

    /* renamed from: e */
    public final int f76125e;

    /* renamed from: f */
    public final int f76126f;

    public C12985c(BasicChronology basicChronology, int i) {
        super(DateTimeFieldType.monthOfYear(), basicChronology.getAverageMillisPerMonth());
        this.f76124d = basicChronology;
        this.f76125e = basicChronology.getMaxMonth();
        this.f76126f = i;
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j, int i) {
        int i2;
        int i3;
        if (i == 0) {
            return j;
        }
        long millisOfDay = this.f76124d.getMillisOfDay(j);
        int year = this.f76124d.getYear(j);
        int monthOfYear = this.f76124d.getMonthOfYear(j, year);
        int i4 = (monthOfYear - 1) + i;
        if (i4 >= 0) {
            int i5 = this.f76125e;
            i2 = (i4 / i5) + year;
            i3 = (i4 % i5) + 1;
        } else {
            i2 = year + (i4 / this.f76125e);
            int i6 = i2 - 1;
            int abs = Math.abs(i4);
            int i7 = this.f76125e;
            int i8 = abs % i7;
            if (i8 == 0) {
                i8 = i7;
            }
            i3 = (i7 - i8) + 1;
            if (i3 != 1) {
                i2 = i6;
            }
        }
        int dayOfMonth = this.f76124d.getDayOfMonth(j, year, monthOfYear);
        int daysInYearMonth = this.f76124d.getDaysInYearMonth(i2, i3);
        if (dayOfMonth > daysInYearMonth) {
            dayOfMonth = daysInYearMonth;
        }
        return this.f76124d.getYearMonthDayMillis(i2, i3, dayOfMonth) + millisOfDay;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j, int i) {
        return set(j, FieldUtils.getWrappedValue(get(j), i, 1, this.f76125e));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j) {
        return this.f76124d.getMonthOfYear(j);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j, long j2) {
        if (j < j2) {
            return -getDifference(j2, j);
        }
        int year = this.f76124d.getYear(j);
        int monthOfYear = this.f76124d.getMonthOfYear(j, year);
        int year2 = this.f76124d.getYear(j2);
        int monthOfYear2 = this.f76124d.getMonthOfYear(j2, year2);
        long j3 = (((year - year2) * this.f76125e) + monthOfYear) - monthOfYear2;
        int dayOfMonth = this.f76124d.getDayOfMonth(j, year, monthOfYear);
        if (dayOfMonth == this.f76124d.getDaysInYearMonth(year, monthOfYear) && this.f76124d.getDayOfMonth(j2, year2, monthOfYear2) > dayOfMonth) {
            j2 = this.f76124d.dayOfMonth().set(j2, dayOfMonth);
        }
        if (j - this.f76124d.getYearMonthMillis(year, monthOfYear) < j2 - this.f76124d.getYearMonthMillis(year2, monthOfYear2)) {
            return j3 - 1;
        }
        return j3;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getLeapAmount(long j) {
        return isLeap(j) ? 1 : 0;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return this.f76124d.days();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.f76125e;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 1;
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.f76124d.years();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j) {
        int year = this.f76124d.getYear(j);
        if (!this.f76124d.isLeapYear(year) || this.f76124d.getMonthOfYear(j, year) != this.f76126f) {
            return false;
        }
        return true;
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
        int year = this.f76124d.getYear(j);
        return this.f76124d.getYearMonthMillis(year, this.f76124d.getMonthOfYear(j, year));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j, int i) {
        FieldUtils.verifyValueBounds(this, i, 1, this.f76125e);
        int year = this.f76124d.getYear(j);
        int dayOfMonth = this.f76124d.getDayOfMonth(j, year);
        int daysInYearMonth = this.f76124d.getDaysInYearMonth(year, i);
        if (dayOfMonth > daysInYearMonth) {
            dayOfMonth = daysInYearMonth;
        }
        return this.f76124d.getYearMonthDayMillis(year, i, dayOfMonth) + this.f76124d.getMillisOfDay(j);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j, long j2) {
        long j3;
        long j4;
        int i = (int) j2;
        if (i == j2) {
            return add(j, i);
        }
        long millisOfDay = this.f76124d.getMillisOfDay(j);
        int year = this.f76124d.getYear(j);
        int monthOfYear = this.f76124d.getMonthOfYear(j, year);
        long j5 = (monthOfYear - 1) + j2;
        if (j5 >= 0) {
            int i2 = this.f76125e;
            j3 = year + (j5 / i2);
            j4 = (j5 % i2) + 1;
        } else {
            j3 = year + (j5 / this.f76125e);
            long j6 = j3 - 1;
            long abs = Math.abs(j5);
            int i3 = this.f76125e;
            int i4 = (int) (abs % i3);
            if (i4 == 0) {
                i4 = i3;
            }
            j4 = (i3 - i4) + 1;
            if (j4 != 1) {
                j3 = j6;
            }
        }
        if (j3 >= this.f76124d.getMinYear() && j3 <= this.f76124d.getMaxYear()) {
            int i5 = (int) j3;
            int i6 = (int) j4;
            int dayOfMonth = this.f76124d.getDayOfMonth(j, year, monthOfYear);
            int daysInYearMonth = this.f76124d.getDaysInYearMonth(i5, i6);
            if (dayOfMonth > daysInYearMonth) {
                dayOfMonth = daysInYearMonth;
            }
            return this.f76124d.getYearMonthDayMillis(i5, i6, dayOfMonth) + millisOfDay;
        }
        throw new IllegalArgumentException("Magnitude of add amount is too large: " + j2);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int[] add(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
        if (i2 == 0) {
            return iArr;
        }
        if (readablePartial.size() > 0 && readablePartial.getFieldType(0).equals(DateTimeFieldType.monthOfYear()) && i == 0) {
            return set(readablePartial, 0, iArr, ((((iArr[0] - 1) + (i2 % 12)) + 12) % 12) + 1);
        }
        if (DateTimeUtils.isContiguous(readablePartial)) {
            int size = readablePartial.size();
            long j = 0;
            for (int i3 = 0; i3 < size; i3++) {
                j = readablePartial.getFieldType(i3).getField(this.f76124d).set(j, iArr[i3]);
            }
            return this.f76124d.get(readablePartial, add(j, i2));
        }
        return super.add(readablePartial, i, iArr, i2);
    }
}
