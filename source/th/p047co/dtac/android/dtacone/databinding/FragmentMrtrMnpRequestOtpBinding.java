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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrMnpRequestOtpBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrMnpRequestOtpBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83795a;
    @NonNull
    public final ZIncludeMrtrRequestOtpBinding incRequestOtp;

    public FragmentMrtrMnpRequestOtpBinding(FrameLayout frameLayout, ZIncludeMrtrRequestOtpBinding zIncludeMrtrRequestOtpBinding) {
        this.f83795a = frameLayout;
        this.incRequestOtp = zIncludeMrtrRequestOtpBinding;
    }

    @NonNull
    public static FragmentMrtrMnpRequestOtpBinding bind(@NonNull View view) {
        int i = R.id.incRequestOtp;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentMrtrMnpRequestOtpBinding((FrameLayout) view, ZIncludeMrtrRequestOtpBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrMnpRequestOtpBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrMnpRequestOtpBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_mnp_request_otp, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83795a;
    }
}
