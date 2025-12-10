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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePre2PostPreviewIdCardBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePre2PostPreviewIdCardBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84165a;
    @NonNull
    public final OneIncludePreviewCameraIdCardBinding includePreviewImageLayout;

    public FragmentOnePre2PostPreviewIdCardBinding(FrameLayout frameLayout, OneIncludePreviewCameraIdCardBinding oneIncludePreviewCameraIdCardBinding) {
        this.f84165a = frameLayout;
        this.includePreviewImageLayout = oneIncludePreviewCameraIdCardBinding;
    }

    @NonNull
    public static FragmentOnePre2PostPreviewIdCardBinding bind(@NonNull View view) {
        int i = R.id.includePreviewImageLayout;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentOnePre2PostPreviewIdCardBinding((FrameLayout) view, OneIncludePreviewCameraIdCardBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePre2PostPreviewIdCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePre2PostPreviewIdCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_pre2_post_preview_id_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84165a;
    }
}