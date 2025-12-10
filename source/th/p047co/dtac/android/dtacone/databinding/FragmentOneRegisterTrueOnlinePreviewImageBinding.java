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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneRegisterTrueOnlinePreviewImageBinding */
/* loaded from: classes7.dex */
public final class FragmentOneRegisterTrueOnlinePreviewImageBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84107a;
    @NonNull
    public final OneIncludePreviewCameraIdCardBinding incPreview;

    public FragmentOneRegisterTrueOnlinePreviewImageBinding(FrameLayout frameLayout, OneIncludePreviewCameraIdCardBinding oneIncludePreviewCameraIdCardBinding) {
        this.f84107a = frameLayout;
        this.incPreview = oneIncludePreviewCameraIdCardBinding;
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlinePreviewImageBinding bind(@NonNull View view) {
        int i = R.id.incPreview;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentOneRegisterTrueOnlinePreviewImageBinding((FrameLayout) view, OneIncludePreviewCameraIdCardBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlinePreviewImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlinePreviewImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_register_true_online_preview_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84107a;
    }
}
