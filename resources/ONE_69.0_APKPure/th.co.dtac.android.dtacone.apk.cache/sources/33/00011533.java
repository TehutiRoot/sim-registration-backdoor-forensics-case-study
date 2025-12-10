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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentDtacAtHomeRequestOtpBinding */
/* loaded from: classes7.dex */
public final class FragmentDtacAtHomeRequestOtpBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83809a;
    @NonNull
    public final IncludeNewRequestOtpBinding incRequestOtp;

    public FragmentDtacAtHomeRequestOtpBinding(NestedScrollView nestedScrollView, IncludeNewRequestOtpBinding includeNewRequestOtpBinding) {
        this.f83809a = nestedScrollView;
        this.incRequestOtp = includeNewRequestOtpBinding;
    }

    @NonNull
    public static FragmentDtacAtHomeRequestOtpBinding bind(@NonNull View view) {
        int i = R.id.incRequestOtp;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentDtacAtHomeRequestOtpBinding((NestedScrollView) view, IncludeNewRequestOtpBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentDtacAtHomeRequestOtpBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDtacAtHomeRequestOtpBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_dtac_at_home_request_otp, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83809a;
    }
}