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
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeNewVerifyOtpBinding */
/* loaded from: classes7.dex */
public final class IncludeNewVerifyOtpBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84256a;
    @NonNull
    public final ZIncludeHelperPhoneNumberBinding incPhoneNumber;
    @NonNull
    public final DtacClearableEditText p2postEdtOtp;
    @NonNull
    public final DtacFontButton pre2postBtnResendOtp;
    @NonNull
    public final LinearLayout rootLayout;

    public IncludeNewVerifyOtpBinding(LinearLayout linearLayout, ZIncludeHelperPhoneNumberBinding zIncludeHelperPhoneNumberBinding, DtacClearableEditText dtacClearableEditText, DtacFontButton dtacFontButton, LinearLayout linearLayout2) {
        this.f84256a = linearLayout;
        this.incPhoneNumber = zIncludeHelperPhoneNumberBinding;
        this.p2postEdtOtp = dtacClearableEditText;
        this.pre2postBtnResendOtp = dtacFontButton;
        this.rootLayout = linearLayout2;
    }

    @NonNull
    public static IncludeNewVerifyOtpBinding bind(@NonNull View view) {
        int i = R.id.incPhoneNumber;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            ZIncludeHelperPhoneNumberBinding bind = ZIncludeHelperPhoneNumberBinding.bind(findChildViewById);
            i = R.id.p2post_edt_otp;
            DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
            if (dtacClearableEditText != null) {
                i = R.id.pre2post_btn_resend_otp;
                DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                if (dtacFontButton != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    return new IncludeNewVerifyOtpBinding(linearLayout, bind, dtacClearableEditText, dtacFontButton, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeNewVerifyOtpBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeNewVerifyOtpBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_new_verify_otp, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84256a;
    }
}
