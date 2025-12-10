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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrMultiSimPreviewCustomerBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrMultiSimPreviewCustomerBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83907a;
    @NonNull
    public final IncludeMrtrPreviewCameraIdCardBinding incPreview;

    public FragmentMrtrMultiSimPreviewCustomerBinding(ConstraintLayout constraintLayout, IncludeMrtrPreviewCameraIdCardBinding includeMrtrPreviewCameraIdCardBinding) {
        this.f83907a = constraintLayout;
        this.incPreview = includeMrtrPreviewCameraIdCardBinding;
    }

    @NonNull
    public static FragmentMrtrMultiSimPreviewCustomerBinding bind(@NonNull View view) {
        int i = R.id.incPreview;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentMrtrMultiSimPreviewCustomerBinding((ConstraintLayout) view, IncludeMrtrPreviewCameraIdCardBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrMultiSimPreviewCustomerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrMultiSimPreviewCustomerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_multi_sim_preview_customer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83907a;
    }
}