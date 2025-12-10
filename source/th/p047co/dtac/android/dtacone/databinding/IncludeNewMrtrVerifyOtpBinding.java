package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeNewMrtrVerifyOtpBinding */
/* loaded from: classes7.dex */
public final class IncludeNewMrtrVerifyOtpBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84254a;
    @NonNull
    public final ZIncludeMrtrHelperOtpNumberBinding incOtpNumber;
    @NonNull
    public final ZIncludeMrtrHelperPhoneNumberBinding incPhoneNumber;
    @NonNull
    public final LinearLayout rootLayout;

    public IncludeNewMrtrVerifyOtpBinding(LinearLayout linearLayout, ZIncludeMrtrHelperOtpNumberBinding zIncludeMrtrHelperOtpNumberBinding, ZIncludeMrtrHelperPhoneNumberBinding zIncludeMrtrHelperPhoneNumberBinding, LinearLayout linearLayout2) {
        this.f84254a = linearLayout;
        this.incOtpNumber = zIncludeMrtrHelperOtpNumberBinding;
        this.incPhoneNumber = zIncludeMrtrHelperPhoneNumberBinding;
        this.rootLayout = linearLayout2;
    }

    @NonNull
    public static IncludeNewMrtrVerifyOtpBinding bind(@NonNull View view) {
        int i = R.id.incOtpNumber;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            ZIncludeMrtrHelperOtpNumberBinding bind = ZIncludeMrtrHelperOtpNumberBinding.bind(findChildViewById);
            int i2 = R.id.incPhoneNumber;
            View findChildViewById2 = ViewBindings.findChildViewById(view, i2);
            if (findChildViewById2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new IncludeNewMrtrVerifyOtpBinding(linearLayout, bind, ZIncludeMrtrHelperPhoneNumberBinding.bind(findChildViewById2), linearLayout);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeNewMrtrVerifyOtpBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeNewMrtrVerifyOtpBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_new_mrtr_verify_otp, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84254a;
    }
}
