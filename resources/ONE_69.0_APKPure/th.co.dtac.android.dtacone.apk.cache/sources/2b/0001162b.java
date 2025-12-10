package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneButtonRed;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextLayoutView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneInputForgotPasswordBinding */
/* loaded from: classes7.dex */
public final class FragmentOneInputForgotPasswordBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84058a;
    @NonNull
    public final OneButtonRed btnConfirmPassword;
    @NonNull
    public final OneTextInputLayoutText edtConfirmNewPassword;
    @NonNull
    public final OneTextInputLayoutText edtNewPassword;
    @NonNull
    public final OneTextInputLayoutText edtVerifyOTP;
    @NonNull
    public final LinearLayoutCompat layoutInputForgotPassword;
    @NonNull
    public final OneFontTextView requestOTP;
    @NonNull
    public final RelativeLayout rootLayout;
    @NonNull
    public final OneTextLayoutView tvPhoneNumber;

    public FragmentOneInputForgotPasswordBinding(FrameLayout frameLayout, OneButtonRed oneButtonRed, OneTextInputLayoutText oneTextInputLayoutText, OneTextInputLayoutText oneTextInputLayoutText2, OneTextInputLayoutText oneTextInputLayoutText3, LinearLayoutCompat linearLayoutCompat, OneFontTextView oneFontTextView, RelativeLayout relativeLayout, OneTextLayoutView oneTextLayoutView) {
        this.f84058a = frameLayout;
        this.btnConfirmPassword = oneButtonRed;
        this.edtConfirmNewPassword = oneTextInputLayoutText;
        this.edtNewPassword = oneTextInputLayoutText2;
        this.edtVerifyOTP = oneTextInputLayoutText3;
        this.layoutInputForgotPassword = linearLayoutCompat;
        this.requestOTP = oneFontTextView;
        this.rootLayout = relativeLayout;
        this.tvPhoneNumber = oneTextLayoutView;
    }

    @NonNull
    public static FragmentOneInputForgotPasswordBinding bind(@NonNull View view) {
        int i = R.id.btnConfirmPassword;
        OneButtonRed oneButtonRed = (OneButtonRed) ViewBindings.findChildViewById(view, i);
        if (oneButtonRed != null) {
            i = R.id.edtConfirmNewPassword;
            OneTextInputLayoutText oneTextInputLayoutText = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
            if (oneTextInputLayoutText != null) {
                i = R.id.edtNewPassword;
                OneTextInputLayoutText oneTextInputLayoutText2 = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
                if (oneTextInputLayoutText2 != null) {
                    i = R.id.edtVerifyOTP;
                    OneTextInputLayoutText oneTextInputLayoutText3 = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
                    if (oneTextInputLayoutText3 != null) {
                        i = R.id.layoutInputForgotPassword;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat != null) {
                            i = R.id.requestOTP;
                            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView != null) {
                                i = R.id.rootLayout;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                if (relativeLayout != null) {
                                    i = R.id.tvPhoneNumber;
                                    OneTextLayoutView oneTextLayoutView = (OneTextLayoutView) ViewBindings.findChildViewById(view, i);
                                    if (oneTextLayoutView != null) {
                                        return new FragmentOneInputForgotPasswordBinding((FrameLayout) view, oneButtonRed, oneTextInputLayoutText, oneTextInputLayoutText2, oneTextInputLayoutText3, linearLayoutCompat, oneFontTextView, relativeLayout, oneTextLayoutView);
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
    public static FragmentOneInputForgotPasswordBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneInputForgotPasswordBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_input_forgot_password, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84058a;
    }
}