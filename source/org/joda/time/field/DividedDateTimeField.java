package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

/* loaded from: classes5.dex */
public class DividedDateTimeField extends DecoratedDateTimeField {

    /* renamed from: c */
    public final int f76141c;

    /* renamed from: d */
    public final DurationField f76142d;

    /* renamed from: e */
    public final DurationField f76143e;

    /* renamed from: f */
    public final int f76144f;

    /* renamed from: g */
    public final int f76145g;

    public DividedDateTimeField(DateTimeField dateTimeField, DateTimeFieldType dateTimeFieldType, int i) {
        this(dateTimeField, dateTimeField.getRangeDurationField(), dateTimeFieldType, i);
    }

    /* renamed from: a */
    public final int m24042a(int i) {
        if (i >= 0) {
            return i % this.f76141c;
        }
        int i2 = this.f76141c;
        return (i2 - 1) + ((i + 1) % i2);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j, int i) {
        return getWrappedField().add(j, i * this.f76141c);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j, int i) {
        return set(j, FieldUtils.getWrappedValue(get(j), i, this.f76144f, this.f76145g));
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j) {
        int i = getWrappedField().get(j);
        if (i >= 0) {
            return i / this.f76141c;
        }
        return ((i + 1) / this.f76141c) - 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getDifference(long j, long j2) {
        return getWrappedField().getDifference(j, j2) / this.f76141c;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j, long j2) {
        return getWrappedField().getDifferenceAsLong(j, j2) / this.f76141c;
    }

    public int getDivisor() {
        return this.f76141c;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getDurationField() {
        return this.f76142d;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.f76145g;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.f76144f;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        DurationField durationField = this.f76143e;
        if (durationField != null) {
            return durationField;
        }
        return super.getRangeDurationField();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j) {
        return set(j, get(getWrappedField().remainder(j)));
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j) {
        DateTimeField wrappedField = getWrappedField();
        return wrappedField.roundFloor(wrappedField.set(j, get(j) * this.f76141c));
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j, int i) {
        FieldUtils.verifyValueBounds(this, i, this.f76144f, this.f76145g);
        return getWrappedField().set(j, (i * this.f76141c) + m24042a(getWrappedField().get(j)));
    }

    public DividedDateTimeField(DateTimeField dateTimeField, DurationField durationField, DateTimeFieldType dateTimeFieldType, int i) {
        super(dateTimeField, dateTimeFieldType);
        if (i >= 2) {
            DurationField durationField2 = dateTimeField.getDurationField();
            if (durationField2 == null) {
                this.f76142d = null;
            } else {
                this.f76142d = new ScaledDurationField(durationField2, dateTimeFieldType.getDurationType(), i);
            }
            this.f76143e = durationField;
            this.f76141c = i;
            int minimumValue = dateTimeField.getMinimumValue();
            int i2 = minimumValue >= 0 ? minimumValue / i : ((minimumValue + 1) / i) - 1;
            int maximumValue = dateTimeField.getMaximumValue();
            int i3 = maximumValue >= 0 ? maximumValue / i : ((maximumValue + 1) / i) - 1;
            this.f76144f = i2;
            this.f76145g = i3;
            return;
        }
        throw new IllegalArgumentException("The divisor must be at least 2");
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j, long j2) {
        return getWrappedField().add(j, j2 * this.f76141c);
    }

    public DividedDateTimeField(RemainderDateTimeField remainderDateTimeField, DateTimeFieldType dateTimeFieldType) {
        this(remainderDateTimeField, (DurationField) null, dateTimeFieldType);
    }

    public DividedDateTimeField(RemainderDateTimeField remainderDateTimeField, DurationField durationField, DateTimeFieldType dateTimeFieldType) {
        super(remainderDateTimeField.getWrappedField(), dateTimeFieldType);
        int i = remainderDateTimeField.f76155c;
        this.f76141c = i;
        this.f76142d = remainderDateTimeField.f76157e;
        this.f76143e = durationField;
        DateTimeField wrappedField = getWrappedField();
        int minimumValue = wrappedField.getMinimumValue();
        int i2 = minimumValue >= 0 ? minimumValue / i : ((minimumValue + 1) / i) - 1;
        int maximumValue = wrappedField.getMaximumValue();
        int i3 = maximumValue >= 0 ? maximumValue / i : ((maximumValue + 1) / i) - 1;
        this.f76144f = i2;
        this.f76145g = i3;
    }
}
