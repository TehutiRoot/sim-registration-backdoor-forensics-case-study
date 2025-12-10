package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;
import com.google.android.material.R;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new C6931b();

    /* renamed from: a */
    public CharSequence f49848a;

    /* renamed from: b */
    public Long f49849b;

    /* renamed from: c */
    public SimpleDateFormat f49850c;

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$a */
    /* loaded from: classes4.dex */
    public class C6930a extends AbstractC6933a {

        /* renamed from: g */
        public final /* synthetic */ OnSelectionChangedListener f49851g;

        /* renamed from: h */
        public final /* synthetic */ TextInputLayout f49852h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6930a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, OnSelectionChangedListener onSelectionChangedListener, TextInputLayout textInputLayout2) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f49851g = onSelectionChangedListener;
            this.f49852h = textInputLayout2;
        }

        @Override // com.google.android.material.datepicker.AbstractC6933a
        /* renamed from: f */
        public void mo44827f() {
            SingleDateSelector.this.f49848a = this.f49852h.getError();
            this.f49851g.onIncompleteSelectionChanged();
        }

        @Override // com.google.android.material.datepicker.AbstractC6933a
        /* renamed from: g */
        public void mo44826g(Long l) {
            if (l == null) {
                SingleDateSelector.this.m44841d();
            } else {
                SingleDateSelector.this.select(l.longValue());
            }
            SingleDateSelector.this.f49848a = null;
            this.f49851g.onSelectionChanged(SingleDateSelector.this.getSelection());
        }
    }

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$b */
    /* loaded from: classes4.dex */
    public class C6931b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public SingleDateSelector createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.f49849b = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public SingleDateSelector[] newArray(int i) {
            return new SingleDateSelector[i];
        }
    }

    /* renamed from: d */
    public final void m44841d() {
        this.f49849b = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(Context context) {
        return MaterialAttributes.resolveOrThrow(context, R.attr.materialCalendarTheme, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
        return R.string.mtrl_picker_date_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @Nullable
    public String getError() {
        if (TextUtils.isEmpty(this.f49848a)) {
            return null;
        }
        return this.f49848a.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Long> getSelectedDays() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f49849b;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Pair<Long, Long>> getSelectedRanges() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionContentDescription(@NonNull Context context) {
        String m65890m;
        Resources resources = context.getResources();
        Long l = this.f49849b;
        if (l == null) {
            m65890m = resources.getString(R.string.mtrl_picker_announce_current_selection_none);
        } else {
            m65890m = AbstractC1521VD.m65890m(l.longValue());
        }
        return resources.getString(R.string.mtrl_picker_announce_current_selection, m65890m);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionDisplayString(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l = this.f49849b;
        if (l == null) {
            return resources.getString(R.string.mtrl_picker_date_header_unselected);
        }
        return resources.getString(R.string.mtrl_picker_date_header_selected, AbstractC1521VD.m65890m(l.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
        if (this.f49849b != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View onCreateTextInputView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, CalendarConstraints calendarConstraints, @NonNull OnSelectionChangedListener<Long> onSelectionChangedListener) {
        boolean z;
        String m1142h;
        View inflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_date);
        textInputLayout.setErrorAccessibilityLiveRegion(0);
        EditText editText = textInputLayout.getEditText();
        if (ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()) {
            editText.setInputType(17);
        }
        SimpleDateFormat simpleDateFormat = this.f49850c;
        if (simpleDateFormat != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            simpleDateFormat = AbstractC22545v02.m1143g();
        }
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        if (z) {
            m1142h = simpleDateFormat2.toPattern();
        } else {
            m1142h = AbstractC22545v02.m1142h(inflate.getResources(), simpleDateFormat2);
        }
        String str = m1142h;
        textInputLayout.setPlaceholderText(str);
        Long l = this.f49849b;
        if (l != null) {
            editText.setText(simpleDateFormat2.format(l));
        }
        editText.addTextChangedListener(new C6930a(str, simpleDateFormat2, textInputLayout, calendarConstraints, onSelectionChangedListener, textInputLayout));
        AbstractC1297SD.m66361b(editText);
        return inflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long j) {
        this.f49849b = Long.valueOf(j);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setTextInputFormat(@Nullable SimpleDateFormat simpleDateFormat) {
        this.f49850c = simpleDateFormat;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeValue(this.f49849b);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    @Nullable
    public Long getSelection() {
        return this.f49849b;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setSelection(@Nullable Long l) {
        this.f49849b = l == null ? null : Long.valueOf(AbstractC22545v02.m1149a(l.longValue()));
    }
}
