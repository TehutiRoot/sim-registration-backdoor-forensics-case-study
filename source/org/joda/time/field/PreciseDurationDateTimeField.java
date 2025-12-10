package org.joda.time.field;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

/* loaded from: classes5.dex */
public abstract class PreciseDurationDateTimeField extends BaseDateTimeField {

    /* renamed from: b */
    public final long f76153b;

    /* renamed from: c */
    public final DurationField f76154c;

    public PreciseDurationDateTimeField(DateTimeFieldType dateTimeFieldType, DurationField durationField) {
        super(dateTimeFieldType);
        if (durationField.isPrecise()) {
            long unitMillis = durationField.getUnitMillis();
            this.f76153b = unitMillis;
            if (unitMillis >= 1) {
                this.f76154c = durationField;
                return;
            }
            throw new IllegalArgumentException("The unit milliseconds must be at least 1");
        }
        throw new IllegalArgumentException("Unit duration field must be precise");
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getDurationField() {
        return this.f76154c;
    }

    public int getMaximumValueForSet(long j, int i) {
        return getMaximumValue(j);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 0;
    }

    public final long getUnitMillis() {
        return this.f76153b;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j) {
        if (j >= 0) {
            return j % this.f76153b;
        }
        long j2 = this.f76153b;
        return (((j + 1) % j2) + j2) - 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundCeiling(long j) {
        if (j > 0) {
            long j2 = j - 1;
            long j3 = this.f76153b;
            return (j2 - (j2 % j3)) + j3;
        }
        return j - (j % this.f76153b);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j) {
        long j2;
        if (j >= 0) {
            j2 = j % this.f76153b;
        } else {
            long j3 = j + 1;
            j2 = this.f76153b;
            j = j3 - (j3 % j2);
        }
        return j - j2;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j, int i) {
        FieldUtils.verifyValueBounds(this, i, getMinimumValue(), getMaximumValueForSet(j, i));
        return j + ((i - get(j)) * this.f76153b);
    }
}
