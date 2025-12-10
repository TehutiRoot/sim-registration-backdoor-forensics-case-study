package org.joda.time.chrono;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* loaded from: classes5.dex */
public final class GJChronology extends AssembledChronology {
    static final Instant DEFAULT_CUTOVER = new Instant(-12219292800000L);
    private static final ConcurrentHashMap<A50, GJChronology> cCache = new ConcurrentHashMap<>();
    private static final long serialVersionUID = -2545574827706931671L;
    private Instant iCutoverInstant;
    private long iCutoverMillis;
    private long iGapDuration;
    private GregorianChronology iGregorianChronology;
    private JulianChronology iJulianChronology;

    /* loaded from: classes5.dex */
    public static class LinkedDurationField extends DecoratedDurationField {
        private static final long serialVersionUID = 4097975388007713084L;
        private final C12980b iField;

        public LinkedDurationField(DurationField durationField, C12980b c12980b) {
            super(durationField, durationField.getType());
            this.iField = c12980b;
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long add(long j, int i) {
            return this.iField.add(j, i);
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getDifference(long j, long j2) {
            return this.iField.getDifference(j, j2);
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long getDifferenceAsLong(long j, long j2) {
            return this.iField.getDifferenceAsLong(j, j2);
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long add(long j, long j2) {
            return this.iField.add(j, j2);
        }
    }

    /* renamed from: org.joda.time.chrono.GJChronology$a */
    /* loaded from: classes5.dex */
    public class C12979a extends BaseDateTimeField {

        /* renamed from: b */
        public final DateTimeField f76103b;

        /* renamed from: c */
        public final DateTimeField f76104c;

        /* renamed from: d */
        public final long f76105d;

        /* renamed from: e */
        public final boolean f76106e;

        /* renamed from: f */
        public DurationField f76107f;

        /* renamed from: g */
        public DurationField f76108g;

        public C12979a(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j) {
            this(gJChronology, dateTimeField, dateTimeField2, j, false);
        }

        /* renamed from: a */
        public long m24050a(long j) {
            if (this.f76106e) {
                return GJChronology.this.gregorianToJulianByWeekyear(j);
            }
            return GJChronology.this.gregorianToJulianByYear(j);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j, int i) {
            return this.f76104c.add(j, i);
        }

        /* renamed from: b */
        public long m24049b(long j) {
            if (this.f76106e) {
                return GJChronology.this.julianToGregorianByWeekyear(j);
            }
            return GJChronology.this.julianToGregorianByYear(j);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int get(long j) {
            if (j >= this.f76105d) {
                return this.f76104c.get(j);
            }
            return this.f76103b.get(j);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsShortText(long j, Locale locale) {
            if (j >= this.f76105d) {
                return this.f76104c.getAsShortText(j, locale);
            }
            return this.f76103b.getAsShortText(j, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(long j, Locale locale) {
            if (j >= this.f76105d) {
                return this.f76104c.getAsText(j, locale);
            }
            return this.f76103b.getAsText(j, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getDifference(long j, long j2) {
            return this.f76104c.getDifference(j, j2);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long getDifferenceAsLong(long j, long j2) {
            return this.f76104c.getDifferenceAsLong(j, j2);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public DurationField getDurationField() {
            return this.f76107f;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getLeapAmount(long j) {
            if (j >= this.f76105d) {
                return this.f76104c.getLeapAmount(j);
            }
            return this.f76103b.getLeapAmount(j);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public DurationField getLeapDurationField() {
            return this.f76104c.getLeapDurationField();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumShortTextLength(Locale locale) {
            return Math.max(this.f76103b.getMaximumShortTextLength(locale), this.f76104c.getMaximumShortTextLength(locale));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumTextLength(Locale locale) {
            return Math.max(this.f76103b.getMaximumTextLength(locale), this.f76104c.getMaximumTextLength(locale));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue() {
            return this.f76104c.getMaximumValue();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue() {
            return this.f76103b.getMinimumValue();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public DurationField getRangeDurationField() {
            return this.f76108g;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public boolean isLeap(long j) {
            if (j >= this.f76105d) {
                return this.f76104c.isLeap(j);
            }
            return this.f76103b.isLeap(j);
        }

        @Override // org.joda.time.DateTimeField
        public boolean isLenient() {
            return false;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundCeiling(long j) {
            if (j >= this.f76105d) {
                return this.f76104c.roundCeiling(j);
            }
            long roundCeiling = this.f76103b.roundCeiling(j);
            if (roundCeiling >= this.f76105d && roundCeiling - GJChronology.this.iGapDuration >= this.f76105d) {
                return m24049b(roundCeiling);
            }
            return roundCeiling;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundFloor(long j) {
            if (j >= this.f76105d) {
                long roundFloor = this.f76104c.roundFloor(j);
                if (roundFloor < this.f76105d && GJChronology.this.iGapDuration + roundFloor < this.f76105d) {
                    return m24050a(roundFloor);
                }
                return roundFloor;
            }
            return this.f76103b.roundFloor(j);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j, int i) {
            long j2;
            if (j >= this.f76105d) {
                j2 = this.f76104c.set(j, i);
                if (j2 < this.f76105d) {
                    if (GJChronology.this.iGapDuration + j2 < this.f76105d) {
                        j2 = m24050a(j2);
                    }
                    if (get(j2) != i) {
                        throw new IllegalFieldValueException(this.f76104c.getType(), Integer.valueOf(i), (Number) null, (Number) null);
                    }
                }
            } else {
                j2 = this.f76103b.set(j, i);
                if (j2 >= this.f76105d) {
                    if (j2 - GJChronology.this.iGapDuration >= this.f76105d) {
                        j2 = m24049b(j2);
                    }
                    if (get(j2) != i) {
                        throw new IllegalFieldValueException(this.f76103b.getType(), Integer.valueOf(i), (Number) null, (Number) null);
                    }
                }
            }
            return j2;
        }

        public C12979a(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j, boolean z) {
            this(dateTimeField, dateTimeField2, null, j, z);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j, long j2) {
            return this.f76104c.add(j, j2);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(long j) {
            if (j >= this.f76105d) {
                return this.f76104c.getMaximumValue(j);
            }
            int maximumValue = this.f76103b.getMaximumValue(j);
            long j2 = this.f76103b.set(j, maximumValue);
            long j3 = this.f76105d;
            if (j2 >= j3) {
                DateTimeField dateTimeField = this.f76103b;
                return dateTimeField.get(dateTimeField.add(j3, -1));
            }
            return maximumValue;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(ReadablePartial readablePartial) {
            return this.f76103b.getMinimumValue(readablePartial);
        }

        public C12979a(DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j, boolean z) {
            super(dateTimeField2.getType());
            this.f76103b = dateTimeField;
            this.f76104c = dateTimeField2;
            this.f76105d = j;
            this.f76106e = z;
            this.f76107f = dateTimeField2.getDurationField();
            if (durationField == null && (durationField = dateTimeField2.getRangeDurationField()) == null) {
                durationField = dateTimeField.getRangeDurationField();
            }
            this.f76108g = durationField;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int[] add(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
            if (i2 == 0) {
                return iArr;
            }
            if (DateTimeUtils.isContiguous(readablePartial)) {
                int size = readablePartial.size();
                long j = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    j = readablePartial.getFieldType(i3).getField(GJChronology.this).set(j, iArr[i3]);
                }
                return GJChronology.this.get(readablePartial, add(j, i2));
            }
            return super.add(readablePartial, i, iArr, i2);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
            return this.f76103b.getMinimumValue(readablePartial, iArr);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsShortText(int i, Locale locale) {
            return this.f76104c.getAsShortText(i, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(int i, Locale locale) {
            return this.f76104c.getAsText(i, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(long j) {
            if (j < this.f76105d) {
                return this.f76103b.getMinimumValue(j);
            }
            int minimumValue = this.f76104c.getMinimumValue(j);
            long j2 = this.f76104c.set(j, minimumValue);
            long j3 = this.f76105d;
            return j2 < j3 ? this.f76104c.get(j3) : minimumValue;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(ReadablePartial readablePartial) {
            return getMaximumValue(GJChronology.getInstanceUTC().set(readablePartial, 0L));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
            GJChronology instanceUTC = GJChronology.getInstanceUTC();
            int size = readablePartial.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                DateTimeField field = readablePartial.getFieldType(i).getField(instanceUTC);
                if (iArr[i] <= field.getMaximumValue(j)) {
                    j = field.set(j, iArr[i]);
                }
            }
            return getMaximumValue(j);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j, String str, Locale locale) {
            if (j >= this.f76105d) {
                long j2 = this.f76104c.set(j, str, locale);
                return (j2 >= this.f76105d || GJChronology.this.iGapDuration + j2 >= this.f76105d) ? j2 : m24050a(j2);
            }
            long j3 = this.f76103b.set(j, str, locale);
            return (j3 < this.f76105d || j3 - GJChronology.this.iGapDuration < this.f76105d) ? j3 : m24049b(j3);
        }
    }

    /* renamed from: org.joda.time.chrono.GJChronology$b */
    /* loaded from: classes5.dex */
    public final class C12980b extends C12979a {
        public C12980b(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j) {
            this(dateTimeField, dateTimeField2, (DurationField) null, j, false);
        }

        @Override // org.joda.time.chrono.GJChronology.C12979a, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j, int i) {
            if (j >= this.f76105d) {
                long add = this.f76104c.add(j, i);
                if (add >= this.f76105d || GJChronology.this.iGapDuration + add >= this.f76105d) {
                    return add;
                }
                if (this.f76106e) {
                    if (GJChronology.this.iGregorianChronology.weekyear().get(add) <= 0) {
                        add = GJChronology.this.iGregorianChronology.weekyear().add(add, -1);
                    }
                } else if (GJChronology.this.iGregorianChronology.year().get(add) <= 0) {
                    add = GJChronology.this.iGregorianChronology.year().add(add, -1);
                }
                return m24050a(add);
            }
            long add2 = this.f76103b.add(j, i);
            return (add2 < this.f76105d || add2 - GJChronology.this.iGapDuration < this.f76105d) ? add2 : m24049b(add2);
        }

        @Override // org.joda.time.chrono.GJChronology.C12979a, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getDifference(long j, long j2) {
            long j3 = this.f76105d;
            if (j >= j3) {
                if (j2 >= j3) {
                    return this.f76104c.getDifference(j, j2);
                }
                return this.f76103b.getDifference(m24050a(j), j2);
            } else if (j2 < j3) {
                return this.f76103b.getDifference(j, j2);
            } else {
                return this.f76104c.getDifference(m24049b(j), j2);
            }
        }

        @Override // org.joda.time.chrono.GJChronology.C12979a, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long getDifferenceAsLong(long j, long j2) {
            long j3 = this.f76105d;
            if (j >= j3) {
                if (j2 >= j3) {
                    return this.f76104c.getDifferenceAsLong(j, j2);
                }
                return this.f76103b.getDifferenceAsLong(m24050a(j), j2);
            } else if (j2 < j3) {
                return this.f76103b.getDifferenceAsLong(j, j2);
            } else {
                return this.f76104c.getDifferenceAsLong(m24049b(j), j2);
            }
        }

        @Override // org.joda.time.chrono.GJChronology.C12979a, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(long j) {
            if (j >= this.f76105d) {
                return this.f76104c.getMaximumValue(j);
            }
            return this.f76103b.getMaximumValue(j);
        }

        @Override // org.joda.time.chrono.GJChronology.C12979a, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(long j) {
            if (j >= this.f76105d) {
                return this.f76104c.getMinimumValue(j);
            }
            return this.f76103b.getMinimumValue(j);
        }

        public C12980b(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j) {
            this(dateTimeField, dateTimeField2, durationField, j, false);
        }

        public C12980b(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, DurationField durationField2, long j) {
            this(dateTimeField, dateTimeField2, durationField, j, false);
            this.f76108g = durationField2;
        }

        public C12980b(DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j, boolean z) {
            super(GJChronology.this, dateTimeField, dateTimeField2, j, z);
            this.f76107f = durationField == null ? new LinkedDurationField(this.f76107f, this) : durationField;
        }

        @Override // org.joda.time.chrono.GJChronology.C12979a, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j, long j2) {
            if (j >= this.f76105d) {
                long add = this.f76104c.add(j, j2);
                if (add >= this.f76105d || GJChronology.this.iGapDuration + add >= this.f76105d) {
                    return add;
                }
                if (this.f76106e) {
                    if (GJChronology.this.iGregorianChronology.weekyear().get(add) <= 0) {
                        add = GJChronology.this.iGregorianChronology.weekyear().add(add, -1);
                    }
                } else if (GJChronology.this.iGregorianChronology.year().get(add) <= 0) {
                    add = GJChronology.this.iGregorianChronology.year().add(add, -1);
                }
                return m24050a(add);
            }
            long add2 = this.f76103b.add(j, j2);
            return (add2 < this.f76105d || add2 - GJChronology.this.iGapDuration < this.f76105d) ? add2 : m24049b(add2);
        }
    }

    private GJChronology(JulianChronology julianChronology, GregorianChronology gregorianChronology, Instant instant) {
        super(null, new Object[]{julianChronology, gregorianChronology, instant});
    }

    private static long convertByWeekyear(long j, Chronology chronology, Chronology chronology2) {
        return chronology2.millisOfDay().set(chronology2.dayOfWeek().set(chronology2.weekOfWeekyear().set(chronology2.weekyear().set(0L, chronology.weekyear().get(j)), chronology.weekOfWeekyear().get(j)), chronology.dayOfWeek().get(j)), chronology.millisOfDay().get(j));
    }

    private static long convertByYear(long j, Chronology chronology, Chronology chronology2) {
        return chronology2.getDateTimeMillis(chronology.year().get(j), chronology.monthOfYear().get(j), chronology.dayOfMonth().get(j), chronology.millisOfDay().get(j));
    }

    public static GJChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), DEFAULT_CUTOVER, 4);
    }

    public static GJChronology getInstanceUTC() {
        return getInstance(DateTimeZone.UTC, DEFAULT_CUTOVER, 4);
    }

    private Object readResolve() {
        return getInstance(getZone(), this.iCutoverInstant, getMinimumDaysInFirstWeek());
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        Object[] objArr = (Object[]) getParam();
        JulianChronology julianChronology = (JulianChronology) objArr[0];
        GregorianChronology gregorianChronology = (GregorianChronology) objArr[1];
        Instant instant = (Instant) objArr[2];
        this.iCutoverMillis = instant.getMillis();
        this.iJulianChronology = julianChronology;
        this.iGregorianChronology = gregorianChronology;
        this.iCutoverInstant = instant;
        if (getBase() != null) {
            return;
        }
        if (julianChronology.getMinimumDaysInFirstWeek() == gregorianChronology.getMinimumDaysInFirstWeek()) {
            long j = this.iCutoverMillis;
            this.iGapDuration = j - julianToGregorianByYear(j);
            fields.copyFieldsFrom(gregorianChronology);
            if (gregorianChronology.millisOfDay().get(this.iCutoverMillis) == 0) {
                fields.millisOfSecond = new C12979a(this, julianChronology.millisOfSecond(), fields.millisOfSecond, this.iCutoverMillis);
                fields.millisOfDay = new C12979a(this, julianChronology.millisOfDay(), fields.millisOfDay, this.iCutoverMillis);
                fields.secondOfMinute = new C12979a(this, julianChronology.secondOfMinute(), fields.secondOfMinute, this.iCutoverMillis);
                fields.secondOfDay = new C12979a(this, julianChronology.secondOfDay(), fields.secondOfDay, this.iCutoverMillis);
                fields.minuteOfHour = new C12979a(this, julianChronology.minuteOfHour(), fields.minuteOfHour, this.iCutoverMillis);
                fields.minuteOfDay = new C12979a(this, julianChronology.minuteOfDay(), fields.minuteOfDay, this.iCutoverMillis);
                fields.hourOfDay = new C12979a(this, julianChronology.hourOfDay(), fields.hourOfDay, this.iCutoverMillis);
                fields.hourOfHalfday = new C12979a(this, julianChronology.hourOfHalfday(), fields.hourOfHalfday, this.iCutoverMillis);
                fields.clockhourOfDay = new C12979a(this, julianChronology.clockhourOfDay(), fields.clockhourOfDay, this.iCutoverMillis);
                fields.clockhourOfHalfday = new C12979a(this, julianChronology.clockhourOfHalfday(), fields.clockhourOfHalfday, this.iCutoverMillis);
                fields.halfdayOfDay = new C12979a(this, julianChronology.halfdayOfDay(), fields.halfdayOfDay, this.iCutoverMillis);
            }
            fields.era = new C12979a(this, julianChronology.era(), fields.era, this.iCutoverMillis);
            C12980b c12980b = new C12980b(this, julianChronology.year(), fields.year, this.iCutoverMillis);
            fields.year = c12980b;
            fields.years = c12980b.getDurationField();
            fields.yearOfEra = new C12980b(this, julianChronology.yearOfEra(), fields.yearOfEra, fields.years, this.iCutoverMillis);
            C12980b c12980b2 = new C12980b(this, julianChronology.centuryOfEra(), fields.centuryOfEra, this.iCutoverMillis);
            fields.centuryOfEra = c12980b2;
            fields.centuries = c12980b2.getDurationField();
            fields.yearOfCentury = new C12980b(this, julianChronology.yearOfCentury(), fields.yearOfCentury, fields.years, fields.centuries, this.iCutoverMillis);
            C12980b c12980b3 = new C12980b(this, julianChronology.monthOfYear(), fields.monthOfYear, (DurationField) null, fields.years, this.iCutoverMillis);
            fields.monthOfYear = c12980b3;
            fields.months = c12980b3.getDurationField();
            C12980b c12980b4 = new C12980b(julianChronology.weekyear(), fields.weekyear, (DurationField) null, this.iCutoverMillis, true);
            fields.weekyear = c12980b4;
            fields.weekyears = c12980b4.getDurationField();
            fields.weekyearOfCentury = new C12980b(this, julianChronology.weekyearOfCentury(), fields.weekyearOfCentury, fields.weekyears, fields.centuries, this.iCutoverMillis);
            fields.dayOfYear = new C12979a(julianChronology.dayOfYear(), fields.dayOfYear, fields.years, gregorianChronology.year().roundCeiling(this.iCutoverMillis), false);
            fields.weekOfWeekyear = new C12979a(julianChronology.weekOfWeekyear(), fields.weekOfWeekyear, fields.weekyears, gregorianChronology.weekyear().roundCeiling(this.iCutoverMillis), true);
            C12979a c12979a = new C12979a(this, julianChronology.dayOfMonth(), fields.dayOfMonth, this.iCutoverMillis);
            c12979a.f76108g = fields.months;
            fields.dayOfMonth = c12979a;
            return;
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GJChronology)) {
            return false;
        }
        GJChronology gJChronology = (GJChronology) obj;
        if (this.iCutoverMillis == gJChronology.iCutoverMillis && getMinimumDaysInFirstWeek() == gJChronology.getMinimumDaysInFirstWeek() && getZone().equals(gJChronology.getZone())) {
            return true;
        }
        return false;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i, i2, i3, i4);
        }
        long dateTimeMillis = this.iGregorianChronology.getDateTimeMillis(i, i2, i3, i4);
        if (dateTimeMillis < this.iCutoverMillis) {
            dateTimeMillis = this.iJulianChronology.getDateTimeMillis(i, i2, i3, i4);
            if (dateTimeMillis >= this.iCutoverMillis) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return dateTimeMillis;
    }

    public Instant getGregorianCutover() {
        return this.iCutoverInstant;
    }

    public int getMinimumDaysInFirstWeek() {
        return this.iGregorianChronology.getMinimumDaysInFirstWeek();
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public DateTimeZone getZone() {
        Chronology base = getBase();
        if (base != null) {
            return base.getZone();
        }
        return DateTimeZone.UTC;
    }

    public long gregorianToJulianByWeekyear(long j) {
        return convertByWeekyear(j, this.iGregorianChronology, this.iJulianChronology);
    }

    public long gregorianToJulianByYear(long j) {
        return convertByYear(j, this.iGregorianChronology, this.iJulianChronology);
    }

    public int hashCode() {
        return 25025 + getZone().hashCode() + getMinimumDaysInFirstWeek() + this.iCutoverInstant.hashCode();
    }

    public long julianToGregorianByWeekyear(long j) {
        return convertByWeekyear(j, this.iJulianChronology, this.iGregorianChronology);
    }

    public long julianToGregorianByYear(long j) {
        return convertByYear(j, this.iJulianChronology, this.iGregorianChronology);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public String toString() {
        DateTimeFormatter dateTime;
        StringBuffer stringBuffer = new StringBuffer(60);
        stringBuffer.append("GJChronology");
        stringBuffer.append(AbstractJsonLexerKt.BEGIN_LIST);
        stringBuffer.append(getZone().getID());
        if (this.iCutoverMillis != DEFAULT_CUTOVER.getMillis()) {
            stringBuffer.append(",cutover=");
            if (withUTC().dayOfYear().remainder(this.iCutoverMillis) == 0) {
                dateTime = ISODateTimeFormat.date();
            } else {
                dateTime = ISODateTimeFormat.dateTime();
            }
            dateTime.withChronology(withUTC()).printTo(stringBuffer, this.iCutoverMillis);
        }
        if (getMinimumDaysInFirstWeek() != 4) {
            stringBuffer.append(",mdfw=");
            stringBuffer.append(getMinimumDaysInFirstWeek());
        }
        stringBuffer.append(AbstractJsonLexerKt.END_LIST);
        return stringBuffer.toString();
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withUTC() {
        return withZone(DateTimeZone.UTC);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        if (dateTimeZone == getZone()) {
            return this;
        }
        return getInstance(dateTimeZone, this.iCutoverInstant, getMinimumDaysInFirstWeek());
    }

    private GJChronology(Chronology chronology, JulianChronology julianChronology, GregorianChronology gregorianChronology, Instant instant) {
        super(chronology, new Object[]{julianChronology, gregorianChronology, instant});
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, DEFAULT_CUTOVER, 4);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, ReadableInstant readableInstant) {
        return getInstance(dateTimeZone, readableInstant, 4);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, ReadableInstant readableInstant, int i) {
        Instant instant;
        GJChronology gJChronology;
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        if (readableInstant == null) {
            instant = DEFAULT_CUTOVER;
        } else {
            instant = readableInstant.toInstant();
            if (new LocalDate(instant.getMillis(), GregorianChronology.getInstance(zone)).getYear() <= 0) {
                throw new IllegalArgumentException("Cutover too early. Must be on or after 0001-01-01.");
            }
        }
        A50 a50 = new A50(zone, instant, i);
        ConcurrentHashMap<A50, GJChronology> concurrentHashMap = cCache;
        GJChronology gJChronology2 = concurrentHashMap.get(a50);
        if (gJChronology2 == null) {
            DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
            if (zone == dateTimeZone2) {
                gJChronology = new GJChronology(JulianChronology.getInstance(zone, i), GregorianChronology.getInstance(zone, i), instant);
            } else {
                GJChronology gJChronology3 = getInstance(dateTimeZone2, instant, i);
                gJChronology = new GJChronology(ZonedChronology.getInstance(gJChronology3, zone), gJChronology3.iJulianChronology, gJChronology3.iGregorianChronology, gJChronology3.iCutoverInstant);
            }
            GJChronology putIfAbsent = concurrentHashMap.putIfAbsent(a50, gJChronology);
            return putIfAbsent != null ? putIfAbsent : gJChronology;
        }
        return gJChronology2;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        long dateTimeMillis;
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
        }
        try {
            dateTimeMillis = this.iGregorianChronology.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
        } catch (IllegalFieldValueException e) {
            if (i2 == 2 && i3 == 29) {
                dateTimeMillis = this.iGregorianChronology.getDateTimeMillis(i, i2, 28, i4, i5, i6, i7);
                if (dateTimeMillis >= this.iCutoverMillis) {
                    throw e;
                }
            } else {
                throw e;
            }
        }
        if (dateTimeMillis < this.iCutoverMillis) {
            dateTimeMillis = this.iJulianChronology.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
            if (dateTimeMillis >= this.iCutoverMillis) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return dateTimeMillis;
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, long j, int i) {
        return getInstance(dateTimeZone, j == DEFAULT_CUTOVER.getMillis() ? null : new Instant(j), i);
    }
}
