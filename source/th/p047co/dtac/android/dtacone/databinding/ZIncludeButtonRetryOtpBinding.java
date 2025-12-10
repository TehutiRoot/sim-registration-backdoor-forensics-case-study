package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeButtonRetryOtpBinding */
/* loaded from: classes7.dex */
public final class ZIncludeButtonRetryOtpBinding implements ViewBinding {

    /* renamed from: a */
    public final View f84615a;
    @NonNull
    public final DtacFontButton mnpBtnResendOtp;
    @NonNull
    public final DtacFontButton mnpBtnVerifyOtp;

    public ZIncludeButtonRetryOtpBinding(View view, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2) {
        this.f84615a = view;
        this.mnpBtnResendOtp = dtacFontButton;
        this.mnpBtnVerifyOtp = dtacFontButton2;
    }

    @NonNull
    public static ZIncludeButtonRetryOtpBinding bind(@NonNull View view) {
        int i = R.id.mnp_btn_resend_otp;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.mnp_btn_verify_otp;
            DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton2 != null) {
                return new ZIncludeButtonRetryOtpBinding(view, dtacFontButton, dtacFontButton2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncludeButtonRetryOtpBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.z_include_button_retry_otp, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84615a;
    }
}
