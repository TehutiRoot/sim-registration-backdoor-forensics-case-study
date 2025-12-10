package org.joda.time.field;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

/* loaded from: classes5.dex */
public class PreciseDateTimeField extends PreciseDurationDateTimeField {

    /* renamed from: d */
    public final int f76151d;

    /* renamed from: e */
    public final DurationField f76152e;

    public PreciseDateTimeField(DateTimeFieldType dateTimeFieldType, DurationField durationField, DurationField durationField2) {
        super(dateTimeFieldType, durationField);
        if (durationField2.isPrecise()) {
            int unitMillis = (int) (durationField2.getUnitMillis() / getUnitMillis());
            this.f76151d = unitMillis;
            if (unitMillis >= 2) {
                this.f76152e = durationField2;
                return;
            }
            throw new IllegalArgumentException("The effective range must be at least 2");
        }
        throw new IllegalArgumentException("Range duration field must be precise");
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j, int i) {
        int i2 = get(j);
        return j + ((FieldUtils.getWrappedValue(i2, i, getMinimumValue(), getMaximumValue()) - i2) * getUnitMillis());
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j) {
        if (j >= 0) {
            return (int) ((j / getUnitMillis()) % this.f76151d);
        }
        return (this.f76151d - 1) + ((int) (((j + 1) / getUnitMillis()) % this.f76151d));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.f76151d - 1;
    }

    public int getRange() {
        return this.f76151d;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.f76152e;
    }

    @Override // org.joda.time.field.PreciseDurationDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j, int i) {
        FieldUtils.verifyValueBounds(this, i, getMinimumValue(), getMaximumValue());
        return j + ((i - get(j)) * this.f76153b);
    }
}
