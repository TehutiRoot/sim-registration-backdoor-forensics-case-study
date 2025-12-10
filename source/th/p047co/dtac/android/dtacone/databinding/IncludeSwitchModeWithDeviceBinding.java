package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeSwitchModeWithDeviceBinding */
/* loaded from: classes7.dex */
public final class IncludeSwitchModeWithDeviceBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84295a;
    @NonNull
    public final DtacFontButton btnSwitchMode;
    @NonNull
    public final RelativeLayout layoutOpenInputMode;
    @NonNull
    public final DtacFontTextView tvSwitchImeiMode;

    public IncludeSwitchModeWithDeviceBinding(RelativeLayout relativeLayout, DtacFontButton dtacFontButton, RelativeLayout relativeLayout2, DtacFontTextView dtacFontTextView) {
        this.f84295a = relativeLayout;
        this.btnSwitchMode = dtacFontButton;
        this.layoutOpenInputMode = relativeLayout2;
        this.tvSwitchImeiMode = dtacFontTextView;
    }

    @NonNull
    public static IncludeSwitchModeWithDeviceBinding bind(@NonNull View view) {
        int i = R.id.btnSwitchMode;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            int i2 = R.id.tvSwitchImeiMode;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i2);
            if (dtacFontTextView != null) {
                return new IncludeSwitchModeWithDeviceBinding(relativeLayout, dtacFontButton, relativeLayout, dtacFontTextView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeSwitchModeWithDeviceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeSwitchModeWithDeviceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_switch_mode_with_device, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84295a;
    }
}
