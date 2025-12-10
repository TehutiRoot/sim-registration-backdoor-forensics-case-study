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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentUpdatePrepaidCustomerCameraBinding */
/* loaded from: classes7.dex */
public final class FragmentUpdatePrepaidCustomerCameraBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84220a;
    @NonNull
    public final ZIncludeNewCameraViewBinding mainLayout;

    public FragmentUpdatePrepaidCustomerCameraBinding(FrameLayout frameLayout, ZIncludeNewCameraViewBinding zIncludeNewCameraViewBinding) {
        this.f84220a = frameLayout;
        this.mainLayout = zIncludeNewCameraViewBinding;
    }

    @NonNull
    public static FragmentUpdatePrepaidCustomerCameraBinding bind(@NonNull View view) {
        int i = R.id.mainLayout;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentUpdatePrepaidCustomerCameraBinding((FrameLayout) view, ZIncludeNewCameraViewBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentUpdatePrepaidCustomerCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentUpdatePrepaidCustomerCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_update_prepaid_customer_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84220a;
    }
}
