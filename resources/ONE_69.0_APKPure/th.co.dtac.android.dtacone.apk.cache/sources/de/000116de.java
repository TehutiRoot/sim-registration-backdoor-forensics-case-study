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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOtpV3Binding */
/* loaded from: classes7.dex */
public final class FragmentOtpV3Binding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84237a;
    @NonNull
    public final IncludeNewMrtrVerifyOtpBinding incVerifyOtp;

    public FragmentOtpV3Binding(ConstraintLayout constraintLayout, IncludeNewMrtrVerifyOtpBinding includeNewMrtrVerifyOtpBinding) {
        this.f84237a = constraintLayout;
        this.incVerifyOtp = includeNewMrtrVerifyOtpBinding;
    }

    @NonNull
    public static FragmentOtpV3Binding bind(@NonNull View view) {
        int i = R.id.incVerifyOtp;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentOtpV3Binding((ConstraintLayout) view, IncludeNewMrtrVerifyOtpBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOtpV3Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOtpV3Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_otp_v3, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84237a;
    }
}