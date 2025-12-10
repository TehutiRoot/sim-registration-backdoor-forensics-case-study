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
    public final InterfaceC6903d f49723a;

    /* renamed from: b */
    public final List f49724b;

    /* renamed from: c */
    public static final InterfaceC6903d f49721c = new C6900a();

    /* renamed from: d */
    public static final InterfaceC6903d f49722d = new C6901b();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new C6902c();

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$a */
    /* loaded from: classes4.dex */
    public class C6900a implements InterfaceC6903d {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.InterfaceC6903d
        /* renamed from: a */
        public boolean mo44919a(List list, long j) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
                if (dateValidator != null && dateValidator.isValid(j)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.InterfaceC6903d
        public int getId() {
            return 1;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$b */
    /* loaded from: classes4.dex */
    public class C6901b implements InterfaceC6903d {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.InterfaceC6903d
        /* renamed from: a */
        public boolean mo44919a(List list, long j) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
                if (dateValidator != null && !dateValidator.isValid(j)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.InterfaceC6903d
        public int getId() {
            return 2;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$c */
    /* loaded from: classes4.dex */
    public class C6902c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CompositeDateValidator createFromParcel(Parcel parcel) {
            InterfaceC6903d interfaceC6903d;
            ArrayList readArrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int readInt = parcel.readInt();
            if (readInt == 2) {
                interfaceC6903d = CompositeDateValidator.f49722d;
            } else {
                interfaceC6903d = readInt == 1 ? CompositeDateValidator.f49721c : CompositeDateValidator.f49722d;
            }
            return new CompositeDateValidator((List) Preconditions.checkNotNull(readArrayList), interfaceC6903d, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CompositeDateValidator[] newArray(int i) {
            return new CompositeDateValidator[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$d */
    /* loaded from: classes4.dex */
    public interface InterfaceC6903d {
        /* renamed from: a */
        boolean mo44919a(List list, long j);

        int getId();
    }

    public /* synthetic */ CompositeDateValidator(List list, InterfaceC6903d interfaceC6903d, C6900a c6900a) {
        this(list, interfaceC6903d);
    }

    @NonNull
    public static CalendarConstraints.DateValidator allOf(@NonNull List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, f49722d);
    }

    @NonNull
    public static CalendarConstraints.DateValidator anyOf(@NonNull List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, f49721c);
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
        if (this.f49724b.equals(compositeDateValidator.f49724b) && this.f49723a.getId() == compositeDateValidator.f49723a.getId()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f49724b.hashCode();
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean isValid(long j) {
        return this.f49723a.mo44919a(this.f49724b, j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeList(this.f49724b);
        parcel.writeInt(this.f49723a.getId());
    }

    public CompositeDateValidator(List list, InterfaceC6903d interfaceC6903d) {
        this.f49724b = list;
        this.f49723a = interfaceC6903d;
    }
}
