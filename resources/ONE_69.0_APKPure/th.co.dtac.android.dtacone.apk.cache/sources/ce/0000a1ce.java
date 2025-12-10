package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {

    /* renamed from: a */
    public final InterfaceC6892d f49735a;

    /* renamed from: b */
    public final List f49736b;

    /* renamed from: c */
    public static final InterfaceC6892d f49733c = new C6889a();

    /* renamed from: d */
    public static final InterfaceC6892d f49734d = new C6890b();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new C6891c();

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$a */
    /* loaded from: classes4.dex */
    public class C6889a implements InterfaceC6892d {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.InterfaceC6892d
        /* renamed from: a */
        public boolean mo44895a(List list, long j) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
                if (dateValidator != null && dateValidator.isValid(j)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.InterfaceC6892d
        public int getId() {
            return 1;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$b */
    /* loaded from: classes4.dex */
    public class C6890b implements InterfaceC6892d {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.InterfaceC6892d
        /* renamed from: a */
        public boolean mo44895a(List list, long j) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
                if (dateValidator != null && !dateValidator.isValid(j)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.InterfaceC6892d
        public int getId() {
            return 2;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$c */
    /* loaded from: classes4.dex */
    public class C6891c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CompositeDateValidator createFromParcel(Parcel parcel) {
            InterfaceC6892d interfaceC6892d;
            ArrayList readArrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int readInt = parcel.readInt();
            if (readInt == 2) {
                interfaceC6892d = CompositeDateValidator.f49734d;
            } else {
                interfaceC6892d = readInt == 1 ? CompositeDateValidator.f49733c : CompositeDateValidator.f49734d;
            }
            return new CompositeDateValidator((List) Preconditions.checkNotNull(readArrayList), interfaceC6892d, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CompositeDateValidator[] newArray(int i) {
            return new CompositeDateValidator[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$d */
    /* loaded from: classes4.dex */
    public interface InterfaceC6892d {
        /* renamed from: a */
        boolean mo44895a(List list, long j);

        int getId();
    }

    public /* synthetic */ CompositeDateValidator(List list, InterfaceC6892d interfaceC6892d, C6889a c6889a) {
        this(list, interfaceC6892d);
    }

    @NonNull
    public static CalendarConstraints.DateValidator allOf(@NonNull List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, f49734d);
    }

    @NonNull
    public static CalendarConstraints.DateValidator anyOf(@NonNull List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, f49733c);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        if (this.f49736b.equals(compositeDateValidator.f49736b) && this.f49735a.getId() == compositeDateValidator.f49735a.getId()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f49736b.hashCode();
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean isValid(long j) {
        return this.f49735a.mo44895a(this.f49736b, j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeList(this.f49736b);
        parcel.writeInt(this.f49735a.getId());
    }

    public CompositeDateValidator(List list, InterfaceC6892d interfaceC6892d) {
        this.f49736b = list;
        this.f49735a = interfaceC6892d;
    }
}