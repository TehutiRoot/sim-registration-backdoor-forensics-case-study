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

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeMrtrCameraButtonBinding */
/* loaded from: classes7.dex */
public final class ZIncludeMrtrCameraButtonBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84738a;
    @NonNull
    public final DtacFontButton btnTakePhoto;
    @NonNull
    public final RelativeLayout circleTakePhoto;

    public ZIncludeMrtrCameraButtonBinding(RelativeLayout relativeLayout, DtacFontButton dtacFontButton, RelativeLayout relativeLayout2) {
        this.f84738a = relativeLayout;
        this.btnTakePhoto = dtacFontButton;
        this.circleTakePhoto = relativeLayout2;
    }

    @NonNull
    public static ZIncludeMrtrCameraButtonBinding bind(@NonNull View view) {
        int i = R.id.btnTakePhoto;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            return new ZIncludeMrtrCameraButtonBinding(relativeLayout, dtacFontButton, relativeLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncludeMrtrCameraButtonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeMrtrCameraButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_mrtr_camera_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84738a;
    }
}