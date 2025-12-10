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
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C6888a();

    /* renamed from: a */
    public final C22762vt0 f49719a;

    /* renamed from: b */
    public final C22762vt0 f49720b;

    /* renamed from: c */
    public final DateValidator f49721c;

    /* renamed from: d */
    public C22762vt0 f49722d;

    /* renamed from: e */
    public final int f49723e;

    /* renamed from: f */
    public final int f49724f;

    /* renamed from: g */
    public final int f49725g;

    /* loaded from: classes4.dex */
    public interface DateValidator extends Parcelable {
        boolean isValid(long j);
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$a */
    /* loaded from: classes4.dex */
    public class C6888a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((C22762vt0) parcel.readParcelable(C22762vt0.class.getClassLoader()), (C22762vt0) parcel.readParcelable(C22762vt0.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (C22762vt0) parcel.readParcelable(C22762vt0.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    public /* synthetic */ CalendarConstraints(C22762vt0 c22762vt0, C22762vt0 c22762vt02, DateValidator dateValidator, C22762vt0 c22762vt03, int i, C6888a c6888a) {
        this(c22762vt0, c22762vt02, dateValidator, c22762vt03, i);
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
        if (this.f49719a.equals(calendarConstraints.f49719a) && this.f49720b.equals(calendarConstraints.f49720b) && ObjectsCompat.equals(this.f49722d, calendarConstraints.f49722d) && this.f49723e == calendarConstraints.f49723e && this.f49721c.equals(calendarConstraints.f49721c)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public C22762vt0 m44910f(C22762vt0 c22762vt0) {
        if (c22762vt0.compareTo(this.f49719a) < 0) {
            return this.f49719a;
        }
        if (c22762vt0.compareTo(this.f49720b) > 0) {
            return this.f49720b;
        }
        return c22762vt0;
    }

    /* renamed from: g */
    public C22762vt0 m44909g() {
        return this.f49720b;
    }

    public DateValidator getDateValidator() {
        return this.f49721c;
    }

    public long getEndMs() {
        return this.f49720b.f108258f;
    }

    @Nullable
    public Long getOpenAtMs() {
        C22762vt0 c22762vt0 = this.f49722d;
        if (c22762vt0 == null) {
            return null;
        }
        return Long.valueOf(c22762vt0.f108258f);
    }

    public long getStartMs() {
        return this.f49719a.f108258f;
    }

    /* renamed from: h */
    public int m44908h() {
        return this.f49723e;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49719a, this.f49720b, this.f49722d, Integer.valueOf(this.f49723e), this.f49721c});
    }

    /* renamed from: i */
    public int m44907i() {
        return this.f49725g;
    }

    /* renamed from: j */
    public C22762vt0 m44906j() {
        return this.f49722d;
    }

    /* renamed from: k */
    public C22762vt0 m44905k() {
        return this.f49719a;
    }

    /* renamed from: l */
    public int m44904l() {
        return this.f49724f;
    }

    /* renamed from: m */
    public boolean m44903m(long j) {
        if (this.f49719a.m833f(1) <= j) {
            C22762vt0 c22762vt0 = this.f49720b;
            if (j <= c22762vt0.m833f(c22762vt0.f108257e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public void m44902n(C22762vt0 c22762vt0) {
        this.f49722d = c22762vt0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f49719a, 0);
        parcel.writeParcelable(this.f49720b, 0);
        parcel.writeParcelable(this.f49722d, 0);
        parcel.writeParcelable(this.f49721c, 0);
        parcel.writeInt(this.f49723e);
    }

    public CalendarConstraints(C22762vt0 c22762vt0, C22762vt0 c22762vt02, DateValidator dateValidator, C22762vt0 c22762vt03, int i) {
        Objects.requireNonNull(c22762vt0, "start cannot be null");
        Objects.requireNonNull(c22762vt02, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f49719a = c22762vt0;
        this.f49720b = c22762vt02;
        this.f49722d = c22762vt03;
        this.f49723e = i;
        this.f49721c = dateValidator;
        if (c22762vt03 != null && c22762vt0.compareTo(c22762vt03) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c22762vt03 != null && c22762vt03.compareTo(c22762vt02) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i >= 0 && i <= AbstractC22096s12.m22893q().getMaximum(7)) {
            this.f49725g = c22762vt0.m828k(c22762vt02) + 1;
            this.f49724f = (c22762vt02.f108255c - c22762vt0.f108255c) + 1;
            return;
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: f */
        public static final long f49726f = AbstractC22096s12.m22909a(C22762vt0.m837b(1900, 0).f108258f);

        /* renamed from: g */
        public static final long f49727g = AbstractC22096s12.m22909a(C22762vt0.m837b(2100, 11).f108258f);

        /* renamed from: a */
        public long f49728a;

        /* renamed from: b */
        public long f49729b;

        /* renamed from: c */
        public Long f49730c;

        /* renamed from: d */
        public int f49731d;

        /* renamed from: e */
        public DateValidator f49732e;

        public Builder() {
            this.f49728a = f49726f;
            this.f49729b = f49727g;
            this.f49732e = DateValidatorPointForward.from(Long.MIN_VALUE);
        }

        @NonNull
        public CalendarConstraints build() {
            C22762vt0 m836c;
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f49732e);
            C22762vt0 m836c2 = C22762vt0.m836c(this.f49728a);
            C22762vt0 m836c3 = C22762vt0.m836c(this.f49729b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.f49730c;
            if (l == null) {
                m836c = null;
            } else {
                m836c = C22762vt0.m836c(l.longValue());
            }
            return new CalendarConstraints(m836c2, m836c3, dateValidator, m836c, this.f49731d, null);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setEnd(long j) {
            this.f49729b = j;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setFirstDayOfWeek(int i) {
            this.f49731d = i;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setOpenAt(long j) {
            this.f49730c = Long.valueOf(j);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setStart(long j) {
            this.f49728a = j;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setValidator(@NonNull DateValidator dateValidator) {
            Objects.requireNonNull(dateValidator, "validator cannot be null");
            this.f49732e = dateValidator;
            return this;
        }

        public Builder(CalendarConstraints calendarConstraints) {
            this.f49728a = f49726f;
            this.f49729b = f49727g;
            this.f49732e = DateValidatorPointForward.from(Long.MIN_VALUE);
            this.f49728a = calendarConstraints.f49719a.f108258f;
            this.f49729b = calendarConstraints.f49720b.f108258f;
            this.f49730c = Long.valueOf(calendarConstraints.f49722d.f108258f);
            this.f49731d = calendarConstraints.f49723e;
            this.f49732e = calendarConstraints.f49721c;
        }
    }
}