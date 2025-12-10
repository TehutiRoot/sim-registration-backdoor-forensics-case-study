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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrMnpVerifyOtpBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrMnpVerifyOtpBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83799a;
    @NonNull
    public final IncludeNewMrtrVerifyOtpBinding incVerifyOtp;

    public FragmentMrtrMnpVerifyOtpBinding(FrameLayout frameLayout, IncludeNewMrtrVerifyOtpBinding includeNewMrtrVerifyOtpBinding) {
        this.f83799a = frameLayout;
        this.incVerifyOtp = includeNewMrtrVerifyOtpBinding;
    }

    @NonNull
    public static FragmentMrtrMnpVerifyOtpBinding bind(@NonNull View view) {
        int i = R.id.incVerifyOtp;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentMrtrMnpVerifyOtpBinding((FrameLayout) view, IncludeNewMrtrVerifyOtpBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrMnpVerifyOtpBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrMnpVerifyOtpBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_mnp_verify_otp, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83799a;
    }
}
