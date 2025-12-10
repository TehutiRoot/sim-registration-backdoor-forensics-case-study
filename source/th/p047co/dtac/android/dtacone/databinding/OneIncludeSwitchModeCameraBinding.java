package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncludeSwitchModeCameraBinding */
/* loaded from: classes7.dex */
public final class OneIncludeSwitchModeCameraBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84488a;
    @NonNull
    public final FrameLayout btnOpenSmartCard;
    @NonNull
    public final OneFontButton btnSwitchMode;
    @NonNull
    public final TextView textView4;
    @NonNull
    public final TextView textView5;
    @NonNull
    public final OneFontButton tvSmartCardMode;

    public OneIncludeSwitchModeCameraBinding(FrameLayout frameLayout, FrameLayout frameLayout2, OneFontButton oneFontButton, TextView textView, TextView textView2, OneFontButton oneFontButton2) {
        this.f84488a = frameLayout;
        this.btnOpenSmartCard = frameLayout2;
        this.btnSwitchMode = oneFontButton;
        this.textView4 = textView;
        this.textView5 = textView2;
        this.tvSmartCardMode = oneFontButton2;
    }

    @NonNull
    public static OneIncludeSwitchModeCameraBinding bind(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = R.id.btnSwitchMode;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.textView4;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.textView5;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.tvSmartCardMode;
                    OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
                    if (oneFontButton2 != null) {
                        return new OneIncludeSwitchModeCameraBinding(frameLayout, frameLayout, oneFontButton, textView, textView2, oneFontButton2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneIncludeSwitchModeCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneIncludeSwitchModeCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_include_switch_mode_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84488a;
    }
}
