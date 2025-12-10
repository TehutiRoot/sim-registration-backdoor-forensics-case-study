package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePre2PostCustomerCameraBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePre2PostCustomerCameraBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84053a;

    public FragmentOnePre2PostCustomerCameraBinding(ConstraintLayout constraintLayout) {
        this.f84053a = constraintLayout;
    }

    @NonNull
    public static FragmentOnePre2PostCustomerCameraBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentOnePre2PostCustomerCameraBinding((ConstraintLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentOnePre2PostCustomerCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePre2PostCustomerCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_pre2_post_customer_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84053a;
    }
}
