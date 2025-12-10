package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;
import androidx.core.util.Preconditions;
import com.google.android.material.R;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.cli.HelpFormatter;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class RangeDateSelector implements DateSelector<Pair<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new C6929c();

    /* renamed from: a */
    public CharSequence f49832a;

    /* renamed from: b */
    public String f49833b;

    /* renamed from: c */
    public final String f49834c = HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR;

    /* renamed from: d */
    public Long f49835d = null;

    /* renamed from: e */
    public Long f49836e = null;

    /* renamed from: f */
    public Long f49837f = null;

    /* renamed from: g */
    public Long f49838g = null;

    /* renamed from: h */
    public SimpleDateFormat f49839h;

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$a */
    /* loaded from: classes4.dex */
    public class C6927a extends AbstractC6933a {

        /* renamed from: g */
        public final /* synthetic */ TextInputLayout f49840g;

        /* renamed from: h */
        public final /* synthetic */ TextInputLayout f49841h;

        /* renamed from: i */
        public final /* synthetic */ OnSelectionChangedListener f49842i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6927a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, OnSelectionChangedListener onSelectionChangedListener) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f49840g = textInputLayout2;
            this.f49841h = textInputLayout3;
            this.f49842i = onSelectionChangedListener;
        }

        @Override // com.google.android.material.datepicker.AbstractC6933a
        /* renamed from: f */
        public void mo44827f() {
            RangeDateSelector.this.f49837f = null;
            RangeDateSelector.this.m44847j(this.f49840g, this.f49841h, this.f49842i);
        }

        @Override // com.google.android.material.datepicker.AbstractC6933a
        /* renamed from: g */
        public void mo44826g(Long l) {
            RangeDateSelector.this.f49837f = l;
            RangeDateSelector.this.m44847j(this.f49840g, this.f49841h, this.f49842i);
        }
    }

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$b */
    /* loaded from: classes4.dex */
    public class C6928b extends AbstractC6933a {

        /* renamed from: g */
        public final /* synthetic */ TextInputLayout f49844g;

        /* renamed from: h */
        public final /* synthetic */ TextInputLayout f49845h;

        /* renamed from: i */
        public final /* synthetic */ OnSelectionChangedListener f49846i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6928b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, OnSelectionChangedListener onSelectionChangedListener) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f49844g = textInputLayout2;
            this.f49845h = textInputLayout3;
            this.f49846i = onSelectionChangedListener;
        }

        @Override // com.google.android.material.datepicker.AbstractC6933a
        /* renamed from: f */
        public void mo44827f() {
            RangeDateSelector.this.f49838g = null;
            RangeDateSelector.this.m44847j(this.f49844g, this.f49845h, this.f49846i);
        }

        @Override // com.google.android.material.datepicker.AbstractC6933a
        /* renamed from: g */
        public void mo44826g(Long l) {
            RangeDateSelector.this.f49838g = l;
            RangeDateSelector.this.m44847j(this.f49844g, this.f49845h, this.f49846i);
        }
    }

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$c */
    /* loaded from: classes4.dex */
    public class C6929c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RangeDateSelector createFromParcel(Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.f49835d = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.f49836e = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public RangeDateSelector[] newArray(int i) {
            return new RangeDateSelector[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public final void m44851f(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.f49833b.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() != null && HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR.contentEquals(textInputLayout2.getError())) {
            textInputLayout2.setError(null);
        }
    }

    /* renamed from: g */
    public final boolean m44850g(long j, long j2) {
        return j <= j2;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(@NonNull Context context) {
        int i;
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis)) {
            i = R.attr.materialCalendarTheme;
        } else {
            i = R.attr.materialCalendarFullscreenTheme;
        }
        return MaterialAttributes.resolveOrThrow(context, i, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
        return R.string.mtrl_picker_range_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @Nullable
    public String getError() {
        if (TextUtils.isEmpty(this.f49832a)) {
            return null;
        }
        return this.f49832a.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Long> getSelectedDays() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f49835d;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.f49836e;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Pair<Long, Long>> getSelectedRanges() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(this.f49835d, this.f49836e));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionContentDescription(@NonNull Context context) {
        String str;
        String str2;
        Resources resources = context.getResources();
        Pair m65902a = AbstractC1521VD.m65902a(this.f49835d, this.f49836e);
        Object obj = m65902a.first;
        if (obj == null) {
            str = resources.getString(R.string.mtrl_picker_announce_current_selection_none);
        } else {
            str = (String) obj;
        }
        Object obj2 = m65902a.second;
        if (obj2 == null) {
            str2 = resources.getString(R.string.mtrl_picker_announce_current_selection_none);
        } else {
            str2 = (String) obj2;
        }
        return resources.getString(R.string.mtrl_picker_announce_current_range_selection, str, str2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionDisplayString(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l = this.f49835d;
        if (l == null && this.f49836e == null) {
            return resources.getString(R.string.mtrl_picker_range_header_unselected);
        }
        Long l2 = this.f49836e;
        if (l2 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_start_selected, AbstractC1521VD.m65900c(l.longValue()));
        }
        if (l == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_end_selected, AbstractC1521VD.m65900c(l2.longValue()));
        }
        Pair m65902a = AbstractC1521VD.m65902a(l, l2);
        return resources.getString(R.string.mtrl_picker_range_header_selected, m65902a.first, m65902a.second);
    }

    /* renamed from: h */
    public final void m44849h(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.f49833b);
        textInputLayout2.setError(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
    }

    /* renamed from: i */
    public final void m44848i(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            this.f49832a = textInputLayout.getError();
        } else if (!TextUtils.isEmpty(textInputLayout2.getError())) {
            this.f49832a = textInputLayout2.getError();
        } else {
            this.f49832a = null;
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
        Long l = this.f49835d;
        if (l != null && this.f49836e != null && m44850g(l.longValue(), this.f49836e.longValue())) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void m44847j(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, OnSelectionChangedListener onSelectionChangedListener) {
        Long l = this.f49837f;
        if (l != null && this.f49838g != null) {
            if (m44850g(l.longValue(), this.f49838g.longValue())) {
                this.f49835d = this.f49837f;
                this.f49836e = this.f49838g;
                onSelectionChangedListener.onSelectionChanged(getSelection());
            } else {
                m44849h(textInputLayout, textInputLayout2);
                onSelectionChangedListener.onIncompleteSelectionChanged();
            }
        } else {
            m44851f(textInputLayout, textInputLayout2);
            onSelectionChangedListener.onIncompleteSelectionChanged();
        }
        m44848i(textInputLayout, textInputLayout2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View onCreateTextInputView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, CalendarConstraints calendarConstraints, @NonNull OnSelectionChangedListener<Pair<Long, Long>> onSelectionChangedListener) {
        boolean z;
        String m1142h;
        View inflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_range_end);
        textInputLayout.setErrorAccessibilityLiveRegion(0);
        textInputLayout2.setErrorAccessibilityLiveRegion(0);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f49833b = inflate.getResources().getString(R.string.mtrl_picker_invalid_range);
        SimpleDateFormat simpleDateFormat = this.f49839h;
        if (simpleDateFormat != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            simpleDateFormat = AbstractC22545v02.m1143g();
        }
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        Long l = this.f49835d;
        if (l != null) {
            editText.setText(simpleDateFormat2.format(l));
            this.f49837f = this.f49835d;
        }
        Long l2 = this.f49836e;
        if (l2 != null) {
            editText2.setText(simpleDateFormat2.format(l2));
            this.f49838g = this.f49836e;
        }
        if (z) {
            m1142h = simpleDateFormat2.toPattern();
        } else {
            m1142h = AbstractC22545v02.m1142h(inflate.getResources(), simpleDateFormat2);
        }
        String str = m1142h;
        textInputLayout.setPlaceholderText(str);
        textInputLayout2.setPlaceholderText(str);
        editText.addTextChangedListener(new C6927a(str, simpleDateFormat2, textInputLayout, calendarConstraints, textInputLayout, textInputLayout2, onSelectionChangedListener));
        editText2.addTextChangedListener(new C6928b(str, simpleDateFormat2, textInputLayout2, calendarConstraints, textInputLayout, textInputLayout2, onSelectionChangedListener));
        AbstractC1297SD.m66361b(editText, editText2);
        return inflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long j) {
        Long l = this.f49835d;
        if (l == null) {
            this.f49835d = Long.valueOf(j);
        } else if (this.f49836e == null && m44850g(l.longValue(), j)) {
            this.f49836e = Long.valueOf(j);
        } else {
            this.f49836e = null;
            this.f49835d = Long.valueOf(j);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setTextInputFormat(@Nullable SimpleDateFormat simpleDateFormat) {
        this.f49839h = simpleDateFormat;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeValue(this.f49835d);
        parcel.writeValue(this.f49836e);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Pair<Long, Long> getSelection() {
        return new Pair<>(this.f49835d, this.f49836e);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setSelection(@NonNull Pair<Long, Long> pair) {
        Long l = pair.first;
        if (l != null && pair.second != null) {
            Preconditions.checkArgument(m44850g(l.longValue(), pair.second.longValue()));
        }
        Long l2 = pair.first;
        this.f49835d = l2 == null ? null : Long.valueOf(AbstractC22545v02.m1149a(l2.longValue()));
        Long l3 = pair.second;
        this.f49836e = l3 != null ? Long.valueOf(AbstractC22545v02.m1149a(l3.longValue())) : null;
    }
}
