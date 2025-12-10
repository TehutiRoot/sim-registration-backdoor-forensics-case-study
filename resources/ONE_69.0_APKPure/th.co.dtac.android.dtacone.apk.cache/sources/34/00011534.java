package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentDtacAtHomeVerifyOtpBinding */
/* loaded from: classes7.dex */
public final class FragmentDtacAtHomeVerifyOtpBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83810a;
    @NonNull
    public final IncludeNewVerifyOtpBinding incVerifyOtp;

    public FragmentDtacAtHomeVerifyOtpBinding(NestedScrollView nestedScrollView, IncludeNewVerifyOtpBinding includeNewVerifyOtpBinding) {
        this.f83810a = nestedScrollView;
        this.incVerifyOtp = includeNewVerifyOtpBinding;
    }

    @NonNull
    public static FragmentDtacAtHomeVerifyOtpBinding bind(@NonNull View view) {
        int i = R.id.incVerifyOtp;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentDtacAtHomeVerifyOtpBinding((NestedScrollView) view, IncludeNewVerifyOtpBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentDtacAtHomeVerifyOtpBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDtacAtHomeVerifyOtpBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_dtac_at_home_verify_otp, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83810a;
    }
}