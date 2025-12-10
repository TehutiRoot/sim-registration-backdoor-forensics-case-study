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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePostpaidOptionalImageBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePostpaidOptionalImageBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84033a;
    @NonNull
    public final OneIncludePreviewOptionalImageBinding incPreviewOptionalImage;

    public FragmentOnePostpaidOptionalImageBinding(FrameLayout frameLayout, OneIncludePreviewOptionalImageBinding oneIncludePreviewOptionalImageBinding) {
        this.f84033a = frameLayout;
        this.incPreviewOptionalImage = oneIncludePreviewOptionalImageBinding;
    }

    @NonNull
    public static FragmentOnePostpaidOptionalImageBinding bind(@NonNull View view) {
        int i = R.id.incPreviewOptionalImage;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentOnePostpaidOptionalImageBinding((FrameLayout) view, OneIncludePreviewOptionalImageBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePostpaidOptionalImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePostpaidOptionalImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_postpaid_optional_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84033a;
    }
}
