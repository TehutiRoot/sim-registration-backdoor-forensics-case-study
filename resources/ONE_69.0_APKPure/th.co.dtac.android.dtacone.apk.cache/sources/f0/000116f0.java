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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentPrepaidPreviewOptionalImageBinding */
/* loaded from: classes7.dex */
public final class FragmentPrepaidPreviewOptionalImageBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84255a;
    @NonNull
    public final OneIncludePreviewOptionalImageBinding mainLayout;

    public FragmentPrepaidPreviewOptionalImageBinding(FrameLayout frameLayout, OneIncludePreviewOptionalImageBinding oneIncludePreviewOptionalImageBinding) {
        this.f84255a = frameLayout;
        this.mainLayout = oneIncludePreviewOptionalImageBinding;
    }

    @NonNull
    public static FragmentPrepaidPreviewOptionalImageBinding bind(@NonNull View view) {
        int i = R.id.mainLayout;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentPrepaidPreviewOptionalImageBinding((FrameLayout) view, OneIncludePreviewOptionalImageBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentPrepaidPreviewOptionalImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentPrepaidPreviewOptionalImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_prepaid_preview_optional_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84255a;
    }
}