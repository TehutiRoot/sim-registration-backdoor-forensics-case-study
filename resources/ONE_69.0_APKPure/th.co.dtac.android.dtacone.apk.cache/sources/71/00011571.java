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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrChangeSimPreviewOptionalImageBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrChangeSimPreviewOptionalImageBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83871a;
    @NonNull
    public final ZIncludePreviewOptionalImageBinding mainLayout;

    public FragmentMrtrChangeSimPreviewOptionalImageBinding(FrameLayout frameLayout, ZIncludePreviewOptionalImageBinding zIncludePreviewOptionalImageBinding) {
        this.f83871a = frameLayout;
        this.mainLayout = zIncludePreviewOptionalImageBinding;
    }

    @NonNull
    public static FragmentMrtrChangeSimPreviewOptionalImageBinding bind(@NonNull View view) {
        int i = R.id.mainLayout;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentMrtrChangeSimPreviewOptionalImageBinding((FrameLayout) view, ZIncludePreviewOptionalImageBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrChangeSimPreviewOptionalImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrChangeSimPreviewOptionalImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_change_sim_preview_optional_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83871a;
    }
}