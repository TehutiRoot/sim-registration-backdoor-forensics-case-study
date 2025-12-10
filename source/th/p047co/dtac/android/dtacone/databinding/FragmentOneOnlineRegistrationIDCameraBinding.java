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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneOnlineRegistrationIDCameraBinding */
/* loaded from: classes7.dex */
public final class FragmentOneOnlineRegistrationIDCameraBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83996a;
    @NonNull
    public final OneTransparentToolbarBinding toolbarLayout;

    public FragmentOneOnlineRegistrationIDCameraBinding(FrameLayout frameLayout, OneTransparentToolbarBinding oneTransparentToolbarBinding) {
        this.f83996a = frameLayout;
        this.toolbarLayout = oneTransparentToolbarBinding;
    }

    @NonNull
    public static FragmentOneOnlineRegistrationIDCameraBinding bind(@NonNull View view) {
        int i = R.id.toolbarLayout;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentOneOnlineRegistrationIDCameraBinding((FrameLayout) view, OneTransparentToolbarBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneOnlineRegistrationIDCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneOnlineRegistrationIDCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_online_registration_i_d_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83996a;
    }
}
