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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPostpaidPreviewImageBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPostpaidPreviewImageBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83936a;
    @NonNull
    public final ZIncludePreviewCameraIdCardBinding incPreview;

    public FragmentMrtrPostpaidPreviewImageBinding(FrameLayout frameLayout, ZIncludePreviewCameraIdCardBinding zIncludePreviewCameraIdCardBinding) {
        this.f83936a = frameLayout;
        this.incPreview = zIncludePreviewCameraIdCardBinding;
    }

    @NonNull
    public static FragmentMrtrPostpaidPreviewImageBinding bind(@NonNull View view) {
        int i = R.id.incPreview;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentMrtrPostpaidPreviewImageBinding((FrameLayout) view, ZIncludePreviewCameraIdCardBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPostpaidPreviewImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPostpaidPreviewImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_postpaid_preview_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83936a;
    }
}