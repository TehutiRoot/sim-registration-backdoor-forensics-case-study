package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneMnpCustomerCameraBinding */
/* loaded from: classes7.dex */
public final class FragmentOneMnpCustomerCameraBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83967a;

    public FragmentOneMnpCustomerCameraBinding(ConstraintLayout constraintLayout) {
        this.f83967a = constraintLayout;
    }

    @NonNull
    public static FragmentOneMnpCustomerCameraBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentOneMnpCustomerCameraBinding((ConstraintLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentOneMnpCustomerCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneMnpCustomerCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_mnp_customer_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83967a;
    }
}
