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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPostpaidCustomerCameraBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPostpaidCustomerCameraBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83919a;
    @NonNull
    public final ZIncludeNewCameraViewBinding incCameraView;

    public FragmentMrtrPostpaidCustomerCameraBinding(FrameLayout frameLayout, ZIncludeNewCameraViewBinding zIncludeNewCameraViewBinding) {
        this.f83919a = frameLayout;
        this.incCameraView = zIncludeNewCameraViewBinding;
    }

    @NonNull
    public static FragmentMrtrPostpaidCustomerCameraBinding bind(@NonNull View view) {
        int i = R.id.incCameraView;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentMrtrPostpaidCustomerCameraBinding((FrameLayout) view, ZIncludeNewCameraViewBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPostpaidCustomerCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPostpaidCustomerCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_postpaid_customer_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83919a;
    }
}