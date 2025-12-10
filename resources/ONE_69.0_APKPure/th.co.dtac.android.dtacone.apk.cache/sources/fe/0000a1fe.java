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
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new C6920b();

    /* renamed from: a */
    public CharSequence f49860a;

    /* renamed from: b */
    public Long f49861b;

    /* renamed from: c */
    public SimpleDateFormat f49862c;

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$a */
    /* loaded from: classes4.dex */
    public class C6919a extends AbstractC6922a {

        /* renamed from: g */
        public final /* synthetic */ OnSelectionChangedListener f49863g;

        /* renamed from: h */
        public final /* synthetic */ TextInputLayout f49864h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6919a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, OnSelectionChangedListener onSelectionChangedListener, TextInputLayout textInputLayout2) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f49863g = onSelectionChangedListener;
            this.f49864h = textInputLayout2;
        }

        @Override // com.google.android.material.datepicker.AbstractC6922a
        /* renamed from: f */
        public void mo44803f() {
            SingleDateSelector.this.f49860a = this.f49864h.getError();
            this.f49863g.onIncompleteSelectionChanged();
        }

        @Override // com.google.android.material.datepicker.AbstractC6922a
        /* renamed from: g */
        public void mo44802g(Long l) {
            if (l == null) {
                SingleDateSelector.this.m44817d();
            } else {
                SingleDateSelector.this.select(l.longValue());
            }
            SingleDateSelector.this.f49860a = null;
            this.f49863g.onSelectionChanged(SingleDateSelector.this.getSelection());
        }
    }

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$b */
    /* loaded from: classes4.dex */
    public class C6920b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public SingleDateSelector createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.f49861b = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public SingleDateSelector[] newArray(int i) {
            return new SingleDateSelector[i];
        }
    }

    /* renamed from: d */
    public final void m44817d() {
        this.f49861b = null;
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
        if (TextUtils.isEmpty(this.f49860a)) {
            return null;
        }
        return this.f49860a.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Long> getSelectedDays() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f49861b;
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
        String m65781m;
        Resources resources = context.getResources();
        Long l = this.f49861b;
        if (l == null) {
            m65781m = resources.getString(R.string.mtrl_picker_announce_current_selection_none);
        } else {
            m65781m = AbstractC1581WD.m65781m(l.longValue());
        }
        return resources.getString(R.string.mtrl_picker_announce_current_selection, m65781m);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionDisplayString(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l = this.f49861b;
        if (l == null) {
            return resources.getString(R.string.mtrl_picker_date_header_unselected);
        }
        return resources.getString(R.string.mtrl_picker_date_header_selected, AbstractC1581WD.m65781m(l.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
        if (this.f49861b != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View onCreateTextInputView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, CalendarConstraints calendarConstraints, @NonNull OnSelectionChangedListener<Long> onSelectionChangedListener) {
        boolean z;
        String m22902h;
        View inflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_date);
        textInputLayout.setErrorAccessibilityLiveRegion(0);
        EditText editText = textInputLayout.getEditText();
        if (ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()) {
            editText.setInputType(17);
        }
        SimpleDateFormat simpleDateFormat = this.f49862c;
        if (simpleDateFormat != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            simpleDateFormat = AbstractC22096s12.m22903g();
        }
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        if (z) {
            m22902h = simpleDateFormat2.toPattern();
        } else {
            m22902h = AbstractC22096s12.m22902h(inflate.getResources(), simpleDateFormat2);
        }
        String str = m22902h;
        textInputLayout.setPlaceholderText(str);
        Long l = this.f49861b;
        if (l != null) {
            editText.setText(simpleDateFormat2.format(l));
        }
        editText.addTextChangedListener(new C6919a(str, simpleDateFormat2, textInputLayout, calendarConstraints, onSelectionChangedListener, textInputLayout));
        AbstractC1355TD.m66361b(editText);
        return inflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long j) {
        this.f49861b = Long.valueOf(j);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setTextInputFormat(@Nullable SimpleDateFormat simpleDateFormat) {
        this.f49862c = simpleDateFormat;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeValue(this.f49861b);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    @Nullable
    public Long getSelection() {
        return this.f49861b;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setSelection(@Nullable Long l) {
        this.f49861b = l == null ? null : Long.valueOf(AbstractC22096s12.m22909a(l.longValue()));
    }
}