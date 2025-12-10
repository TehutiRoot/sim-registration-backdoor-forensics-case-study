package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C6899a();

    /* renamed from: a */
    public final C21662pt0 f49707a;

    /* renamed from: b */
    public final C21662pt0 f49708b;

    /* renamed from: c */
    public final DateValidator f49709c;

    /* renamed from: d */
    public C21662pt0 f49710d;

    /* renamed from: e */
    public final int f49711e;

    /* renamed from: f */
    public final int f49712f;

    /* renamed from: g */
    public final int f49713g;

    /* loaded from: classes4.dex */
    public interface DateValidator extends Parcelable {
        boolean isValid(long j);
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$a */
    /* loaded from: classes4.dex */
    public class C6899a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((C21662pt0) parcel.readParcelable(C21662pt0.class.getClassLoader()), (C21662pt0) parcel.readParcelable(C21662pt0.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (C21662pt0) parcel.readParcelable(C21662pt0.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    public /* synthetic */ CalendarConstraints(C21662pt0 c21662pt0, C21662pt0 c21662pt02, DateValidator dateValidator, C21662pt0 c21662pt03, int i, C6899a c6899a) {
        this(c21662pt0, c21662pt02, dateValidator, c21662pt03, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        if (this.f49707a.equals(calendarConstraints.f49707a) && this.f49708b.equals(calendarConstraints.f49708b) && ObjectsCompat.equals(this.f49710d, calendarConstraints.f49710d) && this.f49711e == calendarConstraints.f49711e && this.f49709c.equals(calendarConstraints.f49709c)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public C21662pt0 m44934f(C21662pt0 c21662pt0) {
        if (c21662pt0.compareTo(this.f49707a) < 0) {
            return this.f49707a;
        }
        if (c21662pt0.compareTo(this.f49708b) > 0) {
            return this.f49708b;
        }
        return c21662pt0;
    }

    /* renamed from: g */
    public C21662pt0 m44933g() {
        return this.f49708b;
    }

    public DateValidator getDateValidator() {
        return this.f49709c;
    }

    public long getEndMs() {
        return this.f49708b.f76799f;
    }

    @Nullable
    public Long getOpenAtMs() {
        C21662pt0 c21662pt0 = this.f49710d;
        if (c21662pt0 == null) {
            return null;
        }
        return Long.valueOf(c21662pt0.f76799f);
    }

    public long getStartMs() {
        return this.f49707a.f76799f;
    }

    /* renamed from: h */
    public int m44932h() {
        return this.f49711e;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49707a, this.f49708b, this.f49710d, Integer.valueOf(this.f49711e), this.f49709c});
    }

    /* renamed from: i */
    public int m44931i() {
        return this.f49713g;
    }

    /* renamed from: j */
    public C21662pt0 m44930j() {
        return this.f49710d;
    }

    /* renamed from: k */
    public C21662pt0 m44929k() {
        return this.f49707a;
    }

    /* renamed from: l */
    public int m44928l() {
        return this.f49712f;
    }

    /* renamed from: m */
    public boolean m44927m(long j) {
        if (this.f49707a.m23562f(1) <= j) {
            C21662pt0 c21662pt0 = this.f49708b;
            if (j <= c21662pt0.m23562f(c21662pt0.f76798e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public void m44926n(C21662pt0 c21662pt0) {
        this.f49710d = c21662pt0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f49707a, 0);
        parcel.writeParcelable(this.f49708b, 0);
        parcel.writeParcelable(this.f49710d, 0);
        parcel.writeParcelable(this.f49709c, 0);
        parcel.writeInt(this.f49711e);
    }

    public CalendarConstraints(C21662pt0 c21662pt0, C21662pt0 c21662pt02, DateValidator dateValidator, C21662pt0 c21662pt03, int i) {
        Objects.requireNonNull(c21662pt0, "start cannot be null");
        Objects.requireNonNull(c21662pt02, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f49707a = c21662pt0;
        this.f49708b = c21662pt02;
        this.f49710d = c21662pt03;
        this.f49711e = i;
        this.f49709c = dateValidator;
        if (c21662pt03 != null && c21662pt0.compareTo(c21662pt03) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c21662pt03 != null && c21662pt03.compareTo(c21662pt02) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i >= 0 && i <= AbstractC22545v02.m1133q().getMaximum(7)) {
            this.f49713g = c21662pt0.m23557k(c21662pt02) + 1;
            this.f49712f = (c21662pt02.f76796c - c21662pt0.f76796c) + 1;
            return;
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: f */
        public static final long f49714f = AbstractC22545v02.m1149a(C21662pt0.m23566b(1900, 0).f76799f);

        /* renamed from: g */
        public static final long f49715g = AbstractC22545v02.m1149a(C21662pt0.m23566b(2100, 11).f76799f);

        /* renamed from: a */
        public long f49716a;

        /* renamed from: b */
        public long f49717b;

        /* renamed from: c */
        public Long f49718c;

        /* renamed from: d */
        public int f49719d;

        /* renamed from: e */
        public DateValidator f49720e;

        public Builder() {
            this.f49716a = f49714f;
            this.f49717b = f49715g;
            this.f49720e = DateValidatorPointForward.from(Long.MIN_VALUE);
        }

        @NonNull
        public CalendarConstraints build() {
            C21662pt0 m23565c;
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f49720e);
            C21662pt0 m23565c2 = C21662pt0.m23565c(this.f49716a);
            C21662pt0 m23565c3 = C21662pt0.m23565c(this.f49717b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.f49718c;
            if (l == null) {
                m23565c = null;
            } else {
                m23565c = C21662pt0.m23565c(l.longValue());
            }
            return new CalendarConstraints(m23565c2, m23565c3, dateValidator, m23565c, this.f49719d, null);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setEnd(long j) {
            this.f49717b = j;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setFirstDayOfWeek(int i) {
            this.f49719d = i;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setOpenAt(long j) {
            this.f49718c = Long.valueOf(j);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setStart(long j) {
            this.f49716a = j;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setValidator(@NonNull DateValidator dateValidator) {
            Objects.requireNonNull(dateValidator, "validator cannot be null");
            this.f49720e = dateValidator;
            return this;
        }

        public Builder(CalendarConstraints calendarConstraints) {
            this.f49716a = f49714f;
            this.f49717b = f49715g;
            this.f49720e = DateValidatorPointForward.from(Long.MIN_VALUE);
            this.f49716a = calendarConstraints.f49707a.f76799f;
            this.f49717b = calendarConstraints.f49708b.f76799f;
            this.f49718c = Long.valueOf(calendarConstraints.f49710d.f76799f);
            this.f49719d = calendarConstraints.f49711e;
            this.f49720e = calendarConstraints.f49709c;
        }
    }
}
