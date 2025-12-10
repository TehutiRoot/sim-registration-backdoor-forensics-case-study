package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrMultiSimPreviewOptionalImageBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrMultiSimPreviewOptionalImageBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83811a;

    public FragmentMrtrMultiSimPreviewOptionalImageBinding(FrameLayout frameLayout) {
        this.f83811a = frameLayout;
    }

    @NonNull
    public static FragmentMrtrMultiSimPreviewOptionalImageBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentMrtrMultiSimPreviewOptionalImageBinding((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentMrtrMultiSimPreviewOptionalImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrMultiSimPreviewOptionalImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_multi_sim_preview_optional_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83811a;
    }
}
