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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncludeCameraButtonBinding */
/* loaded from: classes7.dex */
public final class OneIncludeCameraButtonBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84463a;
    @NonNull
    public final OneFontButton btnTakePhoto;
    @NonNull
    public final RelativeLayout circleTakePhoto;

    public OneIncludeCameraButtonBinding(RelativeLayout relativeLayout, OneFontButton oneFontButton, RelativeLayout relativeLayout2) {
        this.f84463a = relativeLayout;
        this.btnTakePhoto = oneFontButton;
        this.circleTakePhoto = relativeLayout2;
    }

    @NonNull
    public static OneIncludeCameraButtonBinding bind(@NonNull View view) {
        int i = R.id.btnTakePhoto;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.circleTakePhoto;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                return new OneIncludeCameraButtonBinding((RelativeLayout) view, oneFontButton, relativeLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneIncludeCameraButtonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneIncludeCameraButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_include_camera_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84463a;
    }
}
