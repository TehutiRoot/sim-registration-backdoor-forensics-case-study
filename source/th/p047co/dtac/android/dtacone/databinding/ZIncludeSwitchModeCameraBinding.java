package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeSwitchModeCameraBinding */
/* loaded from: classes7.dex */
public final class ZIncludeSwitchModeCameraBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84656a;
    @NonNull
    public final FrameLayout btnOpenSmartCard;
    @NonNull
    public final DtacFontButton btnSwitchMode;
    @NonNull
    public final DtacFontButton tvSmartCardMode;

    public ZIncludeSwitchModeCameraBinding(FrameLayout frameLayout, FrameLayout frameLayout2, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2) {
        this.f84656a = frameLayout;
        this.btnOpenSmartCard = frameLayout2;
        this.btnSwitchMode = dtacFontButton;
        this.tvSmartCardMode = dtacFontButton2;
    }

    @NonNull
    public static ZIncludeSwitchModeCameraBinding bind(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = R.id.btnSwitchMode;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.tvSmartCardMode;
            DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton2 != null) {
                return new ZIncludeSwitchModeCameraBinding(frameLayout, frameLayout, dtacFontButton, dtacFontButton2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncludeSwitchModeCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeSwitchModeCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_switch_mode_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84656a;
    }
}
