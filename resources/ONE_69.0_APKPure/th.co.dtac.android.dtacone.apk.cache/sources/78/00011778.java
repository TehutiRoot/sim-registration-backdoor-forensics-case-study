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
import th.p047co.dtac.android.dtacone.app_one.widget.OneEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeOneVerifyOtpBinding */
/* loaded from: classes7.dex */
public final class IncludeOneVerifyOtpBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84391a;
    @NonNull
    public final OneFontTextView btnResendOtp;
    @NonNull
    public final OneFontTextView descriptionTextView;
    @NonNull
    public final OneEditText otpDigit1;
    @NonNull
    public final OneEditText otpDigit2;
    @NonNull
    public final OneEditText otpDigit3;
    @NonNull
    public final OneEditText otpDigit4;
    @NonNull
    public final LinearLayout rootLayout;
    @NonNull
    public final OneFontTextView saleCodeTextView;
    @NonNull
    public final LinearLayout saleInformationLayout;
    @NonNull
    public final OneFontTextView titleTextView;
    @NonNull
    public final OneFontTextView tvHelper;
    @NonNull
    public final OneFontTextView tvHelperMobileNumberSection;
    @NonNull
    public final OneFontTextView tvPhoneNumber;
    @NonNull
    public final LinearLayout verifyInformationLayout;
    @NonNull
    public final View verifyOTPLineView;

    public IncludeOneVerifyOtpBinding(LinearLayout linearLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneEditText oneEditText, OneEditText oneEditText2, OneEditText oneEditText3, OneEditText oneEditText4, LinearLayout linearLayout2, OneFontTextView oneFontTextView3, LinearLayout linearLayout3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, LinearLayout linearLayout4, View view) {
        this.f84391a = linearLayout;
        this.btnResendOtp = oneFontTextView;
        this.descriptionTextView = oneFontTextView2;
        this.otpDigit1 = oneEditText;
        this.otpDigit2 = oneEditText2;
        this.otpDigit3 = oneEditText3;
        this.otpDigit4 = oneEditText4;
        this.rootLayout = linearLayout2;
        this.saleCodeTextView = oneFontTextView3;
        this.saleInformationLayout = linearLayout3;
        this.titleTextView = oneFontTextView4;
        this.tvHelper = oneFontTextView5;
        this.tvHelperMobileNumberSection = oneFontTextView6;
        this.tvPhoneNumber = oneFontTextView7;
        this.verifyInformationLayout = linearLayout4;
        this.verifyOTPLineView = view;
    }

    @NonNull
    public static IncludeOneVerifyOtpBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btn_resend_otp;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.descriptionTextView;
            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView2 != null) {
                i = R.id.otpDigit1;
                OneEditText oneEditText = (OneEditText) ViewBindings.findChildViewById(view, i);
                if (oneEditText != null) {
                    i = R.id.otpDigit2;
                    OneEditText oneEditText2 = (OneEditText) ViewBindings.findChildViewById(view, i);
                    if (oneEditText2 != null) {
                        i = R.id.otpDigit3;
                        OneEditText oneEditText3 = (OneEditText) ViewBindings.findChildViewById(view, i);
                        if (oneEditText3 != null) {
                            i = R.id.otpDigit4;
                            OneEditText oneEditText4 = (OneEditText) ViewBindings.findChildViewById(view, i);
                            if (oneEditText4 != null) {
                                LinearLayout linearLayout = (LinearLayout) view;
                                i = R.id.saleCodeTextView;
                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView3 != null) {
                                    i = R.id.saleInformationLayout;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout2 != null) {
                                        i = R.id.titleTextView;
                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView4 != null) {
                                            i = R.id.tvHelper;
                                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView5 != null) {
                                                i = R.id.tvHelperMobileNumberSection;
                                                OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView6 != null) {
                                                    i = R.id.tvPhoneNumber;
                                                    OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView7 != null) {
                                                        i = R.id.verifyInformationLayout;
                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                        if (linearLayout3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.verifyOTPLineView))) != null) {
                                                            return new IncludeOneVerifyOtpBinding(linearLayout, oneFontTextView, oneFontTextView2, oneEditText, oneEditText2, oneEditText3, oneEditText4, linearLayout, oneFontTextView3, linearLayout2, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, linearLayout3, findChildViewById);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeOneVerifyOtpBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeOneVerifyOtpBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_one_verify_otp, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84391a;
    }
}