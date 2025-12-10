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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentUpdatePrepaidPreviewImageBinding */
/* loaded from: classes7.dex */
public final class FragmentUpdatePrepaidPreviewImageBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84221a;
    @NonNull
    public final ZIncludePreviewCameraIdCardBinding mainLayout;

    public FragmentUpdatePrepaidPreviewImageBinding(FrameLayout frameLayout, ZIncludePreviewCameraIdCardBinding zIncludePreviewCameraIdCardBinding) {
        this.f84221a = frameLayout;
        this.mainLayout = zIncludePreviewCameraIdCardBinding;
    }

    @NonNull
    public static FragmentUpdatePrepaidPreviewImageBinding bind(@NonNull View view) {
        int i = R.id.mainLayout;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentUpdatePrepaidPreviewImageBinding((FrameLayout) view, ZIncludePreviewCameraIdCardBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentUpdatePrepaidPreviewImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentUpdatePrepaidPreviewImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_update_prepaid_preview_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84221a;
    }
}
