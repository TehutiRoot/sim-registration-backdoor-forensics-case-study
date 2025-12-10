package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrChangeSimPreviewCustomerCameraBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrChangeSimPreviewCustomerCameraBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83869a;
    @NonNull
    public final IncludeMrtrPreviewCameraIdCardBinding incPreview;

    public FragmentMrtrChangeSimPreviewCustomerCameraBinding(ConstraintLayout constraintLayout, IncludeMrtrPreviewCameraIdCardBinding includeMrtrPreviewCameraIdCardBinding) {
        this.f83869a = constraintLayout;
        this.incPreview = includeMrtrPreviewCameraIdCardBinding;
    }

    @NonNull
    public static FragmentMrtrChangeSimPreviewCustomerCameraBinding bind(@NonNull View view) {
        int i = R.id.incPreview;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentMrtrChangeSimPreviewCustomerCameraBinding((ConstraintLayout) view, IncludeMrtrPreviewCameraIdCardBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrChangeSimPreviewCustomerCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrChangeSimPreviewCustomerCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_change_sim_preview_customer_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83869a;
    }
}