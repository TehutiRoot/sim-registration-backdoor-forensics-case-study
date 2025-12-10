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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OnePinEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneBuyDolVerifyOtpBinding */
/* loaded from: classes7.dex */
public final class FragmentOneBuyDolVerifyOtpBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83996a;
    @NonNull
    public final OneFontTextView requestOTPAgainTextView;
    @NonNull
    public final OneFontTextView sendOTPRemainingTextView;
    @NonNull
    public final OnePinEditText verifyOTPEditText;
    @NonNull
    public final OneFontTextView verifyPhoneNumberTextView;

    public FragmentOneBuyDolVerifyOtpBinding(ConstraintLayout constraintLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OnePinEditText onePinEditText, OneFontTextView oneFontTextView3) {
        this.f83996a = constraintLayout;
        this.requestOTPAgainTextView = oneFontTextView;
        this.sendOTPRemainingTextView = oneFontTextView2;
        this.verifyOTPEditText = onePinEditText;
        this.verifyPhoneNumberTextView = oneFontTextView3;
    }

    @NonNull
    public static FragmentOneBuyDolVerifyOtpBinding bind(@NonNull View view) {
        int i = R.id.requestOTPAgainTextView;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.sendOTPRemainingTextView;
            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView2 != null) {
                i = R.id.verifyOTPEditText;
                OnePinEditText onePinEditText = (OnePinEditText) ViewBindings.findChildViewById(view, i);
                if (onePinEditText != null) {
                    i = R.id.verifyPhoneNumberTextView;
                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView3 != null) {
                        return new FragmentOneBuyDolVerifyOtpBinding((ConstraintLayout) view, oneFontTextView, oneFontTextView2, onePinEditText, oneFontTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneBuyDolVerifyOtpBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneBuyDolVerifyOtpBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_buy_dol_verify_otp, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83996a;
    }
}