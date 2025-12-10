package org.joda.time.chrono;

import java.util.HashMap;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.BaseDurationField;

/* loaded from: classes5.dex */
public final class ZonedChronology extends AssembledChronology {
    private static final long NEAR_ZERO = 604800000;
    private static final long serialVersionUID = -1079258847191166848L;

    /* loaded from: classes5.dex */
    public static class ZonedDurationField extends BaseDurationField {
        private static final long serialVersionUID = -485345310999208286L;
        final DurationField iField;
        final boolean iTimeField;
        final DateTimeZone iZone;

        public ZonedDurationField(DurationField durationField, DateTimeZone dateTimeZone) {
            super(durationField.getType());
            if (durationField.isSupported()) {
                this.iField = durationField;
                this.iTimeField = ZonedChronology.useTimeArithmetic(durationField);
                this.iZone = dateTimeZone;
                return;
            }
            throw new IllegalArgumentException();
        }

        private long addOffset(long j) {
            return this.iZone.convertUTCToLocal(j);
        }

        private int getOffsetFromLocalToSubtract(long j) {
            int offsetFromLocal = this.iZone.getOffsetFromLocal(j);
            long j2 = offsetFromLocal;
            if (((j - j2) ^ j) < 0 && (j ^ j2) < 0) {
                throw new ArithmeticException("Subtracting time zone offset caused overflow");
            }
            return offsetFromLocal;
        }

        private int getOffsetToAdd(long j) {
            int offset = this.iZone.getOffset(j);
            long j2 = offset;
            if (((j + j2) ^ j) < 0 && (j ^ j2) >= 0) {
                throw new ArithmeticException("Adding time zone offset caused overflow");
            }
            return offset;
        }

        @Override // org.joda.time.DurationField
        public long add(long j, int i) {
            int offsetToAdd = getOffsetToAdd(j);
            long add = this.iField.add(j + offsetToAdd, i);
            if (!this.iTimeField) {
                offsetToAdd = getOffsetFromLocalToSubtract(add);
            }
            return add - offsetToAdd;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ZonedDurationField)) {
                return false;
            }
            ZonedDurationField zonedDurationField = (ZonedDurationField) obj;
            if (this.iField.equals(zonedDurationField.iField) && this.iZone.equals(zonedDurationField.iZone)) {
                return true;
            }
            return false;
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getDifference(long j, long j2) {
            int offsetToAdd;
            int offsetToAdd2 = getOffsetToAdd(j2);
            DurationField durationField = this.iField;
            if (this.iTimeField) {
                offsetToAdd = offsetToAdd2;
            } else {
                offsetToAdd = getOffsetToAdd(j);
            }
            return durationField.getDifference(j + offsetToAdd, j2 + offsetToAdd2);
        }

        @Override // org.joda.time.DurationField
        public long getDifferenceAsLong(long j, long j2) {
            int offsetToAdd;
            int offsetToAdd2 = getOffsetToAdd(j2);
            DurationField durationField = this.iField;
            if (this.iTimeField) {
                offsetToAdd = offsetToAdd2;
            } else {
                offsetToAdd = getOffsetToAdd(j);
            }
            return durationField.getDifferenceAsLong(j + offsetToAdd, j2 + offsetToAdd2);
        }

        @Override // org.joda.time.DurationField
        public long getMillis(int i, long j) {
            return this.iField.getMillis(i, addOffset(j));
        }

        @Override // org.joda.time.DurationField
        public long getUnitMillis() {
            return this.iField.getUnitMillis();
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getValue(long j, long j2) {
            return this.iField.getValue(j, addOffset(j2));
        }

        @Override // org.joda.time.DurationField
        public long getValueAsLong(long j, long j2) {
            return this.iField.getValueAsLong(j, addOffset(j2));
        }

        public int hashCode() {
            return this.iField.hashCode() ^ this.iZone.hashCode();
        }

        @Override // org.joda.time.DurationField
        public boolean isPrecise() {
            if (this.iTimeField) {
                return this.iField.isPrecise();
            }
            if (this.iField.isPrecise() && this.iZone.isFixed()) {
                return true;
            }
            return false;
        }

        @Override // org.joda.time.DurationField
        public long getMillis(long j, long j2) {
            return this.iField.getMillis(j, addOffset(j2));
        }

        @Override // org.joda.time.DurationField
        public long add(long j, long j2) {
            int offsetToAdd = getOffsetToAdd(j);
            long add = this.iField.add(j + offsetToAdd, j2);
            if (!this.iTimeField) {
                offsetToAdd = getOffsetFromLocalToSubtract(add);
            }
            return add - offsetToAdd;
        }
    }

