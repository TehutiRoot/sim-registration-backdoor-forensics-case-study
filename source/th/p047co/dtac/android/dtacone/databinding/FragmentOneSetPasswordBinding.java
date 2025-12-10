package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneSetPasswordBinding */
/* loaded from: classes7.dex */
public final class FragmentOneSetPasswordBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84119a;
    @NonNull
    public final OneButtonRed btnRegister;
    @NonNull
    public final OneTextInputLayoutText edtConfirmPassword;
    @NonNull
    public final OneTextInputLayoutText edtPassword;
    @NonNull
    public final OneTextInputLayoutText edtVerifyID;
    @NonNull
    public final OneTextInputLayoutText edtVerifyOTP;
    @NonNull
    public final LinearLayoutCompat layoutInputInfo;
    @NonNull
    public final LinearLayoutCompat layoutPhoneNumberOnline;
    @NonNull
    public final LinearLayoutCompat layoutRtrCodeVerify;
    @NonNull
    public final OneFontTextView requestOTP;
    @NonNull
    public final OneTextLayoutView tvPhoneNumber;
    @NonNull
    public final OneTextLayoutView tvPhoneNumberOnline;
    @NonNull
    public final OneTextLayoutView tvRtrCode;
    @NonNull
    public final OneTextLayoutView tvRtrCodeVerify;

    public FragmentOneSetPasswordBinding(FrameLayout frameLayout, OneButtonRed oneButtonRed, OneTextInputLayoutText oneTextInputLayoutText, OneTextInputLayoutText oneTextInputLayoutText2, OneTextInputLayoutText oneTextInputLayoutText3, OneTextInputLayoutText oneTextInputLayoutText4, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, OneFontTextView oneFontTextView, OneTextLayoutView oneTextLayoutView, OneTextLayoutView oneTextLayoutView2, OneTextLayoutView oneTextLayoutView3, OneTextLayoutView oneTextLayoutView4) {
        this.f84119a = frameLayout;
        this.btnRegister = oneButtonRed;
        this.edtConfirmPassword = oneTextInputLayoutText;
        this.edtPassword = oneTextInputLayoutText2;
        this.edtVerifyID = oneTextInputLayoutText3;
        this.edtVerifyOTP = oneTextInputLayoutText4;
        this.layoutInputInfo = linearLayoutCompat;
        this.layoutPhoneNumberOnline = linearLayoutCompat2;
        this.layoutRtrCodeVerify = linearLayoutCompat3;
        this.requestOTP = oneFontTextView;
        this.tvPhoneNumber = oneTextLayoutView;
        this.tvPhoneNumberOnline = oneTextLayoutView2;
        this.tvRtrCode = oneTextLayoutView3;
        this.tvRtrCodeVerify = oneTextLayoutView4;
    }

    @NonNull
    public static FragmentOneSetPasswordBinding bind(@NonNull View view) {
        int i = R.id.btnRegister;
        OneButtonRed oneButtonRed = (OneButtonRed) ViewBindings.findChildViewById(view, i);
        if (oneButtonRed != null) {
            i = R.id.edtConfirmPassword;
            OneTextInputLayoutText oneTextInputLayoutText = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
            if (oneTextInputLayoutText != null) {
                i = R.id.edtPassword;
                OneTextInputLayoutText oneTextInputLayoutText2 = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
                if (oneTextInputLayoutText2 != null) {
                    i = R.id.edtVerifyID;
                    OneTextInputLayoutText oneTextInputLayoutText3 = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
                    if (oneTextInputLayoutText3 != null) {
                        i = R.id.edtVerifyOTP;
                        OneTextInputLayoutText oneTextInputLayoutText4 = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
                        if (oneTextInputLayoutText4 != null) {
                            i = R.id.layoutInputInfo;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat != null) {
                                i = R.id.layoutPhoneNumberOnline;
                                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat2 != null) {
                                    i = R.id.layoutRtrCodeVerify;
                                    LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                    if (linearLayoutCompat3 != null) {
                                        i = R.id.requestOTP;
                                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView != null) {
                                            i = R.id.tvPhoneNumber;
                                            OneTextLayoutView oneTextLayoutView = (OneTextLayoutView) ViewBindings.findChildViewById(view, i);
                                            if (oneTextLayoutView != null) {
                                                i = R.id.tvPhoneNumberOnline;
                                                OneTextLayoutView oneTextLayoutView2 = (OneTextLayoutView) ViewBindings.findChildViewById(view, i);
                                                if (oneTextLayoutView2 != null) {
                                                    i = R.id.tvRtrCode;
                                                    OneTextLayoutView oneTextLayoutView3 = (OneTextLayoutView) ViewBindings.findChildViewById(view, i);
                                                    if (oneTextLayoutView3 != null) {
                                                        i = R.id.tvRtrCodeVerify;
                                                        OneTextLayoutView oneTextLayoutView4 = (OneTextLayoutView) ViewBindings.findChildViewById(view, i);
                                                        if (oneTextLayoutView4 != null) {
                                                            return new FragmentOneSetPasswordBinding((FrameLayout) view, oneButtonRed, oneTextInputLayoutText, oneTextInputLayoutText2, oneTextInputLayoutText3, oneTextInputLayoutText4, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, oneFontTextView, oneTextLayoutView, oneTextLayoutView2, oneTextLayoutView3, oneTextLayoutView4);
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
    public static FragmentOneSetPasswordBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneSetPasswordBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_set_password, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84119a;
    }
}
