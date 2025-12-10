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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePostpaidCustomerCameraBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePostpaidCustomerCameraBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84021a;
    @NonNull
    public final OneIncludeNewCameraViewBinding incCameraView;

    public FragmentOnePostpaidCustomerCameraBinding(FrameLayout frameLayout, OneIncludeNewCameraViewBinding oneIncludeNewCameraViewBinding) {
        this.f84021a = frameLayout;
        this.incCameraView = oneIncludeNewCameraViewBinding;
    }

    @NonNull
    public static FragmentOnePostpaidCustomerCameraBinding bind(@NonNull View view) {
        int i = R.id.incCameraView;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentOnePostpaidCustomerCameraBinding((FrameLayout) view, OneIncludeNewCameraViewBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePostpaidCustomerCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePostpaidCustomerCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_postpaid_customer_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84021a;
    }
}
