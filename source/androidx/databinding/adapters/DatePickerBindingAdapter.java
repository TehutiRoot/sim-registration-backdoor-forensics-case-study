package androidx.databinding.adapters;

import android.widget.DatePicker;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.InverseBindingMethod;
import androidx.databinding.InverseBindingMethods;
import androidx.databinding.library.baseAdapters.R;

@InverseBindingMethods({@InverseBindingMethod(attribute = "android:year", type = DatePicker.class), @InverseBindingMethod(attribute = "android:month", type = DatePicker.class), @InverseBindingMethod(attribute = "android:day", method = "getDayOfMonth", type = DatePicker.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class DatePickerBindingAdapter {

    /* renamed from: androidx.databinding.adapters.DatePickerBindingAdapter$b */
    /* loaded from: classes2.dex */
    public static class C4296b implements DatePicker.OnDateChangedListener {

        /* renamed from: a */
        public DatePicker.OnDateChangedListener f34558a;

        /* renamed from: b */
        public InverseBindingListener f34559b;

        /* renamed from: c */
        public InverseBindingListener f34560c;

        /* renamed from: d */
        public InverseBindingListener f34561d;

        public C4296b() {
        }

        /* renamed from: a */
        public void m56294a(DatePicker.OnDateChangedListener onDateChangedListener, InverseBindingListener inverseBindingListener, InverseBindingListener inverseBindingListener2, InverseBindingListener inverseBindingListener3) {
            this.f34558a = onDateChangedListener;
            this.f34559b = inverseBindingListener;
            this.f34560c = inverseBindingListener2;
            this.f34561d = inverseBindingListener3;
        }

        @Override // android.widget.DatePicker.OnDateChangedListener
        public void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
            DatePicker.OnDateChangedListener onDateChangedListener = this.f34558a;
            if (onDateChangedListener != null) {
                onDateChangedListener.onDateChanged(datePicker, i, i2, i3);
            }
            InverseBindingListener inverseBindingListener = this.f34559b;
            if (inverseBindingListener != null) {
                inverseBindingListener.onChange();
            }
            InverseBindingListener inverseBindingListener2 = this.f34560c;
            if (inverseBindingListener2 != null) {
                inverseBindingListener2.onChange();
            }
            InverseBindingListener inverseBindingListener3 = this.f34561d;
            if (inverseBindingListener3 != null) {
                inverseBindingListener3.onChange();
            }
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:year", "android:month", "android:day", "android:onDateChanged", "android:yearAttrChanged", "android:monthAttrChanged", "android:dayAttrChanged"})
    public static void setListeners(DatePicker datePicker, int i, int i2, int i3, DatePicker.OnDateChangedListener onDateChangedListener, InverseBindingListener inverseBindingListener, InverseBindingListener inverseBindingListener2, InverseBindingListener inverseBindingListener3) {
        if (i == 0) {
            i = datePicker.getYear();
        }
        if (i3 == 0) {
            i3 = datePicker.getDayOfMonth();
        }
        if (inverseBindingListener == null && inverseBindingListener2 == null && inverseBindingListener3 == null) {
            datePicker.init(i, i2, i3, onDateChangedListener);
            return;
        }
        C4296b c4296b = (C4296b) ListenerUtil.getListener(datePicker, R.id.onDateChanged);
        if (c4296b == null) {
            c4296b = new C4296b();
            ListenerUtil.trackListener(datePicker, c4296b, R.id.onDateChanged);
        }
        c4296b.m56294a(onDateChangedListener, inverseBindingListener, inverseBindingListener2, inverseBindingListener3);
        datePicker.init(i, i2, i3, c4296b);
    }
}
