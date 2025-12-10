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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneMnpPreviewIdCardBinding */
/* loaded from: classes7.dex */
public final class FragmentOneMnpPreviewIdCardBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83978a;
    @NonNull
    public final OneIncludePreviewCameraIdCardBinding includePreviewImageLayout;

    public FragmentOneMnpPreviewIdCardBinding(FrameLayout frameLayout, OneIncludePreviewCameraIdCardBinding oneIncludePreviewCameraIdCardBinding) {
        this.f83978a = frameLayout;
        this.includePreviewImageLayout = oneIncludePreviewCameraIdCardBinding;
    }

    @NonNull
    public static FragmentOneMnpPreviewIdCardBinding bind(@NonNull View view) {
        int i = R.id.includePreviewImageLayout;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentOneMnpPreviewIdCardBinding((FrameLayout) view, OneIncludePreviewCameraIdCardBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneMnpPreviewIdCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneMnpPreviewIdCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_mnp_preview_id_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83978a;
    }
}
