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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePostpaidPreviewImageBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePostpaidPreviewImageBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84142a;
    @NonNull
    public final OneIncludePreviewCameraIdCardBinding incPreviewCameraIdCard;

    public FragmentOnePostpaidPreviewImageBinding(FrameLayout frameLayout, OneIncludePreviewCameraIdCardBinding oneIncludePreviewCameraIdCardBinding) {
        this.f84142a = frameLayout;
        this.incPreviewCameraIdCard = oneIncludePreviewCameraIdCardBinding;
    }

    @NonNull
    public static FragmentOnePostpaidPreviewImageBinding bind(@NonNull View view) {
        int i = R.id.incPreviewCameraIdCard;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentOnePostpaidPreviewImageBinding((FrameLayout) view, OneIncludePreviewCameraIdCardBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePostpaidPreviewImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePostpaidPreviewImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_postpaid_preview_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84142a;
    }
}