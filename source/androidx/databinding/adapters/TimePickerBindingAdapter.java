package androidx.databinding.adapters;

import android.os.Build;
import android.widget.TimePicker;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingAdapter;
import androidx.databinding.InverseBindingListener;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class TimePickerBindingAdapter {

    /* renamed from: androidx.databinding.adapters.TimePickerBindingAdapter$a */
    /* loaded from: classes2.dex */
    public class C4305a implements TimePicker.OnTimeChangedListener {

        /* renamed from: a */
        public final /* synthetic */ TimePicker.OnTimeChangedListener f34584a;

        /* renamed from: b */
        public final /* synthetic */ InverseBindingListener f34585b;

        /* renamed from: c */
        public final /* synthetic */ InverseBindingListener f34586c;

        public C4305a(TimePicker.OnTimeChangedListener onTimeChangedListener, InverseBindingListener inverseBindingListener, InverseBindingListener inverseBindingListener2) {
            this.f34584a = onTimeChangedListener;
            this.f34585b = inverseBindingListener;
            this.f34586c = inverseBindingListener2;
        }

        @Override // android.widget.TimePicker.OnTimeChangedListener
        public void onTimeChanged(TimePicker timePicker, int i, int i2) {
            TimePicker.OnTimeChangedListener onTimeChangedListener = this.f34584a;
            if (onTimeChangedListener != null) {
                onTimeChangedListener.onTimeChanged(timePicker, i, i2);
            }
            InverseBindingListener inverseBindingListener = this.f34585b;
            if (inverseBindingListener != null) {
                inverseBindingListener.onChange();
            }
            InverseBindingListener inverseBindingListener2 = this.f34586c;
            if (inverseBindingListener2 != null) {
                inverseBindingListener2.onChange();
            }
        }
    }

    @InverseBindingAdapter(attribute = "android:hour")
    public static int getHour(TimePicker timePicker) {
        int hour;
        if (Build.VERSION.SDK_INT >= 23) {
            hour = timePicker.getHour();
            return hour;
        }
        Integer currentHour = timePicker.getCurrentHour();
        if (currentHour == null) {
            return 0;
        }
        return currentHour.intValue();
    }

    @InverseBindingAdapter(attribute = "android:minute")
    public static int getMinute(TimePicker timePicker) {
        int minute;
        if (Build.VERSION.SDK_INT >= 23) {
            minute = timePicker.getMinute();
            return minute;
        }
        Integer currentMinute = timePicker.getCurrentMinute();
        if (currentMinute == null) {
            return 0;
        }
        return currentMinute.intValue();
    }

    @BindingAdapter({"android:hour"})
    public static void setHour(TimePicker timePicker, int i) {
        int hour;
        if (Build.VERSION.SDK_INT >= 23) {
            hour = timePicker.getHour();
            if (hour != i) {
                timePicker.setHour(i);
            }
        } else if (timePicker.getCurrentHour().intValue() != i) {
            timePicker.setCurrentHour(Integer.valueOf(i));
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onTimeChanged", "android:hourAttrChanged", "android:minuteAttrChanged"})
    public static void setListeners(TimePicker timePicker, TimePicker.OnTimeChangedListener onTimeChangedListener, InverseBindingListener inverseBindingListener, InverseBindingListener inverseBindingListener2) {
        if (inverseBindingListener == null && inverseBindingListener2 == null) {
            timePicker.setOnTimeChangedListener(onTimeChangedListener);
        } else {
            timePicker.setOnTimeChangedListener(new C4305a(onTimeChangedListener, inverseBindingListener, inverseBindingListener2));
        }
    }

    @BindingAdapter({"android:minute"})
    public static void setMinute(TimePicker timePicker, int i) {
        int minute;
        if (Build.VERSION.SDK_INT >= 23) {
            minute = timePicker.getMinute();
            if (minute != i) {
                timePicker.setMinute(i);
            }
        } else if (timePicker.getCurrentMinute().intValue() != i) {
            timePicker.setCurrentHour(Integer.valueOf(i));
        }
    }
}
