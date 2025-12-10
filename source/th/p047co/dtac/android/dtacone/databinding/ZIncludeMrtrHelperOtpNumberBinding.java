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
import th.p047co.dtac.android.dtacone.widget.view.DtacEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeMrtrHelperOtpNumberBinding */
/* loaded from: classes7.dex */
public final class ZIncludeMrtrHelperOtpNumberBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84630a;
    @NonNull
    public final DtacFontTextView btnResendOtp;
    @NonNull
    public final DtacEditText otpDigit1;
    @NonNull
    public final DtacEditText otpDigit2;
    @NonNull
    public final DtacEditText otpDigit3;
    @NonNull
    public final DtacEditText otpDigit4;
    @NonNull
    public final DtacFontTextView tvHelper;

    public ZIncludeMrtrHelperOtpNumberBinding(LinearLayout linearLayout, DtacFontTextView dtacFontTextView, DtacEditText dtacEditText, DtacEditText dtacEditText2, DtacEditText dtacEditText3, DtacEditText dtacEditText4, DtacFontTextView dtacFontTextView2) {
        this.f84630a = linearLayout;
        this.btnResendOtp = dtacFontTextView;
        this.otpDigit1 = dtacEditText;
        this.otpDigit2 = dtacEditText2;
        this.otpDigit3 = dtacEditText3;
        this.otpDigit4 = dtacEditText4;
        this.tvHelper = dtacFontTextView2;
    }

    @NonNull
    public static ZIncludeMrtrHelperOtpNumberBinding bind(@NonNull View view) {
        int i = R.id.btn_resend_otp;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.otpDigit1;
            DtacEditText dtacEditText = (DtacEditText) ViewBindings.findChildViewById(view, i);
            if (dtacEditText != null) {
                i = R.id.otpDigit2;
                DtacEditText dtacEditText2 = (DtacEditText) ViewBindings.findChildViewById(view, i);
                if (dtacEditText2 != null) {
                    i = R.id.otpDigit3;
                    DtacEditText dtacEditText3 = (DtacEditText) ViewBindings.findChildViewById(view, i);
                    if (dtacEditText3 != null) {
                        i = R.id.otpDigit4;
                        DtacEditText dtacEditText4 = (DtacEditText) ViewBindings.findChildViewById(view, i);
                        if (dtacEditText4 != null) {
                            i = R.id.tvHelper;
                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView2 != null) {
                                return new ZIncludeMrtrHelperOtpNumberBinding((LinearLayout) view, dtacFontTextView, dtacEditText, dtacEditText2, dtacEditText3, dtacEditText4, dtacFontTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncludeMrtrHelperOtpNumberBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeMrtrHelperOtpNumberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_mrtr_helper_otp_number, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84630a;
    }
}