    /* renamed from: org.joda.time.chrono.ZonedChronology$a */
    /* loaded from: classes5.dex */
    public static final class C12982a extends BaseDateTimeField {

        /* renamed from: b */
        public final DateTimeField f76116b;

        /* renamed from: c */
        public final DateTimeZone f76117c;

        /* renamed from: d */
        public final DurationField f76118d;

        /* renamed from: e */
        public final boolean f76119e;

        /* renamed from: f */
        public final DurationField f76120f;

        /* renamed from: g */
        public final DurationField f76121g;

        public C12982a(DateTimeField dateTimeField, DateTimeZone dateTimeZone, DurationField durationField, DurationField durationField2, DurationField durationField3) {
            super(dateTimeField.getType());
            if (dateTimeField.isSupported()) {
                this.f76116b = dateTimeField;
                this.f76117c = dateTimeZone;
                this.f76118d = durationField;
                this.f76119e = ZonedChronology.useTimeArithmetic(durationField);
                this.f76120f = durationField2;
                this.f76121g = durationField3;
                return;
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: a */
        public final int m24048a(long j) {
            int offset = this.f76117c.getOffset(j);
            long j2 = offset;
            if (((j + j2) ^ j) < 0 && (j ^ j2) >= 0) {
                throw new ArithmeticException("Adding time zone offset caused overflow");
            }
            return offset;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j, int i) {
            if (this.f76119e) {
                long m24048a = m24048a(j);
                return this.f76116b.add(j + m24048a, i) - m24048a;
            }
            return this.f76117c.convertLocalToUTC(this.f76116b.add(this.f76117c.convertUTCToLocal(j), i), false, j);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long addWrapField(long j, int i) {
            if (this.f76119e) {
                long m24048a = m24048a(j);
                return this.f76116b.addWrapField(j + m24048a, i) - m24048a;
            }
            return this.f76117c.convertLocalToUTC(this.f76116b.addWrapField(this.f76117c.convertUTCToLocal(j), i), false, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12982a)) {
                return false;
            }
            C12982a c12982a = (C12982a) obj;
            if (this.f76116b.equals(c12982a.f76116b) && this.f76117c.equals(c12982a.f76117c) && this.f76118d.equals(c12982a.f76118d) && this.f76120f.equals(c12982a.f76120f)) {
                return true;
            }
            return false;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int get(long j) {
            return this.f76116b.get(this.f76117c.convertUTCToLocal(j));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsShortText(long j, Locale locale) {
            return this.f76116b.getAsShortText(this.f76117c.convertUTCToLocal(j), locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(long j, Locale locale) {
            return this.f76116b.getAsText(this.f76117c.convertUTCToLocal(j), locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getDifference(long j, long j2) {
            int m24048a;
            int m24048a2 = m24048a(j2);
            DateTimeField dateTimeField = this.f76116b;
            if (this.f76119e) {
                m24048a = m24048a2;
            } else {
                m24048a = m24048a(j);
            }
            return dateTimeField.getDifference(j + m24048a, j2 + m24048a2);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long getDifferenceAsLong(long j, long j2) {
            int m24048a;
            int m24048a2 = m24048a(j2);
            DateTimeField dateTimeField = this.f76116b;
            if (this.f76119e) {
                m24048a = m24048a2;
            } else {
                m24048a = m24048a(j);
            }
            return dateTimeField.getDifferenceAsLong(j + m24048a, j2 + m24048a2);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public final DurationField getDurationField() {
            return this.f76118d;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getLeapAmount(long j) {
            return this.f76116b.getLeapAmount(this.f76117c.convertUTCToLocal(j));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public final DurationField getLeapDurationField() {
            return this.f76121g;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumShortTextLength(Locale locale) {
            return this.f76116b.getMaximumShortTextLength(locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumTextLength(Locale locale) {
            return this.f76116b.getMaximumTextLength(locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue() {
            return this.f76116b.getMaximumValue();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue() {
            return this.f76116b.getMinimumValue();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public final DurationField getRangeDurationField() {
            return this.f76120f;
        }

        public int hashCode() {
            return this.f76116b.hashCode() ^ this.f76117c.hashCode();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public boolean isLeap(long j) {
            return this.f76116b.isLeap(this.f76117c.convertUTCToLocal(j));
        }

        @Override // org.joda.time.DateTimeField
        public boolean isLenient() {
            return this.f76116b.isLenient();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long remainder(long j) {
            return this.f76116b.remainder(this.f76117c.convertUTCToLocal(j));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundCeiling(long j) {
            if (this.f76119e) {
                long m24048a = m24048a(j);
                return this.f76116b.roundCeiling(j + m24048a) - m24048a;
            }
            return this.f76117c.convertLocalToUTC(this.f76116b.roundCeiling(this.f76117c.convertUTCToLocal(j)), false, j);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundFloor(long j) {
            if (this.f76119e) {
                long m24048a = m24048a(j);
                return this.f76116b.roundFloor(j + m24048a) - m24048a;
            }
            return this.f76117c.convertLocalToUTC(this.f76116b.roundFloor(this.f76117c.convertUTCToLocal(j)), false, j);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j, int i) {
            long j2 = this.f76116b.set(this.f76117c.convertUTCToLocal(j), i);
            long convertLocalToUTC = this.f76117c.convertLocalToUTC(j2, false, j);
            if (get(convertLocalToUTC) == i) {
                return convertLocalToUTC;
            }
            IllegalInstantException illegalInstantException = new IllegalInstantException(j2, this.f76117c.getID());
            IllegalFieldValueException illegalFieldValueException = new IllegalFieldValueException(this.f76116b.getType(), Integer.valueOf(i), illegalInstantException.getMessage());
            illegalFieldValueException.initCause(illegalInstantException);
            throw illegalFieldValueException;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(long j) {
            return this.f76116b.getMaximumValue(this.f76117c.convertUTCToLocal(j));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(long j) {
            return this.f76116b.getMinimumValue(this.f76117c.convertUTCToLocal(j));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsShortText(int i, Locale locale) {
            return this.f76116b.getAsShortText(i, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(int i, Locale locale) {
            return this.f76116b.getAsText(i, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(ReadablePartial readablePartial) {
            return this.f76116b.getMaximumValue(readablePartial);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(ReadablePartial readablePartial) {
            return this.f76116b.getMinimumValue(readablePartial);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
            return this.f76116b.getMaximumValue(readablePartial, iArr);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
            return this.f76116b.getMinimumValue(readablePartial, iArr);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j, long j2) {
            if (this.f76119e) {
                long m24048a = m24048a(j);
                return this.f76116b.add(j + m24048a, j2) - m24048a;
            }
            return this.f76117c.convertLocalToUTC(this.f76116b.add(this.f76117c.convertUTCToLocal(j), j2), false, j);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j, String str, Locale locale) {
            return this.f76117c.convertLocalToUTC(this.f76116b.set(this.f76117c.convertUTCToLocal(j), str, locale), false, j);
        }
    }

    private ZonedChronology(Chronology chronology, DateTimeZone dateTimeZone) {
        super(chronology, dateTimeZone);
    }

    private DurationField convertField(DurationField durationField, HashMap<Object, Object> hashMap) {
        if (durationField == null || !durationField.isSupported()) {
            return durationField;
        }
        if (hashMap.containsKey(durationField)) {
            return (DurationField) hashMap.get(durationField);
        }
        ZonedDurationField zonedDurationField = new ZonedDurationField(durationField, getZone());
        hashMap.put(durationField, zonedDurationField);
        return zonedDurationField;
    }

    public static ZonedChronology getInstance(Chronology chronology, DateTimeZone dateTimeZone) {
        if (chronology != null) {
            Chronology withUTC = chronology.withUTC();
            if (withUTC != null) {
                if (dateTimeZone != null) {
                    return new ZonedChronology(withUTC, dateTimeZone);
                }
                throw new IllegalArgumentException("DateTimeZone must not be null");
            }
            throw new IllegalArgumentException("UTC chronology must not be null");
        }
        throw new IllegalArgumentException("Must supply a chronology");
    }

    private long localToUTC(long j) {
        if (j == Long.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        if (j == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        DateTimeZone zone = getZone();
        int offsetFromLocal = zone.getOffsetFromLocal(j);
        long j2 = j - offsetFromLocal;
        if (j > 604800000 && j2 < 0) {
            return Long.MAX_VALUE;
        }
        if (j < -604800000 && j2 > 0) {
            return Long.MIN_VALUE;
        }
        if (offsetFromLocal == zone.getOffset(j2)) {
            return j2;
        }
        throw new IllegalInstantException(j, zone.getID());
    }

    public static boolean useTimeArithmetic(DurationField durationField) {
        if (durationField != null && durationField.getUnitMillis() < 43200000) {
            return true;
        }
        return false;
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        fields.eras = convertField(fields.eras, hashMap);
        fields.centuries = convertField(fields.centuries, hashMap);
        fields.years = convertField(fields.years, hashMap);
        fields.months = convertField(fields.months, hashMap);
        fields.weekyears = convertField(fields.weekyears, hashMap);
        fields.weeks = convertField(fields.weeks, hashMap);
        fields.days = convertField(fields.days, hashMap);
        fields.halfdays = convertField(fields.halfdays, hashMap);
        fields.hours = convertField(fields.hours, hashMap);
        fields.minutes = convertField(fields.minutes, hashMap);
        fields.seconds = convertField(fields.seconds, hashMap);
        fields.millis = convertField(fields.millis, hashMap);
        fields.year = convertField(fields.year, hashMap);
        fields.yearOfEra = convertField(fields.yearOfEra, hashMap);
        fields.yearOfCentury = convertField(fields.yearOfCentury, hashMap);
        fields.centuryOfEra = convertField(fields.centuryOfEra, hashMap);
        fields.era = convertField(fields.era, hashMap);
        fields.dayOfWeek = convertField(fields.dayOfWeek, hashMap);
        fields.dayOfMonth = convertField(fields.dayOfMonth, hashMap);
        fields.dayOfYear = convertField(fields.dayOfYear, hashMap);
        fields.monthOfYear = convertField(fields.monthOfYear, hashMap);
        fields.weekOfWeekyear = convertField(fields.weekOfWeekyear, hashMap);
        fields.weekyear = convertField(fields.weekyear, hashMap);
        fields.weekyearOfCentury = convertField(fields.weekyearOfCentury, hashMap);
        fields.millisOfSecond = convertField(fields.millisOfSecond, hashMap);
        fields.millisOfDay = convertField(fields.millisOfDay, hashMap);
        fields.secondOfMinute = convertField(fields.secondOfMinute, hashMap);
        fields.secondOfDay = convertField(fields.secondOfDay, hashMap);
        fields.minuteOfHour = convertField(fields.minuteOfHour, hashMap);
        fields.minuteOfDay = convertField(fields.minuteOfDay, hashMap);
        fields.hourOfDay = convertField(fields.hourOfDay, hashMap);
        fields.hourOfHalfday = convertField(fields.hourOfHalfday, hashMap);
        fields.clockhourOfDay = convertField(fields.clockhourOfDay, hashMap);
        fields.clockhourOfHalfday = convertField(fields.clockhourOfHalfday, hashMap);
        fields.halfdayOfDay = convertField(fields.halfdayOfDay, hashMap);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedChronology)) {
            return false;
        }
        ZonedChronology zonedChronology = (ZonedChronology) obj;
        if (getBase().equals(zonedChronology.getBase()) && getZone().equals(zonedChronology.getZone())) {
            return true;
        }
        return false;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        return localToUTC(getBase().getDateTimeMillis(i, i2, i3, i4));
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public DateTimeZone getZone() {
        return (DateTimeZone) getParam();
    }

    public int hashCode() {
        return (getZone().hashCode() * 11) + 326565 + (getBase().hashCode() * 7);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public String toString() {
        return "ZonedChronology[" + getBase() + ", " + getZone().getID() + AbstractJsonLexerKt.END_LIST;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withUTC() {
        return getBase();
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        if (dateTimeZone == getParam()) {
            return this;
        }
        if (dateTimeZone == DateTimeZone.UTC) {
            return getBase();
        }
        return new ZonedChronology(getBase(), dateTimeZone);
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        return localToUTC(getBase().getDateTimeMillis(i, i2, i3, i4, i5, i6, i7));
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(long j, int i, int i2, int i3, int i4) throws IllegalArgumentException {
        return localToUTC(getBase().getDateTimeMillis(getZone().getOffset(j) + j, i, i2, i3, i4));
    }

    private DateTimeField convertField(DateTimeField dateTimeField, HashMap<Object, Object> hashMap) {
        if (dateTimeField == null || !dateTimeField.isSupported()) {
            return dateTimeField;
        }
        if (hashMap.containsKey(dateTimeField)) {
            return (DateTimeField) hashMap.get(dateTimeField);
        }
        C12982a c12982a = new C12982a(dateTimeField, getZone(), convertField(dateTimeField.getDurationField(), hashMap), convertField(dateTimeField.getRangeDurationField(), hashMap), convertField(dateTimeField.getLeapDurationField(), hashMap));
        hashMap.put(dateTimeField, c12982a);
        return c12982a;
    }
}
