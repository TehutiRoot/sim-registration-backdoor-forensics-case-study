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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneRegisterTrueOnlinePreviewCustomerImageBinding */
/* loaded from: classes7.dex */
public final class FragmentOneRegisterTrueOnlinePreviewCustomerImageBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84210a;
    @NonNull
    public final OneIncludePreviewCameraIdCardBinding incPreview;

    public FragmentOneRegisterTrueOnlinePreviewCustomerImageBinding(FrameLayout frameLayout, OneIncludePreviewCameraIdCardBinding oneIncludePreviewCameraIdCardBinding) {
        this.f84210a = frameLayout;
        this.incPreview = oneIncludePreviewCameraIdCardBinding;
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlinePreviewCustomerImageBinding bind(@NonNull View view) {
        int i = R.id.incPreview;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentOneRegisterTrueOnlinePreviewCustomerImageBinding((FrameLayout) view, OneIncludePreviewCameraIdCardBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlinePreviewCustomerImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlinePreviewCustomerImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_register_true_online_preview_customer_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84210a;
    }
}