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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneOnlineRegistrationPreviewImageBinding */
/* loaded from: classes7.dex */
public final class FragmentOneOnlineRegistrationPreviewImageBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84104a;
    @NonNull
    public final OneTransparentToolbarBinding toolbarLayout;

    public FragmentOneOnlineRegistrationPreviewImageBinding(FrameLayout frameLayout, OneTransparentToolbarBinding oneTransparentToolbarBinding) {
        this.f84104a = frameLayout;
        this.toolbarLayout = oneTransparentToolbarBinding;
    }

    @NonNull
    public static FragmentOneOnlineRegistrationPreviewImageBinding bind(@NonNull View view) {
        int i = R.id.toolbarLayout;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentOneOnlineRegistrationPreviewImageBinding((FrameLayout) view, OneTransparentToolbarBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneOnlineRegistrationPreviewImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneOnlineRegistrationPreviewImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_online_registration_preview_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84104a;
    }
}